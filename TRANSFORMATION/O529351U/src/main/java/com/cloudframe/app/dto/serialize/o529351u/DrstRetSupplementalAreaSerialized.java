package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class DrstRetSupplementalAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DrstRetSupplementalAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DrstRetSupplementalAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DRST_RET_SUPPLEMENTAL_AREA_LENGTH = 750;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginDrstRetSupplementalEntry;
           protected static final int DRST_RET_SUPPLEMENTAL_ENTRY_SIZE = 25;
	
	/**
	* Constructor for DrstRetSupplementalAreaSerialized
	**/
    public DrstRetSupplementalAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for DrstRetSupplementalAreaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DrstRetSupplementalAreaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this DrstRetSupplementalAreaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,459); // serialize this field at offset 459 by default 
    }
    
	/**
	* sets parent for this DrstRetSupplementalAreaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 459 by default
    }    
	/**
	* initializes the field in DrstRetSupplementalAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DRST_RET_SUPPLEMENTAL_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginDrstRetSupplementalEntry = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
 
   
  protected  static final int DRST_RET_SUPPLEMENTAL_ENTRY_LEN = 30;
   /**
	 *	serializeDrstRetSupplementalEntry as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeDrstRetSupplementalEntry(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginDrstRetSupplementalEntry + index*DRST_RET_SUPPLEMENTAL_ENTRY_LEN)
   	          , DRST_RET_SUPPLEMENTAL_ENTRY_LEN 
   	          );
   }

		public int drstRetSupplementalEntrySize() {
			return DRST_RET_SUPPLEMENTAL_ENTRY_SIZE;
		}



}
  
