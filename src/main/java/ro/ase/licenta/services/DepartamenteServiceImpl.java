package ro.ase.licenta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ase.licenta.domain.Departamente;
import ro.ase.licenta.repository.DepartamenteRepository;

import java.util.List;

/**
 * Created by arnau on 28.03.2017.
 */
@Service
public class DepartamenteServiceImpl implements DepartamenteService{
    @Autowired
    DepartamenteRepository departamenteRepository;
    @Override
    public List<Departamente> findAll() {
        return departamenteRepository.findAll();
    }
}
