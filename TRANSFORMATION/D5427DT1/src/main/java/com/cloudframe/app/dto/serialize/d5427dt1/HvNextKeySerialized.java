package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class HvNextKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HvNextKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HvNextKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HV_NEXT_KEY_LENGTH = 36;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHvNextProcDt;
            protected  int beginHvNextProcTm;
            protected  int beginHvNextPgmIdLstCharVal;
            protected  int beginHvNextIcnSufxVersNbr;
            protected  int beginHvNextInvnCtlNbr;
            protected  int beginHvNextIcnSufxCd;
            protected  int beginHvNextLnId;
	
	/**
	* Constructor for HvNextKeySerialized
	**/
    public HvNextKeySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for HvNextKeySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HvNextKeySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this HvNextKeySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,209); // serialize this field at offset 209 by default 
    }
    
	/**
	* sets parent for this HvNextKeySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 209 by default
    }    
	/**
	* initializes the field in HvNextKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HV_NEXT_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHvNextProcDt = getStartOffset() + 0;	// set offset for serialization
  
             beginHvNextProcTm = getStartOffset() + 10;	// set offset for serialization
  
             beginHvNextPgmIdLstCharVal = getStartOffset() + 18;	// set offset for serialization
  
             beginHvNextIcnSufxVersNbr = getStartOffset() + 19;	// set offset for serialization
  
             beginHvNextInvnCtlNbr = getStartOffset() + 21;	// set offset for serialization
  
             beginHvNextIcnSufxCd = getStartOffset() + 31;	// set offset for serialization
  
             beginHvNextLnId = getStartOffset() + 34;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localHvNextProcDtCounter = -1;
     public boolean isHvNextProcDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHvNextProcDtCounter != sharedCounter;
         localHvNextProcDtCounter = sharedCounter; return hasModified;
     }
	protected static final int HV_NEXT_PROC_DT_LEN = 10;
	/**
	 * 	serialize this HvNextProcDt
	 */
   protected void serializeHvNextProcDt(char[] hvNextProcDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hvNextProcDt,0,getStringValue(),beginHvNextProcDt,HV_NEXT_PROC_DT_LEN);
       localHvNextProcDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHvNextProcDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshHvNextProcDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHvNextProcDt() {	 
   		return (substring(getStringValue(),beginHvNextProcDt,beginHvNextProcDt + HV_NEXT_PROC_DT_LEN));
   	}
     int localHvNextProcTmCounter = -1;
     public boolean isHvNextProcTmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHvNextProcTmCounter != sharedCounter;
         localHvNextProcTmCounter = sharedCounter; return hasModified;
     }
	protected static final int HV_NEXT_PROC_TM_LEN = 8;
	/**
	 * 	serialize this HvNextProcTm
	 */
   protected void serializeHvNextProcTm(char[] hvNextProcTm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hvNextProcTm,0,getStringValue(),beginHvNextProcTm,HV_NEXT_PROC_TM_LEN);
       localHvNextProcTmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHvNextProcTmConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshHvNextProcTm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHvNextProcTm() {	 
   		return (substring(getStringValue(),beginHvNextProcTm,beginHvNextProcTm + HV_NEXT_PROC_TM_LEN));
   	}
     int localHvNextPgmIdLstCharValCounter = -1;
     public boolean isHvNextPgmIdLstCharValModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHvNextPgmIdLstCharValCounter != sharedCounter;
         localHvNextPgmIdLstCharValCounter = sharedCounter; return hasModified;
     }
	protected static final int HV_NEXT_PGM_ID_LST_CHAR_VAL_LEN = 1;
	/**
	 * 	serialize this HvNextPgmIdLstCharVal
	 */
   protected void serializeHvNextPgmIdLstCharVal(char[] hvNextPgmIdLstCharVal) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hvNextPgmIdLstCharVal,0,getStringValue(),beginHvNextPgmIdLstCharVal,HV_NEXT_PGM_ID_LST_CHAR_VAL_LEN);
       localHvNextPgmIdLstCharValCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHvNextPgmIdLstCharValConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshHvNextPgmIdLstCharVal is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHvNextPgmIdLstCharVal() {	 
   		return (substring(getStringValue(),beginHvNextPgmIdLstCharVal,beginHvNextPgmIdLstCharVal + HV_NEXT_PGM_ID_LST_CHAR_VAL_LEN));
   	}
         int localHvNextIcnSufxVersNbrCounter = -1;
         public boolean isHvNextIcnSufxVersNbrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localHvNextIcnSufxVersNbrCounter != sharedCounter;
            localHvNextIcnSufxVersNbrCounter = sharedCounter; return hasModified; 
         }
   protected static final int HV_NEXT_ICN_SUFX_VERS_NBR_LEN = 2;
  	/**
	 * serializeHvNextIcnSufxVersNbr
	 */
	protected void serializeHvNextIcnSufxVersNbr(short hvNextIcnSufxVersNbr) {
           replaceValue( //  save the value as string
                   getBinaryString( hvNextIcnSufxVersNbr,HV_NEXT_ICN_SUFX_VERS_NBR_LEN)
                  ,beginHvNextIcnSufxVersNbr
                  ,HV_NEXT_ICN_SUFX_VERS_NBR_LEN
                 );
            localHvNextIcnSufxVersNbrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkHvNextIcnSufxVersNbrMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshHvNextIcnSufxVersNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshHvNextIcnSufxVersNbr() {	 
			return (getShort(beginHvNextIcnSufxVersNbr));
   	}
     int localHvNextInvnCtlNbrCounter = -1;
     public boolean isHvNextInvnCtlNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHvNextInvnCtlNbrCounter != sharedCounter;
         localHvNextInvnCtlNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int HV_NEXT_INVN_CTL_NBR_LEN = 10;
	/**
	 * 	serialize this HvNextInvnCtlNbr
	 */
   protected void serializeHvNextInvnCtlNbr(char[] hvNextInvnCtlNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hvNextInvnCtlNbr,0,getStringValue(),beginHvNextInvnCtlNbr,HV_NEXT_INVN_CTL_NBR_LEN);
       localHvNextInvnCtlNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHvNextInvnCtlNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshHvNextInvnCtlNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHvNextInvnCtlNbr() {	 
   		return (substring(getStringValue(),beginHvNextInvnCtlNbr,beginHvNextInvnCtlNbr + HV_NEXT_INVN_CTL_NBR_LEN));
   	}
     int localHvNextIcnSufxCdCounter = -1;
     public boolean isHvNextIcnSufxCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHvNextIcnSufxCdCounter != sharedCounter;
         localHvNextIcnSufxCdCounter = sharedCounter; return hasModified;
     }
	protected static final int HV_NEXT_ICN_SUFX_CD_LEN = 3;
	/**
	 * 	serialize this HvNextIcnSufxCd
	 */
   protected void serializeHvNextIcnSufxCd(char[] hvNextIcnSufxCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hvNextIcnSufxCd,0,getStringValue(),beginHvNextIcnSufxCd,HV_NEXT_ICN_SUFX_CD_LEN);
       localHvNextIcnSufxCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHvNextIcnSufxCdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshHvNextIcnSufxCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHvNextIcnSufxCd() {	 
   		return (substring(getStringValue(),beginHvNextIcnSufxCd,beginHvNextIcnSufxCd + HV_NEXT_ICN_SUFX_CD_LEN));
   	}
         int localHvNextLnIdCounter = -1;
         public boolean isHvNextLnIdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localHvNextLnIdCounter != sharedCounter;
            localHvNextLnIdCounter = sharedCounter; return hasModified; 
         }
   protected static final int HV_NEXT_LN_ID_LEN = 2;
  	/**
	 * serializeHvNextLnId
	 */
	protected void serializeHvNextLnId(short hvNextLnId) {
           replaceValue( //  save the value as string
                   getBinaryString( hvNextLnId,HV_NEXT_LN_ID_LEN)
                  ,beginHvNextLnId
                  ,HV_NEXT_LN_ID_LEN
                 );
            localHvNextLnIdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkHvNextLnIdMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshHvNextLnId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshHvNextLnId() {	 
			return (getShort(beginHvNextLnId));
   	}




}
  
