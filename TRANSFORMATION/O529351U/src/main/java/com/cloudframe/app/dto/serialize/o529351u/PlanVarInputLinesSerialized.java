package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class PlanVarInputLinesSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class PlanVarInputLinesSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(PlanVarInputLinesSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PLAN_VAR_INPUT_LINES_LENGTH = 199980;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginPlanVarRec;
           protected static final int PLAN_VAR_REC_SIZE = 9999;
	
	/**
	* Constructor for PlanVarInputLinesSerialized
	**/
    public PlanVarInputLinesSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for PlanVarInputLinesSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PlanVarInputLinesSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this PlanVarInputLinesSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,4); // serialize this field at offset 4 by default 
    }
    
	/**
	* sets parent for this PlanVarInputLinesSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 4 by default
    }    
	/**
	* initializes the field in PlanVarInputLinesSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PLAN_VAR_INPUT_LINES_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginPlanVarRec = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int planVarRecSize() {
			return PLAN_VAR_REC_SIZE;
		}



}
  
