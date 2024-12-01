package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class HvLstSrvcDtGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HvLstSrvcDtGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HvLstSrvcDtGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HV_LST_SRVC_DT_GROUP_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHvLstSrvcDt;
	
	/**
	* Constructor for HvLstSrvcDtGroupSerialized
	**/
    public HvLstSrvcDtGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for HvLstSrvcDtGroupSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HvLstSrvcDtGroupSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this HvLstSrvcDtGroupSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,46); // serialize this field at offset 46 by default 
    }
    
	/**
	* sets parent for this HvLstSrvcDtGroupSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 46 by default
    }    
	/**
	* initializes the field in HvLstSrvcDtGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HV_LST_SRVC_DT_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHvLstSrvcDt = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localHvLstSrvcDtCounter = -1;
     public boolean isHvLstSrvcDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHvLstSrvcDtCounter != sharedCounter;
         localHvLstSrvcDtCounter = sharedCounter; return hasModified;
     }
	protected static final int HV_LST_SRVC_DT_LEN = 10;
	/**
	 * 	serialize this HvLstSrvcDt
	 */
   protected void serializeHvLstSrvcDt(char[] hvLstSrvcDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hvLstSrvcDt,0,getStringValue(),beginHvLstSrvcDt,HV_LST_SRVC_DT_LEN);
       localHvLstSrvcDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHvLstSrvcDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshHvLstSrvcDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHvLstSrvcDt() {	 
   		return (substring(getStringValue(),beginHvLstSrvcDt,beginHvLstSrvcDt + HV_LST_SRVC_DT_LEN));
   	}




}
  
