package com.cloudframe.app.dto.d529351u;

/**
*  The class D51uRetRulCause is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:50. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class D51uRetRulCause extends D51uRetRulCauseSerialized { 
   

						private char[] d51uCausDrvPos = Field.fillLowValue(2);

						private char[] d51uCausDrvSvc = Field.fillLowValue(6);

						private char[] d51uCausDrvCau = Field.fillLowValue(1);

						private char[] d51uCausClmCauseCd1 = Field.fillLowValue(1);

						private char[] d51uCausClmCauseCd2 = Field.fillLowValue(1);

						private char[] d51uCausClmCauseCd3 = Field.fillLowValue(1);

						private char[] d51uCausClmCauseCd4 = Field.fillLowValue(1);

						private char[] d51uCausClmCauseCd5 = Field.fillLowValue(1);

						private char[] d51uCausClmCauseCd6 = Field.fillLowValue(1);

						private char[] d51uCausClmCauseCd7 = Field.fillLowValue(1);

						private char[] d51uCausClmCauseCd8 = Field.fillLowValue(1);
	
	/**
	* Constructor for D51uRetRulCause
	**/
    public D51uRetRulCause() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for D51uRetRulCause. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uRetRulCause(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of d51uCausDrvPos
	 *	@return d51uCausDrvPos
	 */
   public char[] getD51uCausDrvPos() throws CFException{
     if (isD51uCausDrvPosModified()) { 
        d51uCausDrvPos = refreshD51uCausDrvPos();
     }
   		return d51uCausDrvPos;
   }

  
	/**
	*  set variable d51uCausDrvPos
	*  Corresponding COBOL Variable is D51U-CAUS-DRV-POS
	*  @param value
	**/
   public void setD51uCausDrvPos(char[] value) {
      d51uCausDrvPos = checkD51uCausDrvPosConstraints(value);
      serializeD51uCausDrvPos(d51uCausDrvPos);
   } 

     /**
	 * 	Update D51uCausDrvPos 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uCausDrvPos(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uCausDrvPos,d51uCausDrvPos.length);
   	
   }
   
   public void setD51uCausDrvPos(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uCausDrvPos,d51uCausDrvPos.length);
   	
   }
   
     /**
	 * 	Update D51uCausDrvPos 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uCausDrvPos(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uCausDrvPos+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uCausDrvPos with another Field
	 *	@param value
	 */
   public void setD51uCausDrvPos(Field source) {
       replace(source,0,source.length(),beginD51uCausDrvPos,D_51U_CAUS_DRV_POS_LEN);
   	
   }  
   
     /**
	 * 	Update D51uCausDrvPos 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uCausDrvPos(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uCausDrvPos,D_51U_CAUS_DRV_POS_LEN);
   	
   }
   
     /**
	 * 	Update D51uCausDrvPos 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uCausDrvPos(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uCausDrvPos+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uCausDrvSvc
	 *	@return d51uCausDrvSvc
	 */
   public char[] getD51uCausDrvSvc() throws CFException{
     if (isD51uCausDrvSvcModified()) { 
        d51uCausDrvSvc = refreshD51uCausDrvSvc();
     }
   		return d51uCausDrvSvc;
   }

  
	/**
	*  set variable d51uCausDrvSvc
	*  Corresponding COBOL Variable is D51U-CAUS-DRV-SVC
	*  @param value
	**/
   public void setD51uCausDrvSvc(char[] value) {
      d51uCausDrvSvc = checkD51uCausDrvSvcConstraints(value);
      serializeD51uCausDrvSvc(d51uCausDrvSvc);
   } 

     /**
	 * 	Update D51uCausDrvSvc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uCausDrvSvc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uCausDrvSvc,d51uCausDrvSvc.length);
   	
   }
   
   public void setD51uCausDrvSvc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uCausDrvSvc,d51uCausDrvSvc.length);
   	
   }
   
     /**
	 * 	Update D51uCausDrvSvc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uCausDrvSvc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uCausDrvSvc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uCausDrvSvc with another Field
	 *	@param value
	 */
   public void setD51uCausDrvSvc(Field source) {
       replace(source,0,source.length(),beginD51uCausDrvSvc,D_51U_CAUS_DRV_SVC_LEN);
   	
   }  
   
     /**
	 * 	Update D51uCausDrvSvc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uCausDrvSvc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uCausDrvSvc,D_51U_CAUS_DRV_SVC_LEN);
   	
   }
   
     /**
	 * 	Update D51uCausDrvSvc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uCausDrvSvc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uCausDrvSvc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uCausDrvCau
	 *	@return d51uCausDrvCau
	 */
   public char[] getD51uCausDrvCau() throws CFException{
     if (isD51uCausDrvCauModified()) { 
        d51uCausDrvCau = refreshD51uCausDrvCau();
     }
   		return d51uCausDrvCau;
   }

  
	/**
	*  set variable d51uCausDrvCau
	*  Corresponding COBOL Variable is D51U-CAUS-DRV-CAU
	*  @param value
	**/
   public void setD51uCausDrvCau(char[] value) {
      d51uCausDrvCau = checkD51uCausDrvCauConstraints(value);
      serializeD51uCausDrvCau(d51uCausDrvCau);
   } 

     /**
	 * 	Update D51uCausDrvCau 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uCausDrvCau(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uCausDrvCau,d51uCausDrvCau.length);
   	
   }
   
   public void setD51uCausDrvCau(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uCausDrvCau,d51uCausDrvCau.length);
   	
   }
   
     /**
	 * 	Update D51uCausDrvCau 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uCausDrvCau(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uCausDrvCau+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uCausDrvCau with another Field
	 *	@param value
	 */
   public void setD51uCausDrvCau(Field source) {
       replace(source,0,source.length(),beginD51uCausDrvCau,D_51U_CAUS_DRV_CAU_LEN);
   	
   }  
   
     /**
	 * 	Update D51uCausDrvCau 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uCausDrvCau(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uCausDrvCau,D_51U_CAUS_DRV_CAU_LEN);
   	
   }
   
     /**
	 * 	Update D51uCausDrvCau 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uCausDrvCau(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uCausDrvCau+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uCausClmCauseCd1
	 *	@return d51uCausClmCauseCd1
	 */
   public char[] getD51uCausClmCauseCd1() throws CFException{
     if (isD51uCausClmCauseCd1Modified()) { 
        d51uCausClmCauseCd1 = refreshD51uCausClmCauseCd1();
     }
   		return d51uCausClmCauseCd1;
   }

  
	/**
	*  set variable d51uCausClmCauseCd1
	*  Corresponding COBOL Variable is D51U-CAUS-CLM-CAUSE-CD-1
	*  @param value
	**/
   public void setD51uCausClmCauseCd1(char[] value) {
      d51uCausClmCauseCd1 = checkD51uCausClmCauseCd1Constraints(value);
      serializeD51uCausClmCauseCd1(d51uCausClmCauseCd1);
   } 

     /**
	 * 	Update D51uCausClmCauseCd1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uCausClmCauseCd1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uCausClmCauseCd1,d51uCausClmCauseCd1.length);
   	
   }
   
   public void setD51uCausClmCauseCd1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uCausClmCauseCd1,d51uCausClmCauseCd1.length);
   	
   }
   
     /**
	 * 	Update D51uCausClmCauseCd1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uCausClmCauseCd1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uCausClmCauseCd1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uCausClmCauseCd1 with another Field
	 *	@param value
	 */
   public void setD51uCausClmCauseCd1(Field source) {
       replace(source,0,source.length(),beginD51uCausClmCauseCd1,D_51U_CAUS_CLM_CAUSE_CD_1_LEN);
   	
   }  
   
     /**
	 * 	Update D51uCausClmCauseCd1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uCausClmCauseCd1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uCausClmCauseCd1,D_51U_CAUS_CLM_CAUSE_CD_1_LEN);
   	
   }
   
     /**
	 * 	Update D51uCausClmCauseCd1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uCausClmCauseCd1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uCausClmCauseCd1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uCausClmCauseCd2
	 *	@return d51uCausClmCauseCd2
	 */
   public char[] getD51uCausClmCauseCd2() throws CFException{
     if (isD51uCausClmCauseCd2Modified()) { 
        d51uCausClmCauseCd2 = refreshD51uCausClmCauseCd2();
     }
   		return d51uCausClmCauseCd2;
   }

  
	/**
	*  set variable d51uCausClmCauseCd2
	*  Corresponding COBOL Variable is D51U-CAUS-CLM-CAUSE-CD-2
	*  @param value
	**/
   public void setD51uCausClmCauseCd2(char[] value) {
      d51uCausClmCauseCd2 = checkD51uCausClmCauseCd2Constraints(value);
      serializeD51uCausClmCauseCd2(d51uCausClmCauseCd2);
   } 

     /**
	 * 	Update D51uCausClmCauseCd2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uCausClmCauseCd2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uCausClmCauseCd2,d51uCausClmCauseCd2.length);
   	
   }
   
   public void setD51uCausClmCauseCd2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uCausClmCauseCd2,d51uCausClmCauseCd2.length);
   	
   }
   
     /**
	 * 	Update D51uCausClmCauseCd2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uCausClmCauseCd2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uCausClmCauseCd2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uCausClmCauseCd2 with another Field
	 *	@param value
	 */
   public void setD51uCausClmCauseCd2(Field source) {
       replace(source,0,source.length(),beginD51uCausClmCauseCd2,D_51U_CAUS_CLM_CAUSE_CD_2_LEN);
   	
   }  
   
     /**
	 * 	Update D51uCausClmCauseCd2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uCausClmCauseCd2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uCausClmCauseCd2,D_51U_CAUS_CLM_CAUSE_CD_2_LEN);
   	
   }
   
     /**
	 * 	Update D51uCausClmCauseCd2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uCausClmCauseCd2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uCausClmCauseCd2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uCausClmCauseCd3
	 *	@return d51uCausClmCauseCd3
	 */
   public char[] getD51uCausClmCauseCd3() throws CFException{
     if (isD51uCausClmCauseCd3Modified()) { 
        d51uCausClmCauseCd3 = refreshD51uCausClmCauseCd3();
     }
   		return d51uCausClmCauseCd3;
   }

  
	/**
	*  set variable d51uCausClmCauseCd3
	*  Corresponding COBOL Variable is D51U-CAUS-CLM-CAUSE-CD-3
	*  @param value
	**/
   public void setD51uCausClmCauseCd3(char[] value) {
      d51uCausClmCauseCd3 = checkD51uCausClmCauseCd3Constraints(value);
      serializeD51uCausClmCauseCd3(d51uCausClmCauseCd3);
   } 

     /**
	 * 	Update D51uCausClmCauseCd3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uCausClmCauseCd3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uCausClmCauseCd3,d51uCausClmCauseCd3.length);
   	
   }
   
   public void setD51uCausClmCauseCd3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uCausClmCauseCd3,d51uCausClmCauseCd3.length);
   	
   }
   
     /**
	 * 	Update D51uCausClmCauseCd3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uCausClmCauseCd3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uCausClmCauseCd3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uCausClmCauseCd3 with another Field
	 *	@param value
	 */
   public void setD51uCausClmCauseCd3(Field source) {
       replace(source,0,source.length(),beginD51uCausClmCauseCd3,D_51U_CAUS_CLM_CAUSE_CD_3_LEN);
   	
   }  
   
     /**
	 * 	Update D51uCausClmCauseCd3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uCausClmCauseCd3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uCausClmCauseCd3,D_51U_CAUS_CLM_CAUSE_CD_3_LEN);
   	
   }
   
     /**
	 * 	Update D51uCausClmCauseCd3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uCausClmCauseCd3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uCausClmCauseCd3+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uCausClmCauseCd4
	 *	@return d51uCausClmCauseCd4
	 */
   public char[] getD51uCausClmCauseCd4() throws CFException{
     if (isD51uCausClmCauseCd4Modified()) { 
        d51uCausClmCauseCd4 = refreshD51uCausClmCauseCd4();
     }
   		return d51uCausClmCauseCd4;
   }

  
	/**
	*  set variable d51uCausClmCauseCd4
	*  Corresponding COBOL Variable is D51U-CAUS-CLM-CAUSE-CD-4
	*  @param value
	**/
   public void setD51uCausClmCauseCd4(char[] value) {
      d51uCausClmCauseCd4 = checkD51uCausClmCauseCd4Constraints(value);
      serializeD51uCausClmCauseCd4(d51uCausClmCauseCd4);
   } 

     /**
	 * 	Update D51uCausClmCauseCd4 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uCausClmCauseCd4(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uCausClmCauseCd4,d51uCausClmCauseCd4.length);
   	
   }
   
   public void setD51uCausClmCauseCd4(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uCausClmCauseCd4,d51uCausClmCauseCd4.length);
   	
   }
   
     /**
	 * 	Update D51uCausClmCauseCd4 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uCausClmCauseCd4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uCausClmCauseCd4+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uCausClmCauseCd4 with another Field
	 *	@param value
	 */
   public void setD51uCausClmCauseCd4(Field source) {
       replace(source,0,source.length(),beginD51uCausClmCauseCd4,D_51U_CAUS_CLM_CAUSE_CD_4_LEN);
   	
   }  
   
     /**
	 * 	Update D51uCausClmCauseCd4 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uCausClmCauseCd4(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uCausClmCauseCd4,D_51U_CAUS_CLM_CAUSE_CD_4_LEN);
   	
   }
   
     /**
	 * 	Update D51uCausClmCauseCd4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uCausClmCauseCd4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uCausClmCauseCd4+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uCausClmCauseCd5
	 *	@return d51uCausClmCauseCd5
	 */
   public char[] getD51uCausClmCauseCd5() throws CFException{
     if (isD51uCausClmCauseCd5Modified()) { 
        d51uCausClmCauseCd5 = refreshD51uCausClmCauseCd5();
     }
   		return d51uCausClmCauseCd5;
   }

  
	/**
	*  set variable d51uCausClmCauseCd5
	*  Corresponding COBOL Variable is D51U-CAUS-CLM-CAUSE-CD-5
	*  @param value
	**/
   public void setD51uCausClmCauseCd5(char[] value) {
      d51uCausClmCauseCd5 = checkD51uCausClmCauseCd5Constraints(value);
      serializeD51uCausClmCauseCd5(d51uCausClmCauseCd5);
   } 

     /**
	 * 	Update D51uCausClmCauseCd5 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uCausClmCauseCd5(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uCausClmCauseCd5,d51uCausClmCauseCd5.length);
   	
   }
   
   public void setD51uCausClmCauseCd5(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uCausClmCauseCd5,d51uCausClmCauseCd5.length);
   	
   }
   
     /**
	 * 	Update D51uCausClmCauseCd5 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uCausClmCauseCd5(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uCausClmCauseCd5+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uCausClmCauseCd5 with another Field
	 *	@param value
	 */
   public void setD51uCausClmCauseCd5(Field source) {
       replace(source,0,source.length(),beginD51uCausClmCauseCd5,D_51U_CAUS_CLM_CAUSE_CD_5_LEN);
   	
   }  
   
     /**
	 * 	Update D51uCausClmCauseCd5 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uCausClmCauseCd5(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uCausClmCauseCd5,D_51U_CAUS_CLM_CAUSE_CD_5_LEN);
   	
   }
   
     /**
	 * 	Update D51uCausClmCauseCd5 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uCausClmCauseCd5(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uCausClmCauseCd5+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uCausClmCauseCd6
	 *	@return d51uCausClmCauseCd6
	 */
   public char[] getD51uCausClmCauseCd6() throws CFException{
     if (isD51uCausClmCauseCd6Modified()) { 
        d51uCausClmCauseCd6 = refreshD51uCausClmCauseCd6();
     }
   		return d51uCausClmCauseCd6;
   }

  
	/**
	*  set variable d51uCausClmCauseCd6
	*  Corresponding COBOL Variable is D51U-CAUS-CLM-CAUSE-CD-6
	*  @param value
	**/
   public void setD51uCausClmCauseCd6(char[] value) {
      d51uCausClmCauseCd6 = checkD51uCausClmCauseCd6Constraints(value);
      serializeD51uCausClmCauseCd6(d51uCausClmCauseCd6);
   } 

     /**
	 * 	Update D51uCausClmCauseCd6 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uCausClmCauseCd6(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uCausClmCauseCd6,d51uCausClmCauseCd6.length);
   	
   }
   
   public void setD51uCausClmCauseCd6(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uCausClmCauseCd6,d51uCausClmCauseCd6.length);
   	
   }
   
     /**
	 * 	Update D51uCausClmCauseCd6 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uCausClmCauseCd6(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uCausClmCauseCd6+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uCausClmCauseCd6 with another Field
	 *	@param value
	 */
   public void setD51uCausClmCauseCd6(Field source) {
       replace(source,0,source.length(),beginD51uCausClmCauseCd6,D_51U_CAUS_CLM_CAUSE_CD_6_LEN);
   	
   }  
   
     /**
	 * 	Update D51uCausClmCauseCd6 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uCausClmCauseCd6(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uCausClmCauseCd6,D_51U_CAUS_CLM_CAUSE_CD_6_LEN);
   	
   }
   
     /**
	 * 	Update D51uCausClmCauseCd6 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uCausClmCauseCd6(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uCausClmCauseCd6+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uCausClmCauseCd7
	 *	@return d51uCausClmCauseCd7
	 */
   public char[] getD51uCausClmCauseCd7() throws CFException{
     if (isD51uCausClmCauseCd7Modified()) { 
        d51uCausClmCauseCd7 = refreshD51uCausClmCauseCd7();
     }
   		return d51uCausClmCauseCd7;
   }

  
	/**
	*  set variable d51uCausClmCauseCd7
	*  Corresponding COBOL Variable is D51U-CAUS-CLM-CAUSE-CD-7
	*  @param value
	**/
   public void setD51uCausClmCauseCd7(char[] value) {
      d51uCausClmCauseCd7 = checkD51uCausClmCauseCd7Constraints(value);
      serializeD51uCausClmCauseCd7(d51uCausClmCauseCd7);
   } 

     /**
	 * 	Update D51uCausClmCauseCd7 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uCausClmCauseCd7(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uCausClmCauseCd7,d51uCausClmCauseCd7.length);
   	
   }
   
   public void setD51uCausClmCauseCd7(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uCausClmCauseCd7,d51uCausClmCauseCd7.length);
   	
   }
   
     /**
	 * 	Update D51uCausClmCauseCd7 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uCausClmCauseCd7(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uCausClmCauseCd7+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uCausClmCauseCd7 with another Field
	 *	@param value
	 */
   public void setD51uCausClmCauseCd7(Field source) {
       replace(source,0,source.length(),beginD51uCausClmCauseCd7,D_51U_CAUS_CLM_CAUSE_CD_7_LEN);
   	
   }  
   
     /**
	 * 	Update D51uCausClmCauseCd7 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uCausClmCauseCd7(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uCausClmCauseCd7,D_51U_CAUS_CLM_CAUSE_CD_7_LEN);
   	
   }
   
     /**
	 * 	Update D51uCausClmCauseCd7 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uCausClmCauseCd7(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uCausClmCauseCd7+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uCausClmCauseCd8
	 *	@return d51uCausClmCauseCd8
	 */
   public char[] getD51uCausClmCauseCd8() throws CFException{
     if (isD51uCausClmCauseCd8Modified()) { 
        d51uCausClmCauseCd8 = refreshD51uCausClmCauseCd8();
     }
   		return d51uCausClmCauseCd8;
   }

  
	/**
	*  set variable d51uCausClmCauseCd8
	*  Corresponding COBOL Variable is D51U-CAUS-CLM-CAUSE-CD-8
	*  @param value
	**/
   public void setD51uCausClmCauseCd8(char[] value) {
      d51uCausClmCauseCd8 = checkD51uCausClmCauseCd8Constraints(value);
      serializeD51uCausClmCauseCd8(d51uCausClmCauseCd8);
   } 

     /**
	 * 	Update D51uCausClmCauseCd8 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uCausClmCauseCd8(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uCausClmCauseCd8,d51uCausClmCauseCd8.length);
   	
   }
   
   public void setD51uCausClmCauseCd8(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uCausClmCauseCd8,d51uCausClmCauseCd8.length);
   	
   }
   
     /**
	 * 	Update D51uCausClmCauseCd8 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uCausClmCauseCd8(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uCausClmCauseCd8+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uCausClmCauseCd8 with another Field
	 *	@param value
	 */
   public void setD51uCausClmCauseCd8(Field source) {
       replace(source,0,source.length(),beginD51uCausClmCauseCd8,D_51U_CAUS_CLM_CAUSE_CD_8_LEN);
   	
   }  
   
     /**
	 * 	Update D51uCausClmCauseCd8 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uCausClmCauseCd8(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uCausClmCauseCd8,D_51U_CAUS_CLM_CAUSE_CD_8_LEN);
   	
   }
   
     /**
	 * 	Update D51uCausClmCauseCd8 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uCausClmCauseCd8(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uCausClmCauseCd8+targetIndex,targetLen);
    
   }

	
	
	

		public static int getD51uRetRulCauseFieldLength() {
			return D_51U_RET_RUL_CAUSE_LENGTH;
		}

}
  
