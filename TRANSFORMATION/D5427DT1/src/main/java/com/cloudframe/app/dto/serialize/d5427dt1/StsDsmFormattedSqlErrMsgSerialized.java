package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class StsDsmFormattedSqlErrMsgSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class StsDsmFormattedSqlErrMsgSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(StsDsmFormattedSqlErrMsgSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int STS_DSM_FORMATTED_SQL_ERR_MSG_LENGTH = 780;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginStsDsmFrmtdSqlErrMsg;
           protected static final int STS_DSM_FRMTD_SQL_ERR_MSG_SIZE = 10;
	
	/**
	* Constructor for StsDsmFormattedSqlErrMsgSerialized
	**/
    public StsDsmFormattedSqlErrMsgSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for StsDsmFormattedSqlErrMsgSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public StsDsmFormattedSqlErrMsgSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this StsDsmFormattedSqlErrMsgSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,555); // serialize this field at offset 555 by default 
    }
    
	/**
	* sets parent for this StsDsmFormattedSqlErrMsgSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 555 by default
    }    
	/**
	* initializes the field in StsDsmFormattedSqlErrMsgSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(STS_DSM_FORMATTED_SQL_ERR_MSG_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginStsDsmFrmtdSqlErrMsg = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
 
   
  protected  static final int STS_DSM_FRMTD_SQL_ERR_MSG_LEN = 78;
   /**
	 *	serializeStsDsmFrmtdSqlErrMsg as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeStsDsmFrmtdSqlErrMsg(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginStsDsmFrmtdSqlErrMsg + index*STS_DSM_FRMTD_SQL_ERR_MSG_LEN)
   	          , STS_DSM_FRMTD_SQL_ERR_MSG_LEN 
   	          );
   }

		public int stsDsmFrmtdSqlErrMsgSize() {
			return STS_DSM_FRMTD_SQL_ERR_MSG_SIZE;
		}



}
  
