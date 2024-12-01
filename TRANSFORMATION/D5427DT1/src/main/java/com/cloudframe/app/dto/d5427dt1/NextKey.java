package com.cloudframe.app.dto.d5427dt1;

/**
*  The class NextKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class NextKey extends NextKeySerialized { 
   

						private char[] nextProcDt = Field.fillLowValue(10);

						private char[] nextProcTm = Field.fillLowValue(8);

						private char[] nextPgmIdLstCharVal = Field.fillLowValue(1);

								private int nextIcnSufxVersNbr;

						private char[] nextInvnCtlNbr = Field.fillLowValue(10);

						private char[] nextIcnSufxCd = Field.fillLowValue(2);

								private int nextLnId;

								private int nextHeaderCt;
	
	/**
	* Constructor for NextKey
	**/
    public NextKey() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of nextProcDt
	 *	@return nextProcDt
	 */
   public char[] getNextProcDt() throws CFException{
     if (isNextProcDtModified()) { 
        nextProcDt = refreshNextProcDt();
     }
   		return nextProcDt;
   }

  
	/**
	*  set variable nextProcDt
	*  Corresponding COBOL Variable is NEXT-PROC-DT
	*  @param value
	**/
   public void setNextProcDt(char[] value) {
      nextProcDt = checkNextProcDtConstraints(value);
      serializeNextProcDt(nextProcDt);
   } 

     /**
	 * 	Update NextProcDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setNextProcDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginNextProcDt,nextProcDt.length);
   	
   }
   
   public void setNextProcDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginNextProcDt,nextProcDt.length);
   	
   }
   
     /**
	 * 	Update NextProcDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setNextProcDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNextProcDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update NextProcDt with another Field
	 *	@param value
	 */
   public void setNextProcDt(Field source) {
       replace(source,0,source.length(),beginNextProcDt,NEXT_PROC_DT_LEN);
   	
   }  
   
     /**
	 * 	Update NextProcDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setNextProcDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginNextProcDt,NEXT_PROC_DT_LEN);
   	
   }
   
     /**
	 * 	Update NextProcDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setNextProcDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNextProcDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of nextProcTm
	 *	@return nextProcTm
	 */
   public char[] getNextProcTm() throws CFException{
     if (isNextProcTmModified()) { 
        nextProcTm = refreshNextProcTm();
     }
   		return nextProcTm;
   }

  
	/**
	*  set variable nextProcTm
	*  Corresponding COBOL Variable is NEXT-PROC-TM
	*  @param value
	**/
   public void setNextProcTm(char[] value) {
      nextProcTm = checkNextProcTmConstraints(value);
      serializeNextProcTm(nextProcTm);
   } 

     /**
	 * 	Update NextProcTm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setNextProcTm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginNextProcTm,nextProcTm.length);
   	
   }
   
   public void setNextProcTm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginNextProcTm,nextProcTm.length);
   	
   }
   
     /**
	 * 	Update NextProcTm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setNextProcTm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNextProcTm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update NextProcTm with another Field
	 *	@param value
	 */
   public void setNextProcTm(Field source) {
       replace(source,0,source.length(),beginNextProcTm,NEXT_PROC_TM_LEN);
   	
   }  
   
     /**
	 * 	Update NextProcTm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setNextProcTm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginNextProcTm,NEXT_PROC_TM_LEN);
   	
   }
   
     /**
	 * 	Update NextProcTm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setNextProcTm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNextProcTm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of nextPgmIdLstCharVal
	 *	@return nextPgmIdLstCharVal
	 */
   public char[] getNextPgmIdLstCharVal() throws CFException{
     if (isNextPgmIdLstCharValModified()) { 
        nextPgmIdLstCharVal = refreshNextPgmIdLstCharVal();
     }
   		return nextPgmIdLstCharVal;
   }

  
	/**
	*  set variable nextPgmIdLstCharVal
	*  Corresponding COBOL Variable is NEXT-PGM-ID-LST-CHAR-VAL
	*  @param value
	**/
   public void setNextPgmIdLstCharVal(char[] value) {
      nextPgmIdLstCharVal = checkNextPgmIdLstCharValConstraints(value);
      serializeNextPgmIdLstCharVal(nextPgmIdLstCharVal);
   } 

     /**
	 * 	Update NextPgmIdLstCharVal 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setNextPgmIdLstCharVal(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginNextPgmIdLstCharVal,nextPgmIdLstCharVal.length);
   	
   }
   
   public void setNextPgmIdLstCharVal(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginNextPgmIdLstCharVal,nextPgmIdLstCharVal.length);
   	
   }
   
     /**
	 * 	Update NextPgmIdLstCharVal 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setNextPgmIdLstCharVal(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNextPgmIdLstCharVal+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update NextPgmIdLstCharVal with another Field
	 *	@param value
	 */
   public void setNextPgmIdLstCharVal(Field source) {
       replace(source,0,source.length(),beginNextPgmIdLstCharVal,NEXT_PGM_ID_LST_CHAR_VAL_LEN);
   	
   }  
   
     /**
	 * 	Update NextPgmIdLstCharVal 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setNextPgmIdLstCharVal(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginNextPgmIdLstCharVal,NEXT_PGM_ID_LST_CHAR_VAL_LEN);
   	
   }
   
     /**
	 * 	Update NextPgmIdLstCharVal 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setNextPgmIdLstCharVal(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNextPgmIdLstCharVal+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of nextIcnSufxVersNbr
	 *	@return nextIcnSufxVersNbr
	 */
	public int getNextIcnSufxVersNbr() throws CFException {
       if (isNextIcnSufxVersNbrModified()) { 
           nextIcnSufxVersNbr = refreshNextIcnSufxVersNbr();
        }
   		return nextIcnSufxVersNbr;
	}
	

	
	   
	/**
	 * 	Update NextIcnSufxVersNbr with the passed value
	 *  Corresponding COBOL Variable is NEXT-ICN-SUFX-VERS-NBR
	 *	@param number
	 */
	public void setNextIcnSufxVersNbr(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    nextIcnSufxVersNbr = checkNextIcnSufxVersNbrMaxLimit(number); 
		serializeNextIcnSufxVersNbr(nextIcnSufxVersNbr);
	}
	

	public void setNextIcnSufxVersNbr(long number) {
	    number = checkNextIcnSufxVersNbrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setNextIcnSufxVersNbr((int)number);
	}
	
	/**
	 * 	Update NextIcnSufxVersNbr with the passed value
	 *	@param value (String or char[])
	 */
	public void setNextIcnSufxVersNbr(char[] value) throws CFException {
		 nextIcnSufxVersNbr = serializeNextIcnSufxVersNbr(value);
	}
	/**
	 * 	Update NextIcnSufxVersNbr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNextIcnSufxVersNbrString(char[] value) throws CFException {
		 setNextIcnSufxVersNbr(value);
	}
	/**
	 *	Returns the value of nextInvnCtlNbr
	 *	@return nextInvnCtlNbr
	 */
   public char[] getNextInvnCtlNbr() throws CFException{
     if (isNextInvnCtlNbrModified()) { 
        nextInvnCtlNbr = refreshNextInvnCtlNbr();
     }
   		return nextInvnCtlNbr;
   }

  
	/**
	*  set variable nextInvnCtlNbr
	*  Corresponding COBOL Variable is NEXT-INVN-CTL-NBR
	*  @param value
	**/
   public void setNextInvnCtlNbr(char[] value) {
      nextInvnCtlNbr = checkNextInvnCtlNbrConstraints(value);
      serializeNextInvnCtlNbr(nextInvnCtlNbr);
   } 

     /**
	 * 	Update NextInvnCtlNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setNextInvnCtlNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginNextInvnCtlNbr,nextInvnCtlNbr.length);
   	
   }
   
   public void setNextInvnCtlNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginNextInvnCtlNbr,nextInvnCtlNbr.length);
   	
   }
   
     /**
	 * 	Update NextInvnCtlNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setNextInvnCtlNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNextInvnCtlNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update NextInvnCtlNbr with another Field
	 *	@param value
	 */
   public void setNextInvnCtlNbr(Field source) {
       replace(source,0,source.length(),beginNextInvnCtlNbr,NEXT_INVN_CTL_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update NextInvnCtlNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setNextInvnCtlNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginNextInvnCtlNbr,NEXT_INVN_CTL_NBR_LEN);
   	
   }
   
     /**
	 * 	Update NextInvnCtlNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setNextInvnCtlNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNextInvnCtlNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of nextIcnSufxCd
	 *	@return nextIcnSufxCd
	 */
   public char[] getNextIcnSufxCd() throws CFException{
     if (isNextIcnSufxCdModified()) { 
        nextIcnSufxCd = refreshNextIcnSufxCd();
     }
   		return nextIcnSufxCd;
   }

  
	/**
	*  set variable nextIcnSufxCd
	*  Corresponding COBOL Variable is NEXT-ICN-SUFX-CD
	*  @param value
	**/
   public void setNextIcnSufxCd(char[] value) {
      nextIcnSufxCd = checkNextIcnSufxCdConstraints(value);
      serializeNextIcnSufxCd(nextIcnSufxCd);
   } 

     /**
	 * 	Update NextIcnSufxCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setNextIcnSufxCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginNextIcnSufxCd,nextIcnSufxCd.length);
   	
   }
   
   public void setNextIcnSufxCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginNextIcnSufxCd,nextIcnSufxCd.length);
   	
   }
   
     /**
	 * 	Update NextIcnSufxCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setNextIcnSufxCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNextIcnSufxCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update NextIcnSufxCd with another Field
	 *	@param value
	 */
   public void setNextIcnSufxCd(Field source) {
       replace(source,0,source.length(),beginNextIcnSufxCd,NEXT_ICN_SUFX_CD_LEN);
   	
   }  
   
     /**
	 * 	Update NextIcnSufxCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setNextIcnSufxCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginNextIcnSufxCd,NEXT_ICN_SUFX_CD_LEN);
   	
   }
   
     /**
	 * 	Update NextIcnSufxCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setNextIcnSufxCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNextIcnSufxCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of nextLnId
	 *	@return nextLnId
	 */
	public int getNextLnId() throws CFException {
       if (isNextLnIdModified()) { 
           nextLnId = refreshNextLnId();
        }
   		return nextLnId;
	}
	

	
	   
	/**
	 * 	Update NextLnId with the passed value
	 *  Corresponding COBOL Variable is NEXT-LN-ID
	 *	@param number
	 */
	public void setNextLnId(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    nextLnId = checkNextLnIdMaxLimit(number); 
		serializeNextLnId(nextLnId);
	}
	

	public void setNextLnId(long number) {
	    number = checkNextLnIdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setNextLnId((int)number);
	}
	
	/**
	 * 	Update NextLnId with the passed value
	 *	@param value (String or char[])
	 */
	public void setNextLnId(char[] value) throws CFException {
		 nextLnId = serializeNextLnId(value);
	}
	/**
	 * 	Update NextLnId with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNextLnIdString(char[] value) throws CFException {
		 setNextLnId(value);
	}
	/**
	 *	Returns the value of nextHeaderCt
	 *	@return nextHeaderCt
	 */
	public int getNextHeaderCt() throws CFException {
       if (isNextHeaderCtModified()) { 
           nextHeaderCt = refreshNextHeaderCt();
        }
   		return nextHeaderCt;
	}
	

	
	   
	/**
	 * 	Update NextHeaderCt with the passed value
	 *  Corresponding COBOL Variable is NEXT-HEADER-CT
	 *	@param number
	 */
	public void setNextHeaderCt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    nextHeaderCt = checkNextHeaderCtMaxLimit(number); 
		serializeNextHeaderCt(nextHeaderCt);
	}
	

	public void setNextHeaderCt(long number) {
	    number = checkNextHeaderCtMaxLimit(number); // Truncate if value is beyond +/- Max range
		setNextHeaderCt((int)number);
	}
	
	/**
	 * 	Update NextHeaderCt with the passed value
	 *	@param value (String or char[])
	 */
	public void setNextHeaderCt(char[] value) throws CFException {
		 nextHeaderCt = serializeNextHeaderCt(value);
	}
	/**
	 * 	Update NextHeaderCt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNextHeaderCtString(char[] value) throws CFException {
		 setNextHeaderCt(value);
	}

	
	
	

		public static int getNextKeyFieldLength() {
			return NEXT_KEY_LENGTH;
		}

}
  
