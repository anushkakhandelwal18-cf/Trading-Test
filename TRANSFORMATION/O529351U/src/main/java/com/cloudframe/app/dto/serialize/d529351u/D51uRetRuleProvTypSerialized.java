package com.cloudframe.app.dto.serialize.d529351u;

/**
*  The class D51uRetRuleProvTypSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class D51uRetRuleProvTypSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(D51uRetRuleProvTypSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int D_51U_RET_RULE_PROV_TYP_LENGTH = 11;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginD51uPtypDrvPos;
            protected  int beginD51uPtypDrvSvc;
            protected  int beginD51uPtypDrvCau;
            protected  int beginD51uPtypProvTyp;
	
	/**
	* Constructor for D51uRetRuleProvTypSerialized
	**/
    public D51uRetRuleProvTypSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for D51uRetRuleProvTypSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uRetRuleProvTypSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this D51uRetRuleProvTypSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,631971); // serialize this field at offset 631971 by default 
    }
    
	/**
	* sets parent for this D51uRetRuleProvTypSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 631971 by default
    }    
	/**
	* initializes the field in D51uRetRuleProvTypSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(D_51U_RET_RULE_PROV_TYP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginD51uPtypDrvPos = getStartOffset() + 0;	// set offset for serialization
  
             beginD51uPtypDrvSvc = getStartOffset() + 2;	// set offset for serialization
  
             beginD51uPtypDrvCau = getStartOffset() + 8;	// set offset for serialization
  
             beginD51uPtypProvTyp = getStartOffset() + 9;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localD51uPtypDrvPosCounter = -1;
     public boolean isD51uPtypDrvPosModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uPtypDrvPosCounter != sharedCounter;
         localD51uPtypDrvPosCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_PTYP_DRV_POS_LEN = 2;
	/**
	 * 	serialize this D51uPtypDrvPos
	 */
   protected void serializeD51uPtypDrvPos(char[] d51uPtypDrvPos) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uPtypDrvPos,0,getStringValue(),beginD51uPtypDrvPos,D_51U_PTYP_DRV_POS_LEN);
       localD51uPtypDrvPosCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uPtypDrvPosConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshD51uPtypDrvPos is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uPtypDrvPos() {	 
   		return (substring(getStringValue(),beginD51uPtypDrvPos,beginD51uPtypDrvPos + D_51U_PTYP_DRV_POS_LEN));
   	}
     int localD51uPtypDrvSvcCounter = -1;
     public boolean isD51uPtypDrvSvcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uPtypDrvSvcCounter != sharedCounter;
         localD51uPtypDrvSvcCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_PTYP_DRV_SVC_LEN = 6;
	/**
	 * 	serialize this D51uPtypDrvSvc
	 */
   protected void serializeD51uPtypDrvSvc(char[] d51uPtypDrvSvc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uPtypDrvSvc,0,getStringValue(),beginD51uPtypDrvSvc,D_51U_PTYP_DRV_SVC_LEN);
       localD51uPtypDrvSvcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uPtypDrvSvcConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshD51uPtypDrvSvc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uPtypDrvSvc() {	 
   		return (substring(getStringValue(),beginD51uPtypDrvSvc,beginD51uPtypDrvSvc + D_51U_PTYP_DRV_SVC_LEN));
   	}
     int localD51uPtypDrvCauCounter = -1;
     public boolean isD51uPtypDrvCauModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uPtypDrvCauCounter != sharedCounter;
         localD51uPtypDrvCauCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_PTYP_DRV_CAU_LEN = 1;
	/**
	 * 	serialize this D51uPtypDrvCau
	 */
   protected void serializeD51uPtypDrvCau(char[] d51uPtypDrvCau) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uPtypDrvCau,0,getStringValue(),beginD51uPtypDrvCau,D_51U_PTYP_DRV_CAU_LEN);
       localD51uPtypDrvCauCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uPtypDrvCauConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshD51uPtypDrvCau is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uPtypDrvCau() {	 
   		return (substring(getStringValue(),beginD51uPtypDrvCau,beginD51uPtypDrvCau + D_51U_PTYP_DRV_CAU_LEN));
   	}
     int localD51uPtypProvTypCounter = -1;
     public boolean isD51uPtypProvTypModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uPtypProvTypCounter != sharedCounter;
         localD51uPtypProvTypCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_PTYP_PROV_TYP_LEN = 2;
	/**
	 * 	serialize this D51uPtypProvTyp
	 */
   protected void serializeD51uPtypProvTyp(char[] d51uPtypProvTyp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uPtypProvTyp,0,getStringValue(),beginD51uPtypProvTyp,D_51U_PTYP_PROV_TYP_LEN);
       localD51uPtypProvTypCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uPtypProvTypConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshD51uPtypProvTyp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uPtypProvTyp() {	 
   		return (substring(getStringValue(),beginD51uPtypProvTyp,beginD51uPtypProvTyp + D_51U_PTYP_PROV_TYP_LEN));
   	}




}
  
