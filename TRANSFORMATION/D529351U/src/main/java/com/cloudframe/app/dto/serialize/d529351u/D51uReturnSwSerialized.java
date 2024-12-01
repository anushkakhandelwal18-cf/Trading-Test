package com.cloudframe.app.dto.serialize.d529351u;

/**
*  The class D51uReturnSwSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:50. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class D51uReturnSwSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(D51uReturnSwSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int D_51U_RETURN_SW_LENGTH = 51;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPlanFoundSw;
            protected  int beginPosFoundSw;
            protected  int beginSvcFoundSw;
            protected  int beginProvFoundSw;
            protected  int beginIcdFoundSw;
            protected  int beginIpaFoundSw;
            protected  int beginCausFoundSw;
            protected  int beginMoreIcdFoundSw;
            protected  int beginCflgFoundSw;
            protected  int beginD51uReturnFiller;
	
	/**
	* Constructor for D51uReturnSwSerialized
	**/
    public D51uReturnSwSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for D51uReturnSwSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uReturnSwSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this D51uReturnSwSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,300); // serialize this field at offset 300 by default 
    }
    
	/**
	* sets parent for this D51uReturnSwSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 300 by default
    }    
	/**
	* initializes the field in D51uReturnSwSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(D_51U_RETURN_SW_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPlanFoundSw = getStartOffset() + 0;	// set offset for serialization
  
             beginPosFoundSw = getStartOffset() + 1;	// set offset for serialization
  
             beginSvcFoundSw = getStartOffset() + 2;	// set offset for serialization
  
             beginProvFoundSw = getStartOffset() + 3;	// set offset for serialization
  
             beginIcdFoundSw = getStartOffset() + 4;	// set offset for serialization
  
             beginIpaFoundSw = getStartOffset() + 5;	// set offset for serialization
  
             beginCausFoundSw = getStartOffset() + 6;	// set offset for serialization
  
             beginMoreIcdFoundSw = getStartOffset() + 7;	// set offset for serialization
  
             beginCflgFoundSw = getStartOffset() + 8;	// set offset for serialization
  
  
             beginD51uReturnFiller = getStartOffset() + 49;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localPlanFoundSwCounter = -1;
     public boolean isPlanFoundSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPlanFoundSwCounter != sharedCounter;
         localPlanFoundSwCounter = sharedCounter; return hasModified;
     }
	protected static final int PLAN_FOUND_SW_LEN = 1;
	/**
	 * 	serialize this PlanFoundSw
	 */
   protected void serializePlanFoundSw(char[] planFoundSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(planFoundSw,0,getStringValue(),beginPlanFoundSw,PLAN_FOUND_SW_LEN);
       localPlanFoundSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPlanFoundSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshPlanFoundSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPlanFoundSw() {	 
   		return (substring(getStringValue(),beginPlanFoundSw,beginPlanFoundSw + PLAN_FOUND_SW_LEN));
   	}
     int localPosFoundSwCounter = -1;
     public boolean isPosFoundSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPosFoundSwCounter != sharedCounter;
         localPosFoundSwCounter = sharedCounter; return hasModified;
     }
	protected static final int POS_FOUND_SW_LEN = 1;
	/**
	 * 	serialize this PosFoundSw
	 */
   protected void serializePosFoundSw(char[] posFoundSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(posFoundSw,0,getStringValue(),beginPosFoundSw,POS_FOUND_SW_LEN);
       localPosFoundSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPosFoundSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshPosFoundSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPosFoundSw() {	 
   		return (substring(getStringValue(),beginPosFoundSw,beginPosFoundSw + POS_FOUND_SW_LEN));
   	}
     int localSvcFoundSwCounter = -1;
     public boolean isSvcFoundSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSvcFoundSwCounter != sharedCounter;
         localSvcFoundSwCounter = sharedCounter; return hasModified;
     }
	protected static final int SVC_FOUND_SW_LEN = 1;
	/**
	 * 	serialize this SvcFoundSw
	 */
   protected void serializeSvcFoundSw(char[] svcFoundSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(svcFoundSw,0,getStringValue(),beginSvcFoundSw,SVC_FOUND_SW_LEN);
       localSvcFoundSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSvcFoundSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSvcFoundSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSvcFoundSw() {	 
   		return (substring(getStringValue(),beginSvcFoundSw,beginSvcFoundSw + SVC_FOUND_SW_LEN));
   	}
     int localProvFoundSwCounter = -1;
     public boolean isProvFoundSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localProvFoundSwCounter != sharedCounter;
         localProvFoundSwCounter = sharedCounter; return hasModified;
     }
	protected static final int PROV_FOUND_SW_LEN = 1;
	/**
	 * 	serialize this ProvFoundSw
	 */
   protected void serializeProvFoundSw(char[] provFoundSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(provFoundSw,0,getStringValue(),beginProvFoundSw,PROV_FOUND_SW_LEN);
       localProvFoundSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkProvFoundSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshProvFoundSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshProvFoundSw() {	 
   		return (substring(getStringValue(),beginProvFoundSw,beginProvFoundSw + PROV_FOUND_SW_LEN));
   	}
     int localIcdFoundSwCounter = -1;
     public boolean isIcdFoundSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIcdFoundSwCounter != sharedCounter;
         localIcdFoundSwCounter = sharedCounter; return hasModified;
     }
	protected static final int ICD_FOUND_SW_LEN = 1;
	/**
	 * 	serialize this IcdFoundSw
	 */
   protected void serializeIcdFoundSw(char[] icdFoundSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(icdFoundSw,0,getStringValue(),beginIcdFoundSw,ICD_FOUND_SW_LEN);
       localIcdFoundSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIcdFoundSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIcdFoundSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIcdFoundSw() {	 
   		return (substring(getStringValue(),beginIcdFoundSw,beginIcdFoundSw + ICD_FOUND_SW_LEN));
   	}
     int localIpaFoundSwCounter = -1;
     public boolean isIpaFoundSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIpaFoundSwCounter != sharedCounter;
         localIpaFoundSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IPA_FOUND_SW_LEN = 1;
	/**
	 * 	serialize this IpaFoundSw
	 */
   protected void serializeIpaFoundSw(char[] ipaFoundSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ipaFoundSw,0,getStringValue(),beginIpaFoundSw,IPA_FOUND_SW_LEN);
       localIpaFoundSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIpaFoundSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIpaFoundSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIpaFoundSw() {	 
   		return (substring(getStringValue(),beginIpaFoundSw,beginIpaFoundSw + IPA_FOUND_SW_LEN));
   	}
     int localCausFoundSwCounter = -1;
     public boolean isCausFoundSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCausFoundSwCounter != sharedCounter;
         localCausFoundSwCounter = sharedCounter; return hasModified;
     }
	protected static final int CAUS_FOUND_SW_LEN = 1;
	/**
	 * 	serialize this CausFoundSw
	 */
   protected void serializeCausFoundSw(char[] causFoundSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(causFoundSw,0,getStringValue(),beginCausFoundSw,CAUS_FOUND_SW_LEN);
       localCausFoundSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCausFoundSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCausFoundSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCausFoundSw() {	 
   		return (substring(getStringValue(),beginCausFoundSw,beginCausFoundSw + CAUS_FOUND_SW_LEN));
   	}
     int localMoreIcdFoundSwCounter = -1;
     public boolean isMoreIcdFoundSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMoreIcdFoundSwCounter != sharedCounter;
         localMoreIcdFoundSwCounter = sharedCounter; return hasModified;
     }
	protected static final int MORE_ICD_FOUND_SW_LEN = 1;
	/**
	 * 	serialize this MoreIcdFoundSw
	 */
   protected void serializeMoreIcdFoundSw(char[] moreIcdFoundSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(moreIcdFoundSw,0,getStringValue(),beginMoreIcdFoundSw,MORE_ICD_FOUND_SW_LEN);
       localMoreIcdFoundSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMoreIcdFoundSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMoreIcdFoundSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMoreIcdFoundSw() {	 
   		return (substring(getStringValue(),beginMoreIcdFoundSw,beginMoreIcdFoundSw + MORE_ICD_FOUND_SW_LEN));
   	}
     int localCflgFoundSwCounter = -1;
     public boolean isCflgFoundSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCflgFoundSwCounter != sharedCounter;
         localCflgFoundSwCounter = sharedCounter; return hasModified;
     }
	protected static final int CFLG_FOUND_SW_LEN = 1;
	/**
	 * 	serialize this CflgFoundSw
	 */
   protected void serializeCflgFoundSw(char[] cflgFoundSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cflgFoundSw,0,getStringValue(),beginCflgFoundSw,CFLG_FOUND_SW_LEN);
       localCflgFoundSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCflgFoundSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCflgFoundSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCflgFoundSw() {	 
   		return (substring(getStringValue(),beginCflgFoundSw,beginCflgFoundSw + CFLG_FOUND_SW_LEN));
   	}
     int localD51uReturnFillerCounter = -1;
     public boolean isD51uReturnFillerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uReturnFillerCounter != sharedCounter;
         localD51uReturnFillerCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_RETURN_FILLER_LEN = 2;
	/**
	 * 	serialize this D51uReturnFiller
	 */
   protected void serializeD51uReturnFiller(char[] d51uReturnFiller) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uReturnFiller,0,getStringValue(),beginD51uReturnFiller,D_51U_RETURN_FILLER_LEN);
       localD51uReturnFillerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uReturnFillerConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshD51uReturnFiller is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uReturnFiller() {	 
   		return (substring(getStringValue(),beginD51uReturnFiller,beginD51uReturnFiller + D_51U_RETURN_FILLER_LEN));
   	}




}
  
