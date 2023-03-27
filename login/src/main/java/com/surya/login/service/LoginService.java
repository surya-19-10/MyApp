package com.surya.login.service;

import com.surya.login.core.Login;
import com.surya.login.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private LoginRepository repository;

    public Login saveDetails(Login login) {
        return repository.save(login);
    }

    public Login getDetails(int id) {
        return repository.findById(id).orElse(null);
    }

    public Login updateDetails(int id, Login login) {
        Login oldDetails = repository.findById(id).orElse(null);
        oldDetails.setOldPassword(oldDetails.getCurrentPassword());
        oldDetails.setCurrentPassword(login.getCurrentPassword());
        return repository.save(oldDetails);
    }

    public void deleteDetails(int id) {
        repository.deleteById(id);
    }
}
