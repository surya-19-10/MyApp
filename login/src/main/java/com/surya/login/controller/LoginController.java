package com.surya.login.controller;

import com.surya.login.core.Login;
import com.surya.login.core.Profile;
import com.surya.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/")
public class LoginController {

    @Autowired
    private LoginService service;

    @PostMapping("/")
    public Login saveDetails(@RequestBody Login login) {
        return service.saveDetails(login);
    }

    @GetMapping("/{id}")
    public Login getDetails(@PathVariable int id) {
        return service.getDetails(id);
    }

    @PutMapping("/{id}")
    public Login updateDetails(@RequestBody Login login, @PathVariable int id) {
        return service.updateDetails(id, login);
    }

    @DeleteMapping("/{id}")
    public void deleteDetails(@PathVariable int id) {
        service.deleteDetails(id);
    }

    @GetMapping("/profile/{id}")
    public Profile getProfile(@PathVariable int id) {
        return service.getProfileDetails(id);
    }
}
