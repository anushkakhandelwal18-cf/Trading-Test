package com.cloudframe.app.dto.d529351u;

/**
*  The class D51uRetRulCpeFlg is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:50. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class D51uRetRulCpeFlg extends D51uRetRulCpeFlgSerialized { 
   

						private char[] d51uCflgDrvPos = Field.fillLowValue(2);

						private char[] d51uCflgDrvSvc = Field.fillLowValue(6);

						private char[] d51uCflgDrvCau = Field.fillLowValue(1);

						private char[] d51uCflgCpeDescCd = Field.fillLowValue(4);
	
	/**
	* Constructor for D51uRetRulCpeFlg
	**/
    public D51uRetRulCpeFlg() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for D51uRetRulCpeFlg. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uRetRulCpeFlg(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of d51uCflgDrvPos
	 *	@return d51uCflgDrvPos
	 */
   public char[] getD51uCflgDrvPos() throws CFException{
     if (isD51uCflgDrvPosModified()) { 
        d51uCflgDrvPos = refreshD51uCflgDrvPos();
     }
   		return d51uCflgDrvPos;
   }

  
	/**
	*  set variable d51uCflgDrvPos
	*  Corresponding COBOL Variable is D51U-CFLG-DRV-POS
	*  @param value
	**/
   public void setD51uCflgDrvPos(char[] value) {
      d51uCflgDrvPos = checkD51uCflgDrvPosConstraints(value);
      serializeD51uCflgDrvPos(d51uCflgDrvPos);
   } 

     /**
	 * 	Update D51uCflgDrvPos 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uCflgDrvPos(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uCflgDrvPos,d51uCflgDrvPos.length);
   	
   }
   
   public void setD51uCflgDrvPos(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uCflgDrvPos,d51uCflgDrvPos.length);
   	
   }
   
     /**
	 * 	Update D51uCflgDrvPos 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uCflgDrvPos(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uCflgDrvPos+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uCflgDrvPos with another Field
	 *	@param value
	 */
   public void setD51uCflgDrvPos(Field source) {
       replace(source,0,source.length(),beginD51uCflgDrvPos,D_51U_CFLG_DRV_POS_LEN);
   	
   }  
   
     /**
	 * 	Update D51uCflgDrvPos 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uCflgDrvPos(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uCflgDrvPos,D_51U_CFLG_DRV_POS_LEN);
   	
   }
   
     /**
	 * 	Update D51uCflgDrvPos 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uCflgDrvPos(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uCflgDrvPos+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uCflgDrvSvc
	 *	@return d51uCflgDrvSvc
	 */
   public char[] getD51uCflgDrvSvc() throws CFException{
     if (isD51uCflgDrvSvcModified()) { 
        d51uCflgDrvSvc = refreshD51uCflgDrvSvc();
     }
   		return d51uCflgDrvSvc;
   }

  
	/**
	*  set variable d51uCflgDrvSvc
	*  Corresponding COBOL Variable is D51U-CFLG-DRV-SVC
	*  @param value
	**/
   public void setD51uCflgDrvSvc(char[] value) {
      d51uCflgDrvSvc = checkD51uCflgDrvSvcConstraints(value);
      serializeD51uCflgDrvSvc(d51uCflgDrvSvc);
   } 

     /**
	 * 	Update D51uCflgDrvSvc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uCflgDrvSvc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uCflgDrvSvc,d51uCflgDrvSvc.length);
   	
   }
   
   public void setD51uCflgDrvSvc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uCflgDrvSvc,d51uCflgDrvSvc.length);
   	
   }
   
     /**
	 * 	Update D51uCflgDrvSvc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uCflgDrvSvc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uCflgDrvSvc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uCflgDrvSvc with another Field
	 *	@param value
	 */
   public void setD51uCflgDrvSvc(Field source) {
       replace(source,0,source.length(),beginD51uCflgDrvSvc,D_51U_CFLG_DRV_SVC_LEN);
   	
   }  
   
     /**
	 * 	Update D51uCflgDrvSvc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uCflgDrvSvc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uCflgDrvSvc,D_51U_CFLG_DRV_SVC_LEN);
   	
   }
   
     /**
	 * 	Update D51uCflgDrvSvc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uCflgDrvSvc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uCflgDrvSvc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uCflgDrvCau
	 *	@return d51uCflgDrvCau
	 */
   public char[] getD51uCflgDrvCau() throws CFException{
     if (isD51uCflgDrvCauModified()) { 
        d51uCflgDrvCau = refreshD51uCflgDrvCau();
     }
   		return d51uCflgDrvCau;
   }

  
	/**
	*  set variable d51uCflgDrvCau
	*  Corresponding COBOL Variable is D51U-CFLG-DRV-CAU
	*  @param value
	**/
   public void setD51uCflgDrvCau(char[] value) {
      d51uCflgDrvCau = checkD51uCflgDrvCauConstraints(value);
      serializeD51uCflgDrvCau(d51uCflgDrvCau);
   } 

     /**
	 * 	Update D51uCflgDrvCau 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uCflgDrvCau(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uCflgDrvCau,d51uCflgDrvCau.length);
   	
   }
   
   public void setD51uCflgDrvCau(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uCflgDrvCau,d51uCflgDrvCau.length);
   	
   }
   
     /**
	 * 	Update D51uCflgDrvCau 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uCflgDrvCau(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uCflgDrvCau+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uCflgDrvCau with another Field
	 *	@param value
	 */
   public void setD51uCflgDrvCau(Field source) {
       replace(source,0,source.length(),beginD51uCflgDrvCau,D_51U_CFLG_DRV_CAU_LEN);
   	
   }  
   
     /**
	 * 	Update D51uCflgDrvCau 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uCflgDrvCau(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uCflgDrvCau,D_51U_CFLG_DRV_CAU_LEN);
   	
   }
   
     /**
	 * 	Update D51uCflgDrvCau 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uCflgDrvCau(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uCflgDrvCau+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uCflgCpeDescCd
	 *	@return d51uCflgCpeDescCd
	 */
   public char[] getD51uCflgCpeDescCd() throws CFException{
     if (isD51uCflgCpeDescCdModified()) { 
        d51uCflgCpeDescCd = refreshD51uCflgCpeDescCd();
     }
   		return d51uCflgCpeDescCd;
   }

  
	/**
	*  set variable d51uCflgCpeDescCd
	*  Corresponding COBOL Variable is D51U-CFLG-CPE-DESC-CD
	*  @param value
	**/
   public void setD51uCflgCpeDescCd(char[] value) {
      d51uCflgCpeDescCd = checkD51uCflgCpeDescCdConstraints(value);
      serializeD51uCflgCpeDescCd(d51uCflgCpeDescCd);
   } 

     /**
	 * 	Update D51uCflgCpeDescCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uCflgCpeDescCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uCflgCpeDescCd,d51uCflgCpeDescCd.length);
   	
   }
   
   public void setD51uCflgCpeDescCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uCflgCpeDescCd,d51uCflgCpeDescCd.length);
   	
   }
   
     /**
	 * 	Update D51uCflgCpeDescCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uCflgCpeDescCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uCflgCpeDescCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uCflgCpeDescCd with another Field
	 *	@param value
	 */
   public void setD51uCflgCpeDescCd(Field source) {
       replace(source,0,source.length(),beginD51uCflgCpeDescCd,D_51U_CFLG_CPE_DESC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update D51uCflgCpeDescCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uCflgCpeDescCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uCflgCpeDescCd,D_51U_CFLG_CPE_DESC_CD_LEN);
   	
   }
   
     /**
	 * 	Update D51uCflgCpeDescCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uCflgCpeDescCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uCflgCpeDescCd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getD51uRetRulCpeFlgFieldLength() {
			return D_51U_RET_RUL_CPE_FLG_LENGTH;
		}

}
  
