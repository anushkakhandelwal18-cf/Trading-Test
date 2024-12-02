package com.cloudframe.app.cfbooks.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-02 at 03:00. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginErrCode;
            protected  int beginRepopStat;
            protected  int beginWriteRec;
	
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
  
  
  
  
  
  
  
  
             beginErrCode = getStartOffset() + 0;	// set offset for serialization
  
             beginRepopStat = getStartOffset() + 9;	// set offset for serialization
  
  
             beginWriteRec = getStartOffset() + 11;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSpaceCounter = -1;
     public boolean isSpaceModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSpaceCounter != sharedCounter;
         localSpaceCounter = sharedCounter; return hasModified;
     }

   protected char[] checkSpaceConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localHeaderLabelCounter = -1;
     public boolean isHeaderLabelModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHeaderLabelCounter != sharedCounter;
         localHeaderLabelCounter = sharedCounter; return hasModified;
     }

   protected char[] checkHeaderLabelConstraints(char[] value) {
   			return super.checkConstraints(value , 132 ,false, false);
   }
     int localHeaderLineCounter = -1;
     public boolean isHeaderLineModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHeaderLineCounter != sharedCounter;
         localHeaderLineCounter = sharedCounter; return hasModified;
     }

   protected char[] checkHeaderLineConstraints(char[] value) {
   			return super.checkConstraints(value , 132 ,false, false);
   }
     int localPageBreakCounter = -1;
     public boolean isPageBreakModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPageBreakCounter != sharedCounter;
         localPageBreakCounter = sharedCounter; return hasModified;
     }

   protected char[] checkPageBreakConstraints(char[] value) {
   			return super.checkConstraints(value , 132 ,false, false);
   }
     int localFooterCounter = -1;
     public boolean isFooterModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFooterCounter != sharedCounter;
         localFooterCounter = sharedCounter; return hasModified;
     }

   protected char[] checkFooterConstraints(char[] value) {
   			return super.checkConstraints(value , 132 ,false, false);
   }
     int localErrPgmCounter = -1;
     public boolean isErrPgmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrPgmCounter != sharedCounter;
         localErrPgmCounter = sharedCounter; return hasModified;
     }

   protected char[] checkErrPgmConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
     int localErrLocCounter = -1;
     public boolean isErrLocModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrLocCounter != sharedCounter;
         localErrLocCounter = sharedCounter; return hasModified;
     }

   protected char[] checkErrLocConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
     int localErrMsgCounter = -1;
     public boolean isErrMsgModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrMsgCounter != sharedCounter;
         localErrMsgCounter = sharedCounter; return hasModified;
     }

   protected char[] checkErrMsgConstraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localErrCodeCounter = -1;
     public boolean isErrCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrCodeCounter != sharedCounter;
         localErrCodeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of errCode
	 *	@return errCode
	 */
	public char[]  getErrCodeString() {
	     return getCharArray(beginErrCode,ERR_CODE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean errCodeIsNumeric() {
	    return isNumeric(beginErrCode
	                    ,beginErrCode + ERR_CODE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ERR_CODE_LEN = 9;
  	/**
	 * serializeErrCode
	 */
	protected void serializeErrCode(long errCode) {
		 putNumber(beginErrCode,errCode,ERR_CODE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localErrCodeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeErrCode
	 */
   	protected  long serializeErrCode(char[] value) {
	    long  errCode;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    errCode = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginErrCode
		       ,9
		      );
		 localErrCodeCounter = shareString.getSerializedField().getModifiedCounter();
		return  errCode;
    }

   protected long checkErrCodeMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshErrCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshErrCode() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginErrCode
			                 ,ERR_CODE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("errCode", beginErrCode,ERR_CODE_LEN);
    }
   	}
     int localRepopStatCounter = -1;
     public boolean isRepopStatModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRepopStatCounter != sharedCounter;
         localRepopStatCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of repopStat
	 *	@return repopStat
	 */
	public char[]  getRepopStatString() {
	     return getCharArray(beginRepopStat,REPOP_STAT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean repopStatIsNumeric() {
	    return isNumeric(beginRepopStat
	                    ,beginRepopStat + REPOP_STAT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int REPOP_STAT_LEN = 2;
  	/**
	 * serializeRepopStat
	 */
	protected void serializeRepopStat(int repopStat) {
		 putNumber(beginRepopStat,repopStat,REPOP_STAT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localRepopStatCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeRepopStat
	 */
   	protected  int serializeRepopStat(char[] value) {
	    int  repopStat;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    repopStat = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginRepopStat
		       ,2
		      );
		 localRepopStatCounter = shareString.getSerializedField().getModifiedCounter();
		return  repopStat;
    }

   protected int checkRepopStatMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshRepopStat is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshRepopStat() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginRepopStat
			                 ,REPOP_STAT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("repopStat", beginRepopStat,REPOP_STAT_LEN);
    }
   	}
     int localEofFlagCounter = -1;
     public boolean isEofFlagModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEofFlagCounter != sharedCounter;
         localEofFlagCounter = sharedCounter; return hasModified;
     }

   protected char[] checkEofFlagConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localWriteRecCounter = -1;
     public boolean isWriteRecModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWriteRecCounter != sharedCounter;
         localWriteRecCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of writeRec
	 *	@return writeRec
	 */
	public char[]  getWriteRecString() {
	     return getCharArray(beginWriteRec,WRITE_REC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean writeRecIsNumeric() {
	    return isNumeric(beginWriteRec
	                    ,beginWriteRec + WRITE_REC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WRITE_REC_LEN = 1;
  	/**
	 * serializeWriteRec
	 */
	protected void serializeWriteRec(int writeRec) {
		 putNumber(beginWriteRec,writeRec,WRITE_REC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWriteRecCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWriteRec
	 */
   	protected  int serializeWriteRec(char[] value) {
	    int  writeRec;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    writeRec = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginWriteRec
		       ,1
		      );
		 localWriteRecCounter = shareString.getSerializedField().getModifiedCounter();
		return  writeRec;
    }

   protected int checkWriteRecMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWriteRec is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWriteRec() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWriteRec
			                 ,WRITE_REC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("writeRec", beginWriteRec,WRITE_REC_LEN);
    }
   	}




}
  
