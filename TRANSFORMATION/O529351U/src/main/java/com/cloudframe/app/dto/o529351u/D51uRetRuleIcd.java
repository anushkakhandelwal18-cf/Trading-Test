package com.cloudframe.app.dto.o529351u;

/**
*  The class D51uRetRuleIcd is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class D51uRetRuleIcd extends D51uRetRuleIcdSerialized { 
   

						private char[] d51uRicdDrvPos = Field.fillLowValue(2);

						private char[] d51uRicdDrvSvc = Field.fillLowValue(6);

						private char[] d51uRicdDrvCau = Field.fillLowValue(1);

						private char[] d51uRicdClmIcdInd = Field.fillLowValue(1);

						private char[] d51uRicdClmIcdFromCd = Field.fillLowValue(7);

						private char[] d51uRicdClmIcdToCd = Field.fillLowValue(7);
	
	/**
	* Constructor for D51uRetRuleIcd
	**/
    public D51uRetRuleIcd() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for D51uRetRuleIcd. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uRetRuleIcd(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of d51uRicdDrvPos
	 *	@return d51uRicdDrvPos
	 */
   public char[] getD51uRicdDrvPos() throws CFException{
     if (isD51uRicdDrvPosModified()) { 
        d51uRicdDrvPos = refreshD51uRicdDrvPos();
     }
   		return d51uRicdDrvPos;
   }

  
	/**
	*  set variable d51uRicdDrvPos
	*  Corresponding COBOL Variable is D51U-RICD-DRV-POS
	*  @param value
	**/
   public void setD51uRicdDrvPos(char[] value) {
      d51uRicdDrvPos = checkD51uRicdDrvPosConstraints(value);
      serializeD51uRicdDrvPos(d51uRicdDrvPos);
   } 

     /**
	 * 	Update D51uRicdDrvPos 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uRicdDrvPos(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uRicdDrvPos,d51uRicdDrvPos.length);
   	
   }
   
   public void setD51uRicdDrvPos(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRicdDrvPos,d51uRicdDrvPos.length);
   	
   }
   
     /**
	 * 	Update D51uRicdDrvPos 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uRicdDrvPos(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRicdDrvPos+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uRicdDrvPos with another Field
	 *	@param value
	 */
   public void setD51uRicdDrvPos(Field source) {
       replace(source,0,source.length(),beginD51uRicdDrvPos,D_51U_RICD_DRV_POS_LEN);
   	
   }  
   
     /**
	 * 	Update D51uRicdDrvPos 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uRicdDrvPos(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uRicdDrvPos,D_51U_RICD_DRV_POS_LEN);
   	
   }
   
     /**
	 * 	Update D51uRicdDrvPos 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uRicdDrvPos(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRicdDrvPos+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uRicdDrvSvc
	 *	@return d51uRicdDrvSvc
	 */
   public char[] getD51uRicdDrvSvc() throws CFException{
     if (isD51uRicdDrvSvcModified()) { 
        d51uRicdDrvSvc = refreshD51uRicdDrvSvc();
     }
   		return d51uRicdDrvSvc;
   }

  
	/**
	*  set variable d51uRicdDrvSvc
	*  Corresponding COBOL Variable is D51U-RICD-DRV-SVC
	*  @param value
	**/
   public void setD51uRicdDrvSvc(char[] value) {
      d51uRicdDrvSvc = checkD51uRicdDrvSvcConstraints(value);
      serializeD51uRicdDrvSvc(d51uRicdDrvSvc);
   } 

     /**
	 * 	Update D51uRicdDrvSvc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uRicdDrvSvc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uRicdDrvSvc,d51uRicdDrvSvc.length);
   	
   }
   
   public void setD51uRicdDrvSvc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRicdDrvSvc,d51uRicdDrvSvc.length);
   	
   }
   
     /**
	 * 	Update D51uRicdDrvSvc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uRicdDrvSvc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRicdDrvSvc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uRicdDrvSvc with another Field
	 *	@param value
	 */
   public void setD51uRicdDrvSvc(Field source) {
       replace(source,0,source.length(),beginD51uRicdDrvSvc,D_51U_RICD_DRV_SVC_LEN);
   	
   }  
   
     /**
	 * 	Update D51uRicdDrvSvc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uRicdDrvSvc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uRicdDrvSvc,D_51U_RICD_DRV_SVC_LEN);
   	
   }
   
     /**
	 * 	Update D51uRicdDrvSvc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uRicdDrvSvc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRicdDrvSvc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uRicdDrvCau
	 *	@return d51uRicdDrvCau
	 */
   public char[] getD51uRicdDrvCau() throws CFException{
     if (isD51uRicdDrvCauModified()) { 
        d51uRicdDrvCau = refreshD51uRicdDrvCau();
     }
   		return d51uRicdDrvCau;
   }

  
	/**
	*  set variable d51uRicdDrvCau
	*  Corresponding COBOL Variable is D51U-RICD-DRV-CAU
	*  @param value
	**/
   public void setD51uRicdDrvCau(char[] value) {
      d51uRicdDrvCau = checkD51uRicdDrvCauConstraints(value);
      serializeD51uRicdDrvCau(d51uRicdDrvCau);
   } 

     /**
	 * 	Update D51uRicdDrvCau 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uRicdDrvCau(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uRicdDrvCau,d51uRicdDrvCau.length);
   	
   }
   
   public void setD51uRicdDrvCau(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRicdDrvCau,d51uRicdDrvCau.length);
   	
   }
   
     /**
	 * 	Update D51uRicdDrvCau 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uRicdDrvCau(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRicdDrvCau+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uRicdDrvCau with another Field
	 *	@param value
	 */
   public void setD51uRicdDrvCau(Field source) {
       replace(source,0,source.length(),beginD51uRicdDrvCau,D_51U_RICD_DRV_CAU_LEN);
   	
   }  
   
     /**
	 * 	Update D51uRicdDrvCau 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uRicdDrvCau(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uRicdDrvCau,D_51U_RICD_DRV_CAU_LEN);
   	
   }
   
     /**
	 * 	Update D51uRicdDrvCau 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uRicdDrvCau(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRicdDrvCau+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uRicdClmIcdInd
	 *	@return d51uRicdClmIcdInd
	 */
   public char[] getD51uRicdClmIcdInd() throws CFException{
     if (isD51uRicdClmIcdIndModified()) { 
        d51uRicdClmIcdInd = refreshD51uRicdClmIcdInd();
     }
   		return d51uRicdClmIcdInd;
   }

  
	/**
	*  set variable d51uRicdClmIcdInd
	*  Corresponding COBOL Variable is D51U-RICD-CLM-ICD-IND
	*  @param value
	**/
   public void setD51uRicdClmIcdInd(char[] value) {
      d51uRicdClmIcdInd = checkD51uRicdClmIcdIndConstraints(value);
      serializeD51uRicdClmIcdInd(d51uRicdClmIcdInd);
   } 

     /**
	 * 	Update D51uRicdClmIcdInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uRicdClmIcdInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uRicdClmIcdInd,d51uRicdClmIcdInd.length);
   	
   }
   
   public void setD51uRicdClmIcdInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRicdClmIcdInd,d51uRicdClmIcdInd.length);
   	
   }
   
     /**
	 * 	Update D51uRicdClmIcdInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uRicdClmIcdInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRicdClmIcdInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uRicdClmIcdInd with another Field
	 *	@param value
	 */
   public void setD51uRicdClmIcdInd(Field source) {
       replace(source,0,source.length(),beginD51uRicdClmIcdInd,D_51U_RICD_CLM_ICD_IND_LEN);
   	
   }  
   
     /**
	 * 	Update D51uRicdClmIcdInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uRicdClmIcdInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uRicdClmIcdInd,D_51U_RICD_CLM_ICD_IND_LEN);
   	
   }
   
     /**
	 * 	Update D51uRicdClmIcdInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uRicdClmIcdInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRicdClmIcdInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uRicdClmIcdFromCd
	 *	@return d51uRicdClmIcdFromCd
	 */
   public char[] getD51uRicdClmIcdFromCd() throws CFException{
     if (isD51uRicdClmIcdFromCdModified()) { 
        d51uRicdClmIcdFromCd = refreshD51uRicdClmIcdFromCd();
     }
   		return d51uRicdClmIcdFromCd;
   }

  
	/**
	*  set variable d51uRicdClmIcdFromCd
	*  Corresponding COBOL Variable is D51U-RICD-CLM-ICD-FROM-CD
	*  @param value
	**/
   public void setD51uRicdClmIcdFromCd(char[] value) {
      d51uRicdClmIcdFromCd = checkD51uRicdClmIcdFromCdConstraints(value);
      serializeD51uRicdClmIcdFromCd(d51uRicdClmIcdFromCd);
   } 

     /**
	 * 	Update D51uRicdClmIcdFromCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uRicdClmIcdFromCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uRicdClmIcdFromCd,d51uRicdClmIcdFromCd.length);
   	
   }
   
   public void setD51uRicdClmIcdFromCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRicdClmIcdFromCd,d51uRicdClmIcdFromCd.length);
   	
   }
   
     /**
	 * 	Update D51uRicdClmIcdFromCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uRicdClmIcdFromCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRicdClmIcdFromCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uRicdClmIcdFromCd with another Field
	 *	@param value
	 */
   public void setD51uRicdClmIcdFromCd(Field source) {
       replace(source,0,source.length(),beginD51uRicdClmIcdFromCd,D_51U_RICD_CLM_ICD_FROM_CD_LEN);
   	
   }  
   
     /**
	 * 	Update D51uRicdClmIcdFromCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uRicdClmIcdFromCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uRicdClmIcdFromCd,D_51U_RICD_CLM_ICD_FROM_CD_LEN);
   	
   }
   
     /**
	 * 	Update D51uRicdClmIcdFromCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uRicdClmIcdFromCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRicdClmIcdFromCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uRicdClmIcdToCd
	 *	@return d51uRicdClmIcdToCd
	 */
   public char[] getD51uRicdClmIcdToCd() throws CFException{
     if (isD51uRicdClmIcdToCdModified()) { 
        d51uRicdClmIcdToCd = refreshD51uRicdClmIcdToCd();
     }
   		return d51uRicdClmIcdToCd;
   }

  
	/**
	*  set variable d51uRicdClmIcdToCd
	*  Corresponding COBOL Variable is D51U-RICD-CLM-ICD-TO-CD
	*  @param value
	**/
   public void setD51uRicdClmIcdToCd(char[] value) {
      d51uRicdClmIcdToCd = checkD51uRicdClmIcdToCdConstraints(value);
      serializeD51uRicdClmIcdToCd(d51uRicdClmIcdToCd);
   } 

     /**
	 * 	Update D51uRicdClmIcdToCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uRicdClmIcdToCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uRicdClmIcdToCd,d51uRicdClmIcdToCd.length);
   	
   }
   
   public void setD51uRicdClmIcdToCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRicdClmIcdToCd,d51uRicdClmIcdToCd.length);
   	
   }
   
     /**
	 * 	Update D51uRicdClmIcdToCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uRicdClmIcdToCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRicdClmIcdToCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uRicdClmIcdToCd with another Field
	 *	@param value
	 */
   public void setD51uRicdClmIcdToCd(Field source) {
       replace(source,0,source.length(),beginD51uRicdClmIcdToCd,D_51U_RICD_CLM_ICD_TO_CD_LEN);
   	
   }  
   
     /**
	 * 	Update D51uRicdClmIcdToCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uRicdClmIcdToCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uRicdClmIcdToCd,D_51U_RICD_CLM_ICD_TO_CD_LEN);
   	
   }
   
     /**
	 * 	Update D51uRicdClmIcdToCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uRicdClmIcdToCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uRicdClmIcdToCd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getD51uRetRuleIcdFieldLength() {
			return D_51U_RET_RULE_ICD_LENGTH;
		}

}
  
