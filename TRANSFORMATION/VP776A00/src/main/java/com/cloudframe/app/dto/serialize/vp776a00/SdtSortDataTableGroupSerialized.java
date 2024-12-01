package com.cloudframe.app.dto.serialize.vp776a00;

/**
*  The class SdtSortDataTableGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SdtSortDataTableGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SdtSortDataTableGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SDT_SORT_DATA_TABLE_GROUP_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSdtSortDataTable;
	
	/**
	* Constructor for SdtSortDataTableGroupSerialized
	**/
    public SdtSortDataTableGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in SdtSortDataTableGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SDT_SORT_DATA_TABLE_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSdtSortDataTable = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSdtSortDataTableCounter = -1;
     public boolean isSdtSortDataTableModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSdtSortDataTableCounter != sharedCounter;
         localSdtSortDataTableCounter = sharedCounter; return hasModified;
     }
	protected static final int SDT_SORT_DATA_TABLE_LEN = 1;
	/**
	 * 	serialize this SdtSortDataTable
	 */
   protected void serializeSdtSortDataTable(char[] sdtSortDataTable) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sdtSortDataTable,0,getStringValue(),beginSdtSortDataTable,SDT_SORT_DATA_TABLE_LEN);
       localSdtSortDataTableCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSdtSortDataTableConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSdtSortDataTable is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSdtSortDataTable() {	 
   		return (substring(getStringValue(),beginSdtSortDataTable,beginSdtSortDataTable + SDT_SORT_DATA_TABLE_LEN));
   	}




}
  
