package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class StsContainerSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class StsContainerSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(StsContainerSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int STS_CONTAINER_LENGTH = 1335;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for StsContainerSerialized
	**/
    public StsContainerSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in StsContainerSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(STS_CONTAINER_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
