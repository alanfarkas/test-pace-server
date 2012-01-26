package com.pace.base.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

import com.pace.base.project.InvalidPaceProjectInputException;
import com.pace.base.project.PaceProjectCreationException;
import com.pace.base.project.ProjectElementId;
import com.pace.base.project.ProjectSaveException;
import com.pace.base.project.XMLPaceProject;


public class PrintStyles implements IPafMapModelManager {

	private static Logger logger = Logger.getLogger(PrintStyles.class);
	protected Map<String, PrintStyle> printStyles = null;
	protected String projectFolder;
	public PrintStyles() {
		// TODO Auto-generated constructor stub
		super();
	}

	public PrintStyles(String projectFolder) {
		// TODO Auto-generated constructor stub
		this.projectFolder = projectFolder;
		load();
	}
	
	@Override
	public void load() {
		// TODO Auto-generated method stub
		try {
			XMLPaceProject pp = null;
				pp = new XMLPaceProject(
						projectFolder, 
						new HashSet<ProjectElementId>(Arrays.asList(ProjectElementId.PrintStyles)),
								false); //set upgradeProject flag to true
				printStyles = pp.getPrintStyles();
		} catch (Exception ex) { 
			logger.error(ex.getMessage()); 
		}
		
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		try {
			XMLPaceProject pp = new XMLPaceProject(
					projectFolder, 
					new HashSet<ProjectElementId>(Arrays.asList(ProjectElementId.PrintStyles)),
							false);
			pp.setPrintStyles(printStyles);
			pp.save(ProjectElementId.PrintStyles);
		} catch (InvalidPaceProjectInputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PaceProjectCreationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ProjectSaveException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	@Override
	public void add(String guid, Object object) {
		// TODO Auto-generated method stub
		if( printStyles != null ) {
			printStyles.put(guid, (PrintStyle) object);
		}
	}

	@Override
	public void remove(String guid) {
		// TODO Auto-generated method stub
		if (printStyles != null  && printStyles.containsKey(guid)) {
			logger.debug("Removing guid: " + guid + " from model");
			printStyles.remove(guid);
		} else {
			logger.debug("Can't remove guid: " + guid
					+ " from model because view does not exists.");
		}
		
	}

	@Override
	public String[] getKeys() {
		// TODO Auto-generated method stub
		String[] guids = null;
		
		if ( printStyles != null ) {
			
			guids = new String[printStyles.keySet().size()];
	
			int i = 0;
	
			for (Object guid : printStyles.keySet()) {
				guids[i++] = (String) guid;
			}

		}
		return guids;
	}

	@Override
	public Object getItem(String guid) {
		// TODO Auto-generated method stub
		if( printStyles != null ) {
			return printStyles.get(guid);
		}
		return null;
	}

	@Override
	public int getIndex(String guid) {
		// TODO Auto-generated method stub
		int index = 0;

		if( printStyles != null ) {
			for (Object guidValue : printStyles.keySet()) {
				if (guidValue.equals(guid)) {
					break;
				} else {
					index++;
				}
			}
		}
		return index;
	}

	@Override
	public boolean contains(String guid) {
		// TODO Auto-generated method stub
		if( printStyles != null ) {
			return printStyles.containsKey(guid);
		}
		return false;
	}

	@Override
	public void replace(String guid, Object object) {
		// TODO Auto-generated method stub
		if ( printStyles != null &&  printStyles.containsKey(guid)) {
			printStyles.put(guid, (PrintStyle) object);
			
		}		
	}

	public Set<String> getKeySet() {
		
		Set<String> guidSet = new HashSet<String>();
		
		if ( printStyles != null ) {
			
			guidSet = printStyles.keySet();
			
		}
		
		return guidSet;
		
	}

	public Map<String, PrintStyle> getPrintStyles() {
		return this.printStyles;
	}

	public void setPrintStyles(Map<String, PrintStyle> printStyles) {
		this.printStyles = printStyles;
	}
	
	public boolean isEmpty() {
		if ( printStyles != null && printStyles.size() > 0 ) {
			return false;
		}		
		return true;
	}
	
	public String[] getSortedKeys() {
		String[] sortedKeys = this.getKeys();
		if ( sortedKeys != null ) {
			Arrays.sort(sortedKeys);
		}
		return sortedKeys;
	}

	public boolean containsIgnoreCase(String arg0) {
		if( printStyles != null ) {
			Object[] objAr = printStyles.keySet().toArray();
			if ( objAr != null ) {
				for (Object obj : objAr) {
					if ( obj instanceof String) {
						String guid = (String) obj;
						if ( guid.equalsIgnoreCase(arg0)) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}
	
	@Override
	public int size() {
		if (printStyles != null ) {
			return printStyles.size();
		}
		return 0;
	}
	
	public String[] getNames(boolean withDefaultMarker) {
		return null; //need to be overriden by derived class
	}
	
	public PrintStyle getPrintStyleByGUID( String guid ) {
		return (PrintStyle)printStyles.get(guid);
	}
	
	public String getNameByGUID( String guid ) {
		return getPrintStyleByGUID(guid).getName();
	}
	
	public String getGUIDByName( String name ) {
		return getPrintStyleByName(name).getGUID();
	}

	public String getProjectFolder() {
		return this.projectFolder;
	}

	public void setProjectFolder(String projectFolder) {
		this.projectFolder = projectFolder;
	}
	
	public boolean isPrintStyleDefaultPrintStyleGivenGUID( String guid ) {
		PrintStyle printStyle = (PrintStyle)getItem(guid);
		if( printStyle.getDefaultStyle() )
			return true;
		return false;
	}

	public boolean isPrintStyleDefaultPrintStyleGivenName( String name ) {
		PrintStyle printStyle = getPrintStyleByName(name);
		if( printStyle.getDefaultStyle() )
			return true;
		return false;
	}
	
	public Boolean findDefaultPrintStyle() {
		//check if any default print style exists
		for (String guid : getKeys()) {
			if ( ((PrintStyle) printStyles.get(guid)).getDefaultStyle() ) {
				return true;
			} 
		}
		return false;
	}

	public PrintStyle getDefaultPrintStyle() {
		for (String guid : getKeys()) {
			PrintStyle printStyle = (PrintStyle) printStyles.get(guid);
			if ( printStyle.getDefaultStyle() ) {
				return printStyle;
			} 
		}
		return null;
	}
	
	public void setDefaultPrintStyle(String name, boolean setDefault) {
		String guid = getGUIDByName(name);
		if (printStyles != null && printStyles.containsKey(guid) && setDefault) {

			//unset all of print styles
			unsetDefaultPrintStyle();
			
			//set new default
			((PrintStyle) printStyles.get(guid)).setDefaultStyle(true);		
			
		//if not setting default, just turn it off
		} else if (! setDefault ) {
			//unset default print style
			((PrintStyle) printStyles.get(guid)).setDefaultStyle(false);		
		}
		save();
	}
	
	private void unsetDefaultPrintStyle() {
		
		if( printStyles != null ) {
			//disable old default
			for (String guid : getKeys()) {
				
				if ( ((PrintStyle) printStyles.get(guid)).getDefaultStyle()) {
					
					((PrintStyle) printStyles.get(guid)).setDefaultStyle(false);	
					break;
				} 
				
			}
		}
	}
	
	public void renamePrintStyle(String oldPrintStyleName, String newPrintStyleName) {
		if( printStyles != null ) {
			for (String guid : getKeys()) {			
				if ( guid instanceof String ) {
					//if the current key == the old view name.
					String name = getNameByGUID(guid);
					if ( name.equalsIgnoreCase(oldPrintStyleName) ) {
						//get a temporary PafAdminConsoleView object for the current key 
						PrintStyle printStyle = (PrintStyle) printStyles.get(guid);
						//set the new name.
						printStyle.setName(newPrintStyleName);
						//remove old object from map and put the new one in.
						remove(guid);
						//new the temporary object in the map.
						printStyles.put(guid, printStyle);
					} 
				}		
			}
			save();
			load();
		}
	}

	public PrintStyle getPrintStyleByName( String name ) {
		if( printStyles != null ) {
			for (String guid : getKeys()) {
				PrintStyle printStyle = (PrintStyle) printStyles.get(guid);
				if ( printStyle.getName().equalsIgnoreCase(name)) {
					return printStyle;
				} 
			}
		}
		return null;
	}
	
	public boolean findDulicatePrintStyleName(String name) {
	    ArrayList<String> printStyleNames = new ArrayList<String>(Arrays.asList(getNames(false))); 
		if( printStyleNames.contains(name))
			return true;
		return false;
	}
	
	public PrintStyle findDuplicatePrintStyle( PrintStyle printStyleSource ) {
		if( printStyles != null ) {
			for (String guid : getKeys()) {
				PrintStyle printStyle = (PrintStyle) printStyles.get(guid);
				if ( ! printStyle.getGUID().equals(printStyleSource.getGUID()) 
						&& printStyle.getName().equalsIgnoreCase(printStyleSource.getName())) {
					return printStyle;
				} 
			}
		}
		return null;
	}
	
}
