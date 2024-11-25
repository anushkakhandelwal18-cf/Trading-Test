package com.cloudframe.app.mstpb002.dto.serialize;

/**
*  The class LsSecurityIoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-11-25 at 06:23. using version 5.0.0.158
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class LsSecurityIoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(LsSecurityIoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int LS_SECURITY_IO_LENGTH = 308;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginLsFigi;
            protected  int beginLsCurrency;
            protected  int beginLsDescription;
            protected  int beginLsSymbol;
            protected  int beginLsShareClassFigi;
            protected  int beginLsType;
            protected  int beginLsSecurityErrorMsg;
            protected  int beginLsSecurityStatus;
	
	/**
	* Constructor for LsSecurityIoSerialized
	**/
    public LsSecurityIoSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in LsSecurityIoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(LS_SECURITY_IO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginLsFigi = getStartOffset() + 0;	// set offset for serialization
  
             beginLsCurrency = getStartOffset() + 12;	// set offset for serialization
  
             beginLsDescription = getStartOffset() + 15;	// set offset for serialization
  
             beginLsSymbol = getStartOffset() + 55;	// set offset for serialization
  
             beginLsShareClassFigi = getStartOffset() + 75;	// set offset for serialization
  
             beginLsType = getStartOffset() + 87;	// set offset for serialization
  
             beginLsSecurityErrorMsg = getStartOffset() + 107;	// set offset for serialization
  
             beginLsSecurityStatus = getStartOffset() + 307;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localLsFigiCounter = -1;
     public boolean isLsFigiModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsFigiCounter != sharedCounter;
         localLsFigiCounter = sharedCounter; return hasModified;
     }
	protected static final int LS_FIGI_LEN = 12;
	/**
	 * 	serialize this LsFigi
	 */
   protected void serializeLsFigi(char[] lsFigi) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lsFigi,0,getStringValue(),beginLsFigi,LS_FIGI_LEN);
       localLsFigiCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLsFigiConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshLsFigi is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLsFigi() {	 
   		return (substring(getStringValue(),beginLsFigi,beginLsFigi + LS_FIGI_LEN));
   	}
     int localLsCurrencyCounter = -1;
     public boolean isLsCurrencyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsCurrencyCounter != sharedCounter;
         localLsCurrencyCounter = sharedCounter; return hasModified;
     }
	protected static final int LS_CURRENCY_LEN = 3;
	/**
	 * 	serialize this LsCurrency
	 */
   protected void serializeLsCurrency(char[] lsCurrency) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lsCurrency,0,getStringValue(),beginLsCurrency,LS_CURRENCY_LEN);
       localLsCurrencyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLsCurrencyConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshLsCurrency is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLsCurrency() {	 
   		return (substring(getStringValue(),beginLsCurrency,beginLsCurrency + LS_CURRENCY_LEN));
   	}
     int localLsDescriptionCounter = -1;
     public boolean isLsDescriptionModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsDescriptionCounter != sharedCounter;
         localLsDescriptionCounter = sharedCounter; return hasModified;
     }
	protected static final int LS_DESCRIPTION_LEN = 40;
	/**
	 * 	serialize this LsDescription
	 */
   protected void serializeLsDescription(char[] lsDescription) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lsDescription,0,getStringValue(),beginLsDescription,LS_DESCRIPTION_LEN);
       localLsDescriptionCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLsDescriptionConstraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshLsDescription is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLsDescription() {	 
   		return (substring(getStringValue(),beginLsDescription,beginLsDescription + LS_DESCRIPTION_LEN));
   	}
     int localLsSymbolCounter = -1;
     public boolean isLsSymbolModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsSymbolCounter != sharedCounter;
         localLsSymbolCounter = sharedCounter; return hasModified;
     }
	protected static final int LS_SYMBOL_LEN = 20;
	/**
	 * 	serialize this LsSymbol
	 */
   protected void serializeLsSymbol(char[] lsSymbol) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lsSymbol,0,getStringValue(),beginLsSymbol,LS_SYMBOL_LEN);
       localLsSymbolCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLsSymbolConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshLsSymbol is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLsSymbol() {	 
   		return (substring(getStringValue(),beginLsSymbol,beginLsSymbol + LS_SYMBOL_LEN));
   	}
     int localLsShareClassFigiCounter = -1;
     public boolean isLsShareClassFigiModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsShareClassFigiCounter != sharedCounter;
         localLsShareClassFigiCounter = sharedCounter; return hasModified;
     }
	protected static final int LS_SHARE_CLASS_FIGI_LEN = 12;
	/**
	 * 	serialize this LsShareClassFigi
	 */
   protected void serializeLsShareClassFigi(char[] lsShareClassFigi) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lsShareClassFigi,0,getStringValue(),beginLsShareClassFigi,LS_SHARE_CLASS_FIGI_LEN);
       localLsShareClassFigiCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLsShareClassFigiConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshLsShareClassFigi is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLsShareClassFigi() {	 
   		return (substring(getStringValue(),beginLsShareClassFigi,beginLsShareClassFigi + LS_SHARE_CLASS_FIGI_LEN));
   	}
     int localLsTypeCounter = -1;
     public boolean isLsTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsTypeCounter != sharedCounter;
         localLsTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int LS_TYPE_LEN = 20;
	/**
	 * 	serialize this LsType
	 */
   protected void serializeLsType(char[] lsType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lsType,0,getStringValue(),beginLsType,LS_TYPE_LEN);
       localLsTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLsTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshLsType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLsType() {	 
   		return (substring(getStringValue(),beginLsType,beginLsType + LS_TYPE_LEN));
   	}
     int localLsSecurityErrorMsgCounter = -1;
     public boolean isLsSecurityErrorMsgModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsSecurityErrorMsgCounter != sharedCounter;
         localLsSecurityErrorMsgCounter = sharedCounter; return hasModified;
     }
	protected static final int LS_SECURITY_ERROR_MSG_LEN = 200;
	/**
	 * 	serialize this LsSecurityErrorMsg
	 */
   protected void serializeLsSecurityErrorMsg(char[] lsSecurityErrorMsg) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lsSecurityErrorMsg,0,getStringValue(),beginLsSecurityErrorMsg,LS_SECURITY_ERROR_MSG_LEN);
       localLsSecurityErrorMsgCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLsSecurityErrorMsgConstraints(char[] value) {
   			return super.checkConstraints(value , 200 ,false, false);
   }
    /**
	 *	refreshLsSecurityErrorMsg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLsSecurityErrorMsg() {	 
   		return (substring(getStringValue(),beginLsSecurityErrorMsg,beginLsSecurityErrorMsg + LS_SECURITY_ERROR_MSG_LEN));
   	}
     int localLsSecurityStatusCounter = -1;
     public boolean isLsSecurityStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsSecurityStatusCounter != sharedCounter;
         localLsSecurityStatusCounter = sharedCounter; return hasModified;
     }
	protected static final int LS_SECURITY_STATUS_LEN = 1;
	/**
	 * 	serialize this LsSecurityStatus
	 */
   protected void serializeLsSecurityStatus(char[] lsSecurityStatus) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lsSecurityStatus,0,getStringValue(),beginLsSecurityStatus,LS_SECURITY_STATUS_LEN);
       localLsSecurityStatusCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLsSecurityStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshLsSecurityStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLsSecurityStatus() {	 
   		return (substring(getStringValue(),beginLsSecurityStatus,beginLsSecurityStatus + LS_SECURITY_STATUS_LEN));
   	}




}
  
