package com.cloudframe.app.dto.serialize.d529351u;

/**
*  The class D51uRetRulCauseSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class D51uRetRulCauseSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(D51uRetRulCauseSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int D_51U_RET_RUL_CAUSE_LENGTH = 17;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginD51uCausDrvPos;
            protected  int beginD51uCausDrvSvc;
            protected  int beginD51uCausDrvCau;
            protected  int beginD51uCausClmCauseCd1;
            protected  int beginD51uCausClmCauseCd2;
            protected  int beginD51uCausClmCauseCd3;
            protected  int beginD51uCausClmCauseCd4;
            protected  int beginD51uCausClmCauseCd5;
            protected  int beginD51uCausClmCauseCd6;
            protected  int beginD51uCausClmCauseCd7;
            protected  int beginD51uCausClmCauseCd8;
	
	/**
	* Constructor for D51uRetRulCauseSerialized
	**/
    public D51uRetRulCauseSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for D51uRetRulCauseSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uRetRulCauseSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this D51uRetRulCauseSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,636723); // serialize this field at offset 636723 by default 
    }
    
	/**
	* sets parent for this D51uRetRulCauseSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 636723 by default
    }    
	/**
	* initializes the field in D51uRetRulCauseSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(D_51U_RET_RUL_CAUSE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginD51uCausDrvPos = getStartOffset() + 0;	// set offset for serialization
  
             beginD51uCausDrvSvc = getStartOffset() + 2;	// set offset for serialization
  
             beginD51uCausDrvCau = getStartOffset() + 8;	// set offset for serialization
  
             beginD51uCausClmCauseCd1 = getStartOffset() + 9;	// set offset for serialization
  
             beginD51uCausClmCauseCd2 = getStartOffset() + 10;	// set offset for serialization
  
             beginD51uCausClmCauseCd3 = getStartOffset() + 11;	// set offset for serialization
  
             beginD51uCausClmCauseCd4 = getStartOffset() + 12;	// set offset for serialization
  
             beginD51uCausClmCauseCd5 = getStartOffset() + 13;	// set offset for serialization
  
             beginD51uCausClmCauseCd6 = getStartOffset() + 14;	// set offset for serialization
  
             beginD51uCausClmCauseCd7 = getStartOffset() + 15;	// set offset for serialization
  
             beginD51uCausClmCauseCd8 = getStartOffset() + 16;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localD51uCausDrvPosCounter = -1;
     public boolean isD51uCausDrvPosModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uCausDrvPosCounter != sharedCounter;
         localD51uCausDrvPosCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_CAUS_DRV_POS_LEN = 2;
	/**
	 * 	serialize this D51uCausDrvPos
	 */
   protected void serializeD51uCausDrvPos(char[] d51uCausDrvPos) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uCausDrvPos,0,getStringValue(),beginD51uCausDrvPos,D_51U_CAUS_DRV_POS_LEN);
       localD51uCausDrvPosCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uCausDrvPosConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshD51uCausDrvPos is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uCausDrvPos() {	 
   		return (substring(getStringValue(),beginD51uCausDrvPos,beginD51uCausDrvPos + D_51U_CAUS_DRV_POS_LEN));
   	}
     int localD51uCausDrvSvcCounter = -1;
     public boolean isD51uCausDrvSvcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uCausDrvSvcCounter != sharedCounter;
         localD51uCausDrvSvcCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_CAUS_DRV_SVC_LEN = 6;
	/**
	 * 	serialize this D51uCausDrvSvc
	 */
   protected void serializeD51uCausDrvSvc(char[] d51uCausDrvSvc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uCausDrvSvc,0,getStringValue(),beginD51uCausDrvSvc,D_51U_CAUS_DRV_SVC_LEN);
       localD51uCausDrvSvcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uCausDrvSvcConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshD51uCausDrvSvc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uCausDrvSvc() {	 
   		return (substring(getStringValue(),beginD51uCausDrvSvc,beginD51uCausDrvSvc + D_51U_CAUS_DRV_SVC_LEN));
   	}
     int localD51uCausDrvCauCounter = -1;
     public boolean isD51uCausDrvCauModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uCausDrvCauCounter != sharedCounter;
         localD51uCausDrvCauCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_CAUS_DRV_CAU_LEN = 1;
	/**
	 * 	serialize this D51uCausDrvCau
	 */
   protected void serializeD51uCausDrvCau(char[] d51uCausDrvCau) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uCausDrvCau,0,getStringValue(),beginD51uCausDrvCau,D_51U_CAUS_DRV_CAU_LEN);
       localD51uCausDrvCauCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uCausDrvCauConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshD51uCausDrvCau is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uCausDrvCau() {	 
   		return (substring(getStringValue(),beginD51uCausDrvCau,beginD51uCausDrvCau + D_51U_CAUS_DRV_CAU_LEN));
   	}
     int localD51uCausClmCauseCd1Counter = -1;
     public boolean isD51uCausClmCauseCd1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uCausClmCauseCd1Counter != sharedCounter;
         localD51uCausClmCauseCd1Counter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_CAUS_CLM_CAUSE_CD_1_LEN = 1;
	/**
	 * 	serialize this D51uCausClmCauseCd1
	 */
   protected void serializeD51uCausClmCauseCd1(char[] d51uCausClmCauseCd1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uCausClmCauseCd1,0,getStringValue(),beginD51uCausClmCauseCd1,D_51U_CAUS_CLM_CAUSE_CD_1_LEN);
       localD51uCausClmCauseCd1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uCausClmCauseCd1Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshD51uCausClmCauseCd1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uCausClmCauseCd1() {	 
   		return (substring(getStringValue(),beginD51uCausClmCauseCd1,beginD51uCausClmCauseCd1 + D_51U_CAUS_CLM_CAUSE_CD_1_LEN));
   	}
     int localD51uCausClmCauseCd2Counter = -1;
     public boolean isD51uCausClmCauseCd2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uCausClmCauseCd2Counter != sharedCounter;
         localD51uCausClmCauseCd2Counter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_CAUS_CLM_CAUSE_CD_2_LEN = 1;
	/**
	 * 	serialize this D51uCausClmCauseCd2
	 */
   protected void serializeD51uCausClmCauseCd2(char[] d51uCausClmCauseCd2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uCausClmCauseCd2,0,getStringValue(),beginD51uCausClmCauseCd2,D_51U_CAUS_CLM_CAUSE_CD_2_LEN);
       localD51uCausClmCauseCd2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uCausClmCauseCd2Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshD51uCausClmCauseCd2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uCausClmCauseCd2() {	 
   		return (substring(getStringValue(),beginD51uCausClmCauseCd2,beginD51uCausClmCauseCd2 + D_51U_CAUS_CLM_CAUSE_CD_2_LEN));
   	}
     int localD51uCausClmCauseCd3Counter = -1;
     public boolean isD51uCausClmCauseCd3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uCausClmCauseCd3Counter != sharedCounter;
         localD51uCausClmCauseCd3Counter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_CAUS_CLM_CAUSE_CD_3_LEN = 1;
	/**
	 * 	serialize this D51uCausClmCauseCd3
	 */
   protected void serializeD51uCausClmCauseCd3(char[] d51uCausClmCauseCd3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uCausClmCauseCd3,0,getStringValue(),beginD51uCausClmCauseCd3,D_51U_CAUS_CLM_CAUSE_CD_3_LEN);
       localD51uCausClmCauseCd3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uCausClmCauseCd3Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshD51uCausClmCauseCd3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uCausClmCauseCd3() {	 
   		return (substring(getStringValue(),beginD51uCausClmCauseCd3,beginD51uCausClmCauseCd3 + D_51U_CAUS_CLM_CAUSE_CD_3_LEN));
   	}
     int localD51uCausClmCauseCd4Counter = -1;
     public boolean isD51uCausClmCauseCd4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uCausClmCauseCd4Counter != sharedCounter;
         localD51uCausClmCauseCd4Counter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_CAUS_CLM_CAUSE_CD_4_LEN = 1;
	/**
	 * 	serialize this D51uCausClmCauseCd4
	 */
   protected void serializeD51uCausClmCauseCd4(char[] d51uCausClmCauseCd4) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uCausClmCauseCd4,0,getStringValue(),beginD51uCausClmCauseCd4,D_51U_CAUS_CLM_CAUSE_CD_4_LEN);
       localD51uCausClmCauseCd4Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uCausClmCauseCd4Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshD51uCausClmCauseCd4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uCausClmCauseCd4() {	 
   		return (substring(getStringValue(),beginD51uCausClmCauseCd4,beginD51uCausClmCauseCd4 + D_51U_CAUS_CLM_CAUSE_CD_4_LEN));
   	}
     int localD51uCausClmCauseCd5Counter = -1;
     public boolean isD51uCausClmCauseCd5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uCausClmCauseCd5Counter != sharedCounter;
         localD51uCausClmCauseCd5Counter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_CAUS_CLM_CAUSE_CD_5_LEN = 1;
	/**
	 * 	serialize this D51uCausClmCauseCd5
	 */
   protected void serializeD51uCausClmCauseCd5(char[] d51uCausClmCauseCd5) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uCausClmCauseCd5,0,getStringValue(),beginD51uCausClmCauseCd5,D_51U_CAUS_CLM_CAUSE_CD_5_LEN);
       localD51uCausClmCauseCd5Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uCausClmCauseCd5Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshD51uCausClmCauseCd5 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uCausClmCauseCd5() {	 
   		return (substring(getStringValue(),beginD51uCausClmCauseCd5,beginD51uCausClmCauseCd5 + D_51U_CAUS_CLM_CAUSE_CD_5_LEN));
   	}
     int localD51uCausClmCauseCd6Counter = -1;
     public boolean isD51uCausClmCauseCd6Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uCausClmCauseCd6Counter != sharedCounter;
         localD51uCausClmCauseCd6Counter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_CAUS_CLM_CAUSE_CD_6_LEN = 1;
	/**
	 * 	serialize this D51uCausClmCauseCd6
	 */
   protected void serializeD51uCausClmCauseCd6(char[] d51uCausClmCauseCd6) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uCausClmCauseCd6,0,getStringValue(),beginD51uCausClmCauseCd6,D_51U_CAUS_CLM_CAUSE_CD_6_LEN);
       localD51uCausClmCauseCd6Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uCausClmCauseCd6Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshD51uCausClmCauseCd6 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uCausClmCauseCd6() {	 
   		return (substring(getStringValue(),beginD51uCausClmCauseCd6,beginD51uCausClmCauseCd6 + D_51U_CAUS_CLM_CAUSE_CD_6_LEN));
   	}
     int localD51uCausClmCauseCd7Counter = -1;
     public boolean isD51uCausClmCauseCd7Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uCausClmCauseCd7Counter != sharedCounter;
         localD51uCausClmCauseCd7Counter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_CAUS_CLM_CAUSE_CD_7_LEN = 1;
	/**
	 * 	serialize this D51uCausClmCauseCd7
	 */
   protected void serializeD51uCausClmCauseCd7(char[] d51uCausClmCauseCd7) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uCausClmCauseCd7,0,getStringValue(),beginD51uCausClmCauseCd7,D_51U_CAUS_CLM_CAUSE_CD_7_LEN);
       localD51uCausClmCauseCd7Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uCausClmCauseCd7Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshD51uCausClmCauseCd7 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uCausClmCauseCd7() {	 
   		return (substring(getStringValue(),beginD51uCausClmCauseCd7,beginD51uCausClmCauseCd7 + D_51U_CAUS_CLM_CAUSE_CD_7_LEN));
   	}
     int localD51uCausClmCauseCd8Counter = -1;
     public boolean isD51uCausClmCauseCd8Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uCausClmCauseCd8Counter != sharedCounter;
         localD51uCausClmCauseCd8Counter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_CAUS_CLM_CAUSE_CD_8_LEN = 1;
	/**
	 * 	serialize this D51uCausClmCauseCd8
	 */
   protected void serializeD51uCausClmCauseCd8(char[] d51uCausClmCauseCd8) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uCausClmCauseCd8,0,getStringValue(),beginD51uCausClmCauseCd8,D_51U_CAUS_CLM_CAUSE_CD_8_LEN);
       localD51uCausClmCauseCd8Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uCausClmCauseCd8Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshD51uCausClmCauseCd8 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uCausClmCauseCd8() {	 
   		return (substring(getStringValue(),beginD51uCausClmCauseCd8,beginD51uCausClmCauseCd8 + D_51U_CAUS_CLM_CAUSE_CD_8_LEN));
   	}




}
  
