package com.cloudframe.app.dto.o529351u;

/**
*  The class SceAltKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SceAltKey extends SceAltKeySerialized { 
   

						private char[] sceAltModifier = Field.fillLowValue(1);

						private char[] sceAltToHcpcs = Field.fillLowValue(5);

								private long sceAltCancDate;
	
	/**
	* Constructor for SceAltKey
	**/
    public SceAltKey() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SceAltKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SceAltKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sceAltModifier
	 *	@return sceAltModifier
	 */
   public char[] getSceAltModifier() throws CFException{
     if (isSceAltModifierModified()) { 
        sceAltModifier = refreshSceAltModifier();
     }
   		return sceAltModifier;
   }

  
	/**
	*  set variable sceAltModifier
	*  Corresponding COBOL Variable is SCE-ALT-MODIFIER
	*  @param value
	**/
   public void setSceAltModifier(char[] value) {
      sceAltModifier = checkSceAltModifierConstraints(value);
      serializeSceAltModifier(sceAltModifier);
   } 

     /**
	 * 	Update SceAltModifier 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSceAltModifier(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSceAltModifier,sceAltModifier.length);
   	
   }
   
   public void setSceAltModifier(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSceAltModifier,sceAltModifier.length);
   	
   }
   
     /**
	 * 	Update SceAltModifier 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSceAltModifier(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSceAltModifier+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SceAltModifier with another Field
	 *	@param value
	 */
   public void setSceAltModifier(Field source) {
       replace(source,0,source.length(),beginSceAltModifier,SCE_ALT_MODIFIER_LEN);
   	
   }  
   
     /**
	 * 	Update SceAltModifier 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSceAltModifier(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSceAltModifier,SCE_ALT_MODIFIER_LEN);
   	
   }
   
     /**
	 * 	Update SceAltModifier 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSceAltModifier(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSceAltModifier+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sceAltToHcpcs
	 *	@return sceAltToHcpcs
	 */
   public char[] getSceAltToHcpcs() throws CFException{
     if (isSceAltToHcpcsModified()) { 
        sceAltToHcpcs = refreshSceAltToHcpcs();
     }
   		return sceAltToHcpcs;
   }

  
	/**
	*  set variable sceAltToHcpcs
	*  Corresponding COBOL Variable is SCE-ALT-TO-HCPCS
	*  @param value
	**/
   public void setSceAltToHcpcs(char[] value) {
      sceAltToHcpcs = checkSceAltToHcpcsConstraints(value);
      serializeSceAltToHcpcs(sceAltToHcpcs);
   } 

     /**
	 * 	Update SceAltToHcpcs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSceAltToHcpcs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSceAltToHcpcs,sceAltToHcpcs.length);
   	
   }
   
   public void setSceAltToHcpcs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSceAltToHcpcs,sceAltToHcpcs.length);
   	
   }
   
     /**
	 * 	Update SceAltToHcpcs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSceAltToHcpcs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSceAltToHcpcs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SceAltToHcpcs with another Field
	 *	@param value
	 */
   public void setSceAltToHcpcs(Field source) {
       replace(source,0,source.length(),beginSceAltToHcpcs,SCE_ALT_TO_HCPCS_LEN);
   	
   }  
   
     /**
	 * 	Update SceAltToHcpcs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSceAltToHcpcs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSceAltToHcpcs,SCE_ALT_TO_HCPCS_LEN);
   	
   }
   
     /**
	 * 	Update SceAltToHcpcs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSceAltToHcpcs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSceAltToHcpcs+targetIndex,targetLen);
    
   }
	public long getSceAltCancDate() throws CFException {
        if (isSceAltCancDateModified()) { 
           sceAltCancDate = refreshSceAltCancDate();
        }
   		return sceAltCancDate;
	}
	
	/**
	 * 	Update SceAltCancDate with the passed value
	 *  Corresponding COBOL Variable is SCE-ALT-CANC-DATE
	 *	@param number
	 */
	public void setSceAltCancDate(long number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			sceAltCancDate = checkSceAltCancDateMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeSceAltCancDate(sceAltCancDate);
	}



	
	
	

		public static int getSceAltKeyFieldLength() {
			return SCE_ALT_KEY_LENGTH;
		}

}
  
