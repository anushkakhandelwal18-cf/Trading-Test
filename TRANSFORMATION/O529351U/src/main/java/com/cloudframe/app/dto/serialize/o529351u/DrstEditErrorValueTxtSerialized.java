package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class DrstEditErrorValueTxtSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DrstEditErrorValueTxtSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DrstEditErrorValueTxtSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DRST_EDIT_ERROR_VALUE_TXT_LENGTH = 17;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDrstEditErrorValueInt;
            protected  int beginDrstEditErrorValueDec;
	
	/**
	* Constructor for DrstEditErrorValueTxtSerialized
	**/
    public DrstEditErrorValueTxtSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for DrstEditErrorValueTxtSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DrstEditErrorValueTxtSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this DrstEditErrorValueTxtSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,322); // serialize this field at offset 322 by default 
    }
    
	/**
	* sets parent for this DrstEditErrorValueTxtSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 322 by default
    }    
	/**
	* initializes the field in DrstEditErrorValueTxtSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DRST_EDIT_ERROR_VALUE_TXT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDrstEditErrorValueInt = getStartOffset() + 0;	// set offset for serialization
  
             beginDrstEditErrorValueDec = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDrstEditErrorValueIntCounter = -1;
     public boolean isDrstEditErrorValueIntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDrstEditErrorValueIntCounter != sharedCounter;
         localDrstEditErrorValueIntCounter = sharedCounter; return hasModified;
     }
	protected static final int DRST_EDIT_ERROR_VALUE_INT_LEN = 15;
	/**
	 * 	serialize this DrstEditErrorValueInt
	 */
   protected void serializeDrstEditErrorValueInt(char[] drstEditErrorValueInt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(drstEditErrorValueInt,0,getStringValue(),beginDrstEditErrorValueInt,DRST_EDIT_ERROR_VALUE_INT_LEN);
       localDrstEditErrorValueIntCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDrstEditErrorValueIntConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshDrstEditErrorValueInt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDrstEditErrorValueInt() {	 
   		return (substring(getStringValue(),beginDrstEditErrorValueInt,beginDrstEditErrorValueInt + DRST_EDIT_ERROR_VALUE_INT_LEN));
   	}
     int localDrstEditErrorValueDecCounter = -1;
     public boolean isDrstEditErrorValueDecModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDrstEditErrorValueDecCounter != sharedCounter;
         localDrstEditErrorValueDecCounter = sharedCounter; return hasModified;
     }
	protected static final int DRST_EDIT_ERROR_VALUE_DEC_LEN = 15;
	/**
	 * 	serialize this DrstEditErrorValueDec
	 */
   protected void serializeDrstEditErrorValueDec(char[] drstEditErrorValueDec) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(drstEditErrorValueDec,0,getStringValue(),beginDrstEditErrorValueDec,DRST_EDIT_ERROR_VALUE_DEC_LEN);
       localDrstEditErrorValueDecCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDrstEditErrorValueDecConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshDrstEditErrorValueDec is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDrstEditErrorValueDec() {	 
   		return (substring(getStringValue(),beginDrstEditErrorValueDec,beginDrstEditErrorValueDec + DRST_EDIT_ERROR_VALUE_DEC_LEN));
   	}




}
  
