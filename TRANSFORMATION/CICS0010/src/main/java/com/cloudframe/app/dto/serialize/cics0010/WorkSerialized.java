package com.cloudframe.app.dto.serialize.cics0010;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-03 at 15:51. using version 5.0.0.163
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
         int localCicsrespCounter = -1;
         public boolean isCicsrespModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCicsrespCounter != sharedCounter;
            localCicsrespCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkCicsrespMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localCicsresp2Counter = -1;
         public boolean isCicsresp2Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCicsresp2Counter != sharedCounter;
            localCicsresp2Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkCicsresp2MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localRequestData002Counter = -1;
     public boolean isRequestData002Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRequestData002Counter != sharedCounter;
         localRequestData002Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRequestData002Constraints(char[] value) {
   			return super.checkConstraints(value , 100 ,false, false);
   }
     int localContainerNameCounter = -1;
     public boolean isContainerNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localContainerNameCounter != sharedCounter;
         localContainerNameCounter = sharedCounter; return hasModified;
     }

   protected char[] checkContainerNameConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
     int localChannelNameCounter = -1;
     public boolean isChannelNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChannelNameCounter != sharedCounter;
         localChannelNameCounter = sharedCounter; return hasModified;
     }

   protected char[] checkChannelNameConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
         int localContainerLengthCounter = -1;
         public boolean isContainerLengthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localContainerLengthCounter != sharedCounter;
            localContainerLengthCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkContainerLengthMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localLs003RequestDataCounter = -1;
     public boolean isLs003RequestDataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLs003RequestDataCounter != sharedCounter;
         localLs003RequestDataCounter = sharedCounter; return hasModified;
     }

   protected char[] checkLs003RequestDataConstraints(char[] value) {
   			return super.checkConstraints(value , 100 ,false, false);
   }




}
  
