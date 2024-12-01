package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class NewTransSpiTableGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class NewTransSpiTableGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(NewTransSpiTableGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int NEW_TRANS_SPI_TABLE_GROUP_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginNewTransSpiTable;
	
	/**
	* Constructor for NewTransSpiTableGroupSerialized
	**/
    public NewTransSpiTableGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in NewTransSpiTableGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(NEW_TRANS_SPI_TABLE_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginNewTransSpiTable = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localNewTransSpiTableCounter = -1;
     public boolean isNewTransSpiTableModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNewTransSpiTableCounter != sharedCounter;
         localNewTransSpiTableCounter = sharedCounter; return hasModified;
     }
	protected static final int NEW_TRANS_SPI_TABLE_LEN = 12;
	/**
	 * 	serialize this NewTransSpiTable
	 */
   protected void serializeNewTransSpiTable(char[] newTransSpiTable) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(newTransSpiTable,0,getStringValue(),beginNewTransSpiTable,NEW_TRANS_SPI_TABLE_LEN);
       localNewTransSpiTableCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkNewTransSpiTableConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshNewTransSpiTable is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshNewTransSpiTable() {	 
   		return (substring(getStringValue(),beginNewTransSpiTable,beginNewTransSpiTable + NEW_TRANS_SPI_TABLE_LEN));
   	}




}
  
