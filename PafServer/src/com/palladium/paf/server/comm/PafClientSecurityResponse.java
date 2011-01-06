/**
 * 
 */
package com.palladium.paf.server.comm;

import com.palladium.paf.app.PafUserDef;

/**
 * @author jmilliron
 *
 */
public class PafClientSecurityResponse {
	
	private boolean successful;
	
	private PafUserDef pafUserDef;
	
	private PafUserDef[] pafUserDefs;
	
	private String[] pafUserNames;
	
 	private String iV;

	/**
	 * @return the successful
	 */
	public boolean isSuccessful() {
		return successful;
	}

	/**
	 * @param successful the successful to set
	 */
	public void setSuccessful(boolean successful) {
		this.successful = successful;
	}

	/**
	 * @return the pafUserDefs
	 */
	public PafUserDef[] getPafUserDefs() {
		return pafUserDefs;
	}

	/**
	 * @param pafUserDefs the pafUserDefs to set
	 */
	public void setPafUserDefs(PafUserDef[] pafUserDefs) {
		this.pafUserDefs = pafUserDefs;
	}

	/**
	 * @return the pafUserDef
	 */
	public PafUserDef getPafUserDef() {
		return pafUserDef;
	}

	/**
	 * @param pafUserDef the pafUserDef to set
	 */
	public void setPafUserDef(PafUserDef pafUserDef) {
		this.pafUserDef = pafUserDef;
	}

	/**
	 * @return the pafUserNames
	 */
	public String[] getPafUserNames() {
		return pafUserNames;
	}

	/**
	 * @param pafUserNames the pafUserNames to set
	 */
	public void setPafUserNames(String[] pafUserNames) {
		this.pafUserNames = pafUserNames;
	}

	public void setIV(String iV) {
		this.iV = iV;
	}

	public String getIV() {
		return iV;
	}

}
