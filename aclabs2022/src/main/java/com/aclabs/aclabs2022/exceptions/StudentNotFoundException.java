package com.aclabs.aclabs2022.exceptions;

public class StudentNotFoundException extends RuntimeException {

    public StudentNotFoundException(String message) {
        super(message);
    }

}