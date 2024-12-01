package com.cloudframe.app.dto.o529351u;

/**
*  The class DrstRetSupplementalArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;


public class DrstRetSupplementalArea extends DrstRetSupplementalAreaSerialized { 
   
      private List<char[]> drstRetSupplementalEntry; 

	
	/**
	* Constructor for DrstRetSupplementalArea
	**/
    public DrstRetSupplementalArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for DrstRetSupplementalArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DrstRetSupplementalArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

    /**
	 *	Returns the value of drstRetSupplementalEntry
	 *  Corresponding COBOL Variable is DRST-RET-SUPPLEMENTAL-ENTRY
	 *	@return drstRetSupplementalEntry
	 */
	public List<char[]> getDrstRetSupplementalEntry() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < DRST_RET_SUPPLEMENTAL_ENTRY_SIZE;index++) {
        	list.add( getDrstRetSupplementalEntry( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return drstRetSupplementalEntry
	 */
	public char[] getDrstRetSupplementalEntry(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getDrstRetSupplementalEntry(), resetting it to 0",index);
		    index = 0;
        } else if (index >= DRST_RET_SUPPLEMENTAL_ENTRY_SIZE) {
             	index = DRST_RET_SUPPLEMENTAL_ENTRY_SIZE -1; // can't exceed max array size
             	logger.trace("drstRetSupplementalEntry - Array index exceeded max Size {}, resetting it to max allowed",DRST_RET_SUPPLEMENTAL_ENTRY_SIZE); 
	    }
   	      return getCharArray( (beginDrstRetSupplementalEntry + index*DRST_RET_SUPPLEMENTAL_ENTRY_LEN) , DRST_RET_SUPPLEMENTAL_ENTRY_LEN );
    }
    
    
   public int  drstRetSupplementalEntryFieldLength() {
   	return DRST_RET_SUPPLEMENTAL_ENTRY_LEN;
   }
   
	

  
  	/**
	 *	Update DrstRetSupplementalEntry with the passed value at a given index
	 *  Corresponding COBOL Variable is DRST-RET-SUPPLEMENTAL-ENTRY
	 *  @param index
	 *	@param value
	 */
  public void setDrstRetSupplementalEntry(int index,char[] value) {
   	setDrstRetSupplementalEntry(index,value,true);
   }
   
   
   /**
	 *	Update DrstRetSupplementalEntry with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setDrstRetSupplementalEntry(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setDrstRetSupplementalEntry(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 30)  {     
		       value = substring(value,0,30);
           }  else if (value.length < 30) {
		       value = pad(30, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(30).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeDrstRetSupplementalEntry(index,value);		
       }
   }
   

	
	
	

		public static int getDrstRetSupplementalAreaFieldLength() {
			return DRST_RET_SUPPLEMENTAL_AREA_LENGTH;
		}

}
  
