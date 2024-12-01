package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class SavHcdsInfoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SavHcdsInfoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SavHcdsInfoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SAV_HCDS_INFO_LENGTH = 580;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSavCfeUb92VendorType;
	
	/**
	* Constructor for SavHcdsInfoSerialized
	**/
    public SavHcdsInfoSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SavHcdsInfoSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SavHcdsInfoSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SavHcdsInfoSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,589); // serialize this field at offset 589 by default 
    }
    
	/**
	* sets parent for this SavHcdsInfoSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 589 by default
    }    
	/**
	* initializes the field in SavHcdsInfoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SAV_HCDS_INFO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSavCfeUb92VendorType = getStartOffset() + 579;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSavCfeUb92VendorTypeCounter = -1;
     public boolean isSavCfeUb92VendorTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSavCfeUb92VendorTypeCounter != sharedCounter;
         localSavCfeUb92VendorTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int SAV_CFE_UB_92_VENDOR_TYPE_LEN = 1;
	/**
	 * 	serialize this SavCfeUb92VendorType
	 */
   protected void serializeSavCfeUb92VendorType(char[] savCfeUb92VendorType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(savCfeUb92VendorType,0,getStringValue(),beginSavCfeUb92VendorType,SAV_CFE_UB_92_VENDOR_TYPE_LEN);
       localSavCfeUb92VendorTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSavCfeUb92VendorTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSavCfeUb92VendorType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSavCfeUb92VendorType() {	 
   		return (substring(getStringValue(),beginSavCfeUb92VendorType,beginSavCfeUb92VendorType + SAV_CFE_UB_92_VENDOR_TYPE_LEN));
   	}




}
  
