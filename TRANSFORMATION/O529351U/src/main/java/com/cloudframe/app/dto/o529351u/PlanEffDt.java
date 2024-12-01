package com.cloudframe.app.dto.o529351u;

/**
*  The class PlanEffDt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class PlanEffDt extends PlanEffDtSerialized { 
   

								private int planEffCc;

								private int planEffYy;
	
	/**
	* Constructor for PlanEffDt
	**/
    public PlanEffDt() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for PlanEffDt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PlanEffDt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of planEffCc
	 *	@return planEffCc
	 */
	public int getPlanEffCc() throws CFException {
       if (isPlanEffCcModified()) { 
           planEffCc = refreshPlanEffCc();
        }
   		return planEffCc;
	}
	

	
	   
	/**
	 * 	Update PlanEffCc with the passed value
	 *  Corresponding COBOL Variable is WS-PLAN-EFF-CC
	 *	@param number
	 */
	public void setPlanEffCc(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    planEffCc = checkPlanEffCcMaxLimit(number); 
		serializePlanEffCc(planEffCc);
	}
	

	public void setPlanEffCc(long number) {
	    number = checkPlanEffCcMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPlanEffCc((int)number);
	}
	
	/**
	 * 	Update PlanEffCc with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlanEffCc(char[] value) throws CFException {
		 planEffCc = serializePlanEffCc(value);
	}
	/**
	 * 	Update PlanEffCc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlanEffCcString(char[] value) throws CFException {
		 setPlanEffCc(value);
	}
	/**
	 *	Returns the value of planEffYy
	 *	@return planEffYy
	 */
	public int getPlanEffYy() throws CFException {
       if (isPlanEffYyModified()) { 
           planEffYy = refreshPlanEffYy();
        }
   		return planEffYy;
	}
	

	
	   
	/**
	 * 	Update PlanEffYy with the passed value
	 *  Corresponding COBOL Variable is WS-PLAN-EFF-YY
	 *	@param number
	 */
	public void setPlanEffYy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    planEffYy = checkPlanEffYyMaxLimit(number); 
		serializePlanEffYy(planEffYy);
	}
	

	public void setPlanEffYy(long number) {
	    number = checkPlanEffYyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPlanEffYy((int)number);
	}
	
	/**
	 * 	Update PlanEffYy with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlanEffYy(char[] value) throws CFException {
		 planEffYy = serializePlanEffYy(value);
	}
	/**
	 * 	Update PlanEffYy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlanEffYyString(char[] value) throws CFException {
		 setPlanEffYy(value);
	}

	
	
	

		public static int getPlanEffDtFieldLength() {
			return PLAN_EFF_DT_LENGTH;
		}

}
  
