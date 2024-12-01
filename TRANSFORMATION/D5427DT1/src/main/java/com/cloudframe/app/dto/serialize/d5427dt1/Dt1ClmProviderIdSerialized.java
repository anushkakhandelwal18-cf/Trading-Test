package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class Dt1ClmProviderIdSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Dt1ClmProviderIdSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Dt1ClmProviderIdSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_1_CLM_PROVIDER_ID_LENGTH = 15;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDt1ClmProviderPrefix;
            protected  int beginDt1ClmProviderTin;
            protected  int beginDt1ClmProviderSuffix;
	
	/**
	* Constructor for Dt1ClmProviderIdSerialized
	**/
    public Dt1ClmProviderIdSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Dt1ClmProviderIdSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dt1ClmProviderIdSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Dt1ClmProviderIdSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,139); // serialize this field at offset 139 by default 
    }
    
	/**
	* sets parent for this Dt1ClmProviderIdSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 139 by default
    }    
	/**
	* initializes the field in Dt1ClmProviderIdSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_1_CLM_PROVIDER_ID_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDt1ClmProviderPrefix = getStartOffset() + 0;	// set offset for serialization
  
             beginDt1ClmProviderTin = getStartOffset() + 1;	// set offset for serialization
  
             beginDt1ClmProviderSuffix = getStartOffset() + 10;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDt1ClmProviderPrefixCounter = -1;
     public boolean isDt1ClmProviderPrefixModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmProviderPrefixCounter != sharedCounter;
         localDt1ClmProviderPrefixCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dt1ClmProviderPrefix
	 *	@return dt1ClmProviderPrefix
	 */
	public char[]  getDt1ClmProviderPrefixString() {
	     return getCharArray(beginDt1ClmProviderPrefix,DT_1_CLM_PROVIDER_PREFIX_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dt1ClmProviderPrefixIsNumeric() {
	    return isNumeric(beginDt1ClmProviderPrefix
	                    ,beginDt1ClmProviderPrefix + DT_1_CLM_PROVIDER_PREFIX_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DT_1_CLM_PROVIDER_PREFIX_LEN = 1;
  	/**
	 * serializeDt1ClmProviderPrefix
	 */
	protected void serializeDt1ClmProviderPrefix(int dt1ClmProviderPrefix) {
		 putNumber(beginDt1ClmProviderPrefix,dt1ClmProviderPrefix,DT_1_CLM_PROVIDER_PREFIX_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDt1ClmProviderPrefixCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDt1ClmProviderPrefix
	 */
   	protected  int serializeDt1ClmProviderPrefix(char[] value) {
	    int  dt1ClmProviderPrefix;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dt1ClmProviderPrefix = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginDt1ClmProviderPrefix
		       ,1
		      );
		 localDt1ClmProviderPrefixCounter = shareString.getSerializedField().getModifiedCounter();
		return  dt1ClmProviderPrefix;
    }

   protected int checkDt1ClmProviderPrefixMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDt1ClmProviderPrefix is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDt1ClmProviderPrefix() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDt1ClmProviderPrefix
			                 ,DT_1_CLM_PROVIDER_PREFIX_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dt1ClmProviderPrefix", beginDt1ClmProviderPrefix,DT_1_CLM_PROVIDER_PREFIX_LEN);
    }
   	}
     int localDt1ClmProviderTinCounter = -1;
     public boolean isDt1ClmProviderTinModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmProviderTinCounter != sharedCounter;
         localDt1ClmProviderTinCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dt1ClmProviderTin
	 *	@return dt1ClmProviderTin
	 */
	public char[]  getDt1ClmProviderTinString() {
	     return getCharArray(beginDt1ClmProviderTin,DT_1_CLM_PROVIDER_TIN_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dt1ClmProviderTinIsNumeric() {
	    return isNumeric(beginDt1ClmProviderTin
	                    ,beginDt1ClmProviderTin + DT_1_CLM_PROVIDER_TIN_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DT_1_CLM_PROVIDER_TIN_LEN = 9;
  	/**
	 * serializeDt1ClmProviderTin
	 */
	protected void serializeDt1ClmProviderTin(long dt1ClmProviderTin) {
		 putNumber(beginDt1ClmProviderTin,dt1ClmProviderTin,DT_1_CLM_PROVIDER_TIN_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDt1ClmProviderTinCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDt1ClmProviderTin
	 */
   	protected  long serializeDt1ClmProviderTin(char[] value) {
	    long  dt1ClmProviderTin;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dt1ClmProviderTin = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginDt1ClmProviderTin
		       ,9
		      );
		 localDt1ClmProviderTinCounter = shareString.getSerializedField().getModifiedCounter();
		return  dt1ClmProviderTin;
    }

   protected long checkDt1ClmProviderTinMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDt1ClmProviderTin is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDt1ClmProviderTin() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginDt1ClmProviderTin
			                 ,DT_1_CLM_PROVIDER_TIN_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dt1ClmProviderTin", beginDt1ClmProviderTin,DT_1_CLM_PROVIDER_TIN_LEN);
    }
   	}
     int localDt1ClmProviderSuffixCounter = -1;
     public boolean isDt1ClmProviderSuffixModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmProviderSuffixCounter != sharedCounter;
         localDt1ClmProviderSuffixCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dt1ClmProviderSuffix
	 *	@return dt1ClmProviderSuffix
	 */
	public char[]  getDt1ClmProviderSuffixString() {
	     return getCharArray(beginDt1ClmProviderSuffix,DT_1_CLM_PROVIDER_SUFFIX_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dt1ClmProviderSuffixIsNumeric() {
	    return isNumeric(beginDt1ClmProviderSuffix
	                    ,beginDt1ClmProviderSuffix + DT_1_CLM_PROVIDER_SUFFIX_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DT_1_CLM_PROVIDER_SUFFIX_LEN = 5;
  	/**
	 * serializeDt1ClmProviderSuffix
	 */
	protected void serializeDt1ClmProviderSuffix(long dt1ClmProviderSuffix) {
		 putNumber(beginDt1ClmProviderSuffix,dt1ClmProviderSuffix,DT_1_CLM_PROVIDER_SUFFIX_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDt1ClmProviderSuffixCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDt1ClmProviderSuffix
	 */
   	protected  long serializeDt1ClmProviderSuffix(char[] value) {
	    long  dt1ClmProviderSuffix;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dt1ClmProviderSuffix = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginDt1ClmProviderSuffix
		       ,5
		      );
		 localDt1ClmProviderSuffixCounter = shareString.getSerializedField().getModifiedCounter();
		return  dt1ClmProviderSuffix;
    }

   protected long checkDt1ClmProviderSuffixMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDt1ClmProviderSuffix is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDt1ClmProviderSuffix() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginDt1ClmProviderSuffix
			                 ,DT_1_CLM_PROVIDER_SUFFIX_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dt1ClmProviderSuffix", beginDt1ClmProviderSuffix,DT_1_CLM_PROVIDER_SUFFIX_LEN);
    }
   	}




}
  
