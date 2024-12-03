package com.cloudframe.app.trdpb007.dto.serialize;

/**
*  The class MqodObjectstringSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-03 at 14:02. using version 5.0.0.162
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MqodObjectstringSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MqodObjectstringSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MQOD_OBJECTSTRING_LENGTH = 20;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMqodObjectstringVsptr;
            protected  int beginMqodObjectstringVsoffset;
            protected  int beginMqodObjectstringVsbufsize;
            protected  int beginMqodObjectstringVslength;
            protected  int beginMqodObjectstringVsccsid;
	
	/**
	* Constructor for MqodObjectstringSerialized
	**/
    public MqodObjectstringSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MqodObjectstringSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MqodObjectstringSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MqodObjectstringSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,336); // serialize this field at offset 336 by default 
    }
    
	/**
	* sets parent for this MqodObjectstringSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 336 by default
    }    
	/**
	* initializes the field in MqodObjectstringSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MQOD_OBJECTSTRING_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMqodObjectstringVsptr = getStartOffset() + 0;	// set offset for serialization
  
             beginMqodObjectstringVsoffset = getStartOffset() + 4;	// set offset for serialization
  
             beginMqodObjectstringVsbufsize = getStartOffset() + 8;	// set offset for serialization
  
             beginMqodObjectstringVslength = getStartOffset() + 12;	// set offset for serialization
  
             beginMqodObjectstringVsccsid = getStartOffset() + 16;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMqodObjectstringVsptrCounter = -1;
     public boolean isMqodObjectstringVsptrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMqodObjectstringVsptrCounter != sharedCounter;
         localMqodObjectstringVsptrCounter = sharedCounter; return hasModified; 
     }
   protected static final int MQOD_OBJECTSTRING_VSPTR_LEN = 4;
  	/**
	 * serializeMqodObjectstringVsptr
	 */
	protected void serializeMqodObjectstringVsptr(int mqodObjectstringVsptr) {
           replaceValue( //  save the value as string
                   getBinaryString( mqodObjectstringVsptr,MQOD_OBJECTSTRING_VSPTR_LEN)
                  ,beginMqodObjectstringVsptr
                  ,MQOD_OBJECTSTRING_VSPTR_LEN
                 );
            localMqodObjectstringVsptrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqodObjectstringVsptrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqodObjectstringVsptr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqodObjectstringVsptr() {	 
			return (getInt(beginMqodObjectstringVsptr));
   	}
         int localMqodObjectstringVsoffsetCounter = -1;
         public boolean isMqodObjectstringVsoffsetModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqodObjectstringVsoffsetCounter != sharedCounter;
            localMqodObjectstringVsoffsetCounter = sharedCounter; return hasModified; 
         }
   protected static final int MQOD_OBJECTSTRING_VSOFFSET_LEN = 4;
  	/**
	 * serializeMqodObjectstringVsoffset
	 */
	protected void serializeMqodObjectstringVsoffset(int mqodObjectstringVsoffset) {
           replaceValue( //  save the value as string
                   getBinaryString( mqodObjectstringVsoffset,MQOD_OBJECTSTRING_VSOFFSET_LEN)
                  ,beginMqodObjectstringVsoffset
                  ,MQOD_OBJECTSTRING_VSOFFSET_LEN
                 );
            localMqodObjectstringVsoffsetCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqodObjectstringVsoffsetMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqodObjectstringVsoffset is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqodObjectstringVsoffset() {	 
			return (getInt(beginMqodObjectstringVsoffset));
   	}
         int localMqodObjectstringVsbufsizeCounter = -1;
         public boolean isMqodObjectstringVsbufsizeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqodObjectstringVsbufsizeCounter != sharedCounter;
            localMqodObjectstringVsbufsizeCounter = sharedCounter; return hasModified; 
         }
   protected static final int MQOD_OBJECTSTRING_VSBUFSIZE_LEN = 4;
  	/**
	 * serializeMqodObjectstringVsbufsize
	 */
	protected void serializeMqodObjectstringVsbufsize(int mqodObjectstringVsbufsize) {
           replaceValue( //  save the value as string
                   getBinaryString( mqodObjectstringVsbufsize,MQOD_OBJECTSTRING_VSBUFSIZE_LEN)
                  ,beginMqodObjectstringVsbufsize
                  ,MQOD_OBJECTSTRING_VSBUFSIZE_LEN
                 );
            localMqodObjectstringVsbufsizeCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqodObjectstringVsbufsizeMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqodObjectstringVsbufsize is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqodObjectstringVsbufsize() {	 
			return (getInt(beginMqodObjectstringVsbufsize));
   	}
         int localMqodObjectstringVslengthCounter = -1;
         public boolean isMqodObjectstringVslengthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqodObjectstringVslengthCounter != sharedCounter;
            localMqodObjectstringVslengthCounter = sharedCounter; return hasModified; 
         }
   protected static final int MQOD_OBJECTSTRING_VSLENGTH_LEN = 4;
  	/**
	 * serializeMqodObjectstringVslength
	 */
	protected void serializeMqodObjectstringVslength(int mqodObjectstringVslength) {
           replaceValue( //  save the value as string
                   getBinaryString( mqodObjectstringVslength,MQOD_OBJECTSTRING_VSLENGTH_LEN)
                  ,beginMqodObjectstringVslength
                  ,MQOD_OBJECTSTRING_VSLENGTH_LEN
                 );
            localMqodObjectstringVslengthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqodObjectstringVslengthMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqodObjectstringVslength is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqodObjectstringVslength() {	 
			return (getInt(beginMqodObjectstringVslength));
   	}
         int localMqodObjectstringVsccsidCounter = -1;
         public boolean isMqodObjectstringVsccsidModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqodObjectstringVsccsidCounter != sharedCounter;
            localMqodObjectstringVsccsidCounter = sharedCounter; return hasModified; 
         }
   protected static final int MQOD_OBJECTSTRING_VSCCSID_LEN = 4;
  	/**
	 * serializeMqodObjectstringVsccsid
	 */
	protected void serializeMqodObjectstringVsccsid(int mqodObjectstringVsccsid) {
           replaceValue( //  save the value as string
                   getBinaryString( mqodObjectstringVsccsid,MQOD_OBJECTSTRING_VSCCSID_LEN)
                  ,beginMqodObjectstringVsccsid
                  ,MQOD_OBJECTSTRING_VSCCSID_LEN
                 );
            localMqodObjectstringVsccsidCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMqodObjectstringVsccsidMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMqodObjectstringVsccsid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMqodObjectstringVsccsid() {	 
			return (getInt(beginMqodObjectstringVsccsid));
   	}




}
  
