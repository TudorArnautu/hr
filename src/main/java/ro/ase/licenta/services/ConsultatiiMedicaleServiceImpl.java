package ro.ase.licenta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ase.licenta.domain.ConsultatiiMedicale;
import ro.ase.licenta.repository.ConsulatiiMedicaleRepository;

import java.util.List;

/**
 * Created by arnau on 27.03.2017.
 */
@Service
public class ConsultatiiMedicaleServiceImpl implements ConsultatiiMedicaleService {
    @Autowired
    ConsulatiiMedicaleRepository consulatiiMedicaleRepository;

    @Override
    public ConsultatiiMedicale getConsultatiiMedicale(int id) {
        return consulatiiMedicaleRepository.findById(id);
    }
}
