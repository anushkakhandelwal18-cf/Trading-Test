package com.cloudframe.app.dto.o529351u;

/**
*  The class DrstEditErrorValueTxt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DrstEditErrorValueTxt extends DrstEditErrorValueTxtSerialized { 
   

								private char[] drstEditErrorValueInt = Field.fillLowValue(15);

								private char[] drstEditErrorValueDec = Field.fillLowValue(15);
	
	/**
	* Constructor for DrstEditErrorValueTxt
	**/
    public DrstEditErrorValueTxt() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for DrstEditErrorValueTxt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DrstEditErrorValueTxt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of drstEditErrorValueInt
	 *	@return drstEditErrorValueInt
	 */
   public char[] getDrstEditErrorValueInt() throws CFException{
     if (isDrstEditErrorValueIntModified()) { 
        drstEditErrorValueInt = refreshDrstEditErrorValueInt();
     }
   		return drstEditErrorValueInt;
   }

  
	/**
	*  set variable drstEditErrorValueInt
	*  Corresponding COBOL Variable is DRST-EDIT-ERROR-VALUE-INT
	*  @param value
	**/
   public void setDrstEditErrorValueInt(char[] value) {
      drstEditErrorValueInt = checkDrstEditErrorValueIntConstraints(value);
      serializeDrstEditErrorValueInt(drstEditErrorValueInt);
   } 

     /**
	 * 	Update DrstEditErrorValueInt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDrstEditErrorValueInt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDrstEditErrorValueInt,drstEditErrorValueInt.length);
   	
   }
   
   public void setDrstEditErrorValueInt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDrstEditErrorValueInt,drstEditErrorValueInt.length);
   	
   }
   
     /**
	 * 	Update DrstEditErrorValueInt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDrstEditErrorValueInt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDrstEditErrorValueInt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DrstEditErrorValueInt with another Field
	 *	@param value
	 */
   public void setDrstEditErrorValueInt(Field source) {
       replace(source,0,source.length(),beginDrstEditErrorValueInt,DRST_EDIT_ERROR_VALUE_INT_LEN);
   	
   }  
   
     /**
	 * 	Update DrstEditErrorValueInt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDrstEditErrorValueInt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDrstEditErrorValueInt,DRST_EDIT_ERROR_VALUE_INT_LEN);
   	
   }
   
     /**
	 * 	Update DrstEditErrorValueInt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDrstEditErrorValueInt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDrstEditErrorValueInt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of drstEditErrorValueDec
	 *	@return drstEditErrorValueDec
	 */
   public char[] getDrstEditErrorValueDec() throws CFException{
     if (isDrstEditErrorValueDecModified()) { 
        drstEditErrorValueDec = refreshDrstEditErrorValueDec();
     }
   		return drstEditErrorValueDec;
   }

  
	/**
	*  set variable drstEditErrorValueDec
	*  Corresponding COBOL Variable is DRST-EDIT-ERROR-VALUE-DEC
	*  @param value
	**/
   public void setDrstEditErrorValueDec(char[] value) {
      drstEditErrorValueDec = checkDrstEditErrorValueDecConstraints(value);
      serializeDrstEditErrorValueDec(drstEditErrorValueDec);
   } 

     /**
	 * 	Update DrstEditErrorValueDec 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDrstEditErrorValueDec(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDrstEditErrorValueDec,drstEditErrorValueDec.length);
   	
   }
   
   public void setDrstEditErrorValueDec(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDrstEditErrorValueDec,drstEditErrorValueDec.length);
   	
   }
   
     /**
	 * 	Update DrstEditErrorValueDec 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDrstEditErrorValueDec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDrstEditErrorValueDec+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DrstEditErrorValueDec with another Field
	 *	@param value
	 */
   public void setDrstEditErrorValueDec(Field source) {
       replace(source,0,source.length(),beginDrstEditErrorValueDec,DRST_EDIT_ERROR_VALUE_DEC_LEN);
   	
   }  
   
     /**
	 * 	Update DrstEditErrorValueDec 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDrstEditErrorValueDec(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDrstEditErrorValueDec,DRST_EDIT_ERROR_VALUE_DEC_LEN);
   	
   }
   
     /**
	 * 	Update DrstEditErrorValueDec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDrstEditErrorValueDec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDrstEditErrorValueDec+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDrstEditErrorValueTxtFieldLength() {
			return DRST_EDIT_ERROR_VALUE_TXT_LENGTH;
		}

}
  
