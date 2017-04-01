package ro.ase.licenta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.ase.licenta.domain.ConsultatiiMedicale;


import java.util.List;

/**
 * Created by arnau on 27.03.2017.
 */
@Repository
public interface ConsulatiiMedicaleRepository extends JpaRepository<ConsultatiiMedicale, Integer> {
 List<ConsultatiiMedicale> findAll();
}
