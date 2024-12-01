package com.cloudframe.app.dto.serialize.vp776a00;

/**
*  The class Sc1SortCompare1GroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sc1SortCompare1GroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sc1SortCompare1GroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SC_1_SORT_COMPARE_1_GROUP_LENGTH = 32767;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSc1SortCompare1;
	
	/**
	* Constructor for Sc1SortCompare1GroupSerialized
	**/
    public Sc1SortCompare1GroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sc1SortCompare1GroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SC_1_SORT_COMPARE_1_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSc1SortCompare1 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSc1SortCompare1Counter = -1;
     public boolean isSc1SortCompare1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSc1SortCompare1Counter != sharedCounter;
         localSc1SortCompare1Counter = sharedCounter; return hasModified;
     }
	protected static final int SC_1_SORT_COMPARE_1_LEN = 32767;
	/**
	 * 	serialize this Sc1SortCompare1
	 */
   protected void serializeSc1SortCompare1(char[] sc1SortCompare1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sc1SortCompare1,0,getStringValue(),beginSc1SortCompare1,SC_1_SORT_COMPARE_1_LEN);
       localSc1SortCompare1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSc1SortCompare1Constraints(char[] value) {
   			return super.checkConstraints(value , 32767 ,false, false);
   }
    /**
	 *	refreshSc1SortCompare1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSc1SortCompare1() {	 
   		return (substring(getStringValue(),beginSc1SortCompare1,beginSc1SortCompare1 + SC_1_SORT_COMPARE_1_LEN));
   	}




}
  
