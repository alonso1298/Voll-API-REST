package med.voll.api.medico;

import med.voll.api.direccion.DatosDireccion;

public record DatosActualizacionMedico(
    Long Id,
    String nombre,
    String telefono,
    DatosDireccion direccion
) {}
