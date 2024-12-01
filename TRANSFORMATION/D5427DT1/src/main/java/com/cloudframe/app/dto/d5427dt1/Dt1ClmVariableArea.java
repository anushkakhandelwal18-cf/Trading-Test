package com.cloudframe.app.dto.d5427dt1;

/**
*  The class Dt1ClmVariableArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class Dt1ClmVariableArea extends Dt1ClmVariableAreaSerialized { 
   
			private List<Dt1ClmClaimItem> dt1ClmClaimItem = new ArrayList<>();
    	
	
	/**
	* Constructor for Dt1ClmVariableArea
	**/
    public Dt1ClmVariableArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Dt1ClmVariableArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dt1ClmVariableArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of dt1ClmClaimItem
	 *  Corresponding COBOL Variable is DT1-CLM-CLAIM-ITEM
	 *	@return dt1ClmClaimItem
	 */
   public List<Dt1ClmClaimItem> getDt1ClmClaimItem() {
       return dt1ClmClaimItem;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return dt1ClmClaimItem
	 */
	public Dt1ClmClaimItem getDt1ClmClaimItem(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getDt1ClmClaimItem(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= DT_1_CLM_CLAIM_ITEM_SIZE) {
             	index = DT_1_CLM_CLAIM_ITEM_SIZE -1; // can't exceed max array size
             	logger.trace("dt1ClmClaimItem - Array index exceeded max Size {}, resetting it to max allowed",DT_1_CLM_CLAIM_ITEM_SIZE); 
	    }
		if (index >= dt1ClmClaimItem.size()) {
       		for (int fillIndex =  dt1ClmClaimItem.size() -1; fillIndex < index;fillIndex++) {
		       dt1ClmClaimItem.add(null);
		    }
			dt1ClmClaimItem.set(index,
			   	   	new Dt1ClmClaimItem(this,beginDt1ClmClaimItem + index * Dt1ClmClaimItem.getDt1ClmClaimItemFieldLength()) 
				                        ); 	
		} 
   	   Dt1ClmClaimItem value = dt1ClmClaimItem.get(index);
   	   if (value == null) {
   	      dt1ClmClaimItem.set(index,
			   	   	new Dt1ClmClaimItem(this,beginDt1ClmClaimItem + index * Dt1ClmClaimItem.getDt1ClmClaimItemFieldLength()) 
				                        ); 
		  value = dt1ClmClaimItem.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Dt1ClmClaimItem at index with the passed value
	 *  Corresponding COBOL Variable is DT1-CLM-CLAIM-ITEM
	 *  @param index
	 *	@param value
	 */
  public void setDt1ClmClaimItem(int index,char[] value) {
   	getDt1ClmClaimItem(index).setString(value);
   }
   
	

	
	
	

		public static int getDt1ClmVariableAreaFieldLength() {
			return DT_1_CLM_VARIABLE_AREA_LENGTH;
		}

}
  
