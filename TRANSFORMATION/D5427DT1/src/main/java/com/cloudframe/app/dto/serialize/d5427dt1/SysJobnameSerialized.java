package com.cloudframe.app.dto.serialize.d5427dt1;

/**
*  The class SysJobnameSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 06:55. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SysJobnameSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SysJobnameSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_JOBNAME_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSysJobname14;
            protected  int beginSysJobname5;
            protected  int beginSysJobnameCicsJobname68;
	
	/**
	* Constructor for SysJobnameSerialized
	**/
    public SysJobnameSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SysJobnameSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SysJobnameSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SysJobnameSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,194); // serialize this field at offset 194 by default 
    }
    
	/**
	* sets parent for this SysJobnameSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 194 by default
    }    
	/**
	* initializes the field in SysJobnameSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_JOBNAME_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSysJobname14 = getStartOffset() + 0;	// set offset for serialization
  
             beginSysJobname5 = getStartOffset() + 4;	// set offset for serialization
  
             beginSysJobnameCicsJobname68 = getStartOffset() + 5;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSysJobname14Counter = -1;
     public boolean isSysJobname14Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSysJobname14Counter != sharedCounter;
         localSysJobname14Counter = sharedCounter; return hasModified;
     }
	protected static final int SYS_JOBNAME_14_LEN = 4;
	/**
	 * 	serialize this SysJobname14
	 */
   protected void serializeSysJobname14(char[] sysJobname14) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sysJobname14,0,getStringValue(),beginSysJobname14,SYS_JOBNAME_14_LEN);
       localSysJobname14Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSysJobname14Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshSysJobname14 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSysJobname14() {	 
   		return (substring(getStringValue(),beginSysJobname14,beginSysJobname14 + SYS_JOBNAME_14_LEN));
   	}
     int localSysJobname5Counter = -1;
     public boolean isSysJobname5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSysJobname5Counter != sharedCounter;
         localSysJobname5Counter = sharedCounter; return hasModified;
     }
	protected static final int SYS_JOBNAME_5_LEN = 1;
	/**
	 * 	serialize this SysJobname5
	 */
   protected void serializeSysJobname5(char[] sysJobname5) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sysJobname5,0,getStringValue(),beginSysJobname5,SYS_JOBNAME_5_LEN);
       localSysJobname5Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSysJobname5Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSysJobname5 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSysJobname5() {	 
   		return (substring(getStringValue(),beginSysJobname5,beginSysJobname5 + SYS_JOBNAME_5_LEN));
   	}
     int localSysJobnameCicsJobname68Counter = -1;
     public boolean isSysJobnameCicsJobname68Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSysJobnameCicsJobname68Counter != sharedCounter;
         localSysJobnameCicsJobname68Counter = sharedCounter; return hasModified;
     }
	protected static final int SYS_JOBNAME_CICS_JOBNAME_68_LEN = 3;
	/**
	 * 	serialize this SysJobnameCicsJobname68
	 */
   protected void serializeSysJobnameCicsJobname68(char[] sysJobnameCicsJobname68) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sysJobnameCicsJobname68,0,getStringValue(),beginSysJobnameCicsJobname68,SYS_JOBNAME_CICS_JOBNAME_68_LEN);
       localSysJobnameCicsJobname68Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSysJobnameCicsJobname68Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSysJobnameCicsJobname68 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSysJobnameCicsJobname68() {	 
   		return (substring(getStringValue(),beginSysJobnameCicsJobname68,beginSysJobnameCicsJobname68 + SYS_JOBNAME_CICS_JOBNAME_68_LEN));
   	}




}
  
