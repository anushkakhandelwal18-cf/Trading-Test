package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class FesrFromCondFrToSvcSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FesrFromCondFrToSvcSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FesrFromCondFrToSvcSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FESR_FROM_COND_FR_TO_SVC_LENGTH = 15;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFesrFromFrSvc;
            protected  int beginFesrFromToSvc;
            protected  int beginFesrSvcInd;
	
	/**
	* Constructor for FesrFromCondFrToSvcSerialized
	**/
    public FesrFromCondFrToSvcSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for FesrFromCondFrToSvcSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FesrFromCondFrToSvcSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this FesrFromCondFrToSvcSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,117); // serialize this field at offset 117 by default 
    }
    
	/**
	* sets parent for this FesrFromCondFrToSvcSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 117 by default
    }    
	/**
	* initializes the field in FesrFromCondFrToSvcSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FESR_FROM_COND_FR_TO_SVC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFesrFromFrSvc = getStartOffset() + 0;	// set offset for serialization
  
             beginFesrFromToSvc = getStartOffset() + 7;	// set offset for serialization
  
             beginFesrSvcInd = getStartOffset() + 14;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFesrFromFrSvcCounter = -1;
     public boolean isFesrFromFrSvcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFesrFromFrSvcCounter != sharedCounter;
         localFesrFromFrSvcCounter = sharedCounter; return hasModified;
     }
	protected static final int FESR_FROM_FR_SVC_LEN = 7;
	/**
	 * 	serialize this FesrFromFrSvc
	 */
   protected void serializeFesrFromFrSvc(char[] fesrFromFrSvc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fesrFromFrSvc,0,getStringValue(),beginFesrFromFrSvc,FESR_FROM_FR_SVC_LEN);
       localFesrFromFrSvcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFesrFromFrSvcConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshFesrFromFrSvc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFesrFromFrSvc() {	 
   		return (substring(getStringValue(),beginFesrFromFrSvc,beginFesrFromFrSvc + FESR_FROM_FR_SVC_LEN));
   	}
     int localFesrFromToSvcCounter = -1;
     public boolean isFesrFromToSvcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFesrFromToSvcCounter != sharedCounter;
         localFesrFromToSvcCounter = sharedCounter; return hasModified;
     }
	protected static final int FESR_FROM_TO_SVC_LEN = 7;
	/**
	 * 	serialize this FesrFromToSvc
	 */
   protected void serializeFesrFromToSvc(char[] fesrFromToSvc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fesrFromToSvc,0,getStringValue(),beginFesrFromToSvc,FESR_FROM_TO_SVC_LEN);
       localFesrFromToSvcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFesrFromToSvcConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshFesrFromToSvc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFesrFromToSvc() {	 
   		return (substring(getStringValue(),beginFesrFromToSvc,beginFesrFromToSvc + FESR_FROM_TO_SVC_LEN));
   	}
     int localFesrSvcIndCounter = -1;
     public boolean isFesrSvcIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFesrSvcIndCounter != sharedCounter;
         localFesrSvcIndCounter = sharedCounter; return hasModified;
     }
	protected static final int FESR_SVC_IND_LEN = 1;
	/**
	 * 	serialize this FesrSvcInd
	 */
   protected void serializeFesrSvcInd(char[] fesrSvcInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fesrSvcInd,0,getStringValue(),beginFesrSvcInd,FESR_SVC_IND_LEN);
       localFesrSvcIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFesrSvcIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFesrSvcInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFesrSvcInd() {	 
   		return (substring(getStringValue(),beginFesrSvcInd,beginFesrSvcInd + FESR_SVC_IND_LEN));
   	}




}
  
