package com.cloudframe.app.dto.d5427dt1;

/**
*  The class DsmSqlErrorMsgArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DsmSqlErrorMsgArea extends DsmSqlErrorMsgAreaSerialized { 
   

						private char[] dsmErrClngPgmName = Field.fillLowValue(8);
	
	/**
	* Constructor for DsmSqlErrorMsgArea
	**/
    public DsmSqlErrorMsgArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for DsmSqlErrorMsgArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DsmSqlErrorMsgArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of dsmErrClngPgmName
	 *	@return dsmErrClngPgmName
	 */
   public char[] getDsmErrClngPgmName() throws CFException{
     if (isDsmErrClngPgmNameModified()) { 
        dsmErrClngPgmName = refreshDsmErrClngPgmName();
     }
   		return dsmErrClngPgmName;
   }

  
	/**
	*  set variable dsmErrClngPgmName
	*  Corresponding COBOL Variable is DSM-ERR-CLNG-PGM-NAME
	*  @param value
	**/
   public void setDsmErrClngPgmName(char[] value) {
      dsmErrClngPgmName = checkDsmErrClngPgmNameConstraints(value);
      serializeDsmErrClngPgmName(dsmErrClngPgmName);
   } 

     /**
	 * 	Update DsmErrClngPgmName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDsmErrClngPgmName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDsmErrClngPgmName,dsmErrClngPgmName.length);
   	
   }
   
   public void setDsmErrClngPgmName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDsmErrClngPgmName,dsmErrClngPgmName.length);
   	
   }
   
     /**
	 * 	Update DsmErrClngPgmName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDsmErrClngPgmName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDsmErrClngPgmName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DsmErrClngPgmName with another Field
	 *	@param value
	 */
   public void setDsmErrClngPgmName(Field source) {
       replace(source,0,source.length(),beginDsmErrClngPgmName,DSM_ERR_CLNG_PGM_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update DsmErrClngPgmName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDsmErrClngPgmName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDsmErrClngPgmName,DSM_ERR_CLNG_PGM_NAME_LEN);
   	
   }
   
     /**
	 * 	Update DsmErrClngPgmName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDsmErrClngPgmName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDsmErrClngPgmName+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDsmSqlErrorMsgAreaFieldLength() {
			return DSM_SQL_ERROR_MSG_AREA_LENGTH;
		}

}
  
