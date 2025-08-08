package med.voll.api.medico;

public record DatosListaMedico(
    String nombre,
    String email,
    String telefono,
    String documento,
    Especialidad especialidad
) {
    public DatosListaMedico(Medico medico) {
        this(
            medico.getNombre(), 
            medico.getEmail(), 
            medico.getTelefono(), 
            medico.getDocumento(), 
            medico.getEspecialidad()
            );
    }
}
