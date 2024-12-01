package com.cloudframe.app.dto.serialize.vp776a00;

/**
*  The class Sc2SortCompare2GroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sc2SortCompare2GroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sc2SortCompare2GroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SC_2_SORT_COMPARE_2_GROUP_LENGTH = 32767;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSc2SortCompare2;
	
	/**
	* Constructor for Sc2SortCompare2GroupSerialized
	**/
    public Sc2SortCompare2GroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sc2SortCompare2GroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SC_2_SORT_COMPARE_2_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSc2SortCompare2 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSc2SortCompare2Counter = -1;
     public boolean isSc2SortCompare2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSc2SortCompare2Counter != sharedCounter;
         localSc2SortCompare2Counter = sharedCounter; return hasModified;
     }
	protected static final int SC_2_SORT_COMPARE_2_LEN = 32767;
	/**
	 * 	serialize this Sc2SortCompare2
	 */
   protected void serializeSc2SortCompare2(char[] sc2SortCompare2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sc2SortCompare2,0,getStringValue(),beginSc2SortCompare2,SC_2_SORT_COMPARE_2_LEN);
       localSc2SortCompare2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSc2SortCompare2Constraints(char[] value) {
   			return super.checkConstraints(value , 32767 ,false, false);
   }
    /**
	 *	refreshSc2SortCompare2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSc2SortCompare2() {	 
   		return (substring(getStringValue(),beginSc2SortCompare2,beginSc2SortCompare2 + SC_2_SORT_COMPARE_2_LEN));
   	}




}
  
