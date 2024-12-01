package com.cloudframe.app.dto.d5427dt1;

/**
*  The class DderefProcTmGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DderefProcTmGroup extends DderefProcTmGroupSerialized { 
   

						private char[] dderefProcTm = Field.fillLowValue(8);
	
	/**
	* Constructor for DderefProcTmGroup
	**/
    public DderefProcTmGroup() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for DderefProcTmGroup. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DderefProcTmGroup(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of dderefProcTm
	 *	@return dderefProcTm
	 */
   public char[] getDderefProcTm() throws CFException{
     if (isDderefProcTmModified()) { 
        dderefProcTm = refreshDderefProcTm();
     }
   		return dderefProcTm;
   }

  
	/**
	*  set variable dderefProcTm
	*  Corresponding COBOL Variable is DDEREF-PROC-TM
	*  @param value
	**/
   public void setDderefProcTm(char[] value) {
      dderefProcTm = checkDderefProcTmConstraints(value);
      serializeDderefProcTm(dderefProcTm);
   } 

     /**
	 * 	Update DderefProcTm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDderefProcTm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDderefProcTm,dderefProcTm.length);
   	
   }
   
   public void setDderefProcTm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDderefProcTm,dderefProcTm.length);
   	
   }
   
     /**
	 * 	Update DderefProcTm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDderefProcTm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDderefProcTm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DderefProcTm with another Field
	 *	@param value
	 */
   public void setDderefProcTm(Field source) {
       replace(source,0,source.length(),beginDderefProcTm,DDEREF_PROC_TM_LEN);
   	
   }  
   
     /**
	 * 	Update DderefProcTm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDderefProcTm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDderefProcTm,DDEREF_PROC_TM_LEN);
   	
   }
   
     /**
	 * 	Update DderefProcTm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDderefProcTm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDderefProcTm+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDderefProcTmGroupFieldLength() {
			return DDEREF_PROC_TM_GROUP_LENGTH;
		}

}
  
