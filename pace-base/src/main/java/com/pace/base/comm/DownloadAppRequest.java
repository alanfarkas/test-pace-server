package com.pace.base.comm;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.pace.base.project.ProjectElementId;

/**
 * Download Application Request.  
 * 
 * @author JMilliron
 *
 */
public class DownloadAppRequest extends PafRequest {
	
	private List<String> appIds = new ArrayList<String>();
	
	private Set<ProjectElementId> projectElementIdFilters;

	public List<String> getAppIds() {
		return appIds;
	}

	public void setAppIds(List<String> appIds) {
		this.appIds = appIds;
	}

	public Set<ProjectElementId> getProjectElementIdFilters() {
		return projectElementIdFilters;
	}

	public void setProjectElementIdFilters(
			Set<ProjectElementId> projectElementIdFilters) {
		this.projectElementIdFilters = projectElementIdFilters;
	}

	
}
