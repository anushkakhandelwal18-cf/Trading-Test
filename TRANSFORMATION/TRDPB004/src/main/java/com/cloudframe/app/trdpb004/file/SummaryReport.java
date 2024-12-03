package com.cloudframe.app.trdpb004.file;
/* Java Code Generated by CloudFrame */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import com.cloudframe.app.utility.CFFile;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.cloudframe.app.trdpb004.file.records.*;

@Component("trdpb004_summaryReport")
public class SummaryReport extends CFFile {

	private Logger logger = LoggerFactory.getLogger(SummaryReport.class);
	
	@Value("${TRDPB004.SummaryReport:SUMMARY}")
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
	@Value("${TRDPB004.SummaryReportCharSet:cp1047}")
	private String charSet;
	
	@Value("${TRDPB004.SummaryReportCRLFflag:no}")
	private String crlfFlag;

	public String getSummaryReportCharSet() {
		return charSet;
	}
	
	public String getSummaryReportCrlfFlag() {
		return crlfFlag;
	}

	public SummaryReport()
	{
		setFixedBlockFile(true);	
		setRecord(new byte[140]);
		setOptionalFile(false);
	}
	
	public char[] getStatusString() {
		if (status == 0) return new char[]{'0','0'};
		else if (status == 10) return new char[]{'1','0'};
		return String.format("%1$2s", status+"").replace(' ', '0').toCharArray();
	}

  
    @Override
	public void write(int len) {
		try {
			super.writeRecord(record,len);
		} catch (Exception e) {
			logger.error("Error during SummaryReport Write: {}",e.getMessage() ); 		}
	}
	
}
