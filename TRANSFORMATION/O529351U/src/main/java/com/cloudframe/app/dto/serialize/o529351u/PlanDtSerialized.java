package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class PlanDtSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class PlanDtSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(PlanDtSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PLAN_DT_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPlanCc;
            protected  int beginPlanYy;
            protected  int beginPlanMm;
            protected  int beginPlanDd;
	
	/**
	* Constructor for PlanDtSerialized
	**/
    public PlanDtSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for PlanDtSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PlanDtSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this PlanDtSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,200140); // serialize this field at offset 200140 by default 
    }
    
	/**
	* sets parent for this PlanDtSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 200140 by default
    }    
	/**
	* initializes the field in PlanDtSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PLAN_DT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPlanCc = getStartOffset() + 0;	// set offset for serialization
  
             beginPlanYy = getStartOffset() + 2;	// set offset for serialization
  
             beginPlanMm = getStartOffset() + 4;	// set offset for serialization
  
             beginPlanDd = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localPlanCcCounter = -1;
     public boolean isPlanCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPlanCcCounter != sharedCounter;
         localPlanCcCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of planCc
	 *	@return planCc
	 */
	public char[]  getPlanCcString() {
	     return getCharArray(beginPlanCc,PLAN_CC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean planCcIsNumeric() {
	    return isNumeric(beginPlanCc
	                    ,beginPlanCc + PLAN_CC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PLAN_CC_LEN = 2;
  	/**
	 * serializePlanCc
	 */
	protected void serializePlanCc(int planCc) {
		 putNumber(beginPlanCc,planCc,PLAN_CC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPlanCcCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePlanCc
	 */
   	protected  int serializePlanCc(char[] value) {
	    int  planCc;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    planCc = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginPlanCc
		       ,2
		      );
		 localPlanCcCounter = shareString.getSerializedField().getModifiedCounter();
		return  planCc;
    }

   protected int checkPlanCcMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPlanCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPlanCc() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPlanCc
			                 ,PLAN_CC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("planCc", beginPlanCc,PLAN_CC_LEN);
    }
   	}
     int localPlanYyCounter = -1;
     public boolean isPlanYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPlanYyCounter != sharedCounter;
         localPlanYyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of planYy
	 *	@return planYy
	 */
	public char[]  getPlanYyString() {
	     return getCharArray(beginPlanYy,PLAN_YY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean planYyIsNumeric() {
	    return isNumeric(beginPlanYy
	                    ,beginPlanYy + PLAN_YY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PLAN_YY_LEN = 2;
  	/**
	 * serializePlanYy
	 */
	protected void serializePlanYy(int planYy) {
		 putNumber(beginPlanYy,planYy,PLAN_YY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPlanYyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePlanYy
	 */
   	protected  int serializePlanYy(char[] value) {
	    int  planYy;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    planYy = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginPlanYy
		       ,2
		      );
		 localPlanYyCounter = shareString.getSerializedField().getModifiedCounter();
		return  planYy;
    }

   protected int checkPlanYyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPlanYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPlanYy() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPlanYy
			                 ,PLAN_YY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("planYy", beginPlanYy,PLAN_YY_LEN);
    }
   	}
     int localPlanMmCounter = -1;
     public boolean isPlanMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPlanMmCounter != sharedCounter;
         localPlanMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of planMm
	 *	@return planMm
	 */
	public char[]  getPlanMmString() {
	     return getCharArray(beginPlanMm,PLAN_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean planMmIsNumeric() {
	    return isNumeric(beginPlanMm
	                    ,beginPlanMm + PLAN_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PLAN_MM_LEN = 2;
  	/**
	 * serializePlanMm
	 */
	protected void serializePlanMm(int planMm) {
		 putNumber(beginPlanMm,planMm,PLAN_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPlanMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePlanMm
	 */
   	protected  int serializePlanMm(char[] value) {
	    int  planMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    planMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginPlanMm
		       ,2
		      );
		 localPlanMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  planMm;
    }

   protected int checkPlanMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPlanMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPlanMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPlanMm
			                 ,PLAN_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("planMm", beginPlanMm,PLAN_MM_LEN);
    }
   	}
     int localPlanDdCounter = -1;
     public boolean isPlanDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPlanDdCounter != sharedCounter;
         localPlanDdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of planDd
	 *	@return planDd
	 */
	public char[]  getPlanDdString() {
	     return getCharArray(beginPlanDd,PLAN_DD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean planDdIsNumeric() {
	    return isNumeric(beginPlanDd
	                    ,beginPlanDd + PLAN_DD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PLAN_DD_LEN = 2;
  	/**
	 * serializePlanDd
	 */
	protected void serializePlanDd(int planDd) {
		 putNumber(beginPlanDd,planDd,PLAN_DD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPlanDdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePlanDd
	 */
   	protected  int serializePlanDd(char[] value) {
	    int  planDd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    planDd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginPlanDd
		       ,2
		      );
		 localPlanDdCounter = shareString.getSerializedField().getModifiedCounter();
		return  planDd;
    }

   protected int checkPlanDdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPlanDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPlanDd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPlanDd
			                 ,PLAN_DD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("planDd", beginPlanDd,PLAN_DD_LEN);
    }
   	}




}
  
