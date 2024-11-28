package com.cloudframe.app.dto.serialize.trdpb000;

/**
*  The class CustomerSummaryRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-11-28 at 05:53. using version 5.0.0.158
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class CustomerSummaryRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CustomerSummaryRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CUSTOMER_SUMMARY_REC_LENGTH = 55;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSummaryCustomerId;
            protected  int beginSummaryOverdue;
            protected  int beginSummaryRejected;
            protected  int beginSummarySettled;
            protected  int beginSummaryCurrency;
            protected  int beginSummaryOpenBalance;
            protected  int beginSummaryTotalDebit;
            protected  int beginSummaryTotalCredit;
            protected  int beginSummaryCloseBalance;
	
	/**
	* Constructor for CustomerSummaryRecSerialized
	**/
    public CustomerSummaryRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in CustomerSummaryRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CUSTOMER_SUMMARY_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSummaryCustomerId = getStartOffset() + 0;	// set offset for serialization
  
             beginSummaryOverdue = getStartOffset() + 12;	// set offset for serialization
  
             beginSummaryRejected = getStartOffset() + 16;	// set offset for serialization
  
             beginSummarySettled = getStartOffset() + 20;	// set offset for serialization
  
             beginSummaryCurrency = getStartOffset() + 24;	// set offset for serialization
  
             beginSummaryOpenBalance = getStartOffset() + 27;	// set offset for serialization
  
             beginSummaryTotalDebit = getStartOffset() + 34;	// set offset for serialization
  
             beginSummaryTotalCredit = getStartOffset() + 41;	// set offset for serialization
  
             beginSummaryCloseBalance = getStartOffset() + 48;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSummaryCustomerIdCounter = -1;
     public boolean isSummaryCustomerIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSummaryCustomerIdCounter != sharedCounter;
         localSummaryCustomerIdCounter = sharedCounter; return hasModified;
     }
	protected static final int SUMMARY_CUSTOMER_ID_LEN = 12;
	/**
	 * 	serialize this SummaryCustomerId
	 */
   protected void serializeSummaryCustomerId(char[] summaryCustomerId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(summaryCustomerId,0,getStringValue(),beginSummaryCustomerId,SUMMARY_CUSTOMER_ID_LEN);
       localSummaryCustomerIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSummaryCustomerIdConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshSummaryCustomerId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSummaryCustomerId() {	 
   		return (substring(getStringValue(),beginSummaryCustomerId,beginSummaryCustomerId + SUMMARY_CUSTOMER_ID_LEN));
   	}
         int localSummaryOverdueCounter = -1;
         public boolean isSummaryOverdueModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSummaryOverdueCounter != sharedCounter;
            localSummaryOverdueCounter = sharedCounter; return hasModified; 
         }
   protected static final int SUMMARY_OVERDUE_LEN = 4;
  	/**
	 * serializeSummaryOverdue
	 */
	protected void serializeSummaryOverdue(int summaryOverdue) {
           replaceValue( //  save the value as string
                   getBinaryString( summaryOverdue,SUMMARY_OVERDUE_LEN)
                  ,beginSummaryOverdue
                  ,SUMMARY_OVERDUE_LEN
                 );
            localSummaryOverdueCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSummaryOverdueMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSummaryOverdue is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSummaryOverdue() {	 
			return (getInt(beginSummaryOverdue));
   	}
         int localSummaryRejectedCounter = -1;
         public boolean isSummaryRejectedModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSummaryRejectedCounter != sharedCounter;
            localSummaryRejectedCounter = sharedCounter; return hasModified; 
         }
   protected static final int SUMMARY_REJECTED_LEN = 4;
  	/**
	 * serializeSummaryRejected
	 */
	protected void serializeSummaryRejected(int summaryRejected) {
           replaceValue( //  save the value as string
                   getBinaryString( summaryRejected,SUMMARY_REJECTED_LEN)
                  ,beginSummaryRejected
                  ,SUMMARY_REJECTED_LEN
                 );
            localSummaryRejectedCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSummaryRejectedMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSummaryRejected is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSummaryRejected() {	 
			return (getInt(beginSummaryRejected));
   	}
         int localSummarySettledCounter = -1;
         public boolean isSummarySettledModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSummarySettledCounter != sharedCounter;
            localSummarySettledCounter = sharedCounter; return hasModified; 
         }
   protected static final int SUMMARY_SETTLED_LEN = 4;
  	/**
	 * serializeSummarySettled
	 */
	protected void serializeSummarySettled(int summarySettled) {
           replaceValue( //  save the value as string
                   getBinaryString( summarySettled,SUMMARY_SETTLED_LEN)
                  ,beginSummarySettled
                  ,SUMMARY_SETTLED_LEN
                 );
            localSummarySettledCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSummarySettledMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSummarySettled is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSummarySettled() {	 
			return (getInt(beginSummarySettled));
   	}
     int localSummaryCurrencyCounter = -1;
     public boolean isSummaryCurrencyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSummaryCurrencyCounter != sharedCounter;
         localSummaryCurrencyCounter = sharedCounter; return hasModified;
     }
	protected static final int SUMMARY_CURRENCY_LEN = 3;
	/**
	 * 	serialize this SummaryCurrency
	 */
   protected void serializeSummaryCurrency(char[] summaryCurrency) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(summaryCurrency,0,getStringValue(),beginSummaryCurrency,SUMMARY_CURRENCY_LEN);
       localSummaryCurrencyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSummaryCurrencyConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSummaryCurrency is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSummaryCurrency() {	 
   		return (substring(getStringValue(),beginSummaryCurrency,beginSummaryCurrency + SUMMARY_CURRENCY_LEN));
   	}
        int localSummaryOpenBalanceCounter = -1;
        public boolean isSummaryOpenBalanceModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSummaryOpenBalanceCounter != sharedCounter;
           localSummaryOpenBalanceCounter = sharedCounter; return hasModified; 
        }
	    public boolean summaryOpenBalanceIsNumeric() {
	      return decimalIsNumeric(beginSummaryOpenBalance,SUMMARY_OPEN_BALANCE_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] summaryOpenBalanceString() {
            return getPackedString(beginSummaryOpenBalance,SUMMARY_OPEN_BALANCE_LEN);
         }
   protected static final int SUMMARY_OPEN_BALANCE_LEN = 7;
   protected static final int SUMMARY_OPEN_BALANCE_SCALE = 2;
  	/**
	 * 	serializeSummaryOpenBalance
	 */
	protected void serializeSummaryOpenBalance(BigDecimal summaryOpenBalance) {
		   putDecimal(beginSummaryOpenBalance,summaryOpenBalance,SUMMARY_OPEN_BALANCE_LEN,SUMMARY_OPEN_BALANCE_SCALE,true);
		 localSummaryOpenBalanceCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSummaryOpenBalanceMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,12/*precision*/);
   }
     /**
	 *	refreshSummaryOpenBalance is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSummaryOpenBalance() throws CFException {	
   	try { 
		 return (getDecimal(beginSummaryOpenBalance,SUMMARY_OPEN_BALANCE_LEN,SUMMARY_OPEN_BALANCE_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("summaryOpenBalance", beginSummaryOpenBalance,SUMMARY_OPEN_BALANCE_LEN);
     }
   	}
        int localSummaryTotalDebitCounter = -1;
        public boolean isSummaryTotalDebitModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSummaryTotalDebitCounter != sharedCounter;
           localSummaryTotalDebitCounter = sharedCounter; return hasModified; 
        }
	    public boolean summaryTotalDebitIsNumeric() {
	      return decimalIsNumeric(beginSummaryTotalDebit,SUMMARY_TOTAL_DEBIT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] summaryTotalDebitString() {
            return getPackedString(beginSummaryTotalDebit,SUMMARY_TOTAL_DEBIT_LEN);
         }
   protected static final int SUMMARY_TOTAL_DEBIT_LEN = 7;
   protected static final int SUMMARY_TOTAL_DEBIT_SCALE = 2;
  	/**
	 * 	serializeSummaryTotalDebit
	 */
	protected void serializeSummaryTotalDebit(BigDecimal summaryTotalDebit) {
		   putDecimal(beginSummaryTotalDebit,summaryTotalDebit,SUMMARY_TOTAL_DEBIT_LEN,SUMMARY_TOTAL_DEBIT_SCALE,true);
		 localSummaryTotalDebitCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSummaryTotalDebitMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,12/*precision*/);
   }
     /**
	 *	refreshSummaryTotalDebit is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSummaryTotalDebit() throws CFException {	
   	try { 
		 return (getDecimal(beginSummaryTotalDebit,SUMMARY_TOTAL_DEBIT_LEN,SUMMARY_TOTAL_DEBIT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("summaryTotalDebit", beginSummaryTotalDebit,SUMMARY_TOTAL_DEBIT_LEN);
     }
   	}
        int localSummaryTotalCreditCounter = -1;
        public boolean isSummaryTotalCreditModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSummaryTotalCreditCounter != sharedCounter;
           localSummaryTotalCreditCounter = sharedCounter; return hasModified; 
        }
	    public boolean summaryTotalCreditIsNumeric() {
	      return decimalIsNumeric(beginSummaryTotalCredit,SUMMARY_TOTAL_CREDIT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] summaryTotalCreditString() {
            return getPackedString(beginSummaryTotalCredit,SUMMARY_TOTAL_CREDIT_LEN);
         }
   protected static final int SUMMARY_TOTAL_CREDIT_LEN = 7;
   protected static final int SUMMARY_TOTAL_CREDIT_SCALE = 2;
  	/**
	 * 	serializeSummaryTotalCredit
	 */
	protected void serializeSummaryTotalCredit(BigDecimal summaryTotalCredit) {
		   putDecimal(beginSummaryTotalCredit,summaryTotalCredit,SUMMARY_TOTAL_CREDIT_LEN,SUMMARY_TOTAL_CREDIT_SCALE,true);
		 localSummaryTotalCreditCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSummaryTotalCreditMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,12/*precision*/);
   }
     /**
	 *	refreshSummaryTotalCredit is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSummaryTotalCredit() throws CFException {	
   	try { 
		 return (getDecimal(beginSummaryTotalCredit,SUMMARY_TOTAL_CREDIT_LEN,SUMMARY_TOTAL_CREDIT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("summaryTotalCredit", beginSummaryTotalCredit,SUMMARY_TOTAL_CREDIT_LEN);
     }
   	}
        int localSummaryCloseBalanceCounter = -1;
        public boolean isSummaryCloseBalanceModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSummaryCloseBalanceCounter != sharedCounter;
           localSummaryCloseBalanceCounter = sharedCounter; return hasModified; 
        }
	    public boolean summaryCloseBalanceIsNumeric() {
	      return decimalIsNumeric(beginSummaryCloseBalance,SUMMARY_CLOSE_BALANCE_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] summaryCloseBalanceString() {
            return getPackedString(beginSummaryCloseBalance,SUMMARY_CLOSE_BALANCE_LEN);
         }
   protected static final int SUMMARY_CLOSE_BALANCE_LEN = 7;
   protected static final int SUMMARY_CLOSE_BALANCE_SCALE = 2;
  	/**
	 * 	serializeSummaryCloseBalance
	 */
	protected void serializeSummaryCloseBalance(BigDecimal summaryCloseBalance) {
		   putDecimal(beginSummaryCloseBalance,summaryCloseBalance,SUMMARY_CLOSE_BALANCE_LEN,SUMMARY_CLOSE_BALANCE_SCALE,true);
		 localSummaryCloseBalanceCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkSummaryCloseBalanceMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,12/*precision*/);
   }
     /**
	 *	refreshSummaryCloseBalance is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSummaryCloseBalance() throws CFException {	
   	try { 
		 return (getDecimal(beginSummaryCloseBalance,SUMMARY_CLOSE_BALANCE_LEN,SUMMARY_CLOSE_BALANCE_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("summaryCloseBalance", beginSummaryCloseBalance,SUMMARY_CLOSE_BALANCE_LEN);
     }
   	}




}
  
