package com.cloudframe.app.dto.trdpb000;

/**
*  The class Dcltbtrdsac is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-11-30 at 14:18. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.trdpb000.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Dcltbtrdsac extends DcltbtrdsacSerialized { 
   

						private char[] sacCurrency = Field.fillLowValue(3);

								private int sacNumber;

						private char[] sacCustomerId = Field.fillLowValue(12);

						private char[] sacStatus = Field.fillLowValue(1);
	
	/**
	* Constructor for Dcltbtrdsac
	**/
    public Dcltbtrdsac() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sacCurrency
	 *	@return sacCurrency
	 */
   public char[] getSacCurrency() throws CFException{
     if (isSacCurrencyModified()) { 
        sacCurrency = refreshSacCurrency();
     }
   		return sacCurrency;
   }

  
	/**
	*  set variable sacCurrency
	*  Corresponding COBOL Variable is SAC-CURRENCY
	*  @param value
	**/
   public void setSacCurrency(char[] value) {
      sacCurrency = checkSacCurrencyConstraints(value);
      serializeSacCurrency(sacCurrency);
   } 

     /**
	 * 	Update SacCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSacCurrency(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSacCurrency,sacCurrency.length);
   	
   }
   
   public void setSacCurrency(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSacCurrency,sacCurrency.length);
   	
   }
   
     /**
	 * 	Update SacCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSacCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSacCurrency+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SacCurrency with another Field
	 *	@param value
	 */
   public void setSacCurrency(Field source) {
       replace(source,0,source.length(),beginSacCurrency,SAC_CURRENCY_LEN);
   	
   }  
   
     /**
	 * 	Update SacCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSacCurrency(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSacCurrency,SAC_CURRENCY_LEN);
   	
   }
   
     /**
	 * 	Update SacCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSacCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSacCurrency+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sacNumber
	 *	@return sacNumber
	 */
	public int getSacNumber() throws CFException {
        if (isSacNumberModified()) { 
           sacNumber = refreshSacNumber();
        }
   		return sacNumber;
	}
	
	/**
	 * 	Update SacNumber with the passed value
	 *  Corresponding COBOL Variable is SAC-NUMBER
	 *	@param number
	 */
	public void setSacNumber(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sacNumber = checkSacNumberMaxLimit(number); 
		serializeSacNumber(sacNumber);
	}


	public void setSacNumber(long number) {
	    number = checkSacNumberMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSacNumber((int)number);
	}
	
	/**
	 *	Returns the value of sacCustomerId
	 *	@return sacCustomerId
	 */
   public char[] getSacCustomerId() throws CFException{
     if (isSacCustomerIdModified()) { 
        sacCustomerId = refreshSacCustomerId();
     }
   		return sacCustomerId;
   }

  
	/**
	*  set variable sacCustomerId
	*  Corresponding COBOL Variable is SAC-CUSTOMER-ID
	*  @param value
	**/
   public void setSacCustomerId(char[] value) {
      sacCustomerId = checkSacCustomerIdConstraints(value);
      serializeSacCustomerId(sacCustomerId);
   } 

     /**
	 * 	Update SacCustomerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSacCustomerId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSacCustomerId,sacCustomerId.length);
   	
   }
   
   public void setSacCustomerId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSacCustomerId,sacCustomerId.length);
   	
   }
   
     /**
	 * 	Update SacCustomerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSacCustomerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSacCustomerId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SacCustomerId with another Field
	 *	@param value
	 */
   public void setSacCustomerId(Field source) {
       replace(source,0,source.length(),beginSacCustomerId,SAC_CUSTOMER_ID_LEN);
   	
   }  
   
     /**
	 * 	Update SacCustomerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSacCustomerId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSacCustomerId,SAC_CUSTOMER_ID_LEN);
   	
   }
   
     /**
	 * 	Update SacCustomerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSacCustomerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSacCustomerId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sacStatus
	 *	@return sacStatus
	 */
   public char[] getSacStatus() throws CFException{
     if (isSacStatusModified()) { 
        sacStatus = refreshSacStatus();
     }
   		return sacStatus;
   }

  
	/**
	*  set variable sacStatus
	*  Corresponding COBOL Variable is SAC-STATUS
	*  @param value
	**/
   public void setSacStatus(char[] value) {
      sacStatus = checkSacStatusConstraints(value);
      serializeSacStatus(sacStatus);
   } 

     /**
	 * 	Update SacStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSacStatus(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSacStatus,sacStatus.length);
   	
   }
   
   public void setSacStatus(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSacStatus,sacStatus.length);
   	
   }
   
     /**
	 * 	Update SacStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSacStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSacStatus+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SacStatus with another Field
	 *	@param value
	 */
   public void setSacStatus(Field source) {
       replace(source,0,source.length(),beginSacStatus,SAC_STATUS_LEN);
   	
   }  
   
     /**
	 * 	Update SacStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSacStatus(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSacStatus,SAC_STATUS_LEN);
   	
   }
   
     /**
	 * 	Update SacStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSacStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSacStatus+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDcltbtrdsacFieldLength() {
			return DCLTBTRDSAC_LENGTH;
		}

}
  
