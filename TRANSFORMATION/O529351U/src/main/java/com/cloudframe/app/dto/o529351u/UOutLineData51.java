package com.cloudframe.app.dto.o529351u;

/**
*  The class UOutLineData51 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


public class UOutLineData51 extends UOutLineData51Serialized { 
   

						private char[] uOutLinePos51 = Field.fillLowValue(2);

						private char[] uOutLineServiceCode51 = Field.fillLowValue(6);

								private int uOutLineDosDate51;

								private BigDecimal uOutLineChargeAmt51 = BigDecimal.ZERO;

								private BigDecimal uOutLineNotcovAmt51 = BigDecimal.ZERO;

						private char[] uOutLineRemarkCd51 = Field.fillLowValue(3);

								private short uOutLinePlanVar51;

						private char[] uOutLineCauseCd51 = Field.fillLowValue(1);

								private int uOutLineAppUnits51;

						private char[] uOutSpiTblId51 = Field.fillLowValue(7);

						private char[] uOutPosTierCd51 = Field.fillLowValue(1);

						private char[] uOutDiagElgInd51 = Field.fillLowValue(1);
	
	/**
	* Constructor for UOutLineData51
	**/
    public UOutLineData51() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for UOutLineData51. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public UOutLineData51(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of uOutLinePos51
	 *	@return uOutLinePos51
	 */
   public char[] getUOutLinePos51() throws CFException{
     if (isUOutLinePos51Modified()) { 
        uOutLinePos51 = refreshUOutLinePos51();
     }
   		return uOutLinePos51;
   }

  
	/**
	*  set variable uOutLinePos51
	*  Corresponding COBOL Variable is LK-51U-OUT-LINE-POS
	*  @param value
	**/
   public void setUOutLinePos51(char[] value) {
      uOutLinePos51 = checkUOutLinePos51Constraints(value);
      serializeUOutLinePos51(uOutLinePos51);
   } 

     /**
	 * 	Update UOutLinePos51 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUOutLinePos51(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginUOutLinePos51,uOutLinePos51.length);
   	
   }
   
   public void setUOutLinePos51(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginUOutLinePos51,uOutLinePos51.length);
   	
   }
   
     /**
	 * 	Update UOutLinePos51 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUOutLinePos51(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUOutLinePos51+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update UOutLinePos51 with another Field
	 *	@param value
	 */
   public void setUOutLinePos51(Field source) {
       replace(source,0,source.length(),beginUOutLinePos51,U_OUT_LINE_POS_51_LEN);
   	
   }  
   
     /**
	 * 	Update UOutLinePos51 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUOutLinePos51(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginUOutLinePos51,U_OUT_LINE_POS_51_LEN);
   	
   }
   
     /**
	 * 	Update UOutLinePos51 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUOutLinePos51(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUOutLinePos51+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of uOutLineServiceCode51
	 *	@return uOutLineServiceCode51
	 */
   public char[] getUOutLineServiceCode51() throws CFException{
     if (isUOutLineServiceCode51Modified()) { 
        uOutLineServiceCode51 = refreshUOutLineServiceCode51();
     }
   		return uOutLineServiceCode51;
   }

  
	/**
	*  set variable uOutLineServiceCode51
	*  Corresponding COBOL Variable is LK-51U-OUT-LINE-SERVICE-CODE
	*  @param value
	**/
   public void setUOutLineServiceCode51(char[] value) {
      uOutLineServiceCode51 = checkUOutLineServiceCode51Constraints(value);
      serializeUOutLineServiceCode51(uOutLineServiceCode51);
   } 

     /**
	 * 	Update UOutLineServiceCode51 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUOutLineServiceCode51(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginUOutLineServiceCode51,uOutLineServiceCode51.length);
   	
   }
   
   public void setUOutLineServiceCode51(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginUOutLineServiceCode51,uOutLineServiceCode51.length);
   	
   }
   
     /**
	 * 	Update UOutLineServiceCode51 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUOutLineServiceCode51(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUOutLineServiceCode51+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update UOutLineServiceCode51 with another Field
	 *	@param value
	 */
   public void setUOutLineServiceCode51(Field source) {
       replace(source,0,source.length(),beginUOutLineServiceCode51,U_OUT_LINE_SERVICE_CODE_51_LEN);
   	
   }  
   
     /**
	 * 	Update UOutLineServiceCode51 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUOutLineServiceCode51(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginUOutLineServiceCode51,U_OUT_LINE_SERVICE_CODE_51_LEN);
   	
   }
   
     /**
	 * 	Update UOutLineServiceCode51 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUOutLineServiceCode51(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUOutLineServiceCode51+targetIndex,targetLen);
    
   }
	public int getUOutLineDosDate51() throws CFException {
        if (isUOutLineDosDate51Modified()) { 
           uOutLineDosDate51 = refreshUOutLineDosDate51();
        }
   		return uOutLineDosDate51;
	}
	
	/**
	 * 	Update UOutLineDosDate51 with the passed value
	 *  Corresponding COBOL Variable is LK-51U-OUT-LINE-DOS-DATE
	 *	@param number
	 */
	public void setUOutLineDosDate51(int number) {
			uOutLineDosDate51 = checkUOutLineDosDate51MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeUOutLineDosDate51(uOutLineDosDate51);
	}


	public void setUOutLineDosDate51(long number) {
	    number = checkUOutLineDosDate51MaxLimit(number); // Truncate if value is beyond +/- Max range
		setUOutLineDosDate51((int)number);
	}
	
	public BigDecimal getUOutLineChargeAmt51() throws CFException {
        if (isUOutLineChargeAmt51Modified()) { 
           uOutLineChargeAmt51 = refreshUOutLineChargeAmt51();
        }
   		return uOutLineChargeAmt51;
	}

    public char[] getUOutLineChargeAmt51String() {
          return  uOutLineChargeAmt51String();
    }
	
	/**
	 * 	Update UOutLineChargeAmt51 with the passed number
	 *  Corresponding COBOL Variable is LK-51U-OUT-LINE-CHARGE-AMT
	 *	@param number
	 */
	public void setUOutLineChargeAmt51(BigDecimal number) {	
     uOutLineChargeAmt51 = checkUOutLineChargeAmt51MaxLimit(number);
	    serializeUOutLineChargeAmt51(uOutLineChargeAmt51);
   }
	public BigDecimal getUOutLineNotcovAmt51() throws CFException {
        if (isUOutLineNotcovAmt51Modified()) { 
           uOutLineNotcovAmt51 = refreshUOutLineNotcovAmt51();
        }
   		return uOutLineNotcovAmt51;
	}

    public char[] getUOutLineNotcovAmt51String() {
          return  uOutLineNotcovAmt51String();
    }
	
	/**
	 * 	Update UOutLineNotcovAmt51 with the passed number
	 *  Corresponding COBOL Variable is LK-51U-OUT-LINE-NOTCOV-AMT
	 *	@param number
	 */
	public void setUOutLineNotcovAmt51(BigDecimal number) {	
     uOutLineNotcovAmt51 = checkUOutLineNotcovAmt51MaxLimit(number);
	    serializeUOutLineNotcovAmt51(uOutLineNotcovAmt51);
   }
	/**
	 *	Returns the value of uOutLineRemarkCd51
	 *	@return uOutLineRemarkCd51
	 */
   public char[] getUOutLineRemarkCd51() throws CFException{
     if (isUOutLineRemarkCd51Modified()) { 
        uOutLineRemarkCd51 = refreshUOutLineRemarkCd51();
     }
   		return uOutLineRemarkCd51;
   }

  
	/**
	*  set variable uOutLineRemarkCd51
	*  Corresponding COBOL Variable is LK-51U-OUT-LINE-REMARK-CD
	*  @param value
	**/
   public void setUOutLineRemarkCd51(char[] value) {
      uOutLineRemarkCd51 = checkUOutLineRemarkCd51Constraints(value);
      serializeUOutLineRemarkCd51(uOutLineRemarkCd51);
   } 

     /**
	 * 	Update UOutLineRemarkCd51 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUOutLineRemarkCd51(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginUOutLineRemarkCd51,uOutLineRemarkCd51.length);
   	
   }
   
   public void setUOutLineRemarkCd51(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginUOutLineRemarkCd51,uOutLineRemarkCd51.length);
   	
   }
   
     /**
	 * 	Update UOutLineRemarkCd51 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUOutLineRemarkCd51(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUOutLineRemarkCd51+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update UOutLineRemarkCd51 with another Field
	 *	@param value
	 */
   public void setUOutLineRemarkCd51(Field source) {
       replace(source,0,source.length(),beginUOutLineRemarkCd51,U_OUT_LINE_REMARK_CD_51_LEN);
   	
   }  
   
     /**
	 * 	Update UOutLineRemarkCd51 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUOutLineRemarkCd51(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginUOutLineRemarkCd51,U_OUT_LINE_REMARK_CD_51_LEN);
   	
   }
   
     /**
	 * 	Update UOutLineRemarkCd51 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUOutLineRemarkCd51(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUOutLineRemarkCd51+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of uOutLinePlanVar51
	 *	@return uOutLinePlanVar51
	 */
	public short getUOutLinePlanVar51() throws CFException {
        if (isUOutLinePlanVar51Modified()) { 
           uOutLinePlanVar51 = refreshUOutLinePlanVar51();
        }
   		return uOutLinePlanVar51;
	}
	
	/**
	 * 	Update UOutLinePlanVar51 with the passed value
	 *  Corresponding COBOL Variable is LK-51U-OUT-LINE-PLAN-VAR
	 *	@param number
	 */
	public void setUOutLinePlanVar51(short number) {
	     // Truncate if the number is beyond +/- Max range
	    uOutLinePlanVar51 = checkUOutLinePlanVar51MaxLimit(number); 
		serializeUOutLinePlanVar51(uOutLinePlanVar51);
	}

	public void setUOutLinePlanVar51(int number) {
	    number = checkUOutLinePlanVar51MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setUOutLinePlanVar51((short)number);
	}
	public void setUOutLinePlanVar51(long number) {
	    number = checkUOutLinePlanVar51MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setUOutLinePlanVar51((short)number);
	}
	

	/**
	 *	Returns the value of uOutLineCauseCd51
	 *	@return uOutLineCauseCd51
	 */
   public char[] getUOutLineCauseCd51() throws CFException{
     if (isUOutLineCauseCd51Modified()) { 
        uOutLineCauseCd51 = refreshUOutLineCauseCd51();
     }
   		return uOutLineCauseCd51;
   }

  
	/**
	*  set variable uOutLineCauseCd51
	*  Corresponding COBOL Variable is LK-51U-OUT-LINE-CAUSE-CD
	*  @param value
	**/
   public void setUOutLineCauseCd51(char[] value) {
      uOutLineCauseCd51 = checkUOutLineCauseCd51Constraints(value);
      serializeUOutLineCauseCd51(uOutLineCauseCd51);
   } 

     /**
	 * 	Update UOutLineCauseCd51 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUOutLineCauseCd51(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginUOutLineCauseCd51,uOutLineCauseCd51.length);
   	
   }
   
   public void setUOutLineCauseCd51(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginUOutLineCauseCd51,uOutLineCauseCd51.length);
   	
   }
   
     /**
	 * 	Update UOutLineCauseCd51 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUOutLineCauseCd51(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUOutLineCauseCd51+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update UOutLineCauseCd51 with another Field
	 *	@param value
	 */
   public void setUOutLineCauseCd51(Field source) {
       replace(source,0,source.length(),beginUOutLineCauseCd51,U_OUT_LINE_CAUSE_CD_51_LEN);
   	
   }  
   
     /**
	 * 	Update UOutLineCauseCd51 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUOutLineCauseCd51(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginUOutLineCauseCd51,U_OUT_LINE_CAUSE_CD_51_LEN);
   	
   }
   
     /**
	 * 	Update UOutLineCauseCd51 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUOutLineCauseCd51(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUOutLineCauseCd51+targetIndex,targetLen);
    
   }
	public int getUOutLineAppUnits51() throws CFException {
        if (isUOutLineAppUnits51Modified()) { 
           uOutLineAppUnits51 = refreshUOutLineAppUnits51();
        }
   		return uOutLineAppUnits51;
	}
	
	/**
	 * 	Update UOutLineAppUnits51 with the passed value
	 *  Corresponding COBOL Variable is LK-51U-OUT-LINE-APP-UNITS
	 *	@param number
	 */
	public void setUOutLineAppUnits51(int number) {
			uOutLineAppUnits51 = checkUOutLineAppUnits51MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeUOutLineAppUnits51(uOutLineAppUnits51);
	}


	public void setUOutLineAppUnits51(long number) {
	    number = checkUOutLineAppUnits51MaxLimit(number); // Truncate if value is beyond +/- Max range
		setUOutLineAppUnits51((int)number);
	}
	
	/**
	 *	Returns the value of uOutSpiTblId51
	 *	@return uOutSpiTblId51
	 */
   public char[] getUOutSpiTblId51() throws CFException{
     if (isUOutSpiTblId51Modified()) { 
        uOutSpiTblId51 = refreshUOutSpiTblId51();
     }
   		return uOutSpiTblId51;
   }

  
	/**
	*  set variable uOutSpiTblId51
	*  Corresponding COBOL Variable is LK-51U-OUT-SPI-TBL-ID
	*  @param value
	**/
   public void setUOutSpiTblId51(char[] value) {
      uOutSpiTblId51 = checkUOutSpiTblId51Constraints(value);
      serializeUOutSpiTblId51(uOutSpiTblId51);
   } 

     /**
	 * 	Update UOutSpiTblId51 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUOutSpiTblId51(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginUOutSpiTblId51,uOutSpiTblId51.length);
   	
   }
   
   public void setUOutSpiTblId51(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginUOutSpiTblId51,uOutSpiTblId51.length);
   	
   }
   
     /**
	 * 	Update UOutSpiTblId51 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUOutSpiTblId51(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUOutSpiTblId51+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update UOutSpiTblId51 with another Field
	 *	@param value
	 */
   public void setUOutSpiTblId51(Field source) {
       replace(source,0,source.length(),beginUOutSpiTblId51,U_OUT_SPI_TBL_ID_51_LEN);
   	
   }  
   
     /**
	 * 	Update UOutSpiTblId51 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUOutSpiTblId51(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginUOutSpiTblId51,U_OUT_SPI_TBL_ID_51_LEN);
   	
   }
   
     /**
	 * 	Update UOutSpiTblId51 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUOutSpiTblId51(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUOutSpiTblId51+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of uOutPosTierCd51
	 *	@return uOutPosTierCd51
	 */
   public char[] getUOutPosTierCd51() throws CFException{
     if (isUOutPosTierCd51Modified()) { 
        uOutPosTierCd51 = refreshUOutPosTierCd51();
     }
   		return uOutPosTierCd51;
   }

  
	/**
	*  set variable uOutPosTierCd51
	*  Corresponding COBOL Variable is LK-51U-OUT-POS-TIER-CD
	*  @param value
	**/
   public void setUOutPosTierCd51(char[] value) {
      uOutPosTierCd51 = checkUOutPosTierCd51Constraints(value);
      serializeUOutPosTierCd51(uOutPosTierCd51);
   } 

     /**
	 * 	Update UOutPosTierCd51 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUOutPosTierCd51(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginUOutPosTierCd51,uOutPosTierCd51.length);
   	
   }
   
   public void setUOutPosTierCd51(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginUOutPosTierCd51,uOutPosTierCd51.length);
   	
   }
   
     /**
	 * 	Update UOutPosTierCd51 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUOutPosTierCd51(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUOutPosTierCd51+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update UOutPosTierCd51 with another Field
	 *	@param value
	 */
   public void setUOutPosTierCd51(Field source) {
       replace(source,0,source.length(),beginUOutPosTierCd51,U_OUT_POS_TIER_CD_51_LEN);
   	
   }  
   
     /**
	 * 	Update UOutPosTierCd51 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUOutPosTierCd51(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginUOutPosTierCd51,U_OUT_POS_TIER_CD_51_LEN);
   	
   }
   
     /**
	 * 	Update UOutPosTierCd51 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUOutPosTierCd51(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUOutPosTierCd51+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of uOutDiagElgInd51
	 *	@return uOutDiagElgInd51
	 */
   public char[] getUOutDiagElgInd51() throws CFException{
     if (isUOutDiagElgInd51Modified()) { 
        uOutDiagElgInd51 = refreshUOutDiagElgInd51();
     }
   		return uOutDiagElgInd51;
   }

  
	/**
	*  set variable uOutDiagElgInd51
	*  Corresponding COBOL Variable is LK-51U-OUT-DIAG-ELG-IND
	*  @param value
	**/
   public void setUOutDiagElgInd51(char[] value) {
      uOutDiagElgInd51 = checkUOutDiagElgInd51Constraints(value);
      serializeUOutDiagElgInd51(uOutDiagElgInd51);
   } 

     /**
	 * 	Update UOutDiagElgInd51 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUOutDiagElgInd51(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginUOutDiagElgInd51,uOutDiagElgInd51.length);
   	
   }
   
   public void setUOutDiagElgInd51(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginUOutDiagElgInd51,uOutDiagElgInd51.length);
   	
   }
   
     /**
	 * 	Update UOutDiagElgInd51 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUOutDiagElgInd51(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUOutDiagElgInd51+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update UOutDiagElgInd51 with another Field
	 *	@param value
	 */
   public void setUOutDiagElgInd51(Field source) {
       replace(source,0,source.length(),beginUOutDiagElgInd51,U_OUT_DIAG_ELG_IND_51_LEN);
   	
   }  
   
     /**
	 * 	Update UOutDiagElgInd51 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUOutDiagElgInd51(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginUOutDiagElgInd51,U_OUT_DIAG_ELG_IND_51_LEN);
   	
   }
   
     /**
	 * 	Update UOutDiagElgInd51 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUOutDiagElgInd51(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUOutDiagElgInd51+targetIndex,targetLen);
    
   }

	
	
	

		public static int getUOutLineData51FieldLength() {
			return U_OUT_LINE_DATA_51_LENGTH;
		}

}
  
