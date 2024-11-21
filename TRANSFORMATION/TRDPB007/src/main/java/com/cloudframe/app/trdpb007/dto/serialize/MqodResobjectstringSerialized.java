package com.cloudframe.app.trdpb007.dto.serialize;

/**
*  The class MqodResobjectstringSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-11-21 at 09:21. using version 5.0.0.153
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MqodResobjectstringSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MqodResobjectstringSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MQOD_RESOBJECTSTRING_LENGTH = 20;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMqodResobjectstringVsptr;
            protected  int beginMqodResobjectstringVsoffset;
            protected  int beginMqodResobjectstringVsbufsize;
            protected  int beginMqodResobjectstringVslength;
            protected  int beginMqodResobjectstringVsccsid;
	
	/**
	* Constructor for MqodResobjectstringSerialized
	**/
    public MqodResobjectstringSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MqodResobjectstringSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MqodResobjectstringSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MqodResobjectstringSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,376); // serialize this field at offset 376 by default 
    }
    
	/**
	* sets parent for this MqodResobjectstringSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 376 by default
    }    
	/**
	* initializes the field in MqodResobjectstringSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MQOD_RESOBJECTSTRING_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMqodResobjectstringVsptr = getStartOffset() + 0;	// set offset for serialization
  
             beginMqodResobjectstringVsoffset = getStartOffset() + 4;	// set offset for serialization
  
             beginMqodResobjectstringVsbufsize = getStartOffset() + 8;	// set offset for serialization
  
             beginMqodResobjectstringVslength = getStartOffset() + 12;	// set offset for serialization
  
             beginMqodResobjectstringVsccsid = getStartOffset() + 16;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMqodResobjectstringVsptrCounter = -1;
     public boolean isMqodResobjectstringVsptrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMqodResobjectstringVsptrCounter != sharedCounter;
         localMqodResobjectstringVsptrCounter = sharedCounter; return hasModified; 
     }
   protected static final int MQOD_RESOBJECTSTRING_VSPTR_LEN = 4;
  	/**
	 * serializeMqodResobjectstringVsptr
	 */
	protected void serializeMqodResobjectstringVsptr(int mqodResobjectstringVsptr) {
           replaceValue( //  save the value as string
                   getBinaryString( mqodResobjectstringVsptr,MQOD_RESOBJECTSTRING_VSPTR_LEN)
                  ,beginMqodResobjectstringVsptr
                  ,MQOD_RESOBJECTSTRING_VSPTR_LEN
                 );
            localMqodResobjectstringVsptrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqodResobjectstringVsptrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqodResobjectstringVsptr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqodResobjectstringVsptr() {	 
			return (getInt(beginMqodResobjectstringVsptr));
   	}
         int localMqodResobjectstringVsoffsetCounter = -1;
         public boolean isMqodResobjectstringVsoffsetModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqodResobjectstringVsoffsetCounter != sharedCounter;
            localMqodResobjectstringVsoffsetCounter = sharedCounter; return hasModified; 
         }
   protected static final int MQOD_RESOBJECTSTRING_VSOFFSET_LEN = 4;
  	/**
	 * serializeMqodResobjectstringVsoffset
	 */
	protected void serializeMqodResobjectstringVsoffset(int mqodResobjectstringVsoffset) {
           replaceValue( //  save the value as string
                   getBinaryString( mqodResobjectstringVsoffset,MQOD_RESOBJECTSTRING_VSOFFSET_LEN)
                  ,beginMqodResobjectstringVsoffset
                  ,MQOD_RESOBJECTSTRING_VSOFFSET_LEN
                 );
            localMqodResobjectstringVsoffsetCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqodResobjectstringVsoffsetMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqodResobjectstringVsoffset is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqodResobjectstringVsoffset() {	 
			return (getInt(beginMqodResobjectstringVsoffset));
   	}
         int localMqodResobjectstringVsbufsizeCounter = -1;
         public boolean isMqodResobjectstringVsbufsizeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqodResobjectstringVsbufsizeCounter != sharedCounter;
            localMqodResobjectstringVsbufsizeCounter = sharedCounter; return hasModified; 
         }
   protected static final int MQOD_RESOBJECTSTRING_VSBUFSIZE_LEN = 4;
  	/**
	 * serializeMqodResobjectstringVsbufsize
	 */
	protected void serializeMqodResobjectstringVsbufsize(int mqodResobjectstringVsbufsize) {
           replaceValue( //  save the value as string
                   getBinaryString( mqodResobjectstringVsbufsize,MQOD_RESOBJECTSTRING_VSBUFSIZE_LEN)
                  ,beginMqodResobjectstringVsbufsize
                  ,MQOD_RESOBJECTSTRING_VSBUFSIZE_LEN
                 );
            localMqodResobjectstringVsbufsizeCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqodResobjectstringVsbufsizeMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqodResobjectstringVsbufsize is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqodResobjectstringVsbufsize() {	 
			return (getInt(beginMqodResobjectstringVsbufsize));
   	}
         int localMqodResobjectstringVslengthCounter = -1;
         public boolean isMqodResobjectstringVslengthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqodResobjectstringVslengthCounter != sharedCounter;
            localMqodResobjectstringVslengthCounter = sharedCounter; return hasModified; 
         }
   protected static final int MQOD_RESOBJECTSTRING_VSLENGTH_LEN = 4;
  	/**
	 * serializeMqodResobjectstringVslength
	 */
	protected void serializeMqodResobjectstringVslength(int mqodResobjectstringVslength) {
           replaceValue( //  save the value as string
                   getBinaryString( mqodResobjectstringVslength,MQOD_RESOBJECTSTRING_VSLENGTH_LEN)
                  ,beginMqodResobjectstringVslength
                  ,MQOD_RESOBJECTSTRING_VSLENGTH_LEN
                 );
            localMqodResobjectstringVslengthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqodResobjectstringVslengthMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqodResobjectstringVslength is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqodResobjectstringVslength() {	 
			return (getInt(beginMqodResobjectstringVslength));
   	}
         int localMqodResobjectstringVsccsidCounter = -1;
         public boolean isMqodResobjectstringVsccsidModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqodResobjectstringVsccsidCounter != sharedCounter;
            localMqodResobjectstringVsccsidCounter = sharedCounter; return hasModified; 
         }
   protected static final int MQOD_RESOBJECTSTRING_VSCCSID_LEN = 4;
  	/**
	 * serializeMqodResobjectstringVsccsid
	 */
	protected void serializeMqodResobjectstringVsccsid(int mqodResobjectstringVsccsid) {
           replaceValue( //  save the value as string
                   getBinaryString( mqodResobjectstringVsccsid,MQOD_RESOBJECTSTRING_VSCCSID_LEN)
                  ,beginMqodResobjectstringVsccsid
                  ,MQOD_RESOBJECTSTRING_VSCCSID_LEN
                 );
            localMqodResobjectstringVsccsidCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqodResobjectstringVsccsidMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqodResobjectstringVsccsid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqodResobjectstringVsccsid() {	 
			return (getInt(beginMqodResobjectstringVsccsid));
   	}




}
  
