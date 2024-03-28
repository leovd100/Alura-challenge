package com.github.leovd100.alura.challenge.services;

import com.github.leovd100.alura.challenge.components.MapperComponent;
import com.github.leovd100.alura.challenge.dto.CourseDTO;
import com.github.leovd100.alura.challenge.dto.CourseRegisterDTO;
import com.github.leovd100.alura.challenge.entities.Course;
import com.github.leovd100.alura.challenge.repository.CourseRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.MethodArgumentNotValidException;

@Service
public class CourseService {

    private final CourseRepository repository;

    public CourseService(CourseRepository repository) {
        this.repository = repository;
    }

    public CourseRegisterDTO registerUser(CourseDTO dto) {
        if(!dto.check("^[a-zA-Z]+(?:-[a-zA-Z]+)*$")){
            throw new RuntimeException("Invalid Code");
        }
        Course course = repository.save(new Course(dto));
        return MapperComponent.mapperCoursetoCourseDTO(course);
    }



}
