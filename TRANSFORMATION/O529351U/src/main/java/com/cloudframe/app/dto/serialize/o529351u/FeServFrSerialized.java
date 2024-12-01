package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class FeServFrSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FeServFrSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FeServFrSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FE_SERV_FR_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFeSvc15Fr;
            protected  int beginFeSvc6Fr;
	
	/**
	* Constructor for FeServFrSerialized
	**/
    public FeServFrSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for FeServFrSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FeServFrSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this FeServFrSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,200187); // serialize this field at offset 200187 by default 
    }
    
	/**
	* sets parent for this FeServFrSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 200187 by default
    }    
	/**
	* initializes the field in FeServFrSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FE_SERV_FR_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFeSvc15Fr = getStartOffset() + 0;	// set offset for serialization
  
             beginFeSvc6Fr = getStartOffset() + 5;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFeSvc15FrCounter = -1;
     public boolean isFeSvc15FrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFeSvc15FrCounter != sharedCounter;
         localFeSvc15FrCounter = sharedCounter; return hasModified;
     }
	protected static final int FE_SVC_15_FR_LEN = 5;
	/**
	 * 	serialize this FeSvc15Fr
	 */
   protected void serializeFeSvc15Fr(char[] feSvc15Fr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(feSvc15Fr,0,getStringValue(),beginFeSvc15Fr,FE_SVC_15_FR_LEN);
       localFeSvc15FrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFeSvc15FrConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshFeSvc15Fr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFeSvc15Fr() {	 
   		return (substring(getStringValue(),beginFeSvc15Fr,beginFeSvc15Fr + FE_SVC_15_FR_LEN));
   	}
     int localFeSvc6FrCounter = -1;
     public boolean isFeSvc6FrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFeSvc6FrCounter != sharedCounter;
         localFeSvc6FrCounter = sharedCounter; return hasModified;
     }
	protected static final int FE_SVC_6_FR_LEN = 1;
	/**
	 * 	serialize this FeSvc6Fr
	 */
   protected void serializeFeSvc6Fr(char[] feSvc6Fr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(feSvc6Fr,0,getStringValue(),beginFeSvc6Fr,FE_SVC_6_FR_LEN);
       localFeSvc6FrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFeSvc6FrConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFeSvc6Fr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFeSvc6Fr() {	 
   		return (substring(getStringValue(),beginFeSvc6Fr,beginFeSvc6Fr + FE_SVC_6_FR_LEN));
   	}




}
  
