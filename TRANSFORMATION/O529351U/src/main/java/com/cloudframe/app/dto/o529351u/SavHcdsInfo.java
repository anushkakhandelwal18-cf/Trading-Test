package com.cloudframe.app.dto.o529351u;

/**
*  The class SavHcdsInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SavHcdsInfo extends SavHcdsInfoSerialized { 
   

						private char[] savCfeUb92VendorType = Field.fillLowValue(1);
	
	/**
	* Constructor for SavHcdsInfo
	**/
    public SavHcdsInfo() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SavHcdsInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SavHcdsInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of savCfeUb92VendorType
	 *	@return savCfeUb92VendorType
	 */
   public char[] getSavCfeUb92VendorType() throws CFException{
     if (isSavCfeUb92VendorTypeModified()) { 
        savCfeUb92VendorType = refreshSavCfeUb92VendorType();
     }
   		return savCfeUb92VendorType;
   }

  
	/**
	*  set variable savCfeUb92VendorType
	*  Corresponding COBOL Variable is SAV-CFE-UB92-VENDOR-TYPE
	*  @param value
	**/
   public void setSavCfeUb92VendorType(char[] value) {
      savCfeUb92VendorType = checkSavCfeUb92VendorTypeConstraints(value);
      serializeSavCfeUb92VendorType(savCfeUb92VendorType);
   } 

     /**
	 * 	Update SavCfeUb92VendorType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSavCfeUb92VendorType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSavCfeUb92VendorType,savCfeUb92VendorType.length);
   	
   }
   
   public void setSavCfeUb92VendorType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSavCfeUb92VendorType,savCfeUb92VendorType.length);
   	
   }
   
     /**
	 * 	Update SavCfeUb92VendorType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSavCfeUb92VendorType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSavCfeUb92VendorType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SavCfeUb92VendorType with another Field
	 *	@param value
	 */
   public void setSavCfeUb92VendorType(Field source) {
       replace(source,0,source.length(),beginSavCfeUb92VendorType,SAV_CFE_UB_92_VENDOR_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update SavCfeUb92VendorType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSavCfeUb92VendorType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSavCfeUb92VendorType,SAV_CFE_UB_92_VENDOR_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update SavCfeUb92VendorType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSavCfeUb92VendorType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSavCfeUb92VendorType+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSavHcdsInfoFieldLength() {
			return SAV_HCDS_INFO_LENGTH;
		}

}
  
