package com.cloudframe.app.dto.o529351u;

/**
*  The class LsSaveRecord1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class LsSaveRecord1 extends LsSaveRecord1Serialized { 
   
				private SavRecTyp1Fixed savRecTyp1Fixed = new SavRecTyp1Fixed();
	
	/**
	* Constructor for LsSaveRecord1
	**/
    public LsSaveRecord1() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			savRecTyp1Fixed.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of savRecTyp1Fixed
	 *	@return savRecTyp1Fixed
	 */   
	 public SavRecTyp1Fixed getSavRecTyp1Fixed() {
   	return savRecTyp1Fixed;
   }
   /**
	* 	Update SavRecTyp1Fixed with the passed value
	*   Corresponding COBOL Variable is SAV-REC-TYP1-FIXED
	*	@param value
	*/
   public void setSavRecTyp1Fixed(char[] value) {
      savRecTyp1Fixed.setString(value); 
   }   
    
     /**
	 * 	Update SavRecTyp1Fixed 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSavRecTyp1Fixed(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,savRecTyp1Fixed.begin,savRecTyp1Fixed.length());
   }
   
     /**
	 * 	Update SavRecTyp1Fixed 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSavRecTyp1Fixed(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,savRecTyp1Fixed.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update SavRecTyp1Fixed with another Field
	 *	@param value
	 */
   public void setSavRecTyp1Fixed(Field source) {
   	replace(source,0,source.length(),savRecTyp1Fixed.begin,savRecTyp1Fixed.length());
   }  
   
     /**
	 * 	Update SavRecTyp1Fixed 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSavRecTyp1Fixed(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,savRecTyp1Fixed.begin,savRecTyp1Fixed.length());
   }
   
     /**
	 * 	Update SavRecTyp1Fixed 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSavRecTyp1Fixed(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,savRecTyp1Fixed.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getLsSaveRecord1FieldLength() {
			return LS_SAVE_RECORD_1_LENGTH;
		}

}
  
