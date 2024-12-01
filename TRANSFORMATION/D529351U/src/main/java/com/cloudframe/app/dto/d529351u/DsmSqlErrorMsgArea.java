package com.cloudframe.app.dto.d529351u;

/**
*  The class DsmSqlErrorMsgArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:50. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class DsmSqlErrorMsgArea extends DsmSqlErrorMsgAreaSerialized { 
   

						private char[] dsmErrTblName = Field.fillLowValue(25);

						private char[] dsmErrSectnName = Field.fillLowValue(34);

						private char[] dsmErrPgmName = Field.fillLowValue(8);

						private char[] dsmErrClngPgmName = Field.fillLowValue(8);

						private char[] dsmErrTblAction = Field.fillLowValue(10);

						private char[] dsmErrTxt = Field.fillLowValue(35);
	
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
	 *	Returns the value of dsmErrTblName
	 *	@return dsmErrTblName
	 */
   public char[] getDsmErrTblName() throws CFException{
     if (isDsmErrTblNameModified()) { 
        dsmErrTblName = refreshDsmErrTblName();
     }
   		return dsmErrTblName;
   }

  
	/**
	*  set variable dsmErrTblName
	*  Corresponding COBOL Variable is DSM-ERR-TBL-NAME
	*  @param value
	**/
   public void setDsmErrTblName(char[] value) {
      dsmErrTblName = checkDsmErrTblNameConstraints(value);
      serializeDsmErrTblName(dsmErrTblName);
   } 

     /**
	 * 	Update DsmErrTblName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDsmErrTblName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDsmErrTblName,dsmErrTblName.length);
   	
   }
   
   public void setDsmErrTblName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDsmErrTblName,dsmErrTblName.length);
   	
   }
   
     /**
	 * 	Update DsmErrTblName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDsmErrTblName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDsmErrTblName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DsmErrTblName with another Field
	 *	@param value
	 */
   public void setDsmErrTblName(Field source) {
       replace(source,0,source.length(),beginDsmErrTblName,DSM_ERR_TBL_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update DsmErrTblName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDsmErrTblName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDsmErrTblName,DSM_ERR_TBL_NAME_LEN);
   	
   }
   
     /**
	 * 	Update DsmErrTblName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDsmErrTblName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDsmErrTblName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dsmErrSectnName
	 *	@return dsmErrSectnName
	 */
   public char[] getDsmErrSectnName() throws CFException{
     if (isDsmErrSectnNameModified()) { 
        dsmErrSectnName = refreshDsmErrSectnName();
     }
   		return dsmErrSectnName;
   }

  
	/**
	*  set variable dsmErrSectnName
	*  Corresponding COBOL Variable is DSM-ERR-SECTN-NAME
	*  @param value
	**/
   public void setDsmErrSectnName(char[] value) {
      dsmErrSectnName = checkDsmErrSectnNameConstraints(value);
      serializeDsmErrSectnName(dsmErrSectnName);
   } 

     /**
	 * 	Update DsmErrSectnName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDsmErrSectnName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDsmErrSectnName,dsmErrSectnName.length);
   	
   }
   
   public void setDsmErrSectnName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDsmErrSectnName,dsmErrSectnName.length);
   	
   }
   
     /**
	 * 	Update DsmErrSectnName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDsmErrSectnName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDsmErrSectnName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DsmErrSectnName with another Field
	 *	@param value
	 */
   public void setDsmErrSectnName(Field source) {
       replace(source,0,source.length(),beginDsmErrSectnName,DSM_ERR_SECTN_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update DsmErrSectnName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDsmErrSectnName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDsmErrSectnName,DSM_ERR_SECTN_NAME_LEN);
   	
   }
   
     /**
	 * 	Update DsmErrSectnName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDsmErrSectnName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDsmErrSectnName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dsmErrPgmName
	 *	@return dsmErrPgmName
	 */
   public char[] getDsmErrPgmName() throws CFException{
     if (isDsmErrPgmNameModified()) { 
        dsmErrPgmName = refreshDsmErrPgmName();
     }
   		return dsmErrPgmName;
   }

  
	/**
	*  set variable dsmErrPgmName
	*  Corresponding COBOL Variable is DSM-ERR-PGM-NAME
	*  @param value
	**/
   public void setDsmErrPgmName(char[] value) {
      dsmErrPgmName = checkDsmErrPgmNameConstraints(value);
      serializeDsmErrPgmName(dsmErrPgmName);
   } 

     /**
	 * 	Update DsmErrPgmName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDsmErrPgmName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDsmErrPgmName,dsmErrPgmName.length);
   	
   }
   
   public void setDsmErrPgmName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDsmErrPgmName,dsmErrPgmName.length);
   	
   }
   
     /**
	 * 	Update DsmErrPgmName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDsmErrPgmName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDsmErrPgmName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DsmErrPgmName with another Field
	 *	@param value
	 */
   public void setDsmErrPgmName(Field source) {
       replace(source,0,source.length(),beginDsmErrPgmName,DSM_ERR_PGM_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update DsmErrPgmName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDsmErrPgmName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDsmErrPgmName,DSM_ERR_PGM_NAME_LEN);
   	
   }
   
     /**
	 * 	Update DsmErrPgmName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDsmErrPgmName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDsmErrPgmName+targetIndex,targetLen);
    
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
	/**
	 *	Returns the value of dsmErrTblAction
	 *	@return dsmErrTblAction
	 */
   public char[] getDsmErrTblAction() throws CFException{
     if (isDsmErrTblActionModified()) { 
        dsmErrTblAction = refreshDsmErrTblAction();
     }
   		return dsmErrTblAction;
   }

  
	/**
	*  set variable dsmErrTblAction
	*  Corresponding COBOL Variable is DSM-ERR-TBL-ACTION
	*  @param value
	**/
   public void setDsmErrTblAction(char[] value) {
      dsmErrTblAction = checkDsmErrTblActionConstraints(value);
      serializeDsmErrTblAction(dsmErrTblAction);
   } 

     /**
	 * 	Update DsmErrTblAction 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDsmErrTblAction(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDsmErrTblAction,dsmErrTblAction.length);
   	
   }
   
   public void setDsmErrTblAction(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDsmErrTblAction,dsmErrTblAction.length);
   	
   }
   
     /**
	 * 	Update DsmErrTblAction 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDsmErrTblAction(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDsmErrTblAction+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DsmErrTblAction with another Field
	 *	@param value
	 */
   public void setDsmErrTblAction(Field source) {
       replace(source,0,source.length(),beginDsmErrTblAction,DSM_ERR_TBL_ACTION_LEN);
   	
   }  
   
     /**
	 * 	Update DsmErrTblAction 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDsmErrTblAction(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDsmErrTblAction,DSM_ERR_TBL_ACTION_LEN);
   	
   }
   
     /**
	 * 	Update DsmErrTblAction 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDsmErrTblAction(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDsmErrTblAction+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dsmErrTxt
	 *	@return dsmErrTxt
	 */
   public char[] getDsmErrTxt() throws CFException{
     if (isDsmErrTxtModified()) { 
        dsmErrTxt = refreshDsmErrTxt();
     }
   		return dsmErrTxt;
   }

  
	/**
	*  set variable dsmErrTxt
	*  Corresponding COBOL Variable is DSM-ERR-TXT
	*  @param value
	**/
   public void setDsmErrTxt(char[] value) {
      dsmErrTxt = checkDsmErrTxtConstraints(value);
      serializeDsmErrTxt(dsmErrTxt);
   } 

     /**
	 * 	Update DsmErrTxt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDsmErrTxt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDsmErrTxt,dsmErrTxt.length);
   	
   }
   
   public void setDsmErrTxt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDsmErrTxt,dsmErrTxt.length);
   	
   }
   
     /**
	 * 	Update DsmErrTxt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDsmErrTxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDsmErrTxt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DsmErrTxt with another Field
	 *	@param value
	 */
   public void setDsmErrTxt(Field source) {
       replace(source,0,source.length(),beginDsmErrTxt,DSM_ERR_TXT_LEN);
   	
   }  
   
     /**
	 * 	Update DsmErrTxt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDsmErrTxt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDsmErrTxt,DSM_ERR_TXT_LEN);
   	
   }
   
     /**
	 * 	Update DsmErrTxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDsmErrTxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDsmErrTxt+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes DsmSqlErrorMsgArea
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setDsmErrTblName(CONSTANTS.SPACE_25);
         setDsmErrSectnName(CONSTANTS.SPACE_34);
         setDsmErrPgmName(CONSTANTS.SPACE_8);
         setDsmErrClngPgmName(CONSTANTS.SPACE_8);
         setDsmErrTblAction(CONSTANTS.SPACE_10);
         setDsmErrTxt(CONSTANTS.SPACE_35);
   }

		public static int getDsmSqlErrorMsgAreaFieldLength() {
			return DSM_SQL_ERROR_MSG_AREA_LENGTH;
		}

}
  
