package com.cloudframe.app.dto.d5427dt1;

/**
*  The class StsDsmFormattedSqlErrMsg is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;
import com.cloudframe.app.common.CONSTANTS;


public class StsDsmFormattedSqlErrMsg extends StsDsmFormattedSqlErrMsgSerialized { 
   
      private List<char[]> stsDsmFrmtdSqlErrMsg; 

	
	/**
	* Constructor for StsDsmFormattedSqlErrMsg
	**/
    public StsDsmFormattedSqlErrMsg() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for StsDsmFormattedSqlErrMsg. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public StsDsmFormattedSqlErrMsg(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

    /**
	 *	Returns the value of stsDsmFrmtdSqlErrMsg
	 *  Corresponding COBOL Variable is STS-DSM-FRMTD-SQL-ERR-MSG
	 *	@return stsDsmFrmtdSqlErrMsg
	 */
	public List<char[]> getStsDsmFrmtdSqlErrMsg() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < STS_DSM_FRMTD_SQL_ERR_MSG_SIZE;index++) {
        	list.add( getStsDsmFrmtdSqlErrMsg( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return stsDsmFrmtdSqlErrMsg
	 */
	public char[] getStsDsmFrmtdSqlErrMsg(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getStsDsmFrmtdSqlErrMsg(), resetting it to 0",index);
		    index = 0;
        } else if (index >= STS_DSM_FRMTD_SQL_ERR_MSG_SIZE) {
             	index = STS_DSM_FRMTD_SQL_ERR_MSG_SIZE -1; // can't exceed max array size
             	logger.trace("stsDsmFrmtdSqlErrMsg - Array index exceeded max Size {}, resetting it to max allowed",STS_DSM_FRMTD_SQL_ERR_MSG_SIZE); 
	    }
   	      return getCharArray( (beginStsDsmFrmtdSqlErrMsg + index*STS_DSM_FRMTD_SQL_ERR_MSG_LEN) , STS_DSM_FRMTD_SQL_ERR_MSG_LEN );
    }
    
    
   public int  stsDsmFrmtdSqlErrMsgFieldLength() {
   	return STS_DSM_FRMTD_SQL_ERR_MSG_LEN;
   }
   
	

  
  	/**
	 *	Update StsDsmFrmtdSqlErrMsg with the passed value at a given index
	 *  Corresponding COBOL Variable is STS-DSM-FRMTD-SQL-ERR-MSG
	 *  @param index
	 *	@param value
	 */
  public void setStsDsmFrmtdSqlErrMsg(int index,char[] value) {
   	setStsDsmFrmtdSqlErrMsg(index,value,true);
   }
   
   
   /**
	 *	Update StsDsmFrmtdSqlErrMsg with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setStsDsmFrmtdSqlErrMsg(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setStsDsmFrmtdSqlErrMsg(int,String,boolean), reset it to 0",index);
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
		serializeStsDsmFrmtdSqlErrMsg(index,value);		
       }
   }
   

	
	
	
	/**
	 * 	initializes StsDsmFormattedSqlErrMsg
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         for (int index =0; index < STS_DSM_FRMTD_SQL_ERR_MSG_SIZE;index++) {
             setStsDsmFrmtdSqlErrMsg(index, CONSTANTS.SPACE_78);
         }
   }

		public static int getStsDsmFormattedSqlErrMsgFieldLength() {
			return STS_DSM_FORMATTED_SQL_ERR_MSG_LENGTH;
		}

}
  
