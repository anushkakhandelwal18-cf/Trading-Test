package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class Dt1ClmClaimStatusSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Dt1ClmClaimStatusSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Dt1ClmClaimStatusSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_1_CLM_CLAIM_STATUS_LENGTH = 5;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDt1ClmUnprocFlag;
            protected  int beginDt1ClmClosedFlag;
            protected  int beginDt1ClmPendedFlag;
            protected  int beginDt1ClmRejectedFlag;
            protected  int beginDt1ClmPaidFlag;
	
	/**
	* Constructor for Dt1ClmClaimStatusSerialized
	**/
    public Dt1ClmClaimStatusSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Dt1ClmClaimStatusSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dt1ClmClaimStatusSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Dt1ClmClaimStatusSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,184); // serialize this field at offset 184 by default 
    }
    
	/**
	* sets parent for this Dt1ClmClaimStatusSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 184 by default
    }    
	/**
	* initializes the field in Dt1ClmClaimStatusSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_1_CLM_CLAIM_STATUS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDt1ClmUnprocFlag = getStartOffset() + 0;	// set offset for serialization
  
             beginDt1ClmClosedFlag = getStartOffset() + 1;	// set offset for serialization
  
             beginDt1ClmPendedFlag = getStartOffset() + 2;	// set offset for serialization
  
             beginDt1ClmRejectedFlag = getStartOffset() + 3;	// set offset for serialization
  
             beginDt1ClmPaidFlag = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDt1ClmUnprocFlagCounter = -1;
     public boolean isDt1ClmUnprocFlagModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmUnprocFlagCounter != sharedCounter;
         localDt1ClmUnprocFlagCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_CLM_UNPROC_FLAG_LEN = 1;
	/**
	 * 	serialize this Dt1ClmUnprocFlag
	 */
   protected void serializeDt1ClmUnprocFlag(char[] dt1ClmUnprocFlag) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ClmUnprocFlag,0,getStringValue(),beginDt1ClmUnprocFlag,DT_1_CLM_UNPROC_FLAG_LEN);
       localDt1ClmUnprocFlagCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ClmUnprocFlagConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt1ClmUnprocFlag is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ClmUnprocFlag() {	 
   		return (substring(getStringValue(),beginDt1ClmUnprocFlag,beginDt1ClmUnprocFlag + DT_1_CLM_UNPROC_FLAG_LEN));
   	}
     int localDt1ClmClosedFlagCounter = -1;
     public boolean isDt1ClmClosedFlagModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmClosedFlagCounter != sharedCounter;
         localDt1ClmClosedFlagCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_CLM_CLOSED_FLAG_LEN = 1;
	/**
	 * 	serialize this Dt1ClmClosedFlag
	 */
   protected void serializeDt1ClmClosedFlag(char[] dt1ClmClosedFlag) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ClmClosedFlag,0,getStringValue(),beginDt1ClmClosedFlag,DT_1_CLM_CLOSED_FLAG_LEN);
       localDt1ClmClosedFlagCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ClmClosedFlagConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt1ClmClosedFlag is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ClmClosedFlag() {	 
   		return (substring(getStringValue(),beginDt1ClmClosedFlag,beginDt1ClmClosedFlag + DT_1_CLM_CLOSED_FLAG_LEN));
   	}
     int localDt1ClmPendedFlagCounter = -1;
     public boolean isDt1ClmPendedFlagModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmPendedFlagCounter != sharedCounter;
         localDt1ClmPendedFlagCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_CLM_PENDED_FLAG_LEN = 1;
	/**
	 * 	serialize this Dt1ClmPendedFlag
	 */
   protected void serializeDt1ClmPendedFlag(char[] dt1ClmPendedFlag) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ClmPendedFlag,0,getStringValue(),beginDt1ClmPendedFlag,DT_1_CLM_PENDED_FLAG_LEN);
       localDt1ClmPendedFlagCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ClmPendedFlagConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt1ClmPendedFlag is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ClmPendedFlag() {	 
   		return (substring(getStringValue(),beginDt1ClmPendedFlag,beginDt1ClmPendedFlag + DT_1_CLM_PENDED_FLAG_LEN));
   	}
     int localDt1ClmRejectedFlagCounter = -1;
     public boolean isDt1ClmRejectedFlagModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmRejectedFlagCounter != sharedCounter;
         localDt1ClmRejectedFlagCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_CLM_REJECTED_FLAG_LEN = 1;
	/**
	 * 	serialize this Dt1ClmRejectedFlag
	 */
   protected void serializeDt1ClmRejectedFlag(char[] dt1ClmRejectedFlag) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ClmRejectedFlag,0,getStringValue(),beginDt1ClmRejectedFlag,DT_1_CLM_REJECTED_FLAG_LEN);
       localDt1ClmRejectedFlagCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ClmRejectedFlagConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt1ClmRejectedFlag is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ClmRejectedFlag() {	 
   		return (substring(getStringValue(),beginDt1ClmRejectedFlag,beginDt1ClmRejectedFlag + DT_1_CLM_REJECTED_FLAG_LEN));
   	}
     int localDt1ClmPaidFlagCounter = -1;
     public boolean isDt1ClmPaidFlagModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmPaidFlagCounter != sharedCounter;
         localDt1ClmPaidFlagCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_CLM_PAID_FLAG_LEN = 1;
	/**
	 * 	serialize this Dt1ClmPaidFlag
	 */
   protected void serializeDt1ClmPaidFlag(char[] dt1ClmPaidFlag) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ClmPaidFlag,0,getStringValue(),beginDt1ClmPaidFlag,DT_1_CLM_PAID_FLAG_LEN);
       localDt1ClmPaidFlagCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ClmPaidFlagConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt1ClmPaidFlag is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ClmPaidFlag() {	 
   		return (substring(getStringValue(),beginDt1ClmPaidFlag,beginDt1ClmPaidFlag + DT_1_CLM_PAID_FLAG_LEN));
   	}




}
  
