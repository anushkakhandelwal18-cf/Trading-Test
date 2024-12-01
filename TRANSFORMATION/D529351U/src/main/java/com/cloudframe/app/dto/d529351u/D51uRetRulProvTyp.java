package com.cloudframe.app.dto.d529351u;

/**
*  The class D51uRetRulProvTyp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:50. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d529351u.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class D51uRetRulProvTyp extends D51uRetRulProvTypSerialized { 
   
			private List<D51uRetRuleProvTyp> d51uRetRuleProvTyp = new ArrayList<>();
    	
	
	/**
	* Constructor for D51uRetRulProvTyp
	**/
    public D51uRetRulProvTyp() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for D51uRetRulProvTyp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uRetRulProvTyp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of d51uRetRuleProvTyp
	 *  Corresponding COBOL Variable is D51U-RET-RULE-PROV-TYP
	 *	@return d51uRetRuleProvTyp
	 */
   public List<D51uRetRuleProvTyp> getD51uRetRuleProvTyp() {
       return d51uRetRuleProvTyp;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return d51uRetRuleProvTyp
	 */
	public D51uRetRuleProvTyp getD51uRetRuleProvTyp(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getD51uRetRuleProvTyp(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= D_51U_RET_RULE_PROV_TYP_SIZE) {
             	index = D_51U_RET_RULE_PROV_TYP_SIZE -1; // can't exceed max array size
             	logger.trace("d51uRetRuleProvTyp - Array index exceeded max Size {}, resetting it to max allowed",D_51U_RET_RULE_PROV_TYP_SIZE); 
	    }
		if (index >= d51uRetRuleProvTyp.size()) {
       		for (int fillIndex =  d51uRetRuleProvTyp.size() -1; fillIndex < index;fillIndex++) {
		       d51uRetRuleProvTyp.add(null);
		    }
			d51uRetRuleProvTyp.set(index,
			   	   	new D51uRetRuleProvTyp(this,beginD51uRetRuleProvTyp + index * D51uRetRuleProvTyp.getD51uRetRuleProvTypFieldLength()) 
				                        ); 	
		} 
   	   D51uRetRuleProvTyp value = d51uRetRuleProvTyp.get(index);
   	   if (value == null) {
   	      d51uRetRuleProvTyp.set(index,
			   	   	new D51uRetRuleProvTyp(this,beginD51uRetRuleProvTyp + index * D51uRetRuleProvTyp.getD51uRetRuleProvTypFieldLength()) 
				                        ); 
		  value = d51uRetRuleProvTyp.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update D51uRetRuleProvTyp at index with the passed value
	 *  Corresponding COBOL Variable is D51U-RET-RULE-PROV-TYP
	 *  @param index
	 *	@param value
	 */
  public void setD51uRetRuleProvTyp(int index,char[] value) {
   	getD51uRetRuleProvTyp(index).setString(value);
   }
   
	

	
	
	

		public static int getD51uRetRulProvTypFieldLength() {
			return D_51U_RET_RUL_PROV_TYP_LENGTH;
		}

}
  
