package med.voll.api.paciente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PaacienteRepository extends JpaRepository<Paciente, Long>{
    // Con esto tenemos un set de metodos automaticos que incluyen toda la parte de un CRUD
}
