package com.pace.base.migration;

import com.pace.base.PafErrHandler;
import com.pace.base.PafErrSeverity;
import com.pace.base.data.PafMemberList;
import com.pace.base.data.UserMemberLists;
import com.pace.base.project.ProjectElementId;
import com.pace.base.project.ProjectSaveException;
import com.pace.base.project.XMLPaceProject;

public class UserMemberListsMigrationAction extends MigrationAction {
	UserMemberLists uml = null;

	
	public UserMemberListsMigrationAction(XMLPaceProject xmlPaceProject) {
		this.xmlPaceProject = xmlPaceProject;
		if( xmlPaceProject != null) {
			boolean currentUpgradeProject = this.xmlPaceProject.isUpgradeProject();
			this.xmlPaceProject.setUpgradeProject(false);
			try {
				this.uml = xmlPaceProject.getUserMemberLists();				
			} catch(Exception e ){
				// bury for now
				// System.out.println("File Not Found.");
			}
			this.xmlPaceProject.setUpgradeProject(currentUpgradeProject);
		}
	}	
	
	
	@Override
	public String getActionName() {
		return "Create empty user memberlist file if none found";
	}

	@Override
	public MigrationActionStatus getStatus() {
		if(  this.uml == null || this.uml.getMemberLists() == null || this.uml.getMemberLists().size() == 0 ) {
			return MigrationActionStatus.NotStarted;
		}
		return MigrationActionStatus.Completed;
	}

	@Override
	public void run() {
		if( getStatus().equals(MigrationActionStatus.NotStarted) ) {
			uml = new UserMemberLists();
			PafMemberList ml = new PafMemberList();
			ml.setDimName("Measures");
			ml.setMemberNames(new String[] {"@DESC(SLS_DLR)", "SLS_AUR"});
			uml.addMemberList("MyMeasures", ml);
			
			xmlPaceProject.setUserMemberLists(uml);
			try {
				xmlPaceProject.save(ProjectElementId.UserMemberLists);
			} catch (ProjectSaveException e) {
				PafErrHandler.handleException(e, PafErrSeverity.Error);
			}
		}
	}

}
