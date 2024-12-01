package com.cloudframe.app.dto.o529351u;

/**
*  The class HdPmtiProvX is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HdPmtiProvX extends HdPmtiProvXSerialized { 
   

								private long hdPmtiProvSuf;
	
	/**
	* Constructor for HdPmtiProvX
	**/
    public HdPmtiProvX() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for HdPmtiProvX. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HdPmtiProvX(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of hdPmtiProvSuf
	 *	@return hdPmtiProvSuf
	 */
	public long getHdPmtiProvSuf() throws CFException {
       if (isHdPmtiProvSufModified()) { 
           hdPmtiProvSuf = refreshHdPmtiProvSuf();
        }
   		return hdPmtiProvSuf;
	}
	

	
	   
	/**
	 * 	Update HdPmtiProvSuf with the passed value
	 *  Corresponding COBOL Variable is HD-PMTI-PROV-SUF
	 *	@param number
	 */
	public void setHdPmtiProvSuf(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    hdPmtiProvSuf = checkHdPmtiProvSufMaxLimit(number); 
		serializeHdPmtiProvSuf(hdPmtiProvSuf);
	}
	

	/**
	 * 	Update HdPmtiProvSuf with the passed value
	 *	@param value (String or char[])
	 */
	public void setHdPmtiProvSuf(char[] value) throws CFException {
		 hdPmtiProvSuf = serializeHdPmtiProvSuf(value);
	}
	/**
	 * 	Update HdPmtiProvSuf with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setHdPmtiProvSufString(char[] value) throws CFException {
		 setHdPmtiProvSuf(value);
	}

	
	
	

		public static int getHdPmtiProvXFieldLength() {
			return HD_PMTI_PROV_X_LENGTH;
		}

}
  
