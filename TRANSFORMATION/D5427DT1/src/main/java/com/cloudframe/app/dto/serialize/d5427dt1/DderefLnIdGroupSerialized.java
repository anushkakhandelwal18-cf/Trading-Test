package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class DderefLnIdGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DderefLnIdGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DderefLnIdGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DDEREF_LN_ID_GROUP_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDderefLnId;
	
	/**
	* Constructor for DderefLnIdGroupSerialized
	**/
    public DderefLnIdGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for DderefLnIdGroupSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DderefLnIdGroupSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this DderefLnIdGroupSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,44); // serialize this field at offset 44 by default 
    }
    
	/**
	* sets parent for this DderefLnIdGroupSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 44 by default
    }    
	/**
	* initializes the field in DderefLnIdGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DDEREF_LN_ID_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDderefLnId = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localDderefLnIdCounter = -1;
         public boolean isDderefLnIdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localDderefLnIdCounter != sharedCounter;
            localDderefLnIdCounter = sharedCounter; return hasModified; 
         }
   protected static final int DDEREF_LN_ID_LEN = 2;
  	/**
	 * serializeDderefLnId
	 */
	protected void serializeDderefLnId(short dderefLnId) {
           replaceValue( //  save the value as string
                   getBinaryString( dderefLnId,DDEREF_LN_ID_LEN)
                  ,beginDderefLnId
                  ,DDEREF_LN_ID_LEN
                 );
            localDderefLnIdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkDderefLnIdMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshDderefLnId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshDderefLnId() {	 
			return (getShort(beginDderefLnId));
   	}




}
  
