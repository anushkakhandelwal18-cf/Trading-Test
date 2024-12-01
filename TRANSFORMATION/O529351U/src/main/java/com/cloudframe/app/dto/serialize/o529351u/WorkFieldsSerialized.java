package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class WorkFieldsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WorkFieldsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkFieldsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_FIELDS_LENGTH = 200258;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginParagraph;
            protected  int beginNbrMatched;
            protected  int beginNbrMatchedPrev;
            protected  int beginDatecjIn;
            protected  int beginDatecjOut;
            protected  int beginDatecjNum;
            protected  int beginComplimentDate;
            protected  int beginJulEffDate;
            protected  int beginPlanEffDate;
            protected  int beginPlanCanDate;
            protected  int beginPlanDosDate;
            protected  int beginPlanDate;
            protected  int beginNumber;
            protected  int beginPolNo;
            protected  int beginPlnNo;
            protected  int beginHold51uPolicy;
            protected  int beginHold51uPlan;
            protected  int beginCtlCntId1;
            protected  int beginZero;
            protected  int beginNewServiceCode;
            protected  int beginNbrOfLines;
            protected  int beginNbrOfPlanVar;
            protected  int beginNbrOfNewPlanVar;
            protected  int beginPlanVarPrev;
            protected  int beginNewPlanVarPrev;
            protected  int beginLatestLastDate;
            protected  int beginHoldServCd;
            protected  int beginPrevDateServ;
            protected  int beginMcrCondCtr;
            protected  int beginChargeSub;
            protected  int beginChargeCombined;
            protected  int beginToCauseCdChanged;
	
	/**
	* Constructor for WorkFieldsSerialized
	**/
    public WorkFieldsSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WorkFieldsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WORK_FIELDS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginParagraph = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
  
             beginNbrMatched = getStartOffset() + 200081;	// set offset for serialization
  
             beginNbrMatchedPrev = getStartOffset() + 200084;	// set offset for serialization
  
  
  
             beginDatecjIn = getStartOffset() + 200095;	// set offset for serialization
  
             beginDatecjOut = getStartOffset() + 200103;	// set offset for serialization
  
             beginDatecjNum = getStartOffset() + 200103;	// set offset for serialization
  
             beginComplimentDate = getStartOffset() + 200108;	// set offset for serialization
  
             beginJulEffDate = getStartOffset() + 200113;	// set offset for serialization
  
             beginPlanEffDate = getStartOffset() + 200118;	// set offset for serialization
  
  
             beginPlanCanDate = getStartOffset() + 200126;	// set offset for serialization
  
  
             beginPlanDosDate = getStartOffset() + 200134;	// set offset for serialization
  
  
             beginPlanDate = getStartOffset() + 200140;	// set offset for serialization
  
  
             beginNumber = getStartOffset() + 200148;	// set offset for serialization
  
             beginPolNo = getStartOffset() + 200149;	// set offset for serialization
  
             beginPlnNo = getStartOffset() + 200155;	// set offset for serialization
  
             beginHold51uPolicy = getStartOffset() + 200158;	// set offset for serialization
  
             beginHold51uPlan = getStartOffset() + 200164;	// set offset for serialization
  
             beginCtlCntId1 = getStartOffset() + 200167;	// set offset for serialization
  
             beginZero = getStartOffset() + 200168;	// set offset for serialization
  
             beginNewServiceCode = getStartOffset() + 200169;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
             beginNbrOfLines = getStartOffset() + 200199;	// set offset for serialization
  
             beginNbrOfPlanVar = getStartOffset() + 200203;	// set offset for serialization
  
             beginNbrOfNewPlanVar = getStartOffset() + 200207;	// set offset for serialization
  
             beginPlanVarPrev = getStartOffset() + 200210;	// set offset for serialization
  
             beginNewPlanVarPrev = getStartOffset() + 200212;	// set offset for serialization
  
             beginLatestLastDate = getStartOffset() + 200218;	// set offset for serialization
  
             beginHoldServCd = getStartOffset() + 200228;	// set offset for serialization
  
             beginPrevDateServ = getStartOffset() + 200234;	// set offset for serialization
  
             beginMcrCondCtr = getStartOffset() + 200238;	// set offset for serialization
  
             beginChargeSub = getStartOffset() + 200241;	// set offset for serialization
  
             beginChargeCombined = getStartOffset() + 200243;	// set offset for serialization
  
             beginToCauseCdChanged = getStartOffset() + 200245;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localParagraphCounter = -1;
     public boolean isParagraphModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParagraphCounter != sharedCounter;
         localParagraphCounter = sharedCounter; return hasModified;
     }
	protected static final int PARAGRAPH_LEN = 4;
	/**
	 * 	serialize this Paragraph
	 */
   protected void serializeParagraph(char[] paragraph) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(paragraph,0,getStringValue(),beginParagraph,PARAGRAPH_LEN);
       localParagraphCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkParagraphConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshParagraph is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshParagraph() {	 
   		return (substring(getStringValue(),beginParagraph,beginParagraph + PARAGRAPH_LEN));
   	}
     int localNbrMatchedCounter = -1;
     public boolean isNbrMatchedModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNbrMatchedCounter != sharedCounter;
         localNbrMatchedCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of nbrMatched
	 *	@return nbrMatched
	 */
	public char[]  getNbrMatchedString() {
	     return getCharArray(beginNbrMatched,NBR_MATCHED_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean nbrMatchedIsNumeric() {
	    return isNumeric(beginNbrMatched
	                    ,beginNbrMatched + NBR_MATCHED_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NBR_MATCHED_LEN = 3;
  	/**
	 * serializeNbrMatched
	 */
	protected void serializeNbrMatched(short nbrMatched) {
		 putNumber(beginNbrMatched,nbrMatched,NBR_MATCHED_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNbrMatchedCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNbrMatched
	 */
   	protected  short serializeNbrMatched(char[] value) {
	    short  nbrMatched;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    nbrMatched = (short) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,true/*isSigned?*/)
		       ,beginNbrMatched
		       ,3
		      );
		 localNbrMatchedCounter = shareString.getSerializedField().getModifiedCounter();
		return  nbrMatched;
    }

   protected short checkNbrMatchedMaxLimit(long number) {

	   return (short)checkMaxLimit(number , MAX_1000/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshNbrMatched is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshNbrMatched() throws CFException {
   	try {	 
			return (
			          getShortNumber(
			                  beginNbrMatched
			                 ,NBR_MATCHED_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("nbrMatched", beginNbrMatched,NBR_MATCHED_LEN);
    }
   	}
     int localNbrMatchedPrevCounter = -1;
     public boolean isNbrMatchedPrevModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNbrMatchedPrevCounter != sharedCounter;
         localNbrMatchedPrevCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of nbrMatchedPrev
	 *	@return nbrMatchedPrev
	 */
	public char[]  getNbrMatchedPrevString() {
	     return getCharArray(beginNbrMatchedPrev,NBR_MATCHED_PREV_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean nbrMatchedPrevIsNumeric() {
	    return isNumeric(beginNbrMatchedPrev
	                    ,beginNbrMatchedPrev + NBR_MATCHED_PREV_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NBR_MATCHED_PREV_LEN = 3;
  	/**
	 * serializeNbrMatchedPrev
	 */
	protected void serializeNbrMatchedPrev(short nbrMatchedPrev) {
		 putNumber(beginNbrMatchedPrev,nbrMatchedPrev,NBR_MATCHED_PREV_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNbrMatchedPrevCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNbrMatchedPrev
	 */
   	protected  short serializeNbrMatchedPrev(char[] value) {
	    short  nbrMatchedPrev;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    nbrMatchedPrev = (short) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,true/*isSigned?*/)
		       ,beginNbrMatchedPrev
		       ,3
		      );
		 localNbrMatchedPrevCounter = shareString.getSerializedField().getModifiedCounter();
		return  nbrMatchedPrev;
    }

   protected short checkNbrMatchedPrevMaxLimit(long number) {

	   return (short)checkMaxLimit(number , MAX_1000/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshNbrMatchedPrev is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshNbrMatchedPrev() throws CFException {
   	try {	 
			return (
			          getShortNumber(
			                  beginNbrMatchedPrev
			                 ,NBR_MATCHED_PREV_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("nbrMatchedPrev", beginNbrMatchedPrev,NBR_MATCHED_PREV_LEN);
    }
   	}
     int localDatecjInCounter = -1;
     public boolean isDatecjInModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDatecjInCounter != sharedCounter;
         localDatecjInCounter = sharedCounter; return hasModified;
     }
	protected static final int DATECJ_IN_LEN = 8;
	/**
	 * 	serialize this DatecjIn
	 */
   protected void serializeDatecjIn(char[] datecjIn) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(datecjIn,0,getStringValue(),beginDatecjIn,DATECJ_IN_LEN);
       localDatecjInCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDatecjInConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshDatecjIn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDatecjIn() {	 
   		return (substring(getStringValue(),beginDatecjIn,beginDatecjIn + DATECJ_IN_LEN));
   	}
     int localDatecjOutCounter = -1;
     public boolean isDatecjOutModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDatecjOutCounter != sharedCounter;
         localDatecjOutCounter = sharedCounter; return hasModified;
     }
	protected static final int DATECJ_OUT_LEN = 5;
	/**
	 * 	serialize this DatecjOut
	 */
   protected void serializeDatecjOut(char[] datecjOut) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(datecjOut,0,getStringValue(),beginDatecjOut,DATECJ_OUT_LEN);
       localDatecjOutCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDatecjOutConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshDatecjOut is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDatecjOut() {	 
   		return (substring(getStringValue(),beginDatecjOut,beginDatecjOut + DATECJ_OUT_LEN));
   	}
     int localDatecjNumCounter = -1;
     public boolean isDatecjNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDatecjNumCounter != sharedCounter;
         localDatecjNumCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of datecjNum
	 *	@return datecjNum
	 */
	public char[]  getDatecjNumString() {
	     return getCharArray(beginDatecjNum,DATECJ_NUM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean datecjNumIsNumeric() {
	    return isNumeric(beginDatecjNum
	                    ,beginDatecjNum + DATECJ_NUM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DATECJ_NUM_LEN = 5;
  	/**
	 * serializeDatecjNum
	 */
	protected void serializeDatecjNum(long datecjNum) {
		 putNumber(beginDatecjNum,datecjNum,DATECJ_NUM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDatecjNumCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDatecjNum
	 */
   	protected  long serializeDatecjNum(char[] value) {
	    long  datecjNum;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    datecjNum = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginDatecjNum
		       ,5
		      );
		 localDatecjNumCounter = shareString.getSerializedField().getModifiedCounter();
		return  datecjNum;
    }

   protected long checkDatecjNumMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDatecjNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDatecjNum() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginDatecjNum
			                 ,DATECJ_NUM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("datecjNum", beginDatecjNum,DATECJ_NUM_LEN);
    }
   	}
     int localComplimentDateCounter = -1;
     public boolean isComplimentDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localComplimentDateCounter != sharedCounter;
         localComplimentDateCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of complimentDate
	 *	@return complimentDate
	 */
	public char[]  getComplimentDateString() {
	     return getCharArray(beginComplimentDate,COMPLIMENT_DATE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean complimentDateIsNumeric() {
	    return isNumeric(beginComplimentDate
	                    ,beginComplimentDate + COMPLIMENT_DATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int COMPLIMENT_DATE_LEN = 5;
  	/**
	 * serializeComplimentDate
	 */
	protected void serializeComplimentDate(long complimentDate) {
		 putNumber(beginComplimentDate,complimentDate,COMPLIMENT_DATE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localComplimentDateCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeComplimentDate
	 */
   	protected  long serializeComplimentDate(char[] value) {
	    long  complimentDate;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    complimentDate = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginComplimentDate
		       ,5
		      );
		 localComplimentDateCounter = shareString.getSerializedField().getModifiedCounter();
		return  complimentDate;
    }

   protected long checkComplimentDateMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshComplimentDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshComplimentDate() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginComplimentDate
			                 ,COMPLIMENT_DATE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("complimentDate", beginComplimentDate,COMPLIMENT_DATE_LEN);
    }
   	}
     int localJulEffDateCounter = -1;
     public boolean isJulEffDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localJulEffDateCounter != sharedCounter;
         localJulEffDateCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of julEffDate
	 *	@return julEffDate
	 */
	public char[]  getJulEffDateString() {
	     return getCharArray(beginJulEffDate,JUL_EFF_DATE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean julEffDateIsNumeric() {
	    return isNumeric(beginJulEffDate
	                    ,beginJulEffDate + JUL_EFF_DATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int JUL_EFF_DATE_LEN = 5;
  	/**
	 * serializeJulEffDate
	 */
	protected void serializeJulEffDate(long julEffDate) {
		 putNumber(beginJulEffDate,julEffDate,JUL_EFF_DATE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localJulEffDateCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeJulEffDate
	 */
   	protected  long serializeJulEffDate(char[] value) {
	    long  julEffDate;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    julEffDate = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginJulEffDate
		       ,5
		      );
		 localJulEffDateCounter = shareString.getSerializedField().getModifiedCounter();
		return  julEffDate;
    }

   protected long checkJulEffDateMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshJulEffDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshJulEffDate() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginJulEffDate
			                 ,JUL_EFF_DATE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("julEffDate", beginJulEffDate,JUL_EFF_DATE_LEN);
    }
   	}
     int localPlanEffDateCounter = -1;
     public boolean isPlanEffDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPlanEffDateCounter != sharedCounter;
         localPlanEffDateCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of planEffDate
	 *	@return planEffDate
	 */
	public char[]  getPlanEffDateString() {
	     return getCharArray(beginPlanEffDate,PLAN_EFF_DATE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean planEffDateIsNumeric() {
	    return isNumeric(beginPlanEffDate
	                    ,beginPlanEffDate + PLAN_EFF_DATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PLAN_EFF_DATE_LEN = 8;
  	/**
	 * serializePlanEffDate
	 */
	protected void serializePlanEffDate(long planEffDate) {
		 putNumber(beginPlanEffDate,planEffDate,PLAN_EFF_DATE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPlanEffDateCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePlanEffDate
	 */
   	protected  long serializePlanEffDate(char[] value) {
	    long  planEffDate;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    planEffDate = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginPlanEffDate
		       ,8
		      );
		 localPlanEffDateCounter = shareString.getSerializedField().getModifiedCounter();
		return  planEffDate;
    }

   protected long checkPlanEffDateMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPlanEffDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPlanEffDate() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPlanEffDate
			                 ,PLAN_EFF_DATE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("planEffDate", beginPlanEffDate,PLAN_EFF_DATE_LEN);
    }
   	}
     int localPlanCanDateCounter = -1;
     public boolean isPlanCanDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPlanCanDateCounter != sharedCounter;
         localPlanCanDateCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of planCanDate
	 *	@return planCanDate
	 */
	public char[]  getPlanCanDateString() {
	     return getCharArray(beginPlanCanDate,PLAN_CAN_DATE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean planCanDateIsNumeric() {
	    return isNumeric(beginPlanCanDate
	                    ,beginPlanCanDate + PLAN_CAN_DATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PLAN_CAN_DATE_LEN = 8;
  	/**
	 * serializePlanCanDate
	 */
	protected void serializePlanCanDate(long planCanDate) {
		 putNumber(beginPlanCanDate,planCanDate,PLAN_CAN_DATE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPlanCanDateCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePlanCanDate
	 */
   	protected  long serializePlanCanDate(char[] value) {
	    long  planCanDate;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    planCanDate = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginPlanCanDate
		       ,8
		      );
		 localPlanCanDateCounter = shareString.getSerializedField().getModifiedCounter();
		return  planCanDate;
    }

   protected long checkPlanCanDateMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPlanCanDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPlanCanDate() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPlanCanDate
			                 ,PLAN_CAN_DATE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("planCanDate", beginPlanCanDate,PLAN_CAN_DATE_LEN);
    }
   	}
     int localPlanDosDateCounter = -1;
     public boolean isPlanDosDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPlanDosDateCounter != sharedCounter;
         localPlanDosDateCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of planDosDate
	 *	@return planDosDate
	 */
	public char[]  getPlanDosDateString() {
	     return getCharArray(beginPlanDosDate,PLAN_DOS_DATE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean planDosDateIsNumeric() {
	    return isNumeric(beginPlanDosDate
	                    ,beginPlanDosDate + PLAN_DOS_DATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PLAN_DOS_DATE_LEN = 6;
  	/**
	 * serializePlanDosDate
	 */
	protected void serializePlanDosDate(long planDosDate) {
		 putNumber(beginPlanDosDate,planDosDate,PLAN_DOS_DATE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPlanDosDateCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePlanDosDate
	 */
   	protected  long serializePlanDosDate(char[] value) {
	    long  planDosDate;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    planDosDate = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginPlanDosDate
		       ,6
		      );
		 localPlanDosDateCounter = shareString.getSerializedField().getModifiedCounter();
		return  planDosDate;
    }

   protected long checkPlanDosDateMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPlanDosDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPlanDosDate() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPlanDosDate
			                 ,PLAN_DOS_DATE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("planDosDate", beginPlanDosDate,PLAN_DOS_DATE_LEN);
    }
   	}
     int localPlanDateCounter = -1;
     public boolean isPlanDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPlanDateCounter != sharedCounter;
         localPlanDateCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of planDate
	 *	@return planDate
	 */
	public char[]  getPlanDateString() {
	     return getCharArray(beginPlanDate,PLAN_DATE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean planDateIsNumeric() {
	    return isNumeric(beginPlanDate
	                    ,beginPlanDate + PLAN_DATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PLAN_DATE_LEN = 8;
  	/**
	 * serializePlanDate
	 */
	protected void serializePlanDate(long planDate) {
		 putNumber(beginPlanDate,planDate,PLAN_DATE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPlanDateCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePlanDate
	 */
   	protected  long serializePlanDate(char[] value) {
	    long  planDate;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    planDate = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginPlanDate
		       ,8
		      );
		 localPlanDateCounter = shareString.getSerializedField().getModifiedCounter();
		return  planDate;
    }

   protected long checkPlanDateMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPlanDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPlanDate() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPlanDate
			                 ,PLAN_DATE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("planDate", beginPlanDate,PLAN_DATE_LEN);
    }
   	}
     int localNumberCounter = -1;
     public boolean isNumberModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNumberCounter != sharedCounter;
         localNumberCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of number
	 *	@return number
	 */
	public char[]  getNumberString() {
	     return getCharArray(beginNumber,NUMBER_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean numberIsNumeric() {
	    return isNumeric(beginNumber
	                    ,beginNumber + NUMBER_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NUMBER_LEN = 1;
  	/**
	 * serializeNumber
	 */
	protected void serializeNumber(int number) {
		 putNumber(beginNumber,number,NUMBER_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNumberCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNumber
	 */
   	protected  int serializeNumber(char[] value) {
	    int  number;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    number = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginNumber
		       ,1
		      );
		 localNumberCounter = shareString.getSerializedField().getModifiedCounter();
		return  number;
    }

   protected int checkNumberMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshNumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshNumber() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginNumber
			                 ,NUMBER_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("number", beginNumber,NUMBER_LEN);
    }
   	}
     int localPolNoCounter = -1;
     public boolean isPolNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPolNoCounter != sharedCounter;
         localPolNoCounter = sharedCounter; return hasModified;
     }
	protected static final int POL_NO_LEN = 6;
	/**
	 * 	serialize this PolNo
	 */
   protected void serializePolNo(char[] polNo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(polNo,0,getStringValue(),beginPolNo,POL_NO_LEN);
       localPolNoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPolNoConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshPolNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPolNo() {	 
   		return (substring(getStringValue(),beginPolNo,beginPolNo + POL_NO_LEN));
   	}
        int localPlnNoCounter = -1;
        public boolean isPlnNoModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localPlnNoCounter != sharedCounter;
           localPlnNoCounter = sharedCounter; return hasModified; 
        }
	    public boolean plnNoIsNumeric() {
	      return decimalIsNumeric(beginPlnNo,PLN_NO_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int PLN_NO_LEN = 3;
  	/**
	 * 	serializePlnNo
	 */
	protected void serializePlnNo(long plnNo) {
		   putDecimal(beginPlnNo,plnNo,PLN_NO_LEN,false);
   }
   

   protected long checkPlnNoMaxLimit(long number) {
        return checkMaxLimit(number , MAX_100K /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshPlnNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPlnNo() throws CFException {	
   	try { 
		 return (getLongDecimal(beginPlnNo,PLN_NO_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("plnNo", beginPlnNo,PLN_NO_LEN);
     }
   	}
     int localHold51uPolicyCounter = -1;
     public boolean isHold51uPolicyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHold51uPolicyCounter != sharedCounter;
         localHold51uPolicyCounter = sharedCounter; return hasModified;
     }
	protected static final int HOLD_51U_POLICY_LEN = 6;
	/**
	 * 	serialize this Hold51uPolicy
	 */
   protected void serializeHold51uPolicy(char[] hold51uPolicy) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hold51uPolicy,0,getStringValue(),beginHold51uPolicy,HOLD_51U_POLICY_LEN);
       localHold51uPolicyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHold51uPolicyConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshHold51uPolicy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHold51uPolicy() {	 
   		return (substring(getStringValue(),beginHold51uPolicy,beginHold51uPolicy + HOLD_51U_POLICY_LEN));
   	}
        int localHold51uPlanCounter = -1;
        public boolean isHold51uPlanModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localHold51uPlanCounter != sharedCounter;
           localHold51uPlanCounter = sharedCounter; return hasModified; 
        }
	    public boolean hold51uPlanIsNumeric() {
	      return decimalIsNumeric(beginHold51uPlan,HOLD_51U_PLAN_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int HOLD_51U_PLAN_LEN = 3;
  	/**
	 * 	serializeHold51uPlan
	 */
	protected void serializeHold51uPlan(long hold51uPlan) {
		   putDecimal(beginHold51uPlan,hold51uPlan,HOLD_51U_PLAN_LEN,false);
   }
   

   protected long checkHold51uPlanMaxLimit(long number) {
        return checkMaxLimit(number , MAX_100K /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshHold51uPlan is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshHold51uPlan() throws CFException {	
   	try { 
		 return (getLongDecimal(beginHold51uPlan,HOLD_51U_PLAN_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("hold51uPlan", beginHold51uPlan,HOLD_51U_PLAN_LEN);
     }
   	}
     int localCtlCntId1Counter = -1;
     public boolean isCtlCntId1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCtlCntId1Counter != sharedCounter;
         localCtlCntId1Counter = sharedCounter; return hasModified;
     }
	protected static final int CTL_CNT_ID_1_LEN = 1;
	/**
	 * 	serialize this CtlCntId1
	 */
   protected void serializeCtlCntId1(char[] ctlCntId1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ctlCntId1,0,getStringValue(),beginCtlCntId1,CTL_CNT_ID_1_LEN);
       localCtlCntId1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCtlCntId1Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCtlCntId1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCtlCntId1() {	 
   		return (substring(getStringValue(),beginCtlCntId1,beginCtlCntId1 + CTL_CNT_ID_1_LEN));
   	}
     int localZeroCounter = -1;
     public boolean isZeroModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localZeroCounter != sharedCounter;
         localZeroCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of zero
	 *	@return zero
	 */
	public char[]  getZeroString() {
	     return getCharArray(beginZero,ZERO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean zeroIsNumeric() {
	    return isNumeric(beginZero
	                    ,beginZero + ZERO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ZERO_LEN = 1;
  	/**
	 * serializeZero
	 */
	protected void serializeZero(int zero) {
		 putNumber(beginZero,zero,ZERO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localZeroCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeZero
	 */
   	protected  int serializeZero(char[] value) {
	    int  zero;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    zero = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginZero
		       ,1
		      );
		 localZeroCounter = shareString.getSerializedField().getModifiedCounter();
		return  zero;
    }

   protected int checkZeroMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshZero is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshZero() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginZero
			                 ,ZERO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("zero", beginZero,ZERO_LEN);
    }
   	}
     int localNewServiceCodeCounter = -1;
     public boolean isNewServiceCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNewServiceCodeCounter != sharedCounter;
         localNewServiceCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int NEW_SERVICE_CODE_LEN = 6;
	/**
	 * 	serialize this NewServiceCode
	 */
   protected void serializeNewServiceCode(char[] newServiceCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(newServiceCode,0,getStringValue(),beginNewServiceCode,NEW_SERVICE_CODE_LEN);
       localNewServiceCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkNewServiceCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshNewServiceCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshNewServiceCode() {	 
   		return (substring(getStringValue(),beginNewServiceCode,beginNewServiceCode + NEW_SERVICE_CODE_LEN));
   	}
         int localNbrOfLinesCounter = -1;
         public boolean isNbrOfLinesModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localNbrOfLinesCounter != sharedCounter;
            localNbrOfLinesCounter = sharedCounter; return hasModified; 
         }
   protected static final int NBR_OF_LINES_LEN = 4;
  	/**
	 * serializeNbrOfLines
	 */
	protected void serializeNbrOfLines(int nbrOfLines) {
           replaceValue( //  save the value as string
                   getBinaryString( nbrOfLines,NBR_OF_LINES_LEN)
                  ,beginNbrOfLines
                  ,NBR_OF_LINES_LEN
                 );
            localNbrOfLinesCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkNbrOfLinesMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshNbrOfLines is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshNbrOfLines() {	 
			return (getInt(beginNbrOfLines));
   	}
         int localNbrOfPlanVarCounter = -1;
         public boolean isNbrOfPlanVarModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localNbrOfPlanVarCounter != sharedCounter;
            localNbrOfPlanVarCounter = sharedCounter; return hasModified; 
         }
   protected static final int NBR_OF_PLAN_VAR_LEN = 4;
  	/**
	 * serializeNbrOfPlanVar
	 */
	protected void serializeNbrOfPlanVar(int nbrOfPlanVar) {
           replaceValue( //  save the value as string
                   getBinaryString( nbrOfPlanVar,NBR_OF_PLAN_VAR_LEN)
                  ,beginNbrOfPlanVar
                  ,NBR_OF_PLAN_VAR_LEN
                 );
            localNbrOfPlanVarCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkNbrOfPlanVarMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshNbrOfPlanVar is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshNbrOfPlanVar() {	 
			return (getInt(beginNbrOfPlanVar));
   	}
        int localNbrOfNewPlanVarCounter = -1;
        public boolean isNbrOfNewPlanVarModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localNbrOfNewPlanVarCounter != sharedCounter;
           localNbrOfNewPlanVarCounter = sharedCounter; return hasModified; 
        }
	    public boolean nbrOfNewPlanVarIsNumeric() {
	      return decimalIsNumeric(beginNbrOfNewPlanVar,NBR_OF_NEW_PLAN_VAR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int NBR_OF_NEW_PLAN_VAR_LEN = 3;
  	/**
	 * 	serializeNbrOfNewPlanVar
	 */
	protected void serializeNbrOfNewPlanVar(short nbrOfNewPlanVar) {
		   putDecimal(beginNbrOfNewPlanVar,nbrOfNewPlanVar,NBR_OF_NEW_PLAN_VAR_LEN,true);
   }
   

   protected short checkNbrOfNewPlanVarMaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_10K /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshNbrOfNewPlanVar is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshNbrOfNewPlanVar() throws CFException {	
   	try { 
		 return (getShortDecimal(beginNbrOfNewPlanVar,NBR_OF_NEW_PLAN_VAR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("nbrOfNewPlanVar", beginNbrOfNewPlanVar,NBR_OF_NEW_PLAN_VAR_LEN);
     }
   	}
         int localPlanVarPrevCounter = -1;
         public boolean isPlanVarPrevModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localPlanVarPrevCounter != sharedCounter;
            localPlanVarPrevCounter = sharedCounter; return hasModified; 
         }
   protected static final int PLAN_VAR_PREV_LEN = 2;
  	/**
	 * serializePlanVarPrev
	 */
	protected void serializePlanVarPrev(short planVarPrev) {
           replaceValue( //  save the value as string
                   getBinaryString( planVarPrev,PLAN_VAR_PREV_LEN)
                  ,beginPlanVarPrev
                  ,PLAN_VAR_PREV_LEN
                 );
            localPlanVarPrevCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkPlanVarPrevMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshPlanVarPrev is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshPlanVarPrev() {	 
			return (getShort(beginPlanVarPrev));
   	}
         int localNewPlanVarPrevCounter = -1;
         public boolean isNewPlanVarPrevModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localNewPlanVarPrevCounter != sharedCounter;
            localNewPlanVarPrevCounter = sharedCounter; return hasModified; 
         }
   protected static final int NEW_PLAN_VAR_PREV_LEN = 2;
  	/**
	 * serializeNewPlanVarPrev
	 */
	protected void serializeNewPlanVarPrev(short newPlanVarPrev) {
           replaceValue( //  save the value as string
                   getBinaryString( newPlanVarPrev,NEW_PLAN_VAR_PREV_LEN)
                  ,beginNewPlanVarPrev
                  ,NEW_PLAN_VAR_PREV_LEN
                 );
            localNewPlanVarPrevCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkNewPlanVarPrevMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshNewPlanVarPrev is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshNewPlanVarPrev() {	 
			return (getShort(beginNewPlanVarPrev));
   	}
        int localLatestLastDateCounter = -1;
        public boolean isLatestLastDateModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localLatestLastDateCounter != sharedCounter;
           localLatestLastDateCounter = sharedCounter; return hasModified; 
        }
	    public boolean latestLastDateIsNumeric() {
	      return decimalIsNumeric(beginLatestLastDate,LATEST_LAST_DATE_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int LATEST_LAST_DATE_LEN = 4;
  	/**
	 * 	serializeLatestLastDate
	 */
	protected void serializeLatestLastDate(int latestLastDate) {
		   putDecimal(beginLatestLastDate,latestLastDate,LATEST_LAST_DATE_LEN,true);
   }
   

   protected int checkLatestLastDateMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_10M /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshLatestLastDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshLatestLastDate() throws CFException {	
   	try { 
		 return (getIntDecimal(beginLatestLastDate,LATEST_LAST_DATE_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("latestLastDate", beginLatestLastDate,LATEST_LAST_DATE_LEN);
     }
   	}
     int localHoldServCdCounter = -1;
     public boolean isHoldServCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHoldServCdCounter != sharedCounter;
         localHoldServCdCounter = sharedCounter; return hasModified;
     }
	protected static final int HOLD_SERV_CD_LEN = 6;
	/**
	 * 	serialize this HoldServCd
	 */
   protected void serializeHoldServCd(char[] holdServCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(holdServCd,0,getStringValue(),beginHoldServCd,HOLD_SERV_CD_LEN);
       localHoldServCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHoldServCdConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshHoldServCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHoldServCd() {	 
   		return (substring(getStringValue(),beginHoldServCd,beginHoldServCd + HOLD_SERV_CD_LEN));
   	}
        int localPrevDateServCounter = -1;
        public boolean isPrevDateServModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localPrevDateServCounter != sharedCounter;
           localPrevDateServCounter = sharedCounter; return hasModified; 
        }
	    public boolean prevDateServIsNumeric() {
	      return decimalIsNumeric(beginPrevDateServ,PREV_DATE_SERV_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int PREV_DATE_SERV_LEN = 4;
  	/**
	 * 	serializePrevDateServ
	 */
	protected void serializePrevDateServ(int prevDateServ) {
		   putDecimal(beginPrevDateServ,prevDateServ,PREV_DATE_SERV_LEN,true);
   }
   

   protected int checkPrevDateServMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_10M /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshPrevDateServ is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPrevDateServ() throws CFException {	
   	try { 
		 return (getIntDecimal(beginPrevDateServ,PREV_DATE_SERV_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("prevDateServ", beginPrevDateServ,PREV_DATE_SERV_LEN);
     }
   	}
        int localMcrCondCtrCounter = -1;
        public boolean isMcrCondCtrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localMcrCondCtrCounter != sharedCounter;
           localMcrCondCtrCounter = sharedCounter; return hasModified; 
        }
	    public boolean mcrCondCtrIsNumeric() {
	      return decimalIsNumeric(beginMcrCondCtr,MCR_COND_CTR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int MCR_COND_CTR_LEN = 3;
  	/**
	 * 	serializeMcrCondCtr
	 */
	protected void serializeMcrCondCtr(int mcrCondCtr) {
		   putDecimal(beginMcrCondCtr,mcrCondCtr,MCR_COND_CTR_LEN,true);
   }
   

   protected int checkMcrCondCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_100K /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshMcrCondCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMcrCondCtr() throws CFException {	
   	try { 
		 return (getIntDecimal(beginMcrCondCtr,MCR_COND_CTR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("mcrCondCtr", beginMcrCondCtr,MCR_COND_CTR_LEN);
     }
   	}
        int localChargeSubCounter = -1;
        public boolean isChargeSubModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localChargeSubCounter != sharedCounter;
           localChargeSubCounter = sharedCounter; return hasModified; 
        }
	    public boolean chargeSubIsNumeric() {
	      return decimalIsNumeric(beginChargeSub,CHARGE_SUB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int CHARGE_SUB_LEN = 2;
  	/**
	 * 	serializeChargeSub
	 */
	protected void serializeChargeSub(short chargeSub) {
		   putDecimal(beginChargeSub,chargeSub,CHARGE_SUB_LEN,true);
   }
   

   protected short checkChargeSubMaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshChargeSub is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshChargeSub() throws CFException {	
   	try { 
		 return (getShortDecimal(beginChargeSub,CHARGE_SUB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("chargeSub", beginChargeSub,CHARGE_SUB_LEN);
     }
   	}
     int localChargeCombinedCounter = -1;
     public boolean isChargeCombinedModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChargeCombinedCounter != sharedCounter;
         localChargeCombinedCounter = sharedCounter; return hasModified;
     }
	protected static final int CHARGE_COMBINED_LEN = 1;
	/**
	 * 	serialize this ChargeCombined
	 */
   protected void serializeChargeCombined(char[] chargeCombined) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(chargeCombined,0,getStringValue(),beginChargeCombined,CHARGE_COMBINED_LEN);
       localChargeCombinedCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkChargeCombinedConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshChargeCombined is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshChargeCombined() {	 
   		return (substring(getStringValue(),beginChargeCombined,beginChargeCombined + CHARGE_COMBINED_LEN));
   	}
     int localToCauseCdChangedCounter = -1;
     public boolean isToCauseCdChangedModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localToCauseCdChangedCounter != sharedCounter;
         localToCauseCdChangedCounter = sharedCounter; return hasModified;
     }
	protected static final int TO_CAUSE_CD_CHANGED_LEN = 1;
	/**
	 * 	serialize this ToCauseCdChanged
	 */
   protected void serializeToCauseCdChanged(char[] toCauseCdChanged) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(toCauseCdChanged,0,getStringValue(),beginToCauseCdChanged,TO_CAUSE_CD_CHANGED_LEN);
       localToCauseCdChangedCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkToCauseCdChangedConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshToCauseCdChanged is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshToCauseCdChanged() {	 
   		return (substring(getStringValue(),beginToCauseCdChanged,beginToCauseCdChanged + TO_CAUSE_CD_CHANGED_LEN));
   	}




}
  
