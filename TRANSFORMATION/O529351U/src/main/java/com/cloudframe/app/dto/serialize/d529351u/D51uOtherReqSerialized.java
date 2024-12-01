package com.cloudframe.app.dto.serialize.d529351u;

/**
*  The class D51uOtherReqSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class D51uOtherReqSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(D51uOtherReqSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int D_51U_OTHER_REQ_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginD51uReqDosDate;
	
	/**
	* Constructor for D51uOtherReqSerialized
	**/
    public D51uOtherReqSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for D51uOtherReqSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uOtherReqSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this D51uOtherReqSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,54); // serialize this field at offset 54 by default 
    }
    
	/**
	* sets parent for this D51uOtherReqSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 54 by default
    }    
	/**
	* initializes the field in D51uOtherReqSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(D_51U_OTHER_REQ_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginD51uReqDosDate = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localD51uReqDosDateCounter = -1;
     public boolean isD51uReqDosDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uReqDosDateCounter != sharedCounter;
         localD51uReqDosDateCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_REQ_DOS_DATE_LEN = 8;
	/**
	 * 	serialize this D51uReqDosDate
	 */
   protected void serializeD51uReqDosDate(char[] d51uReqDosDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uReqDosDate,0,getStringValue(),beginD51uReqDosDate,D_51U_REQ_DOS_DATE_LEN);
       localD51uReqDosDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uReqDosDateConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshD51uReqDosDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uReqDosDate() {	 
   		return (substring(getStringValue(),beginD51uReqDosDate,beginD51uReqDosDate + D_51U_REQ_DOS_DATE_LEN));
   	}




}
  
