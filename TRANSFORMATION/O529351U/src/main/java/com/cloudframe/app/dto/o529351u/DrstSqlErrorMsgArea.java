package com.cloudframe.app.dto.o529351u;

/**
*  The class DrstSqlErrorMsgArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DrstSqlErrorMsgArea extends DrstSqlErrorMsgAreaSerialized { 
   

						private char[] drstErrTxt = Field.fillLowValue(30);
	
	/**
	* Constructor for DrstSqlErrorMsgArea
	**/
    public DrstSqlErrorMsgArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for DrstSqlErrorMsgArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DrstSqlErrorMsgArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of drstErrTxt
	 *	@return drstErrTxt
	 */
   public char[] getDrstErrTxt() throws CFException{
     if (isDrstErrTxtModified()) { 
        drstErrTxt = refreshDrstErrTxt();
     }
   		return drstErrTxt;
   }

  
	/**
	*  set variable drstErrTxt
	*  Corresponding COBOL Variable is DRST-ERR-TXT
	*  @param value
	**/
   public void setDrstErrTxt(char[] value) {
      drstErrTxt = checkDrstErrTxtConstraints(value);
      serializeDrstErrTxt(drstErrTxt);
   } 

     /**
	 * 	Update DrstErrTxt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDrstErrTxt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDrstErrTxt,drstErrTxt.length);
   	
   }
   
   public void setDrstErrTxt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDrstErrTxt,drstErrTxt.length);
   	
   }
   
     /**
	 * 	Update DrstErrTxt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDrstErrTxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDrstErrTxt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DrstErrTxt with another Field
	 *	@param value
	 */
   public void setDrstErrTxt(Field source) {
       replace(source,0,source.length(),beginDrstErrTxt,DRST_ERR_TXT_LEN);
   	
   }  
   
     /**
	 * 	Update DrstErrTxt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDrstErrTxt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDrstErrTxt,DRST_ERR_TXT_LEN);
   	
   }
   
     /**
	 * 	Update DrstErrTxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDrstErrTxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDrstErrTxt+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDrstSqlErrorMsgAreaFieldLength() {
			return DRST_SQL_ERROR_MSG_AREA_LENGTH;
		}

}
  
