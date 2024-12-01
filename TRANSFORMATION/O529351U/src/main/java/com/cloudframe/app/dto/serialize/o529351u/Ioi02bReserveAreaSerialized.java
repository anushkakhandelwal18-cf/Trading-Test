package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class Ioi02bReserveAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ioi02bReserveAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ioi02bReserveAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IOI_02B_RESERVE_AREA_LENGTH = 120;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIoi02bWorkAreaAddr;
            protected  int beginIoi02bWorkAreaPtr;
            protected  int beginIoi02bInterfaceAddr;
            protected  int beginIoi02bInterfacePtr;
            protected  int beginIoi02bJournalAddr;
            protected  int beginIoi02bJournalPtr;
	
	/**
	* Constructor for Ioi02bReserveAreaSerialized
	**/
    public Ioi02bReserveAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ioi02bReserveAreaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ioi02bReserveAreaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ioi02bReserveAreaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,350); // serialize this field at offset 350 by default 
    }
    
	/**
	* sets parent for this Ioi02bReserveAreaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 350 by default
    }    
	/**
	* initializes the field in Ioi02bReserveAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IOI_02B_RESERVE_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIoi02bWorkAreaAddr = getStartOffset() + 0;	// set offset for serialization
  
             beginIoi02bWorkAreaPtr = getStartOffset() + 0;	// set offset for serialization
  
             beginIoi02bInterfaceAddr = getStartOffset() + 4;	// set offset for serialization
  
             beginIoi02bInterfacePtr = getStartOffset() + 4;	// set offset for serialization
  
             beginIoi02bJournalAddr = getStartOffset() + 8;	// set offset for serialization
  
             beginIoi02bJournalPtr = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localIoi02bWorkAreaAddrCounter = -1;
         public boolean isIoi02bWorkAreaAddrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIoi02bWorkAreaAddrCounter != sharedCounter;
            localIoi02bWorkAreaAddrCounter = sharedCounter; return hasModified; 
         }
   protected static final int IOI_02B_WORK_AREA_ADDR_LEN = 4;
  	/**
	 * serializeIoi02bWorkAreaAddr
	 */
	protected void serializeIoi02bWorkAreaAddr(int ioi02bWorkAreaAddr) {
           replaceValue( //  save the value as string
                   getBinaryString( ioi02bWorkAreaAddr,IOI_02B_WORK_AREA_ADDR_LEN)
                  ,beginIoi02bWorkAreaAddr
                  ,IOI_02B_WORK_AREA_ADDR_LEN
                 );
            localIoi02bWorkAreaAddrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIoi02bWorkAreaAddrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIoi02bWorkAreaAddr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIoi02bWorkAreaAddr() {	 
			return (getInt(beginIoi02bWorkAreaAddr));
   	}
     int localIoi02bWorkAreaPtrCounter = -1;
     public boolean isIoi02bWorkAreaPtrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIoi02bWorkAreaPtrCounter != sharedCounter;
         localIoi02bWorkAreaPtrCounter = sharedCounter; return hasModified; 
     }
   protected static final int IOI_02B_WORK_AREA_PTR_LEN = 4;
  	/**
	 * serializeIoi02bWorkAreaPtr
	 */
	protected void serializeIoi02bWorkAreaPtr(int ioi02bWorkAreaPtr) {
           replaceValue( //  save the value as string
                   getBinaryString( ioi02bWorkAreaPtr,IOI_02B_WORK_AREA_PTR_LEN)
                  ,beginIoi02bWorkAreaPtr
                  ,IOI_02B_WORK_AREA_PTR_LEN
                 );
            localIoi02bWorkAreaPtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIoi02bWorkAreaPtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIoi02bWorkAreaPtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIoi02bWorkAreaPtr() {	 
			return (getInt(beginIoi02bWorkAreaPtr));
   	}
         int localIoi02bInterfaceAddrCounter = -1;
         public boolean isIoi02bInterfaceAddrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIoi02bInterfaceAddrCounter != sharedCounter;
            localIoi02bInterfaceAddrCounter = sharedCounter; return hasModified; 
         }
   protected static final int IOI_02B_INTERFACE_ADDR_LEN = 4;
  	/**
	 * serializeIoi02bInterfaceAddr
	 */
	protected void serializeIoi02bInterfaceAddr(int ioi02bInterfaceAddr) {
           replaceValue( //  save the value as string
                   getBinaryString( ioi02bInterfaceAddr,IOI_02B_INTERFACE_ADDR_LEN)
                  ,beginIoi02bInterfaceAddr
                  ,IOI_02B_INTERFACE_ADDR_LEN
                 );
            localIoi02bInterfaceAddrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIoi02bInterfaceAddrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIoi02bInterfaceAddr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIoi02bInterfaceAddr() {	 
			return (getInt(beginIoi02bInterfaceAddr));
   	}
     int localIoi02bInterfacePtrCounter = -1;
     public boolean isIoi02bInterfacePtrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIoi02bInterfacePtrCounter != sharedCounter;
         localIoi02bInterfacePtrCounter = sharedCounter; return hasModified; 
     }
   protected static final int IOI_02B_INTERFACE_PTR_LEN = 4;
  	/**
	 * serializeIoi02bInterfacePtr
	 */
	protected void serializeIoi02bInterfacePtr(int ioi02bInterfacePtr) {
           replaceValue( //  save the value as string
                   getBinaryString( ioi02bInterfacePtr,IOI_02B_INTERFACE_PTR_LEN)
                  ,beginIoi02bInterfacePtr
                  ,IOI_02B_INTERFACE_PTR_LEN
                 );
            localIoi02bInterfacePtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIoi02bInterfacePtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIoi02bInterfacePtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIoi02bInterfacePtr() {	 
			return (getInt(beginIoi02bInterfacePtr));
   	}
         int localIoi02bJournalAddrCounter = -1;
         public boolean isIoi02bJournalAddrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIoi02bJournalAddrCounter != sharedCounter;
            localIoi02bJournalAddrCounter = sharedCounter; return hasModified; 
         }
   protected static final int IOI_02B_JOURNAL_ADDR_LEN = 4;
  	/**
	 * serializeIoi02bJournalAddr
	 */
	protected void serializeIoi02bJournalAddr(int ioi02bJournalAddr) {
           replaceValue( //  save the value as string
                   getBinaryString( ioi02bJournalAddr,IOI_02B_JOURNAL_ADDR_LEN)
                  ,beginIoi02bJournalAddr
                  ,IOI_02B_JOURNAL_ADDR_LEN
                 );
            localIoi02bJournalAddrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIoi02bJournalAddrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIoi02bJournalAddr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIoi02bJournalAddr() {	 
			return (getInt(beginIoi02bJournalAddr));
   	}
     int localIoi02bJournalPtrCounter = -1;
     public boolean isIoi02bJournalPtrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIoi02bJournalPtrCounter != sharedCounter;
         localIoi02bJournalPtrCounter = sharedCounter; return hasModified; 
     }
   protected static final int IOI_02B_JOURNAL_PTR_LEN = 4;
  	/**
	 * serializeIoi02bJournalPtr
	 */
	protected void serializeIoi02bJournalPtr(int ioi02bJournalPtr) {
           replaceValue( //  save the value as string
                   getBinaryString( ioi02bJournalPtr,IOI_02B_JOURNAL_PTR_LEN)
                  ,beginIoi02bJournalPtr
                  ,IOI_02B_JOURNAL_PTR_LEN
                 );
            localIoi02bJournalPtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIoi02bJournalPtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIoi02bJournalPtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIoi02bJournalPtr() {	 
			return (getInt(beginIoi02bJournalPtr));
   	}




}
  
