package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class W02FnuLineReadSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class W02FnuLineReadSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(W02FnuLineReadSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int W_02_FNU_LINE_READ_LENGTH = 72;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginW02FnuTranRd;
            protected  int beginW02FnuFileRd;
            protected  int beginW02FnuKeyRd;
	
	/**
	* Constructor for W02FnuLineReadSerialized
	**/
    public W02FnuLineReadSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in W02FnuLineReadSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(W_02_FNU_LINE_READ_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginW02FnuTranRd = getStartOffset() + 0;	// set offset for serialization
  
  
             beginW02FnuFileRd = getStartOffset() + 20;	// set offset for serialization
  
  
             beginW02FnuKeyRd = getStartOffset() + 34;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localW02FnuTranRdCounter = -1;
     public boolean isW02FnuTranRdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localW02FnuTranRdCounter != sharedCounter;
         localW02FnuTranRdCounter = sharedCounter; return hasModified;
     }
	protected static final int W_02_FNU_TRAN_RD_LEN = 4;
	/**
	 * 	serialize this W02FnuTranRd
	 */
   protected void serializeW02FnuTranRd(char[] w02FnuTranRd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(w02FnuTranRd,0,getStringValue(),beginW02FnuTranRd,W_02_FNU_TRAN_RD_LEN);
       localW02FnuTranRdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkW02FnuTranRdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshW02FnuTranRd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshW02FnuTranRd() {	 
   		return (substring(getStringValue(),beginW02FnuTranRd,beginW02FnuTranRd + W_02_FNU_TRAN_RD_LEN));
   	}
     int localW02FnuFileRdCounter = -1;
     public boolean isW02FnuFileRdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localW02FnuFileRdCounter != sharedCounter;
         localW02FnuFileRdCounter = sharedCounter; return hasModified;
     }
	protected static final int W_02_FNU_FILE_RD_LEN = 8;
	/**
	 * 	serialize this W02FnuFileRd
	 */
   protected void serializeW02FnuFileRd(char[] w02FnuFileRd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(w02FnuFileRd,0,getStringValue(),beginW02FnuFileRd,W_02_FNU_FILE_RD_LEN);
       localW02FnuFileRdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkW02FnuFileRdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshW02FnuFileRd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshW02FnuFileRd() {	 
   		return (substring(getStringValue(),beginW02FnuFileRd,beginW02FnuFileRd + W_02_FNU_FILE_RD_LEN));
   	}
     int localW02FnuKeyRdCounter = -1;
     public boolean isW02FnuKeyRdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localW02FnuKeyRdCounter != sharedCounter;
         localW02FnuKeyRdCounter = sharedCounter; return hasModified;
     }
	protected static final int W_02_FNU_KEY_RD_LEN = 38;
	/**
	 * 	serialize this W02FnuKeyRd
	 */
   protected void serializeW02FnuKeyRd(char[] w02FnuKeyRd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(w02FnuKeyRd,0,getStringValue(),beginW02FnuKeyRd,W_02_FNU_KEY_RD_LEN);
       localW02FnuKeyRdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkW02FnuKeyRdConstraints(char[] value) {
   			return super.checkConstraints(value , 38 ,false, false);
   }
    /**
	 *	refreshW02FnuKeyRd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshW02FnuKeyRd() {	 
   		return (substring(getStringValue(),beginW02FnuKeyRd,beginW02FnuKeyRd + W_02_FNU_KEY_RD_LEN));
   	}




}
  
