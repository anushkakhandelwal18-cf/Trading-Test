package com.cloudframe.app.dto.d5427dt1;

/**
*  The class Dt1ClaimKeyEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Dt1ClaimKeyEntry extends Dt1ClaimKeyEntrySerialized { 
   

						private char[] dt1ClaimKey = Field.fillLowValue(51);
	
	/**
	* Constructor for Dt1ClaimKeyEntry
	**/
    public Dt1ClaimKeyEntry() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Dt1ClaimKeyEntry. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dt1ClaimKeyEntry(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of dt1ClaimKey
	 *	@return dt1ClaimKey
	 */
   public char[] getDt1ClaimKey() throws CFException{
     if (isDt1ClaimKeyModified()) { 
        dt1ClaimKey = refreshDt1ClaimKey();
     }
   		return dt1ClaimKey;
   }

  
	/**
	*  set variable dt1ClaimKey
	*  Corresponding COBOL Variable is DT1-CLAIM-KEY
	*  @param value
	**/
   public void setDt1ClaimKey(char[] value) {
      dt1ClaimKey = checkDt1ClaimKeyConstraints(value);
      serializeDt1ClaimKey(dt1ClaimKey);
   } 

     /**
	 * 	Update Dt1ClaimKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt1ClaimKey(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt1ClaimKey,dt1ClaimKey.length);
   	
   }
   
   public void setDt1ClaimKey(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClaimKey,dt1ClaimKey.length);
   	
   }
   
     /**
	 * 	Update Dt1ClaimKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClaimKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClaimKey+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt1ClaimKey with another Field
	 *	@param value
	 */
   public void setDt1ClaimKey(Field source) {
       replace(source,0,source.length(),beginDt1ClaimKey,DT_1_CLAIM_KEY_LEN);
   	
   }  
   
     /**
	 * 	Update Dt1ClaimKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt1ClaimKey(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt1ClaimKey,DT_1_CLAIM_KEY_LEN);
   	
   }
   
     /**
	 * 	Update Dt1ClaimKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1ClaimKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt1ClaimKey+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDt1ClaimKeyEntryFieldLength() {
			return DT_1_CLAIM_KEY_ENTRY_LENGTH;
		}

}
  
