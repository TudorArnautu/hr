package ro.ase.licenta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ase.licenta.domain.Cursuri;
import ro.ase.licenta.repository.CursuriRepository;

import java.util.List;

/**
 * Created by arnau on 27.03.2017.
 */
@Service
public class CursuriServiceImpl implements CursuriService {
    @Autowired
    CursuriRepository cursuriRepository;

    @Override
    public Cursuri getCursuri(int id) {
        return cursuriRepository.findById(id);
    }
}
