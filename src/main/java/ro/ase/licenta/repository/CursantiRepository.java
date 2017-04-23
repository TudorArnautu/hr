package ro.ase.licenta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.ase.licenta.domain.Cursanti;

import java.util.List;

/**
 * Created by arnau on 27.03.2017.
 */
@Repository
public interface CursantiRepository extends JpaRepository<Cursanti, Integer> {
   Cursanti findById(int id);
}
