package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class NextKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class NextKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(NextKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int NEXT_KEY_LENGTH = 43;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginNextProcDt;
            protected  int beginNextProcTm;
            protected  int beginNextPgmIdLstCharVal;
            protected  int beginNextIcnSufxVersNbr;
            protected  int beginNextInvnCtlNbr;
            protected  int beginNextIcnSufxCd;
            protected  int beginNextLnId;
            protected  int beginNextHeaderCt;
	
	/**
	* Constructor for NextKeySerialized
	**/
    public NextKeySerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in NextKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(NEXT_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginNextProcDt = getStartOffset() + 0;	// set offset for serialization
  
             beginNextProcTm = getStartOffset() + 10;	// set offset for serialization
  
             beginNextPgmIdLstCharVal = getStartOffset() + 18;	// set offset for serialization
  
             beginNextIcnSufxVersNbr = getStartOffset() + 19;	// set offset for serialization
  
             beginNextInvnCtlNbr = getStartOffset() + 23;	// set offset for serialization
  
             beginNextIcnSufxCd = getStartOffset() + 33;	// set offset for serialization
  
             beginNextLnId = getStartOffset() + 35;	// set offset for serialization
  
             beginNextHeaderCt = getStartOffset() + 39;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localNextProcDtCounter = -1;
     public boolean isNextProcDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNextProcDtCounter != sharedCounter;
         localNextProcDtCounter = sharedCounter; return hasModified;
     }
	protected static final int NEXT_PROC_DT_LEN = 10;
	/**
	 * 	serialize this NextProcDt
	 */
   protected void serializeNextProcDt(char[] nextProcDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(nextProcDt,0,getStringValue(),beginNextProcDt,NEXT_PROC_DT_LEN);
       localNextProcDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkNextProcDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshNextProcDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshNextProcDt() {	 
   		return (substring(getStringValue(),beginNextProcDt,beginNextProcDt + NEXT_PROC_DT_LEN));
   	}
     int localNextProcTmCounter = -1;
     public boolean isNextProcTmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNextProcTmCounter != sharedCounter;
         localNextProcTmCounter = sharedCounter; return hasModified;
     }
	protected static final int NEXT_PROC_TM_LEN = 8;
	/**
	 * 	serialize this NextProcTm
	 */
   protected void serializeNextProcTm(char[] nextProcTm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(nextProcTm,0,getStringValue(),beginNextProcTm,NEXT_PROC_TM_LEN);
       localNextProcTmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkNextProcTmConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshNextProcTm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshNextProcTm() {	 
   		return (substring(getStringValue(),beginNextProcTm,beginNextProcTm + NEXT_PROC_TM_LEN));
   	}
     int localNextPgmIdLstCharValCounter = -1;
     public boolean isNextPgmIdLstCharValModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNextPgmIdLstCharValCounter != sharedCounter;
         localNextPgmIdLstCharValCounter = sharedCounter; return hasModified;
     }
	protected static final int NEXT_PGM_ID_LST_CHAR_VAL_LEN = 1;
	/**
	 * 	serialize this NextPgmIdLstCharVal
	 */
   protected void serializeNextPgmIdLstCharVal(char[] nextPgmIdLstCharVal) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(nextPgmIdLstCharVal,0,getStringValue(),beginNextPgmIdLstCharVal,NEXT_PGM_ID_LST_CHAR_VAL_LEN);
       localNextPgmIdLstCharValCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkNextPgmIdLstCharValConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshNextPgmIdLstCharVal is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshNextPgmIdLstCharVal() {	 
   		return (substring(getStringValue(),beginNextPgmIdLstCharVal,beginNextPgmIdLstCharVal + NEXT_PGM_ID_LST_CHAR_VAL_LEN));
   	}
     int localNextIcnSufxVersNbrCounter = -1;
     public boolean isNextIcnSufxVersNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNextIcnSufxVersNbrCounter != sharedCounter;
         localNextIcnSufxVersNbrCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of nextIcnSufxVersNbr
	 *	@return nextIcnSufxVersNbr
	 */
	public char[]  getNextIcnSufxVersNbrString() {
	     return getCharArray(beginNextIcnSufxVersNbr,NEXT_ICN_SUFX_VERS_NBR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean nextIcnSufxVersNbrIsNumeric() {
	    return isNumeric(beginNextIcnSufxVersNbr
	                    ,beginNextIcnSufxVersNbr + NEXT_ICN_SUFX_VERS_NBR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NEXT_ICN_SUFX_VERS_NBR_LEN = 4;
  	/**
	 * serializeNextIcnSufxVersNbr
	 */
	protected void serializeNextIcnSufxVersNbr(int nextIcnSufxVersNbr) {
		 putNumber(beginNextIcnSufxVersNbr,nextIcnSufxVersNbr,NEXT_ICN_SUFX_VERS_NBR_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNextIcnSufxVersNbrCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNextIcnSufxVersNbr
	 */
   	protected  int serializeNextIcnSufxVersNbr(char[] value) {
	    int  nextIcnSufxVersNbr;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    nextIcnSufxVersNbr = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginNextIcnSufxVersNbr
		       ,4
		      );
		 localNextIcnSufxVersNbrCounter = shareString.getSerializedField().getModifiedCounter();
		return  nextIcnSufxVersNbr;
    }

   protected int checkNextIcnSufxVersNbrMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshNextIcnSufxVersNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshNextIcnSufxVersNbr() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginNextIcnSufxVersNbr
			                 ,NEXT_ICN_SUFX_VERS_NBR_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("nextIcnSufxVersNbr", beginNextIcnSufxVersNbr,NEXT_ICN_SUFX_VERS_NBR_LEN);
    }
   	}
     int localNextInvnCtlNbrCounter = -1;
     public boolean isNextInvnCtlNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNextInvnCtlNbrCounter != sharedCounter;
         localNextInvnCtlNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int NEXT_INVN_CTL_NBR_LEN = 10;
	/**
	 * 	serialize this NextInvnCtlNbr
	 */
   protected void serializeNextInvnCtlNbr(char[] nextInvnCtlNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(nextInvnCtlNbr,0,getStringValue(),beginNextInvnCtlNbr,NEXT_INVN_CTL_NBR_LEN);
       localNextInvnCtlNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkNextInvnCtlNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshNextInvnCtlNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshNextInvnCtlNbr() {	 
   		return (substring(getStringValue(),beginNextInvnCtlNbr,beginNextInvnCtlNbr + NEXT_INVN_CTL_NBR_LEN));
   	}
     int localNextIcnSufxCdCounter = -1;
     public boolean isNextIcnSufxCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNextIcnSufxCdCounter != sharedCounter;
         localNextIcnSufxCdCounter = sharedCounter; return hasModified;
     }
	protected static final int NEXT_ICN_SUFX_CD_LEN = 2;
	/**
	 * 	serialize this NextIcnSufxCd
	 */
   protected void serializeNextIcnSufxCd(char[] nextIcnSufxCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(nextIcnSufxCd,0,getStringValue(),beginNextIcnSufxCd,NEXT_ICN_SUFX_CD_LEN);
       localNextIcnSufxCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkNextIcnSufxCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshNextIcnSufxCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshNextIcnSufxCd() {	 
   		return (substring(getStringValue(),beginNextIcnSufxCd,beginNextIcnSufxCd + NEXT_ICN_SUFX_CD_LEN));
   	}
     int localNextLnIdCounter = -1;
     public boolean isNextLnIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNextLnIdCounter != sharedCounter;
         localNextLnIdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of nextLnId
	 *	@return nextLnId
	 */
	public char[]  getNextLnIdString() {
	     return getCharArray(beginNextLnId,NEXT_LN_ID_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean nextLnIdIsNumeric() {
	    return isNumeric(beginNextLnId
	                    ,beginNextLnId + NEXT_LN_ID_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NEXT_LN_ID_LEN = 4;
  	/**
	 * serializeNextLnId
	 */
	protected void serializeNextLnId(int nextLnId) {
		 putNumber(beginNextLnId,nextLnId,NEXT_LN_ID_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNextLnIdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNextLnId
	 */
   	protected  int serializeNextLnId(char[] value) {
	    int  nextLnId;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    nextLnId = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginNextLnId
		       ,4
		      );
		 localNextLnIdCounter = shareString.getSerializedField().getModifiedCounter();
		return  nextLnId;
    }

   protected int checkNextLnIdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshNextLnId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshNextLnId() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginNextLnId
			                 ,NEXT_LN_ID_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("nextLnId", beginNextLnId,NEXT_LN_ID_LEN);
    }
   	}
     int localNextHeaderCtCounter = -1;
     public boolean isNextHeaderCtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNextHeaderCtCounter != sharedCounter;
         localNextHeaderCtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of nextHeaderCt
	 *	@return nextHeaderCt
	 */
	public char[]  getNextHeaderCtString() {
	     return getCharArray(beginNextHeaderCt,NEXT_HEADER_CT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean nextHeaderCtIsNumeric() {
	    return isNumeric(beginNextHeaderCt
	                    ,beginNextHeaderCt + NEXT_HEADER_CT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NEXT_HEADER_CT_LEN = 4;
  	/**
	 * serializeNextHeaderCt
	 */
	protected void serializeNextHeaderCt(int nextHeaderCt) {
		 putNumber(beginNextHeaderCt,nextHeaderCt,NEXT_HEADER_CT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNextHeaderCtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNextHeaderCt
	 */
   	protected  int serializeNextHeaderCt(char[] value) {
	    int  nextHeaderCt;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    nextHeaderCt = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginNextHeaderCt
		       ,4
		      );
		 localNextHeaderCtCounter = shareString.getSerializedField().getModifiedCounter();
		return  nextHeaderCt;
    }

   protected int checkNextHeaderCtMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshNextHeaderCt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshNextHeaderCt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginNextHeaderCt
			                 ,NEXT_HEADER_CT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("nextHeaderCt", beginNextHeaderCt,NEXT_HEADER_CT_LEN);
    }
   	}




}
  
