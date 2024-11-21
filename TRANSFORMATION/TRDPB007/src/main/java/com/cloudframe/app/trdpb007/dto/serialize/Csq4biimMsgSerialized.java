package com.cloudframe.app.trdpb007.dto.serialize;

/**
*  The class Csq4biimMsgSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-11-21 at 09:21. using version 5.0.0.153
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Csq4biimMsgSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Csq4biimMsgSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CSQ_4BIIM_MSG_LENGTH = 113;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCsq4biimMsgid;
	
	/**
	* Constructor for Csq4biimMsgSerialized
	**/
    public Csq4biimMsgSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Csq4biimMsgSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Csq4biimMsgSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Csq4biimMsgSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Csq4biimMsgSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Csq4biimMsgSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CSQ_4BIIM_MSG_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCsq4biimMsgid = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localCsq4biimMsgidCounter = -1;
     public boolean isCsq4biimMsgidModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCsq4biimMsgidCounter != sharedCounter;
         localCsq4biimMsgidCounter = sharedCounter; return hasModified;
     }
	protected static final int CSQ_4BIIM_MSGID_LEN = 8;
	/**
	 * 	serialize this Csq4biimMsgid
	 */
   protected void serializeCsq4biimMsgid(char[] csq4biimMsgid) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(csq4biimMsgid,0,getStringValue(),beginCsq4biimMsgid,CSQ_4BIIM_MSGID_LEN);
       localCsq4biimMsgidCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCsq4biimMsgidConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshCsq4biimMsgid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCsq4biimMsgid() {	 
   		return (substring(getStringValue(),beginCsq4biimMsgid,beginCsq4biimMsgid + CSQ_4BIIM_MSGID_LEN));
   	}




}
  
