package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class StsFixedAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class StsFixedAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(StsFixedAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int STS_FIXED_AREA_LENGTH = 1335;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginStsRespProgramName;
            protected  int beginStsRespCode;
	
	/**
	* Constructor for StsFixedAreaSerialized
	**/
    public StsFixedAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for StsFixedAreaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public StsFixedAreaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this StsFixedAreaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this StsFixedAreaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in StsFixedAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(STS_FIXED_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginStsRespProgramName = getStartOffset() + 0;	// set offset for serialization
  
             beginStsRespCode = getStartOffset() + 8;	// set offset for serialization
  
  
  
	   /*  end of offset */
	}
     int localStsRespProgramNameCounter = -1;
     public boolean isStsRespProgramNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStsRespProgramNameCounter != sharedCounter;
         localStsRespProgramNameCounter = sharedCounter; return hasModified;
     }
	protected static final int STS_RESP_PROGRAM_NAME_LEN = 8;
	/**
	 * 	serialize this StsRespProgramName
	 */
   protected void serializeStsRespProgramName(char[] stsRespProgramName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(stsRespProgramName,0,getStringValue(),beginStsRespProgramName,STS_RESP_PROGRAM_NAME_LEN);
       localStsRespProgramNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkStsRespProgramNameConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshStsRespProgramName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshStsRespProgramName() {	 
   		return (substring(getStringValue(),beginStsRespProgramName,beginStsRespProgramName + STS_RESP_PROGRAM_NAME_LEN));
   	}
     int localStsRespCodeCounter = -1;
     public boolean isStsRespCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStsRespCodeCounter != sharedCounter;
         localStsRespCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int STS_RESP_CODE_LEN = 4;
	/**
	 * 	serialize this StsRespCode
	 */
   protected void serializeStsRespCode(char[] stsRespCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(stsRespCode,0,getStringValue(),beginStsRespCode,STS_RESP_CODE_LEN);
       localStsRespCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkStsRespCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshStsRespCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshStsRespCode() {	 
   		return (substring(getStringValue(),beginStsRespCode,beginStsRespCode + STS_RESP_CODE_LEN));
   	}




}
  
