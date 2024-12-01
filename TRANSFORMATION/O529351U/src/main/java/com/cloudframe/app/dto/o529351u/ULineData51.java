package com.cloudframe.app.dto.o529351u;

/**
*  The class ULineData51 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


public class ULineData51 extends ULineData51Serialized { 
   

						private char[] uLinePos51 = Field.fillLowValue(2);

						private char[] uLineServiceCode51 = Field.fillLowValue(6);

								private int uLineDosDate51;

								private BigDecimal uLineChargeAmt51 = BigDecimal.ZERO;

								private BigDecimal uLineNotcovAmt51 = BigDecimal.ZERO;

						private char[] uLineRemarkCd51 = Field.fillLowValue(3);

								private int uLineAppUnits51;

						private char[] uLineDiagPointer51 = Field.fillLowValue(8);
	
	/**
	* Constructor for ULineData51
	**/
    public ULineData51() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ULineData51. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ULineData51(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of uLinePos51
	 *	@return uLinePos51
	 */
   public char[] getULinePos51() throws CFException{
     if (isULinePos51Modified()) { 
        uLinePos51 = refreshULinePos51();
     }
   		return uLinePos51;
   }

  
	/**
	*  set variable uLinePos51
	*  Corresponding COBOL Variable is LK-51U-LINE-POS
	*  @param value
	**/
   public void setULinePos51(char[] value) {
      uLinePos51 = checkULinePos51Constraints(value);
      serializeULinePos51(uLinePos51);
   } 

     /**
	 * 	Update ULinePos51 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setULinePos51(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginULinePos51,uLinePos51.length);
   	
   }
   
   public void setULinePos51(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginULinePos51,uLinePos51.length);
   	
   }
   
     /**
	 * 	Update ULinePos51 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setULinePos51(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginULinePos51+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ULinePos51 with another Field
	 *	@param value
	 */
   public void setULinePos51(Field source) {
       replace(source,0,source.length(),beginULinePos51,U_LINE_POS_51_LEN);
   	
   }  
   
     /**
	 * 	Update ULinePos51 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setULinePos51(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginULinePos51,U_LINE_POS_51_LEN);
   	
   }
   
     /**
	 * 	Update ULinePos51 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setULinePos51(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginULinePos51+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of uLineServiceCode51
	 *	@return uLineServiceCode51
	 */
   public char[] getULineServiceCode51() throws CFException{
     if (isULineServiceCode51Modified()) { 
        uLineServiceCode51 = refreshULineServiceCode51();
     }
   		return uLineServiceCode51;
   }

  
	/**
	*  set variable uLineServiceCode51
	*  Corresponding COBOL Variable is LK-51U-LINE-SERVICE-CODE
	*  @param value
	**/
   public void setULineServiceCode51(char[] value) {
      uLineServiceCode51 = checkULineServiceCode51Constraints(value);
      serializeULineServiceCode51(uLineServiceCode51);
   } 

     /**
	 * 	Update ULineServiceCode51 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setULineServiceCode51(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginULineServiceCode51,uLineServiceCode51.length);
   	
   }
   
   public void setULineServiceCode51(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginULineServiceCode51,uLineServiceCode51.length);
   	
   }
   
     /**
	 * 	Update ULineServiceCode51 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setULineServiceCode51(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginULineServiceCode51+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ULineServiceCode51 with another Field
	 *	@param value
	 */
   public void setULineServiceCode51(Field source) {
       replace(source,0,source.length(),beginULineServiceCode51,U_LINE_SERVICE_CODE_51_LEN);
   	
   }  
   
     /**
	 * 	Update ULineServiceCode51 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setULineServiceCode51(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginULineServiceCode51,U_LINE_SERVICE_CODE_51_LEN);
   	
   }
   
     /**
	 * 	Update ULineServiceCode51 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setULineServiceCode51(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginULineServiceCode51+targetIndex,targetLen);
    
   }
	public int getULineDosDate51() throws CFException {
        if (isULineDosDate51Modified()) { 
           uLineDosDate51 = refreshULineDosDate51();
        }
   		return uLineDosDate51;
	}
	
	/**
	 * 	Update ULineDosDate51 with the passed value
	 *  Corresponding COBOL Variable is LK-51U-LINE-DOS-DATE
	 *	@param number
	 */
	public void setULineDosDate51(int number) {
			uLineDosDate51 = checkULineDosDate51MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeULineDosDate51(uLineDosDate51);
	}


	public void setULineDosDate51(long number) {
	    number = checkULineDosDate51MaxLimit(number); // Truncate if value is beyond +/- Max range
		setULineDosDate51((int)number);
	}
	
	public BigDecimal getULineChargeAmt51() throws CFException {
        if (isULineChargeAmt51Modified()) { 
           uLineChargeAmt51 = refreshULineChargeAmt51();
        }
   		return uLineChargeAmt51;
	}

    public char[] getULineChargeAmt51String() {
          return  uLineChargeAmt51String();
    }
	
	/**
	 * 	Update ULineChargeAmt51 with the passed number
	 *  Corresponding COBOL Variable is LK-51U-LINE-CHARGE-AMT
	 *	@param number
	 */
	public void setULineChargeAmt51(BigDecimal number) {	
     uLineChargeAmt51 = checkULineChargeAmt51MaxLimit(number);
	    serializeULineChargeAmt51(uLineChargeAmt51);
   }
	public BigDecimal getULineNotcovAmt51() throws CFException {
        if (isULineNotcovAmt51Modified()) { 
           uLineNotcovAmt51 = refreshULineNotcovAmt51();
        }
   		return uLineNotcovAmt51;
	}

    public char[] getULineNotcovAmt51String() {
          return  uLineNotcovAmt51String();
    }
	
	/**
	 * 	Update ULineNotcovAmt51 with the passed number
	 *  Corresponding COBOL Variable is LK-51U-LINE-NOTCOV-AMT
	 *	@param number
	 */
	public void setULineNotcovAmt51(BigDecimal number) {	
     uLineNotcovAmt51 = checkULineNotcovAmt51MaxLimit(number);
	    serializeULineNotcovAmt51(uLineNotcovAmt51);
   }
	/**
	 *	Returns the value of uLineRemarkCd51
	 *	@return uLineRemarkCd51
	 */
   public char[] getULineRemarkCd51() throws CFException{
     if (isULineRemarkCd51Modified()) { 
        uLineRemarkCd51 = refreshULineRemarkCd51();
     }
   		return uLineRemarkCd51;
   }

  
	/**
	*  set variable uLineRemarkCd51
	*  Corresponding COBOL Variable is LK-51U-LINE-REMARK-CD
	*  @param value
	**/
   public void setULineRemarkCd51(char[] value) {
      uLineRemarkCd51 = checkULineRemarkCd51Constraints(value);
      serializeULineRemarkCd51(uLineRemarkCd51);
   } 

     /**
	 * 	Update ULineRemarkCd51 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setULineRemarkCd51(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginULineRemarkCd51,uLineRemarkCd51.length);
   	
   }
   
   public void setULineRemarkCd51(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginULineRemarkCd51,uLineRemarkCd51.length);
   	
   }
   
     /**
	 * 	Update ULineRemarkCd51 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setULineRemarkCd51(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginULineRemarkCd51+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ULineRemarkCd51 with another Field
	 *	@param value
	 */
   public void setULineRemarkCd51(Field source) {
       replace(source,0,source.length(),beginULineRemarkCd51,U_LINE_REMARK_CD_51_LEN);
   	
   }  
   
     /**
	 * 	Update ULineRemarkCd51 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setULineRemarkCd51(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginULineRemarkCd51,U_LINE_REMARK_CD_51_LEN);
   	
   }
   
     /**
	 * 	Update ULineRemarkCd51 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setULineRemarkCd51(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginULineRemarkCd51+targetIndex,targetLen);
    
   }
	public int getULineAppUnits51() throws CFException {
        if (isULineAppUnits51Modified()) { 
           uLineAppUnits51 = refreshULineAppUnits51();
        }
   		return uLineAppUnits51;
	}
	
	/**
	 * 	Update ULineAppUnits51 with the passed value
	 *  Corresponding COBOL Variable is LK-51U-LINE-APP-UNITS
	 *	@param number
	 */
	public void setULineAppUnits51(int number) {
			uLineAppUnits51 = checkULineAppUnits51MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeULineAppUnits51(uLineAppUnits51);
	}


	public void setULineAppUnits51(long number) {
	    number = checkULineAppUnits51MaxLimit(number); // Truncate if value is beyond +/- Max range
		setULineAppUnits51((int)number);
	}
	
	/**
	 *	Returns the value of uLineDiagPointer51
	 *	@return uLineDiagPointer51
	 */
   public char[] getULineDiagPointer51() throws CFException{
     if (isULineDiagPointer51Modified()) { 
        uLineDiagPointer51 = refreshULineDiagPointer51();
     }
   		return uLineDiagPointer51;
   }

  
	/**
	*  set variable uLineDiagPointer51
	*  Corresponding COBOL Variable is LK-51U-LINE-DIAG-POINTER
	*  @param value
	**/
   public void setULineDiagPointer51(char[] value) {
      uLineDiagPointer51 = checkULineDiagPointer51Constraints(value);
      serializeULineDiagPointer51(uLineDiagPointer51);
   } 

     /**
	 * 	Update ULineDiagPointer51 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setULineDiagPointer51(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginULineDiagPointer51,uLineDiagPointer51.length);
   	
   }
   
   public void setULineDiagPointer51(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginULineDiagPointer51,uLineDiagPointer51.length);
   	
   }
   
     /**
	 * 	Update ULineDiagPointer51 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setULineDiagPointer51(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginULineDiagPointer51+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ULineDiagPointer51 with another Field
	 *	@param value
	 */
   public void setULineDiagPointer51(Field source) {
       replace(source,0,source.length(),beginULineDiagPointer51,U_LINE_DIAG_POINTER_51_LEN);
   	
   }  
   
     /**
	 * 	Update ULineDiagPointer51 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setULineDiagPointer51(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginULineDiagPointer51,U_LINE_DIAG_POINTER_51_LEN);
   	
   }
   
     /**
	 * 	Update ULineDiagPointer51 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setULineDiagPointer51(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginULineDiagPointer51+targetIndex,targetLen);
    
   }

	
	
	

		public static int getULineData51FieldLength() {
			return U_LINE_DATA_51_LENGTH;
		}

}
  
