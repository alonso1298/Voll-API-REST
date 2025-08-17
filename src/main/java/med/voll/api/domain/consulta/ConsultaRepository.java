package med.voll.api.domain.consulta;

import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.validation.constraints.NotNull;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {

    boolean existsByPacienteeIdAndFechaBetween(Long idPaciente, LocalDateTime primerHorario,
            LocalDateTime ultimoHorario);

}
