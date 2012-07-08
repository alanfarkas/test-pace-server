package com.pace.base.utility;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import org.apache.log4j.Logger;


import com.pace.base.utility.FileUtils;

public class PafZipUtil {

	private static final Logger logger = Logger.getLogger(PafZipUtil.class);
	
	/**
	 * Method_description_goes_here
	 * 
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {

		// this is the creation of zout
		String targetArchiveName = "somefilename.zip";
		
		ZipOutputStream zout = new ZipOutputStream (new BufferedOutputStream (new FileOutputStream (targetArchiveName )));
		// don't forget to close zout after you zip your files.
		
		try {
			PafZipUtil.zipDirectory("C:\\Program Files (x86)\\Pace\\PafServer\\conf_test\\", zout);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		if ( zout != null ) {
			
			try {
				zout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		

	}

	private static final void copyInputStream(InputStream in, OutputStream out)
	  throws IOException
	  {
	    byte[] buffer = new byte[1024];
	    int len;

	    while((len = in.read(buffer)) >= 0)
	      out.write(buffer, 0, len);

	    in.close();
	    out.close();
	  }
	
	public static void unzipFile(String zipFileName, String extractDirectory) throws IOException {
		
		ZipFile zipFile =  new ZipFile(zipFileName);		      
		Enumeration entries = zipFile.entries();

		while(entries.hasMoreElements()) {
	  
			ZipEntry entry = (ZipEntry)entries.nextElement();
			
			String entryName = entry.getName();
//			String entryParts[] = entryName.split("/");
//			if( entryParts.length == 1 ) { 
//				entryParts = entryName.split("\\\\"); //The source file was zipped on Windows system
//				if( entryParts.length == 2 ) {
//					entryName = entryParts[0] + "/" + entryParts[1];//replace with Linux/Unix file separator
//				}
//			}
			
			String outputName = extractDirectory + File.separator + entryName;
			
			if(entry.isDirectory()) {
				// Assume directories are stored parents first then children.
				logger.info("Extracting directory " + entry.getName() + " to " + outputName);
				// This is not robust, just for demonstration purposes.
				(new File(outputName)).mkdir();
				continue;
			} else{
				File outputFile = new File(outputName);
		        if (!outputFile.getParentFile().exists()){
		        	logger.info("Creating parent directory: " + outputFile.getParentFile().getPath());
		            outputFile.getParentFile().mkdir();
		        } 
			}/*else {
				
				File fileToExtract = new File(entry.getName()).getParentFile();
				
				if ( fileToExtract != null && fileToExtract.isDirectory())
				
			}*/
	
			
			
			
			
			logger.info("Extracting file " + entry.getName() + " to " + outputName);
			copyInputStream(zipFile.getInputStream(entry), new BufferedOutputStream(new FileOutputStream(outputName)));
		}

		zipFile.close();
				
	}
	
	public static void zipDirectory (String archiveFilePath, ZipOutputStream zout) throws IOException {
		
		if ( ! archiveFilePath.endsWith(File.separator)) {
			
			archiveFilePath += File.separator;
								
		}

		File file = new File (archiveFilePath);
		
		if (! file.exists() ) {
			
			logger.error ("Location does not exists: " + archiveFilePath);
			return;
			
		}

		List<File> archiveFileList = FileUtils.findFiles(new File(archiveFilePath));
				
		for (File fileToArchive : archiveFileList) {
		
			if ( fileToArchive.isDirectory()) {
				
				String directoryName = fileToArchive.getName() + File.separator;
				
				zout.putNextEntry(new ZipEntry(directoryName)); 
				continue;
			} else if ( ! fileToArchive.isFile() ) {
				continue;
			}														
				
			String fileName = fileToArchive.getAbsolutePath().toString();
			
			byte[] byteArray = new byte[4096];
			int bytes_read = 0;
			ZipEntry ze = null;
			BufferedInputStream in = null;
			ze = new ZipEntry (fileName.substring(archiveFilePath.length()));
			zout.putNextEntry (ze);
			in = new BufferedInputStream (new FileInputStream(fileName));
			logger.info("Compressing file: " + fileName + " ...");
			
			while ( (bytes_read = in.read (byteArray)) != -1 ) {
				zout.write (byteArray, 0, bytes_read);
			}
			
			in.close ();
			zout.closeEntry ();
			logger.info(fileName + " compressed.");
			
			
		}
	}

}
