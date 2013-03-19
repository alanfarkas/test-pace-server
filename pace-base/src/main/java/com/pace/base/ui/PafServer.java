package com.pace.base.ui;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.Logger;


import com.pace.base.PafBaseConstants;
import com.pace.base.server.ServerPlatform;

public class PafServer implements Comparable, Cloneable {

	private static final String WSDL = "?wsdl";
	private String name;
	private String host;
	private Integer port;
	private String homeDirectory;
	private boolean defaultServer; 
	private String webappName;
	private String wsdlServiceName;
	private Long urlTimeoutInMilliseconds;
	private transient Long serviceConnectionTimeoutInMilliseconds;
	private transient Long serviceReceiveTimeoutInMilliseconds;
	private String startupFile;
	private String shutdownFile;
	private Integer jndiPort;
	private Long serverStartupTimeoutInMilliseconds;
	private boolean doesNotPromptOnHotDeploy;
	private boolean doesNotPromptOnHotRefresh;
	private boolean https;
	private String osServiceName;
	private Integer jmsMessagingPort;
	private ServerPlatform serverPlatform;
		
	private static final Logger logger = Logger
			.getLogger(PafServer.class);
	public PafServer() {		
	}
	
	public PafServer(String name, String host, Integer port) {
		
		this(name, host, port, null, false);
				
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
		this.https = false;
		
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
	
	private String getCompleteAppUrl() {
		
		StringBuilder sb = new StringBuilder();
		
		if(https){
			sb.append("https");
		} else {
			sb.append("http");
		}
		
		sb.append("://" + host + ":" + port + "/" + webappName);
		
		return sb.toString();
	}
	
	public String getCompleteServerSettingsUrl() {
		
		StringBuilder sb = new StringBuilder(getCompleteAppUrl());		
		
		sb.append("/");
		sb.append(PafBaseConstants.PACE_SERVER_SETTINGS_CONTEXT_NAME);
		
		return sb.toString();
	}

	public String getCompleteWSDLService() {

		StringBuilder sb = new StringBuilder(getCompleteAppUrl());				
		
		if ( wsdlServiceName != null ) {
			if( ! wsdlServiceName.equals(WSDL)) {
				sb.append("/");
			} 
		
			sb.append(wsdlServiceName);
		
			if (! wsdlServiceName.endsWith(WSDL)) {
				sb.append(WSDL);
			}
		}
		
		return sb.toString();
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

	public void setHttps(boolean https) {
		this.https = https;
	}

	public boolean isHttps() {
		return https;
	}

	public String getOsServiceName() {
		return osServiceName;
	}

	public void setOsServiceName(String osServiceName) {
		this.osServiceName = osServiceName;
	}

	public Integer getJmsMessagingPort() {
		return jmsMessagingPort;
	}

	public void setJmsMessagingPort(Integer jmsMessagingPort) {
		this.jmsMessagingPort = jmsMessagingPort;
	}
			

	/**
	 * @return the serviceConnectionTimeoutInMilliseconds
	 */
	public Long getServiceConnectionTimeoutInMilliseconds() {
		return serviceConnectionTimeoutInMilliseconds;
	}

	/**
	 * @param serviceConnectionTimeoutInMilliseconds the serviceConnectionTimeoutInMilliseconds to set
	 */
	public void setServiceConnectionTimeoutInMilliseconds(
			Long serviceConnectionTimeoutInMilliseconds) {
		this.serviceConnectionTimeoutInMilliseconds = serviceConnectionTimeoutInMilliseconds;
	}

	/**
	 * @return the serviceReceieveTimeoutInMilliseconds
	 */
	public Long getServiceReceiveTimeoutInMilliseconds() {
		return serviceReceiveTimeoutInMilliseconds;
	}

	/**
	 * @param serviceReceieveTimeoutInMilliseconds the serviceReceieveTimeoutInMilliseconds to set
	 */
	public void setServiceReceiveTimeoutInMilliseconds(
			Long serviceReceiveTimeoutInMilliseconds) {
		this.serviceReceiveTimeoutInMilliseconds = serviceReceiveTimeoutInMilliseconds;
	}
	
	public ServerPlatform getServerPlatform() {
		return serverPlatform;
	}

	public void setServerPlatform(ServerPlatform serverPlatform) {
		this.serverPlatform = serverPlatform;
	}




	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PafServer [name=" + name + ", host=" + host + ", port=" + port
				+ ", homeDirectory=" + homeDirectory + ", defaultServer="
				+ defaultServer + ", webappName=" + webappName
				+ ", wsdlServiceName=" + wsdlServiceName
				+ ", urlTimeoutInMilliseconds=" + urlTimeoutInMilliseconds
				+ ", startupFile=" + startupFile + ", shutdownFile="
				+ shutdownFile + ", jndiPort=" + jndiPort
				+ ", serverStartupTimeoutInMilliseconds="
				+ serverStartupTimeoutInMilliseconds
				+ ", doesNotPromptOnHotDeploy=" + doesNotPromptOnHotDeploy
				+ ", doesNotPromptOnHotRefresh=" + doesNotPromptOnHotRefresh
				+ ", https=" + https + ", osServiceName=" + osServiceName
				+ ", jmsMessagingPort=" + jmsMessagingPort 
				+ ", serviceConnectionTimeoutInMilliseconds=" + serviceConnectionTimeoutInMilliseconds
				+ ", serviceReceiveTimeoutInMilliseconds=" + serviceReceiveTimeoutInMilliseconds
				+ ", serverPlatform=" + serverPlatform + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PafServer other = (PafServer) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	public  boolean isServerRunning(PafServer server,int urlTimeoutInMilliseconds) {

		// set default
		boolean isServerRunning = false;
		
		HttpURLConnection httpConnection = null;
		String url = null;
		
		try {
			
			
						
			//try to get pafserver from url
			
			url = server.getCompleteWSDLService();         
			//cast to http connection
			httpConnection = (HttpURLConnection) new URL(url).openConnection();
			
			httpConnection.setRequestMethod("GET");
			
		
			//if paf server exists
			if ( server != null ) {
			
				//if pafserver has specified url timeout
				if ( server.getUrlTimeoutInMilliseconds() != null ) {
				
					//try to convert into an int, catch runtime if problem and ignore
					try {
						
						urlTimeoutInMilliseconds = server.getUrlTimeoutInMilliseconds().intValue();
						
					} catch (RuntimeException re) {
						
						logger.error("There was a problem coverting " + server.getUrlTimeoutInMilliseconds() + " to an integer.");
						
					}
					
				}            	
			}
			  
		if ( logger.isDebugEnabled()) {
						logger.debug("Setting connection timeout to " + urlTimeoutInMilliseconds + " for url " + url);
			}
		
			//set timeout
			httpConnection.setConnectTimeout(urlTimeoutInMilliseconds);	
			
			//if successful http status, server/app is running
			if (httpConnection.getResponseCode() == HttpURLConnection.HTTP_OK ) {
				
				isServerRunning = true;
				logger.info("Successfully connected to url '" + url +"'");
				
			} else {
				
				logger.info("Couldn't connect to url '" + url +"'");
				
			}                                    
                        
		} catch (MalformedURLException e) {
			logger.error("MalformedURLException: " + e.getMessage());
		} catch (IOException e) {
			logger.warn("URL IOException: " + e.getMessage());
		}  finally {
			
			if ( httpConnection != null ) {
			  logger.debug("About to disconnect from url: " + url);
          	  httpConnection.disconnect();
          	  logger.debug("Successfully disconnected from url: " + url);
            }
			
		}
		
		// log info
		logger.info("URL: '" + url + "' is alive: " + isServerRunning); //$NON-NLS-1$ //$NON-NLS-2$

		// return true if server is running or false if not.
		return isServerRunning;
	}
	
}
