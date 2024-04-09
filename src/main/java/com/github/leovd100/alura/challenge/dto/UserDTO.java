package com.github.leovd100.alura.challenge.dto;

import com.github.leovd100.alura.challenge.entities.Role;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.util.List;

public class UserDTO {
    @NotBlank(message = "Name cannot be empty")
    @Schema(example = "Name")
    private String name;
    @Size(max = 20)
    @NotBlank(message = "Username cannot be empty")
    @Schema(example = "User Name")
    private String userName;
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", message = "Email cannot valid format")
    @NotBlank(message = "Email cannot be empty")
    @Schema(example = "email@youremail.com")
    private String email;
    @NotBlank(message = "Password cannot be empty")
    @Schema(example = "password")
    private String password;
    @Valid
    @NotEmpty(message = "Roles list cannot be empty")
    private List<RoleDTO> roles;
    private LocalDate registerDate = LocalDate.now();

    public UserDTO() {
        this.registerDate = LocalDate.now();
    }

    public UserDTO(String name, String userName, String email, String password, List<RoleDTO> roles, LocalDate registerDate) {
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

    public List<RoleDTO> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleDTO> roles) {
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
