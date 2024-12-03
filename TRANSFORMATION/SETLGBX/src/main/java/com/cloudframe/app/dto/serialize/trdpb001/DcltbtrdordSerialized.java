package com.cloudframe.app.dto.serialize.trdpb001;

/**
*  The class DcltbtrdordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-03 at 15:05. using version 5.0.0.163
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DcltbtrdordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DcltbtrdordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DCLTBTRDORD_LENGTH = 63;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginOrdTradingXchng;
            protected  int beginOrdTradeid;
            protected  int beginOrdBuySellInd;
            protected  int beginOrdFigi;
            protected  int beginOrdCurrency;
            protected  int beginOrdStatus;
	
	/**
	* Constructor for DcltbtrdordSerialized
	**/
    public DcltbtrdordSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DcltbtrdordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DCLTBTRDORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginOrdTradingXchng = getStartOffset() + 0;	// set offset for serialization
  
             beginOrdTradeid = getStartOffset() + 10;	// set offset for serialization
  
             beginOrdBuySellInd = getStartOffset() + 22;	// set offset for serialization
  
             beginOrdFigi = getStartOffset() + 35;	// set offset for serialization
  
             beginOrdCurrency = getStartOffset() + 52;	// set offset for serialization
  
             beginOrdStatus = getStartOffset() + 60;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localOrdTradingXchngCounter = -1;
     public boolean isOrdTradingXchngModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOrdTradingXchngCounter != sharedCounter;
         localOrdTradingXchngCounter = sharedCounter; return hasModified;
     }
	protected static final int ORD_TRADING_XCHNG_LEN = 10;
	/**
	 * 	serialize this OrdTradingXchng
	 */
   protected void serializeOrdTradingXchng(char[] ordTradingXchng) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ordTradingXchng,0,getStringValue(),beginOrdTradingXchng,ORD_TRADING_XCHNG_LEN);
       localOrdTradingXchngCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOrdTradingXchngConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshOrdTradingXchng is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOrdTradingXchng() {	 
   		return (substring(getStringValue(),beginOrdTradingXchng,beginOrdTradingXchng + ORD_TRADING_XCHNG_LEN));
   	}
     int localOrdTradeidCounter = -1;
     public boolean isOrdTradeidModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOrdTradeidCounter != sharedCounter;
         localOrdTradeidCounter = sharedCounter; return hasModified;
     }
	protected static final int ORD_TRADEID_LEN = 12;
	/**
	 * 	serialize this OrdTradeid
	 */
   protected void serializeOrdTradeid(char[] ordTradeid) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ordTradeid,0,getStringValue(),beginOrdTradeid,ORD_TRADEID_LEN);
       localOrdTradeidCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOrdTradeidConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshOrdTradeid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOrdTradeid() {	 
   		return (substring(getStringValue(),beginOrdTradeid,beginOrdTradeid + ORD_TRADEID_LEN));
   	}
     int localOrdBuySellIndCounter = -1;
     public boolean isOrdBuySellIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOrdBuySellIndCounter != sharedCounter;
         localOrdBuySellIndCounter = sharedCounter; return hasModified;
     }
	protected static final int ORD_BUY_SELL_IND_LEN = 1;
	/**
	 * 	serialize this OrdBuySellInd
	 */
   protected void serializeOrdBuySellInd(char[] ordBuySellInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ordBuySellInd,0,getStringValue(),beginOrdBuySellInd,ORD_BUY_SELL_IND_LEN);
       localOrdBuySellIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOrdBuySellIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshOrdBuySellInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOrdBuySellInd() {	 
   		return (substring(getStringValue(),beginOrdBuySellInd,beginOrdBuySellInd + ORD_BUY_SELL_IND_LEN));
   	}
     int localOrdFigiCounter = -1;
     public boolean isOrdFigiModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOrdFigiCounter != sharedCounter;
         localOrdFigiCounter = sharedCounter; return hasModified;
     }
	protected static final int ORD_FIGI_LEN = 12;
	/**
	 * 	serialize this OrdFigi
	 */
   protected void serializeOrdFigi(char[] ordFigi) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ordFigi,0,getStringValue(),beginOrdFigi,ORD_FIGI_LEN);
       localOrdFigiCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOrdFigiConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshOrdFigi is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOrdFigi() {	 
   		return (substring(getStringValue(),beginOrdFigi,beginOrdFigi + ORD_FIGI_LEN));
   	}
     int localOrdCurrencyCounter = -1;
     public boolean isOrdCurrencyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOrdCurrencyCounter != sharedCounter;
         localOrdCurrencyCounter = sharedCounter; return hasModified;
     }
	protected static final int ORD_CURRENCY_LEN = 3;
	/**
	 * 	serialize this OrdCurrency
	 */
   protected void serializeOrdCurrency(char[] ordCurrency) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ordCurrency,0,getStringValue(),beginOrdCurrency,ORD_CURRENCY_LEN);
       localOrdCurrencyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOrdCurrencyConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshOrdCurrency is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOrdCurrency() {	 
   		return (substring(getStringValue(),beginOrdCurrency,beginOrdCurrency + ORD_CURRENCY_LEN));
   	}
     int localOrdStatusCounter = -1;
     public boolean isOrdStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOrdStatusCounter != sharedCounter;
         localOrdStatusCounter = sharedCounter; return hasModified;
     }
	protected static final int ORD_STATUS_LEN = 3;
	/**
	 * 	serialize this OrdStatus
	 */
   protected void serializeOrdStatus(char[] ordStatus) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ordStatus,0,getStringValue(),beginOrdStatus,ORD_STATUS_LEN);
       localOrdStatusCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOrdStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshOrdStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOrdStatus() {	 
   		return (substring(getStringValue(),beginOrdStatus,beginOrdStatus + ORD_STATUS_LEN));
   	}




}
  
