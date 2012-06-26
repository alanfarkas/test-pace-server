package com.pace.settings.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.pace.base.PafConfigFileNotFoundException;
import com.pace.base.db.RdbProps;
import com.pace.base.mdb.PafConnectionProps;
import com.pace.base.misc.KeyValue;
import com.pace.base.server.PafLDAPSettings;
import com.pace.base.server.ServerSettings;
import com.pace.base.utility.PafXStream;
import com.pace.server.PafServerConstants;

/**
 * Pace Settings Data Service.  Wraps XStream functionality.  Read/writes setting file to/from disk.
 * 
 * @author JMilliron
 *
 */
public class PaceSettingsDataService {

	/**
	 * @return the serverSettingsFile
	 */
	public static String getServerSettingsFile() {
		return PafServerConstants.SERVER_SETTINGS_FILE;
	}

	public static ServerSettings getServerSettings() throws PafConfigFileNotFoundException {
		
		return (ServerSettings) PafXStream.importObjectFromXml(PafServerConstants.SERVER_SETTINGS_FILE);
		
	}
	
	public static void setServerSettings(ServerSettings ss) {
				
		if ( ss != null ) {
			
			PafXStream.exportObjectToXml(ss, PafServerConstants.SERVER_SETTINGS_FILE);
			
		}
		
	}
	
	public static PafLDAPSettings getLDAPSettings() throws PafConfigFileNotFoundException {
		
		PafLDAPSettings ldapSettings = (PafLDAPSettings) PafXStream.importObjectFromXml(PafServerConstants.LDAP_SETTINGS_FILE);
		
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
			
			PafXStream.exportObjectToXml(ldapSettings, PafServerConstants.LDAP_SETTINGS_FILE);
		
		}
		
	}
	
	/**
	 * MDB Datasources file
	 * 
	 * @param mdbDataSources
	 */
	public static void setMDBDatasources(List<PafConnectionProps> mdbDataSources) {
		
		if ( mdbDataSources != null ) {
									
			PafXStream.exportObjectToXml(mdbDataSources, PafServerConstants.MDB_DATASOURCES_FILE);
		}
		
	}
	
	/**
	 * Reads MDB Datasources file
	 * 
	 * @return List of mdb connection properties
	 * @throws PafConfigFileNotFoundException
	 */
	public static List<PafConnectionProps> getMDBDatasources() throws PafConfigFileNotFoundException {
		
		return (List<PafConnectionProps>) PafXStream.importObjectFromXml(PafServerConstants.MDB_DATASOURCES_FILE);
		
	}
	
	/**
	 * Writes RDB Datasources file
	 * 
	 * @param rdbDataSources
	 */
	public static void setRDBDatasources(List<RdbProps> rdbDataSources) {
		
		if ( rdbDataSources != null ) {
			
			for (RdbProps rdbProps : rdbDataSources ) {
				
				Properties props = new Properties();
				
				if ( rdbProps.getHibernatePropertyList() != null ) {
					
					for ( KeyValue kv : rdbProps.getHibernatePropertyList()) {
						
						props.put(kv.getKey(), kv.getValue());
						
					}
					
					//rdbProps.setHibernatePropertyList(null);
					rdbProps.setHibernateProperties(props);
					
				}
				
			}
									
			PafXStream.exportObjectToXml(rdbDataSources, PafServerConstants.RDB_DATASOURCES_FILE);
		}
		
	}
	
	/**
	 * Reads RDB Datasources file
	 * 
	 * @return List of rdb connection properties
	 * @throws PafConfigFileNotFoundException
	 */
	public static List<RdbProps> getRDBDatasources() throws PafConfigFileNotFoundException {
		
		List<RdbProps> rdbDatasourceList = (List<RdbProps>) PafXStream.importObjectFromXml(PafServerConstants.RDB_DATASOURCES_FILE);
		
		if ( rdbDatasourceList != null ) {
			
			for ( RdbProps rdbProps : rdbDatasourceList ) {
				
				if ( rdbProps != null && rdbProps.getHibernateProperties() != null ) {
					
					for ( Object objKey : rdbProps.getHibernateProperties().keySet()) {
						
						Object objValue = rdbProps.getHibernateProperties().get(objKey);
						
						rdbProps.getHibernatePropertyList().add(new KeyValue(objKey.toString(), objValue.toString()));
						
					}
					
										
				}
				
				
			}
			
			
		}
		
		return rdbDatasourceList;
		
	}
	
	public static void main(String[] args) {
		
		//ServerSettings ss = PafMetaData.getServerSettings();
		
		//Map<String, PafConnectionProps> mdbConnectionPropMap = PafMetaData.getMDBSettings();
	
		
		/*List<PafConnectionProps> list = new ArrayList<PafConnectionProps>();
		
		PafConnectionProps prop1 = new PafConnectionProps();
		prop1.setName("Titan");
		prop1.setConnectionString("EDSDomain=Essbase;EDSUrl=http://localhost:13080/aps/JAPI;Server=localhost;User=admin;Password=password;Application=Titan;Database=Titan");
		prop1.setDataServiceProvider("com.pace.mdb.essbase.EsbData");
		prop1.setMetaDataServiceProvider("com.pace.mdb.essbase.EsbMetaData");
		prop1.setProperties(null);
		
		list.add(prop1);
		
		PafXStream.exportObjectToXml(list, mdbDataSourcesFile);
		*/
		//setServerSettings(ss);
		
		
		//PafXStream.exportObjectToXml(ss.getLdapSettings(), ldapSettingsFile);
		
		//setRDBDatasources(PafMetaData.getRDBProps());
		
	}
	
	
}
