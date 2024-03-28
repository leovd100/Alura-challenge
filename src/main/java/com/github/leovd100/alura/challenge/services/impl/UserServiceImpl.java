package com.github.leovd100.alura.challenge.services.impl;

import com.github.leovd100.alura.challenge.components.MapperComponent;
import com.github.leovd100.alura.challenge.components.RegisterCheck;
import com.github.leovd100.alura.challenge.dto.UserDTO;
import com.github.leovd100.alura.challenge.dto.UserRegiterDTO;
import com.github.leovd100.alura.challenge.entities.User;
import com.github.leovd100.alura.challenge.repository.UserRepository;
import com.github.leovd100.alura.challenge.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final RegisterCheck registerCheck;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, RegisterCheck registerCheck) {
        this.userRepository = userRepository;
        this.registerCheck = registerCheck;
    }

    public UserRegiterDTO registerUser(UserDTO dto){
            registerCheck.check(dto);
            User user = MapperComponent.mapperUserDTOtoUser(dto);
            user.setRegisterDate(LocalDate.now());
            user.setPassword(encoder().encode(user.getPassword()));


            user = userRepository.save(user);
            return userToRecord(user);

    }

    private UserRegiterDTO userToRecord(User user){
        return new UserRegiterDTO(user.getName(), user.getUserName(), user.getEmail(), "User registered successfully!");
    }

    private PasswordEncoder encoder(){
        return new BCryptPasswordEncoder();
    }
}
