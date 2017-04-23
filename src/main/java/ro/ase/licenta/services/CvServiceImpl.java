package ro.ase.licenta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ro.ase.licenta.domain.Cv;
import ro.ase.licenta.domain.Educatie;
import ro.ase.licenta.repository.CvRepository;
import ro.ase.licenta.repository.EducatieRepository;
import ro.ase.licenta.repository.ExperientaRepository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by arnau on 27.03.2017.
 */
@Service
public class CvServiceImpl implements CvService {

    @Autowired
    CvRepository cvRepository;


    @Override
    public Cv getCv(int id) {
        return cvRepository.findById(id);
    }



}
