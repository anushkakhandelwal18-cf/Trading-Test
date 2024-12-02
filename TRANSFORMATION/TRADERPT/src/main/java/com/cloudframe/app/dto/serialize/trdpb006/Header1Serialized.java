package com.cloudframe.app.dto.serialize.trdpb006;

/**
*  The class Header1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-02 at 13:50. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Header1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Header1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HEADER_1_LENGTH = 160;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginH1OrderStatusCode;
            protected  int beginH1OrderStatusDesc;
	
	/**
	* Constructor for Header1Serialized
	**/
    public Header1Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Header1Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HEADER_1_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginH1OrderStatusCode = getStartOffset() + 15;	// set offset for serialization
  
  
             beginH1OrderStatusDesc = getStartOffset() + 21;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localH1OrderStatusCodeCounter = -1;
     public boolean isH1OrderStatusCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localH1OrderStatusCodeCounter != sharedCounter;
         localH1OrderStatusCodeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of h1OrderStatusCode
	 *	@return h1OrderStatusCode
	 */
	public char[]  getH1OrderStatusCodeString() {
	     return getCharArray(beginH1OrderStatusCode,H_1_ORDER_STATUS_CODE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean h1OrderStatusCodeIsNumeric() {
	    return isNumeric(beginH1OrderStatusCode
	                    ,beginH1OrderStatusCode + H_1_ORDER_STATUS_CODE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int H_1_ORDER_STATUS_CODE_LEN = 3;
  	/**
	 * serializeH1OrderStatusCode
	 */
	protected void serializeH1OrderStatusCode(int h1OrderStatusCode) {
		 putNumber(beginH1OrderStatusCode,h1OrderStatusCode,H_1_ORDER_STATUS_CODE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localH1OrderStatusCodeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeH1OrderStatusCode
	 */
   	protected  int serializeH1OrderStatusCode(char[] value) {
	    int  h1OrderStatusCode;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    h1OrderStatusCode = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginH1OrderStatusCode
		       ,3
		      );
		 localH1OrderStatusCodeCounter = shareString.getSerializedField().getModifiedCounter();
		return  h1OrderStatusCode;
    }

   protected int checkH1OrderStatusCodeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshH1OrderStatusCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshH1OrderStatusCode() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginH1OrderStatusCode
			                 ,H_1_ORDER_STATUS_CODE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("h1OrderStatusCode", beginH1OrderStatusCode,H_1_ORDER_STATUS_CODE_LEN);
    }
   	}
     int localH1OrderStatusDescCounter = -1;
     public boolean isH1OrderStatusDescModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localH1OrderStatusDescCounter != sharedCounter;
         localH1OrderStatusDescCounter = sharedCounter; return hasModified;
     }
	protected static final int H_1_ORDER_STATUS_DESC_LEN = 20;
	/**
	 * 	serialize this H1OrderStatusDesc
	 */
   protected void serializeH1OrderStatusDesc(char[] h1OrderStatusDesc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(h1OrderStatusDesc,0,getStringValue(),beginH1OrderStatusDesc,H_1_ORDER_STATUS_DESC_LEN);
       localH1OrderStatusDescCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkH1OrderStatusDescConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshH1OrderStatusDesc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshH1OrderStatusDesc() {	 
   		return (substring(getStringValue(),beginH1OrderStatusDesc,beginH1OrderStatusDesc + H_1_ORDER_STATUS_DESC_LEN));
   	}




}
  
