package ro.ase.licenta.services;

import ro.ase.licenta.domain.Login;

import java.util.List;

/**
 * Created by arnau on 27.03.2017.
 */
public interface LoginService {
    List<Login> findAll();
}
