package com.cloudframe.app.dto.o529351u;

/**
*  The class TabItem is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class TabItem extends TabItemSerialized { 
   

								private long newTransl;
	
	/**
	* Constructor for TabItem
	**/
    public TabItem() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for TabItem. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TabItem(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of newTransl
	 *	@return newTransl
	 */
	public long getNewTransl() throws CFException {
       if (isNewTranslModified()) { 
           newTransl = refreshNewTransl();
        }
   		return newTransl;
	}
	

	
	   
	/**
	 * 	Update NewTransl with the passed value
	 *  Corresponding COBOL Variable is WS-NEW-TRANSL
	 *	@param number
	 */
	public void setNewTransl(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    newTransl = checkNewTranslMaxLimit(number); 
		serializeNewTransl(newTransl);
	}
	

	/**
	 * 	Update NewTransl with the passed value
	 *	@param value (String or char[])
	 */
	public void setNewTransl(char[] value) throws CFException {
		 newTransl = serializeNewTransl(value);
	}
	/**
	 * 	Update NewTransl with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNewTranslString(char[] value) throws CFException {
		 setNewTransl(value);
	}

	
	
	

		public static int getTabItemFieldLength() {
			return TAB_ITEM_LENGTH;
		}

}
  
