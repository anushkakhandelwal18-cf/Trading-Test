package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class HvSrvcCatgyCdGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HvSrvcCatgyCdGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HvSrvcCatgyCdGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HV_SRVC_CATGY_CD_GROUP_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHvSrvcCatgyCd;
	
	/**
	* Constructor for HvSrvcCatgyCdGroupSerialized
	**/
    public HvSrvcCatgyCdGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for HvSrvcCatgyCdGroupSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HvSrvcCatgyCdGroupSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this HvSrvcCatgyCdGroupSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,110); // serialize this field at offset 110 by default 
    }
    
	/**
	* sets parent for this HvSrvcCatgyCdGroupSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 110 by default
    }    
	/**
	* initializes the field in HvSrvcCatgyCdGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HV_SRVC_CATGY_CD_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHvSrvcCatgyCd = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localHvSrvcCatgyCdCounter = -1;
     public boolean isHvSrvcCatgyCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHvSrvcCatgyCdCounter != sharedCounter;
         localHvSrvcCatgyCdCounter = sharedCounter; return hasModified;
     }
	protected static final int HV_SRVC_CATGY_CD_LEN = 2;
	/**
	 * 	serialize this HvSrvcCatgyCd
	 */
   protected void serializeHvSrvcCatgyCd(char[] hvSrvcCatgyCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hvSrvcCatgyCd,0,getStringValue(),beginHvSrvcCatgyCd,HV_SRVC_CATGY_CD_LEN);
       localHvSrvcCatgyCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHvSrvcCatgyCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshHvSrvcCatgyCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHvSrvcCatgyCd() {	 
   		return (substring(getStringValue(),beginHvSrvcCatgyCd,beginHvSrvcCatgyCd + HV_SRVC_CATGY_CD_LEN));
   	}




}
  
