package com.cloudframe.app.dto.o529351u;

/**
*  The class SavRecTyp1Fixed is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SavRecTyp1Fixed extends SavRecTyp1FixedSerialized { 
   

								private short savNbrClminf;

								private short savNbrHist;

								private short savNbrOfLines;

								private short savNbrRec4;

								private short savNbrRec4Ins;
	
	/**
	* Constructor for SavRecTyp1Fixed
	**/
    public SavRecTyp1Fixed() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SavRecTyp1Fixed. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SavRecTyp1Fixed(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of savNbrClminf
	 *	@return savNbrClminf
	 */
	public short getSavNbrClminf() throws CFException {
        if (isSavNbrClminfModified()) { 
           savNbrClminf = refreshSavNbrClminf();
        }
   		return savNbrClminf;
	}
	
	/**
	 * 	Update SavNbrClminf with the passed value
	 *  Corresponding COBOL Variable is SAV-NBR-CLMINF
	 *	@param number
	 */
	public void setSavNbrClminf(short number) {
	     // Truncate if the number is beyond +/- Max range
	    savNbrClminf = checkSavNbrClminfMaxLimit(number); 
		serializeSavNbrClminf(savNbrClminf);
	}

	public void setSavNbrClminf(int number) {
	    number = checkSavNbrClminfMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSavNbrClminf((short)number);
	}
	public void setSavNbrClminf(long number) {
	    number = checkSavNbrClminfMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSavNbrClminf((short)number);
	}
	

	/**
	 *	Returns the value of savNbrHist
	 *	@return savNbrHist
	 */
	public short getSavNbrHist() throws CFException {
        if (isSavNbrHistModified()) { 
           savNbrHist = refreshSavNbrHist();
        }
   		return savNbrHist;
	}
	
	/**
	 * 	Update SavNbrHist with the passed value
	 *  Corresponding COBOL Variable is SAV-NBR-HIST
	 *	@param number
	 */
	public void setSavNbrHist(short number) {
	     // Truncate if the number is beyond +/- Max range
	    savNbrHist = checkSavNbrHistMaxLimit(number); 
		serializeSavNbrHist(savNbrHist);
	}

	public void setSavNbrHist(int number) {
	    number = checkSavNbrHistMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSavNbrHist((short)number);
	}
	public void setSavNbrHist(long number) {
	    number = checkSavNbrHistMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSavNbrHist((short)number);
	}
	

	/**
	 *	Returns the value of savNbrOfLines
	 *	@return savNbrOfLines
	 */
	public short getSavNbrOfLines() throws CFException {
        if (isSavNbrOfLinesModified()) { 
           savNbrOfLines = refreshSavNbrOfLines();
        }
   		return savNbrOfLines;
	}
	
	/**
	 * 	Update SavNbrOfLines with the passed value
	 *  Corresponding COBOL Variable is SAV-NBR-OF-LINES
	 *	@param number
	 */
	public void setSavNbrOfLines(short number) {
	     // Truncate if the number is beyond +/- Max range
	    savNbrOfLines = checkSavNbrOfLinesMaxLimit(number); 
		serializeSavNbrOfLines(savNbrOfLines);
	}

	public void setSavNbrOfLines(int number) {
	    number = checkSavNbrOfLinesMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSavNbrOfLines((short)number);
	}
	public void setSavNbrOfLines(long number) {
	    number = checkSavNbrOfLinesMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSavNbrOfLines((short)number);
	}
	

	/**
	 *	Returns the value of savNbrRec4
	 *	@return savNbrRec4
	 */
	public short getSavNbrRec4() throws CFException {
        if (isSavNbrRec4Modified()) { 
           savNbrRec4 = refreshSavNbrRec4();
        }
   		return savNbrRec4;
	}
	
	/**
	 * 	Update SavNbrRec4 with the passed value
	 *  Corresponding COBOL Variable is SAV-NBR-REC4
	 *	@param number
	 */
	public void setSavNbrRec4(short number) {
	     // Truncate if the number is beyond +/- Max range
	    savNbrRec4 = checkSavNbrRec4MaxLimit(number); 
		serializeSavNbrRec4(savNbrRec4);
	}

	public void setSavNbrRec4(int number) {
	    number = checkSavNbrRec4MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSavNbrRec4((short)number);
	}
	public void setSavNbrRec4(long number) {
	    number = checkSavNbrRec4MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSavNbrRec4((short)number);
	}
	

	/**
	 *	Returns the value of savNbrRec4Ins
	 *	@return savNbrRec4Ins
	 */
	public short getSavNbrRec4Ins() throws CFException {
        if (isSavNbrRec4InsModified()) { 
           savNbrRec4Ins = refreshSavNbrRec4Ins();
        }
   		return savNbrRec4Ins;
	}
	
	/**
	 * 	Update SavNbrRec4Ins with the passed value
	 *  Corresponding COBOL Variable is SAV-NBR-REC4-INS
	 *	@param number
	 */
	public void setSavNbrRec4Ins(short number) {
	     // Truncate if the number is beyond +/- Max range
	    savNbrRec4Ins = checkSavNbrRec4InsMaxLimit(number); 
		serializeSavNbrRec4Ins(savNbrRec4Ins);
	}

	public void setSavNbrRec4Ins(int number) {
	    number = checkSavNbrRec4InsMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSavNbrRec4Ins((short)number);
	}
	public void setSavNbrRec4Ins(long number) {
	    number = checkSavNbrRec4InsMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSavNbrRec4Ins((short)number);
	}
	


	
	
	

		public static int getSavRecTyp1FixedFieldLength() {
			return SAV_REC_TYP_1_FIXED_LENGTH;
		}

}
  
