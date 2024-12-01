package com.cloudframe.app.dto.o529351u;

/**
*  The class D51uTestDiagArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class D51uTestDiagArea extends D51uTestDiagAreaSerialized { 
   

						private char[] d51uTestDiag01 = Field.fillLowValue(7);

						private char[] d51uTestDiag02 = Field.fillLowValue(7);

						private char[] d51uTestDiag03 = Field.fillLowValue(7);

						private char[] d51uTestDiag04 = Field.fillLowValue(7);

						private char[] d51uTestDiag05 = Field.fillLowValue(7);

						private char[] d51uTestDiag06 = Field.fillLowValue(7);

						private char[] d51uTestDiag07 = Field.fillLowValue(7);

						private char[] d51uTestDiag08 = Field.fillLowValue(7);

						private char[] d51uTestDiag09 = Field.fillLowValue(7);

						private char[] d51uTestDiag10 = Field.fillLowValue(7);

						private char[] d51uTestDiag11 = Field.fillLowValue(7);

						private char[] d51uTestDiag12 = Field.fillLowValue(7);

						private char[] d51uTestDiag13 = Field.fillLowValue(7);

						private char[] d51uTestDiag14 = Field.fillLowValue(7);

						private char[] d51uTestDiag15 = Field.fillLowValue(7);

						private char[] d51uTestDiag16 = Field.fillLowValue(7);

						private char[] d51uTestDiag17 = Field.fillLowValue(7);

						private char[] d51uTestDiag18 = Field.fillLowValue(7);

						private char[] d51uTestDiag19 = Field.fillLowValue(7);

						private char[] d51uTestDiag20 = Field.fillLowValue(7);

						private char[] d51uTestDiag21 = Field.fillLowValue(7);

						private char[] d51uTestDiag22 = Field.fillLowValue(7);

						private char[] d51uTestDiag23 = Field.fillLowValue(7);

						private char[] d51uTestDiag24 = Field.fillLowValue(7);

						private char[] d51uTestDiag25 = Field.fillLowValue(7);
	
	/**
	* Constructor for D51uTestDiagArea
	**/
    public D51uTestDiagArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for D51uTestDiagArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uTestDiagArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of d51uTestDiag01
	 *	@return d51uTestDiag01
	 */
   public char[] getD51uTestDiag01() throws CFException{
     if (isD51uTestDiag01Modified()) { 
        d51uTestDiag01 = refreshD51uTestDiag01();
     }
   		return d51uTestDiag01;
   }

  
	/**
	*  set variable d51uTestDiag01
	*  Corresponding COBOL Variable is D51U-TEST-DIAG-01
	*  @param value
	**/
   public void setD51uTestDiag01(char[] value) {
      d51uTestDiag01 = checkD51uTestDiag01Constraints(value);
      serializeD51uTestDiag01(d51uTestDiag01);
   } 

     /**
	 * 	Update D51uTestDiag01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uTestDiag01(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uTestDiag01,d51uTestDiag01.length);
   	
   }
   
   public void setD51uTestDiag01(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag01,d51uTestDiag01.length);
   	
   }
   
     /**
	 * 	Update D51uTestDiag01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag01+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uTestDiag01 with another Field
	 *	@param value
	 */
   public void setD51uTestDiag01(Field source) {
       replace(source,0,source.length(),beginD51uTestDiag01,D_51U_TEST_DIAG_01_LEN);
   	
   }  
   
     /**
	 * 	Update D51uTestDiag01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uTestDiag01(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uTestDiag01,D_51U_TEST_DIAG_01_LEN);
   	
   }
   
     /**
	 * 	Update D51uTestDiag01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag01+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uTestDiag02
	 *	@return d51uTestDiag02
	 */
   public char[] getD51uTestDiag02() throws CFException{
     if (isD51uTestDiag02Modified()) { 
        d51uTestDiag02 = refreshD51uTestDiag02();
     }
   		return d51uTestDiag02;
   }

  
	/**
	*  set variable d51uTestDiag02
	*  Corresponding COBOL Variable is D51U-TEST-DIAG-02
	*  @param value
	**/
   public void setD51uTestDiag02(char[] value) {
      d51uTestDiag02 = checkD51uTestDiag02Constraints(value);
      serializeD51uTestDiag02(d51uTestDiag02);
   } 

     /**
	 * 	Update D51uTestDiag02 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uTestDiag02(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uTestDiag02,d51uTestDiag02.length);
   	
   }
   
   public void setD51uTestDiag02(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag02,d51uTestDiag02.length);
   	
   }
   
     /**
	 * 	Update D51uTestDiag02 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag02(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag02+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uTestDiag02 with another Field
	 *	@param value
	 */
   public void setD51uTestDiag02(Field source) {
       replace(source,0,source.length(),beginD51uTestDiag02,D_51U_TEST_DIAG_02_LEN);
   	
   }  
   
     /**
	 * 	Update D51uTestDiag02 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uTestDiag02(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uTestDiag02,D_51U_TEST_DIAG_02_LEN);
   	
   }
   
     /**
	 * 	Update D51uTestDiag02 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag02(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag02+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uTestDiag03
	 *	@return d51uTestDiag03
	 */
   public char[] getD51uTestDiag03() throws CFException{
     if (isD51uTestDiag03Modified()) { 
        d51uTestDiag03 = refreshD51uTestDiag03();
     }
   		return d51uTestDiag03;
   }

  
	/**
	*  set variable d51uTestDiag03
	*  Corresponding COBOL Variable is D51U-TEST-DIAG-03
	*  @param value
	**/
   public void setD51uTestDiag03(char[] value) {
      d51uTestDiag03 = checkD51uTestDiag03Constraints(value);
      serializeD51uTestDiag03(d51uTestDiag03);
   } 

     /**
	 * 	Update D51uTestDiag03 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uTestDiag03(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uTestDiag03,d51uTestDiag03.length);
   	
   }
   
   public void setD51uTestDiag03(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag03,d51uTestDiag03.length);
   	
   }
   
     /**
	 * 	Update D51uTestDiag03 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag03(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag03+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uTestDiag03 with another Field
	 *	@param value
	 */
   public void setD51uTestDiag03(Field source) {
       replace(source,0,source.length(),beginD51uTestDiag03,D_51U_TEST_DIAG_03_LEN);
   	
   }  
   
     /**
	 * 	Update D51uTestDiag03 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uTestDiag03(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uTestDiag03,D_51U_TEST_DIAG_03_LEN);
   	
   }
   
     /**
	 * 	Update D51uTestDiag03 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag03(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag03+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uTestDiag04
	 *	@return d51uTestDiag04
	 */
   public char[] getD51uTestDiag04() throws CFException{
     if (isD51uTestDiag04Modified()) { 
        d51uTestDiag04 = refreshD51uTestDiag04();
     }
   		return d51uTestDiag04;
   }

  
	/**
	*  set variable d51uTestDiag04
	*  Corresponding COBOL Variable is D51U-TEST-DIAG-04
	*  @param value
	**/
   public void setD51uTestDiag04(char[] value) {
      d51uTestDiag04 = checkD51uTestDiag04Constraints(value);
      serializeD51uTestDiag04(d51uTestDiag04);
   } 

     /**
	 * 	Update D51uTestDiag04 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uTestDiag04(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uTestDiag04,d51uTestDiag04.length);
   	
   }
   
   public void setD51uTestDiag04(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag04,d51uTestDiag04.length);
   	
   }
   
     /**
	 * 	Update D51uTestDiag04 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag04(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag04+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uTestDiag04 with another Field
	 *	@param value
	 */
   public void setD51uTestDiag04(Field source) {
       replace(source,0,source.length(),beginD51uTestDiag04,D_51U_TEST_DIAG_04_LEN);
   	
   }  
   
     /**
	 * 	Update D51uTestDiag04 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uTestDiag04(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uTestDiag04,D_51U_TEST_DIAG_04_LEN);
   	
   }
   
     /**
	 * 	Update D51uTestDiag04 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag04(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag04+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uTestDiag05
	 *	@return d51uTestDiag05
	 */
   public char[] getD51uTestDiag05() throws CFException{
     if (isD51uTestDiag05Modified()) { 
        d51uTestDiag05 = refreshD51uTestDiag05();
     }
   		return d51uTestDiag05;
   }

  
	/**
	*  set variable d51uTestDiag05
	*  Corresponding COBOL Variable is D51U-TEST-DIAG-05
	*  @param value
	**/
   public void setD51uTestDiag05(char[] value) {
      d51uTestDiag05 = checkD51uTestDiag05Constraints(value);
      serializeD51uTestDiag05(d51uTestDiag05);
   } 

     /**
	 * 	Update D51uTestDiag05 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uTestDiag05(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uTestDiag05,d51uTestDiag05.length);
   	
   }
   
   public void setD51uTestDiag05(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag05,d51uTestDiag05.length);
   	
   }
   
     /**
	 * 	Update D51uTestDiag05 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag05(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag05+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uTestDiag05 with another Field
	 *	@param value
	 */
   public void setD51uTestDiag05(Field source) {
       replace(source,0,source.length(),beginD51uTestDiag05,D_51U_TEST_DIAG_05_LEN);
   	
   }  
   
     /**
	 * 	Update D51uTestDiag05 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uTestDiag05(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uTestDiag05,D_51U_TEST_DIAG_05_LEN);
   	
   }
   
     /**
	 * 	Update D51uTestDiag05 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag05(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag05+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uTestDiag06
	 *	@return d51uTestDiag06
	 */
   public char[] getD51uTestDiag06() throws CFException{
     if (isD51uTestDiag06Modified()) { 
        d51uTestDiag06 = refreshD51uTestDiag06();
     }
   		return d51uTestDiag06;
   }

  
	/**
	*  set variable d51uTestDiag06
	*  Corresponding COBOL Variable is D51U-TEST-DIAG-06
	*  @param value
	**/
   public void setD51uTestDiag06(char[] value) {
      d51uTestDiag06 = checkD51uTestDiag06Constraints(value);
      serializeD51uTestDiag06(d51uTestDiag06);
   } 

     /**
	 * 	Update D51uTestDiag06 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uTestDiag06(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uTestDiag06,d51uTestDiag06.length);
   	
   }
   
   public void setD51uTestDiag06(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag06,d51uTestDiag06.length);
   	
   }
   
     /**
	 * 	Update D51uTestDiag06 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag06(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag06+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uTestDiag06 with another Field
	 *	@param value
	 */
   public void setD51uTestDiag06(Field source) {
       replace(source,0,source.length(),beginD51uTestDiag06,D_51U_TEST_DIAG_06_LEN);
   	
   }  
   
     /**
	 * 	Update D51uTestDiag06 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uTestDiag06(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uTestDiag06,D_51U_TEST_DIAG_06_LEN);
   	
   }
   
     /**
	 * 	Update D51uTestDiag06 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag06(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag06+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uTestDiag07
	 *	@return d51uTestDiag07
	 */
   public char[] getD51uTestDiag07() throws CFException{
     if (isD51uTestDiag07Modified()) { 
        d51uTestDiag07 = refreshD51uTestDiag07();
     }
   		return d51uTestDiag07;
   }

  
	/**
	*  set variable d51uTestDiag07
	*  Corresponding COBOL Variable is D51U-TEST-DIAG-07
	*  @param value
	**/
   public void setD51uTestDiag07(char[] value) {
      d51uTestDiag07 = checkD51uTestDiag07Constraints(value);
      serializeD51uTestDiag07(d51uTestDiag07);
   } 

     /**
	 * 	Update D51uTestDiag07 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uTestDiag07(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uTestDiag07,d51uTestDiag07.length);
   	
   }
   
   public void setD51uTestDiag07(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag07,d51uTestDiag07.length);
   	
   }
   
     /**
	 * 	Update D51uTestDiag07 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag07(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag07+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uTestDiag07 with another Field
	 *	@param value
	 */
   public void setD51uTestDiag07(Field source) {
       replace(source,0,source.length(),beginD51uTestDiag07,D_51U_TEST_DIAG_07_LEN);
   	
   }  
   
     /**
	 * 	Update D51uTestDiag07 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uTestDiag07(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uTestDiag07,D_51U_TEST_DIAG_07_LEN);
   	
   }
   
     /**
	 * 	Update D51uTestDiag07 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag07(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag07+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uTestDiag08
	 *	@return d51uTestDiag08
	 */
   public char[] getD51uTestDiag08() throws CFException{
     if (isD51uTestDiag08Modified()) { 
        d51uTestDiag08 = refreshD51uTestDiag08();
     }
   		return d51uTestDiag08;
   }

  
	/**
	*  set variable d51uTestDiag08
	*  Corresponding COBOL Variable is D51U-TEST-DIAG-08
	*  @param value
	**/
   public void setD51uTestDiag08(char[] value) {
      d51uTestDiag08 = checkD51uTestDiag08Constraints(value);
      serializeD51uTestDiag08(d51uTestDiag08);
   } 

     /**
	 * 	Update D51uTestDiag08 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uTestDiag08(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uTestDiag08,d51uTestDiag08.length);
   	
   }
   
   public void setD51uTestDiag08(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag08,d51uTestDiag08.length);
   	
   }
   
     /**
	 * 	Update D51uTestDiag08 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag08(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag08+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uTestDiag08 with another Field
	 *	@param value
	 */
   public void setD51uTestDiag08(Field source) {
       replace(source,0,source.length(),beginD51uTestDiag08,D_51U_TEST_DIAG_08_LEN);
   	
   }  
   
     /**
	 * 	Update D51uTestDiag08 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uTestDiag08(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uTestDiag08,D_51U_TEST_DIAG_08_LEN);
   	
   }
   
     /**
	 * 	Update D51uTestDiag08 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag08(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag08+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uTestDiag09
	 *	@return d51uTestDiag09
	 */
   public char[] getD51uTestDiag09() throws CFException{
     if (isD51uTestDiag09Modified()) { 
        d51uTestDiag09 = refreshD51uTestDiag09();
     }
   		return d51uTestDiag09;
   }

  
	/**
	*  set variable d51uTestDiag09
	*  Corresponding COBOL Variable is D51U-TEST-DIAG-09
	*  @param value
	**/
   public void setD51uTestDiag09(char[] value) {
      d51uTestDiag09 = checkD51uTestDiag09Constraints(value);
      serializeD51uTestDiag09(d51uTestDiag09);
   } 

     /**
	 * 	Update D51uTestDiag09 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uTestDiag09(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uTestDiag09,d51uTestDiag09.length);
   	
   }
   
   public void setD51uTestDiag09(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag09,d51uTestDiag09.length);
   	
   }
   
     /**
	 * 	Update D51uTestDiag09 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag09(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag09+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uTestDiag09 with another Field
	 *	@param value
	 */
   public void setD51uTestDiag09(Field source) {
       replace(source,0,source.length(),beginD51uTestDiag09,D_51U_TEST_DIAG_09_LEN);
   	
   }  
   
     /**
	 * 	Update D51uTestDiag09 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uTestDiag09(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uTestDiag09,D_51U_TEST_DIAG_09_LEN);
   	
   }
   
     /**
	 * 	Update D51uTestDiag09 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag09(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag09+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uTestDiag10
	 *	@return d51uTestDiag10
	 */
   public char[] getD51uTestDiag10() throws CFException{
     if (isD51uTestDiag10Modified()) { 
        d51uTestDiag10 = refreshD51uTestDiag10();
     }
   		return d51uTestDiag10;
   }

  
	/**
	*  set variable d51uTestDiag10
	*  Corresponding COBOL Variable is D51U-TEST-DIAG-10
	*  @param value
	**/
   public void setD51uTestDiag10(char[] value) {
      d51uTestDiag10 = checkD51uTestDiag10Constraints(value);
      serializeD51uTestDiag10(d51uTestDiag10);
   } 

     /**
	 * 	Update D51uTestDiag10 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uTestDiag10(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uTestDiag10,d51uTestDiag10.length);
   	
   }
   
   public void setD51uTestDiag10(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag10,d51uTestDiag10.length);
   	
   }
   
     /**
	 * 	Update D51uTestDiag10 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag10(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag10+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uTestDiag10 with another Field
	 *	@param value
	 */
   public void setD51uTestDiag10(Field source) {
       replace(source,0,source.length(),beginD51uTestDiag10,D_51U_TEST_DIAG_10_LEN);
   	
   }  
   
     /**
	 * 	Update D51uTestDiag10 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uTestDiag10(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uTestDiag10,D_51U_TEST_DIAG_10_LEN);
   	
   }
   
     /**
	 * 	Update D51uTestDiag10 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag10(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag10+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uTestDiag11
	 *	@return d51uTestDiag11
	 */
   public char[] getD51uTestDiag11() throws CFException{
     if (isD51uTestDiag11Modified()) { 
        d51uTestDiag11 = refreshD51uTestDiag11();
     }
   		return d51uTestDiag11;
   }

  
	/**
	*  set variable d51uTestDiag11
	*  Corresponding COBOL Variable is D51U-TEST-DIAG-11
	*  @param value
	**/
   public void setD51uTestDiag11(char[] value) {
      d51uTestDiag11 = checkD51uTestDiag11Constraints(value);
      serializeD51uTestDiag11(d51uTestDiag11);
   } 

     /**
	 * 	Update D51uTestDiag11 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uTestDiag11(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uTestDiag11,d51uTestDiag11.length);
   	
   }
   
   public void setD51uTestDiag11(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag11,d51uTestDiag11.length);
   	
   }
   
     /**
	 * 	Update D51uTestDiag11 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag11(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag11+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uTestDiag11 with another Field
	 *	@param value
	 */
   public void setD51uTestDiag11(Field source) {
       replace(source,0,source.length(),beginD51uTestDiag11,D_51U_TEST_DIAG_11_LEN);
   	
   }  
   
     /**
	 * 	Update D51uTestDiag11 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uTestDiag11(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uTestDiag11,D_51U_TEST_DIAG_11_LEN);
   	
   }
   
     /**
	 * 	Update D51uTestDiag11 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag11(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag11+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uTestDiag12
	 *	@return d51uTestDiag12
	 */
   public char[] getD51uTestDiag12() throws CFException{
     if (isD51uTestDiag12Modified()) { 
        d51uTestDiag12 = refreshD51uTestDiag12();
     }
   		return d51uTestDiag12;
   }

  
	/**
	*  set variable d51uTestDiag12
	*  Corresponding COBOL Variable is D51U-TEST-DIAG-12
	*  @param value
	**/
   public void setD51uTestDiag12(char[] value) {
      d51uTestDiag12 = checkD51uTestDiag12Constraints(value);
      serializeD51uTestDiag12(d51uTestDiag12);
   } 

     /**
	 * 	Update D51uTestDiag12 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uTestDiag12(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uTestDiag12,d51uTestDiag12.length);
   	
   }
   
   public void setD51uTestDiag12(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag12,d51uTestDiag12.length);
   	
   }
   
     /**
	 * 	Update D51uTestDiag12 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag12(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag12+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uTestDiag12 with another Field
	 *	@param value
	 */
   public void setD51uTestDiag12(Field source) {
       replace(source,0,source.length(),beginD51uTestDiag12,D_51U_TEST_DIAG_12_LEN);
   	
   }  
   
     /**
	 * 	Update D51uTestDiag12 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uTestDiag12(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uTestDiag12,D_51U_TEST_DIAG_12_LEN);
   	
   }
   
     /**
	 * 	Update D51uTestDiag12 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag12(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag12+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uTestDiag13
	 *	@return d51uTestDiag13
	 */
   public char[] getD51uTestDiag13() throws CFException{
     if (isD51uTestDiag13Modified()) { 
        d51uTestDiag13 = refreshD51uTestDiag13();
     }
   		return d51uTestDiag13;
   }

  
	/**
	*  set variable d51uTestDiag13
	*  Corresponding COBOL Variable is D51U-TEST-DIAG-13
	*  @param value
	**/
   public void setD51uTestDiag13(char[] value) {
      d51uTestDiag13 = checkD51uTestDiag13Constraints(value);
      serializeD51uTestDiag13(d51uTestDiag13);
   } 

     /**
	 * 	Update D51uTestDiag13 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uTestDiag13(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uTestDiag13,d51uTestDiag13.length);
   	
   }
   
   public void setD51uTestDiag13(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag13,d51uTestDiag13.length);
   	
   }
   
     /**
	 * 	Update D51uTestDiag13 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag13(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag13+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uTestDiag13 with another Field
	 *	@param value
	 */
   public void setD51uTestDiag13(Field source) {
       replace(source,0,source.length(),beginD51uTestDiag13,D_51U_TEST_DIAG_13_LEN);
   	
   }  
   
     /**
	 * 	Update D51uTestDiag13 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uTestDiag13(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uTestDiag13,D_51U_TEST_DIAG_13_LEN);
   	
   }
   
     /**
	 * 	Update D51uTestDiag13 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag13(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag13+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uTestDiag14
	 *	@return d51uTestDiag14
	 */
   public char[] getD51uTestDiag14() throws CFException{
     if (isD51uTestDiag14Modified()) { 
        d51uTestDiag14 = refreshD51uTestDiag14();
     }
   		return d51uTestDiag14;
   }

  
	/**
	*  set variable d51uTestDiag14
	*  Corresponding COBOL Variable is D51U-TEST-DIAG-14
	*  @param value
	**/
   public void setD51uTestDiag14(char[] value) {
      d51uTestDiag14 = checkD51uTestDiag14Constraints(value);
      serializeD51uTestDiag14(d51uTestDiag14);
   } 

     /**
	 * 	Update D51uTestDiag14 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uTestDiag14(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uTestDiag14,d51uTestDiag14.length);
   	
   }
   
   public void setD51uTestDiag14(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag14,d51uTestDiag14.length);
   	
   }
   
     /**
	 * 	Update D51uTestDiag14 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag14(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag14+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uTestDiag14 with another Field
	 *	@param value
	 */
   public void setD51uTestDiag14(Field source) {
       replace(source,0,source.length(),beginD51uTestDiag14,D_51U_TEST_DIAG_14_LEN);
   	
   }  
   
     /**
	 * 	Update D51uTestDiag14 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uTestDiag14(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uTestDiag14,D_51U_TEST_DIAG_14_LEN);
   	
   }
   
     /**
	 * 	Update D51uTestDiag14 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag14(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag14+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uTestDiag15
	 *	@return d51uTestDiag15
	 */
   public char[] getD51uTestDiag15() throws CFException{
     if (isD51uTestDiag15Modified()) { 
        d51uTestDiag15 = refreshD51uTestDiag15();
     }
   		return d51uTestDiag15;
   }

  
	/**
	*  set variable d51uTestDiag15
	*  Corresponding COBOL Variable is D51U-TEST-DIAG-15
	*  @param value
	**/
   public void setD51uTestDiag15(char[] value) {
      d51uTestDiag15 = checkD51uTestDiag15Constraints(value);
      serializeD51uTestDiag15(d51uTestDiag15);
   } 

     /**
	 * 	Update D51uTestDiag15 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uTestDiag15(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uTestDiag15,d51uTestDiag15.length);
   	
   }
   
   public void setD51uTestDiag15(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag15,d51uTestDiag15.length);
   	
   }
   
     /**
	 * 	Update D51uTestDiag15 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag15(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag15+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uTestDiag15 with another Field
	 *	@param value
	 */
   public void setD51uTestDiag15(Field source) {
       replace(source,0,source.length(),beginD51uTestDiag15,D_51U_TEST_DIAG_15_LEN);
   	
   }  
   
     /**
	 * 	Update D51uTestDiag15 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uTestDiag15(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uTestDiag15,D_51U_TEST_DIAG_15_LEN);
   	
   }
   
     /**
	 * 	Update D51uTestDiag15 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag15(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag15+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uTestDiag16
	 *	@return d51uTestDiag16
	 */
   public char[] getD51uTestDiag16() throws CFException{
     if (isD51uTestDiag16Modified()) { 
        d51uTestDiag16 = refreshD51uTestDiag16();
     }
   		return d51uTestDiag16;
   }

  
	/**
	*  set variable d51uTestDiag16
	*  Corresponding COBOL Variable is D51U-TEST-DIAG-16
	*  @param value
	**/
   public void setD51uTestDiag16(char[] value) {
      d51uTestDiag16 = checkD51uTestDiag16Constraints(value);
      serializeD51uTestDiag16(d51uTestDiag16);
   } 

     /**
	 * 	Update D51uTestDiag16 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uTestDiag16(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uTestDiag16,d51uTestDiag16.length);
   	
   }
   
   public void setD51uTestDiag16(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag16,d51uTestDiag16.length);
   	
   }
   
     /**
	 * 	Update D51uTestDiag16 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag16(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag16+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uTestDiag16 with another Field
	 *	@param value
	 */
   public void setD51uTestDiag16(Field source) {
       replace(source,0,source.length(),beginD51uTestDiag16,D_51U_TEST_DIAG_16_LEN);
   	
   }  
   
     /**
	 * 	Update D51uTestDiag16 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uTestDiag16(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uTestDiag16,D_51U_TEST_DIAG_16_LEN);
   	
   }
   
     /**
	 * 	Update D51uTestDiag16 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag16(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag16+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uTestDiag17
	 *	@return d51uTestDiag17
	 */
   public char[] getD51uTestDiag17() throws CFException{
     if (isD51uTestDiag17Modified()) { 
        d51uTestDiag17 = refreshD51uTestDiag17();
     }
   		return d51uTestDiag17;
   }

  
	/**
	*  set variable d51uTestDiag17
	*  Corresponding COBOL Variable is D51U-TEST-DIAG-17
	*  @param value
	**/
   public void setD51uTestDiag17(char[] value) {
      d51uTestDiag17 = checkD51uTestDiag17Constraints(value);
      serializeD51uTestDiag17(d51uTestDiag17);
   } 

     /**
	 * 	Update D51uTestDiag17 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uTestDiag17(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uTestDiag17,d51uTestDiag17.length);
   	
   }
   
   public void setD51uTestDiag17(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag17,d51uTestDiag17.length);
   	
   }
   
     /**
	 * 	Update D51uTestDiag17 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag17(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag17+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uTestDiag17 with another Field
	 *	@param value
	 */
   public void setD51uTestDiag17(Field source) {
       replace(source,0,source.length(),beginD51uTestDiag17,D_51U_TEST_DIAG_17_LEN);
   	
   }  
   
     /**
	 * 	Update D51uTestDiag17 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uTestDiag17(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uTestDiag17,D_51U_TEST_DIAG_17_LEN);
   	
   }
   
     /**
	 * 	Update D51uTestDiag17 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag17(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag17+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uTestDiag18
	 *	@return d51uTestDiag18
	 */
   public char[] getD51uTestDiag18() throws CFException{
     if (isD51uTestDiag18Modified()) { 
        d51uTestDiag18 = refreshD51uTestDiag18();
     }
   		return d51uTestDiag18;
   }

  
	/**
	*  set variable d51uTestDiag18
	*  Corresponding COBOL Variable is D51U-TEST-DIAG-18
	*  @param value
	**/
   public void setD51uTestDiag18(char[] value) {
      d51uTestDiag18 = checkD51uTestDiag18Constraints(value);
      serializeD51uTestDiag18(d51uTestDiag18);
   } 

     /**
	 * 	Update D51uTestDiag18 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uTestDiag18(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uTestDiag18,d51uTestDiag18.length);
   	
   }
   
   public void setD51uTestDiag18(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag18,d51uTestDiag18.length);
   	
   }
   
     /**
	 * 	Update D51uTestDiag18 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag18(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag18+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uTestDiag18 with another Field
	 *	@param value
	 */
   public void setD51uTestDiag18(Field source) {
       replace(source,0,source.length(),beginD51uTestDiag18,D_51U_TEST_DIAG_18_LEN);
   	
   }  
   
     /**
	 * 	Update D51uTestDiag18 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uTestDiag18(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uTestDiag18,D_51U_TEST_DIAG_18_LEN);
   	
   }
   
     /**
	 * 	Update D51uTestDiag18 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag18(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag18+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uTestDiag19
	 *	@return d51uTestDiag19
	 */
   public char[] getD51uTestDiag19() throws CFException{
     if (isD51uTestDiag19Modified()) { 
        d51uTestDiag19 = refreshD51uTestDiag19();
     }
   		return d51uTestDiag19;
   }

  
	/**
	*  set variable d51uTestDiag19
	*  Corresponding COBOL Variable is D51U-TEST-DIAG-19
	*  @param value
	**/
   public void setD51uTestDiag19(char[] value) {
      d51uTestDiag19 = checkD51uTestDiag19Constraints(value);
      serializeD51uTestDiag19(d51uTestDiag19);
   } 

     /**
	 * 	Update D51uTestDiag19 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uTestDiag19(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uTestDiag19,d51uTestDiag19.length);
   	
   }
   
   public void setD51uTestDiag19(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag19,d51uTestDiag19.length);
   	
   }
   
     /**
	 * 	Update D51uTestDiag19 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag19(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag19+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uTestDiag19 with another Field
	 *	@param value
	 */
   public void setD51uTestDiag19(Field source) {
       replace(source,0,source.length(),beginD51uTestDiag19,D_51U_TEST_DIAG_19_LEN);
   	
   }  
   
     /**
	 * 	Update D51uTestDiag19 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uTestDiag19(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uTestDiag19,D_51U_TEST_DIAG_19_LEN);
   	
   }
   
     /**
	 * 	Update D51uTestDiag19 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag19(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag19+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uTestDiag20
	 *	@return d51uTestDiag20
	 */
   public char[] getD51uTestDiag20() throws CFException{
     if (isD51uTestDiag20Modified()) { 
        d51uTestDiag20 = refreshD51uTestDiag20();
     }
   		return d51uTestDiag20;
   }

  
	/**
	*  set variable d51uTestDiag20
	*  Corresponding COBOL Variable is D51U-TEST-DIAG-20
	*  @param value
	**/
   public void setD51uTestDiag20(char[] value) {
      d51uTestDiag20 = checkD51uTestDiag20Constraints(value);
      serializeD51uTestDiag20(d51uTestDiag20);
   } 

     /**
	 * 	Update D51uTestDiag20 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uTestDiag20(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uTestDiag20,d51uTestDiag20.length);
   	
   }
   
   public void setD51uTestDiag20(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag20,d51uTestDiag20.length);
   	
   }
   
     /**
	 * 	Update D51uTestDiag20 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag20(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag20+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uTestDiag20 with another Field
	 *	@param value
	 */
   public void setD51uTestDiag20(Field source) {
       replace(source,0,source.length(),beginD51uTestDiag20,D_51U_TEST_DIAG_20_LEN);
   	
   }  
   
     /**
	 * 	Update D51uTestDiag20 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uTestDiag20(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uTestDiag20,D_51U_TEST_DIAG_20_LEN);
   	
   }
   
     /**
	 * 	Update D51uTestDiag20 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag20(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag20+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uTestDiag21
	 *	@return d51uTestDiag21
	 */
   public char[] getD51uTestDiag21() throws CFException{
     if (isD51uTestDiag21Modified()) { 
        d51uTestDiag21 = refreshD51uTestDiag21();
     }
   		return d51uTestDiag21;
   }

  
	/**
	*  set variable d51uTestDiag21
	*  Corresponding COBOL Variable is D51U-TEST-DIAG-21
	*  @param value
	**/
   public void setD51uTestDiag21(char[] value) {
      d51uTestDiag21 = checkD51uTestDiag21Constraints(value);
      serializeD51uTestDiag21(d51uTestDiag21);
   } 

     /**
	 * 	Update D51uTestDiag21 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uTestDiag21(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uTestDiag21,d51uTestDiag21.length);
   	
   }
   
   public void setD51uTestDiag21(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag21,d51uTestDiag21.length);
   	
   }
   
     /**
	 * 	Update D51uTestDiag21 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag21(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag21+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uTestDiag21 with another Field
	 *	@param value
	 */
   public void setD51uTestDiag21(Field source) {
       replace(source,0,source.length(),beginD51uTestDiag21,D_51U_TEST_DIAG_21_LEN);
   	
   }  
   
     /**
	 * 	Update D51uTestDiag21 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uTestDiag21(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uTestDiag21,D_51U_TEST_DIAG_21_LEN);
   	
   }
   
     /**
	 * 	Update D51uTestDiag21 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag21(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag21+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uTestDiag22
	 *	@return d51uTestDiag22
	 */
   public char[] getD51uTestDiag22() throws CFException{
     if (isD51uTestDiag22Modified()) { 
        d51uTestDiag22 = refreshD51uTestDiag22();
     }
   		return d51uTestDiag22;
   }

  
	/**
	*  set variable d51uTestDiag22
	*  Corresponding COBOL Variable is D51U-TEST-DIAG-22
	*  @param value
	**/
   public void setD51uTestDiag22(char[] value) {
      d51uTestDiag22 = checkD51uTestDiag22Constraints(value);
      serializeD51uTestDiag22(d51uTestDiag22);
   } 

     /**
	 * 	Update D51uTestDiag22 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uTestDiag22(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uTestDiag22,d51uTestDiag22.length);
   	
   }
   
   public void setD51uTestDiag22(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag22,d51uTestDiag22.length);
   	
   }
   
     /**
	 * 	Update D51uTestDiag22 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag22(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag22+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uTestDiag22 with another Field
	 *	@param value
	 */
   public void setD51uTestDiag22(Field source) {
       replace(source,0,source.length(),beginD51uTestDiag22,D_51U_TEST_DIAG_22_LEN);
   	
   }  
   
     /**
	 * 	Update D51uTestDiag22 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uTestDiag22(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uTestDiag22,D_51U_TEST_DIAG_22_LEN);
   	
   }
   
     /**
	 * 	Update D51uTestDiag22 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag22(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag22+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uTestDiag23
	 *	@return d51uTestDiag23
	 */
   public char[] getD51uTestDiag23() throws CFException{
     if (isD51uTestDiag23Modified()) { 
        d51uTestDiag23 = refreshD51uTestDiag23();
     }
   		return d51uTestDiag23;
   }

  
	/**
	*  set variable d51uTestDiag23
	*  Corresponding COBOL Variable is D51U-TEST-DIAG-23
	*  @param value
	**/
   public void setD51uTestDiag23(char[] value) {
      d51uTestDiag23 = checkD51uTestDiag23Constraints(value);
      serializeD51uTestDiag23(d51uTestDiag23);
   } 

     /**
	 * 	Update D51uTestDiag23 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uTestDiag23(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uTestDiag23,d51uTestDiag23.length);
   	
   }
   
   public void setD51uTestDiag23(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag23,d51uTestDiag23.length);
   	
   }
   
     /**
	 * 	Update D51uTestDiag23 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag23(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag23+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uTestDiag23 with another Field
	 *	@param value
	 */
   public void setD51uTestDiag23(Field source) {
       replace(source,0,source.length(),beginD51uTestDiag23,D_51U_TEST_DIAG_23_LEN);
   	
   }  
   
     /**
	 * 	Update D51uTestDiag23 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uTestDiag23(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uTestDiag23,D_51U_TEST_DIAG_23_LEN);
   	
   }
   
     /**
	 * 	Update D51uTestDiag23 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag23(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag23+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uTestDiag24
	 *	@return d51uTestDiag24
	 */
   public char[] getD51uTestDiag24() throws CFException{
     if (isD51uTestDiag24Modified()) { 
        d51uTestDiag24 = refreshD51uTestDiag24();
     }
   		return d51uTestDiag24;
   }

  
	/**
	*  set variable d51uTestDiag24
	*  Corresponding COBOL Variable is D51U-TEST-DIAG-24
	*  @param value
	**/
   public void setD51uTestDiag24(char[] value) {
      d51uTestDiag24 = checkD51uTestDiag24Constraints(value);
      serializeD51uTestDiag24(d51uTestDiag24);
   } 

     /**
	 * 	Update D51uTestDiag24 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uTestDiag24(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uTestDiag24,d51uTestDiag24.length);
   	
   }
   
   public void setD51uTestDiag24(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag24,d51uTestDiag24.length);
   	
   }
   
     /**
	 * 	Update D51uTestDiag24 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag24(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag24+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uTestDiag24 with another Field
	 *	@param value
	 */
   public void setD51uTestDiag24(Field source) {
       replace(source,0,source.length(),beginD51uTestDiag24,D_51U_TEST_DIAG_24_LEN);
   	
   }  
   
     /**
	 * 	Update D51uTestDiag24 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uTestDiag24(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uTestDiag24,D_51U_TEST_DIAG_24_LEN);
   	
   }
   
     /**
	 * 	Update D51uTestDiag24 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag24(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag24+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uTestDiag25
	 *	@return d51uTestDiag25
	 */
   public char[] getD51uTestDiag25() throws CFException{
     if (isD51uTestDiag25Modified()) { 
        d51uTestDiag25 = refreshD51uTestDiag25();
     }
   		return d51uTestDiag25;
   }

  
	/**
	*  set variable d51uTestDiag25
	*  Corresponding COBOL Variable is D51U-TEST-DIAG-25
	*  @param value
	**/
   public void setD51uTestDiag25(char[] value) {
      d51uTestDiag25 = checkD51uTestDiag25Constraints(value);
      serializeD51uTestDiag25(d51uTestDiag25);
   } 

     /**
	 * 	Update D51uTestDiag25 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uTestDiag25(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uTestDiag25,d51uTestDiag25.length);
   	
   }
   
   public void setD51uTestDiag25(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag25,d51uTestDiag25.length);
   	
   }
   
     /**
	 * 	Update D51uTestDiag25 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag25(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag25+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uTestDiag25 with another Field
	 *	@param value
	 */
   public void setD51uTestDiag25(Field source) {
       replace(source,0,source.length(),beginD51uTestDiag25,D_51U_TEST_DIAG_25_LEN);
   	
   }  
   
     /**
	 * 	Update D51uTestDiag25 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uTestDiag25(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uTestDiag25,D_51U_TEST_DIAG_25_LEN);
   	
   }
   
     /**
	 * 	Update D51uTestDiag25 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestDiag25(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uTestDiag25+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes D51uTestDiagArea
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setD51uTestDiag01(CONSTANTS.SPACE_7);
         setD51uTestDiag02(CONSTANTS.SPACE_7);
         setD51uTestDiag03(CONSTANTS.SPACE_7);
         setD51uTestDiag04(CONSTANTS.SPACE_7);
         setD51uTestDiag05(CONSTANTS.SPACE_7);
         setD51uTestDiag06(CONSTANTS.SPACE_7);
         setD51uTestDiag07(CONSTANTS.SPACE_7);
         setD51uTestDiag08(CONSTANTS.SPACE_7);
         setD51uTestDiag09(CONSTANTS.SPACE_7);
         setD51uTestDiag10(CONSTANTS.SPACE_7);
         setD51uTestDiag11(CONSTANTS.SPACE_7);
         setD51uTestDiag12(CONSTANTS.SPACE_7);
         setD51uTestDiag13(CONSTANTS.SPACE_7);
         setD51uTestDiag14(CONSTANTS.SPACE_7);
         setD51uTestDiag15(CONSTANTS.SPACE_7);
         setD51uTestDiag16(CONSTANTS.SPACE_7);
         setD51uTestDiag17(CONSTANTS.SPACE_7);
         setD51uTestDiag18(CONSTANTS.SPACE_7);
         setD51uTestDiag19(CONSTANTS.SPACE_7);
         setD51uTestDiag20(CONSTANTS.SPACE_7);
         setD51uTestDiag21(CONSTANTS.SPACE_7);
         setD51uTestDiag22(CONSTANTS.SPACE_7);
         setD51uTestDiag23(CONSTANTS.SPACE_7);
         setD51uTestDiag24(CONSTANTS.SPACE_7);
         setD51uTestDiag25(CONSTANTS.SPACE_7);
   }

		public static int getD51uTestDiagAreaFieldLength() {
			return D_51U_TEST_DIAG_AREA_LENGTH;
		}

}
  
