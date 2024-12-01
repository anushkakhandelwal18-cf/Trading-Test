package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class FcSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FcSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FcSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FC_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginConditionTokenValue;
	
	/**
	* Constructor for FcSerialized
	**/
    public FcSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for FcSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FcSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this FcSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,230); // serialize this field at offset 230 by default 
    }
    
	/**
	* sets parent for this FcSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 230 by default
    }    
	/**
	* initializes the field in FcSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginConditionTokenValue = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localConditionTokenValueCounter = -1;
     public boolean isConditionTokenValueModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localConditionTokenValueCounter != sharedCounter;
         localConditionTokenValueCounter = sharedCounter; return hasModified;
     }
	protected static final int CONDITION_TOKEN_VALUE_LEN = 8;
	/**
	 * 	serialize this ConditionTokenValue
	 */
   protected void serializeConditionTokenValue(char[] conditionTokenValue) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(conditionTokenValue,0,getStringValue(),beginConditionTokenValue,CONDITION_TOKEN_VALUE_LEN);
       localConditionTokenValueCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkConditionTokenValueConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshConditionTokenValue is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshConditionTokenValue() {	 
   		return (substring(getStringValue(),beginConditionTokenValue,beginConditionTokenValue + CONDITION_TOKEN_VALUE_LEN));
   	}




}
  
