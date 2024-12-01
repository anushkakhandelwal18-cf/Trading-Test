package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class D51uReturnDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class D51uReturnDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(D51uReturnDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int D_51U_RETURN_DATA_LENGTH = 41;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginD51uRetFeSpi;
            protected  int beginD51uRetPolicy;
            protected  int beginD51uRetPlan;
            protected  int beginD51uRetEffDt;
            protected  int beginD51uRetCanDt;
            protected  int beginD51uRetStatus;
            protected  int beginD51uRetPosTierCd;
            protected  int beginD51uRetPriDiagInd;
            protected  int beginD51uRetDiagElgInd;
	
	/**
	* Constructor for D51uReturnDataSerialized
	**/
    public D51uReturnDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for D51uReturnDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uReturnDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this D51uReturnDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,351); // serialize this field at offset 351 by default 
    }
    
	/**
	* sets parent for this D51uReturnDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 351 by default
    }    
	/**
	* initializes the field in D51uReturnDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(D_51U_RETURN_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginD51uRetFeSpi = getStartOffset() + 0;	// set offset for serialization
  
             beginD51uRetPolicy = getStartOffset() + 7;	// set offset for serialization
  
             beginD51uRetPlan = getStartOffset() + 13;	// set offset for serialization
  
             beginD51uRetEffDt = getStartOffset() + 17;	// set offset for serialization
  
             beginD51uRetCanDt = getStartOffset() + 27;	// set offset for serialization
  
             beginD51uRetStatus = getStartOffset() + 37;	// set offset for serialization
  
             beginD51uRetPosTierCd = getStartOffset() + 38;	// set offset for serialization
  
             beginD51uRetPriDiagInd = getStartOffset() + 39;	// set offset for serialization
  
             beginD51uRetDiagElgInd = getStartOffset() + 40;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localD51uRetFeSpiCounter = -1;
     public boolean isD51uRetFeSpiModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uRetFeSpiCounter != sharedCounter;
         localD51uRetFeSpiCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_RET_FE_SPI_LEN = 7;
	/**
	 * 	serialize this D51uRetFeSpi
	 */
   protected void serializeD51uRetFeSpi(char[] d51uRetFeSpi) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uRetFeSpi,0,getStringValue(),beginD51uRetFeSpi,D_51U_RET_FE_SPI_LEN);
       localD51uRetFeSpiCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uRetFeSpiConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshD51uRetFeSpi is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uRetFeSpi() {	 
   		return (substring(getStringValue(),beginD51uRetFeSpi,beginD51uRetFeSpi + D_51U_RET_FE_SPI_LEN));
   	}
     int localD51uRetPolicyCounter = -1;
     public boolean isD51uRetPolicyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uRetPolicyCounter != sharedCounter;
         localD51uRetPolicyCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_RET_POLICY_LEN = 6;
	/**
	 * 	serialize this D51uRetPolicy
	 */
   protected void serializeD51uRetPolicy(char[] d51uRetPolicy) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uRetPolicy,0,getStringValue(),beginD51uRetPolicy,D_51U_RET_POLICY_LEN);
       localD51uRetPolicyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uRetPolicyConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshD51uRetPolicy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uRetPolicy() {	 
   		return (substring(getStringValue(),beginD51uRetPolicy,beginD51uRetPolicy + D_51U_RET_POLICY_LEN));
   	}
     int localD51uRetPlanCounter = -1;
     public boolean isD51uRetPlanModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uRetPlanCounter != sharedCounter;
         localD51uRetPlanCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of d51uRetPlan
	 *	@return d51uRetPlan
	 */
	public char[]  getD51uRetPlanString() {
	     return getCharArray(beginD51uRetPlan,D_51U_RET_PLAN_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean d51uRetPlanIsNumeric() {
	    return isNumeric(beginD51uRetPlan
	                    ,beginD51uRetPlan + D_51U_RET_PLAN_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int D_51U_RET_PLAN_LEN = 4;
  	/**
	 * serializeD51uRetPlan
	 */
	protected void serializeD51uRetPlan(int d51uRetPlan) {
		 putNumber(beginD51uRetPlan,d51uRetPlan,D_51U_RET_PLAN_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localD51uRetPlanCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeD51uRetPlan
	 */
   	protected  int serializeD51uRetPlan(char[] value) {
	    int  d51uRetPlan;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    d51uRetPlan = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginD51uRetPlan
		       ,4
		      );
		 localD51uRetPlanCounter = shareString.getSerializedField().getModifiedCounter();
		return  d51uRetPlan;
    }

   protected int checkD51uRetPlanMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshD51uRetPlan is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshD51uRetPlan() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginD51uRetPlan
			                 ,D_51U_RET_PLAN_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("d51uRetPlan", beginD51uRetPlan,D_51U_RET_PLAN_LEN);
    }
   	}
     int localD51uRetEffDtCounter = -1;
     public boolean isD51uRetEffDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uRetEffDtCounter != sharedCounter;
         localD51uRetEffDtCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_RET_EFF_DT_LEN = 10;
	/**
	 * 	serialize this D51uRetEffDt
	 */
   protected void serializeD51uRetEffDt(char[] d51uRetEffDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uRetEffDt,0,getStringValue(),beginD51uRetEffDt,D_51U_RET_EFF_DT_LEN);
       localD51uRetEffDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uRetEffDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshD51uRetEffDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uRetEffDt() {	 
   		return (substring(getStringValue(),beginD51uRetEffDt,beginD51uRetEffDt + D_51U_RET_EFF_DT_LEN));
   	}
     int localD51uRetCanDtCounter = -1;
     public boolean isD51uRetCanDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uRetCanDtCounter != sharedCounter;
         localD51uRetCanDtCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_RET_CAN_DT_LEN = 10;
	/**
	 * 	serialize this D51uRetCanDt
	 */
   protected void serializeD51uRetCanDt(char[] d51uRetCanDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uRetCanDt,0,getStringValue(),beginD51uRetCanDt,D_51U_RET_CAN_DT_LEN);
       localD51uRetCanDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uRetCanDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshD51uRetCanDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uRetCanDt() {	 
   		return (substring(getStringValue(),beginD51uRetCanDt,beginD51uRetCanDt + D_51U_RET_CAN_DT_LEN));
   	}
     int localD51uRetStatusCounter = -1;
     public boolean isD51uRetStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uRetStatusCounter != sharedCounter;
         localD51uRetStatusCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_RET_STATUS_LEN = 1;
	/**
	 * 	serialize this D51uRetStatus
	 */
   protected void serializeD51uRetStatus(char[] d51uRetStatus) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uRetStatus,0,getStringValue(),beginD51uRetStatus,D_51U_RET_STATUS_LEN);
       localD51uRetStatusCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uRetStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshD51uRetStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uRetStatus() {	 
   		return (substring(getStringValue(),beginD51uRetStatus,beginD51uRetStatus + D_51U_RET_STATUS_LEN));
   	}
     int localD51uRetPosTierCdCounter = -1;
     public boolean isD51uRetPosTierCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uRetPosTierCdCounter != sharedCounter;
         localD51uRetPosTierCdCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_RET_POS_TIER_CD_LEN = 1;
	/**
	 * 	serialize this D51uRetPosTierCd
	 */
   protected void serializeD51uRetPosTierCd(char[] d51uRetPosTierCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uRetPosTierCd,0,getStringValue(),beginD51uRetPosTierCd,D_51U_RET_POS_TIER_CD_LEN);
       localD51uRetPosTierCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uRetPosTierCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshD51uRetPosTierCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uRetPosTierCd() {	 
   		return (substring(getStringValue(),beginD51uRetPosTierCd,beginD51uRetPosTierCd + D_51U_RET_POS_TIER_CD_LEN));
   	}
     int localD51uRetPriDiagIndCounter = -1;
     public boolean isD51uRetPriDiagIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uRetPriDiagIndCounter != sharedCounter;
         localD51uRetPriDiagIndCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_RET_PRI_DIAG_IND_LEN = 1;
	/**
	 * 	serialize this D51uRetPriDiagInd
	 */
   protected void serializeD51uRetPriDiagInd(char[] d51uRetPriDiagInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uRetPriDiagInd,0,getStringValue(),beginD51uRetPriDiagInd,D_51U_RET_PRI_DIAG_IND_LEN);
       localD51uRetPriDiagIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uRetPriDiagIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshD51uRetPriDiagInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uRetPriDiagInd() {	 
   		return (substring(getStringValue(),beginD51uRetPriDiagInd,beginD51uRetPriDiagInd + D_51U_RET_PRI_DIAG_IND_LEN));
   	}
     int localD51uRetDiagElgIndCounter = -1;
     public boolean isD51uRetDiagElgIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localD51uRetDiagElgIndCounter != sharedCounter;
         localD51uRetDiagElgIndCounter = sharedCounter; return hasModified;
     }
	protected static final int D_51U_RET_DIAG_ELG_IND_LEN = 1;
	/**
	 * 	serialize this D51uRetDiagElgInd
	 */
   protected void serializeD51uRetDiagElgInd(char[] d51uRetDiagElgInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(d51uRetDiagElgInd,0,getStringValue(),beginD51uRetDiagElgInd,D_51U_RET_DIAG_ELG_IND_LEN);
       localD51uRetDiagElgIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkD51uRetDiagElgIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshD51uRetDiagElgInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshD51uRetDiagElgInd() {	 
   		return (substring(getStringValue(),beginD51uRetDiagElgInd,beginD51uRetDiagElgInd + D_51U_RET_DIAG_ELG_IND_LEN));
   	}




}
  
