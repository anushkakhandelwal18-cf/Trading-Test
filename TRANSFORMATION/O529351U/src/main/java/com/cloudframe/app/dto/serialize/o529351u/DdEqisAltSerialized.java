package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class DdEqisAltSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DdEqisAltSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DdEqisAltSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DD_EQIS_ALT_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginEqiAltId;
            protected  int beginEqiAltFillerWs;
	
	/**
	* Constructor for DdEqisAltSerialized
	**/
    public DdEqisAltSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DdEqisAltSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DD_EQIS_ALT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginEqiAltId = getStartOffset() + 0;	// set offset for serialization
  
             beginEqiAltFillerWs = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localEqiAltIdCounter = -1;
     public boolean isEqiAltIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEqiAltIdCounter != sharedCounter;
         localEqiAltIdCounter = sharedCounter; return hasModified;
     }
	protected static final int EQI_ALT_ID_LEN = 1;
	/**
	 * 	serialize this EqiAltId
	 */
   protected void serializeEqiAltId(char[] eqiAltId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(eqiAltId,0,getStringValue(),beginEqiAltId,EQI_ALT_ID_LEN);
       localEqiAltIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEqiAltIdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshEqiAltId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEqiAltId() {	 
   		return (substring(getStringValue(),beginEqiAltId,beginEqiAltId + EQI_ALT_ID_LEN));
   	}
     int localEqiAltFillerWsCounter = -1;
     public boolean isEqiAltFillerWsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEqiAltFillerWsCounter != sharedCounter;
         localEqiAltFillerWsCounter = sharedCounter; return hasModified;
     }
	protected static final int EQI_ALT_FILLER_WS_LEN = 7;
	/**
	 * 	serialize this EqiAltFillerWs
	 */
   protected void serializeEqiAltFillerWs(char[] eqiAltFillerWs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(eqiAltFillerWs,0,getStringValue(),beginEqiAltFillerWs,EQI_ALT_FILLER_WS_LEN);
       localEqiAltFillerWsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEqiAltFillerWsConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshEqiAltFillerWs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEqiAltFillerWs() {	 
   		return (substring(getStringValue(),beginEqiAltFillerWs,beginEqiAltFillerWs + EQI_ALT_FILLER_WS_LEN));
   	}




}
  
