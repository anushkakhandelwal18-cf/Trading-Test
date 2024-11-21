package com.cloudframe.app.trdpb007.dto.serialize;

/**
*  The class MqodSelectionstringSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-11-21 at 09:21. using version 5.0.0.153
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MqodSelectionstringSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MqodSelectionstringSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MQOD_SELECTIONSTRING_LENGTH = 20;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMqodSelectionstringVsptr;
            protected  int beginMqodSelectionstringVsoffset;
            protected  int beginMqodSelectionstringVsbufsize;
            protected  int beginMqodSelectionstringVslength;
            protected  int beginMqodSelectionstringVsccsid;
	
	/**
	* Constructor for MqodSelectionstringSerialized
	**/
    public MqodSelectionstringSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MqodSelectionstringSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MqodSelectionstringSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MqodSelectionstringSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,356); // serialize this field at offset 356 by default 
    }
    
	/**
	* sets parent for this MqodSelectionstringSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 356 by default
    }    
	/**
	* initializes the field in MqodSelectionstringSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MQOD_SELECTIONSTRING_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMqodSelectionstringVsptr = getStartOffset() + 0;	// set offset for serialization
  
             beginMqodSelectionstringVsoffset = getStartOffset() + 4;	// set offset for serialization
  
             beginMqodSelectionstringVsbufsize = getStartOffset() + 8;	// set offset for serialization
  
             beginMqodSelectionstringVslength = getStartOffset() + 12;	// set offset for serialization
  
             beginMqodSelectionstringVsccsid = getStartOffset() + 16;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMqodSelectionstringVsptrCounter = -1;
     public boolean isMqodSelectionstringVsptrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMqodSelectionstringVsptrCounter != sharedCounter;
         localMqodSelectionstringVsptrCounter = sharedCounter; return hasModified; 
     }
   protected static final int MQOD_SELECTIONSTRING_VSPTR_LEN = 4;
  	/**
	 * serializeMqodSelectionstringVsptr
	 */
	protected void serializeMqodSelectionstringVsptr(int mqodSelectionstringVsptr) {
           replaceValue( //  save the value as string
                   getBinaryString( mqodSelectionstringVsptr,MQOD_SELECTIONSTRING_VSPTR_LEN)
                  ,beginMqodSelectionstringVsptr
                  ,MQOD_SELECTIONSTRING_VSPTR_LEN
                 );
            localMqodSelectionstringVsptrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqodSelectionstringVsptrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqodSelectionstringVsptr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqodSelectionstringVsptr() {	 
			return (getInt(beginMqodSelectionstringVsptr));
   	}
         int localMqodSelectionstringVsoffsetCounter = -1;
         public boolean isMqodSelectionstringVsoffsetModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqodSelectionstringVsoffsetCounter != sharedCounter;
            localMqodSelectionstringVsoffsetCounter = sharedCounter; return hasModified; 
         }
   protected static final int MQOD_SELECTIONSTRING_VSOFFSET_LEN = 4;
  	/**
	 * serializeMqodSelectionstringVsoffset
	 */
	protected void serializeMqodSelectionstringVsoffset(int mqodSelectionstringVsoffset) {
           replaceValue( //  save the value as string
                   getBinaryString( mqodSelectionstringVsoffset,MQOD_SELECTIONSTRING_VSOFFSET_LEN)
                  ,beginMqodSelectionstringVsoffset
                  ,MQOD_SELECTIONSTRING_VSOFFSET_LEN
                 );
            localMqodSelectionstringVsoffsetCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqodSelectionstringVsoffsetMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqodSelectionstringVsoffset is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqodSelectionstringVsoffset() {	 
			return (getInt(beginMqodSelectionstringVsoffset));
   	}
         int localMqodSelectionstringVsbufsizeCounter = -1;
         public boolean isMqodSelectionstringVsbufsizeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqodSelectionstringVsbufsizeCounter != sharedCounter;
            localMqodSelectionstringVsbufsizeCounter = sharedCounter; return hasModified; 
         }
   protected static final int MQOD_SELECTIONSTRING_VSBUFSIZE_LEN = 4;
  	/**
	 * serializeMqodSelectionstringVsbufsize
	 */
	protected void serializeMqodSelectionstringVsbufsize(int mqodSelectionstringVsbufsize) {
           replaceValue( //  save the value as string
                   getBinaryString( mqodSelectionstringVsbufsize,MQOD_SELECTIONSTRING_VSBUFSIZE_LEN)
                  ,beginMqodSelectionstringVsbufsize
                  ,MQOD_SELECTIONSTRING_VSBUFSIZE_LEN
                 );
            localMqodSelectionstringVsbufsizeCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqodSelectionstringVsbufsizeMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqodSelectionstringVsbufsize is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqodSelectionstringVsbufsize() {	 
			return (getInt(beginMqodSelectionstringVsbufsize));
   	}
         int localMqodSelectionstringVslengthCounter = -1;
         public boolean isMqodSelectionstringVslengthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqodSelectionstringVslengthCounter != sharedCounter;
            localMqodSelectionstringVslengthCounter = sharedCounter; return hasModified; 
         }
   protected static final int MQOD_SELECTIONSTRING_VSLENGTH_LEN = 4;
  	/**
	 * serializeMqodSelectionstringVslength
	 */
	protected void serializeMqodSelectionstringVslength(int mqodSelectionstringVslength) {
           replaceValue( //  save the value as string
                   getBinaryString( mqodSelectionstringVslength,MQOD_SELECTIONSTRING_VSLENGTH_LEN)
                  ,beginMqodSelectionstringVslength
                  ,MQOD_SELECTIONSTRING_VSLENGTH_LEN
                 );
            localMqodSelectionstringVslengthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqodSelectionstringVslengthMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqodSelectionstringVslength is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqodSelectionstringVslength() {	 
			return (getInt(beginMqodSelectionstringVslength));
   	}
         int localMqodSelectionstringVsccsidCounter = -1;
         public boolean isMqodSelectionstringVsccsidModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqodSelectionstringVsccsidCounter != sharedCounter;
            localMqodSelectionstringVsccsidCounter = sharedCounter; return hasModified; 
         }
   protected static final int MQOD_SELECTIONSTRING_VSCCSID_LEN = 4;
  	/**
	 * serializeMqodSelectionstringVsccsid
	 */
	protected void serializeMqodSelectionstringVsccsid(int mqodSelectionstringVsccsid) {
           replaceValue( //  save the value as string
                   getBinaryString( mqodSelectionstringVsccsid,MQOD_SELECTIONSTRING_VSCCSID_LEN)
                  ,beginMqodSelectionstringVsccsid
                  ,MQOD_SELECTIONSTRING_VSCCSID_LEN
                 );
            localMqodSelectionstringVsccsidCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqodSelectionstringVsccsidMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqodSelectionstringVsccsid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqodSelectionstringVsccsid() {	 
			return (getInt(beginMqodSelectionstringVsccsid));
   	}




}
  
