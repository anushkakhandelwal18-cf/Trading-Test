package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class NewTransSpiTableRSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class NewTransSpiTableRSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(NewTransSpiTableRSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int NEW_TRANS_SPI_TABLE_R_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginTabItem;
           protected static final int TAB_ITEM_SIZE = 2;
	
	/**
	* Constructor for NewTransSpiTableRSerialized
	**/
    public NewTransSpiTableRSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for NewTransSpiTableRSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public NewTransSpiTableRSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this NewTransSpiTableRSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this NewTransSpiTableRSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in NewTransSpiTableRSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(NEW_TRANS_SPI_TABLE_R_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginTabItem = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int tabItemSize() {
			return TAB_ITEM_SIZE;
		}



}
  
