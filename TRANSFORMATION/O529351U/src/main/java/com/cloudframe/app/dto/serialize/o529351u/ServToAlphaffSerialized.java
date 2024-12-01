package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class ServToAlphaffSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ServToAlphaffSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ServToAlphaffSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SERV_TO_ALPHAFF_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFeSvc1afFr;
            protected  int beginFeSvc25afFr;
	
	/**
	* Constructor for ServToAlphaffSerialized
	**/
    public ServToAlphaffSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ServToAlphaffSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ServToAlphaffSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ServToAlphaffSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,200187); // serialize this field at offset 200187 by default 
    }
    
	/**
	* sets parent for this ServToAlphaffSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 200187 by default
    }    
	/**
	* initializes the field in ServToAlphaffSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SERV_TO_ALPHAFF_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFeSvc1afFr = getStartOffset() + 0;	// set offset for serialization
  
             beginFeSvc25afFr = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFeSvc1afFrCounter = -1;
     public boolean isFeSvc1afFrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFeSvc1afFrCounter != sharedCounter;
         localFeSvc1afFrCounter = sharedCounter; return hasModified;
     }
	protected static final int FE_SVC_1AF_FR_LEN = 1;
	/**
	 * 	serialize this FeSvc1afFr
	 */
   protected void serializeFeSvc1afFr(char[] feSvc1afFr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(feSvc1afFr,0,getStringValue(),beginFeSvc1afFr,FE_SVC_1AF_FR_LEN);
       localFeSvc1afFrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFeSvc1afFrConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFeSvc1afFr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFeSvc1afFr() {	 
   		return (substring(getStringValue(),beginFeSvc1afFr,beginFeSvc1afFr + FE_SVC_1AF_FR_LEN));
   	}
     int localFeSvc25afFrCounter = -1;
     public boolean isFeSvc25afFrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFeSvc25afFrCounter != sharedCounter;
         localFeSvc25afFrCounter = sharedCounter; return hasModified;
     }
	protected static final int FE_SVC_25AF_FR_LEN = 4;
	/**
	 * 	serialize this FeSvc25afFr
	 */
   protected void serializeFeSvc25afFr(char[] feSvc25afFr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(feSvc25afFr,0,getStringValue(),beginFeSvc25afFr,FE_SVC_25AF_FR_LEN);
       localFeSvc25afFrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFeSvc25afFrConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshFeSvc25afFr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFeSvc25afFr() {	 
   		return (substring(getStringValue(),beginFeSvc25afFr,beginFeSvc25afFr + FE_SVC_25AF_FR_LEN));
   	}




}
  
