package com.cloudframe.app.dto.d529351u;

/**
*  The class D51uRetRulKeys is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:50. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d529351u.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class D51uRetRulKeys extends D51uRetRulKeysSerialized { 
   
			private List<D51uRetRuleKeys> d51uRetRuleKeys = new ArrayList<>();
    	
	
	/**
	* Constructor for D51uRetRulKeys
	**/
    public D51uRetRulKeys() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for D51uRetRulKeys. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uRetRulKeys(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of d51uRetRuleKeys
	 *  Corresponding COBOL Variable is D51U-RET-RULE-KEYS
	 *	@return d51uRetRuleKeys
	 */
   public List<D51uRetRuleKeys> getD51uRetRuleKeys() {
       return d51uRetRuleKeys;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return d51uRetRuleKeys
	 */
	public D51uRetRuleKeys getD51uRetRuleKeys(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getD51uRetRuleKeys(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= D_51U_RET_RULE_KEYS_SIZE) {
             	index = D_51U_RET_RULE_KEYS_SIZE -1; // can't exceed max array size
             	logger.trace("d51uRetRuleKeys - Array index exceeded max Size {}, resetting it to max allowed",D_51U_RET_RULE_KEYS_SIZE); 
	    }
		if (index >= d51uRetRuleKeys.size()) {
       		for (int fillIndex =  d51uRetRuleKeys.size() -1; fillIndex < index;fillIndex++) {
		       d51uRetRuleKeys.add(null);
		    }
			d51uRetRuleKeys.set(index,
			   	   	new D51uRetRuleKeys(this,beginD51uRetRuleKeys + index * D51uRetRuleKeys.getD51uRetRuleKeysFieldLength()) 
				                        ); 	
		} 
   	   D51uRetRuleKeys value = d51uRetRuleKeys.get(index);
   	   if (value == null) {
   	      d51uRetRuleKeys.set(index,
			   	   	new D51uRetRuleKeys(this,beginD51uRetRuleKeys + index * D51uRetRuleKeys.getD51uRetRuleKeysFieldLength()) 
				                        ); 
		  value = d51uRetRuleKeys.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update D51uRetRuleKeys at index with the passed value
	 *  Corresponding COBOL Variable is D51U-RET-RULE-KEYS
	 *  @param index
	 *	@param value
	 */
  public void setD51uRetRuleKeys(int index,char[] value) {
   	getD51uRetRuleKeys(index).setString(value);
   }
   
	

	
	
	

		public static int getD51uRetRulKeysFieldLength() {
			return D_51U_RET_RUL_KEYS_LENGTH;
		}

}
  
