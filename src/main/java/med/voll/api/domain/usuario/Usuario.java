package med.voll.api.domain.usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "usuarios")
@Entity(name = "Usuario")
@Getter // Generar de forma automatica en tiempo de compilacion todos los getters 
@NoArgsConstructor // Crear un constructor que no tiene ningun argumento
@AllArgsConstructor // Gera un constructor que tiene todos los argumentos
@EqualsAndHashCode(of = "id") // El sistema identifica si dos objetos son iguales si el ID es igual
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String contrasena;
}
