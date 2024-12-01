package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class W02FnuLineStartbrSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class W02FnuLineStartbrSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(W02FnuLineStartbrSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int W_02_FNU_LINE_STARTBR_LENGTH = 73;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginW02FnuTranStbr;
            protected  int beginW02FnuFileStbr;
            protected  int beginW02FnuKeyStbr;
	
	/**
	* Constructor for W02FnuLineStartbrSerialized
	**/
    public W02FnuLineStartbrSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in W02FnuLineStartbrSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(W_02_FNU_LINE_STARTBR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginW02FnuTranStbr = getStartOffset() + 0;	// set offset for serialization
  
  
             beginW02FnuFileStbr = getStartOffset() + 21;	// set offset for serialization
  
  
             beginW02FnuKeyStbr = getStartOffset() + 35;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localW02FnuTranStbrCounter = -1;
     public boolean isW02FnuTranStbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localW02FnuTranStbrCounter != sharedCounter;
         localW02FnuTranStbrCounter = sharedCounter; return hasModified;
     }
	protected static final int W_02_FNU_TRAN_STBR_LEN = 4;
	/**
	 * 	serialize this W02FnuTranStbr
	 */
   protected void serializeW02FnuTranStbr(char[] w02FnuTranStbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(w02FnuTranStbr,0,getStringValue(),beginW02FnuTranStbr,W_02_FNU_TRAN_STBR_LEN);
       localW02FnuTranStbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkW02FnuTranStbrConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshW02FnuTranStbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshW02FnuTranStbr() {	 
   		return (substring(getStringValue(),beginW02FnuTranStbr,beginW02FnuTranStbr + W_02_FNU_TRAN_STBR_LEN));
   	}
     int localW02FnuFileStbrCounter = -1;
     public boolean isW02FnuFileStbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localW02FnuFileStbrCounter != sharedCounter;
         localW02FnuFileStbrCounter = sharedCounter; return hasModified;
     }
	protected static final int W_02_FNU_FILE_STBR_LEN = 8;
	/**
	 * 	serialize this W02FnuFileStbr
	 */
   protected void serializeW02FnuFileStbr(char[] w02FnuFileStbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(w02FnuFileStbr,0,getStringValue(),beginW02FnuFileStbr,W_02_FNU_FILE_STBR_LEN);
       localW02FnuFileStbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkW02FnuFileStbrConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshW02FnuFileStbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshW02FnuFileStbr() {	 
   		return (substring(getStringValue(),beginW02FnuFileStbr,beginW02FnuFileStbr + W_02_FNU_FILE_STBR_LEN));
   	}
     int localW02FnuKeyStbrCounter = -1;
     public boolean isW02FnuKeyStbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localW02FnuKeyStbrCounter != sharedCounter;
         localW02FnuKeyStbrCounter = sharedCounter; return hasModified;
     }
	protected static final int W_02_FNU_KEY_STBR_LEN = 38;
	/**
	 * 	serialize this W02FnuKeyStbr
	 */
   protected void serializeW02FnuKeyStbr(char[] w02FnuKeyStbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(w02FnuKeyStbr,0,getStringValue(),beginW02FnuKeyStbr,W_02_FNU_KEY_STBR_LEN);
       localW02FnuKeyStbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkW02FnuKeyStbrConstraints(char[] value) {
   			return super.checkConstraints(value , 38 ,false, false);
   }
    /**
	 *	refreshW02FnuKeyStbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshW02FnuKeyStbr() {	 
   		return (substring(getStringValue(),beginW02FnuKeyStbr,beginW02FnuKeyStbr + W_02_FNU_KEY_STBR_LEN));
   	}




}
  
