package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class SqlvarSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SqlvarSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SqlvarSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SQLVAR_LENGTH = 44;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for SqlvarSerialized
	**/
    public SqlvarSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SqlvarSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SqlvarSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SqlvarSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,16); // serialize this field at offset 16 by default 
    }
    
	/**
	* sets parent for this SqlvarSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 16 by default
    }    
	/**
	* initializes the field in SqlvarSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SQLVAR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
	   /*  end of offset */
	}




}
  
