package med.voll.api.domain.consulta.validaciones;

import java.time.Duration;
import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import med.voll.api.domain.ValidacionException;
import med.voll.api.domain.consulta.DatosReservaConsulta;

@Component
public class ValidadorConsultaConAnticipacion implements ValidadorDeConsultas{

    public void validar(DatosReservaConsulta datos) {

        var fechaConsulta = datos.fecha();
        var ahora = LocalDateTime.now();
        var diferenciaEnMinutos = Duration.between(ahora, fechaConsulta).toMinutes();
        if(diferenciaEnMinutos < 30){
            throw new ValidacionException("Horario seleccionado con menos de 30 minutos de anticipacion");
        }
    }
}
