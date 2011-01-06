/**
 * 
 */
package com.palladium.paf.project.utils;

import java.util.Comparator;

import com.palladium.paf.app.PafUserSecurity;

/**
 * @author jmilliron
 *
 */
public class NameComparator implements Comparator {

	public int compare(Object user1, Object user2) {
		
		String user1Name = ((PafUserSecurity) user1).getUserName();
		String user2Name = ((PafUserSecurity) user2).getUserName();
		
		return user1Name.compareTo(user2Name);
		
	}
	
}
