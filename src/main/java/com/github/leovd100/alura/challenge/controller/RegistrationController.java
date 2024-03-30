package com.github.leovd100.alura.challenge.controller;

import com.github.leovd100.alura.challenge.dto.RegistrationDTO;
import com.github.leovd100.alura.challenge.dto.response.RegisterResponseDTO;
import com.github.leovd100.alura.challenge.services.RegistrationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registration")
public class RegistrationController {

    private final RegistrationService service;

    public RegistrationController(RegistrationService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<RegisterResponseDTO> register(@RequestBody RegistrationDTO registration){
        return ResponseEntity.ok(service.register(registration));
    }

}
