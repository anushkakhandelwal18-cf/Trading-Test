package com.cloudframe.app.dto.o529351u;

/**
*  The class D51uRetRulFrToSvc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class D51uRetRulFrToSvc extends D51uRetRulFrToSvcSerialized { 
   
			private List<D51uRetRuleFromtoSvc> d51uRetRuleFromtoSvc = new ArrayList<>();
    	
	
	/**
	* Constructor for D51uRetRulFrToSvc
	**/
    public D51uRetRulFrToSvc() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for D51uRetRulFrToSvc. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uRetRulFrToSvc(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of d51uRetRuleFromtoSvc
	 *  Corresponding COBOL Variable is D51U-RET-RULE-FROMTO-SVC
	 *	@return d51uRetRuleFromtoSvc
	 */
   public List<D51uRetRuleFromtoSvc> getD51uRetRuleFromtoSvc() {
       return d51uRetRuleFromtoSvc;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return d51uRetRuleFromtoSvc
	 */
	public D51uRetRuleFromtoSvc getD51uRetRuleFromtoSvc(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getD51uRetRuleFromtoSvc(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= D_51U_RET_RULE_FROMTO_SVC_SIZE) {
             	index = D_51U_RET_RULE_FROMTO_SVC_SIZE -1; // can't exceed max array size
             	logger.trace("d51uRetRuleFromtoSvc - Array index exceeded max Size {}, resetting it to max allowed",D_51U_RET_RULE_FROMTO_SVC_SIZE); 
	    }
		if (index >= d51uRetRuleFromtoSvc.size()) {
       		for (int fillIndex =  d51uRetRuleFromtoSvc.size() -1; fillIndex < index;fillIndex++) {
		       d51uRetRuleFromtoSvc.add(null);
		    }
			d51uRetRuleFromtoSvc.set(index,
			   	   	new D51uRetRuleFromtoSvc(this,beginD51uRetRuleFromtoSvc + index * D51uRetRuleFromtoSvc.getD51uRetRuleFromtoSvcFieldLength()) 
				                        ); 	
		} 
   	   D51uRetRuleFromtoSvc value = d51uRetRuleFromtoSvc.get(index);
   	   if (value == null) {
   	      d51uRetRuleFromtoSvc.set(index,
			   	   	new D51uRetRuleFromtoSvc(this,beginD51uRetRuleFromtoSvc + index * D51uRetRuleFromtoSvc.getD51uRetRuleFromtoSvcFieldLength()) 
				                        ); 
		  value = d51uRetRuleFromtoSvc.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update D51uRetRuleFromtoSvc at index with the passed value
	 *  Corresponding COBOL Variable is D51U-RET-RULE-FROMTO-SVC
	 *  @param index
	 *	@param value
	 */
  public void setD51uRetRuleFromtoSvc(int index,char[] value) {
   	getD51uRetRuleFromtoSvc(index).setString(value);
   }
   
	

	
	
	

		public static int getD51uRetRulFrToSvcFieldLength() {
			return D_51U_RET_RUL_FR_TO_SVC_LENGTH;
		}

}
  
