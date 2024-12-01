package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class FesaKey1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FesaKey1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FesaKey1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FESA_KEY_1_LENGTH = 25;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFesaPolicy1;
            protected  int beginFesaPlanVar1;
            protected  int beginFesaEffDate1;
            protected  int beginFesaSpiNbr1;
	
	/**
	* Constructor for FesaKey1Serialized
	**/
    public FesaKey1Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FesaKey1Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FESA_KEY_1_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFesaPolicy1 = getStartOffset() + 0;	// set offset for serialization
  
             beginFesaPlanVar1 = getStartOffset() + 6;	// set offset for serialization
  
             beginFesaEffDate1 = getStartOffset() + 11;	// set offset for serialization
  
             beginFesaSpiNbr1 = getStartOffset() + 18;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFesaPolicy1Counter = -1;
     public boolean isFesaPolicy1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFesaPolicy1Counter != sharedCounter;
         localFesaPolicy1Counter = sharedCounter; return hasModified;
     }
	protected static final int FESA_POLICY_1_LEN = 6;
	/**
	 * 	serialize this FesaPolicy1
	 */
   protected void serializeFesaPolicy1(char[] fesaPolicy1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fesaPolicy1,0,getStringValue(),beginFesaPolicy1,FESA_POLICY_1_LEN);
       localFesaPolicy1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFesaPolicy1Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshFesaPolicy1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFesaPolicy1() {	 
   		return (substring(getStringValue(),beginFesaPolicy1,beginFesaPolicy1 + FESA_POLICY_1_LEN));
   	}
     int localFesaPlanVar1Counter = -1;
     public boolean isFesaPlanVar1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFesaPlanVar1Counter != sharedCounter;
         localFesaPlanVar1Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of fesaPlanVar1
	 *	@return fesaPlanVar1
	 */
	public char[]  getFesaPlanVar1String() {
	     return getCharArray(beginFesaPlanVar1,FESA_PLAN_VAR_1_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean fesaPlanVar1IsNumeric() {
	    return isNumeric(beginFesaPlanVar1
	                    ,beginFesaPlanVar1 + FESA_PLAN_VAR_1_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FESA_PLAN_VAR_1_LEN = 5;
  	/**
	 * serializeFesaPlanVar1
	 */
	protected void serializeFesaPlanVar1(int fesaPlanVar1) {
		 putNumber(beginFesaPlanVar1,fesaPlanVar1,FESA_PLAN_VAR_1_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFesaPlanVar1Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFesaPlanVar1
	 */
   	protected  int serializeFesaPlanVar1(char[] value) {
	    int  fesaPlanVar1;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    fesaPlanVar1 = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,true/*isSigned?*/)
		       ,beginFesaPlanVar1
		       ,5
		      );
		 localFesaPlanVar1Counter = shareString.getSerializedField().getModifiedCounter();
		return  fesaPlanVar1;
    }

   protected int checkFesaPlanVar1MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100K/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshFesaPlanVar1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFesaPlanVar1() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginFesaPlanVar1
			                 ,FESA_PLAN_VAR_1_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("fesaPlanVar1", beginFesaPlanVar1,FESA_PLAN_VAR_1_LEN);
    }
   	}
     int localFesaEffDate1Counter = -1;
     public boolean isFesaEffDate1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFesaEffDate1Counter != sharedCounter;
         localFesaEffDate1Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of fesaEffDate1
	 *	@return fesaEffDate1
	 */
	public char[]  getFesaEffDate1String() {
	     return getCharArray(beginFesaEffDate1,FESA_EFF_DATE_1_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean fesaEffDate1IsNumeric() {
	    return isNumeric(beginFesaEffDate1
	                    ,beginFesaEffDate1 + FESA_EFF_DATE_1_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FESA_EFF_DATE_1_LEN = 7;
  	/**
	 * serializeFesaEffDate1
	 */
	protected void serializeFesaEffDate1(int fesaEffDate1) {
		 putNumber(beginFesaEffDate1,fesaEffDate1,FESA_EFF_DATE_1_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFesaEffDate1Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFesaEffDate1
	 */
   	protected  int serializeFesaEffDate1(char[] value) {
	    int  fesaEffDate1;
	    if(value.length >0 && value.length!= 7)
            value = new String(value).trim().toCharArray();
	    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
	    else if (value.length > 7) value = substring(value,0,7);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    fesaEffDate1 = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(7,value,true/*isSigned?*/)
		       ,beginFesaEffDate1
		       ,7
		      );
		 localFesaEffDate1Counter = shareString.getSerializedField().getModifiedCounter();
		return  fesaEffDate1;
    }

   protected int checkFesaEffDate1MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10M/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshFesaEffDate1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFesaEffDate1() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginFesaEffDate1
			                 ,FESA_EFF_DATE_1_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("fesaEffDate1", beginFesaEffDate1,FESA_EFF_DATE_1_LEN);
    }
   	}
     int localFesaSpiNbr1Counter = -1;
     public boolean isFesaSpiNbr1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFesaSpiNbr1Counter != sharedCounter;
         localFesaSpiNbr1Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of fesaSpiNbr1
	 *	@return fesaSpiNbr1
	 */
	public char[]  getFesaSpiNbr1String() {
	     return getCharArray(beginFesaSpiNbr1,FESA_SPI_NBR_1_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean fesaSpiNbr1IsNumeric() {
	    return isNumeric(beginFesaSpiNbr1
	                    ,beginFesaSpiNbr1 + FESA_SPI_NBR_1_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FESA_SPI_NBR_1_LEN = 7;
  	/**
	 * serializeFesaSpiNbr1
	 */
	protected void serializeFesaSpiNbr1(int fesaSpiNbr1) {
		 putNumber(beginFesaSpiNbr1,fesaSpiNbr1,FESA_SPI_NBR_1_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFesaSpiNbr1Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFesaSpiNbr1
	 */
   	protected  int serializeFesaSpiNbr1(char[] value) {
	    int  fesaSpiNbr1;
	    if(value.length >0 && value.length!= 7)
            value = new String(value).trim().toCharArray();
	    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
	    else if (value.length > 7) value = substring(value,0,7);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    fesaSpiNbr1 = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(7,value,true/*isSigned?*/)
		       ,beginFesaSpiNbr1
		       ,7
		      );
		 localFesaSpiNbr1Counter = shareString.getSerializedField().getModifiedCounter();
		return  fesaSpiNbr1;
    }

   protected int checkFesaSpiNbr1MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10M/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshFesaSpiNbr1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFesaSpiNbr1() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginFesaSpiNbr1
			                 ,FESA_SPI_NBR_1_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("fesaSpiNbr1", beginFesaSpiNbr1,FESA_SPI_NBR_1_LEN);
    }
   	}




}
  
