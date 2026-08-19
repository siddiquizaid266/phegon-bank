package com.phegon.phegonbank.exception;

public class InvalidTransactionException extends RuntimeException {
	public InvalidTransactionException(String error) {
		super(error);
	} 

}
