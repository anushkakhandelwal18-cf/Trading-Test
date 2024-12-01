package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class SaveRecType4FixedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SaveRecType4FixedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SaveRecType4FixedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SAVE_REC_TYPE_4_FIXED_LENGTH = 1170;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for SaveRecType4FixedSerialized
	**/
    public SaveRecType4FixedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SaveRecType4FixedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SaveRecType4FixedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SaveRecType4FixedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this SaveRecType4FixedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in SaveRecType4FixedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SAVE_REC_TYPE_4_FIXED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
	   /*  end of offset */
	}




}
  
