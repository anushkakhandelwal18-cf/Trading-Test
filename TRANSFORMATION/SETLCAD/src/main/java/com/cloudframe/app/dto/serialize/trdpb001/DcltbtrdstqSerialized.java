package com.cloudframe.app.dto.serialize.trdpb001;

/**
*  The class DcltbtrdstqSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-03 at 13:44. using version 5.0.0.162
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DcltbtrdstqSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DcltbtrdstqSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DCLTBTRDSTQ_LENGTH = 95;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginStqCurrency;
            protected  int beginStqId;
            protected  int beginStqTradeData;
	
	/**
	* Constructor for DcltbtrdstqSerialized
	**/
    public DcltbtrdstqSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DcltbtrdstqSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DCLTBTRDSTQ_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginStqCurrency = getStartOffset() + 0;	// set offset for serialization
  
             beginStqId = getStartOffset() + 3;	// set offset for serialization
  
             beginStqTradeData = getStartOffset() + 7;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localStqCurrencyCounter = -1;
     public boolean isStqCurrencyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStqCurrencyCounter != sharedCounter;
         localStqCurrencyCounter = sharedCounter; return hasModified;
     }
	protected static final int STQ_CURRENCY_LEN = 3;
	/**
	 * 	serialize this StqCurrency
	 */
   protected void serializeStqCurrency(char[] stqCurrency) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(stqCurrency,0,getStringValue(),beginStqCurrency,STQ_CURRENCY_LEN);
       localStqCurrencyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkStqCurrencyConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshStqCurrency is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshStqCurrency() {	 
   		return (substring(getStringValue(),beginStqCurrency,beginStqCurrency + STQ_CURRENCY_LEN));
   	}
         int localStqIdCounter = -1;
         public boolean isStqIdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localStqIdCounter != sharedCounter;
            localStqIdCounter = sharedCounter; return hasModified; 
         }
   protected static final int STQ_ID_LEN = 4;
  	/**
	 * serializeStqId
	 */
	protected void serializeStqId(int stqId) {
           replaceValue( //  save the value as string
                   getBinaryString( stqId,STQ_ID_LEN)
                  ,beginStqId
                  ,STQ_ID_LEN
                 );
            localStqIdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkStqIdMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshStqId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshStqId() {	 
			return (getInt(beginStqId));
   	}
     int localStqTradeDataCounter = -1;
     public boolean isStqTradeDataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStqTradeDataCounter != sharedCounter;
         localStqTradeDataCounter = sharedCounter; return hasModified;
     }
	protected static final int STQ_TRADE_DATA_LEN = 88;
	/**
	 * 	serialize this StqTradeData
	 */
   protected void serializeStqTradeData(char[] stqTradeData) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(stqTradeData,0,getStringValue(),beginStqTradeData,STQ_TRADE_DATA_LEN);
       localStqTradeDataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkStqTradeDataConstraints(char[] value) {
   			return super.checkConstraints(value , 88 ,false, false);
   }
    /**
	 *	refreshStqTradeData is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshStqTradeData() {	 
   		return (substring(getStringValue(),beginStqTradeData,beginStqTradeData + STQ_TRADE_DATA_LEN));
   	}




}
  
