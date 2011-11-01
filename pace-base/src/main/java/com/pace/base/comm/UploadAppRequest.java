package com.pace.base.comm;

import java.util.ArrayList;
import java.util.List;

import com.pace.base.project.PaceProject;


public class UploadAppRequest extends PafRequest {
	private List<PaceProject> applicationProjects = new ArrayList<PaceProject>();
	private boolean applyConfigurationUpdate;
	private boolean applyCubeUpdate;

	
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


	public List<PaceProject> getApplicationProjects() {
		return applicationProjects;
	}

	public void setApplicationProjects(List<PaceProject> applicationProjects) {
		this.applicationProjects = applicationProjects;
	}
}
