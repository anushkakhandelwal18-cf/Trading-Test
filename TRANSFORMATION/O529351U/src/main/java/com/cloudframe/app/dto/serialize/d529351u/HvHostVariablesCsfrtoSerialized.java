package com.cloudframe.app.dto.serialize.d529351u;

/**
*  The class HvHostVariablesCsfrtoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HvHostVariablesCsfrtoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HvHostVariablesCsfrtoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HV_HOST_VARIABLES_CSFRTO_LENGTH = 2200;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginHv08SvcDrvPos;
           protected static final int HV_08_SVC_DRV_POS_SIZE = 100;
           protected int beginHv09SvcDrvSvc;
           protected static final int HV_09_SVC_DRV_SVC_SIZE = 100;
           protected int beginHv10SvcDrvCau;
           protected static final int HV_10_SVC_DRV_CAU_SIZE = 100;
           protected int beginHv11ClmFrmSvcCd;
           protected static final int HV_11_CLM_FRM_SVC_CD_SIZE = 100;
           protected int beginHv12ClmToSvcCd;
           protected static final int HV_12_CLM_TO_SVC_CD_SIZE = 100;
           protected int beginHv13SvcTypCd;
           protected static final int HV_13_SVC_TYP_CD_SIZE = 100;
	
	/**
	* Constructor for HvHostVariablesCsfrtoSerialized
	**/
    public HvHostVariablesCsfrtoSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in HvHostVariablesCsfrtoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HV_HOST_VARIABLES_CSFRTO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginHv08SvcDrvPos = getStartOffset() + 0; // set offset for serialization
  
	        beginHv09SvcDrvSvc = getStartOffset() + 200; // set offset for serialization
  
	        beginHv10SvcDrvCau = getStartOffset() + 800; // set offset for serialization
  
	        beginHv11ClmFrmSvcCd = getStartOffset() + 900; // set offset for serialization
  
	        beginHv12ClmToSvcCd = getStartOffset() + 1500; // set offset for serialization
  
	        beginHv13SvcTypCd = getStartOffset() + 2100; // set offset for serialization
  
	   /*  end of offset */
	}
 
   
  protected  static final int HV_08_SVC_DRV_POS_LEN = 2;
   /**
	 *	serializeHv08SvcDrvPos as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHv08SvcDrvPos(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHv08SvcDrvPos + index*HV_08_SVC_DRV_POS_LEN)
   	          , HV_08_SVC_DRV_POS_LEN 
   	          );
   }
 
   
  protected  static final int HV_09_SVC_DRV_SVC_LEN = 6;
   /**
	 *	serializeHv09SvcDrvSvc as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHv09SvcDrvSvc(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHv09SvcDrvSvc + index*HV_09_SVC_DRV_SVC_LEN)
   	          , HV_09_SVC_DRV_SVC_LEN 
   	          );
   }
 
   
  protected  static final int HV_10_SVC_DRV_CAU_LEN = 1;
   /**
	 *	serializeHv10SvcDrvCau as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHv10SvcDrvCau(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHv10SvcDrvCau + index*HV_10_SVC_DRV_CAU_LEN)
   	          , HV_10_SVC_DRV_CAU_LEN 
   	          );
   }
 
   
  protected  static final int HV_11_CLM_FRM_SVC_CD_LEN = 6;
   /**
	 *	serializeHv11ClmFrmSvcCd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHv11ClmFrmSvcCd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHv11ClmFrmSvcCd + index*HV_11_CLM_FRM_SVC_CD_LEN)
   	          , HV_11_CLM_FRM_SVC_CD_LEN 
   	          );
   }
 
   
  protected  static final int HV_12_CLM_TO_SVC_CD_LEN = 6;
   /**
	 *	serializeHv12ClmToSvcCd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHv12ClmToSvcCd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHv12ClmToSvcCd + index*HV_12_CLM_TO_SVC_CD_LEN)
   	          , HV_12_CLM_TO_SVC_CD_LEN 
   	          );
   }
 
   
  protected  static final int HV_13_SVC_TYP_CD_LEN = 1;
   /**
	 *	serializeHv13SvcTypCd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHv13SvcTypCd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHv13SvcTypCd + index*HV_13_SVC_TYP_CD_LEN)
   	          , HV_13_SVC_TYP_CD_LEN 
   	          );
   }

		public int hv08SvcDrvPosSize() {
			return HV_08_SVC_DRV_POS_SIZE;
		}
		public int hv09SvcDrvSvcSize() {
			return HV_09_SVC_DRV_SVC_SIZE;
		}
		public int hv10SvcDrvCauSize() {
			return HV_10_SVC_DRV_CAU_SIZE;
		}
		public int hv11ClmFrmSvcCdSize() {
			return HV_11_CLM_FRM_SVC_CD_SIZE;
		}
		public int hv12ClmToSvcCdSize() {
			return HV_12_CLM_TO_SVC_CD_SIZE;
		}
		public int hv13SvcTypCdSize() {
			return HV_13_SVC_TYP_CD_SIZE;
		}



}
  
