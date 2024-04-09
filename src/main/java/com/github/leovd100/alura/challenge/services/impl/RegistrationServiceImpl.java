package com.github.leovd100.alura.challenge.services.impl;

import com.github.leovd100.alura.challenge.Exception.CourseException;
import com.github.leovd100.alura.challenge.components.MapperComponent;
import com.github.leovd100.alura.challenge.dto.RegistrationDTO;
import com.github.leovd100.alura.challenge.dto.response.RegisterResponseDTO;
import com.github.leovd100.alura.challenge.entities.Course;
import com.github.leovd100.alura.challenge.entities.Registration;
import com.github.leovd100.alura.challenge.enums.StatusCourse;
import com.github.leovd100.alura.challenge.repository.RegistrationRepository;
import com.github.leovd100.alura.challenge.services.CourseService;
import com.github.leovd100.alura.challenge.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    private final RegistrationRepository repository;
    private final CourseService courseService;

    @Autowired
    public RegistrationServiceImpl(RegistrationRepository repository, CourseService courseService) {
        this.repository = repository;
        this.courseService = courseService;
    }

    public RegisterResponseDTO register(RegistrationDTO dto){
        Registration registrationMapper  = MapperComponent.mapperRegistrationDtotoRegistrionEntity(dto);
        Course course =  courseService.findCourseById(dto.getCourseId());
        if(course.getStatus().equals(StatusCourse.ATIVO)) {
           return MapperComponent.mapperRegistrationToResponse(repository.save(registrationMapper), "Successfully registered", course.getName());
        }else {
            throw new CourseException("Error: Inative course ");
        }
    }


}
