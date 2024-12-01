package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class D51uNonArrayDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class D51uNonArrayDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(D51uNonArrayDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int D_51U_NON_ARRAY_DATA_LENGTH = 89;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginD51uReturnCode;
            protected  int beginD51uInvReason;
            protected  int beginD51uErrTable;
            protected  int beginD51uMoreRecordsInd;
            protected  int beginD51uMoreIcdRecords;
            protected  int beginD51uMoreIcdSwitch;
            protected  int beginD51uNbrOfEntries;
	
	/**
	* Constructor for D51uNonArrayDataSerialized
	**/
    public D51uNonArrayDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for D51uNonArrayDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uNonArrayDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this D51uNonArrayDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,262); // serialize this field at offset 262 by default 
    }
    
	/**
	* sets parent for this D51uNonArrayDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 262 by default
    }    
	/**
	* initializes the field in D51uNonArrayDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(D_51U_NON_ARRAY_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginD51uReturnCode = getStartOffset() + 0;	// set offset for serialization
  
             beginD51uInvReason = getStartOffset() + 2;	// set offset for serialization
  
             beginD51uErrTable = getStartOffset() + 5;	// set offset for serialization
  
  
             beginD51uMoreRecordsInd = getStartOffset() + 29;	// set offset for serialization
  
             beginD51uMoreIcdRecords = getStartOffset() + 30;	// set offset for serialization
  
             beginD51uMoreIcdSwitch = getStartOffset() + 31;	// set offset for serialization
  
             beginD51uNbrOfEntries = getStartOffset() + 32;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localD51uReturnCodeCounter = -1;
     public boolean isD51uReturnCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uReturnCodeCounter != sharedCounter;
         localD51uReturnCodeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of d51uReturnCode
	 *	@return d51uReturnCode
	 */
	public char[]  getD51uReturnCodeString() {
	     return getCharArray(beginD51uReturnCode,D_51U_RETURN_CODE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean d51uReturnCodeIsNumeric() {
	    return isNumeric(beginD51uReturnCode
	                    ,beginD51uReturnCode + D_51U_RETURN_CODE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int D_51U_RETURN_CODE_LEN = 2;
  	/**
	 * serializeD51uReturnCode
	 */
	protected void serializeD51uReturnCode(int d51uReturnCode) {
		 putNumber(beginD51uReturnCode,d51uReturnCode,D_51U_RETURN_CODE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localD51uReturnCodeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeD51uReturnCode
	 */
   	protected  int serializeD51uReturnCode(char[] value) {
	    int  d51uReturnCode;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    d51uReturnCode = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginD51uReturnCode
		       ,2
		      );
		 localD51uReturnCodeCounter = shareString.getSerializedField().getModifiedCounter();
		return  d51uReturnCode;
    }

   protected int checkD51uReturnCodeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshD51uReturnCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshD51uReturnCode() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginD51uReturnCode
			                 ,D_51U_RETURN_CODE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("d51uReturnCode", beginD51uReturnCode,D_51U_RETURN_CODE_LEN);
    }
   	}
     int localD51uInvReasonCounter = -1;
     public boolean isD51uInvReasonModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uInvReasonCounter != sharedCounter;
         localD51uInvReasonCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of d51uInvReason
	 *	@return d51uInvReason
	 */
	public char[]  getD51uInvReasonString() {
	     return getCharArray(beginD51uInvReason,D_51U_INV_REASON_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean d51uInvReasonIsNumeric() {
	    return isNumeric(beginD51uInvReason
	                    ,beginD51uInvReason + D_51U_INV_REASON_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int D_51U_INV_REASON_LEN = 3;
  	/**
	 * serializeD51uInvReason
	 */
	protected void serializeD51uInvReason(int d51uInvReason) {
		 putNumber(beginD51uInvReason,d51uInvReason,D_51U_INV_REASON_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localD51uInvReasonCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeD51uInvReason
	 */
   	protected  int serializeD51uInvReason(char[] value) {
	    int  d51uInvReason;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    d51uInvReason = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginD51uInvReason
		       ,3
		      );
		 localD51uInvReasonCounter = shareString.getSerializedField().getModifiedCounter();
		return  d51uInvReason;
    }

   protected int checkD51uInvReasonMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshD51uInvReason is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshD51uInvReason() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginD51uInvReason
			                 ,D_51U_INV_REASON_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("d51uInvReason", beginD51uInvReason,D_51U_INV_REASON_LEN);
    }
   	}
     int localD51uErrTableCounter = -1;
     public boolean isD51uErrTableModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uErrTableCounter != sharedCounter;
         localD51uErrTableCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of d51uErrTable
	 *	@return d51uErrTable
	 */
	public char[]  getD51uErrTableString() {
	     return getCharArray(beginD51uErrTable,D_51U_ERR_TABLE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean d51uErrTableIsNumeric() {
	    return isNumeric(beginD51uErrTable
	                    ,beginD51uErrTable + D_51U_ERR_TABLE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int D_51U_ERR_TABLE_LEN = 1;
  	/**
	 * serializeD51uErrTable
	 */
	protected void serializeD51uErrTable(int d51uErrTable) {
		 putNumber(beginD51uErrTable,d51uErrTable,D_51U_ERR_TABLE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localD51uErrTableCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeD51uErrTable
	 */
   	protected  int serializeD51uErrTable(char[] value) {
	    int  d51uErrTable;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    d51uErrTable = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginD51uErrTable
		       ,1
		      );
		 localD51uErrTableCounter = shareString.getSerializedField().getModifiedCounter();
		return  d51uErrTable;
    }

   protected int checkD51uErrTableMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshD51uErrTable is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshD51uErrTable() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginD51uErrTable
			                 ,D_51U_ERR_TABLE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("d51uErrTable", beginD51uErrTable,D_51U_ERR_TABLE_LEN);
    }
   	}
     int localD51uMoreRecordsIndCounter = -1;
     public boolean isD51uMoreRecordsIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uMoreRecordsIndCounter != sharedCounter;
         localD51uMoreRecordsIndCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_MORE_RECORDS_IND_LEN = 1;
	/**
	 * 	serialize this D51uMoreRecordsInd
	 */
   protected void serializeD51uMoreRecordsInd(char[] d51uMoreRecordsInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uMoreRecordsInd,0,getStringValue(),beginD51uMoreRecordsInd,D_51U_MORE_RECORDS_IND_LEN);
       localD51uMoreRecordsIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uMoreRecordsIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshD51uMoreRecordsInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uMoreRecordsInd() {	 
   		return (substring(getStringValue(),beginD51uMoreRecordsInd,beginD51uMoreRecordsInd + D_51U_MORE_RECORDS_IND_LEN));
   	}
     int localD51uMoreIcdRecordsCounter = -1;
     public boolean isD51uMoreIcdRecordsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uMoreIcdRecordsCounter != sharedCounter;
         localD51uMoreIcdRecordsCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_MORE_ICD_RECORDS_LEN = 1;
	/**
	 * 	serialize this D51uMoreIcdRecords
	 */
   protected void serializeD51uMoreIcdRecords(char[] d51uMoreIcdRecords) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uMoreIcdRecords,0,getStringValue(),beginD51uMoreIcdRecords,D_51U_MORE_ICD_RECORDS_LEN);
       localD51uMoreIcdRecordsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uMoreIcdRecordsConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshD51uMoreIcdRecords is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uMoreIcdRecords() {	 
   		return (substring(getStringValue(),beginD51uMoreIcdRecords,beginD51uMoreIcdRecords + D_51U_MORE_ICD_RECORDS_LEN));
   	}
     int localD51uMoreIcdSwitchCounter = -1;
     public boolean isD51uMoreIcdSwitchModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uMoreIcdSwitchCounter != sharedCounter;
         localD51uMoreIcdSwitchCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_MORE_ICD_SWITCH_LEN = 1;
	/**
	 * 	serialize this D51uMoreIcdSwitch
	 */
   protected void serializeD51uMoreIcdSwitch(char[] d51uMoreIcdSwitch) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uMoreIcdSwitch,0,getStringValue(),beginD51uMoreIcdSwitch,D_51U_MORE_ICD_SWITCH_LEN);
       localD51uMoreIcdSwitchCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uMoreIcdSwitchConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshD51uMoreIcdSwitch is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uMoreIcdSwitch() {	 
   		return (substring(getStringValue(),beginD51uMoreIcdSwitch,beginD51uMoreIcdSwitch + D_51U_MORE_ICD_SWITCH_LEN));
   	}
     int localD51uNbrOfEntriesCounter = -1;
     public boolean isD51uNbrOfEntriesModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uNbrOfEntriesCounter != sharedCounter;
         localD51uNbrOfEntriesCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of d51uNbrOfEntries
	 *	@return d51uNbrOfEntries
	 */
	public char[]  getD51uNbrOfEntriesString() {
	     return getCharArray(beginD51uNbrOfEntries,D_51U_NBR_OF_ENTRIES_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean d51uNbrOfEntriesIsNumeric() {
	    return isNumeric(beginD51uNbrOfEntries
	                    ,beginD51uNbrOfEntries + D_51U_NBR_OF_ENTRIES_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int D_51U_NBR_OF_ENTRIES_LEN = 6;
  	/**
	 * serializeD51uNbrOfEntries
	 */
	protected void serializeD51uNbrOfEntries(long d51uNbrOfEntries) {
		 putNumber(beginD51uNbrOfEntries,d51uNbrOfEntries,D_51U_NBR_OF_ENTRIES_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localD51uNbrOfEntriesCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeD51uNbrOfEntries
	 */
   	protected  long serializeD51uNbrOfEntries(char[] value) {
	    long  d51uNbrOfEntries;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    d51uNbrOfEntries = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginD51uNbrOfEntries
		       ,6
		      );
		 localD51uNbrOfEntriesCounter = shareString.getSerializedField().getModifiedCounter();
		return  d51uNbrOfEntries;
    }

   protected long checkD51uNbrOfEntriesMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshD51uNbrOfEntries is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshD51uNbrOfEntries() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginD51uNbrOfEntries
			                 ,D_51U_NBR_OF_ENTRIES_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("d51uNbrOfEntries", beginD51uNbrOfEntries,D_51U_NBR_OF_ENTRIES_LEN);
    }
   	}




}
  
