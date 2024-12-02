package com.cloudframe.app.trdpb007.dto.serialize;

/**
*  The class PutBufferSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-02 at 13:21. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class PutBufferSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(PutBufferSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PUT_BUFFER_LENGTH = 113;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for PutBufferSerialized
	**/
    public PutBufferSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in PutBufferSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PUT_BUFFER_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
