package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class DderefPolNbrGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DderefPolNbrGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DderefPolNbrGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DDEREF_POL_NBR_GROUP_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDderefPolNbr;
	
	/**
	* Constructor for DderefPolNbrGroupSerialized
	**/
    public DderefPolNbrGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for DderefPolNbrGroupSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DderefPolNbrGroupSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this DderefPolNbrGroupSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,238); // serialize this field at offset 238 by default 
    }
    
	/**
	* sets parent for this DderefPolNbrGroupSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 238 by default
    }    
	/**
	* initializes the field in DderefPolNbrGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DDEREF_POL_NBR_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDderefPolNbr = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDderefPolNbrCounter = -1;
     public boolean isDderefPolNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDderefPolNbrCounter != sharedCounter;
         localDderefPolNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int DDEREF_POL_NBR_LEN = 6;
	/**
	 * 	serialize this DderefPolNbr
	 */
   protected void serializeDderefPolNbr(char[] dderefPolNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dderefPolNbr,0,getStringValue(),beginDderefPolNbr,DDEREF_POL_NBR_LEN);
       localDderefPolNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDderefPolNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshDderefPolNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDderefPolNbr() {	 
   		return (substring(getStringValue(),beginDderefPolNbr,beginDderefPolNbr + DDEREF_POL_NBR_LEN));
   	}




}
  
