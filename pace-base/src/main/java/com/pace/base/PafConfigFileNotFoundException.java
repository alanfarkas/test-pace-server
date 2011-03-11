package com.pace.base;

public class PafConfigFileNotFoundException extends PafException {

	/**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 
     *
     */
    public PafConfigFileNotFoundException() {
		super();
	}

    /**
     * 
     * @param message
     * @param pes
     */
	public PafConfigFileNotFoundException(String message, PafErrSeverity pes) {
		super(message, pes);
	}

	/**
	 * 
	 * @param message
	 * @param pes
	 * @param cause
	 */
	public PafConfigFileNotFoundException(String message, PafErrSeverity pes,
			Throwable cause) {
		super(message, pes, cause);
	}
}
