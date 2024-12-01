package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class FesrKey01Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class FesrKey01Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FesrKey01Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FESR_KEY_01_LENGTH = 13;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFesrSpiNbr01;
            protected  int beginFesrToPs01;
            protected  int beginFesrToSvc01;
            protected  int beginFesrToCause01;
	
	/**
	* Constructor for FesrKey01Serialized
	**/
    public FesrKey01Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for FesrKey01Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FesrKey01Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this FesrKey01Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this FesrKey01Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in FesrKey01Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FESR_KEY_01_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFesrSpiNbr01 = getStartOffset() + 0;	// set offset for serialization
  
             beginFesrToPs01 = getStartOffset() + 4;	// set offset for serialization
  
             beginFesrToSvc01 = getStartOffset() + 6;	// set offset for serialization
  
             beginFesrToCause01 = getStartOffset() + 12;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localFesrSpiNbr01Counter = -1;
        public boolean isFesrSpiNbr01Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localFesrSpiNbr01Counter != sharedCounter;
           localFesrSpiNbr01Counter = sharedCounter; return hasModified; 
        }
	    public boolean fesrSpiNbr01IsNumeric() {
	      return decimalIsNumeric(beginFesrSpiNbr01,FESR_SPI_NBR_01_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int FESR_SPI_NBR_01_LEN = 4;
  	/**
	 * 	serializeFesrSpiNbr01
	 */
	protected void serializeFesrSpiNbr01(int fesrSpiNbr01) {
		   putDecimal(beginFesrSpiNbr01,fesrSpiNbr01,FESR_SPI_NBR_01_LEN,true);
   }
   

   protected int checkFesrSpiNbr01MaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_10M /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshFesrSpiNbr01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFesrSpiNbr01() throws CFException {	
   	try { 
		 return (getIntDecimal(beginFesrSpiNbr01,FESR_SPI_NBR_01_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("fesrSpiNbr01", beginFesrSpiNbr01,FESR_SPI_NBR_01_LEN);
     }
   	}
     int localFesrToPs01Counter = -1;
     public boolean isFesrToPs01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFesrToPs01Counter != sharedCounter;
         localFesrToPs01Counter = sharedCounter; return hasModified;
     }
	protected static final int FESR_TO_PS_01_LEN = 2;
	/**
	 * 	serialize this FesrToPs01
	 */
   protected void serializeFesrToPs01(char[] fesrToPs01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fesrToPs01,0,getStringValue(),beginFesrToPs01,FESR_TO_PS_01_LEN);
       localFesrToPs01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFesrToPs01Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshFesrToPs01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFesrToPs01() {	 
   		return (substring(getStringValue(),beginFesrToPs01,beginFesrToPs01 + FESR_TO_PS_01_LEN));
   	}
     int localFesrToSvc01Counter = -1;
     public boolean isFesrToSvc01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFesrToSvc01Counter != sharedCounter;
         localFesrToSvc01Counter = sharedCounter; return hasModified;
     }
	protected static final int FESR_TO_SVC_01_LEN = 6;
	/**
	 * 	serialize this FesrToSvc01
	 */
   protected void serializeFesrToSvc01(char[] fesrToSvc01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fesrToSvc01,0,getStringValue(),beginFesrToSvc01,FESR_TO_SVC_01_LEN);
       localFesrToSvc01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFesrToSvc01Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshFesrToSvc01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFesrToSvc01() {	 
   		return (substring(getStringValue(),beginFesrToSvc01,beginFesrToSvc01 + FESR_TO_SVC_01_LEN));
   	}
     int localFesrToCause01Counter = -1;
     public boolean isFesrToCause01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFesrToCause01Counter != sharedCounter;
         localFesrToCause01Counter = sharedCounter; return hasModified;
     }
	protected static final int FESR_TO_CAUSE_01_LEN = 1;
	/**
	 * 	serialize this FesrToCause01
	 */
   protected void serializeFesrToCause01(char[] fesrToCause01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fesrToCause01,0,getStringValue(),beginFesrToCause01,FESR_TO_CAUSE_01_LEN);
       localFesrToCause01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFesrToCause01Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFesrToCause01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFesrToCause01() {	 
   		return (substring(getStringValue(),beginFesrToCause01,beginFesrToCause01 + FESR_TO_CAUSE_01_LEN));
   	}




}
  
