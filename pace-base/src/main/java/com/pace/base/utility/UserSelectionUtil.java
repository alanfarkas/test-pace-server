package com.pace.base.utility;

import java.util.LinkedHashSet;
import java.util.Set;

import com.pace.base.PafBaseConstants;
import com.pace.base.view.PafViewSection;
import com.pace.base.view.PageTuple;
import com.pace.base.view.ViewTuple;

public class UserSelectionUtil {
	
	private static final String userSelectionTag = PafBaseConstants.USER_SEL_TAG + "(";

	public static Set<String> findUserSelections(PafViewSection viewSection) {
		
		Set<String> userSelectionNames = new LinkedHashSet<String>();
				
		PageTuple[] pageTuples = viewSection.getPageTuples();
		ViewTuple[] rowTuples = viewSection.getRowTuples();
		ViewTuple[] colTuples = viewSection.getColTuples();
				
		for (PageTuple pageTuple : pageTuples) {
		
			if ( pageTuple.getMember().contains(userSelectionTag)) {
				userSelectionNames.add(getUserSelectionMember(pageTuple.getMember()));
			}
			
		}
		
		for (ViewTuple colTuple : colTuples) {
			
			for (String memberDef : colTuple.getMemberDefs()) {
				
				if ( memberDef.contains(userSelectionTag)) {
					userSelectionNames.add(getUserSelectionMember(memberDef));
				}				
			}
			
		}

		for (ViewTuple rowTuple : rowTuples) {
			
			for (String memberDef : rowTuple.getMemberDefs()) {
				
				if ( memberDef.contains(userSelectionTag)) {
					userSelectionNames.add(getUserSelectionMember(memberDef));
				}				
			}
			
		}
		
		return userSelectionNames;
	}

	public static String getUserSelectionMember(String fullMember) {
		
		int beginNdx = fullMember.indexOf(userSelectionTag);
		beginNdx += userSelectionTag.length();
		
		int endNdx = fullMember.indexOf(")");
		
		return fullMember.substring(beginNdx, endNdx).trim();
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(UserSelectionUtil.getUserSelectionMember("@IDESC(@USER_SEL(M1))"));
		System.out.println(UserSelectionUtil.getUserSelectionMember("@USER_SEL(M1)"));
		
		LinkedHashSet<String> tmpSet = new LinkedHashSet<String>();
		
		tmpSet.add("AAA");
		tmpSet.add("AAC");
		tmpSet.add("AAB");		
		tmpSet.add("AAA");
		tmpSet.add("AAC");
		tmpSet.add("AAB");
		
		for (String str : tmpSet) {
			System.out.println(str);
		}
		
	}
}
