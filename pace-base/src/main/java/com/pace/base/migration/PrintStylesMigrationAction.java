package com.pace.base.migration;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import com.pace.base.PafBaseConstants;
import com.pace.base.PafConfigFileNotFoundException;
import com.pace.base.project.XMLPaceProject;
import com.pace.base.ui.DefaultPrintSettings;
import com.pace.base.ui.PrintStyle;
import com.pace.base.ui.PrintStyles;
import com.pace.base.utility.GUIDUtil;
import com.pace.base.utility.PafXStream;

public class PrintStylesMigrationAction extends MigrationAction {
	private Map<String, PrintStyle> printStyleMap = new HashMap<String, PrintStyle>();
	private PrintStyles ps = new PrintStyles();
	
	public PrintStylesMigrationAction(XMLPaceProject xmlPaceProject) {
		// TODO Auto-generated constructor stub
		this.xmlPaceProject = xmlPaceProject;
		if( xmlPaceProject != null) {
			try {
				ps = (PrintStyles) PafXStream.importObjectFromXml(xmlPaceProject.getProjectInput() + File.separator +  PafBaseConstants.FN_PrintStyles);
				printStyleMap = ps.getPrintStyles();
			} catch (PafConfigFileNotFoundException e) {
				System.out.println("Creating a default print style because there is no global print style.");
			} 
		}
	}

	@Override
	public String getActionName() {
		// TODO Auto-generated method stub
		return "Creating a default print style because there is no global print style.";
	}

	@Override
	public MigrationActionStatus getStatus() {
		// TODO Auto-generated method stub
		if( this.xmlPaceProject != null ) {
			if( printStyleMap == null || printStyleMap.size() == 0) {
				return MigrationActionStatus.NotStarted;
			}
			else if( printStyleMap.size() > 0  ) {
				return MigrationActionStatus.Completed;
			}
		}
		return MigrationActionStatus.NotStarted;
	}

	@Override
	public void run() {
		if( getStatus() == MigrationActionStatus.NotStarted ) {
			PrintStyle defaultStyle = DefaultPrintSettings.getInstance().getDefaultPrintSettings().clone();
			defaultStyle.setGUID(GUIDUtil.getGUID());
			defaultStyle.setName("Print Style #1");
			defaultStyle.setDefaultStyle(true);
			printStyleMap.put(defaultStyle.getGUID(), defaultStyle);
			ps.setPrintStyles(printStyleMap);
			try {
				PafXStream.exportObjectToXml(ps, xmlPaceProject.getProjectInput() + File.separator + PafBaseConstants.FN_PrintStyles);
			} catch(RuntimeException e) {
				System.out.println("Error with writing PrintStyles.");
			}
		}
	}

}
