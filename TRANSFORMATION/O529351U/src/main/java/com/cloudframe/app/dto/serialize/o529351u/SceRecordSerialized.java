package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class SceRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SceRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SceRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SCE_RECORD_LENGTH = 48;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSceFromHcpcsCpt;
	
	/**
	* Constructor for SceRecordSerialized
	**/
    public SceRecordSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SceRecordSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SceRecordSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SceRecordSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this SceRecordSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in SceRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SCE_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginSceFromHcpcsCpt = getStartOffset() + 28;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSceFromHcpcsCptCounter = -1;
     public boolean isSceFromHcpcsCptModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSceFromHcpcsCptCounter != sharedCounter;
         localSceFromHcpcsCptCounter = sharedCounter; return hasModified;
     }
	protected static final int SCE_FROM_HCPCS_CPT_LEN = 5;
	/**
	 * 	serialize this SceFromHcpcsCpt
	 */
   protected void serializeSceFromHcpcsCpt(char[] sceFromHcpcsCpt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sceFromHcpcsCpt,0,getStringValue(),beginSceFromHcpcsCpt,SCE_FROM_HCPCS_CPT_LEN);
       localSceFromHcpcsCptCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSceFromHcpcsCptConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshSceFromHcpcsCpt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSceFromHcpcsCpt() {	 
   		return (substring(getStringValue(),beginSceFromHcpcsCpt,beginSceFromHcpcsCpt + SCE_FROM_HCPCS_CPT_LEN));
   	}




}
  
