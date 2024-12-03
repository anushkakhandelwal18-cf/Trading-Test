package com.cloudframe.app.dto.mstpb002;

/**
*  The class LsSecurityIo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-03 at 15:02. using version 5.0.0.163
**/


import com.cloudframe.app.dto.serialize.mstpb002.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class LsSecurityIo extends LsSecurityIoSerialized { 
   

						private char[] lsFigi = Field.fillLowValue(12);

						private char[] lsCurrency = Field.fillLowValue(3);

						private char[] lsDescription = Field.fillLowValue(40);

						private char[] lsSymbol = Field.fillLowValue(20);

						private char[] lsShareClassFigi = Field.fillLowValue(12);

						private char[] lsType = Field.fillLowValue(20);

						private char[] lsSecurityErrorMsg = Field.fillLowValue(200);

						private char[] lsSecurityStatus = Field.fillLowValue(1);
	
	/**
	* Constructor for LsSecurityIo
	**/
    public LsSecurityIo() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of lsFigi
	 *	@return lsFigi
	 */
   public char[] getLsFigi() throws CFException{
     if (isLsFigiModified()) { 
        lsFigi = refreshLsFigi();
     }
   		return lsFigi;
   }

  
	/**
	*  set variable lsFigi
	*  Corresponding COBOL Variable is LS-FIGI
	*  @param value
	**/
   public void setLsFigi(char[] value) {
      lsFigi = checkLsFigiConstraints(value);
      serializeLsFigi(lsFigi);
   } 

     /**
	 * 	Update LsFigi 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsFigi(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLsFigi,lsFigi.length);
   	
   }
   
   public void setLsFigi(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLsFigi,lsFigi.length);
   	
   }
   
     /**
	 * 	Update LsFigi 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsFigi(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsFigi+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LsFigi with another Field
	 *	@param value
	 */
   public void setLsFigi(Field source) {
       replace(source,0,source.length(),beginLsFigi,LS_FIGI_LEN);
   	
   }  
   
     /**
	 * 	Update LsFigi 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsFigi(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLsFigi,LS_FIGI_LEN);
   	
   }
   
     /**
	 * 	Update LsFigi 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsFigi(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsFigi+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lsCurrency
	 *	@return lsCurrency
	 */
   public char[] getLsCurrency() throws CFException{
     if (isLsCurrencyModified()) { 
        lsCurrency = refreshLsCurrency();
     }
   		return lsCurrency;
   }

  
	/**
	*  set variable lsCurrency
	*  Corresponding COBOL Variable is LS-CURRENCY
	*  @param value
	**/
   public void setLsCurrency(char[] value) {
      lsCurrency = checkLsCurrencyConstraints(value);
      serializeLsCurrency(lsCurrency);
   } 

     /**
	 * 	Update LsCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsCurrency(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLsCurrency,lsCurrency.length);
   	
   }
   
   public void setLsCurrency(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLsCurrency,lsCurrency.length);
   	
   }
   
     /**
	 * 	Update LsCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsCurrency+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LsCurrency with another Field
	 *	@param value
	 */
   public void setLsCurrency(Field source) {
       replace(source,0,source.length(),beginLsCurrency,LS_CURRENCY_LEN);
   	
   }  
   
     /**
	 * 	Update LsCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsCurrency(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLsCurrency,LS_CURRENCY_LEN);
   	
   }
   
     /**
	 * 	Update LsCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsCurrency+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lsDescription
	 *	@return lsDescription
	 */
   public char[] getLsDescription() throws CFException{
     if (isLsDescriptionModified()) { 
        lsDescription = refreshLsDescription();
     }
   		return lsDescription;
   }

  
	/**
	*  set variable lsDescription
	*  Corresponding COBOL Variable is LS-DESCRIPTION
	*  @param value
	**/
   public void setLsDescription(char[] value) {
      lsDescription = checkLsDescriptionConstraints(value);
      serializeLsDescription(lsDescription);
   } 

     /**
	 * 	Update LsDescription 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsDescription(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLsDescription,lsDescription.length);
   	
   }
   
   public void setLsDescription(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLsDescription,lsDescription.length);
   	
   }
   
     /**
	 * 	Update LsDescription 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsDescription(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsDescription+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LsDescription with another Field
	 *	@param value
	 */
   public void setLsDescription(Field source) {
       replace(source,0,source.length(),beginLsDescription,LS_DESCRIPTION_LEN);
   	
   }  
   
     /**
	 * 	Update LsDescription 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsDescription(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLsDescription,LS_DESCRIPTION_LEN);
   	
   }
   
     /**
	 * 	Update LsDescription 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsDescription(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsDescription+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lsSymbol
	 *	@return lsSymbol
	 */
   public char[] getLsSymbol() throws CFException{
     if (isLsSymbolModified()) { 
        lsSymbol = refreshLsSymbol();
     }
   		return lsSymbol;
   }

  
	/**
	*  set variable lsSymbol
	*  Corresponding COBOL Variable is LS-SYMBOL
	*  @param value
	**/
   public void setLsSymbol(char[] value) {
      lsSymbol = checkLsSymbolConstraints(value);
      serializeLsSymbol(lsSymbol);
   } 

     /**
	 * 	Update LsSymbol 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsSymbol(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLsSymbol,lsSymbol.length);
   	
   }
   
   public void setLsSymbol(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLsSymbol,lsSymbol.length);
   	
   }
   
     /**
	 * 	Update LsSymbol 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsSymbol(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsSymbol+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LsSymbol with another Field
	 *	@param value
	 */
   public void setLsSymbol(Field source) {
       replace(source,0,source.length(),beginLsSymbol,LS_SYMBOL_LEN);
   	
   }  
   
     /**
	 * 	Update LsSymbol 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsSymbol(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLsSymbol,LS_SYMBOL_LEN);
   	
   }
   
     /**
	 * 	Update LsSymbol 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsSymbol(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsSymbol+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lsShareClassFigi
	 *	@return lsShareClassFigi
	 */
   public char[] getLsShareClassFigi() throws CFException{
     if (isLsShareClassFigiModified()) { 
        lsShareClassFigi = refreshLsShareClassFigi();
     }
   		return lsShareClassFigi;
   }

  
	/**
	*  set variable lsShareClassFigi
	*  Corresponding COBOL Variable is LS-SHARE-CLASS-FIGI
	*  @param value
	**/
   public void setLsShareClassFigi(char[] value) {
      lsShareClassFigi = checkLsShareClassFigiConstraints(value);
      serializeLsShareClassFigi(lsShareClassFigi);
   } 

     /**
	 * 	Update LsShareClassFigi 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsShareClassFigi(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLsShareClassFigi,lsShareClassFigi.length);
   	
   }
   
   public void setLsShareClassFigi(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLsShareClassFigi,lsShareClassFigi.length);
   	
   }
   
     /**
	 * 	Update LsShareClassFigi 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsShareClassFigi(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsShareClassFigi+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LsShareClassFigi with another Field
	 *	@param value
	 */
   public void setLsShareClassFigi(Field source) {
       replace(source,0,source.length(),beginLsShareClassFigi,LS_SHARE_CLASS_FIGI_LEN);
   	
   }  
   
     /**
	 * 	Update LsShareClassFigi 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsShareClassFigi(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLsShareClassFigi,LS_SHARE_CLASS_FIGI_LEN);
   	
   }
   
     /**
	 * 	Update LsShareClassFigi 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsShareClassFigi(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsShareClassFigi+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lsType
	 *	@return lsType
	 */
   public char[] getLsType() throws CFException{
     if (isLsTypeModified()) { 
        lsType = refreshLsType();
     }
   		return lsType;
   }

  
	/**
	*  set variable lsType
	*  Corresponding COBOL Variable is LS-TYPE
	*  @param value
	**/
   public void setLsType(char[] value) {
      lsType = checkLsTypeConstraints(value);
      serializeLsType(lsType);
   } 

     /**
	 * 	Update LsType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLsType,lsType.length);
   	
   }
   
   public void setLsType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLsType,lsType.length);
   	
   }
   
     /**
	 * 	Update LsType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LsType with another Field
	 *	@param value
	 */
   public void setLsType(Field source) {
       replace(source,0,source.length(),beginLsType,LS_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update LsType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLsType,LS_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update LsType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lsSecurityErrorMsg
	 *	@return lsSecurityErrorMsg
	 */
   public char[] getLsSecurityErrorMsg() throws CFException{
     if (isLsSecurityErrorMsgModified()) { 
        lsSecurityErrorMsg = refreshLsSecurityErrorMsg();
     }
   		return lsSecurityErrorMsg;
   }

  
	/**
	*  set variable lsSecurityErrorMsg
	*  Corresponding COBOL Variable is LS-SECURITY-ERROR-MSG
	*  @param value
	**/
   public void setLsSecurityErrorMsg(char[] value) {
      lsSecurityErrorMsg = checkLsSecurityErrorMsgConstraints(value);
      serializeLsSecurityErrorMsg(lsSecurityErrorMsg);
   } 

     /**
	 * 	Update LsSecurityErrorMsg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsSecurityErrorMsg(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLsSecurityErrorMsg,lsSecurityErrorMsg.length);
   	
   }
   
   public void setLsSecurityErrorMsg(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLsSecurityErrorMsg,lsSecurityErrorMsg.length);
   	
   }
   
     /**
	 * 	Update LsSecurityErrorMsg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsSecurityErrorMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsSecurityErrorMsg+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LsSecurityErrorMsg with another Field
	 *	@param value
	 */
   public void setLsSecurityErrorMsg(Field source) {
       replace(source,0,source.length(),beginLsSecurityErrorMsg,LS_SECURITY_ERROR_MSG_LEN);
   	
   }  
   
     /**
	 * 	Update LsSecurityErrorMsg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsSecurityErrorMsg(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLsSecurityErrorMsg,LS_SECURITY_ERROR_MSG_LEN);
   	
   }
   
     /**
	 * 	Update LsSecurityErrorMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsSecurityErrorMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsSecurityErrorMsg+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lsSecurityStatus
	 *	@return lsSecurityStatus
	 */
   public char[] getLsSecurityStatus() throws CFException{
     if (isLsSecurityStatusModified()) { 
        lsSecurityStatus = refreshLsSecurityStatus();
     }
   		return lsSecurityStatus;
   }

  
	/**
	*  set variable lsSecurityStatus
	*  Corresponding COBOL Variable is LS-SECURITY-STATUS
	*  @param value
	**/
   public void setLsSecurityStatus(char[] value) {
      lsSecurityStatus = checkLsSecurityStatusConstraints(value);
      serializeLsSecurityStatus(lsSecurityStatus);
   } 

     /**
	 * 	Update LsSecurityStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsSecurityStatus(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLsSecurityStatus,lsSecurityStatus.length);
   	
   }
   
   public void setLsSecurityStatus(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLsSecurityStatus,lsSecurityStatus.length);
   	
   }
   
     /**
	 * 	Update LsSecurityStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsSecurityStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsSecurityStatus+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LsSecurityStatus with another Field
	 *	@param value
	 */
   public void setLsSecurityStatus(Field source) {
       replace(source,0,source.length(),beginLsSecurityStatus,LS_SECURITY_STATUS_LEN);
   	
   }  
   
     /**
	 * 	Update LsSecurityStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsSecurityStatus(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLsSecurityStatus,LS_SECURITY_STATUS_LEN);
   	
   }
   
     /**
	 * 	Update LsSecurityStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsSecurityStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsSecurityStatus+targetIndex,targetLen);
    
   }
	char[] securityNotFound8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isSecurityNotFound88()
	 *	@return  Returns true if isSecurityNotFound88() is "N"
	 */
   public boolean isSecurityNotFound88() throws CFException {
      return (  compareChars( getLsSecurityStatus() , securityNotFound8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setSecurityNotFound88True() {  			
    	setLsSecurityStatus( securityNotFound8888Value);
   	}
	char[] securityActive8888Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isSecurityActive88()
	 *	@return  Returns true if isSecurityActive88() is "A"
	 */
   public boolean isSecurityActive88() throws CFException {
      return (  compareChars( getLsSecurityStatus() , securityActive8888Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setSecurityActive88True() {  			
    	setLsSecurityStatus( securityActive8888Value);
   	}
	char[] securityInactive8888Value = "I".toCharArray();
	/**
	 *	Test condition "I" for isSecurityInactive88()
	 *	@return  Returns true if isSecurityInactive88() is "I"
	 */
   public boolean isSecurityInactive88() throws CFException {
      return (  compareChars( getLsSecurityStatus() , securityInactive8888Value)  == 0  );
   }


	/**
	*  set values "I"
	*/
   	public void setSecurityInactive88True() {  			
    	setLsSecurityStatus( securityInactive8888Value);
   	}
	char[] securityException8888Value = "S".toCharArray();
	/**
	 *	Test condition "S" for isSecurityException88()
	 *	@return  Returns true if isSecurityException88() is "S"
	 */
   public boolean isSecurityException88() throws CFException {
      return (  compareChars( getLsSecurityStatus() , securityException8888Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setSecurityException88True() {  			
    	setLsSecurityStatus( securityException8888Value);
   	}

	
	
	

		public static int getLsSecurityIoFieldLength() {
			return LS_SECURITY_IO_LENGTH;
		}

}
  
