package com.example.project.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.project.entities.BloggerErrorResponse;


@ControllerAdvice
public class BloggerExceptionHandler {
	
	@ExceptionHandler
	public ResponseEntity<BloggerErrorResponse> handleException(IdNotFoundException exception) {
		BloggerErrorResponse error = new BloggerErrorResponse();
		
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(exception.getMessage());
		error.setTimeStamp(LocalDateTime.now());
		
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}

}
