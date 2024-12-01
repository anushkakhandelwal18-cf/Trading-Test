package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class Dt1ClaimKeyTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Dt1ClaimKeyTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Dt1ClaimKeyTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_1_CLAIM_KEY_TABLE_LENGTH = 5559;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Dt1ClaimKeyTableSerialized
	**/
    public Dt1ClaimKeyTableSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Dt1ClaimKeyTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_1_CLAIM_KEY_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




     private int dependValue = 0;  
     
  	 public void setDependingValue(int dependValue) {
	   this.dependValue = dependValue;
  	 }

     public int getVariableLength() {
     	return 0 + (dependValue *  51);
     }
     
     public int getVariableLength(int idx) {
     	return 0 + (idx *  51);
     }
}
  
