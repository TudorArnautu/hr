package ro.ase.licenta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ase.licenta.domain.Experienta;
import ro.ase.licenta.repository.ExperientaRepository;

import java.util.List;

/**
 * Created by arnau on 28.03.2017.
 */
@Service
public class ExperientaServiceImpl implements ExperientaService{
    @Autowired
    ExperientaRepository experientaRepository;
    @Override
    public List<Experienta> findALl() {
        return experientaRepository.findAll();
    }
}
