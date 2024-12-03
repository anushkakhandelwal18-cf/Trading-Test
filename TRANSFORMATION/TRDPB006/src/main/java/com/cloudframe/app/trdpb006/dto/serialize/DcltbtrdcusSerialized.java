package com.cloudframe.app.trdpb006.dto.serialize;

/**
*  The class DcltbtrdcusSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-03 at 15:03. using version 5.0.0.163
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DcltbtrdcusSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DcltbtrdcusSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DCLTBTRDCUS_LENGTH = 56;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCusDescription;
	
	/**
	* Constructor for DcltbtrdcusSerialized
	**/
    public DcltbtrdcusSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DcltbtrdcusSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DCLTBTRDCUS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCusDescription = getStartOffset() + 15;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCusDescriptionCounter = -1;
     public boolean isCusDescriptionModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCusDescriptionCounter != sharedCounter;
         localCusDescriptionCounter = sharedCounter; return hasModified;
     }
	protected static final int CUS_DESCRIPTION_LEN = 40;
	/**
	 * 	serialize this CusDescription
	 */
   protected void serializeCusDescription(char[] cusDescription) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cusDescription,0,getStringValue(),beginCusDescription,CUS_DESCRIPTION_LEN);
       localCusDescriptionCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCusDescriptionConstraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshCusDescription is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCusDescription() {	 
   		return (substring(getStringValue(),beginCusDescription,beginCusDescription + CUS_DESCRIPTION_LEN));
   	}




}
  
