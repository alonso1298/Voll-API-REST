package med.voll.api.domain.paciente;


public record DatosListaPaciente(
    Long Id,
    String nombre,
    String email,
    String telefono,
    String documentoIdentidad
) {
    public DatosListaPaciente(Paciente paciente){
        this(
            paciente.getId(),
            paciente.getNombre(), 
            paciente.getEmail(), 
            paciente.getTelefono(), 
            paciente.getDocumentoIdentidad());
    }
}
