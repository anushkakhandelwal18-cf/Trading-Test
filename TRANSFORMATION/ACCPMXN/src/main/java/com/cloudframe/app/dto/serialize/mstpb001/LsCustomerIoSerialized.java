package com.cloudframe.app.dto.serialize.mstpb001;

/**
*  The class LsCustomerIoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-03 at 13:43. using version 5.0.0.162
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class LsCustomerIoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(LsCustomerIoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int LS_CUSTOMER_IO_LENGTH = 256;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginLsCustomerId;
            protected  int beginLsCustomerCurrency;
            protected  int beginLsCustomerDescription;
            protected  int beginLsCustomerErrorMsg;
            protected  int beginLsCustomerStatus;
	
	/**
	* Constructor for LsCustomerIoSerialized
	**/
    public LsCustomerIoSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in LsCustomerIoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(LS_CUSTOMER_IO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginLsCustomerId = getStartOffset() + 0;	// set offset for serialization
  
             beginLsCustomerCurrency = getStartOffset() + 12;	// set offset for serialization
  
             beginLsCustomerDescription = getStartOffset() + 15;	// set offset for serialization
  
             beginLsCustomerErrorMsg = getStartOffset() + 55;	// set offset for serialization
  
             beginLsCustomerStatus = getStartOffset() + 255;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localLsCustomerIdCounter = -1;
     public boolean isLsCustomerIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsCustomerIdCounter != sharedCounter;
         localLsCustomerIdCounter = sharedCounter; return hasModified;
     }
	protected static final int LS_CUSTOMER_ID_LEN = 12;
	/**
	 * 	serialize this LsCustomerId
	 */
   protected void serializeLsCustomerId(char[] lsCustomerId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lsCustomerId,0,getStringValue(),beginLsCustomerId,LS_CUSTOMER_ID_LEN);
       localLsCustomerIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLsCustomerIdConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshLsCustomerId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLsCustomerId() {	 
   		return (substring(getStringValue(),beginLsCustomerId,beginLsCustomerId + LS_CUSTOMER_ID_LEN));
   	}
     int localLsCustomerCurrencyCounter = -1;
     public boolean isLsCustomerCurrencyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsCustomerCurrencyCounter != sharedCounter;
         localLsCustomerCurrencyCounter = sharedCounter; return hasModified;
     }
	protected static final int LS_CUSTOMER_CURRENCY_LEN = 3;
	/**
	 * 	serialize this LsCustomerCurrency
	 */
   protected void serializeLsCustomerCurrency(char[] lsCustomerCurrency) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lsCustomerCurrency,0,getStringValue(),beginLsCustomerCurrency,LS_CUSTOMER_CURRENCY_LEN);
       localLsCustomerCurrencyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLsCustomerCurrencyConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshLsCustomerCurrency is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLsCustomerCurrency() {	 
   		return (substring(getStringValue(),beginLsCustomerCurrency,beginLsCustomerCurrency + LS_CUSTOMER_CURRENCY_LEN));
   	}
     int localLsCustomerDescriptionCounter = -1;
     public boolean isLsCustomerDescriptionModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsCustomerDescriptionCounter != sharedCounter;
         localLsCustomerDescriptionCounter = sharedCounter; return hasModified;
     }
	protected static final int LS_CUSTOMER_DESCRIPTION_LEN = 40;
	/**
	 * 	serialize this LsCustomerDescription
	 */
   protected void serializeLsCustomerDescription(char[] lsCustomerDescription) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lsCustomerDescription,0,getStringValue(),beginLsCustomerDescription,LS_CUSTOMER_DESCRIPTION_LEN);
       localLsCustomerDescriptionCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLsCustomerDescriptionConstraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshLsCustomerDescription is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLsCustomerDescription() {	 
   		return (substring(getStringValue(),beginLsCustomerDescription,beginLsCustomerDescription + LS_CUSTOMER_DESCRIPTION_LEN));
   	}
     int localLsCustomerErrorMsgCounter = -1;
     public boolean isLsCustomerErrorMsgModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsCustomerErrorMsgCounter != sharedCounter;
         localLsCustomerErrorMsgCounter = sharedCounter; return hasModified;
     }
	protected static final int LS_CUSTOMER_ERROR_MSG_LEN = 200;
	/**
	 * 	serialize this LsCustomerErrorMsg
	 */
   protected void serializeLsCustomerErrorMsg(char[] lsCustomerErrorMsg) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lsCustomerErrorMsg,0,getStringValue(),beginLsCustomerErrorMsg,LS_CUSTOMER_ERROR_MSG_LEN);
       localLsCustomerErrorMsgCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLsCustomerErrorMsgConstraints(char[] value) {
   			return super.checkConstraints(value , 200 ,false, false);
   }
    /**
	 *	refreshLsCustomerErrorMsg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLsCustomerErrorMsg() {	 
   		return (substring(getStringValue(),beginLsCustomerErrorMsg,beginLsCustomerErrorMsg + LS_CUSTOMER_ERROR_MSG_LEN));
   	}
     int localLsCustomerStatusCounter = -1;
     public boolean isLsCustomerStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsCustomerStatusCounter != sharedCounter;
         localLsCustomerStatusCounter = sharedCounter; return hasModified;
     }
	protected static final int LS_CUSTOMER_STATUS_LEN = 1;
	/**
	 * 	serialize this LsCustomerStatus
	 */
   protected void serializeLsCustomerStatus(char[] lsCustomerStatus) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lsCustomerStatus,0,getStringValue(),beginLsCustomerStatus,LS_CUSTOMER_STATUS_LEN);
       localLsCustomerStatusCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLsCustomerStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshLsCustomerStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLsCustomerStatus() {	 
   		return (substring(getStringValue(),beginLsCustomerStatus,beginLsCustomerStatus + LS_CUSTOMER_STATUS_LEN));
   	}




}
  
