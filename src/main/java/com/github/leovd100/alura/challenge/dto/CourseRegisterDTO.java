package com.github.leovd100.alura.challenge.dto;

import com.github.leovd100.alura.challenge.enums.StatusCourse;

public record CourseRegisterDTO(String name, String code, String Instructor, StatusCourse status, String message) {
}
