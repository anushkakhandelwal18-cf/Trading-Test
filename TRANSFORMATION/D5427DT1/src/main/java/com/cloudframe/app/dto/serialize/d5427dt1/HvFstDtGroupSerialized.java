package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class HvFstDtGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HvFstDtGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HvFstDtGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HV_FST_DT_GROUP_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHvFstDt;
	
	/**
	* Constructor for HvFstDtGroupSerialized
	**/
    public HvFstDtGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for HvFstDtGroupSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HvFstDtGroupSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this HvFstDtGroupSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,36); // serialize this field at offset 36 by default 
    }
    
	/**
	* sets parent for this HvFstDtGroupSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 36 by default
    }    
	/**
	* initializes the field in HvFstDtGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HV_FST_DT_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHvFstDt = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localHvFstDtCounter = -1;
     public boolean isHvFstDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHvFstDtCounter != sharedCounter;
         localHvFstDtCounter = sharedCounter; return hasModified;
     }
	protected static final int HV_FST_DT_LEN = 10;
	/**
	 * 	serialize this HvFstDt
	 */
   protected void serializeHvFstDt(char[] hvFstDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hvFstDt,0,getStringValue(),beginHvFstDt,HV_FST_DT_LEN);
       localHvFstDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHvFstDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshHvFstDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHvFstDt() {	 
   		return (substring(getStringValue(),beginHvFstDt,beginHvFstDt + HV_FST_DT_LEN));
   	}




}
  
