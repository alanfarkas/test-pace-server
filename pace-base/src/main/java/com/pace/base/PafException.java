/*
 *  File: @(#)PafException.java    	Package: com.pace.base  Project: Base Libraries
 *  Created: Sep Jun 30, 2005       By: Jim Watkins
 *  Version: x.xx
 *
 *  Copyright (c) 2005-2006 Palladium Group, Inc. All rights reserved.
 *
 *  This software is the confidential and proprietary information of Palladium Group, Inc.
 *  ("Confidential Information"). You shall not disclose such Confidential Information and 
 *  should use it only in accordance with the terms of the license agreement you entered into
 *  with Palladium Group, Inc.
 *
 *
 *
    Date            Author          Version         Changes
    xx/xx/xx        xxxxxxxx        x.xx            ..............
 * 
 */
package com.pace.base;

import java.util.ArrayList;
import java.util.List;

import com.pace.base.state.IPafClientState;


/**
 * General exception class for holding PAF specific error information
 *
 * @version	x.xx
 * @author JWatkins
 *
 */
public class PafException extends Exception {


	private static final long serialVersionUID = 1L;
	IPafClientState clientState;
	private ArrayList<String> messageDetail = new ArrayList<String>();



	private PafErrSeverity pes = PafErrSeverity.Info;

	public PafException() {
		super();
	}

	/**
	 * @param message
	 * @param pes 
	 */
	public PafException(String message, PafErrSeverity pes) {
		super(message);
		this.pes = pes;
	}

    public PafException(String message, PafErrSeverity pes, Throwable cause) {
        super(message, cause);
        this.pes = pes;
    }
    
	/**
	 * @param message
	 * @param cause
	 * @param severity 
	 */
	public PafException(String message, Throwable cause, @SuppressWarnings("unused")
	PafErrSeverity severity) {
		super(message, cause);
	}
    
    public PafException(@SuppressWarnings({ "unused", "unused" })
	String message, @SuppressWarnings("unused")
	Throwable cause, IPafClientState clientState) {
        this.clientState = clientState;
    }

	/**
	 * @param cause
	 */
	public PafException(Throwable cause) {
		super(cause);
	}
    
    public PafErrSeverity getSeverity() {
        return pes;
    }
    
    public void setSeverity(PafErrSeverity pes) {
        this.pes = pes;
    }
    
    public PafSoapException getPafSoapException() {
    	return new PafSoapException(this);
    }

    /**
     * @return Returns the clientState.
     */
    public IPafClientState getClientState() {
        return clientState;
    }

    public void setClientState(IPafClientState clientState) {
        this.clientState = clientState;
        
    }

    public void addMessageDetail(String string) {
        messageDetail.add(string);
    }
    
    public List<String> getMessageDetails() {
        return messageDetail;
    }

}
