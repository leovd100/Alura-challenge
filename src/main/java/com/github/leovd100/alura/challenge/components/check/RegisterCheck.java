package com.github.leovd100.alura.challenge.components.check;

import com.github.leovd100.alura.challenge.Exception.DatabaseException;
import com.github.leovd100.alura.challenge.dto.UserDTO;
import com.github.leovd100.alura.challenge.entities.User;
import com.github.leovd100.alura.challenge.repository.UserRepository;
import com.github.leovd100.alura.challenge.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Objects;

@Component
public class RegisterCheck {

    @Autowired
    private UserRepository userRepository;

    public RegisterCheck(){}

    public void check(UserDTO dto){
        checkIfUserNameExists(dto.getUserName());
        checkIfEmailExists(dto.getEmail());
    }

    private void checkIfUserNameExists(String userName) {
        User user = userRepository.getReferenceByUserName(userName);
        if (!Objects.isNull(user)) {
            throw new DatabaseException("Username already registered in the database");
        }
    }

    private void checkIfEmailExists(String email) {
        User user = userRepository.getReferenceByEmail(email);
        if (!Objects.isNull(user)) {
            throw new DatabaseException("Email already registered in the database");
        }
    }
}