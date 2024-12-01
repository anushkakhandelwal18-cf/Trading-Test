package com.cloudframe.app.dto.o529351u;

/**
*  The class DsmFormattedSqlErrMsg is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;
import com.cloudframe.app.common.CONSTANTS;


public class DsmFormattedSqlErrMsg extends DsmFormattedSqlErrMsgSerialized { 
   
      private List<char[]> dsmFrmtdSqlErrMsg; 

	
	/**
	* Constructor for DsmFormattedSqlErrMsg
	**/
    public DsmFormattedSqlErrMsg() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for DsmFormattedSqlErrMsg. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DsmFormattedSqlErrMsg(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

    /**
	 *	Returns the value of dsmFrmtdSqlErrMsg
	 *  Corresponding COBOL Variable is DSM-FRMTD-SQL-ERR-MSG
	 *	@return dsmFrmtdSqlErrMsg
	 */
	public List<char[]> getDsmFrmtdSqlErrMsg() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < DSM_FRMTD_SQL_ERR_MSG_SIZE;index++) {
        	list.add( getDsmFrmtdSqlErrMsg( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return dsmFrmtdSqlErrMsg
	 */
	public char[] getDsmFrmtdSqlErrMsg(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getDsmFrmtdSqlErrMsg(), resetting it to 0",index);
		    index = 0;
        } else if (index >= DSM_FRMTD_SQL_ERR_MSG_SIZE) {
             	index = DSM_FRMTD_SQL_ERR_MSG_SIZE -1; // can't exceed max array size
             	logger.trace("dsmFrmtdSqlErrMsg - Array index exceeded max Size {}, resetting it to max allowed",DSM_FRMTD_SQL_ERR_MSG_SIZE); 
	    }
   	      return getCharArray( (beginDsmFrmtdSqlErrMsg + index*DSM_FRMTD_SQL_ERR_MSG_LEN) , DSM_FRMTD_SQL_ERR_MSG_LEN );
    }
    
    
   public int  dsmFrmtdSqlErrMsgFieldLength() {
   	return DSM_FRMTD_SQL_ERR_MSG_LEN;
   }
   
	

  
  	/**
	 *	Update DsmFrmtdSqlErrMsg with the passed value at a given index
	 *  Corresponding COBOL Variable is DSM-FRMTD-SQL-ERR-MSG
	 *  @param index
	 *	@param value
	 */
  public void setDsmFrmtdSqlErrMsg(int index,char[] value) {
   	setDsmFrmtdSqlErrMsg(index,value,true);
   }
   
   
   /**
	 *	Update DsmFrmtdSqlErrMsg with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setDsmFrmtdSqlErrMsg(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setDsmFrmtdSqlErrMsg(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 78)  {     
		       value = substring(value,0,78);
           }  else if (value.length < 78) {
		       value = pad(78, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(78).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeDsmFrmtdSqlErrMsg(index,value);		
       }
   }
   

	
	
	
	/**
	 * 	initializes DsmFormattedSqlErrMsg
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         for (int index =0; index < DSM_FRMTD_SQL_ERR_MSG_SIZE;index++) {
             setDsmFrmtdSqlErrMsg(index, CONSTANTS.SPACE_78);
         }
   }

		public static int getDsmFormattedSqlErrMsgFieldLength() {
			return DSM_FORMATTED_SQL_ERR_MSG_LENGTH;
		}

}
  
