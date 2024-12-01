package com.cloudframe.app.dto.d529351u;

/**
*  The class DclfeSpiRuleFrToSvc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class DclfeSpiRuleFrToSvc extends DclfeSpiRuleFrToSvcSerialized { 
   

						private char[] frtoSpiTblId = Field.fillLowValue(7);

						private char[] frtoStsCd = Field.fillLowValue(1);

						private char[] frtoDerivPlOfSvcCd = Field.fillLowValue(2);

						private char[] frtoDerivSvcCd = Field.fillLowValue(6);

						private char[] frtoDerivCausCd = Field.fillLowValue(1);

						private char[] frtoCreatDttm = Field.fillLowValue(26);

								private short frtoFromToSvcSeqNbr;

						private char[] frtoClmFrmSvcCd = Field.fillLowValue(6);

						private char[] frtoClmToSvcCd = Field.fillLowValue(6);

						private char[] frtoSvcTypCd = Field.fillLowValue(1);

						private char[] frtoPgmId = Field.fillLowValue(8);

						private char[] frtoLstUpdtDttm = Field.fillLowValue(26);

						private char[] frtoLstUpdtUserId = Field.fillLowValue(9);

						private char[] frtoHipaaCd = Field.fillLowValue(2);
	
	/**
	* Constructor for DclfeSpiRuleFrToSvc
	**/
    public DclfeSpiRuleFrToSvc() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of frtoSpiTblId
	 *	@return frtoSpiTblId
	 */
   public char[] getFrtoSpiTblId() throws CFException{
     if (isFrtoSpiTblIdModified()) { 
        frtoSpiTblId = refreshFrtoSpiTblId();
     }
   		return frtoSpiTblId;
   }

  
	/**
	*  set variable frtoSpiTblId
	*  Corresponding COBOL Variable is FRTO-SPI-TBL-ID
	*  @param value
	**/
   public void setFrtoSpiTblId(char[] value) {
      frtoSpiTblId = checkFrtoSpiTblIdConstraints(value);
      serializeFrtoSpiTblId(frtoSpiTblId);
   } 

     /**
	 * 	Update FrtoSpiTblId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFrtoSpiTblId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFrtoSpiTblId,frtoSpiTblId.length);
   	
   }
   
   public void setFrtoSpiTblId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoSpiTblId,frtoSpiTblId.length);
   	
   }
   
     /**
	 * 	Update FrtoSpiTblId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFrtoSpiTblId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoSpiTblId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FrtoSpiTblId with another Field
	 *	@param value
	 */
   public void setFrtoSpiTblId(Field source) {
       replace(source,0,source.length(),beginFrtoSpiTblId,FRTO_SPI_TBL_ID_LEN);
   	
   }  
   
     /**
	 * 	Update FrtoSpiTblId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFrtoSpiTblId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFrtoSpiTblId,FRTO_SPI_TBL_ID_LEN);
   	
   }
   
     /**
	 * 	Update FrtoSpiTblId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFrtoSpiTblId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoSpiTblId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of frtoStsCd
	 *	@return frtoStsCd
	 */
   public char[] getFrtoStsCd() throws CFException{
     if (isFrtoStsCdModified()) { 
        frtoStsCd = refreshFrtoStsCd();
     }
   		return frtoStsCd;
   }

  
	/**
	*  set variable frtoStsCd
	*  Corresponding COBOL Variable is FRTO-STS-CD
	*  @param value
	**/
   public void setFrtoStsCd(char[] value) {
      frtoStsCd = checkFrtoStsCdConstraints(value);
      serializeFrtoStsCd(frtoStsCd);
   } 

     /**
	 * 	Update FrtoStsCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFrtoStsCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFrtoStsCd,frtoStsCd.length);
   	
   }
   
   public void setFrtoStsCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoStsCd,frtoStsCd.length);
   	
   }
   
     /**
	 * 	Update FrtoStsCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFrtoStsCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoStsCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FrtoStsCd with another Field
	 *	@param value
	 */
   public void setFrtoStsCd(Field source) {
       replace(source,0,source.length(),beginFrtoStsCd,FRTO_STS_CD_LEN);
   	
   }  
   
     /**
	 * 	Update FrtoStsCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFrtoStsCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFrtoStsCd,FRTO_STS_CD_LEN);
   	
   }
   
     /**
	 * 	Update FrtoStsCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFrtoStsCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoStsCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of frtoDerivPlOfSvcCd
	 *	@return frtoDerivPlOfSvcCd
	 */
   public char[] getFrtoDerivPlOfSvcCd() throws CFException{
     if (isFrtoDerivPlOfSvcCdModified()) { 
        frtoDerivPlOfSvcCd = refreshFrtoDerivPlOfSvcCd();
     }
   		return frtoDerivPlOfSvcCd;
   }

  
	/**
	*  set variable frtoDerivPlOfSvcCd
	*  Corresponding COBOL Variable is FRTO-DERIV-PL-OF-SVC-CD
	*  @param value
	**/
   public void setFrtoDerivPlOfSvcCd(char[] value) {
      frtoDerivPlOfSvcCd = checkFrtoDerivPlOfSvcCdConstraints(value);
      serializeFrtoDerivPlOfSvcCd(frtoDerivPlOfSvcCd);
   } 

     /**
	 * 	Update FrtoDerivPlOfSvcCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFrtoDerivPlOfSvcCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFrtoDerivPlOfSvcCd,frtoDerivPlOfSvcCd.length);
   	
   }
   
   public void setFrtoDerivPlOfSvcCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoDerivPlOfSvcCd,frtoDerivPlOfSvcCd.length);
   	
   }
   
     /**
	 * 	Update FrtoDerivPlOfSvcCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFrtoDerivPlOfSvcCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoDerivPlOfSvcCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FrtoDerivPlOfSvcCd with another Field
	 *	@param value
	 */
   public void setFrtoDerivPlOfSvcCd(Field source) {
       replace(source,0,source.length(),beginFrtoDerivPlOfSvcCd,FRTO_DERIV_PL_OF_SVC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update FrtoDerivPlOfSvcCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFrtoDerivPlOfSvcCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFrtoDerivPlOfSvcCd,FRTO_DERIV_PL_OF_SVC_CD_LEN);
   	
   }
   
     /**
	 * 	Update FrtoDerivPlOfSvcCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFrtoDerivPlOfSvcCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoDerivPlOfSvcCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of frtoDerivSvcCd
	 *	@return frtoDerivSvcCd
	 */
   public char[] getFrtoDerivSvcCd() throws CFException{
     if (isFrtoDerivSvcCdModified()) { 
        frtoDerivSvcCd = refreshFrtoDerivSvcCd();
     }
   		return frtoDerivSvcCd;
   }

  
	/**
	*  set variable frtoDerivSvcCd
	*  Corresponding COBOL Variable is FRTO-DERIV-SVC-CD
	*  @param value
	**/
   public void setFrtoDerivSvcCd(char[] value) {
      frtoDerivSvcCd = checkFrtoDerivSvcCdConstraints(value);
      serializeFrtoDerivSvcCd(frtoDerivSvcCd);
   } 

     /**
	 * 	Update FrtoDerivSvcCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFrtoDerivSvcCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFrtoDerivSvcCd,frtoDerivSvcCd.length);
   	
   }
   
   public void setFrtoDerivSvcCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoDerivSvcCd,frtoDerivSvcCd.length);
   	
   }
   
     /**
	 * 	Update FrtoDerivSvcCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFrtoDerivSvcCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoDerivSvcCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FrtoDerivSvcCd with another Field
	 *	@param value
	 */
   public void setFrtoDerivSvcCd(Field source) {
       replace(source,0,source.length(),beginFrtoDerivSvcCd,FRTO_DERIV_SVC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update FrtoDerivSvcCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFrtoDerivSvcCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFrtoDerivSvcCd,FRTO_DERIV_SVC_CD_LEN);
   	
   }
   
     /**
	 * 	Update FrtoDerivSvcCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFrtoDerivSvcCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoDerivSvcCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of frtoDerivCausCd
	 *	@return frtoDerivCausCd
	 */
   public char[] getFrtoDerivCausCd() throws CFException{
     if (isFrtoDerivCausCdModified()) { 
        frtoDerivCausCd = refreshFrtoDerivCausCd();
     }
   		return frtoDerivCausCd;
   }

  
	/**
	*  set variable frtoDerivCausCd
	*  Corresponding COBOL Variable is FRTO-DERIV-CAUS-CD
	*  @param value
	**/
   public void setFrtoDerivCausCd(char[] value) {
      frtoDerivCausCd = checkFrtoDerivCausCdConstraints(value);
      serializeFrtoDerivCausCd(frtoDerivCausCd);
   } 

     /**
	 * 	Update FrtoDerivCausCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFrtoDerivCausCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFrtoDerivCausCd,frtoDerivCausCd.length);
   	
   }
   
   public void setFrtoDerivCausCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoDerivCausCd,frtoDerivCausCd.length);
   	
   }
   
     /**
	 * 	Update FrtoDerivCausCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFrtoDerivCausCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoDerivCausCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FrtoDerivCausCd with another Field
	 *	@param value
	 */
   public void setFrtoDerivCausCd(Field source) {
       replace(source,0,source.length(),beginFrtoDerivCausCd,FRTO_DERIV_CAUS_CD_LEN);
   	
   }  
   
     /**
	 * 	Update FrtoDerivCausCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFrtoDerivCausCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFrtoDerivCausCd,FRTO_DERIV_CAUS_CD_LEN);
   	
   }
   
     /**
	 * 	Update FrtoDerivCausCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFrtoDerivCausCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoDerivCausCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of frtoCreatDttm
	 *	@return frtoCreatDttm
	 */
   public char[] getFrtoCreatDttm() throws CFException{
     if (isFrtoCreatDttmModified()) { 
        frtoCreatDttm = refreshFrtoCreatDttm();
     }
   		return frtoCreatDttm;
   }

  
	/**
	*  set variable frtoCreatDttm
	*  Corresponding COBOL Variable is FRTO-CREAT-DTTM
	*  @param value
	**/
   public void setFrtoCreatDttm(char[] value) {
      frtoCreatDttm = checkFrtoCreatDttmConstraints(value);
      serializeFrtoCreatDttm(frtoCreatDttm);
   } 

     /**
	 * 	Update FrtoCreatDttm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFrtoCreatDttm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFrtoCreatDttm,frtoCreatDttm.length);
   	
   }
   
   public void setFrtoCreatDttm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoCreatDttm,frtoCreatDttm.length);
   	
   }
   
     /**
	 * 	Update FrtoCreatDttm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFrtoCreatDttm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoCreatDttm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FrtoCreatDttm with another Field
	 *	@param value
	 */
   public void setFrtoCreatDttm(Field source) {
       replace(source,0,source.length(),beginFrtoCreatDttm,FRTO_CREAT_DTTM_LEN);
   	
   }  
   
     /**
	 * 	Update FrtoCreatDttm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFrtoCreatDttm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFrtoCreatDttm,FRTO_CREAT_DTTM_LEN);
   	
   }
   
     /**
	 * 	Update FrtoCreatDttm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFrtoCreatDttm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoCreatDttm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of frtoFromToSvcSeqNbr
	 *	@return frtoFromToSvcSeqNbr
	 */
	public short getFrtoFromToSvcSeqNbr() throws CFException {
        if (isFrtoFromToSvcSeqNbrModified()) { 
           frtoFromToSvcSeqNbr = refreshFrtoFromToSvcSeqNbr();
        }
   		return frtoFromToSvcSeqNbr;
	}
	
	/**
	 * 	Update FrtoFromToSvcSeqNbr with the passed value
	 *  Corresponding COBOL Variable is FRTO-FROM-TO-SVC-SEQ-NBR
	 *	@param number
	 */
	public void setFrtoFromToSvcSeqNbr(short number) {
	     // Truncate if the number is beyond +/- Max range
	    frtoFromToSvcSeqNbr = checkFrtoFromToSvcSeqNbrMaxLimit(number); 
		serializeFrtoFromToSvcSeqNbr(frtoFromToSvcSeqNbr);
	}

	public void setFrtoFromToSvcSeqNbr(int number) {
	    number = checkFrtoFromToSvcSeqNbrMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setFrtoFromToSvcSeqNbr((short)number);
	}
	public void setFrtoFromToSvcSeqNbr(long number) {
	    number = checkFrtoFromToSvcSeqNbrMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setFrtoFromToSvcSeqNbr((short)number);
	}
	

	/**
	 *	Returns the value of frtoClmFrmSvcCd
	 *	@return frtoClmFrmSvcCd
	 */
   public char[] getFrtoClmFrmSvcCd() throws CFException{
     if (isFrtoClmFrmSvcCdModified()) { 
        frtoClmFrmSvcCd = refreshFrtoClmFrmSvcCd();
     }
   		return frtoClmFrmSvcCd;
   }

  
	/**
	*  set variable frtoClmFrmSvcCd
	*  Corresponding COBOL Variable is FRTO-CLM-FRM-SVC-CD
	*  @param value
	**/
   public void setFrtoClmFrmSvcCd(char[] value) {
      frtoClmFrmSvcCd = checkFrtoClmFrmSvcCdConstraints(value);
      serializeFrtoClmFrmSvcCd(frtoClmFrmSvcCd);
   } 

     /**
	 * 	Update FrtoClmFrmSvcCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFrtoClmFrmSvcCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFrtoClmFrmSvcCd,frtoClmFrmSvcCd.length);
   	
   }
   
   public void setFrtoClmFrmSvcCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoClmFrmSvcCd,frtoClmFrmSvcCd.length);
   	
   }
   
     /**
	 * 	Update FrtoClmFrmSvcCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFrtoClmFrmSvcCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoClmFrmSvcCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FrtoClmFrmSvcCd with another Field
	 *	@param value
	 */
   public void setFrtoClmFrmSvcCd(Field source) {
       replace(source,0,source.length(),beginFrtoClmFrmSvcCd,FRTO_CLM_FRM_SVC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update FrtoClmFrmSvcCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFrtoClmFrmSvcCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFrtoClmFrmSvcCd,FRTO_CLM_FRM_SVC_CD_LEN);
   	
   }
   
     /**
	 * 	Update FrtoClmFrmSvcCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFrtoClmFrmSvcCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoClmFrmSvcCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of frtoClmToSvcCd
	 *	@return frtoClmToSvcCd
	 */
   public char[] getFrtoClmToSvcCd() throws CFException{
     if (isFrtoClmToSvcCdModified()) { 
        frtoClmToSvcCd = refreshFrtoClmToSvcCd();
     }
   		return frtoClmToSvcCd;
   }

  
	/**
	*  set variable frtoClmToSvcCd
	*  Corresponding COBOL Variable is FRTO-CLM-TO-SVC-CD
	*  @param value
	**/
   public void setFrtoClmToSvcCd(char[] value) {
      frtoClmToSvcCd = checkFrtoClmToSvcCdConstraints(value);
      serializeFrtoClmToSvcCd(frtoClmToSvcCd);
   } 

     /**
	 * 	Update FrtoClmToSvcCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFrtoClmToSvcCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFrtoClmToSvcCd,frtoClmToSvcCd.length);
   	
   }
   
   public void setFrtoClmToSvcCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoClmToSvcCd,frtoClmToSvcCd.length);
   	
   }
   
     /**
	 * 	Update FrtoClmToSvcCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFrtoClmToSvcCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoClmToSvcCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FrtoClmToSvcCd with another Field
	 *	@param value
	 */
   public void setFrtoClmToSvcCd(Field source) {
       replace(source,0,source.length(),beginFrtoClmToSvcCd,FRTO_CLM_TO_SVC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update FrtoClmToSvcCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFrtoClmToSvcCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFrtoClmToSvcCd,FRTO_CLM_TO_SVC_CD_LEN);
   	
   }
   
     /**
	 * 	Update FrtoClmToSvcCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFrtoClmToSvcCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoClmToSvcCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of frtoSvcTypCd
	 *	@return frtoSvcTypCd
	 */
   public char[] getFrtoSvcTypCd() throws CFException{
     if (isFrtoSvcTypCdModified()) { 
        frtoSvcTypCd = refreshFrtoSvcTypCd();
     }
   		return frtoSvcTypCd;
   }

  
	/**
	*  set variable frtoSvcTypCd
	*  Corresponding COBOL Variable is FRTO-SVC-TYP-CD
	*  @param value
	**/
   public void setFrtoSvcTypCd(char[] value) {
      frtoSvcTypCd = checkFrtoSvcTypCdConstraints(value);
      serializeFrtoSvcTypCd(frtoSvcTypCd);
   } 

     /**
	 * 	Update FrtoSvcTypCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFrtoSvcTypCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFrtoSvcTypCd,frtoSvcTypCd.length);
   	
   }
   
   public void setFrtoSvcTypCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoSvcTypCd,frtoSvcTypCd.length);
   	
   }
   
     /**
	 * 	Update FrtoSvcTypCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFrtoSvcTypCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoSvcTypCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FrtoSvcTypCd with another Field
	 *	@param value
	 */
   public void setFrtoSvcTypCd(Field source) {
       replace(source,0,source.length(),beginFrtoSvcTypCd,FRTO_SVC_TYP_CD_LEN);
   	
   }  
   
     /**
	 * 	Update FrtoSvcTypCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFrtoSvcTypCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFrtoSvcTypCd,FRTO_SVC_TYP_CD_LEN);
   	
   }
   
     /**
	 * 	Update FrtoSvcTypCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFrtoSvcTypCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoSvcTypCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of frtoPgmId
	 *	@return frtoPgmId
	 */
   public char[] getFrtoPgmId() throws CFException{
     if (isFrtoPgmIdModified()) { 
        frtoPgmId = refreshFrtoPgmId();
     }
   		return frtoPgmId;
   }

  
	/**
	*  set variable frtoPgmId
	*  Corresponding COBOL Variable is FRTO-PGM-ID
	*  @param value
	**/
   public void setFrtoPgmId(char[] value) {
      frtoPgmId = checkFrtoPgmIdConstraints(value);
      serializeFrtoPgmId(frtoPgmId);
   } 

     /**
	 * 	Update FrtoPgmId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFrtoPgmId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFrtoPgmId,frtoPgmId.length);
   	
   }
   
   public void setFrtoPgmId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoPgmId,frtoPgmId.length);
   	
   }
   
     /**
	 * 	Update FrtoPgmId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFrtoPgmId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoPgmId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FrtoPgmId with another Field
	 *	@param value
	 */
   public void setFrtoPgmId(Field source) {
       replace(source,0,source.length(),beginFrtoPgmId,FRTO_PGM_ID_LEN);
   	
   }  
   
     /**
	 * 	Update FrtoPgmId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFrtoPgmId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFrtoPgmId,FRTO_PGM_ID_LEN);
   	
   }
   
     /**
	 * 	Update FrtoPgmId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFrtoPgmId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoPgmId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of frtoLstUpdtDttm
	 *	@return frtoLstUpdtDttm
	 */
   public char[] getFrtoLstUpdtDttm() throws CFException{
     if (isFrtoLstUpdtDttmModified()) { 
        frtoLstUpdtDttm = refreshFrtoLstUpdtDttm();
     }
   		return frtoLstUpdtDttm;
   }

  
	/**
	*  set variable frtoLstUpdtDttm
	*  Corresponding COBOL Variable is FRTO-LST-UPDT-DTTM
	*  @param value
	**/
   public void setFrtoLstUpdtDttm(char[] value) {
      frtoLstUpdtDttm = checkFrtoLstUpdtDttmConstraints(value);
      serializeFrtoLstUpdtDttm(frtoLstUpdtDttm);
   } 

     /**
	 * 	Update FrtoLstUpdtDttm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFrtoLstUpdtDttm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFrtoLstUpdtDttm,frtoLstUpdtDttm.length);
   	
   }
   
   public void setFrtoLstUpdtDttm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoLstUpdtDttm,frtoLstUpdtDttm.length);
   	
   }
   
     /**
	 * 	Update FrtoLstUpdtDttm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFrtoLstUpdtDttm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoLstUpdtDttm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FrtoLstUpdtDttm with another Field
	 *	@param value
	 */
   public void setFrtoLstUpdtDttm(Field source) {
       replace(source,0,source.length(),beginFrtoLstUpdtDttm,FRTO_LST_UPDT_DTTM_LEN);
   	
   }  
   
     /**
	 * 	Update FrtoLstUpdtDttm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFrtoLstUpdtDttm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFrtoLstUpdtDttm,FRTO_LST_UPDT_DTTM_LEN);
   	
   }
   
     /**
	 * 	Update FrtoLstUpdtDttm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFrtoLstUpdtDttm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoLstUpdtDttm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of frtoLstUpdtUserId
	 *	@return frtoLstUpdtUserId
	 */
   public char[] getFrtoLstUpdtUserId() throws CFException{
     if (isFrtoLstUpdtUserIdModified()) { 
        frtoLstUpdtUserId = refreshFrtoLstUpdtUserId();
     }
   		return frtoLstUpdtUserId;
   }

  
	/**
	*  set variable frtoLstUpdtUserId
	*  Corresponding COBOL Variable is FRTO-LST-UPDT-USER-ID
	*  @param value
	**/
   public void setFrtoLstUpdtUserId(char[] value) {
      frtoLstUpdtUserId = checkFrtoLstUpdtUserIdConstraints(value);
      serializeFrtoLstUpdtUserId(frtoLstUpdtUserId);
   } 

     /**
	 * 	Update FrtoLstUpdtUserId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFrtoLstUpdtUserId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFrtoLstUpdtUserId,frtoLstUpdtUserId.length);
   	
   }
   
   public void setFrtoLstUpdtUserId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoLstUpdtUserId,frtoLstUpdtUserId.length);
   	
   }
   
     /**
	 * 	Update FrtoLstUpdtUserId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFrtoLstUpdtUserId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoLstUpdtUserId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FrtoLstUpdtUserId with another Field
	 *	@param value
	 */
   public void setFrtoLstUpdtUserId(Field source) {
       replace(source,0,source.length(),beginFrtoLstUpdtUserId,FRTO_LST_UPDT_USER_ID_LEN);
   	
   }  
   
     /**
	 * 	Update FrtoLstUpdtUserId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFrtoLstUpdtUserId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFrtoLstUpdtUserId,FRTO_LST_UPDT_USER_ID_LEN);
   	
   }
   
     /**
	 * 	Update FrtoLstUpdtUserId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFrtoLstUpdtUserId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoLstUpdtUserId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of frtoHipaaCd
	 *	@return frtoHipaaCd
	 */
   public char[] getFrtoHipaaCd() throws CFException{
     if (isFrtoHipaaCdModified()) { 
        frtoHipaaCd = refreshFrtoHipaaCd();
     }
   		return frtoHipaaCd;
   }

  
	/**
	*  set variable frtoHipaaCd
	*  Corresponding COBOL Variable is FRTO-HIPAA-CD
	*  @param value
	**/
   public void setFrtoHipaaCd(char[] value) {
      frtoHipaaCd = checkFrtoHipaaCdConstraints(value);
      serializeFrtoHipaaCd(frtoHipaaCd);
   } 

     /**
	 * 	Update FrtoHipaaCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFrtoHipaaCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFrtoHipaaCd,frtoHipaaCd.length);
   	
   }
   
   public void setFrtoHipaaCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoHipaaCd,frtoHipaaCd.length);
   	
   }
   
     /**
	 * 	Update FrtoHipaaCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFrtoHipaaCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoHipaaCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FrtoHipaaCd with another Field
	 *	@param value
	 */
   public void setFrtoHipaaCd(Field source) {
       replace(source,0,source.length(),beginFrtoHipaaCd,FRTO_HIPAA_CD_LEN);
   	
   }  
   
     /**
	 * 	Update FrtoHipaaCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFrtoHipaaCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFrtoHipaaCd,FRTO_HIPAA_CD_LEN);
   	
   }
   
     /**
	 * 	Update FrtoHipaaCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFrtoHipaaCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFrtoHipaaCd+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes DclfeSpiRuleFrToSvc
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFrtoSpiTblId(CONSTANTS.SPACE_7);
         setFrtoStsCd(CONSTANTS.SPACE);
         setFrtoDerivPlOfSvcCd(CONSTANTS.SPACE_2);
         setFrtoDerivSvcCd(CONSTANTS.SPACE_6);
         setFrtoDerivCausCd(CONSTANTS.SPACE);
         setFrtoCreatDttm(CONSTANTS.SPACE_26);
         	setFrtoFromToSvcSeqNbr((short)0);
         setFrtoClmFrmSvcCd(CONSTANTS.SPACE_6);
         setFrtoClmToSvcCd(CONSTANTS.SPACE_6);
         setFrtoSvcTypCd(CONSTANTS.SPACE);
         setFrtoPgmId(CONSTANTS.SPACE_8);
         setFrtoLstUpdtDttm(CONSTANTS.SPACE_26);
         setFrtoLstUpdtUserId(CONSTANTS.SPACE_9);
         setFrtoHipaaCd(CONSTANTS.SPACE_2);
   }

		public static int getDclfeSpiRuleFrToSvcFieldLength() {
			return DCLFE_SPI_RULE_FR_TO_SVC_LENGTH;
		}

}
  
