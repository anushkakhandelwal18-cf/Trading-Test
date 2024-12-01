package com.cloudframe.app.dto.d5427dt1;

/**
*  The class DderefProcDtGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DderefProcDtGroup extends DderefProcDtGroupSerialized { 
   

						private char[] dderefProcDt = Field.fillLowValue(10);
	
	/**
	* Constructor for DderefProcDtGroup
	**/
    public DderefProcDtGroup() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for DderefProcDtGroup. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DderefProcDtGroup(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of dderefProcDt
	 *	@return dderefProcDt
	 */
   public char[] getDderefProcDt() throws CFException{
     if (isDderefProcDtModified()) { 
        dderefProcDt = refreshDderefProcDt();
     }
   		return dderefProcDt;
   }

  
	/**
	*  set variable dderefProcDt
	*  Corresponding COBOL Variable is DDEREF-PROC-DT
	*  @param value
	**/
   public void setDderefProcDt(char[] value) {
      dderefProcDt = checkDderefProcDtConstraints(value);
      serializeDderefProcDt(dderefProcDt);
   } 

     /**
	 * 	Update DderefProcDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDderefProcDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDderefProcDt,dderefProcDt.length);
   	
   }
   
   public void setDderefProcDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDderefProcDt,dderefProcDt.length);
   	
   }
   
     /**
	 * 	Update DderefProcDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDderefProcDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDderefProcDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DderefProcDt with another Field
	 *	@param value
	 */
   public void setDderefProcDt(Field source) {
       replace(source,0,source.length(),beginDderefProcDt,DDEREF_PROC_DT_LEN);
   	
   }  
   
     /**
	 * 	Update DderefProcDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDderefProcDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDderefProcDt,DDEREF_PROC_DT_LEN);
   	
   }
   
     /**
	 * 	Update DderefProcDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDderefProcDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDderefProcDt+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDderefProcDtGroupFieldLength() {
			return DDEREF_PROC_DT_GROUP_LENGTH;
		}

}
  
