package com.cloudframe.app.dto.serialize.d529351u;

/**
*  The class D51uRetRulCpeFlgSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:50. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class D51uRetRulCpeFlgSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(D51uRetRulCpeFlgSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int D_51U_RET_RUL_CPE_FLG_LENGTH = 13;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginD51uCflgDrvPos;
            protected  int beginD51uCflgDrvSvc;
            protected  int beginD51uCflgDrvCau;
            protected  int beginD51uCflgCpeDescCd;
	
	/**
	* Constructor for D51uRetRulCpeFlgSerialized
	**/
    public D51uRetRulCpeFlgSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for D51uRetRulCpeFlgSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uRetRulCpeFlgSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this D51uRetRulCpeFlgSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,879570); // serialize this field at offset 879570 by default 
    }
    
	/**
	* sets parent for this D51uRetRulCpeFlgSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 879570 by default
    }    
	/**
	* initializes the field in D51uRetRulCpeFlgSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(D_51U_RET_RUL_CPE_FLG_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginD51uCflgDrvPos = getStartOffset() + 0;	// set offset for serialization
  
             beginD51uCflgDrvSvc = getStartOffset() + 2;	// set offset for serialization
  
             beginD51uCflgDrvCau = getStartOffset() + 8;	// set offset for serialization
  
             beginD51uCflgCpeDescCd = getStartOffset() + 9;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localD51uCflgDrvPosCounter = -1;
     public boolean isD51uCflgDrvPosModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uCflgDrvPosCounter != sharedCounter;
         localD51uCflgDrvPosCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_CFLG_DRV_POS_LEN = 2;
	/**
	 * 	serialize this D51uCflgDrvPos
	 */
   protected void serializeD51uCflgDrvPos(char[] d51uCflgDrvPos) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uCflgDrvPos,0,getStringValue(),beginD51uCflgDrvPos,D_51U_CFLG_DRV_POS_LEN);
       localD51uCflgDrvPosCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uCflgDrvPosConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshD51uCflgDrvPos is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uCflgDrvPos() {	 
   		return (substring(getStringValue(),beginD51uCflgDrvPos,beginD51uCflgDrvPos + D_51U_CFLG_DRV_POS_LEN));
   	}
     int localD51uCflgDrvSvcCounter = -1;
     public boolean isD51uCflgDrvSvcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uCflgDrvSvcCounter != sharedCounter;
         localD51uCflgDrvSvcCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_CFLG_DRV_SVC_LEN = 6;
	/**
	 * 	serialize this D51uCflgDrvSvc
	 */
   protected void serializeD51uCflgDrvSvc(char[] d51uCflgDrvSvc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uCflgDrvSvc,0,getStringValue(),beginD51uCflgDrvSvc,D_51U_CFLG_DRV_SVC_LEN);
       localD51uCflgDrvSvcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uCflgDrvSvcConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshD51uCflgDrvSvc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uCflgDrvSvc() {	 
   		return (substring(getStringValue(),beginD51uCflgDrvSvc,beginD51uCflgDrvSvc + D_51U_CFLG_DRV_SVC_LEN));
   	}
     int localD51uCflgDrvCauCounter = -1;
     public boolean isD51uCflgDrvCauModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uCflgDrvCauCounter != sharedCounter;
         localD51uCflgDrvCauCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_CFLG_DRV_CAU_LEN = 1;
	/**
	 * 	serialize this D51uCflgDrvCau
	 */
   protected void serializeD51uCflgDrvCau(char[] d51uCflgDrvCau) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uCflgDrvCau,0,getStringValue(),beginD51uCflgDrvCau,D_51U_CFLG_DRV_CAU_LEN);
       localD51uCflgDrvCauCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uCflgDrvCauConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshD51uCflgDrvCau is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uCflgDrvCau() {	 
   		return (substring(getStringValue(),beginD51uCflgDrvCau,beginD51uCflgDrvCau + D_51U_CFLG_DRV_CAU_LEN));
   	}
     int localD51uCflgCpeDescCdCounter = -1;
     public boolean isD51uCflgCpeDescCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uCflgCpeDescCdCounter != sharedCounter;
         localD51uCflgCpeDescCdCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_CFLG_CPE_DESC_CD_LEN = 4;
	/**
	 * 	serialize this D51uCflgCpeDescCd
	 */
   protected void serializeD51uCflgCpeDescCd(char[] d51uCflgCpeDescCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uCflgCpeDescCd,0,getStringValue(),beginD51uCflgCpeDescCd,D_51U_CFLG_CPE_DESC_CD_LEN);
       localD51uCflgCpeDescCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uCflgCpeDescCdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshD51uCflgCpeDescCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uCflgCpeDescCd() {	 
   		return (substring(getStringValue(),beginD51uCflgCpeDescCd,beginD51uCflgCpeDescCd + D_51U_CFLG_CPE_DESC_CD_LEN));
   	}




}
  
