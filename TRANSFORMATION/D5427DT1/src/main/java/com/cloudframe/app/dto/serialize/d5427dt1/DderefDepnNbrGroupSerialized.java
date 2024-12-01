package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class DderefDepnNbrGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DderefDepnNbrGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DderefDepnNbrGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DDEREF_DEPN_NBR_GROUP_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDderefDepnNbr;
	
	/**
	* Constructor for DderefDepnNbrGroupSerialized
	**/
    public DderefDepnNbrGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for DderefDepnNbrGroupSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DderefDepnNbrGroupSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this DderefDepnNbrGroupSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,87); // serialize this field at offset 87 by default 
    }
    
	/**
	* sets parent for this DderefDepnNbrGroupSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 87 by default
    }    
	/**
	* initializes the field in DderefDepnNbrGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DDEREF_DEPN_NBR_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDderefDepnNbr = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDderefDepnNbrCounter = -1;
     public boolean isDderefDepnNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDderefDepnNbrCounter != sharedCounter;
         localDderefDepnNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int DDEREF_DEPN_NBR_LEN = 2;
	/**
	 * 	serialize this DderefDepnNbr
	 */
   protected void serializeDderefDepnNbr(char[] dderefDepnNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dderefDepnNbr,0,getStringValue(),beginDderefDepnNbr,DDEREF_DEPN_NBR_LEN);
       localDderefDepnNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDderefDepnNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDderefDepnNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDderefDepnNbr() {	 
   		return (substring(getStringValue(),beginDderefDepnNbr,beginDderefDepnNbr + DDEREF_DEPN_NBR_LEN));
   	}




}
  
