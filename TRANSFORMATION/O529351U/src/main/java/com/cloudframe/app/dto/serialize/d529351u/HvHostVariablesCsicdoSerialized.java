package com.cloudframe.app.dto.serialize.d529351u;

/**
*  The class HvHostVariablesCsicdoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HvHostVariablesCsicdoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HvHostVariablesCsicdoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HV_HOST_VARIABLES_CSICDO_LENGTH = 239976;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginHv3aIcdDrvPos;
           protected static final int HV_3A_ICD_DRV_POS_SIZE = 9999;
           protected int beginHv3bIcdDrvSvc;
           protected static final int HV_3B_ICD_DRV_SVC_SIZE = 9999;
           protected int beginHv3cIcdDrvCau;
           protected static final int HV_3C_ICD_DRV_CAU_SIZE = 9999;
           protected int beginHv3dIcdTypCd;
           protected static final int HV_3D_ICD_TYP_CD_SIZE = 9999;
           protected int beginHv3eClmFrmIcdCd;
           protected static final int HV_3E_CLM_FRM_ICD_CD_SIZE = 9999;
           protected int beginHv3fClmToIcdCd;
           protected static final int HV_3F_CLM_TO_ICD_CD_SIZE = 9999;
	
	/**
	* Constructor for HvHostVariablesCsicdoSerialized
	**/
    public HvHostVariablesCsicdoSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in HvHostVariablesCsicdoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HV_HOST_VARIABLES_CSICDO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginHv3aIcdDrvPos = getStartOffset() + 0; // set offset for serialization
  
	        beginHv3bIcdDrvSvc = getStartOffset() + 19998; // set offset for serialization
  
	        beginHv3cIcdDrvCau = getStartOffset() + 79992; // set offset for serialization
  
	        beginHv3dIcdTypCd = getStartOffset() + 89991; // set offset for serialization
  
	        beginHv3eClmFrmIcdCd = getStartOffset() + 99990; // set offset for serialization
  
	        beginHv3fClmToIcdCd = getStartOffset() + 169983; // set offset for serialization
  
	   /*  end of offset */
	}
 
   
  protected  static final int HV_3A_ICD_DRV_POS_LEN = 2;
   /**
	 *	serializeHv3aIcdDrvPos as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHv3aIcdDrvPos(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHv3aIcdDrvPos + index*HV_3A_ICD_DRV_POS_LEN)
   	          , HV_3A_ICD_DRV_POS_LEN 
   	          );
   }
 
   
  protected  static final int HV_3B_ICD_DRV_SVC_LEN = 6;
   /**
	 *	serializeHv3bIcdDrvSvc as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHv3bIcdDrvSvc(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHv3bIcdDrvSvc + index*HV_3B_ICD_DRV_SVC_LEN)
   	          , HV_3B_ICD_DRV_SVC_LEN 
   	          );
   }
 
   
  protected  static final int HV_3C_ICD_DRV_CAU_LEN = 1;
   /**
	 *	serializeHv3cIcdDrvCau as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHv3cIcdDrvCau(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHv3cIcdDrvCau + index*HV_3C_ICD_DRV_CAU_LEN)
   	          , HV_3C_ICD_DRV_CAU_LEN 
   	          );
   }
 
   
  protected  static final int HV_3D_ICD_TYP_CD_LEN = 1;
   /**
	 *	serializeHv3dIcdTypCd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHv3dIcdTypCd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHv3dIcdTypCd + index*HV_3D_ICD_TYP_CD_LEN)
   	          , HV_3D_ICD_TYP_CD_LEN 
   	          );
   }
 
   
  protected  static final int HV_3E_CLM_FRM_ICD_CD_LEN = 7;
   /**
	 *	serializeHv3eClmFrmIcdCd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHv3eClmFrmIcdCd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHv3eClmFrmIcdCd + index*HV_3E_CLM_FRM_ICD_CD_LEN)
   	          , HV_3E_CLM_FRM_ICD_CD_LEN 
   	          );
   }
 
   
  protected  static final int HV_3F_CLM_TO_ICD_CD_LEN = 7;
   /**
	 *	serializeHv3fClmToIcdCd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHv3fClmToIcdCd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHv3fClmToIcdCd + index*HV_3F_CLM_TO_ICD_CD_LEN)
   	          , HV_3F_CLM_TO_ICD_CD_LEN 
   	          );
   }

		public int hv3aIcdDrvPosSize() {
			return HV_3A_ICD_DRV_POS_SIZE;
		}
		public int hv3bIcdDrvSvcSize() {
			return HV_3B_ICD_DRV_SVC_SIZE;
		}
		public int hv3cIcdDrvCauSize() {
			return HV_3C_ICD_DRV_CAU_SIZE;
		}
		public int hv3dIcdTypCdSize() {
			return HV_3D_ICD_TYP_CD_SIZE;
		}
		public int hv3eClmFrmIcdCdSize() {
			return HV_3E_CLM_FRM_ICD_CD_SIZE;
		}
		public int hv3fClmToIcdCdSize() {
			return HV_3F_CLM_TO_ICD_CD_SIZE;
		}



}
  
