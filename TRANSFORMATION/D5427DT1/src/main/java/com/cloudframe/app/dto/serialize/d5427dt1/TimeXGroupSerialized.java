package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class TimeXGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TimeXGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TimeXGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TIME_XGROUP_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTimeX;
            protected  int beginTime9;
	
	/**
	* Constructor for TimeXGroupSerialized
	**/
    public TimeXGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in TimeXGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TIME_XGROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTimeX = getStartOffset() + 0;	// set offset for serialization
  
             beginTime9 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localTimeXCounter = -1;
     public boolean isTimeXModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTimeXCounter != sharedCounter;
         localTimeXCounter = sharedCounter; return hasModified;
     }
	protected static final int TIME_X_LEN = 6;
	/**
	 * 	serialize this TimeX
	 */
   protected void serializeTimeX(char[] timeX) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(timeX,0,getStringValue(),beginTimeX,TIME_X_LEN);
       localTimeXCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTimeXConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshTimeX is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTimeX() {	 
   		return (substring(getStringValue(),beginTimeX,beginTimeX + TIME_X_LEN));
   	}
     int localTime9Counter = -1;
     public boolean isTime9Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTime9Counter != sharedCounter;
         localTime9Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of time9
	 *	@return time9
	 */
	public char[]  getTime9String() {
	     return getCharArray(beginTime9,TIME_9_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean time9IsNumeric() {
	    return isNumeric(beginTime9
	                    ,beginTime9 + TIME_9_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TIME_9_LEN = 6;
  	/**
	 * serializeTime9
	 */
	protected void serializeTime9(long time9) {
		 putNumber(beginTime9,time9,TIME_9_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTime9Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTime9
	 */
   	protected  long serializeTime9(char[] value) {
	    long  time9;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    time9 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginTime9
		       ,6
		      );
		 localTime9Counter = shareString.getSerializedField().getModifiedCounter();
		return  time9;
    }

   protected long checkTime9MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTime9 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTime9() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTime9
			                 ,TIME_9_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("time9", beginTime9,TIME_9_LEN);
    }
   	}




}
  
