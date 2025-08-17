package med.voll.api.domain.paciente;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PacienteRepository extends JpaRepository<Paciente, Long>{
    // Con esto tenemos un set de metodos automaticos que incluyen toda la parte de un CRUD
    
    Page<Paciente> findAllByActivoTrue(Pageable paginacion);

    boolean findActivoById(Long idPaciente);
}
