package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class Num3Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Num3Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Num3Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int NUM_3_LENGTH = 3;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginNum3X;
            protected  int beginNum39;
	
	/**
	* Constructor for Num3Serialized
	**/
    public Num3Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Num3Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(NUM_3_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginNum3X = getStartOffset() + 0;	// set offset for serialization
  
             beginNum39 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localNum3XCounter = -1;
     public boolean isNum3XModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNum3XCounter != sharedCounter;
         localNum3XCounter = sharedCounter; return hasModified;
     }
	protected static final int NUM_3_X_LEN = 3;
	/**
	 * 	serialize this Num3X
	 */
   protected void serializeNum3X(char[] num3X) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(num3X,0,getStringValue(),beginNum3X,NUM_3_X_LEN);
       localNum3XCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkNum3XConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshNum3X is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshNum3X() {	 
   		return (substring(getStringValue(),beginNum3X,beginNum3X + NUM_3_X_LEN));
   	}
     int localNum39Counter = -1;
     public boolean isNum39Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNum39Counter != sharedCounter;
         localNum39Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of num39
	 *	@return num39
	 */
	public char[]  getNum39String() {
	     return getCharArray(beginNum39,NUM_39_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num39IsNumeric() {
	    return isNumeric(beginNum39
	                    ,beginNum39 + NUM_39_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NUM_39_LEN = 3;
  	/**
	 * serializeNum39
	 */
	protected void serializeNum39(int num39) {
		 putNumber(beginNum39,num39,NUM_39_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNum39Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNum39
	 */
   	protected  int serializeNum39(char[] value) {
	    int  num39;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    num39 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginNum39
		       ,3
		      );
		 localNum39Counter = shareString.getSerializedField().getModifiedCounter();
		return  num39;
    }

   protected int checkNum39MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshNum39 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshNum39() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginNum39
			                 ,NUM_39_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("num39", beginNum39,NUM_39_LEN);
    }
   	}




}
  
