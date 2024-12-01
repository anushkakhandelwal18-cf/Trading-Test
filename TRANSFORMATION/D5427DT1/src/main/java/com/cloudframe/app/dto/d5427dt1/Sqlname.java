package com.cloudframe.app.dto.d5427dt1;

/**
*  The class Sqlname is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sqlname extends SqlnameSerialized { 
   

								private short sqlnamel;
	
	/**
	* Constructor for Sqlname
	**/
    public Sqlname() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sqlname. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sqlname(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sqlnamel
	 *	@return sqlnamel
	 */
	public short getSqlnamel() throws CFException {
        if (isSqlnamelModified()) { 
           sqlnamel = refreshSqlnamel();
        }
   		return sqlnamel;
	}
	
	/**
	 * 	Update Sqlnamel with the passed value
	 *  Corresponding COBOL Variable is SQLNAMEL
	 *	@param number
	 */
	public void setSqlnamel(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sqlnamel = checkSqlnamelMaxLimit(number); 
		serializeSqlnamel(sqlnamel);
	}

	public void setSqlnamel(int number) {
	    number = checkSqlnamelMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSqlnamel((short)number);
	}
	public void setSqlnamel(long number) {
	    number = checkSqlnamelMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSqlnamel((short)number);
	}
	


	
	
	

		public static int getSqlnameFieldLength() {
			return SQLNAME_LENGTH;
		}

}
  
