package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class QueryTextAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class QueryTextAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(QueryTextAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int QUERY_TEXT_AREA_LENGTH = 32002;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginQueryTextLeng;
            protected  int beginQueryTextData;
	
	/**
	* Constructor for QueryTextAreaSerialized
	**/
    public QueryTextAreaSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in QueryTextAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(QUERY_TEXT_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginQueryTextLeng = getStartOffset() + 0;	// set offset for serialization
  
             beginQueryTextData = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localQueryTextLengCounter = -1;
         public boolean isQueryTextLengModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localQueryTextLengCounter != sharedCounter;
            localQueryTextLengCounter = sharedCounter; return hasModified; 
         }
   protected static final int QUERY_TEXT_LENG_LEN = 2;
  	/**
	 * serializeQueryTextLeng
	 */
	protected void serializeQueryTextLeng(short queryTextLeng) {
           replaceValue( //  save the value as string
                   getBinaryString( queryTextLeng,QUERY_TEXT_LENG_LEN)
                  ,beginQueryTextLeng
                  ,QUERY_TEXT_LENG_LEN
                 );
            localQueryTextLengCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkQueryTextLengMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshQueryTextLeng is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshQueryTextLeng() {	 
			return (getShort(beginQueryTextLeng));
   	}
     int localQueryTextDataCounter = -1;
     public boolean isQueryTextDataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localQueryTextDataCounter != sharedCounter;
         localQueryTextDataCounter = sharedCounter; return hasModified;
     }
	protected static final int QUERY_TEXT_DATA_LEN = 32000;
	/**
	 * 	serialize this QueryTextData
	 */
   protected void serializeQueryTextData(char[] queryTextData) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(queryTextData,0,getStringValue(),beginQueryTextData,QUERY_TEXT_DATA_LEN);
       localQueryTextDataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkQueryTextDataConstraints(char[] value) {
   			return super.checkConstraints(value , 32000 ,false, false);
   }
    /**
	 *	refreshQueryTextData is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshQueryTextData() {	 
   		return (substring(getStringValue(),beginQueryTextData,beginQueryTextData + QUERY_TEXT_DATA_LEN));
   	}




}
  
