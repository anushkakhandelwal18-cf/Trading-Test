package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class ServTopSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ServTopSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ServTopSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SERV_TOP_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSvc15;
            protected  int beginSvc6;
	
	/**
	* Constructor for ServTopSerialized
	**/
    public ServTopSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ServTopSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ServTopSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ServTopSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,200181); // serialize this field at offset 200181 by default 
    }
    
	/**
	* sets parent for this ServTopSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 200181 by default
    }    
	/**
	* initializes the field in ServTopSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SERV_TOP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSvc15 = getStartOffset() + 0;	// set offset for serialization
  
             beginSvc6 = getStartOffset() + 5;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSvc15Counter = -1;
     public boolean isSvc15Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSvc15Counter != sharedCounter;
         localSvc15Counter = sharedCounter; return hasModified;
     }
	protected static final int SVC_15_LEN = 5;
	/**
	 * 	serialize this Svc15
	 */
   protected void serializeSvc15(char[] svc15) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(svc15,0,getStringValue(),beginSvc15,SVC_15_LEN);
       localSvc15Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSvc15Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshSvc15 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSvc15() {	 
   		return (substring(getStringValue(),beginSvc15,beginSvc15 + SVC_15_LEN));
   	}
     int localSvc6Counter = -1;
     public boolean isSvc6Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSvc6Counter != sharedCounter;
         localSvc6Counter = sharedCounter; return hasModified;
     }
	protected static final int SVC_6_LEN = 1;
	/**
	 * 	serialize this Svc6
	 */
   protected void serializeSvc6(char[] svc6) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(svc6,0,getStringValue(),beginSvc6,SVC_6_LEN);
       localSvc6Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSvc6Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSvc6 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSvc6() {	 
   		return (substring(getStringValue(),beginSvc6,beginSvc6 + SVC_6_LEN));
   	}




}
  
