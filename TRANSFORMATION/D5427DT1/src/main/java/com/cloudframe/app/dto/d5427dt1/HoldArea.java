package com.cloudframe.app.dto.d5427dt1;

/**
*  The class HoldArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class HoldArea extends HoldAreaSerialized { 
   

						private char[] hldInvnCtlNbr = new char[10];

						private char[] hldIcnSufxCd = new char[2];

						private char[] hldProcDt = new char[10];

						private char[] hldProcTm = new char[8];

						private char[] hldLstCharVal = new char[1];

								private short hldIcnSufxVersNbr;
	
	/**
	* Constructor for HoldArea
	**/
    public HoldArea() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setHldInvnCtlNbr(fillSpace(10));
								setHldIcnSufxCd(fillSpace(2));
								setHldProcDt(fillSpace(10));
								setHldProcTm(fillSpace(8));
								setHldLstCharVal(fillSpace(1));
								setHldIcnSufxVersNbr((short)0);
    }


 

	/**
	 *	Returns the value of hldInvnCtlNbr
	 *	@return hldInvnCtlNbr
	 */
   public char[] getHldInvnCtlNbr() throws CFException{
     if (isHldInvnCtlNbrModified()) { 
        hldInvnCtlNbr = refreshHldInvnCtlNbr();
     }
   		return hldInvnCtlNbr;
   }

  
	/**
	*  set variable hldInvnCtlNbr
	*  Corresponding COBOL Variable is HLD-INVN-CTL-NBR
	*  @param value
	**/
   public void setHldInvnCtlNbr(char[] value) {
      hldInvnCtlNbr = checkHldInvnCtlNbrConstraints(value);
      serializeHldInvnCtlNbr(hldInvnCtlNbr);
   } 

     /**
	 * 	Update HldInvnCtlNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHldInvnCtlNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHldInvnCtlNbr,hldInvnCtlNbr.length);
   	
   }
   
   public void setHldInvnCtlNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHldInvnCtlNbr,hldInvnCtlNbr.length);
   	
   }
   
     /**
	 * 	Update HldInvnCtlNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHldInvnCtlNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHldInvnCtlNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HldInvnCtlNbr with another Field
	 *	@param value
	 */
   public void setHldInvnCtlNbr(Field source) {
       replace(source,0,source.length(),beginHldInvnCtlNbr,HLD_INVN_CTL_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update HldInvnCtlNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHldInvnCtlNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHldInvnCtlNbr,HLD_INVN_CTL_NBR_LEN);
   	
   }
   
     /**
	 * 	Update HldInvnCtlNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHldInvnCtlNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHldInvnCtlNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hldIcnSufxCd
	 *	@return hldIcnSufxCd
	 */
   public char[] getHldIcnSufxCd() throws CFException{
     if (isHldIcnSufxCdModified()) { 
        hldIcnSufxCd = refreshHldIcnSufxCd();
     }
   		return hldIcnSufxCd;
   }

  
	/**
	*  set variable hldIcnSufxCd
	*  Corresponding COBOL Variable is HLD-ICN-SUFX-CD
	*  @param value
	**/
   public void setHldIcnSufxCd(char[] value) {
      hldIcnSufxCd = checkHldIcnSufxCdConstraints(value);
      serializeHldIcnSufxCd(hldIcnSufxCd);
   } 

     /**
	 * 	Update HldIcnSufxCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHldIcnSufxCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHldIcnSufxCd,hldIcnSufxCd.length);
   	
   }
   
   public void setHldIcnSufxCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHldIcnSufxCd,hldIcnSufxCd.length);
   	
   }
   
     /**
	 * 	Update HldIcnSufxCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHldIcnSufxCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHldIcnSufxCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HldIcnSufxCd with another Field
	 *	@param value
	 */
   public void setHldIcnSufxCd(Field source) {
       replace(source,0,source.length(),beginHldIcnSufxCd,HLD_ICN_SUFX_CD_LEN);
   	
   }  
   
     /**
	 * 	Update HldIcnSufxCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHldIcnSufxCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHldIcnSufxCd,HLD_ICN_SUFX_CD_LEN);
   	
   }
   
     /**
	 * 	Update HldIcnSufxCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHldIcnSufxCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHldIcnSufxCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hldProcDt
	 *	@return hldProcDt
	 */
   public char[] getHldProcDt() throws CFException{
     if (isHldProcDtModified()) { 
        hldProcDt = refreshHldProcDt();
     }
   		return hldProcDt;
   }

  
	/**
	*  set variable hldProcDt
	*  Corresponding COBOL Variable is HLD-PROC-DT
	*  @param value
	**/
   public void setHldProcDt(char[] value) {
      hldProcDt = checkHldProcDtConstraints(value);
      serializeHldProcDt(hldProcDt);
   } 

     /**
	 * 	Update HldProcDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHldProcDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHldProcDt,hldProcDt.length);
   	
   }
   
   public void setHldProcDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHldProcDt,hldProcDt.length);
   	
   }
   
     /**
	 * 	Update HldProcDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHldProcDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHldProcDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HldProcDt with another Field
	 *	@param value
	 */
   public void setHldProcDt(Field source) {
       replace(source,0,source.length(),beginHldProcDt,HLD_PROC_DT_LEN);
   	
   }  
   
     /**
	 * 	Update HldProcDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHldProcDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHldProcDt,HLD_PROC_DT_LEN);
   	
   }
   
     /**
	 * 	Update HldProcDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHldProcDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHldProcDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hldProcTm
	 *	@return hldProcTm
	 */
   public char[] getHldProcTm() throws CFException{
     if (isHldProcTmModified()) { 
        hldProcTm = refreshHldProcTm();
     }
   		return hldProcTm;
   }

  
	/**
	*  set variable hldProcTm
	*  Corresponding COBOL Variable is HLD-PROC-TM
	*  @param value
	**/
   public void setHldProcTm(char[] value) {
      hldProcTm = checkHldProcTmConstraints(value);
      serializeHldProcTm(hldProcTm);
   } 

     /**
	 * 	Update HldProcTm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHldProcTm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHldProcTm,hldProcTm.length);
   	
   }
   
   public void setHldProcTm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHldProcTm,hldProcTm.length);
   	
   }
   
     /**
	 * 	Update HldProcTm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHldProcTm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHldProcTm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HldProcTm with another Field
	 *	@param value
	 */
   public void setHldProcTm(Field source) {
       replace(source,0,source.length(),beginHldProcTm,HLD_PROC_TM_LEN);
   	
   }  
   
     /**
	 * 	Update HldProcTm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHldProcTm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHldProcTm,HLD_PROC_TM_LEN);
   	
   }
   
     /**
	 * 	Update HldProcTm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHldProcTm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHldProcTm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hldLstCharVal
	 *	@return hldLstCharVal
	 */
   public char[] getHldLstCharVal() throws CFException{
     if (isHldLstCharValModified()) { 
        hldLstCharVal = refreshHldLstCharVal();
     }
   		return hldLstCharVal;
   }

  
	/**
	*  set variable hldLstCharVal
	*  Corresponding COBOL Variable is HLD-LST-CHAR-VAL
	*  @param value
	**/
   public void setHldLstCharVal(char[] value) {
      hldLstCharVal = checkHldLstCharValConstraints(value);
      serializeHldLstCharVal(hldLstCharVal);
   } 

     /**
	 * 	Update HldLstCharVal 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHldLstCharVal(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHldLstCharVal,hldLstCharVal.length);
   	
   }
   
   public void setHldLstCharVal(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHldLstCharVal,hldLstCharVal.length);
   	
   }
   
     /**
	 * 	Update HldLstCharVal 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHldLstCharVal(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHldLstCharVal+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HldLstCharVal with another Field
	 *	@param value
	 */
   public void setHldLstCharVal(Field source) {
       replace(source,0,source.length(),beginHldLstCharVal,HLD_LST_CHAR_VAL_LEN);
   	
   }  
   
     /**
	 * 	Update HldLstCharVal 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHldLstCharVal(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHldLstCharVal,HLD_LST_CHAR_VAL_LEN);
   	
   }
   
     /**
	 * 	Update HldLstCharVal 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHldLstCharVal(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHldLstCharVal+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hldIcnSufxVersNbr
	 *	@return hldIcnSufxVersNbr
	 */
	public short getHldIcnSufxVersNbr() throws CFException {
        if (isHldIcnSufxVersNbrModified()) { 
           hldIcnSufxVersNbr = refreshHldIcnSufxVersNbr();
        }
   		return hldIcnSufxVersNbr;
	}
	
	/**
	 * 	Update HldIcnSufxVersNbr with the passed value
	 *  Corresponding COBOL Variable is HLD-ICN-SUFX-VERS-NBR
	 *	@param number
	 */
	public void setHldIcnSufxVersNbr(short number) {
	     // Truncate if the number is beyond +/- Max range
	    hldIcnSufxVersNbr = checkHldIcnSufxVersNbrMaxLimit(number); 
		serializeHldIcnSufxVersNbr(hldIcnSufxVersNbr);
	}

	public void setHldIcnSufxVersNbr(int number) {
	    number = checkHldIcnSufxVersNbrMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setHldIcnSufxVersNbr((short)number);
	}
	public void setHldIcnSufxVersNbr(long number) {
	    number = checkHldIcnSufxVersNbrMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setHldIcnSufxVersNbr((short)number);
	}
	


	
	
	
	/**
	 * 	initializes HoldArea
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setHldInvnCtlNbr(CONSTANTS.SPACE_10);
         setHldIcnSufxCd(CONSTANTS.SPACE_2);
         setHldProcDt(CONSTANTS.SPACE_10);
         setHldProcTm(CONSTANTS.SPACE_8);
         setHldLstCharVal(CONSTANTS.SPACE);
         	setHldIcnSufxVersNbr((short)0);
   }

		public static int getHoldAreaFieldLength() {
			return HOLD_AREA_LENGTH;
		}

}
  
