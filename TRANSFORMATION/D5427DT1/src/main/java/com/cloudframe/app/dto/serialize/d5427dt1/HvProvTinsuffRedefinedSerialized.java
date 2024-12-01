package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class HvProvTinsuffRedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HvProvTinsuffRedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HvProvTinsuffRedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HV_PROV_TINSUFF_REDEFINED_LENGTH = 15;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHvProvTin;
	
	/**
	* Constructor for HvProvTinsuffRedefinedSerialized
	**/
    public HvProvTinsuffRedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for HvProvTinsuffRedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HvProvTinsuffRedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this HvProvTinsuffRedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,56); // serialize this field at offset 56 by default 
    }
    
	/**
	* sets parent for this HvProvTinsuffRedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 56 by default
    }    
	/**
	* initializes the field in HvProvTinsuffRedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HV_PROV_TINSUFF_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHvProvTin = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localHvProvTinCounter = -1;
     public boolean isHvProvTinModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHvProvTinCounter != sharedCounter;
         localHvProvTinCounter = sharedCounter; return hasModified;
     }
	protected static final int HV_PROV_TIN_LEN = 9;
	/**
	 * 	serialize this HvProvTin
	 */
   protected void serializeHvProvTin(char[] hvProvTin) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hvProvTin,0,getStringValue(),beginHvProvTin,HV_PROV_TIN_LEN);
       localHvProvTinCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHvProvTinConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshHvProvTin is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHvProvTin() {	 
   		return (substring(getStringValue(),beginHvProvTin,beginHvProvTin + HV_PROV_TIN_LEN));
   	}




}
  
