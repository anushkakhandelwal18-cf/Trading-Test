package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class DfhcommareaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DfhcommareaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DfhcommareaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DFHCOMMAREA_LENGTH = 19037;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for DfhcommareaSerialized
	**/
    public DfhcommareaSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DfhcommareaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DFHCOMMAREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
	   /*  end of offset */
	}




     private int dependValue = 0;  
     
  	 public void setDependingValue(int dependValue) {
	   this.dependValue = dependValue;
  	 }

     public int getVariableLength() {
     	return 11981 + (dependValue *  28);
     }
     
     public int getVariableLength(int idx) {
     	return 11981 + (idx *  28);
     }
}
  
