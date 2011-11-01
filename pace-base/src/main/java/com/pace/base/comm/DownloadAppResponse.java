package com.pace.base.comm;

import java.util.ArrayList;
import java.util.List;

import com.pace.base.project.PaceProject;

public class DownloadAppResponse extends PafSuccessResponse {
	private List<PaceProject> applicationProjects = new ArrayList<PaceProject>();

	public List<PaceProject> getApplicationProjects() {
		return applicationProjects;
	}

	public void setApplicationProjects(List<PaceProject> applicationProjects) {
		this.applicationProjects = applicationProjects;
	}

}
