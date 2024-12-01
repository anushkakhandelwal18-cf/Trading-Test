package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class ServAlphafSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ServAlphafSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ServAlphafSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SERV_ALPHAF_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSvc1af;
            protected  int beginSvc25af;
	
	/**
	* Constructor for ServAlphafSerialized
	**/
    public ServAlphafSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ServAlphafSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ServAlphafSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ServAlphafSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,200181); // serialize this field at offset 200181 by default 
    }
    
	/**
	* sets parent for this ServAlphafSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 200181 by default
    }    
	/**
	* initializes the field in ServAlphafSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SERV_ALPHAF_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSvc1af = getStartOffset() + 0;	// set offset for serialization
  
             beginSvc25af = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSvc1afCounter = -1;
     public boolean isSvc1afModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSvc1afCounter != sharedCounter;
         localSvc1afCounter = sharedCounter; return hasModified;
     }
	protected static final int SVC_1AF_LEN = 1;
	/**
	 * 	serialize this Svc1af
	 */
   protected void serializeSvc1af(char[] svc1af) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(svc1af,0,getStringValue(),beginSvc1af,SVC_1AF_LEN);
       localSvc1afCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSvc1afConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSvc1af is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSvc1af() {	 
   		return (substring(getStringValue(),beginSvc1af,beginSvc1af + SVC_1AF_LEN));
   	}
     int localSvc25afCounter = -1;
     public boolean isSvc25afModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSvc25afCounter != sharedCounter;
         localSvc25afCounter = sharedCounter; return hasModified;
     }
	protected static final int SVC_25AF_LEN = 4;
	/**
	 * 	serialize this Svc25af
	 */
   protected void serializeSvc25af(char[] svc25af) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(svc25af,0,getStringValue(),beginSvc25af,SVC_25AF_LEN);
       localSvc25afCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSvc25afConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshSvc25af is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSvc25af() {	 
   		return (substring(getStringValue(),beginSvc25af,beginSvc25af + SVC_25AF_LEN));
   	}




}
  
