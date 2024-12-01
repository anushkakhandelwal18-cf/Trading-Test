package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class Dt1ClmFixedAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Dt1ClmFixedAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Dt1ClmFixedAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_1_CLM_FIXED_AREA_LENGTH = 16;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDt1ClmClmContainerItemCnt;
            protected  int beginDt1ClmClmContainerItemLen;
	
	/**
	* Constructor for Dt1ClmFixedAreaSerialized
	**/
    public Dt1ClmFixedAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Dt1ClmFixedAreaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dt1ClmFixedAreaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Dt1ClmFixedAreaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Dt1ClmFixedAreaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Dt1ClmFixedAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_1_CLM_FIXED_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDt1ClmClmContainerItemCnt = getStartOffset() + 0;	// set offset for serialization
  
             beginDt1ClmClmContainerItemLen = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDt1ClmClmContainerItemCntCounter = -1;
     public boolean isDt1ClmClmContainerItemCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmClmContainerItemCntCounter != sharedCounter;
         localDt1ClmClmContainerItemCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dt1ClmClmContainerItemCnt
	 *	@return dt1ClmClmContainerItemCnt
	 */
	public char[]  getDt1ClmClmContainerItemCntString() {
	     return getCharArray(beginDt1ClmClmContainerItemCnt,DT_1_CLM_CLM_CONTAINER_ITEM_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dt1ClmClmContainerItemCntIsNumeric() {
	    return isNumeric(beginDt1ClmClmContainerItemCnt
	                    ,beginDt1ClmClmContainerItemCnt + DT_1_CLM_CLM_CONTAINER_ITEM_CNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DT_1_CLM_CLM_CONTAINER_ITEM_CNT_LEN = 8;
  	/**
	 * serializeDt1ClmClmContainerItemCnt
	 */
	protected void serializeDt1ClmClmContainerItemCnt(long dt1ClmClmContainerItemCnt) {
		 putNumber(beginDt1ClmClmContainerItemCnt,dt1ClmClmContainerItemCnt,DT_1_CLM_CLM_CONTAINER_ITEM_CNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDt1ClmClmContainerItemCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDt1ClmClmContainerItemCnt
	 */
   	protected  long serializeDt1ClmClmContainerItemCnt(char[] value) {
	    long  dt1ClmClmContainerItemCnt;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dt1ClmClmContainerItemCnt = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginDt1ClmClmContainerItemCnt
		       ,8
		      );
		 localDt1ClmClmContainerItemCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  dt1ClmClmContainerItemCnt;
    }

   protected long checkDt1ClmClmContainerItemCntMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDt1ClmClmContainerItemCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDt1ClmClmContainerItemCnt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginDt1ClmClmContainerItemCnt
			                 ,DT_1_CLM_CLM_CONTAINER_ITEM_CNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dt1ClmClmContainerItemCnt", beginDt1ClmClmContainerItemCnt,DT_1_CLM_CLM_CONTAINER_ITEM_CNT_LEN);
    }
   	}
     int localDt1ClmClmContainerItemLenCounter = -1;
     public boolean isDt1ClmClmContainerItemLenModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClmClmContainerItemLenCounter != sharedCounter;
         localDt1ClmClmContainerItemLenCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dt1ClmClmContainerItemLen
	 *	@return dt1ClmClmContainerItemLen
	 */
	public char[]  getDt1ClmClmContainerItemLenString() {
	     return getCharArray(beginDt1ClmClmContainerItemLen,DT_1_CLM_CLM_CONTAINER_ITEM_LEN_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dt1ClmClmContainerItemLenIsNumeric() {
	    return isNumeric(beginDt1ClmClmContainerItemLen
	                    ,beginDt1ClmClmContainerItemLen + DT_1_CLM_CLM_CONTAINER_ITEM_LEN_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DT_1_CLM_CLM_CONTAINER_ITEM_LEN_LEN = 8;
  	/**
	 * serializeDt1ClmClmContainerItemLen
	 */
	protected void serializeDt1ClmClmContainerItemLen(long dt1ClmClmContainerItemLen) {
		 putNumber(beginDt1ClmClmContainerItemLen,dt1ClmClmContainerItemLen,DT_1_CLM_CLM_CONTAINER_ITEM_LEN_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDt1ClmClmContainerItemLenCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDt1ClmClmContainerItemLen
	 */
   	protected  long serializeDt1ClmClmContainerItemLen(char[] value) {
	    long  dt1ClmClmContainerItemLen;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dt1ClmClmContainerItemLen = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginDt1ClmClmContainerItemLen
		       ,8
		      );
		 localDt1ClmClmContainerItemLenCounter = shareString.getSerializedField().getModifiedCounter();
		return  dt1ClmClmContainerItemLen;
    }

   protected long checkDt1ClmClmContainerItemLenMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDt1ClmClmContainerItemLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDt1ClmClmContainerItemLen() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginDt1ClmClmContainerItemLen
			                 ,DT_1_CLM_CLM_CONTAINER_ITEM_LEN_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dt1ClmClmContainerItemLen", beginDt1ClmClmContainerItemLen,DT_1_CLM_CLM_CONTAINER_ITEM_LEN_LEN);
    }
   	}




}
  
