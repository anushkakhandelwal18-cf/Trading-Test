package com.cloudframe.app.dto.d529351u;

/**
*  The class D51uRequestFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:50. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class D51uRequestFields extends D51uRequestFieldsSerialized { 
   

						private char[] d51uReqCallerType = Field.fillLowValue(1);

						private char[] d51uReqCallingProgram = Field.fillLowValue(8);

								private int d51uReqFuncCd;

						private char[] d51uReqType = Field.fillLowValue(1);
				private D51uKey d51uKey = new D51uKey();
				private D51uOtherReq d51uOtherReq = new D51uOtherReq();
				private D51uLstIcdKey d51uLstIcdKey = new D51uLstIcdKey();
				private D51uTestValues d51uTestValues = new D51uTestValues();
	
	/**
	* Constructor for D51uRequestFields
	**/
    public D51uRequestFields() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for D51uRequestFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uRequestFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			d51uKey.setParent(this,getStartOffset() + 12);
	       			d51uOtherReq.setParent(this,getStartOffset() + 30);
	       			d51uLstIcdKey.setParent(this,getStartOffset() + 38);
	       			d51uTestValues.setParent(this,getStartOffset() + 48);
    } 

	/**
	 *	Returns the value of d51uReqCallerType
	 *	@return d51uReqCallerType
	 */
   public char[] getD51uReqCallerType() throws CFException{
     if (isD51uReqCallerTypeModified()) { 
        d51uReqCallerType = refreshD51uReqCallerType();
     }
   		return d51uReqCallerType;
   }

  
	/**
	*  set variable d51uReqCallerType
	*  Corresponding COBOL Variable is D51U-REQ-CALLER-TYPE
	*  @param value
	**/
   public void setD51uReqCallerType(char[] value) {
      d51uReqCallerType = checkD51uReqCallerTypeConstraints(value);
      serializeD51uReqCallerType(d51uReqCallerType);
   } 

     /**
	 * 	Update D51uReqCallerType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uReqCallerType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uReqCallerType,d51uReqCallerType.length);
   	
   }
   
   public void setD51uReqCallerType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uReqCallerType,d51uReqCallerType.length);
   	
   }
   
     /**
	 * 	Update D51uReqCallerType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uReqCallerType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uReqCallerType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uReqCallerType with another Field
	 *	@param value
	 */
   public void setD51uReqCallerType(Field source) {
       replace(source,0,source.length(),beginD51uReqCallerType,D_51U_REQ_CALLER_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update D51uReqCallerType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uReqCallerType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uReqCallerType,D_51U_REQ_CALLER_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update D51uReqCallerType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uReqCallerType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uReqCallerType+targetIndex,targetLen);
    
   }
	char[] d51uReqCallerBatch88Value = "B".toCharArray();
	/**
	 *	Test condition "B" for isD51uReqCallerBatch()
	 *	@return  Returns true if isD51uReqCallerBatch() is "B"
	 */
   public boolean isD51uReqCallerBatch() throws CFException {
      return (  compareChars( getD51uReqCallerType() , d51uReqCallerBatch88Value)  == 0  );
   }


	/**
	*  set values "B"
	*/
   	public void setD51uReqCallerBatchTrue() {  			
    	setD51uReqCallerType( d51uReqCallerBatch88Value);
   	}
	char[] d51uReqCallerOnline88Value = "O".toCharArray();
	/**
	 *	Test condition "O" for isD51uReqCallerOnline()
	 *	@return  Returns true if isD51uReqCallerOnline() is "O"
	 */
   public boolean isD51uReqCallerOnline() throws CFException {
      return (  compareChars( getD51uReqCallerType() , d51uReqCallerOnline88Value)  == 0  );
   }


	/**
	*  set values "O"
	*/
   	public void setD51uReqCallerOnlineTrue() {  			
    	setD51uReqCallerType( d51uReqCallerOnline88Value);
   	}
	/**
	 *	Returns the value of d51uReqCallingProgram
	 *	@return d51uReqCallingProgram
	 */
   public char[] getD51uReqCallingProgram() throws CFException{
     if (isD51uReqCallingProgramModified()) { 
        d51uReqCallingProgram = refreshD51uReqCallingProgram();
     }
   		return d51uReqCallingProgram;
   }

  
	/**
	*  set variable d51uReqCallingProgram
	*  Corresponding COBOL Variable is D51U-REQ-CALLING-PROGRAM
	*  @param value
	**/
   public void setD51uReqCallingProgram(char[] value) {
      d51uReqCallingProgram = checkD51uReqCallingProgramConstraints(value);
      serializeD51uReqCallingProgram(d51uReqCallingProgram);
   } 

     /**
	 * 	Update D51uReqCallingProgram 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uReqCallingProgram(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uReqCallingProgram,d51uReqCallingProgram.length);
   	
   }
   
   public void setD51uReqCallingProgram(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uReqCallingProgram,d51uReqCallingProgram.length);
   	
   }
   
     /**
	 * 	Update D51uReqCallingProgram 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uReqCallingProgram(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uReqCallingProgram+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uReqCallingProgram with another Field
	 *	@param value
	 */
   public void setD51uReqCallingProgram(Field source) {
       replace(source,0,source.length(),beginD51uReqCallingProgram,D_51U_REQ_CALLING_PROGRAM_LEN);
   	
   }  
   
     /**
	 * 	Update D51uReqCallingProgram 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uReqCallingProgram(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uReqCallingProgram,D_51U_REQ_CALLING_PROGRAM_LEN);
   	
   }
   
     /**
	 * 	Update D51uReqCallingProgram 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uReqCallingProgram(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uReqCallingProgram+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uReqFuncCd
	 *	@return d51uReqFuncCd
	 */
	public int getD51uReqFuncCd() throws CFException {
       if (isD51uReqFuncCdModified()) { 
           d51uReqFuncCd = refreshD51uReqFuncCd();
        }
   		return d51uReqFuncCd;
	}
	

	
	   
	/**
	 * 	Update D51uReqFuncCd with the passed value
	 *  Corresponding COBOL Variable is D51U-REQ-FUNC-CD
	 *	@param number
	 */
	public void setD51uReqFuncCd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    d51uReqFuncCd = checkD51uReqFuncCdMaxLimit(number); 
		serializeD51uReqFuncCd(d51uReqFuncCd);
	}
	

	public void setD51uReqFuncCd(long number) {
	    number = checkD51uReqFuncCdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setD51uReqFuncCd((int)number);
	}
	
	/**
	 * 	Update D51uReqFuncCd with the passed value
	 *	@param value (String or char[])
	 */
	public void setD51uReqFuncCd(char[] value) throws CFException {
		 d51uReqFuncCd = serializeD51uReqFuncCd(value);
	}
	/**
	 * 	Update D51uReqFuncCd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setD51uReqFuncCdString(char[] value) throws CFException {
		 setD51uReqFuncCd(value);
	}
	
	/**
	 *	Test condition 1 for isD51uReqSelectPlan()
	 *	@return  Returns true if isD51uReqSelectPlan() is 1
	 */
   public boolean isD51uReqSelectPlan() throws CFException {
      return (  getD51uReqFuncCd()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setD51uReqSelectPlanTrue() {  			
    	setD51uReqFuncCd( 1);
   	}
	
	/**
	 *	Test condition 2 for isD51uReqSelectRule()
	 *	@return  Returns true if isD51uReqSelectRule() is 2
	 */
   public boolean isD51uReqSelectRule() throws CFException {
      return (  getD51uReqFuncCd()  ==  2  );
   }


	/**
	*  set values 2
	*/
   	public void setD51uReqSelectRuleTrue() {  			
    	setD51uReqFuncCd( 2);
   	}
	
	/**
	 *	Test condition 3 for isD51uReqIcdFetch()
	 *	@return  Returns true if isD51uReqIcdFetch() is 3
	 */
   public boolean isD51uReqIcdFetch() throws CFException {
      return (  getD51uReqFuncCd()  ==  3  );
   }


	/**
	*  set values 3
	*/
   	public void setD51uReqIcdFetchTrue() {  			
    	setD51uReqFuncCd( 3);
   	}
	/**
	 *	Returns the value of d51uReqType
	 *	@return d51uReqType
	 */
   public char[] getD51uReqType() throws CFException{
     if (isD51uReqTypeModified()) { 
        d51uReqType = refreshD51uReqType();
     }
   		return d51uReqType;
   }

  
	/**
	*  set variable d51uReqType
	*  Corresponding COBOL Variable is D51U-REQ-TYPE
	*  @param value
	**/
   public void setD51uReqType(char[] value) {
      d51uReqType = checkD51uReqTypeConstraints(value);
      serializeD51uReqType(d51uReqType);
   } 

     /**
	 * 	Update D51uReqType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uReqType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uReqType,d51uReqType.length);
   	
   }
   
   public void setD51uReqType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uReqType,d51uReqType.length);
   	
   }
   
     /**
	 * 	Update D51uReqType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uReqType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uReqType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uReqType with another Field
	 *	@param value
	 */
   public void setD51uReqType(Field source) {
       replace(source,0,source.length(),beginD51uReqType,D_51U_REQ_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update D51uReqType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uReqType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uReqType,D_51U_REQ_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update D51uReqType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uReqType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uReqType+targetIndex,targetLen);
    
   }
	char[] d51uReqView88Value = "V".toCharArray();
	/**
	 *	Test condition "V" for isD51uReqView()
	 *	@return  Returns true if isD51uReqView() is "V"
	 */
   public boolean isD51uReqView() throws CFException {
      return (  compareChars( getD51uReqType() , d51uReqView88Value)  == 0  );
   }


	/**
	*  set values "V"
	*/
   	public void setD51uReqViewTrue() {  			
    	setD51uReqType( d51uReqView88Value);
   	}
	/**
	 *	Returns the value of d51uKey
	 *	@return d51uKey
	 */   
	 public D51uKey getD51uKey() {
   	return d51uKey;
   }
   /**
	* 	Update D51uKey with the passed value
	*   Corresponding COBOL Variable is D51U-KEY
	*	@param value
	*/
   public void setD51uKey(char[] value) {
      d51uKey.setString(value); 
   }   
    
     /**
	 * 	Update D51uKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setD51uKey(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,d51uKey.begin,d51uKey.length());
   }
   
     /**
	 * 	Update D51uKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,d51uKey.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update D51uKey with another Field
	 *	@param value
	 */
   public void setD51uKey(Field source) {
   	replace(source,0,source.length(),d51uKey.begin,d51uKey.length());
   }  
   
     /**
	 * 	Update D51uKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setD51uKey(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,d51uKey.begin,d51uKey.length());
   }
   
     /**
	 * 	Update D51uKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,d51uKey.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of d51uOtherReq
	 *	@return d51uOtherReq
	 */   
	 public D51uOtherReq getD51uOtherReq() {
   	return d51uOtherReq;
   }
   /**
	* 	Update D51uOtherReq with the passed value
	*   Corresponding COBOL Variable is D51U-OTHER-REQ
	*	@param value
	*/
   public void setD51uOtherReq(char[] value) {
      d51uOtherReq.setString(value); 
   }   
    
     /**
	 * 	Update D51uOtherReq 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setD51uOtherReq(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,d51uOtherReq.begin,d51uOtherReq.length());
   }
   
     /**
	 * 	Update D51uOtherReq 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uOtherReq(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,d51uOtherReq.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update D51uOtherReq with another Field
	 *	@param value
	 */
   public void setD51uOtherReq(Field source) {
   	replace(source,0,source.length(),d51uOtherReq.begin,d51uOtherReq.length());
   }  
   
     /**
	 * 	Update D51uOtherReq 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setD51uOtherReq(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,d51uOtherReq.begin,d51uOtherReq.length());
   }
   
     /**
	 * 	Update D51uOtherReq 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uOtherReq(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,d51uOtherReq.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of d51uLstIcdKey
	 *	@return d51uLstIcdKey
	 */   
	 public D51uLstIcdKey getD51uLstIcdKey() {
   	return d51uLstIcdKey;
   }
   /**
	* 	Update D51uLstIcdKey with the passed value
	*   Corresponding COBOL Variable is D51U-LST-ICD-KEY
	*	@param value
	*/
   public void setD51uLstIcdKey(char[] value) {
      d51uLstIcdKey.setString(value); 
   }   
    
     /**
	 * 	Update D51uLstIcdKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setD51uLstIcdKey(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,d51uLstIcdKey.begin,d51uLstIcdKey.length());
   }
   
     /**
	 * 	Update D51uLstIcdKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uLstIcdKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,d51uLstIcdKey.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update D51uLstIcdKey with another Field
	 *	@param value
	 */
   public void setD51uLstIcdKey(Field source) {
   	replace(source,0,source.length(),d51uLstIcdKey.begin,d51uLstIcdKey.length());
   }  
   
     /**
	 * 	Update D51uLstIcdKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setD51uLstIcdKey(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,d51uLstIcdKey.begin,d51uLstIcdKey.length());
   }
   
     /**
	 * 	Update D51uLstIcdKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uLstIcdKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,d51uLstIcdKey.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of d51uTestValues
	 *	@return d51uTestValues
	 */   
	 public D51uTestValues getD51uTestValues() {
   	return d51uTestValues;
   }
   /**
	* 	Update D51uTestValues with the passed value
	*   Corresponding COBOL Variable is D51U-TEST-VALUES
	*	@param value
	*/
   public void setD51uTestValues(char[] value) {
      d51uTestValues.setString(value); 
   }   
    
     /**
	 * 	Update D51uTestValues 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setD51uTestValues(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,d51uTestValues.begin,d51uTestValues.length());
   }
   
     /**
	 * 	Update D51uTestValues 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestValues(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,d51uTestValues.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update D51uTestValues with another Field
	 *	@param value
	 */
   public void setD51uTestValues(Field source) {
   	replace(source,0,source.length(),d51uTestValues.begin,d51uTestValues.length());
   }  
   
     /**
	 * 	Update D51uTestValues 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setD51uTestValues(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,d51uTestValues.begin,d51uTestValues.length());
   }
   
     /**
	 * 	Update D51uTestValues 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uTestValues(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,d51uTestValues.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getD51uRequestFieldsFieldLength() {
			return D_51U_REQUEST_FIELDS_LENGTH;
		}

}
  
