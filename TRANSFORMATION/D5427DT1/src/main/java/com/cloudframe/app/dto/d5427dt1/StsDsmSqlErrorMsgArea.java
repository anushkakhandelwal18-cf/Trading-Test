package com.cloudframe.app.dto.d5427dt1;

/**
*  The class StsDsmSqlErrorMsgArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class StsDsmSqlErrorMsgArea extends StsDsmSqlErrorMsgAreaSerialized { 
   

						private char[] stsDsmErrTblName = Field.fillLowValue(25);

						private char[] stsDsmErrSectnName = Field.fillLowValue(34);

						private char[] stsDsmErrPgmName = Field.fillLowValue(8);

						private char[] stsDsmErrClngPgmName = Field.fillLowValue(8);

						private char[] stsDsmErrTblAction = Field.fillLowValue(10);

						private char[] stsDsmErrTxt = Field.fillLowValue(35);
	
	/**
	* Constructor for StsDsmSqlErrorMsgArea
	**/
    public StsDsmSqlErrorMsgArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for StsDsmSqlErrorMsgArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public StsDsmSqlErrorMsgArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of stsDsmErrTblName
	 *	@return stsDsmErrTblName
	 */
   public char[] getStsDsmErrTblName() throws CFException{
     if (isStsDsmErrTblNameModified()) { 
        stsDsmErrTblName = refreshStsDsmErrTblName();
     }
   		return stsDsmErrTblName;
   }

  
	/**
	*  set variable stsDsmErrTblName
	*  Corresponding COBOL Variable is STS-DSM-ERR-TBL-NAME
	*  @param value
	**/
   public void setStsDsmErrTblName(char[] value) {
      stsDsmErrTblName = checkStsDsmErrTblNameConstraints(value);
      serializeStsDsmErrTblName(stsDsmErrTblName);
   } 

     /**
	 * 	Update StsDsmErrTblName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setStsDsmErrTblName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginStsDsmErrTblName,stsDsmErrTblName.length);
   	
   }
   
   public void setStsDsmErrTblName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginStsDsmErrTblName,stsDsmErrTblName.length);
   	
   }
   
     /**
	 * 	Update StsDsmErrTblName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStsDsmErrTblName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStsDsmErrTblName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update StsDsmErrTblName with another Field
	 *	@param value
	 */
   public void setStsDsmErrTblName(Field source) {
       replace(source,0,source.length(),beginStsDsmErrTblName,STS_DSM_ERR_TBL_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update StsDsmErrTblName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setStsDsmErrTblName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginStsDsmErrTblName,STS_DSM_ERR_TBL_NAME_LEN);
   	
   }
   
     /**
	 * 	Update StsDsmErrTblName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStsDsmErrTblName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStsDsmErrTblName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of stsDsmErrSectnName
	 *	@return stsDsmErrSectnName
	 */
   public char[] getStsDsmErrSectnName() throws CFException{
     if (isStsDsmErrSectnNameModified()) { 
        stsDsmErrSectnName = refreshStsDsmErrSectnName();
     }
   		return stsDsmErrSectnName;
   }

  
	/**
	*  set variable stsDsmErrSectnName
	*  Corresponding COBOL Variable is STS-DSM-ERR-SECTN-NAME
	*  @param value
	**/
   public void setStsDsmErrSectnName(char[] value) {
      stsDsmErrSectnName = checkStsDsmErrSectnNameConstraints(value);
      serializeStsDsmErrSectnName(stsDsmErrSectnName);
   } 

     /**
	 * 	Update StsDsmErrSectnName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setStsDsmErrSectnName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginStsDsmErrSectnName,stsDsmErrSectnName.length);
   	
   }
   
   public void setStsDsmErrSectnName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginStsDsmErrSectnName,stsDsmErrSectnName.length);
   	
   }
   
     /**
	 * 	Update StsDsmErrSectnName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStsDsmErrSectnName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStsDsmErrSectnName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update StsDsmErrSectnName with another Field
	 *	@param value
	 */
   public void setStsDsmErrSectnName(Field source) {
       replace(source,0,source.length(),beginStsDsmErrSectnName,STS_DSM_ERR_SECTN_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update StsDsmErrSectnName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setStsDsmErrSectnName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginStsDsmErrSectnName,STS_DSM_ERR_SECTN_NAME_LEN);
   	
   }
   
     /**
	 * 	Update StsDsmErrSectnName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStsDsmErrSectnName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStsDsmErrSectnName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of stsDsmErrPgmName
	 *	@return stsDsmErrPgmName
	 */
   public char[] getStsDsmErrPgmName() throws CFException{
     if (isStsDsmErrPgmNameModified()) { 
        stsDsmErrPgmName = refreshStsDsmErrPgmName();
     }
   		return stsDsmErrPgmName;
   }

  
	/**
	*  set variable stsDsmErrPgmName
	*  Corresponding COBOL Variable is STS-DSM-ERR-PGM-NAME
	*  @param value
	**/
   public void setStsDsmErrPgmName(char[] value) {
      stsDsmErrPgmName = checkStsDsmErrPgmNameConstraints(value);
      serializeStsDsmErrPgmName(stsDsmErrPgmName);
   } 

     /**
	 * 	Update StsDsmErrPgmName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setStsDsmErrPgmName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginStsDsmErrPgmName,stsDsmErrPgmName.length);
   	
   }
   
   public void setStsDsmErrPgmName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginStsDsmErrPgmName,stsDsmErrPgmName.length);
   	
   }
   
     /**
	 * 	Update StsDsmErrPgmName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStsDsmErrPgmName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStsDsmErrPgmName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update StsDsmErrPgmName with another Field
	 *	@param value
	 */
   public void setStsDsmErrPgmName(Field source) {
       replace(source,0,source.length(),beginStsDsmErrPgmName,STS_DSM_ERR_PGM_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update StsDsmErrPgmName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setStsDsmErrPgmName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginStsDsmErrPgmName,STS_DSM_ERR_PGM_NAME_LEN);
   	
   }
   
     /**
	 * 	Update StsDsmErrPgmName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStsDsmErrPgmName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStsDsmErrPgmName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of stsDsmErrClngPgmName
	 *	@return stsDsmErrClngPgmName
	 */
   public char[] getStsDsmErrClngPgmName() throws CFException{
     if (isStsDsmErrClngPgmNameModified()) { 
        stsDsmErrClngPgmName = refreshStsDsmErrClngPgmName();
     }
   		return stsDsmErrClngPgmName;
   }

  
	/**
	*  set variable stsDsmErrClngPgmName
	*  Corresponding COBOL Variable is STS-DSM-ERR-CLNG-PGM-NAME
	*  @param value
	**/
   public void setStsDsmErrClngPgmName(char[] value) {
      stsDsmErrClngPgmName = checkStsDsmErrClngPgmNameConstraints(value);
      serializeStsDsmErrClngPgmName(stsDsmErrClngPgmName);
   } 

     /**
	 * 	Update StsDsmErrClngPgmName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setStsDsmErrClngPgmName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginStsDsmErrClngPgmName,stsDsmErrClngPgmName.length);
   	
   }
   
   public void setStsDsmErrClngPgmName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginStsDsmErrClngPgmName,stsDsmErrClngPgmName.length);
   	
   }
   
     /**
	 * 	Update StsDsmErrClngPgmName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStsDsmErrClngPgmName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStsDsmErrClngPgmName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update StsDsmErrClngPgmName with another Field
	 *	@param value
	 */
   public void setStsDsmErrClngPgmName(Field source) {
       replace(source,0,source.length(),beginStsDsmErrClngPgmName,STS_DSM_ERR_CLNG_PGM_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update StsDsmErrClngPgmName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setStsDsmErrClngPgmName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginStsDsmErrClngPgmName,STS_DSM_ERR_CLNG_PGM_NAME_LEN);
   	
   }
   
     /**
	 * 	Update StsDsmErrClngPgmName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStsDsmErrClngPgmName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStsDsmErrClngPgmName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of stsDsmErrTblAction
	 *	@return stsDsmErrTblAction
	 */
   public char[] getStsDsmErrTblAction() throws CFException{
     if (isStsDsmErrTblActionModified()) { 
        stsDsmErrTblAction = refreshStsDsmErrTblAction();
     }
   		return stsDsmErrTblAction;
   }

  
	/**
	*  set variable stsDsmErrTblAction
	*  Corresponding COBOL Variable is STS-DSM-ERR-TBL-ACTION
	*  @param value
	**/
   public void setStsDsmErrTblAction(char[] value) {
      stsDsmErrTblAction = checkStsDsmErrTblActionConstraints(value);
      serializeStsDsmErrTblAction(stsDsmErrTblAction);
   } 

     /**
	 * 	Update StsDsmErrTblAction 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setStsDsmErrTblAction(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginStsDsmErrTblAction,stsDsmErrTblAction.length);
   	
   }
   
   public void setStsDsmErrTblAction(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginStsDsmErrTblAction,stsDsmErrTblAction.length);
   	
   }
   
     /**
	 * 	Update StsDsmErrTblAction 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStsDsmErrTblAction(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStsDsmErrTblAction+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update StsDsmErrTblAction with another Field
	 *	@param value
	 */
   public void setStsDsmErrTblAction(Field source) {
       replace(source,0,source.length(),beginStsDsmErrTblAction,STS_DSM_ERR_TBL_ACTION_LEN);
   	
   }  
   
     /**
	 * 	Update StsDsmErrTblAction 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setStsDsmErrTblAction(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginStsDsmErrTblAction,STS_DSM_ERR_TBL_ACTION_LEN);
   	
   }
   
     /**
	 * 	Update StsDsmErrTblAction 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStsDsmErrTblAction(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStsDsmErrTblAction+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of stsDsmErrTxt
	 *	@return stsDsmErrTxt
	 */
   public char[] getStsDsmErrTxt() throws CFException{
     if (isStsDsmErrTxtModified()) { 
        stsDsmErrTxt = refreshStsDsmErrTxt();
     }
   		return stsDsmErrTxt;
   }

  
	/**
	*  set variable stsDsmErrTxt
	*  Corresponding COBOL Variable is STS-DSM-ERR-TXT
	*  @param value
	**/
   public void setStsDsmErrTxt(char[] value) {
      stsDsmErrTxt = checkStsDsmErrTxtConstraints(value);
      serializeStsDsmErrTxt(stsDsmErrTxt);
   } 

     /**
	 * 	Update StsDsmErrTxt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setStsDsmErrTxt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginStsDsmErrTxt,stsDsmErrTxt.length);
   	
   }
   
   public void setStsDsmErrTxt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginStsDsmErrTxt,stsDsmErrTxt.length);
   	
   }
   
     /**
	 * 	Update StsDsmErrTxt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStsDsmErrTxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStsDsmErrTxt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update StsDsmErrTxt with another Field
	 *	@param value
	 */
   public void setStsDsmErrTxt(Field source) {
       replace(source,0,source.length(),beginStsDsmErrTxt,STS_DSM_ERR_TXT_LEN);
   	
   }  
   
     /**
	 * 	Update StsDsmErrTxt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setStsDsmErrTxt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginStsDsmErrTxt,STS_DSM_ERR_TXT_LEN);
   	
   }
   
     /**
	 * 	Update StsDsmErrTxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStsDsmErrTxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStsDsmErrTxt+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes StsDsmSqlErrorMsgArea
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setStsDsmErrTblName(CONSTANTS.SPACE_25);
         setStsDsmErrSectnName(CONSTANTS.SPACE_34);
         setStsDsmErrPgmName(CONSTANTS.SPACE_8);
         setStsDsmErrClngPgmName(CONSTANTS.SPACE_8);
         setStsDsmErrTblAction(CONSTANTS.SPACE_10);
         setStsDsmErrTxt(CONSTANTS.SPACE_35);
   }

		public static int getStsDsmSqlErrorMsgAreaFieldLength() {
			return STS_DSM_SQL_ERROR_MSG_AREA_LENGTH;
		}

}
  
