package com.cloudframe.app.dto.trdpb000;

/**
*  The class CustomerSummaryRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-03 at 13:43. using version 5.0.0.162
**/


import com.cloudframe.app.dto.serialize.trdpb000.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import com.cloudframe.app.common.CONSTANTS;


public class CustomerSummaryRec extends CustomerSummaryRecSerialized { 
   

						private char[] summaryCustomerId = Field.fillLowValue(12);

								private int summaryOverdue;

								private int summaryRejected;

								private int summarySettled;

						private char[] summaryCurrency = Field.fillLowValue(3);

								private BigDecimal summaryOpenBalance = BigDecimal.ZERO;

								private BigDecimal summaryTotalDebit = BigDecimal.ZERO;

								private BigDecimal summaryTotalCredit = BigDecimal.ZERO;

								private BigDecimal summaryCloseBalance = BigDecimal.ZERO;
	
	/**
	* Constructor for CustomerSummaryRec
	**/
    public CustomerSummaryRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of summaryCustomerId
	 *	@return summaryCustomerId
	 */
   public char[] getSummaryCustomerId() throws CFException{
     if (isSummaryCustomerIdModified()) { 
        summaryCustomerId = refreshSummaryCustomerId();
     }
   		return summaryCustomerId;
   }

  
	/**
	*  set variable summaryCustomerId
	*  Corresponding COBOL Variable is WS-SUMMARY-CUSTOMER-ID
	*  @param value
	**/
   public void setSummaryCustomerId(char[] value) {
      summaryCustomerId = checkSummaryCustomerIdConstraints(value);
      serializeSummaryCustomerId(summaryCustomerId);
   } 

     /**
	 * 	Update SummaryCustomerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSummaryCustomerId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSummaryCustomerId,summaryCustomerId.length);
   	
   }
   
   public void setSummaryCustomerId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSummaryCustomerId,summaryCustomerId.length);
   	
   }
   
     /**
	 * 	Update SummaryCustomerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSummaryCustomerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSummaryCustomerId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SummaryCustomerId with another Field
	 *	@param value
	 */
   public void setSummaryCustomerId(Field source) {
       replace(source,0,source.length(),beginSummaryCustomerId,SUMMARY_CUSTOMER_ID_LEN);
   	
   }  
   
     /**
	 * 	Update SummaryCustomerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSummaryCustomerId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSummaryCustomerId,SUMMARY_CUSTOMER_ID_LEN);
   	
   }
   
     /**
	 * 	Update SummaryCustomerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSummaryCustomerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSummaryCustomerId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of summaryOverdue
	 *	@return summaryOverdue
	 */
	public int getSummaryOverdue() throws CFException {
        if (isSummaryOverdueModified()) { 
           summaryOverdue = refreshSummaryOverdue();
        }
   		return summaryOverdue;
	}
	
	/**
	 * 	Update SummaryOverdue with the passed value
	 *  Corresponding COBOL Variable is WS-SUMMARY-OVERDUE
	 *	@param number
	 */
	public void setSummaryOverdue(int number) {
	     // Truncate if the number is beyond +/- Max range
	    summaryOverdue = checkSummaryOverdueMaxLimit(number); 
		serializeSummaryOverdue(summaryOverdue);
	}


	public void setSummaryOverdue(long number) {
	    number = checkSummaryOverdueMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSummaryOverdue((int)number);
	}
	
	/**
	 *	Returns the value of summaryRejected
	 *	@return summaryRejected
	 */
	public int getSummaryRejected() throws CFException {
        if (isSummaryRejectedModified()) { 
           summaryRejected = refreshSummaryRejected();
        }
   		return summaryRejected;
	}
	
	/**
	 * 	Update SummaryRejected with the passed value
	 *  Corresponding COBOL Variable is WS-SUMMARY-REJECTED
	 *	@param number
	 */
	public void setSummaryRejected(int number) {
	     // Truncate if the number is beyond +/- Max range
	    summaryRejected = checkSummaryRejectedMaxLimit(number); 
		serializeSummaryRejected(summaryRejected);
	}


	public void setSummaryRejected(long number) {
	    number = checkSummaryRejectedMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSummaryRejected((int)number);
	}
	
	/**
	 *	Returns the value of summarySettled
	 *	@return summarySettled
	 */
	public int getSummarySettled() throws CFException {
        if (isSummarySettledModified()) { 
           summarySettled = refreshSummarySettled();
        }
   		return summarySettled;
	}
	
	/**
	 * 	Update SummarySettled with the passed value
	 *  Corresponding COBOL Variable is WS-SUMMARY-SETTLED
	 *	@param number
	 */
	public void setSummarySettled(int number) {
	     // Truncate if the number is beyond +/- Max range
	    summarySettled = checkSummarySettledMaxLimit(number); 
		serializeSummarySettled(summarySettled);
	}


	public void setSummarySettled(long number) {
	    number = checkSummarySettledMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSummarySettled((int)number);
	}
	
