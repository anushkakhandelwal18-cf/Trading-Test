package com.cloudframe.app.dto.mstpb001;

/**
*  The class LsCustomerIo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-11 at 04:18. using version 5.0.0.163
**/


import com.cloudframe.app.dto.serialize.mstpb001.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class LsCustomerIo extends LsCustomerIoSerialized { 
   

						private char[] lsCustomerId = Field.fillLowValue(12);

						private char[] lsCustomerCurrency = Field.fillLowValue(3);

						private char[] lsCustomerDescription = Field.fillLowValue(40);

						private char[] lsCustomerErrorMsg = Field.fillLowValue(200);

						private char[] lsCustomerStatus = Field.fillLowValue(1);
	
	/**
	* Constructor for LsCustomerIo
	**/
    public LsCustomerIo() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of lsCustomerId
	 *	@return lsCustomerId
	 */
   public char[] getLsCustomerId() throws CFException{
     if (isLsCustomerIdModified()) { 
        lsCustomerId = refreshLsCustomerId();
     }
   		return lsCustomerId;
   }

  
	/**
	*  set variable lsCustomerId
	*  Corresponding COBOL Variable is LS-CUSTOMER-ID
	*  @param value
	**/
   public void setLsCustomerId(char[] value) {
      lsCustomerId = checkLsCustomerIdConstraints(value);
      serializeLsCustomerId(lsCustomerId);
   } 

     /**
	 * 	Update LsCustomerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsCustomerId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLsCustomerId,lsCustomerId.length);
   	
   }
   
   public void setLsCustomerId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLsCustomerId,lsCustomerId.length);
   	
   }
   
     /**
	 * 	Update LsCustomerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsCustomerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsCustomerId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LsCustomerId with another Field
	 *	@param value
	 */
   public void setLsCustomerId(Field source) {
       replace(source,0,source.length(),beginLsCustomerId,LS_CUSTOMER_ID_LEN);
   	
   }  
   
     /**
	 * 	Update LsCustomerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsCustomerId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLsCustomerId,LS_CUSTOMER_ID_LEN);
   	
   }
   
     /**
	 * 	Update LsCustomerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsCustomerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsCustomerId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lsCustomerCurrency
	 *	@return lsCustomerCurrency
	 */
   public char[] getLsCustomerCurrency() throws CFException{
     if (isLsCustomerCurrencyModified()) { 
        lsCustomerCurrency = refreshLsCustomerCurrency();
     }
   		return lsCustomerCurrency;
   }

  
	/**
	*  set variable lsCustomerCurrency
	*  Corresponding COBOL Variable is LS-CUSTOMER-CURRENCY
	*  @param value
	**/
   public void setLsCustomerCurrency(char[] value) {
      lsCustomerCurrency = checkLsCustomerCurrencyConstraints(value);
      serializeLsCustomerCurrency(lsCustomerCurrency);
   } 

     /**
	 * 	Update LsCustomerCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsCustomerCurrency(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLsCustomerCurrency,lsCustomerCurrency.length);
   	
   }
   
   public void setLsCustomerCurrency(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLsCustomerCurrency,lsCustomerCurrency.length);
   	
   }
   
     /**
	 * 	Update LsCustomerCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsCustomerCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsCustomerCurrency+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LsCustomerCurrency with another Field
	 *	@param value
	 */
   public void setLsCustomerCurrency(Field source) {
       replace(source,0,source.length(),beginLsCustomerCurrency,LS_CUSTOMER_CURRENCY_LEN);
   	
   }  
   
     /**
	 * 	Update LsCustomerCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsCustomerCurrency(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLsCustomerCurrency,LS_CUSTOMER_CURRENCY_LEN);
   	
   }
   
     /**
	 * 	Update LsCustomerCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsCustomerCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsCustomerCurrency+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lsCustomerDescription
	 *	@return lsCustomerDescription
	 */
   public char[] getLsCustomerDescription() throws CFException{
     if (isLsCustomerDescriptionModified()) { 
        lsCustomerDescription = refreshLsCustomerDescription();
     }
   		return lsCustomerDescription;
   }

  
	/**
	*  set variable lsCustomerDescription
	*  Corresponding COBOL Variable is LS-CUSTOMER-DESCRIPTION
	*  @param value
	**/
   public void setLsCustomerDescription(char[] value) {
      lsCustomerDescription = checkLsCustomerDescriptionConstraints(value);
      serializeLsCustomerDescription(lsCustomerDescription);
   } 

     /**
	 * 	Update LsCustomerDescription 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsCustomerDescription(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLsCustomerDescription,lsCustomerDescription.length);
   	
   }
   
   public void setLsCustomerDescription(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLsCustomerDescription,lsCustomerDescription.length);
   	
   }
   
     /**
	 * 	Update LsCustomerDescription 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsCustomerDescription(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsCustomerDescription+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LsCustomerDescription with another Field
	 *	@param value
	 */
   public void setLsCustomerDescription(Field source) {
       replace(source,0,source.length(),beginLsCustomerDescription,LS_CUSTOMER_DESCRIPTION_LEN);
   	
   }  
   
     /**
	 * 	Update LsCustomerDescription 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsCustomerDescription(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLsCustomerDescription,LS_CUSTOMER_DESCRIPTION_LEN);
   	
   }
   
     /**
	 * 	Update LsCustomerDescription 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsCustomerDescription(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsCustomerDescription+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lsCustomerErrorMsg
	 *	@return lsCustomerErrorMsg
	 */
   public char[] getLsCustomerErrorMsg() throws CFException{
     if (isLsCustomerErrorMsgModified()) { 
        lsCustomerErrorMsg = refreshLsCustomerErrorMsg();
     }
   		return lsCustomerErrorMsg;
   }

  
	/**
	*  set variable lsCustomerErrorMsg
	*  Corresponding COBOL Variable is LS-CUSTOMER-ERROR-MSG
	*  @param value
	**/
   public void setLsCustomerErrorMsg(char[] value) {
      lsCustomerErrorMsg = checkLsCustomerErrorMsgConstraints(value);
      serializeLsCustomerErrorMsg(lsCustomerErrorMsg);
   } 

     /**
	 * 	Update LsCustomerErrorMsg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsCustomerErrorMsg(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLsCustomerErrorMsg,lsCustomerErrorMsg.length);
   	
   }
   
   public void setLsCustomerErrorMsg(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLsCustomerErrorMsg,lsCustomerErrorMsg.length);
   	
   }
   
     /**
	 * 	Update LsCustomerErrorMsg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsCustomerErrorMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsCustomerErrorMsg+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LsCustomerErrorMsg with another Field
	 *	@param value
	 */
   public void setLsCustomerErrorMsg(Field source) {
       replace(source,0,source.length(),beginLsCustomerErrorMsg,LS_CUSTOMER_ERROR_MSG_LEN);
   	
   }  
   
     /**
	 * 	Update LsCustomerErrorMsg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsCustomerErrorMsg(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLsCustomerErrorMsg,LS_CUSTOMER_ERROR_MSG_LEN);
   	
   }
   
     /**
	 * 	Update LsCustomerErrorMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsCustomerErrorMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsCustomerErrorMsg+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lsCustomerStatus
	 *	@return lsCustomerStatus
	 */
   public char[] getLsCustomerStatus() throws CFException{
     if (isLsCustomerStatusModified()) { 
        lsCustomerStatus = refreshLsCustomerStatus();
     }
   		return lsCustomerStatus;
   }

  
	/**
	*  set variable lsCustomerStatus
	*  Corresponding COBOL Variable is LS-CUSTOMER-STATUS
	*  @param value
	**/
   public void setLsCustomerStatus(char[] value) {
      lsCustomerStatus = checkLsCustomerStatusConstraints(value);
      serializeLsCustomerStatus(lsCustomerStatus);
   } 

     /**
	 * 	Update LsCustomerStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsCustomerStatus(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLsCustomerStatus,lsCustomerStatus.length);
   	
   }
   
   public void setLsCustomerStatus(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLsCustomerStatus,lsCustomerStatus.length);
   	
   }
   
     /**
	 * 	Update LsCustomerStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsCustomerStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsCustomerStatus+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LsCustomerStatus with another Field
	 *	@param value
	 */
   public void setLsCustomerStatus(Field source) {
       replace(source,0,source.length(),beginLsCustomerStatus,LS_CUSTOMER_STATUS_LEN);
   	
   }  
   
     /**
	 * 	Update LsCustomerStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsCustomerStatus(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLsCustomerStatus,LS_CUSTOMER_STATUS_LEN);
   	
   }
   
     /**
	 * 	Update LsCustomerStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsCustomerStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsCustomerStatus+targetIndex,targetLen);
    
   }
	char[] customerNotFound8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isCustomerNotFound88()
	 *	@return  Returns true if isCustomerNotFound88() is "N"
	 */
   public boolean isCustomerNotFound88() throws CFException {
      return (  compareChars( getLsCustomerStatus() , customerNotFound8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setCustomerNotFound88True() {  			
    	setLsCustomerStatus( customerNotFound8888Value);
   	}
	char[] customerActive8888Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isCustomerActive88()
	 *	@return  Returns true if isCustomerActive88() is "A"
	 */
   public boolean isCustomerActive88() throws CFException {
      return (  compareChars( getLsCustomerStatus() , customerActive8888Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setCustomerActive88True() {  			
    	setLsCustomerStatus( customerActive8888Value);
   	}
	char[] customerInactive8888Value = "I".toCharArray();
	/**
	 *	Test condition "I" for isCustomerInactive88()
	 *	@return  Returns true if isCustomerInactive88() is "I"
	 */
   public boolean isCustomerInactive88() throws CFException {
      return (  compareChars( getLsCustomerStatus() , customerInactive8888Value)  == 0  );
   }


	/**
	*  set values "I"
	*/
   	public void setCustomerInactive88True() {  			
    	setLsCustomerStatus( customerInactive8888Value);
   	}
	char[] customerException8888Value = "S".toCharArray();
	/**
	 *	Test condition "S" for isCustomerException88()
	 *	@return  Returns true if isCustomerException88() is "S"
	 */
   public boolean isCustomerException88() throws CFException {
      return (  compareChars( getLsCustomerStatus() , customerException8888Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setCustomerException88True() {  			
    	setLsCustomerStatus( customerException8888Value);
   	}

	
	
	

		public static int getLsCustomerIoFieldLength() {
			return LS_CUSTOMER_IO_LENGTH;
		}

}
  
