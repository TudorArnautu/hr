package ro.ase.licenta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ase.licenta.domain.PlanificareConcedii;
import ro.ase.licenta.repository.PlanificareConcediiRepository;

import java.util.List;

/**
 * Created by arnau on 28.03.2017.
 */
@Service
public class PlanificareConcediiImpl implements PlanificareConcediiService{
    @Autowired
    PlanificareConcediiRepository planificareConcediiRepository;

    @Override
    public PlanificareConcedii getPlanificareConcedii(int id) {
        return planificareConcediiRepository.findById(id);
    }
}
