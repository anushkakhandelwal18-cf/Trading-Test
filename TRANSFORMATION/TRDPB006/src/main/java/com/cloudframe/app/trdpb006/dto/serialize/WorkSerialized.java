package com.cloudframe.app.trdpb006.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-02 at 13:21. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 7;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPagenum;
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
  
             beginPagenum = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
             beginSqlcode_Ws = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localReporderFileStatusCounter = -1;
     public boolean isReporderFileStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localReporderFileStatusCounter != sharedCounter;
         localReporderFileStatusCounter = sharedCounter; return hasModified;
     }

   protected char[] checkReporderFileStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localPagenumCounter = -1;
     public boolean isPagenumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPagenumCounter != sharedCounter;
         localPagenumCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of pagenum
	 *	@return pagenum
	 */
	public char[]  getPagenumString() {
	     return getCharArray(beginPagenum,PAGENUM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean pagenumIsNumeric() {
	    return isNumeric(beginPagenum
	                    ,beginPagenum + PAGENUM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGENUM_LEN = 3;
  	/**
	 * serializePagenum
	 */
	protected void serializePagenum(int pagenum) {
		 putNumber(beginPagenum,pagenum,PAGENUM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPagenumCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePagenum
	 */
   	protected  int serializePagenum(char[] value) {
	    int  pagenum;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    pagenum = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginPagenum
		       ,3
		      );
		 localPagenumCounter = shareString.getSerializedField().getModifiedCounter();
		return  pagenum;
    }

   protected int checkPagenumMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPagenum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPagenum() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPagenum
			                 ,PAGENUM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("pagenum", beginPagenum,PAGENUM_LEN);
    }
   	}
     int localPrintHeaderCounter = -1;
     public boolean isPrintHeaderModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrintHeaderCounter != sharedCounter;
         localPrintHeaderCounter = sharedCounter; return hasModified;
     }

   protected char[] checkPrintHeaderConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localEndOfOrdersSwCounter = -1;
     public boolean isEndOfOrdersSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEndOfOrdersSwCounter != sharedCounter;
         localEndOfOrdersSwCounter = sharedCounter; return hasModified;
     }

   protected char[] checkEndOfOrdersSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localEmptyHdrCounter = -1;
     public boolean isEmptyHdrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEmptyHdrCounter != sharedCounter;
         localEmptyHdrCounter = sharedCounter; return hasModified;
     }

   protected char[] checkEmptyHdrConstraints(char[] value) {
   			return super.checkConstraints(value , 160 ,false, false);
   }
     int localDetailHdr2Counter = -1;
     public boolean isDetailHdr2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDetailHdr2Counter != sharedCounter;
         localDetailHdr2Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDetailHdr2Constraints(char[] value) {
   			return super.checkConstraints(value , 159 ,false, false);
   }
     int localPrevCustidCounter = -1;
     public boolean isPrevCustidModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrevCustidCounter != sharedCounter;
         localPrevCustidCounter = sharedCounter; return hasModified;
     }

   protected char[] checkPrevCustidConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
     int localPrevBuySellCounter = -1;
     public boolean isPrevBuySellModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrevBuySellCounter != sharedCounter;
         localPrevBuySellCounter = sharedCounter; return hasModified;
     }

   protected char[] checkPrevBuySellConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localPrevOrderStatusCounter = -1;
     public boolean isPrevOrderStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrevOrderStatusCounter != sharedCounter;
         localPrevOrderStatusCounter = sharedCounter; return hasModified;
     }

   protected char[] checkPrevOrderStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
         int localMaxOrdersPerPageCounter = -1;
         public boolean isMaxOrdersPerPageModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMaxOrdersPerPageCounter != sharedCounter;
            localMaxOrdersPerPageCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkMaxOrdersPerPageMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
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
     int localBuyerSellerCustIdCounter = -1;
     public boolean isBuyerSellerCustIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBuyerSellerCustIdCounter != sharedCounter;
         localBuyerSellerCustIdCounter = sharedCounter; return hasModified;
     }

   protected char[] checkBuyerSellerCustIdConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
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
  
