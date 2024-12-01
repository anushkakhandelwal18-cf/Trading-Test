package com.cloudframe.app.dto.d529351u;

/**
*  The class DclfeSpiPlnVar is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:50. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class DclfeSpiPlnVar extends DclfeSpiPlnVarSerialized { 
   

						private char[] plnvSpiTblId = Field.fillLowValue(7);

						private char[] plnvStsCd = Field.fillLowValue(1);

						private char[] plnvPolNbr = Field.fillLowValue(6);

						private char[] plnvPlnNbr = Field.fillLowValue(4);

						private char[] plnvEffDt = Field.fillLowValue(10);

						private char[] plnvCreatDttm = Field.fillLowValue(26);

						private char[] plnvCancDt = Field.fillLowValue(10);

						private char[] plnvPgmId = Field.fillLowValue(8);

						private char[] plnvLstUpdtDttm = Field.fillLowValue(26);

						private char[] plnvLstUpdtUserId = Field.fillLowValue(9);
	
	/**
	* Constructor for DclfeSpiPlnVar
	**/
    public DclfeSpiPlnVar() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of plnvSpiTblId
	 *	@return plnvSpiTblId
	 */
   public char[] getPlnvSpiTblId() throws CFException{
     if (isPlnvSpiTblIdModified()) { 
        plnvSpiTblId = refreshPlnvSpiTblId();
     }
   		return plnvSpiTblId;
   }

  
	/**
	*  set variable plnvSpiTblId
	*  Corresponding COBOL Variable is PLNV-SPI-TBL-ID
	*  @param value
	**/
   public void setPlnvSpiTblId(char[] value) {
      plnvSpiTblId = checkPlnvSpiTblIdConstraints(value);
      serializePlnvSpiTblId(plnvSpiTblId);
   } 

     /**
	 * 	Update PlnvSpiTblId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPlnvSpiTblId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPlnvSpiTblId,plnvSpiTblId.length);
   	
   }
   
   public void setPlnvSpiTblId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPlnvSpiTblId,plnvSpiTblId.length);
   	
   }
   
     /**
	 * 	Update PlnvSpiTblId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPlnvSpiTblId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPlnvSpiTblId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PlnvSpiTblId with another Field
	 *	@param value
	 */
   public void setPlnvSpiTblId(Field source) {
       replace(source,0,source.length(),beginPlnvSpiTblId,PLNV_SPI_TBL_ID_LEN);
   	
   }  
   
     /**
	 * 	Update PlnvSpiTblId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPlnvSpiTblId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPlnvSpiTblId,PLNV_SPI_TBL_ID_LEN);
   	
   }
   
     /**
	 * 	Update PlnvSpiTblId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPlnvSpiTblId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPlnvSpiTblId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of plnvStsCd
	 *	@return plnvStsCd
	 */
   public char[] getPlnvStsCd() throws CFException{
     if (isPlnvStsCdModified()) { 
        plnvStsCd = refreshPlnvStsCd();
     }
   		return plnvStsCd;
   }

  
	/**
	*  set variable plnvStsCd
	*  Corresponding COBOL Variable is PLNV-STS-CD
	*  @param value
	**/
   public void setPlnvStsCd(char[] value) {
      plnvStsCd = checkPlnvStsCdConstraints(value);
      serializePlnvStsCd(plnvStsCd);
   } 

     /**
	 * 	Update PlnvStsCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPlnvStsCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPlnvStsCd,plnvStsCd.length);
   	
   }
   
   public void setPlnvStsCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPlnvStsCd,plnvStsCd.length);
   	
   }
   
     /**
	 * 	Update PlnvStsCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPlnvStsCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPlnvStsCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PlnvStsCd with another Field
	 *	@param value
	 */
   public void setPlnvStsCd(Field source) {
       replace(source,0,source.length(),beginPlnvStsCd,PLNV_STS_CD_LEN);
   	
   }  
   
     /**
	 * 	Update PlnvStsCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPlnvStsCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPlnvStsCd,PLNV_STS_CD_LEN);
   	
   }
   
     /**
	 * 	Update PlnvStsCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPlnvStsCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPlnvStsCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of plnvPolNbr
	 *	@return plnvPolNbr
	 */
   public char[] getPlnvPolNbr() throws CFException{
     if (isPlnvPolNbrModified()) { 
        plnvPolNbr = refreshPlnvPolNbr();
     }
   		return plnvPolNbr;
   }

  
	/**
	*  set variable plnvPolNbr
	*  Corresponding COBOL Variable is PLNV-POL-NBR
	*  @param value
	**/
   public void setPlnvPolNbr(char[] value) {
      plnvPolNbr = checkPlnvPolNbrConstraints(value);
      serializePlnvPolNbr(plnvPolNbr);
   } 

     /**
	 * 	Update PlnvPolNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPlnvPolNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPlnvPolNbr,plnvPolNbr.length);
   	
   }
   
   public void setPlnvPolNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPlnvPolNbr,plnvPolNbr.length);
   	
   }
   
     /**
	 * 	Update PlnvPolNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPlnvPolNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPlnvPolNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PlnvPolNbr with another Field
	 *	@param value
	 */
   public void setPlnvPolNbr(Field source) {
       replace(source,0,source.length(),beginPlnvPolNbr,PLNV_POL_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update PlnvPolNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPlnvPolNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPlnvPolNbr,PLNV_POL_NBR_LEN);
   	
   }
   
     /**
	 * 	Update PlnvPolNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPlnvPolNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPlnvPolNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of plnvPlnNbr
	 *	@return plnvPlnNbr
	 */
   public char[] getPlnvPlnNbr() throws CFException{
     if (isPlnvPlnNbrModified()) { 
        plnvPlnNbr = refreshPlnvPlnNbr();
     }
   		return plnvPlnNbr;
   }

  
	/**
	*  set variable plnvPlnNbr
	*  Corresponding COBOL Variable is PLNV-PLN-NBR
	*  @param value
	**/
   public void setPlnvPlnNbr(char[] value) {
      plnvPlnNbr = checkPlnvPlnNbrConstraints(value);
      serializePlnvPlnNbr(plnvPlnNbr);
   } 

     /**
	 * 	Update PlnvPlnNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPlnvPlnNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPlnvPlnNbr,plnvPlnNbr.length);
   	
   }
   
   public void setPlnvPlnNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPlnvPlnNbr,plnvPlnNbr.length);
   	
   }
   
     /**
	 * 	Update PlnvPlnNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPlnvPlnNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPlnvPlnNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PlnvPlnNbr with another Field
	 *	@param value
	 */
   public void setPlnvPlnNbr(Field source) {
       replace(source,0,source.length(),beginPlnvPlnNbr,PLNV_PLN_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update PlnvPlnNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPlnvPlnNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPlnvPlnNbr,PLNV_PLN_NBR_LEN);
   	
   }
   
     /**
	 * 	Update PlnvPlnNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPlnvPlnNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPlnvPlnNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of plnvEffDt
	 *	@return plnvEffDt
	 */
   public char[] getPlnvEffDt() throws CFException{
     if (isPlnvEffDtModified()) { 
        plnvEffDt = refreshPlnvEffDt();
     }
   		return plnvEffDt;
   }

  
	/**
	*  set variable plnvEffDt
	*  Corresponding COBOL Variable is PLNV-EFF-DT
	*  @param value
	**/
   public void setPlnvEffDt(char[] value) {
      plnvEffDt = checkPlnvEffDtConstraints(value);
      serializePlnvEffDt(plnvEffDt);
   } 

     /**
	 * 	Update PlnvEffDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPlnvEffDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPlnvEffDt,plnvEffDt.length);
   	
   }
   
   public void setPlnvEffDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPlnvEffDt,plnvEffDt.length);
   	
   }
   
     /**
	 * 	Update PlnvEffDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPlnvEffDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPlnvEffDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PlnvEffDt with another Field
	 *	@param value
	 */
   public void setPlnvEffDt(Field source) {
       replace(source,0,source.length(),beginPlnvEffDt,PLNV_EFF_DT_LEN);
   	
   }  
   
     /**
	 * 	Update PlnvEffDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPlnvEffDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPlnvEffDt,PLNV_EFF_DT_LEN);
   	
   }
   
     /**
	 * 	Update PlnvEffDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPlnvEffDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPlnvEffDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of plnvCreatDttm
	 *	@return plnvCreatDttm
	 */
   public char[] getPlnvCreatDttm() throws CFException{
     if (isPlnvCreatDttmModified()) { 
        plnvCreatDttm = refreshPlnvCreatDttm();
     }
   		return plnvCreatDttm;
   }

  
	/**
	*  set variable plnvCreatDttm
	*  Corresponding COBOL Variable is PLNV-CREAT-DTTM
	*  @param value
	**/
   public void setPlnvCreatDttm(char[] value) {
      plnvCreatDttm = checkPlnvCreatDttmConstraints(value);
      serializePlnvCreatDttm(plnvCreatDttm);
   } 

     /**
	 * 	Update PlnvCreatDttm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPlnvCreatDttm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPlnvCreatDttm,plnvCreatDttm.length);
   	
   }
   
   public void setPlnvCreatDttm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPlnvCreatDttm,plnvCreatDttm.length);
   	
   }
   
     /**
	 * 	Update PlnvCreatDttm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPlnvCreatDttm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPlnvCreatDttm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PlnvCreatDttm with another Field
	 *	@param value
	 */
   public void setPlnvCreatDttm(Field source) {
       replace(source,0,source.length(),beginPlnvCreatDttm,PLNV_CREAT_DTTM_LEN);
   	
   }  
   
     /**
	 * 	Update PlnvCreatDttm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPlnvCreatDttm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPlnvCreatDttm,PLNV_CREAT_DTTM_LEN);
   	
   }
   
     /**
	 * 	Update PlnvCreatDttm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPlnvCreatDttm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPlnvCreatDttm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of plnvCancDt
	 *	@return plnvCancDt
	 */
   public char[] getPlnvCancDt() throws CFException{
     if (isPlnvCancDtModified()) { 
        plnvCancDt = refreshPlnvCancDt();
     }
   		return plnvCancDt;
   }

  
	/**
	*  set variable plnvCancDt
	*  Corresponding COBOL Variable is PLNV-CANC-DT
	*  @param value
	**/
   public void setPlnvCancDt(char[] value) {
      plnvCancDt = checkPlnvCancDtConstraints(value);
      serializePlnvCancDt(plnvCancDt);
   } 

     /**
	 * 	Update PlnvCancDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPlnvCancDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPlnvCancDt,plnvCancDt.length);
   	
   }
   
   public void setPlnvCancDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPlnvCancDt,plnvCancDt.length);
   	
   }
   
     /**
	 * 	Update PlnvCancDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPlnvCancDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPlnvCancDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PlnvCancDt with another Field
	 *	@param value
	 */
   public void setPlnvCancDt(Field source) {
       replace(source,0,source.length(),beginPlnvCancDt,PLNV_CANC_DT_LEN);
   	
   }  
   
     /**
	 * 	Update PlnvCancDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPlnvCancDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPlnvCancDt,PLNV_CANC_DT_LEN);
   	
   }
   
     /**
	 * 	Update PlnvCancDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPlnvCancDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPlnvCancDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of plnvPgmId
	 *	@return plnvPgmId
	 */
   public char[] getPlnvPgmId() throws CFException{
     if (isPlnvPgmIdModified()) { 
        plnvPgmId = refreshPlnvPgmId();
     }
   		return plnvPgmId;
   }

  
	/**
	*  set variable plnvPgmId
	*  Corresponding COBOL Variable is PLNV-PGM-ID
	*  @param value
	**/
   public void setPlnvPgmId(char[] value) {
      plnvPgmId = checkPlnvPgmIdConstraints(value);
      serializePlnvPgmId(plnvPgmId);
   } 

     /**
	 * 	Update PlnvPgmId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPlnvPgmId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPlnvPgmId,plnvPgmId.length);
   	
   }
   
   public void setPlnvPgmId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPlnvPgmId,plnvPgmId.length);
   	
   }
   
     /**
	 * 	Update PlnvPgmId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPlnvPgmId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPlnvPgmId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PlnvPgmId with another Field
	 *	@param value
	 */
   public void setPlnvPgmId(Field source) {
       replace(source,0,source.length(),beginPlnvPgmId,PLNV_PGM_ID_LEN);
   	
   }  
   
     /**
	 * 	Update PlnvPgmId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPlnvPgmId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPlnvPgmId,PLNV_PGM_ID_LEN);
   	
   }
   
     /**
	 * 	Update PlnvPgmId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPlnvPgmId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPlnvPgmId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of plnvLstUpdtDttm
	 *	@return plnvLstUpdtDttm
	 */
   public char[] getPlnvLstUpdtDttm() throws CFException{
     if (isPlnvLstUpdtDttmModified()) { 
        plnvLstUpdtDttm = refreshPlnvLstUpdtDttm();
     }
   		return plnvLstUpdtDttm;
   }

  
	/**
	*  set variable plnvLstUpdtDttm
	*  Corresponding COBOL Variable is PLNV-LST-UPDT-DTTM
	*  @param value
	**/
   public void setPlnvLstUpdtDttm(char[] value) {
      plnvLstUpdtDttm = checkPlnvLstUpdtDttmConstraints(value);
      serializePlnvLstUpdtDttm(plnvLstUpdtDttm);
   } 

     /**
	 * 	Update PlnvLstUpdtDttm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPlnvLstUpdtDttm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPlnvLstUpdtDttm,plnvLstUpdtDttm.length);
   	
   }
   
   public void setPlnvLstUpdtDttm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPlnvLstUpdtDttm,plnvLstUpdtDttm.length);
   	
   }
   
     /**
	 * 	Update PlnvLstUpdtDttm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPlnvLstUpdtDttm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPlnvLstUpdtDttm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PlnvLstUpdtDttm with another Field
	 *	@param value
	 */
   public void setPlnvLstUpdtDttm(Field source) {
       replace(source,0,source.length(),beginPlnvLstUpdtDttm,PLNV_LST_UPDT_DTTM_LEN);
   	
   }  
   
     /**
	 * 	Update PlnvLstUpdtDttm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPlnvLstUpdtDttm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPlnvLstUpdtDttm,PLNV_LST_UPDT_DTTM_LEN);
   	
   }
   
     /**
	 * 	Update PlnvLstUpdtDttm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPlnvLstUpdtDttm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPlnvLstUpdtDttm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of plnvLstUpdtUserId
	 *	@return plnvLstUpdtUserId
	 */
   public char[] getPlnvLstUpdtUserId() throws CFException{
     if (isPlnvLstUpdtUserIdModified()) { 
        plnvLstUpdtUserId = refreshPlnvLstUpdtUserId();
     }
   		return plnvLstUpdtUserId;
   }

  
	/**
	*  set variable plnvLstUpdtUserId
	*  Corresponding COBOL Variable is PLNV-LST-UPDT-USER-ID
	*  @param value
	**/
   public void setPlnvLstUpdtUserId(char[] value) {
      plnvLstUpdtUserId = checkPlnvLstUpdtUserIdConstraints(value);
      serializePlnvLstUpdtUserId(plnvLstUpdtUserId);
   } 

     /**
	 * 	Update PlnvLstUpdtUserId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPlnvLstUpdtUserId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPlnvLstUpdtUserId,plnvLstUpdtUserId.length);
   	
   }
   
   public void setPlnvLstUpdtUserId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPlnvLstUpdtUserId,plnvLstUpdtUserId.length);
   	
   }
   
     /**
	 * 	Update PlnvLstUpdtUserId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPlnvLstUpdtUserId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPlnvLstUpdtUserId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PlnvLstUpdtUserId with another Field
	 *	@param value
	 */
   public void setPlnvLstUpdtUserId(Field source) {
       replace(source,0,source.length(),beginPlnvLstUpdtUserId,PLNV_LST_UPDT_USER_ID_LEN);
   	
   }  
   
     /**
	 * 	Update PlnvLstUpdtUserId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPlnvLstUpdtUserId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPlnvLstUpdtUserId,PLNV_LST_UPDT_USER_ID_LEN);
   	
   }
   
     /**
	 * 	Update PlnvLstUpdtUserId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPlnvLstUpdtUserId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPlnvLstUpdtUserId+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes DclfeSpiPlnVar
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setPlnvSpiTblId(CONSTANTS.SPACE_7);
         setPlnvStsCd(CONSTANTS.SPACE);
         setPlnvPolNbr(CONSTANTS.SPACE_6);
         setPlnvPlnNbr(CONSTANTS.SPACE_4);
         setPlnvEffDt(CONSTANTS.SPACE_10);
         setPlnvCreatDttm(CONSTANTS.SPACE_26);
         setPlnvCancDt(CONSTANTS.SPACE_10);
         setPlnvPgmId(CONSTANTS.SPACE_8);
         setPlnvLstUpdtDttm(CONSTANTS.SPACE_26);
         setPlnvLstUpdtUserId(CONSTANTS.SPACE_9);
   }

		public static int getDclfeSpiPlnVarFieldLength() {
			return DCLFE_SPI_PLN_VAR_LENGTH;
		}

}
  
