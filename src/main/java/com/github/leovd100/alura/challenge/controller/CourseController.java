package com.github.leovd100.alura.challenge.controller;

import com.github.leovd100.alura.challenge.dto.CourseDTO;
import com.github.leovd100.alura.challenge.dto.CourseRegisterDTO;
import com.github.leovd100.alura.challenge.dto.UserRegiterDTO;
import com.github.leovd100.alura.challenge.services.CourseService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseController {


    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping
    public ResponseEntity<CourseRegisterDTO> registerUser(@RequestBody @Valid CourseDTO dto){
        return ResponseEntity.ok(courseService.registerUser(dto));
    }
}
