package com.cloudframe.app.dto.serialize.trdpb000;

/**
*  The class SecurityIoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-03 at 13:42. using version 5.0.0.162
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SecurityIoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SecurityIoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SECURITY_IO_LENGTH = 308;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFigi;
            protected  int beginCurrency;
            protected  int beginDescription;
            protected  int beginSymbol;
            protected  int beginShareClassFigi;
            protected  int beginType;
            protected  int beginSecurityErrorMsg;
            protected  int beginSecurityStatus;
	
	/**
	* Constructor for SecurityIoSerialized
	**/
    public SecurityIoSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in SecurityIoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SECURITY_IO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFigi = getStartOffset() + 0;	// set offset for serialization
  
             beginCurrency = getStartOffset() + 12;	// set offset for serialization
  
             beginDescription = getStartOffset() + 15;	// set offset for serialization
  
             beginSymbol = getStartOffset() + 55;	// set offset for serialization
  
             beginShareClassFigi = getStartOffset() + 75;	// set offset for serialization
  
             beginType = getStartOffset() + 87;	// set offset for serialization
  
             beginSecurityErrorMsg = getStartOffset() + 107;	// set offset for serialization
  
             beginSecurityStatus = getStartOffset() + 307;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFigiCounter = -1;
     public boolean isFigiModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFigiCounter != sharedCounter;
         localFigiCounter = sharedCounter; return hasModified;
     }
	protected static final int FIGI_LEN = 12;
	/**
	 * 	serialize this Figi
	 */
   protected void serializeFigi(char[] figi) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(figi,0,getStringValue(),beginFigi,FIGI_LEN);
       localFigiCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFigiConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshFigi is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFigi() {	 
   		return (substring(getStringValue(),beginFigi,beginFigi + FIGI_LEN));
   	}
     int localCurrencyCounter = -1;
     public boolean isCurrencyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrencyCounter != sharedCounter;
         localCurrencyCounter = sharedCounter; return hasModified;
     }
	protected static final int CURRENCY_LEN = 3;
	/**
	 * 	serialize this Currency
	 */
   protected void serializeCurrency(char[] currency) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(currency,0,getStringValue(),beginCurrency,CURRENCY_LEN);
       localCurrencyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurrencyConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshCurrency is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurrency() {	 
   		return (substring(getStringValue(),beginCurrency,beginCurrency + CURRENCY_LEN));
   	}
     int localDescriptionCounter = -1;
     public boolean isDescriptionModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDescriptionCounter != sharedCounter;
         localDescriptionCounter = sharedCounter; return hasModified;
     }
	protected static final int DESCRIPTION_LEN = 40;
	/**
	 * 	serialize this Description
	 */
   protected void serializeDescription(char[] description) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(description,0,getStringValue(),beginDescription,DESCRIPTION_LEN);
       localDescriptionCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDescriptionConstraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshDescription is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDescription() {	 
   		return (substring(getStringValue(),beginDescription,beginDescription + DESCRIPTION_LEN));
   	}
     int localSymbolCounter = -1;
     public boolean isSymbolModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSymbolCounter != sharedCounter;
         localSymbolCounter = sharedCounter; return hasModified;
     }
	protected static final int SYMBOL_LEN = 20;
	/**
	 * 	serialize this Symbol
	 */
   protected void serializeSymbol(char[] symbol) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(symbol,0,getStringValue(),beginSymbol,SYMBOL_LEN);
       localSymbolCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSymbolConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshSymbol is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSymbol() {	 
   		return (substring(getStringValue(),beginSymbol,beginSymbol + SYMBOL_LEN));
   	}
     int localShareClassFigiCounter = -1;
     public boolean isShareClassFigiModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localShareClassFigiCounter != sharedCounter;
         localShareClassFigiCounter = sharedCounter; return hasModified;
     }
	protected static final int SHARE_CLASS_FIGI_LEN = 12;
	/**
	 * 	serialize this ShareClassFigi
	 */
   protected void serializeShareClassFigi(char[] shareClassFigi) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(shareClassFigi,0,getStringValue(),beginShareClassFigi,SHARE_CLASS_FIGI_LEN);
       localShareClassFigiCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkShareClassFigiConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshShareClassFigi is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshShareClassFigi() {	 
   		return (substring(getStringValue(),beginShareClassFigi,beginShareClassFigi + SHARE_CLASS_FIGI_LEN));
   	}
     int localTypeCounter = -1;
     public boolean isTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTypeCounter != sharedCounter;
         localTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int TYPE_LEN = 20;
	/**
	 * 	serialize this Type
	 */
   protected void serializeType(char[] type) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(type,0,getStringValue(),beginType,TYPE_LEN);
       localTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshType() {	 
   		return (substring(getStringValue(),beginType,beginType + TYPE_LEN));
   	}
     int localSecurityErrorMsgCounter = -1;
     public boolean isSecurityErrorMsgModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSecurityErrorMsgCounter != sharedCounter;
         localSecurityErrorMsgCounter = sharedCounter; return hasModified;
     }
	protected static final int SECURITY_ERROR_MSG_LEN = 200;
	/**
	 * 	serialize this SecurityErrorMsg
	 */
   protected void serializeSecurityErrorMsg(char[] securityErrorMsg) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(securityErrorMsg,0,getStringValue(),beginSecurityErrorMsg,SECURITY_ERROR_MSG_LEN);
       localSecurityErrorMsgCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSecurityErrorMsgConstraints(char[] value) {
   			return super.checkConstraints(value , 200 ,false, false);
   }
    /**
	 *	refreshSecurityErrorMsg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSecurityErrorMsg() {	 
   		return (substring(getStringValue(),beginSecurityErrorMsg,beginSecurityErrorMsg + SECURITY_ERROR_MSG_LEN));
   	}
     int localSecurityStatusCounter = -1;
     public boolean isSecurityStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSecurityStatusCounter != sharedCounter;
         localSecurityStatusCounter = sharedCounter; return hasModified;
     }
	protected static final int SECURITY_STATUS_LEN = 1;
	/**
	 * 	serialize this SecurityStatus
	 */
   protected void serializeSecurityStatus(char[] securityStatus) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(securityStatus,0,getStringValue(),beginSecurityStatus,SECURITY_STATUS_LEN);
       localSecurityStatusCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSecurityStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSecurityStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSecurityStatus() {	 
   		return (substring(getStringValue(),beginSecurityStatus,beginSecurityStatus + SECURITY_STATUS_LEN));
   	}




}
  
