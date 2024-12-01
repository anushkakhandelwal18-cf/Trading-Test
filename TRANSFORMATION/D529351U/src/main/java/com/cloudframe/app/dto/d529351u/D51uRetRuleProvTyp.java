package com.cloudframe.app.dto.d529351u;

/**
*  The class D51uRetRuleProvTyp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:50. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class D51uRetRuleProvTyp extends D51uRetRuleProvTypSerialized { 
   

						private char[] d51uPtypDrvPos = Field.fillLowValue(2);

						private char[] d51uPtypDrvSvc = Field.fillLowValue(6);

						private char[] d51uPtypDrvCau = Field.fillLowValue(1);

						private char[] d51uPtypProvTyp = Field.fillLowValue(2);
	
	/**
	* Constructor for D51uRetRuleProvTyp
	**/
    public D51uRetRuleProvTyp() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for D51uRetRuleProvTyp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uRetRuleProvTyp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of d51uPtypDrvPos
	 *	@return d51uPtypDrvPos
	 */
   public char[] getD51uPtypDrvPos() throws CFException{
     if (isD51uPtypDrvPosModified()) { 
        d51uPtypDrvPos = refreshD51uPtypDrvPos();
     }
   		return d51uPtypDrvPos;
   }

  
	/**
	*  set variable d51uPtypDrvPos
	*  Corresponding COBOL Variable is D51U-PTYP-DRV-POS
	*  @param value
	**/
   public void setD51uPtypDrvPos(char[] value) {
      d51uPtypDrvPos = checkD51uPtypDrvPosConstraints(value);
      serializeD51uPtypDrvPos(d51uPtypDrvPos);
   } 

     /**
	 * 	Update D51uPtypDrvPos 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uPtypDrvPos(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uPtypDrvPos,d51uPtypDrvPos.length);
   	
   }
   
   public void setD51uPtypDrvPos(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uPtypDrvPos,d51uPtypDrvPos.length);
   	
   }
   
     /**
	 * 	Update D51uPtypDrvPos 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uPtypDrvPos(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uPtypDrvPos+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uPtypDrvPos with another Field
	 *	@param value
	 */
   public void setD51uPtypDrvPos(Field source) {
       replace(source,0,source.length(),beginD51uPtypDrvPos,D_51U_PTYP_DRV_POS_LEN);
   	
   }  
   
     /**
	 * 	Update D51uPtypDrvPos 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uPtypDrvPos(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uPtypDrvPos,D_51U_PTYP_DRV_POS_LEN);
   	
   }
   
     /**
	 * 	Update D51uPtypDrvPos 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uPtypDrvPos(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uPtypDrvPos+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uPtypDrvSvc
	 *	@return d51uPtypDrvSvc
	 */
   public char[] getD51uPtypDrvSvc() throws CFException{
     if (isD51uPtypDrvSvcModified()) { 
        d51uPtypDrvSvc = refreshD51uPtypDrvSvc();
     }
   		return d51uPtypDrvSvc;
   }

  
	/**
	*  set variable d51uPtypDrvSvc
	*  Corresponding COBOL Variable is D51U-PTYP-DRV-SVC
	*  @param value
	**/
   public void setD51uPtypDrvSvc(char[] value) {
      d51uPtypDrvSvc = checkD51uPtypDrvSvcConstraints(value);
      serializeD51uPtypDrvSvc(d51uPtypDrvSvc);
   } 

     /**
	 * 	Update D51uPtypDrvSvc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uPtypDrvSvc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uPtypDrvSvc,d51uPtypDrvSvc.length);
   	
   }
   
   public void setD51uPtypDrvSvc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uPtypDrvSvc,d51uPtypDrvSvc.length);
   	
   }
   
     /**
	 * 	Update D51uPtypDrvSvc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uPtypDrvSvc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uPtypDrvSvc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uPtypDrvSvc with another Field
	 *	@param value
	 */
   public void setD51uPtypDrvSvc(Field source) {
       replace(source,0,source.length(),beginD51uPtypDrvSvc,D_51U_PTYP_DRV_SVC_LEN);
   	
   }  
   
     /**
	 * 	Update D51uPtypDrvSvc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uPtypDrvSvc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uPtypDrvSvc,D_51U_PTYP_DRV_SVC_LEN);
   	
   }
   
     /**
	 * 	Update D51uPtypDrvSvc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uPtypDrvSvc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uPtypDrvSvc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uPtypDrvCau
	 *	@return d51uPtypDrvCau
	 */
   public char[] getD51uPtypDrvCau() throws CFException{
     if (isD51uPtypDrvCauModified()) { 
        d51uPtypDrvCau = refreshD51uPtypDrvCau();
     }
   		return d51uPtypDrvCau;
   }

  
	/**
	*  set variable d51uPtypDrvCau
	*  Corresponding COBOL Variable is D51U-PTYP-DRV-CAU
	*  @param value
	**/
   public void setD51uPtypDrvCau(char[] value) {
      d51uPtypDrvCau = checkD51uPtypDrvCauConstraints(value);
      serializeD51uPtypDrvCau(d51uPtypDrvCau);
   } 

     /**
	 * 	Update D51uPtypDrvCau 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uPtypDrvCau(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uPtypDrvCau,d51uPtypDrvCau.length);
   	
   }
   
   public void setD51uPtypDrvCau(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uPtypDrvCau,d51uPtypDrvCau.length);
   	
   }
   
     /**
	 * 	Update D51uPtypDrvCau 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uPtypDrvCau(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uPtypDrvCau+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uPtypDrvCau with another Field
	 *	@param value
	 */
   public void setD51uPtypDrvCau(Field source) {
       replace(source,0,source.length(),beginD51uPtypDrvCau,D_51U_PTYP_DRV_CAU_LEN);
   	
   }  
   
     /**
	 * 	Update D51uPtypDrvCau 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uPtypDrvCau(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uPtypDrvCau,D_51U_PTYP_DRV_CAU_LEN);
   	
   }
   
     /**
	 * 	Update D51uPtypDrvCau 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uPtypDrvCau(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uPtypDrvCau+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uPtypProvTyp
	 *	@return d51uPtypProvTyp
	 */
   public char[] getD51uPtypProvTyp() throws CFException{
     if (isD51uPtypProvTypModified()) { 
        d51uPtypProvTyp = refreshD51uPtypProvTyp();
     }
   		return d51uPtypProvTyp;
   }

  
	/**
	*  set variable d51uPtypProvTyp
	*  Corresponding COBOL Variable is D51U-PTYP-PROV-TYP
	*  @param value
	**/
   public void setD51uPtypProvTyp(char[] value) {
      d51uPtypProvTyp = checkD51uPtypProvTypConstraints(value);
      serializeD51uPtypProvTyp(d51uPtypProvTyp);
   } 

     /**
	 * 	Update D51uPtypProvTyp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uPtypProvTyp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uPtypProvTyp,d51uPtypProvTyp.length);
   	
   }
   
   public void setD51uPtypProvTyp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uPtypProvTyp,d51uPtypProvTyp.length);
   	
   }
   
     /**
	 * 	Update D51uPtypProvTyp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uPtypProvTyp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uPtypProvTyp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uPtypProvTyp with another Field
	 *	@param value
	 */
   public void setD51uPtypProvTyp(Field source) {
       replace(source,0,source.length(),beginD51uPtypProvTyp,D_51U_PTYP_PROV_TYP_LEN);
   	
   }  
   
     /**
	 * 	Update D51uPtypProvTyp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uPtypProvTyp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uPtypProvTyp,D_51U_PTYP_PROV_TYP_LEN);
   	
   }
   
     /**
	 * 	Update D51uPtypProvTyp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uPtypProvTyp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uPtypProvTyp+targetIndex,targetLen);
    
   }

	
	
	

		public static int getD51uRetRuleProvTypFieldLength() {
			return D_51U_RET_RULE_PROV_TYP_LENGTH;
		}

}
  
