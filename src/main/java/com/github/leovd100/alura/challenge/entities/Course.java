package com.github.leovd100.alura.challenge.entities;

import com.github.leovd100.alura.challenge.dto.CourseDTO;
import com.github.leovd100.alura.challenge.enums.StatusCourse;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "tb_course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;

    @Column(unique = true)
    private String code;
    private String instructor;
    private String desciption;
    private StatusCourse status;
    private LocalDate initialDate = LocalDate.now();
    private LocalDate desabilityDate;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "tb_user_role", joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<Role>();

    public Course(){}

    public Course(UUID id, String name, String code, String instructor, String desciption, StatusCourse status, LocalDate initialDate, LocalDate desabilityDate) {
        this.name = name;
        this.id = id;
        this.code = code;
        this.instructor = instructor;
        this.desciption = desciption;
        this.status = status;
        this.initialDate = initialDate;
        this.desabilityDate = desabilityDate;

    }

    public Course(UUID id, String name, String code, String instructor, String desciption, StatusCourse status, LocalDate initialDate) {
        this.name = name;
        this.id = id;
        this.code = code;
        this.instructor = instructor;
        this.desciption = desciption;
        this.status = status;
        this.initialDate = initialDate;
    }

    public Course(CourseDTO dto){
        this(null, dto.getName(), dto.getCode(), dto.getInstructor(), dto.getDesciption(), dto.getStatus(), dto.getInitialDate());
    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public StatusCourse getStatus() {
        return status;
    }

    public void setStatus(StatusCourse status) {
        this.status = status;
    }

    public LocalDate getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(LocalDate initialDate) {
        this.initialDate = initialDate;
    }

    public LocalDate getDesabilityDate() {
        return desabilityDate;
    }

    public void setDesabilityDate(LocalDate desabilityDate) {
        this.desabilityDate = desabilityDate;
    }
}
