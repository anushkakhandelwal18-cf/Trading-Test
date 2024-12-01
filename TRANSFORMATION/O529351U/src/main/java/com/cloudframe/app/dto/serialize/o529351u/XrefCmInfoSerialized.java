package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class XrefCmInfoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class XrefCmInfoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(XrefCmInfoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int XREF_CM_INFO_LENGTH = 252;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for XrefCmInfoSerialized
	**/
    public XrefCmInfoSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for XrefCmInfoSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public XrefCmInfoSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this XrefCmInfoSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2340); // serialize this field at offset 2340 by default 
    }
    
	/**
	* sets parent for this XrefCmInfoSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2340 by default
    }    
	/**
	* initializes the field in XrefCmInfoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(XREF_CM_INFO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
