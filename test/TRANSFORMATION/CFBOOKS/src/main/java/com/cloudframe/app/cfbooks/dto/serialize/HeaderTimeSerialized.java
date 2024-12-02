package com.cloudframe.app.cfbooks.dto.serialize;

/**
*  The class HeaderTimeSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-02 at 03:00. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HeaderTimeSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HeaderTimeSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HEADER_TIME_LENGTH = 132;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPageNo;
            protected  int beginTimeR;
	
	/**
	* Constructor for HeaderTimeSerialized
	**/
    public HeaderTimeSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in HeaderTimeSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HEADER_TIME_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginPageNo = getStartOffset() + 9;	// set offset for serialization
  
  
             beginTimeR = getStartOffset() + 119;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localPageNoCounter = -1;
     public boolean isPageNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPageNoCounter != sharedCounter;
         localPageNoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of pageNo
	 *	@return pageNo
	 */
	public char[]  getPageNoString() {
	     return getCharArray(beginPageNo,PAGE_NO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean pageNoIsNumeric() {
	    return isNumeric(beginPageNo
	                    ,beginPageNo + PAGE_NO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_NO_LEN = 4;
  	/**
	 * serializePageNo
	 */
	protected void serializePageNo(int pageNo) {
		 putNumber(beginPageNo,pageNo,PAGE_NO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPageNoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePageNo
	 */
   	protected  int serializePageNo(char[] value) {
	    int  pageNo;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    pageNo = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginPageNo
		       ,4
		      );
		 localPageNoCounter = shareString.getSerializedField().getModifiedCounter();
		return  pageNo;
    }

   protected int checkPageNoMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPageNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPageNo() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPageNo
			                 ,PAGE_NO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("pageNo", beginPageNo,PAGE_NO_LEN);
    }
   	}
     int localTimeRCounter = -1;
     public boolean isTimeRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTimeRCounter != sharedCounter;
         localTimeRCounter = sharedCounter; return hasModified;
     }
	protected static final int TIME_R_LEN = 12;
	/**
	 * 	serialize this TimeR
	 */
   protected void serializeTimeR(char[] timeR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(timeR,0,getStringValue(),beginTimeR,TIME_R_LEN);
       localTimeRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTimeRConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshTimeR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTimeR() {	 
   		return (substring(getStringValue(),beginTimeR,beginTimeR + TIME_R_LEN));
   	}




}
  
