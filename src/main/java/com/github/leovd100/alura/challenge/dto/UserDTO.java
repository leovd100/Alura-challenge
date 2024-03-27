package com.github.leovd100.alura.challenge.dto;

import com.github.leovd100.alura.challenge.Exception.DatabaseException;
import com.github.leovd100.alura.challenge.entities.Role;
import com.github.leovd100.alura.challenge.enums.Roles;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;

public class UserDTO {
    private String name;
    @Size(max = 20)
    private String userName;
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", message = "Email inválido")
    private String email;

    private Roles roles;
    private LocalDate registerDate;

    public UserDTO(){
    }

    public UserDTO(String name, String userName, String email, Roles roles, LocalDate registerDate) {
        this.name = name;
        this.userName = userName;
        this.email = email;
        this.roles = roles;
        this.registerDate = registerDate;

    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
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
