package com.pace.base;

public class InvalidPasswordException extends PafException {

	public InvalidPasswordException() {
		super();
	}

	public InvalidPasswordException(String message, PafErrSeverity pes) {
		super(message, pes);
	}

	public InvalidPasswordException(String message, PafErrSeverity pes,
			Throwable cause) {
		super(message, pes, cause);
	}

	public InvalidPasswordException(String message, Throwable cause) {
		super(message, cause, PafErrSeverity.Info);
	}

	public InvalidPasswordException(Throwable cause) {
		super(cause);
	}

}
