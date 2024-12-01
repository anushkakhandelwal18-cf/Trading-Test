package com.cloudframe.app.dto.d529351u;

/**
*  The class D51uOtherReq is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class D51uOtherReq extends D51uOtherReqSerialized { 
   

						private char[] d51uReqDosDate = Field.fillLowValue(8);
	
	/**
	* Constructor for D51uOtherReq
	**/
    public D51uOtherReq() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for D51uOtherReq. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uOtherReq(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of d51uReqDosDate
	 *	@return d51uReqDosDate
	 */
   public char[] getD51uReqDosDate() throws CFException{
     if (isD51uReqDosDateModified()) { 
        d51uReqDosDate = refreshD51uReqDosDate();
     }
   		return d51uReqDosDate;
   }

  
	/**
	*  set variable d51uReqDosDate
	*  Corresponding COBOL Variable is D51U-REQ-DOS-DATE
	*  @param value
	**/
   public void setD51uReqDosDate(char[] value) {
      d51uReqDosDate = checkD51uReqDosDateConstraints(value);
      serializeD51uReqDosDate(d51uReqDosDate);
   } 

     /**
	 * 	Update D51uReqDosDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setD51uReqDosDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginD51uReqDosDate,d51uReqDosDate.length);
   	
   }
   
   public void setD51uReqDosDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginD51uReqDosDate,d51uReqDosDate.length);
   	
   }
   
     /**
	 * 	Update D51uReqDosDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setD51uReqDosDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uReqDosDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update D51uReqDosDate with another Field
	 *	@param value
	 */
   public void setD51uReqDosDate(Field source) {
       replace(source,0,source.length(),beginD51uReqDosDate,D_51U_REQ_DOS_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update D51uReqDosDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setD51uReqDosDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginD51uReqDosDate,D_51U_REQ_DOS_DATE_LEN);
   	
   }
   
     /**
	 * 	Update D51uReqDosDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setD51uReqDosDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginD51uReqDosDate+targetIndex,targetLen);
    
   }

	
	
	

		public static int getD51uOtherReqFieldLength() {
			return D_51U_OTHER_REQ_LENGTH;
		}

}
  
