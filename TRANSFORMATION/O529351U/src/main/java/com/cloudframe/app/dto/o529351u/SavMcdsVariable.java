package com.cloudframe.app.dto.o529351u;

/**
*  The class SavMcdsVariable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class SavMcdsVariable extends SavMcdsVariableSerialized { 
   
			private List<SavMcdsChargeInfo> savMcdsChargeInfo = new ArrayList<>();
    	
	
	/**
	* Constructor for SavMcdsVariable
	**/
    public SavMcdsVariable() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SavMcdsVariable. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SavMcdsVariable(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of savMcdsChargeInfo
	 *  Corresponding COBOL Variable is SAV-MCDS-CHARGE-INFO
	 *	@return savMcdsChargeInfo
	 */
   public List<SavMcdsChargeInfo> getSavMcdsChargeInfo() {
       return savMcdsChargeInfo;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return savMcdsChargeInfo
	 */
	public SavMcdsChargeInfo getSavMcdsChargeInfo(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getSavMcdsChargeInfo(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= SAV_MCDS_CHARGE_INFO_SIZE) {
             	index = SAV_MCDS_CHARGE_INFO_SIZE -1; // can't exceed max array size
             	logger.trace("savMcdsChargeInfo - Array index exceeded max Size {}, resetting it to max allowed",SAV_MCDS_CHARGE_INFO_SIZE); 
	    }
		if (index >= savMcdsChargeInfo.size()) {
       		for (int fillIndex =  savMcdsChargeInfo.size() -1; fillIndex < index;fillIndex++) {
		       savMcdsChargeInfo.add(null);
		    }
			savMcdsChargeInfo.set(index,
			   	   	new SavMcdsChargeInfo(this,beginSavMcdsChargeInfo + index * SavMcdsChargeInfo.getSavMcdsChargeInfoFieldLength()) 
				                        ); 	
		} 
   	   SavMcdsChargeInfo value = savMcdsChargeInfo.get(index);
   	   if (value == null) {
   	      savMcdsChargeInfo.set(index,
			   	   	new SavMcdsChargeInfo(this,beginSavMcdsChargeInfo + index * SavMcdsChargeInfo.getSavMcdsChargeInfoFieldLength()) 
				                        ); 
		  value = savMcdsChargeInfo.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update SavMcdsChargeInfo at index with the passed value
	 *  Corresponding COBOL Variable is SAV-MCDS-CHARGE-INFO
	 *  @param index
	 *	@param value
	 */
  public void setSavMcdsChargeInfo(int index,char[] value) {
   	getSavMcdsChargeInfo(index).setString(value);
   }
   
	

	
	
	

		public static int getSavMcdsVariableFieldLength() {
			return SAV_MCDS_VARIABLE_LENGTH;
		}

}
  
