package com.github.leovd100.alura.challenge.repository;

import com.github.leovd100.alura.challenge.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolesRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByAuthority(String authority);
}
