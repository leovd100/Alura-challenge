package com.github.leovd100.alura.challenge.controller;

import com.github.leovd100.alura.challenge.entities.Registration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registration")
public class RegistrationController {

    @PostMapping
    public ResponseEntity<Void> register(@RequestBody Registration registration){
        return (ResponseEntity<Void>) ResponseEntity.ok();
    }

}
