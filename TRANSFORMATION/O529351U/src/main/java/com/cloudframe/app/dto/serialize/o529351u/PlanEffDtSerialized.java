package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class PlanEffDtSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class PlanEffDtSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(PlanEffDtSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PLAN_EFF_DT_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPlanEffCc;
            protected  int beginPlanEffYy;
	
	/**
	* Constructor for PlanEffDtSerialized
	**/
    public PlanEffDtSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for PlanEffDtSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PlanEffDtSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this PlanEffDtSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,200118); // serialize this field at offset 200118 by default 
    }
    
	/**
	* sets parent for this PlanEffDtSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 200118 by default
    }    
	/**
	* initializes the field in PlanEffDtSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PLAN_EFF_DT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPlanEffCc = getStartOffset() + 0;	// set offset for serialization
  
             beginPlanEffYy = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localPlanEffCcCounter = -1;
     public boolean isPlanEffCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPlanEffCcCounter != sharedCounter;
         localPlanEffCcCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of planEffCc
	 *	@return planEffCc
	 */
	public char[]  getPlanEffCcString() {
	     return getCharArray(beginPlanEffCc,PLAN_EFF_CC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean planEffCcIsNumeric() {
	    return isNumeric(beginPlanEffCc
	                    ,beginPlanEffCc + PLAN_EFF_CC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PLAN_EFF_CC_LEN = 2;
  	/**
	 * serializePlanEffCc
	 */
	protected void serializePlanEffCc(int planEffCc) {
		 putNumber(beginPlanEffCc,planEffCc,PLAN_EFF_CC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPlanEffCcCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePlanEffCc
	 */
   	protected  int serializePlanEffCc(char[] value) {
	    int  planEffCc;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    planEffCc = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginPlanEffCc
		       ,2
		      );
		 localPlanEffCcCounter = shareString.getSerializedField().getModifiedCounter();
		return  planEffCc;
    }

   protected int checkPlanEffCcMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPlanEffCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPlanEffCc() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPlanEffCc
			                 ,PLAN_EFF_CC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("planEffCc", beginPlanEffCc,PLAN_EFF_CC_LEN);
    }
   	}
     int localPlanEffYyCounter = -1;
     public boolean isPlanEffYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPlanEffYyCounter != sharedCounter;
         localPlanEffYyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of planEffYy
	 *	@return planEffYy
	 */
	public char[]  getPlanEffYyString() {
	     return getCharArray(beginPlanEffYy,PLAN_EFF_YY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean planEffYyIsNumeric() {
	    return isNumeric(beginPlanEffYy
	                    ,beginPlanEffYy + PLAN_EFF_YY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PLAN_EFF_YY_LEN = 2;
  	/**
	 * serializePlanEffYy
	 */
	protected void serializePlanEffYy(int planEffYy) {
		 putNumber(beginPlanEffYy,planEffYy,PLAN_EFF_YY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPlanEffYyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePlanEffYy
	 */
   	protected  int serializePlanEffYy(char[] value) {
	    int  planEffYy;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    planEffYy = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginPlanEffYy
		       ,2
		      );
		 localPlanEffYyCounter = shareString.getSerializedField().getModifiedCounter();
		return  planEffYy;
    }

   protected int checkPlanEffYyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPlanEffYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPlanEffYy() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPlanEffYy
			                 ,PLAN_EFF_YY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("planEffYy", beginPlanEffYy,PLAN_EFF_YY_LEN);
    }
   	}




}
  
