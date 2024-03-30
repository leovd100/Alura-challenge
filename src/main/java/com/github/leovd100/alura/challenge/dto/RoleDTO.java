package com.github.leovd100.alura.challenge.dto;


import com.github.leovd100.alura.challenge.entities.Role;
import jakarta.validation.constraints.NotNull;

public class RoleDTO {
    @NotNull(message = "ID cannot be null")
    private Long id;

    public RoleDTO(){}

    public RoleDTO(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
