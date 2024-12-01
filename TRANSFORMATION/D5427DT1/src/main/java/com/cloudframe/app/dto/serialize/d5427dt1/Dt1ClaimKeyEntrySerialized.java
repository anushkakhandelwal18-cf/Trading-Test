package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class Dt1ClaimKeyEntrySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Dt1ClaimKeyEntrySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Dt1ClaimKeyEntrySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DT_1_CLAIM_KEY_ENTRY_LENGTH = 51;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDt1ClaimKey;
	
	/**
	* Constructor for Dt1ClaimKeyEntrySerialized
	**/
    public Dt1ClaimKeyEntrySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Dt1ClaimKeyEntrySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dt1ClaimKeyEntrySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Dt1ClaimKeyEntrySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Dt1ClaimKeyEntrySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Dt1ClaimKeyEntrySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DT_1_CLAIM_KEY_ENTRY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDt1ClaimKey = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDt1ClaimKeyCounter = -1;
     public boolean isDt1ClaimKeyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt1ClaimKeyCounter != sharedCounter;
         localDt1ClaimKeyCounter = sharedCounter; return hasModified;
     }
	protected static final int DT_1_CLAIM_KEY_LEN = 51;
	/**
	 * 	serialize this Dt1ClaimKey
	 */
   protected void serializeDt1ClaimKey(char[] dt1ClaimKey) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dt1ClaimKey,0,getStringValue(),beginDt1ClaimKey,DT_1_CLAIM_KEY_LEN);
       localDt1ClaimKeyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDt1ClaimKeyConstraints(char[] value) {
   			return super.checkConstraints(value , 51 ,false, false);
   }
    /**
	 *	refreshDt1ClaimKey is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDt1ClaimKey() {	 
   		return (substring(getStringValue(),beginDt1ClaimKey,beginDt1ClaimKey + DT_1_CLAIM_KEY_LEN));
   	}




}
  
