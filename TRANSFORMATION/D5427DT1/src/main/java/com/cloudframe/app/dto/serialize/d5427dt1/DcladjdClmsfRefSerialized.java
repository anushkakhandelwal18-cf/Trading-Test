package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class DcladjdClmsfRefSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DcladjdClmsfRefSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DcladjdClmsfRefSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DCLADJD_CLMSF_REF_LENGTH = 206;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDrefInvnCtlNbr;
            protected  int beginDrefPolNbr;
            protected  int beginDrefEeId;
            protected  int beginDrefDepnNbr;
	
	/**
	* Constructor for DcladjdClmsfRefSerialized
	**/
    public DcladjdClmsfRefSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DcladjdClmsfRefSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DCLADJD_CLMSF_REF_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDrefInvnCtlNbr = getStartOffset() + 12;	// set offset for serialization
  
             beginDrefPolNbr = getStartOffset() + 86;	// set offset for serialization
  
             beginDrefEeId = getStartOffset() + 92;	// set offset for serialization
  
             beginDrefDepnNbr = getStartOffset() + 102;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDrefInvnCtlNbrCounter = -1;
     public boolean isDrefInvnCtlNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDrefInvnCtlNbrCounter != sharedCounter;
         localDrefInvnCtlNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int DREF_INVN_CTL_NBR_LEN = 10;
	/**
	 * 	serialize this DrefInvnCtlNbr
	 */
   protected void serializeDrefInvnCtlNbr(char[] drefInvnCtlNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(drefInvnCtlNbr,0,getStringValue(),beginDrefInvnCtlNbr,DREF_INVN_CTL_NBR_LEN);
       localDrefInvnCtlNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDrefInvnCtlNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshDrefInvnCtlNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDrefInvnCtlNbr() {	 
   		return (substring(getStringValue(),beginDrefInvnCtlNbr,beginDrefInvnCtlNbr + DREF_INVN_CTL_NBR_LEN));
   	}
     int localDrefPolNbrCounter = -1;
     public boolean isDrefPolNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDrefPolNbrCounter != sharedCounter;
         localDrefPolNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int DREF_POL_NBR_LEN = 6;
	/**
	 * 	serialize this DrefPolNbr
	 */
   protected void serializeDrefPolNbr(char[] drefPolNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(drefPolNbr,0,getStringValue(),beginDrefPolNbr,DREF_POL_NBR_LEN);
       localDrefPolNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDrefPolNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshDrefPolNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDrefPolNbr() {	 
   		return (substring(getStringValue(),beginDrefPolNbr,beginDrefPolNbr + DREF_POL_NBR_LEN));
   	}
     int localDrefEeIdCounter = -1;
     public boolean isDrefEeIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDrefEeIdCounter != sharedCounter;
         localDrefEeIdCounter = sharedCounter; return hasModified;
     }
	protected static final int DREF_EE_ID_LEN = 10;
	/**
	 * 	serialize this DrefEeId
	 */
   protected void serializeDrefEeId(char[] drefEeId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(drefEeId,0,getStringValue(),beginDrefEeId,DREF_EE_ID_LEN);
       localDrefEeIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDrefEeIdConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshDrefEeId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDrefEeId() {	 
   		return (substring(getStringValue(),beginDrefEeId,beginDrefEeId + DREF_EE_ID_LEN));
   	}
     int localDrefDepnNbrCounter = -1;
     public boolean isDrefDepnNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDrefDepnNbrCounter != sharedCounter;
         localDrefDepnNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int DREF_DEPN_NBR_LEN = 2;
	/**
	 * 	serialize this DrefDepnNbr
	 */
   protected void serializeDrefDepnNbr(char[] drefDepnNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(drefDepnNbr,0,getStringValue(),beginDrefDepnNbr,DREF_DEPN_NBR_LEN);
       localDrefDepnNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDrefDepnNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDrefDepnNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDrefDepnNbr() {	 
   		return (substring(getStringValue(),beginDrefDepnNbr,beginDrefDepnNbr + DREF_DEPN_NBR_LEN));
   	}




}
  
