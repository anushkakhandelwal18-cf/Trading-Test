package com.cloudframe.app.dto.trdpb001;

/**
*  The class Dcltbtrdstq is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-02 at 13:43. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.trdpb001.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Dcltbtrdstq extends DcltbtrdstqSerialized { 
   

						private char[] stqCurrency = Field.fillLowValue(3);

								private int stqId;

						private char[] stqTradeData = Field.fillLowValue(88);
	
	/**
	* Constructor for Dcltbtrdstq
	**/
    public Dcltbtrdstq() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of stqCurrency
	 *	@return stqCurrency
	 */
   public char[] getStqCurrency() throws CFException{
     if (isStqCurrencyModified()) { 
        stqCurrency = refreshStqCurrency();
     }
   		return stqCurrency;
   }

  
	/**
	*  set variable stqCurrency
	*  Corresponding COBOL Variable is STQ-CURRENCY
	*  @param value
	**/
   public void setStqCurrency(char[] value) {
      stqCurrency = checkStqCurrencyConstraints(value);
      serializeStqCurrency(stqCurrency);
   } 

     /**
	 * 	Update StqCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setStqCurrency(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginStqCurrency,stqCurrency.length);
   	
   }
   
   public void setStqCurrency(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginStqCurrency,stqCurrency.length);
   	
   }
   
     /**
	 * 	Update StqCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStqCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStqCurrency+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update StqCurrency with another Field
	 *	@param value
	 */
   public void setStqCurrency(Field source) {
       replace(source,0,source.length(),beginStqCurrency,STQ_CURRENCY_LEN);
   	
   }  
   
     /**
	 * 	Update StqCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setStqCurrency(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginStqCurrency,STQ_CURRENCY_LEN);
   	
   }
   
     /**
	 * 	Update StqCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStqCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStqCurrency+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of stqId
	 *	@return stqId
	 */
	public int getStqId() throws CFException {
        if (isStqIdModified()) { 
           stqId = refreshStqId();
        }
   		return stqId;
	}
	
	/**
	 * 	Update StqId with the passed value
	 *  Corresponding COBOL Variable is STQ-ID
	 *	@param number
	 */
	public void setStqId(int number) {
	     // Truncate if the number is beyond +/- Max range
	    stqId = checkStqIdMaxLimit(number); 
		serializeStqId(stqId);
	}


	public void setStqId(long number) {
	    number = checkStqIdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setStqId((int)number);
	}
	
	/**
	 *	Returns the value of stqTradeData
	 *	@return stqTradeData
	 */
   public char[] getStqTradeData() throws CFException{
     if (isStqTradeDataModified()) { 
        stqTradeData = refreshStqTradeData();
     }
   		return stqTradeData;
   }

  
	/**
	*  set variable stqTradeData
	*  Corresponding COBOL Variable is STQ-TRADE-DATA
	*  @param value
	**/
   public void setStqTradeData(char[] value) {
      stqTradeData = checkStqTradeDataConstraints(value);
      serializeStqTradeData(stqTradeData);
   } 

     /**
	 * 	Update StqTradeData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setStqTradeData(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginStqTradeData,stqTradeData.length);
   	
   }
   
   public void setStqTradeData(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginStqTradeData,stqTradeData.length);
   	
   }
   
     /**
	 * 	Update StqTradeData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStqTradeData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStqTradeData+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update StqTradeData with another Field
	 *	@param value
	 */
   public void setStqTradeData(Field source) {
       replace(source,0,source.length(),beginStqTradeData,STQ_TRADE_DATA_LEN);
   	
   }  
   
     /**
	 * 	Update StqTradeData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setStqTradeData(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginStqTradeData,STQ_TRADE_DATA_LEN);
   	
   }
   
     /**
	 * 	Update StqTradeData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStqTradeData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStqTradeData+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDcltbtrdstqFieldLength() {
			return DCLTBTRDSTQ_LENGTH;
		}

}
  
