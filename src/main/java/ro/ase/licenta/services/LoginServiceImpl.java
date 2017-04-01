package ro.ase.licenta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ase.licenta.domain.Login;
import ro.ase.licenta.repository.LoginRepository;

import java.util.List;

/**
 * Created by arnau on 28.03.2017.
 */
@Service
public class LoginServiceImpl implements LoginService{
    @Autowired
    LoginRepository loginRepository;
    @Override
    public List<Login> findAll() {
        return loginRepository.findAll();
    }
}
