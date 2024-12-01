package com.cloudframe.app.dto.d529351u;

/**
*  The class D51uLstIcdKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:50. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class D51uLstIcdKey extends D51uLstIcdKeySerialized { 
   

						private char[] d51uLstClmIcdInd = Field.fillLowValue(1);

						private char[] d51uLstClmIcdPos = Field.fillLowValue(2);

						private char[] d51uLstClmIcdSvc = Field.fillLowValue(6);

						private char[] d51uLstClmIcdCau = Field.fillLowValue(1);
	
	/**
	* Constructor for D51uLstIcdKey
	**/
    public D51uLstIcdKey() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for D51uLstIcdKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uLstIcdKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of d51uLstClmIcdInd
	 *	@return d51uLstClmIcdInd
	 */
   public char[] getD51uLstClmIcdInd() throws CFException{
     if (isD51uLstClmIcdIndModified()) { 
        d51uLstClmIcdInd = refreshD51uLstClmIcdInd();
     }
   		return d51uLstClmIcdInd;
   }

  
	/**
	*  set variable d51uLstClmIcdInd
	*  Corresponding COBOL Variable is D51U-LST-CLM-ICD-IND
	*  @param value
	**/
   public void setD51uLstClmIcdInd(char[] value) {
      d51uLstClmIcdInd = checkD51uLstClmIcdIndConstraints(value);
      serializeD51uLstClmIcdInd(d51uLstClmIcdInd);
   } 

     /**
	 * 	Update D51uLstClmIcdInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uLstClmIcdInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uLstClmIcdInd,d51uLstClmIcdInd.length);
   	
   }
   
   public void setD51uLstClmIcdInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uLstClmIcdInd,d51uLstClmIcdInd.length);
   	
   }
   
     /**
	 * 	Update D51uLstClmIcdInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uLstClmIcdInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uLstClmIcdInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uLstClmIcdInd with another Field
	 *	@param value
	 */
   public void setD51uLstClmIcdInd(Field source) {
       replace(source,0,source.length(),beginD51uLstClmIcdInd,D_51U_LST_CLM_ICD_IND_LEN);
   	
   }  
   
     /**
	 * 	Update D51uLstClmIcdInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uLstClmIcdInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uLstClmIcdInd,D_51U_LST_CLM_ICD_IND_LEN);
   	
   }
   
     /**
	 * 	Update D51uLstClmIcdInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uLstClmIcdInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uLstClmIcdInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uLstClmIcdPos
	 *	@return d51uLstClmIcdPos
	 */
   public char[] getD51uLstClmIcdPos() throws CFException{
     if (isD51uLstClmIcdPosModified()) { 
        d51uLstClmIcdPos = refreshD51uLstClmIcdPos();
     }
   		return d51uLstClmIcdPos;
   }

  
	/**
	*  set variable d51uLstClmIcdPos
	*  Corresponding COBOL Variable is D51U-LST-CLM-ICD-POS
	*  @param value
	**/
   public void setD51uLstClmIcdPos(char[] value) {
      d51uLstClmIcdPos = checkD51uLstClmIcdPosConstraints(value);
      serializeD51uLstClmIcdPos(d51uLstClmIcdPos);
   } 

     /**
	 * 	Update D51uLstClmIcdPos 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uLstClmIcdPos(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uLstClmIcdPos,d51uLstClmIcdPos.length);
   	
   }
   
   public void setD51uLstClmIcdPos(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uLstClmIcdPos,d51uLstClmIcdPos.length);
   	
   }
   
     /**
	 * 	Update D51uLstClmIcdPos 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uLstClmIcdPos(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uLstClmIcdPos+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uLstClmIcdPos with another Field
	 *	@param value
	 */
   public void setD51uLstClmIcdPos(Field source) {
       replace(source,0,source.length(),beginD51uLstClmIcdPos,D_51U_LST_CLM_ICD_POS_LEN);
   	
   }  
   
     /**
	 * 	Update D51uLstClmIcdPos 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uLstClmIcdPos(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uLstClmIcdPos,D_51U_LST_CLM_ICD_POS_LEN);
   	
   }
   
     /**
	 * 	Update D51uLstClmIcdPos 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uLstClmIcdPos(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uLstClmIcdPos+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uLstClmIcdSvc
	 *	@return d51uLstClmIcdSvc
	 */
   public char[] getD51uLstClmIcdSvc() throws CFException{
     if (isD51uLstClmIcdSvcModified()) { 
        d51uLstClmIcdSvc = refreshD51uLstClmIcdSvc();
     }
   		return d51uLstClmIcdSvc;
   }

  
	/**
	*  set variable d51uLstClmIcdSvc
	*  Corresponding COBOL Variable is D51U-LST-CLM-ICD-SVC
	*  @param value
	**/
   public void setD51uLstClmIcdSvc(char[] value) {
      d51uLstClmIcdSvc = checkD51uLstClmIcdSvcConstraints(value);
      serializeD51uLstClmIcdSvc(d51uLstClmIcdSvc);
   } 

     /**
	 * 	Update D51uLstClmIcdSvc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uLstClmIcdSvc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uLstClmIcdSvc,d51uLstClmIcdSvc.length);
   	
   }
   
   public void setD51uLstClmIcdSvc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uLstClmIcdSvc,d51uLstClmIcdSvc.length);
   	
   }
   
     /**
	 * 	Update D51uLstClmIcdSvc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uLstClmIcdSvc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uLstClmIcdSvc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uLstClmIcdSvc with another Field
	 *	@param value
	 */
   public void setD51uLstClmIcdSvc(Field source) {
       replace(source,0,source.length(),beginD51uLstClmIcdSvc,D_51U_LST_CLM_ICD_SVC_LEN);
   	
   }  
   
     /**
	 * 	Update D51uLstClmIcdSvc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uLstClmIcdSvc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uLstClmIcdSvc,D_51U_LST_CLM_ICD_SVC_LEN);
   	
   }
   
     /**
	 * 	Update D51uLstClmIcdSvc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uLstClmIcdSvc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uLstClmIcdSvc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uLstClmIcdCau
	 *	@return d51uLstClmIcdCau
	 */
   public char[] getD51uLstClmIcdCau() throws CFException{
     if (isD51uLstClmIcdCauModified()) { 
        d51uLstClmIcdCau = refreshD51uLstClmIcdCau();
     }
   		return d51uLstClmIcdCau;
   }

  
	/**
	*  set variable d51uLstClmIcdCau
	*  Corresponding COBOL Variable is D51U-LST-CLM-ICD-CAU
	*  @param value
	**/
   public void setD51uLstClmIcdCau(char[] value) {
      d51uLstClmIcdCau = checkD51uLstClmIcdCauConstraints(value);
      serializeD51uLstClmIcdCau(d51uLstClmIcdCau);
   } 

     /**
	 * 	Update D51uLstClmIcdCau 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uLstClmIcdCau(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uLstClmIcdCau,d51uLstClmIcdCau.length);
   	
   }
   
   public void setD51uLstClmIcdCau(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uLstClmIcdCau,d51uLstClmIcdCau.length);
   	
   }
   
     /**
	 * 	Update D51uLstClmIcdCau 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uLstClmIcdCau(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uLstClmIcdCau+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uLstClmIcdCau with another Field
	 *	@param value
	 */
   public void setD51uLstClmIcdCau(Field source) {
       replace(source,0,source.length(),beginD51uLstClmIcdCau,D_51U_LST_CLM_ICD_CAU_LEN);
   	
   }  
   
     /**
	 * 	Update D51uLstClmIcdCau 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uLstClmIcdCau(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uLstClmIcdCau,D_51U_LST_CLM_ICD_CAU_LEN);
   	
   }
   
     /**
	 * 	Update D51uLstClmIcdCau 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uLstClmIcdCau(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uLstClmIcdCau+targetIndex,targetLen);
    
   }

	
	
	

		public static int getD51uLstIcdKeyFieldLength() {
			return D_51U_LST_ICD_KEY_LENGTH;
		}

}
  
