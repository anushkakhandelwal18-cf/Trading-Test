package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class CkServClsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CkServClsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CkServClsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CK_SERV_CLS_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCls15;
	
	/**
	* Constructor for CkServClsSerialized
	**/
    public CkServClsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CkServClsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CkServClsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CkServClsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,200175); // serialize this field at offset 200175 by default 
    }
    
	/**
	* sets parent for this CkServClsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 200175 by default
    }    
	/**
	* initializes the field in CkServClsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CK_SERV_CLS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCls15 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCls15Counter = -1;
     public boolean isCls15Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCls15Counter != sharedCounter;
         localCls15Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cls15
	 *	@return cls15
	 */
	public char[]  getCls15String() {
	     return getCharArray(beginCls15,CLS_15_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cls15IsNumeric() {
	    return isNumeric(beginCls15
	                    ,beginCls15 + CLS_15_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CLS_15_LEN = 5;
  	/**
	 * serializeCls15
	 */
	protected void serializeCls15(long cls15) {
		 putNumber(beginCls15,cls15,CLS_15_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCls15Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCls15
	 */
   	protected  long serializeCls15(char[] value) {
	    long  cls15;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cls15 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginCls15
		       ,5
		      );
		 localCls15Counter = shareString.getSerializedField().getModifiedCounter();
		return  cls15;
    }

   protected long checkCls15MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCls15 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshCls15() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginCls15
			                 ,CLS_15_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cls15", beginCls15,CLS_15_LEN);
    }
   	}




}
  
