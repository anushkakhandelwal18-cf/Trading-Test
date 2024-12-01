package com.cloudframe.app.dto.serialize.d529351u;

/**
*  The class DclfeSpiRuleCausSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DclfeSpiRuleCausSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DclfeSpiRuleCausSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DCLFE_SPI_RULE_CAUS_LENGTH = 94;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCausSpiTblId;
            protected  int beginCausStsCd;
            protected  int beginCausDerivPlOfSvcCd;
            protected  int beginCausDerivSvcCd;
            protected  int beginCausDerivCausCd;
            protected  int beginCausCreatDttm;
            protected  int beginCausClmCaus1Cd;
            protected  int beginCausClmCaus2Cd;
            protected  int beginCausClmCaus3Cd;
            protected  int beginCausClmCaus4Cd;
            protected  int beginCausClmCaus5Cd;
            protected  int beginCausClmCaus6Cd;
            protected  int beginCausClmCaus7Cd;
            protected  int beginCausClmCaus8Cd;
            protected  int beginCausPgmId;
            protected  int beginCausLstUpdtDttm;
            protected  int beginCausLstUpdtUserId;
	
	/**
	* Constructor for DclfeSpiRuleCausSerialized
	**/
    public DclfeSpiRuleCausSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DclfeSpiRuleCausSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DCLFE_SPI_RULE_CAUS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCausSpiTblId = getStartOffset() + 0;	// set offset for serialization
  
             beginCausStsCd = getStartOffset() + 7;	// set offset for serialization
  
             beginCausDerivPlOfSvcCd = getStartOffset() + 8;	// set offset for serialization
  
             beginCausDerivSvcCd = getStartOffset() + 10;	// set offset for serialization
  
             beginCausDerivCausCd = getStartOffset() + 16;	// set offset for serialization
  
             beginCausCreatDttm = getStartOffset() + 17;	// set offset for serialization
  
             beginCausClmCaus1Cd = getStartOffset() + 43;	// set offset for serialization
  
             beginCausClmCaus2Cd = getStartOffset() + 44;	// set offset for serialization
  
             beginCausClmCaus3Cd = getStartOffset() + 45;	// set offset for serialization
  
             beginCausClmCaus4Cd = getStartOffset() + 46;	// set offset for serialization
  
             beginCausClmCaus5Cd = getStartOffset() + 47;	// set offset for serialization
  
             beginCausClmCaus6Cd = getStartOffset() + 48;	// set offset for serialization
  
             beginCausClmCaus7Cd = getStartOffset() + 49;	// set offset for serialization
  
             beginCausClmCaus8Cd = getStartOffset() + 50;	// set offset for serialization
  
             beginCausPgmId = getStartOffset() + 51;	// set offset for serialization
  
             beginCausLstUpdtDttm = getStartOffset() + 59;	// set offset for serialization
  
             beginCausLstUpdtUserId = getStartOffset() + 85;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCausSpiTblIdCounter = -1;
     public boolean isCausSpiTblIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCausSpiTblIdCounter != sharedCounter;
         localCausSpiTblIdCounter = sharedCounter; return hasModified;
     }
	protected static final int CAUS_SPI_TBL_ID_LEN = 7;
	/**
	 * 	serialize this CausSpiTblId
	 */
   protected void serializeCausSpiTblId(char[] causSpiTblId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(causSpiTblId,0,getStringValue(),beginCausSpiTblId,CAUS_SPI_TBL_ID_LEN);
       localCausSpiTblIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCausSpiTblIdConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshCausSpiTblId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCausSpiTblId() {	 
   		return (substring(getStringValue(),beginCausSpiTblId,beginCausSpiTblId + CAUS_SPI_TBL_ID_LEN));
   	}
     int localCausStsCdCounter = -1;
     public boolean isCausStsCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCausStsCdCounter != sharedCounter;
         localCausStsCdCounter = sharedCounter; return hasModified;
     }
	protected static final int CAUS_STS_CD_LEN = 1;
	/**
	 * 	serialize this CausStsCd
	 */
   protected void serializeCausStsCd(char[] causStsCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(causStsCd,0,getStringValue(),beginCausStsCd,CAUS_STS_CD_LEN);
       localCausStsCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCausStsCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCausStsCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCausStsCd() {	 
   		return (substring(getStringValue(),beginCausStsCd,beginCausStsCd + CAUS_STS_CD_LEN));
   	}
     int localCausDerivPlOfSvcCdCounter = -1;
     public boolean isCausDerivPlOfSvcCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCausDerivPlOfSvcCdCounter != sharedCounter;
         localCausDerivPlOfSvcCdCounter = sharedCounter; return hasModified;
     }
	protected static final int CAUS_DERIV_PL_OF_SVC_CD_LEN = 2;
	/**
	 * 	serialize this CausDerivPlOfSvcCd
	 */
   protected void serializeCausDerivPlOfSvcCd(char[] causDerivPlOfSvcCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(causDerivPlOfSvcCd,0,getStringValue(),beginCausDerivPlOfSvcCd,CAUS_DERIV_PL_OF_SVC_CD_LEN);
       localCausDerivPlOfSvcCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCausDerivPlOfSvcCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCausDerivPlOfSvcCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCausDerivPlOfSvcCd() {	 
   		return (substring(getStringValue(),beginCausDerivPlOfSvcCd,beginCausDerivPlOfSvcCd + CAUS_DERIV_PL_OF_SVC_CD_LEN));
   	}
     int localCausDerivSvcCdCounter = -1;
     public boolean isCausDerivSvcCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCausDerivSvcCdCounter != sharedCounter;
         localCausDerivSvcCdCounter = sharedCounter; return hasModified;
     }
	protected static final int CAUS_DERIV_SVC_CD_LEN = 6;
	/**
	 * 	serialize this CausDerivSvcCd
	 */
   protected void serializeCausDerivSvcCd(char[] causDerivSvcCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(causDerivSvcCd,0,getStringValue(),beginCausDerivSvcCd,CAUS_DERIV_SVC_CD_LEN);
       localCausDerivSvcCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCausDerivSvcCdConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshCausDerivSvcCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCausDerivSvcCd() {	 
   		return (substring(getStringValue(),beginCausDerivSvcCd,beginCausDerivSvcCd + CAUS_DERIV_SVC_CD_LEN));
   	}
     int localCausDerivCausCdCounter = -1;
     public boolean isCausDerivCausCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCausDerivCausCdCounter != sharedCounter;
         localCausDerivCausCdCounter = sharedCounter; return hasModified;
     }
	protected static final int CAUS_DERIV_CAUS_CD_LEN = 1;
	/**
	 * 	serialize this CausDerivCausCd
	 */
   protected void serializeCausDerivCausCd(char[] causDerivCausCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(causDerivCausCd,0,getStringValue(),beginCausDerivCausCd,CAUS_DERIV_CAUS_CD_LEN);
       localCausDerivCausCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCausDerivCausCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCausDerivCausCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCausDerivCausCd() {	 
   		return (substring(getStringValue(),beginCausDerivCausCd,beginCausDerivCausCd + CAUS_DERIV_CAUS_CD_LEN));
   	}
     int localCausCreatDttmCounter = -1;
     public boolean isCausCreatDttmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCausCreatDttmCounter != sharedCounter;
         localCausCreatDttmCounter = sharedCounter; return hasModified;
     }
	protected static final int CAUS_CREAT_DTTM_LEN = 26;
	/**
	 * 	serialize this CausCreatDttm
	 */
   protected void serializeCausCreatDttm(char[] causCreatDttm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(causCreatDttm,0,getStringValue(),beginCausCreatDttm,CAUS_CREAT_DTTM_LEN);
       localCausCreatDttmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCausCreatDttmConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshCausCreatDttm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCausCreatDttm() {	 
   		return (substring(getStringValue(),beginCausCreatDttm,beginCausCreatDttm + CAUS_CREAT_DTTM_LEN));
   	}
     int localCausClmCaus1CdCounter = -1;
     public boolean isCausClmCaus1CdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCausClmCaus1CdCounter != sharedCounter;
         localCausClmCaus1CdCounter = sharedCounter; return hasModified;
     }
	protected static final int CAUS_CLM_CAUS_1_CD_LEN = 1;
	/**
	 * 	serialize this CausClmCaus1Cd
	 */
   protected void serializeCausClmCaus1Cd(char[] causClmCaus1Cd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(causClmCaus1Cd,0,getStringValue(),beginCausClmCaus1Cd,CAUS_CLM_CAUS_1_CD_LEN);
       localCausClmCaus1CdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCausClmCaus1CdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCausClmCaus1Cd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCausClmCaus1Cd() {	 
   		return (substring(getStringValue(),beginCausClmCaus1Cd,beginCausClmCaus1Cd + CAUS_CLM_CAUS_1_CD_LEN));
   	}
     int localCausClmCaus2CdCounter = -1;
     public boolean isCausClmCaus2CdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCausClmCaus2CdCounter != sharedCounter;
         localCausClmCaus2CdCounter = sharedCounter; return hasModified;
     }
	protected static final int CAUS_CLM_CAUS_2_CD_LEN = 1;
	/**
	 * 	serialize this CausClmCaus2Cd
	 */
   protected void serializeCausClmCaus2Cd(char[] causClmCaus2Cd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(causClmCaus2Cd,0,getStringValue(),beginCausClmCaus2Cd,CAUS_CLM_CAUS_2_CD_LEN);
       localCausClmCaus2CdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCausClmCaus2CdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCausClmCaus2Cd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCausClmCaus2Cd() {	 
   		return (substring(getStringValue(),beginCausClmCaus2Cd,beginCausClmCaus2Cd + CAUS_CLM_CAUS_2_CD_LEN));
   	}
     int localCausClmCaus3CdCounter = -1;
     public boolean isCausClmCaus3CdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCausClmCaus3CdCounter != sharedCounter;
         localCausClmCaus3CdCounter = sharedCounter; return hasModified;
     }
	protected static final int CAUS_CLM_CAUS_3_CD_LEN = 1;
	/**
	 * 	serialize this CausClmCaus3Cd
	 */
   protected void serializeCausClmCaus3Cd(char[] causClmCaus3Cd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(causClmCaus3Cd,0,getStringValue(),beginCausClmCaus3Cd,CAUS_CLM_CAUS_3_CD_LEN);
       localCausClmCaus3CdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCausClmCaus3CdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCausClmCaus3Cd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCausClmCaus3Cd() {	 
   		return (substring(getStringValue(),beginCausClmCaus3Cd,beginCausClmCaus3Cd + CAUS_CLM_CAUS_3_CD_LEN));
   	}
     int localCausClmCaus4CdCounter = -1;
     public boolean isCausClmCaus4CdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCausClmCaus4CdCounter != sharedCounter;
         localCausClmCaus4CdCounter = sharedCounter; return hasModified;
     }
	protected static final int CAUS_CLM_CAUS_4_CD_LEN = 1;
	/**
	 * 	serialize this CausClmCaus4Cd
	 */
   protected void serializeCausClmCaus4Cd(char[] causClmCaus4Cd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(causClmCaus4Cd,0,getStringValue(),beginCausClmCaus4Cd,CAUS_CLM_CAUS_4_CD_LEN);
       localCausClmCaus4CdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCausClmCaus4CdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCausClmCaus4Cd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCausClmCaus4Cd() {	 
   		return (substring(getStringValue(),beginCausClmCaus4Cd,beginCausClmCaus4Cd + CAUS_CLM_CAUS_4_CD_LEN));
   	}
     int localCausClmCaus5CdCounter = -1;
     public boolean isCausClmCaus5CdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCausClmCaus5CdCounter != sharedCounter;
         localCausClmCaus5CdCounter = sharedCounter; return hasModified;
     }
	protected static final int CAUS_CLM_CAUS_5_CD_LEN = 1;
	/**
	 * 	serialize this CausClmCaus5Cd
	 */
   protected void serializeCausClmCaus5Cd(char[] causClmCaus5Cd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(causClmCaus5Cd,0,getStringValue(),beginCausClmCaus5Cd,CAUS_CLM_CAUS_5_CD_LEN);
       localCausClmCaus5CdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCausClmCaus5CdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCausClmCaus5Cd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCausClmCaus5Cd() {	 
   		return (substring(getStringValue(),beginCausClmCaus5Cd,beginCausClmCaus5Cd + CAUS_CLM_CAUS_5_CD_LEN));
   	}
     int localCausClmCaus6CdCounter = -1;
     public boolean isCausClmCaus6CdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCausClmCaus6CdCounter != sharedCounter;
         localCausClmCaus6CdCounter = sharedCounter; return hasModified;
     }
	protected static final int CAUS_CLM_CAUS_6_CD_LEN = 1;
	/**
	 * 	serialize this CausClmCaus6Cd
	 */
   protected void serializeCausClmCaus6Cd(char[] causClmCaus6Cd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(causClmCaus6Cd,0,getStringValue(),beginCausClmCaus6Cd,CAUS_CLM_CAUS_6_CD_LEN);
       localCausClmCaus6CdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCausClmCaus6CdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCausClmCaus6Cd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCausClmCaus6Cd() {	 
   		return (substring(getStringValue(),beginCausClmCaus6Cd,beginCausClmCaus6Cd + CAUS_CLM_CAUS_6_CD_LEN));
   	}
     int localCausClmCaus7CdCounter = -1;
     public boolean isCausClmCaus7CdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCausClmCaus7CdCounter != sharedCounter;
         localCausClmCaus7CdCounter = sharedCounter; return hasModified;
     }
	protected static final int CAUS_CLM_CAUS_7_CD_LEN = 1;
	/**
	 * 	serialize this CausClmCaus7Cd
	 */
   protected void serializeCausClmCaus7Cd(char[] causClmCaus7Cd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(causClmCaus7Cd,0,getStringValue(),beginCausClmCaus7Cd,CAUS_CLM_CAUS_7_CD_LEN);
       localCausClmCaus7CdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCausClmCaus7CdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCausClmCaus7Cd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCausClmCaus7Cd() {	 
   		return (substring(getStringValue(),beginCausClmCaus7Cd,beginCausClmCaus7Cd + CAUS_CLM_CAUS_7_CD_LEN));
   	}
     int localCausClmCaus8CdCounter = -1;
     public boolean isCausClmCaus8CdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCausClmCaus8CdCounter != sharedCounter;
         localCausClmCaus8CdCounter = sharedCounter; return hasModified;
     }
	protected static final int CAUS_CLM_CAUS_8_CD_LEN = 1;
	/**
	 * 	serialize this CausClmCaus8Cd
	 */
   protected void serializeCausClmCaus8Cd(char[] causClmCaus8Cd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(causClmCaus8Cd,0,getStringValue(),beginCausClmCaus8Cd,CAUS_CLM_CAUS_8_CD_LEN);
       localCausClmCaus8CdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCausClmCaus8CdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCausClmCaus8Cd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCausClmCaus8Cd() {	 
   		return (substring(getStringValue(),beginCausClmCaus8Cd,beginCausClmCaus8Cd + CAUS_CLM_CAUS_8_CD_LEN));
   	}
     int localCausPgmIdCounter = -1;
     public boolean isCausPgmIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCausPgmIdCounter != sharedCounter;
         localCausPgmIdCounter = sharedCounter; return hasModified;
     }
	protected static final int CAUS_PGM_ID_LEN = 8;
	/**
	 * 	serialize this CausPgmId
	 */
   protected void serializeCausPgmId(char[] causPgmId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(causPgmId,0,getStringValue(),beginCausPgmId,CAUS_PGM_ID_LEN);
       localCausPgmIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCausPgmIdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshCausPgmId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCausPgmId() {	 
   		return (substring(getStringValue(),beginCausPgmId,beginCausPgmId + CAUS_PGM_ID_LEN));
   	}
     int localCausLstUpdtDttmCounter = -1;
     public boolean isCausLstUpdtDttmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCausLstUpdtDttmCounter != sharedCounter;
         localCausLstUpdtDttmCounter = sharedCounter; return hasModified;
     }
	protected static final int CAUS_LST_UPDT_DTTM_LEN = 26;
	/**
	 * 	serialize this CausLstUpdtDttm
	 */
   protected void serializeCausLstUpdtDttm(char[] causLstUpdtDttm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(causLstUpdtDttm,0,getStringValue(),beginCausLstUpdtDttm,CAUS_LST_UPDT_DTTM_LEN);
       localCausLstUpdtDttmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCausLstUpdtDttmConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshCausLstUpdtDttm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCausLstUpdtDttm() {	 
   		return (substring(getStringValue(),beginCausLstUpdtDttm,beginCausLstUpdtDttm + CAUS_LST_UPDT_DTTM_LEN));
   	}
     int localCausLstUpdtUserIdCounter = -1;
     public boolean isCausLstUpdtUserIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCausLstUpdtUserIdCounter != sharedCounter;
         localCausLstUpdtUserIdCounter = sharedCounter; return hasModified;
     }
	protected static final int CAUS_LST_UPDT_USER_ID_LEN = 9;
	/**
	 * 	serialize this CausLstUpdtUserId
	 */
   protected void serializeCausLstUpdtUserId(char[] causLstUpdtUserId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(causLstUpdtUserId,0,getStringValue(),beginCausLstUpdtUserId,CAUS_LST_UPDT_USER_ID_LEN);
       localCausLstUpdtUserIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCausLstUpdtUserIdConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshCausLstUpdtUserId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCausLstUpdtUserId() {	 
   		return (substring(getStringValue(),beginCausLstUpdtUserId,beginCausLstUpdtUserId + CAUS_LST_UPDT_USER_ID_LEN));
   	}




}
  
