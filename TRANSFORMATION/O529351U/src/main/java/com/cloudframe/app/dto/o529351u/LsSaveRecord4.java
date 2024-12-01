package com.cloudframe.app.dto.o529351u;

/**
*  The class LsSaveRecord4 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class LsSaveRecord4 extends LsSaveRecord4Serialized { 
   
				private SavRecTyp4Fileaid savRecTyp4Fileaid = new SavRecTyp4Fileaid();
	
	/**
	* Constructor for LsSaveRecord4
	**/
    public LsSaveRecord4() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			savRecTyp4Fileaid.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of savRecTyp4Fileaid
	 *	@return savRecTyp4Fileaid
	 */   
	 public SavRecTyp4Fileaid getSavRecTyp4Fileaid() {
   	return savRecTyp4Fileaid;
   }
   /**
	* 	Update SavRecTyp4Fileaid with the passed value
	*   Corresponding COBOL Variable is SAV-REC-TYP4-FILEAID
	*	@param value
	*/
   public void setSavRecTyp4Fileaid(char[] value) {
      savRecTyp4Fileaid.setString(value); 
   }   
    
     /**
	 * 	Update SavRecTyp4Fileaid 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSavRecTyp4Fileaid(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,savRecTyp4Fileaid.begin,savRecTyp4Fileaid.length());
   }
   
     /**
	 * 	Update SavRecTyp4Fileaid 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSavRecTyp4Fileaid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,savRecTyp4Fileaid.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update SavRecTyp4Fileaid with another Field
	 *	@param value
	 */
   public void setSavRecTyp4Fileaid(Field source) {
   	replace(source,0,source.length(),savRecTyp4Fileaid.begin,savRecTyp4Fileaid.length());
   }  
   
     /**
	 * 	Update SavRecTyp4Fileaid 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSavRecTyp4Fileaid(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,savRecTyp4Fileaid.begin,savRecTyp4Fileaid.length());
   }
   
     /**
	 * 	Update SavRecTyp4Fileaid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSavRecTyp4Fileaid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,savRecTyp4Fileaid.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getLsSaveRecord4FieldLength() {
			return LS_SAVE_RECORD_4_LENGTH;
		}

}
  
