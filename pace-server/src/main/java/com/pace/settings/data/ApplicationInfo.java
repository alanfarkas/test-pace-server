package com.pace.settings.data;

import com.pace.base.RunningState;

public class ApplicationInfo {
	
	private String appId;
	private String datasourceId;
	private RunningState appState;
	
	/**
	 * 
	 * @param pafAppDef
	 * @return
	 */
	public ApplicationInfo(String appId, String datasourceId, RunningState appState) {
		this.appId = appId;
		this.datasourceId = datasourceId;
		this.appState = appState;
	}

	/**
	 * @return the appId
	 */
	public String getAppId() {
		return appId;
	}

	/**
	 * @param appId the appId to set
	 */
	public void setAppId(String appId) {
		this.appId = appId;
	}

	/**
	 * @return the datasourceId
	 */
	public String getDatasourceId() {
		return datasourceId;
	}

	/**
	 * @param datasourceId the datasourceId to set
	 */
	public void setDatasourceId(String datasourceId) {
		this.datasourceId = datasourceId;
	}

	/**
	 * @return the appState
	 */
	public RunningState getAppState() {
		return appState;
	}

	/**
	 * @param appState the appState to set
	 */
	public void setAppState(RunningState appState) {
		this.appState = appState;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ApplicationInfo [appId=" + appId + ", datasourceId="
				+ datasourceId + ", appState=" + appState + "]";
	}
	

}
