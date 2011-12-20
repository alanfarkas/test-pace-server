package com.pace.settings.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pace.base.PafConfigFileNotFoundException;
import com.pace.base.misc.KeyValue;
import com.pace.base.utility.PafXStream;
import com.pace.server.PafLDAPSettings;
import com.pace.server.PafMetaData;
import com.pace.server.ServerSettings;

/**
 * Pace Settings Data Service.  Wraps XStream functionality.  Read/writes setting file to/from disk.
 * 
 * @author JMilliron
 *
 */
public class PaceSettingsDataService {

	private static String serverSettingsFile = PafMetaData.getConfigServerDirPath()  + "paceServerSettings.xml";
	private static String ldapSettingsFile = PafMetaData.getConfigServerDirPath()  + "paceLDAPSettings.xml";
	
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
				
		if ( ss != null ) {
			
			PafXStream.exportObjectToXml(ss, serverSettingsFile);
			
		}
		
	}
	
	public static PafLDAPSettings getLDAPSettings() throws PafConfigFileNotFoundException {
		
		PafLDAPSettings ldapSettings = (PafLDAPSettings) PafXStream.importObjectFromXml(ldapSettingsFile);
		
		if ( ldapSettings != null && ldapSettings.getNetBiosNames() != null ) {
			
			List<KeyValue> keyValueList = new ArrayList<KeyValue>();
			
			for (String key : ldapSettings.getNetBiosNames().keySet()) {
											
				keyValueList.add(new KeyValue(key, ldapSettings.getNetBiosNames().get(key)));
				
			}
			
			ldapSettings.setNetBiosNamesList(keyValueList);
			
		}
				
		return ldapSettings;
		
	}
	
	public static void setLDAPSettings(PafLDAPSettings ldapSettings) {
		
		if ( ldapSettings != null ) {

			if ( ldapSettings.getNetBiosNamesList() != null && ldapSettings.getNetBiosNamesList().size() > 0 ) {
				
				Map<String, String> netBiosNameMap = new HashMap<String, String>();
				
				for (KeyValue kv : ldapSettings.getNetBiosNamesList() ) {
					
					netBiosNameMap.put(kv.getKey(), kv.getValue());
					
				}
				
				ldapSettings.setNetBiosNames(netBiosNameMap);
				ldapSettings.setNetBiosNamesList(null);
				
			} else {
				
				ldapSettings.setNetBiosNames(null);
			}
			
			PafXStream.exportObjectToXml(ldapSettings, ldapSettingsFile);
		
		}
		
	}
	
	public static void main(String[] args) {
		
		ServerSettings ss = PafMetaData.getServerSettings();
		
		//setServerSettings(ss);
		
		
		PafXStream.exportObjectToXml(ss.getLdapSettings(), ldapSettingsFile);
		
	}
	
	
}
