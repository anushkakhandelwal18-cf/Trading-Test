package com.cloudframe.app.dto.o529351u;

/**
*  The class PlanDosDt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class PlanDosDt extends PlanDosDtSerialized { 
   

								private int planDosMm;

								private int planDosDd;

								private int planDosYy;
	
	/**
	* Constructor for PlanDosDt
	**/
    public PlanDosDt() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for PlanDosDt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PlanDosDt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of planDosMm
	 *	@return planDosMm
	 */
	public int getPlanDosMm() throws CFException {
       if (isPlanDosMmModified()) { 
           planDosMm = refreshPlanDosMm();
        }
   		return planDosMm;
	}
	

	
	   
	/**
	 * 	Update PlanDosMm with the passed value
	 *  Corresponding COBOL Variable is WS-PLAN-DOS-MM
	 *	@param number
	 */
	public void setPlanDosMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    planDosMm = checkPlanDosMmMaxLimit(number); 
		serializePlanDosMm(planDosMm);
	}
	

	public void setPlanDosMm(long number) {
	    number = checkPlanDosMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPlanDosMm((int)number);
	}
	
	/**
	 * 	Update PlanDosMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlanDosMm(char[] value) throws CFException {
		 planDosMm = serializePlanDosMm(value);
	}
	/**
	 * 	Update PlanDosMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlanDosMmString(char[] value) throws CFException {
		 setPlanDosMm(value);
	}
	/**
	 *	Returns the value of planDosDd
	 *	@return planDosDd
	 */
	public int getPlanDosDd() throws CFException {
       if (isPlanDosDdModified()) { 
           planDosDd = refreshPlanDosDd();
        }
   		return planDosDd;
	}
	

	
	   
	/**
	 * 	Update PlanDosDd with the passed value
	 *  Corresponding COBOL Variable is WS-PLAN-DOS-DD
	 *	@param number
	 */
	public void setPlanDosDd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    planDosDd = checkPlanDosDdMaxLimit(number); 
		serializePlanDosDd(planDosDd);
	}
	

	public void setPlanDosDd(long number) {
	    number = checkPlanDosDdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPlanDosDd((int)number);
	}
	
	/**
	 * 	Update PlanDosDd with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlanDosDd(char[] value) throws CFException {
		 planDosDd = serializePlanDosDd(value);
	}
	/**
	 * 	Update PlanDosDd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlanDosDdString(char[] value) throws CFException {
		 setPlanDosDd(value);
	}
	/**
	 *	Returns the value of planDosYy
	 *	@return planDosYy
	 */
	public int getPlanDosYy() throws CFException {
       if (isPlanDosYyModified()) { 
           planDosYy = refreshPlanDosYy();
        }
   		return planDosYy;
	}
	

	
	   
	/**
	 * 	Update PlanDosYy with the passed value
	 *  Corresponding COBOL Variable is WS-PLAN-DOS-YY
	 *	@param number
	 */
	public void setPlanDosYy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    planDosYy = checkPlanDosYyMaxLimit(number); 
		serializePlanDosYy(planDosYy);
	}
	

	public void setPlanDosYy(long number) {
	    number = checkPlanDosYyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPlanDosYy((int)number);
	}
	
	/**
	 * 	Update PlanDosYy with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlanDosYy(char[] value) throws CFException {
		 planDosYy = serializePlanDosYy(value);
	}
	/**
	 * 	Update PlanDosYy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlanDosYyString(char[] value) throws CFException {
		 setPlanDosYy(value);
	}

	
	
	

		public static int getPlanDosDtFieldLength() {
			return PLAN_DOS_DT_LENGTH;
		}

}
  
