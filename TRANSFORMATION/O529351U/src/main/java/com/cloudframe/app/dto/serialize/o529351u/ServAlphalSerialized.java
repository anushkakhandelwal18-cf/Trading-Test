package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class ServAlphalSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ServAlphalSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ServAlphalSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SERV_ALPHAL_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSvc14al;
            protected  int beginSvc5al;
	
	/**
	* Constructor for ServAlphalSerialized
	**/
    public ServAlphalSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ServAlphalSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ServAlphalSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ServAlphalSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,200181); // serialize this field at offset 200181 by default 
    }
    
	/**
	* sets parent for this ServAlphalSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 200181 by default
    }    
	/**
	* initializes the field in ServAlphalSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SERV_ALPHAL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSvc14al = getStartOffset() + 0;	// set offset for serialization
  
             beginSvc5al = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSvc14alCounter = -1;
     public boolean isSvc14alModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSvc14alCounter != sharedCounter;
         localSvc14alCounter = sharedCounter; return hasModified;
     }
	protected static final int SVC_14AL_LEN = 4;
	/**
	 * 	serialize this Svc14al
	 */
   protected void serializeSvc14al(char[] svc14al) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(svc14al,0,getStringValue(),beginSvc14al,SVC_14AL_LEN);
       localSvc14alCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSvc14alConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshSvc14al is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSvc14al() {	 
   		return (substring(getStringValue(),beginSvc14al,beginSvc14al + SVC_14AL_LEN));
   	}
     int localSvc5alCounter = -1;
     public boolean isSvc5alModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSvc5alCounter != sharedCounter;
         localSvc5alCounter = sharedCounter; return hasModified;
     }
	protected static final int SVC_5AL_LEN = 1;
	/**
	 * 	serialize this Svc5al
	 */
   protected void serializeSvc5al(char[] svc5al) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(svc5al,0,getStringValue(),beginSvc5al,SVC_5AL_LEN);
       localSvc5alCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSvc5alConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSvc5al is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSvc5al() {	 
   		return (substring(getStringValue(),beginSvc5al,beginSvc5al + SVC_5AL_LEN));
   	}




}
  
