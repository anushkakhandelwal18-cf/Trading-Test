package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class Db2ErrMsgSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Db2ErrMsgSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Db2ErrMsgSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DB_2_ERR_MSG_LENGTH = 788;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDb2ErrMsgLen;
           protected int beginDb2ErrMsgText;
           protected static final int DB_2_ERR_MSG_TEXT_SIZE = 10;
            protected  int beginDb2ErrMsgTextLen;
            protected  int beginISub;
	
	/**
	* Constructor for Db2ErrMsgSerialized
	**/
    public Db2ErrMsgSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Db2ErrMsgSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DB_2_ERR_MSG_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDb2ErrMsgLen = getStartOffset() + 0;	// set offset for serialization
  
	        beginDb2ErrMsgText = getStartOffset() + 2; // set offset for serialization
  
             beginDb2ErrMsgTextLen = getStartOffset() + 782;	// set offset for serialization
  
             beginISub = getStartOffset() + 786;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localDb2ErrMsgLenCounter = -1;
         public boolean isDb2ErrMsgLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localDb2ErrMsgLenCounter != sharedCounter;
            localDb2ErrMsgLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int DB_2_ERR_MSG_LEN_LEN = 2;
  	/**
	 * serializeDb2ErrMsgLen
	 */
	protected void serializeDb2ErrMsgLen(short db2ErrMsgLen) {
           replaceValue( //  save the value as string
                   getBinaryString( db2ErrMsgLen,DB_2_ERR_MSG_LEN_LEN)
                  ,beginDb2ErrMsgLen
                  ,DB_2_ERR_MSG_LEN_LEN
                 );
            localDb2ErrMsgLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkDb2ErrMsgLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshDb2ErrMsgLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshDb2ErrMsgLen() {	 
			return (getShort(beginDb2ErrMsgLen));
   	}
 
   
  protected  static final int DB_2_ERR_MSG_TEXT_LEN = 78;
   /**
	 *	serializeDb2ErrMsgText as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeDb2ErrMsgText(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginDb2ErrMsgText + index*DB_2_ERR_MSG_TEXT_LEN)
   	          , DB_2_ERR_MSG_TEXT_LEN 
   	          );
   }
         int localDb2ErrMsgTextLenCounter = -1;
         public boolean isDb2ErrMsgTextLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localDb2ErrMsgTextLenCounter != sharedCounter;
            localDb2ErrMsgTextLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int DB_2_ERR_MSG_TEXT_LEN_LEN = 4;
  	/**
	 * serializeDb2ErrMsgTextLen
	 */
	protected void serializeDb2ErrMsgTextLen(int db2ErrMsgTextLen) {
           replaceValue( //  save the value as string
                   getBinaryString( db2ErrMsgTextLen,DB_2_ERR_MSG_TEXT_LEN_LEN)
                  ,beginDb2ErrMsgTextLen
                  ,DB_2_ERR_MSG_TEXT_LEN_LEN
                 );
            localDb2ErrMsgTextLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkDb2ErrMsgTextLenMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshDb2ErrMsgTextLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDb2ErrMsgTextLen() {	 
			return (getInt(beginDb2ErrMsgTextLen));
   	}
         int localISubCounter = -1;
         public boolean isISubModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localISubCounter != sharedCounter;
            localISubCounter = sharedCounter; return hasModified; 
         }
   protected static final int I_SUB_LEN = 2;
  	/**
	 * serializeISub
	 */
	protected void serializeISub(short iSub) {
           replaceValue( //  save the value as string
                   getBinaryString( iSub,I_SUB_LEN)
                  ,beginISub
                  ,I_SUB_LEN
                 );
            localISubCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkISubMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshISub is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshISub() {	 
			return (getShort(beginISub));
   	}

		public int db2ErrMsgTextSize() {
			return DB_2_ERR_MSG_TEXT_SIZE;
		}



}
  
