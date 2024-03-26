package com.github.leovd100.alura.challenge.services;

import com.github.leovd100.alura.challenge.components.MapperComponent;
import com.github.leovd100.alura.challenge.dto.UserDTO;
import com.github.leovd100.alura.challenge.dto.UserRegiterDTO;
import com.github.leovd100.alura.challenge.entities.User;
import com.github.leovd100.alura.challenge.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserRegiterDTO registerUser(UserDTO dto){
        User user = MapperComponent.mapperUserDTOtoUser(dto);
        user.setRegisterDate(LocalDate.now());
        user = userRepository.save(user);
        return userToRecord(user);
    }

    private UserRegiterDTO userToRecord(User user){
        return new UserRegiterDTO(user.getName(), user.getUserName(), user.getEmail(), "Usuário cadastrado com sucesso!");
    }
}
