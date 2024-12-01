package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class W02FnuLineReadnextSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class W02FnuLineReadnextSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(W02FnuLineReadnextSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int W_02_FNU_LINE_READNEXT_LENGTH = 73;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginW02FnuTranRdnxt;
            protected  int beginW02FnuFileRdnxt;
            protected  int beginW02FnuKeyRdnxt;
	
	/**
	* Constructor for W02FnuLineReadnextSerialized
	**/
    public W02FnuLineReadnextSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in W02FnuLineReadnextSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(W_02_FNU_LINE_READNEXT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginW02FnuTranRdnxt = getStartOffset() + 0;	// set offset for serialization
  
  
             beginW02FnuFileRdnxt = getStartOffset() + 21;	// set offset for serialization
  
  
             beginW02FnuKeyRdnxt = getStartOffset() + 35;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localW02FnuTranRdnxtCounter = -1;
     public boolean isW02FnuTranRdnxtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localW02FnuTranRdnxtCounter != sharedCounter;
         localW02FnuTranRdnxtCounter = sharedCounter; return hasModified;
     }
	protected static final int W_02_FNU_TRAN_RDNXT_LEN = 4;
	/**
	 * 	serialize this W02FnuTranRdnxt
	 */
   protected void serializeW02FnuTranRdnxt(char[] w02FnuTranRdnxt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(w02FnuTranRdnxt,0,getStringValue(),beginW02FnuTranRdnxt,W_02_FNU_TRAN_RDNXT_LEN);
       localW02FnuTranRdnxtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkW02FnuTranRdnxtConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshW02FnuTranRdnxt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshW02FnuTranRdnxt() {	 
   		return (substring(getStringValue(),beginW02FnuTranRdnxt,beginW02FnuTranRdnxt + W_02_FNU_TRAN_RDNXT_LEN));
   	}
     int localW02FnuFileRdnxtCounter = -1;
     public boolean isW02FnuFileRdnxtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localW02FnuFileRdnxtCounter != sharedCounter;
         localW02FnuFileRdnxtCounter = sharedCounter; return hasModified;
     }
	protected static final int W_02_FNU_FILE_RDNXT_LEN = 8;
	/**
	 * 	serialize this W02FnuFileRdnxt
	 */
   protected void serializeW02FnuFileRdnxt(char[] w02FnuFileRdnxt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(w02FnuFileRdnxt,0,getStringValue(),beginW02FnuFileRdnxt,W_02_FNU_FILE_RDNXT_LEN);
       localW02FnuFileRdnxtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkW02FnuFileRdnxtConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshW02FnuFileRdnxt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshW02FnuFileRdnxt() {	 
   		return (substring(getStringValue(),beginW02FnuFileRdnxt,beginW02FnuFileRdnxt + W_02_FNU_FILE_RDNXT_LEN));
   	}
     int localW02FnuKeyRdnxtCounter = -1;
     public boolean isW02FnuKeyRdnxtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localW02FnuKeyRdnxtCounter != sharedCounter;
         localW02FnuKeyRdnxtCounter = sharedCounter; return hasModified;
     }
	protected static final int W_02_FNU_KEY_RDNXT_LEN = 38;
	/**
	 * 	serialize this W02FnuKeyRdnxt
	 */
   protected void serializeW02FnuKeyRdnxt(char[] w02FnuKeyRdnxt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(w02FnuKeyRdnxt,0,getStringValue(),beginW02FnuKeyRdnxt,W_02_FNU_KEY_RDNXT_LEN);
       localW02FnuKeyRdnxtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkW02FnuKeyRdnxtConstraints(char[] value) {
   			return super.checkConstraints(value , 38 ,false, false);
   }
    /**
	 *	refreshW02FnuKeyRdnxt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshW02FnuKeyRdnxt() {	 
   		return (substring(getStringValue(),beginW02FnuKeyRdnxt,beginW02FnuKeyRdnxt + W_02_FNU_KEY_RDNXT_LEN));
   	}




}
  
