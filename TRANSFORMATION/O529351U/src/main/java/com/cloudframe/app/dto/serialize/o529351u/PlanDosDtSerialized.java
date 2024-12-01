package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class PlanDosDtSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class PlanDosDtSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(PlanDosDtSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PLAN_DOS_DT_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPlanDosMm;
            protected  int beginPlanDosDd;
            protected  int beginPlanDosYy;
	
	/**
	* Constructor for PlanDosDtSerialized
	**/
    public PlanDosDtSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for PlanDosDtSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PlanDosDtSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this PlanDosDtSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,200134); // serialize this field at offset 200134 by default 
    }
    
	/**
	* sets parent for this PlanDosDtSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 200134 by default
    }    
	/**
	* initializes the field in PlanDosDtSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PLAN_DOS_DT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPlanDosMm = getStartOffset() + 0;	// set offset for serialization
  
             beginPlanDosDd = getStartOffset() + 2;	// set offset for serialization
  
             beginPlanDosYy = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localPlanDosMmCounter = -1;
     public boolean isPlanDosMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPlanDosMmCounter != sharedCounter;
         localPlanDosMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of planDosMm
	 *	@return planDosMm
	 */
	public char[]  getPlanDosMmString() {
	     return getCharArray(beginPlanDosMm,PLAN_DOS_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean planDosMmIsNumeric() {
	    return isNumeric(beginPlanDosMm
	                    ,beginPlanDosMm + PLAN_DOS_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PLAN_DOS_MM_LEN = 2;
  	/**
	 * serializePlanDosMm
	 */
	protected void serializePlanDosMm(int planDosMm) {
		 putNumber(beginPlanDosMm,planDosMm,PLAN_DOS_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPlanDosMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePlanDosMm
	 */
   	protected  int serializePlanDosMm(char[] value) {
	    int  planDosMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    planDosMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginPlanDosMm
		       ,2
		      );
		 localPlanDosMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  planDosMm;
    }

   protected int checkPlanDosMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPlanDosMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPlanDosMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPlanDosMm
			                 ,PLAN_DOS_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("planDosMm", beginPlanDosMm,PLAN_DOS_MM_LEN);
    }
   	}
     int localPlanDosDdCounter = -1;
     public boolean isPlanDosDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPlanDosDdCounter != sharedCounter;
         localPlanDosDdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of planDosDd
	 *	@return planDosDd
	 */
	public char[]  getPlanDosDdString() {
	     return getCharArray(beginPlanDosDd,PLAN_DOS_DD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean planDosDdIsNumeric() {
	    return isNumeric(beginPlanDosDd
	                    ,beginPlanDosDd + PLAN_DOS_DD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PLAN_DOS_DD_LEN = 2;
  	/**
	 * serializePlanDosDd
	 */
	protected void serializePlanDosDd(int planDosDd) {
		 putNumber(beginPlanDosDd,planDosDd,PLAN_DOS_DD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPlanDosDdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePlanDosDd
	 */
   	protected  int serializePlanDosDd(char[] value) {
	    int  planDosDd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    planDosDd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginPlanDosDd
		       ,2
		      );
		 localPlanDosDdCounter = shareString.getSerializedField().getModifiedCounter();
		return  planDosDd;
    }

   protected int checkPlanDosDdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPlanDosDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPlanDosDd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPlanDosDd
			                 ,PLAN_DOS_DD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("planDosDd", beginPlanDosDd,PLAN_DOS_DD_LEN);
    }
   	}
     int localPlanDosYyCounter = -1;
     public boolean isPlanDosYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPlanDosYyCounter != sharedCounter;
         localPlanDosYyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of planDosYy
	 *	@return planDosYy
	 */
	public char[]  getPlanDosYyString() {
	     return getCharArray(beginPlanDosYy,PLAN_DOS_YY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean planDosYyIsNumeric() {
	    return isNumeric(beginPlanDosYy
	                    ,beginPlanDosYy + PLAN_DOS_YY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PLAN_DOS_YY_LEN = 2;
  	/**
	 * serializePlanDosYy
	 */
	protected void serializePlanDosYy(int planDosYy) {
		 putNumber(beginPlanDosYy,planDosYy,PLAN_DOS_YY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPlanDosYyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePlanDosYy
	 */
   	protected  int serializePlanDosYy(char[] value) {
	    int  planDosYy;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    planDosYy = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginPlanDosYy
		       ,2
		      );
		 localPlanDosYyCounter = shareString.getSerializedField().getModifiedCounter();
		return  planDosYy;
    }

   protected int checkPlanDosYyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPlanDosYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPlanDosYy() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPlanDosYy
			                 ,PLAN_DOS_YY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("planDosYy", beginPlanDosYy,PLAN_DOS_YY_LEN);
    }
   	}




}
  
