package com.cloudframe.app.dto.serialize.d529351u;

/**
*  The class D51uKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:50. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class D51uKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(D51uKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int D_51U_KEY_LENGTH = 18;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginD51uKeyFeSpi;
            protected  int beginD51uKeyStatus;
            protected  int beginD51uKeyPolicy;
            protected  int beginD51uKeyPlan;
	
	/**
	* Constructor for D51uKeySerialized
	**/
    public D51uKeySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for D51uKeySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uKeySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this D51uKeySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,36); // serialize this field at offset 36 by default 
    }
    
	/**
	* sets parent for this D51uKeySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 36 by default
    }    
	/**
	* initializes the field in D51uKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(D_51U_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginD51uKeyFeSpi = getStartOffset() + 0;	// set offset for serialization
  
             beginD51uKeyStatus = getStartOffset() + 7;	// set offset for serialization
  
             beginD51uKeyPolicy = getStartOffset() + 8;	// set offset for serialization
  
             beginD51uKeyPlan = getStartOffset() + 14;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localD51uKeyFeSpiCounter = -1;
     public boolean isD51uKeyFeSpiModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uKeyFeSpiCounter != sharedCounter;
         localD51uKeyFeSpiCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_KEY_FE_SPI_LEN = 7;
	/**
	 * 	serialize this D51uKeyFeSpi
	 */
   protected void serializeD51uKeyFeSpi(char[] d51uKeyFeSpi) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uKeyFeSpi,0,getStringValue(),beginD51uKeyFeSpi,D_51U_KEY_FE_SPI_LEN);
       localD51uKeyFeSpiCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uKeyFeSpiConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshD51uKeyFeSpi is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uKeyFeSpi() {	 
   		return (substring(getStringValue(),beginD51uKeyFeSpi,beginD51uKeyFeSpi + D_51U_KEY_FE_SPI_LEN));
   	}
     int localD51uKeyStatusCounter = -1;
     public boolean isD51uKeyStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uKeyStatusCounter != sharedCounter;
         localD51uKeyStatusCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_KEY_STATUS_LEN = 1;
	/**
	 * 	serialize this D51uKeyStatus
	 */
   protected void serializeD51uKeyStatus(char[] d51uKeyStatus) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uKeyStatus,0,getStringValue(),beginD51uKeyStatus,D_51U_KEY_STATUS_LEN);
       localD51uKeyStatusCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uKeyStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshD51uKeyStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uKeyStatus() {	 
   		return (substring(getStringValue(),beginD51uKeyStatus,beginD51uKeyStatus + D_51U_KEY_STATUS_LEN));
   	}
     int localD51uKeyPolicyCounter = -1;
     public boolean isD51uKeyPolicyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uKeyPolicyCounter != sharedCounter;
         localD51uKeyPolicyCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_KEY_POLICY_LEN = 6;
	/**
	 * 	serialize this D51uKeyPolicy
	 */
   protected void serializeD51uKeyPolicy(char[] d51uKeyPolicy) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uKeyPolicy,0,getStringValue(),beginD51uKeyPolicy,D_51U_KEY_POLICY_LEN);
       localD51uKeyPolicyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uKeyPolicyConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshD51uKeyPolicy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uKeyPolicy() {	 
   		return (substring(getStringValue(),beginD51uKeyPolicy,beginD51uKeyPolicy + D_51U_KEY_POLICY_LEN));
   	}
     int localD51uKeyPlanCounter = -1;
     public boolean isD51uKeyPlanModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uKeyPlanCounter != sharedCounter;
         localD51uKeyPlanCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_KEY_PLAN_LEN = 4;
	/**
	 * 	serialize this D51uKeyPlan
	 */
   protected void serializeD51uKeyPlan(char[] d51uKeyPlan) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uKeyPlan,0,getStringValue(),beginD51uKeyPlan,D_51U_KEY_PLAN_LEN);
       localD51uKeyPlanCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uKeyPlanConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshD51uKeyPlan is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uKeyPlan() {	 
   		return (substring(getStringValue(),beginD51uKeyPlan,beginD51uKeyPlan + D_51U_KEY_PLAN_LEN));
   	}




}
  
