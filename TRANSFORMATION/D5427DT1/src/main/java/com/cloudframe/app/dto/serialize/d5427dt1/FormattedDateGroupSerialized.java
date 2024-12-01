package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class FormattedDateGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FormattedDateGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FormattedDateGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FORMATTED_DATE_GROUP_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFormattedDate;
	
	/**
	* Constructor for FormattedDateGroupSerialized
	**/
    public FormattedDateGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FormattedDateGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FORMATTED_DATE_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFormattedDate = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFormattedDateCounter = -1;
     public boolean isFormattedDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFormattedDateCounter != sharedCounter;
         localFormattedDateCounter = sharedCounter; return hasModified;
     }
	protected static final int FORMATTED_DATE_LEN = 80;
	/**
	 * 	serialize this FormattedDate
	 */
   protected void serializeFormattedDate(char[] formattedDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(formattedDate,0,getStringValue(),beginFormattedDate,FORMATTED_DATE_LEN);
       localFormattedDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFormattedDateConstraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
    /**
	 *	refreshFormattedDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFormattedDate() {	 
   		return (substring(getStringValue(),beginFormattedDate,beginFormattedDate + FORMATTED_DATE_LEN));
   	}




}
  
