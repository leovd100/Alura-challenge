package com.github.leovd100.alura.challenge.controller;

import com.github.leovd100.alura.challenge.dto.CourseDTO;
import com.github.leovd100.alura.challenge.dto.CourseRegisterDTO;
import com.github.leovd100.alura.challenge.services.CourseService;
import com.github.leovd100.alura.challenge.services.impl.CourseServiceImpl;
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

    public CourseController(CourseServiceImpl courseService) {
        this.courseService = courseService;
    }

    @PostMapping
    public ResponseEntity<CourseRegisterDTO> registerUser(@RequestBody @Valid CourseDTO dto){
        return ResponseEntity.ok(courseService.registerUser(dto));
    }
}
