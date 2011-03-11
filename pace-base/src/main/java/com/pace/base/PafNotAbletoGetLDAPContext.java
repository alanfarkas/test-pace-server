package com.pace.base;

public class PafNotAbletoGetLDAPContext extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7912043687159851508L;
	
	/**
	 * Constructor. 
	 */
	public PafNotAbletoGetLDAPContext() {
	}
	
	/**
	 * Constructor.  A PafException is used to create this exception
	 * 
	 * @param exception
	 */
	public PafNotAbletoGetLDAPContext(PafException exception) {
		super(exception);
	}
	
	

}
