package com.cloudframe.app.dto.serialize.d529351u;

/**
*  The class DclfeSpiRuleIcdSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:50. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DclfeSpiRuleIcdSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DclfeSpiRuleIcdSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DCLFE_SPI_RULE_ICD_LENGTH = 103;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRicdSpiTblId;
            protected  int beginRicdStsCd;
            protected  int beginRicdClmIcdSeqNbr;
            protected  int beginRicdDerivPlOfSvcCd;
            protected  int beginRicdDerivSvcCd;
            protected  int beginRicdDerivCausCd;
            protected  int beginRicdCreatDttm;
            protected  int beginRicdClmIcdInd;
            protected  int beginRicdClmIcdFromCd;
            protected  int beginRicdClmIcdToCd;
            protected  int beginRicdPgmId;
            protected  int beginRicdLstUpdtDttm;
            protected  int beginRicdLstUpdtUserId;
	
	/**
	* Constructor for DclfeSpiRuleIcdSerialized
	**/
    public DclfeSpiRuleIcdSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DclfeSpiRuleIcdSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DCLFE_SPI_RULE_ICD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRicdSpiTblId = getStartOffset() + 0;	// set offset for serialization
  
             beginRicdStsCd = getStartOffset() + 7;	// set offset for serialization
  
             beginRicdClmIcdSeqNbr = getStartOffset() + 8;	// set offset for serialization
  
             beginRicdDerivPlOfSvcCd = getStartOffset() + 10;	// set offset for serialization
  
             beginRicdDerivSvcCd = getStartOffset() + 12;	// set offset for serialization
  
             beginRicdDerivCausCd = getStartOffset() + 18;	// set offset for serialization
  
             beginRicdCreatDttm = getStartOffset() + 19;	// set offset for serialization
  
             beginRicdClmIcdInd = getStartOffset() + 45;	// set offset for serialization
  
             beginRicdClmIcdFromCd = getStartOffset() + 46;	// set offset for serialization
  
             beginRicdClmIcdToCd = getStartOffset() + 53;	// set offset for serialization
  
             beginRicdPgmId = getStartOffset() + 60;	// set offset for serialization
  
             beginRicdLstUpdtDttm = getStartOffset() + 68;	// set offset for serialization
  
             beginRicdLstUpdtUserId = getStartOffset() + 94;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRicdSpiTblIdCounter = -1;
     public boolean isRicdSpiTblIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRicdSpiTblIdCounter != sharedCounter;
         localRicdSpiTblIdCounter = sharedCounter; return hasModified;
     }
	protected static final int RICD_SPI_TBL_ID_LEN = 7;
	/**
	 * 	serialize this RicdSpiTblId
	 */
   protected void serializeRicdSpiTblId(char[] ricdSpiTblId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ricdSpiTblId,0,getStringValue(),beginRicdSpiTblId,RICD_SPI_TBL_ID_LEN);
       localRicdSpiTblIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRicdSpiTblIdConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshRicdSpiTblId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRicdSpiTblId() {	 
   		return (substring(getStringValue(),beginRicdSpiTblId,beginRicdSpiTblId + RICD_SPI_TBL_ID_LEN));
   	}
     int localRicdStsCdCounter = -1;
     public boolean isRicdStsCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRicdStsCdCounter != sharedCounter;
         localRicdStsCdCounter = sharedCounter; return hasModified;
     }
	protected static final int RICD_STS_CD_LEN = 1;
	/**
	 * 	serialize this RicdStsCd
	 */
   protected void serializeRicdStsCd(char[] ricdStsCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ricdStsCd,0,getStringValue(),beginRicdStsCd,RICD_STS_CD_LEN);
       localRicdStsCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRicdStsCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRicdStsCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRicdStsCd() {	 
   		return (substring(getStringValue(),beginRicdStsCd,beginRicdStsCd + RICD_STS_CD_LEN));
   	}
         int localRicdClmIcdSeqNbrCounter = -1;
         public boolean isRicdClmIcdSeqNbrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRicdClmIcdSeqNbrCounter != sharedCounter;
            localRicdClmIcdSeqNbrCounter = sharedCounter; return hasModified; 
         }
   protected static final int RICD_CLM_ICD_SEQ_NBR_LEN = 2;
  	/**
	 * serializeRicdClmIcdSeqNbr
	 */
	protected void serializeRicdClmIcdSeqNbr(short ricdClmIcdSeqNbr) {
           replaceValue( //  save the value as string
                   getBinaryString( ricdClmIcdSeqNbr,RICD_CLM_ICD_SEQ_NBR_LEN)
                  ,beginRicdClmIcdSeqNbr
                  ,RICD_CLM_ICD_SEQ_NBR_LEN
                 );
            localRicdClmIcdSeqNbrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkRicdClmIcdSeqNbrMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshRicdClmIcdSeqNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshRicdClmIcdSeqNbr() {	 
			return (getShort(beginRicdClmIcdSeqNbr));
   	}
     int localRicdDerivPlOfSvcCdCounter = -1;
     public boolean isRicdDerivPlOfSvcCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRicdDerivPlOfSvcCdCounter != sharedCounter;
         localRicdDerivPlOfSvcCdCounter = sharedCounter; return hasModified;
     }
	protected static final int RICD_DERIV_PL_OF_SVC_CD_LEN = 2;
	/**
	 * 	serialize this RicdDerivPlOfSvcCd
	 */
   protected void serializeRicdDerivPlOfSvcCd(char[] ricdDerivPlOfSvcCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ricdDerivPlOfSvcCd,0,getStringValue(),beginRicdDerivPlOfSvcCd,RICD_DERIV_PL_OF_SVC_CD_LEN);
       localRicdDerivPlOfSvcCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRicdDerivPlOfSvcCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshRicdDerivPlOfSvcCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRicdDerivPlOfSvcCd() {	 
   		return (substring(getStringValue(),beginRicdDerivPlOfSvcCd,beginRicdDerivPlOfSvcCd + RICD_DERIV_PL_OF_SVC_CD_LEN));
   	}
     int localRicdDerivSvcCdCounter = -1;
     public boolean isRicdDerivSvcCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRicdDerivSvcCdCounter != sharedCounter;
         localRicdDerivSvcCdCounter = sharedCounter; return hasModified;
     }
	protected static final int RICD_DERIV_SVC_CD_LEN = 6;
	/**
	 * 	serialize this RicdDerivSvcCd
	 */
   protected void serializeRicdDerivSvcCd(char[] ricdDerivSvcCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ricdDerivSvcCd,0,getStringValue(),beginRicdDerivSvcCd,RICD_DERIV_SVC_CD_LEN);
       localRicdDerivSvcCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRicdDerivSvcCdConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshRicdDerivSvcCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRicdDerivSvcCd() {	 
   		return (substring(getStringValue(),beginRicdDerivSvcCd,beginRicdDerivSvcCd + RICD_DERIV_SVC_CD_LEN));
   	}
     int localRicdDerivCausCdCounter = -1;
     public boolean isRicdDerivCausCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRicdDerivCausCdCounter != sharedCounter;
         localRicdDerivCausCdCounter = sharedCounter; return hasModified;
     }
	protected static final int RICD_DERIV_CAUS_CD_LEN = 1;
	/**
	 * 	serialize this RicdDerivCausCd
	 */
   protected void serializeRicdDerivCausCd(char[] ricdDerivCausCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ricdDerivCausCd,0,getStringValue(),beginRicdDerivCausCd,RICD_DERIV_CAUS_CD_LEN);
       localRicdDerivCausCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRicdDerivCausCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRicdDerivCausCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRicdDerivCausCd() {	 
   		return (substring(getStringValue(),beginRicdDerivCausCd,beginRicdDerivCausCd + RICD_DERIV_CAUS_CD_LEN));
   	}
     int localRicdCreatDttmCounter = -1;
     public boolean isRicdCreatDttmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRicdCreatDttmCounter != sharedCounter;
         localRicdCreatDttmCounter = sharedCounter; return hasModified;
     }
	protected static final int RICD_CREAT_DTTM_LEN = 26;
	/**
	 * 	serialize this RicdCreatDttm
	 */
   protected void serializeRicdCreatDttm(char[] ricdCreatDttm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ricdCreatDttm,0,getStringValue(),beginRicdCreatDttm,RICD_CREAT_DTTM_LEN);
       localRicdCreatDttmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRicdCreatDttmConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshRicdCreatDttm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRicdCreatDttm() {	 
   		return (substring(getStringValue(),beginRicdCreatDttm,beginRicdCreatDttm + RICD_CREAT_DTTM_LEN));
   	}
     int localRicdClmIcdIndCounter = -1;
     public boolean isRicdClmIcdIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRicdClmIcdIndCounter != sharedCounter;
         localRicdClmIcdIndCounter = sharedCounter; return hasModified;
     }
	protected static final int RICD_CLM_ICD_IND_LEN = 1;
	/**
	 * 	serialize this RicdClmIcdInd
	 */
   protected void serializeRicdClmIcdInd(char[] ricdClmIcdInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ricdClmIcdInd,0,getStringValue(),beginRicdClmIcdInd,RICD_CLM_ICD_IND_LEN);
       localRicdClmIcdIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRicdClmIcdIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRicdClmIcdInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRicdClmIcdInd() {	 
   		return (substring(getStringValue(),beginRicdClmIcdInd,beginRicdClmIcdInd + RICD_CLM_ICD_IND_LEN));
   	}
     int localRicdClmIcdFromCdCounter = -1;
     public boolean isRicdClmIcdFromCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRicdClmIcdFromCdCounter != sharedCounter;
         localRicdClmIcdFromCdCounter = sharedCounter; return hasModified;
     }
	protected static final int RICD_CLM_ICD_FROM_CD_LEN = 7;
	/**
	 * 	serialize this RicdClmIcdFromCd
	 */
   protected void serializeRicdClmIcdFromCd(char[] ricdClmIcdFromCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ricdClmIcdFromCd,0,getStringValue(),beginRicdClmIcdFromCd,RICD_CLM_ICD_FROM_CD_LEN);
       localRicdClmIcdFromCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRicdClmIcdFromCdConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshRicdClmIcdFromCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRicdClmIcdFromCd() {	 
   		return (substring(getStringValue(),beginRicdClmIcdFromCd,beginRicdClmIcdFromCd + RICD_CLM_ICD_FROM_CD_LEN));
   	}
     int localRicdClmIcdToCdCounter = -1;
     public boolean isRicdClmIcdToCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRicdClmIcdToCdCounter != sharedCounter;
         localRicdClmIcdToCdCounter = sharedCounter; return hasModified;
     }
	protected static final int RICD_CLM_ICD_TO_CD_LEN = 7;
	/**
	 * 	serialize this RicdClmIcdToCd
	 */
   protected void serializeRicdClmIcdToCd(char[] ricdClmIcdToCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ricdClmIcdToCd,0,getStringValue(),beginRicdClmIcdToCd,RICD_CLM_ICD_TO_CD_LEN);
       localRicdClmIcdToCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRicdClmIcdToCdConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshRicdClmIcdToCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRicdClmIcdToCd() {	 
   		return (substring(getStringValue(),beginRicdClmIcdToCd,beginRicdClmIcdToCd + RICD_CLM_ICD_TO_CD_LEN));
   	}
     int localRicdPgmIdCounter = -1;
     public boolean isRicdPgmIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRicdPgmIdCounter != sharedCounter;
         localRicdPgmIdCounter = sharedCounter; return hasModified;
     }
	protected static final int RICD_PGM_ID_LEN = 8;
	/**
	 * 	serialize this RicdPgmId
	 */
   protected void serializeRicdPgmId(char[] ricdPgmId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ricdPgmId,0,getStringValue(),beginRicdPgmId,RICD_PGM_ID_LEN);
       localRicdPgmIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRicdPgmIdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshRicdPgmId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRicdPgmId() {	 
   		return (substring(getStringValue(),beginRicdPgmId,beginRicdPgmId + RICD_PGM_ID_LEN));
   	}
     int localRicdLstUpdtDttmCounter = -1;
     public boolean isRicdLstUpdtDttmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRicdLstUpdtDttmCounter != sharedCounter;
         localRicdLstUpdtDttmCounter = sharedCounter; return hasModified;
     }
	protected static final int RICD_LST_UPDT_DTTM_LEN = 26;
	/**
	 * 	serialize this RicdLstUpdtDttm
	 */
   protected void serializeRicdLstUpdtDttm(char[] ricdLstUpdtDttm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ricdLstUpdtDttm,0,getStringValue(),beginRicdLstUpdtDttm,RICD_LST_UPDT_DTTM_LEN);
       localRicdLstUpdtDttmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRicdLstUpdtDttmConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshRicdLstUpdtDttm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRicdLstUpdtDttm() {	 
   		return (substring(getStringValue(),beginRicdLstUpdtDttm,beginRicdLstUpdtDttm + RICD_LST_UPDT_DTTM_LEN));
   	}
     int localRicdLstUpdtUserIdCounter = -1;
     public boolean isRicdLstUpdtUserIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRicdLstUpdtUserIdCounter != sharedCounter;
         localRicdLstUpdtUserIdCounter = sharedCounter; return hasModified;
     }
	protected static final int RICD_LST_UPDT_USER_ID_LEN = 9;
	/**
	 * 	serialize this RicdLstUpdtUserId
	 */
   protected void serializeRicdLstUpdtUserId(char[] ricdLstUpdtUserId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ricdLstUpdtUserId,0,getStringValue(),beginRicdLstUpdtUserId,RICD_LST_UPDT_USER_ID_LEN);
       localRicdLstUpdtUserIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRicdLstUpdtUserIdConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshRicdLstUpdtUserId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRicdLstUpdtUserId() {	 
   		return (substring(getStringValue(),beginRicdLstUpdtUserId,beginRicdLstUpdtUserId + RICD_LST_UPDT_USER_ID_LEN));
   	}




}
  
