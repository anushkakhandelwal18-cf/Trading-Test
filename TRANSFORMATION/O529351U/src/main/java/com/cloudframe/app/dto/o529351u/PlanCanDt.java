package com.cloudframe.app.dto.o529351u;

/**
*  The class PlanCanDt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class PlanCanDt extends PlanCanDtSerialized { 
   

								private int planCanCc;

								private int planCanYy;
	
	/**
	* Constructor for PlanCanDt
	**/
    public PlanCanDt() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for PlanCanDt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PlanCanDt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of planCanCc
	 *	@return planCanCc
	 */
	public int getPlanCanCc() throws CFException {
       if (isPlanCanCcModified()) { 
           planCanCc = refreshPlanCanCc();
        }
   		return planCanCc;
	}
	

	
	   
	/**
	 * 	Update PlanCanCc with the passed value
	 *  Corresponding COBOL Variable is WS-PLAN-CAN-CC
	 *	@param number
	 */
	public void setPlanCanCc(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    planCanCc = checkPlanCanCcMaxLimit(number); 
		serializePlanCanCc(planCanCc);
	}
	

	public void setPlanCanCc(long number) {
	    number = checkPlanCanCcMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPlanCanCc((int)number);
	}
	
	/**
	 * 	Update PlanCanCc with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlanCanCc(char[] value) throws CFException {
		 planCanCc = serializePlanCanCc(value);
	}
	/**
	 * 	Update PlanCanCc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlanCanCcString(char[] value) throws CFException {
		 setPlanCanCc(value);
	}
	/**
	 *	Returns the value of planCanYy
	 *	@return planCanYy
	 */
	public int getPlanCanYy() throws CFException {
       if (isPlanCanYyModified()) { 
           planCanYy = refreshPlanCanYy();
        }
   		return planCanYy;
	}
	

	
	   
	/**
	 * 	Update PlanCanYy with the passed value
	 *  Corresponding COBOL Variable is WS-PLAN-CAN-YY
	 *	@param number
	 */
	public void setPlanCanYy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    planCanYy = checkPlanCanYyMaxLimit(number); 
		serializePlanCanYy(planCanYy);
	}
	

	public void setPlanCanYy(long number) {
	    number = checkPlanCanYyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPlanCanYy((int)number);
	}
	
	/**
	 * 	Update PlanCanYy with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlanCanYy(char[] value) throws CFException {
		 planCanYy = serializePlanCanYy(value);
	}
	/**
	 * 	Update PlanCanYy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlanCanYyString(char[] value) throws CFException {
		 setPlanCanYy(value);
	}

	
	
	

		public static int getPlanCanDtFieldLength() {
			return PLAN_CAN_DT_LENGTH;
		}

}
  
