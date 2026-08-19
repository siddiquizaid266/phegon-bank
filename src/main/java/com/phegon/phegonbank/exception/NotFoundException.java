package com.phegon.phegonbank.exception;

public class NotFoundException extends RuntimeException {
	public NotFoundException(String error) {
		super(error);
	}
	
}
