package med.voll.api.domain.consulta.validaciones.reserva;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import med.voll.api.domain.ValidacionException;
import med.voll.api.domain.consulta.DatosReservaConsulta;
import med.voll.api.domain.medico.MedicoRepository;

@Component
public class ValidadorMedicoActivo implements ValidadorDeConsultas{

    @Autowired
    private MedicoRepository repository;

    public void validar(DatosReservaConsulta datos){
        // Eleccion de medico opcional
        if(datos.idMedico() == null){
            return;
        }
        var medicoEstaActivo  = repository.findActivoById(datos.idMedico());
        if(!medicoEstaActivo){
            throw new ValidacionException("Consulta no puede ser reservada con medico excluido");
        }
    }
}
