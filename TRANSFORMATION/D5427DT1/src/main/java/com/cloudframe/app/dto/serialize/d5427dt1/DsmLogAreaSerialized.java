package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class DsmLogAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DsmLogAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DsmLogAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DSM_LOG_AREA_LENGTH = 152;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for DsmLogAreaSerialized
	**/
    public DsmLogAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for DsmLogAreaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DsmLogAreaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this DsmLogAreaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,990); // serialize this field at offset 990 by default 
    }
    
	/**
	* sets parent for this DsmLogAreaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 990 by default
    }    
	/**
	* initializes the field in DsmLogAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DSM_LOG_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
