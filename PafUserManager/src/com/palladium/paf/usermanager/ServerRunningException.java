/**
 * 
 */
package com.palladium.paf.usermanager;

/**
 * @author kmoos
 *
 */
public class ServerRunningException extends Exception {

	/**
	 * 
	 */
	public ServerRunningException() {
		super();
	}

	/**
	 * @param message
	 */
	public ServerRunningException(String message) {
		super(message);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public ServerRunningException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param cause
	 */
	public ServerRunningException(Throwable cause) {
		super(cause);
	}

}
