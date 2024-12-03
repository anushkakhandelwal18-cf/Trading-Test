package com.cloudframe.app.dto.trdpb006;

/**
*  The class DetailRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-03 at 15:03. using version 5.0.0.163
**/


import com.cloudframe.app.dto.serialize.trdpb006.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DetailRec extends DetailRecSerialized { 
   


						private char[] detTradeid = Field.fillLowValue(10);


						private char[] detBuyerSeller = Field.fillLowValue(12);


						private char[] detTradingXchng = Field.fillLowValue(12);


						private char[] detFigi = Field.fillLowValue(12);


						private char[] detSymbol = Field.fillLowValue(20);


						private char[] detDescription = Field.fillLowValue(40);


						private char[] detType = Field.fillLowValue(15);


								private char[] detQuantity = Field.fillLowValue(12);


						private char[] detCurrency = Field.fillLowValue(3);


								private char[] detAmount = Field.fillLowValue(12);

	
	/**
	* Constructor for DetailRec
	**/
    public DetailRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("|").toCharArray()
             , getStartOffset() + 0
             ,1
             );
       replaceValue( // serialize and save the value
             ("|").toCharArray()
             , getStartOffset() + 11
             ,1
             );
       replaceValue( // serialize and save the value
             ("|").toCharArray()
             , getStartOffset() + 24
             ,1
             );
       replaceValue( // serialize and save the value
             ("|").toCharArray()
             , getStartOffset() + 37
             ,1
             );
       replaceValue( // serialize and save the value
             ("|").toCharArray()
             , getStartOffset() + 50
             ,1
             );
       replaceValue( // serialize and save the value
             ("|").toCharArray()
             , getStartOffset() + 71
             ,1
             );
       replaceValue( // serialize and save the value
             ("|").toCharArray()
             , getStartOffset() + 112
             ,1
             );
       replaceValue( // serialize and save the value
             ("|").toCharArray()
             , getStartOffset() + 128
             ,1
             );
       replaceValue( // serialize and save the value
             ("|").toCharArray()
             , getStartOffset() + 141
             ,1
             );
       replaceValue( // serialize and save the value
             ("|").toCharArray()
             , getStartOffset() + 145
             ,1
             );
       replaceValue( // serialize and save the value
             ("|").toCharArray()
             , getStartOffset() + 158
             ,1
             );
    }


 

	/**
	 *	Returns the value of detTradeid
	 *	@return detTradeid
	 */
   public char[] getDetTradeid() throws CFException{
     if (isDetTradeidModified()) { 
        detTradeid = refreshDetTradeid();
     }
   		return detTradeid;
   }

  
	/**
	*  set variable detTradeid
	*  Corresponding COBOL Variable is WS-DET-TRADEID
	*  @param value
	**/
   public void setDetTradeid(char[] value) {
      detTradeid = checkDetTradeidConstraints(value);
      serializeDetTradeid(detTradeid);
   } 

     /**
	 * 	Update DetTradeid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDetTradeid(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDetTradeid,detTradeid.length);
   	
   }
   
   public void setDetTradeid(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDetTradeid,detTradeid.length);
   	
   }
   
     /**
	 * 	Update DetTradeid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDetTradeid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDetTradeid+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DetTradeid with another Field
	 *	@param value
	 */
   public void setDetTradeid(Field source) {
       replace(source,0,source.length(),beginDetTradeid,DET_TRADEID_LEN);
   	
   }  
   
     /**
	 * 	Update DetTradeid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDetTradeid(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDetTradeid,DET_TRADEID_LEN);
   	
   }
   
     /**
	 * 	Update DetTradeid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDetTradeid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDetTradeid+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of detBuyerSeller
	 *	@return detBuyerSeller
	 */
   public char[] getDetBuyerSeller() throws CFException{
     if (isDetBuyerSellerModified()) { 
        detBuyerSeller = refreshDetBuyerSeller();
     }
   		return detBuyerSeller;
   }

  
	/**
	*  set variable detBuyerSeller
	*  Corresponding COBOL Variable is WS-DET-BUYER-SELLER
	*  @param value
	**/
   public void setDetBuyerSeller(char[] value) {
      detBuyerSeller = checkDetBuyerSellerConstraints(value);
      serializeDetBuyerSeller(detBuyerSeller);
   } 

     /**
	 * 	Update DetBuyerSeller 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDetBuyerSeller(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDetBuyerSeller,detBuyerSeller.length);
   	
   }
   
   public void setDetBuyerSeller(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDetBuyerSeller,detBuyerSeller.length);
   	
   }
   
     /**
	 * 	Update DetBuyerSeller 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDetBuyerSeller(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDetBuyerSeller+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DetBuyerSeller with another Field
	 *	@param value
	 */
   public void setDetBuyerSeller(Field source) {
       replace(source,0,source.length(),beginDetBuyerSeller,DET_BUYER_SELLER_LEN);
   	
   }  
   
     /**
	 * 	Update DetBuyerSeller 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDetBuyerSeller(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDetBuyerSeller,DET_BUYER_SELLER_LEN);
   	
   }
   
     /**
	 * 	Update DetBuyerSeller 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDetBuyerSeller(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDetBuyerSeller+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of detTradingXchng
	 *	@return detTradingXchng
	 */
   public char[] getDetTradingXchng() throws CFException{
     if (isDetTradingXchngModified()) { 
        detTradingXchng = refreshDetTradingXchng();
     }
   		return detTradingXchng;
   }

  
	/**
	*  set variable detTradingXchng
	*  Corresponding COBOL Variable is WS-DET-TRADING-XCHNG
	*  @param value
	**/
   public void setDetTradingXchng(char[] value) {
      detTradingXchng = checkDetTradingXchngConstraints(value);
      serializeDetTradingXchng(detTradingXchng);
   } 

     /**
	 * 	Update DetTradingXchng 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDetTradingXchng(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDetTradingXchng,detTradingXchng.length);
   	
   }
   
   public void setDetTradingXchng(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDetTradingXchng,detTradingXchng.length);
   	
   }
   
     /**
	 * 	Update DetTradingXchng 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDetTradingXchng(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDetTradingXchng+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DetTradingXchng with another Field
	 *	@param value
	 */
   public void setDetTradingXchng(Field source) {
       replace(source,0,source.length(),beginDetTradingXchng,DET_TRADING_XCHNG_LEN);
   	
   }  
   
     /**
	 * 	Update DetTradingXchng 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDetTradingXchng(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDetTradingXchng,DET_TRADING_XCHNG_LEN);
   	
   }
   
     /**
	 * 	Update DetTradingXchng 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDetTradingXchng(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDetTradingXchng+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of detFigi
	 *	@return detFigi
	 */
   public char[] getDetFigi() throws CFException{
     if (isDetFigiModified()) { 
        detFigi = refreshDetFigi();
     }
   		return detFigi;
   }

  
	/**
	*  set variable detFigi
	*  Corresponding COBOL Variable is WS-DET-FIGI
	*  @param value
	**/
   public void setDetFigi(char[] value) {
      detFigi = checkDetFigiConstraints(value);
      serializeDetFigi(detFigi);
   } 

     /**
	 * 	Update DetFigi 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDetFigi(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDetFigi,detFigi.length);
   	
   }
   
   public void setDetFigi(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDetFigi,detFigi.length);
   	
   }
   
     /**
	 * 	Update DetFigi 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDetFigi(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDetFigi+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DetFigi with another Field
	 *	@param value
	 */
   public void setDetFigi(Field source) {
       replace(source,0,source.length(),beginDetFigi,DET_FIGI_LEN);
   	
   }  
   
     /**
	 * 	Update DetFigi 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDetFigi(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDetFigi,DET_FIGI_LEN);
   	
   }
   
     /**
	 * 	Update DetFigi 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDetFigi(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDetFigi+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of detSymbol
	 *	@return detSymbol
	 */
   public char[] getDetSymbol() throws CFException{
     if (isDetSymbolModified()) { 
        detSymbol = refreshDetSymbol();
     }
   		return detSymbol;
   }

  
	/**
	*  set variable detSymbol
	*  Corresponding COBOL Variable is WS-DET-SYMBOL
	*  @param value
	**/
   public void setDetSymbol(char[] value) {
      detSymbol = checkDetSymbolConstraints(value);
      serializeDetSymbol(detSymbol);
   } 

     /**
	 * 	Update DetSymbol 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDetSymbol(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDetSymbol,detSymbol.length);
   	
   }
   
   public void setDetSymbol(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDetSymbol,detSymbol.length);
   	
   }
   
     /**
	 * 	Update DetSymbol 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDetSymbol(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDetSymbol+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DetSymbol with another Field
	 *	@param value
	 */
   public void setDetSymbol(Field source) {
       replace(source,0,source.length(),beginDetSymbol,DET_SYMBOL_LEN);
   	
   }  
   
     /**
	 * 	Update DetSymbol 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDetSymbol(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDetSymbol,DET_SYMBOL_LEN);
   	
   }
   
     /**
	 * 	Update DetSymbol 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDetSymbol(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDetSymbol+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of detDescription
	 *	@return detDescription
	 */
   public char[] getDetDescription() throws CFException{
     if (isDetDescriptionModified()) { 
        detDescription = refreshDetDescription();
     }
   		return detDescription;
   }

  
	/**
	*  set variable detDescription
	*  Corresponding COBOL Variable is WS-DET-DESCRIPTION
	*  @param value
	**/
   public void setDetDescription(char[] value) {
      detDescription = checkDetDescriptionConstraints(value);
      serializeDetDescription(detDescription);
   } 

     /**
	 * 	Update DetDescription 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDetDescription(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDetDescription,detDescription.length);
   	
   }
   
   public void setDetDescription(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDetDescription,detDescription.length);
   	
   }
   
     /**
	 * 	Update DetDescription 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDetDescription(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDetDescription+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DetDescription with another Field
	 *	@param value
	 */
   public void setDetDescription(Field source) {
       replace(source,0,source.length(),beginDetDescription,DET_DESCRIPTION_LEN);
   	
   }  
   
     /**
	 * 	Update DetDescription 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDetDescription(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDetDescription,DET_DESCRIPTION_LEN);
   	
   }
   
     /**
	 * 	Update DetDescription 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDetDescription(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDetDescription+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of detType
	 *	@return detType
	 */
   public char[] getDetType() throws CFException{
     if (isDetTypeModified()) { 
        detType = refreshDetType();
     }
   		return detType;
   }

  
	/**
	*  set variable detType
	*  Corresponding COBOL Variable is WS-DET-TYPE
	*  @param value
	**/
   public void setDetType(char[] value) {
      detType = checkDetTypeConstraints(value);
      serializeDetType(detType);
   } 

     /**
	 * 	Update DetType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDetType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDetType,detType.length);
   	
   }
   
   public void setDetType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDetType,detType.length);
   	
   }
   
     /**
	 * 	Update DetType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDetType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDetType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DetType with another Field
	 *	@param value
	 */
   public void setDetType(Field source) {
       replace(source,0,source.length(),beginDetType,DET_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update DetType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDetType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDetType,DET_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update DetType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDetType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDetType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of detQuantity
	 *	@return detQuantity
	 */
   public char[] getDetQuantity() throws CFException{
     if (isDetQuantityModified()) { 
        detQuantity = refreshDetQuantity();
     }
   		return detQuantity;
   }

  
	/**
	*  set variable detQuantity
	*  Corresponding COBOL Variable is WS-DET-QUANTITY
	*  @param value
	**/
   public void setDetQuantity(char[] value) {
      detQuantity = checkDetQuantityConstraints(value);
      serializeDetQuantity(detQuantity);
   } 

     /**
	 * 	Update DetQuantity 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDetQuantity(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDetQuantity,detQuantity.length);
   	
   }
   
   public void setDetQuantity(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDetQuantity,detQuantity.length);
   	
   }
   
     /**
	 * 	Update DetQuantity 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDetQuantity(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDetQuantity+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DetQuantity with another Field
	 *	@param value
	 */
   public void setDetQuantity(Field source) {
       replace(source,0,source.length(),beginDetQuantity,DET_QUANTITY_LEN);
   	
   }  
   
     /**
	 * 	Update DetQuantity 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDetQuantity(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDetQuantity,DET_QUANTITY_LEN);
   	
   }
   
     /**
	 * 	Update DetQuantity 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDetQuantity(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDetQuantity+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of detCurrency
	 *	@return detCurrency
	 */
   public char[] getDetCurrency() throws CFException{
     if (isDetCurrencyModified()) { 
        detCurrency = refreshDetCurrency();
     }
   		return detCurrency;
   }

  
	/**
	*  set variable detCurrency
	*  Corresponding COBOL Variable is WS-DET-CURRENCY
	*  @param value
	**/
   public void setDetCurrency(char[] value) {
      detCurrency = checkDetCurrencyConstraints(value);
      serializeDetCurrency(detCurrency);
   } 

     /**
	 * 	Update DetCurrency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDetCurrency(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDetCurrency,detCurrency.length);
   	
   }
   
   public void setDetCurrency(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDetCurrency,detCurrency.length);
   	
   }
   
     /**
	 * 	Update DetCurrency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDetCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDetCurrency+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DetCurrency with another Field
	 *	@param value
	 */
   public void setDetCurrency(Field source) {
       replace(source,0,source.length(),beginDetCurrency,DET_CURRENCY_LEN);
   	
   }  
   
     /**
	 * 	Update DetCurrency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDetCurrency(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDetCurrency,DET_CURRENCY_LEN);
   	
   }
   
     /**
	 * 	Update DetCurrency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDetCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDetCurrency+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of detAmount
	 *	@return detAmount
	 */
   public char[] getDetAmount() throws CFException{
     if (isDetAmountModified()) { 
        detAmount = refreshDetAmount();
     }
   		return detAmount;
   }

  
	/**
	*  set variable detAmount
	*  Corresponding COBOL Variable is WS-DET-AMOUNT
	*  @param value
	**/
   public void setDetAmount(char[] value) {
      detAmount = checkDetAmountConstraints(value);
      serializeDetAmount(detAmount);
   } 

     /**
	 * 	Update DetAmount 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDetAmount(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDetAmount,detAmount.length);
   	
   }
   
   public void setDetAmount(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDetAmount,detAmount.length);
   	
   }
   
     /**
	 * 	Update DetAmount 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDetAmount(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDetAmount+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DetAmount with another Field
	 *	@param value
	 */
   public void setDetAmount(Field source) {
       replace(source,0,source.length(),beginDetAmount,DET_AMOUNT_LEN);
   	
   }  
   
     /**
	 * 	Update DetAmount 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDetAmount(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDetAmount,DET_AMOUNT_LEN);
   	
   }
   
     /**
	 * 	Update DetAmount 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDetAmount(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDetAmount+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDetailRecFieldLength() {
			return DETAIL_REC_LENGTH;
		}

}
  
