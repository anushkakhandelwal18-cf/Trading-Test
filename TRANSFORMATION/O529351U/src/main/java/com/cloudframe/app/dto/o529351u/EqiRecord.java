package com.cloudframe.app.dto.o529351u;

/**
*  The class EqiRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class EqiRecord extends EqiRecordSerialized { 
   
				private SceRecord sceRecord = new SceRecord();
	
	/**
	* Constructor for EqiRecord
	**/
    public EqiRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			sceRecord.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sceRecord
	 *	@return sceRecord
	 */   
	 public SceRecord getSceRecord() {
   	return sceRecord;
   }
   /**
	* 	Update SceRecord with the passed value
	*   Corresponding COBOL Variable is SCE-RECORD
	*	@param value
	*/
   public void setSceRecord(char[] value) {
      sceRecord.setString(value); 
   }   
    
     /**
	 * 	Update SceRecord 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSceRecord(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sceRecord.begin,sceRecord.length());
   }
   
     /**
	 * 	Update SceRecord 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSceRecord(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sceRecord.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update SceRecord with another Field
	 *	@param value
	 */
   public void setSceRecord(Field source) {
   	replace(source,0,source.length(),sceRecord.begin,sceRecord.length());
   }  
   
     /**
	 * 	Update SceRecord 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSceRecord(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sceRecord.begin,sceRecord.length());
   }
   
     /**
	 * 	Update SceRecord 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSceRecord(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sceRecord.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getEqiRecordFieldLength() {
			return EQI_RECORD_LENGTH;
		}

}
  
