package com.cloudframe.app.dto.d529351u;

/**
*  The class D51uRetRuleFrCondPos is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class D51uRetRuleFrCondPos extends D51uRetRuleFrCondPosSerialized { 
   

						private char[] d51uFcndDrvPos = Field.fillLowValue(2);

						private char[] d51uFcndDrvSvc = Field.fillLowValue(6);

						private char[] d51uFcndDrvCau = Field.fillLowValue(1);

						private char[] d51uFcndFromCondPos = Field.fillLowValue(3);
	
	/**
	* Constructor for D51uRetRuleFrCondPos
	**/
    public D51uRetRuleFrCondPos() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for D51uRetRuleFrCondPos. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uRetRuleFrCondPos(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of d51uFcndDrvPos
	 *	@return d51uFcndDrvPos
	 */
   public char[] getD51uFcndDrvPos() throws CFException{
     if (isD51uFcndDrvPosModified()) { 
        d51uFcndDrvPos = refreshD51uFcndDrvPos();
     }
   		return d51uFcndDrvPos;
   }

  
	/**
	*  set variable d51uFcndDrvPos
	*  Corresponding COBOL Variable is D51U-FCND-DRV-POS
	*  @param value
	**/
   public void setD51uFcndDrvPos(char[] value) {
      d51uFcndDrvPos = checkD51uFcndDrvPosConstraints(value);
      serializeD51uFcndDrvPos(d51uFcndDrvPos);
   } 

     /**
	 * 	Update D51uFcndDrvPos 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uFcndDrvPos(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uFcndDrvPos,d51uFcndDrvPos.length);
   	
   }
   
   public void setD51uFcndDrvPos(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uFcndDrvPos,d51uFcndDrvPos.length);
   	
   }
   
     /**
	 * 	Update D51uFcndDrvPos 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uFcndDrvPos(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uFcndDrvPos+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uFcndDrvPos with another Field
	 *	@param value
	 */
   public void setD51uFcndDrvPos(Field source) {
       replace(source,0,source.length(),beginD51uFcndDrvPos,D_51U_FCND_DRV_POS_LEN);
   	
   }  
   
     /**
	 * 	Update D51uFcndDrvPos 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uFcndDrvPos(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uFcndDrvPos,D_51U_FCND_DRV_POS_LEN);
   	
   }
   
     /**
	 * 	Update D51uFcndDrvPos 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uFcndDrvPos(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uFcndDrvPos+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uFcndDrvSvc
	 *	@return d51uFcndDrvSvc
	 */
   public char[] getD51uFcndDrvSvc() throws CFException{
     if (isD51uFcndDrvSvcModified()) { 
        d51uFcndDrvSvc = refreshD51uFcndDrvSvc();
     }
   		return d51uFcndDrvSvc;
   }

  
	/**
	*  set variable d51uFcndDrvSvc
	*  Corresponding COBOL Variable is D51U-FCND-DRV-SVC
	*  @param value
	**/
   public void setD51uFcndDrvSvc(char[] value) {
      d51uFcndDrvSvc = checkD51uFcndDrvSvcConstraints(value);
      serializeD51uFcndDrvSvc(d51uFcndDrvSvc);
   } 

     /**
	 * 	Update D51uFcndDrvSvc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uFcndDrvSvc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uFcndDrvSvc,d51uFcndDrvSvc.length);
   	
   }
   
   public void setD51uFcndDrvSvc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uFcndDrvSvc,d51uFcndDrvSvc.length);
   	
   }
   
     /**
	 * 	Update D51uFcndDrvSvc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uFcndDrvSvc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uFcndDrvSvc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uFcndDrvSvc with another Field
	 *	@param value
	 */
   public void setD51uFcndDrvSvc(Field source) {
       replace(source,0,source.length(),beginD51uFcndDrvSvc,D_51U_FCND_DRV_SVC_LEN);
   	
   }  
   
     /**
	 * 	Update D51uFcndDrvSvc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uFcndDrvSvc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uFcndDrvSvc,D_51U_FCND_DRV_SVC_LEN);
   	
   }
   
     /**
	 * 	Update D51uFcndDrvSvc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uFcndDrvSvc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uFcndDrvSvc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uFcndDrvCau
	 *	@return d51uFcndDrvCau
	 */
   public char[] getD51uFcndDrvCau() throws CFException{
     if (isD51uFcndDrvCauModified()) { 
        d51uFcndDrvCau = refreshD51uFcndDrvCau();
     }
   		return d51uFcndDrvCau;
   }

  
	/**
	*  set variable d51uFcndDrvCau
	*  Corresponding COBOL Variable is D51U-FCND-DRV-CAU
	*  @param value
	**/
   public void setD51uFcndDrvCau(char[] value) {
      d51uFcndDrvCau = checkD51uFcndDrvCauConstraints(value);
      serializeD51uFcndDrvCau(d51uFcndDrvCau);
   } 

     /**
	 * 	Update D51uFcndDrvCau 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uFcndDrvCau(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uFcndDrvCau,d51uFcndDrvCau.length);
   	
   }
   
   public void setD51uFcndDrvCau(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uFcndDrvCau,d51uFcndDrvCau.length);
   	
   }
   
     /**
	 * 	Update D51uFcndDrvCau 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uFcndDrvCau(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uFcndDrvCau+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uFcndDrvCau with another Field
	 *	@param value
	 */
   public void setD51uFcndDrvCau(Field source) {
       replace(source,0,source.length(),beginD51uFcndDrvCau,D_51U_FCND_DRV_CAU_LEN);
   	
   }  
   
     /**
	 * 	Update D51uFcndDrvCau 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uFcndDrvCau(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uFcndDrvCau,D_51U_FCND_DRV_CAU_LEN);
   	
   }
   
     /**
	 * 	Update D51uFcndDrvCau 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uFcndDrvCau(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uFcndDrvCau+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uFcndFromCondPos
	 *	@return d51uFcndFromCondPos
	 */
   public char[] getD51uFcndFromCondPos() throws CFException{
     if (isD51uFcndFromCondPosModified()) { 
        d51uFcndFromCondPos = refreshD51uFcndFromCondPos();
     }
   		return d51uFcndFromCondPos;
   }

  
	/**
	*  set variable d51uFcndFromCondPos
	*  Corresponding COBOL Variable is D51U-FCND-FROM-COND-POS
	*  @param value
	**/
   public void setD51uFcndFromCondPos(char[] value) {
      d51uFcndFromCondPos = checkD51uFcndFromCondPosConstraints(value);
      serializeD51uFcndFromCondPos(d51uFcndFromCondPos);
   } 

     /**
	 * 	Update D51uFcndFromCondPos 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uFcndFromCondPos(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uFcndFromCondPos,d51uFcndFromCondPos.length);
   	
   }
   
   public void setD51uFcndFromCondPos(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uFcndFromCondPos,d51uFcndFromCondPos.length);
   	
   }
   
     /**
	 * 	Update D51uFcndFromCondPos 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uFcndFromCondPos(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uFcndFromCondPos+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uFcndFromCondPos with another Field
	 *	@param value
	 */
   public void setD51uFcndFromCondPos(Field source) {
       replace(source,0,source.length(),beginD51uFcndFromCondPos,D_51U_FCND_FROM_COND_POS_LEN);
   	
   }  
   
     /**
	 * 	Update D51uFcndFromCondPos 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uFcndFromCondPos(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uFcndFromCondPos,D_51U_FCND_FROM_COND_POS_LEN);
   	
   }
   
     /**
	 * 	Update D51uFcndFromCondPos 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uFcndFromCondPos(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uFcndFromCondPos+targetIndex,targetLen);
    
   }

	
	
	

		public static int getD51uRetRuleFrCondPosFieldLength() {
			return D_51U_RET_RULE_FR_COND_POS_LENGTH;
		}

}
  
