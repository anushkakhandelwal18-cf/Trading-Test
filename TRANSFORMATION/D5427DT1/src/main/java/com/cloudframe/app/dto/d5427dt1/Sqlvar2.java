package com.cloudframe.app.dto.d5427dt1;

/**
*  The class Sqlvar2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sqlvar2 extends Sqlvar2Serialized { 
   

								private int sqlvar2Reserved1;

								private int sqllonglen;
	
	/**
	* Constructor for Sqlvar2
	**/
    public Sqlvar2() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sqlvar2. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sqlvar2(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sqlvar2Reserved1
	 *	@return sqlvar2Reserved1
	 */
	public int getSqlvar2Reserved1() throws CFException {
        if (isSqlvar2Reserved1Modified()) { 
           sqlvar2Reserved1 = refreshSqlvar2Reserved1();
        }
   		return sqlvar2Reserved1;
	}
	
	/**
	 * 	Update Sqlvar2Reserved1 with the passed value
	 *  Corresponding COBOL Variable is SQLVAR2-RESERVED-1
	 *	@param number
	 */
	public void setSqlvar2Reserved1(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sqlvar2Reserved1 = checkSqlvar2Reserved1MaxLimit(number); 
		serializeSqlvar2Reserved1(sqlvar2Reserved1);
	}


	public void setSqlvar2Reserved1(long number) {
	    number = checkSqlvar2Reserved1MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSqlvar2Reserved1((int)number);
	}
	
	/**
	 *	Returns the value of sqllonglen
	 *	@return sqllonglen
	 */
	public int getSqllonglen() throws CFException {
        if (isSqllonglenModified()) { 
           sqllonglen = refreshSqllonglen();
        }
   		return sqllonglen;
	}
	
	/**
	 * 	Update Sqllonglen with the passed value
	 *  Corresponding COBOL Variable is SQLLONGLEN
	 *	@param number
	 */
	public void setSqllonglen(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sqllonglen = checkSqllonglenMaxLimit(number); 
		serializeSqllonglen(sqllonglen);
	}


	public void setSqllonglen(long number) {
	    number = checkSqllonglenMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSqllonglen((int)number);
	}
	

	
	
	

		public static int getSqlvar2FieldLength() {
			return SQLVAR_2_LENGTH;
		}

}
  
