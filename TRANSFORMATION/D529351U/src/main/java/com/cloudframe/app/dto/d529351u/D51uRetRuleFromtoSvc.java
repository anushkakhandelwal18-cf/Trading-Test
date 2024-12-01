package com.cloudframe.app.dto.d529351u;

/**
*  The class D51uRetRuleFromtoSvc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:50. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class D51uRetRuleFromtoSvc extends D51uRetRuleFromtoSvcSerialized { 
   

						private char[] d51uFrtoDrvPos = Field.fillLowValue(2);

						private char[] d51uFrtoDrvSvc = Field.fillLowValue(6);

						private char[] d51uFrtoDrvCau = Field.fillLowValue(1);

						private char[] d51uFrtoClmFrmSvcCd = Field.fillLowValue(6);

						private char[] d51uFrtoClmToSvcCd = Field.fillLowValue(6);

						private char[] d51uFrtoSvcTypCd = Field.fillLowValue(1);
	
	/**
	* Constructor for D51uRetRuleFromtoSvc
	**/
    public D51uRetRuleFromtoSvc() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for D51uRetRuleFromtoSvc. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uRetRuleFromtoSvc(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of d51uFrtoDrvPos
	 *	@return d51uFrtoDrvPos
	 */
   public char[] getD51uFrtoDrvPos() throws CFException{
     if (isD51uFrtoDrvPosModified()) { 
        d51uFrtoDrvPos = refreshD51uFrtoDrvPos();
     }
   		return d51uFrtoDrvPos;
   }

  
	/**
	*  set variable d51uFrtoDrvPos
	*  Corresponding COBOL Variable is D51U-FRTO-DRV-POS
	*  @param value
	**/
   public void setD51uFrtoDrvPos(char[] value) {
      d51uFrtoDrvPos = checkD51uFrtoDrvPosConstraints(value);
      serializeD51uFrtoDrvPos(d51uFrtoDrvPos);
   } 

     /**
	 * 	Update D51uFrtoDrvPos 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uFrtoDrvPos(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uFrtoDrvPos,d51uFrtoDrvPos.length);
   	
   }
   
   public void setD51uFrtoDrvPos(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uFrtoDrvPos,d51uFrtoDrvPos.length);
   	
   }
   
     /**
	 * 	Update D51uFrtoDrvPos 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uFrtoDrvPos(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uFrtoDrvPos+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uFrtoDrvPos with another Field
	 *	@param value
	 */
   public void setD51uFrtoDrvPos(Field source) {
       replace(source,0,source.length(),beginD51uFrtoDrvPos,D_51U_FRTO_DRV_POS_LEN);
   	
   }  
   
     /**
	 * 	Update D51uFrtoDrvPos 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uFrtoDrvPos(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uFrtoDrvPos,D_51U_FRTO_DRV_POS_LEN);
   	
   }
   
     /**
	 * 	Update D51uFrtoDrvPos 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uFrtoDrvPos(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uFrtoDrvPos+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uFrtoDrvSvc
	 *	@return d51uFrtoDrvSvc
	 */
   public char[] getD51uFrtoDrvSvc() throws CFException{
     if (isD51uFrtoDrvSvcModified()) { 
        d51uFrtoDrvSvc = refreshD51uFrtoDrvSvc();
     }
   		return d51uFrtoDrvSvc;
   }

  
	/**
	*  set variable d51uFrtoDrvSvc
	*  Corresponding COBOL Variable is D51U-FRTO-DRV-SVC
	*  @param value
	**/
   public void setD51uFrtoDrvSvc(char[] value) {
      d51uFrtoDrvSvc = checkD51uFrtoDrvSvcConstraints(value);
      serializeD51uFrtoDrvSvc(d51uFrtoDrvSvc);
   } 

     /**
	 * 	Update D51uFrtoDrvSvc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uFrtoDrvSvc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uFrtoDrvSvc,d51uFrtoDrvSvc.length);
   	
   }
   
   public void setD51uFrtoDrvSvc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uFrtoDrvSvc,d51uFrtoDrvSvc.length);
   	
   }
   
     /**
	 * 	Update D51uFrtoDrvSvc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uFrtoDrvSvc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uFrtoDrvSvc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uFrtoDrvSvc with another Field
	 *	@param value
	 */
   public void setD51uFrtoDrvSvc(Field source) {
       replace(source,0,source.length(),beginD51uFrtoDrvSvc,D_51U_FRTO_DRV_SVC_LEN);
   	
   }  
   
     /**
	 * 	Update D51uFrtoDrvSvc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uFrtoDrvSvc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uFrtoDrvSvc,D_51U_FRTO_DRV_SVC_LEN);
   	
   }
   
     /**
	 * 	Update D51uFrtoDrvSvc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uFrtoDrvSvc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uFrtoDrvSvc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uFrtoDrvCau
	 *	@return d51uFrtoDrvCau
	 */
   public char[] getD51uFrtoDrvCau() throws CFException{
     if (isD51uFrtoDrvCauModified()) { 
        d51uFrtoDrvCau = refreshD51uFrtoDrvCau();
     }
   		return d51uFrtoDrvCau;
   }

  
	/**
	*  set variable d51uFrtoDrvCau
	*  Corresponding COBOL Variable is D51U-FRTO-DRV-CAU
	*  @param value
	**/
   public void setD51uFrtoDrvCau(char[] value) {
      d51uFrtoDrvCau = checkD51uFrtoDrvCauConstraints(value);
      serializeD51uFrtoDrvCau(d51uFrtoDrvCau);
   } 

     /**
	 * 	Update D51uFrtoDrvCau 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uFrtoDrvCau(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uFrtoDrvCau,d51uFrtoDrvCau.length);
   	
   }
   
   public void setD51uFrtoDrvCau(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uFrtoDrvCau,d51uFrtoDrvCau.length);
   	
   }
   
     /**
	 * 	Update D51uFrtoDrvCau 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uFrtoDrvCau(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uFrtoDrvCau+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uFrtoDrvCau with another Field
	 *	@param value
	 */
   public void setD51uFrtoDrvCau(Field source) {
       replace(source,0,source.length(),beginD51uFrtoDrvCau,D_51U_FRTO_DRV_CAU_LEN);
   	
   }  
   
     /**
	 * 	Update D51uFrtoDrvCau 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uFrtoDrvCau(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uFrtoDrvCau,D_51U_FRTO_DRV_CAU_LEN);
   	
   }
   
     /**
	 * 	Update D51uFrtoDrvCau 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uFrtoDrvCau(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uFrtoDrvCau+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uFrtoClmFrmSvcCd
	 *	@return d51uFrtoClmFrmSvcCd
	 */
   public char[] getD51uFrtoClmFrmSvcCd() throws CFException{
     if (isD51uFrtoClmFrmSvcCdModified()) { 
        d51uFrtoClmFrmSvcCd = refreshD51uFrtoClmFrmSvcCd();
     }
   		return d51uFrtoClmFrmSvcCd;
   }

  
	/**
	*  set variable d51uFrtoClmFrmSvcCd
	*  Corresponding COBOL Variable is D51U-FRTO-CLM-FRM-SVC-CD
	*  @param value
	**/
   public void setD51uFrtoClmFrmSvcCd(char[] value) {
      d51uFrtoClmFrmSvcCd = checkD51uFrtoClmFrmSvcCdConstraints(value);
      serializeD51uFrtoClmFrmSvcCd(d51uFrtoClmFrmSvcCd);
   } 

     /**
	 * 	Update D51uFrtoClmFrmSvcCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uFrtoClmFrmSvcCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uFrtoClmFrmSvcCd,d51uFrtoClmFrmSvcCd.length);
   	
   }
   
   public void setD51uFrtoClmFrmSvcCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uFrtoClmFrmSvcCd,d51uFrtoClmFrmSvcCd.length);
   	
   }
   
     /**
	 * 	Update D51uFrtoClmFrmSvcCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uFrtoClmFrmSvcCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uFrtoClmFrmSvcCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uFrtoClmFrmSvcCd with another Field
	 *	@param value
	 */
   public void setD51uFrtoClmFrmSvcCd(Field source) {
       replace(source,0,source.length(),beginD51uFrtoClmFrmSvcCd,D_51U_FRTO_CLM_FRM_SVC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update D51uFrtoClmFrmSvcCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uFrtoClmFrmSvcCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uFrtoClmFrmSvcCd,D_51U_FRTO_CLM_FRM_SVC_CD_LEN);
   	
   }
   
     /**
	 * 	Update D51uFrtoClmFrmSvcCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uFrtoClmFrmSvcCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uFrtoClmFrmSvcCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uFrtoClmToSvcCd
	 *	@return d51uFrtoClmToSvcCd
	 */
   public char[] getD51uFrtoClmToSvcCd() throws CFException{
     if (isD51uFrtoClmToSvcCdModified()) { 
        d51uFrtoClmToSvcCd = refreshD51uFrtoClmToSvcCd();
     }
   		return d51uFrtoClmToSvcCd;
   }

  
	/**
	*  set variable d51uFrtoClmToSvcCd
	*  Corresponding COBOL Variable is D51U-FRTO-CLM-TO-SVC-CD
	*  @param value
	**/
   public void setD51uFrtoClmToSvcCd(char[] value) {
      d51uFrtoClmToSvcCd = checkD51uFrtoClmToSvcCdConstraints(value);
      serializeD51uFrtoClmToSvcCd(d51uFrtoClmToSvcCd);
   } 

     /**
	 * 	Update D51uFrtoClmToSvcCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uFrtoClmToSvcCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uFrtoClmToSvcCd,d51uFrtoClmToSvcCd.length);
   	
   }
   
   public void setD51uFrtoClmToSvcCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uFrtoClmToSvcCd,d51uFrtoClmToSvcCd.length);
   	
   }
   
     /**
	 * 	Update D51uFrtoClmToSvcCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uFrtoClmToSvcCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uFrtoClmToSvcCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uFrtoClmToSvcCd with another Field
	 *	@param value
	 */
   public void setD51uFrtoClmToSvcCd(Field source) {
       replace(source,0,source.length(),beginD51uFrtoClmToSvcCd,D_51U_FRTO_CLM_TO_SVC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update D51uFrtoClmToSvcCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uFrtoClmToSvcCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uFrtoClmToSvcCd,D_51U_FRTO_CLM_TO_SVC_CD_LEN);
   	
   }
   
     /**
	 * 	Update D51uFrtoClmToSvcCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uFrtoClmToSvcCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uFrtoClmToSvcCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uFrtoSvcTypCd
	 *	@return d51uFrtoSvcTypCd
	 */
   public char[] getD51uFrtoSvcTypCd() throws CFException{
     if (isD51uFrtoSvcTypCdModified()) { 
        d51uFrtoSvcTypCd = refreshD51uFrtoSvcTypCd();
     }
   		return d51uFrtoSvcTypCd;
   }

  
	/**
	*  set variable d51uFrtoSvcTypCd
	*  Corresponding COBOL Variable is D51U-FRTO-SVC-TYP-CD
	*  @param value
	**/
   public void setD51uFrtoSvcTypCd(char[] value) {
      d51uFrtoSvcTypCd = checkD51uFrtoSvcTypCdConstraints(value);
      serializeD51uFrtoSvcTypCd(d51uFrtoSvcTypCd);
   } 

     /**
	 * 	Update D51uFrtoSvcTypCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uFrtoSvcTypCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uFrtoSvcTypCd,d51uFrtoSvcTypCd.length);
   	
   }
   
   public void setD51uFrtoSvcTypCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uFrtoSvcTypCd,d51uFrtoSvcTypCd.length);
   	
   }
   
     /**
	 * 	Update D51uFrtoSvcTypCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uFrtoSvcTypCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uFrtoSvcTypCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uFrtoSvcTypCd with another Field
	 *	@param value
	 */
   public void setD51uFrtoSvcTypCd(Field source) {
       replace(source,0,source.length(),beginD51uFrtoSvcTypCd,D_51U_FRTO_SVC_TYP_CD_LEN);
   	
   }  
   
     /**
	 * 	Update D51uFrtoSvcTypCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uFrtoSvcTypCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uFrtoSvcTypCd,D_51U_FRTO_SVC_TYP_CD_LEN);
   	
   }
   
     /**
	 * 	Update D51uFrtoSvcTypCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uFrtoSvcTypCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uFrtoSvcTypCd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getD51uRetRuleFromtoSvcFieldLength() {
			return D_51U_RET_RULE_FROMTO_SVC_LENGTH;
		}

}
  
