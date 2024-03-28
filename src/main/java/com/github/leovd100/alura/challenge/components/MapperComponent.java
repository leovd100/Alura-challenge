package com.github.leovd100.alura.challenge.components;

import com.github.leovd100.alura.challenge.dto.CourseDTO;
import com.github.leovd100.alura.challenge.dto.CourseRegisterDTO;
import com.github.leovd100.alura.challenge.dto.UserDTO;
import com.github.leovd100.alura.challenge.entities.Course;
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
       return  new CourseRegisterDTO(course.getName(), course.getCode(), course.getCode(), course.getStatus(), "Curso cadastrado com sucesso!");
    }

}
