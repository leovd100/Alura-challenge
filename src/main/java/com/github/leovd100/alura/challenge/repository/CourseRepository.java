package com.github.leovd100.alura.challenge.repository;

import com.github.leovd100.alura.challenge.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface CourseRepository extends JpaRepository<Course, UUID> {
}
