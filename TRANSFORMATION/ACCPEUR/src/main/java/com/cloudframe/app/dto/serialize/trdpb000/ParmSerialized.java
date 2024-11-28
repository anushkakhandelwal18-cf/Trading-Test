package com.cloudframe.app.dto.serialize.trdpb000;

/**
*  The class ParmSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-11-28 at 06:08. using version 5.0.0.158
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ParmSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ParmSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PARM_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginParmLen;
            protected  int beginCurrency01;
            protected  int beginChkpFrequency;
	
	/**
	* Constructor for ParmSerialized
	**/
    public ParmSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ParmSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PARM_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginParmLen = getStartOffset() + 0;	// set offset for serialization
  
             beginCurrency01 = getStartOffset() + 2;	// set offset for serialization
  
  
             beginChkpFrequency = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localParmLenCounter = -1;
         public boolean isParmLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localParmLenCounter != sharedCounter;
            localParmLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int PARM_LEN_LEN = 2;
  	/**
	 * serializeParmLen
	 */
	protected void serializeParmLen(short parmLen) {
           replaceValue( //  save the value as string
                   getBinaryString( parmLen,PARM_LEN_LEN)
                  ,beginParmLen
                  ,PARM_LEN_LEN
                 );
            localParmLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkParmLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshParmLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshParmLen() {	 
			return (getShort(beginParmLen));
   	}
     int localCurrency01Counter = -1;
     public boolean isCurrency01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrency01Counter != sharedCounter;
         localCurrency01Counter = sharedCounter; return hasModified;
     }
	protected static final int CURRENCY_01_LEN = 3;
	/**
	 * 	serialize this Currency01
	 */
   protected void serializeCurrency01(char[] currency01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(currency01,0,getStringValue(),beginCurrency01,CURRENCY_01_LEN);
       localCurrency01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurrency01Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshCurrency01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurrency01() {	 
   		return (substring(getStringValue(),beginCurrency01,beginCurrency01 + CURRENCY_01_LEN));
   	}
     int localChkpFrequencyCounter = -1;
     public boolean isChkpFrequencyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChkpFrequencyCounter != sharedCounter;
         localChkpFrequencyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of chkpFrequency
	 *	@return chkpFrequency
	 */
	public char[]  getChkpFrequencyString() {
	     return getCharArray(beginChkpFrequency,CHKP_FREQUENCY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean chkpFrequencyIsNumeric() {
	    return isNumeric(beginChkpFrequency
	                    ,beginChkpFrequency + CHKP_FREQUENCY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CHKP_FREQUENCY_LEN = 4;
  	/**
	 * serializeChkpFrequency
	 */
	protected void serializeChkpFrequency(int chkpFrequency) {
		 putNumber(beginChkpFrequency,chkpFrequency,CHKP_FREQUENCY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localChkpFrequencyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeChkpFrequency
	 */
   	protected  int serializeChkpFrequency(char[] value) {
	    int  chkpFrequency;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    chkpFrequency = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginChkpFrequency
		       ,4
		      );
		 localChkpFrequencyCounter = shareString.getSerializedField().getModifiedCounter();
		return  chkpFrequency;
    }

   protected int checkChkpFrequencyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshChkpFrequency is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshChkpFrequency() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginChkpFrequency
			                 ,CHKP_FREQUENCY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("chkpFrequency", beginChkpFrequency,CHKP_FREQUENCY_LEN);
    }
   	}




}
  
