package com.cloudframe.app.dto.o529351u;

/**
*  The class CsvcCode is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CsvcCode extends CsvcCodeSerialized { 
   

								private long csvcCode1st5;

								private int csvcCodeLst1;
	
	/**
	* Constructor for CsvcCode
	**/
    public CsvcCode() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CsvcCode. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CsvcCode(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of csvcCode1st5
	 *	@return csvcCode1st5
	 */
	public long getCsvcCode1st5() throws CFException {
       if (isCsvcCode1st5Modified()) { 
           csvcCode1st5 = refreshCsvcCode1st5();
        }
   		return csvcCode1st5;
	}
	

	
	   
	/**
	 * 	Update CsvcCode1st5 with the passed value
	 *  Corresponding COBOL Variable is CSVC-CODE-1ST-5
	 *	@param number
	 */
	public void setCsvcCode1st5(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    csvcCode1st5 = checkCsvcCode1st5MaxLimit(number); 
		serializeCsvcCode1st5(csvcCode1st5);
	}
	

	/**
	 * 	Update CsvcCode1st5 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCsvcCode1st5(char[] value) throws CFException {
		 csvcCode1st5 = serializeCsvcCode1st5(value);
	}
	/**
	 * 	Update CsvcCode1st5 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCsvcCode1st5String(char[] value) throws CFException {
		 setCsvcCode1st5(value);
	}
	/**
	 *	Returns the value of csvcCodeLst1
	 *	@return csvcCodeLst1
	 */
	public int getCsvcCodeLst1() throws CFException {
       if (isCsvcCodeLst1Modified()) { 
           csvcCodeLst1 = refreshCsvcCodeLst1();
        }
   		return csvcCodeLst1;
	}
	

	
	   
	/**
	 * 	Update CsvcCodeLst1 with the passed value
	 *  Corresponding COBOL Variable is CSVC-CODE-LST-1
	 *	@param number
	 */
	public void setCsvcCodeLst1(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    csvcCodeLst1 = checkCsvcCodeLst1MaxLimit(number); 
		serializeCsvcCodeLst1(csvcCodeLst1);
	}
	

	public void setCsvcCodeLst1(long number) {
	    number = checkCsvcCodeLst1MaxLimit(number); // Truncate if value is beyond +/- Max range
		setCsvcCodeLst1((int)number);
	}
	
	/**
	 * 	Update CsvcCodeLst1 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCsvcCodeLst1(char[] value) throws CFException {
		 csvcCodeLst1 = serializeCsvcCodeLst1(value);
	}
	/**
	 * 	Update CsvcCodeLst1 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCsvcCodeLst1String(char[] value) throws CFException {
		 setCsvcCodeLst1(value);
	}

	
	
	

		public static int getCsvcCodeFieldLength() {
			return CSVC_CODE_LENGTH;
		}

}
  
