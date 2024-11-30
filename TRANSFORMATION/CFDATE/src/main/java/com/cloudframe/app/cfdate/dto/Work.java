package com.cloudframe.app.cfdate.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-11-30 at 14:38. using version 5.0.0.161
**/


import com.cloudframe.app.cfdate.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized { 
   

								private long bkupDtIso;

								private int integerOfDate;

								private long julianDate;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setBkupDtIso(0L);
								setIntegerOfDate(0);
								setJulianDate(0L);
    }


 

	/**
	 *	Returns the value of bkupDtIso
	 *	@return bkupDtIso
	 */
	public long getBkupDtIso() throws CFException {
       if (isBkupDtIsoModified()) { 
           bkupDtIso = refreshBkupDtIso();
        }
   		return bkupDtIso;
	}
	

	
	   
	/**
	 * 	Update BkupDtIso with the passed value
	 *  Corresponding COBOL Variable is WS-BKUP-DT-ISO
	 *	@param number
	 */
	public void setBkupDtIso(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    bkupDtIso = checkBkupDtIsoMaxLimit(number); 
		serializeBkupDtIso(bkupDtIso);
	}
	

	/**
	 * 	Update BkupDtIso with the passed value
	 *	@param value (String or char[])
	 */
	public void setBkupDtIso(char[] value) throws CFException {
		 bkupDtIso = serializeBkupDtIso(value);
	}
	/**
	 * 	Update BkupDtIso with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBkupDtIsoString(char[] value) throws CFException {
		 setBkupDtIso(value);
	}
	/**
	 *	Returns the value of integerOfDate
	 *	@return integerOfDate
	 */
	public int getIntegerOfDate() throws CFException {
   		return integerOfDate;
	}
	
	/**
	 * 	Update IntegerOfDate with the passed value
	 *  Corresponding COBOL Variable is WS-INTEGER-OF-DATE
	 *	@param number
	 */
	public void setIntegerOfDate(int number) {
	     // Truncate if the number is beyond +/- Max range
	    integerOfDate = checkIntegerOfDateMaxLimit(number); 
	}


	public void setIntegerOfDate(long number) {
	    number = checkIntegerOfDateMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIntegerOfDate((int)number);
	}
	
	/**
	 *	Returns the value of julianDate
	 *	@return julianDate
	 */
	public long getJulianDate() throws CFException {
       if (isJulianDateModified()) { 
           julianDate = refreshJulianDate();
        }
   		return julianDate;
	}
	

	
	   
	/**
	 * 	Update JulianDate with the passed value
	 *  Corresponding COBOL Variable is WS-JULIAN-DATE
	 *	@param number
	 */
	public void setJulianDate(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    julianDate = checkJulianDateMaxLimit(number); 
		serializeJulianDate(julianDate);
	}
	

	/**
	 * 	Update JulianDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setJulianDate(char[] value) throws CFException {
		 julianDate = serializeJulianDate(value);
	}
	/**
	 * 	Update JulianDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setJulianDateString(char[] value) throws CFException {
		 setJulianDate(value);
	}

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
