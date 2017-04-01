package ro.ase.licenta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.ase.licenta.domain.Angajati;

import java.util.List;

/**
 * Created by arnau on 26.03.2017.
 */
@Repository
public interface AngajatiRepository extends JpaRepository<Angajati, Integer>{
    List<Angajati> findAll();
    //Angajati finfById(int id);
}
