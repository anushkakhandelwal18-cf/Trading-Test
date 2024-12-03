package com.cloudframe.app.file.records.serialize.trdpb006;

/**
*  The class ReporderRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-03 at 15:03. using version 5.0.0.163
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ReporderRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ReporderRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int REPORDER_RECORD_LENGTH = 160;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginReporderRecordString;
	
	/**
	* Constructor for ReporderRecordSerialized
	**/
    public ReporderRecordSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ReporderRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(REPORDER_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginReporderRecordString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localReporderRecordStringCounter = -1;
     public boolean isReporderRecordStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localReporderRecordStringCounter != sharedCounter;
         localReporderRecordStringCounter = sharedCounter; return hasModified;
     }
	protected static final int REPORDER_RECORD_STRING_LEN = 160;
	/**
	 * 	serialize this ReporderRecordString
	 */
   protected void serializeReporderRecordString(char[] reporderRecordString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(reporderRecordString,0,getStringValue(),beginReporderRecordString,REPORDER_RECORD_STRING_LEN);
       localReporderRecordStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkReporderRecordStringConstraints(char[] value) {
   			return super.checkConstraints(value , 160 ,false, false);
   }
    /**
	 *	refreshReporderRecordString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshReporderRecordString() {	 
   		return (substring(getStringValue(),beginReporderRecordString,beginReporderRecordString + REPORDER_RECORD_STRING_LEN));
   	}




}
  
