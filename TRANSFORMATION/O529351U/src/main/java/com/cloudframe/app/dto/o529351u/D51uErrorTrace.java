package com.cloudframe.app.dto.o529351u;

/**
*  The class D51uErrorTrace is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class D51uErrorTrace extends D51uErrorTraceSerialized { 
   

								private char[] d51uSqlOrRespCd = Field.fillLowValue(10);

						private char[] d51uDebugTracer = Field.fillLowValue(8);

						private char[] d51uParagraphNum = Field.fillLowValue(5);
	
	/**
	* Constructor for D51uErrorTrace
	**/
    public D51uErrorTrace() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for D51uErrorTrace. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uErrorTrace(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of d51uSqlOrRespCd
	 *	@return d51uSqlOrRespCd
	 */
   public char[] getD51uSqlOrRespCd() throws CFException{
     if (isD51uSqlOrRespCdModified()) { 
        d51uSqlOrRespCd = refreshD51uSqlOrRespCd();
     }
   		return d51uSqlOrRespCd;
   }

  
	/**
	*  set variable d51uSqlOrRespCd
	*  Corresponding COBOL Variable is D51U-SQL-OR-RESP-CD
	*  @param value
	**/
   public void setD51uSqlOrRespCd(char[] value) {
      d51uSqlOrRespCd = checkD51uSqlOrRespCdConstraints(value);
      serializeD51uSqlOrRespCd(d51uSqlOrRespCd);
   } 

     /**
	 * 	Update D51uSqlOrRespCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uSqlOrRespCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uSqlOrRespCd,d51uSqlOrRespCd.length);
   	
   }
   
   public void setD51uSqlOrRespCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uSqlOrRespCd,d51uSqlOrRespCd.length);
   	
   }
   
     /**
	 * 	Update D51uSqlOrRespCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uSqlOrRespCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uSqlOrRespCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uSqlOrRespCd with another Field
	 *	@param value
	 */
   public void setD51uSqlOrRespCd(Field source) {
       replace(source,0,source.length(),beginD51uSqlOrRespCd,D_51U_SQL_OR_RESP_CD_LEN);
   	
   }  
   
     /**
	 * 	Update D51uSqlOrRespCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uSqlOrRespCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uSqlOrRespCd,D_51U_SQL_OR_RESP_CD_LEN);
   	
   }
   
     /**
	 * 	Update D51uSqlOrRespCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uSqlOrRespCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uSqlOrRespCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uDebugTracer
	 *	@return d51uDebugTracer
	 */
   public char[] getD51uDebugTracer() throws CFException{
     if (isD51uDebugTracerModified()) { 
        d51uDebugTracer = refreshD51uDebugTracer();
     }
   		return d51uDebugTracer;
   }

  
	/**
	*  set variable d51uDebugTracer
	*  Corresponding COBOL Variable is D51U-DEBUG-TRACER
	*  @param value
	**/
   public void setD51uDebugTracer(char[] value) {
      d51uDebugTracer = checkD51uDebugTracerConstraints(value);
      serializeD51uDebugTracer(d51uDebugTracer);
   } 

     /**
	 * 	Update D51uDebugTracer 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uDebugTracer(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uDebugTracer,d51uDebugTracer.length);
   	
   }
   
   public void setD51uDebugTracer(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uDebugTracer,d51uDebugTracer.length);
   	
   }
   
     /**
	 * 	Update D51uDebugTracer 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uDebugTracer(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uDebugTracer+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uDebugTracer with another Field
	 *	@param value
	 */
   public void setD51uDebugTracer(Field source) {
       replace(source,0,source.length(),beginD51uDebugTracer,D_51U_DEBUG_TRACER_LEN);
   	
   }  
   
     /**
	 * 	Update D51uDebugTracer 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uDebugTracer(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uDebugTracer,D_51U_DEBUG_TRACER_LEN);
   	
   }
   
     /**
	 * 	Update D51uDebugTracer 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uDebugTracer(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uDebugTracer+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of d51uParagraphNum
	 *	@return d51uParagraphNum
	 */
   public char[] getD51uParagraphNum() throws CFException{
     if (isD51uParagraphNumModified()) { 
        d51uParagraphNum = refreshD51uParagraphNum();
     }
   		return d51uParagraphNum;
   }

  
	/**
	*  set variable d51uParagraphNum
	*  Corresponding COBOL Variable is D51U-PARAGRAPH-NUM
	*  @param value
	**/
   public void setD51uParagraphNum(char[] value) {
      d51uParagraphNum = checkD51uParagraphNumConstraints(value);
      serializeD51uParagraphNum(d51uParagraphNum);
   } 

     /**
	 * 	Update D51uParagraphNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uParagraphNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uParagraphNum,d51uParagraphNum.length);
   	
   }
   
   public void setD51uParagraphNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uParagraphNum,d51uParagraphNum.length);
   	
   }
   
     /**
	 * 	Update D51uParagraphNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uParagraphNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uParagraphNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uParagraphNum with another Field
	 *	@param value
	 */
   public void setD51uParagraphNum(Field source) {
       replace(source,0,source.length(),beginD51uParagraphNum,D_51U_PARAGRAPH_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update D51uParagraphNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uParagraphNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uParagraphNum,D_51U_PARAGRAPH_NUM_LEN);
   	
   }
   
     /**
	 * 	Update D51uParagraphNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uParagraphNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uParagraphNum+targetIndex,targetLen);
    
   }

	
	
	

		public static int getD51uErrorTraceFieldLength() {
			return D_51U_ERROR_TRACE_LENGTH;
		}

}
  
