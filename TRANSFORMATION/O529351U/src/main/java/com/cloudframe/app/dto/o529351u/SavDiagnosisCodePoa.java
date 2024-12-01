package com.cloudframe.app.dto.o529351u;

/**
*  The class SavDiagnosisCodePoa is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;


public class SavDiagnosisCodePoa extends SavDiagnosisCodePoaSerialized { 
   
      private List<char[]> savDiagnosisCode; 

	
	/**
	* Constructor for SavDiagnosisCodePoa
	**/
    public SavDiagnosisCodePoa() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SavDiagnosisCodePoa. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SavDiagnosisCodePoa(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

    /**
	 *	Returns the value of savDiagnosisCode
	 *  Corresponding COBOL Variable is SAV-DIAGNOSIS-CODE
	 *	@return savDiagnosisCode
	 */
	public List<char[]> getSavDiagnosisCode() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < SAV_DIAGNOSIS_CODE_SIZE;index++) {
        	list.add( getSavDiagnosisCode( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return savDiagnosisCode
	 */
	public char[] getSavDiagnosisCode(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getSavDiagnosisCode(), resetting it to 0",index);
		    index = 0;
        } else if (index >= SAV_DIAGNOSIS_CODE_SIZE) {
             	index = SAV_DIAGNOSIS_CODE_SIZE -1; // can't exceed max array size
             	logger.trace("savDiagnosisCode - Array index exceeded max Size {}, resetting it to max allowed",SAV_DIAGNOSIS_CODE_SIZE); 
	    }
   	      return getCharArray( (beginSavDiagnosisCode + index*SAV_DIAGNOSIS_CODE_LEN) , SAV_DIAGNOSIS_CODE_LEN );
    }
    
    
   public int  savDiagnosisCodeFieldLength() {
   	return SAV_DIAGNOSIS_CODE_LEN;
   }
   
	

  
  	/**
	 *	Update SavDiagnosisCode with the passed value at a given index
	 *  Corresponding COBOL Variable is SAV-DIAGNOSIS-CODE
	 *  @param index
	 *	@param value
	 */
  public void setSavDiagnosisCode(int index,char[] value) {
   	setSavDiagnosisCode(index,value,true);
   }
   
   
   /**
	 *	Update SavDiagnosisCode with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setSavDiagnosisCode(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setSavDiagnosisCode(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 6)  {     
		       value = substring(value,0,6);
           }  else if (value.length < 6) {
		       value = pad(6, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(6).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeSavDiagnosisCode(index,value);		
       }
   }
   

	
	
	

		public static int getSavDiagnosisCodePoaFieldLength() {
			return SAV_DIAGNOSIS_CODE_POA_LENGTH;
		}

}
  
