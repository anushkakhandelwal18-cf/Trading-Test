package com.cloudframe.app.dto.serialize.cics0010;

/**
*  The class LsDfhcommareaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-03 at 15:51. using version 5.0.0.163
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class LsDfhcommareaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(LsDfhcommareaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int LS_DFHCOMMAREA_LENGTH = 120;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginLsRequestType;
            protected  int beginLsRequestData;
            protected  int beginLsReturnCode;
            protected  int beginLsReturnEibresp;
            protected  int beginLsReturnEibresp2;
	
	/**
	* Constructor for LsDfhcommareaSerialized
	**/
    public LsDfhcommareaSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in LsDfhcommareaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(LS_DFHCOMMAREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginLsRequestType = getStartOffset() + 0;	// set offset for serialization
  
             beginLsRequestData = getStartOffset() + 2;	// set offset for serialization
  
             beginLsReturnCode = getStartOffset() + 102;	// set offset for serialization
  
             beginLsReturnEibresp = getStartOffset() + 104;	// set offset for serialization
  
             beginLsReturnEibresp2 = getStartOffset() + 112;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localLsRequestTypeCounter = -1;
         public boolean isLsRequestTypeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localLsRequestTypeCounter != sharedCounter;
            localLsRequestTypeCounter = sharedCounter; return hasModified; 
         }
   protected static final int LS_REQUEST_TYPE_LEN = 2;
  	/**
	 * serializeLsRequestType
	 */
	protected void serializeLsRequestType(int lsRequestType) {
           replaceValue( //  save the value as string
                   getBinaryString( lsRequestType,LS_REQUEST_TYPE_LEN)
                  ,beginLsRequestType
                  ,LS_REQUEST_TYPE_LEN
                 );
            localLsRequestTypeCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkLsRequestTypeMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshLsRequestType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshLsRequestType() {	 
			return (getUnsignedShort(beginLsRequestType));
   	}
     int localLsRequestDataCounter = -1;
     public boolean isLsRequestDataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsRequestDataCounter != sharedCounter;
         localLsRequestDataCounter = sharedCounter; return hasModified;
     }
	protected static final int LS_REQUEST_DATA_LEN = 100;
	/**
	 * 	serialize this LsRequestData
	 */
   protected void serializeLsRequestData(char[] lsRequestData) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lsRequestData,0,getStringValue(),beginLsRequestData,LS_REQUEST_DATA_LEN);
       localLsRequestDataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLsRequestDataConstraints(char[] value) {
   			return super.checkConstraints(value , 100 ,false, false);
   }
    /**
	 *	refreshLsRequestData is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLsRequestData() {	 
   		return (substring(getStringValue(),beginLsRequestData,beginLsRequestData + LS_REQUEST_DATA_LEN));
   	}
     int localLsReturnCodeCounter = -1;
     public boolean isLsReturnCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsReturnCodeCounter != sharedCounter;
         localLsReturnCodeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of lsReturnCode
	 *	@return lsReturnCode
	 */
	public char[]  getLsReturnCodeString() {
	     return getCharArray(beginLsReturnCode,LS_RETURN_CODE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsReturnCodeIsNumeric() {
	    return isNumeric(beginLsReturnCode
	                    ,beginLsReturnCode + LS_RETURN_CODE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int LS_RETURN_CODE_LEN = 2;
  	/**
	 * serializeLsReturnCode
	 */
	protected void serializeLsReturnCode(int lsReturnCode) {
		 putNumber(beginLsReturnCode,lsReturnCode,LS_RETURN_CODE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localLsReturnCodeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeLsReturnCode
	 */
   	protected  int serializeLsReturnCode(char[] value) {
	    int  lsReturnCode;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    lsReturnCode = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginLsReturnCode
		       ,2
		      );
		 localLsReturnCodeCounter = shareString.getSerializedField().getModifiedCounter();
		return  lsReturnCode;
    }

   protected int checkLsReturnCodeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshLsReturnCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshLsReturnCode() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginLsReturnCode
			                 ,LS_RETURN_CODE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("lsReturnCode", beginLsReturnCode,LS_RETURN_CODE_LEN);
    }
   	}
     int localLsReturnEibrespCounter = -1;
     public boolean isLsReturnEibrespModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsReturnEibrespCounter != sharedCounter;
         localLsReturnEibrespCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of lsReturnEibresp
	 *	@return lsReturnEibresp
	 */
	public char[]  getLsReturnEibrespString() {
	     return getCharArray(beginLsReturnEibresp,LS_RETURN_EIBRESP_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsReturnEibrespIsNumeric() {
	    return isNumeric(beginLsReturnEibresp
	                    ,beginLsReturnEibresp + LS_RETURN_EIBRESP_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int LS_RETURN_EIBRESP_LEN = 8;
  	/**
	 * serializeLsReturnEibresp
	 */
	protected void serializeLsReturnEibresp(long lsReturnEibresp) {
		 putNumber(beginLsReturnEibresp,lsReturnEibresp,LS_RETURN_EIBRESP_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localLsReturnEibrespCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeLsReturnEibresp
	 */
   	protected  long serializeLsReturnEibresp(char[] value) {
	    long  lsReturnEibresp;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    lsReturnEibresp = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginLsReturnEibresp
		       ,8
		      );
		 localLsReturnEibrespCounter = shareString.getSerializedField().getModifiedCounter();
		return  lsReturnEibresp;
    }

   protected long checkLsReturnEibrespMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshLsReturnEibresp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshLsReturnEibresp() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginLsReturnEibresp
			                 ,LS_RETURN_EIBRESP_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("lsReturnEibresp", beginLsReturnEibresp,LS_RETURN_EIBRESP_LEN);
    }
   	}
     int localLsReturnEibresp2Counter = -1;
     public boolean isLsReturnEibresp2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsReturnEibresp2Counter != sharedCounter;
         localLsReturnEibresp2Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of lsReturnEibresp2
	 *	@return lsReturnEibresp2
	 */
	public char[]  getLsReturnEibresp2String() {
	     return getCharArray(beginLsReturnEibresp2,LS_RETURN_EIBRESP_2_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsReturnEibresp2IsNumeric() {
	    return isNumeric(beginLsReturnEibresp2
	                    ,beginLsReturnEibresp2 + LS_RETURN_EIBRESP_2_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int LS_RETURN_EIBRESP_2_LEN = 8;
  	/**
	 * serializeLsReturnEibresp2
	 */
	protected void serializeLsReturnEibresp2(long lsReturnEibresp2) {
		 putNumber(beginLsReturnEibresp2,lsReturnEibresp2,LS_RETURN_EIBRESP_2_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localLsReturnEibresp2Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeLsReturnEibresp2
	 */
   	protected  long serializeLsReturnEibresp2(char[] value) {
	    long  lsReturnEibresp2;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    lsReturnEibresp2 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginLsReturnEibresp2
		       ,8
		      );
		 localLsReturnEibresp2Counter = shareString.getSerializedField().getModifiedCounter();
		return  lsReturnEibresp2;
    }

   protected long checkLsReturnEibresp2MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshLsReturnEibresp2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshLsReturnEibresp2() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginLsReturnEibresp2
			                 ,LS_RETURN_EIBRESP_2_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("lsReturnEibresp2", beginLsReturnEibresp2,LS_RETURN_EIBRESP_2_LEN);
    }
   	}




}
  
