package med.voll.api.medico;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.direccion.Direccion;

@Getter // Generar de forma automatica en tiempo de compilacion todos los getters 
@NoArgsConstructor // Crear un constructor que no tiene ningun argumento
@AllArgsConstructor // Gera un constructor que tiene todos los argumentos
@EqualsAndHashCode(of = "id") // El sistema identifica si dos objetos son iguales si el ID es igual
@Table(name = "medicos")
@Entity(name = "Medico")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String email;
    private String documento;
    @Enumerated(EnumType.STRING)
    private Especialidad especialidad;
    @Embedded // La tabla medicos tendra los atrubutos de la Direccion
    private Direccion direccion;
}
