package com.security.middlesec.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ManejadorGlobalExceptions {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> manejarErrorValidacion(MethodArgumentNotValidException e) {
        Map<String, String> respuestaMensaje = new HashMap<>();

        e.getBindingResult().getFieldErrors().forEach(error -> {
            respuestaMensaje.put(error.getField(), error.getDefaultMessage());
        });

        return new ResponseEntity<>(respuestaMensaje, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> manejarErrorGlobal(Exception e) {
        return new ResponseEntity<>("Error Interno: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
