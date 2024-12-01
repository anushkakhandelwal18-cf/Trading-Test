package com.cloudframe.app.dto.serialize.d529351u;

/**
*  The class D51uArrayDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class D51uArrayDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(D51uArrayDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int D_51U_ARRAY_DATA_LENGTH = 880506;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for D51uArrayDataSerialized
	**/
    public D51uArrayDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for D51uArrayDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uArrayDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this D51uArrayDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,351); // serialize this field at offset 351 by default 
    }
    
	/**
	* sets parent for this D51uArrayDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 351 by default
    }    
	/**
	* initializes the field in D51uArrayDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(D_51U_ARRAY_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
  
  
  
  
  
	   /*  end of offset */
	}




}
  
