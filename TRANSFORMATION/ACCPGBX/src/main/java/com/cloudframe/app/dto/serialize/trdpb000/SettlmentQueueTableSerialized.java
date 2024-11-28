package com.cloudframe.app.dto.serialize.trdpb000;

/**
*  The class SettlmentQueueTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-11-28 at 06:52. using version 5.0.0.158
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SettlmentQueueTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SettlmentQueueTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SETTLMENT_QUEUE_TABLE_LENGTH = 9102;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginStqIndex;
           protected int beginStqCurrency;
           protected static final int STQ_CURRENCY_SIZE = 100;
           protected int beginStqTrdpair;
           protected static final int STQ_TRDPAIR_SIZE = 100;
	
	/**
	* Constructor for SettlmentQueueTableSerialized
	**/
    public SettlmentQueueTableSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in SettlmentQueueTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SETTLMENT_QUEUE_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginStqIndex = getStartOffset() + 0;	// set offset for serialization
  
	        beginStqCurrency = getStartOffset() + 2; // set offset for serialization
  
	        beginStqTrdpair = getStartOffset() + 302; // set offset for serialization
  
	   /*  end of offset */
	}
         int localStqIndexCounter = -1;
         public boolean isStqIndexModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localStqIndexCounter != sharedCounter;
            localStqIndexCounter = sharedCounter; return hasModified; 
         }
   protected static final int STQ_INDEX_LEN = 2;
  	/**
	 * serializeStqIndex
	 */
	protected void serializeStqIndex(short stqIndex) {
           replaceValue( //  save the value as string
                   getBinaryString( stqIndex,STQ_INDEX_LEN)
                  ,beginStqIndex
                  ,STQ_INDEX_LEN
                 );
            localStqIndexCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkStqIndexMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshStqIndex is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshStqIndex() {	 
			return (getShort(beginStqIndex));
   	}
 
   
  protected  static final int STQ_CURRENCY_LEN = 3;
   /**
	 *	serializeStqCurrency as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeStqCurrency(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginStqCurrency + index*STQ_CURRENCY_LEN)
   	          , STQ_CURRENCY_LEN 
   	          );
   }
 
   
  protected  static final int STQ_TRDPAIR_LEN = 88;
   /**
	 *	serializeStqTrdpair as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeStqTrdpair(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginStqTrdpair + index*STQ_TRDPAIR_LEN)
   	          , STQ_TRDPAIR_LEN 
   	          );
   }

		public int stqCurrencySize() {
			return STQ_CURRENCY_SIZE;
		}
		public int stqTrdpairSize() {
			return STQ_TRDPAIR_SIZE;
		}



}
  
