package com.cloudframe.app.dto.d5427dt1;

/**
*  The class HvProvTinsuff1Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HvProvTinsuff1Redefined extends HvProvTinsuff1RedefinedSerialized { 
   

						private char[] hvProvTin1 = Field.fillLowValue(9);
	
	/**
	* Constructor for HvProvTinsuff1Redefined
	**/
    public HvProvTinsuff1Redefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for HvProvTinsuff1Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HvProvTinsuff1Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of hvProvTin1
	 *	@return hvProvTin1
	 */
   public char[] getHvProvTin1() throws CFException{
     if (isHvProvTin1Modified()) { 
        hvProvTin1 = refreshHvProvTin1();
     }
   		return hvProvTin1;
   }

  
	/**
	*  set variable hvProvTin1
	*  Corresponding COBOL Variable is HV-PROV-TIN1
	*  @param value
	**/
   public void setHvProvTin1(char[] value) {
      hvProvTin1 = checkHvProvTin1Constraints(value);
      serializeHvProvTin1(hvProvTin1);
   } 

     /**
	 * 	Update HvProvTin1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHvProvTin1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHvProvTin1,hvProvTin1.length);
   	
   }
   
   public void setHvProvTin1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHvProvTin1,hvProvTin1.length);
   	
   }
   
     /**
	 * 	Update HvProvTin1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvProvTin1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvProvTin1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HvProvTin1 with another Field
	 *	@param value
	 */
   public void setHvProvTin1(Field source) {
       replace(source,0,source.length(),beginHvProvTin1,HV_PROV_TIN_1_LEN);
   	
   }  
   
     /**
	 * 	Update HvProvTin1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHvProvTin1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHvProvTin1,HV_PROV_TIN_1_LEN);
   	
   }
   
     /**
	 * 	Update HvProvTin1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvProvTin1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvProvTin1+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHvProvTinsuff1RedefinedFieldLength() {
			return HV_PROV_TINSUFF_1_REDEFINED_LENGTH;
		}

}
  
