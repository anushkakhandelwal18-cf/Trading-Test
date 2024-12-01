package com.cloudframe.app.dto.o529351u;

/**
*  The class D51uRetRulFrCondPos is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class D51uRetRulFrCondPos extends D51uRetRulFrCondPosSerialized { 
   
			private List<D51uRetRuleFrCondPos> d51uRetRuleFrCondPos = new ArrayList<>();
    	
	
	/**
	* Constructor for D51uRetRulFrCondPos
	**/
    public D51uRetRulFrCondPos() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for D51uRetRulFrCondPos. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uRetRulFrCondPos(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of d51uRetRuleFrCondPos
	 *  Corresponding COBOL Variable is D51U-RET-RULE-FR-COND-POS
	 *	@return d51uRetRuleFrCondPos
	 */
   public List<D51uRetRuleFrCondPos> getD51uRetRuleFrCondPos() {
       return d51uRetRuleFrCondPos;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return d51uRetRuleFrCondPos
	 */
	public D51uRetRuleFrCondPos getD51uRetRuleFrCondPos(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getD51uRetRuleFrCondPos(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= D_51U_RET_RULE_FR_COND_POS_SIZE) {
             	index = D_51U_RET_RULE_FR_COND_POS_SIZE -1; // can't exceed max array size
             	logger.trace("d51uRetRuleFrCondPos - Array index exceeded max Size {}, resetting it to max allowed",D_51U_RET_RULE_FR_COND_POS_SIZE); 
	    }
		if (index >= d51uRetRuleFrCondPos.size()) {
       		for (int fillIndex =  d51uRetRuleFrCondPos.size() -1; fillIndex < index;fillIndex++) {
		       d51uRetRuleFrCondPos.add(null);
		    }
			d51uRetRuleFrCondPos.set(index,
			   	   	new D51uRetRuleFrCondPos(this,beginD51uRetRuleFrCondPos + index * D51uRetRuleFrCondPos.getD51uRetRuleFrCondPosFieldLength()) 
				                        ); 	
		} 
   	   D51uRetRuleFrCondPos value = d51uRetRuleFrCondPos.get(index);
   	   if (value == null) {
   	      d51uRetRuleFrCondPos.set(index,
			   	   	new D51uRetRuleFrCondPos(this,beginD51uRetRuleFrCondPos + index * D51uRetRuleFrCondPos.getD51uRetRuleFrCondPosFieldLength()) 
				                        ); 
		  value = d51uRetRuleFrCondPos.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update D51uRetRuleFrCondPos at index with the passed value
	 *  Corresponding COBOL Variable is D51U-RET-RULE-FR-COND-POS
	 *  @param index
	 *	@param value
	 */
  public void setD51uRetRuleFrCondPos(int index,char[] value) {
   	getD51uRetRuleFrCondPos(index).setString(value);
   }
   
	

	
	
	

		public static int getD51uRetRulFrCondPosFieldLength() {
			return D_51U_RET_RUL_FR_COND_POS_LENGTH;
		}

}
  
