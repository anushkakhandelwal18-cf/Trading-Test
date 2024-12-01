package com.cloudframe.app.dto.d529351u;

/**
*  The class D51uRetRulCauseData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d529351u.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class D51uRetRulCauseData extends D51uRetRulCauseDataSerialized { 
   
			private List<D51uRetRulCause> d51uRetRulCause = new ArrayList<>();
    	
	
	/**
	* Constructor for D51uRetRulCauseData
	**/
    public D51uRetRulCauseData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for D51uRetRulCauseData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uRetRulCauseData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of d51uRetRulCause
	 *  Corresponding COBOL Variable is D51U-RET-RUL-CAUSE
	 *	@return d51uRetRulCause
	 */
   public List<D51uRetRulCause> getD51uRetRulCause() {
       return d51uRetRulCause;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return d51uRetRulCause
	 */
	public D51uRetRulCause getD51uRetRulCause(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getD51uRetRulCause(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= D_51U_RET_RUL_CAUSE_SIZE) {
             	index = D_51U_RET_RUL_CAUSE_SIZE -1; // can't exceed max array size
             	logger.trace("d51uRetRulCause - Array index exceeded max Size {}, resetting it to max allowed",D_51U_RET_RUL_CAUSE_SIZE); 
	    }
		if (index >= d51uRetRulCause.size()) {
       		for (int fillIndex =  d51uRetRulCause.size() -1; fillIndex < index;fillIndex++) {
		       d51uRetRulCause.add(null);
		    }
			d51uRetRulCause.set(index,
			   	   	new D51uRetRulCause(this,beginD51uRetRulCause + index * D51uRetRulCause.getD51uRetRulCauseFieldLength()) 
				                        ); 	
		} 
   	   D51uRetRulCause value = d51uRetRulCause.get(index);
   	   if (value == null) {
   	      d51uRetRulCause.set(index,
			   	   	new D51uRetRulCause(this,beginD51uRetRulCause + index * D51uRetRulCause.getD51uRetRulCauseFieldLength()) 
				                        ); 
		  value = d51uRetRulCause.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update D51uRetRulCause at index with the passed value
	 *  Corresponding COBOL Variable is D51U-RET-RUL-CAUSE
	 *  @param index
	 *	@param value
	 */
  public void setD51uRetRulCause(int index,char[] value) {
   	getD51uRetRulCause(index).setString(value);
   }
   
	

	
	
	

		public static int getD51uRetRulCauseDataFieldLength() {
			return D_51U_RET_RUL_CAUSE_DATA_LENGTH;
		}

}
  
