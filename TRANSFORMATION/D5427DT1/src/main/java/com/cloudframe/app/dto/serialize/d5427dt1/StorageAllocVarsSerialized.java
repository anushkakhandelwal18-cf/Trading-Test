package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class StorageAllocVarsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class StorageAllocVarsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(StorageAllocVarsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int STORAGE_ALLOC_VARS_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginStorageSizeRequired;
            protected  int beginStorageAreaPtr;
	
	/**
	* Constructor for StorageAllocVarsSerialized
	**/
    public StorageAllocVarsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for StorageAllocVarsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public StorageAllocVarsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this StorageAllocVarsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,222); // serialize this field at offset 222 by default 
    }
    
	/**
	* sets parent for this StorageAllocVarsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 222 by default
    }    
	/**
	* initializes the field in StorageAllocVarsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(STORAGE_ALLOC_VARS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginStorageSizeRequired = getStartOffset() + 0;	// set offset for serialization
  
             beginStorageAreaPtr = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localStorageSizeRequiredCounter = -1;
         public boolean isStorageSizeRequiredModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localStorageSizeRequiredCounter != sharedCounter;
            localStorageSizeRequiredCounter = sharedCounter; return hasModified; 
         }
   protected static final int STORAGE_SIZE_REQUIRED_LEN = 4;
  	/**
	 * serializeStorageSizeRequired
	 */
	protected void serializeStorageSizeRequired(int storageSizeRequired) {
           replaceValue( //  save the value as string
                   getBinaryString( storageSizeRequired,STORAGE_SIZE_REQUIRED_LEN)
                  ,beginStorageSizeRequired
                  ,STORAGE_SIZE_REQUIRED_LEN
                 );
            localStorageSizeRequiredCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkStorageSizeRequiredMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshStorageSizeRequired is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshStorageSizeRequired() {	 
			return (getInt(beginStorageSizeRequired));
   	}
     int localStorageAreaPtrCounter = -1;
     public boolean isStorageAreaPtrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStorageAreaPtrCounter != sharedCounter;
         localStorageAreaPtrCounter = sharedCounter; return hasModified; 
     }
   protected static final int STORAGE_AREA_PTR_LEN = 4;
  	/**
	 * serializeStorageAreaPtr
	 */
	protected void serializeStorageAreaPtr(int storageAreaPtr) {
           replaceValue( //  save the value as string
                   getBinaryString( storageAreaPtr,STORAGE_AREA_PTR_LEN)
                  ,beginStorageAreaPtr
                  ,STORAGE_AREA_PTR_LEN
                 );
            localStorageAreaPtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkStorageAreaPtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshStorageAreaPtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshStorageAreaPtr() {	 
			return (getInt(beginStorageAreaPtr));
   	}




}
  
