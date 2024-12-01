package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class SrpSortRequestParametersSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class SrpSortRequestParametersSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SrpSortRequestParametersSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SRP_SORT_REQUEST_PARAMETERS_LENGTH = 15;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSrpReturnCode;
            protected  int beginSrpEntryCount;
            protected  int beginSrpEntryLength;
            protected  int beginSrpKeyStart;
            protected  int beginSrpKeyLength;
            protected  int beginSrpSequence;
	
	/**
	* Constructor for SrpSortRequestParametersSerialized
	**/
    public SrpSortRequestParametersSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in SrpSortRequestParametersSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SRP_SORT_REQUEST_PARAMETERS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSrpReturnCode = getStartOffset() + 0;	// set offset for serialization
  
             beginSrpEntryCount = getStartOffset() + 2;	// set offset for serialization
  
             beginSrpEntryLength = getStartOffset() + 5;	// set offset for serialization
  
             beginSrpKeyStart = getStartOffset() + 8;	// set offset for serialization
  
             beginSrpKeyLength = getStartOffset() + 11;	// set offset for serialization
  
             beginSrpSequence = getStartOffset() + 14;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSrpReturnCodeCounter = -1;
     public boolean isSrpReturnCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrpReturnCodeCounter != sharedCounter;
         localSrpReturnCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int SRP_RETURN_CODE_LEN = 2;
	/**
	 * 	serialize this SrpReturnCode
	 */
   protected void serializeSrpReturnCode(char[] srpReturnCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(srpReturnCode,0,getStringValue(),beginSrpReturnCode,SRP_RETURN_CODE_LEN);
       localSrpReturnCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSrpReturnCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSrpReturnCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSrpReturnCode() {	 
   		return (substring(getStringValue(),beginSrpReturnCode,beginSrpReturnCode + SRP_RETURN_CODE_LEN));
   	}
        int localSrpEntryCountCounter = -1;
        public boolean isSrpEntryCountModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSrpEntryCountCounter != sharedCounter;
           localSrpEntryCountCounter = sharedCounter; return hasModified; 
        }
	    public boolean srpEntryCountIsNumeric() {
	      return decimalIsNumeric(beginSrpEntryCount,SRP_ENTRY_COUNT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int SRP_ENTRY_COUNT_LEN = 3;
  	/**
	 * 	serializeSrpEntryCount
	 */
	protected void serializeSrpEntryCount(int srpEntryCount) {
		   putDecimal(beginSrpEntryCount,srpEntryCount,SRP_ENTRY_COUNT_LEN,true);
   }
   

   protected int checkSrpEntryCountMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_100K /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshSrpEntryCount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSrpEntryCount() throws CFException {	
   	try { 
		 return (getIntDecimal(beginSrpEntryCount,SRP_ENTRY_COUNT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("srpEntryCount", beginSrpEntryCount,SRP_ENTRY_COUNT_LEN);
     }
   	}
        int localSrpEntryLengthCounter = -1;
        public boolean isSrpEntryLengthModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSrpEntryLengthCounter != sharedCounter;
           localSrpEntryLengthCounter = sharedCounter; return hasModified; 
        }
	    public boolean srpEntryLengthIsNumeric() {
	      return decimalIsNumeric(beginSrpEntryLength,SRP_ENTRY_LENGTH_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int SRP_ENTRY_LENGTH_LEN = 3;
  	/**
	 * 	serializeSrpEntryLength
	 */
	protected void serializeSrpEntryLength(int srpEntryLength) {
		   putDecimal(beginSrpEntryLength,srpEntryLength,SRP_ENTRY_LENGTH_LEN,true);
   }
   

   protected int checkSrpEntryLengthMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_100K /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshSrpEntryLength is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSrpEntryLength() throws CFException {	
   	try { 
		 return (getIntDecimal(beginSrpEntryLength,SRP_ENTRY_LENGTH_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("srpEntryLength", beginSrpEntryLength,SRP_ENTRY_LENGTH_LEN);
     }
   	}
        int localSrpKeyStartCounter = -1;
        public boolean isSrpKeyStartModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSrpKeyStartCounter != sharedCounter;
           localSrpKeyStartCounter = sharedCounter; return hasModified; 
        }
	    public boolean srpKeyStartIsNumeric() {
	      return decimalIsNumeric(beginSrpKeyStart,SRP_KEY_START_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int SRP_KEY_START_LEN = 3;
  	/**
	 * 	serializeSrpKeyStart
	 */
	protected void serializeSrpKeyStart(int srpKeyStart) {
		   putDecimal(beginSrpKeyStart,srpKeyStart,SRP_KEY_START_LEN,true);
   }
   

   protected int checkSrpKeyStartMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_100K /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshSrpKeyStart is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSrpKeyStart() throws CFException {	
   	try { 
		 return (getIntDecimal(beginSrpKeyStart,SRP_KEY_START_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("srpKeyStart", beginSrpKeyStart,SRP_KEY_START_LEN);
     }
   	}
        int localSrpKeyLengthCounter = -1;
        public boolean isSrpKeyLengthModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSrpKeyLengthCounter != sharedCounter;
           localSrpKeyLengthCounter = sharedCounter; return hasModified; 
        }
	    public boolean srpKeyLengthIsNumeric() {
	      return decimalIsNumeric(beginSrpKeyLength,SRP_KEY_LENGTH_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int SRP_KEY_LENGTH_LEN = 3;
  	/**
	 * 	serializeSrpKeyLength
	 */
	protected void serializeSrpKeyLength(int srpKeyLength) {
		   putDecimal(beginSrpKeyLength,srpKeyLength,SRP_KEY_LENGTH_LEN,true);
   }
   

   protected int checkSrpKeyLengthMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_100K /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshSrpKeyLength is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSrpKeyLength() throws CFException {	
   	try { 
		 return (getIntDecimal(beginSrpKeyLength,SRP_KEY_LENGTH_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("srpKeyLength", beginSrpKeyLength,SRP_KEY_LENGTH_LEN);
     }
   	}
     int localSrpSequenceCounter = -1;
     public boolean isSrpSequenceModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSrpSequenceCounter != sharedCounter;
         localSrpSequenceCounter = sharedCounter; return hasModified;
     }
	protected static final int SRP_SEQUENCE_LEN = 1;
	/**
	 * 	serialize this SrpSequence
	 */
   protected void serializeSrpSequence(char[] srpSequence) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(srpSequence,0,getStringValue(),beginSrpSequence,SRP_SEQUENCE_LEN);
       localSrpSequenceCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSrpSequenceConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSrpSequence is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSrpSequence() {	 
   		return (substring(getStringValue(),beginSrpSequence,beginSrpSequence + SRP_SEQUENCE_LEN));
   	}




}
  
