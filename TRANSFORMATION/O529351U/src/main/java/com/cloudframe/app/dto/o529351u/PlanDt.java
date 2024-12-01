package com.cloudframe.app.dto.o529351u;

/**
*  The class PlanDt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class PlanDt extends PlanDtSerialized { 
   

								private int planCc;

								private int planYy;

								private int planMm;

								private int planDd;
	
	/**
	* Constructor for PlanDt
	**/
    public PlanDt() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for PlanDt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PlanDt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of planCc
	 *	@return planCc
	 */
	public int getPlanCc() throws CFException {
       if (isPlanCcModified()) { 
           planCc = refreshPlanCc();
        }
   		return planCc;
	}
	

	
	   
	/**
	 * 	Update PlanCc with the passed value
	 *  Corresponding COBOL Variable is WS-PLAN-CC
	 *	@param number
	 */
	public void setPlanCc(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    planCc = checkPlanCcMaxLimit(number); 
		serializePlanCc(planCc);
	}
	

	public void setPlanCc(long number) {
	    number = checkPlanCcMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPlanCc((int)number);
	}
	
	/**
	 * 	Update PlanCc with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlanCc(char[] value) throws CFException {
		 planCc = serializePlanCc(value);
	}
	/**
	 * 	Update PlanCc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlanCcString(char[] value) throws CFException {
		 setPlanCc(value);
	}
	/**
	 *	Returns the value of planYy
	 *	@return planYy
	 */
	public int getPlanYy() throws CFException {
       if (isPlanYyModified()) { 
           planYy = refreshPlanYy();
        }
   		return planYy;
	}
	

	
	   
	/**
	 * 	Update PlanYy with the passed value
	 *  Corresponding COBOL Variable is WS-PLAN-YY
	 *	@param number
	 */
	public void setPlanYy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    planYy = checkPlanYyMaxLimit(number); 
		serializePlanYy(planYy);
	}
	

	public void setPlanYy(long number) {
	    number = checkPlanYyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPlanYy((int)number);
	}
	
	/**
	 * 	Update PlanYy with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlanYy(char[] value) throws CFException {
		 planYy = serializePlanYy(value);
	}
	/**
	 * 	Update PlanYy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlanYyString(char[] value) throws CFException {
		 setPlanYy(value);
	}
	/**
	 *	Returns the value of planMm
	 *	@return planMm
	 */
	public int getPlanMm() throws CFException {
       if (isPlanMmModified()) { 
           planMm = refreshPlanMm();
        }
   		return planMm;
	}
	

	
	   
	/**
	 * 	Update PlanMm with the passed value
	 *  Corresponding COBOL Variable is WS-PLAN-MM
	 *	@param number
	 */
	public void setPlanMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    planMm = checkPlanMmMaxLimit(number); 
		serializePlanMm(planMm);
	}
	

	public void setPlanMm(long number) {
	    number = checkPlanMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPlanMm((int)number);
	}
	
	/**
	 * 	Update PlanMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlanMm(char[] value) throws CFException {
		 planMm = serializePlanMm(value);
	}
	/**
	 * 	Update PlanMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlanMmString(char[] value) throws CFException {
		 setPlanMm(value);
	}
	/**
	 *	Returns the value of planDd
	 *	@return planDd
	 */
	public int getPlanDd() throws CFException {
       if (isPlanDdModified()) { 
           planDd = refreshPlanDd();
        }
   		return planDd;
	}
	

	
	   
	/**
	 * 	Update PlanDd with the passed value
	 *  Corresponding COBOL Variable is WS-PLAN-DD
	 *	@param number
	 */
	public void setPlanDd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    planDd = checkPlanDdMaxLimit(number); 
		serializePlanDd(planDd);
	}
	

	public void setPlanDd(long number) {
	    number = checkPlanDdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPlanDd((int)number);
	}
	
	/**
	 * 	Update PlanDd with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlanDd(char[] value) throws CFException {
		 planDd = serializePlanDd(value);
	}
	/**
	 * 	Update PlanDd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlanDdString(char[] value) throws CFException {
		 setPlanDd(value);
	}

	
	
	

		public static int getPlanDtFieldLength() {
			return PLAN_DT_LENGTH;
		}

}
  
