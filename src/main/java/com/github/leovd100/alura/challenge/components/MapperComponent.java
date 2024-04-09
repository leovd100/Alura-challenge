package com.github.leovd100.alura.challenge.components;

import com.github.leovd100.alura.challenge.dto.RegistrationDTO;
import com.github.leovd100.alura.challenge.dto.response.CourseRegisterDTO;
import com.github.leovd100.alura.challenge.dto.UserDTO;
import com.github.leovd100.alura.challenge.dto.response.RegisterResponseDTO;
import com.github.leovd100.alura.challenge.entities.Course;
import com.github.leovd100.alura.challenge.entities.Registration;
import com.github.leovd100.alura.challenge.entities.Role;
import com.github.leovd100.alura.challenge.entities.User;
import org.modelmapper.ModelMapper;

import java.util.List;

public class MapperComponent {

    public static User mapperUserDTOtoUser(UserDTO dto, List<Role> listRoles){
        User user = new User();
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.map(dto, user);
        listRoles.forEach(user::addRole);
        return user;
    }

    public static CourseRegisterDTO mapperCoursetoCourseDTO(Course course){
       return  new CourseRegisterDTO(course.getId().toString(),course.getName(), course.getCode(), course.getCode(), course.getStatus(), "Curso cadastrado com sucesso!");
    }

    public static Registration mapperRegistrationDtotoRegistrionEntity(RegistrationDTO dto){
        Registration registration = new Registration();
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.map(dto, registration);
        return  registration;
    }

    public static RegisterResponseDTO mapperRegistrationToResponse(Registration registration, String message, String courseName){
        return new RegisterResponseDTO(registration.getUserId().toString(), message, courseName);

    }
}
