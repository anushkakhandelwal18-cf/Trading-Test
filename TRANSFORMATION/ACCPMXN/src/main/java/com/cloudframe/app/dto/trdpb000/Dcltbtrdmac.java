package com.cloudframe.app.dto.trdpb000;

/**
*  The class Dcltbtrdmac is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-03 at 15:06. using version 5.0.0.163
**/


import com.cloudframe.app.dto.serialize.trdpb000.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


public class Dcltbtrdmac extends DcltbtrdmacSerialized { 
   

						private char[] macCurrency = Field.fillLowValue(3);

								private int macNumber;

						private char[] macCustomerId = Field.fillLowValue(12);

								private BigDecimal macBalance = BigDecimal.ZERO;

						private char[] macStatus = Field.fillLowValue(1);
	
	/**
	* Constructor for Dcltbtrdmac
	**/
    public Dcltbtrdmac() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of macCurrency
	 *	@return macCurrency
	 */
   public char[] getMacCurrency() throws CFException{
     if (isMacCurrencyModified()) { 
        macCurrency = refreshMacCurrency();
     }
   		return macCurrency;
   }

  
	/**
	*  set variable macCurrency
	*  Corresponding COBOL Variable is MAC-CURRENCY
	*  @param value
	**/
   public void setMacCurrency(char[] value) {
      macCurrency = checkMacCurrencyConstraints(value);
      serializeMacCurrency(macCurrency);
   } 

     /**
	 * 	Update MacCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMacCurrency(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMacCurrency,macCurrency.length);
   	
   }
   
   public void setMacCurrency(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMacCurrency,macCurrency.length);
   	
   }
   
     /**
	 * 	Update MacCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMacCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMacCurrency+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MacCurrency with another Field
	 *	@param value
	 */
   public void setMacCurrency(Field source) {
       replace(source,0,source.length(),beginMacCurrency,MAC_CURRENCY_LEN);
   	
   }  
   
     /**
	 * 	Update MacCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMacCurrency(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMacCurrency,MAC_CURRENCY_LEN);
   	
   }
   
     /**
	 * 	Update MacCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMacCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMacCurrency+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of macNumber
	 *	@return macNumber
	 */
	public int getMacNumber() throws CFException {
        if (isMacNumberModified()) { 
           macNumber = refreshMacNumber();
        }
   		return macNumber;
	}
	
	/**
	 * 	Update MacNumber with the passed value
	 *  Corresponding COBOL Variable is MAC-NUMBER
	 *	@param number
	 */
	public void setMacNumber(int number) {
	     // Truncate if the number is beyond +/- Max range
	    macNumber = checkMacNumberMaxLimit(number); 
		serializeMacNumber(macNumber);
	}


	public void setMacNumber(long number) {
	    number = checkMacNumberMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMacNumber((int)number);
	}
	
	/**
	 *	Returns the value of macCustomerId
	 *	@return macCustomerId
	 */
   public char[] getMacCustomerId() throws CFException{
     if (isMacCustomerIdModified()) { 
        macCustomerId = refreshMacCustomerId();
     }
   		return macCustomerId;
   }

  
	/**
	*  set variable macCustomerId
	*  Corresponding COBOL Variable is MAC-CUSTOMER-ID
	*  @param value
	**/
   public void setMacCustomerId(char[] value) {
      macCustomerId = checkMacCustomerIdConstraints(value);
      serializeMacCustomerId(macCustomerId);
   } 

     /**
	 * 	Update MacCustomerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMacCustomerId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMacCustomerId,macCustomerId.length);
   	
   }
   
   public void setMacCustomerId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMacCustomerId,macCustomerId.length);
   	
   }
   
     /**
	 * 	Update MacCustomerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMacCustomerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMacCustomerId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MacCustomerId with another Field
	 *	@param value
	 */
   public void setMacCustomerId(Field source) {
       replace(source,0,source.length(),beginMacCustomerId,MAC_CUSTOMER_ID_LEN);
   	
   }  
   
     /**
	 * 	Update MacCustomerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMacCustomerId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMacCustomerId,MAC_CUSTOMER_ID_LEN);
   	
   }
   
     /**
	 * 	Update MacCustomerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMacCustomerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMacCustomerId+targetIndex,targetLen);
    
   }
	public BigDecimal getMacBalance() throws CFException {
        if (isMacBalanceModified()) { 
           macBalance = refreshMacBalance();
        }
   		return macBalance;
	}

    public char[] getMacBalanceString() {
          return  macBalanceString();
    }
	
	/**
	 * 	Update MacBalance with the passed number
	 *  Corresponding COBOL Variable is MAC-BALANCE
	 *	@param number
	 */
	public void setMacBalance(BigDecimal number) {	
     macBalance = checkMacBalanceMaxLimit(number);
	    serializeMacBalance(macBalance);
   }
	/**
	 *	Returns the value of macStatus
	 *	@return macStatus
	 */
   public char[] getMacStatus() throws CFException{
     if (isMacStatusModified()) { 
        macStatus = refreshMacStatus();
     }
   		return macStatus;
   }

  
	/**
	*  set variable macStatus
	*  Corresponding COBOL Variable is MAC-STATUS
	*  @param value
	**/
   public void setMacStatus(char[] value) {
      macStatus = checkMacStatusConstraints(value);
      serializeMacStatus(macStatus);
   } 

     /**
	 * 	Update MacStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMacStatus(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMacStatus,macStatus.length);
   	
   }
   
   public void setMacStatus(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMacStatus,macStatus.length);
   	
   }
   
     /**
	 * 	Update MacStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMacStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMacStatus+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MacStatus with another Field
	 *	@param value
	 */
   public void setMacStatus(Field source) {
       replace(source,0,source.length(),beginMacStatus,MAC_STATUS_LEN);
   	
   }  
   
     /**
	 * 	Update MacStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMacStatus(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMacStatus,MAC_STATUS_LEN);
   	
   }
   
     /**
	 * 	Update MacStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMacStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMacStatus+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDcltbtrdmacFieldLength() {
			return DCLTBTRDMAC_LENGTH;
		}

}
  
