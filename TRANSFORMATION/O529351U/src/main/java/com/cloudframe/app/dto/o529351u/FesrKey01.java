package com.cloudframe.app.dto.o529351u;

/**
*  The class FesrKey01 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FesrKey01 extends FesrKey01Serialized { 
   

								private int fesrSpiNbr01;

						private char[] fesrToPs01 = Field.fillLowValue(2);

						private char[] fesrToSvc01 = Field.fillLowValue(6);

						private char[] fesrToCause01 = Field.fillLowValue(1);
	
	/**
	* Constructor for FesrKey01
	**/
    public FesrKey01() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for FesrKey01. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FesrKey01(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	public int getFesrSpiNbr01() throws CFException {
        if (isFesrSpiNbr01Modified()) { 
           fesrSpiNbr01 = refreshFesrSpiNbr01();
        }
   		return fesrSpiNbr01;
	}
	
	/**
	 * 	Update FesrSpiNbr01 with the passed value
	 *  Corresponding COBOL Variable is FESR-SPI-NBR
	 *	@param number
	 */
	public void setFesrSpiNbr01(int number) {
			fesrSpiNbr01 = checkFesrSpiNbr01MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeFesrSpiNbr01(fesrSpiNbr01);
	}


	public void setFesrSpiNbr01(long number) {
	    number = checkFesrSpiNbr01MaxLimit(number); // Truncate if value is beyond +/- Max range
		setFesrSpiNbr01((int)number);
	}
	
	/**
	 *	Returns the value of fesrToPs01
	 *	@return fesrToPs01
	 */
   public char[] getFesrToPs01() throws CFException{
     if (isFesrToPs01Modified()) { 
        fesrToPs01 = refreshFesrToPs01();
     }
   		return fesrToPs01;
   }

  
	/**
	*  set variable fesrToPs01
	*  Corresponding COBOL Variable is FESR-TO-PS
	*  @param value
	**/
   public void setFesrToPs01(char[] value) {
      fesrToPs01 = checkFesrToPs01Constraints(value);
      serializeFesrToPs01(fesrToPs01);
   } 

     /**
	 * 	Update FesrToPs01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFesrToPs01(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFesrToPs01,fesrToPs01.length);
   	
   }
   
   public void setFesrToPs01(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFesrToPs01,fesrToPs01.length);
   	
   }
   
     /**
	 * 	Update FesrToPs01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFesrToPs01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFesrToPs01+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FesrToPs01 with another Field
	 *	@param value
	 */
   public void setFesrToPs01(Field source) {
       replace(source,0,source.length(),beginFesrToPs01,FESR_TO_PS_01_LEN);
   	
   }  
   
     /**
	 * 	Update FesrToPs01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFesrToPs01(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFesrToPs01,FESR_TO_PS_01_LEN);
   	
   }
   
     /**
	 * 	Update FesrToPs01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFesrToPs01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFesrToPs01+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fesrToSvc01
	 *	@return fesrToSvc01
	 */
   public char[] getFesrToSvc01() throws CFException{
     if (isFesrToSvc01Modified()) { 
        fesrToSvc01 = refreshFesrToSvc01();
     }
   		return fesrToSvc01;
   }

  
	/**
	*  set variable fesrToSvc01
	*  Corresponding COBOL Variable is FESR-TO-SVC
	*  @param value
	**/
   public void setFesrToSvc01(char[] value) {
      fesrToSvc01 = checkFesrToSvc01Constraints(value);
      serializeFesrToSvc01(fesrToSvc01);
   } 

     /**
	 * 	Update FesrToSvc01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFesrToSvc01(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFesrToSvc01,fesrToSvc01.length);
   	
   }
   
   public void setFesrToSvc01(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFesrToSvc01,fesrToSvc01.length);
   	
   }
   
     /**
	 * 	Update FesrToSvc01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFesrToSvc01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFesrToSvc01+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FesrToSvc01 with another Field
	 *	@param value
	 */
   public void setFesrToSvc01(Field source) {
       replace(source,0,source.length(),beginFesrToSvc01,FESR_TO_SVC_01_LEN);
   	
   }  
   
     /**
	 * 	Update FesrToSvc01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFesrToSvc01(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFesrToSvc01,FESR_TO_SVC_01_LEN);
   	
   }
   
     /**
	 * 	Update FesrToSvc01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFesrToSvc01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFesrToSvc01+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fesrToCause01
	 *	@return fesrToCause01
	 */
   public char[] getFesrToCause01() throws CFException{
     if (isFesrToCause01Modified()) { 
        fesrToCause01 = refreshFesrToCause01();
     }
   		return fesrToCause01;
   }

  
	/**
	*  set variable fesrToCause01
	*  Corresponding COBOL Variable is FESR-TO-CAUSE
	*  @param value
	**/
   public void setFesrToCause01(char[] value) {
      fesrToCause01 = checkFesrToCause01Constraints(value);
      serializeFesrToCause01(fesrToCause01);
   } 

     /**
	 * 	Update FesrToCause01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFesrToCause01(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFesrToCause01,fesrToCause01.length);
   	
   }
   
   public void setFesrToCause01(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFesrToCause01,fesrToCause01.length);
   	
   }
   
     /**
	 * 	Update FesrToCause01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFesrToCause01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFesrToCause01+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FesrToCause01 with another Field
	 *	@param value
	 */
   public void setFesrToCause01(Field source) {
       replace(source,0,source.length(),beginFesrToCause01,FESR_TO_CAUSE_01_LEN);
   	
   }  
   
     /**
	 * 	Update FesrToCause01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFesrToCause01(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFesrToCause01,FESR_TO_CAUSE_01_LEN);
   	
   }
   
     /**
	 * 	Update FesrToCause01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFesrToCause01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFesrToCause01+targetIndex,targetLen);
    
   }

	
	
	

		public static int getFesrKey01FieldLength() {
			return FESR_KEY_01_LENGTH;
		}

}
  
