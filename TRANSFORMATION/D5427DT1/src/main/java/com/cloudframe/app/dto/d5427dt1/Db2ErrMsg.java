package com.cloudframe.app.dto.d5427dt1;

/**
*  The class Db2ErrMsg is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.d5427dt1.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class Db2ErrMsg extends Db2ErrMsgSerialized { 
   

								private short db2ErrMsgLen;
      private List<char[]> db2ErrMsgText; 


								private int db2ErrMsgTextLen;

								private short iSub;
	
	/**
	* Constructor for Db2ErrMsg
	**/
    public Db2ErrMsg() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDb2ErrMsgLen((short)780);
								setDb2ErrMsgTextLen(78);
    }


 

	/**
	 *	Returns the value of db2ErrMsgLen
	 *	@return db2ErrMsgLen
	 */
	public short getDb2ErrMsgLen() throws CFException {
        if (isDb2ErrMsgLenModified()) { 
           db2ErrMsgLen = refreshDb2ErrMsgLen();
        }
   		return db2ErrMsgLen;
	}
	
	/**
	 * 	Update Db2ErrMsgLen with the passed value
	 *  Corresponding COBOL Variable is DB2-ERR-MSG-LEN
	 *	@param number
	 */
	public void setDb2ErrMsgLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    db2ErrMsgLen = checkDb2ErrMsgLenMaxLimit(number); 
		serializeDb2ErrMsgLen(db2ErrMsgLen);
	}

	public void setDb2ErrMsgLen(int number) {
	    number = checkDb2ErrMsgLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setDb2ErrMsgLen((short)number);
	}
	public void setDb2ErrMsgLen(long number) {
	    number = checkDb2ErrMsgLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setDb2ErrMsgLen((short)number);
	}
	

    /**
	 *	Returns the value of db2ErrMsgText
	 *  Corresponding COBOL Variable is DB2-ERR-MSG-TEXT
	 *	@return db2ErrMsgText
	 */
	public List<char[]> getDb2ErrMsgText() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < DB_2_ERR_MSG_TEXT_SIZE;index++) {
        	list.add( getDb2ErrMsgText( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return db2ErrMsgText
	 */
	public char[] getDb2ErrMsgText(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getDb2ErrMsgText(), resetting it to 0",index);
		    index = 0;
        } else if (index >= DB_2_ERR_MSG_TEXT_SIZE) {
             	index = DB_2_ERR_MSG_TEXT_SIZE -1; // can't exceed max array size
             	logger.trace("db2ErrMsgText - Array index exceeded max Size {}, resetting it to max allowed",DB_2_ERR_MSG_TEXT_SIZE); 
	    }
   	      return getCharArray( (beginDb2ErrMsgText + index*DB_2_ERR_MSG_TEXT_LEN) , DB_2_ERR_MSG_TEXT_LEN );
    }
    
    
   public int  db2ErrMsgTextFieldLength() {
   	return DB_2_ERR_MSG_TEXT_LEN;
   }
   
	

  
  	/**
	 *	Update Db2ErrMsgText with the passed value at a given index
	 *  Corresponding COBOL Variable is DB2-ERR-MSG-TEXT
	 *  @param index
	 *	@param value
	 */
  public void setDb2ErrMsgText(int index,char[] value) {
   	setDb2ErrMsgText(index,value,true);
   }
   
   
   /**
	 *	Update Db2ErrMsgText with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setDb2ErrMsgText(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setDb2ErrMsgText(int,String,boolean), reset it to 0",index);
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
		serializeDb2ErrMsgText(index,value);		
       }
   }
   
	/**
	 *	Returns the value of db2ErrMsgTextLen
	 *	@return db2ErrMsgTextLen
	 */
	public int getDb2ErrMsgTextLen() throws CFException {
        if (isDb2ErrMsgTextLenModified()) { 
           db2ErrMsgTextLen = refreshDb2ErrMsgTextLen();
        }
   		return db2ErrMsgTextLen;
	}
	
	/**
	 * 	Update Db2ErrMsgTextLen with the passed value
	 *  Corresponding COBOL Variable is DB2-ERR-MSG-TEXT-LEN
	 *	@param number
	 */
	public void setDb2ErrMsgTextLen(int number) {
	     // Truncate if the number is beyond +/- Max range
	    db2ErrMsgTextLen = checkDb2ErrMsgTextLenMaxLimit(number); 
		serializeDb2ErrMsgTextLen(db2ErrMsgTextLen);
	}


	public void setDb2ErrMsgTextLen(long number) {
	    number = checkDb2ErrMsgTextLenMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDb2ErrMsgTextLen((int)number);
	}
	
	/**
	 *	Returns the value of iSub
	 *	@return iSub
	 */
	public short getISub() throws CFException {
        if (isISubModified()) { 
           iSub = refreshISub();
        }
   		return iSub;
	}
	
	/**
	 * 	Update ISub with the passed value
	 *  Corresponding COBOL Variable is I-SUB
	 *	@param number
	 */
	public void setISub(short number) {
	     // Truncate if the number is beyond +/- Max range
	    iSub = checkISubMaxLimit(number); 
		serializeISub(iSub);
	}

	public void setISub(int number) {
	    number = checkISubMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setISub((short)number);
	}
	public void setISub(long number) {
	    number = checkISubMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setISub((short)number);
	}
	


	
	
	

		public static int getDb2ErrMsgFieldLength() {
			return DB_2_ERR_MSG_LENGTH;
		}

}
  
