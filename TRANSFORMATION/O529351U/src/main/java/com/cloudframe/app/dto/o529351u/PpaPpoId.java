package com.cloudframe.app.dto.o529351u;

/**
*  The class PpaPpoId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class PpaPpoId extends PpaPpoIdSerialized { 
   
				private PpaOccurrence ppaOccurrence = new PpaOccurrence();
	
	/**
	* Constructor for PpaPpoId
	**/
    public PpaPpoId() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for PpaPpoId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PpaPpoId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ppaOccurrence.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of ppaOccurrence
	 *	@return ppaOccurrence
	 */   
	 public PpaOccurrence getPpaOccurrence() {
   	return ppaOccurrence;
   }
   /**
	* 	Update PpaOccurrence with the passed value
	*   Corresponding COBOL Variable is PPA-OCCURRENCE
	*	@param value
	*/
   public void setPpaOccurrence(char[] value) {
      ppaOccurrence.setString(value); 
   }   
    
     /**
	 * 	Update PpaOccurrence 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setPpaOccurrence(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ppaOccurrence.begin,ppaOccurrence.length());
   }
   
     /**
	 * 	Update PpaOccurrence 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPpaOccurrence(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ppaOccurrence.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update PpaOccurrence with another Field
	 *	@param value
	 */
   public void setPpaOccurrence(Field source) {
   	replace(source,0,source.length(),ppaOccurrence.begin,ppaOccurrence.length());
   }  
   
     /**
	 * 	Update PpaOccurrence 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setPpaOccurrence(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ppaOccurrence.begin,ppaOccurrence.length());
   }
   
     /**
	 * 	Update PpaOccurrence 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPpaOccurrence(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ppaOccurrence.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getPpaPpoIdFieldLength() {
			return PPA_PPO_ID_LENGTH;
		}

}
  
