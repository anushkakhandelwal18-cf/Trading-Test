package com.cloudframe.app.dto.o529351u;

/**
*  The class LsSaveRecord3 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class LsSaveRecord3 extends LsSaveRecord3Serialized { 
   
				private SavRecTyp3Fileaid savRecTyp3Fileaid = new SavRecTyp3Fileaid();
	
	/**
	* Constructor for LsSaveRecord3
	**/
    public LsSaveRecord3() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			savRecTyp3Fileaid.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of savRecTyp3Fileaid
	 *	@return savRecTyp3Fileaid
	 */   
	 public SavRecTyp3Fileaid getSavRecTyp3Fileaid() {
   	return savRecTyp3Fileaid;
   }
   /**
	* 	Update SavRecTyp3Fileaid with the passed value
	*   Corresponding COBOL Variable is SAV-REC-TYP3-FILEAID
	*	@param value
	*/
   public void setSavRecTyp3Fileaid(char[] value) {
      savRecTyp3Fileaid.setString(value); 
   }   
    
     /**
	 * 	Update SavRecTyp3Fileaid 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSavRecTyp3Fileaid(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,savRecTyp3Fileaid.begin,savRecTyp3Fileaid.length());
   }
   
     /**
	 * 	Update SavRecTyp3Fileaid 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSavRecTyp3Fileaid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,savRecTyp3Fileaid.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update SavRecTyp3Fileaid with another Field
	 *	@param value
	 */
   public void setSavRecTyp3Fileaid(Field source) {
   	replace(source,0,source.length(),savRecTyp3Fileaid.begin,savRecTyp3Fileaid.length());
   }  
   
     /**
	 * 	Update SavRecTyp3Fileaid 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSavRecTyp3Fileaid(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,savRecTyp3Fileaid.begin,savRecTyp3Fileaid.length());
   }
   
     /**
	 * 	Update SavRecTyp3Fileaid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSavRecTyp3Fileaid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,savRecTyp3Fileaid.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getLsSaveRecord3FieldLength() {
			return LS_SAVE_RECORD_3_LENGTH;
		}

}
  
