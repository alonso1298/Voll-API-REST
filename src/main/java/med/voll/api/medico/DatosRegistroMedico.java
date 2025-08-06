package med.voll.api.medico;

import med.voll.api.direccion.Direccion;

public record DatosRegistroMedico(
    String nombre,
    String email, 
    Especialidad especialidad,
    Direccion direccion
) {}
