package com.cloudframe.app.dto.d5427dt1;

/**
*  The class Sqlda is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.util.*;


public class Sqlda extends SqldaSerialized { 
   

						private char[] sqldaid = Field.fillLowValue(8);

								private int sqldabc;

								private short sqln;

								private short sqld;
			private List<Sqlvar> sqlvar = new ArrayList<>();
    	
	
	/**
	* Constructor for Sqlda
	**/
    public Sqlda() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < SQLVAR_SIZE;arrayIndex++) {
						sqlvar.add(new Sqlvar(this, beginSqlvar + 
						arrayIndex * Sqlvar.getSqlvarFieldLength()));
				}
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sqldaid
	 *	@return sqldaid
	 */
   public char[] getSqldaid() throws CFException{
     if (isSqldaidModified()) { 
        sqldaid = refreshSqldaid();
     }
   		return sqldaid;
   }

  
	/**
	*  set variable sqldaid
	*  Corresponding COBOL Variable is SQLDAID
	*  @param value
	**/
   public void setSqldaid(char[] value) {
      sqldaid = checkSqldaidConstraints(value);
      serializeSqldaid(sqldaid);
   } 

     /**
	 * 	Update Sqldaid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqldaid(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSqldaid,sqldaid.length);
   	
   }
   
   public void setSqldaid(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSqldaid,sqldaid.length);
   	
   }
   
     /**
	 * 	Update Sqldaid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqldaid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqldaid+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sqldaid with another Field
	 *	@param value
	 */
   public void setSqldaid(Field source) {
       replace(source,0,source.length(),beginSqldaid,SQLDAID_LEN);
   	
   }  
   
     /**
	 * 	Update Sqldaid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqldaid(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSqldaid,SQLDAID_LEN);
   	
   }
   
     /**
	 * 	Update Sqldaid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqldaid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqldaid+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sqldabc
	 *	@return sqldabc
	 */
	public int getSqldabc() throws CFException {
        if (isSqldabcModified()) { 
           sqldabc = refreshSqldabc();
        }
   		return sqldabc;
	}
	
	/**
	 * 	Update Sqldabc with the passed value
	 *  Corresponding COBOL Variable is SQLDABC
	 *	@param number
	 */
	public void setSqldabc(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sqldabc = checkSqldabcMaxLimit(number); 
		serializeSqldabc(sqldabc);
	}


	public void setSqldabc(long number) {
	    number = checkSqldabcMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSqldabc((int)number);
	}
	
	/**
	 *	Returns the value of sqln
	 *	@return sqln
	 */
	public short getSqln() throws CFException {
        if (isSqlnModified()) { 
           sqln = refreshSqln();
        }
   		return sqln;
	}
	
	/**
	 * 	Update Sqln with the passed value
	 *  Corresponding COBOL Variable is SQLN
	 *	@param number
	 */
	public void setSqln(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sqln = checkSqlnMaxLimit(number); 
		serializeSqln(sqln);
	}

	public void setSqln(int number) {
	    number = checkSqlnMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSqln((short)number);
	}
	public void setSqln(long number) {
	    number = checkSqlnMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSqln((short)number);
	}
	

	/**
	 *	Returns the value of sqld
	 *	@return sqld
	 */
	public short getSqld() throws CFException {
        if (isSqldModified()) { 
           sqld = refreshSqld();
        }
   		return sqld;
	}
	
	/**
	 * 	Update Sqld with the passed value
	 *  Corresponding COBOL Variable is SQLD
	 *	@param number
	 */
	public void setSqld(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sqld = checkSqldMaxLimit(number); 
		serializeSqld(sqld);
	}

	public void setSqld(int number) {
	    number = checkSqldMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSqld((short)number);
	}
	public void setSqld(long number) {
	    number = checkSqldMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSqld((short)number);
	}
	

	/**
	 *	Returns the  value of sqlvar
	 *  Corresponding COBOL Variable is SQLVAR
	 *	@return sqlvar
	 */
   public List<Sqlvar> getSqlvar() {
       return sqlvar;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return sqlvar
	 */
	public Sqlvar getSqlvar(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getSqlvar(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= SQLVAR_SIZE) {
             	index = SQLVAR_SIZE -1; // can't exceed max array size
             	logger.trace("sqlvar - Array index exceeded max Size {}, resetting it to max allowed",SQLVAR_SIZE); 
	    }
		if (index >= sqlvar.size()) {
       		for (int fillIndex =  sqlvar.size() -1; fillIndex < index;fillIndex++) {
		       sqlvar.add(null);
		    }
			sqlvar.set(index,
			   	   	new Sqlvar(this,beginSqlvar + index * Sqlvar.getSqlvarFieldLength()) 
				                        ); 	
		} 
   	   Sqlvar value = sqlvar.get(index);
   	   if (value == null) {
   	      sqlvar.set(index,
			   	   	new Sqlvar(this,beginSqlvar + index * Sqlvar.getSqlvarFieldLength()) 
				                        ); 
		  value = sqlvar.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Sqlvar at index with the passed value
	 *  Corresponding COBOL Variable is SQLVAR
	 *  @param index
	 *	@param value
	 */
  public void setSqlvar(int index,char[] value) {
   	getSqlvar(index).setString(value);
   }
   
	

	
	
	

		public static int getSqldaFieldLength() {
			return SQLDA_LENGTH;
		}

}
  
