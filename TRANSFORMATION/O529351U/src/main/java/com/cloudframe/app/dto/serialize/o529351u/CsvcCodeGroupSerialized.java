package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class CsvcCodeGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CsvcCodeGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CsvcCodeGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CSVC_CODE_GROUP_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for CsvcCodeGroupSerialized
	**/
    public CsvcCodeGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in CsvcCodeGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CSVC_CODE_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
	   /*  end of offset */
	}




}
  
