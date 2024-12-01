package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class PpaFixedPortionSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class PpaFixedPortionSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(PpaFixedPortionSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PPA_FIXED_PORTION_LENGTH = 20;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPpaLastUpdDate;
            protected  int beginPpaLastUpdTime;
            protected  int beginPpaPpoIdCount;
	
	/**
	* Constructor for PpaFixedPortionSerialized
	**/
    public PpaFixedPortionSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for PpaFixedPortionSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PpaFixedPortionSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this PpaFixedPortionSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,11961); // serialize this field at offset 11961 by default 
    }
    
	/**
	* sets parent for this PpaFixedPortionSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 11961 by default
    }    
	/**
	* initializes the field in PpaFixedPortionSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PPA_FIXED_PORTION_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginPpaLastUpdDate = getStartOffset() + 8;	// set offset for serialization
  
             beginPpaLastUpdTime = getStartOffset() + 13;	// set offset for serialization
  
             beginPpaPpoIdCount = getStartOffset() + 18;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localPpaLastUpdDateCounter = -1;
        public boolean isPpaLastUpdDateModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localPpaLastUpdDateCounter != sharedCounter;
           localPpaLastUpdDateCounter = sharedCounter; return hasModified; 
        }
	    public boolean ppaLastUpdDateIsNumeric() {
	      return decimalIsNumeric(beginPpaLastUpdDate,PPA_LAST_UPD_DATE_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int PPA_LAST_UPD_DATE_LEN = 5;
  	/**
	 * 	serializePpaLastUpdDate
	 */
	protected void serializePpaLastUpdDate(int ppaLastUpdDate) {
		   putDecimal(beginPpaLastUpdDate,ppaLastUpdDate,PPA_LAST_UPD_DATE_LEN,true);
   }
   

   protected int checkPpaLastUpdDateMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshPpaLastUpdDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPpaLastUpdDate() throws CFException {	
   	try { 
		 return (getIntDecimal(beginPpaLastUpdDate,PPA_LAST_UPD_DATE_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("ppaLastUpdDate", beginPpaLastUpdDate,PPA_LAST_UPD_DATE_LEN);
     }
   	}
        int localPpaLastUpdTimeCounter = -1;
        public boolean isPpaLastUpdTimeModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localPpaLastUpdTimeCounter != sharedCounter;
           localPpaLastUpdTimeCounter = sharedCounter; return hasModified; 
        }
	    public boolean ppaLastUpdTimeIsNumeric() {
	      return decimalIsNumeric(beginPpaLastUpdTime,PPA_LAST_UPD_TIME_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int PPA_LAST_UPD_TIME_LEN = 5;
  	/**
	 * 	serializePpaLastUpdTime
	 */
	protected void serializePpaLastUpdTime(int ppaLastUpdTime) {
		   putDecimal(beginPpaLastUpdTime,ppaLastUpdTime,PPA_LAST_UPD_TIME_LEN,true);
   }
   

   protected int checkPpaLastUpdTimeMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshPpaLastUpdTime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPpaLastUpdTime() throws CFException {	
   	try { 
		 return (getIntDecimal(beginPpaLastUpdTime,PPA_LAST_UPD_TIME_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("ppaLastUpdTime", beginPpaLastUpdTime,PPA_LAST_UPD_TIME_LEN);
     }
   	}
        int localPpaPpoIdCountCounter = -1;
        public boolean isPpaPpoIdCountModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localPpaPpoIdCountCounter != sharedCounter;
           localPpaPpoIdCountCounter = sharedCounter; return hasModified; 
        }
	    public boolean ppaPpoIdCountIsNumeric() {
	      return decimalIsNumeric(beginPpaPpoIdCount,PPA_PPO_ID_COUNT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int PPA_PPO_ID_COUNT_LEN = 2;
  	/**
	 * 	serializePpaPpoIdCount
	 */
	protected void serializePpaPpoIdCount(short ppaPpoIdCount) {
		   putDecimal(beginPpaPpoIdCount,ppaPpoIdCount,PPA_PPO_ID_COUNT_LEN,true);
   }
   

   protected short checkPpaPpoIdCountMaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshPpaPpoIdCount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshPpaPpoIdCount() throws CFException {	
   	try { 
		 return (getShortDecimal(beginPpaPpoIdCount,PPA_PPO_ID_COUNT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("ppaPpoIdCount", beginPpaPpoIdCount,PPA_PPO_ID_COUNT_LEN);
     }
   	}




}
  
