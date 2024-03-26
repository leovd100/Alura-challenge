package com.github.leovd100.alura.challenge.dto;

import com.github.leovd100.alura.challenge.entities.Role;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class UserDTO {
    private String name;
    private String userName;
    private String email;
    private LocalDate registerDate;

    public UserDTO(){}

    public UserDTO(String name, String userName, String email, LocalDate registerDate) {

        this.name = name;
        this.userName = userName;
        this.email = email;
        this.registerDate = registerDate;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDate registerDate) {
        this.registerDate = registerDate;
    }


}
