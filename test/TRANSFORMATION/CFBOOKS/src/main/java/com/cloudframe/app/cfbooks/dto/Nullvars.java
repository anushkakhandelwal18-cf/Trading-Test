package com.cloudframe.app.cfbooks.dto;

/**
*  The class Nullvars is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-02 at 03:00. using version 5.0.0.161
**/


import com.cloudframe.app.cfbooks.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Nullvars extends NullvarsSerialized { 
   

								private short pageNull;

								private short rateNull;

								private short isbnNull;

								private short dateNull;

								private short idNull;
	
	/**
	* Constructor for Nullvars
	**/
    public Nullvars() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setPageNull((short)0);
								setRateNull((short)0);
								setIsbnNull((short)0);
								setDateNull((short)0);
								setIdNull((short)0);
    }


 

	/**
	 *	Returns the value of pageNull
	 *	@return pageNull
	 */
	public short getPageNull() throws CFException {
        if (isPageNullModified()) { 
           pageNull = refreshPageNull();
        }
   		return pageNull;
	}
	
	/**
	 * 	Update PageNull with the passed value
	 *  Corresponding COBOL Variable is WS-PAGE-NULL
	 *	@param number
	 */
	public void setPageNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    pageNull = checkPageNullMaxLimit(number); 
		serializePageNull(pageNull);
	}

	public void setPageNull(int number) {
	    number = checkPageNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPageNull((short)number);
	}
	public void setPageNull(long number) {
	    number = checkPageNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPageNull((short)number);
	}
	

	/**
	 *	Returns the value of rateNull
	 *	@return rateNull
	 */
	public short getRateNull() throws CFException {
        if (isRateNullModified()) { 
           rateNull = refreshRateNull();
        }
   		return rateNull;
	}
	
	/**
	 * 	Update RateNull with the passed value
	 *  Corresponding COBOL Variable is WS-RATE-NULL
	 *	@param number
	 */
	public void setRateNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    rateNull = checkRateNullMaxLimit(number); 
		serializeRateNull(rateNull);
	}

	public void setRateNull(int number) {
	    number = checkRateNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setRateNull((short)number);
	}
	public void setRateNull(long number) {
	    number = checkRateNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setRateNull((short)number);
	}
	

	/**
	 *	Returns the value of isbnNull
	 *	@return isbnNull
	 */
	public short getIsbnNull() throws CFException {
        if (isIsbnNullModified()) { 
           isbnNull = refreshIsbnNull();
        }
   		return isbnNull;
	}
	
	/**
	 * 	Update IsbnNull with the passed value
	 *  Corresponding COBOL Variable is WS-ISBN-NULL
	 *	@param number
	 */
	public void setIsbnNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    isbnNull = checkIsbnNullMaxLimit(number); 
		serializeIsbnNull(isbnNull);
	}

	public void setIsbnNull(int number) {
	    number = checkIsbnNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIsbnNull((short)number);
	}
	public void setIsbnNull(long number) {
	    number = checkIsbnNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIsbnNull((short)number);
	}
	

	/**
	 *	Returns the value of dateNull
	 *	@return dateNull
	 */
	public short getDateNull() throws CFException {
        if (isDateNullModified()) { 
           dateNull = refreshDateNull();
        }
   		return dateNull;
	}
	
	/**
	 * 	Update DateNull with the passed value
	 *  Corresponding COBOL Variable is WS-DATE-NULL
	 *	@param number
	 */
	public void setDateNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    dateNull = checkDateNullMaxLimit(number); 
		serializeDateNull(dateNull);
	}

	public void setDateNull(int number) {
	    number = checkDateNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setDateNull((short)number);
	}
	public void setDateNull(long number) {
	    number = checkDateNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setDateNull((short)number);
	}
	

	/**
	 *	Returns the value of idNull
	 *	@return idNull
	 */
	public short getIdNull() throws CFException {
        if (isIdNullModified()) { 
           idNull = refreshIdNull();
        }
   		return idNull;
	}
	
	/**
	 * 	Update IdNull with the passed value
	 *  Corresponding COBOL Variable is WS-ID-NULL
	 *	@param number
	 */
	public void setIdNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    idNull = checkIdNullMaxLimit(number); 
		serializeIdNull(idNull);
	}

	public void setIdNull(int number) {
	    number = checkIdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIdNull((short)number);
	}
	public void setIdNull(long number) {
	    number = checkIdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIdNull((short)number);
	}
	


	
	
	

		public static int getNullvarsFieldLength() {
			return NULLVARS_LENGTH;
		}

}
  
