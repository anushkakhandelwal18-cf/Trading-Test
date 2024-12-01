package com.cloudframe.app.dto.serialize.d529351u;

/**
*  The class WorkAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:50. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_AREA_LENGTH = 27;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDsmPgmName;
            protected  int beginNullSpiVerNbr;
            protected  int beginCommonRulesSpi;
            protected  int beginDb2ReqDosDate;
	
	/**
	* Constructor for WorkAreaSerialized
	**/
    public WorkAreaSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WorkAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WORK_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDsmPgmName = getStartOffset() + 0;	// set offset for serialization
  
             beginNullSpiVerNbr = getStartOffset() + 8;	// set offset for serialization
  
             beginCommonRulesSpi = getStartOffset() + 10;	// set offset for serialization
  
             beginDb2ReqDosDate = getStartOffset() + 17;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDsmPgmNameCounter = -1;
     public boolean isDsmPgmNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDsmPgmNameCounter != sharedCounter;
         localDsmPgmNameCounter = sharedCounter; return hasModified;
     }
	protected static final int DSM_PGM_NAME_LEN = 8;
	/**
	 * 	serialize this DsmPgmName
	 */
   protected void serializeDsmPgmName(char[] dsmPgmName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dsmPgmName,0,getStringValue(),beginDsmPgmName,DSM_PGM_NAME_LEN);
       localDsmPgmNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDsmPgmNameConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshDsmPgmName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDsmPgmName() {	 
   		return (substring(getStringValue(),beginDsmPgmName,beginDsmPgmName + DSM_PGM_NAME_LEN));
   	}
         int localNullSpiVerNbrCounter = -1;
         public boolean isNullSpiVerNbrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localNullSpiVerNbrCounter != sharedCounter;
            localNullSpiVerNbrCounter = sharedCounter; return hasModified; 
         }
   protected static final int NULL_SPI_VER_NBR_LEN = 2;
  	/**
	 * serializeNullSpiVerNbr
	 */
	protected void serializeNullSpiVerNbr(short nullSpiVerNbr) {
           replaceValue( //  save the value as string
                   getBinaryString( nullSpiVerNbr,NULL_SPI_VER_NBR_LEN)
                  ,beginNullSpiVerNbr
                  ,NULL_SPI_VER_NBR_LEN
                 );
            localNullSpiVerNbrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkNullSpiVerNbrMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshNullSpiVerNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshNullSpiVerNbr() {	 
			return (getShort(beginNullSpiVerNbr));
   	}
     int localCommonRulesSpiCounter = -1;
     public boolean isCommonRulesSpiModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCommonRulesSpiCounter != sharedCounter;
         localCommonRulesSpiCounter = sharedCounter; return hasModified;
     }
	protected static final int COMMON_RULES_SPI_LEN = 7;
	/**
	 * 	serialize this CommonRulesSpi
	 */
   protected void serializeCommonRulesSpi(char[] commonRulesSpi) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(commonRulesSpi,0,getStringValue(),beginCommonRulesSpi,COMMON_RULES_SPI_LEN);
       localCommonRulesSpiCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCommonRulesSpiConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshCommonRulesSpi is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCommonRulesSpi() {	 
   		return (substring(getStringValue(),beginCommonRulesSpi,beginCommonRulesSpi + COMMON_RULES_SPI_LEN));
   	}
     int localDb2ReqDosDateCounter = -1;
     public boolean isDb2ReqDosDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDb2ReqDosDateCounter != sharedCounter;
         localDb2ReqDosDateCounter = sharedCounter; return hasModified;
     }
	protected static final int DB_2_REQ_DOS_DATE_LEN = 10;
	/**
	 * 	serialize this Db2ReqDosDate
	 */
   protected void serializeDb2ReqDosDate(char[] db2ReqDosDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(db2ReqDosDate,0,getStringValue(),beginDb2ReqDosDate,DB_2_REQ_DOS_DATE_LEN);
       localDb2ReqDosDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDb2ReqDosDateConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshDb2ReqDosDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDb2ReqDosDate() {	 
   		return (substring(getStringValue(),beginDb2ReqDosDate,beginDb2ReqDosDate + DB_2_REQ_DOS_DATE_LEN));
   	}




}
  
