package com.cloudframe.app.dto.mstpb002;

/**
*  The class Dcltbtrdsec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-03 at 13:42. using version 5.0.0.162
**/


import com.cloudframe.app.dto.serialize.mstpb002.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Dcltbtrdsec extends DcltbtrdsecSerialized { 
   

						private char[] secFigi = Field.fillLowValue(12);

						private char[] secCurrency = Field.fillLowValue(3);

						private char[] secDescription = Field.fillLowValue(40);

						private char[] secSymbol = Field.fillLowValue(20);

						private char[] secShareClassFigi = Field.fillLowValue(12);

						private char[] secType = Field.fillLowValue(20);
	
	/**
	* Constructor for Dcltbtrdsec
	**/
    public Dcltbtrdsec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of secFigi
	 *	@return secFigi
	 */
   public char[] getSecFigi() throws CFException{
     if (isSecFigiModified()) { 
        secFigi = refreshSecFigi();
     }
   		return secFigi;
   }

  
	/**
	*  set variable secFigi
	*  Corresponding COBOL Variable is SEC-FIGI
	*  @param value
	**/
   public void setSecFigi(char[] value) {
      secFigi = checkSecFigiConstraints(value);
      serializeSecFigi(secFigi);
   } 

     /**
	 * 	Update SecFigi 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSecFigi(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSecFigi,secFigi.length);
   	
   }
   
   public void setSecFigi(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSecFigi,secFigi.length);
   	
   }
   
     /**
	 * 	Update SecFigi 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSecFigi(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSecFigi+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SecFigi with another Field
	 *	@param value
	 */
   public void setSecFigi(Field source) {
       replace(source,0,source.length(),beginSecFigi,SEC_FIGI_LEN);
   	
   }  
   
     /**
	 * 	Update SecFigi 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSecFigi(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSecFigi,SEC_FIGI_LEN);
   	
   }
   
     /**
	 * 	Update SecFigi 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSecFigi(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSecFigi+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of secCurrency
	 *	@return secCurrency
	 */
   public char[] getSecCurrency() throws CFException{
     if (isSecCurrencyModified()) { 
        secCurrency = refreshSecCurrency();
     }
   		return secCurrency;
   }

  
	/**
	*  set variable secCurrency
	*  Corresponding COBOL Variable is SEC-CURRENCY
	*  @param value
	**/
   public void setSecCurrency(char[] value) {
      secCurrency = checkSecCurrencyConstraints(value);
      serializeSecCurrency(secCurrency);
   } 

     /**
	 * 	Update SecCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSecCurrency(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSecCurrency,secCurrency.length);
   	
   }
   
   public void setSecCurrency(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSecCurrency,secCurrency.length);
   	
   }
   
     /**
	 * 	Update SecCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSecCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSecCurrency+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SecCurrency with another Field
	 *	@param value
	 */
   public void setSecCurrency(Field source) {
       replace(source,0,source.length(),beginSecCurrency,SEC_CURRENCY_LEN);
   	
   }  
   
     /**
	 * 	Update SecCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSecCurrency(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSecCurrency,SEC_CURRENCY_LEN);
   	
   }
   
     /**
	 * 	Update SecCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSecCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSecCurrency+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of secDescription
	 *	@return secDescription
	 */
   public char[] getSecDescription() throws CFException{
     if (isSecDescriptionModified()) { 
        secDescription = refreshSecDescription();
     }
   		return secDescription;
   }

  
	/**
	*  set variable secDescription
	*  Corresponding COBOL Variable is SEC-DESCRIPTION
	*  @param value
	**/
   public void setSecDescription(char[] value) {
      secDescription = checkSecDescriptionConstraints(value);
      serializeSecDescription(secDescription);
   } 

     /**
	 * 	Update SecDescription 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSecDescription(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSecDescription,secDescription.length);
   	
   }
   
   public void setSecDescription(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSecDescription,secDescription.length);
   	
   }
   
     /**
	 * 	Update SecDescription 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSecDescription(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSecDescription+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SecDescription with another Field
	 *	@param value
	 */
   public void setSecDescription(Field source) {
       replace(source,0,source.length(),beginSecDescription,SEC_DESCRIPTION_LEN);
   	
   }  
   
     /**
	 * 	Update SecDescription 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSecDescription(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSecDescription,SEC_DESCRIPTION_LEN);
   	
   }
   
     /**
	 * 	Update SecDescription 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSecDescription(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSecDescription+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of secSymbol
	 *	@return secSymbol
	 */
   public char[] getSecSymbol() throws CFException{
     if (isSecSymbolModified()) { 
        secSymbol = refreshSecSymbol();
     }
   		return secSymbol;
   }

  
	/**
	*  set variable secSymbol
	*  Corresponding COBOL Variable is SEC-SYMBOL
	*  @param value
	**/
   public void setSecSymbol(char[] value) {
      secSymbol = checkSecSymbolConstraints(value);
      serializeSecSymbol(secSymbol);
   } 

     /**
	 * 	Update SecSymbol 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSecSymbol(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSecSymbol,secSymbol.length);
   	
   }
   
   public void setSecSymbol(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSecSymbol,secSymbol.length);
   	
   }
   
     /**
	 * 	Update SecSymbol 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSecSymbol(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSecSymbol+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SecSymbol with another Field
	 *	@param value
	 */
   public void setSecSymbol(Field source) {
       replace(source,0,source.length(),beginSecSymbol,SEC_SYMBOL_LEN);
   	
   }  
   
     /**
	 * 	Update SecSymbol 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSecSymbol(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSecSymbol,SEC_SYMBOL_LEN);
   	
   }
   
     /**
	 * 	Update SecSymbol 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSecSymbol(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSecSymbol+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of secShareClassFigi
	 *	@return secShareClassFigi
	 */
   public char[] getSecShareClassFigi() throws CFException{
     if (isSecShareClassFigiModified()) { 
        secShareClassFigi = refreshSecShareClassFigi();
     }
   		return secShareClassFigi;
   }

  
	/**
	*  set variable secShareClassFigi
	*  Corresponding COBOL Variable is SEC-SHARE-CLASS-FIGI
	*  @param value
	**/
   public void setSecShareClassFigi(char[] value) {
      secShareClassFigi = checkSecShareClassFigiConstraints(value);
      serializeSecShareClassFigi(secShareClassFigi);
   } 

     /**
	 * 	Update SecShareClassFigi 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSecShareClassFigi(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSecShareClassFigi,secShareClassFigi.length);
   	
   }
   
   public void setSecShareClassFigi(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSecShareClassFigi,secShareClassFigi.length);
   	
   }
   
     /**
	 * 	Update SecShareClassFigi 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSecShareClassFigi(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSecShareClassFigi+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SecShareClassFigi with another Field
	 *	@param value
	 */
   public void setSecShareClassFigi(Field source) {
       replace(source,0,source.length(),beginSecShareClassFigi,SEC_SHARE_CLASS_FIGI_LEN);
   	
   }  
   
     /**
	 * 	Update SecShareClassFigi 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSecShareClassFigi(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSecShareClassFigi,SEC_SHARE_CLASS_FIGI_LEN);
   	
   }
   
     /**
	 * 	Update SecShareClassFigi 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSecShareClassFigi(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSecShareClassFigi+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of secType
	 *	@return secType
	 */
   public char[] getSecType() throws CFException{
     if (isSecTypeModified()) { 
        secType = refreshSecType();
     }
   		return secType;
   }

  
	/**
	*  set variable secType
	*  Corresponding COBOL Variable is SEC-TYPE
	*  @param value
	**/
   public void setSecType(char[] value) {
      secType = checkSecTypeConstraints(value);
      serializeSecType(secType);
   } 

     /**
	 * 	Update SecType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSecType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSecType,secType.length);
   	
   }
   
   public void setSecType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSecType,secType.length);
   	
   }
   
     /**
	 * 	Update SecType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSecType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSecType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SecType with another Field
	 *	@param value
	 */
   public void setSecType(Field source) {
       replace(source,0,source.length(),beginSecType,SEC_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update SecType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSecType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSecType,SEC_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update SecType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSecType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSecType+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDcltbtrdsecFieldLength() {
			return DCLTBTRDSEC_LENGTH;
		}

}
  
