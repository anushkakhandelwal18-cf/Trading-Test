package com.cloudframe.app.dto.o529351u;

/**
*  The class M51uFlags is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class M51uFlags extends M51uFlagsSerialized { 
   

						private char[] m51uFunctionFlag = Field.fillLowValue(2);

						private char[] m51uIllogicalCondSw = Field.fillLowValue(1);
	
	/**
	* Constructor for M51uFlags
	**/
    public M51uFlags() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for M51uFlags. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public M51uFlags(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of m51uFunctionFlag
	 *	@return m51uFunctionFlag
	 */
   public char[] getM51uFunctionFlag() throws CFException{
     if (isM51uFunctionFlagModified()) { 
        m51uFunctionFlag = refreshM51uFunctionFlag();
     }
   		return m51uFunctionFlag;
   }

  
	/**
	*  set variable m51uFunctionFlag
	*  Corresponding COBOL Variable is M51U-FUNCTION-FLAG
	*  @param value
	**/
   public void setM51uFunctionFlag(char[] value) {
      m51uFunctionFlag = checkM51uFunctionFlagConstraints(value);
      serializeM51uFunctionFlag(m51uFunctionFlag);
   } 

     /**
	 * 	Update M51uFunctionFlag 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setM51uFunctionFlag(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginM51uFunctionFlag,m51uFunctionFlag.length);
   	
   }
   
   public void setM51uFunctionFlag(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginM51uFunctionFlag,m51uFunctionFlag.length);
   	
   }
   
     /**
	 * 	Update M51uFunctionFlag 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setM51uFunctionFlag(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginM51uFunctionFlag+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update M51uFunctionFlag with another Field
	 *	@param value
	 */
   public void setM51uFunctionFlag(Field source) {
       replace(source,0,source.length(),beginM51uFunctionFlag,M_51U_FUNCTION_FLAG_LEN);
   	
   }  
   
     /**
	 * 	Update M51uFunctionFlag 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setM51uFunctionFlag(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginM51uFunctionFlag,M_51U_FUNCTION_FLAG_LEN);
   	
   }
   
     /**
	 * 	Update M51uFunctionFlag 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setM51uFunctionFlag(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginM51uFunctionFlag+targetIndex,targetLen);
    
   }
	char[] m51uBatchProcessing88Value = "BP".toCharArray();
	/**
	 *	Test condition "BP" for isM51uBatchProcessing()
	 *	@return  Returns true if isM51uBatchProcessing() is "BP"
	 */
   public boolean isM51uBatchProcessing() throws CFException {
      return (  compareChars( getM51uFunctionFlag() , m51uBatchProcessing88Value)  == 0  );
   }


	/**
	*  set values "BP"
	*/
   	public void setM51uBatchProcessingTrue() {  			
    	setM51uFunctionFlag( m51uBatchProcessing88Value);
   	}
	char[] m51uRtaProcessing88Value = "RP".toCharArray();
	/**
	 *	Test condition "RP" for isM51uRtaProcessing()
	 *	@return  Returns true if isM51uRtaProcessing() is "RP"
	 */
   public boolean isM51uRtaProcessing() throws CFException {
      return (  compareChars( getM51uFunctionFlag() , m51uRtaProcessing88Value)  == 0  );
   }


	/**
	*  set values "RP"
	*/
   	public void setM51uRtaProcessingTrue() {  			
    	setM51uFunctionFlag( m51uRtaProcessing88Value);
   	}
	/**
	 *	Returns the value of m51uIllogicalCondSw
	 *	@return m51uIllogicalCondSw
	 */
   public char[] getM51uIllogicalCondSw() throws CFException{
     if (isM51uIllogicalCondSwModified()) { 
        m51uIllogicalCondSw = refreshM51uIllogicalCondSw();
     }
   		return m51uIllogicalCondSw;
   }

  
	/**
	*  set variable m51uIllogicalCondSw
	*  Corresponding COBOL Variable is M51U-ILLOGICAL-COND-SW
	*  @param value
	**/
   public void setM51uIllogicalCondSw(char[] value) {
      m51uIllogicalCondSw = checkM51uIllogicalCondSwConstraints(value);
      serializeM51uIllogicalCondSw(m51uIllogicalCondSw);
   } 

     /**
	 * 	Update M51uIllogicalCondSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setM51uIllogicalCondSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginM51uIllogicalCondSw,m51uIllogicalCondSw.length);
   	
   }
   
   public void setM51uIllogicalCondSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginM51uIllogicalCondSw,m51uIllogicalCondSw.length);
   	
   }
   
     /**
	 * 	Update M51uIllogicalCondSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setM51uIllogicalCondSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginM51uIllogicalCondSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update M51uIllogicalCondSw with another Field
	 *	@param value
	 */
   public void setM51uIllogicalCondSw(Field source) {
       replace(source,0,source.length(),beginM51uIllogicalCondSw,M_51U_ILLOGICAL_COND_SW_LEN);
   	
   }  
   
     /**
	 * 	Update M51uIllogicalCondSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setM51uIllogicalCondSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginM51uIllogicalCondSw,M_51U_ILLOGICAL_COND_SW_LEN);
   	
   }
   
     /**
	 * 	Update M51uIllogicalCondSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setM51uIllogicalCondSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginM51uIllogicalCondSw+targetIndex,targetLen);
    
   }
	char[] m51uIllogicalCond88Value = "I".toCharArray();
	/**
	 *	Test condition "I" for isM51uIllogicalCond()
	 *	@return  Returns true if isM51uIllogicalCond() is "I"
	 */
   public boolean isM51uIllogicalCond() throws CFException {
      return (  compareChars( getM51uIllogicalCondSw() , m51uIllogicalCond88Value)  == 0  );
   }


	/**
	*  set values "I"
	*/
   	public void setM51uIllogicalCondTrue() {  			
    	setM51uIllogicalCondSw( m51uIllogicalCond88Value);
   	}

	
	
	

		public static int getM51uFlagsFieldLength() {
			return M_51U_FLAGS_LENGTH;
		}

}
  
