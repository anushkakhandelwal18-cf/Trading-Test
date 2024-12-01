package com.cloudframe.app.dto.d5427dt1;

/**
*  The class StsDsmCommonArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class StsDsmCommonArea extends StsDsmCommonAreaSerialized { 
   

								private int stsDsmFuncCd;

								private int stsDsmReturnCode;
				private StsDsmSqlErrorMsgArea stsDsmSqlErrorMsgArea = new StsDsmSqlErrorMsgArea();

						private char[] stsDsmSqlErrorMessage = Field.fillLowValue(120);
				private StsDsmFormattedSqlErrMsg stsDsmFormattedSqlErrMsg = new StsDsmFormattedSqlErrMsg();
	
	/**
	* Constructor for StsDsmCommonArea
	**/
    public StsDsmCommonArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for StsDsmCommonArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public StsDsmCommonArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			stsDsmSqlErrorMsgArea.setParent(this,getStartOffset() + 5);
	       			stsDsmFormattedSqlErrMsg.setParent(this,getStartOffset() + 245);
								setStsDsmReturnCode(0);
    } 

	/**
	 *	Returns the value of stsDsmFuncCd
	 *	@return stsDsmFuncCd
	 */
	public int getStsDsmFuncCd() throws CFException {
       if (isStsDsmFuncCdModified()) { 
           stsDsmFuncCd = refreshStsDsmFuncCd();
        }
   		return stsDsmFuncCd;
	}
	

	
	   
	/**
	 * 	Update StsDsmFuncCd with the passed value
	 *  Corresponding COBOL Variable is STS-DSM-FUNC-CD
	 *	@param number
	 */
	public void setStsDsmFuncCd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    stsDsmFuncCd = checkStsDsmFuncCdMaxLimit(number); 
		serializeStsDsmFuncCd(stsDsmFuncCd);
	}
	

	public void setStsDsmFuncCd(long number) {
	    number = checkStsDsmFuncCdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setStsDsmFuncCd((int)number);
	}
	
	/**
	 * 	Update StsDsmFuncCd with the passed value
	 *	@param value (String or char[])
	 */
	public void setStsDsmFuncCd(char[] value) throws CFException {
		 stsDsmFuncCd = serializeStsDsmFuncCd(value);
	}
	/**
	 * 	Update StsDsmFuncCd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setStsDsmFuncCdString(char[] value) throws CFException {
		 setStsDsmFuncCd(value);
	}
	/**
	 *	Returns the value of stsDsmReturnCode
	 *	@return stsDsmReturnCode
	 */
	public int getStsDsmReturnCode() throws CFException {
       if (isStsDsmReturnCodeModified()) { 
           stsDsmReturnCode = refreshStsDsmReturnCode();
        }
   		return stsDsmReturnCode;
	}
	

	
	   
	/**
	 * 	Update StsDsmReturnCode with the passed value
	 *  Corresponding COBOL Variable is STS-DSM-RETURN-CODE
	 *	@param number
	 */
	public void setStsDsmReturnCode(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    stsDsmReturnCode = checkStsDsmReturnCodeMaxLimit(number); 
		serializeStsDsmReturnCode(stsDsmReturnCode);
	}
	

	public void setStsDsmReturnCode(long number) {
	    number = checkStsDsmReturnCodeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setStsDsmReturnCode((int)number);
	}
	
	/**
	 * 	Update StsDsmReturnCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setStsDsmReturnCode(char[] value) throws CFException {
		 stsDsmReturnCode = serializeStsDsmReturnCode(value);
	}
	/**
	 * 	Update StsDsmReturnCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setStsDsmReturnCodeString(char[] value) throws CFException {
		 setStsDsmReturnCode(value);
	}
	/**
	 *	Returns the value of stsDsmSqlErrorMsgArea
	 *	@return stsDsmSqlErrorMsgArea
	 */   
	 public StsDsmSqlErrorMsgArea getStsDsmSqlErrorMsgArea() {
   	return stsDsmSqlErrorMsgArea;
   }
   /**
	* 	Update StsDsmSqlErrorMsgArea with the passed value
	*   Corresponding COBOL Variable is STS-DSM-SQL-ERROR-MSG-AREA
	*	@param value
	*/
   public void setStsDsmSqlErrorMsgArea(char[] value) {
      stsDsmSqlErrorMsgArea.setString(value); 
   }   
    
     /**
	 * 	Update StsDsmSqlErrorMsgArea 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setStsDsmSqlErrorMsgArea(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,stsDsmSqlErrorMsgArea.begin,stsDsmSqlErrorMsgArea.length());
   }
   
     /**
	 * 	Update StsDsmSqlErrorMsgArea 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStsDsmSqlErrorMsgArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,stsDsmSqlErrorMsgArea.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update StsDsmSqlErrorMsgArea with another Field
	 *	@param value
	 */
   public void setStsDsmSqlErrorMsgArea(Field source) {
   	replace(source,0,source.length(),stsDsmSqlErrorMsgArea.begin,stsDsmSqlErrorMsgArea.length());
   }  
   
     /**
	 * 	Update StsDsmSqlErrorMsgArea 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setStsDsmSqlErrorMsgArea(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,stsDsmSqlErrorMsgArea.begin,stsDsmSqlErrorMsgArea.length());
   }
   
     /**
	 * 	Update StsDsmSqlErrorMsgArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStsDsmSqlErrorMsgArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,stsDsmSqlErrorMsgArea.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of stsDsmSqlErrorMessage
	 *	@return stsDsmSqlErrorMessage
	 */
   public char[] getStsDsmSqlErrorMessage() throws CFException{
     if (isStsDsmSqlErrorMessageModified()) { 
        stsDsmSqlErrorMessage = refreshStsDsmSqlErrorMessage();
     }
   		return stsDsmSqlErrorMessage;
   }

  
	/**
	*  set variable stsDsmSqlErrorMessage
	*  Corresponding COBOL Variable is STS-DSM-SQL-ERROR-MESSAGE
	*  @param value
	**/
   public void setStsDsmSqlErrorMessage(char[] value) {
      stsDsmSqlErrorMessage = checkStsDsmSqlErrorMessageConstraints(value);
      serializeStsDsmSqlErrorMessage(stsDsmSqlErrorMessage);
   } 

     /**
	 * 	Update StsDsmSqlErrorMessage 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setStsDsmSqlErrorMessage(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginStsDsmSqlErrorMessage,stsDsmSqlErrorMessage.length);
   	
   }
   
   public void setStsDsmSqlErrorMessage(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginStsDsmSqlErrorMessage,stsDsmSqlErrorMessage.length);
   	
   }
   
     /**
	 * 	Update StsDsmSqlErrorMessage 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStsDsmSqlErrorMessage(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStsDsmSqlErrorMessage+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update StsDsmSqlErrorMessage with another Field
	 *	@param value
	 */
   public void setStsDsmSqlErrorMessage(Field source) {
       replace(source,0,source.length(),beginStsDsmSqlErrorMessage,STS_DSM_SQL_ERROR_MESSAGE_LEN);
   	
   }  
   
     /**
	 * 	Update StsDsmSqlErrorMessage 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setStsDsmSqlErrorMessage(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginStsDsmSqlErrorMessage,STS_DSM_SQL_ERROR_MESSAGE_LEN);
   	
   }
   
     /**
	 * 	Update StsDsmSqlErrorMessage 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStsDsmSqlErrorMessage(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStsDsmSqlErrorMessage+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of stsDsmFormattedSqlErrMsg
	 *	@return stsDsmFormattedSqlErrMsg
	 */   
	 public StsDsmFormattedSqlErrMsg getStsDsmFormattedSqlErrMsg() {
   	return stsDsmFormattedSqlErrMsg;
   }
   /**
	* 	Update StsDsmFormattedSqlErrMsg with the passed value
	*   Corresponding COBOL Variable is STS-DSM-FORMATTED-SQL-ERR-MSG
	*	@param value
	*/
   public void setStsDsmFormattedSqlErrMsg(char[] value) {
      stsDsmFormattedSqlErrMsg.setString(value); 
   }   
    
     /**
	 * 	Update StsDsmFormattedSqlErrMsg 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setStsDsmFormattedSqlErrMsg(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,stsDsmFormattedSqlErrMsg.begin,stsDsmFormattedSqlErrMsg.length());
   }
   
     /**
	 * 	Update StsDsmFormattedSqlErrMsg 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStsDsmFormattedSqlErrMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,stsDsmFormattedSqlErrMsg.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update StsDsmFormattedSqlErrMsg with another Field
	 *	@param value
	 */
   public void setStsDsmFormattedSqlErrMsg(Field source) {
   	replace(source,0,source.length(),stsDsmFormattedSqlErrMsg.begin,stsDsmFormattedSqlErrMsg.length());
   }  
   
     /**
	 * 	Update StsDsmFormattedSqlErrMsg 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setStsDsmFormattedSqlErrMsg(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,stsDsmFormattedSqlErrMsg.begin,stsDsmFormattedSqlErrMsg.length());
   }
   
     /**
	 * 	Update StsDsmFormattedSqlErrMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStsDsmFormattedSqlErrMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,stsDsmFormattedSqlErrMsg.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes StsDsmCommonArea
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setStsDsmFuncCd(0);
                     setStsDsmReturnCode(0);
          stsDsmSqlErrorMsgArea.initialize();
     
         setStsDsmSqlErrorMessage(CONSTANTS.SPACE_120);
          stsDsmFormattedSqlErrMsg.initialize();
     
   }

		public static int getStsDsmCommonAreaFieldLength() {
			return STS_DSM_COMMON_AREA_LENGTH;
		}

}
  
