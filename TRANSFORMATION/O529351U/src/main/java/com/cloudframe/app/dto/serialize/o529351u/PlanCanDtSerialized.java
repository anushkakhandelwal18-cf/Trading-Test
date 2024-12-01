package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class PlanCanDtSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class PlanCanDtSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(PlanCanDtSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PLAN_CAN_DT_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPlanCanCc;
            protected  int beginPlanCanYy;
	
	/**
	* Constructor for PlanCanDtSerialized
	**/
    public PlanCanDtSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for PlanCanDtSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PlanCanDtSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this PlanCanDtSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,200126); // serialize this field at offset 200126 by default 
    }
    
	/**
	* sets parent for this PlanCanDtSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 200126 by default
    }    
	/**
	* initializes the field in PlanCanDtSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PLAN_CAN_DT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPlanCanCc = getStartOffset() + 0;	// set offset for serialization
  
             beginPlanCanYy = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localPlanCanCcCounter = -1;
     public boolean isPlanCanCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPlanCanCcCounter != sharedCounter;
         localPlanCanCcCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of planCanCc
	 *	@return planCanCc
	 */
	public char[]  getPlanCanCcString() {
	     return getCharArray(beginPlanCanCc,PLAN_CAN_CC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean planCanCcIsNumeric() {
	    return isNumeric(beginPlanCanCc
	                    ,beginPlanCanCc + PLAN_CAN_CC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PLAN_CAN_CC_LEN = 2;
  	/**
	 * serializePlanCanCc
	 */
	protected void serializePlanCanCc(int planCanCc) {
		 putNumber(beginPlanCanCc,planCanCc,PLAN_CAN_CC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPlanCanCcCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePlanCanCc
	 */
   	protected  int serializePlanCanCc(char[] value) {
	    int  planCanCc;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    planCanCc = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginPlanCanCc
		       ,2
		      );
		 localPlanCanCcCounter = shareString.getSerializedField().getModifiedCounter();
		return  planCanCc;
    }

   protected int checkPlanCanCcMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPlanCanCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPlanCanCc() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPlanCanCc
			                 ,PLAN_CAN_CC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("planCanCc", beginPlanCanCc,PLAN_CAN_CC_LEN);
    }
   	}
     int localPlanCanYyCounter = -1;
     public boolean isPlanCanYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPlanCanYyCounter != sharedCounter;
         localPlanCanYyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of planCanYy
	 *	@return planCanYy
	 */
	public char[]  getPlanCanYyString() {
	     return getCharArray(beginPlanCanYy,PLAN_CAN_YY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean planCanYyIsNumeric() {
	    return isNumeric(beginPlanCanYy
	                    ,beginPlanCanYy + PLAN_CAN_YY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PLAN_CAN_YY_LEN = 2;
  	/**
	 * serializePlanCanYy
	 */
	protected void serializePlanCanYy(int planCanYy) {
		 putNumber(beginPlanCanYy,planCanYy,PLAN_CAN_YY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPlanCanYyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePlanCanYy
	 */
   	protected  int serializePlanCanYy(char[] value) {
	    int  planCanYy;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    planCanYy = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginPlanCanYy
		       ,2
		      );
		 localPlanCanYyCounter = shareString.getSerializedField().getModifiedCounter();
		return  planCanYy;
    }

   protected int checkPlanCanYyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPlanCanYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPlanCanYy() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPlanCanYy
			                 ,PLAN_CAN_YY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("planCanYy", beginPlanCanYy,PLAN_CAN_YY_LEN);
    }
   	}




}
  
