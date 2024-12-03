package com.cloudframe.app.trdpb007.dto.serialize;

/**
*  The class W03Csq4biimSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-03 at 14:02. using version 5.0.0.162
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class W03Csq4biimSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(W03Csq4biimSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int W_03_CSQ_4BIIM_LENGTH = 113;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for W03Csq4biimSerialized
	**/
    public W03Csq4biimSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for W03Csq4biimSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public W03Csq4biimSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this W03Csq4biimSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this W03Csq4biimSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in W03Csq4biimSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(W_03_CSQ_4BIIM_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
