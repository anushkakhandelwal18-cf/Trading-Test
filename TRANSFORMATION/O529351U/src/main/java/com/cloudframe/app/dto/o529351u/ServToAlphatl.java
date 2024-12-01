package com.cloudframe.app.dto.o529351u;

/**
*  The class ServToAlphatl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ServToAlphatl extends ServToAlphatlSerialized { 
   

						private char[] feSvc14alTo = Field.fillLowValue(4);

						private char[] feSvc5alTo = Field.fillLowValue(1);
	
	/**
	* Constructor for ServToAlphatl
	**/
    public ServToAlphatl() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ServToAlphatl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ServToAlphatl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of feSvc14alTo
	 *	@return feSvc14alTo
	 */
   public char[] getFeSvc14alTo() throws CFException{
     if (isFeSvc14alToModified()) { 
        feSvc14alTo = refreshFeSvc14alTo();
     }
   		return feSvc14alTo;
   }

  
	/**
	*  set variable feSvc14alTo
	*  Corresponding COBOL Variable is FE-SVC-1-4AL-TO
	*  @param value
	**/
   public void setFeSvc14alTo(char[] value) {
      feSvc14alTo = checkFeSvc14alToConstraints(value);
      serializeFeSvc14alTo(feSvc14alTo);
   } 

     /**
	 * 	Update FeSvc14alTo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFeSvc14alTo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFeSvc14alTo,feSvc14alTo.length);
   	
   }
   
   public void setFeSvc14alTo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFeSvc14alTo,feSvc14alTo.length);
   	
   }
   
     /**
	 * 	Update FeSvc14alTo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFeSvc14alTo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFeSvc14alTo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FeSvc14alTo with another Field
	 *	@param value
	 */
   public void setFeSvc14alTo(Field source) {
       replace(source,0,source.length(),beginFeSvc14alTo,FE_SVC_14AL_TO_LEN);
   	
   }  
   
     /**
	 * 	Update FeSvc14alTo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFeSvc14alTo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFeSvc14alTo,FE_SVC_14AL_TO_LEN);
   	
   }
   
     /**
	 * 	Update FeSvc14alTo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFeSvc14alTo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFeSvc14alTo+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of feSvc5alTo
	 *	@return feSvc5alTo
	 */
   public char[] getFeSvc5alTo() throws CFException{
     if (isFeSvc5alToModified()) { 
        feSvc5alTo = refreshFeSvc5alTo();
     }
   		return feSvc5alTo;
   }

  
	/**
	*  set variable feSvc5alTo
	*  Corresponding COBOL Variable is FE-SVC-5AL-TO
	*  @param value
	**/
   public void setFeSvc5alTo(char[] value) {
      feSvc5alTo = checkFeSvc5alToConstraints(value);
      serializeFeSvc5alTo(feSvc5alTo);
   } 

     /**
	 * 	Update FeSvc5alTo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFeSvc5alTo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFeSvc5alTo,feSvc5alTo.length);
   	
   }
   
   public void setFeSvc5alTo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFeSvc5alTo,feSvc5alTo.length);
   	
   }
   
     /**
	 * 	Update FeSvc5alTo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFeSvc5alTo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFeSvc5alTo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FeSvc5alTo with another Field
	 *	@param value
	 */
   public void setFeSvc5alTo(Field source) {
       replace(source,0,source.length(),beginFeSvc5alTo,FE_SVC_5AL_TO_LEN);
   	
   }  
   
     /**
	 * 	Update FeSvc5alTo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFeSvc5alTo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFeSvc5alTo,FE_SVC_5AL_TO_LEN);
   	
   }
   
     /**
	 * 	Update FeSvc5alTo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFeSvc5alTo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFeSvc5alTo+targetIndex,targetLen);
    
   }

	
	
	

		public static int getServToAlphatlFieldLength() {
			return SERV_TO_ALPHATL_LENGTH;
		}

}
  
