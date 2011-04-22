/*
 *	File: @(#)PafPlanSessionResponse.java 	Package: com.pace.base.server.comm 	Project: PafServer
 *	Created: Nov 2, 2005  		By: JWatkins
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
	04/28/2006		jmilliron		1.01			Removed PafViewTree and added viewTreeItems &
													customMenuDefs.
 * 
 */
package com.pace.server.comm;

import com.pace.base.app.PafWorkSpec;
import com.pace.base.comm.CustomMenuDef;
import com.pace.base.comm.PafViewTreeItem;
import com.pace.base.db.cellnotes.SimpleCellNote;
import com.pace.base.mdb.PafSimpleDimTree;

/**
 * Used to send a plan session response back to the client after a client starts a planning session.
 *
 * @version	1.01
 * @author JWatkins
 *
 */
public class PafPlanSessionResponse {
	
    private PafWorkSpec[] workSpec = null;
    private PafSimpleDimTree[] dimTrees = null;
    private PafClientCacheBlock clientCacheBlock = new PafClientCacheBlock();
    private String planningVersion;    
    private PafViewTreeItem[] viewTreeItems;
    private CustomMenuDef[] customMenuDefs;
    private String defaultRuleSetName;
    private String[] ruleSetList;
    private boolean replicateEnabled;
    private boolean replicateAllEnabled;

    
	public PafPlanSessionResponse() {}

    /**
     * @return Returns the workSpec.
     */
    public PafWorkSpec[] getWorkSpec() {
        return workSpec;
    }

    /**
     * @param workSpec The workSpec to set.
     */
    public void setWorkSpec(PafWorkSpec[] workSpec) {
        this.workSpec = workSpec;
    }

    /**
     * @return Returns the dimTrees.
     */
    public PafSimpleDimTree[] getDimTrees() {
        return dimTrees;
    }

    /**
     * @param simpleDimTrees The dimTrees to set.
     */
    public void setDimTrees(PafSimpleDimTree[] simpleDimTrees) {
        this.dimTrees = simpleDimTrees;
    }

    /**
     * @return Returns the clientCacheBlock.
     */
    public PafClientCacheBlock getClientCacheBlock() {
        return clientCacheBlock;
    }

    /**
     * @param clientCacheBlock The clientCacheBlock to set.
     */
    public void setClientCacheBlock(PafClientCacheBlock clientCacheBlock) {
        this.clientCacheBlock = clientCacheBlock;
    }

    /**
     * @return Returns the planningVersion.
     */
	public String getPlanningVersion() {
		return planningVersion;
	}

	/**
     * @param planningVersion The planning version to set.
     */
	public void setPlanningVersion(String planningVersion) {
		this.planningVersion = planningVersion;
	}
	
    /**
     * @return Returns the customMenuDefs.
     */
	public CustomMenuDef[] getCustomMenuDefs() {
		return customMenuDefs;
	}

	/**
     * @param customMenuDefs The custom menu def to set.
     */
	public void setCustomMenuDefs(CustomMenuDef[] customMenuDefs) {
		this.customMenuDefs = customMenuDefs;
	}

    /**
     * @return Returns the viewTreeItems.
     */
	public PafViewTreeItem[] getViewTreeItems() {
		return viewTreeItems;
	}

	/**
     * @param viewTreeItems The view tree items to set.
     */
	public void setViewTreeItems(PafViewTreeItem[] viewTreeItems) {
		this.viewTreeItems = viewTreeItems;
	}

    /**
     * @return Returns the defaultRulesetName.
     */
    public String getDefaultRuleSetName() {
        return defaultRuleSetName;
    }

    /**
     * @param defaultRulesetName The defaultRulesetName to set.
     */
    public void setDefaultRuleSetName(String defaultRulesetName) {
        this.defaultRuleSetName = defaultRulesetName;
    }

    /**
     * @return Returns the ruleSetList.
     */
    public String[] getRuleSetList() {
        return ruleSetList;
    }

    /**
     * @param ruleSetList The ruleSetList to set.
     */
    public void setRuleSetList(String[] ruleSetList) {
        this.ruleSetList = ruleSetList;
    }

	/**
	 * @return the replicateAllEnabled
	 */
	public boolean isReplicateAllEnabled() {
		return replicateAllEnabled;
	}

	/**
	 * @param replicateAllEnabled the replicateAllEnabled to set
	 */
	public void setReplicateAllEnabled(boolean replicateAllEnabled) {
		this.replicateAllEnabled = replicateAllEnabled;
	}

	/**
	 * @return the replicateEnabled
	 */
	public boolean isReplicateEnabled() {
		return replicateEnabled;
	}

	/**
	 * @param replicateEnabled the replicateEnabled to set
	 */
	public void setReplicateEnabled(boolean replicateEnabled) {
		this.replicateEnabled = replicateEnabled;
	}


}
