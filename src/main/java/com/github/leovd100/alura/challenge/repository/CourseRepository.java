package com.github.leovd100.alura.challenge.repository;

import com.github.leovd100.alura.challenge.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CourseRepository extends JpaRepository<Course, UUID> {
}
