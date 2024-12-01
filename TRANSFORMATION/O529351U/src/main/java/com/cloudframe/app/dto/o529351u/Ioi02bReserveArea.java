package com.cloudframe.app.dto.o529351u;

/**
*  The class Ioi02bReserveArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ioi02bReserveArea extends Ioi02bReserveAreaSerialized { 
   

								private int ioi02bWorkAreaAddr;

								private int ioi02bWorkAreaPtr;

								private int ioi02bInterfaceAddr;

								private int ioi02bInterfacePtr;

								private int ioi02bJournalAddr;

								private int ioi02bJournalPtr;
	
	/**
	* Constructor for Ioi02bReserveArea
	**/
    public Ioi02bReserveArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ioi02bReserveArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ioi02bReserveArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ioi02bWorkAreaAddr
	 *	@return ioi02bWorkAreaAddr
	 */
	public int getIoi02bWorkAreaAddr() throws CFException {
        if (isIoi02bWorkAreaAddrModified()) { 
           ioi02bWorkAreaAddr = refreshIoi02bWorkAreaAddr();
        }
   		return ioi02bWorkAreaAddr;
	}
	
	/**
	 * 	Update Ioi02bWorkAreaAddr with the passed value
	 *  Corresponding COBOL Variable is IOI-02B-WORK-AREA-ADDR
	 *	@param number
	 */
	public void setIoi02bWorkAreaAddr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ioi02bWorkAreaAddr = checkIoi02bWorkAreaAddrMaxLimit(number); 
		serializeIoi02bWorkAreaAddr(ioi02bWorkAreaAddr);
	}


	public void setIoi02bWorkAreaAddr(long number) {
	    number = checkIoi02bWorkAreaAddrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIoi02bWorkAreaAddr((int)number);
	}
	
	/**
	 *	Returns the value of ioi02bWorkAreaPtr
	 *	@return ioi02bWorkAreaPtr
	 */
	public int getIoi02bWorkAreaPtr() throws CFException {
        if (isIoi02bWorkAreaPtrModified()) { 
           ioi02bWorkAreaPtr = refreshIoi02bWorkAreaPtr();
        }
   		return ioi02bWorkAreaPtr;
	}
	
	/**
	 * 	Update Ioi02bWorkAreaPtr with the passed value
	 *  Corresponding COBOL Variable is IOI-02B-WORK-AREA-PTR
	 *	@param number
	 */
	public void setIoi02bWorkAreaPtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ioi02bWorkAreaPtr = checkIoi02bWorkAreaPtrMaxLimit(number); 
		serializeIoi02bWorkAreaPtr(ioi02bWorkAreaPtr);
	}


	public void setIoi02bWorkAreaPtr(long number) {
	    number = checkIoi02bWorkAreaPtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIoi02bWorkAreaPtr((int)number);
	}
	
	/**
	 *	Returns the value of ioi02bInterfaceAddr
	 *	@return ioi02bInterfaceAddr
	 */
	public int getIoi02bInterfaceAddr() throws CFException {
        if (isIoi02bInterfaceAddrModified()) { 
           ioi02bInterfaceAddr = refreshIoi02bInterfaceAddr();
        }
   		return ioi02bInterfaceAddr;
	}
	
	/**
	 * 	Update Ioi02bInterfaceAddr with the passed value
	 *  Corresponding COBOL Variable is IOI-02B-INTERFACE-ADDR
	 *	@param number
	 */
	public void setIoi02bInterfaceAddr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ioi02bInterfaceAddr = checkIoi02bInterfaceAddrMaxLimit(number); 
		serializeIoi02bInterfaceAddr(ioi02bInterfaceAddr);
	}


	public void setIoi02bInterfaceAddr(long number) {
	    number = checkIoi02bInterfaceAddrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIoi02bInterfaceAddr((int)number);
	}
	
	/**
	 *	Returns the value of ioi02bInterfacePtr
	 *	@return ioi02bInterfacePtr
	 */
	public int getIoi02bInterfacePtr() throws CFException {
        if (isIoi02bInterfacePtrModified()) { 
           ioi02bInterfacePtr = refreshIoi02bInterfacePtr();
        }
   		return ioi02bInterfacePtr;
	}
	
	/**
	 * 	Update Ioi02bInterfacePtr with the passed value
	 *  Corresponding COBOL Variable is IOI-02B-INTERFACE-PTR
	 *	@param number
	 */
	public void setIoi02bInterfacePtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ioi02bInterfacePtr = checkIoi02bInterfacePtrMaxLimit(number); 
		serializeIoi02bInterfacePtr(ioi02bInterfacePtr);
	}


	public void setIoi02bInterfacePtr(long number) {
	    number = checkIoi02bInterfacePtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIoi02bInterfacePtr((int)number);
	}
	
	/**
	 *	Returns the value of ioi02bJournalAddr
	 *	@return ioi02bJournalAddr
	 */
	public int getIoi02bJournalAddr() throws CFException {
        if (isIoi02bJournalAddrModified()) { 
           ioi02bJournalAddr = refreshIoi02bJournalAddr();
        }
   		return ioi02bJournalAddr;
	}
	
	/**
	 * 	Update Ioi02bJournalAddr with the passed value
	 *  Corresponding COBOL Variable is IOI-02B-JOURNAL-ADDR
	 *	@param number
	 */
	public void setIoi02bJournalAddr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ioi02bJournalAddr = checkIoi02bJournalAddrMaxLimit(number); 
		serializeIoi02bJournalAddr(ioi02bJournalAddr);
	}


	public void setIoi02bJournalAddr(long number) {
	    number = checkIoi02bJournalAddrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIoi02bJournalAddr((int)number);
	}
	
	/**
	 *	Returns the value of ioi02bJournalPtr
	 *	@return ioi02bJournalPtr
	 */
	public int getIoi02bJournalPtr() throws CFException {
        if (isIoi02bJournalPtrModified()) { 
           ioi02bJournalPtr = refreshIoi02bJournalPtr();
        }
   		return ioi02bJournalPtr;
	}
	
	/**
	 * 	Update Ioi02bJournalPtr with the passed value
	 *  Corresponding COBOL Variable is IOI-02B-JOURNAL-PTR
	 *	@param number
	 */
	public void setIoi02bJournalPtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ioi02bJournalPtr = checkIoi02bJournalPtrMaxLimit(number); 
		serializeIoi02bJournalPtr(ioi02bJournalPtr);
	}


	public void setIoi02bJournalPtr(long number) {
	    number = checkIoi02bJournalPtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIoi02bJournalPtr((int)number);
	}
	

	
	
	

		public static int getIoi02bReserveAreaFieldLength() {
			return IOI_02B_RESERVE_AREA_LENGTH;
		}

}
  
