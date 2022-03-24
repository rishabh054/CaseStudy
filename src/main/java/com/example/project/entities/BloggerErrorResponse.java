package com.example.project.entities;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class BloggerErrorResponse {
	private int status;
	private String message;
	private LocalDateTime timeStamp;

}
