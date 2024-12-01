package com.cloudframe.app.dto.o529351u;

/**
*  The class PlanVarInputLines is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class PlanVarInputLines extends PlanVarInputLinesSerialized { 
   
			private List<PlanVarRec> planVarRec = new ArrayList<>();
    	
	
	/**
	* Constructor for PlanVarInputLines
	**/
    public PlanVarInputLines() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for PlanVarInputLines. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PlanVarInputLines(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of planVarRec
	 *  Corresponding COBOL Variable is WS-PLAN-VAR-REC
	 *	@return planVarRec
	 */
   public List<PlanVarRec> getPlanVarRec() {
       return planVarRec;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return planVarRec
	 */
	public PlanVarRec getPlanVarRec(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getPlanVarRec(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= PLAN_VAR_REC_SIZE) {
             	index = PLAN_VAR_REC_SIZE -1; // can't exceed max array size
             	logger.trace("planVarRec - Array index exceeded max Size {}, resetting it to max allowed",PLAN_VAR_REC_SIZE); 
	    }
		if (index >= planVarRec.size()) {
       		for (int fillIndex =  planVarRec.size() -1; fillIndex < index;fillIndex++) {
		       planVarRec.add(null);
		    }
			planVarRec.set(index,
			   	   	new PlanVarRec(this,beginPlanVarRec + index * PlanVarRec.getPlanVarRecFieldLength()) 
				                        ); 	
		} 
   	   PlanVarRec value = planVarRec.get(index);
   	   if (value == null) {
   	      planVarRec.set(index,
			   	   	new PlanVarRec(this,beginPlanVarRec + index * PlanVarRec.getPlanVarRecFieldLength()) 
				                        ); 
		  value = planVarRec.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update PlanVarRec at index with the passed value
	 *  Corresponding COBOL Variable is WS-PLAN-VAR-REC
	 *  @param index
	 *	@param value
	 */
  public void setPlanVarRec(int index,char[] value) {
   	getPlanVarRec(index).setString(value);
   }
   
	

	
	
	

		public static int getPlanVarInputLinesFieldLength() {
			return PLAN_VAR_INPUT_LINES_LENGTH;
		}

}
  
