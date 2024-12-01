package com.cloudframe.app.dto.serialize.d529351u;

/**
*  The class DclfeSpiRuleCpeFlgSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DclfeSpiRuleCpeFlgSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DclfeSpiRuleCpeFlgSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DCLFE_SPI_RULE_CPE_FLG_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCpeflSpiTblId;
            protected  int beginCpeflStsCd;
            protected  int beginCpeflDerivPlOfSvcCd;
            protected  int beginCpeflDerivSvcCd;
            protected  int beginCpeflDerivCausCd;
            protected  int beginCpeflCreatDttm;
            protected  int beginCpeflCpeDescCd;
            protected  int beginCpeflPgmId;
            protected  int beginCpeflLstUpdtDttm;
            protected  int beginCpeflLstUpdtUserId;
	
	/**
	* Constructor for DclfeSpiRuleCpeFlgSerialized
	**/
    public DclfeSpiRuleCpeFlgSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DclfeSpiRuleCpeFlgSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DCLFE_SPI_RULE_CPE_FLG_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCpeflSpiTblId = getStartOffset() + 0;	// set offset for serialization
  
             beginCpeflStsCd = getStartOffset() + 7;	// set offset for serialization
  
             beginCpeflDerivPlOfSvcCd = getStartOffset() + 8;	// set offset for serialization
  
             beginCpeflDerivSvcCd = getStartOffset() + 10;	// set offset for serialization
  
             beginCpeflDerivCausCd = getStartOffset() + 16;	// set offset for serialization
  
             beginCpeflCreatDttm = getStartOffset() + 17;	// set offset for serialization
  
             beginCpeflCpeDescCd = getStartOffset() + 43;	// set offset for serialization
  
             beginCpeflPgmId = getStartOffset() + 47;	// set offset for serialization
  
             beginCpeflLstUpdtDttm = getStartOffset() + 55;	// set offset for serialization
  
             beginCpeflLstUpdtUserId = getStartOffset() + 81;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCpeflSpiTblIdCounter = -1;
     public boolean isCpeflSpiTblIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCpeflSpiTblIdCounter != sharedCounter;
         localCpeflSpiTblIdCounter = sharedCounter; return hasModified;
     }
	protected static final int CPEFL_SPI_TBL_ID_LEN = 7;
	/**
	 * 	serialize this CpeflSpiTblId
	 */
   protected void serializeCpeflSpiTblId(char[] cpeflSpiTblId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cpeflSpiTblId,0,getStringValue(),beginCpeflSpiTblId,CPEFL_SPI_TBL_ID_LEN);
       localCpeflSpiTblIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCpeflSpiTblIdConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshCpeflSpiTblId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCpeflSpiTblId() {	 
   		return (substring(getStringValue(),beginCpeflSpiTblId,beginCpeflSpiTblId + CPEFL_SPI_TBL_ID_LEN));
   	}
     int localCpeflStsCdCounter = -1;
     public boolean isCpeflStsCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCpeflStsCdCounter != sharedCounter;
         localCpeflStsCdCounter = sharedCounter; return hasModified;
     }
	protected static final int CPEFL_STS_CD_LEN = 1;
	/**
	 * 	serialize this CpeflStsCd
	 */
   protected void serializeCpeflStsCd(char[] cpeflStsCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cpeflStsCd,0,getStringValue(),beginCpeflStsCd,CPEFL_STS_CD_LEN);
       localCpeflStsCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCpeflStsCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCpeflStsCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCpeflStsCd() {	 
   		return (substring(getStringValue(),beginCpeflStsCd,beginCpeflStsCd + CPEFL_STS_CD_LEN));
   	}
     int localCpeflDerivPlOfSvcCdCounter = -1;
     public boolean isCpeflDerivPlOfSvcCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCpeflDerivPlOfSvcCdCounter != sharedCounter;
         localCpeflDerivPlOfSvcCdCounter = sharedCounter; return hasModified;
     }
	protected static final int CPEFL_DERIV_PL_OF_SVC_CD_LEN = 2;
	/**
	 * 	serialize this CpeflDerivPlOfSvcCd
	 */
   protected void serializeCpeflDerivPlOfSvcCd(char[] cpeflDerivPlOfSvcCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cpeflDerivPlOfSvcCd,0,getStringValue(),beginCpeflDerivPlOfSvcCd,CPEFL_DERIV_PL_OF_SVC_CD_LEN);
       localCpeflDerivPlOfSvcCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCpeflDerivPlOfSvcCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCpeflDerivPlOfSvcCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCpeflDerivPlOfSvcCd() {	 
   		return (substring(getStringValue(),beginCpeflDerivPlOfSvcCd,beginCpeflDerivPlOfSvcCd + CPEFL_DERIV_PL_OF_SVC_CD_LEN));
   	}
     int localCpeflDerivSvcCdCounter = -1;
     public boolean isCpeflDerivSvcCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCpeflDerivSvcCdCounter != sharedCounter;
         localCpeflDerivSvcCdCounter = sharedCounter; return hasModified;
     }
	protected static final int CPEFL_DERIV_SVC_CD_LEN = 6;
	/**
	 * 	serialize this CpeflDerivSvcCd
	 */
   protected void serializeCpeflDerivSvcCd(char[] cpeflDerivSvcCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cpeflDerivSvcCd,0,getStringValue(),beginCpeflDerivSvcCd,CPEFL_DERIV_SVC_CD_LEN);
       localCpeflDerivSvcCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCpeflDerivSvcCdConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshCpeflDerivSvcCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCpeflDerivSvcCd() {	 
   		return (substring(getStringValue(),beginCpeflDerivSvcCd,beginCpeflDerivSvcCd + CPEFL_DERIV_SVC_CD_LEN));
   	}
     int localCpeflDerivCausCdCounter = -1;
     public boolean isCpeflDerivCausCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCpeflDerivCausCdCounter != sharedCounter;
         localCpeflDerivCausCdCounter = sharedCounter; return hasModified;
     }
	protected static final int CPEFL_DERIV_CAUS_CD_LEN = 1;
	/**
	 * 	serialize this CpeflDerivCausCd
	 */
   protected void serializeCpeflDerivCausCd(char[] cpeflDerivCausCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cpeflDerivCausCd,0,getStringValue(),beginCpeflDerivCausCd,CPEFL_DERIV_CAUS_CD_LEN);
       localCpeflDerivCausCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCpeflDerivCausCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCpeflDerivCausCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCpeflDerivCausCd() {	 
   		return (substring(getStringValue(),beginCpeflDerivCausCd,beginCpeflDerivCausCd + CPEFL_DERIV_CAUS_CD_LEN));
   	}
     int localCpeflCreatDttmCounter = -1;
     public boolean isCpeflCreatDttmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCpeflCreatDttmCounter != sharedCounter;
         localCpeflCreatDttmCounter = sharedCounter; return hasModified;
     }
	protected static final int CPEFL_CREAT_DTTM_LEN = 26;
	/**
	 * 	serialize this CpeflCreatDttm
	 */
   protected void serializeCpeflCreatDttm(char[] cpeflCreatDttm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cpeflCreatDttm,0,getStringValue(),beginCpeflCreatDttm,CPEFL_CREAT_DTTM_LEN);
       localCpeflCreatDttmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCpeflCreatDttmConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshCpeflCreatDttm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCpeflCreatDttm() {	 
   		return (substring(getStringValue(),beginCpeflCreatDttm,beginCpeflCreatDttm + CPEFL_CREAT_DTTM_LEN));
   	}
     int localCpeflCpeDescCdCounter = -1;
     public boolean isCpeflCpeDescCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCpeflCpeDescCdCounter != sharedCounter;
         localCpeflCpeDescCdCounter = sharedCounter; return hasModified;
     }
	protected static final int CPEFL_CPE_DESC_CD_LEN = 4;
	/**
	 * 	serialize this CpeflCpeDescCd
	 */
   protected void serializeCpeflCpeDescCd(char[] cpeflCpeDescCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cpeflCpeDescCd,0,getStringValue(),beginCpeflCpeDescCd,CPEFL_CPE_DESC_CD_LEN);
       localCpeflCpeDescCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCpeflCpeDescCdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshCpeflCpeDescCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCpeflCpeDescCd() {	 
   		return (substring(getStringValue(),beginCpeflCpeDescCd,beginCpeflCpeDescCd + CPEFL_CPE_DESC_CD_LEN));
   	}
     int localCpeflPgmIdCounter = -1;
     public boolean isCpeflPgmIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCpeflPgmIdCounter != sharedCounter;
         localCpeflPgmIdCounter = sharedCounter; return hasModified;
     }
	protected static final int CPEFL_PGM_ID_LEN = 8;
	/**
	 * 	serialize this CpeflPgmId
	 */
   protected void serializeCpeflPgmId(char[] cpeflPgmId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cpeflPgmId,0,getStringValue(),beginCpeflPgmId,CPEFL_PGM_ID_LEN);
       localCpeflPgmIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCpeflPgmIdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshCpeflPgmId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCpeflPgmId() {	 
   		return (substring(getStringValue(),beginCpeflPgmId,beginCpeflPgmId + CPEFL_PGM_ID_LEN));
   	}
     int localCpeflLstUpdtDttmCounter = -1;
     public boolean isCpeflLstUpdtDttmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCpeflLstUpdtDttmCounter != sharedCounter;
         localCpeflLstUpdtDttmCounter = sharedCounter; return hasModified;
     }
	protected static final int CPEFL_LST_UPDT_DTTM_LEN = 26;
	/**
	 * 	serialize this CpeflLstUpdtDttm
	 */
   protected void serializeCpeflLstUpdtDttm(char[] cpeflLstUpdtDttm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cpeflLstUpdtDttm,0,getStringValue(),beginCpeflLstUpdtDttm,CPEFL_LST_UPDT_DTTM_LEN);
       localCpeflLstUpdtDttmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCpeflLstUpdtDttmConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshCpeflLstUpdtDttm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCpeflLstUpdtDttm() {	 
   		return (substring(getStringValue(),beginCpeflLstUpdtDttm,beginCpeflLstUpdtDttm + CPEFL_LST_UPDT_DTTM_LEN));
   	}
     int localCpeflLstUpdtUserIdCounter = -1;
     public boolean isCpeflLstUpdtUserIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCpeflLstUpdtUserIdCounter != sharedCounter;
         localCpeflLstUpdtUserIdCounter = sharedCounter; return hasModified;
     }
	protected static final int CPEFL_LST_UPDT_USER_ID_LEN = 9;
	/**
	 * 	serialize this CpeflLstUpdtUserId
	 */
   protected void serializeCpeflLstUpdtUserId(char[] cpeflLstUpdtUserId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cpeflLstUpdtUserId,0,getStringValue(),beginCpeflLstUpdtUserId,CPEFL_LST_UPDT_USER_ID_LEN);
       localCpeflLstUpdtUserIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCpeflLstUpdtUserIdConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshCpeflLstUpdtUserId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCpeflLstUpdtUserId() {	 
   		return (substring(getStringValue(),beginCpeflLstUpdtUserId,beginCpeflLstUpdtUserId + CPEFL_LST_UPDT_USER_ID_LEN));
   	}




}
  
