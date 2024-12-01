package com.cloudframe.app.dto.d5427dt1;

/**
*  The class DderefPolNbrGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DderefPolNbrGroup extends DderefPolNbrGroupSerialized { 
   

						private char[] dderefPolNbr = Field.fillLowValue(6);
	
	/**
	* Constructor for DderefPolNbrGroup
	**/
    public DderefPolNbrGroup() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for DderefPolNbrGroup. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DderefPolNbrGroup(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of dderefPolNbr
	 *	@return dderefPolNbr
	 */
   public char[] getDderefPolNbr() throws CFException{
     if (isDderefPolNbrModified()) { 
        dderefPolNbr = refreshDderefPolNbr();
     }
   		return dderefPolNbr;
   }

  
	/**
	*  set variable dderefPolNbr
	*  Corresponding COBOL Variable is DDEREF-POL-NBR
	*  @param value
	**/
   public void setDderefPolNbr(char[] value) {
      dderefPolNbr = checkDderefPolNbrConstraints(value);
      serializeDderefPolNbr(dderefPolNbr);
   } 

     /**
	 * 	Update DderefPolNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDderefPolNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDderefPolNbr,dderefPolNbr.length);
   	
   }
   
   public void setDderefPolNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDderefPolNbr,dderefPolNbr.length);
   	
   }
   
     /**
	 * 	Update DderefPolNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDderefPolNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDderefPolNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DderefPolNbr with another Field
	 *	@param value
	 */
   public void setDderefPolNbr(Field source) {
       replace(source,0,source.length(),beginDderefPolNbr,DDEREF_POL_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update DderefPolNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDderefPolNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDderefPolNbr,DDEREF_POL_NBR_LEN);
   	
   }
   
     /**
	 * 	Update DderefPolNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDderefPolNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDderefPolNbr+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDderefPolNbrGroupFieldLength() {
			return DDEREF_POL_NBR_GROUP_LENGTH;
		}

}
  
