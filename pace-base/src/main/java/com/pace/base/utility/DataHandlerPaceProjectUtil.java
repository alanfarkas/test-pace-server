/**
 * 
 */
package com.pace.base.utility;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;

import com.pace.base.project.InvalidPaceProjectInputException;
import com.pace.base.project.PaceProject;
import com.pace.base.project.PaceProjectCreationException;
import com.pace.base.project.ProjectSaveException;
import com.pace.base.project.ProjectSerializationType;
import com.pace.base.project.ZipPaceProject;

/**
 * @author JMilliron
 *
 */
public class DataHandlerPaceProjectUtil {
	
	
	private static final String PACE_PAF_FILE_NAME = "pace.paf";

	/**
	 * Converts a pace project to a DataHandler
	 * 
	 * @param paceProject pace project to convert
	 * @param tempDir scratch dir that the pace.paf file will be written too
	 * @return DataHandler
	 * @throws ProjectSaveException when pace project can't be saved
	 */
	public static DataHandler convertPaceProjectToDataHandler(PaceProject paceProject, String tempDir) throws ProjectSaveException {
		
		DataHandler dataHandler = null;
		
		if ( paceProject != null && tempDir != null ) {
		
			ZipPaceProject zipPaceProject = null;
			
			if ( paceProject instanceof ZipPaceProject ) {
				
				zipPaceProject = (ZipPaceProject) paceProject;
				
			} else {
				
				zipPaceProject = (ZipPaceProject) paceProject.convertTo(ProjectSerializationType.PAF);
				
			}
						
				
			File pafArchive = new File(tempDir + File.separator + PACE_PAF_FILE_NAME);
				
			if ( pafArchive.exists()) {
				pafArchive.delete();
			}
				
			zipPaceProject.saveTo(pafArchive.getAbsolutePath());
				
			DataSource source = new FileDataSource(pafArchive);
			dataHandler = new DataHandler(source);
			
			
		}		
		
		return dataHandler;
		
	}
	
	/**
	 * Converts a Data Handler to a Pace Project.
	 * 
	 * @param dataHandler data handler to convert
	 * @param tempDir scratch dir that the pace.paf file will be written too
	 * @return pace project
	 * @throws IOException
	 * @throws InvalidPaceProjectInputException
	 * @throws PaceProjectCreationException
	 */
	public static PaceProject convertDataHandlerToPaceProject(DataHandler dataHandler, String tempDir) throws IOException, InvalidPaceProjectInputException, PaceProjectCreationException {
		
		PaceProject paceProject = null;
		
		if ( dataHandler != null && tempDir != null ) {

			InputStream inputStream = null;
			
			try {
				
				inputStream = dataHandler.getInputStream();
				
				ByteArrayOutputStream out = new ByteArrayOutputStream();
	           
				IOStreamUtil.copy(inputStream, out);
	            
	            File pacePafFile = new File(tempDir + File.separator + PACE_PAF_FILE_NAME);
	            
	            if ( pacePafFile.exists() ) {
	            	pacePafFile.delete();
	            }
	            FileOutputStream fos = new FileOutputStream(pacePafFile);
	            
	            fos.write(out.toByteArray());
	            
	            fos.flush();
	            
	            fos.close();
	            
	            ZipPaceProject zpp = new ZipPaceProject(pacePafFile.getAbsolutePath());
	            			
				paceProject = zpp.convertTo(ProjectSerializationType.XML);

			} finally {
			
				if ( inputStream != null ) {
					inputStream.close();
				}
				
			}
			
		}
				
		return paceProject;
		
	}
	

}
