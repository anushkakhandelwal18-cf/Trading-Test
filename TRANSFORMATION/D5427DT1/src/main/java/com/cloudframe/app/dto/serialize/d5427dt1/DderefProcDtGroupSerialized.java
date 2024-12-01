package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class DderefProcDtGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DderefProcDtGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DderefProcDtGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DDEREF_PROC_DT_GROUP_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDderefProcDt;
	
	/**
	* Constructor for DderefProcDtGroupSerialized
	**/
    public DderefProcDtGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for DderefProcDtGroupSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DderefProcDtGroupSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this DderefProcDtGroupSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,24); // serialize this field at offset 24 by default 
    }
    
	/**
	* sets parent for this DderefProcDtGroupSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 24 by default
    }    
	/**
	* initializes the field in DderefProcDtGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DDEREF_PROC_DT_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDderefProcDt = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDderefProcDtCounter = -1;
     public boolean isDderefProcDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDderefProcDtCounter != sharedCounter;
         localDderefProcDtCounter = sharedCounter; return hasModified;
     }
	protected static final int DDEREF_PROC_DT_LEN = 10;
	/**
	 * 	serialize this DderefProcDt
	 */
   protected void serializeDderefProcDt(char[] dderefProcDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dderefProcDt,0,getStringValue(),beginDderefProcDt,DDEREF_PROC_DT_LEN);
       localDderefProcDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDderefProcDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshDderefProcDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDderefProcDt() {	 
   		return (substring(getStringValue(),beginDderefProcDt,beginDderefProcDt + DDEREF_PROC_DT_LEN));
   	}




}
  
