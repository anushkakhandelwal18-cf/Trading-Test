package com.cloudframe.app.dto.d5427dt1;

/**
*  The class HvInvnCtlNbrGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HvInvnCtlNbrGroup extends HvInvnCtlNbrGroupSerialized { 
   

						private char[] hvInvnCtlNbr = new char[10];
	
	/**
	* Constructor for HvInvnCtlNbrGroup
	**/
    public HvInvnCtlNbrGroup() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for HvInvnCtlNbrGroup. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HvInvnCtlNbrGroup(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setHvInvnCtlNbr(("0000000000").toCharArray());
    } 

	/**
	 *	Returns the value of hvInvnCtlNbr
	 *	@return hvInvnCtlNbr
	 */
   public char[] getHvInvnCtlNbr() throws CFException{
     if (isHvInvnCtlNbrModified()) { 
        hvInvnCtlNbr = refreshHvInvnCtlNbr();
     }
   		return hvInvnCtlNbr;
   }

  
	/**
	*  set variable hvInvnCtlNbr
	*  Corresponding COBOL Variable is HV-INVN-CTL-NBR
	*  @param value
	**/
   public void setHvInvnCtlNbr(char[] value) {
      hvInvnCtlNbr = checkHvInvnCtlNbrConstraints(value);
      serializeHvInvnCtlNbr(hvInvnCtlNbr);
   } 

     /**
	 * 	Update HvInvnCtlNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHvInvnCtlNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHvInvnCtlNbr,hvInvnCtlNbr.length);
   	
   }
   
   public void setHvInvnCtlNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHvInvnCtlNbr,hvInvnCtlNbr.length);
   	
   }
   
     /**
	 * 	Update HvInvnCtlNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvInvnCtlNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvInvnCtlNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HvInvnCtlNbr with another Field
	 *	@param value
	 */
   public void setHvInvnCtlNbr(Field source) {
       replace(source,0,source.length(),beginHvInvnCtlNbr,HV_INVN_CTL_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update HvInvnCtlNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHvInvnCtlNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHvInvnCtlNbr,HV_INVN_CTL_NBR_LEN);
   	
   }
   
     /**
	 * 	Update HvInvnCtlNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvInvnCtlNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvInvnCtlNbr+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHvInvnCtlNbrGroupFieldLength() {
			return HV_INVN_CTL_NBR_GROUP_LENGTH;
		}

}
  
