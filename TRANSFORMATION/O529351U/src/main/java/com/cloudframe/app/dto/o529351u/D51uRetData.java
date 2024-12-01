package com.cloudframe.app.dto.o529351u;

/**
*  The class D51uRetData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class D51uRetData extends D51uRetDataSerialized { 
   
			private List<D51uReturnData> d51uReturnData = new ArrayList<>();
    	
	
	/**
	* Constructor for D51uRetData
	**/
    public D51uRetData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for D51uRetData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uRetData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of d51uReturnData
	 *  Corresponding COBOL Variable is D51U-RETURN-DATA
	 *	@return d51uReturnData
	 */
   public List<D51uReturnData> getD51uReturnData() {
       return d51uReturnData;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return d51uReturnData
	 */
	public D51uReturnData getD51uReturnData(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getD51uReturnData(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= D_51U_RETURN_DATA_SIZE) {
             	index = D_51U_RETURN_DATA_SIZE -1; // can't exceed max array size
             	logger.trace("d51uReturnData - Array index exceeded max Size {}, resetting it to max allowed",D_51U_RETURN_DATA_SIZE); 
	    }
		if (index >= d51uReturnData.size()) {
       		for (int fillIndex =  d51uReturnData.size() -1; fillIndex < index;fillIndex++) {
		       d51uReturnData.add(null);
		    }
			d51uReturnData.set(index,
			   	   	new D51uReturnData(this,beginD51uReturnData + index * D51uReturnData.getD51uReturnDataFieldLength()) 
				                        ); 	
		} 
   	   D51uReturnData value = d51uReturnData.get(index);
   	   if (value == null) {
   	      d51uReturnData.set(index,
			   	   	new D51uReturnData(this,beginD51uReturnData + index * D51uReturnData.getD51uReturnDataFieldLength()) 
				                        ); 
		  value = d51uReturnData.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update D51uReturnData at index with the passed value
	 *  Corresponding COBOL Variable is D51U-RETURN-DATA
	 *  @param index
	 *	@param value
	 */
  public void setD51uReturnData(int index,char[] value) {
   	getD51uReturnData(index).setString(value);
   }
   
	

	
	
	

		public static int getD51uRetDataFieldLength() {
			return D_51U_RET_DATA_LENGTH;
		}

}
  
