package com.cloudframe.app.dto.o529351u;

/**
*  The class NewTransSpiTableR is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class NewTransSpiTableR extends NewTransSpiTableRSerialized { 
   
			private List<TabItem> tabItem = new ArrayList<>();
    	
	
	/**
	* Constructor for NewTransSpiTableR
	**/
    public NewTransSpiTableR() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for NewTransSpiTableR. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public NewTransSpiTableR(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of tabItem
	 *  Corresponding COBOL Variable is TAB-ITEM
	 *	@return tabItem
	 */
   public List<TabItem> getTabItem() {
       return tabItem;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return tabItem
	 */
	public TabItem getTabItem(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getTabItem(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= TAB_ITEM_SIZE) {
             	index = TAB_ITEM_SIZE -1; // can't exceed max array size
             	logger.trace("tabItem - Array index exceeded max Size {}, resetting it to max allowed",TAB_ITEM_SIZE); 
	    }
		if (index >= tabItem.size()) {
       		for (int fillIndex =  tabItem.size() -1; fillIndex < index;fillIndex++) {
		       tabItem.add(null);
		    }
			tabItem.set(index,
			   	   	new TabItem(this,beginTabItem + index * TabItem.getTabItemFieldLength()) 
				                        ); 	
		} 
   	   TabItem value = tabItem.get(index);
   	   if (value == null) {
   	      tabItem.set(index,
			   	   	new TabItem(this,beginTabItem + index * TabItem.getTabItemFieldLength()) 
				                        ); 
		  value = tabItem.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update TabItem at index with the passed value
	 *  Corresponding COBOL Variable is TAB-ITEM
	 *  @param index
	 *	@param value
	 */
  public void setTabItem(int index,char[] value) {
   	getTabItem(index).setString(value);
   }
   
	

	
	
	

		public static int getNewTransSpiTableRFieldLength() {
			return NEW_TRANS_SPI_TABLE_R_LENGTH;
		}

}
  
