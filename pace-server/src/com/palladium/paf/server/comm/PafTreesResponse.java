/**
 * 
 */
package com.palladium.paf.server.comm;

import com.pace.base.mdb.PafSimpleDimTree;

/**
 * @author jmilliron
 *
 */
public class PafTreesResponse {

	private PafSimpleDimTree[] pafSimpleDimTrees;

	/**
	 * @return the pafSimpleDimTrees
	 */
	public PafSimpleDimTree[] getPafSimpleDimTrees() {
		return pafSimpleDimTrees;
	}

	/**
	 * @param pafSimpleDimTrees the pafSimpleDimTrees to set
	 */
	public void setPafSimpleDimTrees(PafSimpleDimTree[] pafSimpleDimTrees) {
		this.pafSimpleDimTrees = pafSimpleDimTrees;
	}
	
}
