package com.cloudframe.app.dto.d529351u;

/**
*  The class DclfeSpiRuleCpeFlg is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:50. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class DclfeSpiRuleCpeFlg extends DclfeSpiRuleCpeFlgSerialized { 
   

						private char[] cpeflSpiTblId = Field.fillLowValue(7);

						private char[] cpeflStsCd = Field.fillLowValue(1);

						private char[] cpeflDerivPlOfSvcCd = Field.fillLowValue(2);

						private char[] cpeflDerivSvcCd = Field.fillLowValue(6);

						private char[] cpeflDerivCausCd = Field.fillLowValue(1);

						private char[] cpeflCreatDttm = Field.fillLowValue(26);

						private char[] cpeflCpeDescCd = Field.fillLowValue(4);

						private char[] cpeflPgmId = Field.fillLowValue(8);

						private char[] cpeflLstUpdtDttm = Field.fillLowValue(26);

						private char[] cpeflLstUpdtUserId = Field.fillLowValue(9);
	
	/**
	* Constructor for DclfeSpiRuleCpeFlg
	**/
    public DclfeSpiRuleCpeFlg() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of cpeflSpiTblId
	 *	@return cpeflSpiTblId
	 */
   public char[] getCpeflSpiTblId() throws CFException{
     if (isCpeflSpiTblIdModified()) { 
        cpeflSpiTblId = refreshCpeflSpiTblId();
     }
   		return cpeflSpiTblId;
   }

  
	/**
	*  set variable cpeflSpiTblId
	*  Corresponding COBOL Variable is CPEFL-SPI-TBL-ID
	*  @param value
	**/
   public void setCpeflSpiTblId(char[] value) {
      cpeflSpiTblId = checkCpeflSpiTblIdConstraints(value);
      serializeCpeflSpiTblId(cpeflSpiTblId);
   } 

     /**
	 * 	Update CpeflSpiTblId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCpeflSpiTblId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCpeflSpiTblId,cpeflSpiTblId.length);
   	
   }
   
   public void setCpeflSpiTblId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCpeflSpiTblId,cpeflSpiTblId.length);
   	
   }
   
     /**
	 * 	Update CpeflSpiTblId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCpeflSpiTblId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpeflSpiTblId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CpeflSpiTblId with another Field
	 *	@param value
	 */
   public void setCpeflSpiTblId(Field source) {
       replace(source,0,source.length(),beginCpeflSpiTblId,CPEFL_SPI_TBL_ID_LEN);
   	
   }  
   
     /**
	 * 	Update CpeflSpiTblId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCpeflSpiTblId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCpeflSpiTblId,CPEFL_SPI_TBL_ID_LEN);
   	
   }
   
     /**
	 * 	Update CpeflSpiTblId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCpeflSpiTblId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpeflSpiTblId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cpeflStsCd
	 *	@return cpeflStsCd
	 */
   public char[] getCpeflStsCd() throws CFException{
     if (isCpeflStsCdModified()) { 
        cpeflStsCd = refreshCpeflStsCd();
     }
   		return cpeflStsCd;
   }

  
	/**
	*  set variable cpeflStsCd
	*  Corresponding COBOL Variable is CPEFL-STS-CD
	*  @param value
	**/
   public void setCpeflStsCd(char[] value) {
      cpeflStsCd = checkCpeflStsCdConstraints(value);
      serializeCpeflStsCd(cpeflStsCd);
   } 

     /**
	 * 	Update CpeflStsCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCpeflStsCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCpeflStsCd,cpeflStsCd.length);
   	
   }
   
   public void setCpeflStsCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCpeflStsCd,cpeflStsCd.length);
   	
   }
   
     /**
	 * 	Update CpeflStsCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCpeflStsCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpeflStsCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CpeflStsCd with another Field
	 *	@param value
	 */
   public void setCpeflStsCd(Field source) {
       replace(source,0,source.length(),beginCpeflStsCd,CPEFL_STS_CD_LEN);
   	
   }  
   
     /**
	 * 	Update CpeflStsCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCpeflStsCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCpeflStsCd,CPEFL_STS_CD_LEN);
   	
   }
   
     /**
	 * 	Update CpeflStsCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCpeflStsCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpeflStsCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cpeflDerivPlOfSvcCd
	 *	@return cpeflDerivPlOfSvcCd
	 */
   public char[] getCpeflDerivPlOfSvcCd() throws CFException{
     if (isCpeflDerivPlOfSvcCdModified()) { 
        cpeflDerivPlOfSvcCd = refreshCpeflDerivPlOfSvcCd();
     }
   		return cpeflDerivPlOfSvcCd;
   }

  
	/**
	*  set variable cpeflDerivPlOfSvcCd
	*  Corresponding COBOL Variable is CPEFL-DERIV-PL-OF-SVC-CD
	*  @param value
	**/
   public void setCpeflDerivPlOfSvcCd(char[] value) {
      cpeflDerivPlOfSvcCd = checkCpeflDerivPlOfSvcCdConstraints(value);
      serializeCpeflDerivPlOfSvcCd(cpeflDerivPlOfSvcCd);
   } 

     /**
	 * 	Update CpeflDerivPlOfSvcCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCpeflDerivPlOfSvcCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCpeflDerivPlOfSvcCd,cpeflDerivPlOfSvcCd.length);
   	
   }
   
   public void setCpeflDerivPlOfSvcCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCpeflDerivPlOfSvcCd,cpeflDerivPlOfSvcCd.length);
   	
   }
   
     /**
	 * 	Update CpeflDerivPlOfSvcCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCpeflDerivPlOfSvcCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpeflDerivPlOfSvcCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CpeflDerivPlOfSvcCd with another Field
	 *	@param value
	 */
   public void setCpeflDerivPlOfSvcCd(Field source) {
       replace(source,0,source.length(),beginCpeflDerivPlOfSvcCd,CPEFL_DERIV_PL_OF_SVC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update CpeflDerivPlOfSvcCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCpeflDerivPlOfSvcCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCpeflDerivPlOfSvcCd,CPEFL_DERIV_PL_OF_SVC_CD_LEN);
   	
   }
   
     /**
	 * 	Update CpeflDerivPlOfSvcCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCpeflDerivPlOfSvcCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpeflDerivPlOfSvcCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cpeflDerivSvcCd
	 *	@return cpeflDerivSvcCd
	 */
   public char[] getCpeflDerivSvcCd() throws CFException{
     if (isCpeflDerivSvcCdModified()) { 
        cpeflDerivSvcCd = refreshCpeflDerivSvcCd();
     }
   		return cpeflDerivSvcCd;
   }

  
	/**
	*  set variable cpeflDerivSvcCd
	*  Corresponding COBOL Variable is CPEFL-DERIV-SVC-CD
	*  @param value
	**/
   public void setCpeflDerivSvcCd(char[] value) {
      cpeflDerivSvcCd = checkCpeflDerivSvcCdConstraints(value);
      serializeCpeflDerivSvcCd(cpeflDerivSvcCd);
   } 

     /**
	 * 	Update CpeflDerivSvcCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCpeflDerivSvcCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCpeflDerivSvcCd,cpeflDerivSvcCd.length);
   	
   }
   
   public void setCpeflDerivSvcCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCpeflDerivSvcCd,cpeflDerivSvcCd.length);
   	
   }
   
     /**
	 * 	Update CpeflDerivSvcCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCpeflDerivSvcCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpeflDerivSvcCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CpeflDerivSvcCd with another Field
	 *	@param value
	 */
   public void setCpeflDerivSvcCd(Field source) {
       replace(source,0,source.length(),beginCpeflDerivSvcCd,CPEFL_DERIV_SVC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update CpeflDerivSvcCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCpeflDerivSvcCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCpeflDerivSvcCd,CPEFL_DERIV_SVC_CD_LEN);
   	
   }
   
     /**
	 * 	Update CpeflDerivSvcCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCpeflDerivSvcCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpeflDerivSvcCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cpeflDerivCausCd
	 *	@return cpeflDerivCausCd
	 */
   public char[] getCpeflDerivCausCd() throws CFException{
     if (isCpeflDerivCausCdModified()) { 
        cpeflDerivCausCd = refreshCpeflDerivCausCd();
     }
   		return cpeflDerivCausCd;
   }

  
	/**
	*  set variable cpeflDerivCausCd
	*  Corresponding COBOL Variable is CPEFL-DERIV-CAUS-CD
	*  @param value
	**/
   public void setCpeflDerivCausCd(char[] value) {
      cpeflDerivCausCd = checkCpeflDerivCausCdConstraints(value);
      serializeCpeflDerivCausCd(cpeflDerivCausCd);
   } 

     /**
	 * 	Update CpeflDerivCausCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCpeflDerivCausCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCpeflDerivCausCd,cpeflDerivCausCd.length);
   	
   }
   
   public void setCpeflDerivCausCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCpeflDerivCausCd,cpeflDerivCausCd.length);
   	
   }
   
     /**
	 * 	Update CpeflDerivCausCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCpeflDerivCausCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpeflDerivCausCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CpeflDerivCausCd with another Field
	 *	@param value
	 */
   public void setCpeflDerivCausCd(Field source) {
       replace(source,0,source.length(),beginCpeflDerivCausCd,CPEFL_DERIV_CAUS_CD_LEN);
   	
   }  
   
     /**
	 * 	Update CpeflDerivCausCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCpeflDerivCausCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCpeflDerivCausCd,CPEFL_DERIV_CAUS_CD_LEN);
   	
   }
   
     /**
	 * 	Update CpeflDerivCausCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCpeflDerivCausCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpeflDerivCausCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cpeflCreatDttm
	 *	@return cpeflCreatDttm
	 */
   public char[] getCpeflCreatDttm() throws CFException{
     if (isCpeflCreatDttmModified()) { 
        cpeflCreatDttm = refreshCpeflCreatDttm();
     }
   		return cpeflCreatDttm;
   }

  
	/**
	*  set variable cpeflCreatDttm
	*  Corresponding COBOL Variable is CPEFL-CREAT-DTTM
	*  @param value
	**/
   public void setCpeflCreatDttm(char[] value) {
      cpeflCreatDttm = checkCpeflCreatDttmConstraints(value);
      serializeCpeflCreatDttm(cpeflCreatDttm);
   } 

     /**
	 * 	Update CpeflCreatDttm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCpeflCreatDttm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCpeflCreatDttm,cpeflCreatDttm.length);
   	
   }
   
   public void setCpeflCreatDttm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCpeflCreatDttm,cpeflCreatDttm.length);
   	
   }
   
     /**
	 * 	Update CpeflCreatDttm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCpeflCreatDttm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpeflCreatDttm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CpeflCreatDttm with another Field
	 *	@param value
	 */
   public void setCpeflCreatDttm(Field source) {
       replace(source,0,source.length(),beginCpeflCreatDttm,CPEFL_CREAT_DTTM_LEN);
   	
   }  
   
     /**
	 * 	Update CpeflCreatDttm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCpeflCreatDttm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCpeflCreatDttm,CPEFL_CREAT_DTTM_LEN);
   	
   }
   
     /**
	 * 	Update CpeflCreatDttm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCpeflCreatDttm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpeflCreatDttm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cpeflCpeDescCd
	 *	@return cpeflCpeDescCd
	 */
   public char[] getCpeflCpeDescCd() throws CFException{
     if (isCpeflCpeDescCdModified()) { 
        cpeflCpeDescCd = refreshCpeflCpeDescCd();
     }
   		return cpeflCpeDescCd;
   }

  
	/**
	*  set variable cpeflCpeDescCd
	*  Corresponding COBOL Variable is CPEFL-CPE-DESC-CD
	*  @param value
	**/
   public void setCpeflCpeDescCd(char[] value) {
      cpeflCpeDescCd = checkCpeflCpeDescCdConstraints(value);
      serializeCpeflCpeDescCd(cpeflCpeDescCd);
   } 

     /**
	 * 	Update CpeflCpeDescCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCpeflCpeDescCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCpeflCpeDescCd,cpeflCpeDescCd.length);
   	
   }
   
   public void setCpeflCpeDescCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCpeflCpeDescCd,cpeflCpeDescCd.length);
   	
   }
   
     /**
	 * 	Update CpeflCpeDescCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCpeflCpeDescCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpeflCpeDescCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CpeflCpeDescCd with another Field
	 *	@param value
	 */
   public void setCpeflCpeDescCd(Field source) {
       replace(source,0,source.length(),beginCpeflCpeDescCd,CPEFL_CPE_DESC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update CpeflCpeDescCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCpeflCpeDescCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCpeflCpeDescCd,CPEFL_CPE_DESC_CD_LEN);
   	
   }
   
     /**
	 * 	Update CpeflCpeDescCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCpeflCpeDescCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpeflCpeDescCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cpeflPgmId
	 *	@return cpeflPgmId
	 */
   public char[] getCpeflPgmId() throws CFException{
     if (isCpeflPgmIdModified()) { 
        cpeflPgmId = refreshCpeflPgmId();
     }
   		return cpeflPgmId;
   }

  
	/**
	*  set variable cpeflPgmId
	*  Corresponding COBOL Variable is CPEFL-PGM-ID
	*  @param value
	**/
   public void setCpeflPgmId(char[] value) {
      cpeflPgmId = checkCpeflPgmIdConstraints(value);
      serializeCpeflPgmId(cpeflPgmId);
   } 

     /**
	 * 	Update CpeflPgmId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCpeflPgmId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCpeflPgmId,cpeflPgmId.length);
   	
   }
   
   public void setCpeflPgmId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCpeflPgmId,cpeflPgmId.length);
   	
   }
   
     /**
	 * 	Update CpeflPgmId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCpeflPgmId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpeflPgmId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CpeflPgmId with another Field
	 *	@param value
	 */
   public void setCpeflPgmId(Field source) {
       replace(source,0,source.length(),beginCpeflPgmId,CPEFL_PGM_ID_LEN);
   	
   }  
   
     /**
	 * 	Update CpeflPgmId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCpeflPgmId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCpeflPgmId,CPEFL_PGM_ID_LEN);
   	
   }
   
     /**
	 * 	Update CpeflPgmId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCpeflPgmId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpeflPgmId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cpeflLstUpdtDttm
	 *	@return cpeflLstUpdtDttm
	 */
   public char[] getCpeflLstUpdtDttm() throws CFException{
     if (isCpeflLstUpdtDttmModified()) { 
        cpeflLstUpdtDttm = refreshCpeflLstUpdtDttm();
     }
   		return cpeflLstUpdtDttm;
   }

  
	/**
	*  set variable cpeflLstUpdtDttm
	*  Corresponding COBOL Variable is CPEFL-LST-UPDT-DTTM
	*  @param value
	**/
   public void setCpeflLstUpdtDttm(char[] value) {
      cpeflLstUpdtDttm = checkCpeflLstUpdtDttmConstraints(value);
      serializeCpeflLstUpdtDttm(cpeflLstUpdtDttm);
   } 

     /**
	 * 	Update CpeflLstUpdtDttm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCpeflLstUpdtDttm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCpeflLstUpdtDttm,cpeflLstUpdtDttm.length);
   	
   }
   
   public void setCpeflLstUpdtDttm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCpeflLstUpdtDttm,cpeflLstUpdtDttm.length);
   	
   }
   
     /**
	 * 	Update CpeflLstUpdtDttm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCpeflLstUpdtDttm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpeflLstUpdtDttm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CpeflLstUpdtDttm with another Field
	 *	@param value
	 */
   public void setCpeflLstUpdtDttm(Field source) {
       replace(source,0,source.length(),beginCpeflLstUpdtDttm,CPEFL_LST_UPDT_DTTM_LEN);
   	
   }  
   
     /**
	 * 	Update CpeflLstUpdtDttm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCpeflLstUpdtDttm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCpeflLstUpdtDttm,CPEFL_LST_UPDT_DTTM_LEN);
   	
   }
   
     /**
	 * 	Update CpeflLstUpdtDttm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCpeflLstUpdtDttm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpeflLstUpdtDttm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cpeflLstUpdtUserId
	 *	@return cpeflLstUpdtUserId
	 */
   public char[] getCpeflLstUpdtUserId() throws CFException{
     if (isCpeflLstUpdtUserIdModified()) { 
        cpeflLstUpdtUserId = refreshCpeflLstUpdtUserId();
     }
   		return cpeflLstUpdtUserId;
   }

  
	/**
	*  set variable cpeflLstUpdtUserId
	*  Corresponding COBOL Variable is CPEFL-LST-UPDT-USER-ID
	*  @param value
	**/
   public void setCpeflLstUpdtUserId(char[] value) {
      cpeflLstUpdtUserId = checkCpeflLstUpdtUserIdConstraints(value);
      serializeCpeflLstUpdtUserId(cpeflLstUpdtUserId);
   } 

     /**
	 * 	Update CpeflLstUpdtUserId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCpeflLstUpdtUserId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCpeflLstUpdtUserId,cpeflLstUpdtUserId.length);
   	
   }
   
   public void setCpeflLstUpdtUserId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCpeflLstUpdtUserId,cpeflLstUpdtUserId.length);
   	
   }
   
     /**
	 * 	Update CpeflLstUpdtUserId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCpeflLstUpdtUserId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpeflLstUpdtUserId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CpeflLstUpdtUserId with another Field
	 *	@param value
	 */
   public void setCpeflLstUpdtUserId(Field source) {
       replace(source,0,source.length(),beginCpeflLstUpdtUserId,CPEFL_LST_UPDT_USER_ID_LEN);
   	
   }  
   
     /**
	 * 	Update CpeflLstUpdtUserId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCpeflLstUpdtUserId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCpeflLstUpdtUserId,CPEFL_LST_UPDT_USER_ID_LEN);
   	
   }
   
     /**
	 * 	Update CpeflLstUpdtUserId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCpeflLstUpdtUserId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpeflLstUpdtUserId+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes DclfeSpiRuleCpeFlg
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setCpeflSpiTblId(CONSTANTS.SPACE_7);
         setCpeflStsCd(CONSTANTS.SPACE);
         setCpeflDerivPlOfSvcCd(CONSTANTS.SPACE_2);
         setCpeflDerivSvcCd(CONSTANTS.SPACE_6);
         setCpeflDerivCausCd(CONSTANTS.SPACE);
         setCpeflCreatDttm(CONSTANTS.SPACE_26);
         setCpeflCpeDescCd(CONSTANTS.SPACE_4);
         setCpeflPgmId(CONSTANTS.SPACE_8);
         setCpeflLstUpdtDttm(CONSTANTS.SPACE_26);
         setCpeflLstUpdtUserId(CONSTANTS.SPACE_9);
   }

		public static int getDclfeSpiRuleCpeFlgFieldLength() {
			return DCLFE_SPI_RULE_CPE_FLG_LENGTH;
		}

}
  
