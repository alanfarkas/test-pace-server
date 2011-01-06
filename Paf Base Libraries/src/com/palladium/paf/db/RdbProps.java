/**
 * 
 */
package com.palladium.paf.db;

import java.util.List;
import java.util.Properties;

/**
 * @author JWatkins
 *
 */
public class RdbProps {
	Properties hibernateProperties;
	List<String> mappingResources;
	public Properties getHibernateProperties() {
		return hibernateProperties;
	}
	public void setHibernateProperties(Properties hibernateProperties) {
		this.hibernateProperties = hibernateProperties;
	}
	public List<String> getMappingResources() {
		return mappingResources;
	}
	public void setMappingResources(List<String> mappingResources) {
		this.mappingResources = mappingResources;
	}
	

}
