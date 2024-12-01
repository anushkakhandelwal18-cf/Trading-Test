package com.cloudframe.app.dto.o529351u;

/**
*  The class XrfUpdLog is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class XrfUpdLog extends XrfUpdLogSerialized { 
   

								private int xrfUpdDate;

								private int xrfUpdTime;
	
	/**
	* Constructor for XrfUpdLog
	**/
    public XrfUpdLog() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for XrfUpdLog. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public XrfUpdLog(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of xrfUpdDate
	 *	@return xrfUpdDate
	 */
	public int getXrfUpdDate() throws CFException {
        if (isXrfUpdDateModified()) { 
           xrfUpdDate = refreshXrfUpdDate();
        }
   		return xrfUpdDate;
	}
	
	/**
	 * 	Update XrfUpdDate with the passed value
	 *  Corresponding COBOL Variable is XRF-UPD-DATE
	 *	@param number
	 */
	public void setXrfUpdDate(int number) {
	     // Truncate if the number is beyond +/- Max range
	    xrfUpdDate = checkXrfUpdDateMaxLimit(number); 
		serializeXrfUpdDate(xrfUpdDate);
	}


	public void setXrfUpdDate(long number) {
	    number = checkXrfUpdDateMaxLimit(number); // Truncate if value is beyond +/- Max range
		setXrfUpdDate((int)number);
	}
	
	/**
	 *	Returns the value of xrfUpdTime
	 *	@return xrfUpdTime
	 */
	public int getXrfUpdTime() throws CFException {
        if (isXrfUpdTimeModified()) { 
           xrfUpdTime = refreshXrfUpdTime();
        }
   		return xrfUpdTime;
	}
	
	/**
	 * 	Update XrfUpdTime with the passed value
	 *  Corresponding COBOL Variable is XRF-UPD-TIME
	 *	@param number
	 */
	public void setXrfUpdTime(int number) {
	     // Truncate if the number is beyond +/- Max range
	    xrfUpdTime = checkXrfUpdTimeMaxLimit(number); 
		serializeXrfUpdTime(xrfUpdTime);
	}


	public void setXrfUpdTime(long number) {
	    number = checkXrfUpdTimeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setXrfUpdTime((int)number);
	}
	

	
	
	

		public static int getXrfUpdLogFieldLength() {
			return XRF_UPD_LOG_LENGTH;
		}

}
  
