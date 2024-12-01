package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class Dt1ClmContainerSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Dt1ClmContainerSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Dt1ClmContainerSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_1_CLM_CONTAINER_LENGTH = 331216;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Dt1ClmContainerSerialized
	**/
    public Dt1ClmContainerSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Dt1ClmContainerSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_1_CLM_CONTAINER_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
	   /*  end of offset */
	}




     private int dependValue = 0;  
     
  	 public void setDependingValue(int dependValue) {
	   this.dependValue = dependValue;
  	 }

     public int getVariableLength() {
     	return 16 + (dependValue *  414);
     }
     
     public int getVariableLength(int idx) {
     	return 16 + (idx *  414);
     }
}
  
