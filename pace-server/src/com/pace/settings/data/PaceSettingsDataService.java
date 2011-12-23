package com.pace.settings.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pace.base.PafConfigFileNotFoundException;
import com.pace.base.mdb.PafConnectionProps;
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
	private static String rdbDataSourcesFile = PafMetaData.getConfigServerDirPath()  + "paceRDBDataSources.xml";
	private static String mdbDataSourcesFile = PafMetaData.getConfigServerDirPath()  + "paceMDBDataSources.xml";
	
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
	
	/**
	 * MDB Settings file. 
	 * 
	 * @param mdbSettings
	 */
	public static void setMDBSettings(List<PafConnectionProps> mdbSettings) {
		
		if ( mdbSettings != null ) {
									
			PafXStream.exportObjectToXml(mdbSettings, mdbDataSourcesFile);
		}
		
	}
	
	public static List<PafConnectionProps> getMDBSettings() throws PafConfigFileNotFoundException {
		
		return (List<PafConnectionProps>) PafXStream.importObjectFromXml(mdbDataSourcesFile);
		
	}
	
	public static void main(String[] args) {
		
		//ServerSettings ss = PafMetaData.getServerSettings();
		
		//Map<String, PafConnectionProps> mdbConnectionPropMap = PafMetaData.getMDBSettings();
	
		
		List<PafConnectionProps> list = new ArrayList<PafConnectionProps>();
		
		PafConnectionProps prop1 = new PafConnectionProps();
		prop1.setName("Titan");
		prop1.setConnectionString("EDSDomain=Essbase;EDSUrl=http://localhost:13080/aps/JAPI;Server=localhost;User=admin;Password=password;Application=Titan;Database=Titan");
		prop1.setDataServiceProvider("com.pace.mdb.essbase.EsbData");
		prop1.setMetaDataServiceProvider("com.pace.mdb.essbase.EsbMetaData");
		prop1.setProperties(null);
		
		list.add(prop1);
		
		PafXStream.exportObjectToXml(list, mdbDataSourcesFile);
		
		//setServerSettings(ss);
		
		
		//PafXStream.exportObjectToXml(ss.getLdapSettings(), ldapSettingsFile);
		
	}
	
	
}
