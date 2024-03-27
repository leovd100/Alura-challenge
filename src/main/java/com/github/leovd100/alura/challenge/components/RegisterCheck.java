package com.github.leovd100.alura.challenge.components;

import com.github.leovd100.alura.challenge.Exception.DatabaseException;
import com.github.leovd100.alura.challenge.dto.UserDTO;
import com.github.leovd100.alura.challenge.entities.User;
import com.github.leovd100.alura.challenge.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class RegisterCheck {

    private final UserRepository repository;

    @Autowired
    public RegisterCheck(UserRepository repository) {
        this.repository = repository;
    }

    public void check(UserDTO dto){
        User referenceUserName = repository.getReferenceByUserName(dto.getUserName());
        User referenceEmail = repository.getReferenceByEmail(dto.getEmail());
        if(!Objects.isNull(referenceUserName)){
            throw new DatabaseException("Username register in database");
        }else if(!Objects.isNull(referenceEmail)){
            throw new DatabaseException("Email register in database");
        }
    }
}
