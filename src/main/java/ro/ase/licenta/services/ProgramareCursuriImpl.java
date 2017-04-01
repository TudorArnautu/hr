package ro.ase.licenta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ase.licenta.domain.ProgramareCursuri;
import ro.ase.licenta.repository.ProgramareCursuriRepository;

import java.util.List;

/**
 * Created by arnau on 28.03.2017.
 */
@Service
public class ProgramareCursuriImpl implements ProgramareCursuriService{
    @Autowired
    ProgramareCursuriRepository programareCursuriRepository;
    @Override
    public List<ProgramareCursuri> findAll() {
        return programareCursuriRepository.findAll();
    }
}
