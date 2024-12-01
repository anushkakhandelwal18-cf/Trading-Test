package com.cloudframe.app.dto.d529351u;

/**
*  The class D51uRetRulIcd is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d529351u.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class D51uRetRulIcd extends D51uRetRulIcdSerialized { 
   
			private List<D51uRetRuleIcd> d51uRetRuleIcd = new ArrayList<>();
    	
	
	/**
	* Constructor for D51uRetRulIcd
	**/
    public D51uRetRulIcd() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for D51uRetRulIcd. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uRetRulIcd(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of d51uRetRuleIcd
	 *  Corresponding COBOL Variable is D51U-RET-RULE-ICD
	 *	@return d51uRetRuleIcd
	 */
   public List<D51uRetRuleIcd> getD51uRetRuleIcd() {
       return d51uRetRuleIcd;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return d51uRetRuleIcd
	 */
	public D51uRetRuleIcd getD51uRetRuleIcd(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getD51uRetRuleIcd(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= D_51U_RET_RULE_ICD_SIZE) {
             	index = D_51U_RET_RULE_ICD_SIZE -1; // can't exceed max array size
             	logger.trace("d51uRetRuleIcd - Array index exceeded max Size {}, resetting it to max allowed",D_51U_RET_RULE_ICD_SIZE); 
	    }
		if (index >= d51uRetRuleIcd.size()) {
       		for (int fillIndex =  d51uRetRuleIcd.size() -1; fillIndex < index;fillIndex++) {
		       d51uRetRuleIcd.add(null);
		    }
			d51uRetRuleIcd.set(index,
			   	   	new D51uRetRuleIcd(this,beginD51uRetRuleIcd + index * D51uRetRuleIcd.getD51uRetRuleIcdFieldLength()) 
				                        ); 	
		} 
   	   D51uRetRuleIcd value = d51uRetRuleIcd.get(index);
   	   if (value == null) {
   	      d51uRetRuleIcd.set(index,
			   	   	new D51uRetRuleIcd(this,beginD51uRetRuleIcd + index * D51uRetRuleIcd.getD51uRetRuleIcdFieldLength()) 
				                        ); 
		  value = d51uRetRuleIcd.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update D51uRetRuleIcd at index with the passed value
	 *  Corresponding COBOL Variable is D51U-RET-RULE-ICD
	 *  @param index
	 *	@param value
	 */
  public void setD51uRetRuleIcd(int index,char[] value) {
   	getD51uRetRuleIcd(index).setString(value);
   }
   
	

	
	
	

		public static int getD51uRetRulIcdFieldLength() {
			return D_51U_RET_RUL_ICD_LENGTH;
		}

}
  
