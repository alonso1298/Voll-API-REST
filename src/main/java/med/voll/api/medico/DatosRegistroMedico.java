package med.voll.api.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.direccion.DatosDireccion;

public record DatosRegistroMedico(
    @NotBlank String nombre, // @NotBlank controla que el campo no venga vacio ni en null
    @NotBlank @Email String email, // @Email Ya tiene todo el contexto de que es lo que tiene que tener un email
    // String telefono,
    @NotBlank @Pattern(regexp = "\\d{7,9}") String documento,
    @NotNull Especialidad especialidad,
    @NotNull @Valid DatosDireccion direccion // Colocamos @Valid porque es otro record
) {}
