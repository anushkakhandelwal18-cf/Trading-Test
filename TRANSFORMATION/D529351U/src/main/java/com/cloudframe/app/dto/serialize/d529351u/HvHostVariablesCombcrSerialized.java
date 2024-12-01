package com.cloudframe.app.dto.serialize.d529351u;

/**
*  The class HvHostVariablesCombcrSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:50. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HvHostVariablesCombcrSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HvHostVariablesCombcrSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HV_HOST_VARIABLES_COMBCR_LENGTH = 4700;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginHv2aRecTypCd;
           protected static final int HV_2A_REC_TYP_CD_SIZE = 100;
           protected int beginHv2bDerivPlOfSvcCd;
           protected static final int HV_2B_DERIV_PL_OF_SVC_CD_SIZE = 100;
           protected int beginHv2cDerivSvcCd;
           protected static final int HV_2C_DERIV_SVC_CD_SIZE = 100;
           protected int beginHv2dDerivCausCd;
           protected static final int HV_2D_DERIV_CAUS_CD_SIZE = 100;
           protected int beginHv2eClmCaus1Cd;
           protected static final int HV_2E_CLM_CAUS_1_CD_SIZE = 100;
           protected int beginHv2fClmCaus2Cd;
           protected static final int HV_2F_CLM_CAUS_2_CD_SIZE = 100;
           protected int beginHv2gClmCaus3Cd;
           protected static final int HV_2G_CLM_CAUS_3_CD_SIZE = 100;
           protected int beginHv2hClmCaus4Cd;
           protected static final int HV_2H_CLM_CAUS_4_CD_SIZE = 100;
           protected int beginHv2iClmCaus5Cd;
           protected static final int HV_2I_CLM_CAUS_5_CD_SIZE = 100;
           protected int beginHv2jClmCaus6Cd;
           protected static final int HV_2J_CLM_CAUS_6_CD_SIZE = 100;
           protected int beginHv2kClmCaus7Cd;
           protected static final int HV_2K_CLM_CAUS_7_CD_SIZE = 100;
           protected int beginHv2lClmCaus8Cd;
           protected static final int HV_2L_CLM_CAUS_8_CD_SIZE = 100;
           protected int beginHv2mClmIpa1Cd;
           protected static final int HV_2M_CLM_IPA_1_CD_SIZE = 100;
           protected int beginHv2nClmIpa2Cd;
           protected static final int HV_2N_CLM_IPA_2_CD_SIZE = 100;
           protected int beginHv2oClmIpa3Cd;
           protected static final int HV_2O_CLM_IPA_3_CD_SIZE = 100;
           protected int beginHv2pProvTyp;
           protected static final int HV_2P_PROV_TYP_SIZE = 100;
           protected int beginHv2qFromCondPos;
           protected static final int HV_2Q_FROM_COND_POS_SIZE = 100;
           protected int beginHv2rGrpTbl1Nbr;
           protected static final int HV_2R_GRP_TBL_1_NBR_SIZE = 100;
           protected int beginHv2sGrpTbl2Nbr;
           protected static final int HV_2S_GRP_TBL_2_NBR_SIZE = 100;
           protected int beginHv2tGrpTbl3Nbr;
           protected static final int HV_2T_GRP_TBL_3_NBR_SIZE = 100;
           protected int beginHv2uCpeDescCd;
           protected static final int HV_2U_CPE_DESC_CD_SIZE = 100;
	
	/**
	* Constructor for HvHostVariablesCombcrSerialized
	**/
    public HvHostVariablesCombcrSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in HvHostVariablesCombcrSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HV_HOST_VARIABLES_COMBCR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginHv2aRecTypCd = getStartOffset() + 0; // set offset for serialization
  
	        beginHv2bDerivPlOfSvcCd = getStartOffset() + 100; // set offset for serialization
  
	        beginHv2cDerivSvcCd = getStartOffset() + 300; // set offset for serialization
  
	        beginHv2dDerivCausCd = getStartOffset() + 900; // set offset for serialization
  
	        beginHv2eClmCaus1Cd = getStartOffset() + 1000; // set offset for serialization
  
	        beginHv2fClmCaus2Cd = getStartOffset() + 1100; // set offset for serialization
  
	        beginHv2gClmCaus3Cd = getStartOffset() + 1200; // set offset for serialization
  
	        beginHv2hClmCaus4Cd = getStartOffset() + 1300; // set offset for serialization
  
	        beginHv2iClmCaus5Cd = getStartOffset() + 1400; // set offset for serialization
  
	        beginHv2jClmCaus6Cd = getStartOffset() + 1500; // set offset for serialization
  
	        beginHv2kClmCaus7Cd = getStartOffset() + 1600; // set offset for serialization
  
	        beginHv2lClmCaus8Cd = getStartOffset() + 1700; // set offset for serialization
  
	        beginHv2mClmIpa1Cd = getStartOffset() + 1800; // set offset for serialization
  
	        beginHv2nClmIpa2Cd = getStartOffset() + 2100; // set offset for serialization
  
	        beginHv2oClmIpa3Cd = getStartOffset() + 2400; // set offset for serialization
  
	        beginHv2pProvTyp = getStartOffset() + 2700; // set offset for serialization
  
	        beginHv2qFromCondPos = getStartOffset() + 2900; // set offset for serialization
  
	        beginHv2rGrpTbl1Nbr = getStartOffset() + 3100; // set offset for serialization
  
	        beginHv2sGrpTbl2Nbr = getStartOffset() + 3500; // set offset for serialization
  
	        beginHv2tGrpTbl3Nbr = getStartOffset() + 3900; // set offset for serialization
  
	        beginHv2uCpeDescCd = getStartOffset() + 4300; // set offset for serialization
  
	   /*  end of offset */
	}
 
   
  protected  static final int HV_2A_REC_TYP_CD_LEN = 1;
   /**
	 *	serializeHv2aRecTypCd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHv2aRecTypCd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHv2aRecTypCd + index*HV_2A_REC_TYP_CD_LEN)
   	          , HV_2A_REC_TYP_CD_LEN 
   	          );
   }
 
   
  protected  static final int HV_2B_DERIV_PL_OF_SVC_CD_LEN = 2;
   /**
	 *	serializeHv2bDerivPlOfSvcCd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHv2bDerivPlOfSvcCd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHv2bDerivPlOfSvcCd + index*HV_2B_DERIV_PL_OF_SVC_CD_LEN)
   	          , HV_2B_DERIV_PL_OF_SVC_CD_LEN 
   	          );
   }
 
   
  protected  static final int HV_2C_DERIV_SVC_CD_LEN = 6;
   /**
	 *	serializeHv2cDerivSvcCd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHv2cDerivSvcCd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHv2cDerivSvcCd + index*HV_2C_DERIV_SVC_CD_LEN)
   	          , HV_2C_DERIV_SVC_CD_LEN 
   	          );
   }
 
   
  protected  static final int HV_2D_DERIV_CAUS_CD_LEN = 1;
   /**
	 *	serializeHv2dDerivCausCd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHv2dDerivCausCd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHv2dDerivCausCd + index*HV_2D_DERIV_CAUS_CD_LEN)
   	          , HV_2D_DERIV_CAUS_CD_LEN 
   	          );
   }
 
   
  protected  static final int HV_2E_CLM_CAUS_1_CD_LEN = 1;
   /**
	 *	serializeHv2eClmCaus1Cd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHv2eClmCaus1Cd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHv2eClmCaus1Cd + index*HV_2E_CLM_CAUS_1_CD_LEN)
   	          , HV_2E_CLM_CAUS_1_CD_LEN 
   	          );
   }
 
   
  protected  static final int HV_2F_CLM_CAUS_2_CD_LEN = 1;
   /**
	 *	serializeHv2fClmCaus2Cd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHv2fClmCaus2Cd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHv2fClmCaus2Cd + index*HV_2F_CLM_CAUS_2_CD_LEN)
   	          , HV_2F_CLM_CAUS_2_CD_LEN 
   	          );
   }
 
   
  protected  static final int HV_2G_CLM_CAUS_3_CD_LEN = 1;
   /**
	 *	serializeHv2gClmCaus3Cd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHv2gClmCaus3Cd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHv2gClmCaus3Cd + index*HV_2G_CLM_CAUS_3_CD_LEN)
   	          , HV_2G_CLM_CAUS_3_CD_LEN 
   	          );
   }
 
   
  protected  static final int HV_2H_CLM_CAUS_4_CD_LEN = 1;
   /**
	 *	serializeHv2hClmCaus4Cd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHv2hClmCaus4Cd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHv2hClmCaus4Cd + index*HV_2H_CLM_CAUS_4_CD_LEN)
   	          , HV_2H_CLM_CAUS_4_CD_LEN 
   	          );
   }
 
   
  protected  static final int HV_2I_CLM_CAUS_5_CD_LEN = 1;
   /**
	 *	serializeHv2iClmCaus5Cd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHv2iClmCaus5Cd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHv2iClmCaus5Cd + index*HV_2I_CLM_CAUS_5_CD_LEN)
   	          , HV_2I_CLM_CAUS_5_CD_LEN 
   	          );
   }
 
   
  protected  static final int HV_2J_CLM_CAUS_6_CD_LEN = 1;
   /**
	 *	serializeHv2jClmCaus6Cd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHv2jClmCaus6Cd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHv2jClmCaus6Cd + index*HV_2J_CLM_CAUS_6_CD_LEN)
   	          , HV_2J_CLM_CAUS_6_CD_LEN 
   	          );
   }
 
   
  protected  static final int HV_2K_CLM_CAUS_7_CD_LEN = 1;
   /**
	 *	serializeHv2kClmCaus7Cd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHv2kClmCaus7Cd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHv2kClmCaus7Cd + index*HV_2K_CLM_CAUS_7_CD_LEN)
   	          , HV_2K_CLM_CAUS_7_CD_LEN 
   	          );
   }
 
   
  protected  static final int HV_2L_CLM_CAUS_8_CD_LEN = 1;
   /**
	 *	serializeHv2lClmCaus8Cd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHv2lClmCaus8Cd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHv2lClmCaus8Cd + index*HV_2L_CLM_CAUS_8_CD_LEN)
   	          , HV_2L_CLM_CAUS_8_CD_LEN 
   	          );
   }
 
   
  protected  static final int HV_2M_CLM_IPA_1_CD_LEN = 3;
   /**
	 *	serializeHv2mClmIpa1Cd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHv2mClmIpa1Cd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHv2mClmIpa1Cd + index*HV_2M_CLM_IPA_1_CD_LEN)
   	          , HV_2M_CLM_IPA_1_CD_LEN 
   	          );
   }
 
   
  protected  static final int HV_2N_CLM_IPA_2_CD_LEN = 3;
   /**
	 *	serializeHv2nClmIpa2Cd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHv2nClmIpa2Cd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHv2nClmIpa2Cd + index*HV_2N_CLM_IPA_2_CD_LEN)
   	          , HV_2N_CLM_IPA_2_CD_LEN 
   	          );
   }
 
   
  protected  static final int HV_2O_CLM_IPA_3_CD_LEN = 3;
   /**
	 *	serializeHv2oClmIpa3Cd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHv2oClmIpa3Cd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHv2oClmIpa3Cd + index*HV_2O_CLM_IPA_3_CD_LEN)
   	          , HV_2O_CLM_IPA_3_CD_LEN 
   	          );
   }
 
   
  protected  static final int HV_2P_PROV_TYP_LEN = 2;
   /**
	 *	serializeHv2pProvTyp as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHv2pProvTyp(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHv2pProvTyp + index*HV_2P_PROV_TYP_LEN)
   	          , HV_2P_PROV_TYP_LEN 
   	          );
   }
 
   
  protected  static final int HV_2Q_FROM_COND_POS_LEN = 2;
   /**
	 *	serializeHv2qFromCondPos as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHv2qFromCondPos(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHv2qFromCondPos + index*HV_2Q_FROM_COND_POS_LEN)
   	          , HV_2Q_FROM_COND_POS_LEN 
   	          );
   }
 
   
  protected  static final int HV_2R_GRP_TBL_1_NBR_LEN = 4;
   /**
	 *	serializeHv2rGrpTbl1Nbr as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHv2rGrpTbl1Nbr(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHv2rGrpTbl1Nbr + index*HV_2R_GRP_TBL_1_NBR_LEN)
   	          , HV_2R_GRP_TBL_1_NBR_LEN 
   	          );
   }
 
   
  protected  static final int HV_2S_GRP_TBL_2_NBR_LEN = 4;
   /**
	 *	serializeHv2sGrpTbl2Nbr as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHv2sGrpTbl2Nbr(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHv2sGrpTbl2Nbr + index*HV_2S_GRP_TBL_2_NBR_LEN)
   	          , HV_2S_GRP_TBL_2_NBR_LEN 
   	          );
   }
 
   
  protected  static final int HV_2T_GRP_TBL_3_NBR_LEN = 4;
   /**
	 *	serializeHv2tGrpTbl3Nbr as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHv2tGrpTbl3Nbr(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHv2tGrpTbl3Nbr + index*HV_2T_GRP_TBL_3_NBR_LEN)
   	          , HV_2T_GRP_TBL_3_NBR_LEN 
   	          );
   }
 
   
  protected  static final int HV_2U_CPE_DESC_CD_LEN = 4;
   /**
	 *	serializeHv2uCpeDescCd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHv2uCpeDescCd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHv2uCpeDescCd + index*HV_2U_CPE_DESC_CD_LEN)
   	          , HV_2U_CPE_DESC_CD_LEN 
   	          );
   }

		public int hv2aRecTypCdSize() {
			return HV_2A_REC_TYP_CD_SIZE;
		}
		public int hv2bDerivPlOfSvcCdSize() {
			return HV_2B_DERIV_PL_OF_SVC_CD_SIZE;
		}
		public int hv2cDerivSvcCdSize() {
			return HV_2C_DERIV_SVC_CD_SIZE;
		}
		public int hv2dDerivCausCdSize() {
			return HV_2D_DERIV_CAUS_CD_SIZE;
		}
		public int hv2eClmCaus1CdSize() {
			return HV_2E_CLM_CAUS_1_CD_SIZE;
		}
		public int hv2fClmCaus2CdSize() {
			return HV_2F_CLM_CAUS_2_CD_SIZE;
		}
		public int hv2gClmCaus3CdSize() {
			return HV_2G_CLM_CAUS_3_CD_SIZE;
		}
		public int hv2hClmCaus4CdSize() {
			return HV_2H_CLM_CAUS_4_CD_SIZE;
		}
		public int hv2iClmCaus5CdSize() {
			return HV_2I_CLM_CAUS_5_CD_SIZE;
		}
		public int hv2jClmCaus6CdSize() {
			return HV_2J_CLM_CAUS_6_CD_SIZE;
		}
		public int hv2kClmCaus7CdSize() {
			return HV_2K_CLM_CAUS_7_CD_SIZE;
		}
		public int hv2lClmCaus8CdSize() {
			return HV_2L_CLM_CAUS_8_CD_SIZE;
		}
		public int hv2mClmIpa1CdSize() {
			return HV_2M_CLM_IPA_1_CD_SIZE;
		}
		public int hv2nClmIpa2CdSize() {
			return HV_2N_CLM_IPA_2_CD_SIZE;
		}
		public int hv2oClmIpa3CdSize() {
			return HV_2O_CLM_IPA_3_CD_SIZE;
		}
		public int hv2pProvTypSize() {
			return HV_2P_PROV_TYP_SIZE;
		}
		public int hv2qFromCondPosSize() {
			return HV_2Q_FROM_COND_POS_SIZE;
		}
		public int hv2rGrpTbl1NbrSize() {
			return HV_2R_GRP_TBL_1_NBR_SIZE;
		}
		public int hv2sGrpTbl2NbrSize() {
			return HV_2S_GRP_TBL_2_NBR_SIZE;
		}
		public int hv2tGrpTbl3NbrSize() {
			return HV_2T_GRP_TBL_3_NBR_SIZE;
		}
		public int hv2uCpeDescCdSize() {
			return HV_2U_CPE_DESC_CD_SIZE;
		}



}
  
