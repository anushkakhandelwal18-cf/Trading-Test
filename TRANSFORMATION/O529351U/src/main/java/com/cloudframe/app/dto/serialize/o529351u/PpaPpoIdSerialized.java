package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class PpaPpoIdSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class PpaPpoIdSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(PpaPpoIdSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PPA_PPO_ID_LENGTH = 28;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for PpaPpoIdSerialized
	**/
    public PpaPpoIdSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for PpaPpoIdSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PpaPpoIdSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this PpaPpoIdSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,11981); // serialize this field at offset 11981 by default 
    }
    
	/**
	* sets parent for this PpaPpoIdSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 11981 by default
    }    
	/**
	* initializes the field in PpaPpoIdSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PPA_PPO_ID_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
