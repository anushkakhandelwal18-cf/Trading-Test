package com.cloudframe.app.dto.serialize.cics0010;

/**
*  The class DfhcommareaGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-03 at 15:51. using version 5.0.0.163
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DfhcommareaGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DfhcommareaGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DFHCOMMAREA_GROUP_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDfhcommarea;
	
	/**
	* Constructor for DfhcommareaGroupSerialized
	**/
    public DfhcommareaGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DfhcommareaGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DFHCOMMAREA_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDfhcommarea = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDfhcommareaCounter = -1;
     public boolean isDfhcommareaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDfhcommareaCounter != sharedCounter;
         localDfhcommareaCounter = sharedCounter; return hasModified;
     }
	protected static final int DFHCOMMAREA_LEN = 1;
	/**
	 * 	serialize this Dfhcommarea
	 */
   protected void serializeDfhcommarea(char[] dfhcommarea) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dfhcommarea,0,getStringValue(),beginDfhcommarea,DFHCOMMAREA_LEN);
       localDfhcommareaCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDfhcommareaConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDfhcommarea is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDfhcommarea() {	 
   		return (substring(getStringValue(),beginDfhcommarea,beginDfhcommarea + DFHCOMMAREA_LEN));
   	}




}
  
