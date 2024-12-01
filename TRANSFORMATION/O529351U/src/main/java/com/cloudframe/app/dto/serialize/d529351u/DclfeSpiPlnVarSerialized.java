package com.cloudframe.app.dto.serialize.d529351u;

/**
*  The class DclfeSpiPlnVarSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DclfeSpiPlnVarSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DclfeSpiPlnVarSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DCLFE_SPI_PLN_VAR_LENGTH = 107;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPlnvSpiTblId;
            protected  int beginPlnvStsCd;
            protected  int beginPlnvPolNbr;
            protected  int beginPlnvPlnNbr;
            protected  int beginPlnvEffDt;
            protected  int beginPlnvCreatDttm;
            protected  int beginPlnvCancDt;
            protected  int beginPlnvPgmId;
            protected  int beginPlnvLstUpdtDttm;
            protected  int beginPlnvLstUpdtUserId;
	
	/**
	* Constructor for DclfeSpiPlnVarSerialized
	**/
    public DclfeSpiPlnVarSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DclfeSpiPlnVarSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DCLFE_SPI_PLN_VAR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPlnvSpiTblId = getStartOffset() + 0;	// set offset for serialization
  
             beginPlnvStsCd = getStartOffset() + 7;	// set offset for serialization
  
             beginPlnvPolNbr = getStartOffset() + 8;	// set offset for serialization
  
             beginPlnvPlnNbr = getStartOffset() + 14;	// set offset for serialization
  
             beginPlnvEffDt = getStartOffset() + 18;	// set offset for serialization
  
             beginPlnvCreatDttm = getStartOffset() + 28;	// set offset for serialization
  
             beginPlnvCancDt = getStartOffset() + 54;	// set offset for serialization
  
             beginPlnvPgmId = getStartOffset() + 64;	// set offset for serialization
  
             beginPlnvLstUpdtDttm = getStartOffset() + 72;	// set offset for serialization
  
             beginPlnvLstUpdtUserId = getStartOffset() + 98;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localPlnvSpiTblIdCounter = -1;
     public boolean isPlnvSpiTblIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPlnvSpiTblIdCounter != sharedCounter;
         localPlnvSpiTblIdCounter = sharedCounter; return hasModified;
     }
	protected static final int PLNV_SPI_TBL_ID_LEN = 7;
	/**
	 * 	serialize this PlnvSpiTblId
	 */
   protected void serializePlnvSpiTblId(char[] plnvSpiTblId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(plnvSpiTblId,0,getStringValue(),beginPlnvSpiTblId,PLNV_SPI_TBL_ID_LEN);
       localPlnvSpiTblIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPlnvSpiTblIdConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshPlnvSpiTblId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPlnvSpiTblId() {	 
   		return (substring(getStringValue(),beginPlnvSpiTblId,beginPlnvSpiTblId + PLNV_SPI_TBL_ID_LEN));
   	}
     int localPlnvStsCdCounter = -1;
     public boolean isPlnvStsCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPlnvStsCdCounter != sharedCounter;
         localPlnvStsCdCounter = sharedCounter; return hasModified;
     }
	protected static final int PLNV_STS_CD_LEN = 1;
	/**
	 * 	serialize this PlnvStsCd
	 */
   protected void serializePlnvStsCd(char[] plnvStsCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(plnvStsCd,0,getStringValue(),beginPlnvStsCd,PLNV_STS_CD_LEN);
       localPlnvStsCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPlnvStsCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshPlnvStsCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPlnvStsCd() {	 
   		return (substring(getStringValue(),beginPlnvStsCd,beginPlnvStsCd + PLNV_STS_CD_LEN));
   	}
     int localPlnvPolNbrCounter = -1;
     public boolean isPlnvPolNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPlnvPolNbrCounter != sharedCounter;
         localPlnvPolNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int PLNV_POL_NBR_LEN = 6;
	/**
	 * 	serialize this PlnvPolNbr
	 */
   protected void serializePlnvPolNbr(char[] plnvPolNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(plnvPolNbr,0,getStringValue(),beginPlnvPolNbr,PLNV_POL_NBR_LEN);
       localPlnvPolNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPlnvPolNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshPlnvPolNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPlnvPolNbr() {	 
   		return (substring(getStringValue(),beginPlnvPolNbr,beginPlnvPolNbr + PLNV_POL_NBR_LEN));
   	}
     int localPlnvPlnNbrCounter = -1;
     public boolean isPlnvPlnNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPlnvPlnNbrCounter != sharedCounter;
         localPlnvPlnNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int PLNV_PLN_NBR_LEN = 4;
	/**
	 * 	serialize this PlnvPlnNbr
	 */
   protected void serializePlnvPlnNbr(char[] plnvPlnNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(plnvPlnNbr,0,getStringValue(),beginPlnvPlnNbr,PLNV_PLN_NBR_LEN);
       localPlnvPlnNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPlnvPlnNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshPlnvPlnNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPlnvPlnNbr() {	 
   		return (substring(getStringValue(),beginPlnvPlnNbr,beginPlnvPlnNbr + PLNV_PLN_NBR_LEN));
   	}
     int localPlnvEffDtCounter = -1;
     public boolean isPlnvEffDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPlnvEffDtCounter != sharedCounter;
         localPlnvEffDtCounter = sharedCounter; return hasModified;
     }
	protected static final int PLNV_EFF_DT_LEN = 10;
	/**
	 * 	serialize this PlnvEffDt
	 */
   protected void serializePlnvEffDt(char[] plnvEffDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(plnvEffDt,0,getStringValue(),beginPlnvEffDt,PLNV_EFF_DT_LEN);
       localPlnvEffDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPlnvEffDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshPlnvEffDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPlnvEffDt() {	 
   		return (substring(getStringValue(),beginPlnvEffDt,beginPlnvEffDt + PLNV_EFF_DT_LEN));
   	}
     int localPlnvCreatDttmCounter = -1;
     public boolean isPlnvCreatDttmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPlnvCreatDttmCounter != sharedCounter;
         localPlnvCreatDttmCounter = sharedCounter; return hasModified;
     }
	protected static final int PLNV_CREAT_DTTM_LEN = 26;
	/**
	 * 	serialize this PlnvCreatDttm
	 */
   protected void serializePlnvCreatDttm(char[] plnvCreatDttm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(plnvCreatDttm,0,getStringValue(),beginPlnvCreatDttm,PLNV_CREAT_DTTM_LEN);
       localPlnvCreatDttmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPlnvCreatDttmConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshPlnvCreatDttm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPlnvCreatDttm() {	 
   		return (substring(getStringValue(),beginPlnvCreatDttm,beginPlnvCreatDttm + PLNV_CREAT_DTTM_LEN));
   	}
     int localPlnvCancDtCounter = -1;
     public boolean isPlnvCancDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPlnvCancDtCounter != sharedCounter;
         localPlnvCancDtCounter = sharedCounter; return hasModified;
     }
	protected static final int PLNV_CANC_DT_LEN = 10;
	/**
	 * 	serialize this PlnvCancDt
	 */
   protected void serializePlnvCancDt(char[] plnvCancDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(plnvCancDt,0,getStringValue(),beginPlnvCancDt,PLNV_CANC_DT_LEN);
       localPlnvCancDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPlnvCancDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshPlnvCancDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPlnvCancDt() {	 
   		return (substring(getStringValue(),beginPlnvCancDt,beginPlnvCancDt + PLNV_CANC_DT_LEN));
   	}
     int localPlnvPgmIdCounter = -1;
     public boolean isPlnvPgmIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPlnvPgmIdCounter != sharedCounter;
         localPlnvPgmIdCounter = sharedCounter; return hasModified;
     }
	protected static final int PLNV_PGM_ID_LEN = 8;
	/**
	 * 	serialize this PlnvPgmId
	 */
   protected void serializePlnvPgmId(char[] plnvPgmId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(plnvPgmId,0,getStringValue(),beginPlnvPgmId,PLNV_PGM_ID_LEN);
       localPlnvPgmIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPlnvPgmIdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshPlnvPgmId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPlnvPgmId() {	 
   		return (substring(getStringValue(),beginPlnvPgmId,beginPlnvPgmId + PLNV_PGM_ID_LEN));
   	}
     int localPlnvLstUpdtDttmCounter = -1;
     public boolean isPlnvLstUpdtDttmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPlnvLstUpdtDttmCounter != sharedCounter;
         localPlnvLstUpdtDttmCounter = sharedCounter; return hasModified;
     }
	protected static final int PLNV_LST_UPDT_DTTM_LEN = 26;
	/**
	 * 	serialize this PlnvLstUpdtDttm
	 */
   protected void serializePlnvLstUpdtDttm(char[] plnvLstUpdtDttm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(plnvLstUpdtDttm,0,getStringValue(),beginPlnvLstUpdtDttm,PLNV_LST_UPDT_DTTM_LEN);
       localPlnvLstUpdtDttmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPlnvLstUpdtDttmConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshPlnvLstUpdtDttm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPlnvLstUpdtDttm() {	 
   		return (substring(getStringValue(),beginPlnvLstUpdtDttm,beginPlnvLstUpdtDttm + PLNV_LST_UPDT_DTTM_LEN));
   	}
     int localPlnvLstUpdtUserIdCounter = -1;
     public boolean isPlnvLstUpdtUserIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPlnvLstUpdtUserIdCounter != sharedCounter;
         localPlnvLstUpdtUserIdCounter = sharedCounter; return hasModified;
     }
	protected static final int PLNV_LST_UPDT_USER_ID_LEN = 9;
	/**
	 * 	serialize this PlnvLstUpdtUserId
	 */
   protected void serializePlnvLstUpdtUserId(char[] plnvLstUpdtUserId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(plnvLstUpdtUserId,0,getStringValue(),beginPlnvLstUpdtUserId,PLNV_LST_UPDT_USER_ID_LEN);
       localPlnvLstUpdtUserIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPlnvLstUpdtUserIdConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshPlnvLstUpdtUserId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPlnvLstUpdtUserId() {	 
   		return (substring(getStringValue(),beginPlnvLstUpdtUserId,beginPlnvLstUpdtUserId + PLNV_LST_UPDT_USER_ID_LEN));
   	}




}
  
