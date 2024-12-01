package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class HdPmtiProvXSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HdPmtiProvXSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HdPmtiProvXSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HD_PMTI_PROV_X_LENGTH = 15;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHdPmtiProvSuf;
	
	/**
	* Constructor for HdPmtiProvXSerialized
	**/
    public HdPmtiProvXSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for HdPmtiProvXSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HdPmtiProvXSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this HdPmtiProvXSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,59); // serialize this field at offset 59 by default 
    }
    
	/**
	* sets parent for this HdPmtiProvXSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 59 by default
    }    
	/**
	* initializes the field in HdPmtiProvXSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HD_PMTI_PROV_X_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHdPmtiProvSuf = getStartOffset() + 10;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localHdPmtiProvSufCounter = -1;
     public boolean isHdPmtiProvSufModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHdPmtiProvSufCounter != sharedCounter;
         localHdPmtiProvSufCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of hdPmtiProvSuf
	 *	@return hdPmtiProvSuf
	 */
	public char[]  getHdPmtiProvSufString() {
	     return getCharArray(beginHdPmtiProvSuf,HD_PMTI_PROV_SUF_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean hdPmtiProvSufIsNumeric() {
	    return isNumeric(beginHdPmtiProvSuf
	                    ,beginHdPmtiProvSuf + HD_PMTI_PROV_SUF_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int HD_PMTI_PROV_SUF_LEN = 5;
  	/**
	 * serializeHdPmtiProvSuf
	 */
	protected void serializeHdPmtiProvSuf(long hdPmtiProvSuf) {
		 putNumber(beginHdPmtiProvSuf,hdPmtiProvSuf,HD_PMTI_PROV_SUF_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localHdPmtiProvSufCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeHdPmtiProvSuf
	 */
   	protected  long serializeHdPmtiProvSuf(char[] value) {
	    long  hdPmtiProvSuf;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    hdPmtiProvSuf = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginHdPmtiProvSuf
		       ,5
		      );
		 localHdPmtiProvSufCounter = shareString.getSerializedField().getModifiedCounter();
		return  hdPmtiProvSuf;
    }

   protected long checkHdPmtiProvSufMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshHdPmtiProvSuf is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshHdPmtiProvSuf() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginHdPmtiProvSuf
			                 ,HD_PMTI_PROV_SUF_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("hdPmtiProvSuf", beginHdPmtiProvSuf,HD_PMTI_PROV_SUF_LEN);
    }
   	}




}
  
