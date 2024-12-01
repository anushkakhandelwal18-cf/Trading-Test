package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class PpaKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class PpaKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(PpaKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PPA_KEY_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPpaProvTinSuff;
	
	/**
	* Constructor for PpaKeySerialized
	**/
    public PpaKeySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for PpaKeySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PpaKeySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this PpaKeySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,11961); // serialize this field at offset 11961 by default 
    }
    
	/**
	* sets parent for this PpaKeySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 11961 by default
    }    
	/**
	* initializes the field in PpaKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PPA_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPpaProvTinSuff = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localPpaProvTinSuffCounter = -1;
        public boolean isPpaProvTinSuffModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localPpaProvTinSuffCounter != sharedCounter;
           localPpaProvTinSuffCounter = sharedCounter; return hasModified; 
        }
	    public boolean ppaProvTinSuffIsNumeric() {
	      return decimalIsNumeric(beginPpaProvTinSuff,PPA_PROV_TIN_SUFF_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int PPA_PROV_TIN_SUFF_LEN = 8;
  	/**
	 * 	serializePpaProvTinSuff
	 */
	protected void serializePpaProvTinSuff(long ppaProvTinSuff) {
		   putDecimal(beginPpaProvTinSuff,ppaProvTinSuff,PPA_PROV_TIN_SUFF_LEN,true);
   }
   

   protected long checkPpaProvTinSuffMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshPpaProvTinSuff is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPpaProvTinSuff() throws CFException {	
   	try { 
		 return (getLongDecimal(beginPpaProvTinSuff,PPA_PROV_TIN_SUFF_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("ppaProvTinSuff", beginPpaProvTinSuff,PPA_PROV_TIN_SUFF_LEN);
     }
   	}




}
  
