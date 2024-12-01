package com.cloudframe.app.dto.o529351u;

/**
*  The class SavRecTyp3Fileaid is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SavRecTyp3Fileaid extends SavRecTyp3FileaidSerialized { 
   
				private SavMcdsVariable savMcdsVariable = new SavMcdsVariable();
	
	/**
	* Constructor for SavRecTyp3Fileaid
	**/
    public SavRecTyp3Fileaid() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SavRecTyp3Fileaid. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SavRecTyp3Fileaid(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			savMcdsVariable.setParent(this,getStartOffset() + 85);
    } 

	/**
	 *	Returns the value of savMcdsVariable
	 *	@return savMcdsVariable
	 */   
	 public SavMcdsVariable getSavMcdsVariable() {
   	return savMcdsVariable;
   }
   /**
	* 	Update SavMcdsVariable with the passed value
	*   Corresponding COBOL Variable is SAV-MCDS-VARIABLE
	*	@param value
	*/
   public void setSavMcdsVariable(char[] value) {
      savMcdsVariable.setString(value); 
   }   
    
     /**
	 * 	Update SavMcdsVariable 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSavMcdsVariable(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,savMcdsVariable.begin,savMcdsVariable.length());
   }
   
     /**
	 * 	Update SavMcdsVariable 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSavMcdsVariable(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,savMcdsVariable.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update SavMcdsVariable with another Field
	 *	@param value
	 */
   public void setSavMcdsVariable(Field source) {
   	replace(source,0,source.length(),savMcdsVariable.begin,savMcdsVariable.length());
   }  
   
     /**
	 * 	Update SavMcdsVariable 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSavMcdsVariable(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,savMcdsVariable.begin,savMcdsVariable.length());
   }
   
     /**
	 * 	Update SavMcdsVariable 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSavMcdsVariable(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,savMcdsVariable.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getSavRecTyp3FileaidFieldLength() {
			return SAV_REC_TYP_3_FILEAID_LENGTH;
		}

}
  
