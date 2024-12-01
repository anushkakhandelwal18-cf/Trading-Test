package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class SavMcdsVariableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SavMcdsVariableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SavMcdsVariableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SAV_MCDS_VARIABLE_LENGTH = 23760;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginSavMcdsChargeInfo;
           protected static final int SAV_MCDS_CHARGE_INFO_SIZE = 60;
	
	/**
	* Constructor for SavMcdsVariableSerialized
	**/
    public SavMcdsVariableSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SavMcdsVariableSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SavMcdsVariableSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SavMcdsVariableSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,85); // serialize this field at offset 85 by default 
    }
    
	/**
	* sets parent for this SavMcdsVariableSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 85 by default
    }    
	/**
	* initializes the field in SavMcdsVariableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SAV_MCDS_VARIABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginSavMcdsChargeInfo = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int savMcdsChargeInfoSize() {
			return SAV_MCDS_CHARGE_INFO_SIZE;
		}



     private int dependValue = 0;  
     
  	 public void setDependingValue(int dependValue) {
	   this.dependValue = dependValue;
  	 }

     public int getVariableLength() {
     	return 0 + (dependValue *  396);
     }
     
     public int getVariableLength(int idx) {
     	return 0 + (idx *  396);
     }
}
  
