package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class HoldTransDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HoldTransDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HoldTransDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HOLD_TRANS_DATA_LENGTH = 25;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHoldPs;
            protected  int beginHoldSvc;
            protected  int beginHoldCauseCd;
            protected  int beginHoldSpiTblId;
            protected  int beginHold1SpiTblId;
            protected  int beginHoldPosTierCd;
            protected  int beginHoldDiagElgInd;
	
	/**
	* Constructor for HoldTransDataSerialized
	**/
    public HoldTransDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for HoldTransDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HoldTransDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this HoldTransDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,199984); // serialize this field at offset 199984 by default 
    }
    
	/**
	* sets parent for this HoldTransDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 199984 by default
    }    
	/**
	* initializes the field in HoldTransDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HOLD_TRANS_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHoldPs = getStartOffset() + 0;	// set offset for serialization
  
             beginHoldSvc = getStartOffset() + 2;	// set offset for serialization
  
             beginHoldCauseCd = getStartOffset() + 8;	// set offset for serialization
  
             beginHoldSpiTblId = getStartOffset() + 9;	// set offset for serialization
  
             beginHold1SpiTblId = getStartOffset() + 16;	// set offset for serialization
  
             beginHoldPosTierCd = getStartOffset() + 23;	// set offset for serialization
  
             beginHoldDiagElgInd = getStartOffset() + 24;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localHoldPsCounter = -1;
     public boolean isHoldPsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHoldPsCounter != sharedCounter;
         localHoldPsCounter = sharedCounter; return hasModified;
     }
	protected static final int HOLD_PS_LEN = 2;
	/**
	 * 	serialize this HoldPs
	 */
   protected void serializeHoldPs(char[] holdPs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(holdPs,0,getStringValue(),beginHoldPs,HOLD_PS_LEN);
       localHoldPsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHoldPsConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshHoldPs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHoldPs() {	 
   		return (substring(getStringValue(),beginHoldPs,beginHoldPs + HOLD_PS_LEN));
   	}
     int localHoldSvcCounter = -1;
     public boolean isHoldSvcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHoldSvcCounter != sharedCounter;
         localHoldSvcCounter = sharedCounter; return hasModified;
     }
	protected static final int HOLD_SVC_LEN = 6;
	/**
	 * 	serialize this HoldSvc
	 */
   protected void serializeHoldSvc(char[] holdSvc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(holdSvc,0,getStringValue(),beginHoldSvc,HOLD_SVC_LEN);
       localHoldSvcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHoldSvcConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshHoldSvc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHoldSvc() {	 
   		return (substring(getStringValue(),beginHoldSvc,beginHoldSvc + HOLD_SVC_LEN));
   	}
     int localHoldCauseCdCounter = -1;
     public boolean isHoldCauseCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHoldCauseCdCounter != sharedCounter;
         localHoldCauseCdCounter = sharedCounter; return hasModified;
     }
	protected static final int HOLD_CAUSE_CD_LEN = 1;
	/**
	 * 	serialize this HoldCauseCd
	 */
   protected void serializeHoldCauseCd(char[] holdCauseCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(holdCauseCd,0,getStringValue(),beginHoldCauseCd,HOLD_CAUSE_CD_LEN);
       localHoldCauseCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHoldCauseCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshHoldCauseCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHoldCauseCd() {	 
   		return (substring(getStringValue(),beginHoldCauseCd,beginHoldCauseCd + HOLD_CAUSE_CD_LEN));
   	}
     int localHoldSpiTblIdCounter = -1;
     public boolean isHoldSpiTblIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHoldSpiTblIdCounter != sharedCounter;
         localHoldSpiTblIdCounter = sharedCounter; return hasModified;
     }
	protected static final int HOLD_SPI_TBL_ID_LEN = 7;
	/**
	 * 	serialize this HoldSpiTblId
	 */
   protected void serializeHoldSpiTblId(char[] holdSpiTblId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(holdSpiTblId,0,getStringValue(),beginHoldSpiTblId,HOLD_SPI_TBL_ID_LEN);
       localHoldSpiTblIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHoldSpiTblIdConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshHoldSpiTblId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHoldSpiTblId() {	 
   		return (substring(getStringValue(),beginHoldSpiTblId,beginHoldSpiTblId + HOLD_SPI_TBL_ID_LEN));
   	}
     int localHold1SpiTblIdCounter = -1;
     public boolean isHold1SpiTblIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHold1SpiTblIdCounter != sharedCounter;
         localHold1SpiTblIdCounter = sharedCounter; return hasModified;
     }
	protected static final int HOLD_1_SPI_TBL_ID_LEN = 7;
	/**
	 * 	serialize this Hold1SpiTblId
	 */
   protected void serializeHold1SpiTblId(char[] hold1SpiTblId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hold1SpiTblId,0,getStringValue(),beginHold1SpiTblId,HOLD_1_SPI_TBL_ID_LEN);
       localHold1SpiTblIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHold1SpiTblIdConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshHold1SpiTblId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHold1SpiTblId() {	 
   		return (substring(getStringValue(),beginHold1SpiTblId,beginHold1SpiTblId + HOLD_1_SPI_TBL_ID_LEN));
   	}
     int localHoldPosTierCdCounter = -1;
     public boolean isHoldPosTierCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHoldPosTierCdCounter != sharedCounter;
         localHoldPosTierCdCounter = sharedCounter; return hasModified;
     }
	protected static final int HOLD_POS_TIER_CD_LEN = 1;
	/**
	 * 	serialize this HoldPosTierCd
	 */
   protected void serializeHoldPosTierCd(char[] holdPosTierCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(holdPosTierCd,0,getStringValue(),beginHoldPosTierCd,HOLD_POS_TIER_CD_LEN);
       localHoldPosTierCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHoldPosTierCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshHoldPosTierCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHoldPosTierCd() {	 
   		return (substring(getStringValue(),beginHoldPosTierCd,beginHoldPosTierCd + HOLD_POS_TIER_CD_LEN));
   	}
     int localHoldDiagElgIndCounter = -1;
     public boolean isHoldDiagElgIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHoldDiagElgIndCounter != sharedCounter;
         localHoldDiagElgIndCounter = sharedCounter; return hasModified;
     }
	protected static final int HOLD_DIAG_ELG_IND_LEN = 1;
	/**
	 * 	serialize this HoldDiagElgInd
	 */
   protected void serializeHoldDiagElgInd(char[] holdDiagElgInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(holdDiagElgInd,0,getStringValue(),beginHoldDiagElgInd,HOLD_DIAG_ELG_IND_LEN);
       localHoldDiagElgIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHoldDiagElgIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshHoldDiagElgInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHoldDiagElgInd() {	 
   		return (substring(getStringValue(),beginHoldDiagElgInd,beginHoldDiagElgInd + HOLD_DIAG_ELG_IND_LEN));
   	}




}
  
