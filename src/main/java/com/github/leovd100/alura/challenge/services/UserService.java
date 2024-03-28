package com.github.leovd100.alura.challenge.services;

import com.github.leovd100.alura.challenge.dto.UserDTO;
import com.github.leovd100.alura.challenge.dto.UserRegiterDTO;

public interface UserService {

    UserRegiterDTO registerUser(UserDTO dto);
}
