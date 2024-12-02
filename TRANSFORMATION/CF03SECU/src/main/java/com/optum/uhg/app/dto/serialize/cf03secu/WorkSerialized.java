package com.optum.uhg.app.dto.serialize.cf03secu;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-02 at 20:31. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCounter;
            protected  int beginSqlcode_Ws;
	
	/**
	* Constructor for WorkSerialized
	**/
    public WorkSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WorkSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WORK_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCounter = getStartOffset() + 0;	// set offset for serialization
  
             beginSqlcode_Ws = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCounterCounter = -1;
     public boolean isCounterModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCounterCounter != sharedCounter;
         localCounterCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of counter
	 *	@return counter
	 */
	public char[]  getCounterString() {
	     return getCharArray(beginCounter,COUNTER_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean counterIsNumeric() {
	    return isNumeric(beginCounter
	                    ,beginCounter + COUNTER_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int COUNTER_LEN = 4;
  	/**
	 * serializeCounter
	 */
	protected void serializeCounter(int counter) {
		 putNumber(beginCounter,counter,COUNTER_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCounterCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCounter
	 */
   	protected  int serializeCounter(char[] value) {
	    int  counter;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    counter = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginCounter
		       ,4
		      );
		 localCounterCounter = shareString.getSerializedField().getModifiedCounter();
		return  counter;
    }

   protected int checkCounterMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCounter is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCounter() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCounter
			                 ,COUNTER_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("counter", beginCounter,COUNTER_LEN);
    }
   	}
     int localSqlcode_WsCounter = -1;
     public boolean isSqlcode_WsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlcode_WsCounter != sharedCounter;
         localSqlcode_WsCounter = sharedCounter; return hasModified;
     }
	protected static final int SQLCODE__WS_LEN = 4;
	/**
	 * 	serialize this Sqlcode_Ws
	 */
   protected void serializeSqlcode_Ws(char[] sqlcode_Ws) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sqlcode_Ws,0,getStringValue(),beginSqlcode_Ws,SQLCODE__WS_LEN);
       localSqlcode_WsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSqlcode_WsConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshSqlcode_Ws is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSqlcode_Ws() {	 
   		return (substring(getStringValue(),beginSqlcode_Ws,beginSqlcode_Ws + SQLCODE__WS_LEN));
   	}




}
  
