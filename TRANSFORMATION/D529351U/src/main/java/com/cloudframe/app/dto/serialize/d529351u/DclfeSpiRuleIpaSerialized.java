package com.cloudframe.app.dto.serialize.d529351u;

/**
*  The class DclfeSpiRuleIpaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:50. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DclfeSpiRuleIpaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DclfeSpiRuleIpaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DCLFE_SPI_RULE_IPA_LENGTH = 107;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRipaSpiTblId;
            protected  int beginRipaStsCd;
            protected  int beginRipaDerivPlOfSvcCd;
            protected  int beginRipaDerivSvcCd;
            protected  int beginRipaDerivCausCd;
            protected  int beginRipaCreatDttm;
            protected  int beginRipaClmIpa1Cd;
            protected  int beginRipaClmIpa2Cd;
            protected  int beginRipaClmIpa3Cd;
            protected  int beginRipaPgmId;
            protected  int beginRipaLstUpdtDttm;
            protected  int beginRipaLstUpdtUserId;
            protected  int beginRipaGrpTbl1Nbr;
            protected  int beginRipaGrpTbl2Nbr;
            protected  int beginRipaGrpTbl3Nbr;
	
	/**
	* Constructor for DclfeSpiRuleIpaSerialized
	**/
    public DclfeSpiRuleIpaSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DclfeSpiRuleIpaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DCLFE_SPI_RULE_IPA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRipaSpiTblId = getStartOffset() + 0;	// set offset for serialization
  
             beginRipaStsCd = getStartOffset() + 7;	// set offset for serialization
  
             beginRipaDerivPlOfSvcCd = getStartOffset() + 8;	// set offset for serialization
  
             beginRipaDerivSvcCd = getStartOffset() + 10;	// set offset for serialization
  
             beginRipaDerivCausCd = getStartOffset() + 16;	// set offset for serialization
  
             beginRipaCreatDttm = getStartOffset() + 17;	// set offset for serialization
  
             beginRipaClmIpa1Cd = getStartOffset() + 43;	// set offset for serialization
  
             beginRipaClmIpa2Cd = getStartOffset() + 46;	// set offset for serialization
  
             beginRipaClmIpa3Cd = getStartOffset() + 49;	// set offset for serialization
  
             beginRipaPgmId = getStartOffset() + 52;	// set offset for serialization
  
             beginRipaLstUpdtDttm = getStartOffset() + 60;	// set offset for serialization
  
             beginRipaLstUpdtUserId = getStartOffset() + 86;	// set offset for serialization
  
             beginRipaGrpTbl1Nbr = getStartOffset() + 95;	// set offset for serialization
  
             beginRipaGrpTbl2Nbr = getStartOffset() + 99;	// set offset for serialization
  
             beginRipaGrpTbl3Nbr = getStartOffset() + 103;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRipaSpiTblIdCounter = -1;
     public boolean isRipaSpiTblIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRipaSpiTblIdCounter != sharedCounter;
         localRipaSpiTblIdCounter = sharedCounter; return hasModified;
     }
	protected static final int RIPA_SPI_TBL_ID_LEN = 7;
	/**
	 * 	serialize this RipaSpiTblId
	 */
   protected void serializeRipaSpiTblId(char[] ripaSpiTblId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ripaSpiTblId,0,getStringValue(),beginRipaSpiTblId,RIPA_SPI_TBL_ID_LEN);
       localRipaSpiTblIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRipaSpiTblIdConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshRipaSpiTblId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRipaSpiTblId() {	 
   		return (substring(getStringValue(),beginRipaSpiTblId,beginRipaSpiTblId + RIPA_SPI_TBL_ID_LEN));
   	}
     int localRipaStsCdCounter = -1;
     public boolean isRipaStsCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRipaStsCdCounter != sharedCounter;
         localRipaStsCdCounter = sharedCounter; return hasModified;
     }
	protected static final int RIPA_STS_CD_LEN = 1;
	/**
	 * 	serialize this RipaStsCd
	 */
   protected void serializeRipaStsCd(char[] ripaStsCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ripaStsCd,0,getStringValue(),beginRipaStsCd,RIPA_STS_CD_LEN);
       localRipaStsCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRipaStsCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRipaStsCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRipaStsCd() {	 
   		return (substring(getStringValue(),beginRipaStsCd,beginRipaStsCd + RIPA_STS_CD_LEN));
   	}
     int localRipaDerivPlOfSvcCdCounter = -1;
     public boolean isRipaDerivPlOfSvcCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRipaDerivPlOfSvcCdCounter != sharedCounter;
         localRipaDerivPlOfSvcCdCounter = sharedCounter; return hasModified;
     }
	protected static final int RIPA_DERIV_PL_OF_SVC_CD_LEN = 2;
	/**
	 * 	serialize this RipaDerivPlOfSvcCd
	 */
   protected void serializeRipaDerivPlOfSvcCd(char[] ripaDerivPlOfSvcCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ripaDerivPlOfSvcCd,0,getStringValue(),beginRipaDerivPlOfSvcCd,RIPA_DERIV_PL_OF_SVC_CD_LEN);
       localRipaDerivPlOfSvcCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRipaDerivPlOfSvcCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshRipaDerivPlOfSvcCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRipaDerivPlOfSvcCd() {	 
   		return (substring(getStringValue(),beginRipaDerivPlOfSvcCd,beginRipaDerivPlOfSvcCd + RIPA_DERIV_PL_OF_SVC_CD_LEN));
   	}
     int localRipaDerivSvcCdCounter = -1;
     public boolean isRipaDerivSvcCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRipaDerivSvcCdCounter != sharedCounter;
         localRipaDerivSvcCdCounter = sharedCounter; return hasModified;
     }
	protected static final int RIPA_DERIV_SVC_CD_LEN = 6;
	/**
	 * 	serialize this RipaDerivSvcCd
	 */
   protected void serializeRipaDerivSvcCd(char[] ripaDerivSvcCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ripaDerivSvcCd,0,getStringValue(),beginRipaDerivSvcCd,RIPA_DERIV_SVC_CD_LEN);
       localRipaDerivSvcCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRipaDerivSvcCdConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshRipaDerivSvcCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRipaDerivSvcCd() {	 
   		return (substring(getStringValue(),beginRipaDerivSvcCd,beginRipaDerivSvcCd + RIPA_DERIV_SVC_CD_LEN));
   	}
     int localRipaDerivCausCdCounter = -1;
     public boolean isRipaDerivCausCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRipaDerivCausCdCounter != sharedCounter;
         localRipaDerivCausCdCounter = sharedCounter; return hasModified;
     }
	protected static final int RIPA_DERIV_CAUS_CD_LEN = 1;
	/**
	 * 	serialize this RipaDerivCausCd
	 */
   protected void serializeRipaDerivCausCd(char[] ripaDerivCausCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ripaDerivCausCd,0,getStringValue(),beginRipaDerivCausCd,RIPA_DERIV_CAUS_CD_LEN);
       localRipaDerivCausCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRipaDerivCausCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRipaDerivCausCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRipaDerivCausCd() {	 
   		return (substring(getStringValue(),beginRipaDerivCausCd,beginRipaDerivCausCd + RIPA_DERIV_CAUS_CD_LEN));
   	}
     int localRipaCreatDttmCounter = -1;
     public boolean isRipaCreatDttmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRipaCreatDttmCounter != sharedCounter;
         localRipaCreatDttmCounter = sharedCounter; return hasModified;
     }
	protected static final int RIPA_CREAT_DTTM_LEN = 26;
	/**
	 * 	serialize this RipaCreatDttm
	 */
   protected void serializeRipaCreatDttm(char[] ripaCreatDttm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ripaCreatDttm,0,getStringValue(),beginRipaCreatDttm,RIPA_CREAT_DTTM_LEN);
       localRipaCreatDttmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRipaCreatDttmConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshRipaCreatDttm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRipaCreatDttm() {	 
   		return (substring(getStringValue(),beginRipaCreatDttm,beginRipaCreatDttm + RIPA_CREAT_DTTM_LEN));
   	}
     int localRipaClmIpa1CdCounter = -1;
     public boolean isRipaClmIpa1CdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRipaClmIpa1CdCounter != sharedCounter;
         localRipaClmIpa1CdCounter = sharedCounter; return hasModified;
     }
	protected static final int RIPA_CLM_IPA_1_CD_LEN = 3;
	/**
	 * 	serialize this RipaClmIpa1Cd
	 */
   protected void serializeRipaClmIpa1Cd(char[] ripaClmIpa1Cd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ripaClmIpa1Cd,0,getStringValue(),beginRipaClmIpa1Cd,RIPA_CLM_IPA_1_CD_LEN);
       localRipaClmIpa1CdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRipaClmIpa1CdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshRipaClmIpa1Cd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRipaClmIpa1Cd() {	 
   		return (substring(getStringValue(),beginRipaClmIpa1Cd,beginRipaClmIpa1Cd + RIPA_CLM_IPA_1_CD_LEN));
   	}
     int localRipaClmIpa2CdCounter = -1;
     public boolean isRipaClmIpa2CdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRipaClmIpa2CdCounter != sharedCounter;
         localRipaClmIpa2CdCounter = sharedCounter; return hasModified;
     }
	protected static final int RIPA_CLM_IPA_2_CD_LEN = 3;
	/**
	 * 	serialize this RipaClmIpa2Cd
	 */
   protected void serializeRipaClmIpa2Cd(char[] ripaClmIpa2Cd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ripaClmIpa2Cd,0,getStringValue(),beginRipaClmIpa2Cd,RIPA_CLM_IPA_2_CD_LEN);
       localRipaClmIpa2CdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRipaClmIpa2CdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshRipaClmIpa2Cd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRipaClmIpa2Cd() {	 
   		return (substring(getStringValue(),beginRipaClmIpa2Cd,beginRipaClmIpa2Cd + RIPA_CLM_IPA_2_CD_LEN));
   	}
     int localRipaClmIpa3CdCounter = -1;
     public boolean isRipaClmIpa3CdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRipaClmIpa3CdCounter != sharedCounter;
         localRipaClmIpa3CdCounter = sharedCounter; return hasModified;
     }
	protected static final int RIPA_CLM_IPA_3_CD_LEN = 3;
	/**
	 * 	serialize this RipaClmIpa3Cd
	 */
   protected void serializeRipaClmIpa3Cd(char[] ripaClmIpa3Cd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ripaClmIpa3Cd,0,getStringValue(),beginRipaClmIpa3Cd,RIPA_CLM_IPA_3_CD_LEN);
       localRipaClmIpa3CdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRipaClmIpa3CdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshRipaClmIpa3Cd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRipaClmIpa3Cd() {	 
   		return (substring(getStringValue(),beginRipaClmIpa3Cd,beginRipaClmIpa3Cd + RIPA_CLM_IPA_3_CD_LEN));
   	}
     int localRipaPgmIdCounter = -1;
     public boolean isRipaPgmIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRipaPgmIdCounter != sharedCounter;
         localRipaPgmIdCounter = sharedCounter; return hasModified;
     }
	protected static final int RIPA_PGM_ID_LEN = 8;
	/**
	 * 	serialize this RipaPgmId
	 */
   protected void serializeRipaPgmId(char[] ripaPgmId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ripaPgmId,0,getStringValue(),beginRipaPgmId,RIPA_PGM_ID_LEN);
       localRipaPgmIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRipaPgmIdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshRipaPgmId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRipaPgmId() {	 
   		return (substring(getStringValue(),beginRipaPgmId,beginRipaPgmId + RIPA_PGM_ID_LEN));
   	}
     int localRipaLstUpdtDttmCounter = -1;
     public boolean isRipaLstUpdtDttmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRipaLstUpdtDttmCounter != sharedCounter;
         localRipaLstUpdtDttmCounter = sharedCounter; return hasModified;
     }
	protected static final int RIPA_LST_UPDT_DTTM_LEN = 26;
	/**
	 * 	serialize this RipaLstUpdtDttm
	 */
   protected void serializeRipaLstUpdtDttm(char[] ripaLstUpdtDttm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ripaLstUpdtDttm,0,getStringValue(),beginRipaLstUpdtDttm,RIPA_LST_UPDT_DTTM_LEN);
       localRipaLstUpdtDttmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRipaLstUpdtDttmConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshRipaLstUpdtDttm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRipaLstUpdtDttm() {	 
   		return (substring(getStringValue(),beginRipaLstUpdtDttm,beginRipaLstUpdtDttm + RIPA_LST_UPDT_DTTM_LEN));
   	}
     int localRipaLstUpdtUserIdCounter = -1;
     public boolean isRipaLstUpdtUserIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRipaLstUpdtUserIdCounter != sharedCounter;
         localRipaLstUpdtUserIdCounter = sharedCounter; return hasModified;
     }
	protected static final int RIPA_LST_UPDT_USER_ID_LEN = 9;
	/**
	 * 	serialize this RipaLstUpdtUserId
	 */
   protected void serializeRipaLstUpdtUserId(char[] ripaLstUpdtUserId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ripaLstUpdtUserId,0,getStringValue(),beginRipaLstUpdtUserId,RIPA_LST_UPDT_USER_ID_LEN);
       localRipaLstUpdtUserIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRipaLstUpdtUserIdConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshRipaLstUpdtUserId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRipaLstUpdtUserId() {	 
   		return (substring(getStringValue(),beginRipaLstUpdtUserId,beginRipaLstUpdtUserId + RIPA_LST_UPDT_USER_ID_LEN));
   	}
     int localRipaGrpTbl1NbrCounter = -1;
     public boolean isRipaGrpTbl1NbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRipaGrpTbl1NbrCounter != sharedCounter;
         localRipaGrpTbl1NbrCounter = sharedCounter; return hasModified;
     }
	protected static final int RIPA_GRP_TBL_1_NBR_LEN = 4;
	/**
	 * 	serialize this RipaGrpTbl1Nbr
	 */
   protected void serializeRipaGrpTbl1Nbr(char[] ripaGrpTbl1Nbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ripaGrpTbl1Nbr,0,getStringValue(),beginRipaGrpTbl1Nbr,RIPA_GRP_TBL_1_NBR_LEN);
       localRipaGrpTbl1NbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRipaGrpTbl1NbrConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRipaGrpTbl1Nbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRipaGrpTbl1Nbr() {	 
   		return (substring(getStringValue(),beginRipaGrpTbl1Nbr,beginRipaGrpTbl1Nbr + RIPA_GRP_TBL_1_NBR_LEN));
   	}
     int localRipaGrpTbl2NbrCounter = -1;
     public boolean isRipaGrpTbl2NbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRipaGrpTbl2NbrCounter != sharedCounter;
         localRipaGrpTbl2NbrCounter = sharedCounter; return hasModified;
     }
	protected static final int RIPA_GRP_TBL_2_NBR_LEN = 4;
	/**
	 * 	serialize this RipaGrpTbl2Nbr
	 */
   protected void serializeRipaGrpTbl2Nbr(char[] ripaGrpTbl2Nbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ripaGrpTbl2Nbr,0,getStringValue(),beginRipaGrpTbl2Nbr,RIPA_GRP_TBL_2_NBR_LEN);
       localRipaGrpTbl2NbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRipaGrpTbl2NbrConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRipaGrpTbl2Nbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRipaGrpTbl2Nbr() {	 
   		return (substring(getStringValue(),beginRipaGrpTbl2Nbr,beginRipaGrpTbl2Nbr + RIPA_GRP_TBL_2_NBR_LEN));
   	}
     int localRipaGrpTbl3NbrCounter = -1;
     public boolean isRipaGrpTbl3NbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRipaGrpTbl3NbrCounter != sharedCounter;
         localRipaGrpTbl3NbrCounter = sharedCounter; return hasModified;
     }
	protected static final int RIPA_GRP_TBL_3_NBR_LEN = 4;
	/**
	 * 	serialize this RipaGrpTbl3Nbr
	 */
   protected void serializeRipaGrpTbl3Nbr(char[] ripaGrpTbl3Nbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ripaGrpTbl3Nbr,0,getStringValue(),beginRipaGrpTbl3Nbr,RIPA_GRP_TBL_3_NBR_LEN);
       localRipaGrpTbl3NbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRipaGrpTbl3NbrConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRipaGrpTbl3Nbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRipaGrpTbl3Nbr() {	 
   		return (substring(getStringValue(),beginRipaGrpTbl3Nbr,beginRipaGrpTbl3Nbr + RIPA_GRP_TBL_3_NBR_LEN));
   	}




}
  
