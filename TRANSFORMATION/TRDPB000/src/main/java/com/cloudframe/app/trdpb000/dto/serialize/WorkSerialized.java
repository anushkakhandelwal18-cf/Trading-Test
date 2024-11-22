package com.cloudframe.app.trdpb000.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-11-22 at 10:29. using version 5.0.0.158
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 22;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSqlcode_Ws;
            protected  int beginAccDisp;
            protected  int beginTradeid;
	
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
  
             beginSqlcode_Ws = getStartOffset() + 0;	// set offset for serialization
  
             beginAccDisp = getStartOffset() + 4;	// set offset for serialization
  
             beginTradeid = getStartOffset() + 13;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
  
	   /*  end of offset */
	}
         int localOrderCountCounter = -1;
         public boolean isOrderCountModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localOrderCountCounter != sharedCounter;
            localOrderCountCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkOrderCountMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
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
     int localAccDispCounter = -1;
     public boolean isAccDispModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAccDispCounter != sharedCounter;
         localAccDispCounter = sharedCounter; return hasModified;
     }
	protected static final int ACC_DISP_LEN = 9;
	/**
	 * 	serialize this AccDisp
	 */
   protected void serializeAccDisp(char[] accDisp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(accDisp,0,getStringValue(),beginAccDisp,ACC_DISP_LEN);
       localAccDispCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAccDispConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshAccDisp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAccDisp() {	 
   		return (substring(getStringValue(),beginAccDisp,beginAccDisp + ACC_DISP_LEN));
   	}
     int localTradeidCounter = -1;
     public boolean isTradeidModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTradeidCounter != sharedCounter;
         localTradeidCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tradeid
	 *	@return tradeid
	 */
	public char[]  getTradeidString() {
	     return getCharArray(beginTradeid,TRADEID_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tradeidIsNumeric() {
	    return isNumeric(beginTradeid
	                    ,beginTradeid + TRADEID_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TRADEID_LEN = 9;
  	/**
	 * serializeTradeid
	 */
	protected void serializeTradeid(long tradeid) {
		 putNumber(beginTradeid,tradeid,TRADEID_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTradeidCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTradeid
	 */
   	protected  long serializeTradeid(char[] value) {
	    long  tradeid;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tradeid = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginTradeid
		       ,9
		      );
		 localTradeidCounter = shareString.getSerializedField().getModifiedCounter();
		return  tradeid;
    }

   protected long checkTradeidMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTradeid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTradeid() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTradeid
			                 ,TRADEID_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tradeid", beginTradeid,TRADEID_LEN);
    }
   	}
     int localCustomerCheckCounter = -1;
     public boolean isCustomerCheckModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCustomerCheckCounter != sharedCounter;
         localCustomerCheckCounter = sharedCounter; return hasModified;
     }

   protected char[] checkCustomerCheckConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localSecurityCheckCounter = -1;
     public boolean isSecurityCheckModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSecurityCheckCounter != sharedCounter;
         localSecurityCheckCounter = sharedCounter; return hasModified;
     }

   protected char[] checkSecurityCheckConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localCustomerSummaryWriteSwCounter = -1;
     public boolean isCustomerSummaryWriteSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCustomerSummaryWriteSwCounter != sharedCounter;
         localCustomerSummaryWriteSwCounter = sharedCounter; return hasModified;
     }

   protected char[] checkCustomerSummaryWriteSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localSummaryDebitCreditSwCounter = -1;
     public boolean isSummaryDebitCreditSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSummaryDebitCreditSwCounter != sharedCounter;
         localSummaryDebitCreditSwCounter = sharedCounter; return hasModified;
     }

   protected char[] checkSummaryDebitCreditSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localOrdersSwitchCounter = -1;
     public boolean isOrdersSwitchModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOrdersSwitchCounter != sharedCounter;
         localOrdersSwitchCounter = sharedCounter; return hasModified;
     }

   protected char[] checkOrdersSwitchConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localRetrySwitchCounter = -1;
     public boolean isRetrySwitchModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRetrySwitchCounter != sharedCounter;
         localRetrySwitchCounter = sharedCounter; return hasModified;
     }

   protected char[] checkRetrySwitchConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localOrderStatusCounter = -1;
     public boolean isOrderStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOrderStatusCounter != sharedCounter;
         localOrderStatusCounter = sharedCounter; return hasModified;
     }

   protected char[] checkOrderStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
     int localExceptionCounter = -1;
     public boolean isExceptionModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExceptionCounter != sharedCounter;
         localExceptionCounter = sharedCounter; return hasModified;
     }

   protected char[] checkExceptionConstraints(char[] value) {
   			return super.checkConstraints(value , 200 ,false, false);
   }
     int localExceptionHandlerCounter = -1;
     public boolean isExceptionHandlerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExceptionHandlerCounter != sharedCounter;
         localExceptionHandlerCounter = sharedCounter; return hasModified;
     }

   protected char[] checkExceptionHandlerConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
     int localCurrdateCounter = -1;
     public boolean isCurrdateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrdateCounter != sharedCounter;
         localCurrdateCounter = sharedCounter; return hasModified;
     }

   protected char[] checkCurrdateConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localCurrtimeCounter = -1;
     public boolean isCurrtimeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrtimeCounter != sharedCounter;
         localCurrtimeCounter = sharedCounter; return hasModified;
     }

   protected char[] checkCurrtimeConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localExcpTypeCounter = -1;
     public boolean isExcpTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExcpTypeCounter != sharedCounter;
         localExcpTypeCounter = sharedCounter; return hasModified;
     }

   protected char[] checkExcpTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }




}
  
