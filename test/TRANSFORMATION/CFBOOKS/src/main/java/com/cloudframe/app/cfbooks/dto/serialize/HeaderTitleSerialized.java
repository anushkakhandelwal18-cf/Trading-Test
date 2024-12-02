package com.cloudframe.app.cfbooks.dto.serialize;

/**
*  The class HeaderTitleSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-02 at 03:00. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HeaderTitleSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HeaderTitleSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HEADER_TITLE_LENGTH = 132;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDateR;
	
	/**
	* Constructor for HeaderTitleSerialized
	**/
    public HeaderTitleSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in HeaderTitleSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HEADER_TITLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
             beginDateR = getStartOffset() + 121;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDateRCounter = -1;
     public boolean isDateRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDateRCounter != sharedCounter;
         localDateRCounter = sharedCounter; return hasModified;
     }
	protected static final int DATE_R_LEN = 10;
	/**
	 * 	serialize this DateR
	 */
   protected void serializeDateR(char[] dateR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dateR,0,getStringValue(),beginDateR,DATE_R_LEN);
       localDateRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDateRConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshDateR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDateR() {	 
   		return (substring(getStringValue(),beginDateR,beginDateR + DATE_R_LEN));
   	}




}
  
