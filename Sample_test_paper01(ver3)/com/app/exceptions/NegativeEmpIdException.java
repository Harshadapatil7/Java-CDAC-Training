package com.app.exceptions;

public class NegativeEmpIdException extends RuntimeException {
	public NegativeEmpIdException() {

	}

	public NegativeEmpIdException(String message) {
		super(message);
	}
}
