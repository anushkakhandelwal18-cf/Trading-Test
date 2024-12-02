package com.cloudframe.app.cfbooks.dto.serialize;

/**
*  The class VarsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-02 at 03:00. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class VarsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(VarsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int VARS_LENGTH = 177;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTimestamp;
            protected  int beginBookid;
            protected  int beginRating;
            protected  int beginPages;
            protected  int beginPubid;
            protected  int beginRecCount;
            protected  int beginRecBuffer;
	
	/**
	* Constructor for VarsSerialized
	**/
    public VarsSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in VarsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(VARS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTimestamp = getStartOffset() + 0;	// set offset for serialization
  
             beginBookid = getStartOffset() + 23;	// set offset for serialization
  
             beginRating = getStartOffset() + 31;	// set offset for serialization
  
             beginPages = getStartOffset() + 35;	// set offset for serialization
  
             beginPubid = getStartOffset() + 39;	// set offset for serialization
  
             beginRecCount = getStartOffset() + 43;	// set offset for serialization
  
             beginRecBuffer = getStartOffset() + 45;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localTimestampCounter = -1;
     public boolean isTimestampModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTimestampCounter != sharedCounter;
         localTimestampCounter = sharedCounter; return hasModified;
     }
	protected static final int TIMESTAMP_LEN = 23;
	/**
	 * 	serialize this Timestamp
	 */
   protected void serializeTimestamp(char[] timestamp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(timestamp,0,getStringValue(),beginTimestamp,TIMESTAMP_LEN);
       localTimestampCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTimestampConstraints(char[] value) {
   			return super.checkConstraints(value , 23 ,false, false);
   }
    /**
	 *	refreshTimestamp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTimestamp() {	 
   		return (substring(getStringValue(),beginTimestamp,beginTimestamp + TIMESTAMP_LEN));
   	}
     int localBookidCounter = -1;
     public boolean isBookidModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBookidCounter != sharedCounter;
         localBookidCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bookid
	 *	@return bookid
	 */
	public char[]  getBookidString() {
	     return getCharArray(beginBookid,BOOKID_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bookidIsNumeric() {
	    return isNumeric(beginBookid
	                    ,beginBookid + BOOKID_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BOOKID_LEN = 8;
  	/**
	 * serializeBookid
	 */
	protected void serializeBookid(long bookid) {
		 putNumber(beginBookid,bookid,BOOKID_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBookidCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBookid
	 */
   	protected  long serializeBookid(char[] value) {
	    long  bookid;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bookid = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginBookid
		       ,8
		      );
		 localBookidCounter = shareString.getSerializedField().getModifiedCounter();
		return  bookid;
    }

   protected long checkBookidMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBookid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshBookid() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginBookid
			                 ,BOOKID_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bookid", beginBookid,BOOKID_LEN);
    }
   	}
     int localRatingCounter = -1;
     public boolean isRatingModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRatingCounter != sharedCounter;
         localRatingCounter = sharedCounter; return hasModified;
     }
	protected static final int RATING_LEN = 4;
	/**
	 * 	serialize this Rating
	 */
   protected void serializeRating(char[] rating) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rating,0,getStringValue(),beginRating,RATING_LEN);
       localRatingCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRatingConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRating is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRating() {	 
   		return (substring(getStringValue(),beginRating,beginRating + RATING_LEN));
   	}
     int localPagesCounter = -1;
     public boolean isPagesModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPagesCounter != sharedCounter;
         localPagesCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of pages
	 *	@return pages
	 */
	public char[]  getPagesString() {
	     return getCharArray(beginPages,PAGES_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean pagesIsNumeric() {
	    return isNumeric(beginPages
	                    ,beginPages + PAGES_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGES_LEN = 4;
  	/**
	 * serializePages
	 */
	protected void serializePages(int pages) {
		 putNumber(beginPages,pages,PAGES_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPagesCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePages
	 */
   	protected  int serializePages(char[] value) {
	    int  pages;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    pages = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginPages
		       ,4
		      );
		 localPagesCounter = shareString.getSerializedField().getModifiedCounter();
		return  pages;
    }

   protected int checkPagesMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPages is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPages() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPages
			                 ,PAGES_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("pages", beginPages,PAGES_LEN);
    }
   	}
     int localPubidCounter = -1;
     public boolean isPubidModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPubidCounter != sharedCounter;
         localPubidCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of pubid
	 *	@return pubid
	 */
	public char[]  getPubidString() {
	     return getCharArray(beginPubid,PUBID_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean pubidIsNumeric() {
	    return isNumeric(beginPubid
	                    ,beginPubid + PUBID_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PUBID_LEN = 4;
  	/**
	 * serializePubid
	 */
	protected void serializePubid(int pubid) {
		 putNumber(beginPubid,pubid,PUBID_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPubidCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePubid
	 */
   	protected  int serializePubid(char[] value) {
	    int  pubid;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    pubid = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginPubid
		       ,4
		      );
		 localPubidCounter = shareString.getSerializedField().getModifiedCounter();
		return  pubid;
    }

   protected int checkPubidMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPubid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPubid() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPubid
			                 ,PUBID_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("pubid", beginPubid,PUBID_LEN);
    }
   	}
     int localRecCountCounter = -1;
     public boolean isRecCountModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRecCountCounter != sharedCounter;
         localRecCountCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of recCount
	 *	@return recCount
	 */
	public char[]  getRecCountString() {
	     return getCharArray(beginRecCount,REC_COUNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean recCountIsNumeric() {
	    return isNumeric(beginRecCount
	                    ,beginRecCount + REC_COUNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int REC_COUNT_LEN = 2;
  	/**
	 * serializeRecCount
	 */
	protected void serializeRecCount(int recCount) {
		 putNumber(beginRecCount,recCount,REC_COUNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRecCountCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRecCount
	 */
   	protected  int serializeRecCount(char[] value) {
	    int  recCount;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    recCount = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginRecCount
		       ,2
		      );
		 localRecCountCounter = shareString.getSerializedField().getModifiedCounter();
		return  recCount;
    }

   protected int checkRecCountMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRecCount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRecCount() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginRecCount
			                 ,REC_COUNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("recCount", beginRecCount,REC_COUNT_LEN);
    }
   	}
     int localRecBufferCounter = -1;
     public boolean isRecBufferModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRecBufferCounter != sharedCounter;
         localRecBufferCounter = sharedCounter; return hasModified;
     }
	protected static final int REC_BUFFER_LEN = 132;
	/**
	 * 	serialize this RecBuffer
	 */
   protected void serializeRecBuffer(char[] recBuffer) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(recBuffer,0,getStringValue(),beginRecBuffer,REC_BUFFER_LEN);
       localRecBufferCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRecBufferConstraints(char[] value) {
   			return super.checkConstraints(value , 132 ,false, false);
   }
    /**
	 *	refreshRecBuffer is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRecBuffer() {	 
   		return (substring(getStringValue(),beginRecBuffer,beginRecBuffer + REC_BUFFER_LEN));
   	}




}
  
