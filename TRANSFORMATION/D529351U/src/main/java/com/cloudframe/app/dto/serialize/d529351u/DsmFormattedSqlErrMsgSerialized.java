package com.cloudframe.app.dto.serialize.d529351u;

/**
*  The class DsmFormattedSqlErrMsgSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:50. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DsmFormattedSqlErrMsgSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DsmFormattedSqlErrMsgSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DSM_FORMATTED_SQL_ERR_MSG_LENGTH = 780;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginDsmFrmtdSqlErrMsg;
           protected static final int DSM_FRMTD_SQL_ERR_MSG_SIZE = 10;
	
	/**
	* Constructor for DsmFormattedSqlErrMsgSerialized
	**/
    public DsmFormattedSqlErrMsgSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for DsmFormattedSqlErrMsgSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DsmFormattedSqlErrMsgSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this DsmFormattedSqlErrMsgSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,210); // serialize this field at offset 210 by default 
    }
    
	/**
	* sets parent for this DsmFormattedSqlErrMsgSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 210 by default
    }    
	/**
	* initializes the field in DsmFormattedSqlErrMsgSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DSM_FORMATTED_SQL_ERR_MSG_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginDsmFrmtdSqlErrMsg = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
 
   
  protected  static final int DSM_FRMTD_SQL_ERR_MSG_LEN = 78;
   /**
	 *	serializeDsmFrmtdSqlErrMsg as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeDsmFrmtdSqlErrMsg(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginDsmFrmtdSqlErrMsg + index*DSM_FRMTD_SQL_ERR_MSG_LEN)
   	          , DSM_FRMTD_SQL_ERR_MSG_LEN 
   	          );
   }

		public int dsmFrmtdSqlErrMsgSize() {
			return DSM_FRMTD_SQL_ERR_MSG_SIZE;
		}



}
  
