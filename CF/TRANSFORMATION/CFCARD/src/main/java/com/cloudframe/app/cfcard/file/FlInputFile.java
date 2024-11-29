package com.cloudframe.app.cfcard.file;
/* Java Code Generated by CloudFrame */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import com.cloudframe.app.utility.CFFile;
import org.springframework.beans.factory.annotation.Value;
import com.cloudframe.app.utility.CFConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.cloudframe.app.cfcard.file.records.*;

@Component("cfcard_flInputFile")
public class FlInputFile extends CFFile {

	private Logger logger = LoggerFactory.getLogger(FlInputFile.class);
	
	@Value("${CFCARD.FlInputFile:INPDD}")
	private String fileName;

	/**
	 * This function is not required in this subclass for your program to work as intended. 
	 * CloudFrame generated this function to provide you hints for the code you must write 
	 * to change the implementation and remove runtime and license dependency on CloudFrame. 
	 * Consult CloudFrame's customer wiki for additional information. https://ask.cloudframe.com
	 **/
	@Override
	public String getFileName() {
		return fileName;
	}
	
	/**
	 * This function is not required in this subclass for your program to work as intended. 
	 * CloudFrame generated this function to provide you hints for the code you must write 
	 * to change the implementation and remove runtime and license dependency on CloudFrame. 
	 * Consult CloudFrame's customer wiki for additional information. https://ask.cloudframe.com
	 **/	
	@Override
	public  void setFileName(String fileName) {
		this.fileName = fileName;
	}	

   /**
    *  Default value for CharSet is cp1047 defined in application.properties
    *  For files that has mixed UTF-8 as well as binary characters keep this value as cp1047
    **/
	@Value("${CFCARD.FlInputFileCharSet:cp1047}")
	private String charSet;
	
	@Value("${CFCARD.FlInputFileCRLFflag:no}")
	private String crlfFlag;

	public String getFlInputFileCharSet() {
		return charSet;
	}
	
	public String getFlInputFileCrlfFlag() {
		return crlfFlag;
	}

	public FlInputFile()
	{
		setFixedBlockFile(true);	
		setRecord(new byte[44]);
		setOptionalFile(false);
	}
	
	public char[] getStatusString() {
		if (status == 0) return new char[]{'0','0'};
		else if (status == 10) return new char[]{'1','0'};
		return String.format("%1$2s", status+"").replace(' ', '0').toCharArray();
	}

	@Override
	public void read() throws Exception {
		try {
			super.readRecord();
		} catch (Exception e) {
			ended = true;
			status = CFConstants.END_OF_FILE; 
			logger.error("Error during FlInputFile Read: {}",e.getMessage() ); 
		    throw e;
		}
	}
  
	
}
