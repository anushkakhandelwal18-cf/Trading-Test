package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class DsmRecDetailsAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DsmRecDetailsAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DsmRecDetailsAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DSM_REC_DETAILS_AREA_LENGTH = 32;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDsmRecIcn;
            protected  int beginDsmRecIcnSufxCd;
            protected  int beginDsmRecVersNbr;
            protected  int beginDsmRecProcDate;
            protected  int beginDsmRecProcTime;
	
	/**
	* Constructor for DsmRecDetailsAreaSerialized
	**/
    public DsmRecDetailsAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for DsmRecDetailsAreaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DsmRecDetailsAreaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this DsmRecDetailsAreaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1110); // serialize this field at offset 1110 by default 
    }
    
	/**
	* sets parent for this DsmRecDetailsAreaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1110 by default
    }    
	/**
	* initializes the field in DsmRecDetailsAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DSM_REC_DETAILS_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDsmRecIcn = getStartOffset() + 0;	// set offset for serialization
  
             beginDsmRecIcnSufxCd = getStartOffset() + 10;	// set offset for serialization
  
             beginDsmRecVersNbr = getStartOffset() + 12;	// set offset for serialization
  
             beginDsmRecProcDate = getStartOffset() + 14;	// set offset for serialization
  
             beginDsmRecProcTime = getStartOffset() + 24;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDsmRecIcnCounter = -1;
     public boolean isDsmRecIcnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDsmRecIcnCounter != sharedCounter;
         localDsmRecIcnCounter = sharedCounter; return hasModified;
     }
	protected static final int DSM_REC_ICN_LEN = 10;
	/**
	 * 	serialize this DsmRecIcn
	 */
   protected void serializeDsmRecIcn(char[] dsmRecIcn) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dsmRecIcn,0,getStringValue(),beginDsmRecIcn,DSM_REC_ICN_LEN);
       localDsmRecIcnCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDsmRecIcnConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshDsmRecIcn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDsmRecIcn() {	 
   		return (substring(getStringValue(),beginDsmRecIcn,beginDsmRecIcn + DSM_REC_ICN_LEN));
   	}
     int localDsmRecIcnSufxCdCounter = -1;
     public boolean isDsmRecIcnSufxCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDsmRecIcnSufxCdCounter != sharedCounter;
         localDsmRecIcnSufxCdCounter = sharedCounter; return hasModified;
     }
	protected static final int DSM_REC_ICN_SUFX_CD_LEN = 2;
	/**
	 * 	serialize this DsmRecIcnSufxCd
	 */
   protected void serializeDsmRecIcnSufxCd(char[] dsmRecIcnSufxCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dsmRecIcnSufxCd,0,getStringValue(),beginDsmRecIcnSufxCd,DSM_REC_ICN_SUFX_CD_LEN);
       localDsmRecIcnSufxCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDsmRecIcnSufxCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDsmRecIcnSufxCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDsmRecIcnSufxCd() {	 
   		return (substring(getStringValue(),beginDsmRecIcnSufxCd,beginDsmRecIcnSufxCd + DSM_REC_ICN_SUFX_CD_LEN));
   	}
     int localDsmRecVersNbrCounter = -1;
     public boolean isDsmRecVersNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDsmRecVersNbrCounter != sharedCounter;
         localDsmRecVersNbrCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dsmRecVersNbr
	 *	@return dsmRecVersNbr
	 */
	public char[]  getDsmRecVersNbrString() {
	     return getCharArray(beginDsmRecVersNbr,DSM_REC_VERS_NBR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dsmRecVersNbrIsNumeric() {
	    return isNumeric(beginDsmRecVersNbr
	                    ,beginDsmRecVersNbr + DSM_REC_VERS_NBR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DSM_REC_VERS_NBR_LEN = 2;
  	/**
	 * serializeDsmRecVersNbr
	 */
	protected void serializeDsmRecVersNbr(int dsmRecVersNbr) {
		 putNumber(beginDsmRecVersNbr,dsmRecVersNbr,DSM_REC_VERS_NBR_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDsmRecVersNbrCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDsmRecVersNbr
	 */
   	protected  int serializeDsmRecVersNbr(char[] value) {
	    int  dsmRecVersNbr;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dsmRecVersNbr = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginDsmRecVersNbr
		       ,2
		      );
		 localDsmRecVersNbrCounter = shareString.getSerializedField().getModifiedCounter();
		return  dsmRecVersNbr;
    }

   protected int checkDsmRecVersNbrMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDsmRecVersNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDsmRecVersNbr() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDsmRecVersNbr
			                 ,DSM_REC_VERS_NBR_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dsmRecVersNbr", beginDsmRecVersNbr,DSM_REC_VERS_NBR_LEN);
    }
   	}
     int localDsmRecProcDateCounter = -1;
     public boolean isDsmRecProcDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDsmRecProcDateCounter != sharedCounter;
         localDsmRecProcDateCounter = sharedCounter; return hasModified;
     }
	protected static final int DSM_REC_PROC_DATE_LEN = 10;
	/**
	 * 	serialize this DsmRecProcDate
	 */
   protected void serializeDsmRecProcDate(char[] dsmRecProcDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dsmRecProcDate,0,getStringValue(),beginDsmRecProcDate,DSM_REC_PROC_DATE_LEN);
       localDsmRecProcDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDsmRecProcDateConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshDsmRecProcDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDsmRecProcDate() {	 
   		return (substring(getStringValue(),beginDsmRecProcDate,beginDsmRecProcDate + DSM_REC_PROC_DATE_LEN));
   	}
     int localDsmRecProcTimeCounter = -1;
     public boolean isDsmRecProcTimeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDsmRecProcTimeCounter != sharedCounter;
         localDsmRecProcTimeCounter = sharedCounter; return hasModified;
     }
	protected static final int DSM_REC_PROC_TIME_LEN = 8;
	/**
	 * 	serialize this DsmRecProcTime
	 */
   protected void serializeDsmRecProcTime(char[] dsmRecProcTime) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dsmRecProcTime,0,getStringValue(),beginDsmRecProcTime,DSM_REC_PROC_TIME_LEN);
       localDsmRecProcTimeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDsmRecProcTimeConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshDsmRecProcTime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDsmRecProcTime() {	 
   		return (substring(getStringValue(),beginDsmRecProcTime,beginDsmRecProcTime + DSM_REC_PROC_TIME_LEN));
   	}




}
  
