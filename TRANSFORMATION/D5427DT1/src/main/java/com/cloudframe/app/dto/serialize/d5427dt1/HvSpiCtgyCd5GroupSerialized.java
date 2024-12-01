package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class HvSpiCtgyCd5GroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HvSpiCtgyCd5GroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HvSpiCtgyCd5GroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HV_SPI_CTGY_CD_5_GROUP_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHvSpiCtgyCd5;
	
	/**
	* Constructor for HvSpiCtgyCd5GroupSerialized
	**/
    public HvSpiCtgyCd5GroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for HvSpiCtgyCd5GroupSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HvSpiCtgyCd5GroupSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this HvSpiCtgyCd5GroupSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,120); // serialize this field at offset 120 by default 
    }
    
	/**
	* sets parent for this HvSpiCtgyCd5GroupSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 120 by default
    }    
	/**
	* initializes the field in HvSpiCtgyCd5GroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HV_SPI_CTGY_CD_5_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHvSpiCtgyCd5 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localHvSpiCtgyCd5Counter = -1;
     public boolean isHvSpiCtgyCd5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHvSpiCtgyCd5Counter != sharedCounter;
         localHvSpiCtgyCd5Counter = sharedCounter; return hasModified;
     }
	protected static final int HV_SPI_CTGY_CD_5_LEN = 2;
	/**
	 * 	serialize this HvSpiCtgyCd5
	 */
   protected void serializeHvSpiCtgyCd5(char[] hvSpiCtgyCd5) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hvSpiCtgyCd5,0,getStringValue(),beginHvSpiCtgyCd5,HV_SPI_CTGY_CD_5_LEN);
       localHvSpiCtgyCd5Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHvSpiCtgyCd5Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshHvSpiCtgyCd5 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHvSpiCtgyCd5() {	 
   		return (substring(getStringValue(),beginHvSpiCtgyCd5,beginHvSpiCtgyCd5 + HV_SPI_CTGY_CD_5_LEN));
   	}




}
  
