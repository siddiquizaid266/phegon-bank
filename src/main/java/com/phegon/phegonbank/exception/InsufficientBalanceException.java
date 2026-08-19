package com.phegon.phegonbank.exception;

public class InsufficientBalanceException extends RuntimeException {
	public InsufficientBalanceException(String error) {
		super(error);
	}
}
