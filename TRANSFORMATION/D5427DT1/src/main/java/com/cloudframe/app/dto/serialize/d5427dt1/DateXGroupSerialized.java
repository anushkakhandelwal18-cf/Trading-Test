package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class DateXGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DateXGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DateXGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DATE_XGROUP_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDateX;
            protected  int beginDate9;
	
	/**
	* Constructor for DateXGroupSerialized
	**/
    public DateXGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DateXGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DATE_XGROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDateX = getStartOffset() + 0;	// set offset for serialization
  
             beginDate9 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDateXCounter = -1;
     public boolean isDateXModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDateXCounter != sharedCounter;
         localDateXCounter = sharedCounter; return hasModified;
     }
	protected static final int DATE_X_LEN = 8;
	/**
	 * 	serialize this DateX
	 */
   protected void serializeDateX(char[] dateX) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dateX,0,getStringValue(),beginDateX,DATE_X_LEN);
       localDateXCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDateXConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshDateX is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDateX() {	 
   		return (substring(getStringValue(),beginDateX,beginDateX + DATE_X_LEN));
   	}
     int localDate9Counter = -1;
     public boolean isDate9Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDate9Counter != sharedCounter;
         localDate9Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of date9
	 *	@return date9
	 */
	public char[]  getDate9String() {
	     return getCharArray(beginDate9,DATE_9_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean date9IsNumeric() {
	    return isNumeric(beginDate9
	                    ,beginDate9 + DATE_9_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DATE_9_LEN = 8;
  	/**
	 * serializeDate9
	 */
	protected void serializeDate9(long date9) {
		 putNumber(beginDate9,date9,DATE_9_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDate9Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDate9
	 */
   	protected  long serializeDate9(char[] value) {
	    long  date9;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    date9 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginDate9
		       ,8
		      );
		 localDate9Counter = shareString.getSerializedField().getModifiedCounter();
		return  date9;
    }

   protected long checkDate9MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDate9 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDate9() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginDate9
			                 ,DATE_9_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("date9", beginDate9,DATE_9_LEN);
    }
   	}




}
  
