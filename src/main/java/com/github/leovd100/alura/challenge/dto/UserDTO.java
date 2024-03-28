package com.github.leovd100.alura.challenge.dto;

import com.github.leovd100.alura.challenge.entities.Role;
import com.github.leovd100.alura.challenge.enums.Roles;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.util.List;

public class UserDTO {
    private String name;
    @Size(max = 20)
    private String userName;
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", message = "O email deve estar em um formato válido")
    private String email;

    private String password;
    private List<Role> roles;
    private LocalDate registerDate;

    public UserDTO() {
        this.registerDate = LocalDate.now(); // Inicializa a data de registro com a data atual
    }

    public UserDTO(String name, String userName, String email, String password, List<Role> roles, LocalDate registerDate) {
        this.name = name;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.roles = roles;
        this.registerDate = registerDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
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
