package com.cloudframe.app.dto.o529351u;

/**
*  The class ServToAlphafl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ServToAlphafl extends ServToAlphaflSerialized { 
   

						private char[] feSvc14alFr = Field.fillLowValue(4);

						private char[] feSvc5alFr = Field.fillLowValue(1);
	
	/**
	* Constructor for ServToAlphafl
	**/
    public ServToAlphafl() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ServToAlphafl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ServToAlphafl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of feSvc14alFr
	 *	@return feSvc14alFr
	 */
   public char[] getFeSvc14alFr() throws CFException{
     if (isFeSvc14alFrModified()) { 
        feSvc14alFr = refreshFeSvc14alFr();
     }
   		return feSvc14alFr;
   }

  
	/**
	*  set variable feSvc14alFr
	*  Corresponding COBOL Variable is FE-SVC-1-4AL-FR
	*  @param value
	**/
   public void setFeSvc14alFr(char[] value) {
      feSvc14alFr = checkFeSvc14alFrConstraints(value);
      serializeFeSvc14alFr(feSvc14alFr);
   } 

     /**
	 * 	Update FeSvc14alFr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFeSvc14alFr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFeSvc14alFr,feSvc14alFr.length);
   	
   }
   
   public void setFeSvc14alFr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFeSvc14alFr,feSvc14alFr.length);
   	
   }
   
     /**
	 * 	Update FeSvc14alFr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFeSvc14alFr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFeSvc14alFr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FeSvc14alFr with another Field
	 *	@param value
	 */
   public void setFeSvc14alFr(Field source) {
       replace(source,0,source.length(),beginFeSvc14alFr,FE_SVC_14AL_FR_LEN);
   	
   }  
   
     /**
	 * 	Update FeSvc14alFr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFeSvc14alFr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFeSvc14alFr,FE_SVC_14AL_FR_LEN);
   	
   }
   
     /**
	 * 	Update FeSvc14alFr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFeSvc14alFr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFeSvc14alFr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of feSvc5alFr
	 *	@return feSvc5alFr
	 */
   public char[] getFeSvc5alFr() throws CFException{
     if (isFeSvc5alFrModified()) { 
        feSvc5alFr = refreshFeSvc5alFr();
     }
   		return feSvc5alFr;
   }

  
	/**
	*  set variable feSvc5alFr
	*  Corresponding COBOL Variable is FE-SVC-5AL-FR
	*  @param value
	**/
   public void setFeSvc5alFr(char[] value) {
      feSvc5alFr = checkFeSvc5alFrConstraints(value);
      serializeFeSvc5alFr(feSvc5alFr);
   } 

     /**
	 * 	Update FeSvc5alFr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFeSvc5alFr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFeSvc5alFr,feSvc5alFr.length);
   	
   }
   
   public void setFeSvc5alFr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFeSvc5alFr,feSvc5alFr.length);
   	
   }
   
     /**
	 * 	Update FeSvc5alFr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFeSvc5alFr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFeSvc5alFr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FeSvc5alFr with another Field
	 *	@param value
	 */
   public void setFeSvc5alFr(Field source) {
       replace(source,0,source.length(),beginFeSvc5alFr,FE_SVC_5AL_FR_LEN);
   	
   }  
   
     /**
	 * 	Update FeSvc5alFr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFeSvc5alFr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFeSvc5alFr,FE_SVC_5AL_FR_LEN);
   	
   }
   
     /**
	 * 	Update FeSvc5alFr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFeSvc5alFr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFeSvc5alFr+targetIndex,targetLen);
    
   }

	
	
	

		public static int getServToAlphaflFieldLength() {
			return SERV_TO_ALPHAFL_LENGTH;
		}

}
  
