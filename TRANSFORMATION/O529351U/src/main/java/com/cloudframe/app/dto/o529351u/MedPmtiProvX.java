package com.cloudframe.app.dto.o529351u;

/**
*  The class MedPmtiProvX is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MedPmtiProvX extends MedPmtiProvXSerialized { 
   

								private long medPmtiProvSuf;
	
	/**
	* Constructor for MedPmtiProvX
	**/
    public MedPmtiProvX() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MedPmtiProvX. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MedPmtiProvX(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of medPmtiProvSuf
	 *	@return medPmtiProvSuf
	 */
	public long getMedPmtiProvSuf() throws CFException {
       if (isMedPmtiProvSufModified()) { 
           medPmtiProvSuf = refreshMedPmtiProvSuf();
        }
   		return medPmtiProvSuf;
	}
	

	
	   
	/**
	 * 	Update MedPmtiProvSuf with the passed value
	 *  Corresponding COBOL Variable is MED-PMTI-PROV-SUF
	 *	@param number
	 */
	public void setMedPmtiProvSuf(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    medPmtiProvSuf = checkMedPmtiProvSufMaxLimit(number); 
		serializeMedPmtiProvSuf(medPmtiProvSuf);
	}
	

	/**
	 * 	Update MedPmtiProvSuf with the passed value
	 *	@param value (String or char[])
	 */
	public void setMedPmtiProvSuf(char[] value) throws CFException {
		 medPmtiProvSuf = serializeMedPmtiProvSuf(value);
	}
	/**
	 * 	Update MedPmtiProvSuf with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMedPmtiProvSufString(char[] value) throws CFException {
		 setMedPmtiProvSuf(value);
	}

	
	
	

		public static int getMedPmtiProvXFieldLength() {
			return MED_PMTI_PROV_X_LENGTH;
		}

}
  
