package com.cloudframe.app.dto.vp776a00;

/**
*  The class PwaPointerGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.vp776a00.*;
import com.cloudframe.app.exception.CFException;


public class PwaPointerGroup extends PwaPointerGroupSerialized { 
   

								private int pwaPointer;

								private int pwaAddress;
	
	/**
	* Constructor for PwaPointerGroup
	**/
    public PwaPointerGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of pwaPointer
	 *	@return pwaPointer
	 */
	public int getPwaPointer() throws CFException {
        if (isPwaPointerModified()) { 
           pwaPointer = refreshPwaPointer();
        }
   		return pwaPointer;
	}
	
	/**
	 * 	Update PwaPointer with the passed value
	 *  Corresponding COBOL Variable is PWA-POINTER
	 *	@param number
	 */
	public void setPwaPointer(int number) {
	     // Truncate if the number is beyond +/- Max range
	    pwaPointer = checkPwaPointerMaxLimit(number); 
		serializePwaPointer(pwaPointer);
	}


	public void setPwaPointer(long number) {
	    number = checkPwaPointerMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPwaPointer((int)number);
	}
	
	/**
	 *	Returns the value of pwaAddress
	 *	@return pwaAddress
	 */
	public int getPwaAddress() throws CFException {
        if (isPwaAddressModified()) { 
           pwaAddress = refreshPwaAddress();
        }
   		return pwaAddress;
	}
	
	/**
	 * 	Update PwaAddress with the passed value
	 *  Corresponding COBOL Variable is PWA-ADDRESS
	 *	@param number
	 */
	public void setPwaAddress(int number) {
	     // Truncate if the number is beyond +/- Max range
	    pwaAddress = checkPwaAddressMaxLimit(number); 
		serializePwaAddress(pwaAddress);
	}


	public void setPwaAddress(long number) {
	    number = checkPwaAddressMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPwaAddress((int)number);
	}
	

	
	
	

		public static int getPwaPointerGroupFieldLength() {
			return PWA_POINTER_GROUP_LENGTH;
		}

}
  
