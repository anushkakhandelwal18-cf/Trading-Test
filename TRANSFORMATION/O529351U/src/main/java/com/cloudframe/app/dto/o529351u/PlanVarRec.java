package com.cloudframe.app.dto.o529351u;

/**
*  The class PlanVarRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class PlanVarRec extends PlanVarRecSerialized { 
   

						private char[] fesaPolicy01 = Field.fillLowValue(6);

								private int fesaPlanVar01;

								private int fesaEffDate01;

								private int fesaSpiNbr01;

						private char[] fesaPosTierCd = Field.fillLowValue(1);

						private char[] fesaSpiPriDiagInd = Field.fillLowValue(1);

						private char[] fesaSpiDiagElgInd = Field.fillLowValue(1);
	
	/**
	* Constructor for PlanVarRec
	**/
    public PlanVarRec() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for PlanVarRec. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PlanVarRec(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of fesaPolicy01
	 *	@return fesaPolicy01
	 */
   public char[] getFesaPolicy01() throws CFException{
     if (isFesaPolicy01Modified()) { 
        fesaPolicy01 = refreshFesaPolicy01();
     }
   		return fesaPolicy01;
   }

  
	/**
	*  set variable fesaPolicy01
	*  Corresponding COBOL Variable is WS-FESA-POLICY
	*  @param value
	**/
   public void setFesaPolicy01(char[] value) {
      fesaPolicy01 = checkFesaPolicy01Constraints(value);
      serializeFesaPolicy01(fesaPolicy01);
   } 

     /**
	 * 	Update FesaPolicy01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFesaPolicy01(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFesaPolicy01,fesaPolicy01.length);
   	
   }
   
   public void setFesaPolicy01(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFesaPolicy01,fesaPolicy01.length);
   	
   }
   
     /**
	 * 	Update FesaPolicy01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFesaPolicy01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFesaPolicy01+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FesaPolicy01 with another Field
	 *	@param value
	 */
   public void setFesaPolicy01(Field source) {
       replace(source,0,source.length(),beginFesaPolicy01,FESA_POLICY_01_LEN);
   	
   }  
   
     /**
	 * 	Update FesaPolicy01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFesaPolicy01(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFesaPolicy01,FESA_POLICY_01_LEN);
   	
   }
   
     /**
	 * 	Update FesaPolicy01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFesaPolicy01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFesaPolicy01+targetIndex,targetLen);
    
   }
	public int getFesaPlanVar01() throws CFException {
        if (isFesaPlanVar01Modified()) { 
           fesaPlanVar01 = refreshFesaPlanVar01();
        }
   		return fesaPlanVar01;
	}
	
	/**
	 * 	Update FesaPlanVar01 with the passed value
	 *  Corresponding COBOL Variable is WS-FESA-PLAN-VAR
	 *	@param number
	 */
	public void setFesaPlanVar01(int number) {
			fesaPlanVar01 = checkFesaPlanVar01MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeFesaPlanVar01(fesaPlanVar01);
	}


	public void setFesaPlanVar01(long number) {
	    number = checkFesaPlanVar01MaxLimit(number); // Truncate if value is beyond +/- Max range
		setFesaPlanVar01((int)number);
	}
	
	public int getFesaEffDate01() throws CFException {
        if (isFesaEffDate01Modified()) { 
           fesaEffDate01 = refreshFesaEffDate01();
        }
   		return fesaEffDate01;
	}
	
	/**
	 * 	Update FesaEffDate01 with the passed value
	 *  Corresponding COBOL Variable is WS-FESA-EFF-DATE
	 *	@param number
	 */
	public void setFesaEffDate01(int number) {
			fesaEffDate01 = checkFesaEffDate01MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeFesaEffDate01(fesaEffDate01);
	}


	public void setFesaEffDate01(long number) {
	    number = checkFesaEffDate01MaxLimit(number); // Truncate if value is beyond +/- Max range
		setFesaEffDate01((int)number);
	}
	
	public int getFesaSpiNbr01() throws CFException {
        if (isFesaSpiNbr01Modified()) { 
           fesaSpiNbr01 = refreshFesaSpiNbr01();
        }
   		return fesaSpiNbr01;
	}
	
	/**
	 * 	Update FesaSpiNbr01 with the passed value
	 *  Corresponding COBOL Variable is WS-FESA-SPI-NBR
	 *	@param number
	 */
	public void setFesaSpiNbr01(int number) {
			fesaSpiNbr01 = checkFesaSpiNbr01MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeFesaSpiNbr01(fesaSpiNbr01);
	}


	public void setFesaSpiNbr01(long number) {
	    number = checkFesaSpiNbr01MaxLimit(number); // Truncate if value is beyond +/- Max range
		setFesaSpiNbr01((int)number);
	}
	
	/**
	 *	Returns the value of fesaPosTierCd
	 *	@return fesaPosTierCd
	 */
   public char[] getFesaPosTierCd() throws CFException{
     if (isFesaPosTierCdModified()) { 
        fesaPosTierCd = refreshFesaPosTierCd();
     }
   		return fesaPosTierCd;
   }

  
	/**
	*  set variable fesaPosTierCd
	*  Corresponding COBOL Variable is WS-FESA-POS-TIER-CD
	*  @param value
	**/
   public void setFesaPosTierCd(char[] value) {
      fesaPosTierCd = checkFesaPosTierCdConstraints(value);
      serializeFesaPosTierCd(fesaPosTierCd);
   } 

     /**
	 * 	Update FesaPosTierCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFesaPosTierCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFesaPosTierCd,fesaPosTierCd.length);
   	
   }
   
   public void setFesaPosTierCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFesaPosTierCd,fesaPosTierCd.length);
   	
   }
   
     /**
	 * 	Update FesaPosTierCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFesaPosTierCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFesaPosTierCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FesaPosTierCd with another Field
	 *	@param value
	 */
   public void setFesaPosTierCd(Field source) {
       replace(source,0,source.length(),beginFesaPosTierCd,FESA_POS_TIER_CD_LEN);
   	
   }  
   
     /**
	 * 	Update FesaPosTierCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFesaPosTierCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFesaPosTierCd,FESA_POS_TIER_CD_LEN);
   	
   }
   
     /**
	 * 	Update FesaPosTierCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFesaPosTierCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFesaPosTierCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fesaSpiPriDiagInd
	 *	@return fesaSpiPriDiagInd
	 */
   public char[] getFesaSpiPriDiagInd() throws CFException{
     if (isFesaSpiPriDiagIndModified()) { 
        fesaSpiPriDiagInd = refreshFesaSpiPriDiagInd();
     }
   		return fesaSpiPriDiagInd;
   }

  
	/**
	*  set variable fesaSpiPriDiagInd
	*  Corresponding COBOL Variable is WS-FESA-SPI-PRI-DIAG-IND
	*  @param value
	**/
   public void setFesaSpiPriDiagInd(char[] value) {
      fesaSpiPriDiagInd = checkFesaSpiPriDiagIndConstraints(value);
      serializeFesaSpiPriDiagInd(fesaSpiPriDiagInd);
   } 

     /**
	 * 	Update FesaSpiPriDiagInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFesaSpiPriDiagInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFesaSpiPriDiagInd,fesaSpiPriDiagInd.length);
   	
   }
   
   public void setFesaSpiPriDiagInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFesaSpiPriDiagInd,fesaSpiPriDiagInd.length);
   	
   }
   
     /**
	 * 	Update FesaSpiPriDiagInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFesaSpiPriDiagInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFesaSpiPriDiagInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FesaSpiPriDiagInd with another Field
	 *	@param value
	 */
   public void setFesaSpiPriDiagInd(Field source) {
       replace(source,0,source.length(),beginFesaSpiPriDiagInd,FESA_SPI_PRI_DIAG_IND_LEN);
   	
   }  
   
     /**
	 * 	Update FesaSpiPriDiagInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFesaSpiPriDiagInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFesaSpiPriDiagInd,FESA_SPI_PRI_DIAG_IND_LEN);
   	
   }
   
     /**
	 * 	Update FesaSpiPriDiagInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFesaSpiPriDiagInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFesaSpiPriDiagInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fesaSpiDiagElgInd
	 *	@return fesaSpiDiagElgInd
	 */
   public char[] getFesaSpiDiagElgInd() throws CFException{
     if (isFesaSpiDiagElgIndModified()) { 
        fesaSpiDiagElgInd = refreshFesaSpiDiagElgInd();
     }
   		return fesaSpiDiagElgInd;
   }

  
	/**
	*  set variable fesaSpiDiagElgInd
	*  Corresponding COBOL Variable is WS-FESA-SPI-DIAG-ELG-IND
	*  @param value
	**/
   public void setFesaSpiDiagElgInd(char[] value) {
      fesaSpiDiagElgInd = checkFesaSpiDiagElgIndConstraints(value);
      serializeFesaSpiDiagElgInd(fesaSpiDiagElgInd);
   } 

     /**
	 * 	Update FesaSpiDiagElgInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFesaSpiDiagElgInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFesaSpiDiagElgInd,fesaSpiDiagElgInd.length);
   	
   }
   
   public void setFesaSpiDiagElgInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFesaSpiDiagElgInd,fesaSpiDiagElgInd.length);
   	
   }
   
     /**
	 * 	Update FesaSpiDiagElgInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFesaSpiDiagElgInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFesaSpiDiagElgInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FesaSpiDiagElgInd with another Field
	 *	@param value
	 */
   public void setFesaSpiDiagElgInd(Field source) {
       replace(source,0,source.length(),beginFesaSpiDiagElgInd,FESA_SPI_DIAG_ELG_IND_LEN);
   	
   }  
   
     /**
	 * 	Update FesaSpiDiagElgInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFesaSpiDiagElgInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFesaSpiDiagElgInd,FESA_SPI_DIAG_ELG_IND_LEN);
   	
   }
   
     /**
	 * 	Update FesaSpiDiagElgInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFesaSpiDiagElgInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFesaSpiDiagElgInd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getPlanVarRecFieldLength() {
			return PLAN_VAR_REC_LENGTH;
		}

}
  
