package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class Dt1SrtFixedAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Dt1SrtFixedAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Dt1SrtFixedAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_1_SRT_FIXED_AREA_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDt1SrtItemCnt;
	
	/**
	* Constructor for Dt1SrtFixedAreaSerialized
	**/
    public Dt1SrtFixedAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Dt1SrtFixedAreaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dt1SrtFixedAreaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Dt1SrtFixedAreaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Dt1SrtFixedAreaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Dt1SrtFixedAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_1_SRT_FIXED_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDt1SrtItemCnt = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDt1SrtItemCntCounter = -1;
     public boolean isDt1SrtItemCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1SrtItemCntCounter != sharedCounter;
         localDt1SrtItemCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of dt1SrtItemCnt
	 *	@return dt1SrtItemCnt
	 */
	public char[]  getDt1SrtItemCntString() {
	     return getCharArray(beginDt1SrtItemCnt,DT_1_SRT_ITEM_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dt1SrtItemCntIsNumeric() {
	    return isNumeric(beginDt1SrtItemCnt
	                    ,beginDt1SrtItemCnt + DT_1_SRT_ITEM_CNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DT_1_SRT_ITEM_CNT_LEN = 4;
  	/**
	 * serializeDt1SrtItemCnt
	 */
	protected void serializeDt1SrtItemCnt(int dt1SrtItemCnt) {
		 putNumber(beginDt1SrtItemCnt,dt1SrtItemCnt,DT_1_SRT_ITEM_CNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDt1SrtItemCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDt1SrtItemCnt
	 */
   	protected  int serializeDt1SrtItemCnt(char[] value) {
	    int  dt1SrtItemCnt;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    dt1SrtItemCnt = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginDt1SrtItemCnt
		       ,4
		      );
		 localDt1SrtItemCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  dt1SrtItemCnt;
    }

   protected int checkDt1SrtItemCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDt1SrtItemCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDt1SrtItemCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDt1SrtItemCnt
			                 ,DT_1_SRT_ITEM_CNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("dt1SrtItemCnt", beginDt1SrtItemCnt,DT_1_SRT_ITEM_CNT_LEN);
    }
   	}




}
  
