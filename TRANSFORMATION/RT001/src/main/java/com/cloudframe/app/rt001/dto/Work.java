package com.cloudframe.app.rt001.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-11-22 at 06:10. using version 5.0.0.158
**/


import com.cloudframe.app.rt001.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized { 
   

								private int firstNumber;

								private int secondNumber;

								private int theResult;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setFirstNumber(9);
								setSecondNumber(9);
    }


 

	/**
	 *	Returns the value of firstNumber
	 *	@return firstNumber
	 */
	public int getFirstNumber() throws CFException {
       if (isFirstNumberModified()) { 
           firstNumber = refreshFirstNumber();
        }
   		return firstNumber;
	}
	

	
	   
	/**
	 * 	Update FirstNumber with the passed value
	 *  Corresponding COBOL Variable is FIRST-NUMBER
	 *	@param number
	 */
	public void setFirstNumber(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    firstNumber = checkFirstNumberMaxLimit(number); 
		serializeFirstNumber(firstNumber);
	}
	

	public void setFirstNumber(long number) {
	    number = checkFirstNumberMaxLimit(number); // Truncate if value is beyond +/- Max range
		setFirstNumber((int)number);
	}
	
	/**
	 * 	Update FirstNumber with the passed value
	 *	@param value (String or char[])
	 */
	public void setFirstNumber(char[] value) throws CFException {
		 firstNumber = serializeFirstNumber(value);
	}
	/**
	 * 	Update FirstNumber with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFirstNumberString(char[] value) throws CFException {
		 setFirstNumber(value);
	}
	/**
	 *	Returns the value of secondNumber
	 *	@return secondNumber
	 */
	public int getSecondNumber() throws CFException {
       if (isSecondNumberModified()) { 
           secondNumber = refreshSecondNumber();
        }
   		return secondNumber;
	}
	

	
	   
	/**
	 * 	Update SecondNumber with the passed value
	 *  Corresponding COBOL Variable is SECOND-NUMBER
	 *	@param number
	 */
	public void setSecondNumber(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    secondNumber = checkSecondNumberMaxLimit(number); 
		serializeSecondNumber(secondNumber);
	}
	

	public void setSecondNumber(long number) {
	    number = checkSecondNumberMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSecondNumber((int)number);
	}
	
	/**
	 * 	Update SecondNumber with the passed value
	 *	@param value (String or char[])
	 */
	public void setSecondNumber(char[] value) throws CFException {
		 secondNumber = serializeSecondNumber(value);
	}
	/**
	 * 	Update SecondNumber with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSecondNumberString(char[] value) throws CFException {
		 setSecondNumber(value);
	}
	/**
	 *	Returns the value of theResult
	 *	@return theResult
	 */
	public int getTheResult() throws CFException {
       if (isTheResultModified()) { 
           theResult = refreshTheResult();
        }
   		return theResult;
	}
	

	
	   
	/**
	 * 	Update TheResult with the passed value
	 *  Corresponding COBOL Variable is THE-RESULT
	 *	@param number
	 */
	public void setTheResult(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    theResult = checkTheResultMaxLimit(number); 
		serializeTheResult(theResult);
	}
	

	public void setTheResult(long number) {
	    number = checkTheResultMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTheResult((int)number);
	}
	
	/**
	 * 	Update TheResult with the passed value
	 *	@param value (String or char[])
	 */
	public void setTheResult(char[] value) throws CFException {
		 theResult = serializeTheResult(value);
	}
	/**
	 * 	Update TheResult with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTheResultString(char[] value) throws CFException {
		 setTheResult(value);
	}

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
