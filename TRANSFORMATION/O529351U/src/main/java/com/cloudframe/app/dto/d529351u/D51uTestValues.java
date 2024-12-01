package com.cloudframe.app.dto.d529351u;

/**
*  The class D51uTestValues is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class D51uTestValues extends D51uTestValuesSerialized { 
   

						private char[] d51uTestCaus = Field.fillLowValue(1);

						private char[] d51uTestProvTyp = Field.fillLowValue(2);

						private char[] d51uTestPos = Field.fillLowValue(2);

						private char[] d51uTestSvcCd = Field.fillLowValue(6);
				private D51uTestDiagArea d51uTestDiagArea = new D51uTestDiagArea();

						private char[] d51uTestCpeDescCd = Field.fillLowValue(4);
	
	/**
	* Constructor for D51uTestValues
	**/
    public D51uTestValues() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for D51uTestValues. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uTestValues(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			d51uTestDiagArea.setParent(this,getStartOffset() + 11);
    } 

	/**
	 *	Returns the value of d51uTestCaus
	 *	@return d51uTestCaus
	 */
   public char[] getD51uTestCaus() throws CFException{
     if (isD51uTestCausModified()) { 
        d51uTestCaus = refreshD51uTestCaus();
     }
   		return d51uTestCaus;
   }

  
	/**
	*  set variable d51uTestCaus
	*  Corresponding COBOL Variable is D51U-TEST-CAUS
	*  @param value
	**/
   public void setD51uTestCaus(char[] value) {
      d51uTestCaus = checkD51uTestCausConstraints(value);
      serializeD51uTestCaus(d51uTestCaus);
   } 

     /**
	 * 	Update D51uTestCaus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uTestCaus(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uTestCaus,d51uTestCaus.length);
   	
   }
   
   public void setD51uTestCaus(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestCaus,d51uTestCaus.length);
   	
   }
   
     /**
	 * 	Update D51uTestCaus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestCaus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestCaus+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uTestCaus with another Field
	 *	@param value
	 */
   public void setD51uTestCaus(Field source) {
       replace(source,0,source.length(),beginD51uTestCaus,D_51U_TEST_CAUS_LEN);
   	
   }  
   
     /**
	 * 	Update D51uTestCaus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uTestCaus(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uTestCaus,D_51U_TEST_CAUS_LEN);
   	
   }
   
     /**
	 * 	Update D51uTestCaus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestCaus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestCaus+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uTestProvTyp
	 *	@return d51uTestProvTyp
	 */
   public char[] getD51uTestProvTyp() throws CFException{
     if (isD51uTestProvTypModified()) { 
        d51uTestProvTyp = refreshD51uTestProvTyp();
     }
   		return d51uTestProvTyp;
   }

  
	/**
	*  set variable d51uTestProvTyp
	*  Corresponding COBOL Variable is D51U-TEST-PROV-TYP
	*  @param value
	**/
   public void setD51uTestProvTyp(char[] value) {
      d51uTestProvTyp = checkD51uTestProvTypConstraints(value);
      serializeD51uTestProvTyp(d51uTestProvTyp);
   } 

     /**
	 * 	Update D51uTestProvTyp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uTestProvTyp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uTestProvTyp,d51uTestProvTyp.length);
   	
   }
   
   public void setD51uTestProvTyp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestProvTyp,d51uTestProvTyp.length);
   	
   }
   
     /**
	 * 	Update D51uTestProvTyp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestProvTyp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestProvTyp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uTestProvTyp with another Field
	 *	@param value
	 */
   public void setD51uTestProvTyp(Field source) {
       replace(source,0,source.length(),beginD51uTestProvTyp,D_51U_TEST_PROV_TYP_LEN);
   	
   }  
   
     /**
	 * 	Update D51uTestProvTyp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uTestProvTyp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uTestProvTyp,D_51U_TEST_PROV_TYP_LEN);
   	
   }
   
     /**
	 * 	Update D51uTestProvTyp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestProvTyp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestProvTyp+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uTestPos
	 *	@return d51uTestPos
	 */
   public char[] getD51uTestPos() throws CFException{
     if (isD51uTestPosModified()) { 
        d51uTestPos = refreshD51uTestPos();
     }
   		return d51uTestPos;
   }

  
	/**
	*  set variable d51uTestPos
	*  Corresponding COBOL Variable is D51U-TEST-POS
	*  @param value
	**/
   public void setD51uTestPos(char[] value) {
      d51uTestPos = checkD51uTestPosConstraints(value);
      serializeD51uTestPos(d51uTestPos);
   } 

     /**
	 * 	Update D51uTestPos 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uTestPos(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uTestPos,d51uTestPos.length);
   	
   }
   
   public void setD51uTestPos(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestPos,d51uTestPos.length);
   	
   }
   
     /**
	 * 	Update D51uTestPos 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestPos(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestPos+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uTestPos with another Field
	 *	@param value
	 */
   public void setD51uTestPos(Field source) {
       replace(source,0,source.length(),beginD51uTestPos,D_51U_TEST_POS_LEN);
   	
   }  
   
     /**
	 * 	Update D51uTestPos 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uTestPos(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uTestPos,D_51U_TEST_POS_LEN);
   	
   }
   
     /**
	 * 	Update D51uTestPos 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestPos(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestPos+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uTestSvcCd
	 *	@return d51uTestSvcCd
	 */
   public char[] getD51uTestSvcCd() throws CFException{
     if (isD51uTestSvcCdModified()) { 
        d51uTestSvcCd = refreshD51uTestSvcCd();
     }
   		return d51uTestSvcCd;
   }

  
	/**
	*  set variable d51uTestSvcCd
	*  Corresponding COBOL Variable is D51U-TEST-SVC-CD
	*  @param value
	**/
   public void setD51uTestSvcCd(char[] value) {
      d51uTestSvcCd = checkD51uTestSvcCdConstraints(value);
      serializeD51uTestSvcCd(d51uTestSvcCd);
   } 

     /**
	 * 	Update D51uTestSvcCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uTestSvcCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uTestSvcCd,d51uTestSvcCd.length);
   	
   }
   
   public void setD51uTestSvcCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestSvcCd,d51uTestSvcCd.length);
   	
   }
   
     /**
	 * 	Update D51uTestSvcCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestSvcCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestSvcCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uTestSvcCd with another Field
	 *	@param value
	 */
   public void setD51uTestSvcCd(Field source) {
       replace(source,0,source.length(),beginD51uTestSvcCd,D_51U_TEST_SVC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update D51uTestSvcCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uTestSvcCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uTestSvcCd,D_51U_TEST_SVC_CD_LEN);
   	
   }
   
     /**
	 * 	Update D51uTestSvcCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestSvcCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestSvcCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uTestDiagArea
	 *	@return d51uTestDiagArea
	 */   
	 public D51uTestDiagArea getD51uTestDiagArea() {
   	return d51uTestDiagArea;
   }
   /**
	* 	Update D51uTestDiagArea with the passed value
	*   Corresponding COBOL Variable is D51U-TEST-DIAG-AREA
	*	@param value
	*/
   public void setD51uTestDiagArea(char[] value) {
      d51uTestDiagArea.setString(value); 
   }   
    
     /**
	 * 	Update D51uTestDiagArea 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setD51uTestDiagArea(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,d51uTestDiagArea.begin,d51uTestDiagArea.length());
   }
   
     /**
	 * 	Update D51uTestDiagArea 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiagArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,d51uTestDiagArea.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update D51uTestDiagArea with another Field
	 *	@param value
	 */
   public void setD51uTestDiagArea(Field source) {
   	replace(source,0,source.length(),d51uTestDiagArea.begin,d51uTestDiagArea.length());
   }  
   
     /**
	 * 	Update D51uTestDiagArea 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setD51uTestDiagArea(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,d51uTestDiagArea.begin,d51uTestDiagArea.length());
   }
   
     /**
	 * 	Update D51uTestDiagArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiagArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,d51uTestDiagArea.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of d51uTestCpeDescCd
	 *	@return d51uTestCpeDescCd
	 */
   public char[] getD51uTestCpeDescCd() throws CFException{
     if (isD51uTestCpeDescCdModified()) { 
        d51uTestCpeDescCd = refreshD51uTestCpeDescCd();
     }
   		return d51uTestCpeDescCd;
   }

  
	/**
	*  set variable d51uTestCpeDescCd
	*  Corresponding COBOL Variable is D51U-TEST-CPE-DESC-CD
	*  @param value
	**/
   public void setD51uTestCpeDescCd(char[] value) {
      d51uTestCpeDescCd = checkD51uTestCpeDescCdConstraints(value);
      serializeD51uTestCpeDescCd(d51uTestCpeDescCd);
   } 

     /**
	 * 	Update D51uTestCpeDescCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uTestCpeDescCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uTestCpeDescCd,d51uTestCpeDescCd.length);
   	
   }
   
   public void setD51uTestCpeDescCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestCpeDescCd,d51uTestCpeDescCd.length);
   	
   }
   
     /**
	 * 	Update D51uTestCpeDescCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestCpeDescCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestCpeDescCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uTestCpeDescCd with another Field
	 *	@param value
	 */
   public void setD51uTestCpeDescCd(Field source) {
       replace(source,0,source.length(),beginD51uTestCpeDescCd,D_51U_TEST_CPE_DESC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update D51uTestCpeDescCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uTestCpeDescCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uTestCpeDescCd,D_51U_TEST_CPE_DESC_CD_LEN);
   	
   }
   
     /**
	 * 	Update D51uTestCpeDescCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestCpeDescCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestCpeDescCd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getD51uTestValuesFieldLength() {
			return D_51U_TEST_VALUES_LENGTH;
		}

}
  
