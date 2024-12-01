package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class DsmEditErrorValueTxtSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DsmEditErrorValueTxtSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DsmEditErrorValueTxtSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DSM_EDIT_ERROR_VALUE_TXT_LENGTH = 21;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDsmEditErrorValueInt;
            protected  int beginDsmEditErrorValueDec;
	
	/**
	* Constructor for DsmEditErrorValueTxtSerialized
	**/
    public DsmEditErrorValueTxtSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for DsmEditErrorValueTxtSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DsmEditErrorValueTxtSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this DsmEditErrorValueTxtSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,64); // serialize this field at offset 64 by default 
    }
    
	/**
	* sets parent for this DsmEditErrorValueTxtSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 64 by default
    }    
	/**
	* initializes the field in DsmEditErrorValueTxtSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DSM_EDIT_ERROR_VALUE_TXT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDsmEditErrorValueInt = getStartOffset() + 0;	// set offset for serialization
  
             beginDsmEditErrorValueDec = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDsmEditErrorValueIntCounter = -1;
     public boolean isDsmEditErrorValueIntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDsmEditErrorValueIntCounter != sharedCounter;
         localDsmEditErrorValueIntCounter = sharedCounter; return hasModified;
     }
	protected static final int DSM_EDIT_ERROR_VALUE_INT_LEN = 19;
	/**
	 * 	serialize this DsmEditErrorValueInt
	 */
   protected void serializeDsmEditErrorValueInt(char[] dsmEditErrorValueInt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dsmEditErrorValueInt,0,getStringValue(),beginDsmEditErrorValueInt,DSM_EDIT_ERROR_VALUE_INT_LEN);
       localDsmEditErrorValueIntCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDsmEditErrorValueIntConstraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshDsmEditErrorValueInt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDsmEditErrorValueInt() {	 
   		return (substring(getStringValue(),beginDsmEditErrorValueInt,beginDsmEditErrorValueInt + DSM_EDIT_ERROR_VALUE_INT_LEN));
   	}
     int localDsmEditErrorValueDecCounter = -1;
     public boolean isDsmEditErrorValueDecModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDsmEditErrorValueDecCounter != sharedCounter;
         localDsmEditErrorValueDecCounter = sharedCounter; return hasModified;
     }
	protected static final int DSM_EDIT_ERROR_VALUE_DEC_LEN = 19;
	/**
	 * 	serialize this DsmEditErrorValueDec
	 */
   protected void serializeDsmEditErrorValueDec(char[] dsmEditErrorValueDec) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dsmEditErrorValueDec,0,getStringValue(),beginDsmEditErrorValueDec,DSM_EDIT_ERROR_VALUE_DEC_LEN);
       localDsmEditErrorValueDecCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDsmEditErrorValueDecConstraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshDsmEditErrorValueDec is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDsmEditErrorValueDec() {	 
   		return (substring(getStringValue(),beginDsmEditErrorValueDec,beginDsmEditErrorValueDec + DSM_EDIT_ERROR_VALUE_DEC_LEN));
   	}




}
  
