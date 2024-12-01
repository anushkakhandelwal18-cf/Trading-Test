package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class OPicstrSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class OPicstrSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(OPicstrSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int O_PICSTR_LENGTH = 82;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginOPicstrLength;
            protected  int beginOPicstrString;
	
	/**
	* Constructor for OPicstrSerialized
	**/
    public OPicstrSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in OPicstrSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(O_PICSTR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginOPicstrLength = getStartOffset() + 0;	// set offset for serialization
  
             beginOPicstrString = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localOPicstrLengthCounter = -1;
         public boolean isOPicstrLengthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localOPicstrLengthCounter != sharedCounter;
            localOPicstrLengthCounter = sharedCounter; return hasModified; 
         }
   protected static final int O_PICSTR_LENGTH_LEN = 2;
  	/**
	 * serializeOPicstrLength
	 */
	protected void serializeOPicstrLength(short oPicstrLength) {
           replaceValue( //  save the value as string
                   getBinaryString( oPicstrLength,O_PICSTR_LENGTH_LEN)
                  ,beginOPicstrLength
                  ,O_PICSTR_LENGTH_LEN
                 );
            localOPicstrLengthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkOPicstrLengthMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshOPicstrLength is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshOPicstrLength() {	 
			return (getShort(beginOPicstrLength));
   	}
     int localOPicstrStringCounter = -1;
     public boolean isOPicstrStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOPicstrStringCounter != sharedCounter;
         localOPicstrStringCounter = sharedCounter; return hasModified;
     }
	protected static final int O_PICSTR_STRING_LEN = 80;
	/**
	 * 	serialize this OPicstrString
	 */
   protected void serializeOPicstrString(char[] oPicstrString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(oPicstrString,0,getStringValue(),beginOPicstrString,O_PICSTR_STRING_LEN);
       localOPicstrStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOPicstrStringConstraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
    /**
	 *	refreshOPicstrString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOPicstrString() {	 
   		return (substring(getStringValue(),beginOPicstrString,beginOPicstrString + O_PICSTR_STRING_LEN));
   	}




}
  
