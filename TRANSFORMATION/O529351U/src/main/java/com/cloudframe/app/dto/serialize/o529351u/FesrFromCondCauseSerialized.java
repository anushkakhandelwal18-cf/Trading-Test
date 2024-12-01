package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class FesrFromCondCauseSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FesrFromCondCauseSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FesrFromCondCauseSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FESR_FROM_COND_CAUSE_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFesrFromCauseCd;
	
	/**
	* Constructor for FesrFromCondCauseSerialized
	**/
    public FesrFromCondCauseSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for FesrFromCondCauseSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FesrFromCondCauseSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this FesrFromCondCauseSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,4247); // serialize this field at offset 4247 by default 
    }
    
	/**
	* sets parent for this FesrFromCondCauseSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 4247 by default
    }    
	/**
	* initializes the field in FesrFromCondCauseSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FESR_FROM_COND_CAUSE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFesrFromCauseCd = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFesrFromCauseCdCounter = -1;
     public boolean isFesrFromCauseCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFesrFromCauseCdCounter != sharedCounter;
         localFesrFromCauseCdCounter = sharedCounter; return hasModified;
     }
	protected static final int FESR_FROM_CAUSE_CD_LEN = 1;
	/**
	 * 	serialize this FesrFromCauseCd
	 */
   protected void serializeFesrFromCauseCd(char[] fesrFromCauseCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fesrFromCauseCd,0,getStringValue(),beginFesrFromCauseCd,FESR_FROM_CAUSE_CD_LEN);
       localFesrFromCauseCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFesrFromCauseCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFesrFromCauseCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFesrFromCauseCd() {	 
   		return (substring(getStringValue(),beginFesrFromCauseCd,beginFesrFromCauseCd + FESR_FROM_CAUSE_CD_LEN));
   	}




}
  
