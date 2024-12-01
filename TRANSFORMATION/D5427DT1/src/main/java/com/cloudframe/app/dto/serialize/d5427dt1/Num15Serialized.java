package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class Num15Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Num15Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Num15Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int NUM_15_LENGTH = 15;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginNum15X;
            protected  int beginNum159;
	
	/**
	* Constructor for Num15Serialized
	**/
    public Num15Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Num15Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(NUM_15_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginNum15X = getStartOffset() + 0;	// set offset for serialization
  
             beginNum159 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localNum15XCounter = -1;
     public boolean isNum15XModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNum15XCounter != sharedCounter;
         localNum15XCounter = sharedCounter; return hasModified;
     }
	protected static final int NUM_15_X_LEN = 15;
	/**
	 * 	serialize this Num15X
	 */
   protected void serializeNum15X(char[] num15X) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(num15X,0,getStringValue(),beginNum15X,NUM_15_X_LEN);
       localNum15XCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkNum15XConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshNum15X is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshNum15X() {	 
   		return (substring(getStringValue(),beginNum15X,beginNum15X + NUM_15_X_LEN));
   	}
     int localNum159Counter = -1;
     public boolean isNum159Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNum159Counter != sharedCounter;
         localNum159Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of num159
	 *	@return num159
	 */
	public char[]  getNum159String() {
	     return getCharArray(beginNum159,NUM_159_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num159IsNumeric() {
	    return isNumeric(beginNum159
	                    ,beginNum159 + NUM_159_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NUM_159_LEN = 15;
  	/**
	 * serializeNum159
	 */
	protected void serializeNum159(long num159) {
		 putNumber(beginNum159,num159,NUM_159_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNum159Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNum159
	 */
   	protected  long serializeNum159(char[] value) {
	    long  num159;
	    if(value.length >0 && value.length!= 15)
            value = new String(value).trim().toCharArray();
	    if (value.length < 15) value = pad(15, value, ' ', LEFT_PAD);
	    else if (value.length > 15) value = substring(value,0,15);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    num159 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(15,value,false/*isSigned?*/)
		       ,beginNum159
		       ,15
		      );
		 localNum159Counter = shareString.getSerializedField().getModifiedCounter();
		return  num159;
    }

   protected long checkNum159MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1P/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshNum159 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshNum159() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginNum159
			                 ,NUM_159_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("num159", beginNum159,NUM_159_LEN);
    }
   	}




}
  
