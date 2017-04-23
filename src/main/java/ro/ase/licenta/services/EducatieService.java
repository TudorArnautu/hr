package ro.ase.licenta.services;

import org.springframework.beans.factory.annotation.Autowired;
import ro.ase.licenta.domain.Educatie;
import ro.ase.licenta.repository.EducatieRepository;

import java.util.List;

/**
 * Created by arnau on 27.03.2017.
 */
public interface EducatieService {
    Educatie getEducatie(int id);
}
