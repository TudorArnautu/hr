package ro.ase.licenta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ase.licenta.domain.Cv;
import ro.ase.licenta.repository.CvRepository;

import java.util.List;

/**
 * Created by arnau on 27.03.2017.
 */
@Service
public class CvServiceImpl implements CvService {

    @Autowired
    CvRepository cvRepository;

    @Override
    public List<Cv> findAll() {
        return cvRepository.findAll();
    }
}
