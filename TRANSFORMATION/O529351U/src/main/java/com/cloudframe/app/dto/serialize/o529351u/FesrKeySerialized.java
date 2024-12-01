package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class FesrKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FesrKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FesrKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FESR_KEY_LENGTH = 16;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFesrSpiNbr;
            protected  int beginFesrToPs;
            protected  int beginFesrToSvc;
            protected  int beginFesrToCause;
	
	/**
	* Constructor for FesrKeySerialized
	**/
    public FesrKeySerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FesrKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FESR_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFesrSpiNbr = getStartOffset() + 0;	// set offset for serialization
  
             beginFesrToPs = getStartOffset() + 7;	// set offset for serialization
  
             beginFesrToSvc = getStartOffset() + 9;	// set offset for serialization
  
             beginFesrToCause = getStartOffset() + 15;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFesrSpiNbrCounter = -1;
     public boolean isFesrSpiNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFesrSpiNbrCounter != sharedCounter;
         localFesrSpiNbrCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of fesrSpiNbr
	 *	@return fesrSpiNbr
	 */
	public char[]  getFesrSpiNbrString() {
	     return getCharArray(beginFesrSpiNbr,FESR_SPI_NBR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean fesrSpiNbrIsNumeric() {
	    return isNumeric(beginFesrSpiNbr
	                    ,beginFesrSpiNbr + FESR_SPI_NBR_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FESR_SPI_NBR_LEN = 7;
  	/**
	 * serializeFesrSpiNbr
	 */
	protected void serializeFesrSpiNbr(int fesrSpiNbr) {
		 putNumber(beginFesrSpiNbr,fesrSpiNbr,FESR_SPI_NBR_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFesrSpiNbrCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFesrSpiNbr
	 */
   	protected  int serializeFesrSpiNbr(char[] value) {
	    int  fesrSpiNbr;
	    if(value.length >0 && value.length!= 7)
            value = new String(value).trim().toCharArray();
	    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
	    else if (value.length > 7) value = substring(value,0,7);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    fesrSpiNbr = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(7,value,true/*isSigned?*/)
		       ,beginFesrSpiNbr
		       ,7
		      );
		 localFesrSpiNbrCounter = shareString.getSerializedField().getModifiedCounter();
		return  fesrSpiNbr;
    }

   protected int checkFesrSpiNbrMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10M/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshFesrSpiNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFesrSpiNbr() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginFesrSpiNbr
			                 ,FESR_SPI_NBR_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("fesrSpiNbr", beginFesrSpiNbr,FESR_SPI_NBR_LEN);
    }
   	}
     int localFesrToPsCounter = -1;
     public boolean isFesrToPsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFesrToPsCounter != sharedCounter;
         localFesrToPsCounter = sharedCounter; return hasModified;
     }
	protected static final int FESR_TO_PS_LEN = 2;
	/**
	 * 	serialize this FesrToPs
	 */
   protected void serializeFesrToPs(char[] fesrToPs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fesrToPs,0,getStringValue(),beginFesrToPs,FESR_TO_PS_LEN);
       localFesrToPsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFesrToPsConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshFesrToPs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFesrToPs() {	 
   		return (substring(getStringValue(),beginFesrToPs,beginFesrToPs + FESR_TO_PS_LEN));
   	}
     int localFesrToSvcCounter = -1;
     public boolean isFesrToSvcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFesrToSvcCounter != sharedCounter;
         localFesrToSvcCounter = sharedCounter; return hasModified;
     }
	protected static final int FESR_TO_SVC_LEN = 6;
	/**
	 * 	serialize this FesrToSvc
	 */
   protected void serializeFesrToSvc(char[] fesrToSvc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fesrToSvc,0,getStringValue(),beginFesrToSvc,FESR_TO_SVC_LEN);
       localFesrToSvcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFesrToSvcConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshFesrToSvc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFesrToSvc() {	 
   		return (substring(getStringValue(),beginFesrToSvc,beginFesrToSvc + FESR_TO_SVC_LEN));
   	}
     int localFesrToCauseCounter = -1;
     public boolean isFesrToCauseModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFesrToCauseCounter != sharedCounter;
         localFesrToCauseCounter = sharedCounter; return hasModified;
     }
	protected static final int FESR_TO_CAUSE_LEN = 1;
	/**
	 * 	serialize this FesrToCause
	 */
   protected void serializeFesrToCause(char[] fesrToCause) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fesrToCause,0,getStringValue(),beginFesrToCause,FESR_TO_CAUSE_LEN);
       localFesrToCauseCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFesrToCauseConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFesrToCause is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFesrToCause() {	 
   		return (substring(getStringValue(),beginFesrToCause,beginFesrToCause + FESR_TO_CAUSE_LEN));
   	}




}
  
