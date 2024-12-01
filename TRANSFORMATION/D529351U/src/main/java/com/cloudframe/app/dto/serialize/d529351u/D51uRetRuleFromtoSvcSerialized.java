package com.cloudframe.app.dto.serialize.d529351u;

/**
*  The class D51uRetRuleFromtoSvcSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:50. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class D51uRetRuleFromtoSvcSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(D51uRetRuleFromtoSvcSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int D_51U_RET_RULE_FROMTO_SVC_LENGTH = 22;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginD51uFrtoDrvPos;
            protected  int beginD51uFrtoDrvSvc;
            protected  int beginD51uFrtoDrvCau;
            protected  int beginD51uFrtoClmFrmSvcCd;
            protected  int beginD51uFrtoClmToSvcCd;
            protected  int beginD51uFrtoSvcTypCd;
	
	/**
	* Constructor for D51uRetRuleFromtoSvcSerialized
	**/
    public D51uRetRuleFromtoSvcSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for D51uRetRuleFromtoSvcSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uRetRuleFromtoSvcSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this D51uRetRuleFromtoSvcSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,411993); // serialize this field at offset 411993 by default 
    }
    
	/**
	* sets parent for this D51uRetRuleFromtoSvcSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 411993 by default
    }    
	/**
	* initializes the field in D51uRetRuleFromtoSvcSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(D_51U_RET_RULE_FROMTO_SVC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginD51uFrtoDrvPos = getStartOffset() + 0;	// set offset for serialization
  
             beginD51uFrtoDrvSvc = getStartOffset() + 2;	// set offset for serialization
  
             beginD51uFrtoDrvCau = getStartOffset() + 8;	// set offset for serialization
  
             beginD51uFrtoClmFrmSvcCd = getStartOffset() + 9;	// set offset for serialization
  
             beginD51uFrtoClmToSvcCd = getStartOffset() + 15;	// set offset for serialization
  
             beginD51uFrtoSvcTypCd = getStartOffset() + 21;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localD51uFrtoDrvPosCounter = -1;
     public boolean isD51uFrtoDrvPosModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uFrtoDrvPosCounter != sharedCounter;
         localD51uFrtoDrvPosCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_FRTO_DRV_POS_LEN = 2;
	/**
	 * 	serialize this D51uFrtoDrvPos
	 */
   protected void serializeD51uFrtoDrvPos(char[] d51uFrtoDrvPos) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uFrtoDrvPos,0,getStringValue(),beginD51uFrtoDrvPos,D_51U_FRTO_DRV_POS_LEN);
       localD51uFrtoDrvPosCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uFrtoDrvPosConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshD51uFrtoDrvPos is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uFrtoDrvPos() {	 
   		return (substring(getStringValue(),beginD51uFrtoDrvPos,beginD51uFrtoDrvPos + D_51U_FRTO_DRV_POS_LEN));
   	}
     int localD51uFrtoDrvSvcCounter = -1;
     public boolean isD51uFrtoDrvSvcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uFrtoDrvSvcCounter != sharedCounter;
         localD51uFrtoDrvSvcCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_FRTO_DRV_SVC_LEN = 6;
	/**
	 * 	serialize this D51uFrtoDrvSvc
	 */
   protected void serializeD51uFrtoDrvSvc(char[] d51uFrtoDrvSvc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uFrtoDrvSvc,0,getStringValue(),beginD51uFrtoDrvSvc,D_51U_FRTO_DRV_SVC_LEN);
       localD51uFrtoDrvSvcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uFrtoDrvSvcConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshD51uFrtoDrvSvc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uFrtoDrvSvc() {	 
   		return (substring(getStringValue(),beginD51uFrtoDrvSvc,beginD51uFrtoDrvSvc + D_51U_FRTO_DRV_SVC_LEN));
   	}
     int localD51uFrtoDrvCauCounter = -1;
     public boolean isD51uFrtoDrvCauModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uFrtoDrvCauCounter != sharedCounter;
         localD51uFrtoDrvCauCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_FRTO_DRV_CAU_LEN = 1;
	/**
	 * 	serialize this D51uFrtoDrvCau
	 */
   protected void serializeD51uFrtoDrvCau(char[] d51uFrtoDrvCau) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uFrtoDrvCau,0,getStringValue(),beginD51uFrtoDrvCau,D_51U_FRTO_DRV_CAU_LEN);
       localD51uFrtoDrvCauCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uFrtoDrvCauConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshD51uFrtoDrvCau is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uFrtoDrvCau() {	 
   		return (substring(getStringValue(),beginD51uFrtoDrvCau,beginD51uFrtoDrvCau + D_51U_FRTO_DRV_CAU_LEN));
   	}
     int localD51uFrtoClmFrmSvcCdCounter = -1;
     public boolean isD51uFrtoClmFrmSvcCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uFrtoClmFrmSvcCdCounter != sharedCounter;
         localD51uFrtoClmFrmSvcCdCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_FRTO_CLM_FRM_SVC_CD_LEN = 6;
	/**
	 * 	serialize this D51uFrtoClmFrmSvcCd
	 */
   protected void serializeD51uFrtoClmFrmSvcCd(char[] d51uFrtoClmFrmSvcCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uFrtoClmFrmSvcCd,0,getStringValue(),beginD51uFrtoClmFrmSvcCd,D_51U_FRTO_CLM_FRM_SVC_CD_LEN);
       localD51uFrtoClmFrmSvcCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uFrtoClmFrmSvcCdConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshD51uFrtoClmFrmSvcCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uFrtoClmFrmSvcCd() {	 
   		return (substring(getStringValue(),beginD51uFrtoClmFrmSvcCd,beginD51uFrtoClmFrmSvcCd + D_51U_FRTO_CLM_FRM_SVC_CD_LEN));
   	}
     int localD51uFrtoClmToSvcCdCounter = -1;
     public boolean isD51uFrtoClmToSvcCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uFrtoClmToSvcCdCounter != sharedCounter;
         localD51uFrtoClmToSvcCdCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_FRTO_CLM_TO_SVC_CD_LEN = 6;
	/**
	 * 	serialize this D51uFrtoClmToSvcCd
	 */
   protected void serializeD51uFrtoClmToSvcCd(char[] d51uFrtoClmToSvcCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uFrtoClmToSvcCd,0,getStringValue(),beginD51uFrtoClmToSvcCd,D_51U_FRTO_CLM_TO_SVC_CD_LEN);
       localD51uFrtoClmToSvcCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uFrtoClmToSvcCdConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshD51uFrtoClmToSvcCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uFrtoClmToSvcCd() {	 
   		return (substring(getStringValue(),beginD51uFrtoClmToSvcCd,beginD51uFrtoClmToSvcCd + D_51U_FRTO_CLM_TO_SVC_CD_LEN));
   	}
     int localD51uFrtoSvcTypCdCounter = -1;
     public boolean isD51uFrtoSvcTypCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uFrtoSvcTypCdCounter != sharedCounter;
         localD51uFrtoSvcTypCdCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_FRTO_SVC_TYP_CD_LEN = 1;
	/**
	 * 	serialize this D51uFrtoSvcTypCd
	 */
   protected void serializeD51uFrtoSvcTypCd(char[] d51uFrtoSvcTypCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uFrtoSvcTypCd,0,getStringValue(),beginD51uFrtoSvcTypCd,D_51U_FRTO_SVC_TYP_CD_LEN);
       localD51uFrtoSvcTypCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uFrtoSvcTypCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshD51uFrtoSvcTypCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uFrtoSvcTypCd() {	 
   		return (substring(getStringValue(),beginD51uFrtoSvcTypCd,beginD51uFrtoSvcTypCd + D_51U_FRTO_SVC_TYP_CD_LEN));
   	}




}
  
