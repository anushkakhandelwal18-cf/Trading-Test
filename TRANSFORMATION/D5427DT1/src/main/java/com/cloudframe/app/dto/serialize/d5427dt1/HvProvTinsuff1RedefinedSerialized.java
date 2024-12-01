package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class HvProvTinsuff1RedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HvProvTinsuff1RedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HvProvTinsuff1RedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HV_PROV_TINSUFF_1_REDEFINED_LENGTH = 15;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHvProvTin1;
	
	/**
	* Constructor for HvProvTinsuff1RedefinedSerialized
	**/
    public HvProvTinsuff1RedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for HvProvTinsuff1RedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HvProvTinsuff1RedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this HvProvTinsuff1RedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,71); // serialize this field at offset 71 by default 
    }
    
	/**
	* sets parent for this HvProvTinsuff1RedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 71 by default
    }    
	/**
	* initializes the field in HvProvTinsuff1RedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HV_PROV_TINSUFF_1_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHvProvTin1 = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localHvProvTin1Counter = -1;
     public boolean isHvProvTin1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHvProvTin1Counter != sharedCounter;
         localHvProvTin1Counter = sharedCounter; return hasModified;
     }
	protected static final int HV_PROV_TIN_1_LEN = 9;
	/**
	 * 	serialize this HvProvTin1
	 */
   protected void serializeHvProvTin1(char[] hvProvTin1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hvProvTin1,0,getStringValue(),beginHvProvTin1,HV_PROV_TIN_1_LEN);
       localHvProvTin1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHvProvTin1Constraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshHvProvTin1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHvProvTin1() {	 
   		return (substring(getStringValue(),beginHvProvTin1,beginHvProvTin1 + HV_PROV_TIN_1_LEN));
   	}




}
  
