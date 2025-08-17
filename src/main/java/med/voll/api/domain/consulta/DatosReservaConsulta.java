package med.voll.api.domain.consulta;

import java.time.LocalDateTime;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;

public record DatosReservaConsulta(
    Long idMedico,
    @NotNull
    Long idPaciente,
    @NotNull
    @Future // Future indica que no puede ser una fecha anterior a la actual
    LocalDateTime fecha
) {}
