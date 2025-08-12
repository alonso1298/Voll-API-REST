package med.voll.api.direccion;

import jakarta.persistence.Embeddable;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.medico.DatosActualizacionMedico;

@Getter // Generar de forma automatica en tiempo de compilacion todos los getters 
@NoArgsConstructor // Crear un constructor que no tiene ningun argumento
@AllArgsConstructor // Gera un constructor que tiene todos los argumentos
@Embeddable
public class Direccion {
    private String calle;
    private String numero;
    private String complemento; 
    private String barrio;
    private String ciudad; 
    private String codigo_postal;
    private String estado;

    public Direccion(DatosDireccion datosDireccion){
        this.calle = datosDireccion.calle();
        this.numero = datosDireccion.numero();
        this.complemento = datosDireccion.complemento();
        this.barrio = datosDireccion.barrio();
        this.ciudad = datosDireccion.ciudad();
        this.codigo_postal = datosDireccion.codigo_postal();
        this.estado = datosDireccion.estado();
    }

    public void actualizarDireccion(DatosActualizacionMedico datos) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizarDireccion'");
    }
}
