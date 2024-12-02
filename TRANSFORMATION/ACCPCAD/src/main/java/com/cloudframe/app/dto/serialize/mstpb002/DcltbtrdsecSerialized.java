package com.cloudframe.app.dto.serialize.mstpb002;

/**
*  The class DcltbtrdsecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-02 at 19:22. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DcltbtrdsecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DcltbtrdsecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DCLTBTRDSEC_LENGTH = 107;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSecFigi;
            protected  int beginSecCurrency;
            protected  int beginSecDescription;
            protected  int beginSecSymbol;
            protected  int beginSecShareClassFigi;
            protected  int beginSecType;
	
	/**
	* Constructor for DcltbtrdsecSerialized
	**/
    public DcltbtrdsecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DcltbtrdsecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DCLTBTRDSEC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSecFigi = getStartOffset() + 0;	// set offset for serialization
  
             beginSecCurrency = getStartOffset() + 12;	// set offset for serialization
  
             beginSecDescription = getStartOffset() + 15;	// set offset for serialization
  
             beginSecSymbol = getStartOffset() + 55;	// set offset for serialization
  
             beginSecShareClassFigi = getStartOffset() + 75;	// set offset for serialization
  
             beginSecType = getStartOffset() + 87;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSecFigiCounter = -1;
     public boolean isSecFigiModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSecFigiCounter != sharedCounter;
         localSecFigiCounter = sharedCounter; return hasModified;
     }
	protected static final int SEC_FIGI_LEN = 12;
	/**
	 * 	serialize this SecFigi
	 */
   protected void serializeSecFigi(char[] secFigi) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(secFigi,0,getStringValue(),beginSecFigi,SEC_FIGI_LEN);
       localSecFigiCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSecFigiConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshSecFigi is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSecFigi() {	 
   		return (substring(getStringValue(),beginSecFigi,beginSecFigi + SEC_FIGI_LEN));
   	}
     int localSecCurrencyCounter = -1;
     public boolean isSecCurrencyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSecCurrencyCounter != sharedCounter;
         localSecCurrencyCounter = sharedCounter; return hasModified;
     }
	protected static final int SEC_CURRENCY_LEN = 3;
	/**
	 * 	serialize this SecCurrency
	 */
   protected void serializeSecCurrency(char[] secCurrency) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(secCurrency,0,getStringValue(),beginSecCurrency,SEC_CURRENCY_LEN);
       localSecCurrencyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSecCurrencyConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSecCurrency is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSecCurrency() {	 
   		return (substring(getStringValue(),beginSecCurrency,beginSecCurrency + SEC_CURRENCY_LEN));
   	}
     int localSecDescriptionCounter = -1;
     public boolean isSecDescriptionModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSecDescriptionCounter != sharedCounter;
         localSecDescriptionCounter = sharedCounter; return hasModified;
     }
	protected static final int SEC_DESCRIPTION_LEN = 40;
	/**
	 * 	serialize this SecDescription
	 */
   protected void serializeSecDescription(char[] secDescription) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(secDescription,0,getStringValue(),beginSecDescription,SEC_DESCRIPTION_LEN);
       localSecDescriptionCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSecDescriptionConstraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshSecDescription is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSecDescription() {	 
   		return (substring(getStringValue(),beginSecDescription,beginSecDescription + SEC_DESCRIPTION_LEN));
   	}
     int localSecSymbolCounter = -1;
     public boolean isSecSymbolModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSecSymbolCounter != sharedCounter;
         localSecSymbolCounter = sharedCounter; return hasModified;
     }
	protected static final int SEC_SYMBOL_LEN = 20;
	/**
	 * 	serialize this SecSymbol
	 */
   protected void serializeSecSymbol(char[] secSymbol) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(secSymbol,0,getStringValue(),beginSecSymbol,SEC_SYMBOL_LEN);
       localSecSymbolCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSecSymbolConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshSecSymbol is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSecSymbol() {	 
   		return (substring(getStringValue(),beginSecSymbol,beginSecSymbol + SEC_SYMBOL_LEN));
   	}
     int localSecShareClassFigiCounter = -1;
     public boolean isSecShareClassFigiModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSecShareClassFigiCounter != sharedCounter;
         localSecShareClassFigiCounter = sharedCounter; return hasModified;
     }
	protected static final int SEC_SHARE_CLASS_FIGI_LEN = 12;
	/**
	 * 	serialize this SecShareClassFigi
	 */
   protected void serializeSecShareClassFigi(char[] secShareClassFigi) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(secShareClassFigi,0,getStringValue(),beginSecShareClassFigi,SEC_SHARE_CLASS_FIGI_LEN);
       localSecShareClassFigiCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSecShareClassFigiConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshSecShareClassFigi is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSecShareClassFigi() {	 
   		return (substring(getStringValue(),beginSecShareClassFigi,beginSecShareClassFigi + SEC_SHARE_CLASS_FIGI_LEN));
   	}
     int localSecTypeCounter = -1;
     public boolean isSecTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSecTypeCounter != sharedCounter;
         localSecTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int SEC_TYPE_LEN = 20;
	/**
	 * 	serialize this SecType
	 */
   protected void serializeSecType(char[] secType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(secType,0,getStringValue(),beginSecType,SEC_TYPE_LEN);
       localSecTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSecTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshSecType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSecType() {	 
   		return (substring(getStringValue(),beginSecType,beginSecType + SEC_TYPE_LEN));
   	}




}
  
