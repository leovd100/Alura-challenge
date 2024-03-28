package com.github.leovd100.alura.challenge.services;

import com.github.leovd100.alura.challenge.dto.CourseDTO;
import com.github.leovd100.alura.challenge.dto.CourseRegisterDTO;

public interface CourseService {

    CourseRegisterDTO registerUser(CourseDTO dto);
}
