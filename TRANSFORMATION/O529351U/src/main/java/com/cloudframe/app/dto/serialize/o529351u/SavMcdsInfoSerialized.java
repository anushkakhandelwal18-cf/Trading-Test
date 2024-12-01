package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class SavMcdsInfoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SavMcdsInfoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SavMcdsInfoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SAV_MCDS_INFO_LENGTH = 433;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSavMedcFailedDedpdAlloc;
	
	/**
	* Constructor for SavMcdsInfoSerialized
	**/
    public SavMcdsInfoSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SavMcdsInfoSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SavMcdsInfoSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SavMcdsInfoSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,589); // serialize this field at offset 589 by default 
    }
    
	/**
	* sets parent for this SavMcdsInfoSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 589 by default
    }    
	/**
	* initializes the field in SavMcdsInfoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SAV_MCDS_INFO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSavMedcFailedDedpdAlloc = getStartOffset() + 432;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSavMedcFailedDedpdAllocCounter = -1;
     public boolean isSavMedcFailedDedpdAllocModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSavMedcFailedDedpdAllocCounter != sharedCounter;
         localSavMedcFailedDedpdAllocCounter = sharedCounter; return hasModified;
     }
	protected static final int SAV_MEDC_FAILED_DEDPD_ALLOC_LEN = 1;
	/**
	 * 	serialize this SavMedcFailedDedpdAlloc
	 */
   protected void serializeSavMedcFailedDedpdAlloc(char[] savMedcFailedDedpdAlloc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(savMedcFailedDedpdAlloc,0,getStringValue(),beginSavMedcFailedDedpdAlloc,SAV_MEDC_FAILED_DEDPD_ALLOC_LEN);
       localSavMedcFailedDedpdAllocCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSavMedcFailedDedpdAllocConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSavMedcFailedDedpdAlloc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSavMedcFailedDedpdAlloc() {	 
   		return (substring(getStringValue(),beginSavMedcFailedDedpdAlloc,beginSavMedcFailedDedpdAlloc + SAV_MEDC_FAILED_DEDPD_ALLOC_LEN));
   	}




}
  
