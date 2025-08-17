package med.voll.api.domain.medico;

import java.time.LocalDateTime;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MedicoRepository extends JpaRepository<Medico, Long>{
    // Con esto tenemos un set de metodos automaticos que incluyen toda la parte de un CRUD
    
    Page<Medico> findAllByActivoTrue(Pageable paginacion);

    @Query("""
            select m from Medico m 
            where
            m.activo = 1
            and 
            m.especialidad = :especialidad
            and m.id not in(
                select c.medico.id from Consulta c
                where
                c.fecha = :fecha
            )
            order by rand()
            limit 1
            """)
    Medico elegirMedicoAleatorioDisponibleEnLaFecha(Especialidad especialidad, LocalDateTime fecha); 
}
