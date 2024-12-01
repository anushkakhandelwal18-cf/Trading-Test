package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class HvExtrNtfyNbrGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HvExtrNtfyNbrGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HvExtrNtfyNbrGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HV_EXTR_NTFY_NBR_GROUP_LENGTH = 50;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHvExtrNtfyNbr;
	
	/**
	* Constructor for HvExtrNtfyNbrGroupSerialized
	**/
    public HvExtrNtfyNbrGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for HvExtrNtfyNbrGroupSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HvExtrNtfyNbrGroupSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this HvExtrNtfyNbrGroupSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,159); // serialize this field at offset 159 by default 
    }
    
	/**
	* sets parent for this HvExtrNtfyNbrGroupSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 159 by default
    }    
	/**
	* initializes the field in HvExtrNtfyNbrGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HV_EXTR_NTFY_NBR_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHvExtrNtfyNbr = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localHvExtrNtfyNbrCounter = -1;
     public boolean isHvExtrNtfyNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHvExtrNtfyNbrCounter != sharedCounter;
         localHvExtrNtfyNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int HV_EXTR_NTFY_NBR_LEN = 50;
	/**
	 * 	serialize this HvExtrNtfyNbr
	 */
   protected void serializeHvExtrNtfyNbr(char[] hvExtrNtfyNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hvExtrNtfyNbr,0,getStringValue(),beginHvExtrNtfyNbr,HV_EXTR_NTFY_NBR_LEN);
       localHvExtrNtfyNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHvExtrNtfyNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 50 ,false, false);
   }
    /**
	 *	refreshHvExtrNtfyNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHvExtrNtfyNbr() {	 
   		return (substring(getStringValue(),beginHvExtrNtfyNbr,beginHvExtrNtfyNbr + HV_EXTR_NTFY_NBR_LEN));
   	}




}
  
