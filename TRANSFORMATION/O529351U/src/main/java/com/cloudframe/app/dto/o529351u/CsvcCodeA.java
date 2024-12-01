package com.cloudframe.app.dto.o529351u;

/**
*  The class CsvcCodeA is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CsvcCodeA extends CsvcCodeASerialized { 
   

						private char[] csvcCode15A = Field.fillLowValue(5);

						private char[] csvcCode6A = Field.fillLowValue(1);
	
	/**
	* Constructor for CsvcCodeA
	**/
    public CsvcCodeA() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CsvcCodeA. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CsvcCodeA(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of csvcCode15A
	 *	@return csvcCode15A
	 */
   public char[] getCsvcCode15A() throws CFException{
     if (isCsvcCode15AModified()) { 
        csvcCode15A = refreshCsvcCode15A();
     }
   		return csvcCode15A;
   }

  
	/**
	*  set variable csvcCode15A
	*  Corresponding COBOL Variable is CSVC-CODE-1-5-A
	*  @param value
	**/
   public void setCsvcCode15A(char[] value) {
      csvcCode15A = checkCsvcCode15AConstraints(value);
      serializeCsvcCode15A(csvcCode15A);
   } 

     /**
	 * 	Update CsvcCode15A 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCsvcCode15A(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCsvcCode15A,csvcCode15A.length);
   	
   }
   
   public void setCsvcCode15A(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCsvcCode15A,csvcCode15A.length);
   	
   }
   
     /**
	 * 	Update CsvcCode15A 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCsvcCode15A(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCsvcCode15A+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CsvcCode15A with another Field
	 *	@param value
	 */
   public void setCsvcCode15A(Field source) {
       replace(source,0,source.length(),beginCsvcCode15A,CSVC_CODE_15_A_LEN);
   	
   }  
   
     /**
	 * 	Update CsvcCode15A 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCsvcCode15A(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCsvcCode15A,CSVC_CODE_15_A_LEN);
   	
   }
   
     /**
	 * 	Update CsvcCode15A 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCsvcCode15A(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCsvcCode15A+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of csvcCode6A
	 *	@return csvcCode6A
	 */
   public char[] getCsvcCode6A() throws CFException{
     if (isCsvcCode6AModified()) { 
        csvcCode6A = refreshCsvcCode6A();
     }
   		return csvcCode6A;
   }

  
	/**
	*  set variable csvcCode6A
	*  Corresponding COBOL Variable is CSVC-CODE-6-A
	*  @param value
	**/
   public void setCsvcCode6A(char[] value) {
      csvcCode6A = checkCsvcCode6AConstraints(value);
      serializeCsvcCode6A(csvcCode6A);
   } 

     /**
	 * 	Update CsvcCode6A 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCsvcCode6A(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCsvcCode6A,csvcCode6A.length);
   	
   }
   
   public void setCsvcCode6A(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCsvcCode6A,csvcCode6A.length);
   	
   }
   
     /**
	 * 	Update CsvcCode6A 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCsvcCode6A(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCsvcCode6A+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CsvcCode6A with another Field
	 *	@param value
	 */
   public void setCsvcCode6A(Field source) {
       replace(source,0,source.length(),beginCsvcCode6A,CSVC_CODE_6_A_LEN);
   	
   }  
   
     /**
	 * 	Update CsvcCode6A 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCsvcCode6A(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCsvcCode6A,CSVC_CODE_6_A_LEN);
   	
   }
   
     /**
	 * 	Update CsvcCode6A 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCsvcCode6A(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCsvcCode6A+targetIndex,targetLen);
    
   }

	
	
	

		public static int getCsvcCodeAFieldLength() {
			return CSVC_CODE_A_LENGTH;
		}

}
  
