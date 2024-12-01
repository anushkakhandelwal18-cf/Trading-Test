package com.cloudframe.app.dto.d5427dt1;

/**
*  The class DderefPgmIdLstCharValGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DderefPgmIdLstCharValGroup extends DderefPgmIdLstCharValGroupSerialized { 
   

						private char[] dderefPgmIdLstCharVal = Field.fillLowValue(1);
	
	/**
	* Constructor for DderefPgmIdLstCharValGroup
	**/
    public DderefPgmIdLstCharValGroup() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for DderefPgmIdLstCharValGroup. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DderefPgmIdLstCharValGroup(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of dderefPgmIdLstCharVal
	 *	@return dderefPgmIdLstCharVal
	 */
   public char[] getDderefPgmIdLstCharVal() throws CFException{
     if (isDderefPgmIdLstCharValModified()) { 
        dderefPgmIdLstCharVal = refreshDderefPgmIdLstCharVal();
     }
   		return dderefPgmIdLstCharVal;
   }

  
	/**
	*  set variable dderefPgmIdLstCharVal
	*  Corresponding COBOL Variable is DDEREF-PGM-ID-LST-CHAR-VAL
	*  @param value
	**/
   public void setDderefPgmIdLstCharVal(char[] value) {
      dderefPgmIdLstCharVal = checkDderefPgmIdLstCharValConstraints(value);
      serializeDderefPgmIdLstCharVal(dderefPgmIdLstCharVal);
   } 

     /**
	 * 	Update DderefPgmIdLstCharVal 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDderefPgmIdLstCharVal(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDderefPgmIdLstCharVal,dderefPgmIdLstCharVal.length);
   	
   }
   
   public void setDderefPgmIdLstCharVal(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDderefPgmIdLstCharVal,dderefPgmIdLstCharVal.length);
   	
   }
   
     /**
	 * 	Update DderefPgmIdLstCharVal 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDderefPgmIdLstCharVal(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDderefPgmIdLstCharVal+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DderefPgmIdLstCharVal with another Field
	 *	@param value
	 */
   public void setDderefPgmIdLstCharVal(Field source) {
       replace(source,0,source.length(),beginDderefPgmIdLstCharVal,DDEREF_PGM_ID_LST_CHAR_VAL_LEN);
   	
   }  
   
     /**
	 * 	Update DderefPgmIdLstCharVal 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDderefPgmIdLstCharVal(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDderefPgmIdLstCharVal,DDEREF_PGM_ID_LST_CHAR_VAL_LEN);
   	
   }
   
     /**
	 * 	Update DderefPgmIdLstCharVal 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDderefPgmIdLstCharVal(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDderefPgmIdLstCharVal+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDderefPgmIdLstCharValGroupFieldLength() {
			return DDEREF_PGM_ID_LST_CHAR_VAL_GROUP_LENGTH;
		}

}
  
