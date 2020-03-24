package com.example.course.services.exceptions;

public class ResourceNotFoundException extends Throwable {

	
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) {
		super("resouce not found. Id "+ id);
	}
	
	
	
}
