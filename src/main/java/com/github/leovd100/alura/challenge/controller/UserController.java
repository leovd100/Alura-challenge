package com.github.leovd100.alura.challenge.controller;

import com.github.leovd100.alura.challenge.components.MapperComponent;
import com.github.leovd100.alura.challenge.dto.UserDTO;
import com.github.leovd100.alura.challenge.dto.UserRegiterDTO;
import com.github.leovd100.alura.challenge.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserRegiterDTO> registerUser(@RequestBody @Valid UserDTO dto){
        return ResponseEntity.ok(userService.registerUser(dto));
    }
}
