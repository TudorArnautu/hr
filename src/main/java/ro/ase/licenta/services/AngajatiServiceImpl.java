package ro.ase.licenta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ase.licenta.domain.Angajati;
import ro.ase.licenta.repository.AngajatiRepository;

import java.util.List;

/**
 * Created by arnau on 26.03.2017.
 */
@Service
public class AngajatiServiceImpl implements AngajatiService {

    @Autowired
    AngajatiRepository angajatiRepository;

    @Override
    public Angajati getAngajati(int id) {
        return angajatiRepository.findById(id);
    }
}
