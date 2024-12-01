package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class StsDsmCommonAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class StsDsmCommonAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(StsDsmCommonAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int STS_DSM_COMMON_AREA_LENGTH = 1025;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginStsDsmFuncCd;
            protected  int beginStsDsmReturnCode;
            protected  int beginStsDsmSqlErrorMessage;
	
	/**
	* Constructor for StsDsmCommonAreaSerialized
	**/
    public StsDsmCommonAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for StsDsmCommonAreaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public StsDsmCommonAreaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this StsDsmCommonAreaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,310); // serialize this field at offset 310 by default 
    }
    
	/**
	* sets parent for this StsDsmCommonAreaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 310 by default
    }    
	/**
	* initializes the field in StsDsmCommonAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(STS_DSM_COMMON_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginStsDsmFuncCd = getStartOffset() + 0;	// set offset for serialization
  
             beginStsDsmReturnCode = getStartOffset() + 2;	// set offset for serialization
  
  
             beginStsDsmSqlErrorMessage = getStartOffset() + 125;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localStsDsmFuncCdCounter = -1;
     public boolean isStsDsmFuncCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStsDsmFuncCdCounter != sharedCounter;
         localStsDsmFuncCdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of stsDsmFuncCd
	 *	@return stsDsmFuncCd
	 */
	public char[]  getStsDsmFuncCdString() {
	     return getCharArray(beginStsDsmFuncCd,STS_DSM_FUNC_CD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean stsDsmFuncCdIsNumeric() {
	    return isNumeric(beginStsDsmFuncCd
	                    ,beginStsDsmFuncCd + STS_DSM_FUNC_CD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int STS_DSM_FUNC_CD_LEN = 2;
  	/**
	 * serializeStsDsmFuncCd
	 */
	protected void serializeStsDsmFuncCd(int stsDsmFuncCd) {
		 putNumber(beginStsDsmFuncCd,stsDsmFuncCd,STS_DSM_FUNC_CD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localStsDsmFuncCdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeStsDsmFuncCd
	 */
   	protected  int serializeStsDsmFuncCd(char[] value) {
	    int  stsDsmFuncCd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    stsDsmFuncCd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginStsDsmFuncCd
		       ,2
		      );
		 localStsDsmFuncCdCounter = shareString.getSerializedField().getModifiedCounter();
		return  stsDsmFuncCd;
    }

   protected int checkStsDsmFuncCdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshStsDsmFuncCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshStsDsmFuncCd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginStsDsmFuncCd
			                 ,STS_DSM_FUNC_CD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("stsDsmFuncCd", beginStsDsmFuncCd,STS_DSM_FUNC_CD_LEN);
    }
   	}
     int localStsDsmReturnCodeCounter = -1;
     public boolean isStsDsmReturnCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStsDsmReturnCodeCounter != sharedCounter;
         localStsDsmReturnCodeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of stsDsmReturnCode
	 *	@return stsDsmReturnCode
	 */
	public char[]  getStsDsmReturnCodeString() {
	     return getCharArray(beginStsDsmReturnCode,STS_DSM_RETURN_CODE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean stsDsmReturnCodeIsNumeric() {
	    return isNumeric(beginStsDsmReturnCode
	                    ,beginStsDsmReturnCode + STS_DSM_RETURN_CODE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int STS_DSM_RETURN_CODE_LEN = 3;
  	/**
	 * serializeStsDsmReturnCode
	 */
	protected void serializeStsDsmReturnCode(int stsDsmReturnCode) {
		 putNumber(beginStsDsmReturnCode,stsDsmReturnCode,STS_DSM_RETURN_CODE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localStsDsmReturnCodeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeStsDsmReturnCode
	 */
   	protected  int serializeStsDsmReturnCode(char[] value) {
	    int  stsDsmReturnCode;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    stsDsmReturnCode = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginStsDsmReturnCode
		       ,3
		      );
		 localStsDsmReturnCodeCounter = shareString.getSerializedField().getModifiedCounter();
		return  stsDsmReturnCode;
    }

   protected int checkStsDsmReturnCodeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshStsDsmReturnCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshStsDsmReturnCode() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginStsDsmReturnCode
			                 ,STS_DSM_RETURN_CODE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("stsDsmReturnCode", beginStsDsmReturnCode,STS_DSM_RETURN_CODE_LEN);
    }
   	}
     int localStsDsmSqlErrorMessageCounter = -1;
     public boolean isStsDsmSqlErrorMessageModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStsDsmSqlErrorMessageCounter != sharedCounter;
         localStsDsmSqlErrorMessageCounter = sharedCounter; return hasModified;
     }
	protected static final int STS_DSM_SQL_ERROR_MESSAGE_LEN = 120;
	/**
	 * 	serialize this StsDsmSqlErrorMessage
	 */
   protected void serializeStsDsmSqlErrorMessage(char[] stsDsmSqlErrorMessage) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(stsDsmSqlErrorMessage,0,getStringValue(),beginStsDsmSqlErrorMessage,STS_DSM_SQL_ERROR_MESSAGE_LEN);
       localStsDsmSqlErrorMessageCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkStsDsmSqlErrorMessageConstraints(char[] value) {
   			return super.checkConstraints(value , 120 ,false, false);
   }
    /**
	 *	refreshStsDsmSqlErrorMessage is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshStsDsmSqlErrorMessage() {	 
   		return (substring(getStringValue(),beginStsDsmSqlErrorMessage,beginStsDsmSqlErrorMessage + STS_DSM_SQL_ERROR_MESSAGE_LEN));
   	}




}
  
