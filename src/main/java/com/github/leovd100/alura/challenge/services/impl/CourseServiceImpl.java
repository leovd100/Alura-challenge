package com.github.leovd100.alura.challenge.services.impl;

import com.github.leovd100.alura.challenge.Exception.CourseException;
import com.github.leovd100.alura.challenge.components.MapperComponent;
import com.github.leovd100.alura.challenge.dto.CourseDTO;
import com.github.leovd100.alura.challenge.dto.response.CourseRegisterDTO;
import com.github.leovd100.alura.challenge.entities.Course;
import com.github.leovd100.alura.challenge.repository.CourseRepository;
import com.github.leovd100.alura.challenge.services.CourseService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepository repository;

    public CourseServiceImpl(CourseRepository repository) {
        this.repository = repository;
    }

    public CourseRegisterDTO registerUser(CourseDTO dto) {
        if(!dto.check("^[a-zA-Z]+(?:-[a-zA-Z]+)*$")){
            throw new RuntimeException("Invalid Code for " + dto.getCode());
        }
        Course course = repository.save(new Course(dto));
        return MapperComponent.mapperCoursetoCourseDTO(course);
    }

    public Course findCourseById(UUID id) {
        return repository.findById(id)
                .orElseThrow(() -> new CourseException("Course not found"));
    }

}
