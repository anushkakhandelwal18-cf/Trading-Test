package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class FesrFromCondFrToIcd9Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FesrFromCondFrToIcd9Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FesrFromCondFrToIcd9Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FESR_FROM_COND_FR_TO_ICD_9_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFesrFromFrIcd9;
            protected  int beginFesrFromToIcd9;
	
	/**
	* Constructor for FesrFromCondFrToIcd9Serialized
	**/
    public FesrFromCondFrToIcd9Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for FesrFromCondFrToIcd9Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FesrFromCondFrToIcd9Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this FesrFromCondFrToIcd9Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3247); // serialize this field at offset 3247 by default 
    }
    
	/**
	* sets parent for this FesrFromCondFrToIcd9Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3247 by default
    }    
	/**
	* initializes the field in FesrFromCondFrToIcd9Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FESR_FROM_COND_FR_TO_ICD_9_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFesrFromFrIcd9 = getStartOffset() + 0;	// set offset for serialization
  
             beginFesrFromToIcd9 = getStartOffset() + 5;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFesrFromFrIcd9Counter = -1;
     public boolean isFesrFromFrIcd9Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFesrFromFrIcd9Counter != sharedCounter;
         localFesrFromFrIcd9Counter = sharedCounter; return hasModified;
     }
	protected static final int FESR_FROM_FR_ICD_9_LEN = 5;
	/**
	 * 	serialize this FesrFromFrIcd9
	 */
   protected void serializeFesrFromFrIcd9(char[] fesrFromFrIcd9) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fesrFromFrIcd9,0,getStringValue(),beginFesrFromFrIcd9,FESR_FROM_FR_ICD_9_LEN);
       localFesrFromFrIcd9Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFesrFromFrIcd9Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshFesrFromFrIcd9 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFesrFromFrIcd9() {	 
   		return (substring(getStringValue(),beginFesrFromFrIcd9,beginFesrFromFrIcd9 + FESR_FROM_FR_ICD_9_LEN));
   	}
     int localFesrFromToIcd9Counter = -1;
     public boolean isFesrFromToIcd9Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFesrFromToIcd9Counter != sharedCounter;
         localFesrFromToIcd9Counter = sharedCounter; return hasModified;
     }
	protected static final int FESR_FROM_TO_ICD_9_LEN = 5;
	/**
	 * 	serialize this FesrFromToIcd9
	 */
   protected void serializeFesrFromToIcd9(char[] fesrFromToIcd9) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fesrFromToIcd9,0,getStringValue(),beginFesrFromToIcd9,FESR_FROM_TO_ICD_9_LEN);
       localFesrFromToIcd9Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFesrFromToIcd9Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshFesrFromToIcd9 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFesrFromToIcd9() {	 
   		return (substring(getStringValue(),beginFesrFromToIcd9,beginFesrFromToIcd9 + FESR_FROM_TO_ICD_9_LEN));
   	}




}
  
