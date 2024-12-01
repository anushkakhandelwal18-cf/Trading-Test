package com.cloudframe.app.dto.d5427dt1;

/**
*  The class Dt1SrtArray is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class Dt1SrtArray extends Dt1SrtArraySerialized { 
   
			private List<Dt1SrtItem> dt1SrtItem = new ArrayList<>();
    	
	
	/**
	* Constructor for Dt1SrtArray
	**/
    public Dt1SrtArray() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Dt1SrtArray. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dt1SrtArray(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of dt1SrtItem
	 *  Corresponding COBOL Variable is DT1-SRT-ITEM
	 *	@return dt1SrtItem
	 */
   public List<Dt1SrtItem> getDt1SrtItem() {
       return dt1SrtItem;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return dt1SrtItem
	 */
	public Dt1SrtItem getDt1SrtItem(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getDt1SrtItem(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= DT_1_SRT_ITEM_SIZE) {
             	index = DT_1_SRT_ITEM_SIZE -1; // can't exceed max array size
             	logger.trace("dt1SrtItem - Array index exceeded max Size {}, resetting it to max allowed",DT_1_SRT_ITEM_SIZE); 
	    }
		if (index >= dt1SrtItem.size()) {
       		for (int fillIndex =  dt1SrtItem.size() -1; fillIndex < index;fillIndex++) {
		       dt1SrtItem.add(null);
		    }
			dt1SrtItem.set(index,
			   	   	new Dt1SrtItem(this,beginDt1SrtItem + index * Dt1SrtItem.getDt1SrtItemFieldLength()) 
				                        ); 	
		} 
   	   Dt1SrtItem value = dt1SrtItem.get(index);
   	   if (value == null) {
   	      dt1SrtItem.set(index,
			   	   	new Dt1SrtItem(this,beginDt1SrtItem + index * Dt1SrtItem.getDt1SrtItemFieldLength()) 
				                        ); 
		  value = dt1SrtItem.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Dt1SrtItem at index with the passed value
	 *  Corresponding COBOL Variable is DT1-SRT-ITEM
	 *  @param index
	 *	@param value
	 */
  public void setDt1SrtItem(int index,char[] value) {
   	getDt1SrtItem(index).setString(value);
   }
   
	

	
	
	

		public static int getDt1SrtArrayFieldLength() {
			return DT_1_SRT_ARRAY_LENGTH;
		}

}
  
