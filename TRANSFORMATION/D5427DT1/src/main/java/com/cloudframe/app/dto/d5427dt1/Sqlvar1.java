package com.cloudframe.app.dto.d5427dt1;

/**
*  The class Sqlvar1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sqlvar1 extends Sqlvar1Serialized { 
   

								private short sqltype;

								private short sqllen;
				private SqllenRedefined sqllenRedefined = new SqllenRedefined();

								private int sqldata;

								private int sqlind;
				private Sqlname sqlname = new Sqlname();
	
	/**
	* Constructor for Sqlvar1
	**/
    public Sqlvar1() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sqlvar1. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sqlvar1(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			sqllenRedefined.setParent(this,getStartOffset() + 2);
	       			sqlname.setParent(this,getStartOffset() + 12);
    } 

	/**
	 *	Returns the value of sqltype
	 *	@return sqltype
	 */
	public short getSqltype() throws CFException {
        if (isSqltypeModified()) { 
           sqltype = refreshSqltype();
        }
   		return sqltype;
	}
	
	/**
	 * 	Update Sqltype with the passed value
	 *  Corresponding COBOL Variable is SQLTYPE
	 *	@param number
	 */
	public void setSqltype(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sqltype = checkSqltypeMaxLimit(number); 
		serializeSqltype(sqltype);
	}

	public void setSqltype(int number) {
	    number = checkSqltypeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSqltype((short)number);
	}
	public void setSqltype(long number) {
	    number = checkSqltypeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSqltype((short)number);
	}
	

	/**
	 *	Returns the value of sqllen
	 *	@return sqllen
	 */
	public short getSqllen() throws CFException {
        if (isSqllenModified()) { 
           sqllen = refreshSqllen();
        }
   		return sqllen;
	}
	
	/**
	 * 	Update Sqllen with the passed value
	 *  Corresponding COBOL Variable is SQLLEN
	 *	@param number
	 */
	public void setSqllen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sqllen = checkSqllenMaxLimit(number); 
		serializeSqllen(sqllen);
	}

	public void setSqllen(int number) {
	    number = checkSqllenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSqllen((short)number);
	}
	public void setSqllen(long number) {
	    number = checkSqllenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSqllen((short)number);
	}
	

	/**
	 *	Returns the value of sqllenRedefined
	 *	@return sqllenRedefined
	 */   
	 public SqllenRedefined getSqllenRedefined() {
   	return sqllenRedefined;
   }
   /**
	* 	Update SqllenRedefined with the passed value
	*   Corresponding COBOL Variable is SQLLEN-REDEFINED
	*	@param value
	*/
   public void setSqllenRedefined(char[] value) {
      sqllenRedefined.setString(value); 
   }   
    
     /**
	 * 	Update SqllenRedefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSqllenRedefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sqllenRedefined.begin,sqllenRedefined.length());
   }
   
     /**
	 * 	Update SqllenRedefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqllenRedefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sqllenRedefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update SqllenRedefined with another Field
	 *	@param value
	 */
   public void setSqllenRedefined(Field source) {
   	replace(source,0,source.length(),sqllenRedefined.begin,sqllenRedefined.length());
   }  
   
     /**
	 * 	Update SqllenRedefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSqllenRedefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sqllenRedefined.begin,sqllenRedefined.length());
   }
   
     /**
	 * 	Update SqllenRedefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqllenRedefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sqllenRedefined.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sqldata
	 *	@return sqldata
	 */
	public int getSqldata() throws CFException {
        if (isSqldataModified()) { 
           sqldata = refreshSqldata();
        }
   		return sqldata;
	}
	
	/**
	 * 	Update Sqldata with the passed value
	 *  Corresponding COBOL Variable is SQLDATA
	 *	@param number
	 */
	public void setSqldata(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sqldata = checkSqldataMaxLimit(number); 
		serializeSqldata(sqldata);
	}


	public void setSqldata(long number) {
	    number = checkSqldataMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSqldata((int)number);
	}
	
	/**
	 *	Returns the value of sqlind
	 *	@return sqlind
	 */
	public int getSqlind() throws CFException {
        if (isSqlindModified()) { 
           sqlind = refreshSqlind();
        }
   		return sqlind;
	}
	
	/**
	 * 	Update Sqlind with the passed value
	 *  Corresponding COBOL Variable is SQLIND
	 *	@param number
	 */
	public void setSqlind(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sqlind = checkSqlindMaxLimit(number); 
		serializeSqlind(sqlind);
	}


	public void setSqlind(long number) {
	    number = checkSqlindMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSqlind((int)number);
	}
	
	/**
	 *	Returns the value of sqlname
	 *	@return sqlname
	 */   
	 public Sqlname getSqlname() {
   	return sqlname;
   }
   /**
	* 	Update Sqlname with the passed value
	*   Corresponding COBOL Variable is SQLNAME
	*	@param value
	*/
   public void setSqlname(char[] value) {
      sqlname.setString(value); 
   }   
    
     /**
	 * 	Update Sqlname 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSqlname(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sqlname.begin,sqlname.length());
   }
   
     /**
	 * 	Update Sqlname 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlname(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sqlname.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sqlname with another Field
	 *	@param value
	 */
   public void setSqlname(Field source) {
   	replace(source,0,source.length(),sqlname.begin,sqlname.length());
   }  
   
     /**
	 * 	Update Sqlname 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSqlname(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sqlname.begin,sqlname.length());
   }
   
     /**
	 * 	Update Sqlname 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlname(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sqlname.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getSqlvar1FieldLength() {
			return SQLVAR_1_LENGTH;
		}

}
  
