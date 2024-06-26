package com.github.leovd100.alura.challenge.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "tb_registration")
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "user_id", unique = true)
    private UUID userId;
    @Column(name = "course_id", unique = true)
    private UUID courseId;
    private LocalDate initialDate = LocalDate.now();

    public Registration(){}


    public Registration(UUID id, UUID userId, UUID courseId, LocalDate initialDate) {
        this.id = id;
        this.userId = userId;
        this.courseId = courseId;
        this.initialDate = initialDate;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public UUID getCourseId() {
        return courseId;
    }

    public void setCourseId(UUID courseId) {
        this.courseId = courseId;
    }

    public LocalDate getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(LocalDate initialDate) {
        this.initialDate = initialDate;
    }
}
