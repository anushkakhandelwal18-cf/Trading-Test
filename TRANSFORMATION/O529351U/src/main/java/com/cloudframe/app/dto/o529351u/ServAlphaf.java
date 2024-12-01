package com.cloudframe.app.dto.o529351u;

/**
*  The class ServAlphaf is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ServAlphaf extends ServAlphafSerialized { 
   

						private char[] svc1af = Field.fillLowValue(1);

						private char[] svc25af = Field.fillLowValue(4);
	
	/**
	* Constructor for ServAlphaf
	**/
    public ServAlphaf() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ServAlphaf. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ServAlphaf(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of svc1af
	 *	@return svc1af
	 */
   public char[] getSvc1af() throws CFException{
     if (isSvc1afModified()) { 
        svc1af = refreshSvc1af();
     }
   		return svc1af;
   }

  
	/**
	*  set variable svc1af
	*  Corresponding COBOL Variable is SVC-1AF
	*  @param value
	**/
   public void setSvc1af(char[] value) {
      svc1af = checkSvc1afConstraints(value);
      serializeSvc1af(svc1af);
   } 

     /**
	 * 	Update Svc1af 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSvc1af(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSvc1af,svc1af.length);
   	
   }
   
   public void setSvc1af(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSvc1af,svc1af.length);
   	
   }
   
     /**
	 * 	Update Svc1af 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSvc1af(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSvc1af+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Svc1af with another Field
	 *	@param value
	 */
   public void setSvc1af(Field source) {
       replace(source,0,source.length(),beginSvc1af,SVC_1AF_LEN);
   	
   }  
   
     /**
	 * 	Update Svc1af 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSvc1af(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSvc1af,SVC_1AF_LEN);
   	
   }
   
     /**
	 * 	Update Svc1af 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSvc1af(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSvc1af+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of svc25af
	 *	@return svc25af
	 */
   public char[] getSvc25af() throws CFException{
     if (isSvc25afModified()) { 
        svc25af = refreshSvc25af();
     }
   		return svc25af;
   }

  
	/**
	*  set variable svc25af
	*  Corresponding COBOL Variable is SVC-2-5AF
	*  @param value
	**/
   public void setSvc25af(char[] value) {
      svc25af = checkSvc25afConstraints(value);
      serializeSvc25af(svc25af);
   } 

     /**
	 * 	Update Svc25af 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSvc25af(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSvc25af,svc25af.length);
   	
   }
   
   public void setSvc25af(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSvc25af,svc25af.length);
   	
   }
   
     /**
	 * 	Update Svc25af 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSvc25af(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSvc25af+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Svc25af with another Field
	 *	@param value
	 */
   public void setSvc25af(Field source) {
       replace(source,0,source.length(),beginSvc25af,SVC_25AF_LEN);
   	
   }  
   
     /**
	 * 	Update Svc25af 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSvc25af(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSvc25af,SVC_25AF_LEN);
   	
   }
   
     /**
	 * 	Update Svc25af 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSvc25af(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSvc25af+targetIndex,targetLen);
    
   }

	
	
	

		public static int getServAlphafFieldLength() {
			return SERV_ALPHAF_LENGTH;
		}

}
  
