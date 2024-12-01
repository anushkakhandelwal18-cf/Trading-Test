package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class FesrIpaCodeSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FesrIpaCodeSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FesrIpaCodeSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FESR_IPA_CODE_LENGTH = 3;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFesrIpaCd;
	
	/**
	* Constructor for FesrIpaCodeSerialized
	**/
    public FesrIpaCodeSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for FesrIpaCodeSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FesrIpaCodeSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this FesrIpaCodeSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,4254); // serialize this field at offset 4254 by default 
    }
    
	/**
	* sets parent for this FesrIpaCodeSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 4254 by default
    }    
	/**
	* initializes the field in FesrIpaCodeSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FESR_IPA_CODE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFesrIpaCd = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFesrIpaCdCounter = -1;
     public boolean isFesrIpaCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFesrIpaCdCounter != sharedCounter;
         localFesrIpaCdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of fesrIpaCd
	 *	@return fesrIpaCd
	 */
	public char[]  getFesrIpaCdString() {
	     return getCharArray(beginFesrIpaCd,FESR_IPA_CD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean fesrIpaCdIsNumeric() {
	    return isNumeric(beginFesrIpaCd
	                    ,beginFesrIpaCd + FESR_IPA_CD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FESR_IPA_CD_LEN = 3;
  	/**
	 * serializeFesrIpaCd
	 */
	protected void serializeFesrIpaCd(int fesrIpaCd) {
		 putNumber(beginFesrIpaCd,fesrIpaCd,FESR_IPA_CD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFesrIpaCdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFesrIpaCd
	 */
   	protected  int serializeFesrIpaCd(char[] value) {
	    int  fesrIpaCd;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    fesrIpaCd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginFesrIpaCd
		       ,3
		      );
		 localFesrIpaCdCounter = shareString.getSerializedField().getModifiedCounter();
		return  fesrIpaCd;
    }

   protected int checkFesrIpaCdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshFesrIpaCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFesrIpaCd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginFesrIpaCd
			                 ,FESR_IPA_CD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("fesrIpaCd", beginFesrIpaCd,FESR_IPA_CD_LEN);
    }
   	}




}
  
