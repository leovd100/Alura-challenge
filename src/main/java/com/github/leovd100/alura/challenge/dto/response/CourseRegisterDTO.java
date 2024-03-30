package com.github.leovd100.alura.challenge.dto.response;

import com.github.leovd100.alura.challenge.enums.StatusCourse;

public record CourseRegisterDTO(String id,String name, String code, String Instructor, StatusCourse status, String message) {
}
