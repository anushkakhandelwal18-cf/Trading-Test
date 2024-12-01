package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class Ioi02bInterfaceSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ioi02bInterfaceSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ioi02bInterfaceSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IOI_02B_INTERFACE_LENGTH = 470;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIoi02bPassedRecAddr;
            protected  int beginIoi02bPassedRecPtr;
            protected  int beginIoi02bError;
	
	/**
	* Constructor for Ioi02bInterfaceSerialized
	**/
    public Ioi02bInterfaceSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ioi02bInterfaceSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IOI_02B_INTERFACE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIoi02bPassedRecAddr = getStartOffset() + 20;	// set offset for serialization
  
             beginIoi02bPassedRecPtr = getStartOffset() + 20;	// set offset for serialization
  
  
             beginIoi02bError = getStartOffset() + 314;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIoi02bPassedRecAddrCounter = -1;
         public boolean isIoi02bPassedRecAddrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIoi02bPassedRecAddrCounter != sharedCounter;
            localIoi02bPassedRecAddrCounter = sharedCounter; return hasModified; 
         }
   protected static final int IOI_02B_PASSED_REC_ADDR_LEN = 4;
  	/**
	 * serializeIoi02bPassedRecAddr
	 */
	protected void serializeIoi02bPassedRecAddr(int ioi02bPassedRecAddr) {
           replaceValue( //  save the value as string
                   getBinaryString( ioi02bPassedRecAddr,IOI_02B_PASSED_REC_ADDR_LEN)
                  ,beginIoi02bPassedRecAddr
                  ,IOI_02B_PASSED_REC_ADDR_LEN
                 );
            localIoi02bPassedRecAddrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIoi02bPassedRecAddrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIoi02bPassedRecAddr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIoi02bPassedRecAddr() {	 
			return (getInt(beginIoi02bPassedRecAddr));
   	}
     int localIoi02bPassedRecPtrCounter = -1;
     public boolean isIoi02bPassedRecPtrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIoi02bPassedRecPtrCounter != sharedCounter;
         localIoi02bPassedRecPtrCounter = sharedCounter; return hasModified; 
     }
   protected static final int IOI_02B_PASSED_REC_PTR_LEN = 4;
  	/**
	 * serializeIoi02bPassedRecPtr
	 */
	protected void serializeIoi02bPassedRecPtr(int ioi02bPassedRecPtr) {
           replaceValue( //  save the value as string
                   getBinaryString( ioi02bPassedRecPtr,IOI_02B_PASSED_REC_PTR_LEN)
                  ,beginIoi02bPassedRecPtr
                  ,IOI_02B_PASSED_REC_PTR_LEN
                 );
            localIoi02bPassedRecPtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIoi02bPassedRecPtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIoi02bPassedRecPtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIoi02bPassedRecPtr() {	 
			return (getInt(beginIoi02bPassedRecPtr));
   	}
     int localIoi02bErrorCounter = -1;
     public boolean isIoi02bErrorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIoi02bErrorCounter != sharedCounter;
         localIoi02bErrorCounter = sharedCounter; return hasModified;
     }
	protected static final int IOI_02B_ERROR_LEN = 1;
	/**
	 * 	serialize this Ioi02bError
	 */
   protected void serializeIoi02bError(char[] ioi02bError) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ioi02bError,0,getStringValue(),beginIoi02bError,IOI_02B_ERROR_LEN);
       localIoi02bErrorCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIoi02bErrorConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIoi02bError is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIoi02bError() {	 
   		return (substring(getStringValue(),beginIoi02bError,beginIoi02bError + IOI_02B_ERROR_LEN));
   	}




}
  
