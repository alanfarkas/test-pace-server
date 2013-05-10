/*
 *	File: @(#)ExecProcess.java 	Package: com.pace.ext.cmds 	Project: pace-ext-cmds
 *	Created: May 7, 2006  		By:jim
 *	Version: x.xx
 *
 * 	Copyright (c) 2005-2006 Palladium Group, Inc. All rights reserved.
 *
 *	This software is the confidential and proprietary information of Palladium Group, Inc.
 *	("Confidential Information"). You shall not disclose such Confidential Information and 
 * 	should use it only in accordance with the terms of the license agreement you entered into
 *	with Palladium Group, Inc.
 *
 *
 *
	Date			Author			Version			Changes
	xx/xx/xx		xxxxxxxx		x.xx			..............
 * 
*/
package com.pace.ext.cmds;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.pace.base.CustomCommandResult;
import com.pace.base.PafException;
import com.pace.base.state.IPafClientState;

public class MessageCmd extends AbstractCommand {

	/* (non-Javadoc)
	 * @see com.pace.base.IPafCustomCommand#execute(java.util.Properties, com.pace.base.state.IPafClientState)
	 */
	private static Logger logger = Logger.getLogger(MessageCmd.class);
	
	private static final String PROPKEY_PATH_TO_PROCESS = "PATH.TO.PROCESS";
	private static final String PROPKEY_PROCESS_TO_RUN = "PROCESS.TO.RUN";
	private static final String PROPKEY_ASYNCH_MODE = "DONT.WAIT";
	
	public CustomCommandResult execute(Properties clientProps, IPafClientState clientState)
			throws PafException {

		String pathToProc = null;
		String procToRun = null;
		boolean asynchMode = false;
		
		procToRun = this.getActionParm(PROPKEY_PROCESS_TO_RUN, clientProps, true);	
		pathToProc = this.getActionParm(PROPKEY_PATH_TO_PROCESS, clientProps, false);
		asynchMode  =  Boolean.parseBoolean(this.getActionParm(PROPKEY_ASYNCH_MODE, clientProps, false));

		Process p = null;
    	ProcessBuilder pb = null;
		
        try {
        	
            	pb = new ProcessBuilder(procToRun);

            	
                if ( pathToProc != null &&  !pathToProc.equals("") )
                {
                	pb.directory( new File (pathToProc));
                }

                p = pb.start();

                if (!asynchMode) {
                    
                    BufferedReader stdInput = new BufferedReader(new 
                         InputStreamReader(p.getInputStream()));

                    BufferedReader stdError = new BufferedReader(new 
                         InputStreamReader(p.getErrorStream()));

                    // read the output from the command
                    
                    
                    
                    // read any errors from the attempted command
					String s;
					logger.info("Standard Output of Executed Command:\n");
					while ((s = stdInput.readLine()) != null) {
						logger.info(s);
					}
					System.out
							.println("Here is the standard error of the command (if any):\n");
					while ((s = stdError.readLine()) != null) {
						logger.info(s);
					}
				} else {
					logger.info("Running Process Asynchronously");
				}
                
            }
            catch (IOException e) {
    			logger.error(errMsgBase + e.getMessage());
    			result.setReturnMessage(errMsgBase + e.getMessage());
    			return result;
			}
		

		if (!asynchMode) {
	        result.setReturnMessage("Process run successfully");					
		} else {
	        result.setReturnMessage("Process running in background...");								
		}
		return result;
	}
	
}
