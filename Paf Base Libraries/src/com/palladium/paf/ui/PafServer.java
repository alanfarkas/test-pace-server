package com.palladium.paf.ui;

import java.io.File;

public class PafServer implements Comparable, Cloneable {

	private String name;
	private String host;
	private Integer port;
	private String homeDirectory;
	private boolean defaultServer; 
	private String webappName;
	private String wsdlServiceName;
	private Long urlTimeoutInMilliseconds;
	private String startupFile;
	private String shutdownFile;
	private Integer jndiPort;
	private Long serverStartupTimeoutInMilliseconds;
	private boolean doesNotPromptOnHotDeploy;
	private boolean doesNotPromptOnHotRefresh;
		

	public PafServer() {		
	}
	
	public PafServer(String name, String host, Integer port, String homeDirectory) {
		
		this(name, host, port, homeDirectory, false);
				
	}
	
	public PafServer(String name, String host, Integer port, String homeDirectory, boolean defaultServer) {
		
		this.name = name;
		this.host = host;
		this.port = port;
		this.homeDirectory = homeDirectory;
		this.defaultServer = defaultServer;
		
	}

	public String getHomeDirectory() {
		
		//if not null and doesn't end with file sep
		if (homeDirectory != null && ! homeDirectory.endsWith(File.separator) ) {
			
			//append file sep
			homeDirectory += File.separator;
			
		}
		
		return homeDirectory;
	}

	public void setHomeDirectory(String homeDirectory) {
		this.homeDirectory = homeDirectory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public int compareTo(Object o) {
		
		PafServer otherServer = (PafServer) o;
		
		int outcome = 0;
		
		if ( otherServer.getName() != null && this.name != null) {
			outcome = this.name.compareTo(otherServer.getName());			
		}
		
		return outcome;
	}
	
	/**
	 * @return Returns the host.
	 */
	public String getHost() {
		return host;
	}

	/**
	 * @param host The host to set.
	 */
	public void setHost(String host) {
		this.host = host;
	}

	/**
	 * @return Returns the defaultServer.
	 */
	public boolean isDefaultServer() {
		return defaultServer;
	}

	/**
	 * @param defaultServer The defaultServer to set.
	 */
	public void setDefaultServer(boolean defaultServer) {
		this.defaultServer = defaultServer;
	}

	/**
	 * @return Returns the webappName.
	 */
	public String getWebappName() {
		return webappName;
	}

	/**
	 * @param webappName The webappName to set.
	 */
	public void setWebappName(String webappName) {
		this.webappName = webappName;
	}

	/**
	 * @return Returns the wsdlServiceName.
	 */
	public String getWsdlServiceName() {
		return wsdlServiceName;
	}

	/**
	 * @param wsdlServiceName The wsdlServiceName to set.
	 */
	public void setWsdlServiceName(String wsdlServiceName) {
		this.wsdlServiceName = wsdlServiceName;
	}

	public String getCompleteWSDLService() {
		 
		return "http://" + host + ":" + port + "/" + webappName + "/" + wsdlServiceName;
	}

	/**
	 * @return Returns the jndiPort.
	 */
	public Integer getJndiPort() {
		return jndiPort;
	}

	/**
	 * @param jndiPort The jndiPort to set.
	 */
	public void setJndiPort(Integer jndiPort) {
		this.jndiPort = jndiPort;
	}

	/**
	 * @return Returns the shutdownFile.
	 */
	public String getShutdownFile() {
		return shutdownFile;
	}

	/**
	 * @param shutdownFile The shutdownFile to set.
	 */
	public void setShutdownFile(String shutdownFile) {
		this.shutdownFile = shutdownFile;
	}

	/**
	 * @return Returns the startupFile.
	 */
	public String getStartupFile() {
		return startupFile;
	}

	/**
	 * @param startupFile The startupFile to set.
	 */
	public void setStartupFile(String startupFile) {
		this.startupFile = startupFile;
	}

	/**
	 * @return Returns the serverStartupTimeoutInMilliseconds.
	 */
	public Long getServerStartupTimeoutInMilliseconds() {
		return serverStartupTimeoutInMilliseconds;
	}

	/**
	 * @param serverStartupTimeoutInMilliseconds The serverStartupTimeoutInMilliseconds to set.
	 */
	public void setServerStartupTimeoutInMilliseconds(
			Long serverStartupTimeoutInMilliseconds) {
		this.serverStartupTimeoutInMilliseconds = serverStartupTimeoutInMilliseconds;
	}

	/**
	 * @return the urlTimeoutInMilliseconds
	 */
	public Long getUrlTimeoutInMilliseconds() {
		return urlTimeoutInMilliseconds;
	}

	/**
	 * @param urlTimeoutInMilliseconds the urlTimeoutInMilliseconds to set
	 */
	public void setUrlTimeoutInMilliseconds(Long urlTimeoutInMilliseconds) {
		this.urlTimeoutInMilliseconds = urlTimeoutInMilliseconds;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	/**
	 * @return the doesNotPromptOnDeploy
	 */
	public boolean isDoesNotPromptOnHotDeploy() {
		return doesNotPromptOnHotDeploy;
	}

	/**
	 * @param doesNotPromptOnDeploy the doesNotPromptOnDeploy to set
	 */
	public void setDoesNotPromptOnHotDeploy(boolean doesNotPromptOnHotDeploy) {
		this.doesNotPromptOnHotDeploy = doesNotPromptOnHotDeploy;
	}

	/**
	 * @return the doesNotPromptOnHotRefresh
	 */
	public boolean isDoesNotPromptOnHotRefresh() {
		return doesNotPromptOnHotRefresh;
	}

	/**
	 * @param doesNotPromptOnHotRefresh the doesNotPromptOnHotRefresh to set
	 */
	public void setDoesNotPromptOnHotRefresh(boolean doesNotPromptOnHotRefresh) {
		this.doesNotPromptOnHotRefresh = doesNotPromptOnHotRefresh;
	}

}
