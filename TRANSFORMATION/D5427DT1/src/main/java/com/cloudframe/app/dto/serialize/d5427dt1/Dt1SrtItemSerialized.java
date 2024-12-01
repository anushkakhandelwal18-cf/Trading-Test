package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class Dt1SrtItemSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Dt1SrtItemSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Dt1SrtItemSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_1_SRT_ITEM_LENGTH = 74;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDt1SrtFlnCent;
            protected  int beginDt1SrtFln;
            protected  int beginDt1SrtIcn;
            protected  int beginDt1SrtDate;
            protected  int beginDt1SrtTime;
            protected  int beginDt1SrtBankCode;
            protected  int beginDt1SrtDraft;
            protected  int beginDt1SrtPayeeCode;
            protected  int beginDt1SrtLineSequence;
            protected  int beginDt1SrtTranCode;
            protected  int beginDt1SrtApproverAltId;
            protected  int beginDt1SrtClmItem;
            protected  int beginDt1SrtSuffixCd;
            protected  int beginDt1SrtProviderId;
            protected  int beginDt1SrtHeaderCt;
            protected  int beginDt1SrtDivNbr;
            protected  int beginDt1SrtClsNbr;
	
	/**
	* Constructor for Dt1SrtItemSerialized
	**/
    public Dt1SrtItemSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Dt1SrtItemSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dt1SrtItemSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Dt1SrtItemSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,4); // serialize this field at offset 4 by default 
    }
    
	/**
	* sets parent for this Dt1SrtItemSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 4 by default
    }    
	/**
	* initializes the field in Dt1SrtItemSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_1_SRT_ITEM_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDt1SrtFlnCent = getStartOffset() + 0;	// set offset for serialization
  
             beginDt1SrtFln = getStartOffset() + 2;	// set offset for serialization
  
             beginDt1SrtIcn = getStartOffset() + 8;	// set offset for serialization
  
             beginDt1SrtDate = getStartOffset() + 18;	// set offset for serialization
  
             beginDt1SrtTime = getStartOffset() + 23;	// set offset for serialization
  
             beginDt1SrtBankCode = getStartOffset() + 27;	// set offset for serialization
  
             beginDt1SrtDraft = getStartOffset() + 29;	// set offset for serialization
  
             beginDt1SrtPayeeCode = getStartOffset() + 35;	// set offset for serialization
  
             beginDt1SrtLineSequence = getStartOffset() + 36;	// set offset for serialization
  
             beginDt1SrtTranCode = getStartOffset() + 37;	// set offset for serialization
  
             beginDt1SrtApproverAltId = getStartOffset() + 39;	// set offset for serialization
  
             beginDt1SrtClmItem = getStartOffset() + 43;	// set offset for serialization
  
             beginDt1SrtSuffixCd = getStartOffset() + 45;	// set offset for serialization
  
             beginDt1SrtProviderId = getStartOffset() + 47;	// set offset for serialization
  
             beginDt1SrtHeaderCt = getStartOffset() + 62;	// set offset for serialization
  
             beginDt1SrtDivNbr = getStartOffset() + 66;	// set offset for serialization
  
             beginDt1SrtClsNbr = getStartOffset() + 70;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDt1SrtFlnCentCounter = -1;
     public boolean isDt1SrtFlnCentModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1SrtFlnCentCounter != sharedCounter;
         localDt1SrtFlnCentCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dt1SrtFlnCent
	 *	@return dt1SrtFlnCent
	 */
	public char[]  getDt1SrtFlnCentString() {
	     return getCharArray(beginDt1SrtFlnCent,DT_1_SRT_FLN_CENT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dt1SrtFlnCentIsNumeric() {
	    return isNumeric(beginDt1SrtFlnCent
	                    ,beginDt1SrtFlnCent + DT_1_SRT_FLN_CENT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DT_1_SRT_FLN_CENT_LEN = 2;
  	/**
	 * serializeDt1SrtFlnCent
	 */
	protected void serializeDt1SrtFlnCent(int dt1SrtFlnCent) {
		 putNumber(beginDt1SrtFlnCent,dt1SrtFlnCent,DT_1_SRT_FLN_CENT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDt1SrtFlnCentCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDt1SrtFlnCent
	 */
   	protected  int serializeDt1SrtFlnCent(char[] value) {
	    int  dt1SrtFlnCent;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dt1SrtFlnCent = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginDt1SrtFlnCent
		       ,2
		      );
		 localDt1SrtFlnCentCounter = shareString.getSerializedField().getModifiedCounter();
		return  dt1SrtFlnCent;
    }

   protected int checkDt1SrtFlnCentMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDt1SrtFlnCent is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDt1SrtFlnCent() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDt1SrtFlnCent
			                 ,DT_1_SRT_FLN_CENT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dt1SrtFlnCent", beginDt1SrtFlnCent,DT_1_SRT_FLN_CENT_LEN);
    }
   	}
        int localDt1SrtFlnCounter = -1;
        public boolean isDt1SrtFlnModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localDt1SrtFlnCounter != sharedCounter;
           localDt1SrtFlnCounter = sharedCounter; return hasModified; 
        }
	    public boolean dt1SrtFlnIsNumeric() {
	      return decimalIsNumeric(beginDt1SrtFln,DT_1_SRT_FLN_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int DT_1_SRT_FLN_LEN = 6;
  	/**
	 * 	serializeDt1SrtFln
	 */
	protected void serializeDt1SrtFln(long dt1SrtFln) {
		   putDecimal(beginDt1SrtFln,dt1SrtFln,DT_1_SRT_FLN_LEN,false);
   }
   

   protected long checkDt1SrtFlnMaxLimit(long number) {
        return checkMaxLimit(number , MAX_100G /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshDt1SrtFln is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDt1SrtFln() throws CFException {	
   	try { 
		 return (getLongDecimal(beginDt1SrtFln,DT_1_SRT_FLN_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("dt1SrtFln", beginDt1SrtFln,DT_1_SRT_FLN_LEN);
     }
   	}
     int localDt1SrtIcnCounter = -1;
     public boolean isDt1SrtIcnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1SrtIcnCounter != sharedCounter;
         localDt1SrtIcnCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_SRT_ICN_LEN = 10;
	/**
	 * 	serialize this Dt1SrtIcn
	 */
   protected void serializeDt1SrtIcn(char[] dt1SrtIcn) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1SrtIcn,0,getStringValue(),beginDt1SrtIcn,DT_1_SRT_ICN_LEN);
       localDt1SrtIcnCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1SrtIcnConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshDt1SrtIcn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1SrtIcn() {	 
   		return (substring(getStringValue(),beginDt1SrtIcn,beginDt1SrtIcn + DT_1_SRT_ICN_LEN));
   	}
        int localDt1SrtDateCounter = -1;
        public boolean isDt1SrtDateModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localDt1SrtDateCounter != sharedCounter;
           localDt1SrtDateCounter = sharedCounter; return hasModified; 
        }
	    public boolean dt1SrtDateIsNumeric() {
	      return decimalIsNumeric(beginDt1SrtDate,DT_1_SRT_DATE_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int DT_1_SRT_DATE_LEN = 5;
  	/**
	 * 	serializeDt1SrtDate
	 */
	protected void serializeDt1SrtDate(long dt1SrtDate) {
		   putDecimal(beginDt1SrtDate,dt1SrtDate,DT_1_SRT_DATE_LEN,false);
   }
   

   protected long checkDt1SrtDateMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1G /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshDt1SrtDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDt1SrtDate() throws CFException {	
   	try { 
		 return (getLongDecimal(beginDt1SrtDate,DT_1_SRT_DATE_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("dt1SrtDate", beginDt1SrtDate,DT_1_SRT_DATE_LEN);
     }
   	}
        int localDt1SrtTimeCounter = -1;
        public boolean isDt1SrtTimeModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localDt1SrtTimeCounter != sharedCounter;
           localDt1SrtTimeCounter = sharedCounter; return hasModified; 
        }
	    public boolean dt1SrtTimeIsNumeric() {
	      return decimalIsNumeric(beginDt1SrtTime,DT_1_SRT_TIME_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int DT_1_SRT_TIME_LEN = 4;
  	/**
	 * 	serializeDt1SrtTime
	 */
	protected void serializeDt1SrtTime(long dt1SrtTime) {
		   putDecimal(beginDt1SrtTime,dt1SrtTime,DT_1_SRT_TIME_LEN,false);
   }
   

   protected long checkDt1SrtTimeMaxLimit(long number) {
        return checkMaxLimit(number , MAX_10M /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshDt1SrtTime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDt1SrtTime() throws CFException {	
   	try { 
		 return (getLongDecimal(beginDt1SrtTime,DT_1_SRT_TIME_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("dt1SrtTime", beginDt1SrtTime,DT_1_SRT_TIME_LEN);
     }
   	}
        int localDt1SrtBankCodeCounter = -1;
        public boolean isDt1SrtBankCodeModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localDt1SrtBankCodeCounter != sharedCounter;
           localDt1SrtBankCodeCounter = sharedCounter; return hasModified; 
        }
	    public boolean dt1SrtBankCodeIsNumeric() {
	      return decimalIsNumeric(beginDt1SrtBankCode,DT_1_SRT_BANK_CODE_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int DT_1_SRT_BANK_CODE_LEN = 2;
  	/**
	 * 	serializeDt1SrtBankCode
	 */
	protected void serializeDt1SrtBankCode(int dt1SrtBankCode) {
		   putDecimal(beginDt1SrtBankCode,dt1SrtBankCode,DT_1_SRT_BANK_CODE_LEN,false);
   }
   

   protected int checkDt1SrtBankCodeMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1000 /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshDt1SrtBankCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDt1SrtBankCode() throws CFException {	
   	try { 
		 return (getIntDecimal(beginDt1SrtBankCode,DT_1_SRT_BANK_CODE_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("dt1SrtBankCode", beginDt1SrtBankCode,DT_1_SRT_BANK_CODE_LEN);
     }
   	}
        int localDt1SrtDraftCounter = -1;
        public boolean isDt1SrtDraftModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localDt1SrtDraftCounter != sharedCounter;
           localDt1SrtDraftCounter = sharedCounter; return hasModified; 
        }
	    public boolean dt1SrtDraftIsNumeric() {
	      return decimalIsNumeric(beginDt1SrtDraft,DT_1_SRT_DRAFT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int DT_1_SRT_DRAFT_LEN = 6;
  	/**
	 * 	serializeDt1SrtDraft
	 */
	protected void serializeDt1SrtDraft(long dt1SrtDraft) {
		   putDecimal(beginDt1SrtDraft,dt1SrtDraft,DT_1_SRT_DRAFT_LEN,false);
   }
   

   protected long checkDt1SrtDraftMaxLimit(long number) {
        return checkMaxLimit(number , MAX_100G /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshDt1SrtDraft is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDt1SrtDraft() throws CFException {	
   	try { 
		 return (getLongDecimal(beginDt1SrtDraft,DT_1_SRT_DRAFT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("dt1SrtDraft", beginDt1SrtDraft,DT_1_SRT_DRAFT_LEN);
     }
   	}
     int localDt1SrtPayeeCodeCounter = -1;
     public boolean isDt1SrtPayeeCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1SrtPayeeCodeCounter != sharedCounter;
         localDt1SrtPayeeCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_SRT_PAYEE_CODE_LEN = 1;
	/**
	 * 	serialize this Dt1SrtPayeeCode
	 */
   protected void serializeDt1SrtPayeeCode(char[] dt1SrtPayeeCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1SrtPayeeCode,0,getStringValue(),beginDt1SrtPayeeCode,DT_1_SRT_PAYEE_CODE_LEN);
       localDt1SrtPayeeCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1SrtPayeeCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt1SrtPayeeCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1SrtPayeeCode() {	 
   		return (substring(getStringValue(),beginDt1SrtPayeeCode,beginDt1SrtPayeeCode + DT_1_SRT_PAYEE_CODE_LEN));
   	}
     int localDt1SrtLineSequenceCounter = -1;
     public boolean isDt1SrtLineSequenceModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1SrtLineSequenceCounter != sharedCounter;
         localDt1SrtLineSequenceCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dt1SrtLineSequence
	 *	@return dt1SrtLineSequence
	 */
	public char[]  getDt1SrtLineSequenceString() {
	     return getCharArray(beginDt1SrtLineSequence,DT_1_SRT_LINE_SEQUENCE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dt1SrtLineSequenceIsNumeric() {
	    return isNumeric(beginDt1SrtLineSequence
	                    ,beginDt1SrtLineSequence + DT_1_SRT_LINE_SEQUENCE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DT_1_SRT_LINE_SEQUENCE_LEN = 1;
  	/**
	 * serializeDt1SrtLineSequence
	 */
	protected void serializeDt1SrtLineSequence(int dt1SrtLineSequence) {
		 putNumber(beginDt1SrtLineSequence,dt1SrtLineSequence,DT_1_SRT_LINE_SEQUENCE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDt1SrtLineSequenceCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDt1SrtLineSequence
	 */
   	protected  int serializeDt1SrtLineSequence(char[] value) {
	    int  dt1SrtLineSequence;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dt1SrtLineSequence = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginDt1SrtLineSequence
		       ,1
		      );
		 localDt1SrtLineSequenceCounter = shareString.getSerializedField().getModifiedCounter();
		return  dt1SrtLineSequence;
    }

   protected int checkDt1SrtLineSequenceMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDt1SrtLineSequence is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDt1SrtLineSequence() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDt1SrtLineSequence
			                 ,DT_1_SRT_LINE_SEQUENCE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dt1SrtLineSequence", beginDt1SrtLineSequence,DT_1_SRT_LINE_SEQUENCE_LEN);
    }
   	}
     int localDt1SrtTranCodeCounter = -1;
     public boolean isDt1SrtTranCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1SrtTranCodeCounter != sharedCounter;
         localDt1SrtTranCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_SRT_TRAN_CODE_LEN = 2;
	/**
	 * 	serialize this Dt1SrtTranCode
	 */
   protected void serializeDt1SrtTranCode(char[] dt1SrtTranCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1SrtTranCode,0,getStringValue(),beginDt1SrtTranCode,DT_1_SRT_TRAN_CODE_LEN);
       localDt1SrtTranCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1SrtTranCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDt1SrtTranCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1SrtTranCode() {	 
   		return (substring(getStringValue(),beginDt1SrtTranCode,beginDt1SrtTranCode + DT_1_SRT_TRAN_CODE_LEN));
   	}
        int localDt1SrtApproverAltIdCounter = -1;
        public boolean isDt1SrtApproverAltIdModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localDt1SrtApproverAltIdCounter != sharedCounter;
           localDt1SrtApproverAltIdCounter = sharedCounter; return hasModified; 
        }
	    public boolean dt1SrtApproverAltIdIsNumeric() {
	      return decimalIsNumeric(beginDt1SrtApproverAltId,DT_1_SRT_APPROVER_ALT_ID_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int DT_1_SRT_APPROVER_ALT_ID_LEN = 4;
  	/**
	 * 	serializeDt1SrtApproverAltId
	 */
	protected void serializeDt1SrtApproverAltId(long dt1SrtApproverAltId) {
		   putDecimal(beginDt1SrtApproverAltId,dt1SrtApproverAltId,DT_1_SRT_APPROVER_ALT_ID_LEN,false);
   }
   

   protected long checkDt1SrtApproverAltIdMaxLimit(long number) {
        return checkMaxLimit(number , MAX_10M /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshDt1SrtApproverAltId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDt1SrtApproverAltId() throws CFException {	
   	try { 
		 return (getLongDecimal(beginDt1SrtApproverAltId,DT_1_SRT_APPROVER_ALT_ID_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("dt1SrtApproverAltId", beginDt1SrtApproverAltId,DT_1_SRT_APPROVER_ALT_ID_LEN);
     }
   	}
        int localDt1SrtClmItemCounter = -1;
        public boolean isDt1SrtClmItemModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localDt1SrtClmItemCounter != sharedCounter;
           localDt1SrtClmItemCounter = sharedCounter; return hasModified; 
        }
	    public boolean dt1SrtClmItemIsNumeric() {
	      return decimalIsNumeric(beginDt1SrtClmItem,DT_1_SRT_CLM_ITEM_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int DT_1_SRT_CLM_ITEM_LEN = 2;
  	/**
	 * 	serializeDt1SrtClmItem
	 */
	protected void serializeDt1SrtClmItem(short dt1SrtClmItem) {
		   putDecimal(beginDt1SrtClmItem,dt1SrtClmItem,DT_1_SRT_CLM_ITEM_LEN,true);
   }
   

   protected short checkDt1SrtClmItemMaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshDt1SrtClmItem is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshDt1SrtClmItem() throws CFException {	
   	try { 
		 return (getShortDecimal(beginDt1SrtClmItem,DT_1_SRT_CLM_ITEM_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("dt1SrtClmItem", beginDt1SrtClmItem,DT_1_SRT_CLM_ITEM_LEN);
     }
   	}
     int localDt1SrtSuffixCdCounter = -1;
     public boolean isDt1SrtSuffixCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1SrtSuffixCdCounter != sharedCounter;
         localDt1SrtSuffixCdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dt1SrtSuffixCd
	 *	@return dt1SrtSuffixCd
	 */
	public char[]  getDt1SrtSuffixCdString() {
	     return getCharArray(beginDt1SrtSuffixCd,DT_1_SRT_SUFFIX_CD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dt1SrtSuffixCdIsNumeric() {
	    return isNumeric(beginDt1SrtSuffixCd
	                    ,beginDt1SrtSuffixCd + DT_1_SRT_SUFFIX_CD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DT_1_SRT_SUFFIX_CD_LEN = 2;
  	/**
	 * serializeDt1SrtSuffixCd
	 */
	protected void serializeDt1SrtSuffixCd(int dt1SrtSuffixCd) {
		 putNumber(beginDt1SrtSuffixCd,dt1SrtSuffixCd,DT_1_SRT_SUFFIX_CD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDt1SrtSuffixCdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDt1SrtSuffixCd
	 */
   	protected  int serializeDt1SrtSuffixCd(char[] value) {
	    int  dt1SrtSuffixCd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dt1SrtSuffixCd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginDt1SrtSuffixCd
		       ,2
		      );
		 localDt1SrtSuffixCdCounter = shareString.getSerializedField().getModifiedCounter();
		return  dt1SrtSuffixCd;
    }

   protected int checkDt1SrtSuffixCdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDt1SrtSuffixCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDt1SrtSuffixCd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDt1SrtSuffixCd
			                 ,DT_1_SRT_SUFFIX_CD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dt1SrtSuffixCd", beginDt1SrtSuffixCd,DT_1_SRT_SUFFIX_CD_LEN);
    }
   	}
     int localDt1SrtProviderIdCounter = -1;
     public boolean isDt1SrtProviderIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1SrtProviderIdCounter != sharedCounter;
         localDt1SrtProviderIdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dt1SrtProviderId
	 *	@return dt1SrtProviderId
	 */
	public char[]  getDt1SrtProviderIdString() {
	     return getCharArray(beginDt1SrtProviderId,DT_1_SRT_PROVIDER_ID_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dt1SrtProviderIdIsNumeric() {
	    return isNumeric(beginDt1SrtProviderId
	                    ,beginDt1SrtProviderId + DT_1_SRT_PROVIDER_ID_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DT_1_SRT_PROVIDER_ID_LEN = 15;
  	/**
	 * serializeDt1SrtProviderId
	 */
	protected void serializeDt1SrtProviderId(long dt1SrtProviderId) {
		 putNumber(beginDt1SrtProviderId,dt1SrtProviderId,DT_1_SRT_PROVIDER_ID_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDt1SrtProviderIdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDt1SrtProviderId
	 */
   	protected  long serializeDt1SrtProviderId(char[] value) {
	    long  dt1SrtProviderId;
	    if(value.length >0 && value.length!= 15)
            value = new String(value).trim().toCharArray();
	    if (value.length < 15) value = pad(15, value, ' ', LEFT_PAD);
	    else if (value.length > 15) value = substring(value,0,15);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dt1SrtProviderId = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(15,value,false/*isSigned?*/)
		       ,beginDt1SrtProviderId
		       ,15
		      );
		 localDt1SrtProviderIdCounter = shareString.getSerializedField().getModifiedCounter();
		return  dt1SrtProviderId;
    }

   protected long checkDt1SrtProviderIdMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1P/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDt1SrtProviderId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDt1SrtProviderId() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginDt1SrtProviderId
			                 ,DT_1_SRT_PROVIDER_ID_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dt1SrtProviderId", beginDt1SrtProviderId,DT_1_SRT_PROVIDER_ID_LEN);
    }
   	}
     int localDt1SrtHeaderCtCounter = -1;
     public boolean isDt1SrtHeaderCtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1SrtHeaderCtCounter != sharedCounter;
         localDt1SrtHeaderCtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dt1SrtHeaderCt
	 *	@return dt1SrtHeaderCt
	 */
	public char[]  getDt1SrtHeaderCtString() {
	     return getCharArray(beginDt1SrtHeaderCt,DT_1_SRT_HEADER_CT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dt1SrtHeaderCtIsNumeric() {
	    return isNumeric(beginDt1SrtHeaderCt
	                    ,beginDt1SrtHeaderCt + DT_1_SRT_HEADER_CT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DT_1_SRT_HEADER_CT_LEN = 4;
  	/**
	 * serializeDt1SrtHeaderCt
	 */
	protected void serializeDt1SrtHeaderCt(int dt1SrtHeaderCt) {
		 putNumber(beginDt1SrtHeaderCt,dt1SrtHeaderCt,DT_1_SRT_HEADER_CT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDt1SrtHeaderCtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDt1SrtHeaderCt
	 */
   	protected  int serializeDt1SrtHeaderCt(char[] value) {
	    int  dt1SrtHeaderCt;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dt1SrtHeaderCt = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginDt1SrtHeaderCt
		       ,4
		      );
		 localDt1SrtHeaderCtCounter = shareString.getSerializedField().getModifiedCounter();
		return  dt1SrtHeaderCt;
    }

   protected int checkDt1SrtHeaderCtMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDt1SrtHeaderCt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDt1SrtHeaderCt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDt1SrtHeaderCt
			                 ,DT_1_SRT_HEADER_CT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dt1SrtHeaderCt", beginDt1SrtHeaderCt,DT_1_SRT_HEADER_CT_LEN);
    }
   	}
     int localDt1SrtDivNbrCounter = -1;
     public boolean isDt1SrtDivNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1SrtDivNbrCounter != sharedCounter;
         localDt1SrtDivNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_SRT_DIV_NBR_LEN = 4;
	/**
	 * 	serialize this Dt1SrtDivNbr
	 */
   protected void serializeDt1SrtDivNbr(char[] dt1SrtDivNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1SrtDivNbr,0,getStringValue(),beginDt1SrtDivNbr,DT_1_SRT_DIV_NBR_LEN);
       localDt1SrtDivNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1SrtDivNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshDt1SrtDivNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1SrtDivNbr() {	 
   		return (substring(getStringValue(),beginDt1SrtDivNbr,beginDt1SrtDivNbr + DT_1_SRT_DIV_NBR_LEN));
   	}
     int localDt1SrtClsNbrCounter = -1;
     public boolean isDt1SrtClsNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1SrtClsNbrCounter != sharedCounter;
         localDt1SrtClsNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_SRT_CLS_NBR_LEN = 4;
	/**
	 * 	serialize this Dt1SrtClsNbr
	 */
   protected void serializeDt1SrtClsNbr(char[] dt1SrtClsNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1SrtClsNbr,0,getStringValue(),beginDt1SrtClsNbr,DT_1_SRT_CLS_NBR_LEN);
       localDt1SrtClsNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1SrtClsNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshDt1SrtClsNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1SrtClsNbr() {	 
   		return (substring(getStringValue(),beginDt1SrtClsNbr,beginDt1SrtClsNbr + DT_1_SRT_CLS_NBR_LEN));
   	}




}
  
