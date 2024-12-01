package com.cloudframe.app.dto.d529351u;

/**
*  The class DclfeSpiRuleFrCondPos is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:50. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class DclfeSpiRuleFrCondPos extends DclfeSpiRuleFrCondPosSerialized { 
   

						private char[] fcndSpiTblId = Field.fillLowValue(7);

						private char[] fcndStsCd = Field.fillLowValue(1);

						private char[] fcndDerivPlOfSvcCd = Field.fillLowValue(2);

						private char[] fcndDerivSvcCd = Field.fillLowValue(6);

						private char[] fcndDerivCausCd = Field.fillLowValue(1);

						private char[] fcndCreatDttm = Field.fillLowValue(26);

								private short fcndFromCondPosSeqNbr;

						private char[] fcndFromCondPos = Field.fillLowValue(2);

						private char[] fcndPgmId = Field.fillLowValue(8);

						private char[] fcndLstUpdtDttm = Field.fillLowValue(26);

						private char[] fcndLstUpdtUserId = Field.fillLowValue(9);
	
	/**
	* Constructor for DclfeSpiRuleFrCondPos
	**/
    public DclfeSpiRuleFrCondPos() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of fcndSpiTblId
	 *	@return fcndSpiTblId
	 */
   public char[] getFcndSpiTblId() throws CFException{
     if (isFcndSpiTblIdModified()) { 
        fcndSpiTblId = refreshFcndSpiTblId();
     }
   		return fcndSpiTblId;
   }

  
	/**
	*  set variable fcndSpiTblId
	*  Corresponding COBOL Variable is FCND-SPI-TBL-ID
	*  @param value
	**/
   public void setFcndSpiTblId(char[] value) {
      fcndSpiTblId = checkFcndSpiTblIdConstraints(value);
      serializeFcndSpiTblId(fcndSpiTblId);
   } 

     /**
	 * 	Update FcndSpiTblId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFcndSpiTblId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFcndSpiTblId,fcndSpiTblId.length);
   	
   }
   
   public void setFcndSpiTblId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFcndSpiTblId,fcndSpiTblId.length);
   	
   }
   
     /**
	 * 	Update FcndSpiTblId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFcndSpiTblId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFcndSpiTblId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FcndSpiTblId with another Field
	 *	@param value
	 */
   public void setFcndSpiTblId(Field source) {
       replace(source,0,source.length(),beginFcndSpiTblId,FCND_SPI_TBL_ID_LEN);
   	
   }  
   
     /**
	 * 	Update FcndSpiTblId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFcndSpiTblId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFcndSpiTblId,FCND_SPI_TBL_ID_LEN);
   	
   }
   
     /**
	 * 	Update FcndSpiTblId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFcndSpiTblId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFcndSpiTblId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fcndStsCd
	 *	@return fcndStsCd
	 */
   public char[] getFcndStsCd() throws CFException{
     if (isFcndStsCdModified()) { 
        fcndStsCd = refreshFcndStsCd();
     }
   		return fcndStsCd;
   }

  
	/**
	*  set variable fcndStsCd
	*  Corresponding COBOL Variable is FCND-STS-CD
	*  @param value
	**/
   public void setFcndStsCd(char[] value) {
      fcndStsCd = checkFcndStsCdConstraints(value);
      serializeFcndStsCd(fcndStsCd);
   } 

     /**
	 * 	Update FcndStsCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFcndStsCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFcndStsCd,fcndStsCd.length);
   	
   }
   
   public void setFcndStsCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFcndStsCd,fcndStsCd.length);
   	
   }
   
     /**
	 * 	Update FcndStsCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFcndStsCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFcndStsCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FcndStsCd with another Field
	 *	@param value
	 */
   public void setFcndStsCd(Field source) {
       replace(source,0,source.length(),beginFcndStsCd,FCND_STS_CD_LEN);
   	
   }  
   
     /**
	 * 	Update FcndStsCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFcndStsCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFcndStsCd,FCND_STS_CD_LEN);
   	
   }
   
     /**
	 * 	Update FcndStsCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFcndStsCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFcndStsCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fcndDerivPlOfSvcCd
	 *	@return fcndDerivPlOfSvcCd
	 */
   public char[] getFcndDerivPlOfSvcCd() throws CFException{
     if (isFcndDerivPlOfSvcCdModified()) { 
        fcndDerivPlOfSvcCd = refreshFcndDerivPlOfSvcCd();
     }
   		return fcndDerivPlOfSvcCd;
   }

  
	/**
	*  set variable fcndDerivPlOfSvcCd
	*  Corresponding COBOL Variable is FCND-DERIV-PL-OF-SVC-CD
	*  @param value
	**/
   public void setFcndDerivPlOfSvcCd(char[] value) {
      fcndDerivPlOfSvcCd = checkFcndDerivPlOfSvcCdConstraints(value);
      serializeFcndDerivPlOfSvcCd(fcndDerivPlOfSvcCd);
   } 

     /**
	 * 	Update FcndDerivPlOfSvcCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFcndDerivPlOfSvcCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFcndDerivPlOfSvcCd,fcndDerivPlOfSvcCd.length);
   	
   }
   
   public void setFcndDerivPlOfSvcCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFcndDerivPlOfSvcCd,fcndDerivPlOfSvcCd.length);
   	
   }
   
     /**
	 * 	Update FcndDerivPlOfSvcCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFcndDerivPlOfSvcCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFcndDerivPlOfSvcCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FcndDerivPlOfSvcCd with another Field
	 *	@param value
	 */
   public void setFcndDerivPlOfSvcCd(Field source) {
       replace(source,0,source.length(),beginFcndDerivPlOfSvcCd,FCND_DERIV_PL_OF_SVC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update FcndDerivPlOfSvcCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFcndDerivPlOfSvcCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFcndDerivPlOfSvcCd,FCND_DERIV_PL_OF_SVC_CD_LEN);
   	
   }
   
     /**
	 * 	Update FcndDerivPlOfSvcCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFcndDerivPlOfSvcCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFcndDerivPlOfSvcCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fcndDerivSvcCd
	 *	@return fcndDerivSvcCd
	 */
   public char[] getFcndDerivSvcCd() throws CFException{
     if (isFcndDerivSvcCdModified()) { 
        fcndDerivSvcCd = refreshFcndDerivSvcCd();
     }
   		return fcndDerivSvcCd;
   }

  
	/**
	*  set variable fcndDerivSvcCd
	*  Corresponding COBOL Variable is FCND-DERIV-SVC-CD
	*  @param value
	**/
   public void setFcndDerivSvcCd(char[] value) {
      fcndDerivSvcCd = checkFcndDerivSvcCdConstraints(value);
      serializeFcndDerivSvcCd(fcndDerivSvcCd);
   } 

     /**
	 * 	Update FcndDerivSvcCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFcndDerivSvcCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFcndDerivSvcCd,fcndDerivSvcCd.length);
   	
   }
   
   public void setFcndDerivSvcCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFcndDerivSvcCd,fcndDerivSvcCd.length);
   	
   }
   
     /**
	 * 	Update FcndDerivSvcCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFcndDerivSvcCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFcndDerivSvcCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FcndDerivSvcCd with another Field
	 *	@param value
	 */
   public void setFcndDerivSvcCd(Field source) {
       replace(source,0,source.length(),beginFcndDerivSvcCd,FCND_DERIV_SVC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update FcndDerivSvcCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFcndDerivSvcCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFcndDerivSvcCd,FCND_DERIV_SVC_CD_LEN);
   	
   }
   
     /**
	 * 	Update FcndDerivSvcCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFcndDerivSvcCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFcndDerivSvcCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fcndDerivCausCd
	 *	@return fcndDerivCausCd
	 */
   public char[] getFcndDerivCausCd() throws CFException{
     if (isFcndDerivCausCdModified()) { 
        fcndDerivCausCd = refreshFcndDerivCausCd();
     }
   		return fcndDerivCausCd;
   }

  
	/**
	*  set variable fcndDerivCausCd
	*  Corresponding COBOL Variable is FCND-DERIV-CAUS-CD
	*  @param value
	**/
   public void setFcndDerivCausCd(char[] value) {
      fcndDerivCausCd = checkFcndDerivCausCdConstraints(value);
      serializeFcndDerivCausCd(fcndDerivCausCd);
   } 

     /**
	 * 	Update FcndDerivCausCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFcndDerivCausCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFcndDerivCausCd,fcndDerivCausCd.length);
   	
   }
   
   public void setFcndDerivCausCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFcndDerivCausCd,fcndDerivCausCd.length);
   	
   }
   
     /**
	 * 	Update FcndDerivCausCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFcndDerivCausCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFcndDerivCausCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FcndDerivCausCd with another Field
	 *	@param value
	 */
   public void setFcndDerivCausCd(Field source) {
       replace(source,0,source.length(),beginFcndDerivCausCd,FCND_DERIV_CAUS_CD_LEN);
   	
   }  
   
     /**
	 * 	Update FcndDerivCausCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFcndDerivCausCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFcndDerivCausCd,FCND_DERIV_CAUS_CD_LEN);
   	
   }
   
     /**
	 * 	Update FcndDerivCausCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFcndDerivCausCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFcndDerivCausCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fcndCreatDttm
	 *	@return fcndCreatDttm
	 */
   public char[] getFcndCreatDttm() throws CFException{
     if (isFcndCreatDttmModified()) { 
        fcndCreatDttm = refreshFcndCreatDttm();
     }
   		return fcndCreatDttm;
   }

  
	/**
	*  set variable fcndCreatDttm
	*  Corresponding COBOL Variable is FCND-CREAT-DTTM
	*  @param value
	**/
   public void setFcndCreatDttm(char[] value) {
      fcndCreatDttm = checkFcndCreatDttmConstraints(value);
      serializeFcndCreatDttm(fcndCreatDttm);
   } 

     /**
	 * 	Update FcndCreatDttm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFcndCreatDttm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFcndCreatDttm,fcndCreatDttm.length);
   	
   }
   
   public void setFcndCreatDttm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFcndCreatDttm,fcndCreatDttm.length);
   	
   }
   
     /**
	 * 	Update FcndCreatDttm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFcndCreatDttm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFcndCreatDttm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FcndCreatDttm with another Field
	 *	@param value
	 */
   public void setFcndCreatDttm(Field source) {
       replace(source,0,source.length(),beginFcndCreatDttm,FCND_CREAT_DTTM_LEN);
   	
   }  
   
     /**
	 * 	Update FcndCreatDttm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFcndCreatDttm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFcndCreatDttm,FCND_CREAT_DTTM_LEN);
   	
   }
   
     /**
	 * 	Update FcndCreatDttm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFcndCreatDttm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFcndCreatDttm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fcndFromCondPosSeqNbr
	 *	@return fcndFromCondPosSeqNbr
	 */
	public short getFcndFromCondPosSeqNbr() throws CFException {
        if (isFcndFromCondPosSeqNbrModified()) { 
           fcndFromCondPosSeqNbr = refreshFcndFromCondPosSeqNbr();
        }
   		return fcndFromCondPosSeqNbr;
	}
	
	/**
	 * 	Update FcndFromCondPosSeqNbr with the passed value
	 *  Corresponding COBOL Variable is FCND-FROM-COND-POS-SEQ-NBR
	 *	@param number
	 */
	public void setFcndFromCondPosSeqNbr(short number) {
	     // Truncate if the number is beyond +/- Max range
	    fcndFromCondPosSeqNbr = checkFcndFromCondPosSeqNbrMaxLimit(number); 
		serializeFcndFromCondPosSeqNbr(fcndFromCondPosSeqNbr);
	}

	public void setFcndFromCondPosSeqNbr(int number) {
	    number = checkFcndFromCondPosSeqNbrMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setFcndFromCondPosSeqNbr((short)number);
	}
	public void setFcndFromCondPosSeqNbr(long number) {
	    number = checkFcndFromCondPosSeqNbrMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setFcndFromCondPosSeqNbr((short)number);
	}
	

	/**
	 *	Returns the value of fcndFromCondPos
	 *	@return fcndFromCondPos
	 */
   public char[] getFcndFromCondPos() throws CFException{
     if (isFcndFromCondPosModified()) { 
        fcndFromCondPos = refreshFcndFromCondPos();
     }
   		return fcndFromCondPos;
   }

  
	/**
	*  set variable fcndFromCondPos
	*  Corresponding COBOL Variable is FCND-FROM-COND-POS
	*  @param value
	**/
   public void setFcndFromCondPos(char[] value) {
      fcndFromCondPos = checkFcndFromCondPosConstraints(value);
      serializeFcndFromCondPos(fcndFromCondPos);
   } 

     /**
	 * 	Update FcndFromCondPos 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFcndFromCondPos(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFcndFromCondPos,fcndFromCondPos.length);
   	
   }
   
   public void setFcndFromCondPos(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFcndFromCondPos,fcndFromCondPos.length);
   	
   }
   
     /**
	 * 	Update FcndFromCondPos 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFcndFromCondPos(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFcndFromCondPos+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FcndFromCondPos with another Field
	 *	@param value
	 */
   public void setFcndFromCondPos(Field source) {
       replace(source,0,source.length(),beginFcndFromCondPos,FCND_FROM_COND_POS_LEN);
   	
   }  
   
     /**
	 * 	Update FcndFromCondPos 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFcndFromCondPos(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFcndFromCondPos,FCND_FROM_COND_POS_LEN);
   	
   }
   
     /**
	 * 	Update FcndFromCondPos 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFcndFromCondPos(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFcndFromCondPos+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fcndPgmId
	 *	@return fcndPgmId
	 */
   public char[] getFcndPgmId() throws CFException{
     if (isFcndPgmIdModified()) { 
        fcndPgmId = refreshFcndPgmId();
     }
   		return fcndPgmId;
   }

  
	/**
	*  set variable fcndPgmId
	*  Corresponding COBOL Variable is FCND-PGM-ID
	*  @param value
	**/
   public void setFcndPgmId(char[] value) {
      fcndPgmId = checkFcndPgmIdConstraints(value);
      serializeFcndPgmId(fcndPgmId);
   } 

     /**
	 * 	Update FcndPgmId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFcndPgmId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFcndPgmId,fcndPgmId.length);
   	
   }
   
   public void setFcndPgmId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFcndPgmId,fcndPgmId.length);
   	
   }
   
     /**
	 * 	Update FcndPgmId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFcndPgmId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFcndPgmId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FcndPgmId with another Field
	 *	@param value
	 */
   public void setFcndPgmId(Field source) {
       replace(source,0,source.length(),beginFcndPgmId,FCND_PGM_ID_LEN);
   	
   }  
   
     /**
	 * 	Update FcndPgmId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFcndPgmId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFcndPgmId,FCND_PGM_ID_LEN);
   	
   }
   
     /**
	 * 	Update FcndPgmId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFcndPgmId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFcndPgmId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fcndLstUpdtDttm
	 *	@return fcndLstUpdtDttm
	 */
   public char[] getFcndLstUpdtDttm() throws CFException{
     if (isFcndLstUpdtDttmModified()) { 
        fcndLstUpdtDttm = refreshFcndLstUpdtDttm();
     }
   		return fcndLstUpdtDttm;
   }

  
	/**
	*  set variable fcndLstUpdtDttm
	*  Corresponding COBOL Variable is FCND-LST-UPDT-DTTM
	*  @param value
	**/
   public void setFcndLstUpdtDttm(char[] value) {
      fcndLstUpdtDttm = checkFcndLstUpdtDttmConstraints(value);
      serializeFcndLstUpdtDttm(fcndLstUpdtDttm);
   } 

     /**
	 * 	Update FcndLstUpdtDttm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFcndLstUpdtDttm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFcndLstUpdtDttm,fcndLstUpdtDttm.length);
   	
   }
   
   public void setFcndLstUpdtDttm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFcndLstUpdtDttm,fcndLstUpdtDttm.length);
   	
   }
   
     /**
	 * 	Update FcndLstUpdtDttm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFcndLstUpdtDttm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFcndLstUpdtDttm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FcndLstUpdtDttm with another Field
	 *	@param value
	 */
   public void setFcndLstUpdtDttm(Field source) {
       replace(source,0,source.length(),beginFcndLstUpdtDttm,FCND_LST_UPDT_DTTM_LEN);
   	
   }  
   
     /**
	 * 	Update FcndLstUpdtDttm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFcndLstUpdtDttm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFcndLstUpdtDttm,FCND_LST_UPDT_DTTM_LEN);
   	
   }
   
     /**
	 * 	Update FcndLstUpdtDttm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFcndLstUpdtDttm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFcndLstUpdtDttm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fcndLstUpdtUserId
	 *	@return fcndLstUpdtUserId
	 */
   public char[] getFcndLstUpdtUserId() throws CFException{
     if (isFcndLstUpdtUserIdModified()) { 
        fcndLstUpdtUserId = refreshFcndLstUpdtUserId();
     }
   		return fcndLstUpdtUserId;
   }

  
	/**
	*  set variable fcndLstUpdtUserId
	*  Corresponding COBOL Variable is FCND-LST-UPDT-USER-ID
	*  @param value
	**/
   public void setFcndLstUpdtUserId(char[] value) {
      fcndLstUpdtUserId = checkFcndLstUpdtUserIdConstraints(value);
      serializeFcndLstUpdtUserId(fcndLstUpdtUserId);
   } 

     /**
	 * 	Update FcndLstUpdtUserId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFcndLstUpdtUserId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFcndLstUpdtUserId,fcndLstUpdtUserId.length);
   	
   }
   
   public void setFcndLstUpdtUserId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFcndLstUpdtUserId,fcndLstUpdtUserId.length);
   	
   }
   
     /**
	 * 	Update FcndLstUpdtUserId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFcndLstUpdtUserId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFcndLstUpdtUserId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FcndLstUpdtUserId with another Field
	 *	@param value
	 */
   public void setFcndLstUpdtUserId(Field source) {
       replace(source,0,source.length(),beginFcndLstUpdtUserId,FCND_LST_UPDT_USER_ID_LEN);
   	
   }  
   
     /**
	 * 	Update FcndLstUpdtUserId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFcndLstUpdtUserId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFcndLstUpdtUserId,FCND_LST_UPDT_USER_ID_LEN);
   	
   }
   
     /**
	 * 	Update FcndLstUpdtUserId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFcndLstUpdtUserId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFcndLstUpdtUserId+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes DclfeSpiRuleFrCondPos
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFcndSpiTblId(CONSTANTS.SPACE_7);
         setFcndStsCd(CONSTANTS.SPACE);
         setFcndDerivPlOfSvcCd(CONSTANTS.SPACE_2);
         setFcndDerivSvcCd(CONSTANTS.SPACE_6);
         setFcndDerivCausCd(CONSTANTS.SPACE);
         setFcndCreatDttm(CONSTANTS.SPACE_26);
         	setFcndFromCondPosSeqNbr((short)0);
         setFcndFromCondPos(CONSTANTS.SPACE_2);
         setFcndPgmId(CONSTANTS.SPACE_8);
         setFcndLstUpdtDttm(CONSTANTS.SPACE_26);
         setFcndLstUpdtUserId(CONSTANTS.SPACE_9);
   }

		public static int getDclfeSpiRuleFrCondPosFieldLength() {
			return DCLFE_SPI_RULE_FR_COND_POS_LENGTH;
		}

}
  
