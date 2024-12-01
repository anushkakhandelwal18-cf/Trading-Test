package com.cloudframe.app.dto.serialize.d529351u;

/**
*  The class D51uTestDiagAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:50. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class D51uTestDiagAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(D51uTestDiagAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int D_51U_TEST_DIAG_AREA_LENGTH = 175;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginD51uTestDiag01;
            protected  int beginD51uTestDiag02;
            protected  int beginD51uTestDiag03;
            protected  int beginD51uTestDiag04;
            protected  int beginD51uTestDiag05;
            protected  int beginD51uTestDiag06;
            protected  int beginD51uTestDiag07;
            protected  int beginD51uTestDiag08;
            protected  int beginD51uTestDiag09;
            protected  int beginD51uTestDiag10;
            protected  int beginD51uTestDiag11;
            protected  int beginD51uTestDiag12;
            protected  int beginD51uTestDiag13;
            protected  int beginD51uTestDiag14;
            protected  int beginD51uTestDiag15;
            protected  int beginD51uTestDiag16;
            protected  int beginD51uTestDiag17;
            protected  int beginD51uTestDiag18;
            protected  int beginD51uTestDiag19;
            protected  int beginD51uTestDiag20;
            protected  int beginD51uTestDiag21;
            protected  int beginD51uTestDiag22;
            protected  int beginD51uTestDiag23;
            protected  int beginD51uTestDiag24;
            protected  int beginD51uTestDiag25;
	
	/**
	* Constructor for D51uTestDiagAreaSerialized
	**/
    public D51uTestDiagAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for D51uTestDiagAreaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uTestDiagAreaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this D51uTestDiagAreaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,83); // serialize this field at offset 83 by default 
    }
    
	/**
	* sets parent for this D51uTestDiagAreaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 83 by default
    }    
	/**
	* initializes the field in D51uTestDiagAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(D_51U_TEST_DIAG_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginD51uTestDiag01 = getStartOffset() + 0;	// set offset for serialization
  
             beginD51uTestDiag02 = getStartOffset() + 7;	// set offset for serialization
  
             beginD51uTestDiag03 = getStartOffset() + 14;	// set offset for serialization
  
             beginD51uTestDiag04 = getStartOffset() + 21;	// set offset for serialization
  
             beginD51uTestDiag05 = getStartOffset() + 28;	// set offset for serialization
  
             beginD51uTestDiag06 = getStartOffset() + 35;	// set offset for serialization
  
             beginD51uTestDiag07 = getStartOffset() + 42;	// set offset for serialization
  
             beginD51uTestDiag08 = getStartOffset() + 49;	// set offset for serialization
  
             beginD51uTestDiag09 = getStartOffset() + 56;	// set offset for serialization
  
             beginD51uTestDiag10 = getStartOffset() + 63;	// set offset for serialization
  
             beginD51uTestDiag11 = getStartOffset() + 70;	// set offset for serialization
  
             beginD51uTestDiag12 = getStartOffset() + 77;	// set offset for serialization
  
             beginD51uTestDiag13 = getStartOffset() + 84;	// set offset for serialization
  
             beginD51uTestDiag14 = getStartOffset() + 91;	// set offset for serialization
  
             beginD51uTestDiag15 = getStartOffset() + 98;	// set offset for serialization
  
             beginD51uTestDiag16 = getStartOffset() + 105;	// set offset for serialization
  
             beginD51uTestDiag17 = getStartOffset() + 112;	// set offset for serialization
  
             beginD51uTestDiag18 = getStartOffset() + 119;	// set offset for serialization
  
             beginD51uTestDiag19 = getStartOffset() + 126;	// set offset for serialization
  
             beginD51uTestDiag20 = getStartOffset() + 133;	// set offset for serialization
  
             beginD51uTestDiag21 = getStartOffset() + 140;	// set offset for serialization
  
             beginD51uTestDiag22 = getStartOffset() + 147;	// set offset for serialization
  
             beginD51uTestDiag23 = getStartOffset() + 154;	// set offset for serialization
  
             beginD51uTestDiag24 = getStartOffset() + 161;	// set offset for serialization
  
             beginD51uTestDiag25 = getStartOffset() + 168;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localD51uTestDiag01Counter = -1;
     public boolean isD51uTestDiag01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uTestDiag01Counter != sharedCounter;
         localD51uTestDiag01Counter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_TEST_DIAG_01_LEN = 7;
	/**
	 * 	serialize this D51uTestDiag01
	 */
   protected void serializeD51uTestDiag01(char[] d51uTestDiag01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uTestDiag01,0,getStringValue(),beginD51uTestDiag01,D_51U_TEST_DIAG_01_LEN);
       localD51uTestDiag01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uTestDiag01Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshD51uTestDiag01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uTestDiag01() {	 
   		return (substring(getStringValue(),beginD51uTestDiag01,beginD51uTestDiag01 + D_51U_TEST_DIAG_01_LEN));
   	}
     int localD51uTestDiag02Counter = -1;
     public boolean isD51uTestDiag02Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uTestDiag02Counter != sharedCounter;
         localD51uTestDiag02Counter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_TEST_DIAG_02_LEN = 7;
	/**
	 * 	serialize this D51uTestDiag02
	 */
   protected void serializeD51uTestDiag02(char[] d51uTestDiag02) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uTestDiag02,0,getStringValue(),beginD51uTestDiag02,D_51U_TEST_DIAG_02_LEN);
       localD51uTestDiag02Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uTestDiag02Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshD51uTestDiag02 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uTestDiag02() {	 
   		return (substring(getStringValue(),beginD51uTestDiag02,beginD51uTestDiag02 + D_51U_TEST_DIAG_02_LEN));
   	}
     int localD51uTestDiag03Counter = -1;
     public boolean isD51uTestDiag03Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uTestDiag03Counter != sharedCounter;
         localD51uTestDiag03Counter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_TEST_DIAG_03_LEN = 7;
	/**
	 * 	serialize this D51uTestDiag03
	 */
   protected void serializeD51uTestDiag03(char[] d51uTestDiag03) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uTestDiag03,0,getStringValue(),beginD51uTestDiag03,D_51U_TEST_DIAG_03_LEN);
       localD51uTestDiag03Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uTestDiag03Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshD51uTestDiag03 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uTestDiag03() {	 
   		return (substring(getStringValue(),beginD51uTestDiag03,beginD51uTestDiag03 + D_51U_TEST_DIAG_03_LEN));
   	}
     int localD51uTestDiag04Counter = -1;
     public boolean isD51uTestDiag04Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uTestDiag04Counter != sharedCounter;
         localD51uTestDiag04Counter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_TEST_DIAG_04_LEN = 7;
	/**
	 * 	serialize this D51uTestDiag04
	 */
   protected void serializeD51uTestDiag04(char[] d51uTestDiag04) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uTestDiag04,0,getStringValue(),beginD51uTestDiag04,D_51U_TEST_DIAG_04_LEN);
       localD51uTestDiag04Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uTestDiag04Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshD51uTestDiag04 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uTestDiag04() {	 
   		return (substring(getStringValue(),beginD51uTestDiag04,beginD51uTestDiag04 + D_51U_TEST_DIAG_04_LEN));
   	}
     int localD51uTestDiag05Counter = -1;
     public boolean isD51uTestDiag05Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uTestDiag05Counter != sharedCounter;
         localD51uTestDiag05Counter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_TEST_DIAG_05_LEN = 7;
	/**
	 * 	serialize this D51uTestDiag05
	 */
   protected void serializeD51uTestDiag05(char[] d51uTestDiag05) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uTestDiag05,0,getStringValue(),beginD51uTestDiag05,D_51U_TEST_DIAG_05_LEN);
       localD51uTestDiag05Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uTestDiag05Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshD51uTestDiag05 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uTestDiag05() {	 
   		return (substring(getStringValue(),beginD51uTestDiag05,beginD51uTestDiag05 + D_51U_TEST_DIAG_05_LEN));
   	}
     int localD51uTestDiag06Counter = -1;
     public boolean isD51uTestDiag06Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uTestDiag06Counter != sharedCounter;
         localD51uTestDiag06Counter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_TEST_DIAG_06_LEN = 7;
	/**
	 * 	serialize this D51uTestDiag06
	 */
   protected void serializeD51uTestDiag06(char[] d51uTestDiag06) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uTestDiag06,0,getStringValue(),beginD51uTestDiag06,D_51U_TEST_DIAG_06_LEN);
       localD51uTestDiag06Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uTestDiag06Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshD51uTestDiag06 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uTestDiag06() {	 
   		return (substring(getStringValue(),beginD51uTestDiag06,beginD51uTestDiag06 + D_51U_TEST_DIAG_06_LEN));
   	}
     int localD51uTestDiag07Counter = -1;
     public boolean isD51uTestDiag07Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uTestDiag07Counter != sharedCounter;
         localD51uTestDiag07Counter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_TEST_DIAG_07_LEN = 7;
	/**
	 * 	serialize this D51uTestDiag07
	 */
   protected void serializeD51uTestDiag07(char[] d51uTestDiag07) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uTestDiag07,0,getStringValue(),beginD51uTestDiag07,D_51U_TEST_DIAG_07_LEN);
       localD51uTestDiag07Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uTestDiag07Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshD51uTestDiag07 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uTestDiag07() {	 
   		return (substring(getStringValue(),beginD51uTestDiag07,beginD51uTestDiag07 + D_51U_TEST_DIAG_07_LEN));
   	}
     int localD51uTestDiag08Counter = -1;
     public boolean isD51uTestDiag08Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uTestDiag08Counter != sharedCounter;
         localD51uTestDiag08Counter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_TEST_DIAG_08_LEN = 7;
	/**
	 * 	serialize this D51uTestDiag08
	 */
   protected void serializeD51uTestDiag08(char[] d51uTestDiag08) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uTestDiag08,0,getStringValue(),beginD51uTestDiag08,D_51U_TEST_DIAG_08_LEN);
       localD51uTestDiag08Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uTestDiag08Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshD51uTestDiag08 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uTestDiag08() {	 
   		return (substring(getStringValue(),beginD51uTestDiag08,beginD51uTestDiag08 + D_51U_TEST_DIAG_08_LEN));
   	}
     int localD51uTestDiag09Counter = -1;
     public boolean isD51uTestDiag09Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uTestDiag09Counter != sharedCounter;
         localD51uTestDiag09Counter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_TEST_DIAG_09_LEN = 7;
	/**
	 * 	serialize this D51uTestDiag09
	 */
   protected void serializeD51uTestDiag09(char[] d51uTestDiag09) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uTestDiag09,0,getStringValue(),beginD51uTestDiag09,D_51U_TEST_DIAG_09_LEN);
       localD51uTestDiag09Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uTestDiag09Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshD51uTestDiag09 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uTestDiag09() {	 
   		return (substring(getStringValue(),beginD51uTestDiag09,beginD51uTestDiag09 + D_51U_TEST_DIAG_09_LEN));
   	}
     int localD51uTestDiag10Counter = -1;
     public boolean isD51uTestDiag10Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uTestDiag10Counter != sharedCounter;
         localD51uTestDiag10Counter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_TEST_DIAG_10_LEN = 7;
	/**
	 * 	serialize this D51uTestDiag10
	 */
   protected void serializeD51uTestDiag10(char[] d51uTestDiag10) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uTestDiag10,0,getStringValue(),beginD51uTestDiag10,D_51U_TEST_DIAG_10_LEN);
       localD51uTestDiag10Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uTestDiag10Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshD51uTestDiag10 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uTestDiag10() {	 
   		return (substring(getStringValue(),beginD51uTestDiag10,beginD51uTestDiag10 + D_51U_TEST_DIAG_10_LEN));
   	}
     int localD51uTestDiag11Counter = -1;
     public boolean isD51uTestDiag11Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uTestDiag11Counter != sharedCounter;
         localD51uTestDiag11Counter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_TEST_DIAG_11_LEN = 7;
	/**
	 * 	serialize this D51uTestDiag11
	 */
   protected void serializeD51uTestDiag11(char[] d51uTestDiag11) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uTestDiag11,0,getStringValue(),beginD51uTestDiag11,D_51U_TEST_DIAG_11_LEN);
       localD51uTestDiag11Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uTestDiag11Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshD51uTestDiag11 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uTestDiag11() {	 
   		return (substring(getStringValue(),beginD51uTestDiag11,beginD51uTestDiag11 + D_51U_TEST_DIAG_11_LEN));
   	}
     int localD51uTestDiag12Counter = -1;
     public boolean isD51uTestDiag12Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uTestDiag12Counter != sharedCounter;
         localD51uTestDiag12Counter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_TEST_DIAG_12_LEN = 7;
	/**
	 * 	serialize this D51uTestDiag12
	 */
   protected void serializeD51uTestDiag12(char[] d51uTestDiag12) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uTestDiag12,0,getStringValue(),beginD51uTestDiag12,D_51U_TEST_DIAG_12_LEN);
       localD51uTestDiag12Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uTestDiag12Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshD51uTestDiag12 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uTestDiag12() {	 
   		return (substring(getStringValue(),beginD51uTestDiag12,beginD51uTestDiag12 + D_51U_TEST_DIAG_12_LEN));
   	}
     int localD51uTestDiag13Counter = -1;
     public boolean isD51uTestDiag13Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uTestDiag13Counter != sharedCounter;
         localD51uTestDiag13Counter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_TEST_DIAG_13_LEN = 7;
	/**
	 * 	serialize this D51uTestDiag13
	 */
   protected void serializeD51uTestDiag13(char[] d51uTestDiag13) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uTestDiag13,0,getStringValue(),beginD51uTestDiag13,D_51U_TEST_DIAG_13_LEN);
       localD51uTestDiag13Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uTestDiag13Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshD51uTestDiag13 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uTestDiag13() {	 
   		return (substring(getStringValue(),beginD51uTestDiag13,beginD51uTestDiag13 + D_51U_TEST_DIAG_13_LEN));
   	}
     int localD51uTestDiag14Counter = -1;
     public boolean isD51uTestDiag14Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uTestDiag14Counter != sharedCounter;
         localD51uTestDiag14Counter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_TEST_DIAG_14_LEN = 7;
	/**
	 * 	serialize this D51uTestDiag14
	 */
   protected void serializeD51uTestDiag14(char[] d51uTestDiag14) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uTestDiag14,0,getStringValue(),beginD51uTestDiag14,D_51U_TEST_DIAG_14_LEN);
       localD51uTestDiag14Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uTestDiag14Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshD51uTestDiag14 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uTestDiag14() {	 
   		return (substring(getStringValue(),beginD51uTestDiag14,beginD51uTestDiag14 + D_51U_TEST_DIAG_14_LEN));
   	}
     int localD51uTestDiag15Counter = -1;
     public boolean isD51uTestDiag15Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uTestDiag15Counter != sharedCounter;
         localD51uTestDiag15Counter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_TEST_DIAG_15_LEN = 7;
	/**
	 * 	serialize this D51uTestDiag15
	 */
   protected void serializeD51uTestDiag15(char[] d51uTestDiag15) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uTestDiag15,0,getStringValue(),beginD51uTestDiag15,D_51U_TEST_DIAG_15_LEN);
       localD51uTestDiag15Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uTestDiag15Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshD51uTestDiag15 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uTestDiag15() {	 
   		return (substring(getStringValue(),beginD51uTestDiag15,beginD51uTestDiag15 + D_51U_TEST_DIAG_15_LEN));
   	}
     int localD51uTestDiag16Counter = -1;
     public boolean isD51uTestDiag16Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uTestDiag16Counter != sharedCounter;
         localD51uTestDiag16Counter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_TEST_DIAG_16_LEN = 7;
	/**
	 * 	serialize this D51uTestDiag16
	 */
   protected void serializeD51uTestDiag16(char[] d51uTestDiag16) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uTestDiag16,0,getStringValue(),beginD51uTestDiag16,D_51U_TEST_DIAG_16_LEN);
       localD51uTestDiag16Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uTestDiag16Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshD51uTestDiag16 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uTestDiag16() {	 
   		return (substring(getStringValue(),beginD51uTestDiag16,beginD51uTestDiag16 + D_51U_TEST_DIAG_16_LEN));
   	}
     int localD51uTestDiag17Counter = -1;
     public boolean isD51uTestDiag17Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uTestDiag17Counter != sharedCounter;
         localD51uTestDiag17Counter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_TEST_DIAG_17_LEN = 7;
	/**
	 * 	serialize this D51uTestDiag17
	 */
   protected void serializeD51uTestDiag17(char[] d51uTestDiag17) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uTestDiag17,0,getStringValue(),beginD51uTestDiag17,D_51U_TEST_DIAG_17_LEN);
       localD51uTestDiag17Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uTestDiag17Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshD51uTestDiag17 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uTestDiag17() {	 
   		return (substring(getStringValue(),beginD51uTestDiag17,beginD51uTestDiag17 + D_51U_TEST_DIAG_17_LEN));
   	}
     int localD51uTestDiag18Counter = -1;
     public boolean isD51uTestDiag18Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uTestDiag18Counter != sharedCounter;
         localD51uTestDiag18Counter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_TEST_DIAG_18_LEN = 7;
	/**
	 * 	serialize this D51uTestDiag18
	 */
   protected void serializeD51uTestDiag18(char[] d51uTestDiag18) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uTestDiag18,0,getStringValue(),beginD51uTestDiag18,D_51U_TEST_DIAG_18_LEN);
       localD51uTestDiag18Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uTestDiag18Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshD51uTestDiag18 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uTestDiag18() {	 
   		return (substring(getStringValue(),beginD51uTestDiag18,beginD51uTestDiag18 + D_51U_TEST_DIAG_18_LEN));
   	}
     int localD51uTestDiag19Counter = -1;
     public boolean isD51uTestDiag19Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uTestDiag19Counter != sharedCounter;
         localD51uTestDiag19Counter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_TEST_DIAG_19_LEN = 7;
	/**
	 * 	serialize this D51uTestDiag19
	 */
   protected void serializeD51uTestDiag19(char[] d51uTestDiag19) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uTestDiag19,0,getStringValue(),beginD51uTestDiag19,D_51U_TEST_DIAG_19_LEN);
       localD51uTestDiag19Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uTestDiag19Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshD51uTestDiag19 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uTestDiag19() {	 
   		return (substring(getStringValue(),beginD51uTestDiag19,beginD51uTestDiag19 + D_51U_TEST_DIAG_19_LEN));
   	}
     int localD51uTestDiag20Counter = -1;
     public boolean isD51uTestDiag20Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uTestDiag20Counter != sharedCounter;
         localD51uTestDiag20Counter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_TEST_DIAG_20_LEN = 7;
	/**
	 * 	serialize this D51uTestDiag20
	 */
   protected void serializeD51uTestDiag20(char[] d51uTestDiag20) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uTestDiag20,0,getStringValue(),beginD51uTestDiag20,D_51U_TEST_DIAG_20_LEN);
       localD51uTestDiag20Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uTestDiag20Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshD51uTestDiag20 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uTestDiag20() {	 
   		return (substring(getStringValue(),beginD51uTestDiag20,beginD51uTestDiag20 + D_51U_TEST_DIAG_20_LEN));
   	}
     int localD51uTestDiag21Counter = -1;
     public boolean isD51uTestDiag21Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uTestDiag21Counter != sharedCounter;
         localD51uTestDiag21Counter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_TEST_DIAG_21_LEN = 7;
	/**
	 * 	serialize this D51uTestDiag21
	 */
   protected void serializeD51uTestDiag21(char[] d51uTestDiag21) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uTestDiag21,0,getStringValue(),beginD51uTestDiag21,D_51U_TEST_DIAG_21_LEN);
       localD51uTestDiag21Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uTestDiag21Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshD51uTestDiag21 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uTestDiag21() {	 
   		return (substring(getStringValue(),beginD51uTestDiag21,beginD51uTestDiag21 + D_51U_TEST_DIAG_21_LEN));
   	}
     int localD51uTestDiag22Counter = -1;
     public boolean isD51uTestDiag22Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uTestDiag22Counter != sharedCounter;
         localD51uTestDiag22Counter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_TEST_DIAG_22_LEN = 7;
	/**
	 * 	serialize this D51uTestDiag22
	 */
   protected void serializeD51uTestDiag22(char[] d51uTestDiag22) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uTestDiag22,0,getStringValue(),beginD51uTestDiag22,D_51U_TEST_DIAG_22_LEN);
       localD51uTestDiag22Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uTestDiag22Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshD51uTestDiag22 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uTestDiag22() {	 
   		return (substring(getStringValue(),beginD51uTestDiag22,beginD51uTestDiag22 + D_51U_TEST_DIAG_22_LEN));
   	}
     int localD51uTestDiag23Counter = -1;
     public boolean isD51uTestDiag23Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uTestDiag23Counter != sharedCounter;
         localD51uTestDiag23Counter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_TEST_DIAG_23_LEN = 7;
	/**
	 * 	serialize this D51uTestDiag23
	 */
   protected void serializeD51uTestDiag23(char[] d51uTestDiag23) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uTestDiag23,0,getStringValue(),beginD51uTestDiag23,D_51U_TEST_DIAG_23_LEN);
       localD51uTestDiag23Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uTestDiag23Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshD51uTestDiag23 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uTestDiag23() {	 
   		return (substring(getStringValue(),beginD51uTestDiag23,beginD51uTestDiag23 + D_51U_TEST_DIAG_23_LEN));
   	}
     int localD51uTestDiag24Counter = -1;
     public boolean isD51uTestDiag24Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uTestDiag24Counter != sharedCounter;
         localD51uTestDiag24Counter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_TEST_DIAG_24_LEN = 7;
	/**
	 * 	serialize this D51uTestDiag24
	 */
   protected void serializeD51uTestDiag24(char[] d51uTestDiag24) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uTestDiag24,0,getStringValue(),beginD51uTestDiag24,D_51U_TEST_DIAG_24_LEN);
       localD51uTestDiag24Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uTestDiag24Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshD51uTestDiag24 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uTestDiag24() {	 
   		return (substring(getStringValue(),beginD51uTestDiag24,beginD51uTestDiag24 + D_51U_TEST_DIAG_24_LEN));
   	}
     int localD51uTestDiag25Counter = -1;
     public boolean isD51uTestDiag25Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uTestDiag25Counter != sharedCounter;
         localD51uTestDiag25Counter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_TEST_DIAG_25_LEN = 7;
	/**
	 * 	serialize this D51uTestDiag25
	 */
   protected void serializeD51uTestDiag25(char[] d51uTestDiag25) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uTestDiag25,0,getStringValue(),beginD51uTestDiag25,D_51U_TEST_DIAG_25_LEN);
       localD51uTestDiag25Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uTestDiag25Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshD51uTestDiag25 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uTestDiag25() {	 
   		return (substring(getStringValue(),beginD51uTestDiag25,beginD51uTestDiag25 + D_51U_TEST_DIAG_25_LEN));
   	}




}
  
