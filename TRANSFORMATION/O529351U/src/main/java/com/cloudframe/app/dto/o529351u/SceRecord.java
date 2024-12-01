package com.cloudframe.app.dto.o529351u;

/**
*  The class SceRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SceRecord extends SceRecordSerialized { 
   
				private SceKey sceKey = new SceKey();
				private SceAltKey sceAltKey = new SceAltKey();

						private char[] sceFromHcpcsCpt = Field.fillLowValue(5);
	
	/**
	* Constructor for SceRecord
	**/
    public SceRecord() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SceRecord. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SceRecord(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			sceKey.setParent(this,getStartOffset() + 0);
	       			sceAltKey.setParent(this,getStartOffset() + 17);
    } 

	/**
	 *	Returns the value of sceKey
	 *	@return sceKey
	 */   
	 public SceKey getSceKey() {
   	return sceKey;
   }
   /**
	* 	Update SceKey with the passed value
	*   Corresponding COBOL Variable is SCE-KEY
	*	@param value
	*/
   public void setSceKey(char[] value) {
      sceKey.setString(value); 
   }   
    
     /**
	 * 	Update SceKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSceKey(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sceKey.begin,sceKey.length());
   }
   
     /**
	 * 	Update SceKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSceKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sceKey.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update SceKey with another Field
	 *	@param value
	 */
   public void setSceKey(Field source) {
   	replace(source,0,source.length(),sceKey.begin,sceKey.length());
   }  
   
     /**
	 * 	Update SceKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSceKey(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sceKey.begin,sceKey.length());
   }
   
     /**
	 * 	Update SceKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSceKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sceKey.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sceAltKey
	 *	@return sceAltKey
	 */   
	 public SceAltKey getSceAltKey() {
   	return sceAltKey;
   }
   /**
	* 	Update SceAltKey with the passed value
	*   Corresponding COBOL Variable is SCE-ALT-KEY
	*	@param value
	*/
   public void setSceAltKey(char[] value) {
      sceAltKey.setString(value); 
   }   
    
     /**
	 * 	Update SceAltKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSceAltKey(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sceAltKey.begin,sceAltKey.length());
   }
   
     /**
	 * 	Update SceAltKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSceAltKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sceAltKey.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update SceAltKey with another Field
	 *	@param value
	 */
   public void setSceAltKey(Field source) {
   	replace(source,0,source.length(),sceAltKey.begin,sceAltKey.length());
   }  
   
     /**
	 * 	Update SceAltKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSceAltKey(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sceAltKey.begin,sceAltKey.length());
   }
   
     /**
	 * 	Update SceAltKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSceAltKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sceAltKey.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sceFromHcpcsCpt
	 *	@return sceFromHcpcsCpt
	 */
   public char[] getSceFromHcpcsCpt() throws CFException{
     if (isSceFromHcpcsCptModified()) { 
        sceFromHcpcsCpt = refreshSceFromHcpcsCpt();
     }
   		return sceFromHcpcsCpt;
   }

  
	/**
	*  set variable sceFromHcpcsCpt
	*  Corresponding COBOL Variable is SCE-FROM-HCPCS-CPT
	*  @param value
	**/
   public void setSceFromHcpcsCpt(char[] value) {
      sceFromHcpcsCpt = checkSceFromHcpcsCptConstraints(value);
      serializeSceFromHcpcsCpt(sceFromHcpcsCpt);
   } 

     /**
	 * 	Update SceFromHcpcsCpt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSceFromHcpcsCpt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSceFromHcpcsCpt,sceFromHcpcsCpt.length);
   	
   }
   
   public void setSceFromHcpcsCpt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSceFromHcpcsCpt,sceFromHcpcsCpt.length);
   	
   }
   
     /**
	 * 	Update SceFromHcpcsCpt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSceFromHcpcsCpt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSceFromHcpcsCpt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SceFromHcpcsCpt with another Field
	 *	@param value
	 */
   public void setSceFromHcpcsCpt(Field source) {
       replace(source,0,source.length(),beginSceFromHcpcsCpt,SCE_FROM_HCPCS_CPT_LEN);
   	
   }  
   
     /**
	 * 	Update SceFromHcpcsCpt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSceFromHcpcsCpt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSceFromHcpcsCpt,SCE_FROM_HCPCS_CPT_LEN);
   	
   }
   
     /**
	 * 	Update SceFromHcpcsCpt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSceFromHcpcsCpt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSceFromHcpcsCpt+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSceRecordFieldLength() {
			return SCE_RECORD_LENGTH;
		}

}
  
