package com.cloudframe.app.dto.d5427dt1;

/**
*  The class DderefDepnNbrGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DderefDepnNbrGroup extends DderefDepnNbrGroupSerialized { 
   

						private char[] dderefDepnNbr = Field.fillLowValue(2);
	
	/**
	* Constructor for DderefDepnNbrGroup
	**/
    public DderefDepnNbrGroup() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for DderefDepnNbrGroup. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DderefDepnNbrGroup(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of dderefDepnNbr
	 *	@return dderefDepnNbr
	 */
   public char[] getDderefDepnNbr() throws CFException{
     if (isDderefDepnNbrModified()) { 
        dderefDepnNbr = refreshDderefDepnNbr();
     }
   		return dderefDepnNbr;
   }

  
	/**
	*  set variable dderefDepnNbr
	*  Corresponding COBOL Variable is DDEREF-DEPN-NBR
	*  @param value
	**/
   public void setDderefDepnNbr(char[] value) {
      dderefDepnNbr = checkDderefDepnNbrConstraints(value);
      serializeDderefDepnNbr(dderefDepnNbr);
   } 

     /**
	 * 	Update DderefDepnNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDderefDepnNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDderefDepnNbr,dderefDepnNbr.length);
   	
   }
   
   public void setDderefDepnNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDderefDepnNbr,dderefDepnNbr.length);
   	
   }
   
     /**
	 * 	Update DderefDepnNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDderefDepnNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDderefDepnNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DderefDepnNbr with another Field
	 *	@param value
	 */
   public void setDderefDepnNbr(Field source) {
       replace(source,0,source.length(),beginDderefDepnNbr,DDEREF_DEPN_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update DderefDepnNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDderefDepnNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDderefDepnNbr,DDEREF_DEPN_NBR_LEN);
   	
   }
   
     /**
	 * 	Update DderefDepnNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDderefDepnNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDderefDepnNbr+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDderefDepnNbrGroupFieldLength() {
			return DDEREF_DEPN_NBR_GROUP_LENGTH;
		}

}
  
