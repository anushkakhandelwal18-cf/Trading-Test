package com.cloudframe.app.dto.trdpb001;

/**
*  The class Parm is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-02 at 13:43. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.trdpb001.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Parm extends ParmSerialized { 
   

								private short parmLen;

						private char[] currency = Field.fillLowValue(3);


								private int chkpFrequency;
	
	/**
	* Constructor for Parm
	**/
    public Parm() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of parmLen
	 *	@return parmLen
	 */
	public short getParmLen() throws CFException {
        if (isParmLenModified()) { 
           parmLen = refreshParmLen();
        }
   		return parmLen;
	}
	
	/**
	 * 	Update ParmLen with the passed value
	 *  Corresponding COBOL Variable is LK-PARM-LEN
	 *	@param number
	 */
	public void setParmLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    parmLen = checkParmLenMaxLimit(number); 
		serializeParmLen(parmLen);
	}

	public void setParmLen(int number) {
	    number = checkParmLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setParmLen((short)number);
	}
	public void setParmLen(long number) {
	    number = checkParmLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setParmLen((short)number);
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
	*  Corresponding COBOL Variable is LK-CURRENCY
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
	static java.util.Set<String> validCurrency88Value = new java.util.HashSet<>();
static { 
	validCurrency88Value.add( "CAD");
	validCurrency88Value.add( "CHF");
	validCurrency88Value.add( "CNY");
	validCurrency88Value.add( "EUR");
	validCurrency88Value.add( "GBX");
	validCurrency88Value.add( "INR");
	validCurrency88Value.add( "JPY");
	validCurrency88Value.add( "KRW");
	validCurrency88Value.add( "MXN");
	validCurrency88Value.add( "USD");
} 

	/**
	 *	Test condition "CAD" "CHF" "CNY" "EUR" "GBX" "INR" "JPY" "KRW" "MXN" "USD" for isValidCurrency()
	 *	@return  Returns true if isValidCurrency() is "CAD" "CHF" "CNY" "EUR" "GBX" "INR" "JPY" "KRW" "MXN" "USD"
	 */
   public boolean isValidCurrency() throws CFException {
      return   validCurrency88Value.contains(String.valueOf(getCurrency()));
   }


	/**
	*  set values "CAD" "CHF" "CNY" "EUR" "GBX" "INR" "JPY" "KRW" "MXN" "USD"
	*/
   	public void setValidCurrencyTrue() {  			
    	  setCurrency(validCurrency88Value.iterator().next().toCharArray());
   	}
	/**
	 *	Returns the value of chkpFrequency
	 *	@return chkpFrequency
	 */
	public int getChkpFrequency() throws CFException {
       if (isChkpFrequencyModified()) { 
           chkpFrequency = refreshChkpFrequency();
        }
   		return chkpFrequency;
	}
	

	
	   
	/**
	 * 	Update ChkpFrequency with the passed value
	 *  Corresponding COBOL Variable is LK-CHKP-FREQUENCY
	 *	@param number
	 */
	public void setChkpFrequency(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    chkpFrequency = checkChkpFrequencyMaxLimit(number); 
		serializeChkpFrequency(chkpFrequency);
	}
	

	public void setChkpFrequency(long number) {
	    number = checkChkpFrequencyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setChkpFrequency((int)number);
	}
	
	/**
	 * 	Update ChkpFrequency with the passed value
	 *	@param value (String or char[])
	 */
	public void setChkpFrequency(char[] value) throws CFException {
		 chkpFrequency = serializeChkpFrequency(value);
	}
	/**
	 * 	Update ChkpFrequency with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setChkpFrequencyString(char[] value) throws CFException {
		 setChkpFrequency(value);
	}

	
	
	

		public static int getParmFieldLength() {
			return PARM_LENGTH;
		}

}
  
