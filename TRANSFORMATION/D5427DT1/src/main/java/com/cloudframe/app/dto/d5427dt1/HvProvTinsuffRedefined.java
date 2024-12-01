package com.cloudframe.app.dto.d5427dt1;

/**
*  The class HvProvTinsuffRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HvProvTinsuffRedefined extends HvProvTinsuffRedefinedSerialized { 
   

						private char[] hvProvTin = Field.fillLowValue(9);
	
	/**
	* Constructor for HvProvTinsuffRedefined
	**/
    public HvProvTinsuffRedefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for HvProvTinsuffRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HvProvTinsuffRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of hvProvTin
	 *	@return hvProvTin
	 */
   public char[] getHvProvTin() throws CFException{
     if (isHvProvTinModified()) { 
        hvProvTin = refreshHvProvTin();
     }
   		return hvProvTin;
   }

  
	/**
	*  set variable hvProvTin
	*  Corresponding COBOL Variable is HV-PROV-TIN
	*  @param value
	**/
   public void setHvProvTin(char[] value) {
      hvProvTin = checkHvProvTinConstraints(value);
      serializeHvProvTin(hvProvTin);
   } 

     /**
	 * 	Update HvProvTin 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHvProvTin(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHvProvTin,hvProvTin.length);
   	
   }
   
   public void setHvProvTin(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHvProvTin,hvProvTin.length);
   	
   }
   
     /**
	 * 	Update HvProvTin 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvProvTin(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvProvTin+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HvProvTin with another Field
	 *	@param value
	 */
   public void setHvProvTin(Field source) {
       replace(source,0,source.length(),beginHvProvTin,HV_PROV_TIN_LEN);
   	
   }  
   
     /**
	 * 	Update HvProvTin 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHvProvTin(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHvProvTin,HV_PROV_TIN_LEN);
   	
   }
   
     /**
	 * 	Update HvProvTin 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvProvTin(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvProvTin+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHvProvTinsuffRedefinedFieldLength() {
			return HV_PROV_TINSUFF_REDEFINED_LENGTH;
		}

}
  
