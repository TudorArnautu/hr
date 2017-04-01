package ro.ase.licenta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ase.licenta.domain.Educatie;
import ro.ase.licenta.repository.EducatieRepository;

import java.util.List;

/**
 * Created by arnau on 28.03.2017.
 */
@Service
public class EducatieServiceImpl implements EducatieService{
    @Autowired
    EducatieRepository educatieRepository;
    @Override
    public List<Educatie> findAll() {
        return educatieRepository.findAll();
    }
}
