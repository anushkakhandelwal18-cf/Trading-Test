package com.cloudframe.app.dto.d5427dt1;

/**
*  The class SqllenRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SqllenRedefined extends SqllenRedefinedSerialized { 
   

						private char[] sqlscale = Field.fillLowValue(1);
	
	/**
	* Constructor for SqllenRedefined
	**/
    public SqllenRedefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SqllenRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SqllenRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sqlscale
	 *	@return sqlscale
	 */
   public char[] getSqlscale() throws CFException{
     if (isSqlscaleModified()) { 
        sqlscale = refreshSqlscale();
     }
   		return sqlscale;
   }

  
	/**
	*  set variable sqlscale
	*  Corresponding COBOL Variable is SQLSCALE
	*  @param value
	**/
   public void setSqlscale(char[] value) {
      sqlscale = checkSqlscaleConstraints(value);
      serializeSqlscale(sqlscale);
   } 

     /**
	 * 	Update Sqlscale 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlscale(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSqlscale,sqlscale.length);
   	
   }
   
   public void setSqlscale(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSqlscale,sqlscale.length);
   	
   }
   
     /**
	 * 	Update Sqlscale 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlscale(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlscale+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sqlscale with another Field
	 *	@param value
	 */
   public void setSqlscale(Field source) {
       replace(source,0,source.length(),beginSqlscale,SQLSCALE_LEN);
   	
   }  
   
     /**
	 * 	Update Sqlscale 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlscale(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSqlscale,SQLSCALE_LEN);
   	
   }
   
     /**
	 * 	Update Sqlscale 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlscale(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSqlscale+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSqllenRedefinedFieldLength() {
			return SQLLEN_REDEFINED_LENGTH;
		}

}
  
