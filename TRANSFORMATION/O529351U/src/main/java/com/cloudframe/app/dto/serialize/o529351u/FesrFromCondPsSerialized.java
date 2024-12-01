package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class FesrFromCondPsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FesrFromCondPsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FesrFromCondPsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FESR_FROM_COND_PS_LENGTH = 3;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFesrFromPs;
	
	/**
	* Constructor for FesrFromCondPsSerialized
	**/
    public FesrFromCondPsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for FesrFromCondPsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FesrFromCondPsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this FesrFromCondPsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,27); // serialize this field at offset 27 by default 
    }
    
	/**
	* sets parent for this FesrFromCondPsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 27 by default
    }    
	/**
	* initializes the field in FesrFromCondPsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FESR_FROM_COND_PS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFesrFromPs = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFesrFromPsCounter = -1;
     public boolean isFesrFromPsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFesrFromPsCounter != sharedCounter;
         localFesrFromPsCounter = sharedCounter; return hasModified;
     }
	protected static final int FESR_FROM_PS_LEN = 3;
	/**
	 * 	serialize this FesrFromPs
	 */
   protected void serializeFesrFromPs(char[] fesrFromPs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fesrFromPs,0,getStringValue(),beginFesrFromPs,FESR_FROM_PS_LEN);
       localFesrFromPsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFesrFromPsConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshFesrFromPs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFesrFromPs() {	 
   		return (substring(getStringValue(),beginFesrFromPs,beginFesrFromPs + FESR_FROM_PS_LEN));
   	}




}
  
