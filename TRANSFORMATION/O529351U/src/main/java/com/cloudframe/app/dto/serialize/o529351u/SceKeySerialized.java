package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class SceKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SceKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SceKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SCE_KEY_LENGTH = 17;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSceServiceCode;
	
	/**
	* Constructor for SceKeySerialized
	**/
    public SceKeySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SceKeySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SceKeySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SceKeySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this SceKeySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in SceKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SCE_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSceServiceCode = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSceServiceCodeCounter = -1;
     public boolean isSceServiceCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSceServiceCodeCounter != sharedCounter;
         localSceServiceCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int SCE_SERVICE_CODE_LEN = 6;
	/**
	 * 	serialize this SceServiceCode
	 */
   protected void serializeSceServiceCode(char[] sceServiceCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sceServiceCode,0,getStringValue(),beginSceServiceCode,SCE_SERVICE_CODE_LEN);
       localSceServiceCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSceServiceCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshSceServiceCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSceServiceCode() {	 
   		return (substring(getStringValue(),beginSceServiceCode,beginSceServiceCode + SCE_SERVICE_CODE_LEN));
   	}




}
  
