package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class ServToAlphatfSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ServToAlphatfSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ServToAlphatfSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SERV_TO_ALPHATF_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFeSvc1afTo;
            protected  int beginFeSvc25afTo;
	
	/**
	* Constructor for ServToAlphatfSerialized
	**/
    public ServToAlphatfSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ServToAlphatfSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ServToAlphatfSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ServToAlphatfSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,200193); // serialize this field at offset 200193 by default 
    }
    
	/**
	* sets parent for this ServToAlphatfSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 200193 by default
    }    
	/**
	* initializes the field in ServToAlphatfSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SERV_TO_ALPHATF_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFeSvc1afTo = getStartOffset() + 0;	// set offset for serialization
  
             beginFeSvc25afTo = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFeSvc1afToCounter = -1;
     public boolean isFeSvc1afToModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFeSvc1afToCounter != sharedCounter;
         localFeSvc1afToCounter = sharedCounter; return hasModified;
     }
	protected static final int FE_SVC_1AF_TO_LEN = 1;
	/**
	 * 	serialize this FeSvc1afTo
	 */
   protected void serializeFeSvc1afTo(char[] feSvc1afTo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(feSvc1afTo,0,getStringValue(),beginFeSvc1afTo,FE_SVC_1AF_TO_LEN);
       localFeSvc1afToCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFeSvc1afToConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFeSvc1afTo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFeSvc1afTo() {	 
   		return (substring(getStringValue(),beginFeSvc1afTo,beginFeSvc1afTo + FE_SVC_1AF_TO_LEN));
   	}
     int localFeSvc25afToCounter = -1;
     public boolean isFeSvc25afToModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFeSvc25afToCounter != sharedCounter;
         localFeSvc25afToCounter = sharedCounter; return hasModified;
     }
	protected static final int FE_SVC_25AF_TO_LEN = 4;
	/**
	 * 	serialize this FeSvc25afTo
	 */
   protected void serializeFeSvc25afTo(char[] feSvc25afTo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(feSvc25afTo,0,getStringValue(),beginFeSvc25afTo,FE_SVC_25AF_TO_LEN);
       localFeSvc25afToCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFeSvc25afToConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshFeSvc25afTo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFeSvc25afTo() {	 
   		return (substring(getStringValue(),beginFeSvc25afTo,beginFeSvc25afTo + FE_SVC_25AF_TO_LEN));
   	}




}
  
