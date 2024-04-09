package com.github.leovd100.alura.challenge.repository;

import com.github.leovd100.alura.challenge.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    User getReferenceByUserName(String name);
    User getReferenceByEmail(String name);

}
