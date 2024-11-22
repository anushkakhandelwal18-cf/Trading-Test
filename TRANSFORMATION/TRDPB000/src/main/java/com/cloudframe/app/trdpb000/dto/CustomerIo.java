package com.cloudframe.app.trdpb000.dto;

/**
*  The class CustomerIo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-11-22 at 10:29. using version 5.0.0.158
**/


import com.cloudframe.app.trdpb000.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class CustomerIo extends CustomerIoSerialized { 
   

						private char[] customerId = Field.fillLowValue(12);

						private char[] customerCurrency = Field.fillLowValue(3);

						private char[] customerDescription = Field.fillLowValue(40);

						private char[] customerErrorMsg = Field.fillLowValue(200);

						private char[] customerStatus = Field.fillLowValue(1);
	
	/**
	* Constructor for CustomerIo
	**/
    public CustomerIo() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of customerId
	 *	@return customerId
	 */
   public char[] getCustomerId() throws CFException{
     if (isCustomerIdModified()) { 
        customerId = refreshCustomerId();
     }
   		return customerId;
   }

  
	/**
	*  set variable customerId
	*  Corresponding COBOL Variable is WS-CUSTOMER-ID
	*  @param value
	**/
   public void setCustomerId(char[] value) {
      customerId = checkCustomerIdConstraints(value);
      serializeCustomerId(customerId);
   } 

     /**
	 * 	Update CustomerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCustomerId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCustomerId,customerId.length);
   	
   }
   
   public void setCustomerId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCustomerId,customerId.length);
   	
   }
   
     /**
	 * 	Update CustomerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCustomerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCustomerId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CustomerId with another Field
	 *	@param value
	 */
   public void setCustomerId(Field source) {
       replace(source,0,source.length(),beginCustomerId,CUSTOMER_ID_LEN);
   	
   }  
   
     /**
	 * 	Update CustomerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCustomerId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCustomerId,CUSTOMER_ID_LEN);
   	
   }
   
     /**
	 * 	Update CustomerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCustomerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCustomerId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of customerCurrency
	 *	@return customerCurrency
	 */
   public char[] getCustomerCurrency() throws CFException{
     if (isCustomerCurrencyModified()) { 
        customerCurrency = refreshCustomerCurrency();
     }
   		return customerCurrency;
   }

  
	/**
	*  set variable customerCurrency
	*  Corresponding COBOL Variable is WS-CUSTOMER-CURRENCY
	*  @param value
	**/
   public void setCustomerCurrency(char[] value) {
      customerCurrency = checkCustomerCurrencyConstraints(value);
      serializeCustomerCurrency(customerCurrency);
   } 

     /**
	 * 	Update CustomerCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCustomerCurrency(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCustomerCurrency,customerCurrency.length);
   	
   }
   
   public void setCustomerCurrency(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCustomerCurrency,customerCurrency.length);
   	
   }
   
     /**
	 * 	Update CustomerCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCustomerCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCustomerCurrency+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CustomerCurrency with another Field
	 *	@param value
	 */
   public void setCustomerCurrency(Field source) {
       replace(source,0,source.length(),beginCustomerCurrency,CUSTOMER_CURRENCY_LEN);
   	
   }  
   
     /**
	 * 	Update CustomerCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCustomerCurrency(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCustomerCurrency,CUSTOMER_CURRENCY_LEN);
   	
   }
   
     /**
	 * 	Update CustomerCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCustomerCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCustomerCurrency+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of customerDescription
	 *	@return customerDescription
	 */
   public char[] getCustomerDescription() throws CFException{
     if (isCustomerDescriptionModified()) { 
        customerDescription = refreshCustomerDescription();
     }
   		return customerDescription;
   }

  
	/**
	*  set variable customerDescription
	*  Corresponding COBOL Variable is WS-CUSTOMER-DESCRIPTION
	*  @param value
	**/
   public void setCustomerDescription(char[] value) {
      customerDescription = checkCustomerDescriptionConstraints(value);
      serializeCustomerDescription(customerDescription);
   } 

     /**
	 * 	Update CustomerDescription 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCustomerDescription(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCustomerDescription,customerDescription.length);
   	
   }
   
   public void setCustomerDescription(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCustomerDescription,customerDescription.length);
   	
   }
   
     /**
	 * 	Update CustomerDescription 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCustomerDescription(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCustomerDescription+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CustomerDescription with another Field
	 *	@param value
	 */
   public void setCustomerDescription(Field source) {
       replace(source,0,source.length(),beginCustomerDescription,CUSTOMER_DESCRIPTION_LEN);
   	
   }  
   
     /**
	 * 	Update CustomerDescription 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCustomerDescription(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCustomerDescription,CUSTOMER_DESCRIPTION_LEN);
   	
   }
   
     /**
	 * 	Update CustomerDescription 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCustomerDescription(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCustomerDescription+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of customerErrorMsg
	 *	@return customerErrorMsg
	 */
   public char[] getCustomerErrorMsg() throws CFException{
     if (isCustomerErrorMsgModified()) { 
        customerErrorMsg = refreshCustomerErrorMsg();
     }
   		return customerErrorMsg;
   }

  
	/**
	*  set variable customerErrorMsg
	*  Corresponding COBOL Variable is WS-CUSTOMER-ERROR-MSG
	*  @param value
	**/
   public void setCustomerErrorMsg(char[] value) {
      customerErrorMsg = checkCustomerErrorMsgConstraints(value);
      serializeCustomerErrorMsg(customerErrorMsg);
   } 

     /**
	 * 	Update CustomerErrorMsg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCustomerErrorMsg(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCustomerErrorMsg,customerErrorMsg.length);
   	
   }
   
   public void setCustomerErrorMsg(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCustomerErrorMsg,customerErrorMsg.length);
   	
   }
   
     /**
	 * 	Update CustomerErrorMsg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCustomerErrorMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCustomerErrorMsg+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CustomerErrorMsg with another Field
	 *	@param value
	 */
   public void setCustomerErrorMsg(Field source) {
       replace(source,0,source.length(),beginCustomerErrorMsg,CUSTOMER_ERROR_MSG_LEN);
   	
   }  
   
     /**
	 * 	Update CustomerErrorMsg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCustomerErrorMsg(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCustomerErrorMsg,CUSTOMER_ERROR_MSG_LEN);
   	
   }
   
     /**
	 * 	Update CustomerErrorMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCustomerErrorMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCustomerErrorMsg+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of customerStatus
	 *	@return customerStatus
	 */
   public char[] getCustomerStatus() throws CFException{
     if (isCustomerStatusModified()) { 
        customerStatus = refreshCustomerStatus();
     }
   		return customerStatus;
   }

  
	/**
	*  set variable customerStatus
	*  Corresponding COBOL Variable is WS-CUSTOMER-STATUS
	*  @param value
	**/
   public void setCustomerStatus(char[] value) {
      customerStatus = checkCustomerStatusConstraints(value);
      serializeCustomerStatus(customerStatus);
   } 

     /**
	 * 	Update CustomerStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCustomerStatus(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCustomerStatus,customerStatus.length);
   	
   }
   
   public void setCustomerStatus(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCustomerStatus,customerStatus.length);
   	
   }
   
     /**
	 * 	Update CustomerStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCustomerStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCustomerStatus+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CustomerStatus with another Field
	 *	@param value
	 */
   public void setCustomerStatus(Field source) {
       replace(source,0,source.length(),beginCustomerStatus,CUSTOMER_STATUS_LEN);
   	
   }  
   
     /**
	 * 	Update CustomerStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCustomerStatus(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCustomerStatus,CUSTOMER_STATUS_LEN);
   	
   }
   
     /**
	 * 	Update CustomerStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCustomerStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCustomerStatus+targetIndex,targetLen);
    
   }
	char[] customerNotFound8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isCustomerNotFound88()
	 *	@return  Returns true if isCustomerNotFound88() is "N"
	 */
   public boolean isCustomerNotFound88() throws CFException {
      return (  compareChars( getCustomerStatus() , customerNotFound8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setCustomerNotFound88True() {  			
    	setCustomerStatus( customerNotFound8888Value);
   	}
	char[] customerActive8888Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isCustomerActive88()
	 *	@return  Returns true if isCustomerActive88() is "A"
	 */
   public boolean isCustomerActive88() throws CFException {
      return (  compareChars( getCustomerStatus() , customerActive8888Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setCustomerActive88True() {  			
    	setCustomerStatus( customerActive8888Value);
   	}
	char[] customerInactive8888Value = "I".toCharArray();
	/**
	 *	Test condition "I" for isCustomerInactive88()
	 *	@return  Returns true if isCustomerInactive88() is "I"
	 */
   public boolean isCustomerInactive88() throws CFException {
      return (  compareChars( getCustomerStatus() , customerInactive8888Value)  == 0  );
   }


	/**
	*  set values "I"
	*/
   	public void setCustomerInactive88True() {  			
    	setCustomerStatus( customerInactive8888Value);
   	}
	char[] customerException8888Value = "S".toCharArray();
	/**
	 *	Test condition "S" for isCustomerException88()
	 *	@return  Returns true if isCustomerException88() is "S"
	 */
   public boolean isCustomerException88() throws CFException {
      return (  compareChars( getCustomerStatus() , customerException8888Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setCustomerException88True() {  			
    	setCustomerStatus( customerException8888Value);
   	}

	
	
	
	/**
	 * 	initializes CustomerIo
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setCustomerId(CONSTANTS.SPACE_12);
         setCustomerCurrency(CONSTANTS.SPACE_3);
         setCustomerDescription(CONSTANTS.SPACE_40);
         setCustomerErrorMsg(CONSTANTS.SPACE_200);
         setCustomerStatus(CONSTANTS.SPACE);
   }

		public static int getCustomerIoFieldLength() {
			return CUSTOMER_IO_LENGTH;
		}

}
  
