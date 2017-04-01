package ro.ase.licenta.services;

import ro.ase.licenta.domain.Departamente;

import java.util.List;

/**
 * Created by arnau on 27.03.2017.
 */
public interface DepartamenteService {
    List<Departamente> findAll();
}
