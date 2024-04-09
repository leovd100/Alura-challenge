package com.github.leovd100.alura.challenge.dto;

import com.github.leovd100.alura.challenge.entities.Course;
import com.github.leovd100.alura.challenge.enums.StatusCourse;
import jakarta.validation.constraints.Max;
import java.util.regex.Pattern;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class CourseDTO {

    private String name;
    @Size(max = 10)
    private String code;
    private String instructor;
    private String desciption;
    private StatusCourse status;
    private LocalDate initialDate;

    public CourseDTO(){}

    public CourseDTO(String name, String code, String instructor, String desciption, StatusCourse status, LocalDate initialDate) {
        this.name = name;
        this.code = code;
        this.instructor = instructor;
        this.desciption = desciption;
        this.status = status;
        this.initialDate = initialDate;

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

    public boolean check(String regex){
        return Pattern.matches(regex, this.code);
    }

}
