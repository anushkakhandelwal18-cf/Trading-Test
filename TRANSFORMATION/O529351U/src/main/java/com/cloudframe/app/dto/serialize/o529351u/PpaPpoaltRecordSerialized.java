package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class PpaPpoaltRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class PpaPpoaltRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(PpaPpoaltRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PPA_PPOALT_RECORD_LENGTH = 7076;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginPpaPpoId;
           protected static final int PPA_PPO_ID_SIZE = 252;
	
	/**
	* Constructor for PpaPpoaltRecordSerialized
	**/
    public PpaPpoaltRecordSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for PpaPpoaltRecordSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PpaPpoaltRecordSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this PpaPpoaltRecordSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,11961); // serialize this field at offset 11961 by default 
    }
    
	/**
	* sets parent for this PpaPpoaltRecordSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 11961 by default
    }    
	/**
	* initializes the field in PpaPpoaltRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PPA_PPOALT_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	        beginPpaPpoId = getStartOffset() + 20; // set offset for serialization
  
	   /*  end of offset */
	}

		public int ppaPpoIdSize() {
			return PPA_PPO_ID_SIZE;
		}



     private int dependValue = 0;  
     
  	 public void setDependingValue(int dependValue) {
	   this.dependValue = dependValue;
  	 }

     public int getVariableLength() {
     	return 20 + (dependValue *  28);
     }
     
     public int getVariableLength(int idx) {
     	return 20 + (idx *  28);
     }
}
  
