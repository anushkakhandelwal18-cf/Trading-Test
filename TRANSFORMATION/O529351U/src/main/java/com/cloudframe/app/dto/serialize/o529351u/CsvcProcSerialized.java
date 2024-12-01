package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class CsvcProcSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CsvcProcSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CsvcProcSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CSVC_PROC_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCsvcP1st5;
            protected  int beginCsvcPLst1;
            protected  int beginCsvcPLst1A;
	
	/**
	* Constructor for CsvcProcSerialized
	**/
    public CsvcProcSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in CsvcProcSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CSVC_PROC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCsvcP1st5 = getStartOffset() + 0;	// set offset for serialization
  
             beginCsvcPLst1 = getStartOffset() + 5;	// set offset for serialization
  
             beginCsvcPLst1A = getStartOffset() + 5;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCsvcP1st5Counter = -1;
     public boolean isCsvcP1st5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCsvcP1st5Counter != sharedCounter;
         localCsvcP1st5Counter = sharedCounter; return hasModified;
     }
	protected static final int CSVC_P_1ST_5_LEN = 5;
	/**
	 * 	serialize this CsvcP1st5
	 */
   protected void serializeCsvcP1st5(char[] csvcP1st5) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(csvcP1st5,0,getStringValue(),beginCsvcP1st5,CSVC_P_1ST_5_LEN);
       localCsvcP1st5Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCsvcP1st5Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshCsvcP1st5 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCsvcP1st5() {	 
   		return (substring(getStringValue(),beginCsvcP1st5,beginCsvcP1st5 + CSVC_P_1ST_5_LEN));
   	}
     int localCsvcPLst1Counter = -1;
     public boolean isCsvcPLst1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCsvcPLst1Counter != sharedCounter;
         localCsvcPLst1Counter = sharedCounter; return hasModified;
     }
	protected static final int CSVC_PLST_1_LEN = 1;
	/**
	 * 	serialize this CsvcPLst1
	 */
   protected void serializeCsvcPLst1(char[] csvcPLst1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(csvcPLst1,0,getStringValue(),beginCsvcPLst1,CSVC_PLST_1_LEN);
       localCsvcPLst1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCsvcPLst1Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCsvcPLst1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCsvcPLst1() {	 
   		return (substring(getStringValue(),beginCsvcPLst1,beginCsvcPLst1 + CSVC_PLST_1_LEN));
   	}
     int localCsvcPLst1ACounter = -1;
     public boolean isCsvcPLst1AModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCsvcPLst1ACounter != sharedCounter;
         localCsvcPLst1ACounter = sharedCounter; return hasModified;
     }
	protected static final int CSVC_PLST_1_A_LEN = 1;
	/**
	 * 	serialize this CsvcPLst1A
	 */
   protected void serializeCsvcPLst1A(char[] csvcPLst1A) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(csvcPLst1A,0,getStringValue(),beginCsvcPLst1A,CSVC_PLST_1_A_LEN);
       localCsvcPLst1ACounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCsvcPLst1AConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCsvcPLst1A is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCsvcPLst1A() {	 
   		return (substring(getStringValue(),beginCsvcPLst1A,beginCsvcPLst1A + CSVC_PLST_1_A_LEN));
   	}




}
  
