package com.github.leovd100.alura.challenge.services.impl;

import com.github.leovd100.alura.challenge.Exception.RoleNotFOundException;
import com.github.leovd100.alura.challenge.dto.RoleDTO;
import com.github.leovd100.alura.challenge.entities.Role;
import com.github.leovd100.alura.challenge.repository.RolesRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RolesService  {

    private final RolesRepository repository;
    private static final String MESSAGE_ROLE_NOT_FOUND = "Role not found";

    public RolesService(RolesRepository repository) {
        this.repository = repository;
    }

    public Role findById(Long id){
        return repository.findById(id).orElseThrow(() -> new RoleNotFOundException(MESSAGE_ROLE_NOT_FOUND));
    }

    public Role findReferenceById(Long id){
        return repository.getReferenceById(id);
    }

    public Role findRoleByAuthority(String auth){
        return repository.findByAuthority(auth).orElseThrow(() -> new RoleNotFOundException(MESSAGE_ROLE_NOT_FOUND));
    }

    public List<Role> findRoles(List<RoleDTO> listDto){
        List <Role> list = new ArrayList<>();
        listDto.forEach(role -> {
            list.add(findReferenceById(role.getId()));
        });
        return list;
    }

    public List<Role> findRoles(Long... listRoleId){
        List <Role> list = new ArrayList<>();
        for(Long role: listRoleId){
            list.add(findById(role));
        }
        return list;
    }

}
