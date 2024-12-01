package com.cloudframe.app.dto.o529351u;

/**
*  The class FesrFromCondPs is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FesrFromCondPs extends FesrFromCondPsSerialized { 
   

						private char[] fesrFromPs = Field.fillLowValue(3);
	
	/**
	* Constructor for FesrFromCondPs
	**/
    public FesrFromCondPs() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for FesrFromCondPs. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FesrFromCondPs(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of fesrFromPs
	 *	@return fesrFromPs
	 */
   public char[] getFesrFromPs() throws CFException{
     if (isFesrFromPsModified()) { 
        fesrFromPs = refreshFesrFromPs();
     }
   		return fesrFromPs;
   }

  
	/**
	*  set variable fesrFromPs
	*  Corresponding COBOL Variable is FESR-FROM-PS
	*  @param value
	**/
   public void setFesrFromPs(char[] value) {
      fesrFromPs = checkFesrFromPsConstraints(value);
      serializeFesrFromPs(fesrFromPs);
   } 

     /**
	 * 	Update FesrFromPs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFesrFromPs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFesrFromPs,fesrFromPs.length);
   	
   }
   
   public void setFesrFromPs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFesrFromPs,fesrFromPs.length);
   	
   }
   
     /**
	 * 	Update FesrFromPs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFesrFromPs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFesrFromPs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FesrFromPs with another Field
	 *	@param value
	 */
   public void setFesrFromPs(Field source) {
       replace(source,0,source.length(),beginFesrFromPs,FESR_FROM_PS_LEN);
   	
   }  
   
     /**
	 * 	Update FesrFromPs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFesrFromPs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFesrFromPs,FESR_FROM_PS_LEN);
   	
   }
   
     /**
	 * 	Update FesrFromPs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFesrFromPs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFesrFromPs+targetIndex,targetLen);
    
   }

	
	
	

		public static int getFesrFromCondPsFieldLength() {
			return FESR_FROM_COND_PS_LENGTH;
		}

}
  
