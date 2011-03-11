/*
 *	File: @(#)NoEmailAddressException.java 	Package: com.pace.base 	Project: Paf Base Libraries
 *	Created: Dec 11, 2006  		By: jmilliron
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-2006 Palladium Group, Inc. All rights reserved.
 *
 *	This software is the confidential and proprietary information of Palladium Group, Inc.
 *	("Confidential Information"). You shall not disclose such Confidential Information and 
 * 	should use it only in accordance with the terms of the license agreement you entered into
 *	with Palladium Group, Inc.
 *
 *
 *
	Date			Author			Version			Changes
	xx/xx/xx		xxxxxxxx		x.xx			..............
 * 
 */
package com.pace.base;

import com.pace.base.state.IPafClientState;

/**
 * Class_description_goes_here
 *
 * @author jmilliron
 * @version	x.xx
 *
 */
public class NoEmailAddressException extends PafException {

	public NoEmailAddressException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NoEmailAddressException(String message, PafErrSeverity pes, Throwable cause) {
		super(message, pes, cause);
		// TODO Auto-generated constructor stub
	}

	public NoEmailAddressException(String message, PafErrSeverity pes) {
		super(message, pes);
		// TODO Auto-generated constructor stub
	}

	public NoEmailAddressException(String message, Throwable cause, IPafClientState clientState) {
		super(message, cause, clientState);
		// TODO Auto-generated constructor stub
	}

	public NoEmailAddressException(String message, Throwable cause, PafErrSeverity severity) {
		super(message, cause, severity);
		// TODO Auto-generated constructor stub
	}

	public NoEmailAddressException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
