package cesar.mendonca.guilherme.jornadamilhas.depoimento;

import io.micrometer.observation.ObservationFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepoimentoJpa extends JpaRepository<Depoimento, Long> {
    Page<Depoimento> findAllByAtivoTrue(Pageable page);
}
