package med.voll.api.domain.consulta.validaciones;

import java.time.DayOfWeek;

import med.voll.api.domain.ValidacionException;
import med.voll.api.domain.consulta.DatosReservaConsulta;

public class ValidacionFueraDelHorarioConsultas {

    public void validar(DatosReservaConsulta datos) {
        var fechaConsulta = datos.fecha();
        var domingo = fechaConsulta.getDayOfWeek().equals(DayOfWeek.SUNDAY);
        var horarioAntesDeAperturaClinica = fechaConsulta.getHour() < 7;
        var horarioDespuesDelCierreClinica = fechaConsulta.getHour() > 18;

        if(domingo || horarioAntesDeAperturaClinica || horarioDespuesDelCierreClinica){
            throw new ValidacionException("Horario seleccionado fuera del horario de atendimiento de la clinica");
        }
    }
}
