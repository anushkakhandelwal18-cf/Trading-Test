package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class IPicstrSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IPicstrSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IPicstrSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int I_PICSTR_LENGTH = 82;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIPicstrLength;
            protected  int beginIPicstrString;
	
	/**
	* Constructor for IPicstrSerialized
	**/
    public IPicstrSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in IPicstrSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(I_PICSTR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIPicstrLength = getStartOffset() + 0;	// set offset for serialization
  
             beginIPicstrString = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localIPicstrLengthCounter = -1;
         public boolean isIPicstrLengthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIPicstrLengthCounter != sharedCounter;
            localIPicstrLengthCounter = sharedCounter; return hasModified; 
         }
   protected static final int I_PICSTR_LENGTH_LEN = 2;
  	/**
	 * serializeIPicstrLength
	 */
	protected void serializeIPicstrLength(short iPicstrLength) {
           replaceValue( //  save the value as string
                   getBinaryString( iPicstrLength,I_PICSTR_LENGTH_LEN)
                  ,beginIPicstrLength
                  ,I_PICSTR_LENGTH_LEN
                 );
            localIPicstrLengthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIPicstrLengthMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIPicstrLength is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIPicstrLength() {	 
			return (getShort(beginIPicstrLength));
   	}
     int localIPicstrStringCounter = -1;
     public boolean isIPicstrStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIPicstrStringCounter != sharedCounter;
         localIPicstrStringCounter = sharedCounter; return hasModified;
     }
	protected static final int I_PICSTR_STRING_LEN = 80;
	/**
	 * 	serialize this IPicstrString
	 */
   protected void serializeIPicstrString(char[] iPicstrString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(iPicstrString,0,getStringValue(),beginIPicstrString,I_PICSTR_STRING_LEN);
       localIPicstrStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIPicstrStringConstraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
    /**
	 *	refreshIPicstrString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIPicstrString() {	 
   		return (substring(getStringValue(),beginIPicstrString,beginIPicstrString + I_PICSTR_STRING_LEN));
   	}




}
  
