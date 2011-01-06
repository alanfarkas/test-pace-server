/*
 *	File: @(#)LevelGenParamUtil.java 	Package: com.palladium.utility 	Project: Paf Base Libraries
 *	Created: Feb 13, 2005  		By: JWatkins
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
package com.palladium.utility;

import org.apache.log4j.Logger;

import com.palladium.paf.PafBaseConstants;
import com.palladium.paf.mdb.PafDimTree.LevelGenType;

/**
 * A utility that parses Level / Generation members.  Typically a format of a member would be
 * L0 or G5.  The L stands for Level and G for Generation.
 * 
 * @author JavaJ
 * @version 1.00
 * 
 */
public class LevelGenParamUtil {
	
	private static Logger logger = Logger.getLogger(LevelGenParamUtil.class);
		
	/**
	 * Parses the member to get the L or G identifier.  If member doens't contain L or G, 
	 * Level is returned by default. 
	 * 
	 * @param member Level / Generation member to parse
	 * @return LevelGenType
	 */
	public static LevelGenType getLevelGenType(String member) {
		
		LevelGenType levelGenType = null;
		
		//if G or L, or set to L
		if (member.startsWith(PafBaseConstants.LEVELGEN_TOKEN_LEVEL_IDENT)
				|| member.startsWith(PafBaseConstants.LEVELGEN_TOKEN_GENERATION_IDENT)) {

			// holds the L or G
			String levelGenIdent = member.substring(0, 1);
			
			//if L
			if (levelGenIdent
					.equalsIgnoreCase(PafBaseConstants.LEVELGEN_TOKEN_LEVEL_IDENT)) {

				levelGenType = LevelGenType.LEVEL;

			//if G
			} else if (levelGenIdent
					.equalsIgnoreCase(PafBaseConstants.LEVELGEN_TOKEN_GENERATION_IDENT)) {

				levelGenType = LevelGenType.GEN;

			}

		} else {

			//default value, not prepended with L or G
			levelGenType = LevelGenType.LEVEL;
			
		}
		
		return levelGenType;
		
	}
	
	/**
	 * Parses the member to get the level or generation number. 
	 * 
	 * @param member Level / Generation member to parse
	 * @return level or generation number
	 */
	public static int getLevelGenNumber(String member) {
		
		int levelGenNumber = 0;
		
		//if identifier is present
		if (member.startsWith(PafBaseConstants.LEVELGEN_TOKEN_LEVEL_IDENT)
				|| member.startsWith(PafBaseConstants.LEVELGEN_TOKEN_GENERATION_IDENT)) {
			
			// holds the level or generation number
			String levelGenNumStr = member.substring(1, member.length());
			
			//if string is all numeric, else set as 0
			if (levelGenNumStr.matches("[0123456789]*")) {

				levelGenNumber = Integer.parseInt(levelGenNumStr);

			} else {

				//default to 0
				levelGenNumber = 0;
			}

		} else {

			//ensure member is only numeric
			if (member.matches("[0123456789]*")) {
			
				levelGenNumber = Integer.parseInt(member);

			}
		}
		
		return levelGenNumber;
		
	}
	
	public static void main(String[] args) {
		
		String member = "0";
		
		logger.info("Member: " + member + "; LevelGenType: " + LevelGenParamUtil.getLevelGenType(member));
		logger.info("Member: " + member + "; LevelGenNum: " + LevelGenParamUtil.getLevelGenNumber(member));
		
		member = "3";
		
		logger.info("Member: " + member + "; LevelGenType: " + LevelGenParamUtil.getLevelGenType(member));
		logger.info("Member: " + member + "; LevelGenNum: " + LevelGenParamUtil.getLevelGenNumber(member));
		
		member = "L0";
		
		logger.info("Member: " + member + "; LevelGenType: " + LevelGenParamUtil.getLevelGenType(member));
		logger.info("Member: " + member + "; LevelGenNum: " + LevelGenParamUtil.getLevelGenNumber(member));
		
		member = "P";
		
		logger.info("Member: " + member + "; LevelGenType: " + LevelGenParamUtil.getLevelGenType(member));
		logger.info("Member: " + member + "; LevelGenNum: " + LevelGenParamUtil.getLevelGenNumber(member));
		
		member = "P3";
		
		logger.info("Member: " + member + "; LevelGenType: " + LevelGenParamUtil.getLevelGenType(member));
		logger.info("Member: " + member + "; LevelGenNum: " + LevelGenParamUtil.getLevelGenNumber(member));
		
		member = "G3";
		
		logger.info("Member: " + member + "; LevelGenType: " + LevelGenParamUtil.getLevelGenType(member));
		logger.info("Member: " + member + "; LevelGenNum: " + LevelGenParamUtil.getLevelGenNumber(member));
		
		
	}
	
}
