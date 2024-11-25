package com.cloudframe.app.trdpb000.dto.serialize;

/**
*  The class CustomerIoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-11-25 at 06:23. using version 5.0.0.158
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CustomerIoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CustomerIoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CUSTOMER_IO_LENGTH = 256;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCustomerId;
            protected  int beginCustomerCurrency;
            protected  int beginCustomerDescription;
            protected  int beginCustomerErrorMsg;
            protected  int beginCustomerStatus;
	
	/**
	* Constructor for CustomerIoSerialized
	**/
    public CustomerIoSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in CustomerIoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CUSTOMER_IO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCustomerId = getStartOffset() + 0;	// set offset for serialization
  
             beginCustomerCurrency = getStartOffset() + 12;	// set offset for serialization
  
             beginCustomerDescription = getStartOffset() + 15;	// set offset for serialization
  
             beginCustomerErrorMsg = getStartOffset() + 55;	// set offset for serialization
  
             beginCustomerStatus = getStartOffset() + 255;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCustomerIdCounter = -1;
     public boolean isCustomerIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCustomerIdCounter != sharedCounter;
         localCustomerIdCounter = sharedCounter; return hasModified;
     }
	protected static final int CUSTOMER_ID_LEN = 12;
	/**
	 * 	serialize this CustomerId
	 */
   protected void serializeCustomerId(char[] customerId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(customerId,0,getStringValue(),beginCustomerId,CUSTOMER_ID_LEN);
       localCustomerIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCustomerIdConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshCustomerId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCustomerId() {	 
   		return (substring(getStringValue(),beginCustomerId,beginCustomerId + CUSTOMER_ID_LEN));
   	}
     int localCustomerCurrencyCounter = -1;
     public boolean isCustomerCurrencyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCustomerCurrencyCounter != sharedCounter;
         localCustomerCurrencyCounter = sharedCounter; return hasModified;
     }
	protected static final int CUSTOMER_CURRENCY_LEN = 3;
	/**
	 * 	serialize this CustomerCurrency
	 */
   protected void serializeCustomerCurrency(char[] customerCurrency) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(customerCurrency,0,getStringValue(),beginCustomerCurrency,CUSTOMER_CURRENCY_LEN);
       localCustomerCurrencyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCustomerCurrencyConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshCustomerCurrency is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCustomerCurrency() {	 
   		return (substring(getStringValue(),beginCustomerCurrency,beginCustomerCurrency + CUSTOMER_CURRENCY_LEN));
   	}
     int localCustomerDescriptionCounter = -1;
     public boolean isCustomerDescriptionModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCustomerDescriptionCounter != sharedCounter;
         localCustomerDescriptionCounter = sharedCounter; return hasModified;
     }
	protected static final int CUSTOMER_DESCRIPTION_LEN = 40;
	/**
	 * 	serialize this CustomerDescription
	 */
   protected void serializeCustomerDescription(char[] customerDescription) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(customerDescription,0,getStringValue(),beginCustomerDescription,CUSTOMER_DESCRIPTION_LEN);
       localCustomerDescriptionCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCustomerDescriptionConstraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshCustomerDescription is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCustomerDescription() {	 
   		return (substring(getStringValue(),beginCustomerDescription,beginCustomerDescription + CUSTOMER_DESCRIPTION_LEN));
   	}
     int localCustomerErrorMsgCounter = -1;
     public boolean isCustomerErrorMsgModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCustomerErrorMsgCounter != sharedCounter;
         localCustomerErrorMsgCounter = sharedCounter; return hasModified;
     }
	protected static final int CUSTOMER_ERROR_MSG_LEN = 200;
	/**
	 * 	serialize this CustomerErrorMsg
	 */
   protected void serializeCustomerErrorMsg(char[] customerErrorMsg) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(customerErrorMsg,0,getStringValue(),beginCustomerErrorMsg,CUSTOMER_ERROR_MSG_LEN);
       localCustomerErrorMsgCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCustomerErrorMsgConstraints(char[] value) {
   			return super.checkConstraints(value , 200 ,false, false);
   }
    /**
	 *	refreshCustomerErrorMsg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCustomerErrorMsg() {	 
   		return (substring(getStringValue(),beginCustomerErrorMsg,beginCustomerErrorMsg + CUSTOMER_ERROR_MSG_LEN));
   	}
     int localCustomerStatusCounter = -1;
     public boolean isCustomerStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCustomerStatusCounter != sharedCounter;
         localCustomerStatusCounter = sharedCounter; return hasModified;
     }
	protected static final int CUSTOMER_STATUS_LEN = 1;
	/**
	 * 	serialize this CustomerStatus
	 */
   protected void serializeCustomerStatus(char[] customerStatus) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(customerStatus,0,getStringValue(),beginCustomerStatus,CUSTOMER_STATUS_LEN);
       localCustomerStatusCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCustomerStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCustomerStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCustomerStatus() {	 
   		return (substring(getStringValue(),beginCustomerStatus,beginCustomerStatus + CUSTOMER_STATUS_LEN));
   	}




}
  
