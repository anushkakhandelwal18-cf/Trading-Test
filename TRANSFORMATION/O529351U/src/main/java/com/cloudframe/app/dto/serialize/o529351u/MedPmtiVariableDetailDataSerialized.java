package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class MedPmtiVariableDetailDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MedPmtiVariableDetailDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MedPmtiVariableDetailDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MED_PMTI_VARIABLE_DETAIL_DATA_LENGTH = 642;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMedPmtiProvTin;
            protected  int beginMedPmtiSpecPayeeTin;
	
	/**
	* Constructor for MedPmtiVariableDetailDataSerialized
	**/
    public MedPmtiVariableDetailDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MedPmtiVariableDetailDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MedPmtiVariableDetailDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MedPmtiVariableDetailDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,31); // serialize this field at offset 31 by default 
    }
    
	/**
	* sets parent for this MedPmtiVariableDetailDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 31 by default
    }    
	/**
	* initializes the field in MedPmtiVariableDetailDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MED_PMTI_VARIABLE_DETAIL_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginMedPmtiProvTin = getStartOffset() + 33;	// set offset for serialization
  
  
             beginMedPmtiSpecPayeeTin = getStartOffset() + 119;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMedPmtiProvTinCounter = -1;
     public boolean isMedPmtiProvTinModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMedPmtiProvTinCounter != sharedCounter;
         localMedPmtiProvTinCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of medPmtiProvTin
	 *	@return medPmtiProvTin
	 */
	public char[]  getMedPmtiProvTinString() {
	     return getCharArray(beginMedPmtiProvTin,MED_PMTI_PROV_TIN_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean medPmtiProvTinIsNumeric() {
	    return isNumeric(beginMedPmtiProvTin
	                    ,beginMedPmtiProvTin + MED_PMTI_PROV_TIN_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MED_PMTI_PROV_TIN_LEN = 15;
  	/**
	 * serializeMedPmtiProvTin
	 */
	protected void serializeMedPmtiProvTin(long medPmtiProvTin) {
		 putNumber(beginMedPmtiProvTin,medPmtiProvTin,MED_PMTI_PROV_TIN_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMedPmtiProvTinCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMedPmtiProvTin
	 */
   	protected  long serializeMedPmtiProvTin(char[] value) {
	    long  medPmtiProvTin;
	    if(value.length >0 && value.length!= 15)
            value = new String(value).trim().toCharArray();
	    if (value.length < 15) value = pad(15, value, ' ', LEFT_PAD);
	    else if (value.length > 15) value = substring(value,0,15);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    medPmtiProvTin = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(15,value,false/*isSigned?*/)
		       ,beginMedPmtiProvTin
		       ,15
		      );
		 localMedPmtiProvTinCounter = shareString.getSerializedField().getModifiedCounter();
		return  medPmtiProvTin;
    }

   protected long checkMedPmtiProvTinMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1P/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMedPmtiProvTin is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMedPmtiProvTin() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMedPmtiProvTin
			                 ,MED_PMTI_PROV_TIN_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("medPmtiProvTin", beginMedPmtiProvTin,MED_PMTI_PROV_TIN_LEN);
    }
   	}
     int localMedPmtiSpecPayeeTinCounter = -1;
     public boolean isMedPmtiSpecPayeeTinModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMedPmtiSpecPayeeTinCounter != sharedCounter;
         localMedPmtiSpecPayeeTinCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of medPmtiSpecPayeeTin
	 *	@return medPmtiSpecPayeeTin
	 */
	public char[]  getMedPmtiSpecPayeeTinString() {
	     return getCharArray(beginMedPmtiSpecPayeeTin,MED_PMTI_SPEC_PAYEE_TIN_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean medPmtiSpecPayeeTinIsNumeric() {
	    return isNumeric(beginMedPmtiSpecPayeeTin
	                    ,beginMedPmtiSpecPayeeTin + MED_PMTI_SPEC_PAYEE_TIN_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MED_PMTI_SPEC_PAYEE_TIN_LEN = 15;
  	/**
	 * serializeMedPmtiSpecPayeeTin
	 */
	protected void serializeMedPmtiSpecPayeeTin(long medPmtiSpecPayeeTin) {
		 putNumber(beginMedPmtiSpecPayeeTin,medPmtiSpecPayeeTin,MED_PMTI_SPEC_PAYEE_TIN_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMedPmtiSpecPayeeTinCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMedPmtiSpecPayeeTin
	 */
   	protected  long serializeMedPmtiSpecPayeeTin(char[] value) {
	    long  medPmtiSpecPayeeTin;
	    if(value.length >0 && value.length!= 15)
            value = new String(value).trim().toCharArray();
	    if (value.length < 15) value = pad(15, value, ' ', LEFT_PAD);
	    else if (value.length > 15) value = substring(value,0,15);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    medPmtiSpecPayeeTin = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(15,value,false/*isSigned?*/)
		       ,beginMedPmtiSpecPayeeTin
		       ,15
		      );
		 localMedPmtiSpecPayeeTinCounter = shareString.getSerializedField().getModifiedCounter();
		return  medPmtiSpecPayeeTin;
    }

   protected long checkMedPmtiSpecPayeeTinMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1P/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMedPmtiSpecPayeeTin is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMedPmtiSpecPayeeTin() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMedPmtiSpecPayeeTin
			                 ,MED_PMTI_SPEC_PAYEE_TIN_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("medPmtiSpecPayeeTin", beginMedPmtiSpecPayeeTin,MED_PMTI_SPEC_PAYEE_TIN_LEN);
    }
   	}




}
  
