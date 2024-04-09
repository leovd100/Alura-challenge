package com.github.leovd100.alura.challenge.repository;

import com.github.leovd100.alura.challenge.entities.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface RegistrationRepository extends JpaRepository<Registration, UUID> {

}
