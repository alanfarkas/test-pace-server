/**
 * 
 */
package com.palladium.paf.project.utils.excel.test;

/**
 * @author jmilliron
 *
 */
public class TestRegExp {

	public static void main(String[] args) {
		
		System.out.println(getHardRef("=Sheet1!A2"));
		
		System.out.println(getHardRef("=Sheet1!AB23"));
		
		
		
		//System.out.println(val.replaceAll("\\![A-Z]+", "\\!\\$$&"));
		
	}
	
	private static String getHardRef(String val) {
		
		String IDENT = "!";
		
		String sheetRef = val.substring(0, val.indexOf(IDENT));
		
		String addressRef = val.substring(val.indexOf(IDENT) + 1, val.length());
		
		System.out.println(sheetRef);
		System.out.println(addressRef);
		
		addressRef = addressRef.replaceAll("^[A-Z]+", "\\$$0");
		addressRef = addressRef.replaceAll("\\d+$", "\\$$0");

		return sheetRef + IDENT + addressRef;
		
	}
	
}
