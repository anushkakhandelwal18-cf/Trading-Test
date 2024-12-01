package com.cloudframe.app.dto.o529351u;

/**
*  The class SavMAttendingPhysicianId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SavMAttendingPhysicianId extends SavMAttendingPhysicianIdSerialized { 
   

						private char[] savDrNmFst = Field.fillLowValue(10);
	
	/**
	* Constructor for SavMAttendingPhysicianId
	**/
    public SavMAttendingPhysicianId() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SavMAttendingPhysicianId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SavMAttendingPhysicianId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of savDrNmFst
	 *	@return savDrNmFst
	 */
   public char[] getSavDrNmFst() throws CFException{
     if (isSavDrNmFstModified()) { 
        savDrNmFst = refreshSavDrNmFst();
     }
   		return savDrNmFst;
   }

  
	/**
	*  set variable savDrNmFst
	*  Corresponding COBOL Variable is SAV-DR-NM-FST
	*  @param value
	**/
   public void setSavDrNmFst(char[] value) {
      savDrNmFst = checkSavDrNmFstConstraints(value);
      serializeSavDrNmFst(savDrNmFst);
   } 

     /**
	 * 	Update SavDrNmFst 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSavDrNmFst(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSavDrNmFst,savDrNmFst.length);
   	
   }
   
   public void setSavDrNmFst(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSavDrNmFst,savDrNmFst.length);
   	
   }
   
     /**
	 * 	Update SavDrNmFst 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSavDrNmFst(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSavDrNmFst+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SavDrNmFst with another Field
	 *	@param value
	 */
   public void setSavDrNmFst(Field source) {
       replace(source,0,source.length(),beginSavDrNmFst,SAV_DR_NM_FST_LEN);
   	
   }  
   
     /**
	 * 	Update SavDrNmFst 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSavDrNmFst(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSavDrNmFst,SAV_DR_NM_FST_LEN);
   	
   }
   
     /**
	 * 	Update SavDrNmFst 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSavDrNmFst(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSavDrNmFst+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSavMAttendingPhysicianIdFieldLength() {
			return SAV_MATTENDING_PHYSICIAN_ID_LENGTH;
		}

}
  
