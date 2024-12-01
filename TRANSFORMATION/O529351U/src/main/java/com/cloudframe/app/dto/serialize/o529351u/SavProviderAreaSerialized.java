package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class SavProviderAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SavProviderAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SavProviderAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SAV_PROVIDER_AREA_LENGTH = 49;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSavProviderTinNumber;
	
	/**
	* Constructor for SavProviderAreaSerialized
	**/
    public SavProviderAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SavProviderAreaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SavProviderAreaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SavProviderAreaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this SavProviderAreaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in SavProviderAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SAV_PROVIDER_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSavProviderTinNumber = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localSavProviderTinNumberCounter = -1;
     public boolean isSavProviderTinNumberModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSavProviderTinNumberCounter != sharedCounter;
         localSavProviderTinNumberCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of savProviderTinNumber
	 *	@return savProviderTinNumber
	 */
	public char[]  getSavProviderTinNumberString() {
	     return getCharArray(beginSavProviderTinNumber,SAV_PROVIDER_TIN_NUMBER_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean savProviderTinNumberIsNumeric() {
	    return isNumeric(beginSavProviderTinNumber
	                    ,beginSavProviderTinNumber + SAV_PROVIDER_TIN_NUMBER_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SAV_PROVIDER_TIN_NUMBER_LEN = 15;
  	/**
	 * serializeSavProviderTinNumber
	 */
	protected void serializeSavProviderTinNumber(long savProviderTinNumber) {
		 putNumber(beginSavProviderTinNumber,savProviderTinNumber,SAV_PROVIDER_TIN_NUMBER_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSavProviderTinNumberCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSavProviderTinNumber
	 */
   	protected  long serializeSavProviderTinNumber(char[] value) {
	    long  savProviderTinNumber;
	    if(value.length >0 && value.length!= 15)
            value = new String(value).trim().toCharArray();
	    if (value.length < 15) value = pad(15, value, ' ', LEFT_PAD);
	    else if (value.length > 15) value = substring(value,0,15);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    savProviderTinNumber = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(15,value,false/*isSigned?*/)
		       ,beginSavProviderTinNumber
		       ,15
		      );
		 localSavProviderTinNumberCounter = shareString.getSerializedField().getModifiedCounter();
		return  savProviderTinNumber;
    }

   protected long checkSavProviderTinNumberMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1P/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSavProviderTinNumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSavProviderTinNumber() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSavProviderTinNumber
			                 ,SAV_PROVIDER_TIN_NUMBER_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("savProviderTinNumber", beginSavProviderTinNumber,SAV_PROVIDER_TIN_NUMBER_LEN);
    }
   	}




}
  
