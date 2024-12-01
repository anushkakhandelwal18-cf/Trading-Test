package com.cloudframe.app.dto.serialize.d529351u;

/**
*  The class HvHostVariablesSvcmainSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HvHostVariablesSvcmainSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HvHostVariablesSvcmainSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HV_HOST_VARIABLES_SVCMAIN_LENGTH = 1700;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginHv04KeyDrvPos;
           protected static final int HV_04_KEY_DRV_POS_SIZE = 100;
           protected int beginHv05KeyDrvSvc;
           protected static final int HV_05_KEY_DRV_SVC_SIZE = 100;
           protected int beginHv06KeyDrvCau;
           protected static final int HV_06_KEY_DRV_CAU_SIZE = 100;
           protected int beginHv07RuleSw;
           protected static final int HV_07_RULE_SW_SIZE = 100;
	
	/**
	* Constructor for HvHostVariablesSvcmainSerialized
	**/
    public HvHostVariablesSvcmainSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in HvHostVariablesSvcmainSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HV_HOST_VARIABLES_SVCMAIN_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginHv04KeyDrvPos = getStartOffset() + 0; // set offset for serialization
  
	        beginHv05KeyDrvSvc = getStartOffset() + 200; // set offset for serialization
  
	        beginHv06KeyDrvCau = getStartOffset() + 800; // set offset for serialization
  
	        beginHv07RuleSw = getStartOffset() + 900; // set offset for serialization
  
	   /*  end of offset */
	}
 
   
  protected  static final int HV_04_KEY_DRV_POS_LEN = 2;
   /**
	 *	serializeHv04KeyDrvPos as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHv04KeyDrvPos(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHv04KeyDrvPos + index*HV_04_KEY_DRV_POS_LEN)
   	          , HV_04_KEY_DRV_POS_LEN 
   	          );
   }
 
   
  protected  static final int HV_05_KEY_DRV_SVC_LEN = 6;
   /**
	 *	serializeHv05KeyDrvSvc as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHv05KeyDrvSvc(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHv05KeyDrvSvc + index*HV_05_KEY_DRV_SVC_LEN)
   	          , HV_05_KEY_DRV_SVC_LEN 
   	          );
   }
 
   
  protected  static final int HV_06_KEY_DRV_CAU_LEN = 1;
   /**
	 *	serializeHv06KeyDrvCau as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHv06KeyDrvCau(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHv06KeyDrvCau + index*HV_06_KEY_DRV_CAU_LEN)
   	          , HV_06_KEY_DRV_CAU_LEN 
   	          );
   }
 
   
  protected  static final int HV_07_RULE_SW_LEN = 8;
   /**
	 *	serializeHv07RuleSw as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeHv07RuleSw(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginHv07RuleSw + index*HV_07_RULE_SW_LEN)
   	          , HV_07_RULE_SW_LEN 
   	          );
   }

		public int hv04KeyDrvPosSize() {
			return HV_04_KEY_DRV_POS_SIZE;
		}
		public int hv05KeyDrvSvcSize() {
			return HV_05_KEY_DRV_SVC_SIZE;
		}
		public int hv06KeyDrvCauSize() {
			return HV_06_KEY_DRV_CAU_SIZE;
		}
		public int hv07RuleSwSize() {
			return HV_07_RULE_SW_SIZE;
		}



}
  
