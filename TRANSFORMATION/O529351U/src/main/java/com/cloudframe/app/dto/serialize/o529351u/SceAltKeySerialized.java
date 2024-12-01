package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class SceAltKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class SceAltKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SceAltKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SCE_ALT_KEY_LENGTH = 11;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSceAltModifier;
            protected  int beginSceAltToHcpcs;
            protected  int beginSceAltCancDate;
	
	/**
	* Constructor for SceAltKeySerialized
	**/
    public SceAltKeySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SceAltKeySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SceAltKeySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SceAltKeySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,17); // serialize this field at offset 17 by default 
    }
    
	/**
	* sets parent for this SceAltKeySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 17 by default
    }    
	/**
	* initializes the field in SceAltKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SCE_ALT_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSceAltModifier = getStartOffset() + 0;	// set offset for serialization
  
             beginSceAltToHcpcs = getStartOffset() + 1;	// set offset for serialization
  
             beginSceAltCancDate = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSceAltModifierCounter = -1;
     public boolean isSceAltModifierModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSceAltModifierCounter != sharedCounter;
         localSceAltModifierCounter = sharedCounter; return hasModified;
     }
	protected static final int SCE_ALT_MODIFIER_LEN = 1;
	/**
	 * 	serialize this SceAltModifier
	 */
   protected void serializeSceAltModifier(char[] sceAltModifier) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sceAltModifier,0,getStringValue(),beginSceAltModifier,SCE_ALT_MODIFIER_LEN);
       localSceAltModifierCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSceAltModifierConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSceAltModifier is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSceAltModifier() {	 
   		return (substring(getStringValue(),beginSceAltModifier,beginSceAltModifier + SCE_ALT_MODIFIER_LEN));
   	}
     int localSceAltToHcpcsCounter = -1;
     public boolean isSceAltToHcpcsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSceAltToHcpcsCounter != sharedCounter;
         localSceAltToHcpcsCounter = sharedCounter; return hasModified;
     }
	protected static final int SCE_ALT_TO_HCPCS_LEN = 5;
	/**
	 * 	serialize this SceAltToHcpcs
	 */
   protected void serializeSceAltToHcpcs(char[] sceAltToHcpcs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sceAltToHcpcs,0,getStringValue(),beginSceAltToHcpcs,SCE_ALT_TO_HCPCS_LEN);
       localSceAltToHcpcsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSceAltToHcpcsConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshSceAltToHcpcs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSceAltToHcpcs() {	 
   		return (substring(getStringValue(),beginSceAltToHcpcs,beginSceAltToHcpcs + SCE_ALT_TO_HCPCS_LEN));
   	}
        int localSceAltCancDateCounter = -1;
        public boolean isSceAltCancDateModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localSceAltCancDateCounter != sharedCounter;
           localSceAltCancDateCounter = sharedCounter; return hasModified; 
        }
	    public boolean sceAltCancDateIsNumeric() {
	      return decimalIsNumeric(beginSceAltCancDate,SCE_ALT_CANC_DATE_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int SCE_ALT_CANC_DATE_LEN = 5;
  	/**
	 * 	serializeSceAltCancDate
	 */
	protected void serializeSceAltCancDate(long sceAltCancDate) {
		   putDecimal(beginSceAltCancDate,sceAltCancDate,SCE_ALT_CANC_DATE_LEN,false);
   }
   

   protected long checkSceAltCancDateMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1G /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshSceAltCancDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSceAltCancDate() throws CFException {	
   	try { 
		 return (getLongDecimal(beginSceAltCancDate,SCE_ALT_CANC_DATE_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("sceAltCancDate", beginSceAltCancDate,SCE_ALT_CANC_DATE_LEN);
     }
   	}




}
  
