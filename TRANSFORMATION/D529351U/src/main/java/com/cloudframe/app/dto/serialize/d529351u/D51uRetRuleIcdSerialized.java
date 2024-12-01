package com.cloudframe.app.dto.serialize.d529351u;

/**
*  The class D51uRetRuleIcdSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:50. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class D51uRetRuleIcdSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(D51uRetRuleIcdSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int D_51U_RET_RULE_ICD_LENGTH = 24;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginD51uRicdDrvPos;
            protected  int beginD51uRicdDrvSvc;
            protected  int beginD51uRicdDrvCau;
            protected  int beginD51uRicdClmIcdInd;
            protected  int beginD51uRicdClmIcdFromCd;
            protected  int beginD51uRicdClmIcdToCd;
	
	/**
	* Constructor for D51uRetRuleIcdSerialized
	**/
    public D51uRetRuleIcdSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for D51uRetRuleIcdSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uRetRuleIcdSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this D51uRetRuleIcdSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,639594); // serialize this field at offset 639594 by default 
    }
    
	/**
	* sets parent for this D51uRetRuleIcdSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 639594 by default
    }    
	/**
	* initializes the field in D51uRetRuleIcdSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(D_51U_RET_RULE_ICD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginD51uRicdDrvPos = getStartOffset() + 0;	// set offset for serialization
  
             beginD51uRicdDrvSvc = getStartOffset() + 2;	// set offset for serialization
  
             beginD51uRicdDrvCau = getStartOffset() + 8;	// set offset for serialization
  
             beginD51uRicdClmIcdInd = getStartOffset() + 9;	// set offset for serialization
  
             beginD51uRicdClmIcdFromCd = getStartOffset() + 10;	// set offset for serialization
  
             beginD51uRicdClmIcdToCd = getStartOffset() + 17;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localD51uRicdDrvPosCounter = -1;
     public boolean isD51uRicdDrvPosModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uRicdDrvPosCounter != sharedCounter;
         localD51uRicdDrvPosCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_RICD_DRV_POS_LEN = 2;
	/**
	 * 	serialize this D51uRicdDrvPos
	 */
   protected void serializeD51uRicdDrvPos(char[] d51uRicdDrvPos) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uRicdDrvPos,0,getStringValue(),beginD51uRicdDrvPos,D_51U_RICD_DRV_POS_LEN);
       localD51uRicdDrvPosCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uRicdDrvPosConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshD51uRicdDrvPos is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uRicdDrvPos() {	 
   		return (substring(getStringValue(),beginD51uRicdDrvPos,beginD51uRicdDrvPos + D_51U_RICD_DRV_POS_LEN));
   	}
     int localD51uRicdDrvSvcCounter = -1;
     public boolean isD51uRicdDrvSvcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uRicdDrvSvcCounter != sharedCounter;
         localD51uRicdDrvSvcCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_RICD_DRV_SVC_LEN = 6;
	/**
	 * 	serialize this D51uRicdDrvSvc
	 */
   protected void serializeD51uRicdDrvSvc(char[] d51uRicdDrvSvc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uRicdDrvSvc,0,getStringValue(),beginD51uRicdDrvSvc,D_51U_RICD_DRV_SVC_LEN);
       localD51uRicdDrvSvcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uRicdDrvSvcConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshD51uRicdDrvSvc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uRicdDrvSvc() {	 
   		return (substring(getStringValue(),beginD51uRicdDrvSvc,beginD51uRicdDrvSvc + D_51U_RICD_DRV_SVC_LEN));
   	}
     int localD51uRicdDrvCauCounter = -1;
     public boolean isD51uRicdDrvCauModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uRicdDrvCauCounter != sharedCounter;
         localD51uRicdDrvCauCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_RICD_DRV_CAU_LEN = 1;
	/**
	 * 	serialize this D51uRicdDrvCau
	 */
   protected void serializeD51uRicdDrvCau(char[] d51uRicdDrvCau) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uRicdDrvCau,0,getStringValue(),beginD51uRicdDrvCau,D_51U_RICD_DRV_CAU_LEN);
       localD51uRicdDrvCauCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uRicdDrvCauConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshD51uRicdDrvCau is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uRicdDrvCau() {	 
   		return (substring(getStringValue(),beginD51uRicdDrvCau,beginD51uRicdDrvCau + D_51U_RICD_DRV_CAU_LEN));
   	}
     int localD51uRicdClmIcdIndCounter = -1;
     public boolean isD51uRicdClmIcdIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uRicdClmIcdIndCounter != sharedCounter;
         localD51uRicdClmIcdIndCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_RICD_CLM_ICD_IND_LEN = 1;
	/**
	 * 	serialize this D51uRicdClmIcdInd
	 */
   protected void serializeD51uRicdClmIcdInd(char[] d51uRicdClmIcdInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uRicdClmIcdInd,0,getStringValue(),beginD51uRicdClmIcdInd,D_51U_RICD_CLM_ICD_IND_LEN);
       localD51uRicdClmIcdIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uRicdClmIcdIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshD51uRicdClmIcdInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uRicdClmIcdInd() {	 
   		return (substring(getStringValue(),beginD51uRicdClmIcdInd,beginD51uRicdClmIcdInd + D_51U_RICD_CLM_ICD_IND_LEN));
   	}
     int localD51uRicdClmIcdFromCdCounter = -1;
     public boolean isD51uRicdClmIcdFromCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uRicdClmIcdFromCdCounter != sharedCounter;
         localD51uRicdClmIcdFromCdCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_RICD_CLM_ICD_FROM_CD_LEN = 7;
	/**
	 * 	serialize this D51uRicdClmIcdFromCd
	 */
   protected void serializeD51uRicdClmIcdFromCd(char[] d51uRicdClmIcdFromCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uRicdClmIcdFromCd,0,getStringValue(),beginD51uRicdClmIcdFromCd,D_51U_RICD_CLM_ICD_FROM_CD_LEN);
       localD51uRicdClmIcdFromCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uRicdClmIcdFromCdConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshD51uRicdClmIcdFromCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uRicdClmIcdFromCd() {	 
   		return (substring(getStringValue(),beginD51uRicdClmIcdFromCd,beginD51uRicdClmIcdFromCd + D_51U_RICD_CLM_ICD_FROM_CD_LEN));
   	}
     int localD51uRicdClmIcdToCdCounter = -1;
     public boolean isD51uRicdClmIcdToCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uRicdClmIcdToCdCounter != sharedCounter;
         localD51uRicdClmIcdToCdCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_RICD_CLM_ICD_TO_CD_LEN = 7;
	/**
	 * 	serialize this D51uRicdClmIcdToCd
	 */
   protected void serializeD51uRicdClmIcdToCd(char[] d51uRicdClmIcdToCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uRicdClmIcdToCd,0,getStringValue(),beginD51uRicdClmIcdToCd,D_51U_RICD_CLM_ICD_TO_CD_LEN);
       localD51uRicdClmIcdToCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uRicdClmIcdToCdConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshD51uRicdClmIcdToCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uRicdClmIcdToCd() {	 
   		return (substring(getStringValue(),beginD51uRicdClmIcdToCd,beginD51uRicdClmIcdToCd + D_51U_RICD_CLM_ICD_TO_CD_LEN));
   	}




}
  
