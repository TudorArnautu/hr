package ro.ase.licenta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.ase.licenta.domain.Login;

import java.util.List;

/**
 * Created by arnau on 27.03.2017.
 */
@Repository
public interface LoginRepository extends JpaRepository<Login, Integer> {
    List<Login> findAll();
}
