package com.cloudframe.app.rt001.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-11-22 at 06:10. using version 5.0.0.158
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFirstNumber;
            protected  int beginSecondNumber;
            protected  int beginTheResult;
	
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
             beginFirstNumber = getStartOffset() + 0;	// set offset for serialization
  
             beginSecondNumber = getStartOffset() + 2;	// set offset for serialization
  
             beginTheResult = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFirstNumberCounter = -1;
     public boolean isFirstNumberModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFirstNumberCounter != sharedCounter;
         localFirstNumberCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of firstNumber
	 *	@return firstNumber
	 */
	public char[]  getFirstNumberString() {
	     return getCharArray(beginFirstNumber,FIRST_NUMBER_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean firstNumberIsNumeric() {
	    return isNumeric(beginFirstNumber
	                    ,beginFirstNumber + FIRST_NUMBER_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FIRST_NUMBER_LEN = 2;
  	/**
	 * serializeFirstNumber
	 */
	protected void serializeFirstNumber(int firstNumber) {
		 putNumber(beginFirstNumber,firstNumber,FIRST_NUMBER_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFirstNumberCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFirstNumber
	 */
   	protected  int serializeFirstNumber(char[] value) {
	    int  firstNumber;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    firstNumber = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginFirstNumber
		       ,2
		      );
		 localFirstNumberCounter = shareString.getSerializedField().getModifiedCounter();
		return  firstNumber;
    }

   protected int checkFirstNumberMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshFirstNumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFirstNumber() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginFirstNumber
			                 ,FIRST_NUMBER_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("firstNumber", beginFirstNumber,FIRST_NUMBER_LEN);
    }
   	}
     int localSecondNumberCounter = -1;
     public boolean isSecondNumberModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSecondNumberCounter != sharedCounter;
         localSecondNumberCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of secondNumber
	 *	@return secondNumber
	 */
	public char[]  getSecondNumberString() {
	     return getCharArray(beginSecondNumber,SECOND_NUMBER_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean secondNumberIsNumeric() {
	    return isNumeric(beginSecondNumber
	                    ,beginSecondNumber + SECOND_NUMBER_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SECOND_NUMBER_LEN = 2;
  	/**
	 * serializeSecondNumber
	 */
	protected void serializeSecondNumber(int secondNumber) {
		 putNumber(beginSecondNumber,secondNumber,SECOND_NUMBER_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSecondNumberCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSecondNumber
	 */
   	protected  int serializeSecondNumber(char[] value) {
	    int  secondNumber;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    secondNumber = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginSecondNumber
		       ,2
		      );
		 localSecondNumberCounter = shareString.getSerializedField().getModifiedCounter();
		return  secondNumber;
    }

   protected int checkSecondNumberMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSecondNumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSecondNumber() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginSecondNumber
			                 ,SECOND_NUMBER_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("secondNumber", beginSecondNumber,SECOND_NUMBER_LEN);
    }
   	}
     int localTheResultCounter = -1;
     public boolean isTheResultModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTheResultCounter != sharedCounter;
         localTheResultCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of theResult
	 *	@return theResult
	 */
	public char[]  getTheResultString() {
	     return getCharArray(beginTheResult,THE_RESULT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean theResultIsNumeric() {
	    return isNumeric(beginTheResult
	                    ,beginTheResult + THE_RESULT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int THE_RESULT_LEN = 4;
  	/**
	 * serializeTheResult
	 */
	protected void serializeTheResult(int theResult) {
		 putNumber(beginTheResult,theResult,THE_RESULT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTheResultCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTheResult
	 */
   	protected  int serializeTheResult(char[] value) {
	    int  theResult;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    theResult = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginTheResult
		       ,4
		      );
		 localTheResultCounter = shareString.getSerializedField().getModifiedCounter();
		return  theResult;
    }

   protected int checkTheResultMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTheResult is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTheResult() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginTheResult
			                 ,THE_RESULT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("theResult", beginTheResult,THE_RESULT_LEN);
    }
   	}




}
  
