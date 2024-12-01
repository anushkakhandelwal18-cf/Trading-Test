package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class StsResponseVarsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class StsResponseVarsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(StsResponseVarsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int STS_RESPONSE_VARS_LENGTH = 298;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginStsRespMessageType;
            protected  int beginStsRespAdditionalInfo1;
            protected  int beginStsRespAdditionalInfo2;
            protected  int beginStsRespDataValue;
            protected  int beginStsCicsresp;
            protected  int beginStsCicsresp2;
            protected  int beginStsEibtaskn;
            protected  int beginStsSqlcode;
            protected  int beginStsSqlstate;
            protected  int beginStsParagraph;
	
	/**
	* Constructor for StsResponseVarsSerialized
	**/
    public StsResponseVarsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for StsResponseVarsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public StsResponseVarsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this StsResponseVarsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,12); // serialize this field at offset 12 by default 
    }
    
	/**
	* sets parent for this StsResponseVarsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 12 by default
    }    
	/**
	* initializes the field in StsResponseVarsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(STS_RESPONSE_VARS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginStsRespMessageType = getStartOffset() + 0;	// set offset for serialization
  
             beginStsRespAdditionalInfo1 = getStartOffset() + 1;	// set offset for serialization
  
             beginStsRespAdditionalInfo2 = getStartOffset() + 101;	// set offset for serialization
  
             beginStsRespDataValue = getStartOffset() + 201;	// set offset for serialization
  
             beginStsCicsresp = getStartOffset() + 231;	// set offset for serialization
  
             beginStsCicsresp2 = getStartOffset() + 239;	// set offset for serialization
  
             beginStsEibtaskn = getStartOffset() + 247;	// set offset for serialization
  
             beginStsSqlcode = getStartOffset() + 254;	// set offset for serialization
  
             beginStsSqlstate = getStartOffset() + 263;	// set offset for serialization
  
             beginStsParagraph = getStartOffset() + 268;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localStsRespMessageTypeCounter = -1;
     public boolean isStsRespMessageTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStsRespMessageTypeCounter != sharedCounter;
         localStsRespMessageTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int STS_RESP_MESSAGE_TYPE_LEN = 1;
	/**
	 * 	serialize this StsRespMessageType
	 */
   protected void serializeStsRespMessageType(char[] stsRespMessageType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(stsRespMessageType,0,getStringValue(),beginStsRespMessageType,STS_RESP_MESSAGE_TYPE_LEN);
       localStsRespMessageTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkStsRespMessageTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshStsRespMessageType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshStsRespMessageType() {	 
   		return (substring(getStringValue(),beginStsRespMessageType,beginStsRespMessageType + STS_RESP_MESSAGE_TYPE_LEN));
   	}
     int localStsRespAdditionalInfo1Counter = -1;
     public boolean isStsRespAdditionalInfo1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStsRespAdditionalInfo1Counter != sharedCounter;
         localStsRespAdditionalInfo1Counter = sharedCounter; return hasModified;
     }
	protected static final int STS_RESP_ADDITIONAL_INFO_1_LEN = 100;
	/**
	 * 	serialize this StsRespAdditionalInfo1
	 */
   protected void serializeStsRespAdditionalInfo1(char[] stsRespAdditionalInfo1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(stsRespAdditionalInfo1,0,getStringValue(),beginStsRespAdditionalInfo1,STS_RESP_ADDITIONAL_INFO_1_LEN);
       localStsRespAdditionalInfo1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkStsRespAdditionalInfo1Constraints(char[] value) {
   			return super.checkConstraints(value , 100 ,false, false);
   }
    /**
	 *	refreshStsRespAdditionalInfo1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshStsRespAdditionalInfo1() {	 
   		return (substring(getStringValue(),beginStsRespAdditionalInfo1,beginStsRespAdditionalInfo1 + STS_RESP_ADDITIONAL_INFO_1_LEN));
   	}
     int localStsRespAdditionalInfo2Counter = -1;
     public boolean isStsRespAdditionalInfo2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStsRespAdditionalInfo2Counter != sharedCounter;
         localStsRespAdditionalInfo2Counter = sharedCounter; return hasModified;
     }
	protected static final int STS_RESP_ADDITIONAL_INFO_2_LEN = 100;
	/**
	 * 	serialize this StsRespAdditionalInfo2
	 */
   protected void serializeStsRespAdditionalInfo2(char[] stsRespAdditionalInfo2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(stsRespAdditionalInfo2,0,getStringValue(),beginStsRespAdditionalInfo2,STS_RESP_ADDITIONAL_INFO_2_LEN);
       localStsRespAdditionalInfo2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkStsRespAdditionalInfo2Constraints(char[] value) {
   			return super.checkConstraints(value , 100 ,false, false);
   }
    /**
	 *	refreshStsRespAdditionalInfo2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshStsRespAdditionalInfo2() {	 
   		return (substring(getStringValue(),beginStsRespAdditionalInfo2,beginStsRespAdditionalInfo2 + STS_RESP_ADDITIONAL_INFO_2_LEN));
   	}
     int localStsRespDataValueCounter = -1;
     public boolean isStsRespDataValueModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStsRespDataValueCounter != sharedCounter;
         localStsRespDataValueCounter = sharedCounter; return hasModified;
     }
	protected static final int STS_RESP_DATA_VALUE_LEN = 30;
	/**
	 * 	serialize this StsRespDataValue
	 */
   protected void serializeStsRespDataValue(char[] stsRespDataValue) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(stsRespDataValue,0,getStringValue(),beginStsRespDataValue,STS_RESP_DATA_VALUE_LEN);
       localStsRespDataValueCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkStsRespDataValueConstraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshStsRespDataValue is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshStsRespDataValue() {	 
   		return (substring(getStringValue(),beginStsRespDataValue,beginStsRespDataValue + STS_RESP_DATA_VALUE_LEN));
   	}
     int localStsCicsrespCounter = -1;
     public boolean isStsCicsrespModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStsCicsrespCounter != sharedCounter;
         localStsCicsrespCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of stsCicsresp
	 *	@return stsCicsresp
	 */
	public char[]  getStsCicsrespString() {
	     return getCharArray(beginStsCicsresp,STS_CICSRESP_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean stsCicsrespIsNumeric() {
	    return isNumeric(beginStsCicsresp
	                    ,beginStsCicsresp + STS_CICSRESP_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int STS_CICSRESP_LEN = 8;
  	/**
	 * serializeStsCicsresp
	 */
	protected void serializeStsCicsresp(long stsCicsresp) {
		 putNumber(beginStsCicsresp,stsCicsresp,STS_CICSRESP_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localStsCicsrespCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeStsCicsresp
	 */
   	protected  long serializeStsCicsresp(char[] value) {
	    long  stsCicsresp;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    stsCicsresp = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginStsCicsresp
		       ,8
		      );
		 localStsCicsrespCounter = shareString.getSerializedField().getModifiedCounter();
		return  stsCicsresp;
    }

   protected long checkStsCicsrespMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshStsCicsresp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshStsCicsresp() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginStsCicsresp
			                 ,STS_CICSRESP_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("stsCicsresp", beginStsCicsresp,STS_CICSRESP_LEN);
    }
   	}
     int localStsCicsresp2Counter = -1;
     public boolean isStsCicsresp2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStsCicsresp2Counter != sharedCounter;
         localStsCicsresp2Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of stsCicsresp2
	 *	@return stsCicsresp2
	 */
	public char[]  getStsCicsresp2String() {
	     return getCharArray(beginStsCicsresp2,STS_CICSRESP_2_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean stsCicsresp2IsNumeric() {
	    return isNumeric(beginStsCicsresp2
	                    ,beginStsCicsresp2 + STS_CICSRESP_2_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int STS_CICSRESP_2_LEN = 8;
  	/**
	 * serializeStsCicsresp2
	 */
	protected void serializeStsCicsresp2(long stsCicsresp2) {
		 putNumber(beginStsCicsresp2,stsCicsresp2,STS_CICSRESP_2_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localStsCicsresp2Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeStsCicsresp2
	 */
   	protected  long serializeStsCicsresp2(char[] value) {
	    long  stsCicsresp2;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    stsCicsresp2 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginStsCicsresp2
		       ,8
		      );
		 localStsCicsresp2Counter = shareString.getSerializedField().getModifiedCounter();
		return  stsCicsresp2;
    }

   protected long checkStsCicsresp2MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshStsCicsresp2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshStsCicsresp2() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginStsCicsresp2
			                 ,STS_CICSRESP_2_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("stsCicsresp2", beginStsCicsresp2,STS_CICSRESP_2_LEN);
    }
   	}
     int localStsEibtasknCounter = -1;
     public boolean isStsEibtasknModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStsEibtasknCounter != sharedCounter;
         localStsEibtasknCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of stsEibtaskn
	 *	@return stsEibtaskn
	 */
	public char[]  getStsEibtasknString() {
	     return getCharArray(beginStsEibtaskn,STS_EIBTASKN_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean stsEibtasknIsNumeric() {
	    return isNumeric(beginStsEibtaskn
	                    ,beginStsEibtaskn + STS_EIBTASKN_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int STS_EIBTASKN_LEN = 7;
  	/**
	 * serializeStsEibtaskn
	 */
	protected void serializeStsEibtaskn(long stsEibtaskn) {
		 putNumber(beginStsEibtaskn,stsEibtaskn,STS_EIBTASKN_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localStsEibtasknCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeStsEibtaskn
	 */
   	protected  long serializeStsEibtaskn(char[] value) {
	    long  stsEibtaskn;
	    if(value.length >0 && value.length!= 7)
            value = new String(value).trim().toCharArray();
	    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
	    else if (value.length > 7) value = substring(value,0,7);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    stsEibtaskn = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(7,value,false/*isSigned?*/)
		       ,beginStsEibtaskn
		       ,7
		      );
		 localStsEibtasknCounter = shareString.getSerializedField().getModifiedCounter();
		return  stsEibtaskn;
    }

   protected long checkStsEibtasknMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshStsEibtaskn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshStsEibtaskn() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginStsEibtaskn
			                 ,STS_EIBTASKN_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("stsEibtaskn", beginStsEibtaskn,STS_EIBTASKN_LEN);
    }
   	}
     int localStsSqlcodeCounter = -1;
     public boolean isStsSqlcodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStsSqlcodeCounter != sharedCounter;
         localStsSqlcodeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of stsSqlcode
	 *	@return stsSqlcode
	 */
	public char[]  getStsSqlcodeString() {
	     return getCharArray(beginStsSqlcode,STS_SQLCODE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean stsSqlcodeIsNumeric() {
	    return isNumeric(beginStsSqlcode
	                    ,beginStsSqlcode + STS_SQLCODE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int STS_SQLCODE_LEN = 9;
  	/**
	 * serializeStsSqlcode
	 */
	protected void serializeStsSqlcode(long stsSqlcode) {
		 putNumber(beginStsSqlcode,stsSqlcode,STS_SQLCODE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localStsSqlcodeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeStsSqlcode
	 */
   	protected  long serializeStsSqlcode(char[] value) {
	    long  stsSqlcode;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    stsSqlcode = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginStsSqlcode
		       ,9
		      );
		 localStsSqlcodeCounter = shareString.getSerializedField().getModifiedCounter();
		return  stsSqlcode;
    }

   protected long checkStsSqlcodeMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshStsSqlcode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshStsSqlcode() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginStsSqlcode
			                 ,STS_SQLCODE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("stsSqlcode", beginStsSqlcode,STS_SQLCODE_LEN);
    }
   	}
     int localStsSqlstateCounter = -1;
     public boolean isStsSqlstateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStsSqlstateCounter != sharedCounter;
         localStsSqlstateCounter = sharedCounter; return hasModified;
     }
	protected static final int STS_SQLSTATE_LEN = 5;
	/**
	 * 	serialize this StsSqlstate
	 */
   protected void serializeStsSqlstate(char[] stsSqlstate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(stsSqlstate,0,getStringValue(),beginStsSqlstate,STS_SQLSTATE_LEN);
       localStsSqlstateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkStsSqlstateConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshStsSqlstate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshStsSqlstate() {	 
   		return (substring(getStringValue(),beginStsSqlstate,beginStsSqlstate + STS_SQLSTATE_LEN));
   	}
     int localStsParagraphCounter = -1;
     public boolean isStsParagraphModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStsParagraphCounter != sharedCounter;
         localStsParagraphCounter = sharedCounter; return hasModified;
     }
	protected static final int STS_PARAGRAPH_LEN = 30;
	/**
	 * 	serialize this StsParagraph
	 */
   protected void serializeStsParagraph(char[] stsParagraph) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(stsParagraph,0,getStringValue(),beginStsParagraph,STS_PARAGRAPH_LEN);
       localStsParagraphCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkStsParagraphConstraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshStsParagraph is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshStsParagraph() {	 
   		return (substring(getStringValue(),beginStsParagraph,beginStsParagraph + STS_PARAGRAPH_LEN));
   	}




}
  
