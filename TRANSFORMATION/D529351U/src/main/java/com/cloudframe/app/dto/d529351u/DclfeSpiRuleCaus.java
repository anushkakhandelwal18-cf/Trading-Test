package com.cloudframe.app.dto.d529351u;

/**
*  The class DclfeSpiRuleCaus is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:50. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class DclfeSpiRuleCaus extends DclfeSpiRuleCausSerialized { 
   

						private char[] causSpiTblId = Field.fillLowValue(7);

						private char[] causStsCd = Field.fillLowValue(1);

						private char[] causDerivPlOfSvcCd = Field.fillLowValue(2);

						private char[] causDerivSvcCd = Field.fillLowValue(6);

						private char[] causDerivCausCd = Field.fillLowValue(1);

						private char[] causCreatDttm = Field.fillLowValue(26);

						private char[] causClmCaus1Cd = Field.fillLowValue(1);

						private char[] causClmCaus2Cd = Field.fillLowValue(1);

						private char[] causClmCaus3Cd = Field.fillLowValue(1);

						private char[] causClmCaus4Cd = Field.fillLowValue(1);

						private char[] causClmCaus5Cd = Field.fillLowValue(1);

						private char[] causClmCaus6Cd = Field.fillLowValue(1);

						private char[] causClmCaus7Cd = Field.fillLowValue(1);

						private char[] causClmCaus8Cd = Field.fillLowValue(1);

						private char[] causPgmId = Field.fillLowValue(8);

						private char[] causLstUpdtDttm = Field.fillLowValue(26);

						private char[] causLstUpdtUserId = Field.fillLowValue(9);
	
	/**
	* Constructor for DclfeSpiRuleCaus
	**/
    public DclfeSpiRuleCaus() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of causSpiTblId
	 *	@return causSpiTblId
	 */
   public char[] getCausSpiTblId() throws CFException{
     if (isCausSpiTblIdModified()) { 
        causSpiTblId = refreshCausSpiTblId();
     }
   		return causSpiTblId;
   }

  
	/**
	*  set variable causSpiTblId
	*  Corresponding COBOL Variable is CAUS-SPI-TBL-ID
	*  @param value
	**/
   public void setCausSpiTblId(char[] value) {
      causSpiTblId = checkCausSpiTblIdConstraints(value);
      serializeCausSpiTblId(causSpiTblId);
   } 

     /**
	 * 	Update CausSpiTblId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCausSpiTblId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCausSpiTblId,causSpiTblId.length);
   	
   }
   
   public void setCausSpiTblId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCausSpiTblId,causSpiTblId.length);
   	
   }
   
     /**
	 * 	Update CausSpiTblId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCausSpiTblId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCausSpiTblId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CausSpiTblId with another Field
	 *	@param value
	 */
   public void setCausSpiTblId(Field source) {
       replace(source,0,source.length(),beginCausSpiTblId,CAUS_SPI_TBL_ID_LEN);
   	
   }  
   
     /**
	 * 	Update CausSpiTblId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCausSpiTblId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCausSpiTblId,CAUS_SPI_TBL_ID_LEN);
   	
   }
   
     /**
	 * 	Update CausSpiTblId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCausSpiTblId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCausSpiTblId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of causStsCd
	 *	@return causStsCd
	 */
   public char[] getCausStsCd() throws CFException{
     if (isCausStsCdModified()) { 
        causStsCd = refreshCausStsCd();
     }
   		return causStsCd;
   }

  
	/**
	*  set variable causStsCd
	*  Corresponding COBOL Variable is CAUS-STS-CD
	*  @param value
	**/
   public void setCausStsCd(char[] value) {
      causStsCd = checkCausStsCdConstraints(value);
      serializeCausStsCd(causStsCd);
   } 

     /**
	 * 	Update CausStsCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCausStsCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCausStsCd,causStsCd.length);
   	
   }
   
   public void setCausStsCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCausStsCd,causStsCd.length);
   	
   }
   
     /**
	 * 	Update CausStsCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCausStsCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCausStsCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CausStsCd with another Field
	 *	@param value
	 */
   public void setCausStsCd(Field source) {
       replace(source,0,source.length(),beginCausStsCd,CAUS_STS_CD_LEN);
   	
   }  
   
     /**
	 * 	Update CausStsCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCausStsCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCausStsCd,CAUS_STS_CD_LEN);
   	
   }
   
     /**
	 * 	Update CausStsCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCausStsCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCausStsCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of causDerivPlOfSvcCd
	 *	@return causDerivPlOfSvcCd
	 */
   public char[] getCausDerivPlOfSvcCd() throws CFException{
     if (isCausDerivPlOfSvcCdModified()) { 
        causDerivPlOfSvcCd = refreshCausDerivPlOfSvcCd();
     }
   		return causDerivPlOfSvcCd;
   }

  
	/**
	*  set variable causDerivPlOfSvcCd
	*  Corresponding COBOL Variable is CAUS-DERIV-PL-OF-SVC-CD
	*  @param value
	**/
   public void setCausDerivPlOfSvcCd(char[] value) {
      causDerivPlOfSvcCd = checkCausDerivPlOfSvcCdConstraints(value);
      serializeCausDerivPlOfSvcCd(causDerivPlOfSvcCd);
   } 

     /**
	 * 	Update CausDerivPlOfSvcCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCausDerivPlOfSvcCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCausDerivPlOfSvcCd,causDerivPlOfSvcCd.length);
   	
   }
   
   public void setCausDerivPlOfSvcCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCausDerivPlOfSvcCd,causDerivPlOfSvcCd.length);
   	
   }
   
     /**
	 * 	Update CausDerivPlOfSvcCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCausDerivPlOfSvcCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCausDerivPlOfSvcCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CausDerivPlOfSvcCd with another Field
	 *	@param value
	 */
   public void setCausDerivPlOfSvcCd(Field source) {
       replace(source,0,source.length(),beginCausDerivPlOfSvcCd,CAUS_DERIV_PL_OF_SVC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update CausDerivPlOfSvcCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCausDerivPlOfSvcCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCausDerivPlOfSvcCd,CAUS_DERIV_PL_OF_SVC_CD_LEN);
   	
   }
   
     /**
	 * 	Update CausDerivPlOfSvcCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCausDerivPlOfSvcCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCausDerivPlOfSvcCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of causDerivSvcCd
	 *	@return causDerivSvcCd
	 */
   public char[] getCausDerivSvcCd() throws CFException{
     if (isCausDerivSvcCdModified()) { 
        causDerivSvcCd = refreshCausDerivSvcCd();
     }
   		return causDerivSvcCd;
   }

  
	/**
	*  set variable causDerivSvcCd
	*  Corresponding COBOL Variable is CAUS-DERIV-SVC-CD
	*  @param value
	**/
   public void setCausDerivSvcCd(char[] value) {
      causDerivSvcCd = checkCausDerivSvcCdConstraints(value);
      serializeCausDerivSvcCd(causDerivSvcCd);
   } 

     /**
	 * 	Update CausDerivSvcCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCausDerivSvcCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCausDerivSvcCd,causDerivSvcCd.length);
   	
   }
   
   public void setCausDerivSvcCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCausDerivSvcCd,causDerivSvcCd.length);
   	
   }
   
     /**
	 * 	Update CausDerivSvcCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCausDerivSvcCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCausDerivSvcCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CausDerivSvcCd with another Field
	 *	@param value
	 */
   public void setCausDerivSvcCd(Field source) {
       replace(source,0,source.length(),beginCausDerivSvcCd,CAUS_DERIV_SVC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update CausDerivSvcCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCausDerivSvcCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCausDerivSvcCd,CAUS_DERIV_SVC_CD_LEN);
   	
   }
   
     /**
	 * 	Update CausDerivSvcCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCausDerivSvcCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCausDerivSvcCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of causDerivCausCd
	 *	@return causDerivCausCd
	 */
   public char[] getCausDerivCausCd() throws CFException{
     if (isCausDerivCausCdModified()) { 
        causDerivCausCd = refreshCausDerivCausCd();
     }
   		return causDerivCausCd;
   }

  
	/**
	*  set variable causDerivCausCd
	*  Corresponding COBOL Variable is CAUS-DERIV-CAUS-CD
	*  @param value
	**/
   public void setCausDerivCausCd(char[] value) {
      causDerivCausCd = checkCausDerivCausCdConstraints(value);
      serializeCausDerivCausCd(causDerivCausCd);
   } 

     /**
	 * 	Update CausDerivCausCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCausDerivCausCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCausDerivCausCd,causDerivCausCd.length);
   	
   }
   
   public void setCausDerivCausCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCausDerivCausCd,causDerivCausCd.length);
   	
   }
   
     /**
	 * 	Update CausDerivCausCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCausDerivCausCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCausDerivCausCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CausDerivCausCd with another Field
	 *	@param value
	 */
   public void setCausDerivCausCd(Field source) {
       replace(source,0,source.length(),beginCausDerivCausCd,CAUS_DERIV_CAUS_CD_LEN);
   	
   }  
   
     /**
	 * 	Update CausDerivCausCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCausDerivCausCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCausDerivCausCd,CAUS_DERIV_CAUS_CD_LEN);
   	
   }
   
     /**
	 * 	Update CausDerivCausCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCausDerivCausCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCausDerivCausCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of causCreatDttm
	 *	@return causCreatDttm
	 */
   public char[] getCausCreatDttm() throws CFException{
     if (isCausCreatDttmModified()) { 
        causCreatDttm = refreshCausCreatDttm();
     }
   		return causCreatDttm;
   }

  
	/**
	*  set variable causCreatDttm
	*  Corresponding COBOL Variable is CAUS-CREAT-DTTM
	*  @param value
	**/
   public void setCausCreatDttm(char[] value) {
      causCreatDttm = checkCausCreatDttmConstraints(value);
      serializeCausCreatDttm(causCreatDttm);
   } 

     /**
	 * 	Update CausCreatDttm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCausCreatDttm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCausCreatDttm,causCreatDttm.length);
   	
   }
   
   public void setCausCreatDttm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCausCreatDttm,causCreatDttm.length);
   	
   }
   
     /**
	 * 	Update CausCreatDttm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCausCreatDttm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCausCreatDttm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CausCreatDttm with another Field
	 *	@param value
	 */
   public void setCausCreatDttm(Field source) {
       replace(source,0,source.length(),beginCausCreatDttm,CAUS_CREAT_DTTM_LEN);
   	
   }  
   
     /**
	 * 	Update CausCreatDttm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCausCreatDttm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCausCreatDttm,CAUS_CREAT_DTTM_LEN);
   	
   }
   
     /**
	 * 	Update CausCreatDttm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCausCreatDttm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCausCreatDttm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of causClmCaus1Cd
	 *	@return causClmCaus1Cd
	 */
   public char[] getCausClmCaus1Cd() throws CFException{
     if (isCausClmCaus1CdModified()) { 
        causClmCaus1Cd = refreshCausClmCaus1Cd();
     }
   		return causClmCaus1Cd;
   }

  
	/**
	*  set variable causClmCaus1Cd
	*  Corresponding COBOL Variable is CAUS-CLM-CAUS-1-CD
	*  @param value
	**/
   public void setCausClmCaus1Cd(char[] value) {
      causClmCaus1Cd = checkCausClmCaus1CdConstraints(value);
      serializeCausClmCaus1Cd(causClmCaus1Cd);
   } 

     /**
	 * 	Update CausClmCaus1Cd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCausClmCaus1Cd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCausClmCaus1Cd,causClmCaus1Cd.length);
   	
   }
   
   public void setCausClmCaus1Cd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCausClmCaus1Cd,causClmCaus1Cd.length);
   	
   }
   
     /**
	 * 	Update CausClmCaus1Cd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCausClmCaus1Cd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCausClmCaus1Cd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CausClmCaus1Cd with another Field
	 *	@param value
	 */
   public void setCausClmCaus1Cd(Field source) {
       replace(source,0,source.length(),beginCausClmCaus1Cd,CAUS_CLM_CAUS_1_CD_LEN);
   	
   }  
   
     /**
	 * 	Update CausClmCaus1Cd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCausClmCaus1Cd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCausClmCaus1Cd,CAUS_CLM_CAUS_1_CD_LEN);
   	
   }
   
     /**
	 * 	Update CausClmCaus1Cd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCausClmCaus1Cd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCausClmCaus1Cd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of causClmCaus2Cd
	 *	@return causClmCaus2Cd
	 */
   public char[] getCausClmCaus2Cd() throws CFException{
     if (isCausClmCaus2CdModified()) { 
        causClmCaus2Cd = refreshCausClmCaus2Cd();
     }
   		return causClmCaus2Cd;
   }

  
	/**
	*  set variable causClmCaus2Cd
	*  Corresponding COBOL Variable is CAUS-CLM-CAUS-2-CD
	*  @param value
	**/
   public void setCausClmCaus2Cd(char[] value) {
      causClmCaus2Cd = checkCausClmCaus2CdConstraints(value);
      serializeCausClmCaus2Cd(causClmCaus2Cd);
   } 

     /**
	 * 	Update CausClmCaus2Cd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCausClmCaus2Cd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCausClmCaus2Cd,causClmCaus2Cd.length);
   	
   }
   
   public void setCausClmCaus2Cd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCausClmCaus2Cd,causClmCaus2Cd.length);
   	
   }
   
     /**
	 * 	Update CausClmCaus2Cd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCausClmCaus2Cd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCausClmCaus2Cd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CausClmCaus2Cd with another Field
	 *	@param value
	 */
   public void setCausClmCaus2Cd(Field source) {
       replace(source,0,source.length(),beginCausClmCaus2Cd,CAUS_CLM_CAUS_2_CD_LEN);
   	
   }  
   
     /**
	 * 	Update CausClmCaus2Cd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCausClmCaus2Cd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCausClmCaus2Cd,CAUS_CLM_CAUS_2_CD_LEN);
   	
   }
   
     /**
	 * 	Update CausClmCaus2Cd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCausClmCaus2Cd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCausClmCaus2Cd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of causClmCaus3Cd
	 *	@return causClmCaus3Cd
	 */
   public char[] getCausClmCaus3Cd() throws CFException{
     if (isCausClmCaus3CdModified()) { 
        causClmCaus3Cd = refreshCausClmCaus3Cd();
     }
   		return causClmCaus3Cd;
   }

  
	/**
	*  set variable causClmCaus3Cd
	*  Corresponding COBOL Variable is CAUS-CLM-CAUS-3-CD
	*  @param value
	**/
   public void setCausClmCaus3Cd(char[] value) {
      causClmCaus3Cd = checkCausClmCaus3CdConstraints(value);
      serializeCausClmCaus3Cd(causClmCaus3Cd);
   } 

     /**
	 * 	Update CausClmCaus3Cd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCausClmCaus3Cd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCausClmCaus3Cd,causClmCaus3Cd.length);
   	
   }
   
   public void setCausClmCaus3Cd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCausClmCaus3Cd,causClmCaus3Cd.length);
   	
   }
   
     /**
	 * 	Update CausClmCaus3Cd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCausClmCaus3Cd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCausClmCaus3Cd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CausClmCaus3Cd with another Field
	 *	@param value
	 */
   public void setCausClmCaus3Cd(Field source) {
       replace(source,0,source.length(),beginCausClmCaus3Cd,CAUS_CLM_CAUS_3_CD_LEN);
   	
   }  
   
     /**
	 * 	Update CausClmCaus3Cd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCausClmCaus3Cd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCausClmCaus3Cd,CAUS_CLM_CAUS_3_CD_LEN);
   	
   }
   
     /**
	 * 	Update CausClmCaus3Cd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCausClmCaus3Cd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCausClmCaus3Cd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of causClmCaus4Cd
	 *	@return causClmCaus4Cd
	 */
   public char[] getCausClmCaus4Cd() throws CFException{
     if (isCausClmCaus4CdModified()) { 
        causClmCaus4Cd = refreshCausClmCaus4Cd();
     }
   		return causClmCaus4Cd;
   }

  
	/**
	*  set variable causClmCaus4Cd
	*  Corresponding COBOL Variable is CAUS-CLM-CAUS-4-CD
	*  @param value
	**/
   public void setCausClmCaus4Cd(char[] value) {
      causClmCaus4Cd = checkCausClmCaus4CdConstraints(value);
      serializeCausClmCaus4Cd(causClmCaus4Cd);
   } 

     /**
	 * 	Update CausClmCaus4Cd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCausClmCaus4Cd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCausClmCaus4Cd,causClmCaus4Cd.length);
   	
   }
   
   public void setCausClmCaus4Cd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCausClmCaus4Cd,causClmCaus4Cd.length);
   	
   }
   
     /**
	 * 	Update CausClmCaus4Cd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCausClmCaus4Cd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCausClmCaus4Cd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CausClmCaus4Cd with another Field
	 *	@param value
	 */
   public void setCausClmCaus4Cd(Field source) {
       replace(source,0,source.length(),beginCausClmCaus4Cd,CAUS_CLM_CAUS_4_CD_LEN);
   	
   }  
   
     /**
	 * 	Update CausClmCaus4Cd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCausClmCaus4Cd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCausClmCaus4Cd,CAUS_CLM_CAUS_4_CD_LEN);
   	
   }
   
     /**
	 * 	Update CausClmCaus4Cd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCausClmCaus4Cd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCausClmCaus4Cd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of causClmCaus5Cd
	 *	@return causClmCaus5Cd
	 */
   public char[] getCausClmCaus5Cd() throws CFException{
     if (isCausClmCaus5CdModified()) { 
        causClmCaus5Cd = refreshCausClmCaus5Cd();
     }
   		return causClmCaus5Cd;
   }

  
	/**
	*  set variable causClmCaus5Cd
	*  Corresponding COBOL Variable is CAUS-CLM-CAUS-5-CD
	*  @param value
	**/
   public void setCausClmCaus5Cd(char[] value) {
      causClmCaus5Cd = checkCausClmCaus5CdConstraints(value);
      serializeCausClmCaus5Cd(causClmCaus5Cd);
   } 

     /**
	 * 	Update CausClmCaus5Cd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCausClmCaus5Cd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCausClmCaus5Cd,causClmCaus5Cd.length);
   	
   }
   
   public void setCausClmCaus5Cd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCausClmCaus5Cd,causClmCaus5Cd.length);
   	
   }
   
     /**
	 * 	Update CausClmCaus5Cd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCausClmCaus5Cd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCausClmCaus5Cd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CausClmCaus5Cd with another Field
	 *	@param value
	 */
   public void setCausClmCaus5Cd(Field source) {
       replace(source,0,source.length(),beginCausClmCaus5Cd,CAUS_CLM_CAUS_5_CD_LEN);
   	
   }  
   
     /**
	 * 	Update CausClmCaus5Cd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCausClmCaus5Cd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCausClmCaus5Cd,CAUS_CLM_CAUS_5_CD_LEN);
   	
   }
   
     /**
	 * 	Update CausClmCaus5Cd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCausClmCaus5Cd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCausClmCaus5Cd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of causClmCaus6Cd
	 *	@return causClmCaus6Cd
	 */
   public char[] getCausClmCaus6Cd() throws CFException{
     if (isCausClmCaus6CdModified()) { 
        causClmCaus6Cd = refreshCausClmCaus6Cd();
     }
   		return causClmCaus6Cd;
   }

  
	/**
	*  set variable causClmCaus6Cd
	*  Corresponding COBOL Variable is CAUS-CLM-CAUS-6-CD
	*  @param value
	**/
   public void setCausClmCaus6Cd(char[] value) {
      causClmCaus6Cd = checkCausClmCaus6CdConstraints(value);
      serializeCausClmCaus6Cd(causClmCaus6Cd);
   } 

     /**
	 * 	Update CausClmCaus6Cd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCausClmCaus6Cd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCausClmCaus6Cd,causClmCaus6Cd.length);
   	
   }
   
   public void setCausClmCaus6Cd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCausClmCaus6Cd,causClmCaus6Cd.length);
   	
   }
   
     /**
	 * 	Update CausClmCaus6Cd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCausClmCaus6Cd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCausClmCaus6Cd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CausClmCaus6Cd with another Field
	 *	@param value
	 */
   public void setCausClmCaus6Cd(Field source) {
       replace(source,0,source.length(),beginCausClmCaus6Cd,CAUS_CLM_CAUS_6_CD_LEN);
   	
   }  
   
     /**
	 * 	Update CausClmCaus6Cd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCausClmCaus6Cd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCausClmCaus6Cd,CAUS_CLM_CAUS_6_CD_LEN);
   	
   }
   
     /**
	 * 	Update CausClmCaus6Cd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCausClmCaus6Cd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCausClmCaus6Cd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of causClmCaus7Cd
	 *	@return causClmCaus7Cd
	 */
   public char[] getCausClmCaus7Cd() throws CFException{
     if (isCausClmCaus7CdModified()) { 
        causClmCaus7Cd = refreshCausClmCaus7Cd();
     }
   		return causClmCaus7Cd;
   }

  
	/**
	*  set variable causClmCaus7Cd
	*  Corresponding COBOL Variable is CAUS-CLM-CAUS-7-CD
	*  @param value
	**/
   public void setCausClmCaus7Cd(char[] value) {
      causClmCaus7Cd = checkCausClmCaus7CdConstraints(value);
      serializeCausClmCaus7Cd(causClmCaus7Cd);
   } 

     /**
	 * 	Update CausClmCaus7Cd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCausClmCaus7Cd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCausClmCaus7Cd,causClmCaus7Cd.length);
   	
   }
   
   public void setCausClmCaus7Cd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCausClmCaus7Cd,causClmCaus7Cd.length);
   	
   }
   
     /**
	 * 	Update CausClmCaus7Cd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCausClmCaus7Cd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCausClmCaus7Cd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CausClmCaus7Cd with another Field
	 *	@param value
	 */
   public void setCausClmCaus7Cd(Field source) {
       replace(source,0,source.length(),beginCausClmCaus7Cd,CAUS_CLM_CAUS_7_CD_LEN);
   	
   }  
   
     /**
	 * 	Update CausClmCaus7Cd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCausClmCaus7Cd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCausClmCaus7Cd,CAUS_CLM_CAUS_7_CD_LEN);
   	
   }
   
     /**
	 * 	Update CausClmCaus7Cd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCausClmCaus7Cd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCausClmCaus7Cd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of causClmCaus8Cd
	 *	@return causClmCaus8Cd
	 */
   public char[] getCausClmCaus8Cd() throws CFException{
     if (isCausClmCaus8CdModified()) { 
        causClmCaus8Cd = refreshCausClmCaus8Cd();
     }
   		return causClmCaus8Cd;
   }

  
	/**
	*  set variable causClmCaus8Cd
	*  Corresponding COBOL Variable is CAUS-CLM-CAUS-8-CD
	*  @param value
	**/
   public void setCausClmCaus8Cd(char[] value) {
      causClmCaus8Cd = checkCausClmCaus8CdConstraints(value);
      serializeCausClmCaus8Cd(causClmCaus8Cd);
   } 

     /**
	 * 	Update CausClmCaus8Cd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCausClmCaus8Cd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCausClmCaus8Cd,causClmCaus8Cd.length);
   	
   }
   
   public void setCausClmCaus8Cd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCausClmCaus8Cd,causClmCaus8Cd.length);
   	
   }
   
     /**
	 * 	Update CausClmCaus8Cd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCausClmCaus8Cd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCausClmCaus8Cd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CausClmCaus8Cd with another Field
	 *	@param value
	 */
   public void setCausClmCaus8Cd(Field source) {
       replace(source,0,source.length(),beginCausClmCaus8Cd,CAUS_CLM_CAUS_8_CD_LEN);
   	
   }  
   
     /**
	 * 	Update CausClmCaus8Cd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCausClmCaus8Cd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCausClmCaus8Cd,CAUS_CLM_CAUS_8_CD_LEN);
   	
   }
   
     /**
	 * 	Update CausClmCaus8Cd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCausClmCaus8Cd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCausClmCaus8Cd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of causPgmId
	 *	@return causPgmId
	 */
   public char[] getCausPgmId() throws CFException{
     if (isCausPgmIdModified()) { 
        causPgmId = refreshCausPgmId();
     }
   		return causPgmId;
   }

  
	/**
	*  set variable causPgmId
	*  Corresponding COBOL Variable is CAUS-PGM-ID
	*  @param value
	**/
   public void setCausPgmId(char[] value) {
      causPgmId = checkCausPgmIdConstraints(value);
      serializeCausPgmId(causPgmId);
   } 

     /**
	 * 	Update CausPgmId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCausPgmId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCausPgmId,causPgmId.length);
   	
   }
   
   public void setCausPgmId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCausPgmId,causPgmId.length);
   	
   }
   
     /**
	 * 	Update CausPgmId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCausPgmId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCausPgmId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CausPgmId with another Field
	 *	@param value
	 */
   public void setCausPgmId(Field source) {
       replace(source,0,source.length(),beginCausPgmId,CAUS_PGM_ID_LEN);
   	
   }  
   
     /**
	 * 	Update CausPgmId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCausPgmId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCausPgmId,CAUS_PGM_ID_LEN);
   	
   }
   
     /**
	 * 	Update CausPgmId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCausPgmId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCausPgmId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of causLstUpdtDttm
	 *	@return causLstUpdtDttm
	 */
   public char[] getCausLstUpdtDttm() throws CFException{
     if (isCausLstUpdtDttmModified()) { 
        causLstUpdtDttm = refreshCausLstUpdtDttm();
     }
   		return causLstUpdtDttm;
   }

  
	/**
	*  set variable causLstUpdtDttm
	*  Corresponding COBOL Variable is CAUS-LST-UPDT-DTTM
	*  @param value
	**/
   public void setCausLstUpdtDttm(char[] value) {
      causLstUpdtDttm = checkCausLstUpdtDttmConstraints(value);
      serializeCausLstUpdtDttm(causLstUpdtDttm);
   } 

     /**
	 * 	Update CausLstUpdtDttm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCausLstUpdtDttm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCausLstUpdtDttm,causLstUpdtDttm.length);
   	
   }
   
   public void setCausLstUpdtDttm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCausLstUpdtDttm,causLstUpdtDttm.length);
   	
   }
   
     /**
	 * 	Update CausLstUpdtDttm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCausLstUpdtDttm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCausLstUpdtDttm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CausLstUpdtDttm with another Field
	 *	@param value
	 */
   public void setCausLstUpdtDttm(Field source) {
       replace(source,0,source.length(),beginCausLstUpdtDttm,CAUS_LST_UPDT_DTTM_LEN);
   	
   }  
   
     /**
	 * 	Update CausLstUpdtDttm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCausLstUpdtDttm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCausLstUpdtDttm,CAUS_LST_UPDT_DTTM_LEN);
   	
   }
   
     /**
	 * 	Update CausLstUpdtDttm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCausLstUpdtDttm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCausLstUpdtDttm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of causLstUpdtUserId
	 *	@return causLstUpdtUserId
	 */
   public char[] getCausLstUpdtUserId() throws CFException{
     if (isCausLstUpdtUserIdModified()) { 
        causLstUpdtUserId = refreshCausLstUpdtUserId();
     }
   		return causLstUpdtUserId;
   }

  
	/**
	*  set variable causLstUpdtUserId
	*  Corresponding COBOL Variable is CAUS-LST-UPDT-USER-ID
	*  @param value
	**/
   public void setCausLstUpdtUserId(char[] value) {
      causLstUpdtUserId = checkCausLstUpdtUserIdConstraints(value);
      serializeCausLstUpdtUserId(causLstUpdtUserId);
   } 

     /**
	 * 	Update CausLstUpdtUserId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCausLstUpdtUserId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCausLstUpdtUserId,causLstUpdtUserId.length);
   	
   }
   
   public void setCausLstUpdtUserId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCausLstUpdtUserId,causLstUpdtUserId.length);
   	
   }
   
     /**
	 * 	Update CausLstUpdtUserId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCausLstUpdtUserId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCausLstUpdtUserId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CausLstUpdtUserId with another Field
	 *	@param value
	 */
   public void setCausLstUpdtUserId(Field source) {
       replace(source,0,source.length(),beginCausLstUpdtUserId,CAUS_LST_UPDT_USER_ID_LEN);
   	
   }  
   
     /**
	 * 	Update CausLstUpdtUserId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCausLstUpdtUserId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCausLstUpdtUserId,CAUS_LST_UPDT_USER_ID_LEN);
   	
   }
   
     /**
	 * 	Update CausLstUpdtUserId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCausLstUpdtUserId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCausLstUpdtUserId+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes DclfeSpiRuleCaus
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setCausSpiTblId(CONSTANTS.SPACE_7);
         setCausStsCd(CONSTANTS.SPACE);
         setCausDerivPlOfSvcCd(CONSTANTS.SPACE_2);
         setCausDerivSvcCd(CONSTANTS.SPACE_6);
         setCausDerivCausCd(CONSTANTS.SPACE);
         setCausCreatDttm(CONSTANTS.SPACE_26);
         setCausClmCaus1Cd(CONSTANTS.SPACE);
         setCausClmCaus2Cd(CONSTANTS.SPACE);
         setCausClmCaus3Cd(CONSTANTS.SPACE);
         setCausClmCaus4Cd(CONSTANTS.SPACE);
         setCausClmCaus5Cd(CONSTANTS.SPACE);
         setCausClmCaus6Cd(CONSTANTS.SPACE);
         setCausClmCaus7Cd(CONSTANTS.SPACE);
         setCausClmCaus8Cd(CONSTANTS.SPACE);
         setCausPgmId(CONSTANTS.SPACE_8);
         setCausLstUpdtDttm(CONSTANTS.SPACE_26);
         setCausLstUpdtUserId(CONSTANTS.SPACE_9);
   }

		public static int getDclfeSpiRuleCausFieldLength() {
			return DCLFE_SPI_RULE_CAUS_LENGTH;
		}

}
  
