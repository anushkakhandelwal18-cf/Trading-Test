package com.cloudframe.app.dto.serialize.d529351u;

/**
*  The class DclfeSpiRuleFrCondPosSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DclfeSpiRuleFrCondPosSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DclfeSpiRuleFrCondPosSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DCLFE_SPI_RULE_FR_COND_POS_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFcndSpiTblId;
            protected  int beginFcndStsCd;
            protected  int beginFcndDerivPlOfSvcCd;
            protected  int beginFcndDerivSvcCd;
            protected  int beginFcndDerivCausCd;
            protected  int beginFcndCreatDttm;
            protected  int beginFcndFromCondPosSeqNbr;
            protected  int beginFcndFromCondPos;
            protected  int beginFcndPgmId;
            protected  int beginFcndLstUpdtDttm;
            protected  int beginFcndLstUpdtUserId;
	
	/**
	* Constructor for DclfeSpiRuleFrCondPosSerialized
	**/
    public DclfeSpiRuleFrCondPosSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DclfeSpiRuleFrCondPosSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DCLFE_SPI_RULE_FR_COND_POS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFcndSpiTblId = getStartOffset() + 0;	// set offset for serialization
  
             beginFcndStsCd = getStartOffset() + 7;	// set offset for serialization
  
             beginFcndDerivPlOfSvcCd = getStartOffset() + 8;	// set offset for serialization
  
             beginFcndDerivSvcCd = getStartOffset() + 10;	// set offset for serialization
  
             beginFcndDerivCausCd = getStartOffset() + 16;	// set offset for serialization
  
             beginFcndCreatDttm = getStartOffset() + 17;	// set offset for serialization
  
             beginFcndFromCondPosSeqNbr = getStartOffset() + 43;	// set offset for serialization
  
             beginFcndFromCondPos = getStartOffset() + 45;	// set offset for serialization
  
             beginFcndPgmId = getStartOffset() + 47;	// set offset for serialization
  
             beginFcndLstUpdtDttm = getStartOffset() + 55;	// set offset for serialization
  
             beginFcndLstUpdtUserId = getStartOffset() + 81;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFcndSpiTblIdCounter = -1;
     public boolean isFcndSpiTblIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFcndSpiTblIdCounter != sharedCounter;
         localFcndSpiTblIdCounter = sharedCounter; return hasModified;
     }
	protected static final int FCND_SPI_TBL_ID_LEN = 7;
	/**
	 * 	serialize this FcndSpiTblId
	 */
   protected void serializeFcndSpiTblId(char[] fcndSpiTblId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fcndSpiTblId,0,getStringValue(),beginFcndSpiTblId,FCND_SPI_TBL_ID_LEN);
       localFcndSpiTblIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFcndSpiTblIdConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshFcndSpiTblId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFcndSpiTblId() {	 
   		return (substring(getStringValue(),beginFcndSpiTblId,beginFcndSpiTblId + FCND_SPI_TBL_ID_LEN));
   	}
     int localFcndStsCdCounter = -1;
     public boolean isFcndStsCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFcndStsCdCounter != sharedCounter;
         localFcndStsCdCounter = sharedCounter; return hasModified;
     }
	protected static final int FCND_STS_CD_LEN = 1;
	/**
	 * 	serialize this FcndStsCd
	 */
   protected void serializeFcndStsCd(char[] fcndStsCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fcndStsCd,0,getStringValue(),beginFcndStsCd,FCND_STS_CD_LEN);
       localFcndStsCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFcndStsCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFcndStsCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFcndStsCd() {	 
   		return (substring(getStringValue(),beginFcndStsCd,beginFcndStsCd + FCND_STS_CD_LEN));
   	}
     int localFcndDerivPlOfSvcCdCounter = -1;
     public boolean isFcndDerivPlOfSvcCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFcndDerivPlOfSvcCdCounter != sharedCounter;
         localFcndDerivPlOfSvcCdCounter = sharedCounter; return hasModified;
     }
	protected static final int FCND_DERIV_PL_OF_SVC_CD_LEN = 2;
	/**
	 * 	serialize this FcndDerivPlOfSvcCd
	 */
   protected void serializeFcndDerivPlOfSvcCd(char[] fcndDerivPlOfSvcCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fcndDerivPlOfSvcCd,0,getStringValue(),beginFcndDerivPlOfSvcCd,FCND_DERIV_PL_OF_SVC_CD_LEN);
       localFcndDerivPlOfSvcCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFcndDerivPlOfSvcCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshFcndDerivPlOfSvcCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFcndDerivPlOfSvcCd() {	 
   		return (substring(getStringValue(),beginFcndDerivPlOfSvcCd,beginFcndDerivPlOfSvcCd + FCND_DERIV_PL_OF_SVC_CD_LEN));
   	}
     int localFcndDerivSvcCdCounter = -1;
     public boolean isFcndDerivSvcCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFcndDerivSvcCdCounter != sharedCounter;
         localFcndDerivSvcCdCounter = sharedCounter; return hasModified;
     }
	protected static final int FCND_DERIV_SVC_CD_LEN = 6;
	/**
	 * 	serialize this FcndDerivSvcCd
	 */
   protected void serializeFcndDerivSvcCd(char[] fcndDerivSvcCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fcndDerivSvcCd,0,getStringValue(),beginFcndDerivSvcCd,FCND_DERIV_SVC_CD_LEN);
       localFcndDerivSvcCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFcndDerivSvcCdConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshFcndDerivSvcCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFcndDerivSvcCd() {	 
   		return (substring(getStringValue(),beginFcndDerivSvcCd,beginFcndDerivSvcCd + FCND_DERIV_SVC_CD_LEN));
   	}
     int localFcndDerivCausCdCounter = -1;
     public boolean isFcndDerivCausCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFcndDerivCausCdCounter != sharedCounter;
         localFcndDerivCausCdCounter = sharedCounter; return hasModified;
     }
	protected static final int FCND_DERIV_CAUS_CD_LEN = 1;
	/**
	 * 	serialize this FcndDerivCausCd
	 */
   protected void serializeFcndDerivCausCd(char[] fcndDerivCausCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fcndDerivCausCd,0,getStringValue(),beginFcndDerivCausCd,FCND_DERIV_CAUS_CD_LEN);
       localFcndDerivCausCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFcndDerivCausCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFcndDerivCausCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFcndDerivCausCd() {	 
   		return (substring(getStringValue(),beginFcndDerivCausCd,beginFcndDerivCausCd + FCND_DERIV_CAUS_CD_LEN));
   	}
     int localFcndCreatDttmCounter = -1;
     public boolean isFcndCreatDttmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFcndCreatDttmCounter != sharedCounter;
         localFcndCreatDttmCounter = sharedCounter; return hasModified;
     }
	protected static final int FCND_CREAT_DTTM_LEN = 26;
	/**
	 * 	serialize this FcndCreatDttm
	 */
   protected void serializeFcndCreatDttm(char[] fcndCreatDttm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fcndCreatDttm,0,getStringValue(),beginFcndCreatDttm,FCND_CREAT_DTTM_LEN);
       localFcndCreatDttmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFcndCreatDttmConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshFcndCreatDttm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFcndCreatDttm() {	 
   		return (substring(getStringValue(),beginFcndCreatDttm,beginFcndCreatDttm + FCND_CREAT_DTTM_LEN));
   	}
         int localFcndFromCondPosSeqNbrCounter = -1;
         public boolean isFcndFromCondPosSeqNbrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localFcndFromCondPosSeqNbrCounter != sharedCounter;
            localFcndFromCondPosSeqNbrCounter = sharedCounter; return hasModified; 
         }
   protected static final int FCND_FROM_COND_POS_SEQ_NBR_LEN = 2;
  	/**
	 * serializeFcndFromCondPosSeqNbr
	 */
	protected void serializeFcndFromCondPosSeqNbr(short fcndFromCondPosSeqNbr) {
           replaceValue( //  save the value as string
                   getBinaryString( fcndFromCondPosSeqNbr,FCND_FROM_COND_POS_SEQ_NBR_LEN)
                  ,beginFcndFromCondPosSeqNbr
                  ,FCND_FROM_COND_POS_SEQ_NBR_LEN
                 );
            localFcndFromCondPosSeqNbrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkFcndFromCondPosSeqNbrMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshFcndFromCondPosSeqNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshFcndFromCondPosSeqNbr() {	 
			return (getShort(beginFcndFromCondPosSeqNbr));
   	}
     int localFcndFromCondPosCounter = -1;
     public boolean isFcndFromCondPosModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFcndFromCondPosCounter != sharedCounter;
         localFcndFromCondPosCounter = sharedCounter; return hasModified;
     }
	protected static final int FCND_FROM_COND_POS_LEN = 2;
	/**
	 * 	serialize this FcndFromCondPos
	 */
   protected void serializeFcndFromCondPos(char[] fcndFromCondPos) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fcndFromCondPos,0,getStringValue(),beginFcndFromCondPos,FCND_FROM_COND_POS_LEN);
       localFcndFromCondPosCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFcndFromCondPosConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshFcndFromCondPos is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFcndFromCondPos() {	 
   		return (substring(getStringValue(),beginFcndFromCondPos,beginFcndFromCondPos + FCND_FROM_COND_POS_LEN));
   	}
     int localFcndPgmIdCounter = -1;
     public boolean isFcndPgmIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFcndPgmIdCounter != sharedCounter;
         localFcndPgmIdCounter = sharedCounter; return hasModified;
     }
	protected static final int FCND_PGM_ID_LEN = 8;
	/**
	 * 	serialize this FcndPgmId
	 */
   protected void serializeFcndPgmId(char[] fcndPgmId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fcndPgmId,0,getStringValue(),beginFcndPgmId,FCND_PGM_ID_LEN);
       localFcndPgmIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFcndPgmIdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshFcndPgmId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFcndPgmId() {	 
   		return (substring(getStringValue(),beginFcndPgmId,beginFcndPgmId + FCND_PGM_ID_LEN));
   	}
     int localFcndLstUpdtDttmCounter = -1;
     public boolean isFcndLstUpdtDttmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFcndLstUpdtDttmCounter != sharedCounter;
         localFcndLstUpdtDttmCounter = sharedCounter; return hasModified;
     }
	protected static final int FCND_LST_UPDT_DTTM_LEN = 26;
	/**
	 * 	serialize this FcndLstUpdtDttm
	 */
   protected void serializeFcndLstUpdtDttm(char[] fcndLstUpdtDttm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fcndLstUpdtDttm,0,getStringValue(),beginFcndLstUpdtDttm,FCND_LST_UPDT_DTTM_LEN);
       localFcndLstUpdtDttmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFcndLstUpdtDttmConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshFcndLstUpdtDttm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFcndLstUpdtDttm() {	 
   		return (substring(getStringValue(),beginFcndLstUpdtDttm,beginFcndLstUpdtDttm + FCND_LST_UPDT_DTTM_LEN));
   	}
     int localFcndLstUpdtUserIdCounter = -1;
     public boolean isFcndLstUpdtUserIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFcndLstUpdtUserIdCounter != sharedCounter;
         localFcndLstUpdtUserIdCounter = sharedCounter; return hasModified;
     }
	protected static final int FCND_LST_UPDT_USER_ID_LEN = 9;
	/**
	 * 	serialize this FcndLstUpdtUserId
	 */
   protected void serializeFcndLstUpdtUserId(char[] fcndLstUpdtUserId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fcndLstUpdtUserId,0,getStringValue(),beginFcndLstUpdtUserId,FCND_LST_UPDT_USER_ID_LEN);
       localFcndLstUpdtUserIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFcndLstUpdtUserIdConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshFcndLstUpdtUserId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFcndLstUpdtUserId() {	 
   		return (substring(getStringValue(),beginFcndLstUpdtUserId,beginFcndLstUpdtUserId + FCND_LST_UPDT_USER_ID_LEN));
   	}




}
  
