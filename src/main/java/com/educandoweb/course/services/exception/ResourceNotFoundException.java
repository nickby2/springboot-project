package com.educandoweb.course.services.exception;

public class ResourceNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) {
		super("Ressource not found. ID" + id);
	}
	

}
