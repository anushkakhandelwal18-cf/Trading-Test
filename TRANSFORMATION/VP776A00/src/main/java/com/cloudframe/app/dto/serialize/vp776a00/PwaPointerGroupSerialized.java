package com.cloudframe.app.dto.serialize.vp776a00;

/**
*  The class PwaPointerGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class PwaPointerGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(PwaPointerGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PWA_POINTER_GROUP_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPwaPointer;
            protected  int beginPwaAddress;
	
	/**
	* Constructor for PwaPointerGroupSerialized
	**/
    public PwaPointerGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in PwaPointerGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PWA_POINTER_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPwaPointer = getStartOffset() + 0;	// set offset for serialization
  
             beginPwaAddress = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localPwaPointerCounter = -1;
     public boolean isPwaPointerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPwaPointerCounter != sharedCounter;
         localPwaPointerCounter = sharedCounter; return hasModified; 
     }
   protected static final int PWA_POINTER_LEN = 4;
  	/**
	 * serializePwaPointer
	 */
	protected void serializePwaPointer(int pwaPointer) {
           replaceValue( //  save the value as string
                   getBinaryString( pwaPointer,PWA_POINTER_LEN)
                  ,beginPwaPointer
                  ,PWA_POINTER_LEN
                 );
            localPwaPointerCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkPwaPointerMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshPwaPointer is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPwaPointer() {	 
			return (getInt(beginPwaPointer));
   	}
         int localPwaAddressCounter = -1;
         public boolean isPwaAddressModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localPwaAddressCounter != sharedCounter;
            localPwaAddressCounter = sharedCounter; return hasModified; 
         }
   protected static final int PWA_ADDRESS_LEN = 4;
  	/**
	 * serializePwaAddress
	 */
	protected void serializePwaAddress(int pwaAddress) {
           replaceValue( //  save the value as string
                   getBinaryString( pwaAddress,PWA_ADDRESS_LEN)
                  ,beginPwaAddress
                  ,PWA_ADDRESS_LEN
                 );
            localPwaAddressCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkPwaAddressMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshPwaAddress is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPwaAddress() {	 
			return (getInt(beginPwaAddress));
   	}




}
  
