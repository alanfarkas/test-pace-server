package com.pace.base.migration;

import java.util.Map;

import com.pace.base.project.ProjectElementId;
import com.pace.base.project.ProjectSaveException;
import com.pace.base.project.XMLPaceProject;
import com.pace.base.ui.PrintStyle;
import com.pace.base.ui.PrintStyles;
import com.pace.base.utility.GUIDUtil;

public class PrintStylesMigrationAction extends MigrationAction {
	private Map<String, PrintStyle> printStyles = null;
	
	public PrintStylesMigrationAction(XMLPaceProject xmlPaceProject) {
		// TODO Auto-generated constructor stub
		this.xmlPaceProject = xmlPaceProject;
		if( xmlPaceProject != null) {
			boolean currentUpgradeProject = this.xmlPaceProject.isUpgradeProject();
			this.xmlPaceProject.setUpgradeProject(false);
			try {
				this.printStyles = xmlPaceProject.getPrintStyles();
			} catch(Exception e ){
				System.out.println("File Not Found.");
			}
			this.xmlPaceProject.setUpgradeProject(currentUpgradeProject);
		}
	}

	@Override
	public String getActionName() {
		// TODO Auto-generated method stub
		return "Create a default print style if there is no any global print style.";
	}

	@Override
	public MigrationActionStatus getStatus() {
		// TODO Auto-generated method stub
		if( this.xmlPaceProject != null ) {
			if( printStyles == null || printStyles.size() == 0) {
				return MigrationActionStatus.NotStarted;
			}
			else if( xmlPaceProject.getPrintStyles().size() > 0  ) {
				return MigrationActionStatus.Completed;
			}
		}
		return MigrationActionStatus.NotStarted;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if( printStyles == null || printStyles.size() == 0) {
			Thread.currentThread().setContextClassLoader(PrintStyles.class.getClassLoader());
			PrintStyle defaultStyle = PrintStyles.loadDefaultPrintSettings();
			defaultStyle.setGUID(GUIDUtil.getGUID());
			defaultStyle.setName("Print Style #1");
			defaultStyle.setDefaultStyle(true);
			printStyles.put(defaultStyle.getGUID(), defaultStyle);
			xmlPaceProject.setPrintStyles(printStyles);
			try {
				xmlPaceProject.save(ProjectElementId.PrintStyles);
			} catch (ProjectSaveException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
