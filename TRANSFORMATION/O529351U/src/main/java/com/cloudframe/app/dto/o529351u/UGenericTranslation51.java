package com.cloudframe.app.dto.o529351u;

/**
*  The class UGenericTranslation51 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class UGenericTranslation51 extends UGenericTranslation51Serialized { 
   
			private List<UGenericTrnslGroup51> uGenericTrnslGroup51 = new ArrayList<>();
    	
	
	/**
	* Constructor for UGenericTranslation51
	**/
    public UGenericTranslation51() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for UGenericTranslation51. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public UGenericTranslation51(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of uGenericTrnslGroup51
	 *  Corresponding COBOL Variable is LK-51U-GENERIC-TRNSL-GROUP
	 *	@return uGenericTrnslGroup51
	 */
   public List<UGenericTrnslGroup51> getUGenericTrnslGroup51() {
       return uGenericTrnslGroup51;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return uGenericTrnslGroup51
	 */
	public UGenericTrnslGroup51 getUGenericTrnslGroup51(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getUGenericTrnslGroup51(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= U_GENERIC_TRNSL_GROUP_51_SIZE) {
             	index = U_GENERIC_TRNSL_GROUP_51_SIZE -1; // can't exceed max array size
             	logger.trace("uGenericTrnslGroup51 - Array index exceeded max Size {}, resetting it to max allowed",U_GENERIC_TRNSL_GROUP_51_SIZE); 
	    }
		if (index >= uGenericTrnslGroup51.size()) {
       		for (int fillIndex =  uGenericTrnslGroup51.size() -1; fillIndex < index;fillIndex++) {
		       uGenericTrnslGroup51.add(null);
		    }
			uGenericTrnslGroup51.set(index,
			   	   	new UGenericTrnslGroup51(this,beginUGenericTrnslGroup51 + index * UGenericTrnslGroup51.getUGenericTrnslGroup51FieldLength()) 
				                        ); 	
		} 
   	   UGenericTrnslGroup51 value = uGenericTrnslGroup51.get(index);
   	   if (value == null) {
   	      uGenericTrnslGroup51.set(index,
			   	   	new UGenericTrnslGroup51(this,beginUGenericTrnslGroup51 + index * UGenericTrnslGroup51.getUGenericTrnslGroup51FieldLength()) 
				                        ); 
		  value = uGenericTrnslGroup51.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update UGenericTrnslGroup51 at index with the passed value
	 *  Corresponding COBOL Variable is LK-51U-GENERIC-TRNSL-GROUP
	 *  @param index
	 *	@param value
	 */
  public void setUGenericTrnslGroup51(int index,char[] value) {
   	getUGenericTrnslGroup51(index).setString(value);
   }
   
	

	
	
	

		public static int getUGenericTranslation51FieldLength() {
			return U_GENERIC_TRANSLATION_51_LENGTH;
		}

}
  
