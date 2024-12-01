package com.cloudframe.app.dto.d529351u;

/**
*  The class TestDiagArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:50. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class TestDiagArea extends TestDiagAreaSerialized { 
   

						private char[] testDiag01 = Field.fillLowValue(7);

						private char[] testDiag02 = Field.fillLowValue(7);

						private char[] testDiag03 = Field.fillLowValue(7);

						private char[] testDiag04 = Field.fillLowValue(7);

						private char[] testDiag05 = Field.fillLowValue(7);

						private char[] testDiag06 = Field.fillLowValue(7);

						private char[] testDiag07 = Field.fillLowValue(7);

						private char[] testDiag08 = Field.fillLowValue(7);

						private char[] testDiag09 = Field.fillLowValue(7);

						private char[] testDiag10 = Field.fillLowValue(7);

						private char[] testDiag11 = Field.fillLowValue(7);

						private char[] testDiag12 = Field.fillLowValue(7);

						private char[] testDiag13 = Field.fillLowValue(7);

						private char[] testDiag14 = Field.fillLowValue(7);

						private char[] testDiag15 = Field.fillLowValue(7);

						private char[] testDiag16 = Field.fillLowValue(7);

						private char[] testDiag17 = Field.fillLowValue(7);

						private char[] testDiag18 = Field.fillLowValue(7);

						private char[] testDiag19 = Field.fillLowValue(7);

						private char[] testDiag20 = Field.fillLowValue(7);

						private char[] testDiag21 = Field.fillLowValue(7);

						private char[] testDiag22 = Field.fillLowValue(7);

						private char[] testDiag23 = Field.fillLowValue(7);

						private char[] testDiag24 = Field.fillLowValue(7);

						private char[] testDiag25 = Field.fillLowValue(7);
	
	/**
	* Constructor for TestDiagArea
	**/
    public TestDiagArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for TestDiagArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TestDiagArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of testDiag01
	 *	@return testDiag01
	 */
   public char[] getTestDiag01() throws CFException{
     if (isTestDiag01Modified()) { 
        testDiag01 = refreshTestDiag01();
     }
   		return testDiag01;
   }

  
	/**
	*  set variable testDiag01
	*  Corresponding COBOL Variable is TEST-DIAG-01
	*  @param value
	**/
   public void setTestDiag01(char[] value) {
      testDiag01 = checkTestDiag01Constraints(value);
      serializeTestDiag01(testDiag01);
   } 

     /**
	 * 	Update TestDiag01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTestDiag01(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTestDiag01,testDiag01.length);
   	
   }
   
   public void setTestDiag01(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag01,testDiag01.length);
   	
   }
   
     /**
	 * 	Update TestDiag01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag01+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TestDiag01 with another Field
	 *	@param value
	 */
   public void setTestDiag01(Field source) {
       replace(source,0,source.length(),beginTestDiag01,TEST_DIAG_01_LEN);
   	
   }  
   
     /**
	 * 	Update TestDiag01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTestDiag01(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTestDiag01,TEST_DIAG_01_LEN);
   	
   }
   
     /**
	 * 	Update TestDiag01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag01+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of testDiag02
	 *	@return testDiag02
	 */
   public char[] getTestDiag02() throws CFException{
     if (isTestDiag02Modified()) { 
        testDiag02 = refreshTestDiag02();
     }
   		return testDiag02;
   }

  
	/**
	*  set variable testDiag02
	*  Corresponding COBOL Variable is TEST-DIAG-02
	*  @param value
	**/
   public void setTestDiag02(char[] value) {
      testDiag02 = checkTestDiag02Constraints(value);
      serializeTestDiag02(testDiag02);
   } 

     /**
	 * 	Update TestDiag02 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTestDiag02(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTestDiag02,testDiag02.length);
   	
   }
   
   public void setTestDiag02(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag02,testDiag02.length);
   	
   }
   
     /**
	 * 	Update TestDiag02 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag02(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag02+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TestDiag02 with another Field
	 *	@param value
	 */
   public void setTestDiag02(Field source) {
       replace(source,0,source.length(),beginTestDiag02,TEST_DIAG_02_LEN);
   	
   }  
   
     /**
	 * 	Update TestDiag02 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTestDiag02(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTestDiag02,TEST_DIAG_02_LEN);
   	
   }
   
     /**
	 * 	Update TestDiag02 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag02(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag02+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of testDiag03
	 *	@return testDiag03
	 */
   public char[] getTestDiag03() throws CFException{
     if (isTestDiag03Modified()) { 
        testDiag03 = refreshTestDiag03();
     }
   		return testDiag03;
   }

  
	/**
	*  set variable testDiag03
	*  Corresponding COBOL Variable is TEST-DIAG-03
	*  @param value
	**/
   public void setTestDiag03(char[] value) {
      testDiag03 = checkTestDiag03Constraints(value);
      serializeTestDiag03(testDiag03);
   } 

     /**
	 * 	Update TestDiag03 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTestDiag03(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTestDiag03,testDiag03.length);
   	
   }
   
   public void setTestDiag03(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag03,testDiag03.length);
   	
   }
   
     /**
	 * 	Update TestDiag03 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag03(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag03+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TestDiag03 with another Field
	 *	@param value
	 */
   public void setTestDiag03(Field source) {
       replace(source,0,source.length(),beginTestDiag03,TEST_DIAG_03_LEN);
   	
   }  
   
     /**
	 * 	Update TestDiag03 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTestDiag03(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTestDiag03,TEST_DIAG_03_LEN);
   	
   }
   
     /**
	 * 	Update TestDiag03 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag03(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag03+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of testDiag04
	 *	@return testDiag04
	 */
   public char[] getTestDiag04() throws CFException{
     if (isTestDiag04Modified()) { 
        testDiag04 = refreshTestDiag04();
     }
   		return testDiag04;
   }

  
	/**
	*  set variable testDiag04
	*  Corresponding COBOL Variable is TEST-DIAG-04
	*  @param value
	**/
   public void setTestDiag04(char[] value) {
      testDiag04 = checkTestDiag04Constraints(value);
      serializeTestDiag04(testDiag04);
   } 

     /**
	 * 	Update TestDiag04 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTestDiag04(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTestDiag04,testDiag04.length);
   	
   }
   
   public void setTestDiag04(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag04,testDiag04.length);
   	
   }
   
     /**
	 * 	Update TestDiag04 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag04(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag04+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TestDiag04 with another Field
	 *	@param value
	 */
   public void setTestDiag04(Field source) {
       replace(source,0,source.length(),beginTestDiag04,TEST_DIAG_04_LEN);
   	
   }  
   
     /**
	 * 	Update TestDiag04 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTestDiag04(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTestDiag04,TEST_DIAG_04_LEN);
   	
   }
   
     /**
	 * 	Update TestDiag04 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag04(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag04+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of testDiag05
	 *	@return testDiag05
	 */
   public char[] getTestDiag05() throws CFException{
     if (isTestDiag05Modified()) { 
        testDiag05 = refreshTestDiag05();
     }
   		return testDiag05;
   }

  
	/**
	*  set variable testDiag05
	*  Corresponding COBOL Variable is TEST-DIAG-05
	*  @param value
	**/
   public void setTestDiag05(char[] value) {
      testDiag05 = checkTestDiag05Constraints(value);
      serializeTestDiag05(testDiag05);
   } 

     /**
	 * 	Update TestDiag05 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTestDiag05(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTestDiag05,testDiag05.length);
   	
   }
   
   public void setTestDiag05(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag05,testDiag05.length);
   	
   }
   
     /**
	 * 	Update TestDiag05 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag05(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag05+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TestDiag05 with another Field
	 *	@param value
	 */
   public void setTestDiag05(Field source) {
       replace(source,0,source.length(),beginTestDiag05,TEST_DIAG_05_LEN);
   	
   }  
   
     /**
	 * 	Update TestDiag05 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTestDiag05(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTestDiag05,TEST_DIAG_05_LEN);
   	
   }
   
     /**
	 * 	Update TestDiag05 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag05(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag05+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of testDiag06
	 *	@return testDiag06
	 */
   public char[] getTestDiag06() throws CFException{
     if (isTestDiag06Modified()) { 
        testDiag06 = refreshTestDiag06();
     }
   		return testDiag06;
   }

  
	/**
	*  set variable testDiag06
	*  Corresponding COBOL Variable is TEST-DIAG-06
	*  @param value
	**/
   public void setTestDiag06(char[] value) {
      testDiag06 = checkTestDiag06Constraints(value);
      serializeTestDiag06(testDiag06);
   } 

     /**
	 * 	Update TestDiag06 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTestDiag06(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTestDiag06,testDiag06.length);
   	
   }
   
   public void setTestDiag06(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag06,testDiag06.length);
   	
   }
   
     /**
	 * 	Update TestDiag06 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag06(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag06+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TestDiag06 with another Field
	 *	@param value
	 */
   public void setTestDiag06(Field source) {
       replace(source,0,source.length(),beginTestDiag06,TEST_DIAG_06_LEN);
   	
   }  
   
     /**
	 * 	Update TestDiag06 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTestDiag06(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTestDiag06,TEST_DIAG_06_LEN);
   	
   }
   
     /**
	 * 	Update TestDiag06 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag06(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag06+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of testDiag07
	 *	@return testDiag07
	 */
   public char[] getTestDiag07() throws CFException{
     if (isTestDiag07Modified()) { 
        testDiag07 = refreshTestDiag07();
     }
   		return testDiag07;
   }

  
	/**
	*  set variable testDiag07
	*  Corresponding COBOL Variable is TEST-DIAG-07
	*  @param value
	**/
   public void setTestDiag07(char[] value) {
      testDiag07 = checkTestDiag07Constraints(value);
      serializeTestDiag07(testDiag07);
   } 

     /**
	 * 	Update TestDiag07 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTestDiag07(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTestDiag07,testDiag07.length);
   	
   }
   
   public void setTestDiag07(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag07,testDiag07.length);
   	
   }
   
     /**
	 * 	Update TestDiag07 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag07(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag07+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TestDiag07 with another Field
	 *	@param value
	 */
   public void setTestDiag07(Field source) {
       replace(source,0,source.length(),beginTestDiag07,TEST_DIAG_07_LEN);
   	
   }  
   
     /**
	 * 	Update TestDiag07 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTestDiag07(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTestDiag07,TEST_DIAG_07_LEN);
   	
   }
   
     /**
	 * 	Update TestDiag07 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag07(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag07+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of testDiag08
	 *	@return testDiag08
	 */
   public char[] getTestDiag08() throws CFException{
     if (isTestDiag08Modified()) { 
        testDiag08 = refreshTestDiag08();
     }
   		return testDiag08;
   }

  
	/**
	*  set variable testDiag08
	*  Corresponding COBOL Variable is TEST-DIAG-08
	*  @param value
	**/
   public void setTestDiag08(char[] value) {
      testDiag08 = checkTestDiag08Constraints(value);
      serializeTestDiag08(testDiag08);
   } 

     /**
	 * 	Update TestDiag08 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTestDiag08(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTestDiag08,testDiag08.length);
   	
   }
   
   public void setTestDiag08(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag08,testDiag08.length);
   	
   }
   
     /**
	 * 	Update TestDiag08 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag08(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag08+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TestDiag08 with another Field
	 *	@param value
	 */
   public void setTestDiag08(Field source) {
       replace(source,0,source.length(),beginTestDiag08,TEST_DIAG_08_LEN);
   	
   }  
   
     /**
	 * 	Update TestDiag08 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTestDiag08(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTestDiag08,TEST_DIAG_08_LEN);
   	
   }
   
     /**
	 * 	Update TestDiag08 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag08(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag08+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of testDiag09
	 *	@return testDiag09
	 */
   public char[] getTestDiag09() throws CFException{
     if (isTestDiag09Modified()) { 
        testDiag09 = refreshTestDiag09();
     }
   		return testDiag09;
   }

  
	/**
	*  set variable testDiag09
	*  Corresponding COBOL Variable is TEST-DIAG-09
	*  @param value
	**/
   public void setTestDiag09(char[] value) {
      testDiag09 = checkTestDiag09Constraints(value);
      serializeTestDiag09(testDiag09);
   } 

     /**
	 * 	Update TestDiag09 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTestDiag09(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTestDiag09,testDiag09.length);
   	
   }
   
   public void setTestDiag09(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag09,testDiag09.length);
   	
   }
   
     /**
	 * 	Update TestDiag09 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag09(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag09+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TestDiag09 with another Field
	 *	@param value
	 */
   public void setTestDiag09(Field source) {
       replace(source,0,source.length(),beginTestDiag09,TEST_DIAG_09_LEN);
   	
   }  
   
     /**
	 * 	Update TestDiag09 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTestDiag09(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTestDiag09,TEST_DIAG_09_LEN);
   	
   }
   
     /**
	 * 	Update TestDiag09 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag09(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag09+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of testDiag10
	 *	@return testDiag10
	 */
   public char[] getTestDiag10() throws CFException{
     if (isTestDiag10Modified()) { 
        testDiag10 = refreshTestDiag10();
     }
   		return testDiag10;
   }

  
	/**
	*  set variable testDiag10
	*  Corresponding COBOL Variable is TEST-DIAG-10
	*  @param value
	**/
   public void setTestDiag10(char[] value) {
      testDiag10 = checkTestDiag10Constraints(value);
      serializeTestDiag10(testDiag10);
   } 

     /**
	 * 	Update TestDiag10 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTestDiag10(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTestDiag10,testDiag10.length);
   	
   }
   
   public void setTestDiag10(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag10,testDiag10.length);
   	
   }
   
     /**
	 * 	Update TestDiag10 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag10(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag10+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TestDiag10 with another Field
	 *	@param value
	 */
   public void setTestDiag10(Field source) {
       replace(source,0,source.length(),beginTestDiag10,TEST_DIAG_10_LEN);
   	
   }  
   
     /**
	 * 	Update TestDiag10 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTestDiag10(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTestDiag10,TEST_DIAG_10_LEN);
   	
   }
   
     /**
	 * 	Update TestDiag10 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag10(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag10+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of testDiag11
	 *	@return testDiag11
	 */
   public char[] getTestDiag11() throws CFException{
     if (isTestDiag11Modified()) { 
        testDiag11 = refreshTestDiag11();
     }
   		return testDiag11;
   }

  
	/**
	*  set variable testDiag11
	*  Corresponding COBOL Variable is TEST-DIAG-11
	*  @param value
	**/
   public void setTestDiag11(char[] value) {
      testDiag11 = checkTestDiag11Constraints(value);
      serializeTestDiag11(testDiag11);
   } 

     /**
	 * 	Update TestDiag11 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTestDiag11(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTestDiag11,testDiag11.length);
   	
   }
   
   public void setTestDiag11(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag11,testDiag11.length);
   	
   }
   
     /**
	 * 	Update TestDiag11 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag11(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag11+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TestDiag11 with another Field
	 *	@param value
	 */
   public void setTestDiag11(Field source) {
       replace(source,0,source.length(),beginTestDiag11,TEST_DIAG_11_LEN);
   	
   }  
   
     /**
	 * 	Update TestDiag11 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTestDiag11(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTestDiag11,TEST_DIAG_11_LEN);
   	
   }
   
     /**
	 * 	Update TestDiag11 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag11(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag11+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of testDiag12
	 *	@return testDiag12
	 */
   public char[] getTestDiag12() throws CFException{
     if (isTestDiag12Modified()) { 
        testDiag12 = refreshTestDiag12();
     }
   		return testDiag12;
   }

  
	/**
	*  set variable testDiag12
	*  Corresponding COBOL Variable is TEST-DIAG-12
	*  @param value
	**/
   public void setTestDiag12(char[] value) {
      testDiag12 = checkTestDiag12Constraints(value);
      serializeTestDiag12(testDiag12);
   } 

     /**
	 * 	Update TestDiag12 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTestDiag12(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTestDiag12,testDiag12.length);
   	
   }
   
   public void setTestDiag12(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag12,testDiag12.length);
   	
   }
   
     /**
	 * 	Update TestDiag12 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag12(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag12+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TestDiag12 with another Field
	 *	@param value
	 */
   public void setTestDiag12(Field source) {
       replace(source,0,source.length(),beginTestDiag12,TEST_DIAG_12_LEN);
   	
   }  
   
     /**
	 * 	Update TestDiag12 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTestDiag12(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTestDiag12,TEST_DIAG_12_LEN);
   	
   }
   
     /**
	 * 	Update TestDiag12 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag12(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag12+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of testDiag13
	 *	@return testDiag13
	 */
   public char[] getTestDiag13() throws CFException{
     if (isTestDiag13Modified()) { 
        testDiag13 = refreshTestDiag13();
     }
   		return testDiag13;
   }

  
	/**
	*  set variable testDiag13
	*  Corresponding COBOL Variable is TEST-DIAG-13
	*  @param value
	**/
   public void setTestDiag13(char[] value) {
      testDiag13 = checkTestDiag13Constraints(value);
      serializeTestDiag13(testDiag13);
   } 

     /**
	 * 	Update TestDiag13 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTestDiag13(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTestDiag13,testDiag13.length);
   	
   }
   
   public void setTestDiag13(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag13,testDiag13.length);
   	
   }
   
     /**
	 * 	Update TestDiag13 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag13(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag13+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TestDiag13 with another Field
	 *	@param value
	 */
   public void setTestDiag13(Field source) {
       replace(source,0,source.length(),beginTestDiag13,TEST_DIAG_13_LEN);
   	
   }  
   
     /**
	 * 	Update TestDiag13 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTestDiag13(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTestDiag13,TEST_DIAG_13_LEN);
   	
   }
   
     /**
	 * 	Update TestDiag13 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag13(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag13+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of testDiag14
	 *	@return testDiag14
	 */
   public char[] getTestDiag14() throws CFException{
     if (isTestDiag14Modified()) { 
        testDiag14 = refreshTestDiag14();
     }
   		return testDiag14;
   }

  
	/**
	*  set variable testDiag14
	*  Corresponding COBOL Variable is TEST-DIAG-14
	*  @param value
	**/
   public void setTestDiag14(char[] value) {
      testDiag14 = checkTestDiag14Constraints(value);
      serializeTestDiag14(testDiag14);
   } 

     /**
	 * 	Update TestDiag14 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTestDiag14(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTestDiag14,testDiag14.length);
   	
   }
   
   public void setTestDiag14(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag14,testDiag14.length);
   	
   }
   
     /**
	 * 	Update TestDiag14 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag14(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag14+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TestDiag14 with another Field
	 *	@param value
	 */
   public void setTestDiag14(Field source) {
       replace(source,0,source.length(),beginTestDiag14,TEST_DIAG_14_LEN);
   	
   }  
   
     /**
	 * 	Update TestDiag14 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTestDiag14(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTestDiag14,TEST_DIAG_14_LEN);
   	
   }
   
     /**
	 * 	Update TestDiag14 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag14(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag14+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of testDiag15
	 *	@return testDiag15
	 */
   public char[] getTestDiag15() throws CFException{
     if (isTestDiag15Modified()) { 
        testDiag15 = refreshTestDiag15();
     }
   		return testDiag15;
   }

  
	/**
	*  set variable testDiag15
	*  Corresponding COBOL Variable is TEST-DIAG-15
	*  @param value
	**/
   public void setTestDiag15(char[] value) {
      testDiag15 = checkTestDiag15Constraints(value);
      serializeTestDiag15(testDiag15);
   } 

     /**
	 * 	Update TestDiag15 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTestDiag15(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTestDiag15,testDiag15.length);
   	
   }
   
   public void setTestDiag15(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag15,testDiag15.length);
   	
   }
   
     /**
	 * 	Update TestDiag15 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag15(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag15+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TestDiag15 with another Field
	 *	@param value
	 */
   public void setTestDiag15(Field source) {
       replace(source,0,source.length(),beginTestDiag15,TEST_DIAG_15_LEN);
   	
   }  
   
     /**
	 * 	Update TestDiag15 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTestDiag15(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTestDiag15,TEST_DIAG_15_LEN);
   	
   }
   
     /**
	 * 	Update TestDiag15 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag15(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag15+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of testDiag16
	 *	@return testDiag16
	 */
   public char[] getTestDiag16() throws CFException{
     if (isTestDiag16Modified()) { 
        testDiag16 = refreshTestDiag16();
     }
   		return testDiag16;
   }

  
	/**
	*  set variable testDiag16
	*  Corresponding COBOL Variable is TEST-DIAG-16
	*  @param value
	**/
   public void setTestDiag16(char[] value) {
      testDiag16 = checkTestDiag16Constraints(value);
      serializeTestDiag16(testDiag16);
   } 

     /**
	 * 	Update TestDiag16 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTestDiag16(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTestDiag16,testDiag16.length);
   	
   }
   
   public void setTestDiag16(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag16,testDiag16.length);
   	
   }
   
     /**
	 * 	Update TestDiag16 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag16(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag16+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TestDiag16 with another Field
	 *	@param value
	 */
   public void setTestDiag16(Field source) {
       replace(source,0,source.length(),beginTestDiag16,TEST_DIAG_16_LEN);
   	
   }  
   
     /**
	 * 	Update TestDiag16 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTestDiag16(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTestDiag16,TEST_DIAG_16_LEN);
   	
   }
   
     /**
	 * 	Update TestDiag16 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag16(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag16+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of testDiag17
	 *	@return testDiag17
	 */
   public char[] getTestDiag17() throws CFException{
     if (isTestDiag17Modified()) { 
        testDiag17 = refreshTestDiag17();
     }
   		return testDiag17;
   }

  
	/**
	*  set variable testDiag17
	*  Corresponding COBOL Variable is TEST-DIAG-17
	*  @param value
	**/
   public void setTestDiag17(char[] value) {
      testDiag17 = checkTestDiag17Constraints(value);
      serializeTestDiag17(testDiag17);
   } 

     /**
	 * 	Update TestDiag17 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTestDiag17(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTestDiag17,testDiag17.length);
   	
   }
   
   public void setTestDiag17(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag17,testDiag17.length);
   	
   }
   
     /**
	 * 	Update TestDiag17 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag17(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag17+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TestDiag17 with another Field
	 *	@param value
	 */
   public void setTestDiag17(Field source) {
       replace(source,0,source.length(),beginTestDiag17,TEST_DIAG_17_LEN);
   	
   }  
   
     /**
	 * 	Update TestDiag17 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTestDiag17(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTestDiag17,TEST_DIAG_17_LEN);
   	
   }
   
     /**
	 * 	Update TestDiag17 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag17(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag17+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of testDiag18
	 *	@return testDiag18
	 */
   public char[] getTestDiag18() throws CFException{
     if (isTestDiag18Modified()) { 
        testDiag18 = refreshTestDiag18();
     }
   		return testDiag18;
   }

  
	/**
	*  set variable testDiag18
	*  Corresponding COBOL Variable is TEST-DIAG-18
	*  @param value
	**/
   public void setTestDiag18(char[] value) {
      testDiag18 = checkTestDiag18Constraints(value);
      serializeTestDiag18(testDiag18);
   } 

     /**
	 * 	Update TestDiag18 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTestDiag18(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTestDiag18,testDiag18.length);
   	
   }
   
   public void setTestDiag18(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag18,testDiag18.length);
   	
   }
   
     /**
	 * 	Update TestDiag18 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag18(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag18+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TestDiag18 with another Field
	 *	@param value
	 */
   public void setTestDiag18(Field source) {
       replace(source,0,source.length(),beginTestDiag18,TEST_DIAG_18_LEN);
   	
   }  
   
     /**
	 * 	Update TestDiag18 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTestDiag18(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTestDiag18,TEST_DIAG_18_LEN);
   	
   }
   
     /**
	 * 	Update TestDiag18 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag18(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag18+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of testDiag19
	 *	@return testDiag19
	 */
   public char[] getTestDiag19() throws CFException{
     if (isTestDiag19Modified()) { 
        testDiag19 = refreshTestDiag19();
     }
   		return testDiag19;
   }

  
	/**
	*  set variable testDiag19
	*  Corresponding COBOL Variable is TEST-DIAG-19
	*  @param value
	**/
   public void setTestDiag19(char[] value) {
      testDiag19 = checkTestDiag19Constraints(value);
      serializeTestDiag19(testDiag19);
   } 

     /**
	 * 	Update TestDiag19 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTestDiag19(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTestDiag19,testDiag19.length);
   	
   }
   
   public void setTestDiag19(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag19,testDiag19.length);
   	
   }
   
     /**
	 * 	Update TestDiag19 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag19(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag19+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TestDiag19 with another Field
	 *	@param value
	 */
   public void setTestDiag19(Field source) {
       replace(source,0,source.length(),beginTestDiag19,TEST_DIAG_19_LEN);
   	
   }  
   
     /**
	 * 	Update TestDiag19 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTestDiag19(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTestDiag19,TEST_DIAG_19_LEN);
   	
   }
   
     /**
	 * 	Update TestDiag19 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag19(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag19+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of testDiag20
	 *	@return testDiag20
	 */
   public char[] getTestDiag20() throws CFException{
     if (isTestDiag20Modified()) { 
        testDiag20 = refreshTestDiag20();
     }
   		return testDiag20;
   }

  
	/**
	*  set variable testDiag20
	*  Corresponding COBOL Variable is TEST-DIAG-20
	*  @param value
	**/
   public void setTestDiag20(char[] value) {
      testDiag20 = checkTestDiag20Constraints(value);
      serializeTestDiag20(testDiag20);
   } 

     /**
	 * 	Update TestDiag20 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTestDiag20(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTestDiag20,testDiag20.length);
   	
   }
   
   public void setTestDiag20(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag20,testDiag20.length);
   	
   }
   
     /**
	 * 	Update TestDiag20 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag20(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag20+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TestDiag20 with another Field
	 *	@param value
	 */
   public void setTestDiag20(Field source) {
       replace(source,0,source.length(),beginTestDiag20,TEST_DIAG_20_LEN);
   	
   }  
   
     /**
	 * 	Update TestDiag20 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTestDiag20(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTestDiag20,TEST_DIAG_20_LEN);
   	
   }
   
     /**
	 * 	Update TestDiag20 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag20(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag20+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of testDiag21
	 *	@return testDiag21
	 */
   public char[] getTestDiag21() throws CFException{
     if (isTestDiag21Modified()) { 
        testDiag21 = refreshTestDiag21();
     }
   		return testDiag21;
   }

  
	/**
	*  set variable testDiag21
	*  Corresponding COBOL Variable is TEST-DIAG-21
	*  @param value
	**/
   public void setTestDiag21(char[] value) {
      testDiag21 = checkTestDiag21Constraints(value);
      serializeTestDiag21(testDiag21);
   } 

     /**
	 * 	Update TestDiag21 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTestDiag21(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTestDiag21,testDiag21.length);
   	
   }
   
   public void setTestDiag21(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag21,testDiag21.length);
   	
   }
   
     /**
	 * 	Update TestDiag21 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag21(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag21+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TestDiag21 with another Field
	 *	@param value
	 */
   public void setTestDiag21(Field source) {
       replace(source,0,source.length(),beginTestDiag21,TEST_DIAG_21_LEN);
   	
   }  
   
     /**
	 * 	Update TestDiag21 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTestDiag21(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTestDiag21,TEST_DIAG_21_LEN);
   	
   }
   
     /**
	 * 	Update TestDiag21 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag21(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag21+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of testDiag22
	 *	@return testDiag22
	 */
   public char[] getTestDiag22() throws CFException{
     if (isTestDiag22Modified()) { 
        testDiag22 = refreshTestDiag22();
     }
   		return testDiag22;
   }

  
	/**
	*  set variable testDiag22
	*  Corresponding COBOL Variable is TEST-DIAG-22
	*  @param value
	**/
   public void setTestDiag22(char[] value) {
      testDiag22 = checkTestDiag22Constraints(value);
      serializeTestDiag22(testDiag22);
   } 

     /**
	 * 	Update TestDiag22 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTestDiag22(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTestDiag22,testDiag22.length);
   	
   }
   
   public void setTestDiag22(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag22,testDiag22.length);
   	
   }
   
     /**
	 * 	Update TestDiag22 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag22(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag22+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TestDiag22 with another Field
	 *	@param value
	 */
   public void setTestDiag22(Field source) {
       replace(source,0,source.length(),beginTestDiag22,TEST_DIAG_22_LEN);
   	
   }  
   
     /**
	 * 	Update TestDiag22 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTestDiag22(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTestDiag22,TEST_DIAG_22_LEN);
   	
   }
   
     /**
	 * 	Update TestDiag22 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag22(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag22+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of testDiag23
	 *	@return testDiag23
	 */
   public char[] getTestDiag23() throws CFException{
     if (isTestDiag23Modified()) { 
        testDiag23 = refreshTestDiag23();
     }
   		return testDiag23;
   }

  
	/**
	*  set variable testDiag23
	*  Corresponding COBOL Variable is TEST-DIAG-23
	*  @param value
	**/
   public void setTestDiag23(char[] value) {
      testDiag23 = checkTestDiag23Constraints(value);
      serializeTestDiag23(testDiag23);
   } 

     /**
	 * 	Update TestDiag23 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTestDiag23(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTestDiag23,testDiag23.length);
   	
   }
   
   public void setTestDiag23(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag23,testDiag23.length);
   	
   }
   
     /**
	 * 	Update TestDiag23 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag23(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag23+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TestDiag23 with another Field
	 *	@param value
	 */
   public void setTestDiag23(Field source) {
       replace(source,0,source.length(),beginTestDiag23,TEST_DIAG_23_LEN);
   	
   }  
   
     /**
	 * 	Update TestDiag23 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTestDiag23(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTestDiag23,TEST_DIAG_23_LEN);
   	
   }
   
     /**
	 * 	Update TestDiag23 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag23(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag23+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of testDiag24
	 *	@return testDiag24
	 */
   public char[] getTestDiag24() throws CFException{
     if (isTestDiag24Modified()) { 
        testDiag24 = refreshTestDiag24();
     }
   		return testDiag24;
   }

  
	/**
	*  set variable testDiag24
	*  Corresponding COBOL Variable is TEST-DIAG-24
	*  @param value
	**/
   public void setTestDiag24(char[] value) {
      testDiag24 = checkTestDiag24Constraints(value);
      serializeTestDiag24(testDiag24);
   } 

     /**
	 * 	Update TestDiag24 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTestDiag24(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTestDiag24,testDiag24.length);
   	
   }
   
   public void setTestDiag24(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag24,testDiag24.length);
   	
   }
   
     /**
	 * 	Update TestDiag24 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag24(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag24+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TestDiag24 with another Field
	 *	@param value
	 */
   public void setTestDiag24(Field source) {
       replace(source,0,source.length(),beginTestDiag24,TEST_DIAG_24_LEN);
   	
   }  
   
     /**
	 * 	Update TestDiag24 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTestDiag24(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTestDiag24,TEST_DIAG_24_LEN);
   	
   }
   
     /**
	 * 	Update TestDiag24 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag24(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag24+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of testDiag25
	 *	@return testDiag25
	 */
   public char[] getTestDiag25() throws CFException{
     if (isTestDiag25Modified()) { 
        testDiag25 = refreshTestDiag25();
     }
   		return testDiag25;
   }

  
	/**
	*  set variable testDiag25
	*  Corresponding COBOL Variable is TEST-DIAG-25
	*  @param value
	**/
   public void setTestDiag25(char[] value) {
      testDiag25 = checkTestDiag25Constraints(value);
      serializeTestDiag25(testDiag25);
   } 

     /**
	 * 	Update TestDiag25 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTestDiag25(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTestDiag25,testDiag25.length);
   	
   }
   
   public void setTestDiag25(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag25,testDiag25.length);
   	
   }
   
     /**
	 * 	Update TestDiag25 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag25(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag25+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TestDiag25 with another Field
	 *	@param value
	 */
   public void setTestDiag25(Field source) {
       replace(source,0,source.length(),beginTestDiag25,TEST_DIAG_25_LEN);
   	
   }  
   
     /**
	 * 	Update TestDiag25 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTestDiag25(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTestDiag25,TEST_DIAG_25_LEN);
   	
   }
   
     /**
	 * 	Update TestDiag25 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTestDiag25(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTestDiag25+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTestDiagAreaFieldLength() {
			return TEST_DIAG_AREA_LENGTH;
		}

}
  
