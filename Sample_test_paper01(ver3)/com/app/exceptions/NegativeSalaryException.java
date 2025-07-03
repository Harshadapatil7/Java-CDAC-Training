package com.app.exceptions;

public class NegativeSalaryException extends RuntimeException {
	public NegativeSalaryException() {
	}

	public NegativeSalaryException(String messsage) {
		super(messsage);
	}
}
