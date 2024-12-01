package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class CsvcCodeSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CsvcCodeSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CsvcCodeSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CSVC_CODE_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCsvcCode1st5;
            protected  int beginCsvcCodeLst1;
	
	/**
	* Constructor for CsvcCodeSerialized
	**/
    public CsvcCodeSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CsvcCodeSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CsvcCodeSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CsvcCodeSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this CsvcCodeSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in CsvcCodeSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CSVC_CODE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCsvcCode1st5 = getStartOffset() + 0;	// set offset for serialization
  
             beginCsvcCodeLst1 = getStartOffset() + 5;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCsvcCode1st5Counter = -1;
     public boolean isCsvcCode1st5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCsvcCode1st5Counter != sharedCounter;
         localCsvcCode1st5Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of csvcCode1st5
	 *	@return csvcCode1st5
	 */
	public char[]  getCsvcCode1st5String() {
	     return getCharArray(beginCsvcCode1st5,CSVC_CODE_1ST_5_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean csvcCode1st5IsNumeric() {
	    return isNumeric(beginCsvcCode1st5
	                    ,beginCsvcCode1st5 + CSVC_CODE_1ST_5_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CSVC_CODE_1ST_5_LEN = 5;
  	/**
	 * serializeCsvcCode1st5
	 */
	protected void serializeCsvcCode1st5(long csvcCode1st5) {
		 putNumber(beginCsvcCode1st5,csvcCode1st5,CSVC_CODE_1ST_5_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCsvcCode1st5Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCsvcCode1st5
	 */
   	protected  long serializeCsvcCode1st5(char[] value) {
	    long  csvcCode1st5;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    csvcCode1st5 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginCsvcCode1st5
		       ,5
		      );
		 localCsvcCode1st5Counter = shareString.getSerializedField().getModifiedCounter();
		return  csvcCode1st5;
    }

   protected long checkCsvcCode1st5MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCsvcCode1st5 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshCsvcCode1st5() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginCsvcCode1st5
			                 ,CSVC_CODE_1ST_5_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("csvcCode1st5", beginCsvcCode1st5,CSVC_CODE_1ST_5_LEN);
    }
   	}
     int localCsvcCodeLst1Counter = -1;
     public boolean isCsvcCodeLst1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCsvcCodeLst1Counter != sharedCounter;
         localCsvcCodeLst1Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of csvcCodeLst1
	 *	@return csvcCodeLst1
	 */
	public char[]  getCsvcCodeLst1String() {
	     return getCharArray(beginCsvcCodeLst1,CSVC_CODE_LST_1_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean csvcCodeLst1IsNumeric() {
	    return isNumeric(beginCsvcCodeLst1
	                    ,beginCsvcCodeLst1 + CSVC_CODE_LST_1_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CSVC_CODE_LST_1_LEN = 1;
  	/**
	 * serializeCsvcCodeLst1
	 */
	protected void serializeCsvcCodeLst1(int csvcCodeLst1) {
		 putNumber(beginCsvcCodeLst1,csvcCodeLst1,CSVC_CODE_LST_1_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCsvcCodeLst1Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCsvcCodeLst1
	 */
   	protected  int serializeCsvcCodeLst1(char[] value) {
	    int  csvcCodeLst1;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    csvcCodeLst1 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginCsvcCodeLst1
		       ,1
		      );
		 localCsvcCodeLst1Counter = shareString.getSerializedField().getModifiedCounter();
		return  csvcCodeLst1;
    }

   protected int checkCsvcCodeLst1MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCsvcCodeLst1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCsvcCodeLst1() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCsvcCodeLst1
			                 ,CSVC_CODE_LST_1_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("csvcCodeLst1", beginCsvcCodeLst1,CSVC_CODE_LST_1_LEN);
    }
   	}




}
  
