package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class W02DsplMsgAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class W02DsplMsgAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(W02DsplMsgAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int W_02_DSPL_MSG_AREA_LENGTH = 132;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginW02MqTime;
            protected  int beginW02DsplErrInd;
            protected  int beginW02DsplMsg;
            protected  int beginW02RespCd;
            protected  int beginW02AbendingProg;
            protected  int beginW02MainProg;
            protected  int beginW02FnuIcn;
	
	/**
	* Constructor for W02DsplMsgAreaSerialized
	**/
    public W02DsplMsgAreaSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in W02DsplMsgAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(W_02_DSPL_MSG_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginW02MqTime = getStartOffset() + 3;	// set offset for serialization
  
  
             beginW02DsplErrInd = getStartOffset() + 14;	// set offset for serialization
  
             beginW02DsplMsg = getStartOffset() + 17;	// set offset for serialization
  
  
             beginW02RespCd = getStartOffset() + 93;	// set offset for serialization
  
  
             beginW02AbendingProg = getStartOffset() + 107;	// set offset for serialization
  
  
             beginW02MainProg = getStartOffset() + 116;	// set offset for serialization
  
  
             beginW02FnuIcn = getStartOffset() + 122;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localW02MqTimeCounter = -1;
     public boolean isW02MqTimeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localW02MqTimeCounter != sharedCounter;
         localW02MqTimeCounter = sharedCounter; return hasModified;
     }
	protected static final int W_02_MQ_TIME_LEN = 8;
	/**
	 * 	serialize this W02MqTime
	 */
   protected void serializeW02MqTime(char[] w02MqTime) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(w02MqTime,0,getStringValue(),beginW02MqTime,W_02_MQ_TIME_LEN);
       localW02MqTimeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkW02MqTimeConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshW02MqTime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshW02MqTime() {	 
   		return (substring(getStringValue(),beginW02MqTime,beginW02MqTime + W_02_MQ_TIME_LEN));
   	}
     int localW02DsplErrIndCounter = -1;
     public boolean isW02DsplErrIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localW02DsplErrIndCounter != sharedCounter;
         localW02DsplErrIndCounter = sharedCounter; return hasModified;
     }
	protected static final int W_02_DSPL_ERR_IND_LEN = 3;
	/**
	 * 	serialize this W02DsplErrInd
	 */
   protected void serializeW02DsplErrInd(char[] w02DsplErrInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(w02DsplErrInd,0,getStringValue(),beginW02DsplErrInd,W_02_DSPL_ERR_IND_LEN);
       localW02DsplErrIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkW02DsplErrIndConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshW02DsplErrInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshW02DsplErrInd() {	 
   		return (substring(getStringValue(),beginW02DsplErrInd,beginW02DsplErrInd + W_02_DSPL_ERR_IND_LEN));
   	}
     int localW02DsplMsgCounter = -1;
     public boolean isW02DsplMsgModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localW02DsplMsgCounter != sharedCounter;
         localW02DsplMsgCounter = sharedCounter; return hasModified;
     }
	protected static final int W_02_DSPL_MSG_LEN = 73;
	/**
	 * 	serialize this W02DsplMsg
	 */
   protected void serializeW02DsplMsg(char[] w02DsplMsg) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(w02DsplMsg,0,getStringValue(),beginW02DsplMsg,W_02_DSPL_MSG_LEN);
       localW02DsplMsgCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkW02DsplMsgConstraints(char[] value) {
   			return super.checkConstraints(value , 73 ,false, false);
   }
    /**
	 *	refreshW02DsplMsg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshW02DsplMsg() {	 
   		return (substring(getStringValue(),beginW02DsplMsg,beginW02DsplMsg + W_02_DSPL_MSG_LEN));
   	}
     int localW02RespCdCounter = -1;
     public boolean isW02RespCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localW02RespCdCounter != sharedCounter;
         localW02RespCdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of w02RespCd
	 *	@return w02RespCd
	 */
	public char[]  getW02RespCdString() {
	     return getCharArray(beginW02RespCd,W_02_RESP_CD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean w02RespCdIsNumeric() {
	    return isNumeric(beginW02RespCd
	                    ,beginW02RespCd + W_02_RESP_CD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int W_02_RESP_CD_LEN = 8;
  	/**
	 * serializeW02RespCd
	 */
	protected void serializeW02RespCd(long w02RespCd) {
		 putNumber(beginW02RespCd,w02RespCd,W_02_RESP_CD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localW02RespCdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeW02RespCd
	 */
   	protected  long serializeW02RespCd(char[] value) {
	    long  w02RespCd;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    w02RespCd = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginW02RespCd
		       ,8
		      );
		 localW02RespCdCounter = shareString.getSerializedField().getModifiedCounter();
		return  w02RespCd;
    }

   protected long checkW02RespCdMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshW02RespCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshW02RespCd() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginW02RespCd
			                 ,W_02_RESP_CD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("w02RespCd", beginW02RespCd,W_02_RESP_CD_LEN);
    }
   	}
     int localW02AbendingProgCounter = -1;
     public boolean isW02AbendingProgModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localW02AbendingProgCounter != sharedCounter;
         localW02AbendingProgCounter = sharedCounter; return hasModified;
     }
	protected static final int W_02_ABENDING_PROG_LEN = 8;
	/**
	 * 	serialize this W02AbendingProg
	 */
   protected void serializeW02AbendingProg(char[] w02AbendingProg) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(w02AbendingProg,0,getStringValue(),beginW02AbendingProg,W_02_ABENDING_PROG_LEN);
       localW02AbendingProgCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkW02AbendingProgConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshW02AbendingProg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshW02AbendingProg() {	 
   		return (substring(getStringValue(),beginW02AbendingProg,beginW02AbendingProg + W_02_ABENDING_PROG_LEN));
   	}
     int localW02MainProgCounter = -1;
     public boolean isW02MainProgModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localW02MainProgCounter != sharedCounter;
         localW02MainProgCounter = sharedCounter; return hasModified;
     }
	protected static final int W_02_MAIN_PROG_LEN = 3;
	/**
	 * 	serialize this W02MainProg
	 */
   protected void serializeW02MainProg(char[] w02MainProg) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(w02MainProg,0,getStringValue(),beginW02MainProg,W_02_MAIN_PROG_LEN);
       localW02MainProgCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkW02MainProgConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshW02MainProg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshW02MainProg() {	 
   		return (substring(getStringValue(),beginW02MainProg,beginW02MainProg + W_02_MAIN_PROG_LEN));
   	}
     int localW02FnuIcnCounter = -1;
     public boolean isW02FnuIcnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localW02FnuIcnCounter != sharedCounter;
         localW02FnuIcnCounter = sharedCounter; return hasModified;
     }
	protected static final int W_02_FNU_ICN_LEN = 10;
	/**
	 * 	serialize this W02FnuIcn
	 */
   protected void serializeW02FnuIcn(char[] w02FnuIcn) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(w02FnuIcn,0,getStringValue(),beginW02FnuIcn,W_02_FNU_ICN_LEN);
       localW02FnuIcnCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkW02FnuIcnConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshW02FnuIcn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshW02FnuIcn() {	 
   		return (substring(getStringValue(),beginW02FnuIcn,beginW02FnuIcn + W_02_FNU_ICN_LEN));
   	}




}
  
