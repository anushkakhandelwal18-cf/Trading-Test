package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class PrevMatchedKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class PrevMatchedKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(PrevMatchedKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PREV_MATCHED_KEY_LENGTH = 9;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPrevPs;
            protected  int beginPrevSvc;
            protected  int beginPrevCauseCd;
	
	/**
	* Constructor for PrevMatchedKeySerialized
	**/
    public PrevMatchedKeySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for PrevMatchedKeySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PrevMatchedKeySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this PrevMatchedKeySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,200009); // serialize this field at offset 200009 by default 
    }
    
	/**
	* sets parent for this PrevMatchedKeySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 200009 by default
    }    
	/**
	* initializes the field in PrevMatchedKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PREV_MATCHED_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPrevPs = getStartOffset() + 0;	// set offset for serialization
  
             beginPrevSvc = getStartOffset() + 2;	// set offset for serialization
  
             beginPrevCauseCd = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localPrevPsCounter = -1;
     public boolean isPrevPsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrevPsCounter != sharedCounter;
         localPrevPsCounter = sharedCounter; return hasModified;
     }
	protected static final int PREV_PS_LEN = 2;
	/**
	 * 	serialize this PrevPs
	 */
   protected void serializePrevPs(char[] prevPs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(prevPs,0,getStringValue(),beginPrevPs,PREV_PS_LEN);
       localPrevPsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPrevPsConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshPrevPs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPrevPs() {	 
   		return (substring(getStringValue(),beginPrevPs,beginPrevPs + PREV_PS_LEN));
   	}
     int localPrevSvcCounter = -1;
     public boolean isPrevSvcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrevSvcCounter != sharedCounter;
         localPrevSvcCounter = sharedCounter; return hasModified;
     }
	protected static final int PREV_SVC_LEN = 6;
	/**
	 * 	serialize this PrevSvc
	 */
   protected void serializePrevSvc(char[] prevSvc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(prevSvc,0,getStringValue(),beginPrevSvc,PREV_SVC_LEN);
       localPrevSvcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPrevSvcConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshPrevSvc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPrevSvc() {	 
   		return (substring(getStringValue(),beginPrevSvc,beginPrevSvc + PREV_SVC_LEN));
   	}
     int localPrevCauseCdCounter = -1;
     public boolean isPrevCauseCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrevCauseCdCounter != sharedCounter;
         localPrevCauseCdCounter = sharedCounter; return hasModified;
     }
	protected static final int PREV_CAUSE_CD_LEN = 1;
	/**
	 * 	serialize this PrevCauseCd
	 */
   protected void serializePrevCauseCd(char[] prevCauseCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(prevCauseCd,0,getStringValue(),beginPrevCauseCd,PREV_CAUSE_CD_LEN);
       localPrevCauseCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPrevCauseCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshPrevCauseCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPrevCauseCd() {	 
   		return (substring(getStringValue(),beginPrevCauseCd,beginPrevCauseCd + PREV_CAUSE_CD_LEN));
   	}




}
  
