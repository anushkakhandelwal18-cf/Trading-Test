package com.cloudframe.app.dto.o529351u;

/**
*  The class Ioi02bCurRecAddrArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ioi02bCurRecAddrArea extends Ioi02bCurRecAddrAreaSerialized { 
   

								private int ioi02bRelRecNum;

								private int ioi02bRelBlkNum;
	
	/**
	* Constructor for Ioi02bCurRecAddrArea
	**/
    public Ioi02bCurRecAddrArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ioi02bCurRecAddrArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ioi02bCurRecAddrArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ioi02bRelRecNum
	 *	@return ioi02bRelRecNum
	 */
	public int getIoi02bRelRecNum() throws CFException {
        if (isIoi02bRelRecNumModified()) { 
           ioi02bRelRecNum = refreshIoi02bRelRecNum();
        }
   		return ioi02bRelRecNum;
	}
	
	/**
	 * 	Update Ioi02bRelRecNum with the passed value
	 *  Corresponding COBOL Variable is IOI-02B-REL-REC-NUM
	 *	@param number
	 */
	public void setIoi02bRelRecNum(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ioi02bRelRecNum = checkIoi02bRelRecNumMaxLimit(number); 
		serializeIoi02bRelRecNum(ioi02bRelRecNum);
	}


	public void setIoi02bRelRecNum(long number) {
	    number = checkIoi02bRelRecNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIoi02bRelRecNum((int)number);
	}
	
	/**
	 *	Returns the value of ioi02bRelBlkNum
	 *	@return ioi02bRelBlkNum
	 */
	public int getIoi02bRelBlkNum() throws CFException {
        if (isIoi02bRelBlkNumModified()) { 
           ioi02bRelBlkNum = refreshIoi02bRelBlkNum();
        }
   		return ioi02bRelBlkNum;
	}
	
	/**
	 * 	Update Ioi02bRelBlkNum with the passed value
	 *  Corresponding COBOL Variable is IOI-02B-REL-BLK-NUM
	 *	@param number
	 */
	public void setIoi02bRelBlkNum(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ioi02bRelBlkNum = checkIoi02bRelBlkNumMaxLimit(number); 
		serializeIoi02bRelBlkNum(ioi02bRelBlkNum);
	}


	public void setIoi02bRelBlkNum(long number) {
	    number = checkIoi02bRelBlkNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIoi02bRelBlkNum((int)number);
	}
	

	
	
	

		public static int getIoi02bCurRecAddrAreaFieldLength() {
			return IOI_02B_CUR_REC_ADDR_AREA_LENGTH;
		}

}
  
