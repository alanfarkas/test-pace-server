package com.pace.base.migration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import com.pace.base.PafBaseConstants;
import com.pace.base.funcs.CustomFunctionDef;
import com.pace.base.project.PaceProjectReadException;
import com.pace.base.project.PafXStreamElementItem;
import com.pace.base.project.ProjectElementId;
import com.pace.base.project.ProjectSaveException;
import com.pace.base.project.XMLPaceProject;

public class NewCustomFunctionMigrationAction extends MigrationAction {

	private static final Logger logger = Logger.getLogger(NewCustomFunctionMigrationAction.class);
	private List<CustomFunctionDef> customFunctions =  new ArrayList<CustomFunctionDef>();
	
	public NewCustomFunctionMigrationAction(XMLPaceProject xmlPaceProject) {
		this.xmlPaceProject = xmlPaceProject;
		if( xmlPaceProject != null) {
			boolean currentUpgradeProject = this.xmlPaceProject.isUpgradeProject();
			this.xmlPaceProject.setUpgradeProject(false);
			try {
				customFunctions = readCustomFunctions();				
			} catch(Exception e ){
				// bury for now
				// System.out.println("File Not Found.");
				logger.debug("File Not Found");
			}
			this.xmlPaceProject.setUpgradeProject(currentUpgradeProject);
		}
	}

	@Override
	public String getActionName() {
		return "Adding new functions for upgrade project.";
	}

	@Override
	public MigrationActionStatus getStatus() {
		if ( customFunctions != null ) {				
			boolean bFoundAlloc = false;
			boolean bFoundSum = false;
			boolean bFoundAllocOnly = false;
			boolean bFoundSumOnly = false;
			
			//loop through styles, see if any fill color are not null
			for (CustomFunctionDef function : customFunctions) {
				String funcName = function.getFunctionName();
				if( funcName.equalsIgnoreCase("@ALLOC") ) {
					bFoundAlloc = true;
				}
				else if( funcName.equalsIgnoreCase("@SUM") ) {
					bFoundSum = true;
				}
				else if( funcName.equalsIgnoreCase("@ALLOCONLY") ) {
					bFoundAllocOnly = true;
				}
				else if( funcName.equalsIgnoreCase("@SUMONLY") ) {
					bFoundSumOnly = true;
				}
			}
			if( bFoundAlloc && bFoundSum && bFoundAllocOnly && bFoundSumOnly ) {
				return MigrationActionStatus.Completed;
			}
			return 	MigrationActionStatus.NotStarted;		
		}
		else {
			return 	MigrationActionStatus.Failed;	
		}
	}

	@Override
	public void run() {
		if ( getStatus() == MigrationActionStatus.NotStarted ) {
			List<CustomFunctionDef> newCustomFunctions =  new ArrayList<CustomFunctionDef>();
			newCustomFunctions.addAll(customFunctions);
			CustomFunctionDef function = null;
			if ( customFunctions != null && customFunctions.size() > 0 ) {	
				function = new CustomFunctionDef();
				function.setFunctionName("@ALLOC");
				function.setClassName("com.pace.ext.funcs.AllocFunc");
				if( ! customFunctions.contains(function) ) {
					newCustomFunctions.add(function);
				}
				function = new CustomFunctionDef();
				function.setFunctionName("@SUM");
				function.setClassName("com.pace.ext.funcs.SumFunc");
				if( ! customFunctions.contains(function) ) {
					newCustomFunctions.add(function);
				}
				function = new CustomFunctionDef();
				function.setFunctionName("@ALLOCONLY");
				function.setClassName("com.pace.ext.funcs.AllocOnlyFunc");
				if( ! customFunctions.contains(function) ) {
					newCustomFunctions.add(function);
				}
				function = new CustomFunctionDef();
				function.setFunctionName("@SUMONLY");
				function.setClassName("com.pace.ext.funcs.SumOnlyFunc");
				if( ! customFunctions.contains(function) ) {
					newCustomFunctions.add(function);
				}
			}
			//export updated functions
			xmlPaceProject.setCustomFunctions(newCustomFunctions);
			try {
				xmlPaceProject.save(ProjectElementId.CustomFunctions);
			} catch (ProjectSaveException e) {
				logger.error("error with saving custom functions");
				throw new RuntimeException(e.getMessage());
			}
		}
					
	}

	private List<CustomFunctionDef> readCustomFunctions() throws PaceProjectReadException {
		
		PafXStreamElementItem<CustomFunctionDef[]> pafXStreamElementItem = new PafXStreamElementItem<CustomFunctionDef[]>(xmlPaceProject.getProjectInput() + PafBaseConstants.FN_CustomFunctionMetaData);
		
		CustomFunctionDef[] objectAr = pafXStreamElementItem.read();
			
		return Arrays.asList(objectAr);
		
	}
}
