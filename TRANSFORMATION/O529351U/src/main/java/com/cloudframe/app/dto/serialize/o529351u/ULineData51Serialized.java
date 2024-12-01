package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class ULineData51Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class ULineData51Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ULineData51Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int U_LINE_DATA_51_LENGTH = 36;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginULinePos51;
            protected  int beginULineServiceCode51;
            protected  int beginULineDosDate51;
            protected  int beginULineChargeAmt51;
            protected  int beginULineNotcovAmt51;
            protected  int beginULineRemarkCd51;
            protected  int beginULineAppUnits51;
            protected  int beginULineDiagPointer51;
	
	/**
	* Constructor for ULineData51Serialized
	**/
    public ULineData51Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ULineData51Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ULineData51Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ULineData51Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2806); // serialize this field at offset 2806 by default 
    }
    
	/**
	* sets parent for this ULineData51Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2806 by default
    }    
	/**
	* initializes the field in ULineData51Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(U_LINE_DATA_51_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginULinePos51 = getStartOffset() + 0;	// set offset for serialization
  
             beginULineServiceCode51 = getStartOffset() + 2;	// set offset for serialization
  
             beginULineDosDate51 = getStartOffset() + 8;	// set offset for serialization
  
             beginULineChargeAmt51 = getStartOffset() + 12;	// set offset for serialization
  
             beginULineNotcovAmt51 = getStartOffset() + 17;	// set offset for serialization
  
             beginULineRemarkCd51 = getStartOffset() + 22;	// set offset for serialization
  
             beginULineAppUnits51 = getStartOffset() + 25;	// set offset for serialization
  
             beginULineDiagPointer51 = getStartOffset() + 28;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localULinePos51Counter = -1;
     public boolean isULinePos51Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localULinePos51Counter != sharedCounter;
         localULinePos51Counter = sharedCounter; return hasModified;
     }
	protected static final int U_LINE_POS_51_LEN = 2;
	/**
	 * 	serialize this ULinePos51
	 */
   protected void serializeULinePos51(char[] uLinePos51) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(uLinePos51,0,getStringValue(),beginULinePos51,U_LINE_POS_51_LEN);
       localULinePos51Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkULinePos51Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshULinePos51 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshULinePos51() {	 
   		return (substring(getStringValue(),beginULinePos51,beginULinePos51 + U_LINE_POS_51_LEN));
   	}
     int localULineServiceCode51Counter = -1;
     public boolean isULineServiceCode51Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localULineServiceCode51Counter != sharedCounter;
         localULineServiceCode51Counter = sharedCounter; return hasModified;
     }
	protected static final int U_LINE_SERVICE_CODE_51_LEN = 6;
	/**
	 * 	serialize this ULineServiceCode51
	 */
   protected void serializeULineServiceCode51(char[] uLineServiceCode51) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(uLineServiceCode51,0,getStringValue(),beginULineServiceCode51,U_LINE_SERVICE_CODE_51_LEN);
       localULineServiceCode51Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkULineServiceCode51Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshULineServiceCode51 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshULineServiceCode51() {	 
   		return (substring(getStringValue(),beginULineServiceCode51,beginULineServiceCode51 + U_LINE_SERVICE_CODE_51_LEN));
   	}
        int localULineDosDate51Counter = -1;
        public boolean isULineDosDate51Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localULineDosDate51Counter != sharedCounter;
           localULineDosDate51Counter = sharedCounter; return hasModified; 
        }
	    public boolean uLineDosDate51IsNumeric() {
	      return decimalIsNumeric(beginULineDosDate51,U_LINE_DOS_DATE_51_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int U_LINE_DOS_DATE_51_LEN = 4;
  	/**
	 * 	serializeULineDosDate51
	 */
	protected void serializeULineDosDate51(int uLineDosDate51) {
		   putDecimal(beginULineDosDate51,uLineDosDate51,U_LINE_DOS_DATE_51_LEN,true);
   }
   

   protected int checkULineDosDate51MaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_10M /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshULineDosDate51 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshULineDosDate51() throws CFException {	
   	try { 
		 return (getIntDecimal(beginULineDosDate51,U_LINE_DOS_DATE_51_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("uLineDosDate51", beginULineDosDate51,U_LINE_DOS_DATE_51_LEN);
     }
   	}
        int localULineChargeAmt51Counter = -1;
        public boolean isULineChargeAmt51Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localULineChargeAmt51Counter != sharedCounter;
           localULineChargeAmt51Counter = sharedCounter; return hasModified; 
        }
	    public boolean uLineChargeAmt51IsNumeric() {
	      return decimalIsNumeric(beginULineChargeAmt51,U_LINE_CHARGE_AMT_51_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] uLineChargeAmt51String() {
            return getPackedString(beginULineChargeAmt51,U_LINE_CHARGE_AMT_51_LEN);
         }
   protected static final int U_LINE_CHARGE_AMT_51_LEN = 5;
   protected static final int U_LINE_CHARGE_AMT_51_SCALE = 2;
  	/**
	 * 	serializeULineChargeAmt51
	 */
	protected void serializeULineChargeAmt51(BigDecimal uLineChargeAmt51) {
		   putDecimal(beginULineChargeAmt51,uLineChargeAmt51,U_LINE_CHARGE_AMT_51_LEN,U_LINE_CHARGE_AMT_51_SCALE,true);
		 localULineChargeAmt51Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkULineChargeAmt51MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,9/*precision*/);
   }
     /**
	 *	refreshULineChargeAmt51 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshULineChargeAmt51() throws CFException {	
   	try { 
		 return (getDecimal(beginULineChargeAmt51,U_LINE_CHARGE_AMT_51_LEN,U_LINE_CHARGE_AMT_51_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("uLineChargeAmt51", beginULineChargeAmt51,U_LINE_CHARGE_AMT_51_LEN);
     }
   	}
        int localULineNotcovAmt51Counter = -1;
        public boolean isULineNotcovAmt51Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localULineNotcovAmt51Counter != sharedCounter;
           localULineNotcovAmt51Counter = sharedCounter; return hasModified; 
        }
	    public boolean uLineNotcovAmt51IsNumeric() {
	      return decimalIsNumeric(beginULineNotcovAmt51,U_LINE_NOTCOV_AMT_51_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] uLineNotcovAmt51String() {
            return getPackedString(beginULineNotcovAmt51,U_LINE_NOTCOV_AMT_51_LEN);
         }
   protected static final int U_LINE_NOTCOV_AMT_51_LEN = 5;
   protected static final int U_LINE_NOTCOV_AMT_51_SCALE = 2;
  	/**
	 * 	serializeULineNotcovAmt51
	 */
	protected void serializeULineNotcovAmt51(BigDecimal uLineNotcovAmt51) {
		   putDecimal(beginULineNotcovAmt51,uLineNotcovAmt51,U_LINE_NOTCOV_AMT_51_LEN,U_LINE_NOTCOV_AMT_51_SCALE,true);
		 localULineNotcovAmt51Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkULineNotcovAmt51MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,9/*precision*/);
   }
     /**
	 *	refreshULineNotcovAmt51 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshULineNotcovAmt51() throws CFException {	
   	try { 
		 return (getDecimal(beginULineNotcovAmt51,U_LINE_NOTCOV_AMT_51_LEN,U_LINE_NOTCOV_AMT_51_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("uLineNotcovAmt51", beginULineNotcovAmt51,U_LINE_NOTCOV_AMT_51_LEN);
     }
   	}
     int localULineRemarkCd51Counter = -1;
     public boolean isULineRemarkCd51Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localULineRemarkCd51Counter != sharedCounter;
         localULineRemarkCd51Counter = sharedCounter; return hasModified;
     }
	protected static final int U_LINE_REMARK_CD_51_LEN = 3;
	/**
	 * 	serialize this ULineRemarkCd51
	 */
   protected void serializeULineRemarkCd51(char[] uLineRemarkCd51) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(uLineRemarkCd51,0,getStringValue(),beginULineRemarkCd51,U_LINE_REMARK_CD_51_LEN);
       localULineRemarkCd51Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkULineRemarkCd51Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshULineRemarkCd51 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshULineRemarkCd51() {	 
   		return (substring(getStringValue(),beginULineRemarkCd51,beginULineRemarkCd51 + U_LINE_REMARK_CD_51_LEN));
   	}
        int localULineAppUnits51Counter = -1;
        public boolean isULineAppUnits51Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localULineAppUnits51Counter != sharedCounter;
           localULineAppUnits51Counter = sharedCounter; return hasModified; 
        }
	    public boolean uLineAppUnits51IsNumeric() {
	      return decimalIsNumeric(beginULineAppUnits51,U_LINE_APP_UNITS_51_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int U_LINE_APP_UNITS_51_LEN = 3;
  	/**
	 * 	serializeULineAppUnits51
	 */
	protected void serializeULineAppUnits51(int uLineAppUnits51) {
		   putDecimal(beginULineAppUnits51,uLineAppUnits51,U_LINE_APP_UNITS_51_LEN,true);
   }
   

   protected int checkULineAppUnits51MaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_100K /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshULineAppUnits51 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshULineAppUnits51() throws CFException {	
   	try { 
		 return (getIntDecimal(beginULineAppUnits51,U_LINE_APP_UNITS_51_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("uLineAppUnits51", beginULineAppUnits51,U_LINE_APP_UNITS_51_LEN);
     }
   	}
     int localULineDiagPointer51Counter = -1;
     public boolean isULineDiagPointer51Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localULineDiagPointer51Counter != sharedCounter;
         localULineDiagPointer51Counter = sharedCounter; return hasModified;
     }
	protected static final int U_LINE_DIAG_POINTER_51_LEN = 8;
	/**
	 * 	serialize this ULineDiagPointer51
	 */
   protected void serializeULineDiagPointer51(char[] uLineDiagPointer51) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(uLineDiagPointer51,0,getStringValue(),beginULineDiagPointer51,U_LINE_DIAG_POINTER_51_LEN);
       localULineDiagPointer51Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkULineDiagPointer51Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshULineDiagPointer51 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshULineDiagPointer51() {	 
   		return (substring(getStringValue(),beginULineDiagPointer51,beginULineDiagPointer51 + U_LINE_DIAG_POINTER_51_LEN));
   	}




}
  
