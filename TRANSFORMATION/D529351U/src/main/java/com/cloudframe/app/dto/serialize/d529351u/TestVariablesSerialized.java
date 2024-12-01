package com.cloudframe.app.dto.serialize.d529351u;

/**
*  The class TestVariablesSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:50. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TestVariablesSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TestVariablesSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TEST_VARIABLES_LENGTH = 192;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTestCaus;
            protected  int beginTestProvTyp;
            protected  int beginTestPos;
            protected  int beginTestSvcCd;
            protected  int beginTestCpeDescCd;
	
	/**
	* Constructor for TestVariablesSerialized
	**/
    public TestVariablesSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in TestVariablesSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TEST_VARIABLES_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTestCaus = getStartOffset() + 0;	// set offset for serialization
  
             beginTestProvTyp = getStartOffset() + 1;	// set offset for serialization
  
             beginTestPos = getStartOffset() + 3;	// set offset for serialization
  
             beginTestSvcCd = getStartOffset() + 5;	// set offset for serialization
  
  
             beginTestCpeDescCd = getStartOffset() + 186;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localTestCausCounter = -1;
     public boolean isTestCausModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTestCausCounter != sharedCounter;
         localTestCausCounter = sharedCounter; return hasModified;
     }
	protected static final int TEST_CAUS_LEN = 1;
	/**
	 * 	serialize this TestCaus
	 */
   protected void serializeTestCaus(char[] testCaus) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(testCaus,0,getStringValue(),beginTestCaus,TEST_CAUS_LEN);
       localTestCausCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTestCausConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshTestCaus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTestCaus() {	 
   		return (substring(getStringValue(),beginTestCaus,beginTestCaus + TEST_CAUS_LEN));
   	}
     int localTestProvTypCounter = -1;
     public boolean isTestProvTypModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTestProvTypCounter != sharedCounter;
         localTestProvTypCounter = sharedCounter; return hasModified;
     }
	protected static final int TEST_PROV_TYP_LEN = 2;
	/**
	 * 	serialize this TestProvTyp
	 */
   protected void serializeTestProvTyp(char[] testProvTyp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(testProvTyp,0,getStringValue(),beginTestProvTyp,TEST_PROV_TYP_LEN);
       localTestProvTypCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTestProvTypConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshTestProvTyp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTestProvTyp() {	 
   		return (substring(getStringValue(),beginTestProvTyp,beginTestProvTyp + TEST_PROV_TYP_LEN));
   	}
     int localTestPosCounter = -1;
     public boolean isTestPosModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTestPosCounter != sharedCounter;
         localTestPosCounter = sharedCounter; return hasModified;
     }
	protected static final int TEST_POS_LEN = 2;
	/**
	 * 	serialize this TestPos
	 */
   protected void serializeTestPos(char[] testPos) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(testPos,0,getStringValue(),beginTestPos,TEST_POS_LEN);
       localTestPosCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTestPosConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshTestPos is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTestPos() {	 
   		return (substring(getStringValue(),beginTestPos,beginTestPos + TEST_POS_LEN));
   	}
     int localTestSvcCdCounter = -1;
     public boolean isTestSvcCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTestSvcCdCounter != sharedCounter;
         localTestSvcCdCounter = sharedCounter; return hasModified;
     }
	protected static final int TEST_SVC_CD_LEN = 6;
	/**
	 * 	serialize this TestSvcCd
	 */
   protected void serializeTestSvcCd(char[] testSvcCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(testSvcCd,0,getStringValue(),beginTestSvcCd,TEST_SVC_CD_LEN);
       localTestSvcCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTestSvcCdConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshTestSvcCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTestSvcCd() {	 
   		return (substring(getStringValue(),beginTestSvcCd,beginTestSvcCd + TEST_SVC_CD_LEN));
   	}
     int localTestCpeDescCdCounter = -1;
     public boolean isTestCpeDescCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTestCpeDescCdCounter != sharedCounter;
         localTestCpeDescCdCounter = sharedCounter; return hasModified;
     }
	protected static final int TEST_CPE_DESC_CD_LEN = 6;
	/**
	 * 	serialize this TestCpeDescCd
	 */
   protected void serializeTestCpeDescCd(char[] testCpeDescCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(testCpeDescCd,0,getStringValue(),beginTestCpeDescCd,TEST_CPE_DESC_CD_LEN);
       localTestCpeDescCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTestCpeDescCdConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshTestCpeDescCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTestCpeDescCd() {	 
   		return (substring(getStringValue(),beginTestCpeDescCd,beginTestCpeDescCd + TEST_CPE_DESC_CD_LEN));
   	}




}
  
