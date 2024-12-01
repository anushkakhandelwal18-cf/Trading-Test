package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class DderefEeIdGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DderefEeIdGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DderefEeIdGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DDEREF_EE_ID_GROUP_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDderefEeId;
	
	/**
	* Constructor for DderefEeIdGroupSerialized
	**/
    public DderefEeIdGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for DderefEeIdGroupSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DderefEeIdGroupSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this DderefEeIdGroupSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,110); // serialize this field at offset 110 by default 
    }
    
	/**
	* sets parent for this DderefEeIdGroupSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 110 by default
    }    
	/**
	* initializes the field in DderefEeIdGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DDEREF_EE_ID_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDderefEeId = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDderefEeIdCounter = -1;
     public boolean isDderefEeIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDderefEeIdCounter != sharedCounter;
         localDderefEeIdCounter = sharedCounter; return hasModified;
     }
	protected static final int DDEREF_EE_ID_LEN = 10;
	/**
	 * 	serialize this DderefEeId
	 */
   protected void serializeDderefEeId(char[] dderefEeId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dderefEeId,0,getStringValue(),beginDderefEeId,DDEREF_EE_ID_LEN);
       localDderefEeIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDderefEeIdConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshDderefEeId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDderefEeId() {	 
   		return (substring(getStringValue(),beginDderefEeId,beginDderefEeId + DDEREF_EE_ID_LEN));
   	}




}
  
