package com.cloudframe.app.dto.o529351u;

/**
*  The class ServToAlphatf is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ServToAlphatf extends ServToAlphatfSerialized { 
   

						private char[] feSvc1afTo = Field.fillLowValue(1);

						private char[] feSvc25afTo = Field.fillLowValue(4);
	
	/**
	* Constructor for ServToAlphatf
	**/
    public ServToAlphatf() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ServToAlphatf. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ServToAlphatf(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of feSvc1afTo
	 *	@return feSvc1afTo
	 */
   public char[] getFeSvc1afTo() throws CFException{
     if (isFeSvc1afToModified()) { 
        feSvc1afTo = refreshFeSvc1afTo();
     }
   		return feSvc1afTo;
   }

  
	/**
	*  set variable feSvc1afTo
	*  Corresponding COBOL Variable is FE-SVC-1AF-TO
	*  @param value
	**/
   public void setFeSvc1afTo(char[] value) {
      feSvc1afTo = checkFeSvc1afToConstraints(value);
      serializeFeSvc1afTo(feSvc1afTo);
   } 

     /**
	 * 	Update FeSvc1afTo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFeSvc1afTo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFeSvc1afTo,feSvc1afTo.length);
   	
   }
   
   public void setFeSvc1afTo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFeSvc1afTo,feSvc1afTo.length);
   	
   }
   
     /**
	 * 	Update FeSvc1afTo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFeSvc1afTo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFeSvc1afTo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FeSvc1afTo with another Field
	 *	@param value
	 */
   public void setFeSvc1afTo(Field source) {
       replace(source,0,source.length(),beginFeSvc1afTo,FE_SVC_1AF_TO_LEN);
   	
   }  
   
     /**
	 * 	Update FeSvc1afTo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFeSvc1afTo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFeSvc1afTo,FE_SVC_1AF_TO_LEN);
   	
   }
   
     /**
	 * 	Update FeSvc1afTo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFeSvc1afTo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFeSvc1afTo+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of feSvc25afTo
	 *	@return feSvc25afTo
	 */
   public char[] getFeSvc25afTo() throws CFException{
     if (isFeSvc25afToModified()) { 
        feSvc25afTo = refreshFeSvc25afTo();
     }
   		return feSvc25afTo;
   }

  
	/**
	*  set variable feSvc25afTo
	*  Corresponding COBOL Variable is FE-SVC-2-5AF-TO
	*  @param value
	**/
   public void setFeSvc25afTo(char[] value) {
      feSvc25afTo = checkFeSvc25afToConstraints(value);
      serializeFeSvc25afTo(feSvc25afTo);
   } 

     /**
	 * 	Update FeSvc25afTo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFeSvc25afTo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFeSvc25afTo,feSvc25afTo.length);
   	
   }
   
   public void setFeSvc25afTo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFeSvc25afTo,feSvc25afTo.length);
   	
   }
   
     /**
	 * 	Update FeSvc25afTo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFeSvc25afTo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFeSvc25afTo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FeSvc25afTo with another Field
	 *	@param value
	 */
   public void setFeSvc25afTo(Field source) {
       replace(source,0,source.length(),beginFeSvc25afTo,FE_SVC_25AF_TO_LEN);
   	
   }  
   
     /**
	 * 	Update FeSvc25afTo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFeSvc25afTo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFeSvc25afTo,FE_SVC_25AF_TO_LEN);
   	
   }
   
     /**
	 * 	Update FeSvc25afTo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFeSvc25afTo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFeSvc25afTo+targetIndex,targetLen);
    
   }

	
	
	

		public static int getServToAlphatfFieldLength() {
			return SERV_TO_ALPHATF_LENGTH;
		}

}
  
