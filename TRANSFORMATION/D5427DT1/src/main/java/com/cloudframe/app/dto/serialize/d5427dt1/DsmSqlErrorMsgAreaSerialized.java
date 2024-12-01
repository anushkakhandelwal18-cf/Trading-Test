package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class DsmSqlErrorMsgAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DsmSqlErrorMsgAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DsmSqlErrorMsgAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DSM_SQL_ERROR_MSG_AREA_LENGTH = 120;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDsmErrClngPgmName;
	
	/**
	* Constructor for DsmSqlErrorMsgAreaSerialized
	**/
    public DsmSqlErrorMsgAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for DsmSqlErrorMsgAreaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DsmSqlErrorMsgAreaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this DsmSqlErrorMsgAreaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,990); // serialize this field at offset 990 by default 
    }
    
	/**
	* sets parent for this DsmSqlErrorMsgAreaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 990 by default
    }    
	/**
	* initializes the field in DsmSqlErrorMsgAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DSM_SQL_ERROR_MSG_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDsmErrClngPgmName = getStartOffset() + 67;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDsmErrClngPgmNameCounter = -1;
     public boolean isDsmErrClngPgmNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDsmErrClngPgmNameCounter != sharedCounter;
         localDsmErrClngPgmNameCounter = sharedCounter; return hasModified;
     }
	protected static final int DSM_ERR_CLNG_PGM_NAME_LEN = 8;
	/**
	 * 	serialize this DsmErrClngPgmName
	 */
   protected void serializeDsmErrClngPgmName(char[] dsmErrClngPgmName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dsmErrClngPgmName,0,getStringValue(),beginDsmErrClngPgmName,DSM_ERR_CLNG_PGM_NAME_LEN);
       localDsmErrClngPgmNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDsmErrClngPgmNameConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshDsmErrClngPgmName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDsmErrClngPgmName() {	 
   		return (substring(getStringValue(),beginDsmErrClngPgmName,beginDsmErrClngPgmName + DSM_ERR_CLNG_PGM_NAME_LEN));
   	}




}
  
