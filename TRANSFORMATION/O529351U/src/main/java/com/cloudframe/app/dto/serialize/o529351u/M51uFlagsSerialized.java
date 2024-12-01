package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class M51uFlagsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class M51uFlagsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(M51uFlagsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int M_51U_FLAGS_LENGTH = 3;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginM51uFunctionFlag;
            protected  int beginM51uIllogicalCondSw;
	
	/**
	* Constructor for M51uFlagsSerialized
	**/
    public M51uFlagsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for M51uFlagsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public M51uFlagsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this M51uFlagsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2592); // serialize this field at offset 2592 by default 
    }
    
	/**
	* sets parent for this M51uFlagsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2592 by default
    }    
	/**
	* initializes the field in M51uFlagsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(M_51U_FLAGS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginM51uFunctionFlag = getStartOffset() + 0;	// set offset for serialization
  
             beginM51uIllogicalCondSw = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localM51uFunctionFlagCounter = -1;
     public boolean isM51uFunctionFlagModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localM51uFunctionFlagCounter != sharedCounter;
         localM51uFunctionFlagCounter = sharedCounter; return hasModified;
     }
	protected static final int M_51U_FUNCTION_FLAG_LEN = 2;
	/**
	 * 	serialize this M51uFunctionFlag
	 */
   protected void serializeM51uFunctionFlag(char[] m51uFunctionFlag) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(m51uFunctionFlag,0,getStringValue(),beginM51uFunctionFlag,M_51U_FUNCTION_FLAG_LEN);
       localM51uFunctionFlagCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkM51uFunctionFlagConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshM51uFunctionFlag is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshM51uFunctionFlag() {	 
   		return (substring(getStringValue(),beginM51uFunctionFlag,beginM51uFunctionFlag + M_51U_FUNCTION_FLAG_LEN));
   	}
     int localM51uIllogicalCondSwCounter = -1;
     public boolean isM51uIllogicalCondSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localM51uIllogicalCondSwCounter != sharedCounter;
         localM51uIllogicalCondSwCounter = sharedCounter; return hasModified;
     }
	protected static final int M_51U_ILLOGICAL_COND_SW_LEN = 1;
	/**
	 * 	serialize this M51uIllogicalCondSw
	 */
   protected void serializeM51uIllogicalCondSw(char[] m51uIllogicalCondSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(m51uIllogicalCondSw,0,getStringValue(),beginM51uIllogicalCondSw,M_51U_ILLOGICAL_COND_SW_LEN);
       localM51uIllogicalCondSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkM51uIllogicalCondSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshM51uIllogicalCondSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshM51uIllogicalCondSw() {	 
   		return (substring(getStringValue(),beginM51uIllogicalCondSw,beginM51uIllogicalCondSw + M_51U_ILLOGICAL_COND_SW_LEN));
   	}




}
  
