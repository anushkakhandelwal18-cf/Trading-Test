package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class McrCheckTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class McrCheckTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(McrCheckTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MCR_CHECK_TABLE_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMcrLineNbr;
            protected  int beginMcrLineCharge;
	
	/**
	* Constructor for McrCheckTableSerialized
	**/
    public McrCheckTableSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for McrCheckTableSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public McrCheckTableSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this McrCheckTableSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,200246); // serialize this field at offset 200246 by default 
    }
    
	/**
	* sets parent for this McrCheckTableSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 200246 by default
    }    
	/**
	* initializes the field in McrCheckTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MCR_CHECK_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMcrLineNbr = getStartOffset() + 0;	// set offset for serialization
  
             beginMcrLineCharge = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMcrLineNbrCounter = -1;
     public boolean isMcrLineNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMcrLineNbrCounter != sharedCounter;
         localMcrLineNbrCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of mcrLineNbr
	 *	@return mcrLineNbr
	 */
	public char[]  getMcrLineNbrString() {
	     return getCharArray(beginMcrLineNbr,MCR_LINE_NBR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean mcrLineNbrIsNumeric() {
	    return isNumeric(beginMcrLineNbr
	                    ,beginMcrLineNbr + MCR_LINE_NBR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MCR_LINE_NBR_LEN = 1;
  	/**
	 * serializeMcrLineNbr
	 */
	protected void serializeMcrLineNbr(int mcrLineNbr) {
		 putNumber(beginMcrLineNbr,mcrLineNbr,MCR_LINE_NBR_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMcrLineNbrCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMcrLineNbr
	 */
   	protected  int serializeMcrLineNbr(char[] value) {
	    int  mcrLineNbr;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    mcrLineNbr = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginMcrLineNbr
		       ,1
		      );
		 localMcrLineNbrCounter = shareString.getSerializedField().getModifiedCounter();
		return  mcrLineNbr;
    }

   protected int checkMcrLineNbrMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMcrLineNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMcrLineNbr() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMcrLineNbr
			                 ,MCR_LINE_NBR_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("mcrLineNbr", beginMcrLineNbr,MCR_LINE_NBR_LEN);
    }
   	}
     int localMcrLineChargeCounter = -1;
     
     public boolean isMcrLineChargeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMcrLineChargeCounter != sharedCounter;
         localMcrLineChargeCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of mcrLineCharge
	 *	@return mcrLineCharge
	 */
	public char[]  getMcrLineChargeString() {
	    return getCharArray(beginMcrLineCharge,MCR_LINE_CHARGE_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean mcrLineChargeIsNumeric() {
		    return isNumeric(beginMcrLineCharge
	                    ,beginMcrLineCharge + MCR_LINE_CHARGE_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int MCR_LINE_CHARGE_LEN = 11;
  protected  static final int MCR_LINE_CHARGE_SCALE = 2;

   protected BigDecimal checkMcrLineChargeMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,11/*precision*/);
   }

  	/**
	 * serializeMcrLineCharge
	 */
	protected void serializeMcrLineCharge(BigDecimal mcrLineCharge) {
	       putNumber(beginMcrLineCharge,mcrLineCharge,MCR_LINE_CHARGE_LEN,MCR_LINE_CHARGE_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMcrLineChargeCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeMcrLineCharge
	 */
   	protected  BigDecimal serializeMcrLineCharge(char[] value) throws CFException {
        if (value.length < 11) value = pad(11, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(11,value,true/*isSigned?*/)
		       ,beginMcrLineCharge
		       ,11
		      );		 localMcrLineChargeCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,MCR_LINE_CHARGE_LEN,MCR_LINE_CHARGE_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("mcrLineCharge", beginMcrLineCharge,MCR_LINE_CHARGE_LEN);
    	}
    }
    /**
	 *	refreshMcrLineCharge is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshMcrLineCharge() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginMcrLineCharge
			            ,MCR_LINE_CHARGE_LEN
			            ,MCR_LINE_CHARGE_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("mcrLineCharge", beginMcrLineCharge,MCR_LINE_CHARGE_LEN);
    }
   	}




}
  
