package com.cloudframe.app.dto.o529351u;

/**
*  The class ServToAlphaff is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ServToAlphaff extends ServToAlphaffSerialized { 
   

						private char[] feSvc1afFr = Field.fillLowValue(1);

						private char[] feSvc25afFr = Field.fillLowValue(4);
	
	/**
	* Constructor for ServToAlphaff
	**/
    public ServToAlphaff() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ServToAlphaff. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ServToAlphaff(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of feSvc1afFr
	 *	@return feSvc1afFr
	 */
   public char[] getFeSvc1afFr() throws CFException{
     if (isFeSvc1afFrModified()) { 
        feSvc1afFr = refreshFeSvc1afFr();
     }
   		return feSvc1afFr;
   }

  
	/**
	*  set variable feSvc1afFr
	*  Corresponding COBOL Variable is FE-SVC-1AF-FR
	*  @param value
	**/
   public void setFeSvc1afFr(char[] value) {
      feSvc1afFr = checkFeSvc1afFrConstraints(value);
      serializeFeSvc1afFr(feSvc1afFr);
   } 

     /**
	 * 	Update FeSvc1afFr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFeSvc1afFr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFeSvc1afFr,feSvc1afFr.length);
   	
   }
   
   public void setFeSvc1afFr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFeSvc1afFr,feSvc1afFr.length);
   	
   }
   
     /**
	 * 	Update FeSvc1afFr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFeSvc1afFr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFeSvc1afFr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FeSvc1afFr with another Field
	 *	@param value
	 */
   public void setFeSvc1afFr(Field source) {
       replace(source,0,source.length(),beginFeSvc1afFr,FE_SVC_1AF_FR_LEN);
   	
   }  
   
     /**
	 * 	Update FeSvc1afFr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFeSvc1afFr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFeSvc1afFr,FE_SVC_1AF_FR_LEN);
   	
   }
   
     /**
	 * 	Update FeSvc1afFr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFeSvc1afFr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFeSvc1afFr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of feSvc25afFr
	 *	@return feSvc25afFr
	 */
   public char[] getFeSvc25afFr() throws CFException{
     if (isFeSvc25afFrModified()) { 
        feSvc25afFr = refreshFeSvc25afFr();
     }
   		return feSvc25afFr;
   }

  
	/**
	*  set variable feSvc25afFr
	*  Corresponding COBOL Variable is FE-SVC-2-5AF-FR
	*  @param value
	**/
   public void setFeSvc25afFr(char[] value) {
      feSvc25afFr = checkFeSvc25afFrConstraints(value);
      serializeFeSvc25afFr(feSvc25afFr);
   } 

     /**
	 * 	Update FeSvc25afFr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFeSvc25afFr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFeSvc25afFr,feSvc25afFr.length);
   	
   }
   
   public void setFeSvc25afFr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFeSvc25afFr,feSvc25afFr.length);
   	
   }
   
     /**
	 * 	Update FeSvc25afFr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFeSvc25afFr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFeSvc25afFr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FeSvc25afFr with another Field
	 *	@param value
	 */
   public void setFeSvc25afFr(Field source) {
       replace(source,0,source.length(),beginFeSvc25afFr,FE_SVC_25AF_FR_LEN);
   	
   }  
   
     /**
	 * 	Update FeSvc25afFr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFeSvc25afFr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFeSvc25afFr,FE_SVC_25AF_FR_LEN);
   	
   }
   
     /**
	 * 	Update FeSvc25afFr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFeSvc25afFr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFeSvc25afFr+targetIndex,targetLen);
    
   }

	
	
	

		public static int getServToAlphaffFieldLength() {
			return SERV_TO_ALPHAFF_LENGTH;
		}

}
  
