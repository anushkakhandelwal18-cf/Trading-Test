package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class HvInvnCtlNbrGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HvInvnCtlNbrGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HvInvnCtlNbrGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HV_INVN_CTL_NBR_GROUP_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHvInvnCtlNbr;
	
	/**
	* Constructor for HvInvnCtlNbrGroupSerialized
	**/
    public HvInvnCtlNbrGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for HvInvnCtlNbrGroupSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HvInvnCtlNbrGroupSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this HvInvnCtlNbrGroupSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,21); // serialize this field at offset 21 by default 
    }
    
	/**
	* sets parent for this HvInvnCtlNbrGroupSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 21 by default
    }    
	/**
	* initializes the field in HvInvnCtlNbrGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HV_INVN_CTL_NBR_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHvInvnCtlNbr = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localHvInvnCtlNbrCounter = -1;
     public boolean isHvInvnCtlNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHvInvnCtlNbrCounter != sharedCounter;
         localHvInvnCtlNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int HV_INVN_CTL_NBR_LEN = 10;
	/**
	 * 	serialize this HvInvnCtlNbr
	 */
   protected void serializeHvInvnCtlNbr(char[] hvInvnCtlNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hvInvnCtlNbr,0,getStringValue(),beginHvInvnCtlNbr,HV_INVN_CTL_NBR_LEN);
       localHvInvnCtlNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHvInvnCtlNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshHvInvnCtlNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHvInvnCtlNbr() {	 
   		return (substring(getStringValue(),beginHvInvnCtlNbr,beginHvInvnCtlNbr + HV_INVN_CTL_NBR_LEN));
   	}




}
  
