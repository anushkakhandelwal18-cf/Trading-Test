package com.cloudframe.app.dto.d5427dt1;

/**
*  The class DderefLnIdGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DderefLnIdGroup extends DderefLnIdGroupSerialized { 
   

								private short dderefLnId;
	
	/**
	* Constructor for DderefLnIdGroup
	**/
    public DderefLnIdGroup() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for DderefLnIdGroup. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DderefLnIdGroup(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of dderefLnId
	 *	@return dderefLnId
	 */
	public short getDderefLnId() throws CFException {
        if (isDderefLnIdModified()) { 
           dderefLnId = refreshDderefLnId();
        }
   		return dderefLnId;
	}
	
	/**
	 * 	Update DderefLnId with the passed value
	 *  Corresponding COBOL Variable is DDEREF-LN-ID
	 *	@param number
	 */
	public void setDderefLnId(short number) {
	     // Truncate if the number is beyond +/- Max range
	    dderefLnId = checkDderefLnIdMaxLimit(number); 
		serializeDderefLnId(dderefLnId);
	}

	public void setDderefLnId(int number) {
	    number = checkDderefLnIdMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setDderefLnId((short)number);
	}
	public void setDderefLnId(long number) {
	    number = checkDderefLnIdMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setDderefLnId((short)number);
	}
	


	
	
	

		public static int getDderefLnIdGroupFieldLength() {
			return DDEREF_LN_ID_GROUP_LENGTH;
		}

}
  
