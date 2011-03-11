/*
 *	File: @(#)DomainParser.java 	Package: com.pace.base.utility 	Project: Paf Base Libraries
 *	Created: Jan 28, 2008  		By: jmilliron
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-2007 Palladium Group, Inc. All rights reserved.
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
package com.pace.base.utility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * Parses a username and domain name from a string param.  The two are split based on the default
 * split tokens or the overriden tokens.
 *
 * @version	x.xx
 * @author jmilliron
 *
 */
public class DomainNameParser {
	
	//token
	public final static String AT_TOKEN = "@";

	//token	
	public final static String BACK_SLASH_TOKEN = "\\";
	
	//default token set
	public final static Set<String> defaultDomainParseTokenSet = new HashSet<String>(Arrays.asList(AT_TOKEN, BACK_SLASH_TOKEN));

	private String userName;
	
	private String domainName;
	
	private boolean userPrincipalAccount = false;

	/**
	 * 
	 * Creates a domain name parser object using the default domain parser token set.
	 * 
	 * @param fullUserDomainName full user with domain name.  Ex. javaj@adg.com
	 */
	public DomainNameParser(String fullUserDomainName) {
	
		this(fullUserDomainName, null);
		
	}
	
	/**
	 * 
	 * Creates a domain name parser object using the override token set.  If override tokens
	 * is null, the default set is used
	 * 
	 * @param fullUserDomainName full user with domain name.  Ex. javaj@adg.com
	 * @param overrideTokens	 one or more override tokens (if specified, default tokens will not be used)
	 */
	public DomainNameParser(String fullUserDomainName, String... overrideTokens) {

		if ( fullUserDomainName != null ) {

			Set<String> domainParseTokenSet = new HashSet<String>(defaultDomainParseTokenSet);

			if ( overrideTokens != null && overrideTokens.length > 0 ) {

				domainParseTokenSet.clear();

				for (String overrideToken : overrideTokens ) {

					domainParseTokenSet.add(overrideToken);

				}

			}

			//ensures that only one of the overrideTokens exists in the fillUserDomainName
			if ( isValidDomainUserName(fullUserDomainName, overrideTokens)) {

				for (String parseToken : domainParseTokenSet ) {

					if ( fullUserDomainName.contains(parseToken ) ) {

						StringTokenizer st = new StringTokenizer(fullUserDomainName, parseToken, false);

						//allow only a single back slash
						if ( parseToken.equals(BACK_SLASH_TOKEN) && st.countTokens() != 2 ) {
							continue;
						}
						
						int lastIndex = 0;
						if(parseToken.equals(BACK_SLASH_TOKEN) && fullUserDomainName.contains(parseToken)){
							lastIndex = fullUserDomainName.lastIndexOf(parseToken);
							domainName = fullUserDomainName.substring(0, lastIndex);
							userName = fullUserDomainName.substring(lastIndex+1);
						}
						else if(parseToken.equals(AT_TOKEN) && fullUserDomainName.contains(parseToken)){
							lastIndex = fullUserDomainName.lastIndexOf(parseToken);
							userName = fullUserDomainName.substring(0, lastIndex);
							domainName = fullUserDomainName.substring(lastIndex+1);
						}
					}

				}

			}

		}
	}
		

	
	/**
	 * @return the domain
	 */
	public String getDomainName() {
		return domainName;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @return the domainParseTokenSet
	 */
	public static Set<String> getDomainParseTokenSet() {
		return defaultDomainParseTokenSet;
	}
	
	/**
	 * 
	 * Checks the full user domain tame to see if it is a valid user + domain name
	 *
	 * @param fullUserDomainName full user with domain name.  Ex. javaj@adg.com
	 * @return true if valid domain and username can be parsed
	 */
	public static boolean isValidDomainUserName(String fullUserDomainName) {
		
		return isValidDomainUserName(fullUserDomainName, null);
		
	}
	
	
	/**
	 * 
	 * Checks the full user domain tame to see if it is a valid user + domain name based on the override 
	 * tokens or the default tokens.
	 *
	 * @param fullUserDomainName full user with domain name.  Ex. javaj@adg.com
	 * @param overrideTokens	 one or more override tokens (if specified, default tokens will not be used)
	 * @return true if valid domain and username can be parsed
	 */
	public static boolean isValidDomainUserName(String fullUserDomainName, String... overrideTokens) {
		
		boolean isValid = false;
								
		if ( fullUserDomainName != null ) {
			
			Set<String> domainParseTokenSet = new HashSet<String>(defaultDomainParseTokenSet);
			
			if ( overrideTokens != null && overrideTokens.length > 0 ) {
				
				domainParseTokenSet.clear();
				
				for (String overrideToken : overrideTokens ) {
					
					domainParseTokenSet.add(overrideToken);
					
				}
				
			}
			
			//if there is a back slash only continue if 1 token exists
			if ( domainParseTokenSet.contains(BACK_SLASH_TOKEN) && fullUserDomainName.contains(BACK_SLASH_TOKEN) && 
					getTokenCount(fullUserDomainName, domainParseTokenSet) != 1 ) {	
				return isValid;
			}
							
			for (String domainParser : domainParseTokenSet ) {

				if ( fullUserDomainName.startsWith(domainParser) ) {

					break;

				} else if ( fullUserDomainName.endsWith(domainParser) ) {

					break;

				} else if ( fullUserDomainName.contains(domainParser) ) {

					isValid = true;

					break;

				}

			}
					
		}
		
		return isValid;		
	}

	private static int getTokenCount(String fullUserDomainName, Set<String> domainParseTokenSet) {
		
		int tokenCnt = 0;
		
		for (String domainParser : domainParseTokenSet ) {
		
			if ( fullUserDomainName.contains(domainParser) ) {
				
				int fromIndex = 0;
				int index = 0;
				do{
					index = fullUserDomainName.indexOf(domainParser, fromIndex);
					fromIndex = index + 1;
					
					tokenCnt++;
					
				} while(index < fullUserDomainName.lastIndexOf(domainParser));		
			}
		}
		
		return tokenCnt;
	}



	public boolean isUserPrincipalAccount() {
		return userPrincipalAccount;
	}
		
}
