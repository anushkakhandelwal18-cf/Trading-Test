package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class HoldAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HoldAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HoldAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HOLD_AREA_LENGTH = 33;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHldInvnCtlNbr;
            protected  int beginHldIcnSufxCd;
            protected  int beginHldProcDt;
            protected  int beginHldProcTm;
            protected  int beginHldLstCharVal;
            protected  int beginHldIcnSufxVersNbr;
	
	/**
	* Constructor for HoldAreaSerialized
	**/
    public HoldAreaSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in HoldAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HOLD_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHldInvnCtlNbr = getStartOffset() + 0;	// set offset for serialization
  
             beginHldIcnSufxCd = getStartOffset() + 10;	// set offset for serialization
  
             beginHldProcDt = getStartOffset() + 12;	// set offset for serialization
  
             beginHldProcTm = getStartOffset() + 22;	// set offset for serialization
  
             beginHldLstCharVal = getStartOffset() + 30;	// set offset for serialization
  
             beginHldIcnSufxVersNbr = getStartOffset() + 31;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localHldInvnCtlNbrCounter = -1;
     public boolean isHldInvnCtlNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHldInvnCtlNbrCounter != sharedCounter;
         localHldInvnCtlNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int HLD_INVN_CTL_NBR_LEN = 10;
	/**
	 * 	serialize this HldInvnCtlNbr
	 */
   protected void serializeHldInvnCtlNbr(char[] hldInvnCtlNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hldInvnCtlNbr,0,getStringValue(),beginHldInvnCtlNbr,HLD_INVN_CTL_NBR_LEN);
       localHldInvnCtlNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHldInvnCtlNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshHldInvnCtlNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHldInvnCtlNbr() {	 
   		return (substring(getStringValue(),beginHldInvnCtlNbr,beginHldInvnCtlNbr + HLD_INVN_CTL_NBR_LEN));
   	}
     int localHldIcnSufxCdCounter = -1;
     public boolean isHldIcnSufxCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHldIcnSufxCdCounter != sharedCounter;
         localHldIcnSufxCdCounter = sharedCounter; return hasModified;
     }
	protected static final int HLD_ICN_SUFX_CD_LEN = 2;
	/**
	 * 	serialize this HldIcnSufxCd
	 */
   protected void serializeHldIcnSufxCd(char[] hldIcnSufxCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hldIcnSufxCd,0,getStringValue(),beginHldIcnSufxCd,HLD_ICN_SUFX_CD_LEN);
       localHldIcnSufxCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHldIcnSufxCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshHldIcnSufxCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHldIcnSufxCd() {	 
   		return (substring(getStringValue(),beginHldIcnSufxCd,beginHldIcnSufxCd + HLD_ICN_SUFX_CD_LEN));
   	}
     int localHldProcDtCounter = -1;
     public boolean isHldProcDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHldProcDtCounter != sharedCounter;
         localHldProcDtCounter = sharedCounter; return hasModified;
     }
	protected static final int HLD_PROC_DT_LEN = 10;
	/**
	 * 	serialize this HldProcDt
	 */
   protected void serializeHldProcDt(char[] hldProcDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hldProcDt,0,getStringValue(),beginHldProcDt,HLD_PROC_DT_LEN);
       localHldProcDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHldProcDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshHldProcDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHldProcDt() {	 
   		return (substring(getStringValue(),beginHldProcDt,beginHldProcDt + HLD_PROC_DT_LEN));
   	}
     int localHldProcTmCounter = -1;
     public boolean isHldProcTmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHldProcTmCounter != sharedCounter;
         localHldProcTmCounter = sharedCounter; return hasModified;
     }
	protected static final int HLD_PROC_TM_LEN = 8;
	/**
	 * 	serialize this HldProcTm
	 */
   protected void serializeHldProcTm(char[] hldProcTm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hldProcTm,0,getStringValue(),beginHldProcTm,HLD_PROC_TM_LEN);
       localHldProcTmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHldProcTmConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshHldProcTm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHldProcTm() {	 
   		return (substring(getStringValue(),beginHldProcTm,beginHldProcTm + HLD_PROC_TM_LEN));
   	}
     int localHldLstCharValCounter = -1;
     public boolean isHldLstCharValModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHldLstCharValCounter != sharedCounter;
         localHldLstCharValCounter = sharedCounter; return hasModified;
     }
	protected static final int HLD_LST_CHAR_VAL_LEN = 1;
	/**
	 * 	serialize this HldLstCharVal
	 */
   protected void serializeHldLstCharVal(char[] hldLstCharVal) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hldLstCharVal,0,getStringValue(),beginHldLstCharVal,HLD_LST_CHAR_VAL_LEN);
       localHldLstCharValCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHldLstCharValConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshHldLstCharVal is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHldLstCharVal() {	 
   		return (substring(getStringValue(),beginHldLstCharVal,beginHldLstCharVal + HLD_LST_CHAR_VAL_LEN));
   	}
         int localHldIcnSufxVersNbrCounter = -1;
         public boolean isHldIcnSufxVersNbrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localHldIcnSufxVersNbrCounter != sharedCounter;
            localHldIcnSufxVersNbrCounter = sharedCounter; return hasModified; 
         }
   protected static final int HLD_ICN_SUFX_VERS_NBR_LEN = 2;
  	/**
	 * serializeHldIcnSufxVersNbr
	 */
	protected void serializeHldIcnSufxVersNbr(short hldIcnSufxVersNbr) {
           replaceValue( //  save the value as string
                   getBinaryString( hldIcnSufxVersNbr,HLD_ICN_SUFX_VERS_NBR_LEN)
                  ,beginHldIcnSufxVersNbr
                  ,HLD_ICN_SUFX_VERS_NBR_LEN
                 );
            localHldIcnSufxVersNbrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkHldIcnSufxVersNbrMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshHldIcnSufxVersNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshHldIcnSufxVersNbr() {	 
			return (getShort(beginHldIcnSufxVersNbr));
   	}




}
  
