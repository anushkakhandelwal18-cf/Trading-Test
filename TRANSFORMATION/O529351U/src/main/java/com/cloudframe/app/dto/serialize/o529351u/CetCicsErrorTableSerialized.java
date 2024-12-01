package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class CetCicsErrorTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CetCicsErrorTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CetCicsErrorTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CET_CICS_ERROR_TABLE_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCetEibrcd;
	
	/**
	* Constructor for CetCicsErrorTableSerialized
	**/
    public CetCicsErrorTableSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CetCicsErrorTableSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CetCicsErrorTableSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CetCicsErrorTableSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this CetCicsErrorTableSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in CetCicsErrorTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CET_CICS_ERROR_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCetEibrcd = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCetEibrcdCounter = -1;
     public boolean isCetEibrcdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCetEibrcdCounter != sharedCounter;
         localCetEibrcdCounter = sharedCounter; return hasModified;
     }
	protected static final int CET_EIBRCD_LEN = 6;
	/**
	 * 	serialize this CetEibrcd
	 */
   protected void serializeCetEibrcd(char[] cetEibrcd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cetEibrcd,0,getStringValue(),beginCetEibrcd,CET_EIBRCD_LEN);
       localCetEibrcdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCetEibrcdConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshCetEibrcd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCetEibrcd() {	 
   		return (substring(getStringValue(),beginCetEibrcd,beginCetEibrcd + CET_EIBRCD_LEN));
   	}




}
  
