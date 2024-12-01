package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class DrstSqlErrorMsgAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DrstSqlErrorMsgAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DrstSqlErrorMsgAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DRST_SQL_ERROR_MSG_AREA_LENGTH = 115;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDrstErrTxt;
	
	/**
	* Constructor for DrstSqlErrorMsgAreaSerialized
	**/
    public DrstSqlErrorMsgAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for DrstSqlErrorMsgAreaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DrstSqlErrorMsgAreaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this DrstSqlErrorMsgAreaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,342); // serialize this field at offset 342 by default 
    }
    
	/**
	* sets parent for this DrstSqlErrorMsgAreaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 342 by default
    }    
	/**
	* initializes the field in DrstSqlErrorMsgAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DRST_SQL_ERROR_MSG_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDrstErrTxt = getStartOffset() + 85;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDrstErrTxtCounter = -1;
     public boolean isDrstErrTxtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDrstErrTxtCounter != sharedCounter;
         localDrstErrTxtCounter = sharedCounter; return hasModified;
     }
	protected static final int DRST_ERR_TXT_LEN = 30;
	/**
	 * 	serialize this DrstErrTxt
	 */
   protected void serializeDrstErrTxt(char[] drstErrTxt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(drstErrTxt,0,getStringValue(),beginDrstErrTxt,DRST_ERR_TXT_LEN);
       localDrstErrTxtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDrstErrTxtConstraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshDrstErrTxt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDrstErrTxt() {	 
   		return (substring(getStringValue(),beginDrstErrTxt,beginDrstErrTxt + DRST_ERR_TXT_LEN));
   	}




}
  
