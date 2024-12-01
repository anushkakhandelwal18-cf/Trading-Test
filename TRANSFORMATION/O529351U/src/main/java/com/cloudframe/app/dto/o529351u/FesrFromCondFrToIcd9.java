package com.cloudframe.app.dto.o529351u;

/**
*  The class FesrFromCondFrToIcd9 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FesrFromCondFrToIcd9 extends FesrFromCondFrToIcd9Serialized { 
   

						private char[] fesrFromFrIcd9 = Field.fillLowValue(5);

						private char[] fesrFromToIcd9 = Field.fillLowValue(5);
	
	/**
	* Constructor for FesrFromCondFrToIcd9
	**/
    public FesrFromCondFrToIcd9() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for FesrFromCondFrToIcd9. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FesrFromCondFrToIcd9(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of fesrFromFrIcd9
	 *	@return fesrFromFrIcd9
	 */
   public char[] getFesrFromFrIcd9() throws CFException{
     if (isFesrFromFrIcd9Modified()) { 
        fesrFromFrIcd9 = refreshFesrFromFrIcd9();
     }
   		return fesrFromFrIcd9;
   }

  
	/**
	*  set variable fesrFromFrIcd9
	*  Corresponding COBOL Variable is FESR-FROM-FR-ICD9
	*  @param value
	**/
   public void setFesrFromFrIcd9(char[] value) {
      fesrFromFrIcd9 = checkFesrFromFrIcd9Constraints(value);
      serializeFesrFromFrIcd9(fesrFromFrIcd9);
   } 

     /**
	 * 	Update FesrFromFrIcd9 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFesrFromFrIcd9(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFesrFromFrIcd9,fesrFromFrIcd9.length);
   	
   }
   
   public void setFesrFromFrIcd9(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFesrFromFrIcd9,fesrFromFrIcd9.length);
   	
   }
   
     /**
	 * 	Update FesrFromFrIcd9 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFesrFromFrIcd9(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFesrFromFrIcd9+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FesrFromFrIcd9 with another Field
	 *	@param value
	 */
   public void setFesrFromFrIcd9(Field source) {
       replace(source,0,source.length(),beginFesrFromFrIcd9,FESR_FROM_FR_ICD_9_LEN);
   	
   }  
   
     /**
	 * 	Update FesrFromFrIcd9 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFesrFromFrIcd9(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFesrFromFrIcd9,FESR_FROM_FR_ICD_9_LEN);
   	
   }
   
     /**
	 * 	Update FesrFromFrIcd9 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFesrFromFrIcd9(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFesrFromFrIcd9+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fesrFromToIcd9
	 *	@return fesrFromToIcd9
	 */
   public char[] getFesrFromToIcd9() throws CFException{
     if (isFesrFromToIcd9Modified()) { 
        fesrFromToIcd9 = refreshFesrFromToIcd9();
     }
   		return fesrFromToIcd9;
   }

  
	/**
	*  set variable fesrFromToIcd9
	*  Corresponding COBOL Variable is FESR-FROM-TO-ICD9
	*  @param value
	**/
   public void setFesrFromToIcd9(char[] value) {
      fesrFromToIcd9 = checkFesrFromToIcd9Constraints(value);
      serializeFesrFromToIcd9(fesrFromToIcd9);
   } 

     /**
	 * 	Update FesrFromToIcd9 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFesrFromToIcd9(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFesrFromToIcd9,fesrFromToIcd9.length);
   	
   }
   
   public void setFesrFromToIcd9(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFesrFromToIcd9,fesrFromToIcd9.length);
   	
   }
   
     /**
	 * 	Update FesrFromToIcd9 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFesrFromToIcd9(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFesrFromToIcd9+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FesrFromToIcd9 with another Field
	 *	@param value
	 */
   public void setFesrFromToIcd9(Field source) {
       replace(source,0,source.length(),beginFesrFromToIcd9,FESR_FROM_TO_ICD_9_LEN);
   	
   }  
   
     /**
	 * 	Update FesrFromToIcd9 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFesrFromToIcd9(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFesrFromToIcd9,FESR_FROM_TO_ICD_9_LEN);
   	
   }
   
     /**
	 * 	Update FesrFromToIcd9 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFesrFromToIcd9(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFesrFromToIcd9+targetIndex,targetLen);
    
   }

	
	
	

		public static int getFesrFromCondFrToIcd9FieldLength() {
			return FESR_FROM_COND_FR_TO_ICD_9_LENGTH;
		}

}
  
