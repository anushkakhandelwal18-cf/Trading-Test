package com.cloudframe.app.dto.d5427dt1;

/**
*  The class DderefInvnCtlNbrGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DderefInvnCtlNbrGroup extends DderefInvnCtlNbrGroupSerialized { 
   

						private char[] dderefInvnCtlNbr = Field.fillLowValue(10);
	
	/**
	* Constructor for DderefInvnCtlNbrGroup
	**/
    public DderefInvnCtlNbrGroup() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for DderefInvnCtlNbrGroup. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DderefInvnCtlNbrGroup(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of dderefInvnCtlNbr
	 *	@return dderefInvnCtlNbr
	 */
   public char[] getDderefInvnCtlNbr() throws CFException{
     if (isDderefInvnCtlNbrModified()) { 
        dderefInvnCtlNbr = refreshDderefInvnCtlNbr();
     }
   		return dderefInvnCtlNbr;
   }

  
	/**
	*  set variable dderefInvnCtlNbr
	*  Corresponding COBOL Variable is DDEREF-INVN-CTL-NBR
	*  @param value
	**/
   public void setDderefInvnCtlNbr(char[] value) {
      dderefInvnCtlNbr = checkDderefInvnCtlNbrConstraints(value);
      serializeDderefInvnCtlNbr(dderefInvnCtlNbr);
   } 

     /**
	 * 	Update DderefInvnCtlNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDderefInvnCtlNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDderefInvnCtlNbr,dderefInvnCtlNbr.length);
   	
   }
   
   public void setDderefInvnCtlNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDderefInvnCtlNbr,dderefInvnCtlNbr.length);
   	
   }
   
     /**
	 * 	Update DderefInvnCtlNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDderefInvnCtlNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDderefInvnCtlNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DderefInvnCtlNbr with another Field
	 *	@param value
	 */
   public void setDderefInvnCtlNbr(Field source) {
       replace(source,0,source.length(),beginDderefInvnCtlNbr,DDEREF_INVN_CTL_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update DderefInvnCtlNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDderefInvnCtlNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDderefInvnCtlNbr,DDEREF_INVN_CTL_NBR_LEN);
   	
   }
   
     /**
	 * 	Update DderefInvnCtlNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDderefInvnCtlNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDderefInvnCtlNbr+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDderefInvnCtlNbrGroupFieldLength() {
			return DDEREF_INVN_CTL_NBR_GROUP_LENGTH;
		}

}
  
