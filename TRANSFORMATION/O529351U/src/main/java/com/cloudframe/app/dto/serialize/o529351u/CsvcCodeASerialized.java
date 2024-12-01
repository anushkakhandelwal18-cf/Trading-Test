package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class CsvcCodeASerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CsvcCodeASerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CsvcCodeASerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CSVC_CODE_A_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCsvcCode15A;
            protected  int beginCsvcCode6A;
	
	/**
	* Constructor for CsvcCodeASerialized
	**/
    public CsvcCodeASerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CsvcCodeASerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CsvcCodeASerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CsvcCodeASerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this CsvcCodeASerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in CsvcCodeASerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CSVC_CODE_A_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCsvcCode15A = getStartOffset() + 0;	// set offset for serialization
  
             beginCsvcCode6A = getStartOffset() + 5;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCsvcCode15ACounter = -1;
     public boolean isCsvcCode15AModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCsvcCode15ACounter != sharedCounter;
         localCsvcCode15ACounter = sharedCounter; return hasModified;
     }
	protected static final int CSVC_CODE_15_A_LEN = 5;
	/**
	 * 	serialize this CsvcCode15A
	 */
   protected void serializeCsvcCode15A(char[] csvcCode15A) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(csvcCode15A,0,getStringValue(),beginCsvcCode15A,CSVC_CODE_15_A_LEN);
       localCsvcCode15ACounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCsvcCode15AConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshCsvcCode15A is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCsvcCode15A() {	 
   		return (substring(getStringValue(),beginCsvcCode15A,beginCsvcCode15A + CSVC_CODE_15_A_LEN));
   	}
     int localCsvcCode6ACounter = -1;
     public boolean isCsvcCode6AModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCsvcCode6ACounter != sharedCounter;
         localCsvcCode6ACounter = sharedCounter; return hasModified;
     }
	protected static final int CSVC_CODE_6_A_LEN = 1;
	/**
	 * 	serialize this CsvcCode6A
	 */
   protected void serializeCsvcCode6A(char[] csvcCode6A) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(csvcCode6A,0,getStringValue(),beginCsvcCode6A,CSVC_CODE_6_A_LEN);
       localCsvcCode6ACounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCsvcCode6AConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCsvcCode6A is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCsvcCode6A() {	 
   		return (substring(getStringValue(),beginCsvcCode6A,beginCsvcCode6A + CSVC_CODE_6_A_LEN));
   	}




}
  
