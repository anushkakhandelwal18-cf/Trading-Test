package com.cloudframe.app.dto.serialize.trdpb000;

/**
*  The class DcltbtrdmacSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-03 at 13:42. using version 5.0.0.162
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class DcltbtrdmacSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DcltbtrdmacSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DCLTBTRDMAC_LENGTH = 27;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMacCurrency;
            protected  int beginMacNumber;
            protected  int beginMacCustomerId;
            protected  int beginMacBalance;
            protected  int beginMacStatus;
	
	/**
	* Constructor for DcltbtrdmacSerialized
	**/
    public DcltbtrdmacSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DcltbtrdmacSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DCLTBTRDMAC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMacCurrency = getStartOffset() + 0;	// set offset for serialization
  
             beginMacNumber = getStartOffset() + 3;	// set offset for serialization
  
             beginMacCustomerId = getStartOffset() + 7;	// set offset for serialization
  
             beginMacBalance = getStartOffset() + 19;	// set offset for serialization
  
             beginMacStatus = getStartOffset() + 26;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMacCurrencyCounter = -1;
     public boolean isMacCurrencyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMacCurrencyCounter != sharedCounter;
         localMacCurrencyCounter = sharedCounter; return hasModified;
     }
	protected static final int MAC_CURRENCY_LEN = 3;
	/**
	 * 	serialize this MacCurrency
	 */
   protected void serializeMacCurrency(char[] macCurrency) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(macCurrency,0,getStringValue(),beginMacCurrency,MAC_CURRENCY_LEN);
       localMacCurrencyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMacCurrencyConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshMacCurrency is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMacCurrency() {	 
   		return (substring(getStringValue(),beginMacCurrency,beginMacCurrency + MAC_CURRENCY_LEN));
   	}
         int localMacNumberCounter = -1;
         public boolean isMacNumberModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMacNumberCounter != sharedCounter;
            localMacNumberCounter = sharedCounter; return hasModified; 
         }
   protected static final int MAC_NUMBER_LEN = 4;
  	/**
	 * serializeMacNumber
	 */
	protected void serializeMacNumber(int macNumber) {
           replaceValue( //  save the value as string
                   getBinaryString( macNumber,MAC_NUMBER_LEN)
                  ,beginMacNumber
                  ,MAC_NUMBER_LEN
                 );
            localMacNumberCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMacNumberMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMacNumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMacNumber() {	 
			return (getInt(beginMacNumber));
   	}
     int localMacCustomerIdCounter = -1;
     public boolean isMacCustomerIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMacCustomerIdCounter != sharedCounter;
         localMacCustomerIdCounter = sharedCounter; return hasModified;
     }
	protected static final int MAC_CUSTOMER_ID_LEN = 12;
	/**
	 * 	serialize this MacCustomerId
	 */
   protected void serializeMacCustomerId(char[] macCustomerId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(macCustomerId,0,getStringValue(),beginMacCustomerId,MAC_CUSTOMER_ID_LEN);
       localMacCustomerIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMacCustomerIdConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshMacCustomerId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMacCustomerId() {	 
   		return (substring(getStringValue(),beginMacCustomerId,beginMacCustomerId + MAC_CUSTOMER_ID_LEN));
   	}
        int localMacBalanceCounter = -1;
        public boolean isMacBalanceModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localMacBalanceCounter != sharedCounter;
           localMacBalanceCounter = sharedCounter; return hasModified; 
        }
	    public boolean macBalanceIsNumeric() {
	      return decimalIsNumeric(beginMacBalance,MAC_BALANCE_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] macBalanceString() {
            return getPackedString(beginMacBalance,MAC_BALANCE_LEN);
         }
   protected static final int MAC_BALANCE_LEN = 7;
   protected static final int MAC_BALANCE_SCALE = 2;
  	/**
	 * 	serializeMacBalance
	 */
	protected void serializeMacBalance(BigDecimal macBalance) {
		   putDecimal(beginMacBalance,macBalance,MAC_BALANCE_LEN,MAC_BALANCE_SCALE,true);
		 localMacBalanceCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkMacBalanceMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,12/*precision*/);
   }
     /**
	 *	refreshMacBalance is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshMacBalance() throws CFException {	
   	try { 
		 return (getDecimal(beginMacBalance,MAC_BALANCE_LEN,MAC_BALANCE_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("macBalance", beginMacBalance,MAC_BALANCE_LEN);
     }
   	}
     int localMacStatusCounter = -1;
     public boolean isMacStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMacStatusCounter != sharedCounter;
         localMacStatusCounter = sharedCounter; return hasModified;
     }
	protected static final int MAC_STATUS_LEN = 1;
	/**
	 * 	serialize this MacStatus
	 */
   protected void serializeMacStatus(char[] macStatus) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(macStatus,0,getStringValue(),beginMacStatus,MAC_STATUS_LEN);
       localMacStatusCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMacStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMacStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMacStatus() {	 
   		return (substring(getStringValue(),beginMacStatus,beginMacStatus + MAC_STATUS_LEN));
   	}




}
  
