package com.cloudframe.app.dto.d5427dt1;

/**
*  The class HvAuthNbrGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HvAuthNbrGroup extends HvAuthNbrGroupSerialized { 
   

						private char[] hvAuthNbr = new char[10];
	
	/**
	* Constructor for HvAuthNbrGroup
	**/
    public HvAuthNbrGroup() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for HvAuthNbrGroup. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HvAuthNbrGroup(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setHvAuthNbr(fillSpace(10));
    } 

	/**
	 *	Returns the value of hvAuthNbr
	 *	@return hvAuthNbr
	 */
   public char[] getHvAuthNbr() throws CFException{
     if (isHvAuthNbrModified()) { 
        hvAuthNbr = refreshHvAuthNbr();
     }
   		return hvAuthNbr;
   }

  
	/**
	*  set variable hvAuthNbr
	*  Corresponding COBOL Variable is HV-AUTH-NBR
	*  @param value
	**/
   public void setHvAuthNbr(char[] value) {
      hvAuthNbr = checkHvAuthNbrConstraints(value);
      serializeHvAuthNbr(hvAuthNbr);
   } 

     /**
	 * 	Update HvAuthNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHvAuthNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHvAuthNbr,hvAuthNbr.length);
   	
   }
   
   public void setHvAuthNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHvAuthNbr,hvAuthNbr.length);
   	
   }
   
     /**
	 * 	Update HvAuthNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvAuthNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvAuthNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HvAuthNbr with another Field
	 *	@param value
	 */
   public void setHvAuthNbr(Field source) {
       replace(source,0,source.length(),beginHvAuthNbr,HV_AUTH_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update HvAuthNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHvAuthNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHvAuthNbr,HV_AUTH_NBR_LEN);
   	
   }
   
     /**
	 * 	Update HvAuthNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvAuthNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvAuthNbr+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHvAuthNbrGroupFieldLength() {
			return HV_AUTH_NBR_GROUP_LENGTH;
		}

}
  
