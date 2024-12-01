package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class HvSpiCtgyCd2GroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HvSpiCtgyCd2GroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HvSpiCtgyCd2GroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HV_SPI_CTGY_CD_2_GROUP_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHvSpiCtgyCd2;
	
	/**
	* Constructor for HvSpiCtgyCd2GroupSerialized
	**/
    public HvSpiCtgyCd2GroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for HvSpiCtgyCd2GroupSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HvSpiCtgyCd2GroupSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this HvSpiCtgyCd2GroupSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,114); // serialize this field at offset 114 by default 
    }
    
	/**
	* sets parent for this HvSpiCtgyCd2GroupSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 114 by default
    }    
	/**
	* initializes the field in HvSpiCtgyCd2GroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HV_SPI_CTGY_CD_2_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHvSpiCtgyCd2 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localHvSpiCtgyCd2Counter = -1;
     public boolean isHvSpiCtgyCd2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHvSpiCtgyCd2Counter != sharedCounter;
         localHvSpiCtgyCd2Counter = sharedCounter; return hasModified;
     }
	protected static final int HV_SPI_CTGY_CD_2_LEN = 2;
	/**
	 * 	serialize this HvSpiCtgyCd2
	 */
   protected void serializeHvSpiCtgyCd2(char[] hvSpiCtgyCd2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hvSpiCtgyCd2,0,getStringValue(),beginHvSpiCtgyCd2,HV_SPI_CTGY_CD_2_LEN);
       localHvSpiCtgyCd2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHvSpiCtgyCd2Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshHvSpiCtgyCd2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHvSpiCtgyCd2() {	 
   		return (substring(getStringValue(),beginHvSpiCtgyCd2,beginHvSpiCtgyCd2 + HV_SPI_CTGY_CD_2_LEN));
   	}




}
  
