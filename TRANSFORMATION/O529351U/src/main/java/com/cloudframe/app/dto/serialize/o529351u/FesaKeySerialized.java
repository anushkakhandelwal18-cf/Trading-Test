package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class FesaKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class FesaKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FesaKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FESA_KEY_LENGTH = 17;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFesaPolicy;
            protected  int beginFesaPlanVar;
            protected  int beginFesaEffDate;
            protected  int beginFesaSpiNbr;
	
	/**
	* Constructor for FesaKeySerialized
	**/
    public FesaKeySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for FesaKeySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FesaKeySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this FesaKeySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this FesaKeySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in FesaKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FESA_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFesaPolicy = getStartOffset() + 0;	// set offset for serialization
  
             beginFesaPlanVar = getStartOffset() + 6;	// set offset for serialization
  
             beginFesaEffDate = getStartOffset() + 9;	// set offset for serialization
  
             beginFesaSpiNbr = getStartOffset() + 13;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFesaPolicyCounter = -1;
     public boolean isFesaPolicyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFesaPolicyCounter != sharedCounter;
         localFesaPolicyCounter = sharedCounter; return hasModified;
     }
	protected static final int FESA_POLICY_LEN = 6;
	/**
	 * 	serialize this FesaPolicy
	 */
   protected void serializeFesaPolicy(char[] fesaPolicy) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fesaPolicy,0,getStringValue(),beginFesaPolicy,FESA_POLICY_LEN);
       localFesaPolicyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFesaPolicyConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshFesaPolicy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFesaPolicy() {	 
   		return (substring(getStringValue(),beginFesaPolicy,beginFesaPolicy + FESA_POLICY_LEN));
   	}
        int localFesaPlanVarCounter = -1;
        public boolean isFesaPlanVarModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localFesaPlanVarCounter != sharedCounter;
           localFesaPlanVarCounter = sharedCounter; return hasModified; 
        }
	    public boolean fesaPlanVarIsNumeric() {
	      return decimalIsNumeric(beginFesaPlanVar,FESA_PLAN_VAR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int FESA_PLAN_VAR_LEN = 3;
  	/**
	 * 	serializeFesaPlanVar
	 */
	protected void serializeFesaPlanVar(int fesaPlanVar) {
		   putDecimal(beginFesaPlanVar,fesaPlanVar,FESA_PLAN_VAR_LEN,true);
   }
   

   protected int checkFesaPlanVarMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_100K /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshFesaPlanVar is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFesaPlanVar() throws CFException {	
   	try { 
		 return (getIntDecimal(beginFesaPlanVar,FESA_PLAN_VAR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("fesaPlanVar", beginFesaPlanVar,FESA_PLAN_VAR_LEN);
     }
   	}
        int localFesaEffDateCounter = -1;
        public boolean isFesaEffDateModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localFesaEffDateCounter != sharedCounter;
           localFesaEffDateCounter = sharedCounter; return hasModified; 
        }
	    public boolean fesaEffDateIsNumeric() {
	      return decimalIsNumeric(beginFesaEffDate,FESA_EFF_DATE_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int FESA_EFF_DATE_LEN = 4;
  	/**
	 * 	serializeFesaEffDate
	 */
	protected void serializeFesaEffDate(int fesaEffDate) {
		   putDecimal(beginFesaEffDate,fesaEffDate,FESA_EFF_DATE_LEN,true);
   }
   

   protected int checkFesaEffDateMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_10M /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshFesaEffDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFesaEffDate() throws CFException {	
   	try { 
		 return (getIntDecimal(beginFesaEffDate,FESA_EFF_DATE_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("fesaEffDate", beginFesaEffDate,FESA_EFF_DATE_LEN);
     }
   	}
        int localFesaSpiNbrCounter = -1;
        public boolean isFesaSpiNbrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localFesaSpiNbrCounter != sharedCounter;
           localFesaSpiNbrCounter = sharedCounter; return hasModified; 
        }
	    public boolean fesaSpiNbrIsNumeric() {
	      return decimalIsNumeric(beginFesaSpiNbr,FESA_SPI_NBR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int FESA_SPI_NBR_LEN = 4;
  	/**
	 * 	serializeFesaSpiNbr
	 */
	protected void serializeFesaSpiNbr(int fesaSpiNbr) {
		   putDecimal(beginFesaSpiNbr,fesaSpiNbr,FESA_SPI_NBR_LEN,true);
   }
   

   protected int checkFesaSpiNbrMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_10M /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshFesaSpiNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFesaSpiNbr() throws CFException {	
   	try { 
		 return (getIntDecimal(beginFesaSpiNbr,FESA_SPI_NBR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("fesaSpiNbr", beginFesaSpiNbr,FESA_SPI_NBR_LEN);
     }
   	}




}
  
