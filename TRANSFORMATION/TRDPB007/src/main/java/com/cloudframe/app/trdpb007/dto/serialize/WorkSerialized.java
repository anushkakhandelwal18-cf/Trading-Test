package com.cloudframe.app.trdpb007.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-11-21 at 09:21. using version 5.0.0.153
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 20;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCompcodeEdit;
            protected  int beginReasonEdit;
	
	/**
	* Constructor for WorkSerialized
	**/
    public WorkSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WorkSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WORK_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
  
  
             beginCompcodeEdit = getStartOffset() + 0;	// set offset for serialization
  
             beginReasonEdit = getStartOffset() + 10;	// set offset for serialization
  
  
  
  
  
  
  
  
  
	   /*  end of offset */
	}
     int localMqmCounter = -1;
     public boolean isMqmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMqmCounter != sharedCounter;
         localMqmCounter = sharedCounter; return hasModified;
     }

   protected char[] checkMqmConstraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }
         int localHconnCounter = -1;
         public boolean isHconnModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localHconnCounter != sharedCounter;
            localHconnCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkHconnMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localCompcodeCounter = -1;
         public boolean isCompcodeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCompcodeCounter != sharedCounter;
            localCompcodeCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkCompcodeMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localReasonCounter = -1;
         public boolean isReasonModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localReasonCounter != sharedCounter;
            localReasonCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkReasonMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localBufflenCounter = -1;
         public boolean isBufflenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localBufflenCounter != sharedCounter;
            localBufflenCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkBufflenMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localTradingParmsCounter = -1;
     public boolean isTradingParmsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTradingParmsCounter != sharedCounter;
         localTradingParmsCounter = sharedCounter; return hasModified;
     }

   protected char[] checkTradingParmsConstraints(char[] value) {
   			return super.checkConstraints(value , 29 ,false, false);
   }
     int localCompcodeEditCounter = -1;
     public boolean isCompcodeEditModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCompcodeEditCounter != sharedCounter;
         localCompcodeEditCounter = sharedCounter; return hasModified;
     }
	protected static final int COMPCODE_EDIT_LEN = 10;
	/**
	 * 	serialize this CompcodeEdit
	 */
   protected void serializeCompcodeEdit(char[] compcodeEdit) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(compcodeEdit,0,getStringValue(),beginCompcodeEdit,COMPCODE_EDIT_LEN);
       localCompcodeEditCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCompcodeEditConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshCompcodeEdit is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCompcodeEdit() {	 
   		return (substring(getStringValue(),beginCompcodeEdit,beginCompcodeEdit + COMPCODE_EDIT_LEN));
   	}
     int localReasonEditCounter = -1;
     public boolean isReasonEditModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localReasonEditCounter != sharedCounter;
         localReasonEditCounter = sharedCounter; return hasModified;
     }
	protected static final int REASON_EDIT_LEN = 10;
	/**
	 * 	serialize this ReasonEdit
	 */
   protected void serializeReasonEdit(char[] reasonEdit) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(reasonEdit,0,getStringValue(),beginReasonEdit,REASON_EDIT_LEN);
       localReasonEditCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkReasonEditConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshReasonEdit is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshReasonEdit() {	 
   		return (substring(getStringValue(),beginReasonEdit,beginReasonEdit + REASON_EDIT_LEN));
   	}
         int localMqmtDatagramCounter = -1;
         public boolean isMqmtDatagramModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqmtDatagramCounter != sharedCounter;
            localMqmtDatagramCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkMqmtDatagramMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localMqperNotPersistentCounter = -1;
         public boolean isMqperNotPersistentModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqperNotPersistentCounter != sharedCounter;
            localMqperNotPersistentCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkMqperNotPersistentMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localMqmiNoneCounter = -1;
     public boolean isMqmiNoneModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMqmiNoneCounter != sharedCounter;
         localMqmiNoneCounter = sharedCounter; return hasModified;
     }

   protected char[] checkMqmiNoneConstraints(char[] value) {
   			return super.checkConstraints(value , 24 ,false, false);
   }
     int localMqciNoneCounter = -1;
     public boolean isMqciNoneModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMqciNoneCounter != sharedCounter;
         localMqciNoneCounter = sharedCounter; return hasModified;
     }

   protected char[] checkMqciNoneConstraints(char[] value) {
   			return super.checkConstraints(value , 24 ,false, false);
   }
         int localMqotQCounter = -1;
         public boolean isMqotQModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqotQCounter != sharedCounter;
            localMqotQCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkMqotQMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localMqpmoNoSyncpointCounter = -1;
         public boolean isMqpmoNoSyncpointModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqpmoNoSyncpointCounter != sharedCounter;
            localMqpmoNoSyncpointCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkMqpmoNoSyncpointMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localMqpmoDefaultContextCounter = -1;
         public boolean isMqpmoDefaultContextModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqpmoDefaultContextCounter != sharedCounter;
            localMqpmoDefaultContextCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkMqpmoDefaultContextMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localMqccOkCounter = -1;
         public boolean isMqccOkModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqccOkCounter != sharedCounter;
            localMqccOkCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkMqccOkMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }




}
  
