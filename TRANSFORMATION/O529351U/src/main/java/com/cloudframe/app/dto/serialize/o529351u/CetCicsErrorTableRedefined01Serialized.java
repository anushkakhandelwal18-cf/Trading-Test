package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class CetCicsErrorTableRedefined01Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CetCicsErrorTableRedefined01Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CetCicsErrorTableRedefined01Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CET_CICS_ERROR_TABLE_REDEFINED_01_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCetEibrcdByte3;
	
	/**
	* Constructor for CetCicsErrorTableRedefined01Serialized
	**/
    public CetCicsErrorTableRedefined01Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CetCicsErrorTableRedefined01Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CetCicsErrorTableRedefined01Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CetCicsErrorTableRedefined01Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this CetCicsErrorTableRedefined01Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in CetCicsErrorTableRedefined01Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CET_CICS_ERROR_TABLE_REDEFINED_01_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCetEibrcdByte3 = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCetEibrcdByte3Counter = -1;
     public boolean isCetEibrcdByte3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCetEibrcdByte3Counter != sharedCounter;
         localCetEibrcdByte3Counter = sharedCounter; return hasModified;
     }
	protected static final int CET_EIBRCD_BYTE_3_LEN = 1;
	/**
	 * 	serialize this CetEibrcdByte3
	 */
   protected void serializeCetEibrcdByte3(char[] cetEibrcdByte3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cetEibrcdByte3,0,getStringValue(),beginCetEibrcdByte3,CET_EIBRCD_BYTE_3_LEN);
       localCetEibrcdByte3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCetEibrcdByte3Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCetEibrcdByte3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCetEibrcdByte3() {	 
   		return (substring(getStringValue(),beginCetEibrcdByte3,beginCetEibrcdByte3 + CET_EIBRCD_BYTE_3_LEN));
   	}




}
  
