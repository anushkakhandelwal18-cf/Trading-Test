package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class DsmCallAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DsmCallAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DsmCallAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DSM_CALL_AREA_LENGTH = 1142;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for DsmCallAreaSerialized
	**/
    public DsmCallAreaSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DsmCallAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DSM_CALL_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
	   /*  end of offset */
	}




}
  
