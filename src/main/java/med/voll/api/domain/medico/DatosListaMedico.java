package med.voll.api.medico;

public record DatosListaMedico(
    Long Id,
    String nombre,
    String email,
    String telefono,
    String documento,
    Especialidad especialidad
) {
    public DatosListaMedico(Medico medico) {
        this(
            medico.getId(),
            medico.getNombre(), 
            medico.getEmail(), 
            medico.getTelefono(), 
            medico.getDocumento(), 
            medico.getEspecialidad()
            );
    }
}
