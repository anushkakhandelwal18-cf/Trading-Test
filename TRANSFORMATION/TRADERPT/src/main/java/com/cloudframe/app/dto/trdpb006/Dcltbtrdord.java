package com.cloudframe.app.dto.trdpb006;

/**
*  The class Dcltbtrdord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-11 at 04:18. using version 5.0.0.163
**/


import com.cloudframe.app.dto.serialize.trdpb006.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


public class Dcltbtrdord extends DcltbtrdordSerialized { 
   

						private char[] ordTradingXchng = Field.fillLowValue(10);

						private char[] ordTradeid = Field.fillLowValue(12);

						private char[] ordBuySellInd = Field.fillLowValue(1);

						private char[] ordCustomerId = Field.fillLowValue(12);

						private char[] ordFigi = Field.fillLowValue(12);

								private BigDecimal ordQuantity = BigDecimal.ZERO;

						private char[] ordCurrency = Field.fillLowValue(3);

								private BigDecimal ordAmount = BigDecimal.ZERO;

						private char[] ordStatus = Field.fillLowValue(3);
	
	/**
	* Constructor for Dcltbtrdord
	**/
    public Dcltbtrdord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ordTradingXchng
	 *	@return ordTradingXchng
	 */
   public char[] getOrdTradingXchng() throws CFException{
     if (isOrdTradingXchngModified()) { 
        ordTradingXchng = refreshOrdTradingXchng();
     }
   		return ordTradingXchng;
   }

  
	/**
	*  set variable ordTradingXchng
	*  Corresponding COBOL Variable is ORD-TRADING-XCHNG
	*  @param value
	**/
   public void setOrdTradingXchng(char[] value) {
      ordTradingXchng = checkOrdTradingXchngConstraints(value);
      serializeOrdTradingXchng(ordTradingXchng);
   } 

     /**
	 * 	Update OrdTradingXchng 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOrdTradingXchng(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOrdTradingXchng,ordTradingXchng.length);
   	
   }
   
   public void setOrdTradingXchng(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOrdTradingXchng,ordTradingXchng.length);
   	
   }
   
     /**
	 * 	Update OrdTradingXchng 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOrdTradingXchng(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOrdTradingXchng+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update OrdTradingXchng with another Field
	 *	@param value
	 */
   public void setOrdTradingXchng(Field source) {
       replace(source,0,source.length(),beginOrdTradingXchng,ORD_TRADING_XCHNG_LEN);
   	
   }  
   
     /**
	 * 	Update OrdTradingXchng 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOrdTradingXchng(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOrdTradingXchng,ORD_TRADING_XCHNG_LEN);
   	
   }
   
     /**
	 * 	Update OrdTradingXchng 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOrdTradingXchng(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOrdTradingXchng+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ordTradeid
	 *	@return ordTradeid
	 */
   public char[] getOrdTradeid() throws CFException{
     if (isOrdTradeidModified()) { 
        ordTradeid = refreshOrdTradeid();
     }
   		return ordTradeid;
   }

  
	/**
	*  set variable ordTradeid
	*  Corresponding COBOL Variable is ORD-TRADEID
	*  @param value
	**/
   public void setOrdTradeid(char[] value) {
      ordTradeid = checkOrdTradeidConstraints(value);
      serializeOrdTradeid(ordTradeid);
   } 

     /**
	 * 	Update OrdTradeid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOrdTradeid(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOrdTradeid,ordTradeid.length);
   	
   }
   
   public void setOrdTradeid(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOrdTradeid,ordTradeid.length);
   	
   }
   
     /**
	 * 	Update OrdTradeid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOrdTradeid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOrdTradeid+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update OrdTradeid with another Field
	 *	@param value
	 */
   public void setOrdTradeid(Field source) {
       replace(source,0,source.length(),beginOrdTradeid,ORD_TRADEID_LEN);
   	
   }  
   
