package com.cloudframe.app.dto.d529351u;

/**
*  The class D51uRetRulCpeFlgData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d529351u.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class D51uRetRulCpeFlgData extends D51uRetRulCpeFlgDataSerialized { 
   
			private List<D51uRetRulCpeFlg> d51uRetRulCpeFlg = new ArrayList<>();
    	
	
	/**
	* Constructor for D51uRetRulCpeFlgData
	**/
    public D51uRetRulCpeFlgData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for D51uRetRulCpeFlgData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uRetRulCpeFlgData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of d51uRetRulCpeFlg
	 *  Corresponding COBOL Variable is D51U-RET-RUL-CPE-FLG
	 *	@return d51uRetRulCpeFlg
	 */
   public List<D51uRetRulCpeFlg> getD51uRetRulCpeFlg() {
       return d51uRetRulCpeFlg;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return d51uRetRulCpeFlg
	 */
	public D51uRetRulCpeFlg getD51uRetRulCpeFlg(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getD51uRetRulCpeFlg(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= D_51U_RET_RUL_CPE_FLG_SIZE) {
             	index = D_51U_RET_RUL_CPE_FLG_SIZE -1; // can't exceed max array size
             	logger.trace("d51uRetRulCpeFlg - Array index exceeded max Size {}, resetting it to max allowed",D_51U_RET_RUL_CPE_FLG_SIZE); 
	    }
		if (index >= d51uRetRulCpeFlg.size()) {
       		for (int fillIndex =  d51uRetRulCpeFlg.size() -1; fillIndex < index;fillIndex++) {
		       d51uRetRulCpeFlg.add(null);
		    }
			d51uRetRulCpeFlg.set(index,
			   	   	new D51uRetRulCpeFlg(this,beginD51uRetRulCpeFlg + index * D51uRetRulCpeFlg.getD51uRetRulCpeFlgFieldLength()) 
				                        ); 	
		} 
   	   D51uRetRulCpeFlg value = d51uRetRulCpeFlg.get(index);
   	   if (value == null) {
   	      d51uRetRulCpeFlg.set(index,
			   	   	new D51uRetRulCpeFlg(this,beginD51uRetRulCpeFlg + index * D51uRetRulCpeFlg.getD51uRetRulCpeFlgFieldLength()) 
				                        ); 
		  value = d51uRetRulCpeFlg.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update D51uRetRulCpeFlg at index with the passed value
	 *  Corresponding COBOL Variable is D51U-RET-RUL-CPE-FLG
	 *  @param index
	 *	@param value
	 */
  public void setD51uRetRulCpeFlg(int index,char[] value) {
   	getD51uRetRulCpeFlg(index).setString(value);
   }
   
	

	
	
	

		public static int getD51uRetRulCpeFlgDataFieldLength() {
			return D_51U_RET_RUL_CPE_FLG_DATA_LENGTH;
		}

}
  
