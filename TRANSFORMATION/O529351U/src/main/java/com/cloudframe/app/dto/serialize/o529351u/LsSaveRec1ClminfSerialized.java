package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class LsSaveRec1ClminfSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class LsSaveRec1ClminfSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(LsSaveRec1ClminfSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int LS_SAVE_REC_1_CLMINF_LENGTH = 561;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginSavProviderArea;
           protected static final int SAV_PROVIDER_AREA_SIZE = 2;
            protected  int beginSavDiagCodePoa;
            protected  int beginSavInputProcIdNum;
            protected  int beginSavOncologyInd;
            protected  int beginSavReferingNpi;
            protected  int beginSavAttendingNpi;
	
	/**
	* Constructor for LsSaveRec1ClminfSerialized
	**/
    public LsSaveRec1ClminfSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in LsSaveRec1ClminfSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(LS_SAVE_REC_1_CLMINF_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginSavProviderArea = getStartOffset() + 0; // set offset for serialization
  
  
             beginSavDiagCodePoa = getStartOffset() + 121;	// set offset for serialization
  
  
             beginSavInputProcIdNum = getStartOffset() + 237;	// set offset for serialization
  
             beginSavOncologyInd = getStartOffset() + 374;	// set offset for serialization
  
             beginSavReferingNpi = getStartOffset() + 412;	// set offset for serialization
  
             beginSavAttendingNpi = getStartOffset() + 412;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSavDiagCodePoaCounter = -1;
     public boolean isSavDiagCodePoaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSavDiagCodePoaCounter != sharedCounter;
         localSavDiagCodePoaCounter = sharedCounter; return hasModified;
     }
	protected static final int SAV_DIAG_CODE_POA_LEN = 54;
	/**
	 * 	serialize this SavDiagCodePoa
	 */
   protected void serializeSavDiagCodePoa(char[] savDiagCodePoa) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(savDiagCodePoa,0,getStringValue(),beginSavDiagCodePoa,SAV_DIAG_CODE_POA_LEN);
       localSavDiagCodePoaCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSavDiagCodePoaConstraints(char[] value) {
   			return super.checkConstraints(value , 54 ,false, false);
   }
    /**
	 *	refreshSavDiagCodePoa is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSavDiagCodePoa() {	 
   		return (substring(getStringValue(),beginSavDiagCodePoa,beginSavDiagCodePoa + SAV_DIAG_CODE_POA_LEN));
   	}
     int localSavInputProcIdNumCounter = -1;
     public boolean isSavInputProcIdNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSavInputProcIdNumCounter != sharedCounter;
         localSavInputProcIdNumCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of savInputProcIdNum
	 *	@return savInputProcIdNum
	 */
	public char[]  getSavInputProcIdNumString() {
	     return getCharArray(beginSavInputProcIdNum,SAV_INPUT_PROC_ID_NUM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean savInputProcIdNumIsNumeric() {
	    return isNumeric(beginSavInputProcIdNum
	                    ,beginSavInputProcIdNum + SAV_INPUT_PROC_ID_NUM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SAV_INPUT_PROC_ID_NUM_LEN = 9;
  	/**
	 * serializeSavInputProcIdNum
	 */
	protected void serializeSavInputProcIdNum(long savInputProcIdNum) {
		 putNumber(beginSavInputProcIdNum,savInputProcIdNum,SAV_INPUT_PROC_ID_NUM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSavInputProcIdNumCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSavInputProcIdNum
	 */
   	protected  long serializeSavInputProcIdNum(char[] value) {
	    long  savInputProcIdNum;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    savInputProcIdNum = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginSavInputProcIdNum
		       ,9
		      );
		 localSavInputProcIdNumCounter = shareString.getSerializedField().getModifiedCounter();
		return  savInputProcIdNum;
    }

   protected long checkSavInputProcIdNumMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSavInputProcIdNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSavInputProcIdNum() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSavInputProcIdNum
			                 ,SAV_INPUT_PROC_ID_NUM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("savInputProcIdNum", beginSavInputProcIdNum,SAV_INPUT_PROC_ID_NUM_LEN);
    }
   	}
     int localSavOncologyIndCounter = -1;
     public boolean isSavOncologyIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSavOncologyIndCounter != sharedCounter;
         localSavOncologyIndCounter = sharedCounter; return hasModified;
     }
	protected static final int SAV_ONCOLOGY_IND_LEN = 1;
	/**
	 * 	serialize this SavOncologyInd
	 */
   protected void serializeSavOncologyInd(char[] savOncologyInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(savOncologyInd,0,getStringValue(),beginSavOncologyInd,SAV_ONCOLOGY_IND_LEN);
       localSavOncologyIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSavOncologyIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSavOncologyInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSavOncologyInd() {	 
   		return (substring(getStringValue(),beginSavOncologyInd,beginSavOncologyInd + SAV_ONCOLOGY_IND_LEN));
   	}
     int localSavReferingNpiCounter = -1;
     public boolean isSavReferingNpiModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSavReferingNpiCounter != sharedCounter;
         localSavReferingNpiCounter = sharedCounter; return hasModified;
     }
	protected static final int SAV_REFERING_NPI_LEN = 10;
	/**
	 * 	serialize this SavReferingNpi
	 */
   protected void serializeSavReferingNpi(char[] savReferingNpi) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(savReferingNpi,0,getStringValue(),beginSavReferingNpi,SAV_REFERING_NPI_LEN);
       localSavReferingNpiCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSavReferingNpiConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshSavReferingNpi is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSavReferingNpi() {	 
   		return (substring(getStringValue(),beginSavReferingNpi,beginSavReferingNpi + SAV_REFERING_NPI_LEN));
   	}
     int localSavAttendingNpiCounter = -1;
     public boolean isSavAttendingNpiModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSavAttendingNpiCounter != sharedCounter;
         localSavAttendingNpiCounter = sharedCounter; return hasModified;
     }
	protected static final int SAV_ATTENDING_NPI_LEN = 10;
	/**
	 * 	serialize this SavAttendingNpi
	 */
   protected void serializeSavAttendingNpi(char[] savAttendingNpi) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(savAttendingNpi,0,getStringValue(),beginSavAttendingNpi,SAV_ATTENDING_NPI_LEN);
       localSavAttendingNpiCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSavAttendingNpiConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshSavAttendingNpi is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSavAttendingNpi() {	 
   		return (substring(getStringValue(),beginSavAttendingNpi,beginSavAttendingNpi + SAV_ATTENDING_NPI_LEN));
   	}

		public int savProviderAreaSize() {
			return SAV_PROVIDER_AREA_SIZE;
		}



}
  
