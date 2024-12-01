package com.cloudframe.app.dto.serialize.d529351u;

/**
*  The class TestDiagAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:50. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TestDiagAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TestDiagAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TEST_DIAG_AREA_LENGTH = 175;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTestDiag01;
            protected  int beginTestDiag02;
            protected  int beginTestDiag03;
            protected  int beginTestDiag04;
            protected  int beginTestDiag05;
            protected  int beginTestDiag06;
            protected  int beginTestDiag07;
            protected  int beginTestDiag08;
            protected  int beginTestDiag09;
            protected  int beginTestDiag10;
            protected  int beginTestDiag11;
            protected  int beginTestDiag12;
            protected  int beginTestDiag13;
            protected  int beginTestDiag14;
            protected  int beginTestDiag15;
            protected  int beginTestDiag16;
            protected  int beginTestDiag17;
            protected  int beginTestDiag18;
            protected  int beginTestDiag19;
            protected  int beginTestDiag20;
            protected  int beginTestDiag21;
            protected  int beginTestDiag22;
            protected  int beginTestDiag23;
            protected  int beginTestDiag24;
            protected  int beginTestDiag25;
	
	/**
	* Constructor for TestDiagAreaSerialized
	**/
    public TestDiagAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for TestDiagAreaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TestDiagAreaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this TestDiagAreaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,11); // serialize this field at offset 11 by default 
    }
    
	/**
	* sets parent for this TestDiagAreaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 11 by default
    }    
	/**
	* initializes the field in TestDiagAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TEST_DIAG_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTestDiag01 = getStartOffset() + 0;	// set offset for serialization
  
             beginTestDiag02 = getStartOffset() + 7;	// set offset for serialization
  
             beginTestDiag03 = getStartOffset() + 14;	// set offset for serialization
  
             beginTestDiag04 = getStartOffset() + 21;	// set offset for serialization
  
             beginTestDiag05 = getStartOffset() + 28;	// set offset for serialization
  
             beginTestDiag06 = getStartOffset() + 35;	// set offset for serialization
  
             beginTestDiag07 = getStartOffset() + 42;	// set offset for serialization
  
             beginTestDiag08 = getStartOffset() + 49;	// set offset for serialization
  
             beginTestDiag09 = getStartOffset() + 56;	// set offset for serialization
  
             beginTestDiag10 = getStartOffset() + 63;	// set offset for serialization
  
             beginTestDiag11 = getStartOffset() + 70;	// set offset for serialization
  
             beginTestDiag12 = getStartOffset() + 77;	// set offset for serialization
  
             beginTestDiag13 = getStartOffset() + 84;	// set offset for serialization
  
             beginTestDiag14 = getStartOffset() + 91;	// set offset for serialization
  
             beginTestDiag15 = getStartOffset() + 98;	// set offset for serialization
  
             beginTestDiag16 = getStartOffset() + 105;	// set offset for serialization
  
             beginTestDiag17 = getStartOffset() + 112;	// set offset for serialization
  
             beginTestDiag18 = getStartOffset() + 119;	// set offset for serialization
  
             beginTestDiag19 = getStartOffset() + 126;	// set offset for serialization
  
             beginTestDiag20 = getStartOffset() + 133;	// set offset for serialization
  
             beginTestDiag21 = getStartOffset() + 140;	// set offset for serialization
  
             beginTestDiag22 = getStartOffset() + 147;	// set offset for serialization
  
             beginTestDiag23 = getStartOffset() + 154;	// set offset for serialization
  
             beginTestDiag24 = getStartOffset() + 161;	// set offset for serialization
  
             beginTestDiag25 = getStartOffset() + 168;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localTestDiag01Counter = -1;
     public boolean isTestDiag01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTestDiag01Counter != sharedCounter;
         localTestDiag01Counter = sharedCounter; return hasModified;
     }
	protected static final int TEST_DIAG_01_LEN = 7;
	/**
	 * 	serialize this TestDiag01
	 */
   protected void serializeTestDiag01(char[] testDiag01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(testDiag01,0,getStringValue(),beginTestDiag01,TEST_DIAG_01_LEN);
       localTestDiag01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTestDiag01Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshTestDiag01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTestDiag01() {	 
   		return (substring(getStringValue(),beginTestDiag01,beginTestDiag01 + TEST_DIAG_01_LEN));
   	}
     int localTestDiag02Counter = -1;
     public boolean isTestDiag02Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTestDiag02Counter != sharedCounter;
         localTestDiag02Counter = sharedCounter; return hasModified;
     }
	protected static final int TEST_DIAG_02_LEN = 7;
	/**
	 * 	serialize this TestDiag02
	 */
   protected void serializeTestDiag02(char[] testDiag02) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(testDiag02,0,getStringValue(),beginTestDiag02,TEST_DIAG_02_LEN);
       localTestDiag02Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTestDiag02Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshTestDiag02 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTestDiag02() {	 
   		return (substring(getStringValue(),beginTestDiag02,beginTestDiag02 + TEST_DIAG_02_LEN));
   	}
     int localTestDiag03Counter = -1;
     public boolean isTestDiag03Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTestDiag03Counter != sharedCounter;
         localTestDiag03Counter = sharedCounter; return hasModified;
     }
	protected static final int TEST_DIAG_03_LEN = 7;
	/**
	 * 	serialize this TestDiag03
	 */
   protected void serializeTestDiag03(char[] testDiag03) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(testDiag03,0,getStringValue(),beginTestDiag03,TEST_DIAG_03_LEN);
       localTestDiag03Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTestDiag03Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshTestDiag03 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTestDiag03() {	 
   		return (substring(getStringValue(),beginTestDiag03,beginTestDiag03 + TEST_DIAG_03_LEN));
   	}
     int localTestDiag04Counter = -1;
     public boolean isTestDiag04Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTestDiag04Counter != sharedCounter;
         localTestDiag04Counter = sharedCounter; return hasModified;
     }
	protected static final int TEST_DIAG_04_LEN = 7;
	/**
	 * 	serialize this TestDiag04
	 */
   protected void serializeTestDiag04(char[] testDiag04) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(testDiag04,0,getStringValue(),beginTestDiag04,TEST_DIAG_04_LEN);
       localTestDiag04Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTestDiag04Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshTestDiag04 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTestDiag04() {	 
   		return (substring(getStringValue(),beginTestDiag04,beginTestDiag04 + TEST_DIAG_04_LEN));
   	}
     int localTestDiag05Counter = -1;
     public boolean isTestDiag05Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTestDiag05Counter != sharedCounter;
         localTestDiag05Counter = sharedCounter; return hasModified;
     }
	protected static final int TEST_DIAG_05_LEN = 7;
	/**
	 * 	serialize this TestDiag05
	 */
   protected void serializeTestDiag05(char[] testDiag05) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(testDiag05,0,getStringValue(),beginTestDiag05,TEST_DIAG_05_LEN);
       localTestDiag05Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTestDiag05Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshTestDiag05 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTestDiag05() {	 
   		return (substring(getStringValue(),beginTestDiag05,beginTestDiag05 + TEST_DIAG_05_LEN));
   	}
     int localTestDiag06Counter = -1;
     public boolean isTestDiag06Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTestDiag06Counter != sharedCounter;
         localTestDiag06Counter = sharedCounter; return hasModified;
     }
	protected static final int TEST_DIAG_06_LEN = 7;
	/**
	 * 	serialize this TestDiag06
	 */
   protected void serializeTestDiag06(char[] testDiag06) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(testDiag06,0,getStringValue(),beginTestDiag06,TEST_DIAG_06_LEN);
       localTestDiag06Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTestDiag06Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshTestDiag06 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTestDiag06() {	 
   		return (substring(getStringValue(),beginTestDiag06,beginTestDiag06 + TEST_DIAG_06_LEN));
   	}
     int localTestDiag07Counter = -1;
     public boolean isTestDiag07Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTestDiag07Counter != sharedCounter;
         localTestDiag07Counter = sharedCounter; return hasModified;
     }
	protected static final int TEST_DIAG_07_LEN = 7;
	/**
	 * 	serialize this TestDiag07
	 */
   protected void serializeTestDiag07(char[] testDiag07) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(testDiag07,0,getStringValue(),beginTestDiag07,TEST_DIAG_07_LEN);
       localTestDiag07Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTestDiag07Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshTestDiag07 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTestDiag07() {	 
   		return (substring(getStringValue(),beginTestDiag07,beginTestDiag07 + TEST_DIAG_07_LEN));
   	}
     int localTestDiag08Counter = -1;
     public boolean isTestDiag08Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTestDiag08Counter != sharedCounter;
         localTestDiag08Counter = sharedCounter; return hasModified;
     }
	protected static final int TEST_DIAG_08_LEN = 7;
	/**
	 * 	serialize this TestDiag08
	 */
   protected void serializeTestDiag08(char[] testDiag08) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(testDiag08,0,getStringValue(),beginTestDiag08,TEST_DIAG_08_LEN);
       localTestDiag08Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTestDiag08Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshTestDiag08 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTestDiag08() {	 
   		return (substring(getStringValue(),beginTestDiag08,beginTestDiag08 + TEST_DIAG_08_LEN));
   	}
     int localTestDiag09Counter = -1;
     public boolean isTestDiag09Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTestDiag09Counter != sharedCounter;
         localTestDiag09Counter = sharedCounter; return hasModified;
     }
	protected static final int TEST_DIAG_09_LEN = 7;
	/**
	 * 	serialize this TestDiag09
	 */
   protected void serializeTestDiag09(char[] testDiag09) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(testDiag09,0,getStringValue(),beginTestDiag09,TEST_DIAG_09_LEN);
       localTestDiag09Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTestDiag09Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshTestDiag09 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTestDiag09() {	 
   		return (substring(getStringValue(),beginTestDiag09,beginTestDiag09 + TEST_DIAG_09_LEN));
   	}
     int localTestDiag10Counter = -1;
     public boolean isTestDiag10Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTestDiag10Counter != sharedCounter;
         localTestDiag10Counter = sharedCounter; return hasModified;
     }
	protected static final int TEST_DIAG_10_LEN = 7;
	/**
	 * 	serialize this TestDiag10
	 */
   protected void serializeTestDiag10(char[] testDiag10) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(testDiag10,0,getStringValue(),beginTestDiag10,TEST_DIAG_10_LEN);
       localTestDiag10Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTestDiag10Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshTestDiag10 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTestDiag10() {	 
   		return (substring(getStringValue(),beginTestDiag10,beginTestDiag10 + TEST_DIAG_10_LEN));
   	}
     int localTestDiag11Counter = -1;
     public boolean isTestDiag11Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTestDiag11Counter != sharedCounter;
         localTestDiag11Counter = sharedCounter; return hasModified;
     }
	protected static final int TEST_DIAG_11_LEN = 7;
	/**
	 * 	serialize this TestDiag11
	 */
   protected void serializeTestDiag11(char[] testDiag11) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(testDiag11,0,getStringValue(),beginTestDiag11,TEST_DIAG_11_LEN);
       localTestDiag11Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTestDiag11Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshTestDiag11 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTestDiag11() {	 
   		return (substring(getStringValue(),beginTestDiag11,beginTestDiag11 + TEST_DIAG_11_LEN));
   	}
     int localTestDiag12Counter = -1;
     public boolean isTestDiag12Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTestDiag12Counter != sharedCounter;
         localTestDiag12Counter = sharedCounter; return hasModified;
     }
	protected static final int TEST_DIAG_12_LEN = 7;
	/**
	 * 	serialize this TestDiag12
	 */
   protected void serializeTestDiag12(char[] testDiag12) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(testDiag12,0,getStringValue(),beginTestDiag12,TEST_DIAG_12_LEN);
       localTestDiag12Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTestDiag12Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshTestDiag12 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTestDiag12() {	 
   		return (substring(getStringValue(),beginTestDiag12,beginTestDiag12 + TEST_DIAG_12_LEN));
   	}
     int localTestDiag13Counter = -1;
     public boolean isTestDiag13Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTestDiag13Counter != sharedCounter;
         localTestDiag13Counter = sharedCounter; return hasModified;
     }
	protected static final int TEST_DIAG_13_LEN = 7;
	/**
	 * 	serialize this TestDiag13
	 */
   protected void serializeTestDiag13(char[] testDiag13) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(testDiag13,0,getStringValue(),beginTestDiag13,TEST_DIAG_13_LEN);
       localTestDiag13Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTestDiag13Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshTestDiag13 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTestDiag13() {	 
   		return (substring(getStringValue(),beginTestDiag13,beginTestDiag13 + TEST_DIAG_13_LEN));
   	}
     int localTestDiag14Counter = -1;
     public boolean isTestDiag14Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTestDiag14Counter != sharedCounter;
         localTestDiag14Counter = sharedCounter; return hasModified;
     }
	protected static final int TEST_DIAG_14_LEN = 7;
	/**
	 * 	serialize this TestDiag14
	 */
   protected void serializeTestDiag14(char[] testDiag14) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(testDiag14,0,getStringValue(),beginTestDiag14,TEST_DIAG_14_LEN);
       localTestDiag14Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTestDiag14Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshTestDiag14 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTestDiag14() {	 
   		return (substring(getStringValue(),beginTestDiag14,beginTestDiag14 + TEST_DIAG_14_LEN));
   	}
     int localTestDiag15Counter = -1;
     public boolean isTestDiag15Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTestDiag15Counter != sharedCounter;
         localTestDiag15Counter = sharedCounter; return hasModified;
     }
	protected static final int TEST_DIAG_15_LEN = 7;
	/**
	 * 	serialize this TestDiag15
	 */
   protected void serializeTestDiag15(char[] testDiag15) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(testDiag15,0,getStringValue(),beginTestDiag15,TEST_DIAG_15_LEN);
       localTestDiag15Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTestDiag15Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshTestDiag15 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTestDiag15() {	 
   		return (substring(getStringValue(),beginTestDiag15,beginTestDiag15 + TEST_DIAG_15_LEN));
   	}
     int localTestDiag16Counter = -1;
     public boolean isTestDiag16Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTestDiag16Counter != sharedCounter;
         localTestDiag16Counter = sharedCounter; return hasModified;
     }
	protected static final int TEST_DIAG_16_LEN = 7;
	/**
	 * 	serialize this TestDiag16
	 */
   protected void serializeTestDiag16(char[] testDiag16) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(testDiag16,0,getStringValue(),beginTestDiag16,TEST_DIAG_16_LEN);
       localTestDiag16Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTestDiag16Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshTestDiag16 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTestDiag16() {	 
   		return (substring(getStringValue(),beginTestDiag16,beginTestDiag16 + TEST_DIAG_16_LEN));
   	}
     int localTestDiag17Counter = -1;
     public boolean isTestDiag17Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTestDiag17Counter != sharedCounter;
         localTestDiag17Counter = sharedCounter; return hasModified;
     }
	protected static final int TEST_DIAG_17_LEN = 7;
	/**
	 * 	serialize this TestDiag17
	 */
   protected void serializeTestDiag17(char[] testDiag17) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(testDiag17,0,getStringValue(),beginTestDiag17,TEST_DIAG_17_LEN);
       localTestDiag17Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTestDiag17Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshTestDiag17 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTestDiag17() {	 
   		return (substring(getStringValue(),beginTestDiag17,beginTestDiag17 + TEST_DIAG_17_LEN));
   	}
     int localTestDiag18Counter = -1;
     public boolean isTestDiag18Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTestDiag18Counter != sharedCounter;
         localTestDiag18Counter = sharedCounter; return hasModified;
     }
	protected static final int TEST_DIAG_18_LEN = 7;
	/**
	 * 	serialize this TestDiag18
	 */
   protected void serializeTestDiag18(char[] testDiag18) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(testDiag18,0,getStringValue(),beginTestDiag18,TEST_DIAG_18_LEN);
       localTestDiag18Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTestDiag18Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshTestDiag18 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTestDiag18() {	 
   		return (substring(getStringValue(),beginTestDiag18,beginTestDiag18 + TEST_DIAG_18_LEN));
   	}
     int localTestDiag19Counter = -1;
     public boolean isTestDiag19Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTestDiag19Counter != sharedCounter;
         localTestDiag19Counter = sharedCounter; return hasModified;
     }
	protected static final int TEST_DIAG_19_LEN = 7;
	/**
	 * 	serialize this TestDiag19
	 */
   protected void serializeTestDiag19(char[] testDiag19) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(testDiag19,0,getStringValue(),beginTestDiag19,TEST_DIAG_19_LEN);
       localTestDiag19Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTestDiag19Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshTestDiag19 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTestDiag19() {	 
   		return (substring(getStringValue(),beginTestDiag19,beginTestDiag19 + TEST_DIAG_19_LEN));
   	}
     int localTestDiag20Counter = -1;
     public boolean isTestDiag20Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTestDiag20Counter != sharedCounter;
         localTestDiag20Counter = sharedCounter; return hasModified;
     }
	protected static final int TEST_DIAG_20_LEN = 7;
	/**
	 * 	serialize this TestDiag20
	 */
   protected void serializeTestDiag20(char[] testDiag20) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(testDiag20,0,getStringValue(),beginTestDiag20,TEST_DIAG_20_LEN);
       localTestDiag20Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTestDiag20Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshTestDiag20 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTestDiag20() {	 
   		return (substring(getStringValue(),beginTestDiag20,beginTestDiag20 + TEST_DIAG_20_LEN));
   	}
     int localTestDiag21Counter = -1;
     public boolean isTestDiag21Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTestDiag21Counter != sharedCounter;
         localTestDiag21Counter = sharedCounter; return hasModified;
     }
	protected static final int TEST_DIAG_21_LEN = 7;
	/**
	 * 	serialize this TestDiag21
	 */
   protected void serializeTestDiag21(char[] testDiag21) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(testDiag21,0,getStringValue(),beginTestDiag21,TEST_DIAG_21_LEN);
       localTestDiag21Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTestDiag21Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshTestDiag21 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTestDiag21() {	 
   		return (substring(getStringValue(),beginTestDiag21,beginTestDiag21 + TEST_DIAG_21_LEN));
   	}
     int localTestDiag22Counter = -1;
     public boolean isTestDiag22Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTestDiag22Counter != sharedCounter;
         localTestDiag22Counter = sharedCounter; return hasModified;
     }
	protected static final int TEST_DIAG_22_LEN = 7;
	/**
	 * 	serialize this TestDiag22
	 */
   protected void serializeTestDiag22(char[] testDiag22) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(testDiag22,0,getStringValue(),beginTestDiag22,TEST_DIAG_22_LEN);
       localTestDiag22Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTestDiag22Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshTestDiag22 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTestDiag22() {	 
   		return (substring(getStringValue(),beginTestDiag22,beginTestDiag22 + TEST_DIAG_22_LEN));
   	}
     int localTestDiag23Counter = -1;
     public boolean isTestDiag23Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTestDiag23Counter != sharedCounter;
         localTestDiag23Counter = sharedCounter; return hasModified;
     }
	protected static final int TEST_DIAG_23_LEN = 7;
	/**
	 * 	serialize this TestDiag23
	 */
   protected void serializeTestDiag23(char[] testDiag23) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(testDiag23,0,getStringValue(),beginTestDiag23,TEST_DIAG_23_LEN);
       localTestDiag23Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTestDiag23Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshTestDiag23 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTestDiag23() {	 
   		return (substring(getStringValue(),beginTestDiag23,beginTestDiag23 + TEST_DIAG_23_LEN));
   	}
     int localTestDiag24Counter = -1;
     public boolean isTestDiag24Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTestDiag24Counter != sharedCounter;
         localTestDiag24Counter = sharedCounter; return hasModified;
     }
	protected static final int TEST_DIAG_24_LEN = 7;
	/**
	 * 	serialize this TestDiag24
	 */
   protected void serializeTestDiag24(char[] testDiag24) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(testDiag24,0,getStringValue(),beginTestDiag24,TEST_DIAG_24_LEN);
       localTestDiag24Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTestDiag24Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshTestDiag24 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTestDiag24() {	 
   		return (substring(getStringValue(),beginTestDiag24,beginTestDiag24 + TEST_DIAG_24_LEN));
   	}
     int localTestDiag25Counter = -1;
     public boolean isTestDiag25Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTestDiag25Counter != sharedCounter;
         localTestDiag25Counter = sharedCounter; return hasModified;
     }
	protected static final int TEST_DIAG_25_LEN = 7;
	/**
	 * 	serialize this TestDiag25
	 */
   protected void serializeTestDiag25(char[] testDiag25) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(testDiag25,0,getStringValue(),beginTestDiag25,TEST_DIAG_25_LEN);
       localTestDiag25Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTestDiag25Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshTestDiag25 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTestDiag25() {	 
   		return (substring(getStringValue(),beginTestDiag25,beginTestDiag25 + TEST_DIAG_25_LEN));
   	}




}
  
