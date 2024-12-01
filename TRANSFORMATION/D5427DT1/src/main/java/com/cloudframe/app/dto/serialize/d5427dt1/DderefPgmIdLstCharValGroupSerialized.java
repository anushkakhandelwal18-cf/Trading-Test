package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class DderefPgmIdLstCharValGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DderefPgmIdLstCharValGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DderefPgmIdLstCharValGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DDEREF_PGM_ID_LST_CHAR_VAL_GROUP_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDderefPgmIdLstCharVal;
	
	/**
	* Constructor for DderefPgmIdLstCharValGroupSerialized
	**/
    public DderefPgmIdLstCharValGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for DderefPgmIdLstCharValGroupSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DderefPgmIdLstCharValGroupSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this DderefPgmIdLstCharValGroupSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,227); // serialize this field at offset 227 by default 
    }
    
	/**
	* sets parent for this DderefPgmIdLstCharValGroupSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 227 by default
    }    
	/**
	* initializes the field in DderefPgmIdLstCharValGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DDEREF_PGM_ID_LST_CHAR_VAL_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDderefPgmIdLstCharVal = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDderefPgmIdLstCharValCounter = -1;
     public boolean isDderefPgmIdLstCharValModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDderefPgmIdLstCharValCounter != sharedCounter;
         localDderefPgmIdLstCharValCounter = sharedCounter; return hasModified;
     }
	protected static final int DDEREF_PGM_ID_LST_CHAR_VAL_LEN = 1;
	/**
	 * 	serialize this DderefPgmIdLstCharVal
	 */
   protected void serializeDderefPgmIdLstCharVal(char[] dderefPgmIdLstCharVal) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dderefPgmIdLstCharVal,0,getStringValue(),beginDderefPgmIdLstCharVal,DDEREF_PGM_ID_LST_CHAR_VAL_LEN);
       localDderefPgmIdLstCharValCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDderefPgmIdLstCharValConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDderefPgmIdLstCharVal is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDderefPgmIdLstCharVal() {	 
   		return (substring(getStringValue(),beginDderefPgmIdLstCharVal,beginDderefPgmIdLstCharVal + DDEREF_PGM_ID_LST_CHAR_VAL_LEN));
   	}




}
  
