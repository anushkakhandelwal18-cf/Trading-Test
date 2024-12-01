package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class GenTransSpiTableRSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class GenTransSpiTableRSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(GenTransSpiTableRSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int GEN_TRANS_SPI_TABLE_R_LENGTH = 54;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginTableItem;
           protected static final int TABLE_ITEM_SIZE = 9;
	
	/**
	* Constructor for GenTransSpiTableRSerialized
	**/
    public GenTransSpiTableRSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for GenTransSpiTableRSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public GenTransSpiTableRSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this GenTransSpiTableRSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this GenTransSpiTableRSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in GenTransSpiTableRSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(GEN_TRANS_SPI_TABLE_R_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginTableItem = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int tableItemSize() {
			return TABLE_ITEM_SIZE;
		}



}
  
