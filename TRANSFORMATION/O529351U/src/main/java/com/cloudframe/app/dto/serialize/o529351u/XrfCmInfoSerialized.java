package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class XrfCmInfoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class XrfCmInfoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(XrfCmInfoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int XRF_CM_INFO_LENGTH = 252;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginXrfPlcyCm;
            protected  int beginXrfDivCm;
            protected  int beginXrfClsCm;
            protected  int beginXrfCancCdCm;
            protected  int beginXrfTefraApply;
            protected  int beginXrfEffDtCm;
            protected  int beginXrfCancDtCm;
            protected  int beginXrfLglEntyCd;
            protected  int beginXrfAcisEnrpInd;
            protected  int beginXrfEnrpDefPct;
            protected  int beginXrfMnrpDefPct;
            protected  int beginXrfMnrpPtPct;
            protected  int beginXrfSurprsMedBilCd;
            protected  int beginXrfEbdsSetId2;
            protected  int beginXrfAcnInd;
            protected  int beginXrfUhpInd;
            protected  int beginXrfAiInd;
            protected  int beginXrfEnrpErFacInd;
            protected  int beginXrfErWrapInd;
            protected  int beginXrfLabPct;
            protected  int beginXrfDmePct;
            protected  int beginXrfBusSegPltfm;
            protected  int beginXrfNmaddrCdCm;
            protected  int beginXrfMcSel;
            protected  int beginXrfPlcyAutpayInd;
            protected  int beginXrfRptCdCm;
            protected  int beginXrfMailCdCm;
            protected  int beginXrfFranchCd;
            protected  int beginXrfEbdsCovBase;
            protected  int beginXrfEbdsCovMme;
            protected  int beginXrfEbdsCovMcr;
            protected  int beginXrfEbdsSetId;
            protected  int beginXrfAaCm;
            protected  int beginXrfRxCm;
            protected  int beginXrfModCm;
            protected  int beginXrfPcsCm;
            protected  int beginXrfCchCm;
            protected  int beginXrfCapInd;
            protected  int beginXrfApportionmentPct;
            protected  int beginXrfPayloc1;
            protected  int beginXrfPayloc2;
            protected  int beginXrfMnnrpInd;
            protected  int beginXrfMnnrpPct;
            protected  int beginXrfIplan;
            protected  int beginXrfObligorInd;
            protected  int beginXrfSharedArg;
            protected  int beginXrfMeInd;
            protected  int beginXrfPteInd;
            protected  int beginXrfProductInd;
            protected  int beginXrfFreelookInd;
            protected  int beginXrfEbrInd;
            protected  int beginXrfLimSvcInd;
            protected  int beginXrfOptOutUbhTier;
            protected  int beginXrfHraApIndLmt;
            protected  int beginXrfHraApFamLmt;
            protected  int beginXrfDefaultPoc;
            protected  int beginXrfPcntRateJqCodesFound;
            protected  int beginXrfAppealLangInd;
            protected  int beginXrfProrateIntrvl;
            protected  int beginXrfNbSuppressInd;
            protected  int beginXrfProrateEvent;
            protected  int beginXrfCoreMedPrrAuthCd;
            protected  int beginXrfEnrpErInd;
            protected  int beginXrfEnrpNonErInd;
            protected  int beginXrfEnrpNonErPct;
            protected  int beginXrfEhbInd;
            protected  int beginFiller01;
	
	/**
	* Constructor for XrfCmInfoSerialized
	**/
    public XrfCmInfoSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for XrfCmInfoSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public XrfCmInfoSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this XrfCmInfoSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2340); // serialize this field at offset 2340 by default 
    }
    
	/**
	* sets parent for this XrfCmInfoSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2340 by default
    }    
	/**
	* initializes the field in XrfCmInfoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(XRF_CM_INFO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginXrfPlcyCm = getStartOffset() + 0;	// set offset for serialization
  
             beginXrfDivCm = getStartOffset() + 6;	// set offset for serialization
  
             beginXrfClsCm = getStartOffset() + 8;	// set offset for serialization
  
             beginXrfCancCdCm = getStartOffset() + 10;	// set offset for serialization
  
             beginXrfTefraApply = getStartOffset() + 11;	// set offset for serialization
  
             beginXrfEffDtCm = getStartOffset() + 12;	// set offset for serialization
  
             beginXrfCancDtCm = getStartOffset() + 16;	// set offset for serialization
  
             beginXrfLglEntyCd = getStartOffset() + 20;	// set offset for serialization
  
             beginXrfAcisEnrpInd = getStartOffset() + 25;	// set offset for serialization
  
             beginXrfEnrpDefPct = getStartOffset() + 26;	// set offset for serialization
  
             beginXrfMnrpDefPct = getStartOffset() + 29;	// set offset for serialization
  
             beginXrfMnrpPtPct = getStartOffset() + 32;	// set offset for serialization
  
             beginXrfSurprsMedBilCd = getStartOffset() + 35;	// set offset for serialization
  
  
             beginXrfEbdsSetId2 = getStartOffset() + 150;	// set offset for serialization
  
             beginXrfAcnInd = getStartOffset() + 151;	// set offset for serialization
  
             beginXrfUhpInd = getStartOffset() + 152;	// set offset for serialization
  
             beginXrfAiInd = getStartOffset() + 153;	// set offset for serialization
  
             beginXrfEnrpErFacInd = getStartOffset() + 154;	// set offset for serialization
  
             beginXrfErWrapInd = getStartOffset() + 155;	// set offset for serialization
  
             beginXrfLabPct = getStartOffset() + 156;	// set offset for serialization
  
             beginXrfDmePct = getStartOffset() + 158;	// set offset for serialization
  
             beginXrfBusSegPltfm = getStartOffset() + 160;	// set offset for serialization
  
  
             beginXrfNmaddrCdCm = getStartOffset() + 164;	// set offset for serialization
  
             beginXrfMcSel = getStartOffset() + 165;	// set offset for serialization
  
             beginXrfPlcyAutpayInd = getStartOffset() + 166;	// set offset for serialization
  
             beginXrfRptCdCm = getStartOffset() + 167;	// set offset for serialization
  
             beginXrfMailCdCm = getStartOffset() + 168;	// set offset for serialization
  
  
             beginXrfFranchCd = getStartOffset() + 184;	// set offset for serialization
  
             beginXrfEbdsCovBase = getStartOffset() + 188;	// set offset for serialization
  
             beginXrfEbdsCovMme = getStartOffset() + 190;	// set offset for serialization
  
             beginXrfEbdsCovMcr = getStartOffset() + 192;	// set offset for serialization
  
             beginXrfEbdsSetId = getStartOffset() + 194;	// set offset for serialization
  
             beginXrfAaCm = getStartOffset() + 195;	// set offset for serialization
  
             beginXrfRxCm = getStartOffset() + 196;	// set offset for serialization
  
             beginXrfModCm = getStartOffset() + 202;	// set offset for serialization
  
             beginXrfPcsCm = getStartOffset() + 203;	// set offset for serialization
  
             beginXrfCchCm = getStartOffset() + 204;	// set offset for serialization
  
             beginXrfCapInd = getStartOffset() + 205;	// set offset for serialization
  
             beginXrfApportionmentPct = getStartOffset() + 206;	// set offset for serialization
  
             beginXrfPayloc1 = getStartOffset() + 208;	// set offset for serialization
  
             beginXrfPayloc2 = getStartOffset() + 210;	// set offset for serialization
  
             beginXrfMnnrpInd = getStartOffset() + 212;	// set offset for serialization
  
             beginXrfMnnrpPct = getStartOffset() + 213;	// set offset for serialization
  
             beginXrfIplan = getStartOffset() + 215;	// set offset for serialization
  
             beginXrfObligorInd = getStartOffset() + 216;	// set offset for serialization
  
             beginXrfSharedArg = getStartOffset() + 218;	// set offset for serialization
  
             beginXrfMeInd = getStartOffset() + 220;	// set offset for serialization
  
             beginXrfPteInd = getStartOffset() + 221;	// set offset for serialization
  
             beginXrfProductInd = getStartOffset() + 222;	// set offset for serialization
  
             beginXrfFreelookInd = getStartOffset() + 225;	// set offset for serialization
  
             beginXrfEbrInd = getStartOffset() + 226;	// set offset for serialization
  
             beginXrfLimSvcInd = getStartOffset() + 227;	// set offset for serialization
  
             beginXrfOptOutUbhTier = getStartOffset() + 228;	// set offset for serialization
  
             beginXrfHraApIndLmt = getStartOffset() + 229;	// set offset for serialization
  
             beginXrfHraApFamLmt = getStartOffset() + 232;	// set offset for serialization
  
             beginXrfDefaultPoc = getStartOffset() + 235;	// set offset for serialization
  
             beginXrfPcntRateJqCodesFound = getStartOffset() + 237;	// set offset for serialization
  
             beginXrfAppealLangInd = getStartOffset() + 240;	// set offset for serialization
  
             beginXrfProrateIntrvl = getStartOffset() + 241;	// set offset for serialization
  
             beginXrfNbSuppressInd = getStartOffset() + 242;	// set offset for serialization
  
             beginXrfProrateEvent = getStartOffset() + 243;	// set offset for serialization
  
             beginXrfCoreMedPrrAuthCd = getStartOffset() + 244;	// set offset for serialization
  
             beginXrfEnrpErInd = getStartOffset() + 245;	// set offset for serialization
  
             beginXrfEnrpNonErInd = getStartOffset() + 246;	// set offset for serialization
  
             beginXrfEnrpNonErPct = getStartOffset() + 247;	// set offset for serialization
  
             beginXrfEhbInd = getStartOffset() + 250;	// set offset for serialization
  
             beginFiller01 = getStartOffset() + 251;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localXrfPlcyCmCounter = -1;
     public boolean isXrfPlcyCmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfPlcyCmCounter != sharedCounter;
         localXrfPlcyCmCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_PLCY_CM_LEN = 6;
	/**
	 * 	serialize this XrfPlcyCm
	 */
   protected void serializeXrfPlcyCm(char[] xrfPlcyCm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfPlcyCm,0,getStringValue(),beginXrfPlcyCm,XRF_PLCY_CM_LEN);
       localXrfPlcyCmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfPlcyCmConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshXrfPlcyCm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfPlcyCm() {	 
   		return (substring(getStringValue(),beginXrfPlcyCm,beginXrfPlcyCm + XRF_PLCY_CM_LEN));
   	}
         int localXrfDivCmCounter = -1;
         public boolean isXrfDivCmModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localXrfDivCmCounter != sharedCounter;
            localXrfDivCmCounter = sharedCounter; return hasModified; 
         }
   protected static final int XRF_DIV_CM_LEN = 2;
  	/**
	 * serializeXrfDivCm
	 */
	protected void serializeXrfDivCm(short xrfDivCm) {
           replaceValue( //  save the value as string
                   getBinaryString( xrfDivCm,XRF_DIV_CM_LEN)
                  ,beginXrfDivCm
                  ,XRF_DIV_CM_LEN
                 );
            localXrfDivCmCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkXrfDivCmMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshXrfDivCm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshXrfDivCm() {	 
			return (getShort(beginXrfDivCm));
   	}
         int localXrfClsCmCounter = -1;
         public boolean isXrfClsCmModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localXrfClsCmCounter != sharedCounter;
            localXrfClsCmCounter = sharedCounter; return hasModified; 
         }
   protected static final int XRF_CLS_CM_LEN = 2;
  	/**
	 * serializeXrfClsCm
	 */
	protected void serializeXrfClsCm(short xrfClsCm) {
           replaceValue( //  save the value as string
                   getBinaryString( xrfClsCm,XRF_CLS_CM_LEN)
                  ,beginXrfClsCm
                  ,XRF_CLS_CM_LEN
                 );
            localXrfClsCmCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkXrfClsCmMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshXrfClsCm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshXrfClsCm() {	 
			return (getShort(beginXrfClsCm));
   	}
     int localXrfCancCdCmCounter = -1;
     public boolean isXrfCancCdCmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfCancCdCmCounter != sharedCounter;
         localXrfCancCdCmCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_CANC_CD_CM_LEN = 1;
	/**
	 * 	serialize this XrfCancCdCm
	 */
   protected void serializeXrfCancCdCm(char[] xrfCancCdCm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfCancCdCm,0,getStringValue(),beginXrfCancCdCm,XRF_CANC_CD_CM_LEN);
       localXrfCancCdCmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfCancCdCmConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshXrfCancCdCm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfCancCdCm() {	 
   		return (substring(getStringValue(),beginXrfCancCdCm,beginXrfCancCdCm + XRF_CANC_CD_CM_LEN));
   	}
     int localXrfTefraApplyCounter = -1;
     public boolean isXrfTefraApplyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfTefraApplyCounter != sharedCounter;
         localXrfTefraApplyCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_TEFRA_APPLY_LEN = 1;
	/**
	 * 	serialize this XrfTefraApply
	 */
   protected void serializeXrfTefraApply(char[] xrfTefraApply) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfTefraApply,0,getStringValue(),beginXrfTefraApply,XRF_TEFRA_APPLY_LEN);
       localXrfTefraApplyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfTefraApplyConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshXrfTefraApply is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfTefraApply() {	 
   		return (substring(getStringValue(),beginXrfTefraApply,beginXrfTefraApply + XRF_TEFRA_APPLY_LEN));
   	}
         int localXrfEffDtCmCounter = -1;
         public boolean isXrfEffDtCmModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localXrfEffDtCmCounter != sharedCounter;
            localXrfEffDtCmCounter = sharedCounter; return hasModified; 
         }
   protected static final int XRF_EFF_DT_CM_LEN = 4;
  	/**
	 * serializeXrfEffDtCm
	 */
	protected void serializeXrfEffDtCm(int xrfEffDtCm) {
           replaceValue( //  save the value as string
                   getBinaryString( xrfEffDtCm,XRF_EFF_DT_CM_LEN)
                  ,beginXrfEffDtCm
                  ,XRF_EFF_DT_CM_LEN
                 );
            localXrfEffDtCmCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkXrfEffDtCmMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshXrfEffDtCm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshXrfEffDtCm() {	 
			return (getInt(beginXrfEffDtCm));
   	}
         int localXrfCancDtCmCounter = -1;
         public boolean isXrfCancDtCmModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localXrfCancDtCmCounter != sharedCounter;
            localXrfCancDtCmCounter = sharedCounter; return hasModified; 
         }
   protected static final int XRF_CANC_DT_CM_LEN = 4;
  	/**
	 * serializeXrfCancDtCm
	 */
	protected void serializeXrfCancDtCm(int xrfCancDtCm) {
           replaceValue( //  save the value as string
                   getBinaryString( xrfCancDtCm,XRF_CANC_DT_CM_LEN)
                  ,beginXrfCancDtCm
                  ,XRF_CANC_DT_CM_LEN
                 );
            localXrfCancDtCmCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkXrfCancDtCmMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshXrfCancDtCm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshXrfCancDtCm() {	 
			return (getInt(beginXrfCancDtCm));
   	}
     int localXrfLglEntyCdCounter = -1;
     public boolean isXrfLglEntyCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfLglEntyCdCounter != sharedCounter;
         localXrfLglEntyCdCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_LGL_ENTY_CD_LEN = 5;
	/**
	 * 	serialize this XrfLglEntyCd
	 */
   protected void serializeXrfLglEntyCd(char[] xrfLglEntyCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfLglEntyCd,0,getStringValue(),beginXrfLglEntyCd,XRF_LGL_ENTY_CD_LEN);
       localXrfLglEntyCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfLglEntyCdConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshXrfLglEntyCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfLglEntyCd() {	 
   		return (substring(getStringValue(),beginXrfLglEntyCd,beginXrfLglEntyCd + XRF_LGL_ENTY_CD_LEN));
   	}
     int localXrfAcisEnrpIndCounter = -1;
     public boolean isXrfAcisEnrpIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfAcisEnrpIndCounter != sharedCounter;
         localXrfAcisEnrpIndCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_ACIS_ENRP_IND_LEN = 1;
	/**
	 * 	serialize this XrfAcisEnrpInd
	 */
   protected void serializeXrfAcisEnrpInd(char[] xrfAcisEnrpInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfAcisEnrpInd,0,getStringValue(),beginXrfAcisEnrpInd,XRF_ACIS_ENRP_IND_LEN);
       localXrfAcisEnrpIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfAcisEnrpIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshXrfAcisEnrpInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfAcisEnrpInd() {	 
   		return (substring(getStringValue(),beginXrfAcisEnrpInd,beginXrfAcisEnrpInd + XRF_ACIS_ENRP_IND_LEN));
   	}
        int localXrfEnrpDefPctCounter = -1;
        public boolean isXrfEnrpDefPctModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localXrfEnrpDefPctCounter != sharedCounter;
           localXrfEnrpDefPctCounter = sharedCounter; return hasModified; 
        }
	    public boolean xrfEnrpDefPctIsNumeric() {
	      return decimalIsNumeric(beginXrfEnrpDefPct,XRF_ENRP_DEF_PCT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] xrfEnrpDefPctString() {
            return getPackedString(beginXrfEnrpDefPct,XRF_ENRP_DEF_PCT_LEN);
         }
   protected static final int XRF_ENRP_DEF_PCT_LEN = 3;
   protected static final int XRF_ENRP_DEF_PCT_SCALE = 2;
  	/**
	 * 	serializeXrfEnrpDefPct
	 */
	protected void serializeXrfEnrpDefPct(BigDecimal xrfEnrpDefPct) {
		   putDecimal(beginXrfEnrpDefPct,xrfEnrpDefPct,XRF_ENRP_DEF_PCT_LEN,XRF_ENRP_DEF_PCT_SCALE,true);
		 localXrfEnrpDefPctCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkXrfEnrpDefPctMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,5/*precision*/);
   }
     /**
	 *	refreshXrfEnrpDefPct is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshXrfEnrpDefPct() throws CFException {	
   	try { 
		 return (getDecimal(beginXrfEnrpDefPct,XRF_ENRP_DEF_PCT_LEN,XRF_ENRP_DEF_PCT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("xrfEnrpDefPct", beginXrfEnrpDefPct,XRF_ENRP_DEF_PCT_LEN);
     }
   	}
        int localXrfMnrpDefPctCounter = -1;
        public boolean isXrfMnrpDefPctModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localXrfMnrpDefPctCounter != sharedCounter;
           localXrfMnrpDefPctCounter = sharedCounter; return hasModified; 
        }
	    public boolean xrfMnrpDefPctIsNumeric() {
	      return decimalIsNumeric(beginXrfMnrpDefPct,XRF_MNRP_DEF_PCT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] xrfMnrpDefPctString() {
            return getPackedString(beginXrfMnrpDefPct,XRF_MNRP_DEF_PCT_LEN);
         }
   protected static final int XRF_MNRP_DEF_PCT_LEN = 3;
   protected static final int XRF_MNRP_DEF_PCT_SCALE = 2;
  	/**
	 * 	serializeXrfMnrpDefPct
	 */
	protected void serializeXrfMnrpDefPct(BigDecimal xrfMnrpDefPct) {
		   putDecimal(beginXrfMnrpDefPct,xrfMnrpDefPct,XRF_MNRP_DEF_PCT_LEN,XRF_MNRP_DEF_PCT_SCALE,true);
		 localXrfMnrpDefPctCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkXrfMnrpDefPctMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,5/*precision*/);
   }
     /**
	 *	refreshXrfMnrpDefPct is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshXrfMnrpDefPct() throws CFException {	
   	try { 
		 return (getDecimal(beginXrfMnrpDefPct,XRF_MNRP_DEF_PCT_LEN,XRF_MNRP_DEF_PCT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("xrfMnrpDefPct", beginXrfMnrpDefPct,XRF_MNRP_DEF_PCT_LEN);
     }
   	}
        int localXrfMnrpPtPctCounter = -1;
        public boolean isXrfMnrpPtPctModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localXrfMnrpPtPctCounter != sharedCounter;
           localXrfMnrpPtPctCounter = sharedCounter; return hasModified; 
        }
	    public boolean xrfMnrpPtPctIsNumeric() {
	      return decimalIsNumeric(beginXrfMnrpPtPct,XRF_MNRP_PT_PCT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] xrfMnrpPtPctString() {
            return getPackedString(beginXrfMnrpPtPct,XRF_MNRP_PT_PCT_LEN);
         }
   protected static final int XRF_MNRP_PT_PCT_LEN = 3;
   protected static final int XRF_MNRP_PT_PCT_SCALE = 2;
  	/**
	 * 	serializeXrfMnrpPtPct
	 */
	protected void serializeXrfMnrpPtPct(BigDecimal xrfMnrpPtPct) {
		   putDecimal(beginXrfMnrpPtPct,xrfMnrpPtPct,XRF_MNRP_PT_PCT_LEN,XRF_MNRP_PT_PCT_SCALE,true);
		 localXrfMnrpPtPctCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkXrfMnrpPtPctMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,5/*precision*/);
   }
     /**
	 *	refreshXrfMnrpPtPct is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshXrfMnrpPtPct() throws CFException {	
   	try { 
		 return (getDecimal(beginXrfMnrpPtPct,XRF_MNRP_PT_PCT_LEN,XRF_MNRP_PT_PCT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("xrfMnrpPtPct", beginXrfMnrpPtPct,XRF_MNRP_PT_PCT_LEN);
     }
   	}
     int localXrfSurprsMedBilCdCounter = -1;
     public boolean isXrfSurprsMedBilCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfSurprsMedBilCdCounter != sharedCounter;
         localXrfSurprsMedBilCdCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_SURPRS_MED_BIL_CD_LEN = 1;
	/**
	 * 	serialize this XrfSurprsMedBilCd
	 */
   protected void serializeXrfSurprsMedBilCd(char[] xrfSurprsMedBilCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfSurprsMedBilCd,0,getStringValue(),beginXrfSurprsMedBilCd,XRF_SURPRS_MED_BIL_CD_LEN);
       localXrfSurprsMedBilCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfSurprsMedBilCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshXrfSurprsMedBilCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfSurprsMedBilCd() {	 
   		return (substring(getStringValue(),beginXrfSurprsMedBilCd,beginXrfSurprsMedBilCd + XRF_SURPRS_MED_BIL_CD_LEN));
   	}
     int localXrfEbdsSetId2Counter = -1;
     public boolean isXrfEbdsSetId2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfEbdsSetId2Counter != sharedCounter;
         localXrfEbdsSetId2Counter = sharedCounter; return hasModified;
     }
	protected static final int XRF_EBDS_SET_ID_2_LEN = 1;
	/**
	 * 	serialize this XrfEbdsSetId2
	 */
   protected void serializeXrfEbdsSetId2(char[] xrfEbdsSetId2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfEbdsSetId2,0,getStringValue(),beginXrfEbdsSetId2,XRF_EBDS_SET_ID_2_LEN);
       localXrfEbdsSetId2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfEbdsSetId2Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshXrfEbdsSetId2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfEbdsSetId2() {	 
   		return (substring(getStringValue(),beginXrfEbdsSetId2,beginXrfEbdsSetId2 + XRF_EBDS_SET_ID_2_LEN));
   	}
     int localXrfAcnIndCounter = -1;
     public boolean isXrfAcnIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfAcnIndCounter != sharedCounter;
         localXrfAcnIndCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_ACN_IND_LEN = 1;
	/**
	 * 	serialize this XrfAcnInd
	 */
   protected void serializeXrfAcnInd(char[] xrfAcnInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfAcnInd,0,getStringValue(),beginXrfAcnInd,XRF_ACN_IND_LEN);
       localXrfAcnIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfAcnIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshXrfAcnInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfAcnInd() {	 
   		return (substring(getStringValue(),beginXrfAcnInd,beginXrfAcnInd + XRF_ACN_IND_LEN));
   	}
     int localXrfUhpIndCounter = -1;
     public boolean isXrfUhpIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfUhpIndCounter != sharedCounter;
         localXrfUhpIndCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_UHP_IND_LEN = 1;
	/**
	 * 	serialize this XrfUhpInd
	 */
   protected void serializeXrfUhpInd(char[] xrfUhpInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfUhpInd,0,getStringValue(),beginXrfUhpInd,XRF_UHP_IND_LEN);
       localXrfUhpIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfUhpIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshXrfUhpInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfUhpInd() {	 
   		return (substring(getStringValue(),beginXrfUhpInd,beginXrfUhpInd + XRF_UHP_IND_LEN));
   	}
     int localXrfAiIndCounter = -1;
     public boolean isXrfAiIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfAiIndCounter != sharedCounter;
         localXrfAiIndCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_AI_IND_LEN = 1;
	/**
	 * 	serialize this XrfAiInd
	 */
   protected void serializeXrfAiInd(char[] xrfAiInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfAiInd,0,getStringValue(),beginXrfAiInd,XRF_AI_IND_LEN);
       localXrfAiIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfAiIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshXrfAiInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfAiInd() {	 
   		return (substring(getStringValue(),beginXrfAiInd,beginXrfAiInd + XRF_AI_IND_LEN));
   	}
     int localXrfEnrpErFacIndCounter = -1;
     public boolean isXrfEnrpErFacIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfEnrpErFacIndCounter != sharedCounter;
         localXrfEnrpErFacIndCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_ENRP_ER_FAC_IND_LEN = 1;
	/**
	 * 	serialize this XrfEnrpErFacInd
	 */
   protected void serializeXrfEnrpErFacInd(char[] xrfEnrpErFacInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfEnrpErFacInd,0,getStringValue(),beginXrfEnrpErFacInd,XRF_ENRP_ER_FAC_IND_LEN);
       localXrfEnrpErFacIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfEnrpErFacIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshXrfEnrpErFacInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfEnrpErFacInd() {	 
   		return (substring(getStringValue(),beginXrfEnrpErFacInd,beginXrfEnrpErFacInd + XRF_ENRP_ER_FAC_IND_LEN));
   	}
     int localXrfErWrapIndCounter = -1;
     public boolean isXrfErWrapIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfErWrapIndCounter != sharedCounter;
         localXrfErWrapIndCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_ER_WRAP_IND_LEN = 1;
	/**
	 * 	serialize this XrfErWrapInd
	 */
   protected void serializeXrfErWrapInd(char[] xrfErWrapInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfErWrapInd,0,getStringValue(),beginXrfErWrapInd,XRF_ER_WRAP_IND_LEN);
       localXrfErWrapIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfErWrapIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshXrfErWrapInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfErWrapInd() {	 
   		return (substring(getStringValue(),beginXrfErWrapInd,beginXrfErWrapInd + XRF_ER_WRAP_IND_LEN));
   	}
        int localXrfLabPctCounter = -1;
        public boolean isXrfLabPctModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localXrfLabPctCounter != sharedCounter;
           localXrfLabPctCounter = sharedCounter; return hasModified; 
        }
	    public boolean xrfLabPctIsNumeric() {
	      return decimalIsNumeric(beginXrfLabPct,XRF_LAB_PCT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int XRF_LAB_PCT_LEN = 2;
  	/**
	 * 	serializeXrfLabPct
	 */
	protected void serializeXrfLabPct(short xrfLabPct) {
		   putDecimal(beginXrfLabPct,xrfLabPct,XRF_LAB_PCT_LEN,true);
   }
   

   protected short checkXrfLabPctMaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshXrfLabPct is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshXrfLabPct() throws CFException {	
   	try { 
		 return (getShortDecimal(beginXrfLabPct,XRF_LAB_PCT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("xrfLabPct", beginXrfLabPct,XRF_LAB_PCT_LEN);
     }
   	}
        int localXrfDmePctCounter = -1;
        public boolean isXrfDmePctModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localXrfDmePctCounter != sharedCounter;
           localXrfDmePctCounter = sharedCounter; return hasModified; 
        }
	    public boolean xrfDmePctIsNumeric() {
	      return decimalIsNumeric(beginXrfDmePct,XRF_DME_PCT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int XRF_DME_PCT_LEN = 2;
  	/**
	 * 	serializeXrfDmePct
	 */
	protected void serializeXrfDmePct(short xrfDmePct) {
		   putDecimal(beginXrfDmePct,xrfDmePct,XRF_DME_PCT_LEN,true);
   }
   

   protected short checkXrfDmePctMaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshXrfDmePct is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshXrfDmePct() throws CFException {	
   	try { 
		 return (getShortDecimal(beginXrfDmePct,XRF_DME_PCT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("xrfDmePct", beginXrfDmePct,XRF_DME_PCT_LEN);
     }
   	}
     int localXrfBusSegPltfmCounter = -1;
     public boolean isXrfBusSegPltfmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfBusSegPltfmCounter != sharedCounter;
         localXrfBusSegPltfmCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_BUS_SEG_PLTFM_LEN = 3;
	/**
	 * 	serialize this XrfBusSegPltfm
	 */
   protected void serializeXrfBusSegPltfm(char[] xrfBusSegPltfm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfBusSegPltfm,0,getStringValue(),beginXrfBusSegPltfm,XRF_BUS_SEG_PLTFM_LEN);
       localXrfBusSegPltfmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfBusSegPltfmConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshXrfBusSegPltfm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfBusSegPltfm() {	 
   		return (substring(getStringValue(),beginXrfBusSegPltfm,beginXrfBusSegPltfm + XRF_BUS_SEG_PLTFM_LEN));
   	}
     int localXrfNmaddrCdCmCounter = -1;
     public boolean isXrfNmaddrCdCmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfNmaddrCdCmCounter != sharedCounter;
         localXrfNmaddrCdCmCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_NMADDR_CD_CM_LEN = 1;
	/**
	 * 	serialize this XrfNmaddrCdCm
	 */
   protected void serializeXrfNmaddrCdCm(char[] xrfNmaddrCdCm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfNmaddrCdCm,0,getStringValue(),beginXrfNmaddrCdCm,XRF_NMADDR_CD_CM_LEN);
       localXrfNmaddrCdCmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfNmaddrCdCmConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshXrfNmaddrCdCm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfNmaddrCdCm() {	 
   		return (substring(getStringValue(),beginXrfNmaddrCdCm,beginXrfNmaddrCdCm + XRF_NMADDR_CD_CM_LEN));
   	}
     int localXrfMcSelCounter = -1;
     public boolean isXrfMcSelModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfMcSelCounter != sharedCounter;
         localXrfMcSelCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_MC_SEL_LEN = 1;
	/**
	 * 	serialize this XrfMcSel
	 */
   protected void serializeXrfMcSel(char[] xrfMcSel) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfMcSel,0,getStringValue(),beginXrfMcSel,XRF_MC_SEL_LEN);
       localXrfMcSelCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfMcSelConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshXrfMcSel is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfMcSel() {	 
   		return (substring(getStringValue(),beginXrfMcSel,beginXrfMcSel + XRF_MC_SEL_LEN));
   	}
     int localXrfPlcyAutpayIndCounter = -1;
     public boolean isXrfPlcyAutpayIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfPlcyAutpayIndCounter != sharedCounter;
         localXrfPlcyAutpayIndCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_PLCY_AUTPAY_IND_LEN = 1;
	/**
	 * 	serialize this XrfPlcyAutpayInd
	 */
   protected void serializeXrfPlcyAutpayInd(char[] xrfPlcyAutpayInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfPlcyAutpayInd,0,getStringValue(),beginXrfPlcyAutpayInd,XRF_PLCY_AUTPAY_IND_LEN);
       localXrfPlcyAutpayIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfPlcyAutpayIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshXrfPlcyAutpayInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfPlcyAutpayInd() {	 
   		return (substring(getStringValue(),beginXrfPlcyAutpayInd,beginXrfPlcyAutpayInd + XRF_PLCY_AUTPAY_IND_LEN));
   	}
     int localXrfRptCdCmCounter = -1;
     public boolean isXrfRptCdCmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfRptCdCmCounter != sharedCounter;
         localXrfRptCdCmCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_RPT_CD_CM_LEN = 1;
	/**
	 * 	serialize this XrfRptCdCm
	 */
   protected void serializeXrfRptCdCm(char[] xrfRptCdCm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfRptCdCm,0,getStringValue(),beginXrfRptCdCm,XRF_RPT_CD_CM_LEN);
       localXrfRptCdCmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfRptCdCmConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshXrfRptCdCm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfRptCdCm() {	 
   		return (substring(getStringValue(),beginXrfRptCdCm,beginXrfRptCdCm + XRF_RPT_CD_CM_LEN));
   	}
     int localXrfMailCdCmCounter = -1;
     public boolean isXrfMailCdCmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfMailCdCmCounter != sharedCounter;
         localXrfMailCdCmCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_MAIL_CD_CM_LEN = 4;
	/**
	 * 	serialize this XrfMailCdCm
	 */
   protected void serializeXrfMailCdCm(char[] xrfMailCdCm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfMailCdCm,0,getStringValue(),beginXrfMailCdCm,XRF_MAIL_CD_CM_LEN);
       localXrfMailCdCmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfMailCdCmConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshXrfMailCdCm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfMailCdCm() {	 
   		return (substring(getStringValue(),beginXrfMailCdCm,beginXrfMailCdCm + XRF_MAIL_CD_CM_LEN));
   	}
         int localXrfFranchCdCounter = -1;
         public boolean isXrfFranchCdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localXrfFranchCdCounter != sharedCounter;
            localXrfFranchCdCounter = sharedCounter; return hasModified; 
         }
   protected static final int XRF_FRANCH_CD_LEN = 4;
  	/**
	 * serializeXrfFranchCd
	 */
	protected void serializeXrfFranchCd(int xrfFranchCd) {
           replaceValue( //  save the value as string
                   getBinaryString( xrfFranchCd,XRF_FRANCH_CD_LEN)
                  ,beginXrfFranchCd
                  ,XRF_FRANCH_CD_LEN
                 );
            localXrfFranchCdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkXrfFranchCdMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshXrfFranchCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshXrfFranchCd() {	 
			return (getInt(beginXrfFranchCd));
   	}
         int localXrfEbdsCovBaseCounter = -1;
         public boolean isXrfEbdsCovBaseModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localXrfEbdsCovBaseCounter != sharedCounter;
            localXrfEbdsCovBaseCounter = sharedCounter; return hasModified; 
         }
   protected static final int XRF_EBDS_COV_BASE_LEN = 2;
  	/**
	 * serializeXrfEbdsCovBase
	 */
	protected void serializeXrfEbdsCovBase(short xrfEbdsCovBase) {
           replaceValue( //  save the value as string
                   getBinaryString( xrfEbdsCovBase,XRF_EBDS_COV_BASE_LEN)
                  ,beginXrfEbdsCovBase
                  ,XRF_EBDS_COV_BASE_LEN
                 );
            localXrfEbdsCovBaseCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkXrfEbdsCovBaseMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshXrfEbdsCovBase is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshXrfEbdsCovBase() {	 
			return (getShort(beginXrfEbdsCovBase));
   	}
         int localXrfEbdsCovMmeCounter = -1;
         public boolean isXrfEbdsCovMmeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localXrfEbdsCovMmeCounter != sharedCounter;
            localXrfEbdsCovMmeCounter = sharedCounter; return hasModified; 
         }
   protected static final int XRF_EBDS_COV_MME_LEN = 2;
  	/**
	 * serializeXrfEbdsCovMme
	 */
	protected void serializeXrfEbdsCovMme(short xrfEbdsCovMme) {
           replaceValue( //  save the value as string
                   getBinaryString( xrfEbdsCovMme,XRF_EBDS_COV_MME_LEN)
                  ,beginXrfEbdsCovMme
                  ,XRF_EBDS_COV_MME_LEN
                 );
            localXrfEbdsCovMmeCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkXrfEbdsCovMmeMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshXrfEbdsCovMme is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshXrfEbdsCovMme() {	 
			return (getShort(beginXrfEbdsCovMme));
   	}
         int localXrfEbdsCovMcrCounter = -1;
         public boolean isXrfEbdsCovMcrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localXrfEbdsCovMcrCounter != sharedCounter;
            localXrfEbdsCovMcrCounter = sharedCounter; return hasModified; 
         }
   protected static final int XRF_EBDS_COV_MCR_LEN = 2;
  	/**
	 * serializeXrfEbdsCovMcr
	 */
	protected void serializeXrfEbdsCovMcr(short xrfEbdsCovMcr) {
           replaceValue( //  save the value as string
                   getBinaryString( xrfEbdsCovMcr,XRF_EBDS_COV_MCR_LEN)
                  ,beginXrfEbdsCovMcr
                  ,XRF_EBDS_COV_MCR_LEN
                 );
            localXrfEbdsCovMcrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkXrfEbdsCovMcrMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshXrfEbdsCovMcr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshXrfEbdsCovMcr() {	 
			return (getShort(beginXrfEbdsCovMcr));
   	}
     int localXrfEbdsSetIdCounter = -1;
     public boolean isXrfEbdsSetIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfEbdsSetIdCounter != sharedCounter;
         localXrfEbdsSetIdCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_EBDS_SET_ID_LEN = 1;
	/**
	 * 	serialize this XrfEbdsSetId
	 */
   protected void serializeXrfEbdsSetId(char[] xrfEbdsSetId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfEbdsSetId,0,getStringValue(),beginXrfEbdsSetId,XRF_EBDS_SET_ID_LEN);
       localXrfEbdsSetIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfEbdsSetIdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshXrfEbdsSetId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfEbdsSetId() {	 
   		return (substring(getStringValue(),beginXrfEbdsSetId,beginXrfEbdsSetId + XRF_EBDS_SET_ID_LEN));
   	}
     int localXrfAaCmCounter = -1;
     public boolean isXrfAaCmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfAaCmCounter != sharedCounter;
         localXrfAaCmCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_AA_CM_LEN = 1;
	/**
	 * 	serialize this XrfAaCm
	 */
   protected void serializeXrfAaCm(char[] xrfAaCm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfAaCm,0,getStringValue(),beginXrfAaCm,XRF_AA_CM_LEN);
       localXrfAaCmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfAaCmConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshXrfAaCm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfAaCm() {	 
   		return (substring(getStringValue(),beginXrfAaCm,beginXrfAaCm + XRF_AA_CM_LEN));
   	}
     int localXrfRxCmCounter = -1;
     public boolean isXrfRxCmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfRxCmCounter != sharedCounter;
         localXrfRxCmCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_RX_CM_LEN = 6;
	/**
	 * 	serialize this XrfRxCm
	 */
   protected void serializeXrfRxCm(char[] xrfRxCm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfRxCm,0,getStringValue(),beginXrfRxCm,XRF_RX_CM_LEN);
       localXrfRxCmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfRxCmConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshXrfRxCm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfRxCm() {	 
   		return (substring(getStringValue(),beginXrfRxCm,beginXrfRxCm + XRF_RX_CM_LEN));
   	}
     int localXrfModCmCounter = -1;
     public boolean isXrfModCmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfModCmCounter != sharedCounter;
         localXrfModCmCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_MOD_CM_LEN = 1;
	/**
	 * 	serialize this XrfModCm
	 */
   protected void serializeXrfModCm(char[] xrfModCm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfModCm,0,getStringValue(),beginXrfModCm,XRF_MOD_CM_LEN);
       localXrfModCmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfModCmConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshXrfModCm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfModCm() {	 
   		return (substring(getStringValue(),beginXrfModCm,beginXrfModCm + XRF_MOD_CM_LEN));
   	}
     int localXrfPcsCmCounter = -1;
     public boolean isXrfPcsCmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfPcsCmCounter != sharedCounter;
         localXrfPcsCmCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_PCS_CM_LEN = 1;
	/**
	 * 	serialize this XrfPcsCm
	 */
   protected void serializeXrfPcsCm(char[] xrfPcsCm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfPcsCm,0,getStringValue(),beginXrfPcsCm,XRF_PCS_CM_LEN);
       localXrfPcsCmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfPcsCmConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshXrfPcsCm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfPcsCm() {	 
   		return (substring(getStringValue(),beginXrfPcsCm,beginXrfPcsCm + XRF_PCS_CM_LEN));
   	}
     int localXrfCchCmCounter = -1;
     public boolean isXrfCchCmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfCchCmCounter != sharedCounter;
         localXrfCchCmCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_CCH_CM_LEN = 1;
	/**
	 * 	serialize this XrfCchCm
	 */
   protected void serializeXrfCchCm(char[] xrfCchCm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfCchCm,0,getStringValue(),beginXrfCchCm,XRF_CCH_CM_LEN);
       localXrfCchCmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfCchCmConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshXrfCchCm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfCchCm() {	 
   		return (substring(getStringValue(),beginXrfCchCm,beginXrfCchCm + XRF_CCH_CM_LEN));
   	}
     int localXrfCapIndCounter = -1;
     public boolean isXrfCapIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfCapIndCounter != sharedCounter;
         localXrfCapIndCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_CAP_IND_LEN = 1;
	/**
	 * 	serialize this XrfCapInd
	 */
   protected void serializeXrfCapInd(char[] xrfCapInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfCapInd,0,getStringValue(),beginXrfCapInd,XRF_CAP_IND_LEN);
       localXrfCapIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfCapIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshXrfCapInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfCapInd() {	 
   		return (substring(getStringValue(),beginXrfCapInd,beginXrfCapInd + XRF_CAP_IND_LEN));
   	}
        int localXrfApportionmentPctCounter = -1;
        public boolean isXrfApportionmentPctModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localXrfApportionmentPctCounter != sharedCounter;
           localXrfApportionmentPctCounter = sharedCounter; return hasModified; 
        }
	    public boolean xrfApportionmentPctIsNumeric() {
	      return decimalIsNumeric(beginXrfApportionmentPct,XRF_APPORTIONMENT_PCT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int XRF_APPORTIONMENT_PCT_LEN = 2;
  	/**
	 * 	serializeXrfApportionmentPct
	 */
	protected void serializeXrfApportionmentPct(short xrfApportionmentPct) {
		   putDecimal(beginXrfApportionmentPct,xrfApportionmentPct,XRF_APPORTIONMENT_PCT_LEN,true);
   }
   

   protected short checkXrfApportionmentPctMaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshXrfApportionmentPct is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshXrfApportionmentPct() throws CFException {	
   	try { 
		 return (getShortDecimal(beginXrfApportionmentPct,XRF_APPORTIONMENT_PCT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("xrfApportionmentPct", beginXrfApportionmentPct,XRF_APPORTIONMENT_PCT_LEN);
     }
   	}
        int localXrfPayloc1Counter = -1;
        public boolean isXrfPayloc1Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localXrfPayloc1Counter != sharedCounter;
           localXrfPayloc1Counter = sharedCounter; return hasModified; 
        }
	    public boolean xrfPayloc1IsNumeric() {
	      return decimalIsNumeric(beginXrfPayloc1,XRF_PAYLOC_1_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int XRF_PAYLOC_1_LEN = 2;
  	/**
	 * 	serializeXrfPayloc1
	 */
	protected void serializeXrfPayloc1(short xrfPayloc1) {
		   putDecimal(beginXrfPayloc1,xrfPayloc1,XRF_PAYLOC_1_LEN,true);
   }
   

   protected short checkXrfPayloc1MaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshXrfPayloc1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshXrfPayloc1() throws CFException {	
   	try { 
		 return (getShortDecimal(beginXrfPayloc1,XRF_PAYLOC_1_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("xrfPayloc1", beginXrfPayloc1,XRF_PAYLOC_1_LEN);
     }
   	}
        int localXrfPayloc2Counter = -1;
        public boolean isXrfPayloc2Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localXrfPayloc2Counter != sharedCounter;
           localXrfPayloc2Counter = sharedCounter; return hasModified; 
        }
	    public boolean xrfPayloc2IsNumeric() {
	      return decimalIsNumeric(beginXrfPayloc2,XRF_PAYLOC_2_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int XRF_PAYLOC_2_LEN = 2;
  	/**
	 * 	serializeXrfPayloc2
	 */
	protected void serializeXrfPayloc2(short xrfPayloc2) {
		   putDecimal(beginXrfPayloc2,xrfPayloc2,XRF_PAYLOC_2_LEN,true);
   }
   

   protected short checkXrfPayloc2MaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshXrfPayloc2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshXrfPayloc2() throws CFException {	
   	try { 
		 return (getShortDecimal(beginXrfPayloc2,XRF_PAYLOC_2_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("xrfPayloc2", beginXrfPayloc2,XRF_PAYLOC_2_LEN);
     }
   	}
     int localXrfMnnrpIndCounter = -1;
     public boolean isXrfMnnrpIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfMnnrpIndCounter != sharedCounter;
         localXrfMnnrpIndCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_MNNRP_IND_LEN = 1;
	/**
	 * 	serialize this XrfMnnrpInd
	 */
   protected void serializeXrfMnnrpInd(char[] xrfMnnrpInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfMnnrpInd,0,getStringValue(),beginXrfMnnrpInd,XRF_MNNRP_IND_LEN);
       localXrfMnnrpIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfMnnrpIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshXrfMnnrpInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfMnnrpInd() {	 
   		return (substring(getStringValue(),beginXrfMnnrpInd,beginXrfMnnrpInd + XRF_MNNRP_IND_LEN));
   	}
        int localXrfMnnrpPctCounter = -1;
        public boolean isXrfMnnrpPctModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localXrfMnnrpPctCounter != sharedCounter;
           localXrfMnnrpPctCounter = sharedCounter; return hasModified; 
        }
	    public boolean xrfMnnrpPctIsNumeric() {
	      return decimalIsNumeric(beginXrfMnnrpPct,XRF_MNNRP_PCT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int XRF_MNNRP_PCT_LEN = 2;
  	/**
	 * 	serializeXrfMnnrpPct
	 */
	protected void serializeXrfMnnrpPct(short xrfMnnrpPct) {
		   putDecimal(beginXrfMnnrpPct,xrfMnnrpPct,XRF_MNNRP_PCT_LEN,true);
   }
   

   protected short checkXrfMnnrpPctMaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshXrfMnnrpPct is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshXrfMnnrpPct() throws CFException {	
   	try { 
		 return (getShortDecimal(beginXrfMnnrpPct,XRF_MNNRP_PCT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("xrfMnnrpPct", beginXrfMnnrpPct,XRF_MNNRP_PCT_LEN);
     }
   	}
     int localXrfIplanCounter = -1;
     public boolean isXrfIplanModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfIplanCounter != sharedCounter;
         localXrfIplanCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_IPLAN_LEN = 1;
	/**
	 * 	serialize this XrfIplan
	 */
   protected void serializeXrfIplan(char[] xrfIplan) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfIplan,0,getStringValue(),beginXrfIplan,XRF_IPLAN_LEN);
       localXrfIplanCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfIplanConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshXrfIplan is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfIplan() {	 
   		return (substring(getStringValue(),beginXrfIplan,beginXrfIplan + XRF_IPLAN_LEN));
   	}
     int localXrfObligorIndCounter = -1;
     public boolean isXrfObligorIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfObligorIndCounter != sharedCounter;
         localXrfObligorIndCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_OBLIGOR_IND_LEN = 2;
	/**
	 * 	serialize this XrfObligorInd
	 */
   protected void serializeXrfObligorInd(char[] xrfObligorInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfObligorInd,0,getStringValue(),beginXrfObligorInd,XRF_OBLIGOR_IND_LEN);
       localXrfObligorIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfObligorIndConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshXrfObligorInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfObligorInd() {	 
   		return (substring(getStringValue(),beginXrfObligorInd,beginXrfObligorInd + XRF_OBLIGOR_IND_LEN));
   	}
     int localXrfSharedArgCounter = -1;
     public boolean isXrfSharedArgModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfSharedArgCounter != sharedCounter;
         localXrfSharedArgCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_SHARED_ARG_LEN = 2;
	/**
	 * 	serialize this XrfSharedArg
	 */
   protected void serializeXrfSharedArg(char[] xrfSharedArg) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfSharedArg,0,getStringValue(),beginXrfSharedArg,XRF_SHARED_ARG_LEN);
       localXrfSharedArgCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfSharedArgConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshXrfSharedArg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfSharedArg() {	 
   		return (substring(getStringValue(),beginXrfSharedArg,beginXrfSharedArg + XRF_SHARED_ARG_LEN));
   	}
     int localXrfMeIndCounter = -1;
     public boolean isXrfMeIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfMeIndCounter != sharedCounter;
         localXrfMeIndCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_ME_IND_LEN = 1;
	/**
	 * 	serialize this XrfMeInd
	 */
   protected void serializeXrfMeInd(char[] xrfMeInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfMeInd,0,getStringValue(),beginXrfMeInd,XRF_ME_IND_LEN);
       localXrfMeIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfMeIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshXrfMeInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfMeInd() {	 
   		return (substring(getStringValue(),beginXrfMeInd,beginXrfMeInd + XRF_ME_IND_LEN));
   	}
     int localXrfPteIndCounter = -1;
     public boolean isXrfPteIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfPteIndCounter != sharedCounter;
         localXrfPteIndCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_PTE_IND_LEN = 1;
	/**
	 * 	serialize this XrfPteInd
	 */
   protected void serializeXrfPteInd(char[] xrfPteInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfPteInd,0,getStringValue(),beginXrfPteInd,XRF_PTE_IND_LEN);
       localXrfPteIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfPteIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshXrfPteInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfPteInd() {	 
   		return (substring(getStringValue(),beginXrfPteInd,beginXrfPteInd + XRF_PTE_IND_LEN));
   	}
     int localXrfProductIndCounter = -1;
     public boolean isXrfProductIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfProductIndCounter != sharedCounter;
         localXrfProductIndCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_PRODUCT_IND_LEN = 3;
	/**
	 * 	serialize this XrfProductInd
	 */
   protected void serializeXrfProductInd(char[] xrfProductInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfProductInd,0,getStringValue(),beginXrfProductInd,XRF_PRODUCT_IND_LEN);
       localXrfProductIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfProductIndConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshXrfProductInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfProductInd() {	 
   		return (substring(getStringValue(),beginXrfProductInd,beginXrfProductInd + XRF_PRODUCT_IND_LEN));
   	}
     int localXrfFreelookIndCounter = -1;
     public boolean isXrfFreelookIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfFreelookIndCounter != sharedCounter;
         localXrfFreelookIndCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_FREELOOK_IND_LEN = 1;
	/**
	 * 	serialize this XrfFreelookInd
	 */
   protected void serializeXrfFreelookInd(char[] xrfFreelookInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfFreelookInd,0,getStringValue(),beginXrfFreelookInd,XRF_FREELOOK_IND_LEN);
       localXrfFreelookIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfFreelookIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshXrfFreelookInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfFreelookInd() {	 
   		return (substring(getStringValue(),beginXrfFreelookInd,beginXrfFreelookInd + XRF_FREELOOK_IND_LEN));
   	}
     int localXrfEbrIndCounter = -1;
     public boolean isXrfEbrIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfEbrIndCounter != sharedCounter;
         localXrfEbrIndCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_EBR_IND_LEN = 1;
	/**
	 * 	serialize this XrfEbrInd
	 */
   protected void serializeXrfEbrInd(char[] xrfEbrInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfEbrInd,0,getStringValue(),beginXrfEbrInd,XRF_EBR_IND_LEN);
       localXrfEbrIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfEbrIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshXrfEbrInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfEbrInd() {	 
   		return (substring(getStringValue(),beginXrfEbrInd,beginXrfEbrInd + XRF_EBR_IND_LEN));
   	}
     int localXrfLimSvcIndCounter = -1;
     public boolean isXrfLimSvcIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfLimSvcIndCounter != sharedCounter;
         localXrfLimSvcIndCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_LIM_SVC_IND_LEN = 1;
	/**
	 * 	serialize this XrfLimSvcInd
	 */
   protected void serializeXrfLimSvcInd(char[] xrfLimSvcInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfLimSvcInd,0,getStringValue(),beginXrfLimSvcInd,XRF_LIM_SVC_IND_LEN);
       localXrfLimSvcIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfLimSvcIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshXrfLimSvcInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfLimSvcInd() {	 
   		return (substring(getStringValue(),beginXrfLimSvcInd,beginXrfLimSvcInd + XRF_LIM_SVC_IND_LEN));
   	}
     int localXrfOptOutUbhTierCounter = -1;
     public boolean isXrfOptOutUbhTierModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfOptOutUbhTierCounter != sharedCounter;
         localXrfOptOutUbhTierCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_OPT_OUT_UBH_TIER_LEN = 1;
	/**
	 * 	serialize this XrfOptOutUbhTier
	 */
   protected void serializeXrfOptOutUbhTier(char[] xrfOptOutUbhTier) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfOptOutUbhTier,0,getStringValue(),beginXrfOptOutUbhTier,XRF_OPT_OUT_UBH_TIER_LEN);
       localXrfOptOutUbhTierCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfOptOutUbhTierConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshXrfOptOutUbhTier is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfOptOutUbhTier() {	 
   		return (substring(getStringValue(),beginXrfOptOutUbhTier,beginXrfOptOutUbhTier + XRF_OPT_OUT_UBH_TIER_LEN));
   	}
        int localXrfHraApIndLmtCounter = -1;
        public boolean isXrfHraApIndLmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localXrfHraApIndLmtCounter != sharedCounter;
           localXrfHraApIndLmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean xrfHraApIndLmtIsNumeric() {
	      return decimalIsNumeric(beginXrfHraApIndLmt,XRF_HRA_AP_IND_LMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int XRF_HRA_AP_IND_LMT_LEN = 3;
  	/**
	 * 	serializeXrfHraApIndLmt
	 */
	protected void serializeXrfHraApIndLmt(int xrfHraApIndLmt) {
		   putDecimal(beginXrfHraApIndLmt,xrfHraApIndLmt,XRF_HRA_AP_IND_LMT_LEN,true);
   }
   

   protected int checkXrfHraApIndLmtMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_100K /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshXrfHraApIndLmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshXrfHraApIndLmt() throws CFException {	
   	try { 
		 return (getIntDecimal(beginXrfHraApIndLmt,XRF_HRA_AP_IND_LMT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("xrfHraApIndLmt", beginXrfHraApIndLmt,XRF_HRA_AP_IND_LMT_LEN);
     }
   	}
        int localXrfHraApFamLmtCounter = -1;
        public boolean isXrfHraApFamLmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localXrfHraApFamLmtCounter != sharedCounter;
           localXrfHraApFamLmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean xrfHraApFamLmtIsNumeric() {
	      return decimalIsNumeric(beginXrfHraApFamLmt,XRF_HRA_AP_FAM_LMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int XRF_HRA_AP_FAM_LMT_LEN = 3;
  	/**
	 * 	serializeXrfHraApFamLmt
	 */
	protected void serializeXrfHraApFamLmt(int xrfHraApFamLmt) {
		   putDecimal(beginXrfHraApFamLmt,xrfHraApFamLmt,XRF_HRA_AP_FAM_LMT_LEN,true);
   }
   

   protected int checkXrfHraApFamLmtMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_100K /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshXrfHraApFamLmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshXrfHraApFamLmt() throws CFException {	
   	try { 
		 return (getIntDecimal(beginXrfHraApFamLmt,XRF_HRA_AP_FAM_LMT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("xrfHraApFamLmt", beginXrfHraApFamLmt,XRF_HRA_AP_FAM_LMT_LEN);
     }
   	}
     int localXrfDefaultPocCounter = -1;
     public boolean isXrfDefaultPocModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfDefaultPocCounter != sharedCounter;
         localXrfDefaultPocCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of xrfDefaultPoc
	 *	@return xrfDefaultPoc
	 */
	public char[]  getXrfDefaultPocString() {
	     return getCharArray(beginXrfDefaultPoc,XRF_DEFAULT_POC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean xrfDefaultPocIsNumeric() {
	    return isNumeric(beginXrfDefaultPoc
	                    ,beginXrfDefaultPoc + XRF_DEFAULT_POC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int XRF_DEFAULT_POC_LEN = 2;
  	/**
	 * serializeXrfDefaultPoc
	 */
	protected void serializeXrfDefaultPoc(int xrfDefaultPoc) {
		 putNumber(beginXrfDefaultPoc,xrfDefaultPoc,XRF_DEFAULT_POC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localXrfDefaultPocCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeXrfDefaultPoc
	 */
   	protected  int serializeXrfDefaultPoc(char[] value) {
	    int  xrfDefaultPoc;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    xrfDefaultPoc = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginXrfDefaultPoc
		       ,2
		      );
		 localXrfDefaultPocCounter = shareString.getSerializedField().getModifiedCounter();
		return  xrfDefaultPoc;
    }

   protected int checkXrfDefaultPocMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshXrfDefaultPoc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshXrfDefaultPoc() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginXrfDefaultPoc
			                 ,XRF_DEFAULT_POC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("xrfDefaultPoc", beginXrfDefaultPoc,XRF_DEFAULT_POC_LEN);
    }
   	}
     int localXrfPcntRateJqCodesFoundCounter = -1;
     public boolean isXrfPcntRateJqCodesFoundModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfPcntRateJqCodesFoundCounter != sharedCounter;
         localXrfPcntRateJqCodesFoundCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of xrfPcntRateJqCodesFound
	 *	@return xrfPcntRateJqCodesFound
	 */
	public char[]  getXrfPcntRateJqCodesFoundString() {
	     return getCharArray(beginXrfPcntRateJqCodesFound,XRF_PCNT_RATE_JQ_CODES_FOUND_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean xrfPcntRateJqCodesFoundIsNumeric() {
	    return isNumeric(beginXrfPcntRateJqCodesFound
	                    ,beginXrfPcntRateJqCodesFound + XRF_PCNT_RATE_JQ_CODES_FOUND_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int XRF_PCNT_RATE_JQ_CODES_FOUND_LEN = 3;
  	/**
	 * serializeXrfPcntRateJqCodesFound
	 */
	protected void serializeXrfPcntRateJqCodesFound(int xrfPcntRateJqCodesFound) {
		 putNumber(beginXrfPcntRateJqCodesFound,xrfPcntRateJqCodesFound,XRF_PCNT_RATE_JQ_CODES_FOUND_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localXrfPcntRateJqCodesFoundCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeXrfPcntRateJqCodesFound
	 */
   	protected  int serializeXrfPcntRateJqCodesFound(char[] value) {
	    int  xrfPcntRateJqCodesFound;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    xrfPcntRateJqCodesFound = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginXrfPcntRateJqCodesFound
		       ,3
		      );
		 localXrfPcntRateJqCodesFoundCounter = shareString.getSerializedField().getModifiedCounter();
		return  xrfPcntRateJqCodesFound;
    }

   protected int checkXrfPcntRateJqCodesFoundMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshXrfPcntRateJqCodesFound is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshXrfPcntRateJqCodesFound() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginXrfPcntRateJqCodesFound
			                 ,XRF_PCNT_RATE_JQ_CODES_FOUND_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("xrfPcntRateJqCodesFound", beginXrfPcntRateJqCodesFound,XRF_PCNT_RATE_JQ_CODES_FOUND_LEN);
    }
   	}
     int localXrfAppealLangIndCounter = -1;
     public boolean isXrfAppealLangIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfAppealLangIndCounter != sharedCounter;
         localXrfAppealLangIndCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_APPEAL_LANG_IND_LEN = 1;
	/**
	 * 	serialize this XrfAppealLangInd
	 */
   protected void serializeXrfAppealLangInd(char[] xrfAppealLangInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfAppealLangInd,0,getStringValue(),beginXrfAppealLangInd,XRF_APPEAL_LANG_IND_LEN);
       localXrfAppealLangIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfAppealLangIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshXrfAppealLangInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfAppealLangInd() {	 
   		return (substring(getStringValue(),beginXrfAppealLangInd,beginXrfAppealLangInd + XRF_APPEAL_LANG_IND_LEN));
   	}
     int localXrfProrateIntrvlCounter = -1;
     public boolean isXrfProrateIntrvlModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfProrateIntrvlCounter != sharedCounter;
         localXrfProrateIntrvlCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_PRORATE_INTRVL_LEN = 1;
	/**
	 * 	serialize this XrfProrateIntrvl
	 */
   protected void serializeXrfProrateIntrvl(char[] xrfProrateIntrvl) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfProrateIntrvl,0,getStringValue(),beginXrfProrateIntrvl,XRF_PRORATE_INTRVL_LEN);
       localXrfProrateIntrvlCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfProrateIntrvlConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshXrfProrateIntrvl is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfProrateIntrvl() {	 
   		return (substring(getStringValue(),beginXrfProrateIntrvl,beginXrfProrateIntrvl + XRF_PRORATE_INTRVL_LEN));
   	}
     int localXrfNbSuppressIndCounter = -1;
     public boolean isXrfNbSuppressIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfNbSuppressIndCounter != sharedCounter;
         localXrfNbSuppressIndCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_NB_SUPPRESS_IND_LEN = 1;
	/**
	 * 	serialize this XrfNbSuppressInd
	 */
   protected void serializeXrfNbSuppressInd(char[] xrfNbSuppressInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfNbSuppressInd,0,getStringValue(),beginXrfNbSuppressInd,XRF_NB_SUPPRESS_IND_LEN);
       localXrfNbSuppressIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfNbSuppressIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshXrfNbSuppressInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfNbSuppressInd() {	 
   		return (substring(getStringValue(),beginXrfNbSuppressInd,beginXrfNbSuppressInd + XRF_NB_SUPPRESS_IND_LEN));
   	}
     int localXrfProrateEventCounter = -1;
     public boolean isXrfProrateEventModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfProrateEventCounter != sharedCounter;
         localXrfProrateEventCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_PRORATE_EVENT_LEN = 1;
	/**
	 * 	serialize this XrfProrateEvent
	 */
   protected void serializeXrfProrateEvent(char[] xrfProrateEvent) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfProrateEvent,0,getStringValue(),beginXrfProrateEvent,XRF_PRORATE_EVENT_LEN);
       localXrfProrateEventCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfProrateEventConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshXrfProrateEvent is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfProrateEvent() {	 
   		return (substring(getStringValue(),beginXrfProrateEvent,beginXrfProrateEvent + XRF_PRORATE_EVENT_LEN));
   	}
     int localXrfCoreMedPrrAuthCdCounter = -1;
     public boolean isXrfCoreMedPrrAuthCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfCoreMedPrrAuthCdCounter != sharedCounter;
         localXrfCoreMedPrrAuthCdCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_CORE_MED_PRR_AUTH_CD_LEN = 1;
	/**
	 * 	serialize this XrfCoreMedPrrAuthCd
	 */
   protected void serializeXrfCoreMedPrrAuthCd(char[] xrfCoreMedPrrAuthCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfCoreMedPrrAuthCd,0,getStringValue(),beginXrfCoreMedPrrAuthCd,XRF_CORE_MED_PRR_AUTH_CD_LEN);
       localXrfCoreMedPrrAuthCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfCoreMedPrrAuthCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshXrfCoreMedPrrAuthCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfCoreMedPrrAuthCd() {	 
   		return (substring(getStringValue(),beginXrfCoreMedPrrAuthCd,beginXrfCoreMedPrrAuthCd + XRF_CORE_MED_PRR_AUTH_CD_LEN));
   	}
     int localXrfEnrpErIndCounter = -1;
     public boolean isXrfEnrpErIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfEnrpErIndCounter != sharedCounter;
         localXrfEnrpErIndCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_ENRP_ER_IND_LEN = 1;
	/**
	 * 	serialize this XrfEnrpErInd
	 */
   protected void serializeXrfEnrpErInd(char[] xrfEnrpErInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfEnrpErInd,0,getStringValue(),beginXrfEnrpErInd,XRF_ENRP_ER_IND_LEN);
       localXrfEnrpErIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfEnrpErIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshXrfEnrpErInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfEnrpErInd() {	 
   		return (substring(getStringValue(),beginXrfEnrpErInd,beginXrfEnrpErInd + XRF_ENRP_ER_IND_LEN));
   	}
     int localXrfEnrpNonErIndCounter = -1;
     public boolean isXrfEnrpNonErIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfEnrpNonErIndCounter != sharedCounter;
         localXrfEnrpNonErIndCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_ENRP_NON_ER_IND_LEN = 1;
	/**
	 * 	serialize this XrfEnrpNonErInd
	 */
   protected void serializeXrfEnrpNonErInd(char[] xrfEnrpNonErInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfEnrpNonErInd,0,getStringValue(),beginXrfEnrpNonErInd,XRF_ENRP_NON_ER_IND_LEN);
       localXrfEnrpNonErIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfEnrpNonErIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshXrfEnrpNonErInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfEnrpNonErInd() {	 
   		return (substring(getStringValue(),beginXrfEnrpNonErInd,beginXrfEnrpNonErInd + XRF_ENRP_NON_ER_IND_LEN));
   	}
     int localXrfEnrpNonErPctCounter = -1;
     public boolean isXrfEnrpNonErPctModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfEnrpNonErPctCounter != sharedCounter;
         localXrfEnrpNonErPctCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of xrfEnrpNonErPct
	 *	@return xrfEnrpNonErPct
	 */
	public char[]  getXrfEnrpNonErPctString() {
	     return getCharArray(beginXrfEnrpNonErPct,XRF_ENRP_NON_ER_PCT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean xrfEnrpNonErPctIsNumeric() {
	    return isNumeric(beginXrfEnrpNonErPct
	                    ,beginXrfEnrpNonErPct + XRF_ENRP_NON_ER_PCT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int XRF_ENRP_NON_ER_PCT_LEN = 3;
  	/**
	 * serializeXrfEnrpNonErPct
	 */
	protected void serializeXrfEnrpNonErPct(int xrfEnrpNonErPct) {
		 putNumber(beginXrfEnrpNonErPct,xrfEnrpNonErPct,XRF_ENRP_NON_ER_PCT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localXrfEnrpNonErPctCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeXrfEnrpNonErPct
	 */
   	protected  int serializeXrfEnrpNonErPct(char[] value) {
	    int  xrfEnrpNonErPct;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    xrfEnrpNonErPct = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginXrfEnrpNonErPct
		       ,3
		      );
		 localXrfEnrpNonErPctCounter = shareString.getSerializedField().getModifiedCounter();
		return  xrfEnrpNonErPct;
    }

   protected int checkXrfEnrpNonErPctMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshXrfEnrpNonErPct is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshXrfEnrpNonErPct() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginXrfEnrpNonErPct
			                 ,XRF_ENRP_NON_ER_PCT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("xrfEnrpNonErPct", beginXrfEnrpNonErPct,XRF_ENRP_NON_ER_PCT_LEN);
    }
   	}
     int localXrfEhbIndCounter = -1;
     public boolean isXrfEhbIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfEhbIndCounter != sharedCounter;
         localXrfEhbIndCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_EHB_IND_LEN = 1;
	/**
	 * 	serialize this XrfEhbInd
	 */
   protected void serializeXrfEhbInd(char[] xrfEhbInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfEhbInd,0,getStringValue(),beginXrfEhbInd,XRF_EHB_IND_LEN);
       localXrfEhbIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfEhbIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshXrfEhbInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfEhbInd() {	 
   		return (substring(getStringValue(),beginXrfEhbInd,beginXrfEhbInd + XRF_EHB_IND_LEN));
   	}
     int localFiller01Counter = -1;
     public boolean isFiller01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller01Counter != sharedCounter;
         localFiller01Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_01_LEN = 1;
	/**
	 * 	serialize this Filler01
	 */
   protected void serializeFiller01(char[] filler01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(filler01,0,getStringValue(),beginFiller01,FILLER_01_LEN);
       localFiller01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFiller01Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFiller01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFiller01() {	 
   		return (substring(getStringValue(),beginFiller01,beginFiller01 + FILLER_01_LEN));
   	}




}
  
