package com.cloudframe.app.dto.serialize.d529351u;

/**
*  The class D51uRetRuleFrCondPosSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class D51uRetRuleFrCondPosSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(D51uRetRuleFrCondPosSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int D_51U_RET_RULE_FR_COND_POS_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginD51uFcndDrvPos;
            protected  int beginD51uFcndDrvSvc;
            protected  int beginD51uFcndDrvCau;
            protected  int beginD51uFcndFromCondPos;
	
	/**
	* Constructor for D51uRetRuleFrCondPosSerialized
	**/
    public D51uRetRuleFrCondPosSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for D51uRetRuleFrCondPosSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uRetRuleFrCondPosSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this D51uRetRuleFrCondPosSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,638406); // serialize this field at offset 638406 by default 
    }
    
	/**
	* sets parent for this D51uRetRuleFrCondPosSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 638406 by default
    }    
	/**
	* initializes the field in D51uRetRuleFrCondPosSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(D_51U_RET_RULE_FR_COND_POS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginD51uFcndDrvPos = getStartOffset() + 0;	// set offset for serialization
  
             beginD51uFcndDrvSvc = getStartOffset() + 2;	// set offset for serialization
  
             beginD51uFcndDrvCau = getStartOffset() + 8;	// set offset for serialization
  
             beginD51uFcndFromCondPos = getStartOffset() + 9;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localD51uFcndDrvPosCounter = -1;
     public boolean isD51uFcndDrvPosModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uFcndDrvPosCounter != sharedCounter;
         localD51uFcndDrvPosCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_FCND_DRV_POS_LEN = 2;
	/**
	 * 	serialize this D51uFcndDrvPos
	 */
   protected void serializeD51uFcndDrvPos(char[] d51uFcndDrvPos) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uFcndDrvPos,0,getStringValue(),beginD51uFcndDrvPos,D_51U_FCND_DRV_POS_LEN);
       localD51uFcndDrvPosCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uFcndDrvPosConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshD51uFcndDrvPos is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uFcndDrvPos() {	 
   		return (substring(getStringValue(),beginD51uFcndDrvPos,beginD51uFcndDrvPos + D_51U_FCND_DRV_POS_LEN));
   	}
     int localD51uFcndDrvSvcCounter = -1;
     public boolean isD51uFcndDrvSvcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uFcndDrvSvcCounter != sharedCounter;
         localD51uFcndDrvSvcCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_FCND_DRV_SVC_LEN = 6;
	/**
	 * 	serialize this D51uFcndDrvSvc
	 */
   protected void serializeD51uFcndDrvSvc(char[] d51uFcndDrvSvc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uFcndDrvSvc,0,getStringValue(),beginD51uFcndDrvSvc,D_51U_FCND_DRV_SVC_LEN);
       localD51uFcndDrvSvcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uFcndDrvSvcConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshD51uFcndDrvSvc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uFcndDrvSvc() {	 
   		return (substring(getStringValue(),beginD51uFcndDrvSvc,beginD51uFcndDrvSvc + D_51U_FCND_DRV_SVC_LEN));
   	}
     int localD51uFcndDrvCauCounter = -1;
     public boolean isD51uFcndDrvCauModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uFcndDrvCauCounter != sharedCounter;
         localD51uFcndDrvCauCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_FCND_DRV_CAU_LEN = 1;
	/**
	 * 	serialize this D51uFcndDrvCau
	 */
   protected void serializeD51uFcndDrvCau(char[] d51uFcndDrvCau) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uFcndDrvCau,0,getStringValue(),beginD51uFcndDrvCau,D_51U_FCND_DRV_CAU_LEN);
       localD51uFcndDrvCauCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uFcndDrvCauConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshD51uFcndDrvCau is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uFcndDrvCau() {	 
   		return (substring(getStringValue(),beginD51uFcndDrvCau,beginD51uFcndDrvCau + D_51U_FCND_DRV_CAU_LEN));
   	}
     int localD51uFcndFromCondPosCounter = -1;
     public boolean isD51uFcndFromCondPosModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uFcndFromCondPosCounter != sharedCounter;
         localD51uFcndFromCondPosCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_FCND_FROM_COND_POS_LEN = 3;
	/**
	 * 	serialize this D51uFcndFromCondPos
	 */
   protected void serializeD51uFcndFromCondPos(char[] d51uFcndFromCondPos) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uFcndFromCondPos,0,getStringValue(),beginD51uFcndFromCondPos,D_51U_FCND_FROM_COND_POS_LEN);
       localD51uFcndFromCondPosCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uFcndFromCondPosConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshD51uFcndFromCondPos is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uFcndFromCondPos() {	 
   		return (substring(getStringValue(),beginD51uFcndFromCondPos,beginD51uFcndFromCondPos + D_51U_FCND_FROM_COND_POS_LEN));
   	}




}
  
