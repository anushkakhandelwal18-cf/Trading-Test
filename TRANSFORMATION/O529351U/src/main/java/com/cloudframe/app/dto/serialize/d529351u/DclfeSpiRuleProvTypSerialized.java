package com.cloudframe.app.dto.serialize.d529351u;

/**
*  The class DclfeSpiRuleProvTypSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DclfeSpiRuleProvTypSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DclfeSpiRuleProvTypSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DCLFE_SPI_RULE_PROV_TYP_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPtypSpiTblId;
            protected  int beginPtypStsCd;
            protected  int beginPtypProvTypSeqNbr;
            protected  int beginPtypDerivPlOfSvcCd;
            protected  int beginPtypDerivSvcCd;
            protected  int beginPtypDerivCausCd;
            protected  int beginPtypCreatDttm;
            protected  int beginPtypProvTyp;
            protected  int beginPtypPgmId;
            protected  int beginPtypLstUpdtDttm;
            protected  int beginPtypLstUpdtUserId;
	
	/**
	* Constructor for DclfeSpiRuleProvTypSerialized
	**/
    public DclfeSpiRuleProvTypSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DclfeSpiRuleProvTypSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DCLFE_SPI_RULE_PROV_TYP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPtypSpiTblId = getStartOffset() + 0;	// set offset for serialization
  
             beginPtypStsCd = getStartOffset() + 7;	// set offset for serialization
  
             beginPtypProvTypSeqNbr = getStartOffset() + 8;	// set offset for serialization
  
             beginPtypDerivPlOfSvcCd = getStartOffset() + 10;	// set offset for serialization
  
             beginPtypDerivSvcCd = getStartOffset() + 12;	// set offset for serialization
  
             beginPtypDerivCausCd = getStartOffset() + 18;	// set offset for serialization
  
             beginPtypCreatDttm = getStartOffset() + 19;	// set offset for serialization
  
             beginPtypProvTyp = getStartOffset() + 45;	// set offset for serialization
  
             beginPtypPgmId = getStartOffset() + 47;	// set offset for serialization
  
             beginPtypLstUpdtDttm = getStartOffset() + 55;	// set offset for serialization
  
             beginPtypLstUpdtUserId = getStartOffset() + 81;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localPtypSpiTblIdCounter = -1;
     public boolean isPtypSpiTblIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtypSpiTblIdCounter != sharedCounter;
         localPtypSpiTblIdCounter = sharedCounter; return hasModified;
     }
	protected static final int PTYP_SPI_TBL_ID_LEN = 7;
	/**
	 * 	serialize this PtypSpiTblId
	 */
   protected void serializePtypSpiTblId(char[] ptypSpiTblId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ptypSpiTblId,0,getStringValue(),beginPtypSpiTblId,PTYP_SPI_TBL_ID_LEN);
       localPtypSpiTblIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPtypSpiTblIdConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshPtypSpiTblId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPtypSpiTblId() {	 
   		return (substring(getStringValue(),beginPtypSpiTblId,beginPtypSpiTblId + PTYP_SPI_TBL_ID_LEN));
   	}
     int localPtypStsCdCounter = -1;
     public boolean isPtypStsCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtypStsCdCounter != sharedCounter;
         localPtypStsCdCounter = sharedCounter; return hasModified;
     }
	protected static final int PTYP_STS_CD_LEN = 1;
	/**
	 * 	serialize this PtypStsCd
	 */
   protected void serializePtypStsCd(char[] ptypStsCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ptypStsCd,0,getStringValue(),beginPtypStsCd,PTYP_STS_CD_LEN);
       localPtypStsCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPtypStsCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshPtypStsCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPtypStsCd() {	 
   		return (substring(getStringValue(),beginPtypStsCd,beginPtypStsCd + PTYP_STS_CD_LEN));
   	}
         int localPtypProvTypSeqNbrCounter = -1;
         public boolean isPtypProvTypSeqNbrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localPtypProvTypSeqNbrCounter != sharedCounter;
            localPtypProvTypSeqNbrCounter = sharedCounter; return hasModified; 
         }
   protected static final int PTYP_PROV_TYP_SEQ_NBR_LEN = 2;
  	/**
	 * serializePtypProvTypSeqNbr
	 */
	protected void serializePtypProvTypSeqNbr(short ptypProvTypSeqNbr) {
           replaceValue( //  save the value as string
                   getBinaryString( ptypProvTypSeqNbr,PTYP_PROV_TYP_SEQ_NBR_LEN)
                  ,beginPtypProvTypSeqNbr
                  ,PTYP_PROV_TYP_SEQ_NBR_LEN
                 );
            localPtypProvTypSeqNbrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkPtypProvTypSeqNbrMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshPtypProvTypSeqNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshPtypProvTypSeqNbr() {	 
			return (getShort(beginPtypProvTypSeqNbr));
   	}
     int localPtypDerivPlOfSvcCdCounter = -1;
     public boolean isPtypDerivPlOfSvcCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtypDerivPlOfSvcCdCounter != sharedCounter;
         localPtypDerivPlOfSvcCdCounter = sharedCounter; return hasModified;
     }
	protected static final int PTYP_DERIV_PL_OF_SVC_CD_LEN = 2;
	/**
	 * 	serialize this PtypDerivPlOfSvcCd
	 */
   protected void serializePtypDerivPlOfSvcCd(char[] ptypDerivPlOfSvcCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ptypDerivPlOfSvcCd,0,getStringValue(),beginPtypDerivPlOfSvcCd,PTYP_DERIV_PL_OF_SVC_CD_LEN);
       localPtypDerivPlOfSvcCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPtypDerivPlOfSvcCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshPtypDerivPlOfSvcCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPtypDerivPlOfSvcCd() {	 
   		return (substring(getStringValue(),beginPtypDerivPlOfSvcCd,beginPtypDerivPlOfSvcCd + PTYP_DERIV_PL_OF_SVC_CD_LEN));
   	}
     int localPtypDerivSvcCdCounter = -1;
     public boolean isPtypDerivSvcCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtypDerivSvcCdCounter != sharedCounter;
         localPtypDerivSvcCdCounter = sharedCounter; return hasModified;
     }
	protected static final int PTYP_DERIV_SVC_CD_LEN = 6;
	/**
	 * 	serialize this PtypDerivSvcCd
	 */
   protected void serializePtypDerivSvcCd(char[] ptypDerivSvcCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ptypDerivSvcCd,0,getStringValue(),beginPtypDerivSvcCd,PTYP_DERIV_SVC_CD_LEN);
       localPtypDerivSvcCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPtypDerivSvcCdConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshPtypDerivSvcCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPtypDerivSvcCd() {	 
   		return (substring(getStringValue(),beginPtypDerivSvcCd,beginPtypDerivSvcCd + PTYP_DERIV_SVC_CD_LEN));
   	}
     int localPtypDerivCausCdCounter = -1;
     public boolean isPtypDerivCausCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtypDerivCausCdCounter != sharedCounter;
         localPtypDerivCausCdCounter = sharedCounter; return hasModified;
     }
	protected static final int PTYP_DERIV_CAUS_CD_LEN = 1;
	/**
	 * 	serialize this PtypDerivCausCd
	 */
   protected void serializePtypDerivCausCd(char[] ptypDerivCausCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ptypDerivCausCd,0,getStringValue(),beginPtypDerivCausCd,PTYP_DERIV_CAUS_CD_LEN);
       localPtypDerivCausCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPtypDerivCausCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshPtypDerivCausCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPtypDerivCausCd() {	 
   		return (substring(getStringValue(),beginPtypDerivCausCd,beginPtypDerivCausCd + PTYP_DERIV_CAUS_CD_LEN));
   	}
     int localPtypCreatDttmCounter = -1;
     public boolean isPtypCreatDttmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtypCreatDttmCounter != sharedCounter;
         localPtypCreatDttmCounter = sharedCounter; return hasModified;
     }
	protected static final int PTYP_CREAT_DTTM_LEN = 26;
	/**
	 * 	serialize this PtypCreatDttm
	 */
   protected void serializePtypCreatDttm(char[] ptypCreatDttm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ptypCreatDttm,0,getStringValue(),beginPtypCreatDttm,PTYP_CREAT_DTTM_LEN);
       localPtypCreatDttmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPtypCreatDttmConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshPtypCreatDttm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPtypCreatDttm() {	 
   		return (substring(getStringValue(),beginPtypCreatDttm,beginPtypCreatDttm + PTYP_CREAT_DTTM_LEN));
   	}
     int localPtypProvTypCounter = -1;
     public boolean isPtypProvTypModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtypProvTypCounter != sharedCounter;
         localPtypProvTypCounter = sharedCounter; return hasModified;
     }
	protected static final int PTYP_PROV_TYP_LEN = 2;
	/**
	 * 	serialize this PtypProvTyp
	 */
   protected void serializePtypProvTyp(char[] ptypProvTyp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ptypProvTyp,0,getStringValue(),beginPtypProvTyp,PTYP_PROV_TYP_LEN);
       localPtypProvTypCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPtypProvTypConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshPtypProvTyp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPtypProvTyp() {	 
   		return (substring(getStringValue(),beginPtypProvTyp,beginPtypProvTyp + PTYP_PROV_TYP_LEN));
   	}
     int localPtypPgmIdCounter = -1;
     public boolean isPtypPgmIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtypPgmIdCounter != sharedCounter;
         localPtypPgmIdCounter = sharedCounter; return hasModified;
     }
	protected static final int PTYP_PGM_ID_LEN = 8;
	/**
	 * 	serialize this PtypPgmId
	 */
   protected void serializePtypPgmId(char[] ptypPgmId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ptypPgmId,0,getStringValue(),beginPtypPgmId,PTYP_PGM_ID_LEN);
       localPtypPgmIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPtypPgmIdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshPtypPgmId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPtypPgmId() {	 
   		return (substring(getStringValue(),beginPtypPgmId,beginPtypPgmId + PTYP_PGM_ID_LEN));
   	}
     int localPtypLstUpdtDttmCounter = -1;
     public boolean isPtypLstUpdtDttmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtypLstUpdtDttmCounter != sharedCounter;
         localPtypLstUpdtDttmCounter = sharedCounter; return hasModified;
     }
	protected static final int PTYP_LST_UPDT_DTTM_LEN = 26;
	/**
	 * 	serialize this PtypLstUpdtDttm
	 */
   protected void serializePtypLstUpdtDttm(char[] ptypLstUpdtDttm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ptypLstUpdtDttm,0,getStringValue(),beginPtypLstUpdtDttm,PTYP_LST_UPDT_DTTM_LEN);
       localPtypLstUpdtDttmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPtypLstUpdtDttmConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshPtypLstUpdtDttm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPtypLstUpdtDttm() {	 
   		return (substring(getStringValue(),beginPtypLstUpdtDttm,beginPtypLstUpdtDttm + PTYP_LST_UPDT_DTTM_LEN));
   	}
     int localPtypLstUpdtUserIdCounter = -1;
     public boolean isPtypLstUpdtUserIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtypLstUpdtUserIdCounter != sharedCounter;
         localPtypLstUpdtUserIdCounter = sharedCounter; return hasModified;
     }
	protected static final int PTYP_LST_UPDT_USER_ID_LEN = 9;
	/**
	 * 	serialize this PtypLstUpdtUserId
	 */
   protected void serializePtypLstUpdtUserId(char[] ptypLstUpdtUserId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ptypLstUpdtUserId,0,getStringValue(),beginPtypLstUpdtUserId,PTYP_LST_UPDT_USER_ID_LEN);
       localPtypLstUpdtUserIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPtypLstUpdtUserIdConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshPtypLstUpdtUserId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPtypLstUpdtUserId() {	 
   		return (substring(getStringValue(),beginPtypLstUpdtUserId,beginPtypLstUpdtUserId + PTYP_LST_UPDT_USER_ID_LEN));
   	}




}
  
