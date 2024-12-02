package com.optum.uhg.app.dto.cf03secu;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-02 at 20:31. using version 5.0.0.161
**/


import com.optum.uhg.app.dto.serialize.cf03secu.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized { 
   

								private int counter;

								private char[] sqlcode_Ws = Field.fillLowValue(4);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setCounter(0);
    }


 

	/**
	 *	Returns the value of counter
	 *	@return counter
	 */
	public int getCounter() throws CFException {
       if (isCounterModified()) { 
           counter = refreshCounter();
        }
   		return counter;
	}
	

	
	   
	/**
	 * 	Update Counter with the passed value
	 *  Corresponding COBOL Variable is COUNTER
	 *	@param number
	 */
	public void setCounter(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    counter = checkCounterMaxLimit(number); 
		serializeCounter(counter);
	}
	

	public void setCounter(long number) {
	    number = checkCounterMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCounter((int)number);
	}
	
	/**
	 * 	Update Counter with the passed value
	 *	@param value (String or char[])
	 */
	public void setCounter(char[] value) throws CFException {
		 counter = serializeCounter(value);
	}
	/**
	 * 	Update Counter with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCounterString(char[] value) throws CFException {
		 setCounter(value);
	}
	/**
	 *	Returns the value of sqlcode_Ws
	 *	@return sqlcode_Ws
	 */
   public char[] getSqlcode_Ws() throws CFException{
     if (isSqlcode_WsModified()) { 
        sqlcode_Ws = refreshSqlcode_Ws();
     }
   		return sqlcode_Ws;
   }

  
	/**
	*  set variable sqlcode_Ws
	*  Corresponding COBOL Variable is WS-SQLCODE
	*  @param value
	**/
   public void setSqlcode_Ws(char[] value) {
      sqlcode_Ws = checkSqlcode_WsConstraints(value);
      serializeSqlcode_Ws(sqlcode_Ws);
   } 

     /**
	 * 	Update Sqlcode_Ws 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlcode_Ws(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSqlcode_Ws,sqlcode_Ws.length);
   	
   }
   
   public void setSqlcode_Ws(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSqlcode_Ws,sqlcode_Ws.length);
   	
   }
   
     /**
	 * 	Update Sqlcode_Ws 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlcode_Ws(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlcode_Ws+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sqlcode_Ws with another Field
	 *	@param value
	 */
   public void setSqlcode_Ws(Field source) {
       replace(source,0,source.length(),beginSqlcode_Ws,SQLCODE__WS_LEN);
   	
   }  
   
     /**
	 * 	Update Sqlcode_Ws 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlcode_Ws(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSqlcode_Ws,SQLCODE__WS_LEN);
   	
   }
   
     /**
	 * 	Update Sqlcode_Ws 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlcode_Ws(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlcode_Ws+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
