package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class HvaClmHistArraySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class HvaClmHistArraySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HvaClmHistArraySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HVA_CLM_HIST_ARRAY_LENGTH = 39706;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHvaSub;
            protected  int beginHvaSub2;
           protected int beginHvaPartnId;
           protected static final int HVA_PARTN_ID_SIZE = 100;
           protected int beginHvaPartnVal;
           protected static final int HVA_PARTN_VAL_SIZE = 100;
           protected int beginHvaProcDt;
           protected static final int HVA_PROC_DT_SIZE = 100;
           protected int beginHvaProcTm;
           protected static final int HVA_PROC_TM_SIZE = 100;
           protected int beginHvaPgmIdLstCharVal;
           protected static final int HVA_PGM_ID_LST_CHAR_VAL_SIZE = 100;
           protected int beginHvaIcnSufxVersNbr;
           protected static final int HVA_ICN_SUFX_VERS_NBR_SIZE = 100;
           protected int beginHvaInvnCtlNbr;
           protected static final int HVA_INVN_CTL_NBR_SIZE = 100;
           protected int beginHvaIcnSufxCd;
           protected static final int HVA_ICN_SUFX_CD_SIZE = 100;
           protected int beginHvaLnId;
           protected static final int HVA_LN_ID_SIZE = 100;
           protected int beginHvaFlnJulianDtNbr;
           protected static final int HVA_FLN_JULIAN_DT_NBR_SIZE = 100;
           protected int beginHvaFlnSrlNbr;
           protected static final int HVA_FLN_SRL_NBR_SIZE = 100;
           protected int beginHvaDftNbr;
           protected static final int HVA_DFT_NBR_SIZE = 100;
           protected int beginHvaFstDt;
           protected static final int HVA_FST_DT_SIZE = 100;
           protected int beginHvaLstSrvcDt;
           protected static final int HVA_LST_SRVC_DT_SIZE = 100;
           protected int beginHvaProvTinsuff;
           protected static final int HVA_PROV_TINSUFF_SIZE = 100;
           protected int beginHvaProvScrnNbr;
           protected static final int HVA_PROV_SCRN_NBR_SIZE = 100;
           protected int beginHvaChrgAmt;
           protected static final int HVA_CHRG_AMT_SIZE = 100;
           protected int beginHvaRmrkCd;
           protected static final int HVA_RMRK_CD_SIZE = 100;
           protected int beginHvaNcAmt;
           protected static final int HVA_NC_AMT_SIZE = 100;
           protected int beginHvaPmtSvcCd;
           protected static final int HVA_PMT_SVC_CD_SIZE = 100;
           protected int beginHvaOvrCd;
           protected static final int HVA_OVR_CD_SIZE = 100;
           protected int beginHvaCopayAmt;
           protected static final int HVA_COPAY_AMT_SIZE = 100;
           protected int beginHvaSrvcCd;
           protected static final int HVA_SRVC_CD_SIZE = 100;
           protected int beginHvaPayCd;
           protected static final int HVA_PAY_CD_SIZE = 100;
           protected int beginHvaTransCd;
           protected static final int HVA_TRANS_CD_SIZE = 100;
           protected int beginHvaFilmOfcNbr;
           protected static final int HVA_FILM_OFC_NBR_SIZE = 100;
           protected int beginHvaClmLvlRsnCd;
           protected static final int HVA_CLM_LVL_RSN_CD_SIZE = 100;
           protected int beginHvaAdjtrId;
           protected static final int HVA_ADJTR_ID_SIZE = 100;
           protected int beginHvaMbrPrvInd;
           protected static final int HVA_MBR_PRV_IND_SIZE = 100;
           protected int beginHvaNtfyWaivCd;
           protected static final int HVA_NTFY_WAIV_CD_SIZE = 100;
           protected int beginHvaBankCd;
           protected static final int HVA_BANK_CD_SIZE = 100;
           protected int beginHvaDivNbr;
           protected static final int HVA_DIV_NBR_SIZE = 100;
           protected int beginHvaClsNbr;
           protected static final int HVA_CLS_NBR_SIZE = 100;
           protected int beginHvaDrgNbr;
           protected static final int HVA_DRG_NBR_SIZE = 100;
           protected int beginHvaFaclOrProfCd;
           protected static final int HVA_FACL_OR_PROF_CD_SIZE = 100;
           protected int beginHvaDlgteInd;
           protected static final int HVA_DLGTE_IND_SIZE = 100;
           protected int beginHvaNdbContrId;
           protected static final int HVA_NDB_CONTR_ID_SIZE = 100;
           protected int beginHvaClmSmbTypAppCd;
           protected static final int HVA_CLM_SMB_TYP_APP_CD_SIZE = 100;
           protected int beginHvaSmbStCd;
           protected static final int HVA_SMB_ST_CD_SIZE = 100;
           protected int beginHvaProcT1Ind;
           protected static final int HVA_PROC_T_1_IND_SIZE = 100;
           protected int beginHvaAuthNbr;
           protected static final int HVA_AUTH_NBR_SIZE = 100;
           protected int beginHvaBaseDedDescTxt;
           protected static final int HVA_BASE_DED_DESC_TXT_SIZE = 100;
           protected int beginHvaMmDedDescTxt;
           protected static final int HVA_MM_DED_DESC_TXT_SIZE = 100;
           protected int beginHvaPrsCreatSrcCd;
           protected static final int HVA_PRS_CREAT_SRC_CD_SIZE = 100;
           protected int beginHvaBaseDedAmt;
           protected static final int HVA_BASE_DED_AMT_SIZE = 100;
           protected int beginHvaBaseAmt;
           protected static final int HVA_BASE_AMT_SIZE = 100;
           protected int beginHvaMmDedAmt;
           protected static final int HVA_MM_DED_AMT_SIZE = 100;
           protected int beginHvaMmAmt;
           protected static final int HVA_MM_AMT_SIZE = 100;
           protected int beginHvaMcCrResAmt;
           protected static final int HVA_MC_CR_RES_AMT_SIZE = 100;
           protected int beginHvaCobCrResAmt;
           protected static final int HVA_COB_CR_RES_AMT_SIZE = 100;
           protected int beginHvaParInd;
           protected static final int HVA_PAR_IND_SIZE = 100;
           protected int beginHvaSupAmt;
           protected static final int HVA_SUP_AMT_SIZE = 100;
           protected int beginHvaProvMktNbr;
           protected static final int HVA_PROV_MKT_NBR_SIZE = 100;
           protected int beginHvaPpoCd;
           protected static final int HVA_PPO_CD_SIZE = 100;
           protected int beginHvaPtntRespAmt;
           protected static final int HVA_PTNT_RESP_AMT_SIZE = 100;
           protected int beginHvaAuthSrcId;
           protected static final int HVA_AUTH_SRC_ID_SIZE = 100;
           protected int beginHvaAuthProcCd;
           protected static final int HVA_AUTH_PROC_CD_SIZE = 100;
           protected int beginHvaProvNm;
           protected static final int HVA_PROV_NM_SIZE = 100;
           protected int beginHvaProvEobNm;
           protected static final int HVA_PROV_EOB_NM_SIZE = 100;
           protected int beginHvaProvPrdctCd;
           protected static final int HVA_PROV_PRDCT_CD_SIZE = 100;
           protected int beginHvaProvMktTypCd;
           protected static final int HVA_PROV_MKT_TYP_CD_SIZE = 100;
           protected int beginHvaProvIpaId;
           protected static final int HVA_PROV_IPA_ID_SIZE = 100;
           protected int beginHvaTpsmCd;
           protected static final int HVA_TPSM_CD_SIZE = 100;
           protected int beginHvaProvSpclCd;
           protected static final int HVA_PROV_SPCL_CD_SIZE = 100;
           protected int beginHvaProvMedcdReclmInd;
           protected static final int HVA_PROV_MEDCD_RECLM_IND_SIZE = 100;
           protected int beginHvaRelSrvcClmLvlInd;
           protected static final int HVA_REL_SRVC_CLM_LVL_IND_SIZE = 100;
           protected int beginHvaDiagCd;
           protected static final int HVA_DIAG_CD_SIZE = 100;
           protected int beginHvaAuthUniqCnt;
           protected static final int HVA_AUTH_UNIQ_CNT_SIZE = 100;
           protected int beginHvaPhysMedcnMskCnt;
           protected static final int HVA_PHYS_MEDCN_MSK_CNT_SIZE = 100;
           protected int beginHvaMskNullInd;
           protected static final int HVA_MSK_NULL_IND_SIZE = 100;
	
	/**
	* Constructor for HvaClmHistArraySerialized
	**/
    public HvaClmHistArraySerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in HvaClmHistArraySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HVA_CLM_HIST_ARRAY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHvaSub = getStartOffset() + 0;	// set offset for serialization
  
             beginHvaSub2 = getStartOffset() + 2;	// set offset for serialization
  
	        beginHvaPartnId = getStartOffset() + 6; // set offset for serialization
  
	        beginHvaPartnVal = getStartOffset() + 206; // set offset for serialization
  
	        beginHvaProcDt = getStartOffset() + 1206; // set offset for serialization
  
	        beginHvaProcTm = getStartOffset() + 2206; // set offset for serialization
  
	        beginHvaPgmIdLstCharVal = getStartOffset() + 3006; // set offset for serialization
  
	        beginHvaIcnSufxVersNbr = getStartOffset() + 3106; // set offset for serialization
  
	        beginHvaInvnCtlNbr = getStartOffset() + 3306; // set offset for serialization
  
	        beginHvaIcnSufxCd = getStartOffset() + 4306; // set offset for serialization
  
	        beginHvaLnId = getStartOffset() + 4506; // set offset for serialization
  
	        beginHvaFlnJulianDtNbr = getStartOffset() + 4706; // set offset for serialization
  
	        beginHvaFlnSrlNbr = getStartOffset() + 5206; // set offset for serialization
  
	        beginHvaDftNbr = getStartOffset() + 5706; // set offset for serialization
  
	        beginHvaFstDt = getStartOffset() + 7606; // set offset for serialization
  
	        beginHvaLstSrvcDt = getStartOffset() + 8606; // set offset for serialization
  
	        beginHvaProvTinsuff = getStartOffset() + 9606; // set offset for serialization
  
	        beginHvaProvScrnNbr = getStartOffset() + 11106; // set offset for serialization
  
	        beginHvaChrgAmt = getStartOffset() + 11206; // set offset for serialization
  
	        beginHvaRmrkCd = getStartOffset() + 12106; // set offset for serialization
  
	        beginHvaNcAmt = getStartOffset() + 12406; // set offset for serialization
  
	        beginHvaPmtSvcCd = getStartOffset() + 13306; // set offset for serialization
  
	        beginHvaOvrCd = getStartOffset() + 13906; // set offset for serialization
  
	        beginHvaCopayAmt = getStartOffset() + 14106; // set offset for serialization
  
	        beginHvaSrvcCd = getStartOffset() + 15006; // set offset for serialization
  
	        beginHvaPayCd = getStartOffset() + 15206; // set offset for serialization
  
	        beginHvaTransCd = getStartOffset() + 15306; // set offset for serialization
  
	        beginHvaFilmOfcNbr = getStartOffset() + 15506; // set offset for serialization
  
	        beginHvaClmLvlRsnCd = getStartOffset() + 15906; // set offset for serialization
  
	        beginHvaAdjtrId = getStartOffset() + 16206; // set offset for serialization
  
	        beginHvaMbrPrvInd = getStartOffset() + 17106; // set offset for serialization
  
	        beginHvaNtfyWaivCd = getStartOffset() + 17206; // set offset for serialization
  
	        beginHvaBankCd = getStartOffset() + 17506; // set offset for serialization
  
	        beginHvaDivNbr = getStartOffset() + 17806; // set offset for serialization
  
	        beginHvaClsNbr = getStartOffset() + 18206; // set offset for serialization
  
	        beginHvaDrgNbr = getStartOffset() + 18606; // set offset for serialization
  
	        beginHvaFaclOrProfCd = getStartOffset() + 19106; // set offset for serialization
  
	        beginHvaDlgteInd = getStartOffset() + 19206; // set offset for serialization
  
	        beginHvaNdbContrId = getStartOffset() + 19406; // set offset for serialization
  
	        beginHvaClmSmbTypAppCd = getStartOffset() + 20306; // set offset for serialization
  
	        beginHvaSmbStCd = getStartOffset() + 20406; // set offset for serialization
  
	        beginHvaProcT1Ind = getStartOffset() + 20606; // set offset for serialization
  
	        beginHvaAuthNbr = getStartOffset() + 20706; // set offset for serialization
  
	        beginHvaBaseDedDescTxt = getStartOffset() + 21706; // set offset for serialization
  
	        beginHvaMmDedDescTxt = getStartOffset() + 21906; // set offset for serialization
  
	        beginHvaPrsCreatSrcCd = getStartOffset() + 22106; // set offset for serialization
  
	        beginHvaBaseDedAmt = getStartOffset() + 22306; // set offset for serialization
  
	        beginHvaBaseAmt = getStartOffset() + 23206; // set offset for serialization
  
	        beginHvaMmDedAmt = getStartOffset() + 24106; // set offset for serialization
  
	        beginHvaMmAmt = getStartOffset() + 25006; // set offset for serialization
  
	        beginHvaMcCrResAmt = getStartOffset() + 25906; // set offset for serialization
  
	        beginHvaCobCrResAmt = getStartOffset() + 26806; // set offset for serialization
  
	        beginHvaParInd = getStartOffset() + 27706; // set offset for serialization
  
	        beginHvaSupAmt = getStartOffset() + 27806; // set offset for serialization
  
	        beginHvaProvMktNbr = getStartOffset() + 28706; // set offset for serialization
  
	        beginHvaPpoCd = getStartOffset() + 29406; // set offset for serialization
  
	        beginHvaPtntRespAmt = getStartOffset() + 29506; // set offset for serialization
  
	        beginHvaAuthSrcId = getStartOffset() + 30406; // set offset for serialization
  
	        beginHvaAuthProcCd = getStartOffset() + 30706; // set offset for serialization
  
	        beginHvaProvNm = getStartOffset() + 31206; // set offset for serialization
  
	        beginHvaProvEobNm = getStartOffset() + 34206; // set offset for serialization
  
	        beginHvaProvPrdctCd = getStartOffset() + 36206; // set offset for serialization
  
	        beginHvaProvMktTypCd = getStartOffset() + 36506; // set offset for serialization
  
	        beginHvaProvIpaId = getStartOffset() + 36706; // set offset for serialization
  
	        beginHvaTpsmCd = getStartOffset() + 37206; // set offset for serialization
  
	        beginHvaProvSpclCd = getStartOffset() + 37506; // set offset for serialization
  
	        beginHvaProvMedcdReclmInd = getStartOffset() + 37806; // set offset for serialization
  
	        beginHvaRelSrvcClmLvlInd = getStartOffset() + 37906; // set offset for serialization
  
	        beginHvaDiagCd = getStartOffset() + 38006; // set offset for serialization
  
	        beginHvaAuthUniqCnt = getStartOffset() + 38706; // set offset for serialization
  
	        beginHvaPhysMedcnMskCnt = getStartOffset() + 39106; // set offset for serialization
  
	        beginHvaMskNullInd = getStartOffset() + 39506; // set offset for serialization
  
	   /*  end of offset */
	}
         int localHvaSubCounter = -1;
         public boolean isHvaSubModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localHvaSubCounter != sharedCounter;
            localHvaSubCounter = sharedCounter; return hasModified; 
         }
   protected static final int HVA_SUB_LEN = 2;
  	/**
	 * serializeHvaSub
	 */
	protected void serializeHvaSub(short hvaSub) {
           replaceValue( //  save the value as string
                   getBinaryString( hvaSub,HVA_SUB_LEN)
                  ,beginHvaSub
                  ,HVA_SUB_LEN
                 );
            localHvaSubCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkHvaSubMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshHvaSub is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshHvaSub() {	 
			return (getShort(beginHvaSub));
   	}
         int localHvaSub2Counter = -1;
         public boolean isHvaSub2Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localHvaSub2Counter != sharedCounter;
            localHvaSub2Counter = sharedCounter; return hasModified; 
         }
   protected static final int HVA_SUB_2_LEN = 2;
  	/**
	 * serializeHvaSub2
	 */
	protected void serializeHvaSub2(short hvaSub2) {
           replaceValue( //  save the value as string
                   getBinaryString( hvaSub2,HVA_SUB_2_LEN)
                  ,beginHvaSub2
                  ,HVA_SUB_2_LEN
                 );
            localHvaSub2Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkHvaSub2MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshHvaSub2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshHvaSub2() {	 
			return (getShort(beginHvaSub2));
   	}

	protected static final int HVA_PARTN_ID_LEN = 2;
    /**
	 * 	serialize this HvaPartnId as String
	 *  @param index
	 *	@param value
	 */
	protected void serializeHvaPartnId(int index, short value) {
           short number = (short) value;
           replaceValue( getBinaryString(number) , (beginHvaPartnId + index*HVA_PARTN_ID_LEN), HVA_PARTN_ID_LEN);
   }
 
   
  protected  static final int HVA_PARTN_VAL_LEN = 10;
   /**
	 *	serializeHvaPartnVal as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaPartnVal(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaPartnVal + index*HVA_PARTN_VAL_LEN)
   	          , HVA_PARTN_VAL_LEN 
   	          );
   }
 
   
  protected  static final int HVA_PROC_DT_LEN = 10;
   /**
	 *	serializeHvaProcDt as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaProcDt(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaProcDt + index*HVA_PROC_DT_LEN)
   	          , HVA_PROC_DT_LEN 
   	          );
   }
 
   
  protected  static final int HVA_PROC_TM_LEN = 8;
   /**
	 *	serializeHvaProcTm as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaProcTm(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaProcTm + index*HVA_PROC_TM_LEN)
   	          , HVA_PROC_TM_LEN 
   	          );
   }
 
   
  protected  static final int HVA_PGM_ID_LST_CHAR_VAL_LEN = 1;
   /**
	 *	serializeHvaPgmIdLstCharVal as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaPgmIdLstCharVal(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaPgmIdLstCharVal + index*HVA_PGM_ID_LST_CHAR_VAL_LEN)
   	          , HVA_PGM_ID_LST_CHAR_VAL_LEN 
   	          );
   }

	protected static final int HVA_ICN_SUFX_VERS_NBR_LEN = 2;
    /**
	 * 	serialize this HvaIcnSufxVersNbr as String
	 *  @param index
	 *	@param value
	 */
	protected void serializeHvaIcnSufxVersNbr(int index, short value) {
           short number = (short) value;
           replaceValue( getBinaryString(number) , (beginHvaIcnSufxVersNbr + index*HVA_ICN_SUFX_VERS_NBR_LEN), HVA_ICN_SUFX_VERS_NBR_LEN);
   }
 
   
  protected  static final int HVA_INVN_CTL_NBR_LEN = 10;
   /**
	 *	serializeHvaInvnCtlNbr as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaInvnCtlNbr(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaInvnCtlNbr + index*HVA_INVN_CTL_NBR_LEN)
   	          , HVA_INVN_CTL_NBR_LEN 
   	          );
   }
 
   
  protected  static final int HVA_ICN_SUFX_CD_LEN = 2;
   /**
	 *	serializeHvaIcnSufxCd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaIcnSufxCd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaIcnSufxCd + index*HVA_ICN_SUFX_CD_LEN)
   	          , HVA_ICN_SUFX_CD_LEN 
   	          );
   }

	protected static final int HVA_LN_ID_LEN = 2;
    /**
	 * 	serialize this HvaLnId as String
	 *  @param index
	 *	@param value
	 */
	protected void serializeHvaLnId(int index, short value) {
           short number = (short) value;
           replaceValue( getBinaryString(number) , (beginHvaLnId + index*HVA_LN_ID_LEN), HVA_LN_ID_LEN);
   }
 
   
  protected  static final int HVA_FLN_JULIAN_DT_NBR_LEN = 5;
   /**
	 *	serializeHvaFlnJulianDtNbr as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaFlnJulianDtNbr(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaFlnJulianDtNbr + index*HVA_FLN_JULIAN_DT_NBR_LEN)
   	          , HVA_FLN_JULIAN_DT_NBR_LEN 
   	          );
   }
 
   
  protected  static final int HVA_FLN_SRL_NBR_LEN = 5;
   /**
	 *	serializeHvaFlnSrlNbr as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaFlnSrlNbr(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaFlnSrlNbr + index*HVA_FLN_SRL_NBR_LEN)
   	          , HVA_FLN_SRL_NBR_LEN 
   	          );
   }
 
   
  protected  static final int HVA_DFT_NBR_LEN = 19;
   /**
	 *	serializeHvaDftNbr as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaDftNbr(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaDftNbr + index*HVA_DFT_NBR_LEN)
   	          , HVA_DFT_NBR_LEN 
   	          );
   }
 
   
  protected  static final int HVA_FST_DT_LEN = 10;
   /**
	 *	serializeHvaFstDt as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaFstDt(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaFstDt + index*HVA_FST_DT_LEN)
   	          , HVA_FST_DT_LEN 
   	          );
   }
 
   
  protected  static final int HVA_LST_SRVC_DT_LEN = 10;
   /**
	 *	serializeHvaLstSrvcDt as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaLstSrvcDt(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaLstSrvcDt + index*HVA_LST_SRVC_DT_LEN)
   	          , HVA_LST_SRVC_DT_LEN 
   	          );
   }
 
   
  protected  static final int HVA_PROV_TINSUFF_LEN = 15;
   /**
	 *	serializeHvaProvTinsuff as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaProvTinsuff(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaProvTinsuff + index*HVA_PROV_TINSUFF_LEN)
   	          , HVA_PROV_TINSUFF_LEN 
   	          );
   }
 
   
  protected  static final int HVA_PROV_SCRN_NBR_LEN = 1;
   /**
	 *	serializeHvaProvScrnNbr as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaProvScrnNbr(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaProvScrnNbr + index*HVA_PROV_SCRN_NBR_LEN)
   	          , HVA_PROV_SCRN_NBR_LEN 
   	          );
   }
   protected static final int HVA_CHRG_AMT_LEN = 9;
   protected static final int HVA_CHRG_AMT_SCALE = 2;
     /**
	 * 	serializes this HvaChrgAmt as String
	 *	@param index
	 *	@param value 
	 */
	protected void serializeHvaChrgAmt(int index, BigDecimal value) {
		   replaceValue( 
		        getPackedString(value,HVA_CHRG_AMT_LEN,HVA_CHRG_AMT_SCALE,true)
		        ,(beginHvaChrgAmt + index*HVA_CHRG_AMT_LEN) 
		        ,HVA_CHRG_AMT_LEN
		      );
   }
 
   
  protected  static final int HVA_RMRK_CD_LEN = 3;
   /**
	 *	serializeHvaRmrkCd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaRmrkCd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaRmrkCd + index*HVA_RMRK_CD_LEN)
   	          , HVA_RMRK_CD_LEN 
   	          );
   }
   protected static final int HVA_NC_AMT_LEN = 9;
   protected static final int HVA_NC_AMT_SCALE = 2;
     /**
	 * 	serializes this HvaNcAmt as String
	 *	@param index
	 *	@param value 
	 */
	protected void serializeHvaNcAmt(int index, BigDecimal value) {
		   replaceValue( 
		        getPackedString(value,HVA_NC_AMT_LEN,HVA_NC_AMT_SCALE,true)
		        ,(beginHvaNcAmt + index*HVA_NC_AMT_LEN) 
		        ,HVA_NC_AMT_LEN
		      );
   }
 
   
  protected  static final int HVA_PMT_SVC_CD_LEN = 6;
   /**
	 *	serializeHvaPmtSvcCd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaPmtSvcCd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaPmtSvcCd + index*HVA_PMT_SVC_CD_LEN)
   	          , HVA_PMT_SVC_CD_LEN 
   	          );
   }
 
   
  protected  static final int HVA_OVR_CD_LEN = 2;
   /**
	 *	serializeHvaOvrCd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaOvrCd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaOvrCd + index*HVA_OVR_CD_LEN)
   	          , HVA_OVR_CD_LEN 
   	          );
   }
   protected static final int HVA_COPAY_AMT_LEN = 9;
   protected static final int HVA_COPAY_AMT_SCALE = 2;
     /**
	 * 	serializes this HvaCopayAmt as String
	 *	@param index
	 *	@param value 
	 */
	protected void serializeHvaCopayAmt(int index, BigDecimal value) {
		   replaceValue( 
		        getPackedString(value,HVA_COPAY_AMT_LEN,HVA_COPAY_AMT_SCALE,true)
		        ,(beginHvaCopayAmt + index*HVA_COPAY_AMT_LEN) 
		        ,HVA_COPAY_AMT_LEN
		      );
   }
 
   
  protected  static final int HVA_SRVC_CD_LEN = 2;
   /**
	 *	serializeHvaSrvcCd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaSrvcCd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaSrvcCd + index*HVA_SRVC_CD_LEN)
   	          , HVA_SRVC_CD_LEN 
   	          );
   }
 
   
  protected  static final int HVA_PAY_CD_LEN = 1;
   /**
	 *	serializeHvaPayCd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaPayCd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaPayCd + index*HVA_PAY_CD_LEN)
   	          , HVA_PAY_CD_LEN 
   	          );
   }
 
   
  protected  static final int HVA_TRANS_CD_LEN = 2;
   /**
	 *	serializeHvaTransCd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaTransCd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaTransCd + index*HVA_TRANS_CD_LEN)
   	          , HVA_TRANS_CD_LEN 
   	          );
   }
 
   
  protected  static final int HVA_FILM_OFC_NBR_LEN = 4;
   /**
	 *	serializeHvaFilmOfcNbr as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaFilmOfcNbr(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaFilmOfcNbr + index*HVA_FILM_OFC_NBR_LEN)
   	          , HVA_FILM_OFC_NBR_LEN 
   	          );
   }
 
   
  protected  static final int HVA_CLM_LVL_RSN_CD_LEN = 3;
   /**
	 *	serializeHvaClmLvlRsnCd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaClmLvlRsnCd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaClmLvlRsnCd + index*HVA_CLM_LVL_RSN_CD_LEN)
   	          , HVA_CLM_LVL_RSN_CD_LEN 
   	          );
   }
 
   
  protected  static final int HVA_ADJTR_ID_LEN = 9;
   /**
	 *	serializeHvaAdjtrId as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaAdjtrId(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaAdjtrId + index*HVA_ADJTR_ID_LEN)
   	          , HVA_ADJTR_ID_LEN 
   	          );
   }
 
   
  protected  static final int HVA_MBR_PRV_IND_LEN = 1;
   /**
	 *	serializeHvaMbrPrvInd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaMbrPrvInd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaMbrPrvInd + index*HVA_MBR_PRV_IND_LEN)
   	          , HVA_MBR_PRV_IND_LEN 
   	          );
   }
 
   
  protected  static final int HVA_NTFY_WAIV_CD_LEN = 3;
   /**
	 *	serializeHvaNtfyWaivCd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaNtfyWaivCd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaNtfyWaivCd + index*HVA_NTFY_WAIV_CD_LEN)
   	          , HVA_NTFY_WAIV_CD_LEN 
   	          );
   }
 
   
  protected  static final int HVA_BANK_CD_LEN = 3;
   /**
	 *	serializeHvaBankCd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaBankCd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaBankCd + index*HVA_BANK_CD_LEN)
   	          , HVA_BANK_CD_LEN 
   	          );
   }
 
   
  protected  static final int HVA_DIV_NBR_LEN = 4;
   /**
	 *	serializeHvaDivNbr as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaDivNbr(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaDivNbr + index*HVA_DIV_NBR_LEN)
   	          , HVA_DIV_NBR_LEN 
   	          );
   }
 
   
  protected  static final int HVA_CLS_NBR_LEN = 4;
   /**
	 *	serializeHvaClsNbr as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaClsNbr(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaClsNbr + index*HVA_CLS_NBR_LEN)
   	          , HVA_CLS_NBR_LEN 
   	          );
   }
 
   
  protected  static final int HVA_DRG_NBR_LEN = 5;
   /**
	 *	serializeHvaDrgNbr as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaDrgNbr(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaDrgNbr + index*HVA_DRG_NBR_LEN)
   	          , HVA_DRG_NBR_LEN 
   	          );
   }
 
   
  protected  static final int HVA_FACL_OR_PROF_CD_LEN = 1;
   /**
	 *	serializeHvaFaclOrProfCd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaFaclOrProfCd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaFaclOrProfCd + index*HVA_FACL_OR_PROF_CD_LEN)
   	          , HVA_FACL_OR_PROF_CD_LEN 
   	          );
   }
 
   
  protected  static final int HVA_DLGTE_IND_LEN = 2;
   /**
	 *	serializeHvaDlgteInd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaDlgteInd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaDlgteInd + index*HVA_DLGTE_IND_LEN)
   	          , HVA_DLGTE_IND_LEN 
   	          );
   }
 
   
  protected  static final int HVA_NDB_CONTR_ID_LEN = 9;
   /**
	 *	serializeHvaNdbContrId as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaNdbContrId(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaNdbContrId + index*HVA_NDB_CONTR_ID_LEN)
   	          , HVA_NDB_CONTR_ID_LEN 
   	          );
   }
 
   
  protected  static final int HVA_CLM_SMB_TYP_APP_CD_LEN = 1;
   /**
	 *	serializeHvaClmSmbTypAppCd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaClmSmbTypAppCd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaClmSmbTypAppCd + index*HVA_CLM_SMB_TYP_APP_CD_LEN)
   	          , HVA_CLM_SMB_TYP_APP_CD_LEN 
   	          );
   }
 
   
  protected  static final int HVA_SMB_ST_CD_LEN = 2;
   /**
	 *	serializeHvaSmbStCd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaSmbStCd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaSmbStCd + index*HVA_SMB_ST_CD_LEN)
   	          , HVA_SMB_ST_CD_LEN 
   	          );
   }
 
   
  protected  static final int HVA_PROC_T_1_IND_LEN = 1;
   /**
	 *	serializeHvaProcT1Ind as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaProcT1Ind(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaProcT1Ind + index*HVA_PROC_T_1_IND_LEN)
   	          , HVA_PROC_T_1_IND_LEN 
   	          );
   }
 
   
  protected  static final int HVA_AUTH_NBR_LEN = 10;
   /**
	 *	serializeHvaAuthNbr as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaAuthNbr(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaAuthNbr + index*HVA_AUTH_NBR_LEN)
   	          , HVA_AUTH_NBR_LEN 
   	          );
   }
 
   
  protected  static final int HVA_BASE_DED_DESC_TXT_LEN = 2;
   /**
	 *	serializeHvaBaseDedDescTxt as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaBaseDedDescTxt(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaBaseDedDescTxt + index*HVA_BASE_DED_DESC_TXT_LEN)
   	          , HVA_BASE_DED_DESC_TXT_LEN 
   	          );
   }
 
   
  protected  static final int HVA_MM_DED_DESC_TXT_LEN = 2;
   /**
	 *	serializeHvaMmDedDescTxt as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaMmDedDescTxt(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaMmDedDescTxt + index*HVA_MM_DED_DESC_TXT_LEN)
   	          , HVA_MM_DED_DESC_TXT_LEN 
   	          );
   }
 
   
  protected  static final int HVA_PRS_CREAT_SRC_CD_LEN = 2;
   /**
	 *	serializeHvaPrsCreatSrcCd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaPrsCreatSrcCd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaPrsCreatSrcCd + index*HVA_PRS_CREAT_SRC_CD_LEN)
   	          , HVA_PRS_CREAT_SRC_CD_LEN 
   	          );
   }
   protected static final int HVA_BASE_DED_AMT_LEN = 9;
   protected static final int HVA_BASE_DED_AMT_SCALE = 2;
     /**
	 * 	serializes this HvaBaseDedAmt as String
	 *	@param index
	 *	@param value 
	 */
	protected void serializeHvaBaseDedAmt(int index, BigDecimal value) {
		   replaceValue( 
		        getPackedString(value,HVA_BASE_DED_AMT_LEN,HVA_BASE_DED_AMT_SCALE,true)
		        ,(beginHvaBaseDedAmt + index*HVA_BASE_DED_AMT_LEN) 
		        ,HVA_BASE_DED_AMT_LEN
		      );
   }
   protected static final int HVA_BASE_AMT_LEN = 9;
   protected static final int HVA_BASE_AMT_SCALE = 2;
     /**
	 * 	serializes this HvaBaseAmt as String
	 *	@param index
	 *	@param value 
	 */
	protected void serializeHvaBaseAmt(int index, BigDecimal value) {
		   replaceValue( 
		        getPackedString(value,HVA_BASE_AMT_LEN,HVA_BASE_AMT_SCALE,true)
		        ,(beginHvaBaseAmt + index*HVA_BASE_AMT_LEN) 
		        ,HVA_BASE_AMT_LEN
		      );
   }
   protected static final int HVA_MM_DED_AMT_LEN = 9;
   protected static final int HVA_MM_DED_AMT_SCALE = 2;
     /**
	 * 	serializes this HvaMmDedAmt as String
	 *	@param index
	 *	@param value 
	 */
	protected void serializeHvaMmDedAmt(int index, BigDecimal value) {
		   replaceValue( 
		        getPackedString(value,HVA_MM_DED_AMT_LEN,HVA_MM_DED_AMT_SCALE,true)
		        ,(beginHvaMmDedAmt + index*HVA_MM_DED_AMT_LEN) 
		        ,HVA_MM_DED_AMT_LEN
		      );
   }
   protected static final int HVA_MM_AMT_LEN = 9;
   protected static final int HVA_MM_AMT_SCALE = 2;
     /**
	 * 	serializes this HvaMmAmt as String
	 *	@param index
	 *	@param value 
	 */
	protected void serializeHvaMmAmt(int index, BigDecimal value) {
		   replaceValue( 
		        getPackedString(value,HVA_MM_AMT_LEN,HVA_MM_AMT_SCALE,true)
		        ,(beginHvaMmAmt + index*HVA_MM_AMT_LEN) 
		        ,HVA_MM_AMT_LEN
		      );
   }
   protected static final int HVA_MC_CR_RES_AMT_LEN = 9;
   protected static final int HVA_MC_CR_RES_AMT_SCALE = 2;
     /**
	 * 	serializes this HvaMcCrResAmt as String
	 *	@param index
	 *	@param value 
	 */
	protected void serializeHvaMcCrResAmt(int index, BigDecimal value) {
		   replaceValue( 
		        getPackedString(value,HVA_MC_CR_RES_AMT_LEN,HVA_MC_CR_RES_AMT_SCALE,true)
		        ,(beginHvaMcCrResAmt + index*HVA_MC_CR_RES_AMT_LEN) 
		        ,HVA_MC_CR_RES_AMT_LEN
		      );
   }
   protected static final int HVA_COB_CR_RES_AMT_LEN = 9;
   protected static final int HVA_COB_CR_RES_AMT_SCALE = 2;
     /**
	 * 	serializes this HvaCobCrResAmt as String
	 *	@param index
	 *	@param value 
	 */
	protected void serializeHvaCobCrResAmt(int index, BigDecimal value) {
		   replaceValue( 
		        getPackedString(value,HVA_COB_CR_RES_AMT_LEN,HVA_COB_CR_RES_AMT_SCALE,true)
		        ,(beginHvaCobCrResAmt + index*HVA_COB_CR_RES_AMT_LEN) 
		        ,HVA_COB_CR_RES_AMT_LEN
		      );
   }
 
   
  protected  static final int HVA_PAR_IND_LEN = 1;
   /**
	 *	serializeHvaParInd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaParInd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaParInd + index*HVA_PAR_IND_LEN)
   	          , HVA_PAR_IND_LEN 
   	          );
   }
   protected static final int HVA_SUP_AMT_LEN = 9;
   protected static final int HVA_SUP_AMT_SCALE = 2;
     /**
	 * 	serializes this HvaSupAmt as String
	 *	@param index
	 *	@param value 
	 */
	protected void serializeHvaSupAmt(int index, BigDecimal value) {
		   replaceValue( 
		        getPackedString(value,HVA_SUP_AMT_LEN,HVA_SUP_AMT_SCALE,true)
		        ,(beginHvaSupAmt + index*HVA_SUP_AMT_LEN) 
		        ,HVA_SUP_AMT_LEN
		      );
   }
 
   
  protected  static final int HVA_PROV_MKT_NBR_LEN = 7;
   /**
	 *	serializeHvaProvMktNbr as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaProvMktNbr(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaProvMktNbr + index*HVA_PROV_MKT_NBR_LEN)
   	          , HVA_PROV_MKT_NBR_LEN 
   	          );
   }
 
   
  protected  static final int HVA_PPO_CD_LEN = 1;
   /**
	 *	serializeHvaPpoCd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaPpoCd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaPpoCd + index*HVA_PPO_CD_LEN)
   	          , HVA_PPO_CD_LEN 
   	          );
   }
   protected static final int HVA_PTNT_RESP_AMT_LEN = 9;
   protected static final int HVA_PTNT_RESP_AMT_SCALE = 2;
     /**
	 * 	serializes this HvaPtntRespAmt as String
	 *	@param index
	 *	@param value 
	 */
	protected void serializeHvaPtntRespAmt(int index, BigDecimal value) {
		   replaceValue( 
		        getPackedString(value,HVA_PTNT_RESP_AMT_LEN,HVA_PTNT_RESP_AMT_SCALE,true)
		        ,(beginHvaPtntRespAmt + index*HVA_PTNT_RESP_AMT_LEN) 
		        ,HVA_PTNT_RESP_AMT_LEN
		      );
   }
 
   
  protected  static final int HVA_AUTH_SRC_ID_LEN = 3;
   /**
	 *	serializeHvaAuthSrcId as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaAuthSrcId(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaAuthSrcId + index*HVA_AUTH_SRC_ID_LEN)
   	          , HVA_AUTH_SRC_ID_LEN 
   	          );
   }
 
   
  protected  static final int HVA_AUTH_PROC_CD_LEN = 5;
   /**
	 *	serializeHvaAuthProcCd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaAuthProcCd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaAuthProcCd + index*HVA_AUTH_PROC_CD_LEN)
   	          , HVA_AUTH_PROC_CD_LEN 
   	          );
   }
 
   
  protected  static final int HVA_PROV_NM_LEN = 30;
   /**
	 *	serializeHvaProvNm as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaProvNm(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaProvNm + index*HVA_PROV_NM_LEN)
   	          , HVA_PROV_NM_LEN 
   	          );
   }
 
   
  protected  static final int HVA_PROV_EOB_NM_LEN = 20;
   /**
	 *	serializeHvaProvEobNm as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaProvEobNm(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaProvEobNm + index*HVA_PROV_EOB_NM_LEN)
   	          , HVA_PROV_EOB_NM_LEN 
   	          );
   }
 
   
  protected  static final int HVA_PROV_PRDCT_CD_LEN = 3;
   /**
	 *	serializeHvaProvPrdctCd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaProvPrdctCd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaProvPrdctCd + index*HVA_PROV_PRDCT_CD_LEN)
   	          , HVA_PROV_PRDCT_CD_LEN 
   	          );
   }
 
   
  protected  static final int HVA_PROV_MKT_TYP_CD_LEN = 2;
   /**
	 *	serializeHvaProvMktTypCd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaProvMktTypCd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaProvMktTypCd + index*HVA_PROV_MKT_TYP_CD_LEN)
   	          , HVA_PROV_MKT_TYP_CD_LEN 
   	          );
   }
 
   
  protected  static final int HVA_PROV_IPA_ID_LEN = 5;
   /**
	 *	serializeHvaProvIpaId as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaProvIpaId(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaProvIpaId + index*HVA_PROV_IPA_ID_LEN)
   	          , HVA_PROV_IPA_ID_LEN 
   	          );
   }
 
   
  protected  static final int HVA_TPSM_CD_LEN = 3;
   /**
	 *	serializeHvaTpsmCd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaTpsmCd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaTpsmCd + index*HVA_TPSM_CD_LEN)
   	          , HVA_TPSM_CD_LEN 
   	          );
   }
 
   
  protected  static final int HVA_PROV_SPCL_CD_LEN = 3;
   /**
	 *	serializeHvaProvSpclCd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaProvSpclCd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaProvSpclCd + index*HVA_PROV_SPCL_CD_LEN)
   	          , HVA_PROV_SPCL_CD_LEN 
   	          );
   }
 
   
  protected  static final int HVA_PROV_MEDCD_RECLM_IND_LEN = 1;
   /**
	 *	serializeHvaProvMedcdReclmInd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaProvMedcdReclmInd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaProvMedcdReclmInd + index*HVA_PROV_MEDCD_RECLM_IND_LEN)
   	          , HVA_PROV_MEDCD_RECLM_IND_LEN 
   	          );
   }
 
   
  protected  static final int HVA_REL_SRVC_CLM_LVL_IND_LEN = 1;
   /**
	 *	serializeHvaRelSrvcClmLvlInd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaRelSrvcClmLvlInd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaRelSrvcClmLvlInd + index*HVA_REL_SRVC_CLM_LVL_IND_LEN)
   	          , HVA_REL_SRVC_CLM_LVL_IND_LEN 
   	          );
   }
 
   
  protected  static final int HVA_DIAG_CD_LEN = 7;
   /**
	 *	serializeHvaDiagCd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHvaDiagCd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHvaDiagCd + index*HVA_DIAG_CD_LEN)
   	          , HVA_DIAG_CD_LEN 
   	          );
   }

	protected static final int HVA_AUTH_UNIQ_CNT_LEN = 4;
    /**
	 * 	serialize this HvaAuthUniqCnt as String
	 *  @param index
	 *	@param value
	 */
	protected void serializeHvaAuthUniqCnt(int index, int value) {
           int number = value;
           replaceValue( getBinaryString(number) , (beginHvaAuthUniqCnt + index*HVA_AUTH_UNIQ_CNT_LEN), HVA_AUTH_UNIQ_CNT_LEN);
   }

	protected static final int HVA_PHYS_MEDCN_MSK_CNT_LEN = 4;
    /**
	 * 	serialize this HvaPhysMedcnMskCnt as String
	 *  @param index
	 *	@param value
	 */
	protected void serializeHvaPhysMedcnMskCnt(int index, int value) {
           int number = value;
           replaceValue( getBinaryString(number) , (beginHvaPhysMedcnMskCnt + index*HVA_PHYS_MEDCN_MSK_CNT_LEN), HVA_PHYS_MEDCN_MSK_CNT_LEN);
   }

	protected static final int HVA_MSK_NULL_IND_LEN = 2;
    /**
	 * 	serialize this HvaMskNullInd as String
	 *  @param index
	 *	@param value
	 */
	protected void serializeHvaMskNullInd(int index, short value) {
           short number = (short) value;
           replaceValue( getBinaryString(number) , (beginHvaMskNullInd + index*HVA_MSK_NULL_IND_LEN), HVA_MSK_NULL_IND_LEN);
   }

		public int hvaPartnIdSize() {
			return HVA_PARTN_ID_SIZE;
		}
		public int hvaPartnValSize() {
			return HVA_PARTN_VAL_SIZE;
		}
		public int hvaProcDtSize() {
			return HVA_PROC_DT_SIZE;
		}
		public int hvaProcTmSize() {
			return HVA_PROC_TM_SIZE;
		}
		public int hvaPgmIdLstCharValSize() {
			return HVA_PGM_ID_LST_CHAR_VAL_SIZE;
		}
		public int hvaIcnSufxVersNbrSize() {
			return HVA_ICN_SUFX_VERS_NBR_SIZE;
		}
		public int hvaInvnCtlNbrSize() {
			return HVA_INVN_CTL_NBR_SIZE;
		}
		public int hvaIcnSufxCdSize() {
			return HVA_ICN_SUFX_CD_SIZE;
		}
		public int hvaLnIdSize() {
			return HVA_LN_ID_SIZE;
		}
		public int hvaFlnJulianDtNbrSize() {
			return HVA_FLN_JULIAN_DT_NBR_SIZE;
		}
		public int hvaFlnSrlNbrSize() {
			return HVA_FLN_SRL_NBR_SIZE;
		}
		public int hvaDftNbrSize() {
			return HVA_DFT_NBR_SIZE;
		}
		public int hvaFstDtSize() {
			return HVA_FST_DT_SIZE;
		}
		public int hvaLstSrvcDtSize() {
			return HVA_LST_SRVC_DT_SIZE;
		}
		public int hvaProvTinsuffSize() {
			return HVA_PROV_TINSUFF_SIZE;
		}
		public int hvaProvScrnNbrSize() {
			return HVA_PROV_SCRN_NBR_SIZE;
		}
		public int hvaChrgAmtSize() {
			return HVA_CHRG_AMT_SIZE;
		}
		public int hvaRmrkCdSize() {
			return HVA_RMRK_CD_SIZE;
		}
		public int hvaNcAmtSize() {
			return HVA_NC_AMT_SIZE;
		}
		public int hvaPmtSvcCdSize() {
			return HVA_PMT_SVC_CD_SIZE;
		}
		public int hvaOvrCdSize() {
			return HVA_OVR_CD_SIZE;
		}
		public int hvaCopayAmtSize() {
			return HVA_COPAY_AMT_SIZE;
		}
		public int hvaSrvcCdSize() {
			return HVA_SRVC_CD_SIZE;
		}
		public int hvaPayCdSize() {
			return HVA_PAY_CD_SIZE;
		}
		public int hvaTransCdSize() {
			return HVA_TRANS_CD_SIZE;
		}
		public int hvaFilmOfcNbrSize() {
			return HVA_FILM_OFC_NBR_SIZE;
		}
		public int hvaClmLvlRsnCdSize() {
			return HVA_CLM_LVL_RSN_CD_SIZE;
		}
		public int hvaAdjtrIdSize() {
			return HVA_ADJTR_ID_SIZE;
		}
		public int hvaMbrPrvIndSize() {
			return HVA_MBR_PRV_IND_SIZE;
		}
		public int hvaNtfyWaivCdSize() {
			return HVA_NTFY_WAIV_CD_SIZE;
		}
		public int hvaBankCdSize() {
			return HVA_BANK_CD_SIZE;
		}
		public int hvaDivNbrSize() {
			return HVA_DIV_NBR_SIZE;
		}
		public int hvaClsNbrSize() {
			return HVA_CLS_NBR_SIZE;
		}
		public int hvaDrgNbrSize() {
			return HVA_DRG_NBR_SIZE;
		}
		public int hvaFaclOrProfCdSize() {
			return HVA_FACL_OR_PROF_CD_SIZE;
		}
		public int hvaDlgteIndSize() {
			return HVA_DLGTE_IND_SIZE;
		}
		public int hvaNdbContrIdSize() {
			return HVA_NDB_CONTR_ID_SIZE;
		}
		public int hvaClmSmbTypAppCdSize() {
			return HVA_CLM_SMB_TYP_APP_CD_SIZE;
		}
		public int hvaSmbStCdSize() {
			return HVA_SMB_ST_CD_SIZE;
		}
		public int hvaProcT1IndSize() {
			return HVA_PROC_T_1_IND_SIZE;
		}
		public int hvaAuthNbrSize() {
			return HVA_AUTH_NBR_SIZE;
		}
		public int hvaBaseDedDescTxtSize() {
			return HVA_BASE_DED_DESC_TXT_SIZE;
		}
		public int hvaMmDedDescTxtSize() {
			return HVA_MM_DED_DESC_TXT_SIZE;
		}
		public int hvaPrsCreatSrcCdSize() {
			return HVA_PRS_CREAT_SRC_CD_SIZE;
		}
		public int hvaBaseDedAmtSize() {
			return HVA_BASE_DED_AMT_SIZE;
		}
		public int hvaBaseAmtSize() {
			return HVA_BASE_AMT_SIZE;
		}
		public int hvaMmDedAmtSize() {
			return HVA_MM_DED_AMT_SIZE;
		}
		public int hvaMmAmtSize() {
			return HVA_MM_AMT_SIZE;
		}
		public int hvaMcCrResAmtSize() {
			return HVA_MC_CR_RES_AMT_SIZE;
		}
		public int hvaCobCrResAmtSize() {
			return HVA_COB_CR_RES_AMT_SIZE;
		}
		public int hvaParIndSize() {
			return HVA_PAR_IND_SIZE;
		}
		public int hvaSupAmtSize() {
			return HVA_SUP_AMT_SIZE;
		}
		public int hvaProvMktNbrSize() {
			return HVA_PROV_MKT_NBR_SIZE;
		}
		public int hvaPpoCdSize() {
			return HVA_PPO_CD_SIZE;
		}
		public int hvaPtntRespAmtSize() {
			return HVA_PTNT_RESP_AMT_SIZE;
		}
		public int hvaAuthSrcIdSize() {
			return HVA_AUTH_SRC_ID_SIZE;
		}
		public int hvaAuthProcCdSize() {
			return HVA_AUTH_PROC_CD_SIZE;
		}
		public int hvaProvNmSize() {
			return HVA_PROV_NM_SIZE;
		}
		public int hvaProvEobNmSize() {
			return HVA_PROV_EOB_NM_SIZE;
		}
		public int hvaProvPrdctCdSize() {
			return HVA_PROV_PRDCT_CD_SIZE;
		}
		public int hvaProvMktTypCdSize() {
			return HVA_PROV_MKT_TYP_CD_SIZE;
		}
		public int hvaProvIpaIdSize() {
			return HVA_PROV_IPA_ID_SIZE;
		}
		public int hvaTpsmCdSize() {
			return HVA_TPSM_CD_SIZE;
		}
		public int hvaProvSpclCdSize() {
			return HVA_PROV_SPCL_CD_SIZE;
		}
		public int hvaProvMedcdReclmIndSize() {
			return HVA_PROV_MEDCD_RECLM_IND_SIZE;
		}
		public int hvaRelSrvcClmLvlIndSize() {
			return HVA_REL_SRVC_CLM_LVL_IND_SIZE;
		}
		public int hvaDiagCdSize() {
			return HVA_DIAG_CD_SIZE;
		}
		public int hvaAuthUniqCntSize() {
			return HVA_AUTH_UNIQ_CNT_SIZE;
		}
		public int hvaPhysMedcnMskCntSize() {
			return HVA_PHYS_MEDCN_MSK_CNT_SIZE;
		}
		public int hvaMskNullIndSize() {
			return HVA_MSK_NULL_IND_SIZE;
		}



}
  
