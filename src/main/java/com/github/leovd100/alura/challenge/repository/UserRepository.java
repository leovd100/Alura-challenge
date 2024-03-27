package com.github.leovd100.alura.challenge.repository;

import com.github.leovd100.alura.challenge.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User getReferenceByUserName(String name);
    User getReferenceByEmail(String name);

}
