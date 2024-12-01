package com.cloudframe.app.dto.serialize.d529351u;

/**
*  The class D51uRetRuleKeysSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:50. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class D51uRetRuleKeysSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(D51uRetRuleKeysSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int D_51U_RET_RULE_KEYS_LENGTH = 17;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginD51uRetDrvPos;
            protected  int beginD51uRetDrvSvc;
            protected  int beginD51uRetDrvCau;
            protected  int beginD51uRetRuleSw;
	
	/**
	* Constructor for D51uRetRuleKeysSerialized
	**/
    public D51uRetRuleKeysSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for D51uRetRuleKeysSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uRetRuleKeysSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this D51uRetRuleKeysSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,410310); // serialize this field at offset 410310 by default 
    }
    
	/**
	* sets parent for this D51uRetRuleKeysSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 410310 by default
    }    
	/**
	* initializes the field in D51uRetRuleKeysSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(D_51U_RET_RULE_KEYS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginD51uRetDrvPos = getStartOffset() + 0;	// set offset for serialization
  
             beginD51uRetDrvSvc = getStartOffset() + 2;	// set offset for serialization
  
             beginD51uRetDrvCau = getStartOffset() + 8;	// set offset for serialization
  
             beginD51uRetRuleSw = getStartOffset() + 9;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localD51uRetDrvPosCounter = -1;
     public boolean isD51uRetDrvPosModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uRetDrvPosCounter != sharedCounter;
         localD51uRetDrvPosCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_RET_DRV_POS_LEN = 2;
	/**
	 * 	serialize this D51uRetDrvPos
	 */
   protected void serializeD51uRetDrvPos(char[] d51uRetDrvPos) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uRetDrvPos,0,getStringValue(),beginD51uRetDrvPos,D_51U_RET_DRV_POS_LEN);
       localD51uRetDrvPosCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uRetDrvPosConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshD51uRetDrvPos is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uRetDrvPos() {	 
   		return (substring(getStringValue(),beginD51uRetDrvPos,beginD51uRetDrvPos + D_51U_RET_DRV_POS_LEN));
   	}
     int localD51uRetDrvSvcCounter = -1;
     public boolean isD51uRetDrvSvcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uRetDrvSvcCounter != sharedCounter;
         localD51uRetDrvSvcCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_RET_DRV_SVC_LEN = 6;
	/**
	 * 	serialize this D51uRetDrvSvc
	 */
   protected void serializeD51uRetDrvSvc(char[] d51uRetDrvSvc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uRetDrvSvc,0,getStringValue(),beginD51uRetDrvSvc,D_51U_RET_DRV_SVC_LEN);
       localD51uRetDrvSvcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uRetDrvSvcConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshD51uRetDrvSvc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uRetDrvSvc() {	 
   		return (substring(getStringValue(),beginD51uRetDrvSvc,beginD51uRetDrvSvc + D_51U_RET_DRV_SVC_LEN));
   	}
     int localD51uRetDrvCauCounter = -1;
     public boolean isD51uRetDrvCauModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uRetDrvCauCounter != sharedCounter;
         localD51uRetDrvCauCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_RET_DRV_CAU_LEN = 1;
	/**
	 * 	serialize this D51uRetDrvCau
	 */
   protected void serializeD51uRetDrvCau(char[] d51uRetDrvCau) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uRetDrvCau,0,getStringValue(),beginD51uRetDrvCau,D_51U_RET_DRV_CAU_LEN);
       localD51uRetDrvCauCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uRetDrvCauConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshD51uRetDrvCau is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uRetDrvCau() {	 
   		return (substring(getStringValue(),beginD51uRetDrvCau,beginD51uRetDrvCau + D_51U_RET_DRV_CAU_LEN));
   	}
     int localD51uRetRuleSwCounter = -1;
     public boolean isD51uRetRuleSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uRetRuleSwCounter != sharedCounter;
         localD51uRetRuleSwCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_RET_RULE_SW_LEN = 8;
	/**
	 * 	serialize this D51uRetRuleSw
	 */
   protected void serializeD51uRetRuleSw(char[] d51uRetRuleSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uRetRuleSw,0,getStringValue(),beginD51uRetRuleSw,D_51U_RET_RULE_SW_LEN);
       localD51uRetRuleSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uRetRuleSwConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshD51uRetRuleSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uRetRuleSw() {	 
   		return (substring(getStringValue(),beginD51uRetRuleSw,beginD51uRetRuleSw + D_51U_RET_RULE_SW_LEN));
   	}




}
  
