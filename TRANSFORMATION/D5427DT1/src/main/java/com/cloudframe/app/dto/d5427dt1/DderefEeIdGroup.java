package com.cloudframe.app.dto.d5427dt1;

/**
*  The class DderefEeIdGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DderefEeIdGroup extends DderefEeIdGroupSerialized { 
   

						private char[] dderefEeId = Field.fillLowValue(10);
	
	/**
	* Constructor for DderefEeIdGroup
	**/
    public DderefEeIdGroup() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for DderefEeIdGroup. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DderefEeIdGroup(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of dderefEeId
	 *	@return dderefEeId
	 */
   public char[] getDderefEeId() throws CFException{
     if (isDderefEeIdModified()) { 
        dderefEeId = refreshDderefEeId();
     }
   		return dderefEeId;
   }

  
	/**
	*  set variable dderefEeId
	*  Corresponding COBOL Variable is DDEREF-EE-ID
	*  @param value
	**/
   public void setDderefEeId(char[] value) {
      dderefEeId = checkDderefEeIdConstraints(value);
      serializeDderefEeId(dderefEeId);
   } 

     /**
	 * 	Update DderefEeId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDderefEeId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDderefEeId,dderefEeId.length);
   	
   }
   
   public void setDderefEeId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDderefEeId,dderefEeId.length);
   	
   }
   
     /**
	 * 	Update DderefEeId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDderefEeId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDderefEeId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DderefEeId with another Field
	 *	@param value
	 */
   public void setDderefEeId(Field source) {
       replace(source,0,source.length(),beginDderefEeId,DDEREF_EE_ID_LEN);
   	
   }  
   
     /**
	 * 	Update DderefEeId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDderefEeId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDderefEeId,DDEREF_EE_ID_LEN);
   	
   }
   
     /**
	 * 	Update DderefEeId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDderefEeId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDderefEeId+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDderefEeIdGroupFieldLength() {
			return DDEREF_EE_ID_GROUP_LENGTH;
		}

}
  
