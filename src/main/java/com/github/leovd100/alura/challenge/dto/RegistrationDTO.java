package com.github.leovd100.alura.challenge.dto;

import java.time.LocalDate;
import java.util.UUID;

public class RegistrationDTO {
    private UUID userId;
    private UUID courseId;
    private LocalDate initialDate;

    public RegistrationDTO(UUID userId, UUID courseId, LocalDate initialDate) {
        this.userId = userId;
        this.courseId = courseId;
        this.initialDate = initialDate;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public UUID getCourseId() {
        return courseId;
    }

    public void setCourseId(UUID courseId) {
        this.courseId = courseId;
    }

    public LocalDate getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(LocalDate initialDate) {
        this.initialDate = initialDate;
    }
}
