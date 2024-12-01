package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class FrontendHdPmtIcnRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FrontendHdPmtIcnRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FrontendHdPmtIcnRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FRONTEND_HD_PMT_ICN_RECORD_LENGTH = 1414;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for FrontendHdPmtIcnRecordSerialized
	**/
    public FrontendHdPmtIcnRecordSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FrontendHdPmtIcnRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FRONTEND_HD_PMT_ICN_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
