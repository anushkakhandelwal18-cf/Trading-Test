package com.cloudframe.app.dto.d529351u;

/**
*  The class DclfeSpiRuleIpa is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class DclfeSpiRuleIpa extends DclfeSpiRuleIpaSerialized { 
   

						private char[] ripaSpiTblId = Field.fillLowValue(7);

						private char[] ripaStsCd = Field.fillLowValue(1);

						private char[] ripaDerivPlOfSvcCd = Field.fillLowValue(2);

						private char[] ripaDerivSvcCd = Field.fillLowValue(6);

						private char[] ripaDerivCausCd = Field.fillLowValue(1);

						private char[] ripaCreatDttm = Field.fillLowValue(26);

						private char[] ripaClmIpa1Cd = Field.fillLowValue(3);

						private char[] ripaClmIpa2Cd = Field.fillLowValue(3);

						private char[] ripaClmIpa3Cd = Field.fillLowValue(3);

						private char[] ripaPgmId = Field.fillLowValue(8);

						private char[] ripaLstUpdtDttm = Field.fillLowValue(26);

						private char[] ripaLstUpdtUserId = Field.fillLowValue(9);

						private char[] ripaGrpTbl1Nbr = Field.fillLowValue(4);

						private char[] ripaGrpTbl2Nbr = Field.fillLowValue(4);

						private char[] ripaGrpTbl3Nbr = Field.fillLowValue(4);
	
	/**
	* Constructor for DclfeSpiRuleIpa
	**/
    public DclfeSpiRuleIpa() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ripaSpiTblId
	 *	@return ripaSpiTblId
	 */
   public char[] getRipaSpiTblId() throws CFException{
     if (isRipaSpiTblIdModified()) { 
        ripaSpiTblId = refreshRipaSpiTblId();
     }
   		return ripaSpiTblId;
   }

  
	/**
	*  set variable ripaSpiTblId
	*  Corresponding COBOL Variable is RIPA-SPI-TBL-ID
	*  @param value
	**/
   public void setRipaSpiTblId(char[] value) {
      ripaSpiTblId = checkRipaSpiTblIdConstraints(value);
      serializeRipaSpiTblId(ripaSpiTblId);
   } 

     /**
	 * 	Update RipaSpiTblId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRipaSpiTblId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRipaSpiTblId,ripaSpiTblId.length);
   	
   }
   
   public void setRipaSpiTblId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRipaSpiTblId,ripaSpiTblId.length);
   	
   }
   
     /**
	 * 	Update RipaSpiTblId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRipaSpiTblId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRipaSpiTblId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RipaSpiTblId with another Field
	 *	@param value
	 */
   public void setRipaSpiTblId(Field source) {
       replace(source,0,source.length(),beginRipaSpiTblId,RIPA_SPI_TBL_ID_LEN);
   	
   }  
   
     /**
	 * 	Update RipaSpiTblId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRipaSpiTblId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRipaSpiTblId,RIPA_SPI_TBL_ID_LEN);
   	
   }
   
     /**
	 * 	Update RipaSpiTblId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRipaSpiTblId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRipaSpiTblId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ripaStsCd
	 *	@return ripaStsCd
	 */
   public char[] getRipaStsCd() throws CFException{
     if (isRipaStsCdModified()) { 
        ripaStsCd = refreshRipaStsCd();
     }
   		return ripaStsCd;
   }

  
	/**
	*  set variable ripaStsCd
	*  Corresponding COBOL Variable is RIPA-STS-CD
	*  @param value
	**/
   public void setRipaStsCd(char[] value) {
      ripaStsCd = checkRipaStsCdConstraints(value);
      serializeRipaStsCd(ripaStsCd);
   } 

     /**
	 * 	Update RipaStsCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRipaStsCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRipaStsCd,ripaStsCd.length);
   	
   }
   
   public void setRipaStsCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRipaStsCd,ripaStsCd.length);
   	
   }
   
     /**
	 * 	Update RipaStsCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRipaStsCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRipaStsCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RipaStsCd with another Field
	 *	@param value
	 */
   public void setRipaStsCd(Field source) {
       replace(source,0,source.length(),beginRipaStsCd,RIPA_STS_CD_LEN);
   	
   }  
   
     /**
	 * 	Update RipaStsCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRipaStsCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRipaStsCd,RIPA_STS_CD_LEN);
   	
   }
   
     /**
	 * 	Update RipaStsCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRipaStsCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRipaStsCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ripaDerivPlOfSvcCd
	 *	@return ripaDerivPlOfSvcCd
	 */
   public char[] getRipaDerivPlOfSvcCd() throws CFException{
     if (isRipaDerivPlOfSvcCdModified()) { 
        ripaDerivPlOfSvcCd = refreshRipaDerivPlOfSvcCd();
     }
   		return ripaDerivPlOfSvcCd;
   }

  
	/**
	*  set variable ripaDerivPlOfSvcCd
	*  Corresponding COBOL Variable is RIPA-DERIV-PL-OF-SVC-CD
	*  @param value
	**/
   public void setRipaDerivPlOfSvcCd(char[] value) {
      ripaDerivPlOfSvcCd = checkRipaDerivPlOfSvcCdConstraints(value);
      serializeRipaDerivPlOfSvcCd(ripaDerivPlOfSvcCd);
   } 

     /**
	 * 	Update RipaDerivPlOfSvcCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRipaDerivPlOfSvcCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRipaDerivPlOfSvcCd,ripaDerivPlOfSvcCd.length);
   	
   }
   
   public void setRipaDerivPlOfSvcCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRipaDerivPlOfSvcCd,ripaDerivPlOfSvcCd.length);
   	
   }
   
     /**
	 * 	Update RipaDerivPlOfSvcCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRipaDerivPlOfSvcCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRipaDerivPlOfSvcCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RipaDerivPlOfSvcCd with another Field
	 *	@param value
	 */
   public void setRipaDerivPlOfSvcCd(Field source) {
       replace(source,0,source.length(),beginRipaDerivPlOfSvcCd,RIPA_DERIV_PL_OF_SVC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update RipaDerivPlOfSvcCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRipaDerivPlOfSvcCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRipaDerivPlOfSvcCd,RIPA_DERIV_PL_OF_SVC_CD_LEN);
   	
   }
   
     /**
	 * 	Update RipaDerivPlOfSvcCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRipaDerivPlOfSvcCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRipaDerivPlOfSvcCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ripaDerivSvcCd
	 *	@return ripaDerivSvcCd
	 */
   public char[] getRipaDerivSvcCd() throws CFException{
     if (isRipaDerivSvcCdModified()) { 
        ripaDerivSvcCd = refreshRipaDerivSvcCd();
     }
   		return ripaDerivSvcCd;
   }

  
	/**
	*  set variable ripaDerivSvcCd
	*  Corresponding COBOL Variable is RIPA-DERIV-SVC-CD
	*  @param value
	**/
   public void setRipaDerivSvcCd(char[] value) {
      ripaDerivSvcCd = checkRipaDerivSvcCdConstraints(value);
      serializeRipaDerivSvcCd(ripaDerivSvcCd);
   } 

     /**
	 * 	Update RipaDerivSvcCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRipaDerivSvcCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRipaDerivSvcCd,ripaDerivSvcCd.length);
   	
   }
   
   public void setRipaDerivSvcCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRipaDerivSvcCd,ripaDerivSvcCd.length);
   	
   }
   
     /**
	 * 	Update RipaDerivSvcCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRipaDerivSvcCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRipaDerivSvcCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RipaDerivSvcCd with another Field
	 *	@param value
	 */
   public void setRipaDerivSvcCd(Field source) {
       replace(source,0,source.length(),beginRipaDerivSvcCd,RIPA_DERIV_SVC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update RipaDerivSvcCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRipaDerivSvcCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRipaDerivSvcCd,RIPA_DERIV_SVC_CD_LEN);
   	
   }
   
     /**
	 * 	Update RipaDerivSvcCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRipaDerivSvcCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRipaDerivSvcCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ripaDerivCausCd
	 *	@return ripaDerivCausCd
	 */
   public char[] getRipaDerivCausCd() throws CFException{
     if (isRipaDerivCausCdModified()) { 
        ripaDerivCausCd = refreshRipaDerivCausCd();
     }
   		return ripaDerivCausCd;
   }

  
	/**
	*  set variable ripaDerivCausCd
	*  Corresponding COBOL Variable is RIPA-DERIV-CAUS-CD
	*  @param value
	**/
   public void setRipaDerivCausCd(char[] value) {
      ripaDerivCausCd = checkRipaDerivCausCdConstraints(value);
      serializeRipaDerivCausCd(ripaDerivCausCd);
   } 

     /**
	 * 	Update RipaDerivCausCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRipaDerivCausCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRipaDerivCausCd,ripaDerivCausCd.length);
   	
   }
   
   public void setRipaDerivCausCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRipaDerivCausCd,ripaDerivCausCd.length);
   	
   }
   
     /**
	 * 	Update RipaDerivCausCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRipaDerivCausCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRipaDerivCausCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RipaDerivCausCd with another Field
	 *	@param value
	 */
   public void setRipaDerivCausCd(Field source) {
       replace(source,0,source.length(),beginRipaDerivCausCd,RIPA_DERIV_CAUS_CD_LEN);
   	
   }  
   
     /**
	 * 	Update RipaDerivCausCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRipaDerivCausCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRipaDerivCausCd,RIPA_DERIV_CAUS_CD_LEN);
   	
   }
   
     /**
	 * 	Update RipaDerivCausCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRipaDerivCausCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRipaDerivCausCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ripaCreatDttm
	 *	@return ripaCreatDttm
	 */
   public char[] getRipaCreatDttm() throws CFException{
     if (isRipaCreatDttmModified()) { 
        ripaCreatDttm = refreshRipaCreatDttm();
     }
   		return ripaCreatDttm;
   }

  
	/**
	*  set variable ripaCreatDttm
	*  Corresponding COBOL Variable is RIPA-CREAT-DTTM
	*  @param value
	**/
   public void setRipaCreatDttm(char[] value) {
      ripaCreatDttm = checkRipaCreatDttmConstraints(value);
      serializeRipaCreatDttm(ripaCreatDttm);
   } 

     /**
	 * 	Update RipaCreatDttm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRipaCreatDttm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRipaCreatDttm,ripaCreatDttm.length);
   	
   }
   
   public void setRipaCreatDttm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRipaCreatDttm,ripaCreatDttm.length);
   	
   }
   
     /**
	 * 	Update RipaCreatDttm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRipaCreatDttm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRipaCreatDttm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RipaCreatDttm with another Field
	 *	@param value
	 */
   public void setRipaCreatDttm(Field source) {
       replace(source,0,source.length(),beginRipaCreatDttm,RIPA_CREAT_DTTM_LEN);
   	
   }  
   
     /**
	 * 	Update RipaCreatDttm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRipaCreatDttm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRipaCreatDttm,RIPA_CREAT_DTTM_LEN);
   	
   }
   
     /**
	 * 	Update RipaCreatDttm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRipaCreatDttm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRipaCreatDttm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ripaClmIpa1Cd
	 *	@return ripaClmIpa1Cd
	 */
   public char[] getRipaClmIpa1Cd() throws CFException{
     if (isRipaClmIpa1CdModified()) { 
        ripaClmIpa1Cd = refreshRipaClmIpa1Cd();
     }
   		return ripaClmIpa1Cd;
   }

  
	/**
	*  set variable ripaClmIpa1Cd
	*  Corresponding COBOL Variable is RIPA-CLM-IPA-1-CD
	*  @param value
	**/
   public void setRipaClmIpa1Cd(char[] value) {
      ripaClmIpa1Cd = checkRipaClmIpa1CdConstraints(value);
      serializeRipaClmIpa1Cd(ripaClmIpa1Cd);
   } 

     /**
	 * 	Update RipaClmIpa1Cd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRipaClmIpa1Cd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRipaClmIpa1Cd,ripaClmIpa1Cd.length);
   	
   }
   
   public void setRipaClmIpa1Cd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRipaClmIpa1Cd,ripaClmIpa1Cd.length);
   	
   }
   
     /**
	 * 	Update RipaClmIpa1Cd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRipaClmIpa1Cd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRipaClmIpa1Cd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RipaClmIpa1Cd with another Field
	 *	@param value
	 */
   public void setRipaClmIpa1Cd(Field source) {
       replace(source,0,source.length(),beginRipaClmIpa1Cd,RIPA_CLM_IPA_1_CD_LEN);
   	
   }  
   
     /**
	 * 	Update RipaClmIpa1Cd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRipaClmIpa1Cd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRipaClmIpa1Cd,RIPA_CLM_IPA_1_CD_LEN);
   	
   }
   
     /**
	 * 	Update RipaClmIpa1Cd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRipaClmIpa1Cd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRipaClmIpa1Cd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ripaClmIpa2Cd
	 *	@return ripaClmIpa2Cd
	 */
   public char[] getRipaClmIpa2Cd() throws CFException{
     if (isRipaClmIpa2CdModified()) { 
        ripaClmIpa2Cd = refreshRipaClmIpa2Cd();
     }
   		return ripaClmIpa2Cd;
   }

  
	/**
	*  set variable ripaClmIpa2Cd
	*  Corresponding COBOL Variable is RIPA-CLM-IPA-2-CD
	*  @param value
	**/
   public void setRipaClmIpa2Cd(char[] value) {
      ripaClmIpa2Cd = checkRipaClmIpa2CdConstraints(value);
      serializeRipaClmIpa2Cd(ripaClmIpa2Cd);
   } 

     /**
	 * 	Update RipaClmIpa2Cd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRipaClmIpa2Cd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRipaClmIpa2Cd,ripaClmIpa2Cd.length);
   	
   }
   
   public void setRipaClmIpa2Cd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRipaClmIpa2Cd,ripaClmIpa2Cd.length);
   	
   }
   
     /**
	 * 	Update RipaClmIpa2Cd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRipaClmIpa2Cd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRipaClmIpa2Cd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RipaClmIpa2Cd with another Field
	 *	@param value
	 */
   public void setRipaClmIpa2Cd(Field source) {
       replace(source,0,source.length(),beginRipaClmIpa2Cd,RIPA_CLM_IPA_2_CD_LEN);
   	
   }  
   
     /**
	 * 	Update RipaClmIpa2Cd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRipaClmIpa2Cd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRipaClmIpa2Cd,RIPA_CLM_IPA_2_CD_LEN);
   	
   }
   
     /**
	 * 	Update RipaClmIpa2Cd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRipaClmIpa2Cd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRipaClmIpa2Cd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ripaClmIpa3Cd
	 *	@return ripaClmIpa3Cd
	 */
   public char[] getRipaClmIpa3Cd() throws CFException{
     if (isRipaClmIpa3CdModified()) { 
        ripaClmIpa3Cd = refreshRipaClmIpa3Cd();
     }
   		return ripaClmIpa3Cd;
   }

  
	/**
	*  set variable ripaClmIpa3Cd
	*  Corresponding COBOL Variable is RIPA-CLM-IPA-3-CD
	*  @param value
	**/
   public void setRipaClmIpa3Cd(char[] value) {
      ripaClmIpa3Cd = checkRipaClmIpa3CdConstraints(value);
      serializeRipaClmIpa3Cd(ripaClmIpa3Cd);
   } 

     /**
	 * 	Update RipaClmIpa3Cd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRipaClmIpa3Cd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRipaClmIpa3Cd,ripaClmIpa3Cd.length);
   	
   }
   
   public void setRipaClmIpa3Cd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRipaClmIpa3Cd,ripaClmIpa3Cd.length);
   	
   }
   
     /**
	 * 	Update RipaClmIpa3Cd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRipaClmIpa3Cd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRipaClmIpa3Cd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RipaClmIpa3Cd with another Field
	 *	@param value
	 */
   public void setRipaClmIpa3Cd(Field source) {
       replace(source,0,source.length(),beginRipaClmIpa3Cd,RIPA_CLM_IPA_3_CD_LEN);
   	
   }  
   
     /**
	 * 	Update RipaClmIpa3Cd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRipaClmIpa3Cd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRipaClmIpa3Cd,RIPA_CLM_IPA_3_CD_LEN);
   	
   }
   
     /**
	 * 	Update RipaClmIpa3Cd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRipaClmIpa3Cd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRipaClmIpa3Cd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ripaPgmId
	 *	@return ripaPgmId
	 */
   public char[] getRipaPgmId() throws CFException{
     if (isRipaPgmIdModified()) { 
        ripaPgmId = refreshRipaPgmId();
     }
   		return ripaPgmId;
   }

  
	/**
	*  set variable ripaPgmId
	*  Corresponding COBOL Variable is RIPA-PGM-ID
	*  @param value
	**/
   public void setRipaPgmId(char[] value) {
      ripaPgmId = checkRipaPgmIdConstraints(value);
      serializeRipaPgmId(ripaPgmId);
   } 

     /**
	 * 	Update RipaPgmId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRipaPgmId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRipaPgmId,ripaPgmId.length);
   	
   }
   
   public void setRipaPgmId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRipaPgmId,ripaPgmId.length);
   	
   }
   
     /**
	 * 	Update RipaPgmId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRipaPgmId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRipaPgmId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RipaPgmId with another Field
	 *	@param value
	 */
   public void setRipaPgmId(Field source) {
       replace(source,0,source.length(),beginRipaPgmId,RIPA_PGM_ID_LEN);
   	
   }  
   
     /**
	 * 	Update RipaPgmId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRipaPgmId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRipaPgmId,RIPA_PGM_ID_LEN);
   	
   }
   
     /**
	 * 	Update RipaPgmId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRipaPgmId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRipaPgmId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ripaLstUpdtDttm
	 *	@return ripaLstUpdtDttm
	 */
   public char[] getRipaLstUpdtDttm() throws CFException{
     if (isRipaLstUpdtDttmModified()) { 
        ripaLstUpdtDttm = refreshRipaLstUpdtDttm();
     }
   		return ripaLstUpdtDttm;
   }

  
	/**
	*  set variable ripaLstUpdtDttm
	*  Corresponding COBOL Variable is RIPA-LST-UPDT-DTTM
	*  @param value
	**/
   public void setRipaLstUpdtDttm(char[] value) {
      ripaLstUpdtDttm = checkRipaLstUpdtDttmConstraints(value);
      serializeRipaLstUpdtDttm(ripaLstUpdtDttm);
   } 

     /**
	 * 	Update RipaLstUpdtDttm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRipaLstUpdtDttm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRipaLstUpdtDttm,ripaLstUpdtDttm.length);
   	
   }
   
   public void setRipaLstUpdtDttm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRipaLstUpdtDttm,ripaLstUpdtDttm.length);
   	
   }
   
     /**
	 * 	Update RipaLstUpdtDttm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRipaLstUpdtDttm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRipaLstUpdtDttm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RipaLstUpdtDttm with another Field
	 *	@param value
	 */
   public void setRipaLstUpdtDttm(Field source) {
       replace(source,0,source.length(),beginRipaLstUpdtDttm,RIPA_LST_UPDT_DTTM_LEN);
   	
   }  
   
     /**
	 * 	Update RipaLstUpdtDttm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRipaLstUpdtDttm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRipaLstUpdtDttm,RIPA_LST_UPDT_DTTM_LEN);
   	
   }
   
     /**
	 * 	Update RipaLstUpdtDttm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRipaLstUpdtDttm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRipaLstUpdtDttm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ripaLstUpdtUserId
	 *	@return ripaLstUpdtUserId
	 */
   public char[] getRipaLstUpdtUserId() throws CFException{
     if (isRipaLstUpdtUserIdModified()) { 
        ripaLstUpdtUserId = refreshRipaLstUpdtUserId();
     }
   		return ripaLstUpdtUserId;
   }

  
	/**
	*  set variable ripaLstUpdtUserId
	*  Corresponding COBOL Variable is RIPA-LST-UPDT-USER-ID
	*  @param value
	**/
   public void setRipaLstUpdtUserId(char[] value) {
      ripaLstUpdtUserId = checkRipaLstUpdtUserIdConstraints(value);
      serializeRipaLstUpdtUserId(ripaLstUpdtUserId);
   } 

     /**
	 * 	Update RipaLstUpdtUserId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRipaLstUpdtUserId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRipaLstUpdtUserId,ripaLstUpdtUserId.length);
   	
   }
   
   public void setRipaLstUpdtUserId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRipaLstUpdtUserId,ripaLstUpdtUserId.length);
   	
   }
   
     /**
	 * 	Update RipaLstUpdtUserId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRipaLstUpdtUserId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRipaLstUpdtUserId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RipaLstUpdtUserId with another Field
	 *	@param value
	 */
   public void setRipaLstUpdtUserId(Field source) {
       replace(source,0,source.length(),beginRipaLstUpdtUserId,RIPA_LST_UPDT_USER_ID_LEN);
   	
   }  
   
     /**
	 * 	Update RipaLstUpdtUserId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRipaLstUpdtUserId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRipaLstUpdtUserId,RIPA_LST_UPDT_USER_ID_LEN);
   	
   }
   
     /**
	 * 	Update RipaLstUpdtUserId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRipaLstUpdtUserId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRipaLstUpdtUserId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ripaGrpTbl1Nbr
	 *	@return ripaGrpTbl1Nbr
	 */
   public char[] getRipaGrpTbl1Nbr() throws CFException{
     if (isRipaGrpTbl1NbrModified()) { 
        ripaGrpTbl1Nbr = refreshRipaGrpTbl1Nbr();
     }
   		return ripaGrpTbl1Nbr;
   }

  
	/**
	*  set variable ripaGrpTbl1Nbr
	*  Corresponding COBOL Variable is RIPA-GRP-TBL-1-NBR
	*  @param value
	**/
   public void setRipaGrpTbl1Nbr(char[] value) {
      ripaGrpTbl1Nbr = checkRipaGrpTbl1NbrConstraints(value);
      serializeRipaGrpTbl1Nbr(ripaGrpTbl1Nbr);
   } 

     /**
	 * 	Update RipaGrpTbl1Nbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRipaGrpTbl1Nbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRipaGrpTbl1Nbr,ripaGrpTbl1Nbr.length);
   	
   }
   
   public void setRipaGrpTbl1Nbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRipaGrpTbl1Nbr,ripaGrpTbl1Nbr.length);
   	
   }
   
     /**
	 * 	Update RipaGrpTbl1Nbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRipaGrpTbl1Nbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRipaGrpTbl1Nbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RipaGrpTbl1Nbr with another Field
	 *	@param value
	 */
   public void setRipaGrpTbl1Nbr(Field source) {
       replace(source,0,source.length(),beginRipaGrpTbl1Nbr,RIPA_GRP_TBL_1_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update RipaGrpTbl1Nbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRipaGrpTbl1Nbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRipaGrpTbl1Nbr,RIPA_GRP_TBL_1_NBR_LEN);
   	
   }
   
     /**
	 * 	Update RipaGrpTbl1Nbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRipaGrpTbl1Nbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRipaGrpTbl1Nbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ripaGrpTbl2Nbr
	 *	@return ripaGrpTbl2Nbr
	 */
   public char[] getRipaGrpTbl2Nbr() throws CFException{
     if (isRipaGrpTbl2NbrModified()) { 
        ripaGrpTbl2Nbr = refreshRipaGrpTbl2Nbr();
     }
   		return ripaGrpTbl2Nbr;
   }

  
	/**
	*  set variable ripaGrpTbl2Nbr
	*  Corresponding COBOL Variable is RIPA-GRP-TBL-2-NBR
	*  @param value
	**/
   public void setRipaGrpTbl2Nbr(char[] value) {
      ripaGrpTbl2Nbr = checkRipaGrpTbl2NbrConstraints(value);
      serializeRipaGrpTbl2Nbr(ripaGrpTbl2Nbr);
   } 

     /**
	 * 	Update RipaGrpTbl2Nbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRipaGrpTbl2Nbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRipaGrpTbl2Nbr,ripaGrpTbl2Nbr.length);
   	
   }
   
   public void setRipaGrpTbl2Nbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRipaGrpTbl2Nbr,ripaGrpTbl2Nbr.length);
   	
   }
   
     /**
	 * 	Update RipaGrpTbl2Nbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRipaGrpTbl2Nbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRipaGrpTbl2Nbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RipaGrpTbl2Nbr with another Field
	 *	@param value
	 */
   public void setRipaGrpTbl2Nbr(Field source) {
       replace(source,0,source.length(),beginRipaGrpTbl2Nbr,RIPA_GRP_TBL_2_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update RipaGrpTbl2Nbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRipaGrpTbl2Nbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRipaGrpTbl2Nbr,RIPA_GRP_TBL_2_NBR_LEN);
   	
   }
   
     /**
	 * 	Update RipaGrpTbl2Nbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRipaGrpTbl2Nbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRipaGrpTbl2Nbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ripaGrpTbl3Nbr
	 *	@return ripaGrpTbl3Nbr
	 */
   public char[] getRipaGrpTbl3Nbr() throws CFException{
     if (isRipaGrpTbl3NbrModified()) { 
        ripaGrpTbl3Nbr = refreshRipaGrpTbl3Nbr();
     }
   		return ripaGrpTbl3Nbr;
   }

  
	/**
	*  set variable ripaGrpTbl3Nbr
	*  Corresponding COBOL Variable is RIPA-GRP-TBL-3-NBR
	*  @param value
	**/
   public void setRipaGrpTbl3Nbr(char[] value) {
      ripaGrpTbl3Nbr = checkRipaGrpTbl3NbrConstraints(value);
      serializeRipaGrpTbl3Nbr(ripaGrpTbl3Nbr);
   } 

     /**
	 * 	Update RipaGrpTbl3Nbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRipaGrpTbl3Nbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRipaGrpTbl3Nbr,ripaGrpTbl3Nbr.length);
   	
   }
   
   public void setRipaGrpTbl3Nbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRipaGrpTbl3Nbr,ripaGrpTbl3Nbr.length);
   	
   }
   
     /**
	 * 	Update RipaGrpTbl3Nbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRipaGrpTbl3Nbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRipaGrpTbl3Nbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RipaGrpTbl3Nbr with another Field
	 *	@param value
	 */
   public void setRipaGrpTbl3Nbr(Field source) {
       replace(source,0,source.length(),beginRipaGrpTbl3Nbr,RIPA_GRP_TBL_3_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update RipaGrpTbl3Nbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRipaGrpTbl3Nbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRipaGrpTbl3Nbr,RIPA_GRP_TBL_3_NBR_LEN);
   	
   }
   
     /**
	 * 	Update RipaGrpTbl3Nbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRipaGrpTbl3Nbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRipaGrpTbl3Nbr+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes DclfeSpiRuleIpa
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setRipaSpiTblId(CONSTANTS.SPACE_7);
         setRipaStsCd(CONSTANTS.SPACE);
         setRipaDerivPlOfSvcCd(CONSTANTS.SPACE_2);
         setRipaDerivSvcCd(CONSTANTS.SPACE_6);
         setRipaDerivCausCd(CONSTANTS.SPACE);
         setRipaCreatDttm(CONSTANTS.SPACE_26);
         setRipaClmIpa1Cd(CONSTANTS.SPACE_3);
         setRipaClmIpa2Cd(CONSTANTS.SPACE_3);
         setRipaClmIpa3Cd(CONSTANTS.SPACE_3);
         setRipaPgmId(CONSTANTS.SPACE_8);
         setRipaLstUpdtDttm(CONSTANTS.SPACE_26);
         setRipaLstUpdtUserId(CONSTANTS.SPACE_9);
         setRipaGrpTbl1Nbr(CONSTANTS.SPACE_4);
         setRipaGrpTbl2Nbr(CONSTANTS.SPACE_4);
         setRipaGrpTbl3Nbr(CONSTANTS.SPACE_4);
   }

		public static int getDclfeSpiRuleIpaFieldLength() {
			return DCLFE_SPI_RULE_IPA_LENGTH;
		}

}
  
