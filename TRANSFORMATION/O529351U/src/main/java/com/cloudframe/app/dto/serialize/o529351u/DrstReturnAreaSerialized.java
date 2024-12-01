package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class DrstReturnAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DrstReturnAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DrstReturnAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DRST_RETURN_AREA_LENGTH = 43;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDrstReturnCode;
            protected  int beginDrstEditErrorField;
	
	/**
	* Constructor for DrstReturnAreaSerialized
	**/
    public DrstReturnAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for DrstReturnAreaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DrstReturnAreaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this DrstReturnAreaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,299); // serialize this field at offset 299 by default 
    }
    
	/**
	* sets parent for this DrstReturnAreaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 299 by default
    }    
	/**
	* initializes the field in DrstReturnAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DRST_RETURN_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDrstReturnCode = getStartOffset() + 0;	// set offset for serialization
  
             beginDrstEditErrorField = getStartOffset() + 3;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDrstReturnCodeCounter = -1;
     public boolean isDrstReturnCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDrstReturnCodeCounter != sharedCounter;
         localDrstReturnCodeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of drstReturnCode
	 *	@return drstReturnCode
	 */
	public char[]  getDrstReturnCodeString() {
	     return getCharArray(beginDrstReturnCode,DRST_RETURN_CODE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean drstReturnCodeIsNumeric() {
	    return isNumeric(beginDrstReturnCode
	                    ,beginDrstReturnCode + DRST_RETURN_CODE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DRST_RETURN_CODE_LEN = 3;
  	/**
	 * serializeDrstReturnCode
	 */
	protected void serializeDrstReturnCode(int drstReturnCode) {
		 putNumber(beginDrstReturnCode,drstReturnCode,DRST_RETURN_CODE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDrstReturnCodeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDrstReturnCode
	 */
   	protected  int serializeDrstReturnCode(char[] value) {
	    int  drstReturnCode;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    drstReturnCode = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginDrstReturnCode
		       ,3
		      );
		 localDrstReturnCodeCounter = shareString.getSerializedField().getModifiedCounter();
		return  drstReturnCode;
    }

   protected int checkDrstReturnCodeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDrstReturnCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDrstReturnCode() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDrstReturnCode
			                 ,DRST_RETURN_CODE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("drstReturnCode", beginDrstReturnCode,DRST_RETURN_CODE_LEN);
    }
   	}
     int localDrstEditErrorFieldCounter = -1;
     public boolean isDrstEditErrorFieldModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDrstEditErrorFieldCounter != sharedCounter;
         localDrstEditErrorFieldCounter = sharedCounter; return hasModified;
     }
	protected static final int DRST_EDIT_ERROR_FIELD_LEN = 20;
	/**
	 * 	serialize this DrstEditErrorField
	 */
   protected void serializeDrstEditErrorField(char[] drstEditErrorField) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(drstEditErrorField,0,getStringValue(),beginDrstEditErrorField,DRST_EDIT_ERROR_FIELD_LEN);
       localDrstEditErrorFieldCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDrstEditErrorFieldConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshDrstEditErrorField is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDrstEditErrorField() {	 
   		return (substring(getStringValue(),beginDrstEditErrorField,beginDrstEditErrorField + DRST_EDIT_ERROR_FIELD_LEN));
   	}




}
  
