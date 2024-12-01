package com.cloudframe.app.dto.d5427dt1;

/**
*  The class StorageAllocVars is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class StorageAllocVars extends StorageAllocVarsSerialized { 
   

								private int storageSizeRequired;

								private int storageAreaPtr;
	
	/**
	* Constructor for StorageAllocVars
	**/
    public StorageAllocVars() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for StorageAllocVars. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public StorageAllocVars(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setStorageSizeRequired(0);
    } 

	/**
	 *	Returns the value of storageSizeRequired
	 *	@return storageSizeRequired
	 */
	public int getStorageSizeRequired() throws CFException {
        if (isStorageSizeRequiredModified()) { 
           storageSizeRequired = refreshStorageSizeRequired();
        }
   		return storageSizeRequired;
	}
	
	/**
	 * 	Update StorageSizeRequired with the passed value
	 *  Corresponding COBOL Variable is STORAGE-SIZE-REQUIRED
	 *	@param number
	 */
	public void setStorageSizeRequired(int number) {
	     // Truncate if the number is beyond +/- Max range
	    storageSizeRequired = checkStorageSizeRequiredMaxLimit(number); 
		serializeStorageSizeRequired(storageSizeRequired);
	}


	public void setStorageSizeRequired(long number) {
	    number = checkStorageSizeRequiredMaxLimit(number); // Truncate if value is beyond +/- Max range
		setStorageSizeRequired((int)number);
	}
	
	/**
	 *	Returns the value of storageAreaPtr
	 *	@return storageAreaPtr
	 */
	public int getStorageAreaPtr() throws CFException {
        if (isStorageAreaPtrModified()) { 
           storageAreaPtr = refreshStorageAreaPtr();
        }
   		return storageAreaPtr;
	}
	
	/**
	 * 	Update StorageAreaPtr with the passed value
	 *  Corresponding COBOL Variable is STORAGE-AREA-PTR
	 *	@param number
	 */
	public void setStorageAreaPtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    storageAreaPtr = checkStorageAreaPtrMaxLimit(number); 
		serializeStorageAreaPtr(storageAreaPtr);
	}


	public void setStorageAreaPtr(long number) {
	    number = checkStorageAreaPtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setStorageAreaPtr((int)number);
	}
	

	
	
	

		public static int getStorageAllocVarsFieldLength() {
			return STORAGE_ALLOC_VARS_LENGTH;
		}

}
  
