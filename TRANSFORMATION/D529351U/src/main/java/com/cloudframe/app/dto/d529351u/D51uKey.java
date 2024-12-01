package com.cloudframe.app.dto.d529351u;

/**
*  The class D51uKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:50. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class D51uKey extends D51uKeySerialized { 
   

						private char[] d51uKeyFeSpi = Field.fillLowValue(7);

						private char[] d51uKeyStatus = Field.fillLowValue(1);

						private char[] d51uKeyPolicy = Field.fillLowValue(6);

						private char[] d51uKeyPlan = Field.fillLowValue(4);
	
	/**
	* Constructor for D51uKey
	**/
    public D51uKey() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for D51uKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of d51uKeyFeSpi
	 *	@return d51uKeyFeSpi
	 */
   public char[] getD51uKeyFeSpi() throws CFException{
     if (isD51uKeyFeSpiModified()) { 
        d51uKeyFeSpi = refreshD51uKeyFeSpi();
     }
   		return d51uKeyFeSpi;
   }

  
	/**
	*  set variable d51uKeyFeSpi
	*  Corresponding COBOL Variable is D51U-KEY-FE-SPI
	*  @param value
	**/
   public void setD51uKeyFeSpi(char[] value) {
      d51uKeyFeSpi = checkD51uKeyFeSpiConstraints(value);
      serializeD51uKeyFeSpi(d51uKeyFeSpi);
   } 

     /**
	 * 	Update D51uKeyFeSpi 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uKeyFeSpi(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uKeyFeSpi,d51uKeyFeSpi.length);
   	
   }
   
   public void setD51uKeyFeSpi(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uKeyFeSpi,d51uKeyFeSpi.length);
   	
   }
   
     /**
	 * 	Update D51uKeyFeSpi 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uKeyFeSpi(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uKeyFeSpi+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uKeyFeSpi with another Field
	 *	@param value
	 */
   public void setD51uKeyFeSpi(Field source) {
       replace(source,0,source.length(),beginD51uKeyFeSpi,D_51U_KEY_FE_SPI_LEN);
   	
   }  
   
     /**
	 * 	Update D51uKeyFeSpi 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uKeyFeSpi(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uKeyFeSpi,D_51U_KEY_FE_SPI_LEN);
   	
   }
   
     /**
	 * 	Update D51uKeyFeSpi 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uKeyFeSpi(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uKeyFeSpi+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uKeyStatus
	 *	@return d51uKeyStatus
	 */
   public char[] getD51uKeyStatus() throws CFException{
     if (isD51uKeyStatusModified()) { 
        d51uKeyStatus = refreshD51uKeyStatus();
     }
   		return d51uKeyStatus;
   }

  
	/**
	*  set variable d51uKeyStatus
	*  Corresponding COBOL Variable is D51U-KEY-STATUS
	*  @param value
	**/
   public void setD51uKeyStatus(char[] value) {
      d51uKeyStatus = checkD51uKeyStatusConstraints(value);
      serializeD51uKeyStatus(d51uKeyStatus);
   } 

     /**
	 * 	Update D51uKeyStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uKeyStatus(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uKeyStatus,d51uKeyStatus.length);
   	
   }
   
   public void setD51uKeyStatus(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uKeyStatus,d51uKeyStatus.length);
   	
   }
   
     /**
	 * 	Update D51uKeyStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uKeyStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uKeyStatus+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uKeyStatus with another Field
	 *	@param value
	 */
   public void setD51uKeyStatus(Field source) {
       replace(source,0,source.length(),beginD51uKeyStatus,D_51U_KEY_STATUS_LEN);
   	
   }  
   
     /**
	 * 	Update D51uKeyStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uKeyStatus(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uKeyStatus,D_51U_KEY_STATUS_LEN);
   	
   }
   
     /**
	 * 	Update D51uKeyStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uKeyStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uKeyStatus+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uKeyPolicy
	 *	@return d51uKeyPolicy
	 */
   public char[] getD51uKeyPolicy() throws CFException{
     if (isD51uKeyPolicyModified()) { 
        d51uKeyPolicy = refreshD51uKeyPolicy();
     }
   		return d51uKeyPolicy;
   }

  
	/**
	*  set variable d51uKeyPolicy
	*  Corresponding COBOL Variable is D51U-KEY-POLICY
	*  @param value
	**/
   public void setD51uKeyPolicy(char[] value) {
      d51uKeyPolicy = checkD51uKeyPolicyConstraints(value);
      serializeD51uKeyPolicy(d51uKeyPolicy);
   } 

     /**
	 * 	Update D51uKeyPolicy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uKeyPolicy(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uKeyPolicy,d51uKeyPolicy.length);
   	
   }
   
   public void setD51uKeyPolicy(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uKeyPolicy,d51uKeyPolicy.length);
   	
   }
   
     /**
	 * 	Update D51uKeyPolicy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uKeyPolicy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uKeyPolicy+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uKeyPolicy with another Field
	 *	@param value
	 */
   public void setD51uKeyPolicy(Field source) {
       replace(source,0,source.length(),beginD51uKeyPolicy,D_51U_KEY_POLICY_LEN);
   	
   }  
   
     /**
	 * 	Update D51uKeyPolicy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uKeyPolicy(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uKeyPolicy,D_51U_KEY_POLICY_LEN);
   	
   }
   
     /**
	 * 	Update D51uKeyPolicy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uKeyPolicy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uKeyPolicy+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uKeyPlan
	 *	@return d51uKeyPlan
	 */
   public char[] getD51uKeyPlan() throws CFException{
     if (isD51uKeyPlanModified()) { 
        d51uKeyPlan = refreshD51uKeyPlan();
     }
   		return d51uKeyPlan;
   }

  
	/**
	*  set variable d51uKeyPlan
	*  Corresponding COBOL Variable is D51U-KEY-PLAN
	*  @param value
	**/
   public void setD51uKeyPlan(char[] value) {
      d51uKeyPlan = checkD51uKeyPlanConstraints(value);
      serializeD51uKeyPlan(d51uKeyPlan);
   } 

     /**
	 * 	Update D51uKeyPlan 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uKeyPlan(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uKeyPlan,d51uKeyPlan.length);
   	
   }
   
   public void setD51uKeyPlan(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uKeyPlan,d51uKeyPlan.length);
   	
   }
   
     /**
	 * 	Update D51uKeyPlan 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uKeyPlan(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uKeyPlan+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uKeyPlan with another Field
	 *	@param value
	 */
   public void setD51uKeyPlan(Field source) {
       replace(source,0,source.length(),beginD51uKeyPlan,D_51U_KEY_PLAN_LEN);
   	
   }  
   
     /**
	 * 	Update D51uKeyPlan 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uKeyPlan(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uKeyPlan,D_51U_KEY_PLAN_LEN);
   	
   }
   
     /**
	 * 	Update D51uKeyPlan 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uKeyPlan(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uKeyPlan+targetIndex,targetLen);
    
   }

	
	
	

		public static int getD51uKeyFieldLength() {
			return D_51U_KEY_LENGTH;
		}

}
  
