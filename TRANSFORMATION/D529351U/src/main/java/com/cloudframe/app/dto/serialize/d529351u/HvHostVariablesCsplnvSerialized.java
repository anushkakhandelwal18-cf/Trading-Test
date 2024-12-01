package com.cloudframe.app.dto.serialize.d529351u;

/**
*  The class HvHostVariablesCsplnvSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:50. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HvHostVariablesCsplnvSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HvHostVariablesCsplnvSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HV_HOST_VARIABLES_CSPLNV_LENGTH = 3000;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginHv01SpiTblId;
           protected static final int HV_01_SPI_TBL_ID_SIZE = 100;
           protected int beginHv0aPriDiagInd;
           protected static final int HV_0A_PRI_DIAG_IND_SIZE = 100;
           protected int beginHv14PosTierTypCd;
           protected static final int HV_14_POS_TIER_TYP_CD_SIZE = 100;
           protected int beginHv15MjrDiagEligInd;
           protected static final int HV_15_MJR_DIAG_ELIG_IND_SIZE = 100;
	
	/**
	* Constructor for HvHostVariablesCsplnvSerialized
	**/
    public HvHostVariablesCsplnvSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in HvHostVariablesCsplnvSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HV_HOST_VARIABLES_CSPLNV_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginHv01SpiTblId = getStartOffset() + 0; // set offset for serialization
  
	        beginHv0aPriDiagInd = getStartOffset() + 700; // set offset for serialization
  
	        beginHv14PosTierTypCd = getStartOffset() + 2800; // set offset for serialization
  
	        beginHv15MjrDiagEligInd = getStartOffset() + 2900; // set offset for serialization
  
	   /*  end of offset */
	}
 
   
  protected  static final int HV_01_SPI_TBL_ID_LEN = 7;
   /**
	 *	serializeHv01SpiTblId as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHv01SpiTblId(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHv01SpiTblId + index*HV_01_SPI_TBL_ID_LEN)
   	          , HV_01_SPI_TBL_ID_LEN 
   	          );
   }
 
   
  protected  static final int HV_0A_PRI_DIAG_IND_LEN = 1;
   /**
	 *	serializeHv0aPriDiagInd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHv0aPriDiagInd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHv0aPriDiagInd + index*HV_0A_PRI_DIAG_IND_LEN)
   	          , HV_0A_PRI_DIAG_IND_LEN 
   	          );
   }
 
   
  protected  static final int HV_14_POS_TIER_TYP_CD_LEN = 1;
   /**
	 *	serializeHv14PosTierTypCd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHv14PosTierTypCd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHv14PosTierTypCd + index*HV_14_POS_TIER_TYP_CD_LEN)
   	          , HV_14_POS_TIER_TYP_CD_LEN 
   	          );
   }
 
   
  protected  static final int HV_15_MJR_DIAG_ELIG_IND_LEN = 1;
   /**
	 *	serializeHv15MjrDiagEligInd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHv15MjrDiagEligInd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHv15MjrDiagEligInd + index*HV_15_MJR_DIAG_ELIG_IND_LEN)
   	          , HV_15_MJR_DIAG_ELIG_IND_LEN 
   	          );
   }

		public int hv01SpiTblIdSize() {
			return HV_01_SPI_TBL_ID_SIZE;
		}
		public int hv0aPriDiagIndSize() {
			return HV_0A_PRI_DIAG_IND_SIZE;
		}
		public int hv14PosTierTypCdSize() {
			return HV_14_POS_TIER_TYP_CD_SIZE;
		}
		public int hv15MjrDiagEligIndSize() {
			return HV_15_MJR_DIAG_ELIG_IND_SIZE;
		}



}
  
