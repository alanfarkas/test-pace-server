package com.palladium.paf.project;

import org.apache.log4j.Logger;

import com.palladium.paf.PafConfigFileNotFoundException;
import com.palladium.paf.PafErrHandler;
import com.palladium.utility.PafXStream;


public class PafXStreamElementItem<T> {

	private static final Logger logger = Logger.getLogger(PafXStreamElementItem.class);
	
	private String fullFileName;
	
	private T data;
	
	public PafXStreamElementItem(String fullFileName) {
		
		this.fullFileName = fullFileName;
		
	}
	
	public T read() throws PaceProjectReadException {
		
		//try to import the styles
		try {
									
			logger.info("About to import: " + fullFileName );
			
			data = (T) PafXStream.importObjectFromXml(fullFileName, true);
									
		} catch (PafConfigFileNotFoundException ex) {
			
			PafErrHandler.handleException(ex);
			
		} catch (RuntimeException re) {
			
			throw new PaceProjectReadException(fullFileName, re.getMessage());			
			
		} catch (Exception e) {
			
			throw new PaceProjectReadException(fullFileName, e.getMessage());
			
		}
		
		return data;
		
	}
	
	public void write(T t) {
	
		logger.info("About to export: " + fullFileName );
		
		PafXStream.exportObjectToXml(t, fullFileName);
		
	}
	
}
