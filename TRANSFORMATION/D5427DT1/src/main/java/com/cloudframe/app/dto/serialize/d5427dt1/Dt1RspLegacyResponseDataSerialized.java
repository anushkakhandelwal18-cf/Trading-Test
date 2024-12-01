package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class Dt1RspLegacyResponseDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Dt1RspLegacyResponseDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Dt1RspLegacyResponseDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_1_RSP_LEGACY_RESPONSE_DATA_LENGTH = 26;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDt1RspReturnCode;
            protected  int beginDt1RspExplanationCode;
            protected  int beginDt1RspRespCode;
            protected  int beginDt1RspSqlCode;
            protected  int beginDt1RspErrSection;
	
	/**
	* Constructor for Dt1RspLegacyResponseDataSerialized
	**/
    public Dt1RspLegacyResponseDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Dt1RspLegacyResponseDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dt1RspLegacyResponseDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Dt1RspLegacyResponseDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,10); // serialize this field at offset 10 by default 
    }
    
	/**
	* sets parent for this Dt1RspLegacyResponseDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 10 by default
    }    
	/**
	* initializes the field in Dt1RspLegacyResponseDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_1_RSP_LEGACY_RESPONSE_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDt1RspReturnCode = getStartOffset() + 0;	// set offset for serialization
  
             beginDt1RspExplanationCode = getStartOffset() + 2;	// set offset for serialization
  
             beginDt1RspRespCode = getStartOffset() + 5;	// set offset for serialization
  
             beginDt1RspSqlCode = getStartOffset() + 9;	// set offset for serialization
  
             beginDt1RspErrSection = getStartOffset() + 18;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDt1RspReturnCodeCounter = -1;
     public boolean isDt1RspReturnCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1RspReturnCodeCounter != sharedCounter;
         localDt1RspReturnCodeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dt1RspReturnCode
	 *	@return dt1RspReturnCode
	 */
	public char[]  getDt1RspReturnCodeString() {
	     return getCharArray(beginDt1RspReturnCode,DT_1_RSP_RETURN_CODE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dt1RspReturnCodeIsNumeric() {
	    return isNumeric(beginDt1RspReturnCode
	                    ,beginDt1RspReturnCode + DT_1_RSP_RETURN_CODE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DT_1_RSP_RETURN_CODE_LEN = 2;
  	/**
	 * serializeDt1RspReturnCode
	 */
	protected void serializeDt1RspReturnCode(int dt1RspReturnCode) {
		 putNumber(beginDt1RspReturnCode,dt1RspReturnCode,DT_1_RSP_RETURN_CODE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDt1RspReturnCodeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDt1RspReturnCode
	 */
   	protected  int serializeDt1RspReturnCode(char[] value) {
	    int  dt1RspReturnCode;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dt1RspReturnCode = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginDt1RspReturnCode
		       ,2
		      );
		 localDt1RspReturnCodeCounter = shareString.getSerializedField().getModifiedCounter();
		return  dt1RspReturnCode;
    }

   protected int checkDt1RspReturnCodeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDt1RspReturnCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDt1RspReturnCode() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDt1RspReturnCode
			                 ,DT_1_RSP_RETURN_CODE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dt1RspReturnCode", beginDt1RspReturnCode,DT_1_RSP_RETURN_CODE_LEN);
    }
   	}
     int localDt1RspExplanationCodeCounter = -1;
     public boolean isDt1RspExplanationCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1RspExplanationCodeCounter != sharedCounter;
         localDt1RspExplanationCodeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dt1RspExplanationCode
	 *	@return dt1RspExplanationCode
	 */
	public char[]  getDt1RspExplanationCodeString() {
	     return getCharArray(beginDt1RspExplanationCode,DT_1_RSP_EXPLANATION_CODE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dt1RspExplanationCodeIsNumeric() {
	    return isNumeric(beginDt1RspExplanationCode
	                    ,beginDt1RspExplanationCode + DT_1_RSP_EXPLANATION_CODE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DT_1_RSP_EXPLANATION_CODE_LEN = 3;
  	/**
	 * serializeDt1RspExplanationCode
	 */
	protected void serializeDt1RspExplanationCode(int dt1RspExplanationCode) {
		 putNumber(beginDt1RspExplanationCode,dt1RspExplanationCode,DT_1_RSP_EXPLANATION_CODE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDt1RspExplanationCodeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDt1RspExplanationCode
	 */
   	protected  int serializeDt1RspExplanationCode(char[] value) {
	    int  dt1RspExplanationCode;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dt1RspExplanationCode = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginDt1RspExplanationCode
		       ,3
		      );
		 localDt1RspExplanationCodeCounter = shareString.getSerializedField().getModifiedCounter();
		return  dt1RspExplanationCode;
    }

   protected int checkDt1RspExplanationCodeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDt1RspExplanationCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDt1RspExplanationCode() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDt1RspExplanationCode
			                 ,DT_1_RSP_EXPLANATION_CODE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dt1RspExplanationCode", beginDt1RspExplanationCode,DT_1_RSP_EXPLANATION_CODE_LEN);
    }
   	}
     int localDt1RspRespCodeCounter = -1;
     public boolean isDt1RspRespCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1RspRespCodeCounter != sharedCounter;
         localDt1RspRespCodeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dt1RspRespCode
	 *	@return dt1RspRespCode
	 */
	public char[]  getDt1RspRespCodeString() {
	     return getCharArray(beginDt1RspRespCode,DT_1_RSP_RESP_CODE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dt1RspRespCodeIsNumeric() {
	    return isNumeric(beginDt1RspRespCode
	                    ,beginDt1RspRespCode + DT_1_RSP_RESP_CODE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DT_1_RSP_RESP_CODE_LEN = 4;
  	/**
	 * serializeDt1RspRespCode
	 */
	protected void serializeDt1RspRespCode(int dt1RspRespCode) {
		 putNumber(beginDt1RspRespCode,dt1RspRespCode,DT_1_RSP_RESP_CODE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDt1RspRespCodeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDt1RspRespCode
	 */
   	protected  int serializeDt1RspRespCode(char[] value) {
	    int  dt1RspRespCode;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dt1RspRespCode = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginDt1RspRespCode
		       ,4
		      );
		 localDt1RspRespCodeCounter = shareString.getSerializedField().getModifiedCounter();
		return  dt1RspRespCode;
    }

   protected int checkDt1RspRespCodeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDt1RspRespCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDt1RspRespCode() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDt1RspRespCode
			                 ,DT_1_RSP_RESP_CODE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dt1RspRespCode", beginDt1RspRespCode,DT_1_RSP_RESP_CODE_LEN);
    }
   	}
     int localDt1RspSqlCodeCounter = -1;
     public boolean isDt1RspSqlCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1RspSqlCodeCounter != sharedCounter;
         localDt1RspSqlCodeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dt1RspSqlCode
	 *	@return dt1RspSqlCode
	 */
	public char[]  getDt1RspSqlCodeString() {
	     return getCharArray(beginDt1RspSqlCode,DT_1_RSP_SQL_CODE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dt1RspSqlCodeIsNumeric() {
	    return isNumeric(beginDt1RspSqlCode
	                    ,beginDt1RspSqlCode + DT_1_RSP_SQL_CODE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DT_1_RSP_SQL_CODE_LEN = 9;
  	/**
	 * serializeDt1RspSqlCode
	 */
	protected void serializeDt1RspSqlCode(long dt1RspSqlCode) {
		 putNumber(beginDt1RspSqlCode,dt1RspSqlCode,DT_1_RSP_SQL_CODE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDt1RspSqlCodeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDt1RspSqlCode
	 */
   	protected  long serializeDt1RspSqlCode(char[] value) {
	    long  dt1RspSqlCode;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dt1RspSqlCode = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginDt1RspSqlCode
		       ,9
		      );
		 localDt1RspSqlCodeCounter = shareString.getSerializedField().getModifiedCounter();
		return  dt1RspSqlCode;
    }

   protected long checkDt1RspSqlCodeMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDt1RspSqlCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDt1RspSqlCode() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginDt1RspSqlCode
			                 ,DT_1_RSP_SQL_CODE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dt1RspSqlCode", beginDt1RspSqlCode,DT_1_RSP_SQL_CODE_LEN);
    }
   	}
     int localDt1RspErrSectionCounter = -1;
     public boolean isDt1RspErrSectionModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1RspErrSectionCounter != sharedCounter;
         localDt1RspErrSectionCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_RSP_ERR_SECTION_LEN = 8;
	/**
	 * 	serialize this Dt1RspErrSection
	 */
   protected void serializeDt1RspErrSection(char[] dt1RspErrSection) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1RspErrSection,0,getStringValue(),beginDt1RspErrSection,DT_1_RSP_ERR_SECTION_LEN);
       localDt1RspErrSectionCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1RspErrSectionConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshDt1RspErrSection is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1RspErrSection() {	 
   		return (substring(getStringValue(),beginDt1RspErrSection,beginDt1RspErrSection + DT_1_RSP_ERR_SECTION_LEN));
   	}




}
  
