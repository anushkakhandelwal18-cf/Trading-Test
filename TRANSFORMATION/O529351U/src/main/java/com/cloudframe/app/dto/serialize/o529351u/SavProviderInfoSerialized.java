package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class SavProviderInfoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SavProviderInfoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SavProviderInfoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SAV_PROVIDER_INFO_LENGTH = 193;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSavHAttendingPhysicianId;
	
	/**
	* Constructor for SavProviderInfoSerialized
	**/
    public SavProviderInfoSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SavProviderInfoSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SavProviderInfoSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SavProviderInfoSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,58); // serialize this field at offset 58 by default 
    }
    
	/**
	* sets parent for this SavProviderInfoSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 58 by default
    }    
	/**
	* initializes the field in SavProviderInfoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SAV_PROVIDER_INFO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSavHAttendingPhysicianId = getStartOffset() + 30;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localSavHAttendingPhysicianIdCounter = -1;
     public boolean isSavHAttendingPhysicianIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSavHAttendingPhysicianIdCounter != sharedCounter;
         localSavHAttendingPhysicianIdCounter = sharedCounter; return hasModified;
     }
	protected static final int SAV_HATTENDING_PHYSICIAN_ID_LEN = 30;
	/**
	 * 	serialize this SavHAttendingPhysicianId
	 */
   protected void serializeSavHAttendingPhysicianId(char[] savHAttendingPhysicianId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(savHAttendingPhysicianId,0,getStringValue(),beginSavHAttendingPhysicianId,SAV_HATTENDING_PHYSICIAN_ID_LEN);
       localSavHAttendingPhysicianIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSavHAttendingPhysicianIdConstraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshSavHAttendingPhysicianId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSavHAttendingPhysicianId() {	 
   		return (substring(getStringValue(),beginSavHAttendingPhysicianId,beginSavHAttendingPhysicianId + SAV_HATTENDING_PHYSICIAN_ID_LEN));
   	}




}
  
