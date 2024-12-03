package com.cloudframe.app.trdpb006.dto.serialize;

/**
*  The class DetailRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-03 at 15:38. using version 5.0.0.163
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DetailRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DetailRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DETAIL_REC_LENGTH = 159;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDetTradeid;
            protected  int beginDetBuyerSeller;
            protected  int beginDetTradingXchng;
            protected  int beginDetFigi;
            protected  int beginDetSymbol;
            protected  int beginDetDescription;
            protected  int beginDetType;
            protected  int beginDetQuantity;
            protected  int beginDetCurrency;
            protected  int beginDetAmount;
	
	/**
	* Constructor for DetailRecSerialized
	**/
    public DetailRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DetailRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DETAIL_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginDetTradeid = getStartOffset() + 1;	// set offset for serialization
  
  
             beginDetBuyerSeller = getStartOffset() + 12;	// set offset for serialization
  
  
             beginDetTradingXchng = getStartOffset() + 25;	// set offset for serialization
  
  
             beginDetFigi = getStartOffset() + 38;	// set offset for serialization
  
  
             beginDetSymbol = getStartOffset() + 51;	// set offset for serialization
  
  
             beginDetDescription = getStartOffset() + 72;	// set offset for serialization
  
  
             beginDetType = getStartOffset() + 113;	// set offset for serialization
  
  
             beginDetQuantity = getStartOffset() + 129;	// set offset for serialization
  
  
             beginDetCurrency = getStartOffset() + 142;	// set offset for serialization
  
  
             beginDetAmount = getStartOffset() + 146;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDetTradeidCounter = -1;
     public boolean isDetTradeidModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDetTradeidCounter != sharedCounter;
         localDetTradeidCounter = sharedCounter; return hasModified;
     }
	protected static final int DET_TRADEID_LEN = 10;
	/**
	 * 	serialize this DetTradeid
	 */
   protected void serializeDetTradeid(char[] detTradeid) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(detTradeid,0,getStringValue(),beginDetTradeid,DET_TRADEID_LEN);
       localDetTradeidCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDetTradeidConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshDetTradeid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDetTradeid() {	 
   		return (substring(getStringValue(),beginDetTradeid,beginDetTradeid + DET_TRADEID_LEN));
   	}
     int localDetBuyerSellerCounter = -1;
     public boolean isDetBuyerSellerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDetBuyerSellerCounter != sharedCounter;
         localDetBuyerSellerCounter = sharedCounter; return hasModified;
     }
	protected static final int DET_BUYER_SELLER_LEN = 12;
	/**
	 * 	serialize this DetBuyerSeller
	 */
   protected void serializeDetBuyerSeller(char[] detBuyerSeller) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(detBuyerSeller,0,getStringValue(),beginDetBuyerSeller,DET_BUYER_SELLER_LEN);
       localDetBuyerSellerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDetBuyerSellerConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshDetBuyerSeller is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDetBuyerSeller() {	 
   		return (substring(getStringValue(),beginDetBuyerSeller,beginDetBuyerSeller + DET_BUYER_SELLER_LEN));
   	}
     int localDetTradingXchngCounter = -1;
     public boolean isDetTradingXchngModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDetTradingXchngCounter != sharedCounter;
         localDetTradingXchngCounter = sharedCounter; return hasModified;
     }
	protected static final int DET_TRADING_XCHNG_LEN = 12;
	/**
	 * 	serialize this DetTradingXchng
	 */
   protected void serializeDetTradingXchng(char[] detTradingXchng) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(detTradingXchng,0,getStringValue(),beginDetTradingXchng,DET_TRADING_XCHNG_LEN);
       localDetTradingXchngCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDetTradingXchngConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshDetTradingXchng is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDetTradingXchng() {	 
   		return (substring(getStringValue(),beginDetTradingXchng,beginDetTradingXchng + DET_TRADING_XCHNG_LEN));
   	}
     int localDetFigiCounter = -1;
     public boolean isDetFigiModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDetFigiCounter != sharedCounter;
         localDetFigiCounter = sharedCounter; return hasModified;
     }
	protected static final int DET_FIGI_LEN = 12;
	/**
	 * 	serialize this DetFigi
	 */
   protected void serializeDetFigi(char[] detFigi) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(detFigi,0,getStringValue(),beginDetFigi,DET_FIGI_LEN);
       localDetFigiCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDetFigiConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshDetFigi is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDetFigi() {	 
   		return (substring(getStringValue(),beginDetFigi,beginDetFigi + DET_FIGI_LEN));
   	}
     int localDetSymbolCounter = -1;
     public boolean isDetSymbolModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDetSymbolCounter != sharedCounter;
         localDetSymbolCounter = sharedCounter; return hasModified;
     }
	protected static final int DET_SYMBOL_LEN = 20;
	/**
	 * 	serialize this DetSymbol
	 */
   protected void serializeDetSymbol(char[] detSymbol) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(detSymbol,0,getStringValue(),beginDetSymbol,DET_SYMBOL_LEN);
       localDetSymbolCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDetSymbolConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshDetSymbol is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDetSymbol() {	 
   		return (substring(getStringValue(),beginDetSymbol,beginDetSymbol + DET_SYMBOL_LEN));
   	}
     int localDetDescriptionCounter = -1;
     public boolean isDetDescriptionModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDetDescriptionCounter != sharedCounter;
         localDetDescriptionCounter = sharedCounter; return hasModified;
     }
	protected static final int DET_DESCRIPTION_LEN = 40;
	/**
	 * 	serialize this DetDescription
	 */
   protected void serializeDetDescription(char[] detDescription) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(detDescription,0,getStringValue(),beginDetDescription,DET_DESCRIPTION_LEN);
       localDetDescriptionCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDetDescriptionConstraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshDetDescription is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDetDescription() {	 
   		return (substring(getStringValue(),beginDetDescription,beginDetDescription + DET_DESCRIPTION_LEN));
   	}
     int localDetTypeCounter = -1;
     public boolean isDetTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDetTypeCounter != sharedCounter;
         localDetTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int DET_TYPE_LEN = 15;
	/**
	 * 	serialize this DetType
	 */
   protected void serializeDetType(char[] detType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(detType,0,getStringValue(),beginDetType,DET_TYPE_LEN);
       localDetTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDetTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshDetType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDetType() {	 
   		return (substring(getStringValue(),beginDetType,beginDetType + DET_TYPE_LEN));
   	}
     int localDetQuantityCounter = -1;
     public boolean isDetQuantityModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDetQuantityCounter != sharedCounter;
         localDetQuantityCounter = sharedCounter; return hasModified;
     }
	protected static final int DET_QUANTITY_LEN = 12;
	/**
	 * 	serialize this DetQuantity
	 */
   protected void serializeDetQuantity(char[] detQuantity) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(detQuantity,0,getStringValue(),beginDetQuantity,DET_QUANTITY_LEN);
       localDetQuantityCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDetQuantityConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshDetQuantity is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDetQuantity() {	 
   		return (substring(getStringValue(),beginDetQuantity,beginDetQuantity + DET_QUANTITY_LEN));
   	}
     int localDetCurrencyCounter = -1;
     public boolean isDetCurrencyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDetCurrencyCounter != sharedCounter;
         localDetCurrencyCounter = sharedCounter; return hasModified;
     }
	protected static final int DET_CURRENCY_LEN = 3;
	/**
	 * 	serialize this DetCurrency
	 */
   protected void serializeDetCurrency(char[] detCurrency) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(detCurrency,0,getStringValue(),beginDetCurrency,DET_CURRENCY_LEN);
       localDetCurrencyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDetCurrencyConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshDetCurrency is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDetCurrency() {	 
   		return (substring(getStringValue(),beginDetCurrency,beginDetCurrency + DET_CURRENCY_LEN));
   	}
     int localDetAmountCounter = -1;
     public boolean isDetAmountModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDetAmountCounter != sharedCounter;
         localDetAmountCounter = sharedCounter; return hasModified;
     }
	protected static final int DET_AMOUNT_LEN = 12;
	/**
	 * 	serialize this DetAmount
	 */
   protected void serializeDetAmount(char[] detAmount) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(detAmount,0,getStringValue(),beginDetAmount,DET_AMOUNT_LEN);
       localDetAmountCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDetAmountConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshDetAmount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDetAmount() {	 
   		return (substring(getStringValue(),beginDetAmount,beginDetAmount + DET_AMOUNT_LEN));
   	}




}
  
