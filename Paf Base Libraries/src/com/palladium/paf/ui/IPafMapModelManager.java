/**
 * 
 */
package com.palladium.paf.ui;

/**
 * @author jmilliron
 *
 */
public interface IPafMapModelManager {

	public void add(String key, Object object);
	public void remove(String key);
	public String[] getKeys();
	public Object getItem(String key);
	public int getIndex(String key);
	public void save();
	public void load();
	public int size();
	public boolean contains(String key);
	public void replace(String key, Object object);
}
