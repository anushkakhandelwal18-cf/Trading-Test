package com.cloudframe.app.dto.d529351u;

/**
*  The class DclfeSpiRuleIcd is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:50. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class DclfeSpiRuleIcd extends DclfeSpiRuleIcdSerialized { 
   

						private char[] ricdSpiTblId = Field.fillLowValue(7);

						private char[] ricdStsCd = Field.fillLowValue(1);

								private short ricdClmIcdSeqNbr;

						private char[] ricdDerivPlOfSvcCd = Field.fillLowValue(2);

						private char[] ricdDerivSvcCd = Field.fillLowValue(6);

						private char[] ricdDerivCausCd = Field.fillLowValue(1);

						private char[] ricdCreatDttm = Field.fillLowValue(26);

						private char[] ricdClmIcdInd = Field.fillLowValue(1);

						private char[] ricdClmIcdFromCd = Field.fillLowValue(7);

						private char[] ricdClmIcdToCd = Field.fillLowValue(7);

						private char[] ricdPgmId = Field.fillLowValue(8);

						private char[] ricdLstUpdtDttm = Field.fillLowValue(26);

						private char[] ricdLstUpdtUserId = Field.fillLowValue(9);
	
	/**
	* Constructor for DclfeSpiRuleIcd
	**/
    public DclfeSpiRuleIcd() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ricdSpiTblId
	 *	@return ricdSpiTblId
	 */
   public char[] getRicdSpiTblId() throws CFException{
     if (isRicdSpiTblIdModified()) { 
        ricdSpiTblId = refreshRicdSpiTblId();
     }
   		return ricdSpiTblId;
   }

  
	/**
	*  set variable ricdSpiTblId
	*  Corresponding COBOL Variable is RICD-SPI-TBL-ID
	*  @param value
	**/
   public void setRicdSpiTblId(char[] value) {
      ricdSpiTblId = checkRicdSpiTblIdConstraints(value);
      serializeRicdSpiTblId(ricdSpiTblId);
   } 

     /**
	 * 	Update RicdSpiTblId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRicdSpiTblId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRicdSpiTblId,ricdSpiTblId.length);
   	
   }
   
   public void setRicdSpiTblId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRicdSpiTblId,ricdSpiTblId.length);
   	
   }
   
     /**
	 * 	Update RicdSpiTblId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRicdSpiTblId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRicdSpiTblId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RicdSpiTblId with another Field
	 *	@param value
	 */
   public void setRicdSpiTblId(Field source) {
       replace(source,0,source.length(),beginRicdSpiTblId,RICD_SPI_TBL_ID_LEN);
   	
   }  
   
     /**
	 * 	Update RicdSpiTblId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRicdSpiTblId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRicdSpiTblId,RICD_SPI_TBL_ID_LEN);
   	
   }
   
     /**
	 * 	Update RicdSpiTblId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRicdSpiTblId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRicdSpiTblId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ricdStsCd
	 *	@return ricdStsCd
	 */
   public char[] getRicdStsCd() throws CFException{
     if (isRicdStsCdModified()) { 
        ricdStsCd = refreshRicdStsCd();
     }
   		return ricdStsCd;
   }

  
	/**
	*  set variable ricdStsCd
	*  Corresponding COBOL Variable is RICD-STS-CD
	*  @param value
	**/
   public void setRicdStsCd(char[] value) {
      ricdStsCd = checkRicdStsCdConstraints(value);
      serializeRicdStsCd(ricdStsCd);
   } 

     /**
	 * 	Update RicdStsCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRicdStsCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRicdStsCd,ricdStsCd.length);
   	
   }
   
   public void setRicdStsCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRicdStsCd,ricdStsCd.length);
   	
   }
   
     /**
	 * 	Update RicdStsCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRicdStsCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRicdStsCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RicdStsCd with another Field
	 *	@param value
	 */
   public void setRicdStsCd(Field source) {
       replace(source,0,source.length(),beginRicdStsCd,RICD_STS_CD_LEN);
   	
   }  
   
     /**
	 * 	Update RicdStsCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRicdStsCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRicdStsCd,RICD_STS_CD_LEN);
   	
   }
   
     /**
	 * 	Update RicdStsCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRicdStsCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRicdStsCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ricdClmIcdSeqNbr
	 *	@return ricdClmIcdSeqNbr
	 */
	public short getRicdClmIcdSeqNbr() throws CFException {
        if (isRicdClmIcdSeqNbrModified()) { 
           ricdClmIcdSeqNbr = refreshRicdClmIcdSeqNbr();
        }
   		return ricdClmIcdSeqNbr;
	}
	
	/**
	 * 	Update RicdClmIcdSeqNbr with the passed value
	 *  Corresponding COBOL Variable is RICD-CLM-ICD-SEQ-NBR
	 *	@param number
	 */
	public void setRicdClmIcdSeqNbr(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ricdClmIcdSeqNbr = checkRicdClmIcdSeqNbrMaxLimit(number); 
		serializeRicdClmIcdSeqNbr(ricdClmIcdSeqNbr);
	}

	public void setRicdClmIcdSeqNbr(int number) {
	    number = checkRicdClmIcdSeqNbrMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setRicdClmIcdSeqNbr((short)number);
	}
	public void setRicdClmIcdSeqNbr(long number) {
	    number = checkRicdClmIcdSeqNbrMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setRicdClmIcdSeqNbr((short)number);
	}
	

	/**
	 *	Returns the value of ricdDerivPlOfSvcCd
	 *	@return ricdDerivPlOfSvcCd
	 */
   public char[] getRicdDerivPlOfSvcCd() throws CFException{
     if (isRicdDerivPlOfSvcCdModified()) { 
        ricdDerivPlOfSvcCd = refreshRicdDerivPlOfSvcCd();
     }
   		return ricdDerivPlOfSvcCd;
   }

  
	/**
	*  set variable ricdDerivPlOfSvcCd
	*  Corresponding COBOL Variable is RICD-DERIV-PL-OF-SVC-CD
	*  @param value
	**/
   public void setRicdDerivPlOfSvcCd(char[] value) {
      ricdDerivPlOfSvcCd = checkRicdDerivPlOfSvcCdConstraints(value);
      serializeRicdDerivPlOfSvcCd(ricdDerivPlOfSvcCd);
   } 

     /**
	 * 	Update RicdDerivPlOfSvcCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRicdDerivPlOfSvcCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRicdDerivPlOfSvcCd,ricdDerivPlOfSvcCd.length);
   	
   }
   
   public void setRicdDerivPlOfSvcCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRicdDerivPlOfSvcCd,ricdDerivPlOfSvcCd.length);
   	
   }
   
     /**
	 * 	Update RicdDerivPlOfSvcCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRicdDerivPlOfSvcCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRicdDerivPlOfSvcCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RicdDerivPlOfSvcCd with another Field
	 *	@param value
	 */
   public void setRicdDerivPlOfSvcCd(Field source) {
       replace(source,0,source.length(),beginRicdDerivPlOfSvcCd,RICD_DERIV_PL_OF_SVC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update RicdDerivPlOfSvcCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRicdDerivPlOfSvcCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRicdDerivPlOfSvcCd,RICD_DERIV_PL_OF_SVC_CD_LEN);
   	
   }
   
     /**
	 * 	Update RicdDerivPlOfSvcCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRicdDerivPlOfSvcCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRicdDerivPlOfSvcCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ricdDerivSvcCd
	 *	@return ricdDerivSvcCd
	 */
   public char[] getRicdDerivSvcCd() throws CFException{
     if (isRicdDerivSvcCdModified()) { 
        ricdDerivSvcCd = refreshRicdDerivSvcCd();
     }
   		return ricdDerivSvcCd;
   }

  
	/**
	*  set variable ricdDerivSvcCd
	*  Corresponding COBOL Variable is RICD-DERIV-SVC-CD
	*  @param value
	**/
   public void setRicdDerivSvcCd(char[] value) {
      ricdDerivSvcCd = checkRicdDerivSvcCdConstraints(value);
      serializeRicdDerivSvcCd(ricdDerivSvcCd);
   } 

     /**
	 * 	Update RicdDerivSvcCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRicdDerivSvcCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRicdDerivSvcCd,ricdDerivSvcCd.length);
   	
   }
   
   public void setRicdDerivSvcCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRicdDerivSvcCd,ricdDerivSvcCd.length);
   	
   }
   
     /**
	 * 	Update RicdDerivSvcCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRicdDerivSvcCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRicdDerivSvcCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RicdDerivSvcCd with another Field
	 *	@param value
	 */
   public void setRicdDerivSvcCd(Field source) {
       replace(source,0,source.length(),beginRicdDerivSvcCd,RICD_DERIV_SVC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update RicdDerivSvcCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRicdDerivSvcCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRicdDerivSvcCd,RICD_DERIV_SVC_CD_LEN);
   	
   }
   
     /**
	 * 	Update RicdDerivSvcCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRicdDerivSvcCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRicdDerivSvcCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ricdDerivCausCd
	 *	@return ricdDerivCausCd
	 */
   public char[] getRicdDerivCausCd() throws CFException{
     if (isRicdDerivCausCdModified()) { 
        ricdDerivCausCd = refreshRicdDerivCausCd();
     }
   		return ricdDerivCausCd;
   }

  
	/**
	*  set variable ricdDerivCausCd
	*  Corresponding COBOL Variable is RICD-DERIV-CAUS-CD
	*  @param value
	**/
   public void setRicdDerivCausCd(char[] value) {
      ricdDerivCausCd = checkRicdDerivCausCdConstraints(value);
      serializeRicdDerivCausCd(ricdDerivCausCd);
   } 

     /**
	 * 	Update RicdDerivCausCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRicdDerivCausCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRicdDerivCausCd,ricdDerivCausCd.length);
   	
   }
   
   public void setRicdDerivCausCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRicdDerivCausCd,ricdDerivCausCd.length);
   	
   }
   
     /**
	 * 	Update RicdDerivCausCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRicdDerivCausCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRicdDerivCausCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RicdDerivCausCd with another Field
	 *	@param value
	 */
   public void setRicdDerivCausCd(Field source) {
       replace(source,0,source.length(),beginRicdDerivCausCd,RICD_DERIV_CAUS_CD_LEN);
   	
   }  
   
     /**
	 * 	Update RicdDerivCausCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRicdDerivCausCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRicdDerivCausCd,RICD_DERIV_CAUS_CD_LEN);
   	
   }
   
     /**
	 * 	Update RicdDerivCausCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRicdDerivCausCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRicdDerivCausCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ricdCreatDttm
	 *	@return ricdCreatDttm
	 */
   public char[] getRicdCreatDttm() throws CFException{
     if (isRicdCreatDttmModified()) { 
        ricdCreatDttm = refreshRicdCreatDttm();
     }
   		return ricdCreatDttm;
   }

  
	/**
	*  set variable ricdCreatDttm
	*  Corresponding COBOL Variable is RICD-CREAT-DTTM
	*  @param value
	**/
   public void setRicdCreatDttm(char[] value) {
      ricdCreatDttm = checkRicdCreatDttmConstraints(value);
      serializeRicdCreatDttm(ricdCreatDttm);
   } 

     /**
	 * 	Update RicdCreatDttm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRicdCreatDttm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRicdCreatDttm,ricdCreatDttm.length);
   	
   }
   
   public void setRicdCreatDttm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRicdCreatDttm,ricdCreatDttm.length);
   	
   }
   
     /**
	 * 	Update RicdCreatDttm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRicdCreatDttm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRicdCreatDttm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RicdCreatDttm with another Field
	 *	@param value
	 */
   public void setRicdCreatDttm(Field source) {
       replace(source,0,source.length(),beginRicdCreatDttm,RICD_CREAT_DTTM_LEN);
   	
   }  
   
     /**
	 * 	Update RicdCreatDttm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRicdCreatDttm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRicdCreatDttm,RICD_CREAT_DTTM_LEN);
   	
   }
   
     /**
	 * 	Update RicdCreatDttm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRicdCreatDttm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRicdCreatDttm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ricdClmIcdInd
	 *	@return ricdClmIcdInd
	 */
   public char[] getRicdClmIcdInd() throws CFException{
     if (isRicdClmIcdIndModified()) { 
        ricdClmIcdInd = refreshRicdClmIcdInd();
     }
   		return ricdClmIcdInd;
   }

  
	/**
	*  set variable ricdClmIcdInd
	*  Corresponding COBOL Variable is RICD-CLM-ICD-IND
	*  @param value
	**/
   public void setRicdClmIcdInd(char[] value) {
      ricdClmIcdInd = checkRicdClmIcdIndConstraints(value);
      serializeRicdClmIcdInd(ricdClmIcdInd);
   } 

     /**
	 * 	Update RicdClmIcdInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRicdClmIcdInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRicdClmIcdInd,ricdClmIcdInd.length);
   	
   }
   
   public void setRicdClmIcdInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRicdClmIcdInd,ricdClmIcdInd.length);
   	
   }
   
     /**
	 * 	Update RicdClmIcdInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRicdClmIcdInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRicdClmIcdInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RicdClmIcdInd with another Field
	 *	@param value
	 */
   public void setRicdClmIcdInd(Field source) {
       replace(source,0,source.length(),beginRicdClmIcdInd,RICD_CLM_ICD_IND_LEN);
   	
   }  
   
     /**
	 * 	Update RicdClmIcdInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRicdClmIcdInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRicdClmIcdInd,RICD_CLM_ICD_IND_LEN);
   	
   }
   
     /**
	 * 	Update RicdClmIcdInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRicdClmIcdInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRicdClmIcdInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ricdClmIcdFromCd
	 *	@return ricdClmIcdFromCd
	 */
   public char[] getRicdClmIcdFromCd() throws CFException{
     if (isRicdClmIcdFromCdModified()) { 
        ricdClmIcdFromCd = refreshRicdClmIcdFromCd();
     }
   		return ricdClmIcdFromCd;
   }

  
	/**
	*  set variable ricdClmIcdFromCd
	*  Corresponding COBOL Variable is RICD-CLM-ICD-FROM-CD
	*  @param value
	**/
   public void setRicdClmIcdFromCd(char[] value) {
      ricdClmIcdFromCd = checkRicdClmIcdFromCdConstraints(value);
      serializeRicdClmIcdFromCd(ricdClmIcdFromCd);
   } 

     /**
	 * 	Update RicdClmIcdFromCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRicdClmIcdFromCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRicdClmIcdFromCd,ricdClmIcdFromCd.length);
   	
   }
   
   public void setRicdClmIcdFromCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRicdClmIcdFromCd,ricdClmIcdFromCd.length);
   	
   }
   
     /**
	 * 	Update RicdClmIcdFromCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRicdClmIcdFromCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRicdClmIcdFromCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RicdClmIcdFromCd with another Field
	 *	@param value
	 */
   public void setRicdClmIcdFromCd(Field source) {
       replace(source,0,source.length(),beginRicdClmIcdFromCd,RICD_CLM_ICD_FROM_CD_LEN);
   	
   }  
   
     /**
	 * 	Update RicdClmIcdFromCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRicdClmIcdFromCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRicdClmIcdFromCd,RICD_CLM_ICD_FROM_CD_LEN);
   	
   }
   
     /**
	 * 	Update RicdClmIcdFromCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRicdClmIcdFromCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRicdClmIcdFromCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ricdClmIcdToCd
	 *	@return ricdClmIcdToCd
	 */
   public char[] getRicdClmIcdToCd() throws CFException{
     if (isRicdClmIcdToCdModified()) { 
        ricdClmIcdToCd = refreshRicdClmIcdToCd();
     }
   		return ricdClmIcdToCd;
   }

  
	/**
	*  set variable ricdClmIcdToCd
	*  Corresponding COBOL Variable is RICD-CLM-ICD-TO-CD
	*  @param value
	**/
   public void setRicdClmIcdToCd(char[] value) {
      ricdClmIcdToCd = checkRicdClmIcdToCdConstraints(value);
      serializeRicdClmIcdToCd(ricdClmIcdToCd);
   } 

     /**
	 * 	Update RicdClmIcdToCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRicdClmIcdToCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRicdClmIcdToCd,ricdClmIcdToCd.length);
   	
   }
   
   public void setRicdClmIcdToCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRicdClmIcdToCd,ricdClmIcdToCd.length);
   	
   }
   
     /**
	 * 	Update RicdClmIcdToCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRicdClmIcdToCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRicdClmIcdToCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RicdClmIcdToCd with another Field
	 *	@param value
	 */
   public void setRicdClmIcdToCd(Field source) {
       replace(source,0,source.length(),beginRicdClmIcdToCd,RICD_CLM_ICD_TO_CD_LEN);
   	
   }  
   
     /**
	 * 	Update RicdClmIcdToCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRicdClmIcdToCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRicdClmIcdToCd,RICD_CLM_ICD_TO_CD_LEN);
   	
   }
   
     /**
	 * 	Update RicdClmIcdToCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRicdClmIcdToCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRicdClmIcdToCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ricdPgmId
	 *	@return ricdPgmId
	 */
   public char[] getRicdPgmId() throws CFException{
     if (isRicdPgmIdModified()) { 
        ricdPgmId = refreshRicdPgmId();
     }
   		return ricdPgmId;
   }

  
	/**
	*  set variable ricdPgmId
	*  Corresponding COBOL Variable is RICD-PGM-ID
	*  @param value
	**/
   public void setRicdPgmId(char[] value) {
      ricdPgmId = checkRicdPgmIdConstraints(value);
      serializeRicdPgmId(ricdPgmId);
   } 

     /**
	 * 	Update RicdPgmId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRicdPgmId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRicdPgmId,ricdPgmId.length);
   	
   }
   
   public void setRicdPgmId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRicdPgmId,ricdPgmId.length);
   	
   }
   
     /**
	 * 	Update RicdPgmId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRicdPgmId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRicdPgmId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RicdPgmId with another Field
	 *	@param value
	 */
   public void setRicdPgmId(Field source) {
       replace(source,0,source.length(),beginRicdPgmId,RICD_PGM_ID_LEN);
   	
   }  
   
     /**
	 * 	Update RicdPgmId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRicdPgmId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRicdPgmId,RICD_PGM_ID_LEN);
   	
   }
   
     /**
	 * 	Update RicdPgmId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRicdPgmId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRicdPgmId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ricdLstUpdtDttm
	 *	@return ricdLstUpdtDttm
	 */
   public char[] getRicdLstUpdtDttm() throws CFException{
     if (isRicdLstUpdtDttmModified()) { 
        ricdLstUpdtDttm = refreshRicdLstUpdtDttm();
     }
   		return ricdLstUpdtDttm;
   }

  
	/**
	*  set variable ricdLstUpdtDttm
	*  Corresponding COBOL Variable is RICD-LST-UPDT-DTTM
	*  @param value
	**/
   public void setRicdLstUpdtDttm(char[] value) {
      ricdLstUpdtDttm = checkRicdLstUpdtDttmConstraints(value);
      serializeRicdLstUpdtDttm(ricdLstUpdtDttm);
   } 

     /**
	 * 	Update RicdLstUpdtDttm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRicdLstUpdtDttm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRicdLstUpdtDttm,ricdLstUpdtDttm.length);
   	
   }
   
   public void setRicdLstUpdtDttm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRicdLstUpdtDttm,ricdLstUpdtDttm.length);
   	
   }
   
     /**
	 * 	Update RicdLstUpdtDttm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRicdLstUpdtDttm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRicdLstUpdtDttm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RicdLstUpdtDttm with another Field
	 *	@param value
	 */
   public void setRicdLstUpdtDttm(Field source) {
       replace(source,0,source.length(),beginRicdLstUpdtDttm,RICD_LST_UPDT_DTTM_LEN);
   	
   }  
   
     /**
	 * 	Update RicdLstUpdtDttm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRicdLstUpdtDttm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRicdLstUpdtDttm,RICD_LST_UPDT_DTTM_LEN);
   	
   }
   
     /**
	 * 	Update RicdLstUpdtDttm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRicdLstUpdtDttm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRicdLstUpdtDttm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ricdLstUpdtUserId
	 *	@return ricdLstUpdtUserId
	 */
   public char[] getRicdLstUpdtUserId() throws CFException{
     if (isRicdLstUpdtUserIdModified()) { 
        ricdLstUpdtUserId = refreshRicdLstUpdtUserId();
     }
   		return ricdLstUpdtUserId;
   }

  
	/**
	*  set variable ricdLstUpdtUserId
	*  Corresponding COBOL Variable is RICD-LST-UPDT-USER-ID
	*  @param value
	**/
   public void setRicdLstUpdtUserId(char[] value) {
      ricdLstUpdtUserId = checkRicdLstUpdtUserIdConstraints(value);
      serializeRicdLstUpdtUserId(ricdLstUpdtUserId);
   } 

     /**
	 * 	Update RicdLstUpdtUserId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRicdLstUpdtUserId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRicdLstUpdtUserId,ricdLstUpdtUserId.length);
   	
   }
   
   public void setRicdLstUpdtUserId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRicdLstUpdtUserId,ricdLstUpdtUserId.length);
   	
   }
   
     /**
	 * 	Update RicdLstUpdtUserId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRicdLstUpdtUserId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRicdLstUpdtUserId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RicdLstUpdtUserId with another Field
	 *	@param value
	 */
   public void setRicdLstUpdtUserId(Field source) {
       replace(source,0,source.length(),beginRicdLstUpdtUserId,RICD_LST_UPDT_USER_ID_LEN);
   	
   }  
   
     /**
	 * 	Update RicdLstUpdtUserId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRicdLstUpdtUserId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRicdLstUpdtUserId,RICD_LST_UPDT_USER_ID_LEN);
   	
   }
   
     /**
	 * 	Update RicdLstUpdtUserId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRicdLstUpdtUserId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRicdLstUpdtUserId+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes DclfeSpiRuleIcd
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setRicdSpiTblId(CONSTANTS.SPACE_7);
         setRicdStsCd(CONSTANTS.SPACE);
         	setRicdClmIcdSeqNbr((short)0);
         setRicdDerivPlOfSvcCd(CONSTANTS.SPACE_2);
         setRicdDerivSvcCd(CONSTANTS.SPACE_6);
         setRicdDerivCausCd(CONSTANTS.SPACE);
         setRicdCreatDttm(CONSTANTS.SPACE_26);
         setRicdClmIcdInd(CONSTANTS.SPACE);
         setRicdClmIcdFromCd(CONSTANTS.SPACE_7);
         setRicdClmIcdToCd(CONSTANTS.SPACE_7);
         setRicdPgmId(CONSTANTS.SPACE_8);
         setRicdLstUpdtDttm(CONSTANTS.SPACE_26);
         setRicdLstUpdtUserId(CONSTANTS.SPACE_9);
   }

		public static int getDclfeSpiRuleIcdFieldLength() {
			return DCLFE_SPI_RULE_ICD_LENGTH;
		}

}
  
