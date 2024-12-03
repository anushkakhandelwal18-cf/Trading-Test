package com.cloudframe.app.dto.serialize.trdpb000;

/**
*  The class DcltbtrdsacSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-03 at 13:42. using version 5.0.0.162
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DcltbtrdsacSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DcltbtrdsacSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DCLTBTRDSAC_LENGTH = 20;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSacCurrency;
            protected  int beginSacNumber;
            protected  int beginSacCustomerId;
            protected  int beginSacStatus;
	
	/**
	* Constructor for DcltbtrdsacSerialized
	**/
    public DcltbtrdsacSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DcltbtrdsacSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DCLTBTRDSAC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSacCurrency = getStartOffset() + 0;	// set offset for serialization
  
             beginSacNumber = getStartOffset() + 3;	// set offset for serialization
  
             beginSacCustomerId = getStartOffset() + 7;	// set offset for serialization
  
             beginSacStatus = getStartOffset() + 19;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSacCurrencyCounter = -1;
     public boolean isSacCurrencyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSacCurrencyCounter != sharedCounter;
         localSacCurrencyCounter = sharedCounter; return hasModified;
     }
	protected static final int SAC_CURRENCY_LEN = 3;
	/**
	 * 	serialize this SacCurrency
	 */
   protected void serializeSacCurrency(char[] sacCurrency) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sacCurrency,0,getStringValue(),beginSacCurrency,SAC_CURRENCY_LEN);
       localSacCurrencyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSacCurrencyConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSacCurrency is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSacCurrency() {	 
   		return (substring(getStringValue(),beginSacCurrency,beginSacCurrency + SAC_CURRENCY_LEN));
   	}
         int localSacNumberCounter = -1;
         public boolean isSacNumberModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSacNumberCounter != sharedCounter;
            localSacNumberCounter = sharedCounter; return hasModified; 
         }
   protected static final int SAC_NUMBER_LEN = 4;
  	/**
	 * serializeSacNumber
	 */
	protected void serializeSacNumber(int sacNumber) {
           replaceValue( //  save the value as string
                   getBinaryString( sacNumber,SAC_NUMBER_LEN)
                  ,beginSacNumber
                  ,SAC_NUMBER_LEN
                 );
            localSacNumberCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSacNumberMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSacNumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSacNumber() {	 
			return (getInt(beginSacNumber));
   	}
     int localSacCustomerIdCounter = -1;
     public boolean isSacCustomerIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSacCustomerIdCounter != sharedCounter;
         localSacCustomerIdCounter = sharedCounter; return hasModified;
     }
	protected static final int SAC_CUSTOMER_ID_LEN = 12;
	/**
	 * 	serialize this SacCustomerId
	 */
   protected void serializeSacCustomerId(char[] sacCustomerId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sacCustomerId,0,getStringValue(),beginSacCustomerId,SAC_CUSTOMER_ID_LEN);
       localSacCustomerIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSacCustomerIdConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshSacCustomerId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSacCustomerId() {	 
   		return (substring(getStringValue(),beginSacCustomerId,beginSacCustomerId + SAC_CUSTOMER_ID_LEN));
   	}
     int localSacStatusCounter = -1;
     public boolean isSacStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSacStatusCounter != sharedCounter;
         localSacStatusCounter = sharedCounter; return hasModified;
     }
	protected static final int SAC_STATUS_LEN = 1;
	/**
	 * 	serialize this SacStatus
	 */
   protected void serializeSacStatus(char[] sacStatus) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sacStatus,0,getStringValue(),beginSacStatus,SAC_STATUS_LEN);
       localSacStatusCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSacStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSacStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSacStatus() {	 
   		return (substring(getStringValue(),beginSacStatus,beginSacStatus + SAC_STATUS_LEN));
   	}




}
  
