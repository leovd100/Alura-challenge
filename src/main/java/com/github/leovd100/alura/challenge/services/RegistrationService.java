package com.github.leovd100.alura.challenge.services;

import com.github.leovd100.alura.challenge.dto.RegistrationDTO;
import com.github.leovd100.alura.challenge.dto.response.RegisterResponseDTO;

public interface RegistrationService {

    RegisterResponseDTO register(RegistrationDTO dto);
}
