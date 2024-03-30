package com.github.leovd100.alura.challenge.services;

import com.github.leovd100.alura.challenge.dto.CourseDTO;
import com.github.leovd100.alura.challenge.dto.response.CourseRegisterDTO;
import com.github.leovd100.alura.challenge.entities.Course;

import java.util.UUID;

public interface CourseService {
    CourseRegisterDTO registerUser(CourseDTO dto);
    Course findCourseById(UUID id);
}
