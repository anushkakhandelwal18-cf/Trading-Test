package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class UOutLineData51Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class UOutLineData51Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(UOutLineData51Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int U_OUT_LINE_DATA_51_LENGTH = 40;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginUOutLinePos51;
            protected  int beginUOutLineServiceCode51;
            protected  int beginUOutLineDosDate51;
            protected  int beginUOutLineChargeAmt51;
            protected  int beginUOutLineNotcovAmt51;
            protected  int beginUOutLineRemarkCd51;
            protected  int beginUOutLinePlanVar51;
            protected  int beginUOutLineCauseCd51;
            protected  int beginUOutLineAppUnits51;
            protected  int beginUOutSpiTblId51;
            protected  int beginUOutPosTierCd51;
            protected  int beginUOutDiagElgInd51;
	
	/**
	* Constructor for UOutLineData51Serialized
	**/
    public UOutLineData51Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for UOutLineData51Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public UOutLineData51Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this UOutLineData51Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,7130); // serialize this field at offset 7130 by default 
    }
    
	/**
	* sets parent for this UOutLineData51Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 7130 by default
    }    
	/**
	* initializes the field in UOutLineData51Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(U_OUT_LINE_DATA_51_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginUOutLinePos51 = getStartOffset() + 0;	// set offset for serialization
  
             beginUOutLineServiceCode51 = getStartOffset() + 2;	// set offset for serialization
  
             beginUOutLineDosDate51 = getStartOffset() + 8;	// set offset for serialization
  
             beginUOutLineChargeAmt51 = getStartOffset() + 12;	// set offset for serialization
  
             beginUOutLineNotcovAmt51 = getStartOffset() + 17;	// set offset for serialization
  
             beginUOutLineRemarkCd51 = getStartOffset() + 22;	// set offset for serialization
  
             beginUOutLinePlanVar51 = getStartOffset() + 25;	// set offset for serialization
  
             beginUOutLineCauseCd51 = getStartOffset() + 27;	// set offset for serialization
  
             beginUOutLineAppUnits51 = getStartOffset() + 28;	// set offset for serialization
  
             beginUOutSpiTblId51 = getStartOffset() + 31;	// set offset for serialization
  
             beginUOutPosTierCd51 = getStartOffset() + 38;	// set offset for serialization
  
             beginUOutDiagElgInd51 = getStartOffset() + 39;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localUOutLinePos51Counter = -1;
     public boolean isUOutLinePos51Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUOutLinePos51Counter != sharedCounter;
         localUOutLinePos51Counter = sharedCounter; return hasModified;
     }
	protected static final int U_OUT_LINE_POS_51_LEN = 2;
	/**
	 * 	serialize this UOutLinePos51
	 */
   protected void serializeUOutLinePos51(char[] uOutLinePos51) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(uOutLinePos51,0,getStringValue(),beginUOutLinePos51,U_OUT_LINE_POS_51_LEN);
       localUOutLinePos51Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkUOutLinePos51Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshUOutLinePos51 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshUOutLinePos51() {	 
   		return (substring(getStringValue(),beginUOutLinePos51,beginUOutLinePos51 + U_OUT_LINE_POS_51_LEN));
   	}
     int localUOutLineServiceCode51Counter = -1;
     public boolean isUOutLineServiceCode51Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUOutLineServiceCode51Counter != sharedCounter;
         localUOutLineServiceCode51Counter = sharedCounter; return hasModified;
     }
	protected static final int U_OUT_LINE_SERVICE_CODE_51_LEN = 6;
	/**
	 * 	serialize this UOutLineServiceCode51
	 */
   protected void serializeUOutLineServiceCode51(char[] uOutLineServiceCode51) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(uOutLineServiceCode51,0,getStringValue(),beginUOutLineServiceCode51,U_OUT_LINE_SERVICE_CODE_51_LEN);
       localUOutLineServiceCode51Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkUOutLineServiceCode51Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshUOutLineServiceCode51 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshUOutLineServiceCode51() {	 
   		return (substring(getStringValue(),beginUOutLineServiceCode51,beginUOutLineServiceCode51 + U_OUT_LINE_SERVICE_CODE_51_LEN));
   	}
        int localUOutLineDosDate51Counter = -1;
        public boolean isUOutLineDosDate51Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localUOutLineDosDate51Counter != sharedCounter;
           localUOutLineDosDate51Counter = sharedCounter; return hasModified; 
        }
	    public boolean uOutLineDosDate51IsNumeric() {
	      return decimalIsNumeric(beginUOutLineDosDate51,U_OUT_LINE_DOS_DATE_51_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int U_OUT_LINE_DOS_DATE_51_LEN = 4;
  	/**
	 * 	serializeUOutLineDosDate51
	 */
	protected void serializeUOutLineDosDate51(int uOutLineDosDate51) {
		   putDecimal(beginUOutLineDosDate51,uOutLineDosDate51,U_OUT_LINE_DOS_DATE_51_LEN,true);
   }
   

   protected int checkUOutLineDosDate51MaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_10M /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshUOutLineDosDate51 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshUOutLineDosDate51() throws CFException {	
   	try { 
		 return (getIntDecimal(beginUOutLineDosDate51,U_OUT_LINE_DOS_DATE_51_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("uOutLineDosDate51", beginUOutLineDosDate51,U_OUT_LINE_DOS_DATE_51_LEN);
     }
   	}
        int localUOutLineChargeAmt51Counter = -1;
        public boolean isUOutLineChargeAmt51Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localUOutLineChargeAmt51Counter != sharedCounter;
           localUOutLineChargeAmt51Counter = sharedCounter; return hasModified; 
        }
	    public boolean uOutLineChargeAmt51IsNumeric() {
	      return decimalIsNumeric(beginUOutLineChargeAmt51,U_OUT_LINE_CHARGE_AMT_51_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] uOutLineChargeAmt51String() {
            return getPackedString(beginUOutLineChargeAmt51,U_OUT_LINE_CHARGE_AMT_51_LEN);
         }
   protected static final int U_OUT_LINE_CHARGE_AMT_51_LEN = 5;
   protected static final int U_OUT_LINE_CHARGE_AMT_51_SCALE = 2;
  	/**
	 * 	serializeUOutLineChargeAmt51
	 */
	protected void serializeUOutLineChargeAmt51(BigDecimal uOutLineChargeAmt51) {
		   putDecimal(beginUOutLineChargeAmt51,uOutLineChargeAmt51,U_OUT_LINE_CHARGE_AMT_51_LEN,U_OUT_LINE_CHARGE_AMT_51_SCALE,true);
		 localUOutLineChargeAmt51Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkUOutLineChargeAmt51MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,9/*precision*/);
   }
     /**
	 *	refreshUOutLineChargeAmt51 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshUOutLineChargeAmt51() throws CFException {	
   	try { 
		 return (getDecimal(beginUOutLineChargeAmt51,U_OUT_LINE_CHARGE_AMT_51_LEN,U_OUT_LINE_CHARGE_AMT_51_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("uOutLineChargeAmt51", beginUOutLineChargeAmt51,U_OUT_LINE_CHARGE_AMT_51_LEN);
     }
   	}
        int localUOutLineNotcovAmt51Counter = -1;
        public boolean isUOutLineNotcovAmt51Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localUOutLineNotcovAmt51Counter != sharedCounter;
           localUOutLineNotcovAmt51Counter = sharedCounter; return hasModified; 
        }
	    public boolean uOutLineNotcovAmt51IsNumeric() {
	      return decimalIsNumeric(beginUOutLineNotcovAmt51,U_OUT_LINE_NOTCOV_AMT_51_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] uOutLineNotcovAmt51String() {
            return getPackedString(beginUOutLineNotcovAmt51,U_OUT_LINE_NOTCOV_AMT_51_LEN);
         }
   protected static final int U_OUT_LINE_NOTCOV_AMT_51_LEN = 5;
   protected static final int U_OUT_LINE_NOTCOV_AMT_51_SCALE = 2;
  	/**
	 * 	serializeUOutLineNotcovAmt51
	 */
	protected void serializeUOutLineNotcovAmt51(BigDecimal uOutLineNotcovAmt51) {
		   putDecimal(beginUOutLineNotcovAmt51,uOutLineNotcovAmt51,U_OUT_LINE_NOTCOV_AMT_51_LEN,U_OUT_LINE_NOTCOV_AMT_51_SCALE,true);
		 localUOutLineNotcovAmt51Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkUOutLineNotcovAmt51MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,9/*precision*/);
   }
     /**
	 *	refreshUOutLineNotcovAmt51 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshUOutLineNotcovAmt51() throws CFException {	
   	try { 
		 return (getDecimal(beginUOutLineNotcovAmt51,U_OUT_LINE_NOTCOV_AMT_51_LEN,U_OUT_LINE_NOTCOV_AMT_51_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("uOutLineNotcovAmt51", beginUOutLineNotcovAmt51,U_OUT_LINE_NOTCOV_AMT_51_LEN);
     }
   	}
     int localUOutLineRemarkCd51Counter = -1;
     public boolean isUOutLineRemarkCd51Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUOutLineRemarkCd51Counter != sharedCounter;
         localUOutLineRemarkCd51Counter = sharedCounter; return hasModified;
     }
	protected static final int U_OUT_LINE_REMARK_CD_51_LEN = 3;
	/**
	 * 	serialize this UOutLineRemarkCd51
	 */
   protected void serializeUOutLineRemarkCd51(char[] uOutLineRemarkCd51) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(uOutLineRemarkCd51,0,getStringValue(),beginUOutLineRemarkCd51,U_OUT_LINE_REMARK_CD_51_LEN);
       localUOutLineRemarkCd51Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkUOutLineRemarkCd51Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshUOutLineRemarkCd51 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshUOutLineRemarkCd51() {	 
   		return (substring(getStringValue(),beginUOutLineRemarkCd51,beginUOutLineRemarkCd51 + U_OUT_LINE_REMARK_CD_51_LEN));
   	}
         int localUOutLinePlanVar51Counter = -1;
         public boolean isUOutLinePlanVar51Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localUOutLinePlanVar51Counter != sharedCounter;
            localUOutLinePlanVar51Counter = sharedCounter; return hasModified; 
         }
   protected static final int U_OUT_LINE_PLAN_VAR_51_LEN = 2;
  	/**
	 * serializeUOutLinePlanVar51
	 */
	protected void serializeUOutLinePlanVar51(short uOutLinePlanVar51) {
           replaceValue( //  save the value as string
                   getBinaryString( uOutLinePlanVar51,U_OUT_LINE_PLAN_VAR_51_LEN)
                  ,beginUOutLinePlanVar51
                  ,U_OUT_LINE_PLAN_VAR_51_LEN
                 );
            localUOutLinePlanVar51Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkUOutLinePlanVar51MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshUOutLinePlanVar51 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshUOutLinePlanVar51() {	 
			return (getShort(beginUOutLinePlanVar51));
   	}
     int localUOutLineCauseCd51Counter = -1;
     public boolean isUOutLineCauseCd51Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUOutLineCauseCd51Counter != sharedCounter;
         localUOutLineCauseCd51Counter = sharedCounter; return hasModified;
     }
	protected static final int U_OUT_LINE_CAUSE_CD_51_LEN = 1;
	/**
	 * 	serialize this UOutLineCauseCd51
	 */
   protected void serializeUOutLineCauseCd51(char[] uOutLineCauseCd51) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(uOutLineCauseCd51,0,getStringValue(),beginUOutLineCauseCd51,U_OUT_LINE_CAUSE_CD_51_LEN);
       localUOutLineCauseCd51Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkUOutLineCauseCd51Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshUOutLineCauseCd51 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshUOutLineCauseCd51() {	 
   		return (substring(getStringValue(),beginUOutLineCauseCd51,beginUOutLineCauseCd51 + U_OUT_LINE_CAUSE_CD_51_LEN));
   	}
        int localUOutLineAppUnits51Counter = -1;
        public boolean isUOutLineAppUnits51Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localUOutLineAppUnits51Counter != sharedCounter;
           localUOutLineAppUnits51Counter = sharedCounter; return hasModified; 
        }
	    public boolean uOutLineAppUnits51IsNumeric() {
	      return decimalIsNumeric(beginUOutLineAppUnits51,U_OUT_LINE_APP_UNITS_51_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int U_OUT_LINE_APP_UNITS_51_LEN = 3;
  	/**
	 * 	serializeUOutLineAppUnits51
	 */
	protected void serializeUOutLineAppUnits51(int uOutLineAppUnits51) {
		   putDecimal(beginUOutLineAppUnits51,uOutLineAppUnits51,U_OUT_LINE_APP_UNITS_51_LEN,true);
   }
   

   protected int checkUOutLineAppUnits51MaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_100K /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshUOutLineAppUnits51 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshUOutLineAppUnits51() throws CFException {	
   	try { 
		 return (getIntDecimal(beginUOutLineAppUnits51,U_OUT_LINE_APP_UNITS_51_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("uOutLineAppUnits51", beginUOutLineAppUnits51,U_OUT_LINE_APP_UNITS_51_LEN);
     }
   	}
     int localUOutSpiTblId51Counter = -1;
     public boolean isUOutSpiTblId51Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUOutSpiTblId51Counter != sharedCounter;
         localUOutSpiTblId51Counter = sharedCounter; return hasModified;
     }
	protected static final int U_OUT_SPI_TBL_ID_51_LEN = 7;
	/**
	 * 	serialize this UOutSpiTblId51
	 */
   protected void serializeUOutSpiTblId51(char[] uOutSpiTblId51) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(uOutSpiTblId51,0,getStringValue(),beginUOutSpiTblId51,U_OUT_SPI_TBL_ID_51_LEN);
       localUOutSpiTblId51Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkUOutSpiTblId51Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshUOutSpiTblId51 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshUOutSpiTblId51() {	 
   		return (substring(getStringValue(),beginUOutSpiTblId51,beginUOutSpiTblId51 + U_OUT_SPI_TBL_ID_51_LEN));
   	}
     int localUOutPosTierCd51Counter = -1;
     public boolean isUOutPosTierCd51Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUOutPosTierCd51Counter != sharedCounter;
         localUOutPosTierCd51Counter = sharedCounter; return hasModified;
     }
	protected static final int U_OUT_POS_TIER_CD_51_LEN = 1;
	/**
	 * 	serialize this UOutPosTierCd51
	 */
   protected void serializeUOutPosTierCd51(char[] uOutPosTierCd51) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(uOutPosTierCd51,0,getStringValue(),beginUOutPosTierCd51,U_OUT_POS_TIER_CD_51_LEN);
       localUOutPosTierCd51Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkUOutPosTierCd51Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshUOutPosTierCd51 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshUOutPosTierCd51() {	 
   		return (substring(getStringValue(),beginUOutPosTierCd51,beginUOutPosTierCd51 + U_OUT_POS_TIER_CD_51_LEN));
   	}
     int localUOutDiagElgInd51Counter = -1;
     public boolean isUOutDiagElgInd51Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUOutDiagElgInd51Counter != sharedCounter;
         localUOutDiagElgInd51Counter = sharedCounter; return hasModified;
     }
	protected static final int U_OUT_DIAG_ELG_IND_51_LEN = 1;
	/**
	 * 	serialize this UOutDiagElgInd51
	 */
   protected void serializeUOutDiagElgInd51(char[] uOutDiagElgInd51) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(uOutDiagElgInd51,0,getStringValue(),beginUOutDiagElgInd51,U_OUT_DIAG_ELG_IND_51_LEN);
       localUOutDiagElgInd51Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkUOutDiagElgInd51Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshUOutDiagElgInd51 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshUOutDiagElgInd51() {	 
   		return (substring(getStringValue(),beginUOutDiagElgInd51,beginUOutDiagElgInd51 + U_OUT_DIAG_ELG_IND_51_LEN));
   	}




}
  
