package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class CetCicsErrorTableGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CetCicsErrorTableGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CetCicsErrorTableGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CET_CICS_ERROR_TABLE_GROUP_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCetCicsErrorTableRedefined02;
	
	/**
	* Constructor for CetCicsErrorTableGroupSerialized
	**/
    public CetCicsErrorTableGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in CetCicsErrorTableGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CET_CICS_ERROR_TABLE_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginCetCicsErrorTableRedefined02 = getStartOffset() + 0;	// set offset for serialization
  
  
  
	   /*  end of offset */
	}
     int localCetCicsErrorTableRedefined02Counter = -1;
     public boolean isCetCicsErrorTableRedefined02Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCetCicsErrorTableRedefined02Counter != sharedCounter;
         localCetCicsErrorTableRedefined02Counter = sharedCounter; return hasModified;
     }
	protected static final int CET_CICS_ERROR_TABLE_REDEFINED_02_LEN = 6;
	/**
	 * 	serialize this CetCicsErrorTableRedefined02
	 */
   protected void serializeCetCicsErrorTableRedefined02(char[] cetCicsErrorTableRedefined02) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cetCicsErrorTableRedefined02,0,getStringValue(),beginCetCicsErrorTableRedefined02,CET_CICS_ERROR_TABLE_REDEFINED_02_LEN);
       localCetCicsErrorTableRedefined02Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCetCicsErrorTableRedefined02Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshCetCicsErrorTableRedefined02 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCetCicsErrorTableRedefined02() {	 
   		return (substring(getStringValue(),beginCetCicsErrorTableRedefined02,beginCetCicsErrorTableRedefined02 + CET_CICS_ERROR_TABLE_REDEFINED_02_LEN));
   	}




}
  
