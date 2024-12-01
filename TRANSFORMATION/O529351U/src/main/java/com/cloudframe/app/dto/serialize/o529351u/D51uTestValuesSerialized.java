package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class D51uTestValuesSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class D51uTestValuesSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(D51uTestValuesSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int D_51U_TEST_VALUES_LENGTH = 190;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginD51uTestCaus;
            protected  int beginD51uTestProvTyp;
            protected  int beginD51uTestPos;
            protected  int beginD51uTestSvcCd;
            protected  int beginD51uTestCpeDescCd;
	
	/**
	* Constructor for D51uTestValuesSerialized
	**/
    public D51uTestValuesSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for D51uTestValuesSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uTestValuesSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this D51uTestValuesSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,72); // serialize this field at offset 72 by default 
    }
    
	/**
	* sets parent for this D51uTestValuesSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 72 by default
    }    
	/**
	* initializes the field in D51uTestValuesSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(D_51U_TEST_VALUES_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginD51uTestCaus = getStartOffset() + 0;	// set offset for serialization
  
             beginD51uTestProvTyp = getStartOffset() + 1;	// set offset for serialization
  
             beginD51uTestPos = getStartOffset() + 3;	// set offset for serialization
  
             beginD51uTestSvcCd = getStartOffset() + 5;	// set offset for serialization
  
  
             beginD51uTestCpeDescCd = getStartOffset() + 186;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localD51uTestCausCounter = -1;
     public boolean isD51uTestCausModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uTestCausCounter != sharedCounter;
         localD51uTestCausCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_TEST_CAUS_LEN = 1;
	/**
	 * 	serialize this D51uTestCaus
	 */
   protected void serializeD51uTestCaus(char[] d51uTestCaus) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uTestCaus,0,getStringValue(),beginD51uTestCaus,D_51U_TEST_CAUS_LEN);
       localD51uTestCausCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uTestCausConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshD51uTestCaus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uTestCaus() {	 
   		return (substring(getStringValue(),beginD51uTestCaus,beginD51uTestCaus + D_51U_TEST_CAUS_LEN));
   	}
     int localD51uTestProvTypCounter = -1;
     public boolean isD51uTestProvTypModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uTestProvTypCounter != sharedCounter;
         localD51uTestProvTypCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_TEST_PROV_TYP_LEN = 2;
	/**
	 * 	serialize this D51uTestProvTyp
	 */
   protected void serializeD51uTestProvTyp(char[] d51uTestProvTyp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uTestProvTyp,0,getStringValue(),beginD51uTestProvTyp,D_51U_TEST_PROV_TYP_LEN);
       localD51uTestProvTypCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uTestProvTypConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshD51uTestProvTyp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uTestProvTyp() {	 
   		return (substring(getStringValue(),beginD51uTestProvTyp,beginD51uTestProvTyp + D_51U_TEST_PROV_TYP_LEN));
   	}
     int localD51uTestPosCounter = -1;
     public boolean isD51uTestPosModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uTestPosCounter != sharedCounter;
         localD51uTestPosCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_TEST_POS_LEN = 2;
	/**
	 * 	serialize this D51uTestPos
	 */
   protected void serializeD51uTestPos(char[] d51uTestPos) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uTestPos,0,getStringValue(),beginD51uTestPos,D_51U_TEST_POS_LEN);
       localD51uTestPosCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uTestPosConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshD51uTestPos is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uTestPos() {	 
   		return (substring(getStringValue(),beginD51uTestPos,beginD51uTestPos + D_51U_TEST_POS_LEN));
   	}
     int localD51uTestSvcCdCounter = -1;
     public boolean isD51uTestSvcCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uTestSvcCdCounter != sharedCounter;
         localD51uTestSvcCdCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_TEST_SVC_CD_LEN = 6;
	/**
	 * 	serialize this D51uTestSvcCd
	 */
   protected void serializeD51uTestSvcCd(char[] d51uTestSvcCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uTestSvcCd,0,getStringValue(),beginD51uTestSvcCd,D_51U_TEST_SVC_CD_LEN);
       localD51uTestSvcCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uTestSvcCdConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshD51uTestSvcCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uTestSvcCd() {	 
   		return (substring(getStringValue(),beginD51uTestSvcCd,beginD51uTestSvcCd + D_51U_TEST_SVC_CD_LEN));
   	}
     int localD51uTestCpeDescCdCounter = -1;
     public boolean isD51uTestCpeDescCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uTestCpeDescCdCounter != sharedCounter;
         localD51uTestCpeDescCdCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_TEST_CPE_DESC_CD_LEN = 4;
	/**
	 * 	serialize this D51uTestCpeDescCd
	 */
   protected void serializeD51uTestCpeDescCd(char[] d51uTestCpeDescCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uTestCpeDescCd,0,getStringValue(),beginD51uTestCpeDescCd,D_51U_TEST_CPE_DESC_CD_LEN);
       localD51uTestCpeDescCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uTestCpeDescCdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshD51uTestCpeDescCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uTestCpeDescCd() {	 
   		return (substring(getStringValue(),beginD51uTestCpeDescCd,beginD51uTestCpeDescCd + D_51U_TEST_CPE_DESC_CD_LEN));
   	}




}
  
