package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class AsnVariablesSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AsnVariablesSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AsnVariablesSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ASN_VARIABLES_LENGTH = 44;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAsnAbcode;
            protected  int beginAsnNetname;
            protected  int beginAsnPrinsysid;
            protected  int beginAsnInvokingprog;
            protected  int beginAsnProgram;
            protected  int beginAsnApplid;
            protected  int beginAsnSysid;
	
	/**
	* Constructor for AsnVariablesSerialized
	**/
    public AsnVariablesSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AsnVariablesSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AsnVariablesSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AsnVariablesSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,134); // serialize this field at offset 134 by default 
    }
    
	/**
	* sets parent for this AsnVariablesSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 134 by default
    }    
	/**
	* initializes the field in AsnVariablesSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ASN_VARIABLES_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginAsnAbcode = getStartOffset() + 0;	// set offset for serialization
  
             beginAsnNetname = getStartOffset() + 4;	// set offset for serialization
  
             beginAsnPrinsysid = getStartOffset() + 12;	// set offset for serialization
  
             beginAsnInvokingprog = getStartOffset() + 16;	// set offset for serialization
  
             beginAsnProgram = getStartOffset() + 24;	// set offset for serialization
  
             beginAsnApplid = getStartOffset() + 32;	// set offset for serialization
  
             beginAsnSysid = getStartOffset() + 40;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localAsnAbcodeCounter = -1;
     public boolean isAsnAbcodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAsnAbcodeCounter != sharedCounter;
         localAsnAbcodeCounter = sharedCounter; return hasModified;
     }
	protected static final int ASN_ABCODE_LEN = 4;
	/**
	 * 	serialize this AsnAbcode
	 */
   protected void serializeAsnAbcode(char[] asnAbcode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(asnAbcode,0,getStringValue(),beginAsnAbcode,ASN_ABCODE_LEN);
       localAsnAbcodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAsnAbcodeConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshAsnAbcode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAsnAbcode() {	 
   		return (substring(getStringValue(),beginAsnAbcode,beginAsnAbcode + ASN_ABCODE_LEN));
   	}
     int localAsnNetnameCounter = -1;
     public boolean isAsnNetnameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAsnNetnameCounter != sharedCounter;
         localAsnNetnameCounter = sharedCounter; return hasModified;
     }
	protected static final int ASN_NETNAME_LEN = 8;
	/**
	 * 	serialize this AsnNetname
	 */
   protected void serializeAsnNetname(char[] asnNetname) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(asnNetname,0,getStringValue(),beginAsnNetname,ASN_NETNAME_LEN);
       localAsnNetnameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAsnNetnameConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshAsnNetname is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAsnNetname() {	 
   		return (substring(getStringValue(),beginAsnNetname,beginAsnNetname + ASN_NETNAME_LEN));
   	}
     int localAsnPrinsysidCounter = -1;
     public boolean isAsnPrinsysidModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAsnPrinsysidCounter != sharedCounter;
         localAsnPrinsysidCounter = sharedCounter; return hasModified;
     }
	protected static final int ASN_PRINSYSID_LEN = 4;
	/**
	 * 	serialize this AsnPrinsysid
	 */
   protected void serializeAsnPrinsysid(char[] asnPrinsysid) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(asnPrinsysid,0,getStringValue(),beginAsnPrinsysid,ASN_PRINSYSID_LEN);
       localAsnPrinsysidCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAsnPrinsysidConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshAsnPrinsysid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAsnPrinsysid() {	 
   		return (substring(getStringValue(),beginAsnPrinsysid,beginAsnPrinsysid + ASN_PRINSYSID_LEN));
   	}
     int localAsnInvokingprogCounter = -1;
     public boolean isAsnInvokingprogModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAsnInvokingprogCounter != sharedCounter;
         localAsnInvokingprogCounter = sharedCounter; return hasModified;
     }
	protected static final int ASN_INVOKINGPROG_LEN = 8;
	/**
	 * 	serialize this AsnInvokingprog
	 */
   protected void serializeAsnInvokingprog(char[] asnInvokingprog) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(asnInvokingprog,0,getStringValue(),beginAsnInvokingprog,ASN_INVOKINGPROG_LEN);
       localAsnInvokingprogCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAsnInvokingprogConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshAsnInvokingprog is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAsnInvokingprog() {	 
   		return (substring(getStringValue(),beginAsnInvokingprog,beginAsnInvokingprog + ASN_INVOKINGPROG_LEN));
   	}
     int localAsnProgramCounter = -1;
     public boolean isAsnProgramModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAsnProgramCounter != sharedCounter;
         localAsnProgramCounter = sharedCounter; return hasModified;
     }
	protected static final int ASN_PROGRAM_LEN = 8;
	/**
	 * 	serialize this AsnProgram
	 */
   protected void serializeAsnProgram(char[] asnProgram) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(asnProgram,0,getStringValue(),beginAsnProgram,ASN_PROGRAM_LEN);
       localAsnProgramCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAsnProgramConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshAsnProgram is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAsnProgram() {	 
   		return (substring(getStringValue(),beginAsnProgram,beginAsnProgram + ASN_PROGRAM_LEN));
   	}
     int localAsnApplidCounter = -1;
     public boolean isAsnApplidModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAsnApplidCounter != sharedCounter;
         localAsnApplidCounter = sharedCounter; return hasModified;
     }
	protected static final int ASN_APPLID_LEN = 8;
	/**
	 * 	serialize this AsnApplid
	 */
   protected void serializeAsnApplid(char[] asnApplid) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(asnApplid,0,getStringValue(),beginAsnApplid,ASN_APPLID_LEN);
       localAsnApplidCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAsnApplidConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshAsnApplid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAsnApplid() {	 
   		return (substring(getStringValue(),beginAsnApplid,beginAsnApplid + ASN_APPLID_LEN));
   	}
     int localAsnSysidCounter = -1;
     public boolean isAsnSysidModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAsnSysidCounter != sharedCounter;
         localAsnSysidCounter = sharedCounter; return hasModified;
     }
	protected static final int ASN_SYSID_LEN = 4;
	/**
	 * 	serialize this AsnSysid
	 */
   protected void serializeAsnSysid(char[] asnSysid) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(asnSysid,0,getStringValue(),beginAsnSysid,ASN_SYSID_LEN);
       localAsnSysidCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAsnSysidConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshAsnSysid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAsnSysid() {	 
   		return (substring(getStringValue(),beginAsnSysid,beginAsnSysid + ASN_SYSID_LEN));
   	}




}
  
