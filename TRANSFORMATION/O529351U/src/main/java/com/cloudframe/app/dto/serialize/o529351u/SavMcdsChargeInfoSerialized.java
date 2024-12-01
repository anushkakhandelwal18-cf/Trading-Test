package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class SavMcdsChargeInfoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SavMcdsChargeInfoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SavMcdsChargeInfoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SAV_MCDS_CHARGE_INFO_LENGTH = 396;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSavNatDrugCd;
	
	/**
	* Constructor for SavMcdsChargeInfoSerialized
	**/
    public SavMcdsChargeInfoSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SavMcdsChargeInfoSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SavMcdsChargeInfoSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SavMcdsChargeInfoSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,85); // serialize this field at offset 85 by default 
    }
    
	/**
	* sets parent for this SavMcdsChargeInfoSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 85 by default
    }    
	/**
	* initializes the field in SavMcdsChargeInfoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SAV_MCDS_CHARGE_INFO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSavNatDrugCd = getStartOffset() + 101;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localSavNatDrugCdCounter = -1;
     public boolean isSavNatDrugCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSavNatDrugCdCounter != sharedCounter;
         localSavNatDrugCdCounter = sharedCounter; return hasModified;
     }
	protected static final int SAV_NAT_DRUG_CD_LEN = 11;
	/**
	 * 	serialize this SavNatDrugCd
	 */
   protected void serializeSavNatDrugCd(char[] savNatDrugCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(savNatDrugCd,0,getStringValue(),beginSavNatDrugCd,SAV_NAT_DRUG_CD_LEN);
       localSavNatDrugCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSavNatDrugCdConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshSavNatDrugCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSavNatDrugCd() {	 
   		return (substring(getStringValue(),beginSavNatDrugCd,beginSavNatDrugCd + SAV_NAT_DRUG_CD_LEN));
   	}




}
  
