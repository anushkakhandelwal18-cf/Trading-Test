package com.cloudframe.app.dto.trdpb000;

/**
*  The class SettlmentQueueTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-11-30 at 14:20. using version 5.0.0.161
**/


import com.cloudframe.app.dto.serialize.trdpb000.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class SettlmentQueueTable extends SettlmentQueueTableSerialized { 
   

								private short stqIndex;
      private List<char[]> stqCurrency; 

      private List<char[]> stqTrdpair; 

	
	/**
	* Constructor for SettlmentQueueTable
	**/
    public SettlmentQueueTable() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of stqIndex
	 *	@return stqIndex
	 */
	public short getStqIndex() throws CFException {
        if (isStqIndexModified()) { 
           stqIndex = refreshStqIndex();
        }
   		return stqIndex;
	}
	
	/**
	 * 	Update StqIndex with the passed value
	 *  Corresponding COBOL Variable is WS-STQ-INDEX
	 *	@param number
	 */
	public void setStqIndex(short number) {
	     // Truncate if the number is beyond +/- Max range
	    stqIndex = checkStqIndexMaxLimit(number); 
		serializeStqIndex(stqIndex);
	}

	public void setStqIndex(int number) {
	    number = checkStqIndexMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setStqIndex((short)number);
	}
	public void setStqIndex(long number) {
	    number = checkStqIndexMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setStqIndex((short)number);
	}
	

    /**
	 *	Returns the value of stqCurrency
	 *  Corresponding COBOL Variable is WS-STQ-CURRENCY
	 *	@return stqCurrency
	 */
	public List<char[]> getStqCurrency() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < STQ_CURRENCY_SIZE;index++) {
        	list.add( getStqCurrency( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return stqCurrency
	 */
	public char[] getStqCurrency(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getStqCurrency(), resetting it to 0",index);
		    index = 0;
        } else if (index >= STQ_CURRENCY_SIZE) {
             	index = STQ_CURRENCY_SIZE -1; // can't exceed max array size
             	logger.trace("stqCurrency - Array index exceeded max Size {}, resetting it to max allowed",STQ_CURRENCY_SIZE); 
	    }
   	      return getCharArray( (beginStqCurrency + index*STQ_CURRENCY_LEN) , STQ_CURRENCY_LEN );
    }
    
    
   public int  stqCurrencyFieldLength() {
   	return STQ_CURRENCY_LEN;
   }
   
	

  
  	/**
	 *	Update StqCurrency with the passed value at a given index
	 *  Corresponding COBOL Variable is WS-STQ-CURRENCY
	 *  @param index
	 *	@param value
	 */
  public void setStqCurrency(int index,char[] value) {
   	setStqCurrency(index,value,true);
   }
   
   
   /**
	 *	Update StqCurrency with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setStqCurrency(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setStqCurrency(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 3)  {     
		       value = substring(value,0,3);
           }  else if (value.length < 3) {
		       value = pad(3, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(3).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeStqCurrency(index,value);		
       }
   }
   
    /**
	 *	Returns the value of stqTrdpair
	 *  Corresponding COBOL Variable is WS-STQ-TRDPAIR
	 *	@return stqTrdpair
	 */
	public List<char[]> getStqTrdpair() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < STQ_TRDPAIR_SIZE;index++) {
        	list.add( getStqTrdpair( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return stqTrdpair
	 */
	public char[] getStqTrdpair(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getStqTrdpair(), resetting it to 0",index);
		    index = 0;
        } else if (index >= STQ_TRDPAIR_SIZE) {
             	index = STQ_TRDPAIR_SIZE -1; // can't exceed max array size
             	logger.trace("stqTrdpair - Array index exceeded max Size {}, resetting it to max allowed",STQ_TRDPAIR_SIZE); 
	    }
   	      return getCharArray( (beginStqTrdpair + index*STQ_TRDPAIR_LEN) , STQ_TRDPAIR_LEN );
    }
    
    
   public int  stqTrdpairFieldLength() {
   	return STQ_TRDPAIR_LEN;
   }
   
	

  
  	/**
	 *	Update StqTrdpair with the passed value at a given index
	 *  Corresponding COBOL Variable is WS-STQ-TRDPAIR
	 *  @param index
	 *	@param value
	 */
  public void setStqTrdpair(int index,char[] value) {
   	setStqTrdpair(index,value,true);
   }
   
   
   /**
	 *	Update StqTrdpair with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setStqTrdpair(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setStqTrdpair(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 88)  {     
		       value = substring(value,0,88);
           }  else if (value.length < 88) {
		       value = pad(88, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(88).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeStqTrdpair(index,value);		
       }
   }
   

	
	
	

		public static int getSettlmentQueueTableFieldLength() {
			return SETTLMENT_QUEUE_TABLE_LENGTH;
		}

}
  
