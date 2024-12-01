package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class DderefIcnSufxCdGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DderefIcnSufxCdGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DderefIcnSufxCdGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DDEREF_ICN_SUFX_CD_GROUP_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDderefIcnSufxCd;
	
	/**
	* Constructor for DderefIcnSufxCdGroupSerialized
	**/
    public DderefIcnSufxCdGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for DderefIcnSufxCdGroupSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DderefIcnSufxCdGroupSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this DderefIcnSufxCdGroupSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,22); // serialize this field at offset 22 by default 
    }
    
	/**
	* sets parent for this DderefIcnSufxCdGroupSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 22 by default
    }    
	/**
	* initializes the field in DderefIcnSufxCdGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DDEREF_ICN_SUFX_CD_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDderefIcnSufxCd = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDderefIcnSufxCdCounter = -1;
     public boolean isDderefIcnSufxCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDderefIcnSufxCdCounter != sharedCounter;
         localDderefIcnSufxCdCounter = sharedCounter; return hasModified;
     }
	protected static final int DDEREF_ICN_SUFX_CD_LEN = 2;
	/**
	 * 	serialize this DderefIcnSufxCd
	 */
   protected void serializeDderefIcnSufxCd(char[] dderefIcnSufxCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dderefIcnSufxCd,0,getStringValue(),beginDderefIcnSufxCd,DDEREF_ICN_SUFX_CD_LEN);
       localDderefIcnSufxCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDderefIcnSufxCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDderefIcnSufxCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDderefIcnSufxCd() {	 
   		return (substring(getStringValue(),beginDderefIcnSufxCd,beginDderefIcnSufxCd + DDEREF_ICN_SUFX_CD_LEN));
   	}




}
  
