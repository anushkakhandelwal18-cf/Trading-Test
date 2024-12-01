package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class SavMAttendingPhysicianIdSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SavMAttendingPhysicianIdSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SavMAttendingPhysicianIdSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SAV_MATTENDING_PHYSICIAN_ID_LENGTH = 30;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSavDrNmFst;
	
	/**
	* Constructor for SavMAttendingPhysicianIdSerialized
	**/
    public SavMAttendingPhysicianIdSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SavMAttendingPhysicianIdSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SavMAttendingPhysicianIdSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SavMAttendingPhysicianIdSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,88); // serialize this field at offset 88 by default 
    }
    
	/**
	* sets parent for this SavMAttendingPhysicianIdSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 88 by default
    }    
	/**
	* initializes the field in SavMAttendingPhysicianIdSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SAV_MATTENDING_PHYSICIAN_ID_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSavDrNmFst = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSavDrNmFstCounter = -1;
     public boolean isSavDrNmFstModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSavDrNmFstCounter != sharedCounter;
         localSavDrNmFstCounter = sharedCounter; return hasModified;
     }
	protected static final int SAV_DR_NM_FST_LEN = 10;
	/**
	 * 	serialize this SavDrNmFst
	 */
   protected void serializeSavDrNmFst(char[] savDrNmFst) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(savDrNmFst,0,getStringValue(),beginSavDrNmFst,SAV_DR_NM_FST_LEN);
       localSavDrNmFstCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSavDrNmFstConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshSavDrNmFst is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSavDrNmFst() {	 
   		return (substring(getStringValue(),beginSavDrNmFst,beginSavDrNmFst + SAV_DR_NM_FST_LEN));
   	}




}
  
