package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class HostVariablesSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HostVariablesSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HostVariablesSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HOST_VARIABLES_LENGTH = 245;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHvProcDt;
            protected  int beginHvProcTm;
            protected  int beginHvPgmIdLstCharVal;
            protected  int beginHvIcnSufxVersNbr;
            protected  int beginHvIcnSufxCd;
            protected  int beginHvLnId;
            protected  int beginHvProvTinsuff;
            protected  int beginHvProvTinsuff1;
            protected  int beginHvCptFrom;
            protected  int beginHvCptThru;
            protected  int beginHvRevFrom;
            protected  int beginHvRevThru;
            protected  int beginHvRemarkCd1;
            protected  int beginHvRemarkCd2;
            protected  int beginHvProvSpclCd1;
            protected  int beginHvProvSpclCd2;
            protected  int beginHvCauseCd1;
            protected  int beginHvCauseCd2;
            protected  int beginHvAppliedToOopInd;
	
	/**
	* Constructor for HostVariablesSerialized
	**/
    public HostVariablesSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in HostVariablesSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HOST_VARIABLES_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHvProcDt = getStartOffset() + 0;	// set offset for serialization
  
             beginHvProcTm = getStartOffset() + 10;	// set offset for serialization
  
             beginHvPgmIdLstCharVal = getStartOffset() + 18;	// set offset for serialization
  
             beginHvIcnSufxVersNbr = getStartOffset() + 19;	// set offset for serialization
  
  
             beginHvIcnSufxCd = getStartOffset() + 31;	// set offset for serialization
  
             beginHvLnId = getStartOffset() + 34;	// set offset for serialization
  
  
  
             beginHvProvTinsuff = getStartOffset() + 56;	// set offset for serialization
  
  
             beginHvProvTinsuff1 = getStartOffset() + 71;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
             beginHvCptFrom = getStartOffset() + 122;	// set offset for serialization
  
             beginHvCptThru = getStartOffset() + 129;	// set offset for serialization
  
             beginHvRevFrom = getStartOffset() + 136;	// set offset for serialization
  
             beginHvRevThru = getStartOffset() + 141;	// set offset for serialization
  
             beginHvRemarkCd1 = getStartOffset() + 146;	// set offset for serialization
  
             beginHvRemarkCd2 = getStartOffset() + 148;	// set offset for serialization
  
             beginHvProvSpclCd1 = getStartOffset() + 150;	// set offset for serialization
  
             beginHvProvSpclCd2 = getStartOffset() + 153;	// set offset for serialization
  
             beginHvCauseCd1 = getStartOffset() + 156;	// set offset for serialization
  
             beginHvCauseCd2 = getStartOffset() + 157;	// set offset for serialization
  
             beginHvAppliedToOopInd = getStartOffset() + 158;	// set offset for serialization
  
  
  
	   /*  end of offset */
	}
     int localHvProcDtCounter = -1;
     public boolean isHvProcDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHvProcDtCounter != sharedCounter;
         localHvProcDtCounter = sharedCounter; return hasModified;
     }
	protected static final int HV_PROC_DT_LEN = 10;
	/**
	 * 	serialize this HvProcDt
	 */
   protected void serializeHvProcDt(char[] hvProcDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hvProcDt,0,getStringValue(),beginHvProcDt,HV_PROC_DT_LEN);
       localHvProcDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHvProcDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshHvProcDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHvProcDt() {	 
   		return (substring(getStringValue(),beginHvProcDt,beginHvProcDt + HV_PROC_DT_LEN));
   	}
     int localHvProcTmCounter = -1;
     public boolean isHvProcTmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHvProcTmCounter != sharedCounter;
         localHvProcTmCounter = sharedCounter; return hasModified;
     }
	protected static final int HV_PROC_TM_LEN = 8;
	/**
	 * 	serialize this HvProcTm
	 */
   protected void serializeHvProcTm(char[] hvProcTm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hvProcTm,0,getStringValue(),beginHvProcTm,HV_PROC_TM_LEN);
       localHvProcTmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHvProcTmConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshHvProcTm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHvProcTm() {	 
   		return (substring(getStringValue(),beginHvProcTm,beginHvProcTm + HV_PROC_TM_LEN));
   	}
     int localHvPgmIdLstCharValCounter = -1;
     public boolean isHvPgmIdLstCharValModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHvPgmIdLstCharValCounter != sharedCounter;
         localHvPgmIdLstCharValCounter = sharedCounter; return hasModified;
     }
	protected static final int HV_PGM_ID_LST_CHAR_VAL_LEN = 1;
	/**
	 * 	serialize this HvPgmIdLstCharVal
	 */
   protected void serializeHvPgmIdLstCharVal(char[] hvPgmIdLstCharVal) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hvPgmIdLstCharVal,0,getStringValue(),beginHvPgmIdLstCharVal,HV_PGM_ID_LST_CHAR_VAL_LEN);
       localHvPgmIdLstCharValCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHvPgmIdLstCharValConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshHvPgmIdLstCharVal is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHvPgmIdLstCharVal() {	 
   		return (substring(getStringValue(),beginHvPgmIdLstCharVal,beginHvPgmIdLstCharVal + HV_PGM_ID_LST_CHAR_VAL_LEN));
   	}
         int localHvIcnSufxVersNbrCounter = -1;
         public boolean isHvIcnSufxVersNbrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localHvIcnSufxVersNbrCounter != sharedCounter;
            localHvIcnSufxVersNbrCounter = sharedCounter; return hasModified; 
         }
   protected static final int HV_ICN_SUFX_VERS_NBR_LEN = 2;
  	/**
	 * serializeHvIcnSufxVersNbr
	 */
	protected void serializeHvIcnSufxVersNbr(short hvIcnSufxVersNbr) {
           replaceValue( //  save the value as string
                   getBinaryString( hvIcnSufxVersNbr,HV_ICN_SUFX_VERS_NBR_LEN)
                  ,beginHvIcnSufxVersNbr
                  ,HV_ICN_SUFX_VERS_NBR_LEN
                 );
            localHvIcnSufxVersNbrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkHvIcnSufxVersNbrMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshHvIcnSufxVersNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshHvIcnSufxVersNbr() {	 
			return (getShort(beginHvIcnSufxVersNbr));
   	}
     int localHvIcnSufxCdCounter = -1;
     public boolean isHvIcnSufxCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHvIcnSufxCdCounter != sharedCounter;
         localHvIcnSufxCdCounter = sharedCounter; return hasModified;
     }
	protected static final int HV_ICN_SUFX_CD_LEN = 3;
	/**
	 * 	serialize this HvIcnSufxCd
	 */
   protected void serializeHvIcnSufxCd(char[] hvIcnSufxCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hvIcnSufxCd,0,getStringValue(),beginHvIcnSufxCd,HV_ICN_SUFX_CD_LEN);
       localHvIcnSufxCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHvIcnSufxCdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshHvIcnSufxCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHvIcnSufxCd() {	 
   		return (substring(getStringValue(),beginHvIcnSufxCd,beginHvIcnSufxCd + HV_ICN_SUFX_CD_LEN));
   	}
         int localHvLnIdCounter = -1;
         public boolean isHvLnIdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localHvLnIdCounter != sharedCounter;
            localHvLnIdCounter = sharedCounter; return hasModified; 
         }
   protected static final int HV_LN_ID_LEN = 2;
  	/**
	 * serializeHvLnId
	 */
	protected void serializeHvLnId(short hvLnId) {
           replaceValue( //  save the value as string
                   getBinaryString( hvLnId,HV_LN_ID_LEN)
                  ,beginHvLnId
                  ,HV_LN_ID_LEN
                 );
            localHvLnIdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkHvLnIdMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshHvLnId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshHvLnId() {	 
			return (getShort(beginHvLnId));
   	}
     int localHvProvTinsuffCounter = -1;
     public boolean isHvProvTinsuffModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHvProvTinsuffCounter != sharedCounter;
         localHvProvTinsuffCounter = sharedCounter; return hasModified;
     }
	protected static final int HV_PROV_TINSUFF_LEN = 15;
	/**
	 * 	serialize this HvProvTinsuff
	 */
   protected void serializeHvProvTinsuff(char[] hvProvTinsuff) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hvProvTinsuff,0,getStringValue(),beginHvProvTinsuff,HV_PROV_TINSUFF_LEN);
       localHvProvTinsuffCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHvProvTinsuffConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshHvProvTinsuff is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHvProvTinsuff() {	 
   		return (substring(getStringValue(),beginHvProvTinsuff,beginHvProvTinsuff + HV_PROV_TINSUFF_LEN));
   	}
     int localHvProvTinsuff1Counter = -1;
     public boolean isHvProvTinsuff1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHvProvTinsuff1Counter != sharedCounter;
         localHvProvTinsuff1Counter = sharedCounter; return hasModified;
     }
	protected static final int HV_PROV_TINSUFF_1_LEN = 15;
	/**
	 * 	serialize this HvProvTinsuff1
	 */
   protected void serializeHvProvTinsuff1(char[] hvProvTinsuff1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hvProvTinsuff1,0,getStringValue(),beginHvProvTinsuff1,HV_PROV_TINSUFF_1_LEN);
       localHvProvTinsuff1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHvProvTinsuff1Constraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshHvProvTinsuff1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHvProvTinsuff1() {	 
   		return (substring(getStringValue(),beginHvProvTinsuff1,beginHvProvTinsuff1 + HV_PROV_TINSUFF_1_LEN));
   	}
     int localHvCptFromCounter = -1;
     public boolean isHvCptFromModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHvCptFromCounter != sharedCounter;
         localHvCptFromCounter = sharedCounter; return hasModified;
     }
	protected static final int HV_CPT_FROM_LEN = 7;
	/**
	 * 	serialize this HvCptFrom
	 */
   protected void serializeHvCptFrom(char[] hvCptFrom) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hvCptFrom,0,getStringValue(),beginHvCptFrom,HV_CPT_FROM_LEN);
       localHvCptFromCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHvCptFromConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshHvCptFrom is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHvCptFrom() {	 
   		return (substring(getStringValue(),beginHvCptFrom,beginHvCptFrom + HV_CPT_FROM_LEN));
   	}
     int localHvCptThruCounter = -1;
     public boolean isHvCptThruModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHvCptThruCounter != sharedCounter;
         localHvCptThruCounter = sharedCounter; return hasModified;
     }
	protected static final int HV_CPT_THRU_LEN = 7;
	/**
	 * 	serialize this HvCptThru
	 */
   protected void serializeHvCptThru(char[] hvCptThru) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hvCptThru,0,getStringValue(),beginHvCptThru,HV_CPT_THRU_LEN);
       localHvCptThruCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHvCptThruConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshHvCptThru is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHvCptThru() {	 
   		return (substring(getStringValue(),beginHvCptThru,beginHvCptThru + HV_CPT_THRU_LEN));
   	}
     int localHvRevFromCounter = -1;
     public boolean isHvRevFromModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHvRevFromCounter != sharedCounter;
         localHvRevFromCounter = sharedCounter; return hasModified;
     }
	protected static final int HV_REV_FROM_LEN = 5;
	/**
	 * 	serialize this HvRevFrom
	 */
   protected void serializeHvRevFrom(char[] hvRevFrom) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hvRevFrom,0,getStringValue(),beginHvRevFrom,HV_REV_FROM_LEN);
       localHvRevFromCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHvRevFromConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshHvRevFrom is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHvRevFrom() {	 
   		return (substring(getStringValue(),beginHvRevFrom,beginHvRevFrom + HV_REV_FROM_LEN));
   	}
     int localHvRevThruCounter = -1;
     public boolean isHvRevThruModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHvRevThruCounter != sharedCounter;
         localHvRevThruCounter = sharedCounter; return hasModified;
     }
	protected static final int HV_REV_THRU_LEN = 5;
	/**
	 * 	serialize this HvRevThru
	 */
   protected void serializeHvRevThru(char[] hvRevThru) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hvRevThru,0,getStringValue(),beginHvRevThru,HV_REV_THRU_LEN);
       localHvRevThruCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHvRevThruConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshHvRevThru is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHvRevThru() {	 
   		return (substring(getStringValue(),beginHvRevThru,beginHvRevThru + HV_REV_THRU_LEN));
   	}
     int localHvRemarkCd1Counter = -1;
     public boolean isHvRemarkCd1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHvRemarkCd1Counter != sharedCounter;
         localHvRemarkCd1Counter = sharedCounter; return hasModified;
     }
	protected static final int HV_REMARK_CD_1_LEN = 2;
	/**
	 * 	serialize this HvRemarkCd1
	 */
   protected void serializeHvRemarkCd1(char[] hvRemarkCd1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hvRemarkCd1,0,getStringValue(),beginHvRemarkCd1,HV_REMARK_CD_1_LEN);
       localHvRemarkCd1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHvRemarkCd1Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshHvRemarkCd1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHvRemarkCd1() {	 
   		return (substring(getStringValue(),beginHvRemarkCd1,beginHvRemarkCd1 + HV_REMARK_CD_1_LEN));
   	}
     int localHvRemarkCd2Counter = -1;
     public boolean isHvRemarkCd2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHvRemarkCd2Counter != sharedCounter;
         localHvRemarkCd2Counter = sharedCounter; return hasModified;
     }
	protected static final int HV_REMARK_CD_2_LEN = 2;
	/**
	 * 	serialize this HvRemarkCd2
	 */
   protected void serializeHvRemarkCd2(char[] hvRemarkCd2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hvRemarkCd2,0,getStringValue(),beginHvRemarkCd2,HV_REMARK_CD_2_LEN);
       localHvRemarkCd2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHvRemarkCd2Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshHvRemarkCd2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHvRemarkCd2() {	 
   		return (substring(getStringValue(),beginHvRemarkCd2,beginHvRemarkCd2 + HV_REMARK_CD_2_LEN));
   	}
     int localHvProvSpclCd1Counter = -1;
     public boolean isHvProvSpclCd1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHvProvSpclCd1Counter != sharedCounter;
         localHvProvSpclCd1Counter = sharedCounter; return hasModified;
     }
	protected static final int HV_PROV_SPCL_CD_1_LEN = 3;
	/**
	 * 	serialize this HvProvSpclCd1
	 */
   protected void serializeHvProvSpclCd1(char[] hvProvSpclCd1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hvProvSpclCd1,0,getStringValue(),beginHvProvSpclCd1,HV_PROV_SPCL_CD_1_LEN);
       localHvProvSpclCd1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHvProvSpclCd1Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshHvProvSpclCd1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHvProvSpclCd1() {	 
   		return (substring(getStringValue(),beginHvProvSpclCd1,beginHvProvSpclCd1 + HV_PROV_SPCL_CD_1_LEN));
   	}
     int localHvProvSpclCd2Counter = -1;
     public boolean isHvProvSpclCd2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHvProvSpclCd2Counter != sharedCounter;
         localHvProvSpclCd2Counter = sharedCounter; return hasModified;
     }
	protected static final int HV_PROV_SPCL_CD_2_LEN = 3;
	/**
	 * 	serialize this HvProvSpclCd2
	 */
   protected void serializeHvProvSpclCd2(char[] hvProvSpclCd2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hvProvSpclCd2,0,getStringValue(),beginHvProvSpclCd2,HV_PROV_SPCL_CD_2_LEN);
       localHvProvSpclCd2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHvProvSpclCd2Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshHvProvSpclCd2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHvProvSpclCd2() {	 
   		return (substring(getStringValue(),beginHvProvSpclCd2,beginHvProvSpclCd2 + HV_PROV_SPCL_CD_2_LEN));
   	}
     int localHvCauseCd1Counter = -1;
     public boolean isHvCauseCd1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHvCauseCd1Counter != sharedCounter;
         localHvCauseCd1Counter = sharedCounter; return hasModified;
     }
	protected static final int HV_CAUSE_CD_1_LEN = 1;
	/**
	 * 	serialize this HvCauseCd1
	 */
   protected void serializeHvCauseCd1(char[] hvCauseCd1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hvCauseCd1,0,getStringValue(),beginHvCauseCd1,HV_CAUSE_CD_1_LEN);
       localHvCauseCd1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHvCauseCd1Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshHvCauseCd1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHvCauseCd1() {	 
   		return (substring(getStringValue(),beginHvCauseCd1,beginHvCauseCd1 + HV_CAUSE_CD_1_LEN));
   	}
     int localHvCauseCd2Counter = -1;
     public boolean isHvCauseCd2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHvCauseCd2Counter != sharedCounter;
         localHvCauseCd2Counter = sharedCounter; return hasModified;
     }
	protected static final int HV_CAUSE_CD_2_LEN = 1;
	/**
	 * 	serialize this HvCauseCd2
	 */
   protected void serializeHvCauseCd2(char[] hvCauseCd2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hvCauseCd2,0,getStringValue(),beginHvCauseCd2,HV_CAUSE_CD_2_LEN);
       localHvCauseCd2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHvCauseCd2Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshHvCauseCd2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHvCauseCd2() {	 
   		return (substring(getStringValue(),beginHvCauseCd2,beginHvCauseCd2 + HV_CAUSE_CD_2_LEN));
   	}
     int localHvAppliedToOopIndCounter = -1;
     public boolean isHvAppliedToOopIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHvAppliedToOopIndCounter != sharedCounter;
         localHvAppliedToOopIndCounter = sharedCounter; return hasModified;
     }
	protected static final int HV_APPLIED_TO_OOP_IND_LEN = 1;
	/**
	 * 	serialize this HvAppliedToOopInd
	 */
   protected void serializeHvAppliedToOopInd(char[] hvAppliedToOopInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hvAppliedToOopInd,0,getStringValue(),beginHvAppliedToOopInd,HV_APPLIED_TO_OOP_IND_LEN);
       localHvAppliedToOopIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHvAppliedToOopIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshHvAppliedToOopInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHvAppliedToOopInd() {	 
   		return (substring(getStringValue(),beginHvAppliedToOopInd,beginHvAppliedToOopInd + HV_APPLIED_TO_OOP_IND_LEN));
   	}




}
  
