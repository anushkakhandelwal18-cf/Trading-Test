package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class DderefInvnCtlNbrGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DderefInvnCtlNbrGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DderefInvnCtlNbrGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DDEREF_INVN_CTL_NBR_GROUP_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDderefInvnCtlNbr;
	
	/**
	* Constructor for DderefInvnCtlNbrGroupSerialized
	**/
    public DderefInvnCtlNbrGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for DderefInvnCtlNbrGroupSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DderefInvnCtlNbrGroupSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this DderefInvnCtlNbrGroupSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,12); // serialize this field at offset 12 by default 
    }
    
	/**
	* sets parent for this DderefInvnCtlNbrGroupSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 12 by default
    }    
	/**
	* initializes the field in DderefInvnCtlNbrGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DDEREF_INVN_CTL_NBR_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDderefInvnCtlNbr = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDderefInvnCtlNbrCounter = -1;
     public boolean isDderefInvnCtlNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDderefInvnCtlNbrCounter != sharedCounter;
         localDderefInvnCtlNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int DDEREF_INVN_CTL_NBR_LEN = 10;
	/**
	 * 	serialize this DderefInvnCtlNbr
	 */
   protected void serializeDderefInvnCtlNbr(char[] dderefInvnCtlNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dderefInvnCtlNbr,0,getStringValue(),beginDderefInvnCtlNbr,DDEREF_INVN_CTL_NBR_LEN);
       localDderefInvnCtlNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDderefInvnCtlNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshDderefInvnCtlNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDderefInvnCtlNbr() {	 
   		return (substring(getStringValue(),beginDderefInvnCtlNbr,beginDderefInvnCtlNbr + DDEREF_INVN_CTL_NBR_LEN));
   	}




}
  
