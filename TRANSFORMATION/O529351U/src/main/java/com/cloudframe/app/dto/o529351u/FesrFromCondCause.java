package com.cloudframe.app.dto.o529351u;

/**
*  The class FesrFromCondCause is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FesrFromCondCause extends FesrFromCondCauseSerialized { 
   

						private char[] fesrFromCauseCd = Field.fillLowValue(1);
	
	/**
	* Constructor for FesrFromCondCause
	**/
    public FesrFromCondCause() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for FesrFromCondCause. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FesrFromCondCause(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of fesrFromCauseCd
	 *	@return fesrFromCauseCd
	 */
   public char[] getFesrFromCauseCd() throws CFException{
     if (isFesrFromCauseCdModified()) { 
        fesrFromCauseCd = refreshFesrFromCauseCd();
     }
   		return fesrFromCauseCd;
   }

  
	/**
	*  set variable fesrFromCauseCd
	*  Corresponding COBOL Variable is FESR-FROM-CAUSE-CD
	*  @param value
	**/
   public void setFesrFromCauseCd(char[] value) {
      fesrFromCauseCd = checkFesrFromCauseCdConstraints(value);
      serializeFesrFromCauseCd(fesrFromCauseCd);
   } 

     /**
	 * 	Update FesrFromCauseCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFesrFromCauseCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFesrFromCauseCd,fesrFromCauseCd.length);
   	
   }
   
   public void setFesrFromCauseCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFesrFromCauseCd,fesrFromCauseCd.length);
   	
   }
   
     /**
	 * 	Update FesrFromCauseCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFesrFromCauseCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFesrFromCauseCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FesrFromCauseCd with another Field
	 *	@param value
	 */
   public void setFesrFromCauseCd(Field source) {
       replace(source,0,source.length(),beginFesrFromCauseCd,FESR_FROM_CAUSE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update FesrFromCauseCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFesrFromCauseCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFesrFromCauseCd,FESR_FROM_CAUSE_CD_LEN);
   	
   }
   
     /**
	 * 	Update FesrFromCauseCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFesrFromCauseCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFesrFromCauseCd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getFesrFromCondCauseFieldLength() {
			return FESR_FROM_COND_CAUSE_LENGTH;
		}

}
  
