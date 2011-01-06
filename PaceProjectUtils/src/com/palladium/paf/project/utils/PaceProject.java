/**
 * 
 */
package com.palladium.paf.project.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.palladium.paf.PafException;

/**
 * @author jmilliron
 *
 */
public class PaceProject {
	
	private Map<PaceProjectId, Object> projectObjectMap = new HashMap<PaceProjectId, Object>();
	
	public PaceProject(String importFileDirLocation, PaceProjectType projectType) throws PafException {
		
	}
	
	public PaceProject(String importFileDirLocation, PaceProjectType projectType, Set<PaceProjectId> filterSet) throws PafException {
		
	}
	
	public static List<PaceProjectError> validate(String importFileDirLocation, PaceProjectType projectType) {
		return null;
	}

	public void importXMLProject(String confDir) {
		
	}
	
	public void importXMLProject(String confDir, Set<PaceProjectId> filterSet) {
		
	}
	
	public void importExcelProject(String excelFile) {
		
	}
	
	public void importExcelProject(String excelFile, Set<PaceProjectId> filterSet) {
		
	}
	
	public void exportXMLProject(String confDir) {
		
	}
	
	public void exportXMLProject(String confDir, Set<PaceProjectId> filterSet) {
		
	}
		
	public void exportExcelProject(String excelFile) {
		
	}
	
	public void exportExcelProject(String excelFile, Set<PaceProjectId> filterSet) {
		
	}

}
