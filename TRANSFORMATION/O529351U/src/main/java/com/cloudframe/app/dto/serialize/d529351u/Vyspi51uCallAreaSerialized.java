package com.cloudframe.app.dto.serialize.d529351u;

/**
*  The class Vyspi51uCallAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Vyspi51uCallAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Vyspi51uCallAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int VYSPI_51U_CALL_AREA_LENGTH = 880857;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Vyspi51uCallAreaSerialized
	**/
    public Vyspi51uCallAreaSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Vyspi51uCallAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(VYSPI_51U_CALL_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
	   /*  end of offset */
	}




}
  
