package com.cloudframe.app.file.records.trdpb006;

/**
*  The class ReporderRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-02 at 13:50. using version 5.0.0.161
**/


import com.cloudframe.app.file.records.serialize.trdpb006.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ReporderRecord extends ReporderRecordSerialized { 
   

						private char[] reporderRecordString = Field.fillLowValue(160);
	
	/**
	* Constructor for ReporderRecord
	**/
    public ReporderRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of reporderRecordString
	 *	@return reporderRecordString
	 */
   public char[] getReporderRecordString() throws CFException{
     if (isReporderRecordStringModified()) { 
        reporderRecordString = refreshReporderRecordString();
     }
   		return reporderRecordString;
   }

  
	/**
	*  set variable reporderRecordString
	*  Corresponding COBOL Variable is REPORDER-RECORD-STRING
	*  @param value
	**/
   public void setReporderRecordString(char[] value) {
      reporderRecordString = checkReporderRecordStringConstraints(value);
      serializeReporderRecordString(reporderRecordString);
   } 

     /**
	 * 	Update ReporderRecordString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setReporderRecordString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginReporderRecordString,reporderRecordString.length);
   	
   }
   
   public void setReporderRecordString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginReporderRecordString,reporderRecordString.length);
   	
   }
   
     /**
	 * 	Update ReporderRecordString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setReporderRecordString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginReporderRecordString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ReporderRecordString with another Field
	 *	@param value
	 */
   public void setReporderRecordString(Field source) {
       replace(source,0,source.length(),beginReporderRecordString,REPORDER_RECORD_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update ReporderRecordString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setReporderRecordString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginReporderRecordString,REPORDER_RECORD_STRING_LEN);
   	
   }
   
     /**
	 * 	Update ReporderRecordString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setReporderRecordString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginReporderRecordString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getReporderRecordFieldLength() {
			return REPORDER_RECORD_LENGTH;
		}

}
  
