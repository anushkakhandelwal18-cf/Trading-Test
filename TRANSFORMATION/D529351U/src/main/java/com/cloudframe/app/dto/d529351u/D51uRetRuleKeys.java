package com.cloudframe.app.dto.d529351u;

/**
*  The class D51uRetRuleKeys is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:50. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class D51uRetRuleKeys extends D51uRetRuleKeysSerialized { 
   

						private char[] d51uRetDrvPos = Field.fillLowValue(2);

						private char[] d51uRetDrvSvc = Field.fillLowValue(6);

						private char[] d51uRetDrvCau = Field.fillLowValue(1);

						private char[] d51uRetRuleSw = Field.fillLowValue(8);
	
	/**
	* Constructor for D51uRetRuleKeys
	**/
    public D51uRetRuleKeys() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for D51uRetRuleKeys. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uRetRuleKeys(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of d51uRetDrvPos
	 *	@return d51uRetDrvPos
	 */
   public char[] getD51uRetDrvPos() throws CFException{
     if (isD51uRetDrvPosModified()) { 
        d51uRetDrvPos = refreshD51uRetDrvPos();
     }
   		return d51uRetDrvPos;
   }

  
	/**
	*  set variable d51uRetDrvPos
	*  Corresponding COBOL Variable is D51U-RET-DRV-POS
	*  @param value
	**/
   public void setD51uRetDrvPos(char[] value) {
      d51uRetDrvPos = checkD51uRetDrvPosConstraints(value);
      serializeD51uRetDrvPos(d51uRetDrvPos);
   } 

     /**
	 * 	Update D51uRetDrvPos 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uRetDrvPos(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uRetDrvPos,d51uRetDrvPos.length);
   	
   }
   
   public void setD51uRetDrvPos(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRetDrvPos,d51uRetDrvPos.length);
   	
   }
   
     /**
	 * 	Update D51uRetDrvPos 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uRetDrvPos(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRetDrvPos+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uRetDrvPos with another Field
	 *	@param value
	 */
   public void setD51uRetDrvPos(Field source) {
       replace(source,0,source.length(),beginD51uRetDrvPos,D_51U_RET_DRV_POS_LEN);
   	
   }  
   
     /**
	 * 	Update D51uRetDrvPos 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uRetDrvPos(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uRetDrvPos,D_51U_RET_DRV_POS_LEN);
   	
   }
   
     /**
	 * 	Update D51uRetDrvPos 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uRetDrvPos(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRetDrvPos+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uRetDrvSvc
	 *	@return d51uRetDrvSvc
	 */
   public char[] getD51uRetDrvSvc() throws CFException{
     if (isD51uRetDrvSvcModified()) { 
        d51uRetDrvSvc = refreshD51uRetDrvSvc();
     }
   		return d51uRetDrvSvc;
   }

  
	/**
	*  set variable d51uRetDrvSvc
	*  Corresponding COBOL Variable is D51U-RET-DRV-SVC
	*  @param value
	**/
   public void setD51uRetDrvSvc(char[] value) {
      d51uRetDrvSvc = checkD51uRetDrvSvcConstraints(value);
      serializeD51uRetDrvSvc(d51uRetDrvSvc);
   } 

     /**
	 * 	Update D51uRetDrvSvc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uRetDrvSvc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uRetDrvSvc,d51uRetDrvSvc.length);
   	
   }
   
   public void setD51uRetDrvSvc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRetDrvSvc,d51uRetDrvSvc.length);
   	
   }
   
     /**
	 * 	Update D51uRetDrvSvc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uRetDrvSvc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRetDrvSvc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uRetDrvSvc with another Field
	 *	@param value
	 */
   public void setD51uRetDrvSvc(Field source) {
       replace(source,0,source.length(),beginD51uRetDrvSvc,D_51U_RET_DRV_SVC_LEN);
   	
   }  
   
     /**
	 * 	Update D51uRetDrvSvc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uRetDrvSvc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uRetDrvSvc,D_51U_RET_DRV_SVC_LEN);
   	
   }
   
     /**
	 * 	Update D51uRetDrvSvc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uRetDrvSvc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRetDrvSvc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uRetDrvCau
	 *	@return d51uRetDrvCau
	 */
   public char[] getD51uRetDrvCau() throws CFException{
     if (isD51uRetDrvCauModified()) { 
        d51uRetDrvCau = refreshD51uRetDrvCau();
     }
   		return d51uRetDrvCau;
   }

  
	/**
	*  set variable d51uRetDrvCau
	*  Corresponding COBOL Variable is D51U-RET-DRV-CAU
	*  @param value
	**/
   public void setD51uRetDrvCau(char[] value) {
      d51uRetDrvCau = checkD51uRetDrvCauConstraints(value);
      serializeD51uRetDrvCau(d51uRetDrvCau);
   } 

     /**
	 * 	Update D51uRetDrvCau 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uRetDrvCau(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uRetDrvCau,d51uRetDrvCau.length);
   	
   }
   
   public void setD51uRetDrvCau(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRetDrvCau,d51uRetDrvCau.length);
   	
   }
   
     /**
	 * 	Update D51uRetDrvCau 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uRetDrvCau(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRetDrvCau+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uRetDrvCau with another Field
	 *	@param value
	 */
   public void setD51uRetDrvCau(Field source) {
       replace(source,0,source.length(),beginD51uRetDrvCau,D_51U_RET_DRV_CAU_LEN);
   	
   }  
   
     /**
	 * 	Update D51uRetDrvCau 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uRetDrvCau(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uRetDrvCau,D_51U_RET_DRV_CAU_LEN);
   	
   }
   
     /**
	 * 	Update D51uRetDrvCau 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uRetDrvCau(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRetDrvCau+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uRetRuleSw
	 *	@return d51uRetRuleSw
	 */
   public char[] getD51uRetRuleSw() throws CFException{
     if (isD51uRetRuleSwModified()) { 
        d51uRetRuleSw = refreshD51uRetRuleSw();
     }
   		return d51uRetRuleSw;
   }

  
	/**
	*  set variable d51uRetRuleSw
	*  Corresponding COBOL Variable is D51U-RET-RULE-SW
	*  @param value
	**/
   public void setD51uRetRuleSw(char[] value) {
      d51uRetRuleSw = checkD51uRetRuleSwConstraints(value);
      serializeD51uRetRuleSw(d51uRetRuleSw);
   } 

     /**
	 * 	Update D51uRetRuleSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uRetRuleSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uRetRuleSw,d51uRetRuleSw.length);
   	
   }
   
   public void setD51uRetRuleSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRetRuleSw,d51uRetRuleSw.length);
   	
   }
   
     /**
	 * 	Update D51uRetRuleSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uRetRuleSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRetRuleSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uRetRuleSw with another Field
	 *	@param value
	 */
   public void setD51uRetRuleSw(Field source) {
       replace(source,0,source.length(),beginD51uRetRuleSw,D_51U_RET_RULE_SW_LEN);
   	
   }  
   
     /**
	 * 	Update D51uRetRuleSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uRetRuleSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uRetRuleSw,D_51U_RET_RULE_SW_LEN);
   	
   }
   
     /**
	 * 	Update D51uRetRuleSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uRetRuleSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRetRuleSw+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes D51uRetRuleKeys
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setD51uRetDrvPos(CONSTANTS.SPACE_2);
         setD51uRetDrvSvc(CONSTANTS.SPACE_6);
         setD51uRetDrvCau(CONSTANTS.SPACE);
         setD51uRetRuleSw(CONSTANTS.SPACE_8);
   }

		public static int getD51uRetRuleKeysFieldLength() {
			return D_51U_RET_RULE_KEYS_LENGTH;
		}

}
  
