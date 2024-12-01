package com.cloudframe.app.dto.o529351u;

/**
*  The class PpaKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class PpaKey extends PpaKeySerialized { 
   

								private long ppaProvTinSuff;
	
	/**
	* Constructor for PpaKey
	**/
    public PpaKey() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for PpaKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PpaKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	public long getPpaProvTinSuff() throws CFException {
        if (isPpaProvTinSuffModified()) { 
           ppaProvTinSuff = refreshPpaProvTinSuff();
        }
   		return ppaProvTinSuff;
	}
	
	/**
	 * 	Update PpaProvTinSuff with the passed value
	 *  Corresponding COBOL Variable is PPA-PROV-TIN-SUFF
	 *	@param number
	 */
	public void setPpaProvTinSuff(long number) {
			ppaProvTinSuff = checkPpaProvTinSuffMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializePpaProvTinSuff(ppaProvTinSuff);
	}



	
	
	

		public static int getPpaKeyFieldLength() {
			return PPA_KEY_LENGTH;
		}

}
  
