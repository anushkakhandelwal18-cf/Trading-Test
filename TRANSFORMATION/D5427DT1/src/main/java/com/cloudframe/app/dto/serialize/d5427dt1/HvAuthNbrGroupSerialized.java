package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class HvAuthNbrGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HvAuthNbrGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HvAuthNbrGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HV_AUTH_NBR_GROUP_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHvAuthNbr;
	
	/**
	* Constructor for HvAuthNbrGroupSerialized
	**/
    public HvAuthNbrGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for HvAuthNbrGroupSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HvAuthNbrGroupSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this HvAuthNbrGroupSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,100); // serialize this field at offset 100 by default 
    }
    
	/**
	* sets parent for this HvAuthNbrGroupSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 100 by default
    }    
	/**
	* initializes the field in HvAuthNbrGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HV_AUTH_NBR_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHvAuthNbr = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localHvAuthNbrCounter = -1;
     public boolean isHvAuthNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHvAuthNbrCounter != sharedCounter;
         localHvAuthNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int HV_AUTH_NBR_LEN = 10;
	/**
	 * 	serialize this HvAuthNbr
	 */
   protected void serializeHvAuthNbr(char[] hvAuthNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hvAuthNbr,0,getStringValue(),beginHvAuthNbr,HV_AUTH_NBR_LEN);
       localHvAuthNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHvAuthNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshHvAuthNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHvAuthNbr() {	 
   		return (substring(getStringValue(),beginHvAuthNbr,beginHvAuthNbr + HV_AUTH_NBR_LEN));
   	}




}
  
