package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class Ioi02bCurRecAddrAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ioi02bCurRecAddrAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ioi02bCurRecAddrAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IOI_02B_CUR_REC_ADDR_AREA_LENGTH = 16;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIoi02bRelRecNum;
            protected  int beginIoi02bRelBlkNum;
	
	/**
	* Constructor for Ioi02bCurRecAddrAreaSerialized
	**/
    public Ioi02bCurRecAddrAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ioi02bCurRecAddrAreaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ioi02bCurRecAddrAreaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ioi02bCurRecAddrAreaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,24); // serialize this field at offset 24 by default 
    }
    
	/**
	* sets parent for this Ioi02bCurRecAddrAreaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 24 by default
    }    
	/**
	* initializes the field in Ioi02bCurRecAddrAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IOI_02B_CUR_REC_ADDR_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIoi02bRelRecNum = getStartOffset() + 0;	// set offset for serialization
  
             beginIoi02bRelBlkNum = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localIoi02bRelRecNumCounter = -1;
         public boolean isIoi02bRelRecNumModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIoi02bRelRecNumCounter != sharedCounter;
            localIoi02bRelRecNumCounter = sharedCounter; return hasModified; 
         }
   protected static final int IOI_02B_REL_REC_NUM_LEN = 4;
  	/**
	 * serializeIoi02bRelRecNum
	 */
	protected void serializeIoi02bRelRecNum(int ioi02bRelRecNum) {
           replaceValue( //  save the value as string
                   getBinaryString( ioi02bRelRecNum,IOI_02B_REL_REC_NUM_LEN)
                  ,beginIoi02bRelRecNum
                  ,IOI_02B_REL_REC_NUM_LEN
                 );
            localIoi02bRelRecNumCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIoi02bRelRecNumMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIoi02bRelRecNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIoi02bRelRecNum() {	 
			return (getInt(beginIoi02bRelRecNum));
   	}
         int localIoi02bRelBlkNumCounter = -1;
         public boolean isIoi02bRelBlkNumModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIoi02bRelBlkNumCounter != sharedCounter;
            localIoi02bRelBlkNumCounter = sharedCounter; return hasModified; 
         }
   protected static final int IOI_02B_REL_BLK_NUM_LEN = 4;
  	/**
	 * serializeIoi02bRelBlkNum
	 */
	protected void serializeIoi02bRelBlkNum(int ioi02bRelBlkNum) {
           replaceValue( //  save the value as string
                   getBinaryString( ioi02bRelBlkNum,IOI_02B_REL_BLK_NUM_LEN)
                  ,beginIoi02bRelBlkNum
                  ,IOI_02B_REL_BLK_NUM_LEN
                 );
            localIoi02bRelBlkNumCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIoi02bRelBlkNumMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIoi02bRelBlkNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIoi02bRelBlkNum() {	 
			return (getInt(beginIoi02bRelBlkNum));
   	}




}
  