     /**
	 * 	Update OrdTradeid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOrdTradeid(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOrdTradeid,ORD_TRADEID_LEN);
   	
   }
   
     /**
	 * 	Update OrdTradeid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOrdTradeid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOrdTradeid+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ordBuySellInd
	 *	@return ordBuySellInd
	 */
   public char[] getOrdBuySellInd() throws CFException{
     if (isOrdBuySellIndModified()) { 
        ordBuySellInd = refreshOrdBuySellInd();
     }
   		return ordBuySellInd;
   }

  
	/**
	*  set variable ordBuySellInd
	*  Corresponding COBOL Variable is ORD-BUY-SELL-IND
	*  @param value
	**/
   public void setOrdBuySellInd(char[] value) {
      ordBuySellInd = checkOrdBuySellIndConstraints(value);
      serializeOrdBuySellInd(ordBuySellInd);
   } 

     /**
	 * 	Update OrdBuySellInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOrdBuySellInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOrdBuySellInd,ordBuySellInd.length);
   	
   }
   
   public void setOrdBuySellInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOrdBuySellInd,ordBuySellInd.length);
   	
   }
   
     /**
	 * 	Update OrdBuySellInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOrdBuySellInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOrdBuySellInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update OrdBuySellInd with another Field
	 *	@param value
	 */
   public void setOrdBuySellInd(Field source) {
       replace(source,0,source.length(),beginOrdBuySellInd,ORD_BUY_SELL_IND_LEN);
   	
   }  
   
     /**
	 * 	Update OrdBuySellInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOrdBuySellInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOrdBuySellInd,ORD_BUY_SELL_IND_LEN);
   	
   }
   
     /**
	 * 	Update OrdBuySellInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOrdBuySellInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOrdBuySellInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ordCustomerId
	 *	@return ordCustomerId
	 */
   public char[] getOrdCustomerId() throws CFException{
     if (isOrdCustomerIdModified()) { 
        ordCustomerId = refreshOrdCustomerId();
     }
   		return ordCustomerId;
   }

  
	/**
	*  set variable ordCustomerId
	*  Corresponding COBOL Variable is ORD-CUSTOMER-ID
	*  @param value
	**/
   public void setOrdCustomerId(char[] value) {
      ordCustomerId = checkOrdCustomerIdConstraints(value);
      serializeOrdCustomerId(ordCustomerId);
   } 

     /**
	 * 	Update OrdCustomerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOrdCustomerId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOrdCustomerId,ordCustomerId.length);
   	
   }
   
   public void setOrdCustomerId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOrdCustomerId,ordCustomerId.length);
   	
   }
   
     /**
	 * 	Update OrdCustomerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOrdCustomerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOrdCustomerId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update OrdCustomerId with another Field
	 *	@param value
	 */
   public void setOrdCustomerId(Field source) {
       replace(source,0,source.length(),beginOrdCustomerId,ORD_CUSTOMER_ID_LEN);
   	
   }  
   
     /**
	 * 	Update OrdCustomerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOrdCustomerId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOrdCustomerId,ORD_CUSTOMER_ID_LEN);
   	
   }
   
     /**
	 * 	Update OrdCustomerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOrdCustomerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOrdCustomerId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ordFigi
	 *	@return ordFigi
	 */
   public char[] getOrdFigi() throws CFException{
     if (isOrdFigiModified()) { 
        ordFigi = refreshOrdFigi();
     }
   		return ordFigi;
   }

  
	/**
	*  set variable ordFigi
	*  Corresponding COBOL Variable is ORD-FIGI
	*  @param value
	**/
   public void setOrdFigi(char[] value) {
      ordFigi = checkOrdFigiConstraints(value);
      serializeOrdFigi(ordFigi);
   } 

     /**
	 * 	Update OrdFigi 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOrdFigi(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOrdFigi,ordFigi.length);
   	
   }
   
   public void setOrdFigi(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOrdFigi,ordFigi.length);
   	
   }
   
     /**
	 * 	Update OrdFigi 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOrdFigi(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOrdFigi+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update OrdFigi with another Field
	 *	@param value
	 */
   public void setOrdFigi(Field source) {
       replace(source,0,source.length(),beginOrdFigi,ORD_FIGI_LEN);
   	
   }  
   
