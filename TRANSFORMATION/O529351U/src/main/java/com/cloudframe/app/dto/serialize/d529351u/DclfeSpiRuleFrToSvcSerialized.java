package com.cloudframe.app.dto.serialize.d529351u;

/**
*  The class DclfeSpiRuleFrToSvcSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DclfeSpiRuleFrToSvcSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DclfeSpiRuleFrToSvcSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DCLFE_SPI_RULE_FR_TO_SVC_LENGTH = 103;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFrtoSpiTblId;
            protected  int beginFrtoStsCd;
            protected  int beginFrtoDerivPlOfSvcCd;
            protected  int beginFrtoDerivSvcCd;
            protected  int beginFrtoDerivCausCd;
            protected  int beginFrtoCreatDttm;
            protected  int beginFrtoFromToSvcSeqNbr;
            protected  int beginFrtoClmFrmSvcCd;
            protected  int beginFrtoClmToSvcCd;
            protected  int beginFrtoSvcTypCd;
            protected  int beginFrtoPgmId;
            protected  int beginFrtoLstUpdtDttm;
            protected  int beginFrtoLstUpdtUserId;
            protected  int beginFrtoHipaaCd;
	
	/**
	* Constructor for DclfeSpiRuleFrToSvcSerialized
	**/
    public DclfeSpiRuleFrToSvcSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DclfeSpiRuleFrToSvcSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DCLFE_SPI_RULE_FR_TO_SVC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFrtoSpiTblId = getStartOffset() + 0;	// set offset for serialization
  
             beginFrtoStsCd = getStartOffset() + 7;	// set offset for serialization
  
             beginFrtoDerivPlOfSvcCd = getStartOffset() + 8;	// set offset for serialization
  
             beginFrtoDerivSvcCd = getStartOffset() + 10;	// set offset for serialization
  
             beginFrtoDerivCausCd = getStartOffset() + 16;	// set offset for serialization
  
             beginFrtoCreatDttm = getStartOffset() + 17;	// set offset for serialization
  
             beginFrtoFromToSvcSeqNbr = getStartOffset() + 43;	// set offset for serialization
  
             beginFrtoClmFrmSvcCd = getStartOffset() + 45;	// set offset for serialization
  
             beginFrtoClmToSvcCd = getStartOffset() + 51;	// set offset for serialization
  
             beginFrtoSvcTypCd = getStartOffset() + 57;	// set offset for serialization
  
             beginFrtoPgmId = getStartOffset() + 58;	// set offset for serialization
  
             beginFrtoLstUpdtDttm = getStartOffset() + 66;	// set offset for serialization
  
             beginFrtoLstUpdtUserId = getStartOffset() + 92;	// set offset for serialization
  
             beginFrtoHipaaCd = getStartOffset() + 101;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFrtoSpiTblIdCounter = -1;
     public boolean isFrtoSpiTblIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFrtoSpiTblIdCounter != sharedCounter;
         localFrtoSpiTblIdCounter = sharedCounter; return hasModified;
     }
	protected static final int FRTO_SPI_TBL_ID_LEN = 7;
	/**
	 * 	serialize this FrtoSpiTblId
	 */
   protected void serializeFrtoSpiTblId(char[] frtoSpiTblId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(frtoSpiTblId,0,getStringValue(),beginFrtoSpiTblId,FRTO_SPI_TBL_ID_LEN);
       localFrtoSpiTblIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFrtoSpiTblIdConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshFrtoSpiTblId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFrtoSpiTblId() {	 
   		return (substring(getStringValue(),beginFrtoSpiTblId,beginFrtoSpiTblId + FRTO_SPI_TBL_ID_LEN));
   	}
     int localFrtoStsCdCounter = -1;
     public boolean isFrtoStsCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFrtoStsCdCounter != sharedCounter;
         localFrtoStsCdCounter = sharedCounter; return hasModified;
     }
	protected static final int FRTO_STS_CD_LEN = 1;
	/**
	 * 	serialize this FrtoStsCd
	 */
   protected void serializeFrtoStsCd(char[] frtoStsCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(frtoStsCd,0,getStringValue(),beginFrtoStsCd,FRTO_STS_CD_LEN);
       localFrtoStsCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFrtoStsCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFrtoStsCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFrtoStsCd() {	 
   		return (substring(getStringValue(),beginFrtoStsCd,beginFrtoStsCd + FRTO_STS_CD_LEN));
   	}
     int localFrtoDerivPlOfSvcCdCounter = -1;
     public boolean isFrtoDerivPlOfSvcCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFrtoDerivPlOfSvcCdCounter != sharedCounter;
         localFrtoDerivPlOfSvcCdCounter = sharedCounter; return hasModified;
     }
	protected static final int FRTO_DERIV_PL_OF_SVC_CD_LEN = 2;
	/**
	 * 	serialize this FrtoDerivPlOfSvcCd
	 */
   protected void serializeFrtoDerivPlOfSvcCd(char[] frtoDerivPlOfSvcCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(frtoDerivPlOfSvcCd,0,getStringValue(),beginFrtoDerivPlOfSvcCd,FRTO_DERIV_PL_OF_SVC_CD_LEN);
       localFrtoDerivPlOfSvcCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFrtoDerivPlOfSvcCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshFrtoDerivPlOfSvcCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFrtoDerivPlOfSvcCd() {	 
   		return (substring(getStringValue(),beginFrtoDerivPlOfSvcCd,beginFrtoDerivPlOfSvcCd + FRTO_DERIV_PL_OF_SVC_CD_LEN));
   	}
     int localFrtoDerivSvcCdCounter = -1;
     public boolean isFrtoDerivSvcCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFrtoDerivSvcCdCounter != sharedCounter;
         localFrtoDerivSvcCdCounter = sharedCounter; return hasModified;
     }
	protected static final int FRTO_DERIV_SVC_CD_LEN = 6;
	/**
	 * 	serialize this FrtoDerivSvcCd
	 */
   protected void serializeFrtoDerivSvcCd(char[] frtoDerivSvcCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(frtoDerivSvcCd,0,getStringValue(),beginFrtoDerivSvcCd,FRTO_DERIV_SVC_CD_LEN);
       localFrtoDerivSvcCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFrtoDerivSvcCdConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshFrtoDerivSvcCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFrtoDerivSvcCd() {	 
   		return (substring(getStringValue(),beginFrtoDerivSvcCd,beginFrtoDerivSvcCd + FRTO_DERIV_SVC_CD_LEN));
   	}
     int localFrtoDerivCausCdCounter = -1;
     public boolean isFrtoDerivCausCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFrtoDerivCausCdCounter != sharedCounter;
         localFrtoDerivCausCdCounter = sharedCounter; return hasModified;
     }
	protected static final int FRTO_DERIV_CAUS_CD_LEN = 1;
	/**
	 * 	serialize this FrtoDerivCausCd
	 */
   protected void serializeFrtoDerivCausCd(char[] frtoDerivCausCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(frtoDerivCausCd,0,getStringValue(),beginFrtoDerivCausCd,FRTO_DERIV_CAUS_CD_LEN);
       localFrtoDerivCausCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFrtoDerivCausCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFrtoDerivCausCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFrtoDerivCausCd() {	 
   		return (substring(getStringValue(),beginFrtoDerivCausCd,beginFrtoDerivCausCd + FRTO_DERIV_CAUS_CD_LEN));
   	}
     int localFrtoCreatDttmCounter = -1;
     public boolean isFrtoCreatDttmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFrtoCreatDttmCounter != sharedCounter;
         localFrtoCreatDttmCounter = sharedCounter; return hasModified;
     }
	protected static final int FRTO_CREAT_DTTM_LEN = 26;
	/**
	 * 	serialize this FrtoCreatDttm
	 */
   protected void serializeFrtoCreatDttm(char[] frtoCreatDttm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(frtoCreatDttm,0,getStringValue(),beginFrtoCreatDttm,FRTO_CREAT_DTTM_LEN);
       localFrtoCreatDttmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFrtoCreatDttmConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshFrtoCreatDttm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFrtoCreatDttm() {	 
   		return (substring(getStringValue(),beginFrtoCreatDttm,beginFrtoCreatDttm + FRTO_CREAT_DTTM_LEN));
   	}
         int localFrtoFromToSvcSeqNbrCounter = -1;
         public boolean isFrtoFromToSvcSeqNbrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localFrtoFromToSvcSeqNbrCounter != sharedCounter;
            localFrtoFromToSvcSeqNbrCounter = sharedCounter; return hasModified; 
         }
   protected static final int FRTO_FROM_TO_SVC_SEQ_NBR_LEN = 2;
  	/**
	 * serializeFrtoFromToSvcSeqNbr
	 */
	protected void serializeFrtoFromToSvcSeqNbr(short frtoFromToSvcSeqNbr) {
           replaceValue( //  save the value as string
                   getBinaryString( frtoFromToSvcSeqNbr,FRTO_FROM_TO_SVC_SEQ_NBR_LEN)
                  ,beginFrtoFromToSvcSeqNbr
                  ,FRTO_FROM_TO_SVC_SEQ_NBR_LEN
                 );
            localFrtoFromToSvcSeqNbrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkFrtoFromToSvcSeqNbrMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshFrtoFromToSvcSeqNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshFrtoFromToSvcSeqNbr() {	 
			return (getShort(beginFrtoFromToSvcSeqNbr));
   	}
     int localFrtoClmFrmSvcCdCounter = -1;
     public boolean isFrtoClmFrmSvcCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFrtoClmFrmSvcCdCounter != sharedCounter;
         localFrtoClmFrmSvcCdCounter = sharedCounter; return hasModified;
     }
	protected static final int FRTO_CLM_FRM_SVC_CD_LEN = 6;
	/**
	 * 	serialize this FrtoClmFrmSvcCd
	 */
   protected void serializeFrtoClmFrmSvcCd(char[] frtoClmFrmSvcCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(frtoClmFrmSvcCd,0,getStringValue(),beginFrtoClmFrmSvcCd,FRTO_CLM_FRM_SVC_CD_LEN);
       localFrtoClmFrmSvcCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFrtoClmFrmSvcCdConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshFrtoClmFrmSvcCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFrtoClmFrmSvcCd() {	 
   		return (substring(getStringValue(),beginFrtoClmFrmSvcCd,beginFrtoClmFrmSvcCd + FRTO_CLM_FRM_SVC_CD_LEN));
   	}
     int localFrtoClmToSvcCdCounter = -1;
     public boolean isFrtoClmToSvcCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFrtoClmToSvcCdCounter != sharedCounter;
         localFrtoClmToSvcCdCounter = sharedCounter; return hasModified;
     }
	protected static final int FRTO_CLM_TO_SVC_CD_LEN = 6;
	/**
	 * 	serialize this FrtoClmToSvcCd
	 */
   protected void serializeFrtoClmToSvcCd(char[] frtoClmToSvcCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(frtoClmToSvcCd,0,getStringValue(),beginFrtoClmToSvcCd,FRTO_CLM_TO_SVC_CD_LEN);
       localFrtoClmToSvcCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFrtoClmToSvcCdConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshFrtoClmToSvcCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFrtoClmToSvcCd() {	 
   		return (substring(getStringValue(),beginFrtoClmToSvcCd,beginFrtoClmToSvcCd + FRTO_CLM_TO_SVC_CD_LEN));
   	}
     int localFrtoSvcTypCdCounter = -1;
     public boolean isFrtoSvcTypCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFrtoSvcTypCdCounter != sharedCounter;
         localFrtoSvcTypCdCounter = sharedCounter; return hasModified;
     }
	protected static final int FRTO_SVC_TYP_CD_LEN = 1;
	/**
	 * 	serialize this FrtoSvcTypCd
	 */
   protected void serializeFrtoSvcTypCd(char[] frtoSvcTypCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(frtoSvcTypCd,0,getStringValue(),beginFrtoSvcTypCd,FRTO_SVC_TYP_CD_LEN);
       localFrtoSvcTypCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFrtoSvcTypCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFrtoSvcTypCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFrtoSvcTypCd() {	 
   		return (substring(getStringValue(),beginFrtoSvcTypCd,beginFrtoSvcTypCd + FRTO_SVC_TYP_CD_LEN));
   	}
     int localFrtoPgmIdCounter = -1;
     public boolean isFrtoPgmIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFrtoPgmIdCounter != sharedCounter;
         localFrtoPgmIdCounter = sharedCounter; return hasModified;
     }
	protected static final int FRTO_PGM_ID_LEN = 8;
	/**
	 * 	serialize this FrtoPgmId
	 */
   protected void serializeFrtoPgmId(char[] frtoPgmId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(frtoPgmId,0,getStringValue(),beginFrtoPgmId,FRTO_PGM_ID_LEN);
       localFrtoPgmIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFrtoPgmIdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshFrtoPgmId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFrtoPgmId() {	 
   		return (substring(getStringValue(),beginFrtoPgmId,beginFrtoPgmId + FRTO_PGM_ID_LEN));
   	}
     int localFrtoLstUpdtDttmCounter = -1;
     public boolean isFrtoLstUpdtDttmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFrtoLstUpdtDttmCounter != sharedCounter;
         localFrtoLstUpdtDttmCounter = sharedCounter; return hasModified;
     }
	protected static final int FRTO_LST_UPDT_DTTM_LEN = 26;
	/**
	 * 	serialize this FrtoLstUpdtDttm
	 */
   protected void serializeFrtoLstUpdtDttm(char[] frtoLstUpdtDttm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(frtoLstUpdtDttm,0,getStringValue(),beginFrtoLstUpdtDttm,FRTO_LST_UPDT_DTTM_LEN);
       localFrtoLstUpdtDttmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFrtoLstUpdtDttmConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshFrtoLstUpdtDttm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFrtoLstUpdtDttm() {	 
   		return (substring(getStringValue(),beginFrtoLstUpdtDttm,beginFrtoLstUpdtDttm + FRTO_LST_UPDT_DTTM_LEN));
   	}
     int localFrtoLstUpdtUserIdCounter = -1;
     public boolean isFrtoLstUpdtUserIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFrtoLstUpdtUserIdCounter != sharedCounter;
         localFrtoLstUpdtUserIdCounter = sharedCounter; return hasModified;
     }
	protected static final int FRTO_LST_UPDT_USER_ID_LEN = 9;
	/**
	 * 	serialize this FrtoLstUpdtUserId
	 */
   protected void serializeFrtoLstUpdtUserId(char[] frtoLstUpdtUserId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(frtoLstUpdtUserId,0,getStringValue(),beginFrtoLstUpdtUserId,FRTO_LST_UPDT_USER_ID_LEN);
       localFrtoLstUpdtUserIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFrtoLstUpdtUserIdConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshFrtoLstUpdtUserId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFrtoLstUpdtUserId() {	 
   		return (substring(getStringValue(),beginFrtoLstUpdtUserId,beginFrtoLstUpdtUserId + FRTO_LST_UPDT_USER_ID_LEN));
   	}
     int localFrtoHipaaCdCounter = -1;
     public boolean isFrtoHipaaCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFrtoHipaaCdCounter != sharedCounter;
         localFrtoHipaaCdCounter = sharedCounter; return hasModified;
     }
	protected static final int FRTO_HIPAA_CD_LEN = 2;
	/**
	 * 	serialize this FrtoHipaaCd
	 */
   protected void serializeFrtoHipaaCd(char[] frtoHipaaCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(frtoHipaaCd,0,getStringValue(),beginFrtoHipaaCd,FRTO_HIPAA_CD_LEN);
       localFrtoHipaaCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFrtoHipaaCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshFrtoHipaaCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFrtoHipaaCd() {	 
   		return (substring(getStringValue(),beginFrtoHipaaCd,beginFrtoHipaaCd + FRTO_HIPAA_CD_LEN));
   	}




}
  
