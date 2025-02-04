package com.deliverboy.deliverboy.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public ResourceNotFoundException(Object id) {
		super("Desculpe - Recurso não encontrado. id: " + id); 
		
	}
	
	
	
	
	
}
