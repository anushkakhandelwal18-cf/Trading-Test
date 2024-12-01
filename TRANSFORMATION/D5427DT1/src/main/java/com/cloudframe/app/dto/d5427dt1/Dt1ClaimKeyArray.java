package com.cloudframe.app.dto.d5427dt1;

/**
*  The class Dt1ClaimKeyArray is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class Dt1ClaimKeyArray extends Dt1ClaimKeyArraySerialized { 
   
			private List<Dt1ClaimKeyEntry> dt1ClaimKeyEntry = new ArrayList<>();
    	
	
	/**
	* Constructor for Dt1ClaimKeyArray
	**/
    public Dt1ClaimKeyArray() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Dt1ClaimKeyArray. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dt1ClaimKeyArray(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of dt1ClaimKeyEntry
	 *  Corresponding COBOL Variable is DT1-CLAIM-KEY-ENTRY
	 *	@return dt1ClaimKeyEntry
	 */
   public List<Dt1ClaimKeyEntry> getDt1ClaimKeyEntry() {
       return dt1ClaimKeyEntry;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return dt1ClaimKeyEntry
	 */
	public Dt1ClaimKeyEntry getDt1ClaimKeyEntry(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getDt1ClaimKeyEntry(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= DT_1_CLAIM_KEY_ENTRY_SIZE) {
             	index = DT_1_CLAIM_KEY_ENTRY_SIZE -1; // can't exceed max array size
             	logger.trace("dt1ClaimKeyEntry - Array index exceeded max Size {}, resetting it to max allowed",DT_1_CLAIM_KEY_ENTRY_SIZE); 
	    }
		if (index >= dt1ClaimKeyEntry.size()) {
       		for (int fillIndex =  dt1ClaimKeyEntry.size() -1; fillIndex < index;fillIndex++) {
		       dt1ClaimKeyEntry.add(null);
		    }
			dt1ClaimKeyEntry.set(index,
			   	   	new Dt1ClaimKeyEntry(this,beginDt1ClaimKeyEntry + index * Dt1ClaimKeyEntry.getDt1ClaimKeyEntryFieldLength()) 
				                        ); 	
		} 
   	   Dt1ClaimKeyEntry value = dt1ClaimKeyEntry.get(index);
   	   if (value == null) {
   	      dt1ClaimKeyEntry.set(index,
			   	   	new Dt1ClaimKeyEntry(this,beginDt1ClaimKeyEntry + index * Dt1ClaimKeyEntry.getDt1ClaimKeyEntryFieldLength()) 
				                        ); 
		  value = dt1ClaimKeyEntry.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Dt1ClaimKeyEntry at index with the passed value
	 *  Corresponding COBOL Variable is DT1-CLAIM-KEY-ENTRY
	 *  @param index
	 *	@param value
	 */
  public void setDt1ClaimKeyEntry(int index,char[] value) {
   	getDt1ClaimKeyEntry(index).setString(value);
   }
   
	

	
	
	

		public static int getDt1ClaimKeyArrayFieldLength() {
			return DT_1_CLAIM_KEY_ARRAY_LENGTH;
		}

}
  
