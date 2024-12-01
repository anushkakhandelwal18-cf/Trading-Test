package com.cloudframe.app.dto.d5427dt1;

/**
*  The class HvNextKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HvNextKey extends HvNextKeySerialized { 
   

						private char[] hvNextProcDt = new char[10];

						private char[] hvNextProcTm = new char[8];

						private char[] hvNextPgmIdLstCharVal = new char[1];

								private short hvNextIcnSufxVersNbr;

						private char[] hvNextInvnCtlNbr = new char[10];

						private char[] hvNextIcnSufxCd = new char[3];

								private short hvNextLnId;
	
	/**
	* Constructor for HvNextKey
	**/
    public HvNextKey() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for HvNextKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HvNextKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setHvNextProcDt(("9999-12-31").toCharArray());
								setHvNextProcTm(("23.59.59").toCharArray());
								setHvNextPgmIdLstCharVal(("9").toCharArray());
								setHvNextIcnSufxVersNbr((short)9999);
								setHvNextInvnCtlNbr(("0000000000").toCharArray());
								setHvNextIcnSufxCd(("999").toCharArray());
								setHvNextLnId((short)9999);
    } 

	/**
	 *	Returns the value of hvNextProcDt
	 *	@return hvNextProcDt
	 */
   public char[] getHvNextProcDt() throws CFException{
     if (isHvNextProcDtModified()) { 
        hvNextProcDt = refreshHvNextProcDt();
     }
   		return hvNextProcDt;
   }

  
	/**
	*  set variable hvNextProcDt
	*  Corresponding COBOL Variable is HV-NEXT-PROC-DT
	*  @param value
	**/
   public void setHvNextProcDt(char[] value) {
      hvNextProcDt = checkHvNextProcDtConstraints(value);
      serializeHvNextProcDt(hvNextProcDt);
   } 

     /**
	 * 	Update HvNextProcDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHvNextProcDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHvNextProcDt,hvNextProcDt.length);
   	
   }
   
   public void setHvNextProcDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHvNextProcDt,hvNextProcDt.length);
   	
   }
   
     /**
	 * 	Update HvNextProcDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvNextProcDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvNextProcDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HvNextProcDt with another Field
	 *	@param value
	 */
   public void setHvNextProcDt(Field source) {
       replace(source,0,source.length(),beginHvNextProcDt,HV_NEXT_PROC_DT_LEN);
   	
   }  
   
     /**
	 * 	Update HvNextProcDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHvNextProcDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHvNextProcDt,HV_NEXT_PROC_DT_LEN);
   	
   }
   
     /**
	 * 	Update HvNextProcDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvNextProcDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvNextProcDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hvNextProcTm
	 *	@return hvNextProcTm
	 */
   public char[] getHvNextProcTm() throws CFException{
     if (isHvNextProcTmModified()) { 
        hvNextProcTm = refreshHvNextProcTm();
     }
   		return hvNextProcTm;
   }

  
	/**
	*  set variable hvNextProcTm
	*  Corresponding COBOL Variable is HV-NEXT-PROC-TM
	*  @param value
	**/
   public void setHvNextProcTm(char[] value) {
      hvNextProcTm = checkHvNextProcTmConstraints(value);
      serializeHvNextProcTm(hvNextProcTm);
   } 

     /**
	 * 	Update HvNextProcTm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHvNextProcTm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHvNextProcTm,hvNextProcTm.length);
   	
   }
   
   public void setHvNextProcTm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHvNextProcTm,hvNextProcTm.length);
   	
   }
   
     /**
	 * 	Update HvNextProcTm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvNextProcTm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvNextProcTm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HvNextProcTm with another Field
	 *	@param value
	 */
   public void setHvNextProcTm(Field source) {
       replace(source,0,source.length(),beginHvNextProcTm,HV_NEXT_PROC_TM_LEN);
   	
   }  
   
     /**
	 * 	Update HvNextProcTm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHvNextProcTm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHvNextProcTm,HV_NEXT_PROC_TM_LEN);
   	
   }
   
     /**
	 * 	Update HvNextProcTm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvNextProcTm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvNextProcTm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hvNextPgmIdLstCharVal
	 *	@return hvNextPgmIdLstCharVal
	 */
   public char[] getHvNextPgmIdLstCharVal() throws CFException{
     if (isHvNextPgmIdLstCharValModified()) { 
        hvNextPgmIdLstCharVal = refreshHvNextPgmIdLstCharVal();
     }
   		return hvNextPgmIdLstCharVal;
   }

  
	/**
	*  set variable hvNextPgmIdLstCharVal
	*  Corresponding COBOL Variable is HV-NEXT-PGM_ID_LST_CHAR_VAL
	*  @param value
	**/
   public void setHvNextPgmIdLstCharVal(char[] value) {
      hvNextPgmIdLstCharVal = checkHvNextPgmIdLstCharValConstraints(value);
      serializeHvNextPgmIdLstCharVal(hvNextPgmIdLstCharVal);
   } 

     /**
	 * 	Update HvNextPgmIdLstCharVal 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHvNextPgmIdLstCharVal(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHvNextPgmIdLstCharVal,hvNextPgmIdLstCharVal.length);
   	
   }
   
   public void setHvNextPgmIdLstCharVal(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHvNextPgmIdLstCharVal,hvNextPgmIdLstCharVal.length);
   	
   }
   
     /**
	 * 	Update HvNextPgmIdLstCharVal 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvNextPgmIdLstCharVal(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvNextPgmIdLstCharVal+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HvNextPgmIdLstCharVal with another Field
	 *	@param value
	 */
   public void setHvNextPgmIdLstCharVal(Field source) {
       replace(source,0,source.length(),beginHvNextPgmIdLstCharVal,HV_NEXT_PGM_ID_LST_CHAR_VAL_LEN);
   	
   }  
   
     /**
	 * 	Update HvNextPgmIdLstCharVal 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHvNextPgmIdLstCharVal(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHvNextPgmIdLstCharVal,HV_NEXT_PGM_ID_LST_CHAR_VAL_LEN);
   	
   }
   
     /**
	 * 	Update HvNextPgmIdLstCharVal 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvNextPgmIdLstCharVal(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvNextPgmIdLstCharVal+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hvNextIcnSufxVersNbr
	 *	@return hvNextIcnSufxVersNbr
	 */
	public short getHvNextIcnSufxVersNbr() throws CFException {
        if (isHvNextIcnSufxVersNbrModified()) { 
           hvNextIcnSufxVersNbr = refreshHvNextIcnSufxVersNbr();
        }
   		return hvNextIcnSufxVersNbr;
	}
	
	/**
	 * 	Update HvNextIcnSufxVersNbr with the passed value
	 *  Corresponding COBOL Variable is HV-NEXT-ICN_SUFX_VERS_NBR
	 *	@param number
	 */
	public void setHvNextIcnSufxVersNbr(short number) {
	     // Truncate if the number is beyond +/- Max range
	    hvNextIcnSufxVersNbr = checkHvNextIcnSufxVersNbrMaxLimit(number); 
		serializeHvNextIcnSufxVersNbr(hvNextIcnSufxVersNbr);
	}

	public void setHvNextIcnSufxVersNbr(int number) {
	    number = checkHvNextIcnSufxVersNbrMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setHvNextIcnSufxVersNbr((short)number);
	}
	public void setHvNextIcnSufxVersNbr(long number) {
	    number = checkHvNextIcnSufxVersNbrMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setHvNextIcnSufxVersNbr((short)number);
	}
	

	/**
	 *	Returns the value of hvNextInvnCtlNbr
	 *	@return hvNextInvnCtlNbr
	 */
   public char[] getHvNextInvnCtlNbr() throws CFException{
     if (isHvNextInvnCtlNbrModified()) { 
        hvNextInvnCtlNbr = refreshHvNextInvnCtlNbr();
     }
   		return hvNextInvnCtlNbr;
   }

  
	/**
	*  set variable hvNextInvnCtlNbr
	*  Corresponding COBOL Variable is HV-NEXT-INVN-CTL-NBR
	*  @param value
	**/
   public void setHvNextInvnCtlNbr(char[] value) {
      hvNextInvnCtlNbr = checkHvNextInvnCtlNbrConstraints(value);
      serializeHvNextInvnCtlNbr(hvNextInvnCtlNbr);
   } 

     /**
	 * 	Update HvNextInvnCtlNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHvNextInvnCtlNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHvNextInvnCtlNbr,hvNextInvnCtlNbr.length);
   	
   }
   
   public void setHvNextInvnCtlNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHvNextInvnCtlNbr,hvNextInvnCtlNbr.length);
   	
   }
   
     /**
	 * 	Update HvNextInvnCtlNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvNextInvnCtlNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvNextInvnCtlNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HvNextInvnCtlNbr with another Field
	 *	@param value
	 */
   public void setHvNextInvnCtlNbr(Field source) {
       replace(source,0,source.length(),beginHvNextInvnCtlNbr,HV_NEXT_INVN_CTL_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update HvNextInvnCtlNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHvNextInvnCtlNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHvNextInvnCtlNbr,HV_NEXT_INVN_CTL_NBR_LEN);
   	
   }
   
     /**
	 * 	Update HvNextInvnCtlNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvNextInvnCtlNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvNextInvnCtlNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hvNextIcnSufxCd
	 *	@return hvNextIcnSufxCd
	 */
   public char[] getHvNextIcnSufxCd() throws CFException{
     if (isHvNextIcnSufxCdModified()) { 
        hvNextIcnSufxCd = refreshHvNextIcnSufxCd();
     }
   		return hvNextIcnSufxCd;
   }

  
	/**
	*  set variable hvNextIcnSufxCd
	*  Corresponding COBOL Variable is HV-NEXT-ICN_SUFX_CD
	*  @param value
	**/
   public void setHvNextIcnSufxCd(char[] value) {
      hvNextIcnSufxCd = checkHvNextIcnSufxCdConstraints(value);
      serializeHvNextIcnSufxCd(hvNextIcnSufxCd);
   } 

     /**
	 * 	Update HvNextIcnSufxCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHvNextIcnSufxCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHvNextIcnSufxCd,hvNextIcnSufxCd.length);
   	
   }
   
   public void setHvNextIcnSufxCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHvNextIcnSufxCd,hvNextIcnSufxCd.length);
   	
   }
   
     /**
	 * 	Update HvNextIcnSufxCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvNextIcnSufxCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvNextIcnSufxCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HvNextIcnSufxCd with another Field
	 *	@param value
	 */
   public void setHvNextIcnSufxCd(Field source) {
       replace(source,0,source.length(),beginHvNextIcnSufxCd,HV_NEXT_ICN_SUFX_CD_LEN);
   	
   }  
   
     /**
	 * 	Update HvNextIcnSufxCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHvNextIcnSufxCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHvNextIcnSufxCd,HV_NEXT_ICN_SUFX_CD_LEN);
   	
   }
   
     /**
	 * 	Update HvNextIcnSufxCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvNextIcnSufxCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvNextIcnSufxCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hvNextLnId
	 *	@return hvNextLnId
	 */
	public short getHvNextLnId() throws CFException {
        if (isHvNextLnIdModified()) { 
           hvNextLnId = refreshHvNextLnId();
        }
   		return hvNextLnId;
	}
	
	/**
	 * 	Update HvNextLnId with the passed value
	 *  Corresponding COBOL Variable is HV-NEXT-LN-ID
	 *	@param number
	 */
	public void setHvNextLnId(short number) {
	     // Truncate if the number is beyond +/- Max range
	    hvNextLnId = checkHvNextLnIdMaxLimit(number); 
		serializeHvNextLnId(hvNextLnId);
	}

	public void setHvNextLnId(int number) {
	    number = checkHvNextLnIdMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setHvNextLnId((short)number);
	}
	public void setHvNextLnId(long number) {
	    number = checkHvNextLnIdMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setHvNextLnId((short)number);
	}
	


	
	
	

		public static int getHvNextKeyFieldLength() {
			return HV_NEXT_KEY_LENGTH;
		}

}
  
