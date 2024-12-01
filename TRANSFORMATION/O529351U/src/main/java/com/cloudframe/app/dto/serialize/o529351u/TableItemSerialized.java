package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class TableItemSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TableItemSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TableItemSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TABLE_ITEM_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginGenericTransl;
	
	/**
	* Constructor for TableItemSerialized
	**/
    public TableItemSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for TableItemSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TableItemSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this TableItemSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this TableItemSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in TableItemSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TABLE_ITEM_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginGenericTransl = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localGenericTranslCounter = -1;
     public boolean isGenericTranslModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGenericTranslCounter != sharedCounter;
         localGenericTranslCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of genericTransl
	 *	@return genericTransl
	 */
	public char[]  getGenericTranslString() {
	     return getCharArray(beginGenericTransl,GENERIC_TRANSL_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean genericTranslIsNumeric() {
	    return isNumeric(beginGenericTransl
	                    ,beginGenericTransl + GENERIC_TRANSL_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int GENERIC_TRANSL_LEN = 6;
  	/**
	 * serializeGenericTransl
	 */
	protected void serializeGenericTransl(long genericTransl) {
		 putNumber(beginGenericTransl,genericTransl,GENERIC_TRANSL_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localGenericTranslCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeGenericTransl
	 */
   	protected  long serializeGenericTransl(char[] value) {
	    long  genericTransl;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    genericTransl = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginGenericTransl
		       ,6
		      );
		 localGenericTranslCounter = shareString.getSerializedField().getModifiedCounter();
		return  genericTransl;
    }

   protected long checkGenericTranslMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshGenericTransl is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshGenericTransl() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginGenericTransl
			                 ,GENERIC_TRANSL_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("genericTransl", beginGenericTransl,GENERIC_TRANSL_LEN);
    }
   	}




}
  
