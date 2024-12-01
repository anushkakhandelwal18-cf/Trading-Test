package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class SavProviderTinNumber15Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SavProviderTinNumber15Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SavProviderTinNumber15Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SAV_PROVIDER_TIN_NUMBER_15_LENGTH = 15;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSavProviderSuffix;
	
	/**
	* Constructor for SavProviderTinNumber15Serialized
	**/
    public SavProviderTinNumber15Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SavProviderTinNumber15Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SavProviderTinNumber15Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SavProviderTinNumber15Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this SavProviderTinNumber15Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in SavProviderTinNumber15Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SAV_PROVIDER_TIN_NUMBER_15_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSavProviderSuffix = getStartOffset() + 10;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSavProviderSuffixCounter = -1;
     public boolean isSavProviderSuffixModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSavProviderSuffixCounter != sharedCounter;
         localSavProviderSuffixCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of savProviderSuffix
	 *	@return savProviderSuffix
	 */
	public char[]  getSavProviderSuffixString() {
	     return getCharArray(beginSavProviderSuffix,SAV_PROVIDER_SUFFIX_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean savProviderSuffixIsNumeric() {
	    return isNumeric(beginSavProviderSuffix
	                    ,beginSavProviderSuffix + SAV_PROVIDER_SUFFIX_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SAV_PROVIDER_SUFFIX_LEN = 5;
  	/**
	 * serializeSavProviderSuffix
	 */
	protected void serializeSavProviderSuffix(long savProviderSuffix) {
		 putNumber(beginSavProviderSuffix,savProviderSuffix,SAV_PROVIDER_SUFFIX_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSavProviderSuffixCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSavProviderSuffix
	 */
   	protected  long serializeSavProviderSuffix(char[] value) {
	    long  savProviderSuffix;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    savProviderSuffix = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginSavProviderSuffix
		       ,5
		      );
		 localSavProviderSuffixCounter = shareString.getSerializedField().getModifiedCounter();
		return  savProviderSuffix;
    }

   protected long checkSavProviderSuffixMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSavProviderSuffix is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSavProviderSuffix() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSavProviderSuffix
			                 ,SAV_PROVIDER_SUFFIX_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("savProviderSuffix", beginSavProviderSuffix,SAV_PROVIDER_SUFFIX_LEN);
    }
   	}




}
  
