package com.example.demo.Error;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import jakarta.persistence.EntityNotFoundException;

@RestControllerAdvice
public class NotFound {
    
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<?> ErrorHandling404() {
       
        return ResponseEntity.notFound().build();
    }
}
