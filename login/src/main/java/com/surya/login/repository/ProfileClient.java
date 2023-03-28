package com.surya.login.repository;

import com.surya.login.core.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class ProfileClient {

    @Autowired
    private WebClient webClient;

    public Profile getProfile() {
        return webClient.get()
                .uri("http://localhost:8080/1")
                .retrieve()
                .bodyToMono(Profile.class)
                .block();
    }
}
