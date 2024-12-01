package com.cloudframe.app.dto.o529351u;

/**
*  The class GenTransSpiTableR is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class GenTransSpiTableR extends GenTransSpiTableRSerialized { 
   
			private List<TableItem> tableItem = new ArrayList<>();
    	
	
	/**
	* Constructor for GenTransSpiTableR
	**/
    public GenTransSpiTableR() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for GenTransSpiTableR. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public GenTransSpiTableR(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of tableItem
	 *  Corresponding COBOL Variable is TABLE-ITEM
	 *	@return tableItem
	 */
   public List<TableItem> getTableItem() {
       return tableItem;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return tableItem
	 */
	public TableItem getTableItem(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getTableItem(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= TABLE_ITEM_SIZE) {
             	index = TABLE_ITEM_SIZE -1; // can't exceed max array size
             	logger.trace("tableItem - Array index exceeded max Size {}, resetting it to max allowed",TABLE_ITEM_SIZE); 
	    }
		if (index >= tableItem.size()) {
       		for (int fillIndex =  tableItem.size() -1; fillIndex < index;fillIndex++) {
		       tableItem.add(null);
		    }
			tableItem.set(index,
			   	   	new TableItem(this,beginTableItem + index * TableItem.getTableItemFieldLength()) 
				                        ); 	
		} 
   	   TableItem value = tableItem.get(index);
   	   if (value == null) {
   	      tableItem.set(index,
			   	   	new TableItem(this,beginTableItem + index * TableItem.getTableItemFieldLength()) 
				                        ); 
		  value = tableItem.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update TableItem at index with the passed value
	 *  Corresponding COBOL Variable is TABLE-ITEM
	 *  @param index
	 *	@param value
	 */
  public void setTableItem(int index,char[] value) {
   	getTableItem(index).setString(value);
   }
   
	

	
	
	

		public static int getGenTransSpiTableRFieldLength() {
			return GEN_TRANS_SPI_TABLE_R_LENGTH;
		}

}
  
