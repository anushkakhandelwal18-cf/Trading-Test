package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class HvSpiCtgyCd3GroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HvSpiCtgyCd3GroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HvSpiCtgyCd3GroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HV_SPI_CTGY_CD_3_GROUP_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHvSpiCtgyCd3;
	
	/**
	* Constructor for HvSpiCtgyCd3GroupSerialized
	**/
    public HvSpiCtgyCd3GroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for HvSpiCtgyCd3GroupSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HvSpiCtgyCd3GroupSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this HvSpiCtgyCd3GroupSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,116); // serialize this field at offset 116 by default 
    }
    
	/**
	* sets parent for this HvSpiCtgyCd3GroupSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 116 by default
    }    
	/**
	* initializes the field in HvSpiCtgyCd3GroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HV_SPI_CTGY_CD_3_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHvSpiCtgyCd3 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localHvSpiCtgyCd3Counter = -1;
     public boolean isHvSpiCtgyCd3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHvSpiCtgyCd3Counter != sharedCounter;
         localHvSpiCtgyCd3Counter = sharedCounter; return hasModified;
     }
	protected static final int HV_SPI_CTGY_CD_3_LEN = 2;
	/**
	 * 	serialize this HvSpiCtgyCd3
	 */
   protected void serializeHvSpiCtgyCd3(char[] hvSpiCtgyCd3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hvSpiCtgyCd3,0,getStringValue(),beginHvSpiCtgyCd3,HV_SPI_CTGY_CD_3_LEN);
       localHvSpiCtgyCd3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHvSpiCtgyCd3Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshHvSpiCtgyCd3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHvSpiCtgyCd3() {	 
   		return (substring(getStringValue(),beginHvSpiCtgyCd3,beginHvSpiCtgyCd3 + HV_SPI_CTGY_CD_3_LEN));
   	}




}
  
