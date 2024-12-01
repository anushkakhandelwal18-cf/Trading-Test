package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class Dt1ClmClaimItemSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Dt1ClmClaimItemSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Dt1ClmClaimItemSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_1_CLM_CLAIM_ITEM_LENGTH = 414;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDt1ClmFilmOffice;
            protected  int beginDt1ClmFln;
            protected  int beginDt1ClmIcn;
            protected  int beginDt1ClmSuffixCd;
            protected  int beginDt1ClmProcDt;
            protected  int beginDt1ClmProcTm;
            protected  int beginDt1ClmFlnFormatDt;
            protected  int beginDt1ClmHeaderCt;
            protected  int beginDt1ClmDraftNo;
            protected  int beginDt1ClmFirstServiceDate;
            protected  int beginDt1ClmLastServiceDate;
            protected  int beginDt1ClmProviderName;
            protected  int beginDt1ClmChargeAmount;
            protected  int beginDt1ClmPaidAmount;
            protected  int beginDt1ClmDeductibleAmount;
            protected  int beginDt1ClmClmLevelRc;
            protected  int beginDt1ClmAdjNbr;
            protected  int beginDt1ClmAdjInd;
            protected  int beginDt1ClmPpoInd;
            protected  int beginDt1ClmClmPhiInd;
            protected  int beginDt1ClmT1ProcessInd;
            protected  int beginDt1ClmDlgteInd;
            protected  int beginDt1ClmAuthNbr;
            protected  int beginDt1ClmAuthSrcId;
            protected  int beginDt1ClmAuthProcCd;
            protected  int beginDt1ClmAuthClmLevelInd;
            protected  int beginDt1ClmAuthUniqueCnt;
            protected  int beginDt1ClmPrimaryDiagnosis;
            protected  int beginDt1ClmParsWaivInd;
            protected  int beginDt1ClmParInd;
            protected  int beginDt1ClmNonParInd;
            protected  int beginDt1ClmProviderTier;
            protected  int beginDt1ClmTpsmCd;
            protected  int beginDt1ClmMskInd;
            protected  int beginDt1ClmPtntRespAmt;
            protected  int beginDt1ClmProvSpclCd;
            protected  int beginDt1ClmNdbContrId;
            protected  int beginDt1ClmDrgNbr;
            protected  int beginDt1ClmProvMedcdReclmInd;
            protected  int beginDt1ClmHospProfInd;
            protected  int beginDt1ClmSmbAppCd;
            protected  int beginDt1ClmSmbStCd;
            protected  int beginDt1ClmItemFillerArea;
	
	/**
	* Constructor for Dt1ClmClaimItemSerialized
	**/
    public Dt1ClmClaimItemSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Dt1ClmClaimItemSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dt1ClmClaimItemSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Dt1ClmClaimItemSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,16); // serialize this field at offset 16 by default 
    }
    
	/**
	* sets parent for this Dt1ClmClaimItemSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 16 by default
    }    
	/**
	* initializes the field in Dt1ClmClaimItemSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_1_CLM_CLAIM_ITEM_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDt1ClmFilmOffice = getStartOffset() + 0;	// set offset for serialization
  
             beginDt1ClmFln = getStartOffset() + 3;	// set offset for serialization
  
             beginDt1ClmIcn = getStartOffset() + 13;	// set offset for serialization
  
             beginDt1ClmSuffixCd = getStartOffset() + 23;	// set offset for serialization
  
             beginDt1ClmProcDt = getStartOffset() + 25;	// set offset for serialization
  
             beginDt1ClmProcTm = getStartOffset() + 35;	// set offset for serialization
  
             beginDt1ClmFlnFormatDt = getStartOffset() + 43;	// set offset for serialization
  
             beginDt1ClmHeaderCt = getStartOffset() + 53;	// set offset for serialization
  
             beginDt1ClmDraftNo = getStartOffset() + 57;	// set offset for serialization
  
             beginDt1ClmFirstServiceDate = getStartOffset() + 67;	// set offset for serialization
  
             beginDt1ClmLastServiceDate = getStartOffset() + 75;	// set offset for serialization
  
             beginDt1ClmProviderName = getStartOffset() + 83;	// set offset for serialization
  
  
             beginDt1ClmChargeAmount = getStartOffset() + 138;	// set offset for serialization
  
             beginDt1ClmPaidAmount = getStartOffset() + 148;	// set offset for serialization
  
             beginDt1ClmDeductibleAmount = getStartOffset() + 158;	// set offset for serialization
  
  
             beginDt1ClmClmLevelRc = getStartOffset() + 173;	// set offset for serialization
  
             beginDt1ClmAdjNbr = getStartOffset() + 175;	// set offset for serialization
  
             beginDt1ClmAdjInd = getStartOffset() + 184;	// set offset for serialization
  
             beginDt1ClmPpoInd = getStartOffset() + 185;	// set offset for serialization
  
             beginDt1ClmClmPhiInd = getStartOffset() + 186;	// set offset for serialization
  
             beginDt1ClmT1ProcessInd = getStartOffset() + 187;	// set offset for serialization
  
             beginDt1ClmDlgteInd = getStartOffset() + 188;	// set offset for serialization
  
             beginDt1ClmAuthNbr = getStartOffset() + 190;	// set offset for serialization
  
             beginDt1ClmAuthSrcId = getStartOffset() + 240;	// set offset for serialization
  
             beginDt1ClmAuthProcCd = getStartOffset() + 243;	// set offset for serialization
  
             beginDt1ClmAuthClmLevelInd = getStartOffset() + 248;	// set offset for serialization
  
             beginDt1ClmAuthUniqueCnt = getStartOffset() + 249;	// set offset for serialization
  
             beginDt1ClmPrimaryDiagnosis = getStartOffset() + 250;	// set offset for serialization
  
             beginDt1ClmParsWaivInd = getStartOffset() + 257;	// set offset for serialization
  
             beginDt1ClmParInd = getStartOffset() + 258;	// set offset for serialization
  
             beginDt1ClmNonParInd = getStartOffset() + 259;	// set offset for serialization
  
             beginDt1ClmProviderTier = getStartOffset() + 260;	// set offset for serialization
  
             beginDt1ClmTpsmCd = getStartOffset() + 261;	// set offset for serialization
  
             beginDt1ClmMskInd = getStartOffset() + 264;	// set offset for serialization
  
             beginDt1ClmPtntRespAmt = getStartOffset() + 265;	// set offset for serialization
  
             beginDt1ClmProvSpclCd = getStartOffset() + 275;	// set offset for serialization
  
             beginDt1ClmNdbContrId = getStartOffset() + 278;	// set offset for serialization
  
             beginDt1ClmDrgNbr = getStartOffset() + 287;	// set offset for serialization
  
             beginDt1ClmProvMedcdReclmInd = getStartOffset() + 292;	// set offset for serialization
  
             beginDt1ClmHospProfInd = getStartOffset() + 293;	// set offset for serialization
  
             beginDt1ClmSmbAppCd = getStartOffset() + 294;	// set offset for serialization
  
             beginDt1ClmSmbStCd = getStartOffset() + 295;	// set offset for serialization
  
             beginDt1ClmItemFillerArea = getStartOffset() + 297;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDt1ClmFilmOfficeCounter = -1;
     public boolean isDt1ClmFilmOfficeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmFilmOfficeCounter != sharedCounter;
         localDt1ClmFilmOfficeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dt1ClmFilmOffice
	 *	@return dt1ClmFilmOffice
	 */
	public char[]  getDt1ClmFilmOfficeString() {
	     return getCharArray(beginDt1ClmFilmOffice,DT_1_CLM_FILM_OFFICE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dt1ClmFilmOfficeIsNumeric() {
	    return isNumeric(beginDt1ClmFilmOffice
	                    ,beginDt1ClmFilmOffice + DT_1_CLM_FILM_OFFICE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DT_1_CLM_FILM_OFFICE_LEN = 3;
  	/**
	 * serializeDt1ClmFilmOffice
	 */
	protected void serializeDt1ClmFilmOffice(int dt1ClmFilmOffice) {
		 putNumber(beginDt1ClmFilmOffice,dt1ClmFilmOffice,DT_1_CLM_FILM_OFFICE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDt1ClmFilmOfficeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDt1ClmFilmOffice
	 */
   	protected  int serializeDt1ClmFilmOffice(char[] value) {
	    int  dt1ClmFilmOffice;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dt1ClmFilmOffice = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginDt1ClmFilmOffice
		       ,3
		      );
		 localDt1ClmFilmOfficeCounter = shareString.getSerializedField().getModifiedCounter();
		return  dt1ClmFilmOffice;
    }

   protected int checkDt1ClmFilmOfficeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDt1ClmFilmOffice is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDt1ClmFilmOffice() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDt1ClmFilmOffice
			                 ,DT_1_CLM_FILM_OFFICE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dt1ClmFilmOffice", beginDt1ClmFilmOffice,DT_1_CLM_FILM_OFFICE_LEN);
    }
   	}
     int localDt1ClmFlnCounter = -1;
     public boolean isDt1ClmFlnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmFlnCounter != sharedCounter;
         localDt1ClmFlnCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dt1ClmFln
	 *	@return dt1ClmFln
	 */
	public char[]  getDt1ClmFlnString() {
	     return getCharArray(beginDt1ClmFln,DT_1_CLM_FLN_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dt1ClmFlnIsNumeric() {
	    return isNumeric(beginDt1ClmFln
	                    ,beginDt1ClmFln + DT_1_CLM_FLN_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DT_1_CLM_FLN_LEN = 10;
  	/**
	 * serializeDt1ClmFln
	 */
	protected void serializeDt1ClmFln(long dt1ClmFln) {
		 putNumber(beginDt1ClmFln,dt1ClmFln,DT_1_CLM_FLN_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDt1ClmFlnCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDt1ClmFln
	 */
   	protected  long serializeDt1ClmFln(char[] value) {
	    long  dt1ClmFln;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dt1ClmFln = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginDt1ClmFln
		       ,10
		      );
		 localDt1ClmFlnCounter = shareString.getSerializedField().getModifiedCounter();
		return  dt1ClmFln;
    }

   protected long checkDt1ClmFlnMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDt1ClmFln is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDt1ClmFln() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginDt1ClmFln
			                 ,DT_1_CLM_FLN_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dt1ClmFln", beginDt1ClmFln,DT_1_CLM_FLN_LEN);
    }
   	}
     int localDt1ClmIcnCounter = -1;
     public boolean isDt1ClmIcnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmIcnCounter != sharedCounter;
         localDt1ClmIcnCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_CLM_ICN_LEN = 10;
	/**
	 * 	serialize this Dt1ClmIcn
	 */
   protected void serializeDt1ClmIcn(char[] dt1ClmIcn) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ClmIcn,0,getStringValue(),beginDt1ClmIcn,DT_1_CLM_ICN_LEN);
       localDt1ClmIcnCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ClmIcnConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshDt1ClmIcn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ClmIcn() {	 
   		return (substring(getStringValue(),beginDt1ClmIcn,beginDt1ClmIcn + DT_1_CLM_ICN_LEN));
   	}
     int localDt1ClmSuffixCdCounter = -1;
     public boolean isDt1ClmSuffixCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmSuffixCdCounter != sharedCounter;
         localDt1ClmSuffixCdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dt1ClmSuffixCd
	 *	@return dt1ClmSuffixCd
	 */
	public char[]  getDt1ClmSuffixCdString() {
	     return getCharArray(beginDt1ClmSuffixCd,DT_1_CLM_SUFFIX_CD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dt1ClmSuffixCdIsNumeric() {
	    return isNumeric(beginDt1ClmSuffixCd
	                    ,beginDt1ClmSuffixCd + DT_1_CLM_SUFFIX_CD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DT_1_CLM_SUFFIX_CD_LEN = 2;
  	/**
	 * serializeDt1ClmSuffixCd
	 */
	protected void serializeDt1ClmSuffixCd(int dt1ClmSuffixCd) {
		 putNumber(beginDt1ClmSuffixCd,dt1ClmSuffixCd,DT_1_CLM_SUFFIX_CD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDt1ClmSuffixCdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDt1ClmSuffixCd
	 */
   	protected  int serializeDt1ClmSuffixCd(char[] value) {
	    int  dt1ClmSuffixCd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dt1ClmSuffixCd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginDt1ClmSuffixCd
		       ,2
		      );
		 localDt1ClmSuffixCdCounter = shareString.getSerializedField().getModifiedCounter();
		return  dt1ClmSuffixCd;
    }

   protected int checkDt1ClmSuffixCdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDt1ClmSuffixCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDt1ClmSuffixCd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDt1ClmSuffixCd
			                 ,DT_1_CLM_SUFFIX_CD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dt1ClmSuffixCd", beginDt1ClmSuffixCd,DT_1_CLM_SUFFIX_CD_LEN);
    }
   	}
     int localDt1ClmProcDtCounter = -1;
     public boolean isDt1ClmProcDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmProcDtCounter != sharedCounter;
         localDt1ClmProcDtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_CLM_PROC_DT_LEN = 10;
	/**
	 * 	serialize this Dt1ClmProcDt
	 */
   protected void serializeDt1ClmProcDt(char[] dt1ClmProcDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ClmProcDt,0,getStringValue(),beginDt1ClmProcDt,DT_1_CLM_PROC_DT_LEN);
       localDt1ClmProcDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ClmProcDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshDt1ClmProcDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ClmProcDt() {	 
   		return (substring(getStringValue(),beginDt1ClmProcDt,beginDt1ClmProcDt + DT_1_CLM_PROC_DT_LEN));
   	}
     int localDt1ClmProcTmCounter = -1;
     public boolean isDt1ClmProcTmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmProcTmCounter != sharedCounter;
         localDt1ClmProcTmCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_CLM_PROC_TM_LEN = 8;
	/**
	 * 	serialize this Dt1ClmProcTm
	 */
   protected void serializeDt1ClmProcTm(char[] dt1ClmProcTm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ClmProcTm,0,getStringValue(),beginDt1ClmProcTm,DT_1_CLM_PROC_TM_LEN);
       localDt1ClmProcTmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ClmProcTmConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshDt1ClmProcTm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ClmProcTm() {	 
   		return (substring(getStringValue(),beginDt1ClmProcTm,beginDt1ClmProcTm + DT_1_CLM_PROC_TM_LEN));
   	}
     int localDt1ClmFlnFormatDtCounter = -1;
     public boolean isDt1ClmFlnFormatDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmFlnFormatDtCounter != sharedCounter;
         localDt1ClmFlnFormatDtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_CLM_FLN_FORMAT_DT_LEN = 10;
	/**
	 * 	serialize this Dt1ClmFlnFormatDt
	 */
   protected void serializeDt1ClmFlnFormatDt(char[] dt1ClmFlnFormatDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ClmFlnFormatDt,0,getStringValue(),beginDt1ClmFlnFormatDt,DT_1_CLM_FLN_FORMAT_DT_LEN);
       localDt1ClmFlnFormatDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ClmFlnFormatDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshDt1ClmFlnFormatDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ClmFlnFormatDt() {	 
   		return (substring(getStringValue(),beginDt1ClmFlnFormatDt,beginDt1ClmFlnFormatDt + DT_1_CLM_FLN_FORMAT_DT_LEN));
   	}
     int localDt1ClmHeaderCtCounter = -1;
     public boolean isDt1ClmHeaderCtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmHeaderCtCounter != sharedCounter;
         localDt1ClmHeaderCtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dt1ClmHeaderCt
	 *	@return dt1ClmHeaderCt
	 */
	public char[]  getDt1ClmHeaderCtString() {
	     return getCharArray(beginDt1ClmHeaderCt,DT_1_CLM_HEADER_CT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dt1ClmHeaderCtIsNumeric() {
	    return isNumeric(beginDt1ClmHeaderCt
	                    ,beginDt1ClmHeaderCt + DT_1_CLM_HEADER_CT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DT_1_CLM_HEADER_CT_LEN = 4;
  	/**
	 * serializeDt1ClmHeaderCt
	 */
	protected void serializeDt1ClmHeaderCt(int dt1ClmHeaderCt) {
		 putNumber(beginDt1ClmHeaderCt,dt1ClmHeaderCt,DT_1_CLM_HEADER_CT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDt1ClmHeaderCtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDt1ClmHeaderCt
	 */
   	protected  int serializeDt1ClmHeaderCt(char[] value) {
	    int  dt1ClmHeaderCt;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dt1ClmHeaderCt = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginDt1ClmHeaderCt
		       ,4
		      );
		 localDt1ClmHeaderCtCounter = shareString.getSerializedField().getModifiedCounter();
		return  dt1ClmHeaderCt;
    }

   protected int checkDt1ClmHeaderCtMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDt1ClmHeaderCt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDt1ClmHeaderCt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDt1ClmHeaderCt
			                 ,DT_1_CLM_HEADER_CT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dt1ClmHeaderCt", beginDt1ClmHeaderCt,DT_1_CLM_HEADER_CT_LEN);
    }
   	}
     int localDt1ClmDraftNoCounter = -1;
     public boolean isDt1ClmDraftNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmDraftNoCounter != sharedCounter;
         localDt1ClmDraftNoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dt1ClmDraftNo
	 *	@return dt1ClmDraftNo
	 */
	public char[]  getDt1ClmDraftNoString() {
	     return getCharArray(beginDt1ClmDraftNo,DT_1_CLM_DRAFT_NO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dt1ClmDraftNoIsNumeric() {
	    return isNumeric(beginDt1ClmDraftNo
	                    ,beginDt1ClmDraftNo + DT_1_CLM_DRAFT_NO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DT_1_CLM_DRAFT_NO_LEN = 10;
  	/**
	 * serializeDt1ClmDraftNo
	 */
	protected void serializeDt1ClmDraftNo(long dt1ClmDraftNo) {
		 putNumber(beginDt1ClmDraftNo,dt1ClmDraftNo,DT_1_CLM_DRAFT_NO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDt1ClmDraftNoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDt1ClmDraftNo
	 */
   	protected  long serializeDt1ClmDraftNo(char[] value) {
	    long  dt1ClmDraftNo;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dt1ClmDraftNo = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginDt1ClmDraftNo
		       ,10
		      );
		 localDt1ClmDraftNoCounter = shareString.getSerializedField().getModifiedCounter();
		return  dt1ClmDraftNo;
    }

   protected long checkDt1ClmDraftNoMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDt1ClmDraftNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDt1ClmDraftNo() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginDt1ClmDraftNo
			                 ,DT_1_CLM_DRAFT_NO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dt1ClmDraftNo", beginDt1ClmDraftNo,DT_1_CLM_DRAFT_NO_LEN);
    }
   	}
     int localDt1ClmFirstServiceDateCounter = -1;
     public boolean isDt1ClmFirstServiceDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmFirstServiceDateCounter != sharedCounter;
         localDt1ClmFirstServiceDateCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dt1ClmFirstServiceDate
	 *	@return dt1ClmFirstServiceDate
	 */
	public char[]  getDt1ClmFirstServiceDateString() {
	     return getCharArray(beginDt1ClmFirstServiceDate,DT_1_CLM_FIRST_SERVICE_DATE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dt1ClmFirstServiceDateIsNumeric() {
	    return isNumeric(beginDt1ClmFirstServiceDate
	                    ,beginDt1ClmFirstServiceDate + DT_1_CLM_FIRST_SERVICE_DATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DT_1_CLM_FIRST_SERVICE_DATE_LEN = 8;
  	/**
	 * serializeDt1ClmFirstServiceDate
	 */
	protected void serializeDt1ClmFirstServiceDate(long dt1ClmFirstServiceDate) {
		 putNumber(beginDt1ClmFirstServiceDate,dt1ClmFirstServiceDate,DT_1_CLM_FIRST_SERVICE_DATE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDt1ClmFirstServiceDateCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDt1ClmFirstServiceDate
	 */
   	protected  long serializeDt1ClmFirstServiceDate(char[] value) {
	    long  dt1ClmFirstServiceDate;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dt1ClmFirstServiceDate = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginDt1ClmFirstServiceDate
		       ,8
		      );
		 localDt1ClmFirstServiceDateCounter = shareString.getSerializedField().getModifiedCounter();
		return  dt1ClmFirstServiceDate;
    }

   protected long checkDt1ClmFirstServiceDateMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDt1ClmFirstServiceDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDt1ClmFirstServiceDate() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginDt1ClmFirstServiceDate
			                 ,DT_1_CLM_FIRST_SERVICE_DATE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dt1ClmFirstServiceDate", beginDt1ClmFirstServiceDate,DT_1_CLM_FIRST_SERVICE_DATE_LEN);
    }
   	}
     int localDt1ClmLastServiceDateCounter = -1;
     public boolean isDt1ClmLastServiceDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmLastServiceDateCounter != sharedCounter;
         localDt1ClmLastServiceDateCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dt1ClmLastServiceDate
	 *	@return dt1ClmLastServiceDate
	 */
	public char[]  getDt1ClmLastServiceDateString() {
	     return getCharArray(beginDt1ClmLastServiceDate,DT_1_CLM_LAST_SERVICE_DATE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dt1ClmLastServiceDateIsNumeric() {
	    return isNumeric(beginDt1ClmLastServiceDate
	                    ,beginDt1ClmLastServiceDate + DT_1_CLM_LAST_SERVICE_DATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DT_1_CLM_LAST_SERVICE_DATE_LEN = 8;
  	/**
	 * serializeDt1ClmLastServiceDate
	 */
	protected void serializeDt1ClmLastServiceDate(long dt1ClmLastServiceDate) {
		 putNumber(beginDt1ClmLastServiceDate,dt1ClmLastServiceDate,DT_1_CLM_LAST_SERVICE_DATE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDt1ClmLastServiceDateCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDt1ClmLastServiceDate
	 */
   	protected  long serializeDt1ClmLastServiceDate(char[] value) {
	    long  dt1ClmLastServiceDate;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dt1ClmLastServiceDate = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginDt1ClmLastServiceDate
		       ,8
		      );
		 localDt1ClmLastServiceDateCounter = shareString.getSerializedField().getModifiedCounter();
		return  dt1ClmLastServiceDate;
    }

   protected long checkDt1ClmLastServiceDateMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDt1ClmLastServiceDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDt1ClmLastServiceDate() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginDt1ClmLastServiceDate
			                 ,DT_1_CLM_LAST_SERVICE_DATE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dt1ClmLastServiceDate", beginDt1ClmLastServiceDate,DT_1_CLM_LAST_SERVICE_DATE_LEN);
    }
   	}
     int localDt1ClmProviderNameCounter = -1;
     public boolean isDt1ClmProviderNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmProviderNameCounter != sharedCounter;
         localDt1ClmProviderNameCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_CLM_PROVIDER_NAME_LEN = 40;
	/**
	 * 	serialize this Dt1ClmProviderName
	 */
   protected void serializeDt1ClmProviderName(char[] dt1ClmProviderName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ClmProviderName,0,getStringValue(),beginDt1ClmProviderName,DT_1_CLM_PROVIDER_NAME_LEN);
       localDt1ClmProviderNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ClmProviderNameConstraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshDt1ClmProviderName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ClmProviderName() {	 
   		return (substring(getStringValue(),beginDt1ClmProviderName,beginDt1ClmProviderName + DT_1_CLM_PROVIDER_NAME_LEN));
   	}
     int localDt1ClmChargeAmountCounter = -1;
     public boolean isDt1ClmChargeAmountModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmChargeAmountCounter != sharedCounter;
         localDt1ClmChargeAmountCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_CLM_CHARGE_AMOUNT_LEN = 10;
	/**
	 * 	serialize this Dt1ClmChargeAmount
	 */
   protected void serializeDt1ClmChargeAmount(char[] dt1ClmChargeAmount) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ClmChargeAmount,0,getStringValue(),beginDt1ClmChargeAmount,DT_1_CLM_CHARGE_AMOUNT_LEN);
       localDt1ClmChargeAmountCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ClmChargeAmountConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshDt1ClmChargeAmount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ClmChargeAmount() {	 
   		return (substring(getStringValue(),beginDt1ClmChargeAmount,beginDt1ClmChargeAmount + DT_1_CLM_CHARGE_AMOUNT_LEN));
   	}
     int localDt1ClmPaidAmountCounter = -1;
     public boolean isDt1ClmPaidAmountModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmPaidAmountCounter != sharedCounter;
         localDt1ClmPaidAmountCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_CLM_PAID_AMOUNT_LEN = 10;
	/**
	 * 	serialize this Dt1ClmPaidAmount
	 */
   protected void serializeDt1ClmPaidAmount(char[] dt1ClmPaidAmount) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ClmPaidAmount,0,getStringValue(),beginDt1ClmPaidAmount,DT_1_CLM_PAID_AMOUNT_LEN);
       localDt1ClmPaidAmountCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ClmPaidAmountConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshDt1ClmPaidAmount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ClmPaidAmount() {	 
   		return (substring(getStringValue(),beginDt1ClmPaidAmount,beginDt1ClmPaidAmount + DT_1_CLM_PAID_AMOUNT_LEN));
   	}
     int localDt1ClmDeductibleAmountCounter = -1;
     public boolean isDt1ClmDeductibleAmountModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmDeductibleAmountCounter != sharedCounter;
         localDt1ClmDeductibleAmountCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_CLM_DEDUCTIBLE_AMOUNT_LEN = 10;
	/**
	 * 	serialize this Dt1ClmDeductibleAmount
	 */
   protected void serializeDt1ClmDeductibleAmount(char[] dt1ClmDeductibleAmount) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ClmDeductibleAmount,0,getStringValue(),beginDt1ClmDeductibleAmount,DT_1_CLM_DEDUCTIBLE_AMOUNT_LEN);
       localDt1ClmDeductibleAmountCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ClmDeductibleAmountConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshDt1ClmDeductibleAmount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ClmDeductibleAmount() {	 
   		return (substring(getStringValue(),beginDt1ClmDeductibleAmount,beginDt1ClmDeductibleAmount + DT_1_CLM_DEDUCTIBLE_AMOUNT_LEN));
   	}
     int localDt1ClmClmLevelRcCounter = -1;
     public boolean isDt1ClmClmLevelRcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmClmLevelRcCounter != sharedCounter;
         localDt1ClmClmLevelRcCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_CLM_CLM_LEVEL_RC_LEN = 2;
	/**
	 * 	serialize this Dt1ClmClmLevelRc
	 */
   protected void serializeDt1ClmClmLevelRc(char[] dt1ClmClmLevelRc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ClmClmLevelRc,0,getStringValue(),beginDt1ClmClmLevelRc,DT_1_CLM_CLM_LEVEL_RC_LEN);
       localDt1ClmClmLevelRcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ClmClmLevelRcConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDt1ClmClmLevelRc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ClmClmLevelRc() {	 
   		return (substring(getStringValue(),beginDt1ClmClmLevelRc,beginDt1ClmClmLevelRc + DT_1_CLM_CLM_LEVEL_RC_LEN));
   	}
     int localDt1ClmAdjNbrCounter = -1;
     public boolean isDt1ClmAdjNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmAdjNbrCounter != sharedCounter;
         localDt1ClmAdjNbrCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dt1ClmAdjNbr
	 *	@return dt1ClmAdjNbr
	 */
	public char[]  getDt1ClmAdjNbrString() {
	     return getCharArray(beginDt1ClmAdjNbr,DT_1_CLM_ADJ_NBR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dt1ClmAdjNbrIsNumeric() {
	    return isNumeric(beginDt1ClmAdjNbr
	                    ,beginDt1ClmAdjNbr + DT_1_CLM_ADJ_NBR_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DT_1_CLM_ADJ_NBR_LEN = 9;
  	/**
	 * serializeDt1ClmAdjNbr
	 */
	protected void serializeDt1ClmAdjNbr(int dt1ClmAdjNbr) {
		 putNumber(beginDt1ClmAdjNbr,dt1ClmAdjNbr,DT_1_CLM_ADJ_NBR_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDt1ClmAdjNbrCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDt1ClmAdjNbr
	 */
   	protected  int serializeDt1ClmAdjNbr(char[] value) {
	    int  dt1ClmAdjNbr;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dt1ClmAdjNbr = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginDt1ClmAdjNbr
		       ,9
		      );
		 localDt1ClmAdjNbrCounter = shareString.getSerializedField().getModifiedCounter();
		return  dt1ClmAdjNbr;
    }

   protected int checkDt1ClmAdjNbrMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshDt1ClmAdjNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDt1ClmAdjNbr() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDt1ClmAdjNbr
			                 ,DT_1_CLM_ADJ_NBR_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dt1ClmAdjNbr", beginDt1ClmAdjNbr,DT_1_CLM_ADJ_NBR_LEN);
    }
   	}
     int localDt1ClmAdjIndCounter = -1;
     public boolean isDt1ClmAdjIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmAdjIndCounter != sharedCounter;
         localDt1ClmAdjIndCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_CLM_ADJ_IND_LEN = 1;
	/**
	 * 	serialize this Dt1ClmAdjInd
	 */
   protected void serializeDt1ClmAdjInd(char[] dt1ClmAdjInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ClmAdjInd,0,getStringValue(),beginDt1ClmAdjInd,DT_1_CLM_ADJ_IND_LEN);
       localDt1ClmAdjIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ClmAdjIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt1ClmAdjInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ClmAdjInd() {	 
   		return (substring(getStringValue(),beginDt1ClmAdjInd,beginDt1ClmAdjInd + DT_1_CLM_ADJ_IND_LEN));
   	}
     int localDt1ClmPpoIndCounter = -1;
     public boolean isDt1ClmPpoIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmPpoIndCounter != sharedCounter;
         localDt1ClmPpoIndCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_CLM_PPO_IND_LEN = 1;
	/**
	 * 	serialize this Dt1ClmPpoInd
	 */
   protected void serializeDt1ClmPpoInd(char[] dt1ClmPpoInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ClmPpoInd,0,getStringValue(),beginDt1ClmPpoInd,DT_1_CLM_PPO_IND_LEN);
       localDt1ClmPpoIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ClmPpoIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt1ClmPpoInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ClmPpoInd() {	 
   		return (substring(getStringValue(),beginDt1ClmPpoInd,beginDt1ClmPpoInd + DT_1_CLM_PPO_IND_LEN));
   	}
     int localDt1ClmClmPhiIndCounter = -1;
     public boolean isDt1ClmClmPhiIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmClmPhiIndCounter != sharedCounter;
         localDt1ClmClmPhiIndCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_CLM_CLM_PHI_IND_LEN = 1;
	/**
	 * 	serialize this Dt1ClmClmPhiInd
	 */
   protected void serializeDt1ClmClmPhiInd(char[] dt1ClmClmPhiInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ClmClmPhiInd,0,getStringValue(),beginDt1ClmClmPhiInd,DT_1_CLM_CLM_PHI_IND_LEN);
       localDt1ClmClmPhiIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ClmClmPhiIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt1ClmClmPhiInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ClmClmPhiInd() {	 
   		return (substring(getStringValue(),beginDt1ClmClmPhiInd,beginDt1ClmClmPhiInd + DT_1_CLM_CLM_PHI_IND_LEN));
   	}
     int localDt1ClmT1ProcessIndCounter = -1;
     public boolean isDt1ClmT1ProcessIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmT1ProcessIndCounter != sharedCounter;
         localDt1ClmT1ProcessIndCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_CLM_T_1_PROCESS_IND_LEN = 1;
	/**
	 * 	serialize this Dt1ClmT1ProcessInd
	 */
   protected void serializeDt1ClmT1ProcessInd(char[] dt1ClmT1ProcessInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ClmT1ProcessInd,0,getStringValue(),beginDt1ClmT1ProcessInd,DT_1_CLM_T_1_PROCESS_IND_LEN);
       localDt1ClmT1ProcessIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ClmT1ProcessIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt1ClmT1ProcessInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ClmT1ProcessInd() {	 
   		return (substring(getStringValue(),beginDt1ClmT1ProcessInd,beginDt1ClmT1ProcessInd + DT_1_CLM_T_1_PROCESS_IND_LEN));
   	}
     int localDt1ClmDlgteIndCounter = -1;
     public boolean isDt1ClmDlgteIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmDlgteIndCounter != sharedCounter;
         localDt1ClmDlgteIndCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_CLM_DLGTE_IND_LEN = 2;
	/**
	 * 	serialize this Dt1ClmDlgteInd
	 */
   protected void serializeDt1ClmDlgteInd(char[] dt1ClmDlgteInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ClmDlgteInd,0,getStringValue(),beginDt1ClmDlgteInd,DT_1_CLM_DLGTE_IND_LEN);
       localDt1ClmDlgteIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ClmDlgteIndConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDt1ClmDlgteInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ClmDlgteInd() {	 
   		return (substring(getStringValue(),beginDt1ClmDlgteInd,beginDt1ClmDlgteInd + DT_1_CLM_DLGTE_IND_LEN));
   	}
     int localDt1ClmAuthNbrCounter = -1;
     public boolean isDt1ClmAuthNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmAuthNbrCounter != sharedCounter;
         localDt1ClmAuthNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_CLM_AUTH_NBR_LEN = 50;
	/**
	 * 	serialize this Dt1ClmAuthNbr
	 */
   protected void serializeDt1ClmAuthNbr(char[] dt1ClmAuthNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ClmAuthNbr,0,getStringValue(),beginDt1ClmAuthNbr,DT_1_CLM_AUTH_NBR_LEN);
       localDt1ClmAuthNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ClmAuthNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 50 ,false, false);
   }
    /**
	 *	refreshDt1ClmAuthNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ClmAuthNbr() {	 
   		return (substring(getStringValue(),beginDt1ClmAuthNbr,beginDt1ClmAuthNbr + DT_1_CLM_AUTH_NBR_LEN));
   	}
     int localDt1ClmAuthSrcIdCounter = -1;
     public boolean isDt1ClmAuthSrcIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmAuthSrcIdCounter != sharedCounter;
         localDt1ClmAuthSrcIdCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_CLM_AUTH_SRC_ID_LEN = 3;
	/**
	 * 	serialize this Dt1ClmAuthSrcId
	 */
   protected void serializeDt1ClmAuthSrcId(char[] dt1ClmAuthSrcId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ClmAuthSrcId,0,getStringValue(),beginDt1ClmAuthSrcId,DT_1_CLM_AUTH_SRC_ID_LEN);
       localDt1ClmAuthSrcIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ClmAuthSrcIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshDt1ClmAuthSrcId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ClmAuthSrcId() {	 
   		return (substring(getStringValue(),beginDt1ClmAuthSrcId,beginDt1ClmAuthSrcId + DT_1_CLM_AUTH_SRC_ID_LEN));
   	}
     int localDt1ClmAuthProcCdCounter = -1;
     public boolean isDt1ClmAuthProcCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmAuthProcCdCounter != sharedCounter;
         localDt1ClmAuthProcCdCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_CLM_AUTH_PROC_CD_LEN = 5;
	/**
	 * 	serialize this Dt1ClmAuthProcCd
	 */
   protected void serializeDt1ClmAuthProcCd(char[] dt1ClmAuthProcCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ClmAuthProcCd,0,getStringValue(),beginDt1ClmAuthProcCd,DT_1_CLM_AUTH_PROC_CD_LEN);
       localDt1ClmAuthProcCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ClmAuthProcCdConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshDt1ClmAuthProcCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ClmAuthProcCd() {	 
   		return (substring(getStringValue(),beginDt1ClmAuthProcCd,beginDt1ClmAuthProcCd + DT_1_CLM_AUTH_PROC_CD_LEN));
   	}
     int localDt1ClmAuthClmLevelIndCounter = -1;
     public boolean isDt1ClmAuthClmLevelIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmAuthClmLevelIndCounter != sharedCounter;
         localDt1ClmAuthClmLevelIndCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_CLM_AUTH_CLM_LEVEL_IND_LEN = 1;
	/**
	 * 	serialize this Dt1ClmAuthClmLevelInd
	 */
   protected void serializeDt1ClmAuthClmLevelInd(char[] dt1ClmAuthClmLevelInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ClmAuthClmLevelInd,0,getStringValue(),beginDt1ClmAuthClmLevelInd,DT_1_CLM_AUTH_CLM_LEVEL_IND_LEN);
       localDt1ClmAuthClmLevelIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ClmAuthClmLevelIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt1ClmAuthClmLevelInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ClmAuthClmLevelInd() {	 
   		return (substring(getStringValue(),beginDt1ClmAuthClmLevelInd,beginDt1ClmAuthClmLevelInd + DT_1_CLM_AUTH_CLM_LEVEL_IND_LEN));
   	}
     int localDt1ClmAuthUniqueCntCounter = -1;
     public boolean isDt1ClmAuthUniqueCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmAuthUniqueCntCounter != sharedCounter;
         localDt1ClmAuthUniqueCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dt1ClmAuthUniqueCnt
	 *	@return dt1ClmAuthUniqueCnt
	 */
	public char[]  getDt1ClmAuthUniqueCntString() {
	     return getCharArray(beginDt1ClmAuthUniqueCnt,DT_1_CLM_AUTH_UNIQUE_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dt1ClmAuthUniqueCntIsNumeric() {
	    return isNumeric(beginDt1ClmAuthUniqueCnt
	                    ,beginDt1ClmAuthUniqueCnt + DT_1_CLM_AUTH_UNIQUE_CNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DT_1_CLM_AUTH_UNIQUE_CNT_LEN = 1;
  	/**
	 * serializeDt1ClmAuthUniqueCnt
	 */
	protected void serializeDt1ClmAuthUniqueCnt(int dt1ClmAuthUniqueCnt) {
		 putNumber(beginDt1ClmAuthUniqueCnt,dt1ClmAuthUniqueCnt,DT_1_CLM_AUTH_UNIQUE_CNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDt1ClmAuthUniqueCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDt1ClmAuthUniqueCnt
	 */
   	protected  int serializeDt1ClmAuthUniqueCnt(char[] value) {
	    int  dt1ClmAuthUniqueCnt;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dt1ClmAuthUniqueCnt = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginDt1ClmAuthUniqueCnt
		       ,1
		      );
		 localDt1ClmAuthUniqueCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  dt1ClmAuthUniqueCnt;
    }

   protected int checkDt1ClmAuthUniqueCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDt1ClmAuthUniqueCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDt1ClmAuthUniqueCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDt1ClmAuthUniqueCnt
			                 ,DT_1_CLM_AUTH_UNIQUE_CNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dt1ClmAuthUniqueCnt", beginDt1ClmAuthUniqueCnt,DT_1_CLM_AUTH_UNIQUE_CNT_LEN);
    }
   	}
     int localDt1ClmPrimaryDiagnosisCounter = -1;
     public boolean isDt1ClmPrimaryDiagnosisModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmPrimaryDiagnosisCounter != sharedCounter;
         localDt1ClmPrimaryDiagnosisCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_CLM_PRIMARY_DIAGNOSIS_LEN = 7;
	/**
	 * 	serialize this Dt1ClmPrimaryDiagnosis
	 */
   protected void serializeDt1ClmPrimaryDiagnosis(char[] dt1ClmPrimaryDiagnosis) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ClmPrimaryDiagnosis,0,getStringValue(),beginDt1ClmPrimaryDiagnosis,DT_1_CLM_PRIMARY_DIAGNOSIS_LEN);
       localDt1ClmPrimaryDiagnosisCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ClmPrimaryDiagnosisConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshDt1ClmPrimaryDiagnosis is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ClmPrimaryDiagnosis() {	 
   		return (substring(getStringValue(),beginDt1ClmPrimaryDiagnosis,beginDt1ClmPrimaryDiagnosis + DT_1_CLM_PRIMARY_DIAGNOSIS_LEN));
   	}
     int localDt1ClmParsWaivIndCounter = -1;
     public boolean isDt1ClmParsWaivIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmParsWaivIndCounter != sharedCounter;
         localDt1ClmParsWaivIndCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_CLM_PARS_WAIV_IND_LEN = 1;
	/**
	 * 	serialize this Dt1ClmParsWaivInd
	 */
   protected void serializeDt1ClmParsWaivInd(char[] dt1ClmParsWaivInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ClmParsWaivInd,0,getStringValue(),beginDt1ClmParsWaivInd,DT_1_CLM_PARS_WAIV_IND_LEN);
       localDt1ClmParsWaivIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ClmParsWaivIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt1ClmParsWaivInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ClmParsWaivInd() {	 
   		return (substring(getStringValue(),beginDt1ClmParsWaivInd,beginDt1ClmParsWaivInd + DT_1_CLM_PARS_WAIV_IND_LEN));
   	}
     int localDt1ClmParIndCounter = -1;
     public boolean isDt1ClmParIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmParIndCounter != sharedCounter;
         localDt1ClmParIndCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_CLM_PAR_IND_LEN = 1;
	/**
	 * 	serialize this Dt1ClmParInd
	 */
   protected void serializeDt1ClmParInd(char[] dt1ClmParInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ClmParInd,0,getStringValue(),beginDt1ClmParInd,DT_1_CLM_PAR_IND_LEN);
       localDt1ClmParIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ClmParIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt1ClmParInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ClmParInd() {	 
   		return (substring(getStringValue(),beginDt1ClmParInd,beginDt1ClmParInd + DT_1_CLM_PAR_IND_LEN));
   	}
     int localDt1ClmNonParIndCounter = -1;
     public boolean isDt1ClmNonParIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmNonParIndCounter != sharedCounter;
         localDt1ClmNonParIndCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_CLM_NON_PAR_IND_LEN = 1;
	/**
	 * 	serialize this Dt1ClmNonParInd
	 */
   protected void serializeDt1ClmNonParInd(char[] dt1ClmNonParInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ClmNonParInd,0,getStringValue(),beginDt1ClmNonParInd,DT_1_CLM_NON_PAR_IND_LEN);
       localDt1ClmNonParIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ClmNonParIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt1ClmNonParInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ClmNonParInd() {	 
   		return (substring(getStringValue(),beginDt1ClmNonParInd,beginDt1ClmNonParInd + DT_1_CLM_NON_PAR_IND_LEN));
   	}
     int localDt1ClmProviderTierCounter = -1;
     public boolean isDt1ClmProviderTierModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmProviderTierCounter != sharedCounter;
         localDt1ClmProviderTierCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_CLM_PROVIDER_TIER_LEN = 1;
	/**
	 * 	serialize this Dt1ClmProviderTier
	 */
   protected void serializeDt1ClmProviderTier(char[] dt1ClmProviderTier) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ClmProviderTier,0,getStringValue(),beginDt1ClmProviderTier,DT_1_CLM_PROVIDER_TIER_LEN);
       localDt1ClmProviderTierCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ClmProviderTierConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt1ClmProviderTier is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ClmProviderTier() {	 
   		return (substring(getStringValue(),beginDt1ClmProviderTier,beginDt1ClmProviderTier + DT_1_CLM_PROVIDER_TIER_LEN));
   	}
     int localDt1ClmTpsmCdCounter = -1;
     public boolean isDt1ClmTpsmCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmTpsmCdCounter != sharedCounter;
         localDt1ClmTpsmCdCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_CLM_TPSM_CD_LEN = 3;
	/**
	 * 	serialize this Dt1ClmTpsmCd
	 */
   protected void serializeDt1ClmTpsmCd(char[] dt1ClmTpsmCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ClmTpsmCd,0,getStringValue(),beginDt1ClmTpsmCd,DT_1_CLM_TPSM_CD_LEN);
       localDt1ClmTpsmCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ClmTpsmCdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshDt1ClmTpsmCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ClmTpsmCd() {	 
   		return (substring(getStringValue(),beginDt1ClmTpsmCd,beginDt1ClmTpsmCd + DT_1_CLM_TPSM_CD_LEN));
   	}
     int localDt1ClmMskIndCounter = -1;
     public boolean isDt1ClmMskIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmMskIndCounter != sharedCounter;
         localDt1ClmMskIndCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_CLM_MSK_IND_LEN = 1;
	/**
	 * 	serialize this Dt1ClmMskInd
	 */
   protected void serializeDt1ClmMskInd(char[] dt1ClmMskInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ClmMskInd,0,getStringValue(),beginDt1ClmMskInd,DT_1_CLM_MSK_IND_LEN);
       localDt1ClmMskIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ClmMskIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt1ClmMskInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ClmMskInd() {	 
   		return (substring(getStringValue(),beginDt1ClmMskInd,beginDt1ClmMskInd + DT_1_CLM_MSK_IND_LEN));
   	}
     int localDt1ClmPtntRespAmtCounter = -1;
     public boolean isDt1ClmPtntRespAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmPtntRespAmtCounter != sharedCounter;
         localDt1ClmPtntRespAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_CLM_PTNT_RESP_AMT_LEN = 10;
	/**
	 * 	serialize this Dt1ClmPtntRespAmt
	 */
   protected void serializeDt1ClmPtntRespAmt(char[] dt1ClmPtntRespAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ClmPtntRespAmt,0,getStringValue(),beginDt1ClmPtntRespAmt,DT_1_CLM_PTNT_RESP_AMT_LEN);
       localDt1ClmPtntRespAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ClmPtntRespAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshDt1ClmPtntRespAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ClmPtntRespAmt() {	 
   		return (substring(getStringValue(),beginDt1ClmPtntRespAmt,beginDt1ClmPtntRespAmt + DT_1_CLM_PTNT_RESP_AMT_LEN));
   	}
     int localDt1ClmProvSpclCdCounter = -1;
     public boolean isDt1ClmProvSpclCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmProvSpclCdCounter != sharedCounter;
         localDt1ClmProvSpclCdCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_CLM_PROV_SPCL_CD_LEN = 3;
	/**
	 * 	serialize this Dt1ClmProvSpclCd
	 */
   protected void serializeDt1ClmProvSpclCd(char[] dt1ClmProvSpclCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ClmProvSpclCd,0,getStringValue(),beginDt1ClmProvSpclCd,DT_1_CLM_PROV_SPCL_CD_LEN);
       localDt1ClmProvSpclCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ClmProvSpclCdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshDt1ClmProvSpclCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ClmProvSpclCd() {	 
   		return (substring(getStringValue(),beginDt1ClmProvSpclCd,beginDt1ClmProvSpclCd + DT_1_CLM_PROV_SPCL_CD_LEN));
   	}
     int localDt1ClmNdbContrIdCounter = -1;
     public boolean isDt1ClmNdbContrIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmNdbContrIdCounter != sharedCounter;
         localDt1ClmNdbContrIdCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_CLM_NDB_CONTR_ID_LEN = 9;
	/**
	 * 	serialize this Dt1ClmNdbContrId
	 */
   protected void serializeDt1ClmNdbContrId(char[] dt1ClmNdbContrId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ClmNdbContrId,0,getStringValue(),beginDt1ClmNdbContrId,DT_1_CLM_NDB_CONTR_ID_LEN);
       localDt1ClmNdbContrIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ClmNdbContrIdConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshDt1ClmNdbContrId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ClmNdbContrId() {	 
   		return (substring(getStringValue(),beginDt1ClmNdbContrId,beginDt1ClmNdbContrId + DT_1_CLM_NDB_CONTR_ID_LEN));
   	}
     int localDt1ClmDrgNbrCounter = -1;
     public boolean isDt1ClmDrgNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmDrgNbrCounter != sharedCounter;
         localDt1ClmDrgNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_CLM_DRG_NBR_LEN = 5;
	/**
	 * 	serialize this Dt1ClmDrgNbr
	 */
   protected void serializeDt1ClmDrgNbr(char[] dt1ClmDrgNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ClmDrgNbr,0,getStringValue(),beginDt1ClmDrgNbr,DT_1_CLM_DRG_NBR_LEN);
       localDt1ClmDrgNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ClmDrgNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshDt1ClmDrgNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ClmDrgNbr() {	 
   		return (substring(getStringValue(),beginDt1ClmDrgNbr,beginDt1ClmDrgNbr + DT_1_CLM_DRG_NBR_LEN));
   	}
     int localDt1ClmProvMedcdReclmIndCounter = -1;
     public boolean isDt1ClmProvMedcdReclmIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmProvMedcdReclmIndCounter != sharedCounter;
         localDt1ClmProvMedcdReclmIndCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_CLM_PROV_MEDCD_RECLM_IND_LEN = 1;
	/**
	 * 	serialize this Dt1ClmProvMedcdReclmInd
	 */
   protected void serializeDt1ClmProvMedcdReclmInd(char[] dt1ClmProvMedcdReclmInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ClmProvMedcdReclmInd,0,getStringValue(),beginDt1ClmProvMedcdReclmInd,DT_1_CLM_PROV_MEDCD_RECLM_IND_LEN);
       localDt1ClmProvMedcdReclmIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ClmProvMedcdReclmIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt1ClmProvMedcdReclmInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ClmProvMedcdReclmInd() {	 
   		return (substring(getStringValue(),beginDt1ClmProvMedcdReclmInd,beginDt1ClmProvMedcdReclmInd + DT_1_CLM_PROV_MEDCD_RECLM_IND_LEN));
   	}
     int localDt1ClmHospProfIndCounter = -1;
     public boolean isDt1ClmHospProfIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmHospProfIndCounter != sharedCounter;
         localDt1ClmHospProfIndCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_CLM_HOSP_PROF_IND_LEN = 1;
	/**
	 * 	serialize this Dt1ClmHospProfInd
	 */
   protected void serializeDt1ClmHospProfInd(char[] dt1ClmHospProfInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ClmHospProfInd,0,getStringValue(),beginDt1ClmHospProfInd,DT_1_CLM_HOSP_PROF_IND_LEN);
       localDt1ClmHospProfIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ClmHospProfIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt1ClmHospProfInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ClmHospProfInd() {	 
   		return (substring(getStringValue(),beginDt1ClmHospProfInd,beginDt1ClmHospProfInd + DT_1_CLM_HOSP_PROF_IND_LEN));
   	}
     int localDt1ClmSmbAppCdCounter = -1;
     public boolean isDt1ClmSmbAppCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmSmbAppCdCounter != sharedCounter;
         localDt1ClmSmbAppCdCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_CLM_SMB_APP_CD_LEN = 1;
	/**
	 * 	serialize this Dt1ClmSmbAppCd
	 */
   protected void serializeDt1ClmSmbAppCd(char[] dt1ClmSmbAppCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ClmSmbAppCd,0,getStringValue(),beginDt1ClmSmbAppCd,DT_1_CLM_SMB_APP_CD_LEN);
       localDt1ClmSmbAppCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ClmSmbAppCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt1ClmSmbAppCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ClmSmbAppCd() {	 
   		return (substring(getStringValue(),beginDt1ClmSmbAppCd,beginDt1ClmSmbAppCd + DT_1_CLM_SMB_APP_CD_LEN));
   	}
     int localDt1ClmSmbStCdCounter = -1;
     public boolean isDt1ClmSmbStCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmSmbStCdCounter != sharedCounter;
         localDt1ClmSmbStCdCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_CLM_SMB_ST_CD_LEN = 2;
	/**
	 * 	serialize this Dt1ClmSmbStCd
	 */
   protected void serializeDt1ClmSmbStCd(char[] dt1ClmSmbStCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ClmSmbStCd,0,getStringValue(),beginDt1ClmSmbStCd,DT_1_CLM_SMB_ST_CD_LEN);
       localDt1ClmSmbStCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ClmSmbStCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDt1ClmSmbStCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ClmSmbStCd() {	 
   		return (substring(getStringValue(),beginDt1ClmSmbStCd,beginDt1ClmSmbStCd + DT_1_CLM_SMB_ST_CD_LEN));
   	}
     int localDt1ClmItemFillerAreaCounter = -1;
     public boolean isDt1ClmItemFillerAreaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmItemFillerAreaCounter != sharedCounter;
         localDt1ClmItemFillerAreaCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_CLM_ITEM_FILLER_AREA_LEN = 117;
	/**
	 * 	serialize this Dt1ClmItemFillerArea
	 */
   protected void serializeDt1ClmItemFillerArea(char[] dt1ClmItemFillerArea) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ClmItemFillerArea,0,getStringValue(),beginDt1ClmItemFillerArea,DT_1_CLM_ITEM_FILLER_AREA_LEN);
       localDt1ClmItemFillerAreaCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ClmItemFillerAreaConstraints(char[] value) {
   			return super.checkConstraints(value , 117 ,false, false);
   }
    /**
	 *	refreshDt1ClmItemFillerArea is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ClmItemFillerArea() {	 
   		return (substring(getStringValue(),beginDt1ClmItemFillerArea,beginDt1ClmItemFillerArea + DT_1_CLM_ITEM_FILLER_AREA_LEN));
   	}




}
  
