package com.cloudframe.app.dto.serialize.d529351u;

/**
*  The class LstIcdKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:50. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class LstIcdKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(LstIcdKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int LST_ICD_KEY_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginLstClmIcdInd;
            protected  int beginLstClmIcdPos;
            protected  int beginLstClmIcdSvc;
            protected  int beginLstClmIcdCau;
	
	/**
	* Constructor for LstIcdKeySerialized
	**/
    public LstIcdKeySerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in LstIcdKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(LST_ICD_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginLstClmIcdInd = getStartOffset() + 0;	// set offset for serialization
  
             beginLstClmIcdPos = getStartOffset() + 1;	// set offset for serialization
  
             beginLstClmIcdSvc = getStartOffset() + 3;	// set offset for serialization
  
             beginLstClmIcdCau = getStartOffset() + 9;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localLstClmIcdIndCounter = -1;
     public boolean isLstClmIcdIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLstClmIcdIndCounter != sharedCounter;
         localLstClmIcdIndCounter = sharedCounter; return hasModified;
     }
	protected static final int LST_CLM_ICD_IND_LEN = 1;
	/**
	 * 	serialize this LstClmIcdInd
	 */
   protected void serializeLstClmIcdInd(char[] lstClmIcdInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lstClmIcdInd,0,getStringValue(),beginLstClmIcdInd,LST_CLM_ICD_IND_LEN);
       localLstClmIcdIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLstClmIcdIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshLstClmIcdInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLstClmIcdInd() {	 
   		return (substring(getStringValue(),beginLstClmIcdInd,beginLstClmIcdInd + LST_CLM_ICD_IND_LEN));
   	}
     int localLstClmIcdPosCounter = -1;
     public boolean isLstClmIcdPosModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLstClmIcdPosCounter != sharedCounter;
         localLstClmIcdPosCounter = sharedCounter; return hasModified;
     }
	protected static final int LST_CLM_ICD_POS_LEN = 2;
	/**
	 * 	serialize this LstClmIcdPos
	 */
   protected void serializeLstClmIcdPos(char[] lstClmIcdPos) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lstClmIcdPos,0,getStringValue(),beginLstClmIcdPos,LST_CLM_ICD_POS_LEN);
       localLstClmIcdPosCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLstClmIcdPosConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshLstClmIcdPos is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLstClmIcdPos() {	 
   		return (substring(getStringValue(),beginLstClmIcdPos,beginLstClmIcdPos + LST_CLM_ICD_POS_LEN));
   	}
     int localLstClmIcdSvcCounter = -1;
     public boolean isLstClmIcdSvcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLstClmIcdSvcCounter != sharedCounter;
         localLstClmIcdSvcCounter = sharedCounter; return hasModified;
     }
	protected static final int LST_CLM_ICD_SVC_LEN = 6;
	/**
	 * 	serialize this LstClmIcdSvc
	 */
   protected void serializeLstClmIcdSvc(char[] lstClmIcdSvc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lstClmIcdSvc,0,getStringValue(),beginLstClmIcdSvc,LST_CLM_ICD_SVC_LEN);
       localLstClmIcdSvcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLstClmIcdSvcConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshLstClmIcdSvc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLstClmIcdSvc() {	 
   		return (substring(getStringValue(),beginLstClmIcdSvc,beginLstClmIcdSvc + LST_CLM_ICD_SVC_LEN));
   	}
     int localLstClmIcdCauCounter = -1;
     public boolean isLstClmIcdCauModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLstClmIcdCauCounter != sharedCounter;
         localLstClmIcdCauCounter = sharedCounter; return hasModified;
     }
	protected static final int LST_CLM_ICD_CAU_LEN = 1;
	/**
	 * 	serialize this LstClmIcdCau
	 */
   protected void serializeLstClmIcdCau(char[] lstClmIcdCau) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lstClmIcdCau,0,getStringValue(),beginLstClmIcdCau,LST_CLM_ICD_CAU_LEN);
       localLstClmIcdCauCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLstClmIcdCauConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshLstClmIcdCau is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLstClmIcdCau() {	 
   		return (substring(getStringValue(),beginLstClmIcdCau,beginLstClmIcdCau + LST_CLM_ICD_CAU_LEN));
   	}




}
  
