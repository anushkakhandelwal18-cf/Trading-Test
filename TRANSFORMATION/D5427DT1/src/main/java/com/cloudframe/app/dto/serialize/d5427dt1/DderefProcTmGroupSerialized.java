package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class DderefProcTmGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DderefProcTmGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DderefProcTmGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DDEREF_PROC_TM_GROUP_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDderefProcTm;
	
	/**
	* Constructor for DderefProcTmGroupSerialized
	**/
    public DderefProcTmGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for DderefProcTmGroupSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DderefProcTmGroupSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this DderefProcTmGroupSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,34); // serialize this field at offset 34 by default 
    }
    
	/**
	* sets parent for this DderefProcTmGroupSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 34 by default
    }    
	/**
	* initializes the field in DderefProcTmGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DDEREF_PROC_TM_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDderefProcTm = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDderefProcTmCounter = -1;
     public boolean isDderefProcTmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDderefProcTmCounter != sharedCounter;
         localDderefProcTmCounter = sharedCounter; return hasModified;
     }
	protected static final int DDEREF_PROC_TM_LEN = 8;
	/**
	 * 	serialize this DderefProcTm
	 */
   protected void serializeDderefProcTm(char[] dderefProcTm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dderefProcTm,0,getStringValue(),beginDderefProcTm,DDEREF_PROC_TM_LEN);
       localDderefProcTmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDderefProcTmConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshDderefProcTm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDderefProcTm() {	 
   		return (substring(getStringValue(),beginDderefProcTm,beginDderefProcTm + DDEREF_PROC_TM_LEN));
   	}




}
  
