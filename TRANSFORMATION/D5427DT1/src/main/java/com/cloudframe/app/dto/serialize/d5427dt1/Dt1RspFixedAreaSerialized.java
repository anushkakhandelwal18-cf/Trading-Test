package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class Dt1RspFixedAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Dt1RspFixedAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Dt1RspFixedAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_1_RSP_FIXED_AREA_LENGTH = 386;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDt1RspViewName;
            protected  int beginDt1RspViewVersion;
            protected  int beginDt1RspEmpid;
            protected  int beginDt1RspPolicy;
            protected  int beginDt1RspDepNbr;
            protected  int beginDt1RspFirstName;
            protected  int beginDt1RspLastName;
            protected  int beginDt1RspRel;
            protected  int beginDt1RspSystem;
            protected  int beginDt1RspPlanVariation;
            protected  int beginDt1RspReportingCode;
            protected  int beginDt1RspFundingResponsibility;
            protected  int beginDt1RspPatPhiInd;
            protected  int beginDt1RspUhpInd;
            protected  int beginDt1RspCcmRelSrvcInd;
            protected  int beginDt1RspCcmPriorAuthInd;
            protected  int beginDt1RspEbrPriorAuthInd;
            protected  int beginDt1RspEbcPriorAuthInd;
            protected  int beginDt1RspOncPolPrtcpCd;
            protected  int beginDt1RspTotalClaimCount;
            protected  int beginDt1RspCurrentClaimCount;
            protected  int beginDt1RspExplCode;
            protected  int beginDt1RspNextKey;
            protected  int beginDt1RspClmContainerName;
            protected  int beginDt1RspClmContainerItemCnt;
            protected  int beginDt1RspClmContainerItemLen;
            protected  int beginDt1RspGenTstPrtcpCd;
            protected  int beginDt1RspSecOpinVendCd;
            protected  int beginDt1RspUgiInd;
            protected  int beginDt1RspLgiInd;
            protected  int beginDt1RspExdInd;
            protected  int beginDt1RspFillerArea;
	
	/**
	* Constructor for Dt1RspFixedAreaSerialized
	**/
    public Dt1RspFixedAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Dt1RspFixedAreaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dt1RspFixedAreaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Dt1RspFixedAreaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Dt1RspFixedAreaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Dt1RspFixedAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_1_RSP_FIXED_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDt1RspViewName = getStartOffset() + 0;	// set offset for serialization
  
             beginDt1RspViewVersion = getStartOffset() + 8;	// set offset for serialization
  
  
             beginDt1RspEmpid = getStartOffset() + 36;	// set offset for serialization
  
             beginDt1RspPolicy = getStartOffset() + 46;	// set offset for serialization
  
             beginDt1RspDepNbr = getStartOffset() + 52;	// set offset for serialization
  
             beginDt1RspFirstName = getStartOffset() + 55;	// set offset for serialization
  
             beginDt1RspLastName = getStartOffset() + 67;	// set offset for serialization
  
             beginDt1RspRel = getStartOffset() + 87;	// set offset for serialization
  
             beginDt1RspSystem = getStartOffset() + 89;	// set offset for serialization
  
             beginDt1RspPlanVariation = getStartOffset() + 90;	// set offset for serialization
  
             beginDt1RspReportingCode = getStartOffset() + 94;	// set offset for serialization
  
             beginDt1RspFundingResponsibility = getStartOffset() + 98;	// set offset for serialization
  
             beginDt1RspPatPhiInd = getStartOffset() + 99;	// set offset for serialization
  
             beginDt1RspUhpInd = getStartOffset() + 100;	// set offset for serialization
  
             beginDt1RspCcmRelSrvcInd = getStartOffset() + 101;	// set offset for serialization
  
             beginDt1RspCcmPriorAuthInd = getStartOffset() + 102;	// set offset for serialization
  
             beginDt1RspEbrPriorAuthInd = getStartOffset() + 103;	// set offset for serialization
  
             beginDt1RspEbcPriorAuthInd = getStartOffset() + 104;	// set offset for serialization
  
             beginDt1RspOncPolPrtcpCd = getStartOffset() + 105;	// set offset for serialization
  
             beginDt1RspTotalClaimCount = getStartOffset() + 106;	// set offset for serialization
  
             beginDt1RspCurrentClaimCount = getStartOffset() + 110;	// set offset for serialization
  
             beginDt1RspExplCode = getStartOffset() + 114;	// set offset for serialization
  
             beginDt1RspNextKey = getStartOffset() + 115;	// set offset for serialization
  
             beginDt1RspClmContainerName = getStartOffset() + 195;	// set offset for serialization
  
             beginDt1RspClmContainerItemCnt = getStartOffset() + 211;	// set offset for serialization
  
             beginDt1RspClmContainerItemLen = getStartOffset() + 219;	// set offset for serialization
  
             beginDt1RspGenTstPrtcpCd = getStartOffset() + 227;	// set offset for serialization
  
             beginDt1RspSecOpinVendCd = getStartOffset() + 228;	// set offset for serialization
  
             beginDt1RspUgiInd = getStartOffset() + 229;	// set offset for serialization
  
             beginDt1RspLgiInd = getStartOffset() + 230;	// set offset for serialization
  
             beginDt1RspExdInd = getStartOffset() + 231;	// set offset for serialization
  
             beginDt1RspFillerArea = getStartOffset() + 232;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDt1RspViewNameCounter = -1;
     public boolean isDt1RspViewNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1RspViewNameCounter != sharedCounter;
         localDt1RspViewNameCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_RSP_VIEW_NAME_LEN = 8;
	/**
	 * 	serialize this Dt1RspViewName
	 */
   protected void serializeDt1RspViewName(char[] dt1RspViewName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1RspViewName,0,getStringValue(),beginDt1RspViewName,DT_1_RSP_VIEW_NAME_LEN);
       localDt1RspViewNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1RspViewNameConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshDt1RspViewName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1RspViewName() {	 
   		return (substring(getStringValue(),beginDt1RspViewName,beginDt1RspViewName + DT_1_RSP_VIEW_NAME_LEN));
   	}
     int localDt1RspViewVersionCounter = -1;
     public boolean isDt1RspViewVersionModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1RspViewVersionCounter != sharedCounter;
         localDt1RspViewVersionCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_RSP_VIEW_VERSION_LEN = 2;
	/**
	 * 	serialize this Dt1RspViewVersion
	 */
   protected void serializeDt1RspViewVersion(char[] dt1RspViewVersion) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1RspViewVersion,0,getStringValue(),beginDt1RspViewVersion,DT_1_RSP_VIEW_VERSION_LEN);
       localDt1RspViewVersionCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1RspViewVersionConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDt1RspViewVersion is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1RspViewVersion() {	 
   		return (substring(getStringValue(),beginDt1RspViewVersion,beginDt1RspViewVersion + DT_1_RSP_VIEW_VERSION_LEN));
   	}
     int localDt1RspEmpidCounter = -1;
     public boolean isDt1RspEmpidModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1RspEmpidCounter != sharedCounter;
         localDt1RspEmpidCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_RSP_EMPID_LEN = 10;
	/**
	 * 	serialize this Dt1RspEmpid
	 */
   protected void serializeDt1RspEmpid(char[] dt1RspEmpid) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1RspEmpid,0,getStringValue(),beginDt1RspEmpid,DT_1_RSP_EMPID_LEN);
       localDt1RspEmpidCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1RspEmpidConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshDt1RspEmpid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1RspEmpid() {	 
   		return (substring(getStringValue(),beginDt1RspEmpid,beginDt1RspEmpid + DT_1_RSP_EMPID_LEN));
   	}
     int localDt1RspPolicyCounter = -1;
     public boolean isDt1RspPolicyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1RspPolicyCounter != sharedCounter;
         localDt1RspPolicyCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_RSP_POLICY_LEN = 6;
	/**
	 * 	serialize this Dt1RspPolicy
	 */
   protected void serializeDt1RspPolicy(char[] dt1RspPolicy) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1RspPolicy,0,getStringValue(),beginDt1RspPolicy,DT_1_RSP_POLICY_LEN);
       localDt1RspPolicyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1RspPolicyConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshDt1RspPolicy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1RspPolicy() {	 
   		return (substring(getStringValue(),beginDt1RspPolicy,beginDt1RspPolicy + DT_1_RSP_POLICY_LEN));
   	}
     int localDt1RspDepNbrCounter = -1;
     public boolean isDt1RspDepNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1RspDepNbrCounter != sharedCounter;
         localDt1RspDepNbrCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dt1RspDepNbr
	 *	@return dt1RspDepNbr
	 */
	public char[]  getDt1RspDepNbrString() {
	     return getCharArray(beginDt1RspDepNbr,DT_1_RSP_DEP_NBR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dt1RspDepNbrIsNumeric() {
	    return isNumeric(beginDt1RspDepNbr
	                    ,beginDt1RspDepNbr + DT_1_RSP_DEP_NBR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DT_1_RSP_DEP_NBR_LEN = 3;
  	/**
	 * serializeDt1RspDepNbr
	 */
	protected void serializeDt1RspDepNbr(int dt1RspDepNbr) {
		 putNumber(beginDt1RspDepNbr,dt1RspDepNbr,DT_1_RSP_DEP_NBR_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDt1RspDepNbrCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDt1RspDepNbr
	 */
   	protected  int serializeDt1RspDepNbr(char[] value) {
	    int  dt1RspDepNbr;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dt1RspDepNbr = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginDt1RspDepNbr
		       ,3
		      );
		 localDt1RspDepNbrCounter = shareString.getSerializedField().getModifiedCounter();
		return  dt1RspDepNbr;
    }

   protected int checkDt1RspDepNbrMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDt1RspDepNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDt1RspDepNbr() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDt1RspDepNbr
			                 ,DT_1_RSP_DEP_NBR_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dt1RspDepNbr", beginDt1RspDepNbr,DT_1_RSP_DEP_NBR_LEN);
    }
   	}
     int localDt1RspFirstNameCounter = -1;
     public boolean isDt1RspFirstNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1RspFirstNameCounter != sharedCounter;
         localDt1RspFirstNameCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_RSP_FIRST_NAME_LEN = 12;
	/**
	 * 	serialize this Dt1RspFirstName
	 */
   protected void serializeDt1RspFirstName(char[] dt1RspFirstName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1RspFirstName,0,getStringValue(),beginDt1RspFirstName,DT_1_RSP_FIRST_NAME_LEN);
       localDt1RspFirstNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1RspFirstNameConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshDt1RspFirstName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1RspFirstName() {	 
   		return (substring(getStringValue(),beginDt1RspFirstName,beginDt1RspFirstName + DT_1_RSP_FIRST_NAME_LEN));
   	}
     int localDt1RspLastNameCounter = -1;
     public boolean isDt1RspLastNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1RspLastNameCounter != sharedCounter;
         localDt1RspLastNameCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_RSP_LAST_NAME_LEN = 20;
	/**
	 * 	serialize this Dt1RspLastName
	 */
   protected void serializeDt1RspLastName(char[] dt1RspLastName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1RspLastName,0,getStringValue(),beginDt1RspLastName,DT_1_RSP_LAST_NAME_LEN);
       localDt1RspLastNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1RspLastNameConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshDt1RspLastName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1RspLastName() {	 
   		return (substring(getStringValue(),beginDt1RspLastName,beginDt1RspLastName + DT_1_RSP_LAST_NAME_LEN));
   	}
     int localDt1RspRelCounter = -1;
     public boolean isDt1RspRelModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1RspRelCounter != sharedCounter;
         localDt1RspRelCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_RSP_REL_LEN = 2;
	/**
	 * 	serialize this Dt1RspRel
	 */
   protected void serializeDt1RspRel(char[] dt1RspRel) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1RspRel,0,getStringValue(),beginDt1RspRel,DT_1_RSP_REL_LEN);
       localDt1RspRelCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1RspRelConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDt1RspRel is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1RspRel() {	 
   		return (substring(getStringValue(),beginDt1RspRel,beginDt1RspRel + DT_1_RSP_REL_LEN));
   	}
     int localDt1RspSystemCounter = -1;
     public boolean isDt1RspSystemModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1RspSystemCounter != sharedCounter;
         localDt1RspSystemCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_RSP_SYSTEM_LEN = 1;
	/**
	 * 	serialize this Dt1RspSystem
	 */
   protected void serializeDt1RspSystem(char[] dt1RspSystem) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1RspSystem,0,getStringValue(),beginDt1RspSystem,DT_1_RSP_SYSTEM_LEN);
       localDt1RspSystemCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1RspSystemConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt1RspSystem is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1RspSystem() {	 
   		return (substring(getStringValue(),beginDt1RspSystem,beginDt1RspSystem + DT_1_RSP_SYSTEM_LEN));
   	}
     int localDt1RspPlanVariationCounter = -1;
     public boolean isDt1RspPlanVariationModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1RspPlanVariationCounter != sharedCounter;
         localDt1RspPlanVariationCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dt1RspPlanVariation
	 *	@return dt1RspPlanVariation
	 */
	public char[]  getDt1RspPlanVariationString() {
	     return getCharArray(beginDt1RspPlanVariation,DT_1_RSP_PLAN_VARIATION_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dt1RspPlanVariationIsNumeric() {
	    return isNumeric(beginDt1RspPlanVariation
	                    ,beginDt1RspPlanVariation + DT_1_RSP_PLAN_VARIATION_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DT_1_RSP_PLAN_VARIATION_LEN = 4;
  	/**
	 * serializeDt1RspPlanVariation
	 */
	protected void serializeDt1RspPlanVariation(int dt1RspPlanVariation) {
		 putNumber(beginDt1RspPlanVariation,dt1RspPlanVariation,DT_1_RSP_PLAN_VARIATION_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDt1RspPlanVariationCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDt1RspPlanVariation
	 */
   	protected  int serializeDt1RspPlanVariation(char[] value) {
	    int  dt1RspPlanVariation;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dt1RspPlanVariation = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginDt1RspPlanVariation
		       ,4
		      );
		 localDt1RspPlanVariationCounter = shareString.getSerializedField().getModifiedCounter();
		return  dt1RspPlanVariation;
    }

   protected int checkDt1RspPlanVariationMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDt1RspPlanVariation is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDt1RspPlanVariation() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDt1RspPlanVariation
			                 ,DT_1_RSP_PLAN_VARIATION_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dt1RspPlanVariation", beginDt1RspPlanVariation,DT_1_RSP_PLAN_VARIATION_LEN);
    }
   	}
     int localDt1RspReportingCodeCounter = -1;
     public boolean isDt1RspReportingCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1RspReportingCodeCounter != sharedCounter;
         localDt1RspReportingCodeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dt1RspReportingCode
	 *	@return dt1RspReportingCode
	 */
	public char[]  getDt1RspReportingCodeString() {
	     return getCharArray(beginDt1RspReportingCode,DT_1_RSP_REPORTING_CODE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dt1RspReportingCodeIsNumeric() {
	    return isNumeric(beginDt1RspReportingCode
	                    ,beginDt1RspReportingCode + DT_1_RSP_REPORTING_CODE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DT_1_RSP_REPORTING_CODE_LEN = 4;
  	/**
	 * serializeDt1RspReportingCode
	 */
	protected void serializeDt1RspReportingCode(int dt1RspReportingCode) {
		 putNumber(beginDt1RspReportingCode,dt1RspReportingCode,DT_1_RSP_REPORTING_CODE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDt1RspReportingCodeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDt1RspReportingCode
	 */
   	protected  int serializeDt1RspReportingCode(char[] value) {
	    int  dt1RspReportingCode;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dt1RspReportingCode = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginDt1RspReportingCode
		       ,4
		      );
		 localDt1RspReportingCodeCounter = shareString.getSerializedField().getModifiedCounter();
		return  dt1RspReportingCode;
    }

   protected int checkDt1RspReportingCodeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDt1RspReportingCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDt1RspReportingCode() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDt1RspReportingCode
			                 ,DT_1_RSP_REPORTING_CODE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dt1RspReportingCode", beginDt1RspReportingCode,DT_1_RSP_REPORTING_CODE_LEN);
    }
   	}
     int localDt1RspFundingResponsibilityCounter = -1;
     public boolean isDt1RspFundingResponsibilityModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1RspFundingResponsibilityCounter != sharedCounter;
         localDt1RspFundingResponsibilityCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_RSP_FUNDING_RESPONSIBILITY_LEN = 1;
	/**
	 * 	serialize this Dt1RspFundingResponsibility
	 */
   protected void serializeDt1RspFundingResponsibility(char[] dt1RspFundingResponsibility) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1RspFundingResponsibility,0,getStringValue(),beginDt1RspFundingResponsibility,DT_1_RSP_FUNDING_RESPONSIBILITY_LEN);
       localDt1RspFundingResponsibilityCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1RspFundingResponsibilityConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt1RspFundingResponsibility is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1RspFundingResponsibility() {	 
   		return (substring(getStringValue(),beginDt1RspFundingResponsibility,beginDt1RspFundingResponsibility + DT_1_RSP_FUNDING_RESPONSIBILITY_LEN));
   	}
     int localDt1RspPatPhiIndCounter = -1;
     public boolean isDt1RspPatPhiIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1RspPatPhiIndCounter != sharedCounter;
         localDt1RspPatPhiIndCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_RSP_PAT_PHI_IND_LEN = 1;
	/**
	 * 	serialize this Dt1RspPatPhiInd
	 */
   protected void serializeDt1RspPatPhiInd(char[] dt1RspPatPhiInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1RspPatPhiInd,0,getStringValue(),beginDt1RspPatPhiInd,DT_1_RSP_PAT_PHI_IND_LEN);
       localDt1RspPatPhiIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1RspPatPhiIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt1RspPatPhiInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1RspPatPhiInd() {	 
   		return (substring(getStringValue(),beginDt1RspPatPhiInd,beginDt1RspPatPhiInd + DT_1_RSP_PAT_PHI_IND_LEN));
   	}
     int localDt1RspUhpIndCounter = -1;
     public boolean isDt1RspUhpIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1RspUhpIndCounter != sharedCounter;
         localDt1RspUhpIndCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_RSP_UHP_IND_LEN = 1;
	/**
	 * 	serialize this Dt1RspUhpInd
	 */
   protected void serializeDt1RspUhpInd(char[] dt1RspUhpInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1RspUhpInd,0,getStringValue(),beginDt1RspUhpInd,DT_1_RSP_UHP_IND_LEN);
       localDt1RspUhpIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1RspUhpIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt1RspUhpInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1RspUhpInd() {	 
   		return (substring(getStringValue(),beginDt1RspUhpInd,beginDt1RspUhpInd + DT_1_RSP_UHP_IND_LEN));
   	}
     int localDt1RspCcmRelSrvcIndCounter = -1;
     public boolean isDt1RspCcmRelSrvcIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1RspCcmRelSrvcIndCounter != sharedCounter;
         localDt1RspCcmRelSrvcIndCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_RSP_CCM_REL_SRVC_IND_LEN = 1;
	/**
	 * 	serialize this Dt1RspCcmRelSrvcInd
	 */
   protected void serializeDt1RspCcmRelSrvcInd(char[] dt1RspCcmRelSrvcInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1RspCcmRelSrvcInd,0,getStringValue(),beginDt1RspCcmRelSrvcInd,DT_1_RSP_CCM_REL_SRVC_IND_LEN);
       localDt1RspCcmRelSrvcIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1RspCcmRelSrvcIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt1RspCcmRelSrvcInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1RspCcmRelSrvcInd() {	 
   		return (substring(getStringValue(),beginDt1RspCcmRelSrvcInd,beginDt1RspCcmRelSrvcInd + DT_1_RSP_CCM_REL_SRVC_IND_LEN));
   	}
     int localDt1RspCcmPriorAuthIndCounter = -1;
     public boolean isDt1RspCcmPriorAuthIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1RspCcmPriorAuthIndCounter != sharedCounter;
         localDt1RspCcmPriorAuthIndCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_RSP_CCM_PRIOR_AUTH_IND_LEN = 1;
	/**
	 * 	serialize this Dt1RspCcmPriorAuthInd
	 */
   protected void serializeDt1RspCcmPriorAuthInd(char[] dt1RspCcmPriorAuthInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1RspCcmPriorAuthInd,0,getStringValue(),beginDt1RspCcmPriorAuthInd,DT_1_RSP_CCM_PRIOR_AUTH_IND_LEN);
       localDt1RspCcmPriorAuthIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1RspCcmPriorAuthIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt1RspCcmPriorAuthInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1RspCcmPriorAuthInd() {	 
   		return (substring(getStringValue(),beginDt1RspCcmPriorAuthInd,beginDt1RspCcmPriorAuthInd + DT_1_RSP_CCM_PRIOR_AUTH_IND_LEN));
   	}
     int localDt1RspEbrPriorAuthIndCounter = -1;
     public boolean isDt1RspEbrPriorAuthIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1RspEbrPriorAuthIndCounter != sharedCounter;
         localDt1RspEbrPriorAuthIndCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_RSP_EBR_PRIOR_AUTH_IND_LEN = 1;
	/**
	 * 	serialize this Dt1RspEbrPriorAuthInd
	 */
   protected void serializeDt1RspEbrPriorAuthInd(char[] dt1RspEbrPriorAuthInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1RspEbrPriorAuthInd,0,getStringValue(),beginDt1RspEbrPriorAuthInd,DT_1_RSP_EBR_PRIOR_AUTH_IND_LEN);
       localDt1RspEbrPriorAuthIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1RspEbrPriorAuthIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt1RspEbrPriorAuthInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1RspEbrPriorAuthInd() {	 
   		return (substring(getStringValue(),beginDt1RspEbrPriorAuthInd,beginDt1RspEbrPriorAuthInd + DT_1_RSP_EBR_PRIOR_AUTH_IND_LEN));
   	}
     int localDt1RspEbcPriorAuthIndCounter = -1;
     public boolean isDt1RspEbcPriorAuthIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1RspEbcPriorAuthIndCounter != sharedCounter;
         localDt1RspEbcPriorAuthIndCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_RSP_EBC_PRIOR_AUTH_IND_LEN = 1;
	/**
	 * 	serialize this Dt1RspEbcPriorAuthInd
	 */
   protected void serializeDt1RspEbcPriorAuthInd(char[] dt1RspEbcPriorAuthInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1RspEbcPriorAuthInd,0,getStringValue(),beginDt1RspEbcPriorAuthInd,DT_1_RSP_EBC_PRIOR_AUTH_IND_LEN);
       localDt1RspEbcPriorAuthIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1RspEbcPriorAuthIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt1RspEbcPriorAuthInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1RspEbcPriorAuthInd() {	 
   		return (substring(getStringValue(),beginDt1RspEbcPriorAuthInd,beginDt1RspEbcPriorAuthInd + DT_1_RSP_EBC_PRIOR_AUTH_IND_LEN));
   	}
     int localDt1RspOncPolPrtcpCdCounter = -1;
     public boolean isDt1RspOncPolPrtcpCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1RspOncPolPrtcpCdCounter != sharedCounter;
         localDt1RspOncPolPrtcpCdCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_RSP_ONC_POL_PRTCP_CD_LEN = 1;
	/**
	 * 	serialize this Dt1RspOncPolPrtcpCd
	 */
   protected void serializeDt1RspOncPolPrtcpCd(char[] dt1RspOncPolPrtcpCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1RspOncPolPrtcpCd,0,getStringValue(),beginDt1RspOncPolPrtcpCd,DT_1_RSP_ONC_POL_PRTCP_CD_LEN);
       localDt1RspOncPolPrtcpCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1RspOncPolPrtcpCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt1RspOncPolPrtcpCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1RspOncPolPrtcpCd() {	 
   		return (substring(getStringValue(),beginDt1RspOncPolPrtcpCd,beginDt1RspOncPolPrtcpCd + DT_1_RSP_ONC_POL_PRTCP_CD_LEN));
   	}
     int localDt1RspTotalClaimCountCounter = -1;
     public boolean isDt1RspTotalClaimCountModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1RspTotalClaimCountCounter != sharedCounter;
         localDt1RspTotalClaimCountCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dt1RspTotalClaimCount
	 *	@return dt1RspTotalClaimCount
	 */
	public char[]  getDt1RspTotalClaimCountString() {
	     return getCharArray(beginDt1RspTotalClaimCount,DT_1_RSP_TOTAL_CLAIM_COUNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dt1RspTotalClaimCountIsNumeric() {
	    return isNumeric(beginDt1RspTotalClaimCount
	                    ,beginDt1RspTotalClaimCount + DT_1_RSP_TOTAL_CLAIM_COUNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DT_1_RSP_TOTAL_CLAIM_COUNT_LEN = 4;
  	/**
	 * serializeDt1RspTotalClaimCount
	 */
	protected void serializeDt1RspTotalClaimCount(int dt1RspTotalClaimCount) {
		 putNumber(beginDt1RspTotalClaimCount,dt1RspTotalClaimCount,DT_1_RSP_TOTAL_CLAIM_COUNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDt1RspTotalClaimCountCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDt1RspTotalClaimCount
	 */
   	protected  int serializeDt1RspTotalClaimCount(char[] value) {
	    int  dt1RspTotalClaimCount;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dt1RspTotalClaimCount = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginDt1RspTotalClaimCount
		       ,4
		      );
		 localDt1RspTotalClaimCountCounter = shareString.getSerializedField().getModifiedCounter();
		return  dt1RspTotalClaimCount;
    }

   protected int checkDt1RspTotalClaimCountMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDt1RspTotalClaimCount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDt1RspTotalClaimCount() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDt1RspTotalClaimCount
			                 ,DT_1_RSP_TOTAL_CLAIM_COUNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dt1RspTotalClaimCount", beginDt1RspTotalClaimCount,DT_1_RSP_TOTAL_CLAIM_COUNT_LEN);
    }
   	}
     int localDt1RspCurrentClaimCountCounter = -1;
     public boolean isDt1RspCurrentClaimCountModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1RspCurrentClaimCountCounter != sharedCounter;
         localDt1RspCurrentClaimCountCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dt1RspCurrentClaimCount
	 *	@return dt1RspCurrentClaimCount
	 */
	public char[]  getDt1RspCurrentClaimCountString() {
	     return getCharArray(beginDt1RspCurrentClaimCount,DT_1_RSP_CURRENT_CLAIM_COUNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dt1RspCurrentClaimCountIsNumeric() {
	    return isNumeric(beginDt1RspCurrentClaimCount
	                    ,beginDt1RspCurrentClaimCount + DT_1_RSP_CURRENT_CLAIM_COUNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DT_1_RSP_CURRENT_CLAIM_COUNT_LEN = 4;
  	/**
	 * serializeDt1RspCurrentClaimCount
	 */
	protected void serializeDt1RspCurrentClaimCount(int dt1RspCurrentClaimCount) {
		 putNumber(beginDt1RspCurrentClaimCount,dt1RspCurrentClaimCount,DT_1_RSP_CURRENT_CLAIM_COUNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDt1RspCurrentClaimCountCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDt1RspCurrentClaimCount
	 */
   	protected  int serializeDt1RspCurrentClaimCount(char[] value) {
	    int  dt1RspCurrentClaimCount;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dt1RspCurrentClaimCount = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginDt1RspCurrentClaimCount
		       ,4
		      );
		 localDt1RspCurrentClaimCountCounter = shareString.getSerializedField().getModifiedCounter();
		return  dt1RspCurrentClaimCount;
    }

   protected int checkDt1RspCurrentClaimCountMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDt1RspCurrentClaimCount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDt1RspCurrentClaimCount() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDt1RspCurrentClaimCount
			                 ,DT_1_RSP_CURRENT_CLAIM_COUNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dt1RspCurrentClaimCount", beginDt1RspCurrentClaimCount,DT_1_RSP_CURRENT_CLAIM_COUNT_LEN);
    }
   	}
     int localDt1RspExplCodeCounter = -1;
     public boolean isDt1RspExplCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1RspExplCodeCounter != sharedCounter;
         localDt1RspExplCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_RSP_EXPL_CODE_LEN = 1;
	/**
	 * 	serialize this Dt1RspExplCode
	 */
   protected void serializeDt1RspExplCode(char[] dt1RspExplCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1RspExplCode,0,getStringValue(),beginDt1RspExplCode,DT_1_RSP_EXPL_CODE_LEN);
       localDt1RspExplCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1RspExplCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt1RspExplCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1RspExplCode() {	 
   		return (substring(getStringValue(),beginDt1RspExplCode,beginDt1RspExplCode + DT_1_RSP_EXPL_CODE_LEN));
   	}
     int localDt1RspNextKeyCounter = -1;
     public boolean isDt1RspNextKeyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1RspNextKeyCounter != sharedCounter;
         localDt1RspNextKeyCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_RSP_NEXT_KEY_LEN = 80;
	/**
	 * 	serialize this Dt1RspNextKey
	 */
   protected void serializeDt1RspNextKey(char[] dt1RspNextKey) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1RspNextKey,0,getStringValue(),beginDt1RspNextKey,DT_1_RSP_NEXT_KEY_LEN);
       localDt1RspNextKeyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1RspNextKeyConstraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
    /**
	 *	refreshDt1RspNextKey is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1RspNextKey() {	 
   		return (substring(getStringValue(),beginDt1RspNextKey,beginDt1RspNextKey + DT_1_RSP_NEXT_KEY_LEN));
   	}
     int localDt1RspClmContainerNameCounter = -1;
     public boolean isDt1RspClmContainerNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1RspClmContainerNameCounter != sharedCounter;
         localDt1RspClmContainerNameCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_RSP_CLM_CONTAINER_NAME_LEN = 16;
	/**
	 * 	serialize this Dt1RspClmContainerName
	 */
   protected void serializeDt1RspClmContainerName(char[] dt1RspClmContainerName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1RspClmContainerName,0,getStringValue(),beginDt1RspClmContainerName,DT_1_RSP_CLM_CONTAINER_NAME_LEN);
       localDt1RspClmContainerNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1RspClmContainerNameConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshDt1RspClmContainerName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1RspClmContainerName() {	 
   		return (substring(getStringValue(),beginDt1RspClmContainerName,beginDt1RspClmContainerName + DT_1_RSP_CLM_CONTAINER_NAME_LEN));
   	}
     int localDt1RspClmContainerItemCntCounter = -1;
     public boolean isDt1RspClmContainerItemCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1RspClmContainerItemCntCounter != sharedCounter;
         localDt1RspClmContainerItemCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dt1RspClmContainerItemCnt
	 *	@return dt1RspClmContainerItemCnt
	 */
	public char[]  getDt1RspClmContainerItemCntString() {
	     return getCharArray(beginDt1RspClmContainerItemCnt,DT_1_RSP_CLM_CONTAINER_ITEM_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dt1RspClmContainerItemCntIsNumeric() {
	    return isNumeric(beginDt1RspClmContainerItemCnt
	                    ,beginDt1RspClmContainerItemCnt + DT_1_RSP_CLM_CONTAINER_ITEM_CNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DT_1_RSP_CLM_CONTAINER_ITEM_CNT_LEN = 8;
  	/**
	 * serializeDt1RspClmContainerItemCnt
	 */
	protected void serializeDt1RspClmContainerItemCnt(long dt1RspClmContainerItemCnt) {
		 putNumber(beginDt1RspClmContainerItemCnt,dt1RspClmContainerItemCnt,DT_1_RSP_CLM_CONTAINER_ITEM_CNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDt1RspClmContainerItemCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDt1RspClmContainerItemCnt
	 */
   	protected  long serializeDt1RspClmContainerItemCnt(char[] value) {
	    long  dt1RspClmContainerItemCnt;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dt1RspClmContainerItemCnt = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginDt1RspClmContainerItemCnt
		       ,8
		      );
		 localDt1RspClmContainerItemCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  dt1RspClmContainerItemCnt;
    }

   protected long checkDt1RspClmContainerItemCntMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDt1RspClmContainerItemCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDt1RspClmContainerItemCnt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginDt1RspClmContainerItemCnt
			                 ,DT_1_RSP_CLM_CONTAINER_ITEM_CNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dt1RspClmContainerItemCnt", beginDt1RspClmContainerItemCnt,DT_1_RSP_CLM_CONTAINER_ITEM_CNT_LEN);
    }
   	}
     int localDt1RspClmContainerItemLenCounter = -1;
     public boolean isDt1RspClmContainerItemLenModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1RspClmContainerItemLenCounter != sharedCounter;
         localDt1RspClmContainerItemLenCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dt1RspClmContainerItemLen
	 *	@return dt1RspClmContainerItemLen
	 */
	public char[]  getDt1RspClmContainerItemLenString() {
	     return getCharArray(beginDt1RspClmContainerItemLen,DT_1_RSP_CLM_CONTAINER_ITEM_LEN_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dt1RspClmContainerItemLenIsNumeric() {
	    return isNumeric(beginDt1RspClmContainerItemLen
	                    ,beginDt1RspClmContainerItemLen + DT_1_RSP_CLM_CONTAINER_ITEM_LEN_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DT_1_RSP_CLM_CONTAINER_ITEM_LEN_LEN = 8;
  	/**
	 * serializeDt1RspClmContainerItemLen
	 */
	protected void serializeDt1RspClmContainerItemLen(long dt1RspClmContainerItemLen) {
		 putNumber(beginDt1RspClmContainerItemLen,dt1RspClmContainerItemLen,DT_1_RSP_CLM_CONTAINER_ITEM_LEN_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDt1RspClmContainerItemLenCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDt1RspClmContainerItemLen
	 */
   	protected  long serializeDt1RspClmContainerItemLen(char[] value) {
	    long  dt1RspClmContainerItemLen;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dt1RspClmContainerItemLen = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginDt1RspClmContainerItemLen
		       ,8
		      );
		 localDt1RspClmContainerItemLenCounter = shareString.getSerializedField().getModifiedCounter();
		return  dt1RspClmContainerItemLen;
    }

   protected long checkDt1RspClmContainerItemLenMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDt1RspClmContainerItemLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDt1RspClmContainerItemLen() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginDt1RspClmContainerItemLen
			                 ,DT_1_RSP_CLM_CONTAINER_ITEM_LEN_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dt1RspClmContainerItemLen", beginDt1RspClmContainerItemLen,DT_1_RSP_CLM_CONTAINER_ITEM_LEN_LEN);
    }
   	}
     int localDt1RspGenTstPrtcpCdCounter = -1;
     public boolean isDt1RspGenTstPrtcpCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1RspGenTstPrtcpCdCounter != sharedCounter;
         localDt1RspGenTstPrtcpCdCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_RSP_GEN_TST_PRTCP_CD_LEN = 1;
	/**
	 * 	serialize this Dt1RspGenTstPrtcpCd
	 */
   protected void serializeDt1RspGenTstPrtcpCd(char[] dt1RspGenTstPrtcpCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1RspGenTstPrtcpCd,0,getStringValue(),beginDt1RspGenTstPrtcpCd,DT_1_RSP_GEN_TST_PRTCP_CD_LEN);
       localDt1RspGenTstPrtcpCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1RspGenTstPrtcpCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt1RspGenTstPrtcpCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1RspGenTstPrtcpCd() {	 
   		return (substring(getStringValue(),beginDt1RspGenTstPrtcpCd,beginDt1RspGenTstPrtcpCd + DT_1_RSP_GEN_TST_PRTCP_CD_LEN));
   	}
     int localDt1RspSecOpinVendCdCounter = -1;
     public boolean isDt1RspSecOpinVendCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1RspSecOpinVendCdCounter != sharedCounter;
         localDt1RspSecOpinVendCdCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_RSP_SEC_OPIN_VEND_CD_LEN = 1;
	/**
	 * 	serialize this Dt1RspSecOpinVendCd
	 */
   protected void serializeDt1RspSecOpinVendCd(char[] dt1RspSecOpinVendCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1RspSecOpinVendCd,0,getStringValue(),beginDt1RspSecOpinVendCd,DT_1_RSP_SEC_OPIN_VEND_CD_LEN);
       localDt1RspSecOpinVendCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1RspSecOpinVendCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt1RspSecOpinVendCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1RspSecOpinVendCd() {	 
   		return (substring(getStringValue(),beginDt1RspSecOpinVendCd,beginDt1RspSecOpinVendCd + DT_1_RSP_SEC_OPIN_VEND_CD_LEN));
   	}
     int localDt1RspUgiIndCounter = -1;
     public boolean isDt1RspUgiIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1RspUgiIndCounter != sharedCounter;
         localDt1RspUgiIndCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_RSP_UGI_IND_LEN = 1;
	/**
	 * 	serialize this Dt1RspUgiInd
	 */
   protected void serializeDt1RspUgiInd(char[] dt1RspUgiInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1RspUgiInd,0,getStringValue(),beginDt1RspUgiInd,DT_1_RSP_UGI_IND_LEN);
       localDt1RspUgiIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1RspUgiIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt1RspUgiInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1RspUgiInd() {	 
   		return (substring(getStringValue(),beginDt1RspUgiInd,beginDt1RspUgiInd + DT_1_RSP_UGI_IND_LEN));
   	}
     int localDt1RspLgiIndCounter = -1;
     public boolean isDt1RspLgiIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1RspLgiIndCounter != sharedCounter;
         localDt1RspLgiIndCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_RSP_LGI_IND_LEN = 1;
	/**
	 * 	serialize this Dt1RspLgiInd
	 */
   protected void serializeDt1RspLgiInd(char[] dt1RspLgiInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1RspLgiInd,0,getStringValue(),beginDt1RspLgiInd,DT_1_RSP_LGI_IND_LEN);
       localDt1RspLgiIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1RspLgiIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt1RspLgiInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1RspLgiInd() {	 
   		return (substring(getStringValue(),beginDt1RspLgiInd,beginDt1RspLgiInd + DT_1_RSP_LGI_IND_LEN));
   	}
     int localDt1RspExdIndCounter = -1;
     public boolean isDt1RspExdIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1RspExdIndCounter != sharedCounter;
         localDt1RspExdIndCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_RSP_EXD_IND_LEN = 1;
	/**
	 * 	serialize this Dt1RspExdInd
	 */
   protected void serializeDt1RspExdInd(char[] dt1RspExdInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1RspExdInd,0,getStringValue(),beginDt1RspExdInd,DT_1_RSP_EXD_IND_LEN);
       localDt1RspExdIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1RspExdIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDt1RspExdInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1RspExdInd() {	 
   		return (substring(getStringValue(),beginDt1RspExdInd,beginDt1RspExdInd + DT_1_RSP_EXD_IND_LEN));
   	}
     int localDt1RspFillerAreaCounter = -1;
     public boolean isDt1RspFillerAreaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1RspFillerAreaCounter != sharedCounter;
         localDt1RspFillerAreaCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_RSP_FILLER_AREA_LEN = 154;
	/**
	 * 	serialize this Dt1RspFillerArea
	 */
   protected void serializeDt1RspFillerArea(char[] dt1RspFillerArea) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1RspFillerArea,0,getStringValue(),beginDt1RspFillerArea,DT_1_RSP_FILLER_AREA_LEN);
       localDt1RspFillerAreaCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1RspFillerAreaConstraints(char[] value) {
   			return super.checkConstraints(value , 154 ,false, false);
   }
    /**
	 *	refreshDt1RspFillerArea is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1RspFillerArea() {	 
   		return (substring(getStringValue(),beginDt1RspFillerArea,beginDt1RspFillerArea + DT_1_RSP_FILLER_AREA_LEN));
   	}




}
  
