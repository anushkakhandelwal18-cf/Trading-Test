package com.cloudframe.app.dto.o529351u;

/**
*  The class SavRecTyp4Fileaid is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SavRecTyp4Fileaid extends SavRecTyp4FileaidSerialized { 
   
				private SaveRecType4Fixed saveRecType4Fixed = new SaveRecType4Fixed();
	
	/**
	* Constructor for SavRecTyp4Fileaid
	**/
    public SavRecTyp4Fileaid() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SavRecTyp4Fileaid. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SavRecTyp4Fileaid(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			saveRecType4Fixed.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of saveRecType4Fixed
	 *	@return saveRecType4Fixed
	 */   
	 public SaveRecType4Fixed getSaveRecType4Fixed() {
   	return saveRecType4Fixed;
   }
   /**
	* 	Update SaveRecType4Fixed with the passed value
	*   Corresponding COBOL Variable is SAVE-REC-TYPE4-FIXED
	*	@param value
	*/
   public void setSaveRecType4Fixed(char[] value) {
      saveRecType4Fixed.setString(value); 
   }   
    
     /**
	 * 	Update SaveRecType4Fixed 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSaveRecType4Fixed(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,saveRecType4Fixed.begin,saveRecType4Fixed.length());
   }
   
     /**
	 * 	Update SaveRecType4Fixed 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSaveRecType4Fixed(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,saveRecType4Fixed.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update SaveRecType4Fixed with another Field
	 *	@param value
	 */
   public void setSaveRecType4Fixed(Field source) {
   	replace(source,0,source.length(),saveRecType4Fixed.begin,saveRecType4Fixed.length());
   }  
   
     /**
	 * 	Update SaveRecType4Fixed 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSaveRecType4Fixed(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,saveRecType4Fixed.begin,saveRecType4Fixed.length());
   }
   
     /**
	 * 	Update SaveRecType4Fixed 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSaveRecType4Fixed(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,saveRecType4Fixed.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getSavRecTyp4FileaidFieldLength() {
			return SAV_REC_TYP_4_FILEAID_LENGTH;
		}

}
  
