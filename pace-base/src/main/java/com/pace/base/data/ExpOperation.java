/*
 *	File: @(#)ExpOperation.java 	Package: com.pace.base.data 	Project: PafServer
 *	Created: Nov 9, 2005  		By: jwatkins
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
package com.pace.base.data;

import com.pace.base.PafBaseConstants;
import com.pace.base.utility.StringUtils;

/**
 * Expression Operation parser.  Used to parse apart
 * expressions such as @IDESC(DIV09, L2).
 * 
 * @author jwatkins
 * @version 2.00
 * 
 */
public class ExpOperation {
	
	public static final String CHILDREN_TAG = "@CHILDREN";
	public static final String CHILD_TAG = "@CHILD";
	public static final String I_CHILDREN_TAG = "@ICHILDREN";
	public static final String I_CHILD_TAG = "@ICHILD";
	public static final String DESC_TAG = "@DESC";
	public static final String DESCENDANTS_TAG = "@DESCENDANTS";
	public static final String I_DESC_TAG = "@IDESC";
	public static final String I_DESCENDANTS_TAG = "@IDESCENDANTS";
	public static final String LEVEL_TAG = "@LEVEL";
	public static final String GEN_TAG = "@GEN";
	public static final String MEMBERS_TAG = "@MEMBERS";
	public static final String UOW_ROOT_TAG = PafBaseConstants.UOW_ROOT;
	public static final String USER_SEL_TAG = PafBaseConstants.USER_SEL_TAG;
	public static final String PLAN_VERSION_TAG = PafBaseConstants.PLAN_VERSION;
	
	//code
	private ExpOpCode opCode;
		
	//parsed parms
	private String[] parms;
	
	//only tag, no parsed parms { 1st parm value is tag }
	private boolean isTagOnly = false;

	/**
	 * 
	 * Creates an Expression Operation object.
	 * 
	 * @param term Term to parse into an Exp Operation
	 */
	public ExpOperation(String term) {
		
		if ( !term.contains("@") )
		{
			throw new IllegalArgumentException(
					"Not a valid expansion code, no @ symbol. (" + term + ")");
		}
		
		String t = term.toUpperCase();
		
		int minParms = 1;		
		int maxParms = 1;
		
		ExpOpCode code;
		
		if (t.contains(CHILDREN_TAG) || t.contains(CHILD_TAG)) {
			code = ExpOpCode.CHILDREN;
		} else if (t.contains(I_CHILDREN_TAG) || t.contains(I_CHILD_TAG)) {
			code = ExpOpCode.ICHILDREN;
		} else if (t.contains(DESC_TAG) || t.contains(DESCENDANTS_TAG)) {
			code = ExpOpCode.DESC;
			maxParms = 2;
		} else if (t.contains(I_DESC_TAG) || t.contains(I_DESCENDANTS_TAG)) {
			code = ExpOpCode.IDESC;
			maxParms = 2;
		} else if (t.contains(LEVEL_TAG)) {
			code = ExpOpCode.LEVEL;
			minParms = 1;
			maxParms = 2;
		} else if (t.contains(GEN_TAG)) {
			code = ExpOpCode.GEN;
			minParms = 2;
			maxParms = 2;			
		} else if (t.contains(MEMBERS_TAG)) {
			code = ExpOpCode.MEMBERS;
			maxParms = 99;
		} else if (t.contains(UOW_ROOT_TAG)) {
			code = ExpOpCode.UOW_ROOT;
			isTagOnly = true;
		} else if (t.contains(PLAN_VERSION_TAG)) {
			code = ExpOpCode.PLAN_VERSION;			
			isTagOnly = true;
		} else if (t.contains(USER_SEL_TAG)) {
			code = ExpOpCode.USER_SEL;
			minParms = 1;
			maxParms = 4;
		} else {
			throw new IllegalArgumentException(
					"Not a valid expansion code, undefined. (" + term + ")");
		}

		opCode = code;

		this.parms = splitParms(term);

		if (parms.length < minParms || parms.length - 1 > maxParms) {
			throw new IllegalArgumentException(
					"Invalid parameter for operation. (" + term + ")");
		}

	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		if ( opCode != null && parms != null ) {
			
			String tag = getTagFromOpCode();
			
			//TTN-1133; this is only called for dynamic plan versions.  if tag contains but doesn't start or end with
			if ( isTagOnly && parms != null && parms.length == 1 && parms[0].contains(PLAN_VERSION_TAG) && ! ( parms[0].startsWith(PLAN_VERSION_TAG) && parms[0].endsWith(PLAN_VERSION_TAG)))  {
				
				tag = parms[0];
				
			}
			
			if ( tag != null ) {
				
				StringBuffer strBuff = new StringBuffer(tag);
				
				if ( parms.length > 0 && ! isTagOnly) {
					
					strBuff.append(StringUtils.arrayToString(parms, "(", ")", "", "", ", "));
					
				}
				
				return strBuff.toString();
			}
			
		}
		
		return super.toString();
	}


