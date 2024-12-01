package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class GenTransSpiTableGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class GenTransSpiTableGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(GenTransSpiTableGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int GEN_TRANS_SPI_TABLE_GROUP_LENGTH = 54;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginGenTransSpiTable;
	
	/**
	* Constructor for GenTransSpiTableGroupSerialized
	**/
    public GenTransSpiTableGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in GenTransSpiTableGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(GEN_TRANS_SPI_TABLE_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginGenTransSpiTable = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localGenTransSpiTableCounter = -1;
     public boolean isGenTransSpiTableModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGenTransSpiTableCounter != sharedCounter;
         localGenTransSpiTableCounter = sharedCounter; return hasModified;
     }
	protected static final int GEN_TRANS_SPI_TABLE_LEN = 54;
	/**
	 * 	serialize this GenTransSpiTable
	 */
   protected void serializeGenTransSpiTable(char[] genTransSpiTable) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(genTransSpiTable,0,getStringValue(),beginGenTransSpiTable,GEN_TRANS_SPI_TABLE_LEN);
       localGenTransSpiTableCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkGenTransSpiTableConstraints(char[] value) {
   			return super.checkConstraints(value , 54 ,false, false);
   }
    /**
	 *	refreshGenTransSpiTable is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshGenTransSpiTable() {	 
   		return (substring(getStringValue(),beginGenTransSpiTable,beginGenTransSpiTable + GEN_TRANS_SPI_TABLE_LEN));
   	}




}
  
