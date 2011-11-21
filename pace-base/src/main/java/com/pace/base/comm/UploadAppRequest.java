package com.pace.base.comm;

import java.util.Set;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;

import com.pace.base.project.ProjectElementId;

@XmlType
public class UploadAppRequest extends PafRequest {
	
	private String appId;
	
	private DataHandler paceProjectDataHandler;
	
	private boolean applyConfigurationUpdate;
	
	private boolean applyCubeUpdate;
	
	private Set<ProjectElementId> projectElementIdFilters;
	
	//when set, will not delete views, view sections and rule sets before writing.  this is
	//important to deploy individual artifacts like a view without wiping the views dir.
	private boolean partialDeployment;
	
	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public DataHandler getPaceProjectDataHandler() {
		return paceProjectDataHandler;
	}

	@XmlMimeType("application/octet-stream") 
	public void setPaceProjectDataHandler(DataHandler paceProjectDataHandler) {
		this.paceProjectDataHandler = paceProjectDataHandler;
	}

	public boolean isApplyConfigurationUpdate() {
		return applyConfigurationUpdate;
	}

	public void setApplyConfigurationUpdate(boolean applyConfigurationUpdate) {
		this.applyConfigurationUpdate = applyConfigurationUpdate;
	}

	public boolean isApplyCubeUpdate() {
		return applyCubeUpdate;
	}

	public void setApplyCubeUpdate(boolean applyCubeUpdate) {
		this.applyCubeUpdate = applyCubeUpdate;
	}

	public Set<ProjectElementId> getProjectElementIdFilters() {
		return projectElementIdFilters;
	}

	public void setProjectElementIdFilters(
			Set<ProjectElementId> projectElementIdFilters) {
		this.projectElementIdFilters = projectElementIdFilters;
	}

	public boolean isPartialDeployment() {
		return partialDeployment;
	}

	public void setPartialDeployment(boolean partialDeployment) {
		this.partialDeployment = partialDeployment;
	}

	
	

}
