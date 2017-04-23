package ro.ase.licenta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ase.licenta.domain.Cursanti;
import ro.ase.licenta.repository.CursantiRepository;

import java.util.List;

/**
 * Created by arnau on 27.03.2017.
 */
@Service
public class CursantiServiceImpl implements CursantiService{
    @Autowired
    CursantiRepository cursantiRepository;

    @Override
    public Cursanti getCursanti(int id) {
        return cursantiRepository.findById(id);
    }
}
