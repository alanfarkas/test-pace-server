package com.pace.settings.data;

import java.io.File;

import com.pace.base.PafBaseConstants;
import com.pace.base.PafConfigFileNotFoundException;
import com.pace.base.utility.PafXStream;
import com.pace.server.PafMetaData;
import com.pace.server.ServerSettings;

/**
 * Pace Settings Data Service.  Wraps XStream functionality.  Read/writes setting file to/from disk.
 * 
 * @author JMilliron
 *
 */
public class PaceSettingsDataService {

	private static String serverSettingsFile = PafMetaData.getServerConfDirPath() + ".." + File.separator + PafBaseConstants.DN_ConfServerFldr + File.separator + "paceServerSettings.xml";
	
	/**
	 * @return the serverSettingsFile
	 */
	public static String getServerSettingsFile() {
		return serverSettingsFile;
	}

	public static ServerSettings getServerSettings() throws PafConfigFileNotFoundException {
		
		return (ServerSettings) PafXStream.importObjectFromXml(serverSettingsFile);
		
	}
	
	public static void setServerSettings(ServerSettings ss) {
				
		PafXStream.exportObjectToXml(ss, serverSettingsFile);		
		
	}
	
	public static void main(String[] args) {
		
		ServerSettings ss = PafMetaData.getServerSettings();
		
		setServerSettings(ss);
		
	}
	
	
}
