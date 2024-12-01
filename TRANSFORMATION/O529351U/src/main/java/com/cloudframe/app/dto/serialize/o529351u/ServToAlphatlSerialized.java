package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class ServToAlphatlSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ServToAlphatlSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ServToAlphatlSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SERV_TO_ALPHATL_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFeSvc14alTo;
            protected  int beginFeSvc5alTo;
	
	/**
	* Constructor for ServToAlphatlSerialized
	**/
    public ServToAlphatlSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ServToAlphatlSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ServToAlphatlSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ServToAlphatlSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,200193); // serialize this field at offset 200193 by default 
    }
    
	/**
	* sets parent for this ServToAlphatlSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 200193 by default
    }    
	/**
	* initializes the field in ServToAlphatlSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SERV_TO_ALPHATL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFeSvc14alTo = getStartOffset() + 0;	// set offset for serialization
  
             beginFeSvc5alTo = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFeSvc14alToCounter = -1;
     public boolean isFeSvc14alToModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFeSvc14alToCounter != sharedCounter;
         localFeSvc14alToCounter = sharedCounter; return hasModified;
     }
	protected static final int FE_SVC_14AL_TO_LEN = 4;
	/**
	 * 	serialize this FeSvc14alTo
	 */
   protected void serializeFeSvc14alTo(char[] feSvc14alTo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(feSvc14alTo,0,getStringValue(),beginFeSvc14alTo,FE_SVC_14AL_TO_LEN);
       localFeSvc14alToCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFeSvc14alToConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshFeSvc14alTo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFeSvc14alTo() {	 
   		return (substring(getStringValue(),beginFeSvc14alTo,beginFeSvc14alTo + FE_SVC_14AL_TO_LEN));
   	}
     int localFeSvc5alToCounter = -1;
     public boolean isFeSvc5alToModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFeSvc5alToCounter != sharedCounter;
         localFeSvc5alToCounter = sharedCounter; return hasModified;
     }
	protected static final int FE_SVC_5AL_TO_LEN = 1;
	/**
	 * 	serialize this FeSvc5alTo
	 */
   protected void serializeFeSvc5alTo(char[] feSvc5alTo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(feSvc5alTo,0,getStringValue(),beginFeSvc5alTo,FE_SVC_5AL_TO_LEN);
       localFeSvc5alToCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFeSvc5alToConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFeSvc5alTo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFeSvc5alTo() {	 
   		return (substring(getStringValue(),beginFeSvc5alTo,beginFeSvc5alTo + FE_SVC_5AL_TO_LEN));
   	}




}
  