     /**
	 * 	Update OrdFigi 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOrdFigi(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOrdFigi,ORD_FIGI_LEN);
   	
   }
   
     /**
	 * 	Update OrdFigi 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOrdFigi(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOrdFigi+targetIndex,targetLen);
    
   }
	public BigDecimal getOrdQuantity() throws CFException {
        if (isOrdQuantityModified()) { 
           ordQuantity = refreshOrdQuantity();
        }
   		return ordQuantity;
	}

    public char[] getOrdQuantityString() {
          return  ordQuantityString();
    }
	
	/**
	 * 	Update OrdQuantity with the passed number
	 *  Corresponding COBOL Variable is ORD-QUANTITY
	 *	@param number
	 */
	public void setOrdQuantity(BigDecimal number) {	
     ordQuantity = checkOrdQuantityMaxLimit(number);
	    serializeOrdQuantity(ordQuantity);
   }
	/**
	 *	Returns the value of ordCurrency
	 *	@return ordCurrency
	 */
   public char[] getOrdCurrency() throws CFException{
     if (isOrdCurrencyModified()) { 
        ordCurrency = refreshOrdCurrency();
     }
   		return ordCurrency;
   }

  
	/**
	*  set variable ordCurrency
	*  Corresponding COBOL Variable is ORD-CURRENCY
	*  @param value
	**/
   public void setOrdCurrency(char[] value) {
      ordCurrency = checkOrdCurrencyConstraints(value);
      serializeOrdCurrency(ordCurrency);
   } 

     /**
	 * 	Update OrdCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOrdCurrency(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOrdCurrency,ordCurrency.length);
   	
   }
   
   public void setOrdCurrency(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOrdCurrency,ordCurrency.length);
   	
   }
   
     /**
	 * 	Update OrdCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOrdCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOrdCurrency+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update OrdCurrency with another Field
	 *	@param value
	 */
   public void setOrdCurrency(Field source) {
       replace(source,0,source.length(),beginOrdCurrency,ORD_CURRENCY_LEN);
   	
   }  
   
     /**
	 * 	Update OrdCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOrdCurrency(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOrdCurrency,ORD_CURRENCY_LEN);
   	
   }
   
     /**
	 * 	Update OrdCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOrdCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOrdCurrency+targetIndex,targetLen);
    
   }
	public BigDecimal getOrdAmount() throws CFException {
        if (isOrdAmountModified()) { 
           ordAmount = refreshOrdAmount();
        }
   		return ordAmount;
	}

    public char[] getOrdAmountString() {
          return  ordAmountString();
    }
	
	/**
	 * 	Update OrdAmount with the passed number
	 *  Corresponding COBOL Variable is ORD-AMOUNT
	 *	@param number
	 */
	public void setOrdAmount(BigDecimal number) {	
     ordAmount = checkOrdAmountMaxLimit(number);
	    serializeOrdAmount(ordAmount);
   }
	/**
	 *	Returns the value of ordStatus
	 *	@return ordStatus
	 */
   public char[] getOrdStatus() throws CFException{
     if (isOrdStatusModified()) { 
        ordStatus = refreshOrdStatus();
     }
   		return ordStatus;
   }

  
	/**
	*  set variable ordStatus
	*  Corresponding COBOL Variable is ORD-STATUS
	*  @param value
	**/
   public void setOrdStatus(char[] value) {
      ordStatus = checkOrdStatusConstraints(value);
      serializeOrdStatus(ordStatus);
   } 

     /**
	 * 	Update OrdStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOrdStatus(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOrdStatus,ordStatus.length);
   	
   }
   
   public void setOrdStatus(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOrdStatus,ordStatus.length);
   	
   }
   
     /**
	 * 	Update OrdStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOrdStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOrdStatus+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update OrdStatus with another Field
	 *	@param value
	 */
   public void setOrdStatus(Field source) {
       replace(source,0,source.length(),beginOrdStatus,ORD_STATUS_LEN);
   	
   }  
   
     /**
	 * 	Update OrdStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOrdStatus(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOrdStatus,ORD_STATUS_LEN);
   	
   }
   
     /**
	 * 	Update OrdStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOrdStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOrdStatus+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDcltbtrdordFieldLength() {
			return DCLTBTRDORD_LENGTH;
		}

}
  
