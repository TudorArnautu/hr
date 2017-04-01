package ro.ase.licenta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ase.licenta.domain.Functii;
import ro.ase.licenta.repository.FunctiiRepository;

import java.util.List;

/**
 * Created by arnau on 28.03.2017.
 */
@Service
public class FunctiiServiceImpl implements FunctiiService{
    @Autowired
    FunctiiRepository functiiRepository;

    @Override
    public List<Functii> findAll() {
        return functiiRepository.findAll();
    }
}
