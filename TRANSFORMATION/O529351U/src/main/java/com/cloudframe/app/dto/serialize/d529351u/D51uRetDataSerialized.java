package com.cloudframe.app.dto.serialize.d529351u;

/**
*  The class D51uRetDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class D51uRetDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(D51uRetDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int D_51U_RET_DATA_LENGTH = 409959;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginD51uReturnData;
           protected static final int D_51U_RETURN_DATA_SIZE = 9999;
	
	/**
	* Constructor for D51uRetDataSerialized
	**/
    public D51uRetDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for D51uRetDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uRetDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this D51uRetDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,351); // serialize this field at offset 351 by default 
    }
    
	/**
	* sets parent for this D51uRetDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 351 by default
    }    
	/**
	* initializes the field in D51uRetDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(D_51U_RET_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginD51uReturnData = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int d51uReturnDataSize() {
			return D_51U_RETURN_DATA_SIZE;
		}



}
  
