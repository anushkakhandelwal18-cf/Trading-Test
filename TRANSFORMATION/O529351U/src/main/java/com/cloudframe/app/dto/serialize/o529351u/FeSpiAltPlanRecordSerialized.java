package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class FeSpiAltPlanRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class FeSpiAltPlanRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FeSpiAltPlanRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FE_SPI_ALT_PLAN_RECORD_LENGTH = 31;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFesaCanDt;
	
	/**
	* Constructor for FeSpiAltPlanRecordSerialized
	**/
    public FeSpiAltPlanRecordSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FeSpiAltPlanRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FE_SPI_ALT_PLAN_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginFesaCanDt = getStartOffset() + 26;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localFesaCanDtCounter = -1;
        public boolean isFesaCanDtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localFesaCanDtCounter != sharedCounter;
           localFesaCanDtCounter = sharedCounter; return hasModified; 
        }
	    public boolean fesaCanDtIsNumeric() {
	      return decimalIsNumeric(beginFesaCanDt,FESA_CAN_DT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int FESA_CAN_DT_LEN = 5;
  	/**
	 * 	serializeFesaCanDt
	 */
	protected void serializeFesaCanDt(int fesaCanDt) {
		   putDecimal(beginFesaCanDt,fesaCanDt,FESA_CAN_DT_LEN,true);
   }
   

   protected int checkFesaCanDtMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshFesaCanDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFesaCanDt() throws CFException {	
   	try { 
		 return (getIntDecimal(beginFesaCanDt,FESA_CAN_DT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("fesaCanDt", beginFesaCanDt,FESA_CAN_DT_LEN);
     }
   	}




}
  
