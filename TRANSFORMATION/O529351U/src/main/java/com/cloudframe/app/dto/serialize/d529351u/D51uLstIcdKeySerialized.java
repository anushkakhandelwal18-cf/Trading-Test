package com.cloudframe.app.dto.serialize.d529351u;

/**
*  The class D51uLstIcdKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class D51uLstIcdKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(D51uLstIcdKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int D_51U_LST_ICD_KEY_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginD51uLstClmIcdInd;
            protected  int beginD51uLstClmIcdPos;
            protected  int beginD51uLstClmIcdSvc;
            protected  int beginD51uLstClmIcdCau;
	
	/**
	* Constructor for D51uLstIcdKeySerialized
	**/
    public D51uLstIcdKeySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for D51uLstIcdKeySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uLstIcdKeySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this D51uLstIcdKeySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,62); // serialize this field at offset 62 by default 
    }
    
	/**
	* sets parent for this D51uLstIcdKeySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 62 by default
    }    
	/**
	* initializes the field in D51uLstIcdKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(D_51U_LST_ICD_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginD51uLstClmIcdInd = getStartOffset() + 0;	// set offset for serialization
  
             beginD51uLstClmIcdPos = getStartOffset() + 1;	// set offset for serialization
  
             beginD51uLstClmIcdSvc = getStartOffset() + 3;	// set offset for serialization
  
             beginD51uLstClmIcdCau = getStartOffset() + 9;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localD51uLstClmIcdIndCounter = -1;
     public boolean isD51uLstClmIcdIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uLstClmIcdIndCounter != sharedCounter;
         localD51uLstClmIcdIndCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_LST_CLM_ICD_IND_LEN = 1;
	/**
	 * 	serialize this D51uLstClmIcdInd
	 */
   protected void serializeD51uLstClmIcdInd(char[] d51uLstClmIcdInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uLstClmIcdInd,0,getStringValue(),beginD51uLstClmIcdInd,D_51U_LST_CLM_ICD_IND_LEN);
       localD51uLstClmIcdIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uLstClmIcdIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshD51uLstClmIcdInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uLstClmIcdInd() {	 
   		return (substring(getStringValue(),beginD51uLstClmIcdInd,beginD51uLstClmIcdInd + D_51U_LST_CLM_ICD_IND_LEN));
   	}
     int localD51uLstClmIcdPosCounter = -1;
     public boolean isD51uLstClmIcdPosModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uLstClmIcdPosCounter != sharedCounter;
         localD51uLstClmIcdPosCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_LST_CLM_ICD_POS_LEN = 2;
	/**
	 * 	serialize this D51uLstClmIcdPos
	 */
   protected void serializeD51uLstClmIcdPos(char[] d51uLstClmIcdPos) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uLstClmIcdPos,0,getStringValue(),beginD51uLstClmIcdPos,D_51U_LST_CLM_ICD_POS_LEN);
       localD51uLstClmIcdPosCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uLstClmIcdPosConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshD51uLstClmIcdPos is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uLstClmIcdPos() {	 
   		return (substring(getStringValue(),beginD51uLstClmIcdPos,beginD51uLstClmIcdPos + D_51U_LST_CLM_ICD_POS_LEN));
   	}
     int localD51uLstClmIcdSvcCounter = -1;
     public boolean isD51uLstClmIcdSvcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uLstClmIcdSvcCounter != sharedCounter;
         localD51uLstClmIcdSvcCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_LST_CLM_ICD_SVC_LEN = 6;
	/**
	 * 	serialize this D51uLstClmIcdSvc
	 */
   protected void serializeD51uLstClmIcdSvc(char[] d51uLstClmIcdSvc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uLstClmIcdSvc,0,getStringValue(),beginD51uLstClmIcdSvc,D_51U_LST_CLM_ICD_SVC_LEN);
       localD51uLstClmIcdSvcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uLstClmIcdSvcConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshD51uLstClmIcdSvc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uLstClmIcdSvc() {	 
   		return (substring(getStringValue(),beginD51uLstClmIcdSvc,beginD51uLstClmIcdSvc + D_51U_LST_CLM_ICD_SVC_LEN));
   	}
     int localD51uLstClmIcdCauCounter = -1;
     public boolean isD51uLstClmIcdCauModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uLstClmIcdCauCounter != sharedCounter;
         localD51uLstClmIcdCauCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_LST_CLM_ICD_CAU_LEN = 1;
	/**
	 * 	serialize this D51uLstClmIcdCau
	 */
   protected void serializeD51uLstClmIcdCau(char[] d51uLstClmIcdCau) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uLstClmIcdCau,0,getStringValue(),beginD51uLstClmIcdCau,D_51U_LST_CLM_ICD_CAU_LEN);
       localD51uLstClmIcdCauCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uLstClmIcdCauConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshD51uLstClmIcdCau is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uLstClmIcdCau() {	 
   		return (substring(getStringValue(),beginD51uLstClmIcdCau,beginD51uLstClmIcdCau + D_51U_LST_CLM_ICD_CAU_LEN));
   	}




}
  
