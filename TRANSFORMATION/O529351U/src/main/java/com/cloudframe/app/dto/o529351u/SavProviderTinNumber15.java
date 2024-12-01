package com.cloudframe.app.dto.o529351u;

/**
*  The class SavProviderTinNumber15 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SavProviderTinNumber15 extends SavProviderTinNumber15Serialized { 
   

								private long savProviderSuffix;
	
	/**
	* Constructor for SavProviderTinNumber15
	**/
    public SavProviderTinNumber15() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SavProviderTinNumber15. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SavProviderTinNumber15(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of savProviderSuffix
	 *	@return savProviderSuffix
	 */
	public long getSavProviderSuffix() throws CFException {
       if (isSavProviderSuffixModified()) { 
           savProviderSuffix = refreshSavProviderSuffix();
        }
   		return savProviderSuffix;
	}
	

	
	   
	/**
	 * 	Update SavProviderSuffix with the passed value
	 *  Corresponding COBOL Variable is SAV-PROVIDER-SUFFIX
	 *	@param number
	 */
	public void setSavProviderSuffix(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    savProviderSuffix = checkSavProviderSuffixMaxLimit(number); 
		serializeSavProviderSuffix(savProviderSuffix);
	}
	

	/**
	 * 	Update SavProviderSuffix with the passed value
	 *	@param value (String or char[])
	 */
	public void setSavProviderSuffix(char[] value) throws CFException {
		 savProviderSuffix = serializeSavProviderSuffix(value);
	}
	/**
	 * 	Update SavProviderSuffix with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSavProviderSuffixString(char[] value) throws CFException {
		 setSavProviderSuffix(value);
	}

	
	
	

		public static int getSavProviderTinNumber15FieldLength() {
			return SAV_PROVIDER_TIN_NUMBER_15_LENGTH;
		}

}
  
