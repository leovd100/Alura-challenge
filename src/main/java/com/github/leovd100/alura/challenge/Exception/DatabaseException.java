package com.github.leovd100.alura.challenge.Exception;

import org.springframework.dao.DataIntegrityViolationException;

public class DatabaseException extends RuntimeException {
    public DatabaseException(String message) {
        super(message);
    }
}