	/**
	 * 
	 *  Matches the tag used from the op code.
	 *
	 * @return tag, like @CHILD, @IDESC, etc
	 */
	private String getTagFromOpCode() {
		
		String tag = null;
		
		//switch on op code
		switch (opCode) {
			case CHILDREN:
				tag = CHILDREN_TAG;
				break;
			case ICHILDREN:
				tag = I_CHILDREN_TAG; 
				break;
			case DESC:
				tag = DESC_TAG;
				break;				
			case IDESC:
				tag = I_DESC_TAG;
				break;				
			case LEVEL:
				tag = LEVEL_TAG;
				break;				
			case GEN:
				tag = GEN_TAG;
				break;				
			case MEMBERS:
				tag = MEMBERS_TAG;
				break;				
			case UOW_ROOT:
				tag = UOW_ROOT_TAG;
				break;				
			case PLAN_VERSION:
				tag = PLAN_VERSION_TAG;
				break;
			case USER_SEL:
				tag = USER_SEL_TAG;
				break;
		}
		
		return tag;
	}

	/**
	 * @return Returns the opCode.
	 */
	public ExpOpCode getOpCode() {
		return opCode;
	}

	/**
	 * @return Returns the parms.
	 */
	public String[] getParms() {
		return parms;
	}

	/**
	 * @param parms the parms to set
	 */
	public void setParms(String[] parms) {
		this.parms = parms;
	}
	
	/**
	 * 
	 *  Splits the expression into an string array
	 *
	 * @param expression Expression to split
	 * @return			 Array of split parms
	 */
	private static String[] splitParms(String expression) {

		int startPos = expression.indexOf("(");
		int endPos = expression.lastIndexOf(")");

		//if no ( or ), return expression in array
		if ( startPos == -1 && endPos == -1 ) {
			
			return new String[] { expression };
			
		}
		
		String parmString = null;

		if (startPos != endPos) {
			parmString = expression.substring(startPos + 1, endPos);
		} else {
			return new String[] { "" };
		}

		String[] parmList = parmString.split(",");
		for (int i = 0; i < parmList.length; i++) {
			parmList[i] = parmList[i].trim();
		}
		return parmList;

	}

	/**
	 * 
	 * Gets the first op code in expression.
	 *
	 * @param expression
	 * @return 
	 */
	@SuppressWarnings("unused")
	private static String getFirstOpCodeString(String expression) {
		int startPos = expression.indexOf("@");
		int endPos;
		String op = null;
		// function operator must be preceeded by a space, comma, or be the
		// beginning of the expression
		if ((startPos == 0) || expression.charAt(startPos - 1) == ' '
				|| expression.charAt(startPos - 1) == ',') {
			// valid opcode, find pos of ( and pull/trim whats between
			endPos = expression.indexOf("(", startPos);
			op = expression.substring(startPos, endPos).trim();

		}
		return op;
	}

			
}