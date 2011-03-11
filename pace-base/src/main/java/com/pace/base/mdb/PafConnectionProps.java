package com.pace.base.mdb;

import java.util.Properties;


public class PafConnectionProps implements IPafConnectionProps {
    String connString;
    Properties properties;
    String metaDataServiceProvider;
    String dataServiceProvider;
    String mdbClassLoader;

    public PafConnectionProps() {
    }
    
    public void setConnectionString(String connString) {
        this.connString = connString;
        this.properties = parseConnString(connString); 
    }

    public Properties getProperties() {
        return properties;
    }
    
    /**
     * For testing purposes only
     * 
     * @param properties
     */
    protected void setProperties(Properties properties) {
        this.properties = properties; 
    }

    private static Properties parseConnString(String str) {
        Properties p = new Properties();
        String[] terms = str.split(";");
        String[] kvPair;
        for (String term : terms) {
            kvPair = term.split("=");
            if (kvPair.length != 2) throw new IllegalArgumentException ("Invalid Connection String Term: " + term + " in: " + str);
            p.put(kvPair[0].toUpperCase(), kvPair[1]);
        }
        return p;
    }

    /**
     * @return Returns the dataServiceProvider.
     */
    public String getDataServiceProvider() {
        return dataServiceProvider;
    }

    /**
     * @param dataServiceProvider The dataServiceProvider to set.
     */
    public void setDataServiceProvider(String dataServiceProvider) {
        this.dataServiceProvider = dataServiceProvider;
    }

    /**
     * @return Returns the metaDataServiceProvider.
     */
    public String getMetaDataServiceProvider() {
        return metaDataServiceProvider;
    }

    /**
     * @param metaDataServiceProvider The metaDataServiceProvider to set.
     */
    public void setMetaDataServiceProvider(String metaDataServiceProvider) {
        this.metaDataServiceProvider = metaDataServiceProvider;
    }

    /**
	 * @return the mdbClassLoader
	 */
	public String getMdbClassLoader() {
		return mdbClassLoader;
	}

	/**
	 * @param mdbClassLoader the mdbClassLoader to set
	 */
	public void setMdbClassLoader(String mdbClassLoader) {
		this.mdbClassLoader = mdbClassLoader;
	}

}