	/**
	 *	Returns the value of summaryCurrency
	 *	@return summaryCurrency
	 */
   public char[] getSummaryCurrency() throws CFException{
     if (isSummaryCurrencyModified()) { 
        summaryCurrency = refreshSummaryCurrency();
     }
   		return summaryCurrency;
   }

  
	/**
	*  set variable summaryCurrency
	*  Corresponding COBOL Variable is WS-SUMMARY-CURRENCY
	*  @param value
	**/
   public void setSummaryCurrency(char[] value) {
      summaryCurrency = checkSummaryCurrencyConstraints(value);
      serializeSummaryCurrency(summaryCurrency);
   } 

     /**
	 * 	Update SummaryCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSummaryCurrency(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSummaryCurrency,summaryCurrency.length);
   	
   }
   
   public void setSummaryCurrency(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSummaryCurrency,summaryCurrency.length);
   	
   }
   
     /**
	 * 	Update SummaryCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSummaryCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSummaryCurrency+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SummaryCurrency with another Field
	 *	@param value
	 */
   public void setSummaryCurrency(Field source) {
       replace(source,0,source.length(),beginSummaryCurrency,SUMMARY_CURRENCY_LEN);
   	
   }  
   
     /**
	 * 	Update SummaryCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSummaryCurrency(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSummaryCurrency,SUMMARY_CURRENCY_LEN);
   	
   }
   
     /**
	 * 	Update SummaryCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSummaryCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSummaryCurrency+targetIndex,targetLen);
    
   }
	public BigDecimal getSummaryOpenBalance() throws CFException {
        if (isSummaryOpenBalanceModified()) { 
           summaryOpenBalance = refreshSummaryOpenBalance();
        }
   		return summaryOpenBalance;
	}

    public char[] getSummaryOpenBalanceString() {
          return  summaryOpenBalanceString();
    }
	
	/**
	 * 	Update SummaryOpenBalance with the passed number
	 *  Corresponding COBOL Variable is WS-SUMMARY-OPEN-BALANCE
	 *	@param number
	 */
	public void setSummaryOpenBalance(BigDecimal number) {	
     summaryOpenBalance = checkSummaryOpenBalanceMaxLimit(number);
	    serializeSummaryOpenBalance(summaryOpenBalance);
   }
	public BigDecimal getSummaryTotalDebit() throws CFException {
        if (isSummaryTotalDebitModified()) { 
           summaryTotalDebit = refreshSummaryTotalDebit();
        }
   		return summaryTotalDebit;
	}

    public char[] getSummaryTotalDebitString() {
          return  summaryTotalDebitString();
    }
	
	/**
	 * 	Update SummaryTotalDebit with the passed number
	 *  Corresponding COBOL Variable is WS-SUMMARY-TOTAL-DEBIT
	 *	@param number
	 */
	public void setSummaryTotalDebit(BigDecimal number) {	
     summaryTotalDebit = checkSummaryTotalDebitMaxLimit(number);
	    serializeSummaryTotalDebit(summaryTotalDebit);
   }
	public BigDecimal getSummaryTotalCredit() throws CFException {
        if (isSummaryTotalCreditModified()) { 
           summaryTotalCredit = refreshSummaryTotalCredit();
        }
   		return summaryTotalCredit;
	}

    public char[] getSummaryTotalCreditString() {
          return  summaryTotalCreditString();
    }
	
	/**
	 * 	Update SummaryTotalCredit with the passed number
	 *  Corresponding COBOL Variable is WS-SUMMARY-TOTAL-CREDIT
	 *	@param number
	 */
	public void setSummaryTotalCredit(BigDecimal number) {	
     summaryTotalCredit = checkSummaryTotalCreditMaxLimit(number);
	    serializeSummaryTotalCredit(summaryTotalCredit);
   }
	public BigDecimal getSummaryCloseBalance() throws CFException {
        if (isSummaryCloseBalanceModified()) { 
           summaryCloseBalance = refreshSummaryCloseBalance();
        }
   		return summaryCloseBalance;
	}

    public char[] getSummaryCloseBalanceString() {
          return  summaryCloseBalanceString();
    }
	
	/**
	 * 	Update SummaryCloseBalance with the passed number
	 *  Corresponding COBOL Variable is WS-SUMMARY-CLOSE-BALANCE
	 *	@param number
	 */
	public void setSummaryCloseBalance(BigDecimal number) {	
     summaryCloseBalance = checkSummaryCloseBalanceMaxLimit(number);
	    serializeSummaryCloseBalance(summaryCloseBalance);
   }

	
	
	
	/**
	 * 	initializes CustomerSummaryRec
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setSummaryCustomerId(CONSTANTS.SPACE_12);
                     setSummaryOverdue(0);
                     setSummaryRejected(0);
                     setSummarySettled(0);
         setSummaryCurrency(CONSTANTS.SPACE_3);
			setSummaryOpenBalance(BigDecimal.ZERO);
			setSummaryTotalDebit(BigDecimal.ZERO);
			setSummaryTotalCredit(BigDecimal.ZERO);
			setSummaryCloseBalance(BigDecimal.ZERO);
   }

		public static int getCustomerSummaryRecFieldLength() {
			return CUSTOMER_SUMMARY_REC_LENGTH;
		}

}
  
