package com.github.leovd100.alura.challenge.components;

import com.github.leovd100.alura.challenge.dto.RegistrationDTO;
import com.github.leovd100.alura.challenge.dto.response.CourseRegisterDTO;
import com.github.leovd100.alura.challenge.dto.UserDTO;
import com.github.leovd100.alura.challenge.dto.response.RegisterResponseDTO;
import com.github.leovd100.alura.challenge.entities.Course;
import com.github.leovd100.alura.challenge.entities.Registration;
import com.github.leovd100.alura.challenge.entities.User;
import org.modelmapper.ModelMapper;

public class MapperComponent {

    public static User mapperUserDTOtoUser(UserDTO dto){
        User user = new User();
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.map(dto, user);
        dto.getRoles().forEach(user::addRole);
        return user;
    }

    public static CourseRegisterDTO mapperCoursetoCourseDTO(Course course){
       return  new CourseRegisterDTO(course.getId().toString(),course.getName(), course.getCode(), course.getCode(), course.getStatus(), "Curso cadastrado com sucesso!");
    }

    public static Registration registrationMapper(RegistrationDTO dto){
        Registration mapper = new Registration();
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.map(dto, mapper);
        return  mapper;
    }

    public static RegisterResponseDTO registerToResponse(Registration registration, String message, String courseName){
        return new RegisterResponseDTO(registration.getUserId().toString(), message, courseName);

    }
}
