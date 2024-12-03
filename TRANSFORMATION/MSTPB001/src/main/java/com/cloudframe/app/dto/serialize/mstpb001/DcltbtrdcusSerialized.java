package com.cloudframe.app.dto.serialize.mstpb001;

/**
*  The class DcltbtrdcusSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-03 at 13:46. using version 5.0.0.162
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DcltbtrdcusSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DcltbtrdcusSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DCLTBTRDCUS_LENGTH = 56;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCusCustomerId;
            protected  int beginCusCurrency;
            protected  int beginCusDescription;
            protected  int beginCusStatus;
	
	/**
	* Constructor for DcltbtrdcusSerialized
	**/
    public DcltbtrdcusSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DcltbtrdcusSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DCLTBTRDCUS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCusCustomerId = getStartOffset() + 0;	// set offset for serialization
  
             beginCusCurrency = getStartOffset() + 12;	// set offset for serialization
  
             beginCusDescription = getStartOffset() + 15;	// set offset for serialization
  
             beginCusStatus = getStartOffset() + 55;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCusCustomerIdCounter = -1;
     public boolean isCusCustomerIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCusCustomerIdCounter != sharedCounter;
         localCusCustomerIdCounter = sharedCounter; return hasModified;
     }
	protected static final int CUS_CUSTOMER_ID_LEN = 12;
	/**
	 * 	serialize this CusCustomerId
	 */
   protected void serializeCusCustomerId(char[] cusCustomerId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cusCustomerId,0,getStringValue(),beginCusCustomerId,CUS_CUSTOMER_ID_LEN);
       localCusCustomerIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCusCustomerIdConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshCusCustomerId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCusCustomerId() {	 
   		return (substring(getStringValue(),beginCusCustomerId,beginCusCustomerId + CUS_CUSTOMER_ID_LEN));
   	}
     int localCusCurrencyCounter = -1;
     public boolean isCusCurrencyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCusCurrencyCounter != sharedCounter;
         localCusCurrencyCounter = sharedCounter; return hasModified;
     }
	protected static final int CUS_CURRENCY_LEN = 3;
	/**
	 * 	serialize this CusCurrency
	 */
   protected void serializeCusCurrency(char[] cusCurrency) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cusCurrency,0,getStringValue(),beginCusCurrency,CUS_CURRENCY_LEN);
       localCusCurrencyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCusCurrencyConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshCusCurrency is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCusCurrency() {	 
   		return (substring(getStringValue(),beginCusCurrency,beginCusCurrency + CUS_CURRENCY_LEN));
   	}
     int localCusDescriptionCounter = -1;
     public boolean isCusDescriptionModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCusDescriptionCounter != sharedCounter;
         localCusDescriptionCounter = sharedCounter; return hasModified;
     }
	protected static final int CUS_DESCRIPTION_LEN = 40;
	/**
	 * 	serialize this CusDescription
	 */
   protected void serializeCusDescription(char[] cusDescription) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cusDescription,0,getStringValue(),beginCusDescription,CUS_DESCRIPTION_LEN);
       localCusDescriptionCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCusDescriptionConstraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshCusDescription is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCusDescription() {	 
   		return (substring(getStringValue(),beginCusDescription,beginCusDescription + CUS_DESCRIPTION_LEN));
   	}
     int localCusStatusCounter = -1;
     public boolean isCusStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCusStatusCounter != sharedCounter;
         localCusStatusCounter = sharedCounter; return hasModified;
     }
	protected static final int CUS_STATUS_LEN = 1;
	/**
	 * 	serialize this CusStatus
	 */
   protected void serializeCusStatus(char[] cusStatus) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cusStatus,0,getStringValue(),beginCusStatus,CUS_STATUS_LEN);
       localCusStatusCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCusStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCusStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCusStatus() {	 
   		return (substring(getStringValue(),beginCusStatus,beginCusStatus + CUS_STATUS_LEN));
   	}




}
  
