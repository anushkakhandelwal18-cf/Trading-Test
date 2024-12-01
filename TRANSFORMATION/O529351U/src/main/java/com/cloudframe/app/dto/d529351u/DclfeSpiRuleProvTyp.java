package com.cloudframe.app.dto.d529351u;

/**
*  The class DclfeSpiRuleProvTyp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class DclfeSpiRuleProvTyp extends DclfeSpiRuleProvTypSerialized { 
   

						private char[] ptypSpiTblId = Field.fillLowValue(7);

						private char[] ptypStsCd = Field.fillLowValue(1);

								private short ptypProvTypSeqNbr;

						private char[] ptypDerivPlOfSvcCd = Field.fillLowValue(2);

						private char[] ptypDerivSvcCd = Field.fillLowValue(6);

						private char[] ptypDerivCausCd = Field.fillLowValue(1);

						private char[] ptypCreatDttm = Field.fillLowValue(26);

						private char[] ptypProvTyp = Field.fillLowValue(2);

						private char[] ptypPgmId = Field.fillLowValue(8);

						private char[] ptypLstUpdtDttm = Field.fillLowValue(26);

						private char[] ptypLstUpdtUserId = Field.fillLowValue(9);
	
	/**
	* Constructor for DclfeSpiRuleProvTyp
	**/
    public DclfeSpiRuleProvTyp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ptypSpiTblId
	 *	@return ptypSpiTblId
	 */
   public char[] getPtypSpiTblId() throws CFException{
     if (isPtypSpiTblIdModified()) { 
        ptypSpiTblId = refreshPtypSpiTblId();
     }
   		return ptypSpiTblId;
   }

  
	/**
	*  set variable ptypSpiTblId
	*  Corresponding COBOL Variable is PTYP-SPI-TBL-ID
	*  @param value
	**/
   public void setPtypSpiTblId(char[] value) {
      ptypSpiTblId = checkPtypSpiTblIdConstraints(value);
      serializePtypSpiTblId(ptypSpiTblId);
   } 

     /**
	 * 	Update PtypSpiTblId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPtypSpiTblId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPtypSpiTblId,ptypSpiTblId.length);
   	
   }
   
   public void setPtypSpiTblId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPtypSpiTblId,ptypSpiTblId.length);
   	
   }
   
     /**
	 * 	Update PtypSpiTblId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPtypSpiTblId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtypSpiTblId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PtypSpiTblId with another Field
	 *	@param value
	 */
   public void setPtypSpiTblId(Field source) {
       replace(source,0,source.length(),beginPtypSpiTblId,PTYP_SPI_TBL_ID_LEN);
   	
   }  
   
     /**
	 * 	Update PtypSpiTblId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPtypSpiTblId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPtypSpiTblId,PTYP_SPI_TBL_ID_LEN);
   	
   }
   
     /**
	 * 	Update PtypSpiTblId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPtypSpiTblId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtypSpiTblId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ptypStsCd
	 *	@return ptypStsCd
	 */
   public char[] getPtypStsCd() throws CFException{
     if (isPtypStsCdModified()) { 
        ptypStsCd = refreshPtypStsCd();
     }
   		return ptypStsCd;
   }

  
	/**
	*  set variable ptypStsCd
	*  Corresponding COBOL Variable is PTYP-STS-CD
	*  @param value
	**/
   public void setPtypStsCd(char[] value) {
      ptypStsCd = checkPtypStsCdConstraints(value);
      serializePtypStsCd(ptypStsCd);
   } 

     /**
	 * 	Update PtypStsCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPtypStsCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPtypStsCd,ptypStsCd.length);
   	
   }
   
   public void setPtypStsCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPtypStsCd,ptypStsCd.length);
   	
   }
   
     /**
	 * 	Update PtypStsCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPtypStsCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtypStsCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PtypStsCd with another Field
	 *	@param value
	 */
   public void setPtypStsCd(Field source) {
       replace(source,0,source.length(),beginPtypStsCd,PTYP_STS_CD_LEN);
   	
   }  
   
     /**
	 * 	Update PtypStsCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPtypStsCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPtypStsCd,PTYP_STS_CD_LEN);
   	
   }
   
     /**
	 * 	Update PtypStsCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPtypStsCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtypStsCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ptypProvTypSeqNbr
	 *	@return ptypProvTypSeqNbr
	 */
	public short getPtypProvTypSeqNbr() throws CFException {
        if (isPtypProvTypSeqNbrModified()) { 
           ptypProvTypSeqNbr = refreshPtypProvTypSeqNbr();
        }
   		return ptypProvTypSeqNbr;
	}
	
	/**
	 * 	Update PtypProvTypSeqNbr with the passed value
	 *  Corresponding COBOL Variable is PTYP-PROV-TYP-SEQ-NBR
	 *	@param number
	 */
	public void setPtypProvTypSeqNbr(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ptypProvTypSeqNbr = checkPtypProvTypSeqNbrMaxLimit(number); 
		serializePtypProvTypSeqNbr(ptypProvTypSeqNbr);
	}

	public void setPtypProvTypSeqNbr(int number) {
	    number = checkPtypProvTypSeqNbrMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPtypProvTypSeqNbr((short)number);
	}
	public void setPtypProvTypSeqNbr(long number) {
	    number = checkPtypProvTypSeqNbrMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPtypProvTypSeqNbr((short)number);
	}
	

	/**
	 *	Returns the value of ptypDerivPlOfSvcCd
	 *	@return ptypDerivPlOfSvcCd
	 */
   public char[] getPtypDerivPlOfSvcCd() throws CFException{
     if (isPtypDerivPlOfSvcCdModified()) { 
        ptypDerivPlOfSvcCd = refreshPtypDerivPlOfSvcCd();
     }
   		return ptypDerivPlOfSvcCd;
   }

  
	/**
	*  set variable ptypDerivPlOfSvcCd
	*  Corresponding COBOL Variable is PTYP-DERIV-PL-OF-SVC-CD
	*  @param value
	**/
   public void setPtypDerivPlOfSvcCd(char[] value) {
      ptypDerivPlOfSvcCd = checkPtypDerivPlOfSvcCdConstraints(value);
      serializePtypDerivPlOfSvcCd(ptypDerivPlOfSvcCd);
   } 

     /**
	 * 	Update PtypDerivPlOfSvcCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPtypDerivPlOfSvcCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPtypDerivPlOfSvcCd,ptypDerivPlOfSvcCd.length);
   	
   }
   
   public void setPtypDerivPlOfSvcCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPtypDerivPlOfSvcCd,ptypDerivPlOfSvcCd.length);
   	
   }
   
     /**
	 * 	Update PtypDerivPlOfSvcCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPtypDerivPlOfSvcCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtypDerivPlOfSvcCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PtypDerivPlOfSvcCd with another Field
	 *	@param value
	 */
   public void setPtypDerivPlOfSvcCd(Field source) {
       replace(source,0,source.length(),beginPtypDerivPlOfSvcCd,PTYP_DERIV_PL_OF_SVC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update PtypDerivPlOfSvcCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPtypDerivPlOfSvcCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPtypDerivPlOfSvcCd,PTYP_DERIV_PL_OF_SVC_CD_LEN);
   	
   }
   
     /**
	 * 	Update PtypDerivPlOfSvcCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPtypDerivPlOfSvcCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtypDerivPlOfSvcCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ptypDerivSvcCd
	 *	@return ptypDerivSvcCd
	 */
   public char[] getPtypDerivSvcCd() throws CFException{
     if (isPtypDerivSvcCdModified()) { 
        ptypDerivSvcCd = refreshPtypDerivSvcCd();
     }
   		return ptypDerivSvcCd;
   }

  
	/**
	*  set variable ptypDerivSvcCd
	*  Corresponding COBOL Variable is PTYP-DERIV-SVC-CD
	*  @param value
	**/
   public void setPtypDerivSvcCd(char[] value) {
      ptypDerivSvcCd = checkPtypDerivSvcCdConstraints(value);
      serializePtypDerivSvcCd(ptypDerivSvcCd);
   } 

     /**
	 * 	Update PtypDerivSvcCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPtypDerivSvcCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPtypDerivSvcCd,ptypDerivSvcCd.length);
   	
   }
   
   public void setPtypDerivSvcCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPtypDerivSvcCd,ptypDerivSvcCd.length);
   	
   }
   
     /**
	 * 	Update PtypDerivSvcCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPtypDerivSvcCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtypDerivSvcCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PtypDerivSvcCd with another Field
	 *	@param value
	 */
   public void setPtypDerivSvcCd(Field source) {
       replace(source,0,source.length(),beginPtypDerivSvcCd,PTYP_DERIV_SVC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update PtypDerivSvcCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPtypDerivSvcCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPtypDerivSvcCd,PTYP_DERIV_SVC_CD_LEN);
   	
   }
   
     /**
	 * 	Update PtypDerivSvcCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPtypDerivSvcCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtypDerivSvcCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ptypDerivCausCd
	 *	@return ptypDerivCausCd
	 */
   public char[] getPtypDerivCausCd() throws CFException{
     if (isPtypDerivCausCdModified()) { 
        ptypDerivCausCd = refreshPtypDerivCausCd();
     }
   		return ptypDerivCausCd;
   }

  
	/**
	*  set variable ptypDerivCausCd
	*  Corresponding COBOL Variable is PTYP-DERIV-CAUS-CD
	*  @param value
	**/
   public void setPtypDerivCausCd(char[] value) {
      ptypDerivCausCd = checkPtypDerivCausCdConstraints(value);
      serializePtypDerivCausCd(ptypDerivCausCd);
   } 

     /**
	 * 	Update PtypDerivCausCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPtypDerivCausCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPtypDerivCausCd,ptypDerivCausCd.length);
   	
   }
   
   public void setPtypDerivCausCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPtypDerivCausCd,ptypDerivCausCd.length);
   	
   }
   
     /**
	 * 	Update PtypDerivCausCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPtypDerivCausCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtypDerivCausCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PtypDerivCausCd with another Field
	 *	@param value
	 */
   public void setPtypDerivCausCd(Field source) {
       replace(source,0,source.length(),beginPtypDerivCausCd,PTYP_DERIV_CAUS_CD_LEN);
   	
   }  
   
     /**
	 * 	Update PtypDerivCausCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPtypDerivCausCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPtypDerivCausCd,PTYP_DERIV_CAUS_CD_LEN);
   	
   }
   
     /**
	 * 	Update PtypDerivCausCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPtypDerivCausCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtypDerivCausCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ptypCreatDttm
	 *	@return ptypCreatDttm
	 */
   public char[] getPtypCreatDttm() throws CFException{
     if (isPtypCreatDttmModified()) { 
        ptypCreatDttm = refreshPtypCreatDttm();
     }
   		return ptypCreatDttm;
   }

  
	/**
	*  set variable ptypCreatDttm
	*  Corresponding COBOL Variable is PTYP-CREAT-DTTM
	*  @param value
	**/
   public void setPtypCreatDttm(char[] value) {
      ptypCreatDttm = checkPtypCreatDttmConstraints(value);
      serializePtypCreatDttm(ptypCreatDttm);
   } 

     /**
	 * 	Update PtypCreatDttm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPtypCreatDttm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPtypCreatDttm,ptypCreatDttm.length);
   	
   }
   
   public void setPtypCreatDttm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPtypCreatDttm,ptypCreatDttm.length);
   	
   }
   
     /**
	 * 	Update PtypCreatDttm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPtypCreatDttm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtypCreatDttm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PtypCreatDttm with another Field
	 *	@param value
	 */
   public void setPtypCreatDttm(Field source) {
       replace(source,0,source.length(),beginPtypCreatDttm,PTYP_CREAT_DTTM_LEN);
   	
   }  
   
     /**
	 * 	Update PtypCreatDttm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPtypCreatDttm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPtypCreatDttm,PTYP_CREAT_DTTM_LEN);
   	
   }
   
     /**
	 * 	Update PtypCreatDttm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPtypCreatDttm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtypCreatDttm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ptypProvTyp
	 *	@return ptypProvTyp
	 */
   public char[] getPtypProvTyp() throws CFException{
     if (isPtypProvTypModified()) { 
        ptypProvTyp = refreshPtypProvTyp();
     }
   		return ptypProvTyp;
   }

  
	/**
	*  set variable ptypProvTyp
	*  Corresponding COBOL Variable is PTYP-PROV-TYP
	*  @param value
	**/
   public void setPtypProvTyp(char[] value) {
      ptypProvTyp = checkPtypProvTypConstraints(value);
      serializePtypProvTyp(ptypProvTyp);
   } 

     /**
	 * 	Update PtypProvTyp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPtypProvTyp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPtypProvTyp,ptypProvTyp.length);
   	
   }
   
   public void setPtypProvTyp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPtypProvTyp,ptypProvTyp.length);
   	
   }
   
     /**
	 * 	Update PtypProvTyp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPtypProvTyp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtypProvTyp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PtypProvTyp with another Field
	 *	@param value
	 */
   public void setPtypProvTyp(Field source) {
       replace(source,0,source.length(),beginPtypProvTyp,PTYP_PROV_TYP_LEN);
   	
   }  
   
     /**
	 * 	Update PtypProvTyp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPtypProvTyp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPtypProvTyp,PTYP_PROV_TYP_LEN);
   	
   }
   
     /**
	 * 	Update PtypProvTyp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPtypProvTyp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtypProvTyp+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ptypPgmId
	 *	@return ptypPgmId
	 */
   public char[] getPtypPgmId() throws CFException{
     if (isPtypPgmIdModified()) { 
        ptypPgmId = refreshPtypPgmId();
     }
   		return ptypPgmId;
   }

  
	/**
	*  set variable ptypPgmId
	*  Corresponding COBOL Variable is PTYP-PGM-ID
	*  @param value
	**/
   public void setPtypPgmId(char[] value) {
      ptypPgmId = checkPtypPgmIdConstraints(value);
      serializePtypPgmId(ptypPgmId);
   } 

     /**
	 * 	Update PtypPgmId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPtypPgmId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPtypPgmId,ptypPgmId.length);
   	
   }
   
   public void setPtypPgmId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPtypPgmId,ptypPgmId.length);
   	
   }
   
     /**
	 * 	Update PtypPgmId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPtypPgmId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtypPgmId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PtypPgmId with another Field
	 *	@param value
	 */
   public void setPtypPgmId(Field source) {
       replace(source,0,source.length(),beginPtypPgmId,PTYP_PGM_ID_LEN);
   	
   }  
   
     /**
	 * 	Update PtypPgmId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPtypPgmId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPtypPgmId,PTYP_PGM_ID_LEN);
   	
   }
   
     /**
	 * 	Update PtypPgmId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPtypPgmId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtypPgmId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ptypLstUpdtDttm
	 *	@return ptypLstUpdtDttm
	 */
   public char[] getPtypLstUpdtDttm() throws CFException{
     if (isPtypLstUpdtDttmModified()) { 
        ptypLstUpdtDttm = refreshPtypLstUpdtDttm();
     }
   		return ptypLstUpdtDttm;
   }

  
	/**
	*  set variable ptypLstUpdtDttm
	*  Corresponding COBOL Variable is PTYP-LST-UPDT-DTTM
	*  @param value
	**/
   public void setPtypLstUpdtDttm(char[] value) {
      ptypLstUpdtDttm = checkPtypLstUpdtDttmConstraints(value);
      serializePtypLstUpdtDttm(ptypLstUpdtDttm);
   } 

     /**
	 * 	Update PtypLstUpdtDttm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPtypLstUpdtDttm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPtypLstUpdtDttm,ptypLstUpdtDttm.length);
   	
   }
   
   public void setPtypLstUpdtDttm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPtypLstUpdtDttm,ptypLstUpdtDttm.length);
   	
   }
   
     /**
	 * 	Update PtypLstUpdtDttm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPtypLstUpdtDttm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtypLstUpdtDttm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PtypLstUpdtDttm with another Field
	 *	@param value
	 */
   public void setPtypLstUpdtDttm(Field source) {
       replace(source,0,source.length(),beginPtypLstUpdtDttm,PTYP_LST_UPDT_DTTM_LEN);
   	
   }  
   
     /**
	 * 	Update PtypLstUpdtDttm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPtypLstUpdtDttm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPtypLstUpdtDttm,PTYP_LST_UPDT_DTTM_LEN);
   	
   }
   
     /**
	 * 	Update PtypLstUpdtDttm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPtypLstUpdtDttm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtypLstUpdtDttm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ptypLstUpdtUserId
	 *	@return ptypLstUpdtUserId
	 */
   public char[] getPtypLstUpdtUserId() throws CFException{
     if (isPtypLstUpdtUserIdModified()) { 
        ptypLstUpdtUserId = refreshPtypLstUpdtUserId();
     }
   		return ptypLstUpdtUserId;
   }

  
	/**
	*  set variable ptypLstUpdtUserId
	*  Corresponding COBOL Variable is PTYP-LST-UPDT-USER-ID
	*  @param value
	**/
   public void setPtypLstUpdtUserId(char[] value) {
      ptypLstUpdtUserId = checkPtypLstUpdtUserIdConstraints(value);
      serializePtypLstUpdtUserId(ptypLstUpdtUserId);
   } 

     /**
	 * 	Update PtypLstUpdtUserId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPtypLstUpdtUserId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPtypLstUpdtUserId,ptypLstUpdtUserId.length);
   	
   }
   
   public void setPtypLstUpdtUserId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPtypLstUpdtUserId,ptypLstUpdtUserId.length);
   	
   }
   
     /**
	 * 	Update PtypLstUpdtUserId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPtypLstUpdtUserId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtypLstUpdtUserId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PtypLstUpdtUserId with another Field
	 *	@param value
	 */
   public void setPtypLstUpdtUserId(Field source) {
       replace(source,0,source.length(),beginPtypLstUpdtUserId,PTYP_LST_UPDT_USER_ID_LEN);
   	
   }  
   
     /**
	 * 	Update PtypLstUpdtUserId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPtypLstUpdtUserId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPtypLstUpdtUserId,PTYP_LST_UPDT_USER_ID_LEN);
   	
   }
   
     /**
	 * 	Update PtypLstUpdtUserId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPtypLstUpdtUserId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtypLstUpdtUserId+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes DclfeSpiRuleProvTyp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setPtypSpiTblId(CONSTANTS.SPACE_7);
         setPtypStsCd(CONSTANTS.SPACE);
         	setPtypProvTypSeqNbr((short)0);
         setPtypDerivPlOfSvcCd(CONSTANTS.SPACE_2);
         setPtypDerivSvcCd(CONSTANTS.SPACE_6);
         setPtypDerivCausCd(CONSTANTS.SPACE);
         setPtypCreatDttm(CONSTANTS.SPACE_26);
         setPtypProvTyp(CONSTANTS.SPACE_2);
         setPtypPgmId(CONSTANTS.SPACE_8);
         setPtypLstUpdtDttm(CONSTANTS.SPACE_26);
         setPtypLstUpdtUserId(CONSTANTS.SPACE_9);
   }

		public static int getDclfeSpiRuleProvTypFieldLength() {
			return DCLFE_SPI_RULE_PROV_TYP_LENGTH;
		}

}
  
