package com.cloudframe.app.file.utility.sort;
  /* Java Code Generated by CloudFrame */
  
  import org.springframework.stereotype.Component;
  import com.cloudframe.app.utility.CFFile;
  import org.springframework.beans.factory.annotation.Value;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import org.springframework.batch.core.configuration.annotation.JobScope;
  
  @Component("Gdghfix336Step001SortOut")
  @JobScope
  public class Gdghfix336Step001SortOut extends CFFile {
  	private Logger logger = LoggerFactory.getLogger(Gdghfix336Step001SortOut.class);
  	@Value("${Gdghfix336Step001SortOut:CLOUDFRM.SF.P3GX.PRSF2130.REBATE(+1)}")
  	private String fileName;
  
  	/**
  	 * This function is not required in this subclass for your program to work as intended. 
  	 * CloudFrame generated this function to provide you hints for the code you must write 
  	 * to change the implementation and remove runtime and license dependency on CloudFrame. 
  	 * Consult CloudFrame's customer wiki for additional information. https://wiki.cloudframe.com
  	 **/
  	public String getFileName() {
  		return fileName;
  	}
  	
  	/**
  	 * This function is not required in this subclass for your program to work as intended. 
  	 * CloudFrame generated this function to provide you hints for the code you must write 
  	 * to change the implementation and remove runtime and license dependency on CloudFrame. 
  	 * Consult CloudFrame's customer wiki for additional information. https://wiki.cloudframe.com
  	 **/	
  	@Override
  	public  void setFileName(String fileName) {
  		this.fileName = fileName;
  	}	
  
      @Value("#{'${Gdghfix336Step001SortOutRecordType:${Gdghfix336Step001SortOutRecordType:FB}}'}")
  	private String recordType;
  	
      @Value("#{'${Gdghfix336Step001SortOutRecordLen:${Gdghfix336Step001SortOutRecordLen:80}}'}")
  	private int recordLen;
  	
  	private int outRecLen = 80;
  	
  	public int getOutRecLen() {
  		return outRecLen;
  	}
  	
  	public boolean isFBRec() {
    		return (recordType.startsWith("F")); //F/FB/FBA
    	}
  
    
  	public int getRecordLen() {
  		return recordLen;
  	}
  	
    
      @Override
  	public void write(int len) {
  		try {
  			super.writeRecord(record,len);
  		} catch (Exception e) {
  			logger.error("Error during Gdghfix336Step001SortOut Write: {}",e.getMessage()); 		
  		}
  	}
  	
  	public String getStatusString() {
  		if (status == 0) return "00";
  		else if (status == 10) return "10";
  		return String.format("%1$2s", status+"").replace(' ', '0');
  	}
  }