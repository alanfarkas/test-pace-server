package com.palladium.paf.server.comm;

import com.palladium.paf.comm.PafRequest;
import com.palladium.paf.comm.UserFilterSpec;
import com.palladium.paf.mdb.PafSimpleDimTree;

/**
 * Class_description_goes_here
 *
 * @version	x.xx
 * @author JWatkins
 *
 */
public class PafPopulateRoleFilterResponse extends PafRequest {
	private PafSimpleDimTree[] simpleDimTrees = null;
	private String[] baseTreeNames = null;
	private String[] attributeTreeNames = null;
	private UserFilterSpec userFilterSpec = null;
	
	/**
	 * @return Returns the PafSimpleDimTrees
	 */
	public PafSimpleDimTree[] getDimTrees(){
		return this.simpleDimTrees;
	}
	
	public void setDimTrees(PafSimpleDimTree[] simpleDimTrees){
		this.simpleDimTrees = simpleDimTrees;
	}

	public void setBaseTreeNames(String[] baseTreeNames) {
		this.baseTreeNames = baseTreeNames;
	}

	public String[] getBaseTreeNames() {
		return baseTreeNames;
	}

	public void setAttributeTreeNames(String[] attributeTreeNames) {
		this.attributeTreeNames = attributeTreeNames;
	}

	public String[] getAttributeTreeNames() {
		return attributeTreeNames;
	}

	public void setUserFilterSpec(UserFilterSpec userFilterSpec) {
		this.userFilterSpec = userFilterSpec;
	}

	public UserFilterSpec getUserFilterSpec() {
		return userFilterSpec;
	}
	
}
