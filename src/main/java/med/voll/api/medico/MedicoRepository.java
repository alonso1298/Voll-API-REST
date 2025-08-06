package med.voll.api.medico;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long>{ 
    // Con esto tenemos un set de metodos automaticos que incluyen toda la parte de un CRUD
}
