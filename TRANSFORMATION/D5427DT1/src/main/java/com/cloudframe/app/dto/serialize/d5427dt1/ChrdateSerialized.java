package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class ChrdateSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ChrdateSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ChrdateSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CHRDATE_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginChrdateLength;
            protected  int beginChrdateString;
	
	/**
	* Constructor for ChrdateSerialized
	**/
    public ChrdateSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ChrdateSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CHRDATE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginChrdateLength = getStartOffset() + 0;	// set offset for serialization
  
             beginChrdateString = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localChrdateLengthCounter = -1;
         public boolean isChrdateLengthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localChrdateLengthCounter != sharedCounter;
            localChrdateLengthCounter = sharedCounter; return hasModified; 
         }
   protected static final int CHRDATE_LENGTH_LEN = 2;
  	/**
	 * serializeChrdateLength
	 */
	protected void serializeChrdateLength(short chrdateLength) {
           replaceValue( //  save the value as string
                   getBinaryString( chrdateLength,CHRDATE_LENGTH_LEN)
                  ,beginChrdateLength
                  ,CHRDATE_LENGTH_LEN
                 );
            localChrdateLengthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkChrdateLengthMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshChrdateLength is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshChrdateLength() {	 
			return (getShort(beginChrdateLength));
   	}
     int localChrdateStringCounter = -1;
     public boolean isChrdateStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChrdateStringCounter != sharedCounter;
         localChrdateStringCounter = sharedCounter; return hasModified;
     }
	protected static final int CHRDATE_STRING_LEN = 10;
	/**
	 * 	serialize this ChrdateString
	 */
   protected void serializeChrdateString(char[] chrdateString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(chrdateString,0,getStringValue(),beginChrdateString,CHRDATE_STRING_LEN);
       localChrdateStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkChrdateStringConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshChrdateString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshChrdateString() {	 
   		return (substring(getStringValue(),beginChrdateString,beginChrdateString + CHRDATE_STRING_LEN));
   	}




}
  
