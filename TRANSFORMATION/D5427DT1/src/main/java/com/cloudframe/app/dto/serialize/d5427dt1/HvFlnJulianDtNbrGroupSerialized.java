package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class HvFlnJulianDtNbrGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HvFlnJulianDtNbrGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HvFlnJulianDtNbrGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HV_FLN_JULIAN_DT_NBR_GROUP_LENGTH = 5;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHvFlnJulianDtNbr;
	
	/**
	* Constructor for HvFlnJulianDtNbrGroupSerialized
	**/
    public HvFlnJulianDtNbrGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for HvFlnJulianDtNbrGroupSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HvFlnJulianDtNbrGroupSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this HvFlnJulianDtNbrGroupSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,86); // serialize this field at offset 86 by default 
    }
    
	/**
	* sets parent for this HvFlnJulianDtNbrGroupSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 86 by default
    }    
	/**
	* initializes the field in HvFlnJulianDtNbrGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HV_FLN_JULIAN_DT_NBR_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHvFlnJulianDtNbr = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localHvFlnJulianDtNbrCounter = -1;
     public boolean isHvFlnJulianDtNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHvFlnJulianDtNbrCounter != sharedCounter;
         localHvFlnJulianDtNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int HV_FLN_JULIAN_DT_NBR_LEN = 5;
	/**
	 * 	serialize this HvFlnJulianDtNbr
	 */
   protected void serializeHvFlnJulianDtNbr(char[] hvFlnJulianDtNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hvFlnJulianDtNbr,0,getStringValue(),beginHvFlnJulianDtNbr,HV_FLN_JULIAN_DT_NBR_LEN);
       localHvFlnJulianDtNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHvFlnJulianDtNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshHvFlnJulianDtNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHvFlnJulianDtNbr() {	 
   		return (substring(getStringValue(),beginHvFlnJulianDtNbr,beginHvFlnJulianDtNbr + HV_FLN_JULIAN_DT_NBR_LEN));
   	}




}
  
