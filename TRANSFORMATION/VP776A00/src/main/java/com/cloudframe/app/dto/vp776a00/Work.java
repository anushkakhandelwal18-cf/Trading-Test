package com.cloudframe.app.dto.vp776a00;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.vp776a00.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized { 
   

								private short pwaSortGap;

								private short pwaLimit;

								private short pwaSub1;

								private short pwaSub2;

						private char[] pwaSwapEntry = Field.fillLowValue(32767);

						private char[] pwaSortSwitch = new char[1];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setPwaSortGap((short)0);
								setPwaLimit((short)0);
								setPwaSub1((short)0);
								setPwaSub2((short)0);
								setPwaSortSwitch(("I").toCharArray());
    }


 

	/**
	 *	Returns the value of pwaSortGap
	 *	@return pwaSortGap
	 */
	public short getPwaSortGap() throws CFException {
   		return pwaSortGap;
	}
	
	/**
	 * 	Update PwaSortGap with the passed value
	 *  Corresponding COBOL Variable is PWA-SORT-GAP
	 *	@param number
	 */
	public void setPwaSortGap(short number) {
	     // Truncate if the number is beyond +/- Max range
	    pwaSortGap = checkPwaSortGapMaxLimit(number); 
	}

	public void setPwaSortGap(int number) {
	    number = checkPwaSortGapMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPwaSortGap((short)number);
	}
	public void setPwaSortGap(long number) {
	    number = checkPwaSortGapMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPwaSortGap((short)number);
	}
	

	/**
	 *	Returns the value of pwaLimit
	 *	@return pwaLimit
	 */
	public short getPwaLimit() throws CFException {
   		return pwaLimit;
	}
	
	/**
	 * 	Update PwaLimit with the passed value
	 *  Corresponding COBOL Variable is PWA-LIMIT
	 *	@param number
	 */
	public void setPwaLimit(short number) {
	     // Truncate if the number is beyond +/- Max range
	    pwaLimit = checkPwaLimitMaxLimit(number); 
	}

	public void setPwaLimit(int number) {
	    number = checkPwaLimitMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPwaLimit((short)number);
	}
	public void setPwaLimit(long number) {
	    number = checkPwaLimitMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPwaLimit((short)number);
	}
	

	/**
	 *	Returns the value of pwaSub1
	 *	@return pwaSub1
	 */
	public short getPwaSub1() throws CFException {
   		return pwaSub1;
	}
	
	/**
	 * 	Update PwaSub1 with the passed value
	 *  Corresponding COBOL Variable is PWA-SUB1
	 *	@param number
	 */
	public void setPwaSub1(short number) {
	     // Truncate if the number is beyond +/- Max range
	    pwaSub1 = checkPwaSub1MaxLimit(number); 
	}

	public void setPwaSub1(int number) {
	    number = checkPwaSub1MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPwaSub1((short)number);
	}
	public void setPwaSub1(long number) {
	    number = checkPwaSub1MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPwaSub1((short)number);
	}
	

	/**
	 *	Returns the value of pwaSub2
	 *	@return pwaSub2
	 */
	public short getPwaSub2() throws CFException {
   		return pwaSub2;
	}
	
	/**
	 * 	Update PwaSub2 with the passed value
	 *  Corresponding COBOL Variable is PWA-SUB2
	 *	@param number
	 */
	public void setPwaSub2(short number) {
	     // Truncate if the number is beyond +/- Max range
	    pwaSub2 = checkPwaSub2MaxLimit(number); 
	}

	public void setPwaSub2(int number) {
	    number = checkPwaSub2MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPwaSub2((short)number);
	}
	public void setPwaSub2(long number) {
	    number = checkPwaSub2MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPwaSub2((short)number);
	}
	

	/**
	 *	Returns the value of pwaSwapEntry
	 *	@return pwaSwapEntry
	 */
   public char[] getPwaSwapEntry() throws CFException{
   		return pwaSwapEntry;
   }

  
	/**
	*  set variable pwaSwapEntry
	*  Corresponding COBOL Variable is PWA-SWAP-ENTRY
	*  @param value
	**/
   public void setPwaSwapEntry(char[] value) {
       value = checkPwaSwapEntryConstraints(value);
       arraycopy(value,0,pwaSwapEntry,0,value.length);
   } 
	public void setPwaSwapEntry(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pwaSwapEntry,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pwaSortSwitch
	 *	@return pwaSortSwitch
	 */
   public char[] getPwaSortSwitch() throws CFException{
   		return pwaSortSwitch;
   }

  
	/**
	*  set variable pwaSortSwitch
	*  Corresponding COBOL Variable is PWA-SORT-SWITCH
	*  @param value
	**/
   public void setPwaSortSwitch(char[] value) {
       value = checkPwaSortSwitchConstraints(value);
       arraycopy(value,0,pwaSortSwitch,0,value.length);
   } 
	public void setPwaSortSwitch(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pwaSortSwitch,0,beginIndex + endIndex);
   }
	char[] pwaSortComplete88Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isPwaSortComplete()
	 *	@return  Returns true if isPwaSortComplete() is "C"
	 */
   public boolean isPwaSortComplete() throws CFException {
      return (  compareChars( getPwaSortSwitch() , pwaSortComplete88Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setPwaSortCompleteTrue() {  			
    	setPwaSortSwitch( pwaSortComplete88Value);
   	}
	char[] pwaSortIncomplete88Value = "I".toCharArray();
	/**
	 *	Test condition "I" for isPwaSortIncomplete()
	 *	@return  Returns true if isPwaSortIncomplete() is "I"
	 */
   public boolean isPwaSortIncomplete() throws CFException {
      return (  compareChars( getPwaSortSwitch() , pwaSortIncomplete88Value)  == 0  );
   }


	/**
	*  set values "I"
	*/
   	public void setPwaSortIncompleteTrue() {  			
    	setPwaSortSwitch( pwaSortIncomplete88Value);
   	}

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
