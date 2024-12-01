package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class FeServToSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FeServToSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FeServToSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FE_SERV_TO_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFeSvc15To;
	
	/**
	* Constructor for FeServToSerialized
	**/
    public FeServToSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for FeServToSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FeServToSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this FeServToSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,200193); // serialize this field at offset 200193 by default 
    }
    
	/**
	* sets parent for this FeServToSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 200193 by default
    }    
	/**
	* initializes the field in FeServToSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FE_SERV_TO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFeSvc15To = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFeSvc15ToCounter = -1;
     public boolean isFeSvc15ToModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFeSvc15ToCounter != sharedCounter;
         localFeSvc15ToCounter = sharedCounter; return hasModified;
     }
	protected static final int FE_SVC_15_TO_LEN = 5;
	/**
	 * 	serialize this FeSvc15To
	 */
   protected void serializeFeSvc15To(char[] feSvc15To) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(feSvc15To,0,getStringValue(),beginFeSvc15To,FE_SVC_15_TO_LEN);
       localFeSvc15ToCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFeSvc15ToConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshFeSvc15To is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFeSvc15To() {	 
   		return (substring(getStringValue(),beginFeSvc15To,beginFeSvc15To + FE_SVC_15_TO_LEN));
   	}




}
  
