package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class SavFillerSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SavFillerSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SavFillerSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SAV_FILLER_LENGTH = 11;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for SavFillerSerialized
	**/
    public SavFillerSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SavFillerSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SavFillerSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SavFillerSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,186); // serialize this field at offset 186 by default 
    }
    
	/**
	* sets parent for this SavFillerSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 186 by default
    }    
	/**
	* initializes the field in SavFillerSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SAV_FILLER_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
