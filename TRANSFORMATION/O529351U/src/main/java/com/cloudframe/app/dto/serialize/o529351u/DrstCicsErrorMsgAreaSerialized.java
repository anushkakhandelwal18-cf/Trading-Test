package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class DrstCicsErrorMsgAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DrstCicsErrorMsgAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DrstCicsErrorMsgAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DRST_CICS_ERROR_MSG_AREA_LENGTH = 115;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDrstCicsFiller;
	
	/**
	* Constructor for DrstCicsErrorMsgAreaSerialized
	**/
    public DrstCicsErrorMsgAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for DrstCicsErrorMsgAreaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DrstCicsErrorMsgAreaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this DrstCicsErrorMsgAreaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,342); // serialize this field at offset 342 by default 
    }
    
	/**
	* sets parent for this DrstCicsErrorMsgAreaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 342 by default
    }    
	/**
	* initializes the field in DrstCicsErrorMsgAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DRST_CICS_ERROR_MSG_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDrstCicsFiller = getStartOffset() + 82;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDrstCicsFillerCounter = -1;
     public boolean isDrstCicsFillerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDrstCicsFillerCounter != sharedCounter;
         localDrstCicsFillerCounter = sharedCounter; return hasModified;
     }
	protected static final int DRST_CICS_FILLER_LEN = 33;
	/**
	 * 	serialize this DrstCicsFiller
	 */
   protected void serializeDrstCicsFiller(char[] drstCicsFiller) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(drstCicsFiller,0,getStringValue(),beginDrstCicsFiller,DRST_CICS_FILLER_LEN);
       localDrstCicsFillerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDrstCicsFillerConstraints(char[] value) {
   			return super.checkConstraints(value , 33 ,false, false);
   }
    /**
	 *	refreshDrstCicsFiller is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDrstCicsFiller() {	 
   		return (substring(getStringValue(),beginDrstCicsFiller,beginDrstCicsFiller + DRST_CICS_FILLER_LEN));
   	}




}
  
