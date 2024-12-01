package com.cloudframe.app.dto.serialize.d529351u;

/**
*  The class D51uRetRuleIpaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:50. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class D51uRetRuleIpaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(D51uRetRuleIpaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int D_51U_RET_RULE_IPA_LENGTH = 37;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginD51uRipaSpiTblId;
            protected  int beginD51uRipaDrvPos;
            protected  int beginD51uRipaDrvSvc;
            protected  int beginD51uRipaDrvCau;
            protected  int beginD51uRipaClmIpa1Cd;
            protected  int beginD51uRipaClmIpa2Cd;
            protected  int beginD51uRipaClmIpa3Cd;
            protected  int beginD51uRipaGrpTbl1Nbr;
            protected  int beginD51uRipaGrpTbl2Nbr;
            protected  int beginD51uRipaGrpTbl3Nbr;
	
	/**
	* Constructor for D51uRetRuleIpaSerialized
	**/
    public D51uRetRuleIpaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for D51uRetRuleIpaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uRetRuleIpaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this D51uRetRuleIpaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,633060); // serialize this field at offset 633060 by default 
    }
    
	/**
	* sets parent for this D51uRetRuleIpaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 633060 by default
    }    
	/**
	* initializes the field in D51uRetRuleIpaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(D_51U_RET_RULE_IPA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginD51uRipaSpiTblId = getStartOffset() + 0;	// set offset for serialization
  
             beginD51uRipaDrvPos = getStartOffset() + 7;	// set offset for serialization
  
             beginD51uRipaDrvSvc = getStartOffset() + 9;	// set offset for serialization
  
             beginD51uRipaDrvCau = getStartOffset() + 15;	// set offset for serialization
  
             beginD51uRipaClmIpa1Cd = getStartOffset() + 16;	// set offset for serialization
  
             beginD51uRipaClmIpa2Cd = getStartOffset() + 19;	// set offset for serialization
  
             beginD51uRipaClmIpa3Cd = getStartOffset() + 22;	// set offset for serialization
  
             beginD51uRipaGrpTbl1Nbr = getStartOffset() + 25;	// set offset for serialization
  
             beginD51uRipaGrpTbl2Nbr = getStartOffset() + 29;	// set offset for serialization
  
             beginD51uRipaGrpTbl3Nbr = getStartOffset() + 33;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localD51uRipaSpiTblIdCounter = -1;
     public boolean isD51uRipaSpiTblIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uRipaSpiTblIdCounter != sharedCounter;
         localD51uRipaSpiTblIdCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_RIPA_SPI_TBL_ID_LEN = 7;
	/**
	 * 	serialize this D51uRipaSpiTblId
	 */
   protected void serializeD51uRipaSpiTblId(char[] d51uRipaSpiTblId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uRipaSpiTblId,0,getStringValue(),beginD51uRipaSpiTblId,D_51U_RIPA_SPI_TBL_ID_LEN);
       localD51uRipaSpiTblIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uRipaSpiTblIdConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshD51uRipaSpiTblId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uRipaSpiTblId() {	 
   		return (substring(getStringValue(),beginD51uRipaSpiTblId,beginD51uRipaSpiTblId + D_51U_RIPA_SPI_TBL_ID_LEN));
   	}
     int localD51uRipaDrvPosCounter = -1;
     public boolean isD51uRipaDrvPosModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uRipaDrvPosCounter != sharedCounter;
         localD51uRipaDrvPosCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_RIPA_DRV_POS_LEN = 2;
	/**
	 * 	serialize this D51uRipaDrvPos
	 */
   protected void serializeD51uRipaDrvPos(char[] d51uRipaDrvPos) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uRipaDrvPos,0,getStringValue(),beginD51uRipaDrvPos,D_51U_RIPA_DRV_POS_LEN);
       localD51uRipaDrvPosCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uRipaDrvPosConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshD51uRipaDrvPos is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uRipaDrvPos() {	 
   		return (substring(getStringValue(),beginD51uRipaDrvPos,beginD51uRipaDrvPos + D_51U_RIPA_DRV_POS_LEN));
   	}
     int localD51uRipaDrvSvcCounter = -1;
     public boolean isD51uRipaDrvSvcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uRipaDrvSvcCounter != sharedCounter;
         localD51uRipaDrvSvcCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_RIPA_DRV_SVC_LEN = 6;
	/**
	 * 	serialize this D51uRipaDrvSvc
	 */
   protected void serializeD51uRipaDrvSvc(char[] d51uRipaDrvSvc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uRipaDrvSvc,0,getStringValue(),beginD51uRipaDrvSvc,D_51U_RIPA_DRV_SVC_LEN);
       localD51uRipaDrvSvcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uRipaDrvSvcConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshD51uRipaDrvSvc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uRipaDrvSvc() {	 
   		return (substring(getStringValue(),beginD51uRipaDrvSvc,beginD51uRipaDrvSvc + D_51U_RIPA_DRV_SVC_LEN));
   	}
     int localD51uRipaDrvCauCounter = -1;
     public boolean isD51uRipaDrvCauModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uRipaDrvCauCounter != sharedCounter;
         localD51uRipaDrvCauCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_RIPA_DRV_CAU_LEN = 1;
	/**
	 * 	serialize this D51uRipaDrvCau
	 */
   protected void serializeD51uRipaDrvCau(char[] d51uRipaDrvCau) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uRipaDrvCau,0,getStringValue(),beginD51uRipaDrvCau,D_51U_RIPA_DRV_CAU_LEN);
       localD51uRipaDrvCauCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uRipaDrvCauConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshD51uRipaDrvCau is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uRipaDrvCau() {	 
   		return (substring(getStringValue(),beginD51uRipaDrvCau,beginD51uRipaDrvCau + D_51U_RIPA_DRV_CAU_LEN));
   	}
     int localD51uRipaClmIpa1CdCounter = -1;
     public boolean isD51uRipaClmIpa1CdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uRipaClmIpa1CdCounter != sharedCounter;
         localD51uRipaClmIpa1CdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of d51uRipaClmIpa1Cd
	 *	@return d51uRipaClmIpa1Cd
	 */
	public char[]  getD51uRipaClmIpa1CdString() {
	     return getCharArray(beginD51uRipaClmIpa1Cd,D_51U_RIPA_CLM_IPA_1_CD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean d51uRipaClmIpa1CdIsNumeric() {
	    return isNumeric(beginD51uRipaClmIpa1Cd
	                    ,beginD51uRipaClmIpa1Cd + D_51U_RIPA_CLM_IPA_1_CD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int D_51U_RIPA_CLM_IPA_1_CD_LEN = 3;
  	/**
	 * serializeD51uRipaClmIpa1Cd
	 */
	protected void serializeD51uRipaClmIpa1Cd(int d51uRipaClmIpa1Cd) {
		 putNumber(beginD51uRipaClmIpa1Cd,d51uRipaClmIpa1Cd,D_51U_RIPA_CLM_IPA_1_CD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localD51uRipaClmIpa1CdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeD51uRipaClmIpa1Cd
	 */
   	protected  int serializeD51uRipaClmIpa1Cd(char[] value) {
	    int  d51uRipaClmIpa1Cd;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    d51uRipaClmIpa1Cd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginD51uRipaClmIpa1Cd
		       ,3
		      );
		 localD51uRipaClmIpa1CdCounter = shareString.getSerializedField().getModifiedCounter();
		return  d51uRipaClmIpa1Cd;
    }

   protected int checkD51uRipaClmIpa1CdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshD51uRipaClmIpa1Cd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshD51uRipaClmIpa1Cd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginD51uRipaClmIpa1Cd
			                 ,D_51U_RIPA_CLM_IPA_1_CD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("d51uRipaClmIpa1Cd", beginD51uRipaClmIpa1Cd,D_51U_RIPA_CLM_IPA_1_CD_LEN);
    }
   	}
     int localD51uRipaClmIpa2CdCounter = -1;
     public boolean isD51uRipaClmIpa2CdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uRipaClmIpa2CdCounter != sharedCounter;
         localD51uRipaClmIpa2CdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of d51uRipaClmIpa2Cd
	 *	@return d51uRipaClmIpa2Cd
	 */
	public char[]  getD51uRipaClmIpa2CdString() {
	     return getCharArray(beginD51uRipaClmIpa2Cd,D_51U_RIPA_CLM_IPA_2_CD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean d51uRipaClmIpa2CdIsNumeric() {
	    return isNumeric(beginD51uRipaClmIpa2Cd
	                    ,beginD51uRipaClmIpa2Cd + D_51U_RIPA_CLM_IPA_2_CD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int D_51U_RIPA_CLM_IPA_2_CD_LEN = 3;
  	/**
	 * serializeD51uRipaClmIpa2Cd
	 */
	protected void serializeD51uRipaClmIpa2Cd(int d51uRipaClmIpa2Cd) {
		 putNumber(beginD51uRipaClmIpa2Cd,d51uRipaClmIpa2Cd,D_51U_RIPA_CLM_IPA_2_CD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localD51uRipaClmIpa2CdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeD51uRipaClmIpa2Cd
	 */
   	protected  int serializeD51uRipaClmIpa2Cd(char[] value) {
	    int  d51uRipaClmIpa2Cd;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    d51uRipaClmIpa2Cd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginD51uRipaClmIpa2Cd
		       ,3
		      );
		 localD51uRipaClmIpa2CdCounter = shareString.getSerializedField().getModifiedCounter();
		return  d51uRipaClmIpa2Cd;
    }

   protected int checkD51uRipaClmIpa2CdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshD51uRipaClmIpa2Cd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshD51uRipaClmIpa2Cd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginD51uRipaClmIpa2Cd
			                 ,D_51U_RIPA_CLM_IPA_2_CD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("d51uRipaClmIpa2Cd", beginD51uRipaClmIpa2Cd,D_51U_RIPA_CLM_IPA_2_CD_LEN);
    }
   	}
     int localD51uRipaClmIpa3CdCounter = -1;
     public boolean isD51uRipaClmIpa3CdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uRipaClmIpa3CdCounter != sharedCounter;
         localD51uRipaClmIpa3CdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of d51uRipaClmIpa3Cd
	 *	@return d51uRipaClmIpa3Cd
	 */
	public char[]  getD51uRipaClmIpa3CdString() {
	     return getCharArray(beginD51uRipaClmIpa3Cd,D_51U_RIPA_CLM_IPA_3_CD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean d51uRipaClmIpa3CdIsNumeric() {
	    return isNumeric(beginD51uRipaClmIpa3Cd
	                    ,beginD51uRipaClmIpa3Cd + D_51U_RIPA_CLM_IPA_3_CD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int D_51U_RIPA_CLM_IPA_3_CD_LEN = 3;
  	/**
	 * serializeD51uRipaClmIpa3Cd
	 */
	protected void serializeD51uRipaClmIpa3Cd(int d51uRipaClmIpa3Cd) {
		 putNumber(beginD51uRipaClmIpa3Cd,d51uRipaClmIpa3Cd,D_51U_RIPA_CLM_IPA_3_CD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localD51uRipaClmIpa3CdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeD51uRipaClmIpa3Cd
	 */
   	protected  int serializeD51uRipaClmIpa3Cd(char[] value) {
	    int  d51uRipaClmIpa3Cd;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    d51uRipaClmIpa3Cd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginD51uRipaClmIpa3Cd
		       ,3
		      );
		 localD51uRipaClmIpa3CdCounter = shareString.getSerializedField().getModifiedCounter();
		return  d51uRipaClmIpa3Cd;
    }

   protected int checkD51uRipaClmIpa3CdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshD51uRipaClmIpa3Cd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshD51uRipaClmIpa3Cd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginD51uRipaClmIpa3Cd
			                 ,D_51U_RIPA_CLM_IPA_3_CD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("d51uRipaClmIpa3Cd", beginD51uRipaClmIpa3Cd,D_51U_RIPA_CLM_IPA_3_CD_LEN);
    }
   	}
     int localD51uRipaGrpTbl1NbrCounter = -1;
     public boolean isD51uRipaGrpTbl1NbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uRipaGrpTbl1NbrCounter != sharedCounter;
         localD51uRipaGrpTbl1NbrCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_RIPA_GRP_TBL_1_NBR_LEN = 4;
	/**
	 * 	serialize this D51uRipaGrpTbl1Nbr
	 */
   protected void serializeD51uRipaGrpTbl1Nbr(char[] d51uRipaGrpTbl1Nbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uRipaGrpTbl1Nbr,0,getStringValue(),beginD51uRipaGrpTbl1Nbr,D_51U_RIPA_GRP_TBL_1_NBR_LEN);
       localD51uRipaGrpTbl1NbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uRipaGrpTbl1NbrConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshD51uRipaGrpTbl1Nbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uRipaGrpTbl1Nbr() {	 
   		return (substring(getStringValue(),beginD51uRipaGrpTbl1Nbr,beginD51uRipaGrpTbl1Nbr + D_51U_RIPA_GRP_TBL_1_NBR_LEN));
   	}
     int localD51uRipaGrpTbl2NbrCounter = -1;
     public boolean isD51uRipaGrpTbl2NbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uRipaGrpTbl2NbrCounter != sharedCounter;
         localD51uRipaGrpTbl2NbrCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_RIPA_GRP_TBL_2_NBR_LEN = 4;
	/**
	 * 	serialize this D51uRipaGrpTbl2Nbr
	 */
   protected void serializeD51uRipaGrpTbl2Nbr(char[] d51uRipaGrpTbl2Nbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uRipaGrpTbl2Nbr,0,getStringValue(),beginD51uRipaGrpTbl2Nbr,D_51U_RIPA_GRP_TBL_2_NBR_LEN);
       localD51uRipaGrpTbl2NbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uRipaGrpTbl2NbrConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshD51uRipaGrpTbl2Nbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uRipaGrpTbl2Nbr() {	 
   		return (substring(getStringValue(),beginD51uRipaGrpTbl2Nbr,beginD51uRipaGrpTbl2Nbr + D_51U_RIPA_GRP_TBL_2_NBR_LEN));
   	}
     int localD51uRipaGrpTbl3NbrCounter = -1;
     public boolean isD51uRipaGrpTbl3NbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uRipaGrpTbl3NbrCounter != sharedCounter;
         localD51uRipaGrpTbl3NbrCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_RIPA_GRP_TBL_3_NBR_LEN = 4;
	/**
	 * 	serialize this D51uRipaGrpTbl3Nbr
	 */
   protected void serializeD51uRipaGrpTbl3Nbr(char[] d51uRipaGrpTbl3Nbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uRipaGrpTbl3Nbr,0,getStringValue(),beginD51uRipaGrpTbl3Nbr,D_51U_RIPA_GRP_TBL_3_NBR_LEN);
       localD51uRipaGrpTbl3NbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uRipaGrpTbl3NbrConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshD51uRipaGrpTbl3Nbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uRipaGrpTbl3Nbr() {	 
   		return (substring(getStringValue(),beginD51uRipaGrpTbl3Nbr,beginD51uRipaGrpTbl3Nbr + D_51U_RIPA_GRP_TBL_3_NBR_LEN));
   	}




}
  
