package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class LastBitXGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class LastBitXGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(LastBitXGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int LAST_BIT_XGROUP_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginLastBitX;
            protected  int beginLastBit9;
	
	/**
	* Constructor for LastBitXGroupSerialized
	**/
    public LastBitXGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in LastBitXGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(LAST_BIT_XGROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginLastBitX = getStartOffset() + 0;	// set offset for serialization
  
             beginLastBit9 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localLastBitXCounter = -1;
     public boolean isLastBitXModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLastBitXCounter != sharedCounter;
         localLastBitXCounter = sharedCounter; return hasModified;
     }
	protected static final int LAST_BIT_X_LEN = 1;
	/**
	 * 	serialize this LastBitX
	 */
   protected void serializeLastBitX(char[] lastBitX) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lastBitX,0,getStringValue(),beginLastBitX,LAST_BIT_X_LEN);
       localLastBitXCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLastBitXConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshLastBitX is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLastBitX() {	 
   		return (substring(getStringValue(),beginLastBitX,beginLastBitX + LAST_BIT_X_LEN));
   	}
     int localLastBit9Counter = -1;
     public boolean isLastBit9Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLastBit9Counter != sharedCounter;
         localLastBit9Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of lastBit9
	 *	@return lastBit9
	 */
	public char[]  getLastBit9String() {
	     return getCharArray(beginLastBit9,LAST_BIT_9_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lastBit9IsNumeric() {
	    return isNumeric(beginLastBit9
	                    ,beginLastBit9 + LAST_BIT_9_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int LAST_BIT_9_LEN = 1;
  	/**
	 * serializeLastBit9
	 */
	protected void serializeLastBit9(int lastBit9) {
		 putNumber(beginLastBit9,lastBit9,LAST_BIT_9_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localLastBit9Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeLastBit9
	 */
   	protected  int serializeLastBit9(char[] value) {
	    int  lastBit9;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    lastBit9 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginLastBit9
		       ,1
		      );
		 localLastBit9Counter = shareString.getSerializedField().getModifiedCounter();
		return  lastBit9;
    }

   protected int checkLastBit9MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshLastBit9 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshLastBit9() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginLastBit9
			                 ,LAST_BIT_9_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("lastBit9", beginLastBit9,LAST_BIT_9_LEN);
    }
   	}




}
  
