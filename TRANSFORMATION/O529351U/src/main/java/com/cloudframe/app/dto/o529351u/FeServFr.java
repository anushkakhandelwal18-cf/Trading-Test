package com.cloudframe.app.dto.o529351u;

/**
*  The class FeServFr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FeServFr extends FeServFrSerialized { 
   

						private char[] feSvc15Fr = new char[5];

						private char[] feSvc6Fr = Field.fillLowValue(1);
	
	/**
	* Constructor for FeServFr
	**/
    public FeServFr() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for FeServFr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FeServFr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setFeSvc15Fr(fillSpace(5));
    } 

	/**
	 *	Returns the value of feSvc15Fr
	 *	@return feSvc15Fr
	 */
   public char[] getFeSvc15Fr() throws CFException{
     if (isFeSvc15FrModified()) { 
        feSvc15Fr = refreshFeSvc15Fr();
     }
   		return feSvc15Fr;
   }

  
	/**
	*  set variable feSvc15Fr
	*  Corresponding COBOL Variable is FE-SVC-1-5-FR
	*  @param value
	**/
   public void setFeSvc15Fr(char[] value) {
      feSvc15Fr = checkFeSvc15FrConstraints(value);
      serializeFeSvc15Fr(feSvc15Fr);
   } 

     /**
	 * 	Update FeSvc15Fr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFeSvc15Fr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFeSvc15Fr,feSvc15Fr.length);
   	
   }
   
   public void setFeSvc15Fr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFeSvc15Fr,feSvc15Fr.length);
   	
   }
   
     /**
	 * 	Update FeSvc15Fr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFeSvc15Fr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFeSvc15Fr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FeSvc15Fr with another Field
	 *	@param value
	 */
   public void setFeSvc15Fr(Field source) {
       replace(source,0,source.length(),beginFeSvc15Fr,FE_SVC_15_FR_LEN);
   	
   }  
   
     /**
	 * 	Update FeSvc15Fr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFeSvc15Fr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFeSvc15Fr,FE_SVC_15_FR_LEN);
   	
   }
   
     /**
	 * 	Update FeSvc15Fr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFeSvc15Fr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFeSvc15Fr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of feSvc6Fr
	 *	@return feSvc6Fr
	 */
   public char[] getFeSvc6Fr() throws CFException{
     if (isFeSvc6FrModified()) { 
        feSvc6Fr = refreshFeSvc6Fr();
     }
   		return feSvc6Fr;
   }

  
	/**
	*  set variable feSvc6Fr
	*  Corresponding COBOL Variable is FE-SVC-6-FR
	*  @param value
	**/
   public void setFeSvc6Fr(char[] value) {
      feSvc6Fr = checkFeSvc6FrConstraints(value);
      serializeFeSvc6Fr(feSvc6Fr);
   } 

     /**
	 * 	Update FeSvc6Fr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFeSvc6Fr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFeSvc6Fr,feSvc6Fr.length);
   	
   }
   
   public void setFeSvc6Fr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFeSvc6Fr,feSvc6Fr.length);
   	
   }
   
     /**
	 * 	Update FeSvc6Fr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFeSvc6Fr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFeSvc6Fr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FeSvc6Fr with another Field
	 *	@param value
	 */
   public void setFeSvc6Fr(Field source) {
       replace(source,0,source.length(),beginFeSvc6Fr,FE_SVC_6_FR_LEN);
   	
   }  
   
     /**
	 * 	Update FeSvc6Fr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFeSvc6Fr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFeSvc6Fr,FE_SVC_6_FR_LEN);
   	
   }
   
     /**
	 * 	Update FeSvc6Fr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFeSvc6Fr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFeSvc6Fr+targetIndex,targetLen);
    
   }

	
	
	

		public static int getFeServFrFieldLength() {
			return FE_SERV_FR_LENGTH;
		}

}
  
