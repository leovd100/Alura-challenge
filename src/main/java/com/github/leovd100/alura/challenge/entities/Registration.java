package com.github.leovd100.alura.challenge.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name ="tb_registration" ,uniqueConstraints = @UniqueConstraint(columnNames = {"user_id", "course_id"}))
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private User user;
    @OneToOne
    private Course course;
    private LocalDate initialDate = LocalDate.now();

    public Registration(){}

    public Registration(User user, Course course, LocalDate initialDate) {
        this.user = user;
        this.course = course;
        this.initialDate = initialDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public LocalDate getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(LocalDate initialDate) {
        this.initialDate = initialDate;
    }
}
