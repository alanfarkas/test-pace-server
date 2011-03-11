package com.pace.base;

public class PafInvalidLogonInformation extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4209457272839768093L;
	
	/**
	 * Constructor. 
	 */
	public PafInvalidLogonInformation() {
	}
	
	/**
	 * Constructor.  A PafException is used to create this exception
	 * 
	 * @param exception
	 */
	public PafInvalidLogonInformation(PafException exception) {
		super(exception);
	}

}
