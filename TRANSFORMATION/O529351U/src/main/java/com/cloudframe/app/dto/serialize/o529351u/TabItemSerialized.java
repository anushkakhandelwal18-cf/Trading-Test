package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class TabItemSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TabItemSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TabItemSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TAB_ITEM_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginNewTransl;
	
	/**
	* Constructor for TabItemSerialized
	**/
    public TabItemSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for TabItemSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TabItemSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this TabItemSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this TabItemSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in TabItemSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TAB_ITEM_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginNewTransl = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localNewTranslCounter = -1;
     public boolean isNewTranslModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNewTranslCounter != sharedCounter;
         localNewTranslCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of newTransl
	 *	@return newTransl
	 */
	public char[]  getNewTranslString() {
	     return getCharArray(beginNewTransl,NEW_TRANSL_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean newTranslIsNumeric() {
	    return isNumeric(beginNewTransl
	                    ,beginNewTransl + NEW_TRANSL_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NEW_TRANSL_LEN = 6;
  	/**
	 * serializeNewTransl
	 */
	protected void serializeNewTransl(long newTransl) {
		 putNumber(beginNewTransl,newTransl,NEW_TRANSL_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNewTranslCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNewTransl
	 */
   	protected  long serializeNewTransl(char[] value) {
	    long  newTransl;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    newTransl = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginNewTransl
		       ,6
		      );
		 localNewTranslCounter = shareString.getSerializedField().getModifiedCounter();
		return  newTransl;
    }

   protected long checkNewTranslMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshNewTransl is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshNewTransl() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginNewTransl
			                 ,NEW_TRANSL_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("newTransl", beginNewTransl,NEW_TRANSL_LEN);
    }
   	}




}
  
