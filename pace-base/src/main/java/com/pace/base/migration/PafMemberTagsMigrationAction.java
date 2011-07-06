package com.pace.base.migration;

import org.apache.log4j.Logger;

import com.pace.base.PafBaseConstants;
import com.pace.base.db.membertags.MemberTagDef;
import com.pace.base.db.membertags.MemberTagType;
import com.pace.base.project.PaceProjectReadException;
import com.pace.base.project.PafXStreamElementItem;
import com.pace.base.project.XMLPaceProject;

public class PafMemberTagsMigrationAction extends MigrationAction {

	
	private static Logger logger = Logger.getLogger(PafMemberTagsMigrationAction.class);

	
	public PafMemberTagsMigrationAction(XMLPaceProject xmlPaceProject) {
		this.xmlPaceProject = xmlPaceProject;
	}

	
	@Override
	public String getActionName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MigrationActionStatus getStatus() {
		// if server home directory location is specified
		if (xmlPaceProject != null) {		
			
			//get global style map
			MemberTagDef[]  data = null;
			try {
				data = readMemberTags();
			} catch (PaceProjectReadException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//if map not null
			if ( data != null ) {				
				
				//loop through styles, see if any fill color are not null
				for (MemberTagDef memberTagDef : data) {
					//if fill color is not null, migration hasn't started yet
//					if ( memberTagDef.getType().isDeprecated() ) {
//						return MigrationActionStatus.NotStarted;
//					} 
				}
				//get this far, it's completed
				return MigrationActionStatus.Completed;
			}	
		} 

		return MigrationActionStatus.NotStarted;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}
	
	protected MemberTagDef[] readMemberTags() throws PaceProjectReadException {

		PafXStreamElementItem<MemberTagDef[]> pafXStreamElementItem = new PafXStreamElementItem<MemberTagDef[]>(xmlPaceProject.getProjectInput() + PafBaseConstants.FN_MemberTagMetaData);
		
		MemberTagDef[] objectAr = pafXStreamElementItem.read();
		
		return objectAr;
		
		//setMemberTags((objectAr == null) ? null : Arrays.asList(objectAr));
			
		
	}

}
