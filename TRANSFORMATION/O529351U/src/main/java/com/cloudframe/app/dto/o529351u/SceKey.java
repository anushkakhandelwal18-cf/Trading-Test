package com.cloudframe.app.dto.o529351u;

/**
*  The class SceKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SceKey extends SceKeySerialized { 
   

						private char[] sceServiceCode = Field.fillLowValue(6);
	
	/**
	* Constructor for SceKey
	**/
    public SceKey() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SceKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SceKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sceServiceCode
	 *	@return sceServiceCode
	 */
   public char[] getSceServiceCode() throws CFException{
     if (isSceServiceCodeModified()) { 
        sceServiceCode = refreshSceServiceCode();
     }
   		return sceServiceCode;
   }

  
	/**
	*  set variable sceServiceCode
	*  Corresponding COBOL Variable is SCE-SERVICE-CODE
	*  @param value
	**/
   public void setSceServiceCode(char[] value) {
      sceServiceCode = checkSceServiceCodeConstraints(value);
      serializeSceServiceCode(sceServiceCode);
   } 

     /**
	 * 	Update SceServiceCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSceServiceCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSceServiceCode,sceServiceCode.length);
   	
   }
   
   public void setSceServiceCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSceServiceCode,sceServiceCode.length);
   	
   }
   
     /**
	 * 	Update SceServiceCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSceServiceCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSceServiceCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SceServiceCode with another Field
	 *	@param value
	 */
   public void setSceServiceCode(Field source) {
       replace(source,0,source.length(),beginSceServiceCode,SCE_SERVICE_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update SceServiceCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSceServiceCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSceServiceCode,SCE_SERVICE_CODE_LEN);
   	
   }
   
     /**
	 * 	Update SceServiceCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSceServiceCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSceServiceCode+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSceKeyFieldLength() {
			return SCE_KEY_LENGTH;
		}

}
  
