package com.cloudframe.app.dto.o529351u;

/**
*  The class DsmEditErrorValueTxt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.common.CONSTANTS;


public class DsmEditErrorValueTxt extends DsmEditErrorValueTxtSerialized { 
   

								private char[] dsmEditErrorValueInt = Field.fillLowValue(19);

								private char[] dsmEditErrorValueDec = Field.fillLowValue(19);

	
	/**
	* Constructor for DsmEditErrorValueTxt
	**/
    public DsmEditErrorValueTxt() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for DsmEditErrorValueTxt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DsmEditErrorValueTxt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of dsmEditErrorValueInt
	 *	@return dsmEditErrorValueInt
	 */
   public char[] getDsmEditErrorValueInt() throws CFException{
     if (isDsmEditErrorValueIntModified()) { 
        dsmEditErrorValueInt = refreshDsmEditErrorValueInt();
     }
   		return dsmEditErrorValueInt;
   }

  
	/**
	*  set variable dsmEditErrorValueInt
	*  Corresponding COBOL Variable is DSM-EDIT-ERROR-VALUE-INT
	*  @param value
	**/
   public void setDsmEditErrorValueInt(char[] value) {
      dsmEditErrorValueInt = checkDsmEditErrorValueIntConstraints(value);
      serializeDsmEditErrorValueInt(dsmEditErrorValueInt);
   } 

     /**
	 * 	Update DsmEditErrorValueInt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDsmEditErrorValueInt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDsmEditErrorValueInt,dsmEditErrorValueInt.length);
   	
   }
   
   public void setDsmEditErrorValueInt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDsmEditErrorValueInt,dsmEditErrorValueInt.length);
   	
   }
   
     /**
	 * 	Update DsmEditErrorValueInt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDsmEditErrorValueInt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDsmEditErrorValueInt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DsmEditErrorValueInt with another Field
	 *	@param value
	 */
   public void setDsmEditErrorValueInt(Field source) {
       replace(source,0,source.length(),beginDsmEditErrorValueInt,DSM_EDIT_ERROR_VALUE_INT_LEN);
   	
   }  
   
     /**
	 * 	Update DsmEditErrorValueInt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDsmEditErrorValueInt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDsmEditErrorValueInt,DSM_EDIT_ERROR_VALUE_INT_LEN);
   	
   }
   
     /**
	 * 	Update DsmEditErrorValueInt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDsmEditErrorValueInt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDsmEditErrorValueInt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dsmEditErrorValueDec
	 *	@return dsmEditErrorValueDec
	 */
   public char[] getDsmEditErrorValueDec() throws CFException{
     if (isDsmEditErrorValueDecModified()) { 
        dsmEditErrorValueDec = refreshDsmEditErrorValueDec();
     }
   		return dsmEditErrorValueDec;
   }

  
	/**
	*  set variable dsmEditErrorValueDec
	*  Corresponding COBOL Variable is DSM-EDIT-ERROR-VALUE-DEC
	*  @param value
	**/
   public void setDsmEditErrorValueDec(char[] value) {
      dsmEditErrorValueDec = checkDsmEditErrorValueDecConstraints(value);
      serializeDsmEditErrorValueDec(dsmEditErrorValueDec);
   } 

     /**
	 * 	Update DsmEditErrorValueDec 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDsmEditErrorValueDec(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDsmEditErrorValueDec,dsmEditErrorValueDec.length);
   	
   }
   
   public void setDsmEditErrorValueDec(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDsmEditErrorValueDec,dsmEditErrorValueDec.length);
   	
   }
   
     /**
	 * 	Update DsmEditErrorValueDec 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDsmEditErrorValueDec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDsmEditErrorValueDec+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DsmEditErrorValueDec with another Field
	 *	@param value
	 */
   public void setDsmEditErrorValueDec(Field source) {
       replace(source,0,source.length(),beginDsmEditErrorValueDec,DSM_EDIT_ERROR_VALUE_DEC_LEN);
   	
   }  
   
     /**
	 * 	Update DsmEditErrorValueDec 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDsmEditErrorValueDec(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDsmEditErrorValueDec,DSM_EDIT_ERROR_VALUE_DEC_LEN);
   	
   }
   
     /**
	 * 	Update DsmEditErrorValueDec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDsmEditErrorValueDec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDsmEditErrorValueDec+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes DsmEditErrorValueTxt
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                    setDsmEditErrorValueInt(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_467480023,"0".toCharArray()));
   }

		public static int getDsmEditErrorValueTxtFieldLength() {
			return DSM_EDIT_ERROR_VALUE_TXT_LENGTH;
		}

}
  
