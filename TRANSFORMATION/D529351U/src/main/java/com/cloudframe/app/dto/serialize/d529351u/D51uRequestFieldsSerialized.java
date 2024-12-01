package com.cloudframe.app.dto.serialize.d529351u;

/**
*  The class D51uRequestFieldsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:50. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class D51uRequestFieldsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(D51uRequestFieldsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int D_51U_REQUEST_FIELDS_LENGTH = 238;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginD51uReqCallerType;
            protected  int beginD51uReqCallingProgram;
            protected  int beginD51uReqFuncCd;
            protected  int beginD51uReqType;
	
	/**
	* Constructor for D51uRequestFieldsSerialized
	**/
    public D51uRequestFieldsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for D51uRequestFieldsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uRequestFieldsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this D51uRequestFieldsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,24); // serialize this field at offset 24 by default 
    }
    
	/**
	* sets parent for this D51uRequestFieldsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 24 by default
    }    
	/**
	* initializes the field in D51uRequestFieldsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(D_51U_REQUEST_FIELDS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginD51uReqCallerType = getStartOffset() + 0;	// set offset for serialization
  
             beginD51uReqCallingProgram = getStartOffset() + 1;	// set offset for serialization
  
             beginD51uReqFuncCd = getStartOffset() + 9;	// set offset for serialization
  
             beginD51uReqType = getStartOffset() + 11;	// set offset for serialization
  
  
  
  
  
	   /*  end of offset */
	}
     int localD51uReqCallerTypeCounter = -1;
     public boolean isD51uReqCallerTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uReqCallerTypeCounter != sharedCounter;
         localD51uReqCallerTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_REQ_CALLER_TYPE_LEN = 1;
	/**
	 * 	serialize this D51uReqCallerType
	 */
   protected void serializeD51uReqCallerType(char[] d51uReqCallerType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uReqCallerType,0,getStringValue(),beginD51uReqCallerType,D_51U_REQ_CALLER_TYPE_LEN);
       localD51uReqCallerTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uReqCallerTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshD51uReqCallerType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uReqCallerType() {	 
   		return (substring(getStringValue(),beginD51uReqCallerType,beginD51uReqCallerType + D_51U_REQ_CALLER_TYPE_LEN));
   	}
     int localD51uReqCallingProgramCounter = -1;
     public boolean isD51uReqCallingProgramModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uReqCallingProgramCounter != sharedCounter;
         localD51uReqCallingProgramCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_REQ_CALLING_PROGRAM_LEN = 8;
	/**
	 * 	serialize this D51uReqCallingProgram
	 */
   protected void serializeD51uReqCallingProgram(char[] d51uReqCallingProgram) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uReqCallingProgram,0,getStringValue(),beginD51uReqCallingProgram,D_51U_REQ_CALLING_PROGRAM_LEN);
       localD51uReqCallingProgramCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uReqCallingProgramConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshD51uReqCallingProgram is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uReqCallingProgram() {	 
   		return (substring(getStringValue(),beginD51uReqCallingProgram,beginD51uReqCallingProgram + D_51U_REQ_CALLING_PROGRAM_LEN));
   	}
     int localD51uReqFuncCdCounter = -1;
     public boolean isD51uReqFuncCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uReqFuncCdCounter != sharedCounter;
         localD51uReqFuncCdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of d51uReqFuncCd
	 *	@return d51uReqFuncCd
	 */
	public char[]  getD51uReqFuncCdString() {
	     return getCharArray(beginD51uReqFuncCd,D_51U_REQ_FUNC_CD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean d51uReqFuncCdIsNumeric() {
	    return isNumeric(beginD51uReqFuncCd
	                    ,beginD51uReqFuncCd + D_51U_REQ_FUNC_CD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int D_51U_REQ_FUNC_CD_LEN = 2;
  	/**
	 * serializeD51uReqFuncCd
	 */
	protected void serializeD51uReqFuncCd(int d51uReqFuncCd) {
		 putNumber(beginD51uReqFuncCd,d51uReqFuncCd,D_51U_REQ_FUNC_CD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localD51uReqFuncCdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeD51uReqFuncCd
	 */
   	protected  int serializeD51uReqFuncCd(char[] value) {
	    int  d51uReqFuncCd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    d51uReqFuncCd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginD51uReqFuncCd
		       ,2
		      );
		 localD51uReqFuncCdCounter = shareString.getSerializedField().getModifiedCounter();
		return  d51uReqFuncCd;
    }

   protected int checkD51uReqFuncCdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshD51uReqFuncCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshD51uReqFuncCd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginD51uReqFuncCd
			                 ,D_51U_REQ_FUNC_CD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("d51uReqFuncCd", beginD51uReqFuncCd,D_51U_REQ_FUNC_CD_LEN);
    }
   	}
     int localD51uReqTypeCounter = -1;
     public boolean isD51uReqTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uReqTypeCounter != sharedCounter;
         localD51uReqTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_REQ_TYPE_LEN = 1;
	/**
	 * 	serialize this D51uReqType
	 */
   protected void serializeD51uReqType(char[] d51uReqType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uReqType,0,getStringValue(),beginD51uReqType,D_51U_REQ_TYPE_LEN);
       localD51uReqTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uReqTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshD51uReqType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uReqType() {	 
   		return (substring(getStringValue(),beginD51uReqType,beginD51uReqType + D_51U_REQ_TYPE_LEN));
   	}




}
  
