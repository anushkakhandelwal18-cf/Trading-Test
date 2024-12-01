package com.cloudframe.app.dto.d529351u;

/**
*  The class TestVariables is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:50. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class TestVariables extends TestVariablesSerialized { 
   

						private char[] testCaus = Field.fillLowValue(1);

						private char[] testProvTyp = Field.fillLowValue(2);

						private char[] testPos = Field.fillLowValue(2);

						private char[] testSvcCd = Field.fillLowValue(6);
				private TestDiagArea testDiagArea = new TestDiagArea();

						private char[] testCpeDescCd = Field.fillLowValue(6);
	
	/**
	* Constructor for TestVariables
	**/
    public TestVariables() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			testDiagArea.setParent(this,getStartOffset() + 11);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of testCaus
	 *	@return testCaus
	 */
   public char[] getTestCaus() throws CFException{
     if (isTestCausModified()) { 
        testCaus = refreshTestCaus();
     }
   		return testCaus;
   }

  
	/**
	*  set variable testCaus
	*  Corresponding COBOL Variable is TEST-CAUS
	*  @param value
	**/
   public void setTestCaus(char[] value) {
      testCaus = checkTestCausConstraints(value);
      serializeTestCaus(testCaus);
   } 

     /**
	 * 	Update TestCaus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTestCaus(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTestCaus,testCaus.length);
   	
   }
   
   public void setTestCaus(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTestCaus,testCaus.length);
   	
   }
   
     /**
	 * 	Update TestCaus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTestCaus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestCaus+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TestCaus with another Field
	 *	@param value
	 */
   public void setTestCaus(Field source) {
       replace(source,0,source.length(),beginTestCaus,TEST_CAUS_LEN);
   	
   }  
   
     /**
	 * 	Update TestCaus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTestCaus(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTestCaus,TEST_CAUS_LEN);
   	
   }
   
     /**
	 * 	Update TestCaus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTestCaus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestCaus+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of testProvTyp
	 *	@return testProvTyp
	 */
   public char[] getTestProvTyp() throws CFException{
     if (isTestProvTypModified()) { 
        testProvTyp = refreshTestProvTyp();
     }
   		return testProvTyp;
   }

  
	/**
	*  set variable testProvTyp
	*  Corresponding COBOL Variable is TEST-PROV-TYP
	*  @param value
	**/
   public void setTestProvTyp(char[] value) {
      testProvTyp = checkTestProvTypConstraints(value);
      serializeTestProvTyp(testProvTyp);
   } 

     /**
	 * 	Update TestProvTyp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTestProvTyp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTestProvTyp,testProvTyp.length);
   	
   }
   
   public void setTestProvTyp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTestProvTyp,testProvTyp.length);
   	
   }
   
     /**
	 * 	Update TestProvTyp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTestProvTyp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestProvTyp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TestProvTyp with another Field
	 *	@param value
	 */
   public void setTestProvTyp(Field source) {
       replace(source,0,source.length(),beginTestProvTyp,TEST_PROV_TYP_LEN);
   	
   }  
   
     /**
	 * 	Update TestProvTyp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTestProvTyp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTestProvTyp,TEST_PROV_TYP_LEN);
   	
   }
   
     /**
	 * 	Update TestProvTyp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTestProvTyp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestProvTyp+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of testPos
	 *	@return testPos
	 */
   public char[] getTestPos() throws CFException{
     if (isTestPosModified()) { 
        testPos = refreshTestPos();
     }
   		return testPos;
   }

  
	/**
	*  set variable testPos
	*  Corresponding COBOL Variable is TEST-POS
	*  @param value
	**/
   public void setTestPos(char[] value) {
      testPos = checkTestPosConstraints(value);
      serializeTestPos(testPos);
   } 

     /**
	 * 	Update TestPos 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTestPos(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTestPos,testPos.length);
   	
   }
   
   public void setTestPos(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTestPos,testPos.length);
   	
   }
   
     /**
	 * 	Update TestPos 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTestPos(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestPos+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TestPos with another Field
	 *	@param value
	 */
   public void setTestPos(Field source) {
       replace(source,0,source.length(),beginTestPos,TEST_POS_LEN);
   	
   }  
   
     /**
	 * 	Update TestPos 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTestPos(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTestPos,TEST_POS_LEN);
   	
   }
   
     /**
	 * 	Update TestPos 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTestPos(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestPos+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of testSvcCd
	 *	@return testSvcCd
	 */
   public char[] getTestSvcCd() throws CFException{
     if (isTestSvcCdModified()) { 
        testSvcCd = refreshTestSvcCd();
     }
   		return testSvcCd;
   }

  
	/**
	*  set variable testSvcCd
	*  Corresponding COBOL Variable is TEST-SVC-CD
	*  @param value
	**/
   public void setTestSvcCd(char[] value) {
      testSvcCd = checkTestSvcCdConstraints(value);
      serializeTestSvcCd(testSvcCd);
   } 

     /**
	 * 	Update TestSvcCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTestSvcCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTestSvcCd,testSvcCd.length);
   	
   }
   
   public void setTestSvcCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTestSvcCd,testSvcCd.length);
   	
   }
   
     /**
	 * 	Update TestSvcCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTestSvcCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestSvcCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TestSvcCd with another Field
	 *	@param value
	 */
   public void setTestSvcCd(Field source) {
       replace(source,0,source.length(),beginTestSvcCd,TEST_SVC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update TestSvcCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTestSvcCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTestSvcCd,TEST_SVC_CD_LEN);
   	
   }
   
     /**
	 * 	Update TestSvcCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTestSvcCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestSvcCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of testDiagArea
	 *	@return testDiagArea
	 */   
	 public TestDiagArea getTestDiagArea() {
   	return testDiagArea;
   }
   /**
	* 	Update TestDiagArea with the passed value
	*   Corresponding COBOL Variable is TEST-DIAG-AREA
	*	@param value
	*/
   public void setTestDiagArea(char[] value) {
      testDiagArea.setString(value); 
   }   
    
     /**
	 * 	Update TestDiagArea 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setTestDiagArea(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,testDiagArea.begin,testDiagArea.length());
   }
   
     /**
	 * 	Update TestDiagArea 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTestDiagArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,testDiagArea.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update TestDiagArea with another Field
	 *	@param value
	 */
   public void setTestDiagArea(Field source) {
   	replace(source,0,source.length(),testDiagArea.begin,testDiagArea.length());
   }  
   
     /**
	 * 	Update TestDiagArea 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setTestDiagArea(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,testDiagArea.begin,testDiagArea.length());
   }
   
     /**
	 * 	Update TestDiagArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTestDiagArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,testDiagArea.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of testCpeDescCd
	 *	@return testCpeDescCd
	 */
   public char[] getTestCpeDescCd() throws CFException{
     if (isTestCpeDescCdModified()) { 
        testCpeDescCd = refreshTestCpeDescCd();
     }
   		return testCpeDescCd;
   }

  
	/**
	*  set variable testCpeDescCd
	*  Corresponding COBOL Variable is TEST-CPE-DESC-CD
	*  @param value
	**/
   public void setTestCpeDescCd(char[] value) {
      testCpeDescCd = checkTestCpeDescCdConstraints(value);
      serializeTestCpeDescCd(testCpeDescCd);
   } 

     /**
	 * 	Update TestCpeDescCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTestCpeDescCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTestCpeDescCd,testCpeDescCd.length);
   	
   }
   
   public void setTestCpeDescCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTestCpeDescCd,testCpeDescCd.length);
   	
   }
   
     /**
	 * 	Update TestCpeDescCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTestCpeDescCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestCpeDescCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TestCpeDescCd with another Field
	 *	@param value
	 */
   public void setTestCpeDescCd(Field source) {
       replace(source,0,source.length(),beginTestCpeDescCd,TEST_CPE_DESC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update TestCpeDescCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTestCpeDescCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTestCpeDescCd,TEST_CPE_DESC_CD_LEN);
   	
   }
   
     /**
	 * 	Update TestCpeDescCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTestCpeDescCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestCpeDescCd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTestVariablesFieldLength() {
			return TEST_VARIABLES_LENGTH;
		}

}
  
