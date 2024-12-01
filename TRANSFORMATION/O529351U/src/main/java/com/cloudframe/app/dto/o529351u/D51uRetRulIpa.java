package com.cloudframe.app.dto.o529351u;

/**
*  The class D51uRetRulIpa is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class D51uRetRulIpa extends D51uRetRulIpaSerialized { 
   
			private List<D51uRetRuleIpa> d51uRetRuleIpa = new ArrayList<>();
    	
	
	/**
	* Constructor for D51uRetRulIpa
	**/
    public D51uRetRulIpa() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for D51uRetRulIpa. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uRetRulIpa(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of d51uRetRuleIpa
	 *  Corresponding COBOL Variable is D51U-RET-RULE-IPA
	 *	@return d51uRetRuleIpa
	 */
   public List<D51uRetRuleIpa> getD51uRetRuleIpa() {
       return d51uRetRuleIpa;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return d51uRetRuleIpa
	 */
	public D51uRetRuleIpa getD51uRetRuleIpa(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getD51uRetRuleIpa(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= D_51U_RET_RULE_IPA_SIZE) {
             	index = D_51U_RET_RULE_IPA_SIZE -1; // can't exceed max array size
             	logger.trace("d51uRetRuleIpa - Array index exceeded max Size {}, resetting it to max allowed",D_51U_RET_RULE_IPA_SIZE); 
	    }
		if (index >= d51uRetRuleIpa.size()) {
       		for (int fillIndex =  d51uRetRuleIpa.size() -1; fillIndex < index;fillIndex++) {
		       d51uRetRuleIpa.add(null);
		    }
			d51uRetRuleIpa.set(index,
			   	   	new D51uRetRuleIpa(this,beginD51uRetRuleIpa + index * D51uRetRuleIpa.getD51uRetRuleIpaFieldLength()) 
				                        ); 	
		} 
   	   D51uRetRuleIpa value = d51uRetRuleIpa.get(index);
   	   if (value == null) {
   	      d51uRetRuleIpa.set(index,
			   	   	new D51uRetRuleIpa(this,beginD51uRetRuleIpa + index * D51uRetRuleIpa.getD51uRetRuleIpaFieldLength()) 
				                        ); 
		  value = d51uRetRuleIpa.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update D51uRetRuleIpa at index with the passed value
	 *  Corresponding COBOL Variable is D51U-RET-RULE-IPA
	 *  @param index
	 *	@param value
	 */
  public void setD51uRetRuleIpa(int index,char[] value) {
   	getD51uRetRuleIpa(index).setString(value);
   }
   
	

	
	
	

		public static int getD51uRetRulIpaFieldLength() {
			return D_51U_RET_RUL_IPA_LENGTH;
		}

}
  
