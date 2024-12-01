package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class UGenericTranslation51Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class UGenericTranslation51Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(UGenericTranslation51Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int U_GENERIC_TRANSLATION_51_LENGTH = 9;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginUGenericTrnslGroup51;
           protected static final int U_GENERIC_TRNSL_GROUP_51_SIZE = 9;
	
	/**
	* Constructor for UGenericTranslation51Serialized
	**/
    public UGenericTranslation51Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for UGenericTranslation51Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public UGenericTranslation51Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this UGenericTranslation51Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,11940); // serialize this field at offset 11940 by default 
    }
    
	/**
	* sets parent for this UGenericTranslation51Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 11940 by default
    }    
	/**
	* initializes the field in UGenericTranslation51Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(U_GENERIC_TRANSLATION_51_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginUGenericTrnslGroup51 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int uGenericTrnslGroup51Size() {
			return U_GENERIC_TRNSL_GROUP_51_SIZE;
		}



}
  
