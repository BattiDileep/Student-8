package com.example.Student.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class EmployeeNotFound extends RuntimeException{
	public EmployeeNotFound(String message) {
		super(message);
	}

}