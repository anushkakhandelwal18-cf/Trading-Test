package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class HvFlnSrlNbrGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HvFlnSrlNbrGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HvFlnSrlNbrGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HV_FLN_SRL_NBR_GROUP_LENGTH = 5;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHvFlnSrlNbr;
	
	/**
	* Constructor for HvFlnSrlNbrGroupSerialized
	**/
    public HvFlnSrlNbrGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for HvFlnSrlNbrGroupSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HvFlnSrlNbrGroupSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this HvFlnSrlNbrGroupSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,91); // serialize this field at offset 91 by default 
    }
    
	/**
	* sets parent for this HvFlnSrlNbrGroupSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 91 by default
    }    
	/**
	* initializes the field in HvFlnSrlNbrGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HV_FLN_SRL_NBR_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHvFlnSrlNbr = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localHvFlnSrlNbrCounter = -1;
     public boolean isHvFlnSrlNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHvFlnSrlNbrCounter != sharedCounter;
         localHvFlnSrlNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int HV_FLN_SRL_NBR_LEN = 5;
	/**
	 * 	serialize this HvFlnSrlNbr
	 */
   protected void serializeHvFlnSrlNbr(char[] hvFlnSrlNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hvFlnSrlNbr,0,getStringValue(),beginHvFlnSrlNbr,HV_FLN_SRL_NBR_LEN);
       localHvFlnSrlNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHvFlnSrlNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshHvFlnSrlNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHvFlnSrlNbr() {	 
   		return (substring(getStringValue(),beginHvFlnSrlNbr,beginHvFlnSrlNbr + HV_FLN_SRL_NBR_LEN));
   	}




}
  
