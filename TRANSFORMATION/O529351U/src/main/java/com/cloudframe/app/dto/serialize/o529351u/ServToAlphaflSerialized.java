package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class ServToAlphaflSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ServToAlphaflSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ServToAlphaflSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SERV_TO_ALPHAFL_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFeSvc14alFr;
            protected  int beginFeSvc5alFr;
	
	/**
	* Constructor for ServToAlphaflSerialized
	**/
    public ServToAlphaflSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ServToAlphaflSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ServToAlphaflSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ServToAlphaflSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,200187); // serialize this field at offset 200187 by default 
    }
    
	/**
	* sets parent for this ServToAlphaflSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 200187 by default
    }    
	/**
	* initializes the field in ServToAlphaflSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SERV_TO_ALPHAFL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFeSvc14alFr = getStartOffset() + 0;	// set offset for serialization
  
             beginFeSvc5alFr = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFeSvc14alFrCounter = -1;
     public boolean isFeSvc14alFrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFeSvc14alFrCounter != sharedCounter;
         localFeSvc14alFrCounter = sharedCounter; return hasModified;
     }
	protected static final int FE_SVC_14AL_FR_LEN = 4;
	/**
	 * 	serialize this FeSvc14alFr
	 */
   protected void serializeFeSvc14alFr(char[] feSvc14alFr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(feSvc14alFr,0,getStringValue(),beginFeSvc14alFr,FE_SVC_14AL_FR_LEN);
       localFeSvc14alFrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFeSvc14alFrConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshFeSvc14alFr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFeSvc14alFr() {	 
   		return (substring(getStringValue(),beginFeSvc14alFr,beginFeSvc14alFr + FE_SVC_14AL_FR_LEN));
   	}
     int localFeSvc5alFrCounter = -1;
     public boolean isFeSvc5alFrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFeSvc5alFrCounter != sharedCounter;
         localFeSvc5alFrCounter = sharedCounter; return hasModified;
     }
	protected static final int FE_SVC_5AL_FR_LEN = 1;
	/**
	 * 	serialize this FeSvc5alFr
	 */
   protected void serializeFeSvc5alFr(char[] feSvc5alFr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(feSvc5alFr,0,getStringValue(),beginFeSvc5alFr,FE_SVC_5AL_FR_LEN);
       localFeSvc5alFrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFeSvc5alFrConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFeSvc5alFr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFeSvc5alFr() {	 
   		return (substring(getStringValue(),beginFeSvc5alFr,beginFeSvc5alFr + FE_SVC_5AL_FR_LEN));
   	}




}
  
