/*
 *	File: @(#)PafAuthRequest.java 	Package: com.palladium.paf.server.comm 	Project: PafServer
 *	Created: Aug 25, 2005  		By: JWatkins
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
package com.palladium.paf.server.comm;

import com.palladium.paf.comm.PafRequest;
import com.palladium.paf.server.PafServiceProvider;
import com.palladium.utility.*;
import org.apache.log4j.Logger;

/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author JWatkins
 *
 */
public class PafAuthRequest extends PafRequest {
    private String username;
    private String passwordHash;
    private String password;
    private String IV;
    private String domain;
    private String sid;
    private static Logger logger = Logger.getLogger(PafServiceProvider.class);
    
    public PafAuthRequest() {}
    public PafAuthRequest(String hash, String username) {
        super();
        passwordHash = hash;
        this.username = username;
    }
    public String getPasswordHash() {
        return passwordHash;
    }
    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }
    @SuppressWarnings("finally")
	public String getUsername() {
    	if(IV != null && username != null){
    		String decryptedUsername = null;
    		try{
    			decryptedUsername = AESEncryptionUtil.decrypt(username, IV);
    		}
    		catch(Exception e){
    			logger.error(e.getMessage());
    		}
    		finally{
    			return decryptedUsername;
    		}
    	}
    	
    	if (username != null){
    		username = username.trim();
    	}
    	else{
    		username = "";
    	}
    	
        return username.trim();
    }
    public void setUsername(String username) {
        this.username = username;
    }
	public void setPassword(String password) {
		this.password = password;
	}
	
	@SuppressWarnings("finally")
	public String getPassword(){
    	if(IV != null && password != null){
    		String decryptedPassword = null;
    		try{
    			decryptedPassword = AESEncryptionUtil.decrypt(password, IV);
    		}
    		catch(Exception e){
    			logger.error(e.getMessage());
    		}
    		finally{
    			return decryptedPassword.trim();
    		}
    	}
    	
    	if (password != null){
    		password = password.trim();
    	}
        return password;
    }
	
	public void setIV(String iV) {
		IV = iV;
	}
	public String getIV() {
		return IV;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	@SuppressWarnings("finally")
	public String getDomain() {
    	if(IV != null && domain != null){
    		String decryptedDomain = null;
    		try{
    			decryptedDomain = AESEncryptionUtil.decrypt(domain, IV);
    		}
    		catch(Exception e){
    			logger.error(e.getMessage());
    		}
    		finally{
    			return decryptedDomain.trim() ;
    		}
    	}
    	
    	if (domain != null){
    		domain = domain.trim();
    	}else{
    		domain = "";
    	}
    	
		return domain;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	
	@SuppressWarnings("finally")
	public String getSid() {
    	if(IV != null && sid != null){
    		String decryptedSid = null;
    		try{
    			decryptedSid = AESEncryptionUtil.decrypt(sid, IV);
    		}
    		catch(Exception e){
    			logger.error(e.getMessage());
    		}
    		finally{
    			return decryptedSid.trim() ;
    		}
    	}
    	
    	if (sid != null){
    		sid = sid.trim();
    	}
    	
    	//Non Null sid indicates SSO
    	
		return sid;
	}
}
