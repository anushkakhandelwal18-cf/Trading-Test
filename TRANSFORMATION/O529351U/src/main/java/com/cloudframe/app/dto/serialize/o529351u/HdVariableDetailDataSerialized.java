package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class HdVariableDetailDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HdVariableDetailDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HdVariableDetailDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HD_VARIABLE_DETAIL_DATA_LENGTH = 1383;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHdPmtiTin;
	
	/**
	* Constructor for HdVariableDetailDataSerialized
	**/
    public HdVariableDetailDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for HdVariableDetailDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HdVariableDetailDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this HdVariableDetailDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,31); // serialize this field at offset 31 by default 
    }
    
	/**
	* sets parent for this HdVariableDetailDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 31 by default
    }    
	/**
	* initializes the field in HdVariableDetailDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HD_VARIABLE_DETAIL_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginHdPmtiTin = getStartOffset() + 28;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localHdPmtiTinCounter = -1;
     public boolean isHdPmtiTinModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHdPmtiTinCounter != sharedCounter;
         localHdPmtiTinCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of hdPmtiTin
	 *	@return hdPmtiTin
	 */
	public char[]  getHdPmtiTinString() {
	     return getCharArray(beginHdPmtiTin,HD_PMTI_TIN_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean hdPmtiTinIsNumeric() {
	    return isNumeric(beginHdPmtiTin
	                    ,beginHdPmtiTin + HD_PMTI_TIN_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int HD_PMTI_TIN_LEN = 13;
  	/**
	 * serializeHdPmtiTin
	 */
	protected void serializeHdPmtiTin(long hdPmtiTin) {
		 putNumber(beginHdPmtiTin,hdPmtiTin,HD_PMTI_TIN_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localHdPmtiTinCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeHdPmtiTin
	 */
   	protected  long serializeHdPmtiTin(char[] value) {
	    long  hdPmtiTin;
	    if(value.length >0 && value.length!= 13)
            value = new String(value).trim().toCharArray();
	    if (value.length < 13) value = pad(13, value, ' ', LEFT_PAD);
	    else if (value.length > 13) value = substring(value,0,13);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    hdPmtiTin = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(13,value,false/*isSigned?*/)
		       ,beginHdPmtiTin
		       ,13
		      );
		 localHdPmtiTinCounter = shareString.getSerializedField().getModifiedCounter();
		return  hdPmtiTin;
    }

   protected long checkHdPmtiTinMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshHdPmtiTin is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshHdPmtiTin() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginHdPmtiTin
			                 ,HD_PMTI_TIN_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("hdPmtiTin", beginHdPmtiTin,HD_PMTI_TIN_LEN);
    }
   	}




}
  
