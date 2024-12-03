package com.cloudframe.app.dto.trdpb000;

/**
*  The class SecurityIo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-03 at 13:43. using version 5.0.0.162
**/


import com.cloudframe.app.dto.serialize.trdpb000.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class SecurityIo extends SecurityIoSerialized { 
   

						private char[] figi = Field.fillLowValue(12);

						private char[] currency = Field.fillLowValue(3);

						private char[] description = Field.fillLowValue(40);

						private char[] symbol = Field.fillLowValue(20);

						private char[] shareClassFigi = Field.fillLowValue(12);

						private char[] type = Field.fillLowValue(20);

						private char[] securityErrorMsg = Field.fillLowValue(200);

						private char[] securityStatus = Field.fillLowValue(1);
	
	/**
	* Constructor for SecurityIo
	**/
    public SecurityIo() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of figi
	 *	@return figi
	 */
   public char[] getFigi() throws CFException{
     if (isFigiModified()) { 
        figi = refreshFigi();
     }
   		return figi;
   }

  
	/**
	*  set variable figi
	*  Corresponding COBOL Variable is WS-FIGI
	*  @param value
	**/
   public void setFigi(char[] value) {
      figi = checkFigiConstraints(value);
      serializeFigi(figi);
   } 

     /**
	 * 	Update Figi 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFigi(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFigi,figi.length);
   	
   }
   
   public void setFigi(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFigi,figi.length);
   	
   }
   
     /**
	 * 	Update Figi 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFigi(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFigi+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Figi with another Field
	 *	@param value
	 */
   public void setFigi(Field source) {
       replace(source,0,source.length(),beginFigi,FIGI_LEN);
   	
   }  
   
     /**
	 * 	Update Figi 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFigi(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFigi,FIGI_LEN);
   	
   }
   
     /**
	 * 	Update Figi 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFigi(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFigi+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of currency
	 *	@return currency
	 */
   public char[] getCurrency() throws CFException{
     if (isCurrencyModified()) { 
        currency = refreshCurrency();
     }
   		return currency;
   }

  
	/**
	*  set variable currency
	*  Corresponding COBOL Variable is WS-CURRENCY
	*  @param value
	**/
   public void setCurrency(char[] value) {
      currency = checkCurrencyConstraints(value);
      serializeCurrency(currency);
   } 

     /**
	 * 	Update Currency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrency(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurrency,currency.length);
   	
   }
   
   public void setCurrency(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurrency,currency.length);
   	
   }
   
     /**
	 * 	Update Currency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrency+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Currency with another Field
	 *	@param value
	 */
   public void setCurrency(Field source) {
       replace(source,0,source.length(),beginCurrency,CURRENCY_LEN);
   	
   }  
   
     /**
	 * 	Update Currency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrency(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurrency,CURRENCY_LEN);
   	
   }
   
     /**
	 * 	Update Currency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurrency+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of description
	 *	@return description
	 */
   public char[] getDescription() throws CFException{
     if (isDescriptionModified()) { 
        description = refreshDescription();
     }
   		return description;
   }

  
	/**
	*  set variable description
	*  Corresponding COBOL Variable is WS-DESCRIPTION
	*  @param value
	**/
   public void setDescription(char[] value) {
      description = checkDescriptionConstraints(value);
      serializeDescription(description);
   } 

     /**
	 * 	Update Description 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDescription(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDescription,description.length);
   	
   }
   
   public void setDescription(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDescription,description.length);
   	
   }
   
     /**
	 * 	Update Description 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDescription(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDescription+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Description with another Field
	 *	@param value
	 */
   public void setDescription(Field source) {
       replace(source,0,source.length(),beginDescription,DESCRIPTION_LEN);
   	
   }  
   
     /**
	 * 	Update Description 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDescription(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDescription,DESCRIPTION_LEN);
   	
   }
   
     /**
	 * 	Update Description 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDescription(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDescription+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of symbol
	 *	@return symbol
	 */
   public char[] getSymbol() throws CFException{
     if (isSymbolModified()) { 
        symbol = refreshSymbol();
     }
   		return symbol;
   }

  
	/**
	*  set variable symbol
	*  Corresponding COBOL Variable is WS-SYMBOL
	*  @param value
	**/
   public void setSymbol(char[] value) {
      symbol = checkSymbolConstraints(value);
      serializeSymbol(symbol);
   } 

     /**
	 * 	Update Symbol 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSymbol(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSymbol,symbol.length);
   	
   }
   
   public void setSymbol(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSymbol,symbol.length);
   	
   }
   
     /**
	 * 	Update Symbol 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSymbol(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSymbol+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Symbol with another Field
	 *	@param value
	 */
   public void setSymbol(Field source) {
       replace(source,0,source.length(),beginSymbol,SYMBOL_LEN);
   	
   }  
   
     /**
	 * 	Update Symbol 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSymbol(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSymbol,SYMBOL_LEN);
   	
   }
   
     /**
	 * 	Update Symbol 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSymbol(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSymbol+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of shareClassFigi
	 *	@return shareClassFigi
	 */
   public char[] getShareClassFigi() throws CFException{
     if (isShareClassFigiModified()) { 
        shareClassFigi = refreshShareClassFigi();
     }
   		return shareClassFigi;
   }

  
	/**
	*  set variable shareClassFigi
	*  Corresponding COBOL Variable is WS-SHARE-CLASS-FIGI
	*  @param value
	**/
   public void setShareClassFigi(char[] value) {
      shareClassFigi = checkShareClassFigiConstraints(value);
      serializeShareClassFigi(shareClassFigi);
   } 

     /**
	 * 	Update ShareClassFigi 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setShareClassFigi(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginShareClassFigi,shareClassFigi.length);
   	
   }
   
   public void setShareClassFigi(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginShareClassFigi,shareClassFigi.length);
   	
   }
   
     /**
	 * 	Update ShareClassFigi 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setShareClassFigi(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginShareClassFigi+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ShareClassFigi with another Field
	 *	@param value
	 */
   public void setShareClassFigi(Field source) {
       replace(source,0,source.length(),beginShareClassFigi,SHARE_CLASS_FIGI_LEN);
   	
   }  
   
     /**
	 * 	Update ShareClassFigi 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setShareClassFigi(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginShareClassFigi,SHARE_CLASS_FIGI_LEN);
   	
   }
   
     /**
	 * 	Update ShareClassFigi 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setShareClassFigi(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginShareClassFigi+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of type
	 *	@return type
	 */
   public char[] getType() throws CFException{
     if (isTypeModified()) { 
        type = refreshType();
     }
   		return type;
   }

  
	/**
	*  set variable type
	*  Corresponding COBOL Variable is WS-TYPE
	*  @param value
	**/
   public void setType(char[] value) {
      type = checkTypeConstraints(value);
      serializeType(type);
   } 

     /**
	 * 	Update Type 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginType,type.length);
   	
   }
   
   public void setType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginType,type.length);
   	
   }
   
     /**
	 * 	Update Type 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Type with another Field
	 *	@param value
	 */
   public void setType(Field source) {
       replace(source,0,source.length(),beginType,TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update Type 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginType,TYPE_LEN);
   	
   }
   
     /**
	 * 	Update Type 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of securityErrorMsg
	 *	@return securityErrorMsg
	 */
   public char[] getSecurityErrorMsg() throws CFException{
     if (isSecurityErrorMsgModified()) { 
        securityErrorMsg = refreshSecurityErrorMsg();
     }
   		return securityErrorMsg;
   }

  
	/**
	*  set variable securityErrorMsg
	*  Corresponding COBOL Variable is WS-SECURITY-ERROR-MSG
	*  @param value
	**/
   public void setSecurityErrorMsg(char[] value) {
      securityErrorMsg = checkSecurityErrorMsgConstraints(value);
      serializeSecurityErrorMsg(securityErrorMsg);
   } 

     /**
	 * 	Update SecurityErrorMsg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSecurityErrorMsg(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSecurityErrorMsg,securityErrorMsg.length);
   	
   }
   
   public void setSecurityErrorMsg(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSecurityErrorMsg,securityErrorMsg.length);
   	
   }
   
     /**
	 * 	Update SecurityErrorMsg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSecurityErrorMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSecurityErrorMsg+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SecurityErrorMsg with another Field
	 *	@param value
	 */
   public void setSecurityErrorMsg(Field source) {
       replace(source,0,source.length(),beginSecurityErrorMsg,SECURITY_ERROR_MSG_LEN);
   	
   }  
   
     /**
	 * 	Update SecurityErrorMsg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSecurityErrorMsg(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSecurityErrorMsg,SECURITY_ERROR_MSG_LEN);
   	
   }
   
     /**
	 * 	Update SecurityErrorMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSecurityErrorMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSecurityErrorMsg+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of securityStatus
	 *	@return securityStatus
	 */
   public char[] getSecurityStatus() throws CFException{
     if (isSecurityStatusModified()) { 
        securityStatus = refreshSecurityStatus();
     }
   		return securityStatus;
   }

  
	/**
	*  set variable securityStatus
	*  Corresponding COBOL Variable is WS-SECURITY-STATUS
	*  @param value
	**/
   public void setSecurityStatus(char[] value) {
      securityStatus = checkSecurityStatusConstraints(value);
      serializeSecurityStatus(securityStatus);
   } 

     /**
	 * 	Update SecurityStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSecurityStatus(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSecurityStatus,securityStatus.length);
   	
   }
   
   public void setSecurityStatus(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSecurityStatus,securityStatus.length);
   	
   }
   
     /**
	 * 	Update SecurityStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSecurityStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSecurityStatus+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SecurityStatus with another Field
	 *	@param value
	 */
   public void setSecurityStatus(Field source) {
       replace(source,0,source.length(),beginSecurityStatus,SECURITY_STATUS_LEN);
   	
   }  
   
     /**
	 * 	Update SecurityStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSecurityStatus(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSecurityStatus,SECURITY_STATUS_LEN);
   	
   }
   
     /**
	 * 	Update SecurityStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSecurityStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSecurityStatus+targetIndex,targetLen);
    
   }
	char[] securityNotFound8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isSecurityNotFound88()
	 *	@return  Returns true if isSecurityNotFound88() is "N"
	 */
   public boolean isSecurityNotFound88() throws CFException {
      return (  compareChars( getSecurityStatus() , securityNotFound8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setSecurityNotFound88True() {  			
    	setSecurityStatus( securityNotFound8888Value);
   	}
	char[] securityActive8888Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isSecurityActive88()
	 *	@return  Returns true if isSecurityActive88() is "A"
	 */
   public boolean isSecurityActive88() throws CFException {
      return (  compareChars( getSecurityStatus() , securityActive8888Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setSecurityActive88True() {  			
    	setSecurityStatus( securityActive8888Value);
   	}
	char[] securityInactive8888Value = "I".toCharArray();
	/**
	 *	Test condition "I" for isSecurityInactive88()
	 *	@return  Returns true if isSecurityInactive88() is "I"
	 */
   public boolean isSecurityInactive88() throws CFException {
      return (  compareChars( getSecurityStatus() , securityInactive8888Value)  == 0  );
   }


	/**
	*  set values "I"
	*/
   	public void setSecurityInactive88True() {  			
    	setSecurityStatus( securityInactive8888Value);
   	}
	char[] securityException8888Value = "S".toCharArray();
	/**
	 *	Test condition "S" for isSecurityException88()
	 *	@return  Returns true if isSecurityException88() is "S"
	 */
   public boolean isSecurityException88() throws CFException {
      return (  compareChars( getSecurityStatus() , securityException8888Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setSecurityException88True() {  			
    	setSecurityStatus( securityException8888Value);
   	}

	
	
	
	/**
	 * 	initializes SecurityIo
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFigi(CONSTANTS.SPACE_12);
         setCurrency(CONSTANTS.SPACE_3);
         setDescription(CONSTANTS.SPACE_40);
         setSymbol(CONSTANTS.SPACE_20);
         setShareClassFigi(CONSTANTS.SPACE_12);
         setType(CONSTANTS.SPACE_20);
         setSecurityErrorMsg(CONSTANTS.SPACE_200);
         setSecurityStatus(CONSTANTS.SPACE);
   }

		public static int getSecurityIoFieldLength() {
			return SECURITY_IO_LENGTH;
		}

}
  
