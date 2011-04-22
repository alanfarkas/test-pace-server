package com.pace.server;

import java.util.ArrayList;
import java.util.List;

import com.pace.base.rules.MemberSet;
import com.pace.base.rules.RoundingRule;
import com.pace.base.utility.PafXStream;
import com.thoughtworks.xstream.XStream;



public class tempExport {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		MemberSet ms = new MemberSet();
		ms.setMember("SLS_DLR");
		ms.setDimension("Measures");
		List<MemberSet> memberSets = new ArrayList<MemberSet>();
		memberSets.add(ms);
		
		RoundingRule r1 = new RoundingRule();
		r1.setMemberList(memberSets);
		r1.setRoundingFunction("Round");
		r1.setDigits(2);
		
		RoundingRule r2 = new RoundingRule();
		r2.setMemberList(memberSets);
		r2.setRoundingFunction("Round");
		r2.setDigits(2);
		
		RoundingRule[] rr = new RoundingRule[2];
		rr[0] = r1;
		rr[1] = r2;
		PafXStream.setMode(XStream.NO_REFERENCES);
		
		//PafMetaData.exportRoundingRules(rr);
		PafXStream.exportObjectToXml(rr, "C:\\Program Files\\Palladium\\PafServer\\conf\\paf_rounding_rules.xml");
	}

}
