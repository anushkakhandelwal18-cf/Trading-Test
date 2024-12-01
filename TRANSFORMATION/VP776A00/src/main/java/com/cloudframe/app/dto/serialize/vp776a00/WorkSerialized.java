package com.cloudframe.app.dto.serialize.vp776a00;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 0;
   /*  offset of each of Child Fields when serialized as a String */
	
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
  
  
  
  
  
  
	   /*  end of offset */
	}
         int localPwaSortGapCounter = -1;
         public boolean isPwaSortGapModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localPwaSortGapCounter != sharedCounter;
            localPwaSortGapCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkPwaSortGapMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localPwaLimitCounter = -1;
         public boolean isPwaLimitModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localPwaLimitCounter != sharedCounter;
            localPwaLimitCounter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkPwaLimitMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localPwaSub1Counter = -1;
         public boolean isPwaSub1Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localPwaSub1Counter != sharedCounter;
            localPwaSub1Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkPwaSub1MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localPwaSub2Counter = -1;
         public boolean isPwaSub2Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localPwaSub2Counter != sharedCounter;
            localPwaSub2Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkPwaSub2MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localPwaSwapEntryCounter = -1;
     public boolean isPwaSwapEntryModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPwaSwapEntryCounter != sharedCounter;
         localPwaSwapEntryCounter = sharedCounter; return hasModified;
     }

   protected char[] checkPwaSwapEntryConstraints(char[] value) {
   			return super.checkConstraints(value , 32767 ,false, false);
   }
     int localPwaSortSwitchCounter = -1;
     public boolean isPwaSortSwitchModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPwaSortSwitchCounter != sharedCounter;
         localPwaSortSwitchCounter = sharedCounter; return hasModified;
     }

   protected char[] checkPwaSortSwitchConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }




}
  
