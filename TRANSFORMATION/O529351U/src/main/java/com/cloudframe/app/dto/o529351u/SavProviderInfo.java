package com.cloudframe.app.dto.o529351u;

/**
*  The class SavProviderInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SavProviderInfo extends SavProviderInfoSerialized { 
   

						private char[] savHAttendingPhysicianId = Field.fillLowValue(30);
				private SavMAttendingPhysicianId savMAttendingPhysicianId = new SavMAttendingPhysicianId();
	
	/**
	* Constructor for SavProviderInfo
	**/
    public SavProviderInfo() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SavProviderInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SavProviderInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			savMAttendingPhysicianId.setParent(this,getStartOffset() + 30);
    } 

	/**
	 *	Returns the value of savHAttendingPhysicianId
	 *	@return savHAttendingPhysicianId
	 */
   public char[] getSavHAttendingPhysicianId() throws CFException{
     if (isSavHAttendingPhysicianIdModified()) { 
        savHAttendingPhysicianId = refreshSavHAttendingPhysicianId();
     }
   		return savHAttendingPhysicianId;
   }

  
	/**
	*  set variable savHAttendingPhysicianId
	*  Corresponding COBOL Variable is SAV-H-ATTENDING-PHYSICIAN-ID
	*  @param value
	**/
   public void setSavHAttendingPhysicianId(char[] value) {
      savHAttendingPhysicianId = checkSavHAttendingPhysicianIdConstraints(value);
      serializeSavHAttendingPhysicianId(savHAttendingPhysicianId);
   } 

     /**
	 * 	Update SavHAttendingPhysicianId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSavHAttendingPhysicianId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSavHAttendingPhysicianId,savHAttendingPhysicianId.length);
   	
   }
   
   public void setSavHAttendingPhysicianId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSavHAttendingPhysicianId,savHAttendingPhysicianId.length);
   	
   }
   
     /**
	 * 	Update SavHAttendingPhysicianId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSavHAttendingPhysicianId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSavHAttendingPhysicianId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SavHAttendingPhysicianId with another Field
	 *	@param value
	 */
   public void setSavHAttendingPhysicianId(Field source) {
       replace(source,0,source.length(),beginSavHAttendingPhysicianId,SAV_HATTENDING_PHYSICIAN_ID_LEN);
   	
   }  
   
     /**
	 * 	Update SavHAttendingPhysicianId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSavHAttendingPhysicianId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSavHAttendingPhysicianId,SAV_HATTENDING_PHYSICIAN_ID_LEN);
   	
   }
   
     /**
	 * 	Update SavHAttendingPhysicianId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSavHAttendingPhysicianId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSavHAttendingPhysicianId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of savMAttendingPhysicianId
	 *	@return savMAttendingPhysicianId
	 */   
	 public SavMAttendingPhysicianId getSavMAttendingPhysicianId() {
   	return savMAttendingPhysicianId;
   }
   /**
	* 	Update SavMAttendingPhysicianId with the passed value
	*   Corresponding COBOL Variable is SAV-M-ATTENDING-PHYSICIAN-ID
	*	@param value
	*/
   public void setSavMAttendingPhysicianId(char[] value) {
      savMAttendingPhysicianId.setString(value); 
   }   
    
     /**
	 * 	Update SavMAttendingPhysicianId 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSavMAttendingPhysicianId(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,savMAttendingPhysicianId.begin,savMAttendingPhysicianId.length());
   }
   
     /**
	 * 	Update SavMAttendingPhysicianId 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSavMAttendingPhysicianId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,savMAttendingPhysicianId.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update SavMAttendingPhysicianId with another Field
	 *	@param value
	 */
   public void setSavMAttendingPhysicianId(Field source) {
   	replace(source,0,source.length(),savMAttendingPhysicianId.begin,savMAttendingPhysicianId.length());
   }  
   
     /**
	 * 	Update SavMAttendingPhysicianId 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSavMAttendingPhysicianId(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,savMAttendingPhysicianId.begin,savMAttendingPhysicianId.length());
   }
   
     /**
	 * 	Update SavMAttendingPhysicianId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSavMAttendingPhysicianId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,savMAttendingPhysicianId.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getSavProviderInfoFieldLength() {
			return SAV_PROVIDER_INFO_LENGTH;
		}

}
  
