package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class DsmCommonAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DsmCommonAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DsmCommonAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DSM_COMMON_AREA_LENGTH = 966;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDsmReturnCode;
            protected  int beginDsmEditErrorField;
            protected  int beginDsmEditErrorOccurs;
            protected  int beginDsmSqlErrorLevel;
	
	/**
	* Constructor for DsmCommonAreaSerialized
	**/
    public DsmCommonAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for DsmCommonAreaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DsmCommonAreaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this DsmCommonAreaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,24); // serialize this field at offset 24 by default 
    }
    
	/**
	* sets parent for this DsmCommonAreaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 24 by default
    }    
	/**
	* initializes the field in DsmCommonAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DSM_COMMON_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDsmReturnCode = getStartOffset() + 2;	// set offset for serialization
  
             beginDsmEditErrorField = getStartOffset() + 5;	// set offset for serialization
  
             beginDsmEditErrorOccurs = getStartOffset() + 35;	// set offset for serialization
  
  
             beginDsmSqlErrorLevel = getStartOffset() + 64;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDsmReturnCodeCounter = -1;
     public boolean isDsmReturnCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDsmReturnCodeCounter != sharedCounter;
         localDsmReturnCodeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dsmReturnCode
	 *	@return dsmReturnCode
	 */
	public char[]  getDsmReturnCodeString() {
	     return getCharArray(beginDsmReturnCode,DSM_RETURN_CODE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dsmReturnCodeIsNumeric() {
	    return isNumeric(beginDsmReturnCode
	                    ,beginDsmReturnCode + DSM_RETURN_CODE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DSM_RETURN_CODE_LEN = 3;
  	/**
	 * serializeDsmReturnCode
	 */
	protected void serializeDsmReturnCode(int dsmReturnCode) {
		 putNumber(beginDsmReturnCode,dsmReturnCode,DSM_RETURN_CODE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDsmReturnCodeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDsmReturnCode
	 */
   	protected  int serializeDsmReturnCode(char[] value) {
	    int  dsmReturnCode;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dsmReturnCode = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginDsmReturnCode
		       ,3
		      );
		 localDsmReturnCodeCounter = shareString.getSerializedField().getModifiedCounter();
		return  dsmReturnCode;
    }

   protected int checkDsmReturnCodeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDsmReturnCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDsmReturnCode() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDsmReturnCode
			                 ,DSM_RETURN_CODE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dsmReturnCode", beginDsmReturnCode,DSM_RETURN_CODE_LEN);
    }
   	}
     int localDsmEditErrorFieldCounter = -1;
     public boolean isDsmEditErrorFieldModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDsmEditErrorFieldCounter != sharedCounter;
         localDsmEditErrorFieldCounter = sharedCounter; return hasModified;
     }
	protected static final int DSM_EDIT_ERROR_FIELD_LEN = 30;
	/**
	 * 	serialize this DsmEditErrorField
	 */
   protected void serializeDsmEditErrorField(char[] dsmEditErrorField) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dsmEditErrorField,0,getStringValue(),beginDsmEditErrorField,DSM_EDIT_ERROR_FIELD_LEN);
       localDsmEditErrorFieldCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDsmEditErrorFieldConstraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshDsmEditErrorField is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDsmEditErrorField() {	 
   		return (substring(getStringValue(),beginDsmEditErrorField,beginDsmEditErrorField + DSM_EDIT_ERROR_FIELD_LEN));
   	}
     int localDsmEditErrorOccursCounter = -1;
     public boolean isDsmEditErrorOccursModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDsmEditErrorOccursCounter != sharedCounter;
         localDsmEditErrorOccursCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dsmEditErrorOccurs
	 *	@return dsmEditErrorOccurs
	 */
	public char[]  getDsmEditErrorOccursString() {
	     return getCharArray(beginDsmEditErrorOccurs,DSM_EDIT_ERROR_OCCURS_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dsmEditErrorOccursIsNumeric() {
	    return isNumeric(beginDsmEditErrorOccurs
	                    ,beginDsmEditErrorOccurs + DSM_EDIT_ERROR_OCCURS_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DSM_EDIT_ERROR_OCCURS_LEN = 5;
  	/**
	 * serializeDsmEditErrorOccurs
	 */
	protected void serializeDsmEditErrorOccurs(long dsmEditErrorOccurs) {
		 putNumber(beginDsmEditErrorOccurs,dsmEditErrorOccurs,DSM_EDIT_ERROR_OCCURS_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDsmEditErrorOccursCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDsmEditErrorOccurs
	 */
   	protected  long serializeDsmEditErrorOccurs(char[] value) {
	    long  dsmEditErrorOccurs;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dsmEditErrorOccurs = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginDsmEditErrorOccurs
		       ,5
		      );
		 localDsmEditErrorOccursCounter = shareString.getSerializedField().getModifiedCounter();
		return  dsmEditErrorOccurs;
    }

   protected long checkDsmEditErrorOccursMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDsmEditErrorOccurs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDsmEditErrorOccurs() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginDsmEditErrorOccurs
			                 ,DSM_EDIT_ERROR_OCCURS_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dsmEditErrorOccurs", beginDsmEditErrorOccurs,DSM_EDIT_ERROR_OCCURS_LEN);
    }
   	}
     int localDsmSqlErrorLevelCounter = -1;
     public boolean isDsmSqlErrorLevelModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDsmSqlErrorLevelCounter != sharedCounter;
         localDsmSqlErrorLevelCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dsmSqlErrorLevel
	 *	@return dsmSqlErrorLevel
	 */
	public char[]  getDsmSqlErrorLevelString() {
	     return getCharArray(beginDsmSqlErrorLevel,DSM_SQL_ERROR_LEVEL_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dsmSqlErrorLevelIsNumeric() {
	    return isNumeric(beginDsmSqlErrorLevel
	                    ,beginDsmSqlErrorLevel + DSM_SQL_ERROR_LEVEL_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DSM_SQL_ERROR_LEVEL_LEN = 2;
  	/**
	 * serializeDsmSqlErrorLevel
	 */
	protected void serializeDsmSqlErrorLevel(int dsmSqlErrorLevel) {
		 putNumber(beginDsmSqlErrorLevel,dsmSqlErrorLevel,DSM_SQL_ERROR_LEVEL_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDsmSqlErrorLevelCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDsmSqlErrorLevel
	 */
   	protected  int serializeDsmSqlErrorLevel(char[] value) {
	    int  dsmSqlErrorLevel;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dsmSqlErrorLevel = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginDsmSqlErrorLevel
		       ,2
		      );
		 localDsmSqlErrorLevelCounter = shareString.getSerializedField().getModifiedCounter();
		return  dsmSqlErrorLevel;
    }

   protected int checkDsmSqlErrorLevelMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDsmSqlErrorLevel is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDsmSqlErrorLevel() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDsmSqlErrorLevel
			                 ,DSM_SQL_ERROR_LEVEL_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dsmSqlErrorLevel", beginDsmSqlErrorLevel,DSM_SQL_ERROR_LEVEL_LEN);
    }
   	}




}
  
