package com.palladium.paf;

public class InvalidUserNameException extends PafException {

	public InvalidUserNameException() {
		super();
	}

	public InvalidUserNameException(String message, PafErrSeverity pes) {
		super(message, pes);
	}

	public InvalidUserNameException(String message, PafErrSeverity pes,
			Throwable cause) {
		super(message, pes, cause);
	}

	public InvalidUserNameException(String message, Throwable cause) {
		super(message, cause, PafErrSeverity.Info);
	}

	public InvalidUserNameException(Throwable cause) {
		super(cause);
	}

}
