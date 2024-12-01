package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class PlanVarRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class PlanVarRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(PlanVarRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PLAN_VAR_REC_LENGTH = 20;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFesaPolicy01;
            protected  int beginFesaPlanVar01;
            protected  int beginFesaEffDate01;
            protected  int beginFesaSpiNbr01;
            protected  int beginFesaPosTierCd;
            protected  int beginFesaSpiPriDiagInd;
            protected  int beginFesaSpiDiagElgInd;
	
	/**
	* Constructor for PlanVarRecSerialized
	**/
    public PlanVarRecSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for PlanVarRecSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PlanVarRecSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this PlanVarRecSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,4); // serialize this field at offset 4 by default 
    }
    
	/**
	* sets parent for this PlanVarRecSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 4 by default
    }    
	/**
	* initializes the field in PlanVarRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PLAN_VAR_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFesaPolicy01 = getStartOffset() + 0;	// set offset for serialization
  
             beginFesaPlanVar01 = getStartOffset() + 6;	// set offset for serialization
  
             beginFesaEffDate01 = getStartOffset() + 9;	// set offset for serialization
  
             beginFesaSpiNbr01 = getStartOffset() + 13;	// set offset for serialization
  
             beginFesaPosTierCd = getStartOffset() + 17;	// set offset for serialization
  
             beginFesaSpiPriDiagInd = getStartOffset() + 18;	// set offset for serialization
  
             beginFesaSpiDiagElgInd = getStartOffset() + 19;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFesaPolicy01Counter = -1;
     public boolean isFesaPolicy01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFesaPolicy01Counter != sharedCounter;
         localFesaPolicy01Counter = sharedCounter; return hasModified;
     }
	protected static final int FESA_POLICY_01_LEN = 6;
	/**
	 * 	serialize this FesaPolicy01
	 */
   protected void serializeFesaPolicy01(char[] fesaPolicy01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fesaPolicy01,0,getStringValue(),beginFesaPolicy01,FESA_POLICY_01_LEN);
       localFesaPolicy01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFesaPolicy01Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshFesaPolicy01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFesaPolicy01() {	 
   		return (substring(getStringValue(),beginFesaPolicy01,beginFesaPolicy01 + FESA_POLICY_01_LEN));
   	}
        int localFesaPlanVar01Counter = -1;
        public boolean isFesaPlanVar01Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localFesaPlanVar01Counter != sharedCounter;
           localFesaPlanVar01Counter = sharedCounter; return hasModified; 
        }
	    public boolean fesaPlanVar01IsNumeric() {
	      return decimalIsNumeric(beginFesaPlanVar01,FESA_PLAN_VAR_01_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int FESA_PLAN_VAR_01_LEN = 3;
  	/**
	 * 	serializeFesaPlanVar01
	 */
	protected void serializeFesaPlanVar01(int fesaPlanVar01) {
		   putDecimal(beginFesaPlanVar01,fesaPlanVar01,FESA_PLAN_VAR_01_LEN,true);
   }
   

   protected int checkFesaPlanVar01MaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_100K /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshFesaPlanVar01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFesaPlanVar01() throws CFException {	
   	try { 
		 return (getIntDecimal(beginFesaPlanVar01,FESA_PLAN_VAR_01_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("fesaPlanVar01", beginFesaPlanVar01,FESA_PLAN_VAR_01_LEN);
     }
   	}
        int localFesaEffDate01Counter = -1;
        public boolean isFesaEffDate01Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localFesaEffDate01Counter != sharedCounter;
           localFesaEffDate01Counter = sharedCounter; return hasModified; 
        }
	    public boolean fesaEffDate01IsNumeric() {
	      return decimalIsNumeric(beginFesaEffDate01,FESA_EFF_DATE_01_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int FESA_EFF_DATE_01_LEN = 4;
  	/**
	 * 	serializeFesaEffDate01
	 */
	protected void serializeFesaEffDate01(int fesaEffDate01) {
		   putDecimal(beginFesaEffDate01,fesaEffDate01,FESA_EFF_DATE_01_LEN,true);
   }
   

   protected int checkFesaEffDate01MaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_10M /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshFesaEffDate01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFesaEffDate01() throws CFException {	
   	try { 
		 return (getIntDecimal(beginFesaEffDate01,FESA_EFF_DATE_01_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("fesaEffDate01", beginFesaEffDate01,FESA_EFF_DATE_01_LEN);
     }
   	}
        int localFesaSpiNbr01Counter = -1;
        public boolean isFesaSpiNbr01Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localFesaSpiNbr01Counter != sharedCounter;
           localFesaSpiNbr01Counter = sharedCounter; return hasModified; 
        }
	    public boolean fesaSpiNbr01IsNumeric() {
	      return decimalIsNumeric(beginFesaSpiNbr01,FESA_SPI_NBR_01_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int FESA_SPI_NBR_01_LEN = 4;
  	/**
	 * 	serializeFesaSpiNbr01
	 */
	protected void serializeFesaSpiNbr01(int fesaSpiNbr01) {
		   putDecimal(beginFesaSpiNbr01,fesaSpiNbr01,FESA_SPI_NBR_01_LEN,true);
   }
   

   protected int checkFesaSpiNbr01MaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_10M /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshFesaSpiNbr01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFesaSpiNbr01() throws CFException {	
   	try { 
		 return (getIntDecimal(beginFesaSpiNbr01,FESA_SPI_NBR_01_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("fesaSpiNbr01", beginFesaSpiNbr01,FESA_SPI_NBR_01_LEN);
     }
   	}
     int localFesaPosTierCdCounter = -1;
     public boolean isFesaPosTierCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFesaPosTierCdCounter != sharedCounter;
         localFesaPosTierCdCounter = sharedCounter; return hasModified;
     }
	protected static final int FESA_POS_TIER_CD_LEN = 1;
	/**
	 * 	serialize this FesaPosTierCd
	 */
   protected void serializeFesaPosTierCd(char[] fesaPosTierCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fesaPosTierCd,0,getStringValue(),beginFesaPosTierCd,FESA_POS_TIER_CD_LEN);
       localFesaPosTierCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFesaPosTierCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFesaPosTierCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFesaPosTierCd() {	 
   		return (substring(getStringValue(),beginFesaPosTierCd,beginFesaPosTierCd + FESA_POS_TIER_CD_LEN));
   	}
     int localFesaSpiPriDiagIndCounter = -1;
     public boolean isFesaSpiPriDiagIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFesaSpiPriDiagIndCounter != sharedCounter;
         localFesaSpiPriDiagIndCounter = sharedCounter; return hasModified;
     }
	protected static final int FESA_SPI_PRI_DIAG_IND_LEN = 1;
	/**
	 * 	serialize this FesaSpiPriDiagInd
	 */
   protected void serializeFesaSpiPriDiagInd(char[] fesaSpiPriDiagInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fesaSpiPriDiagInd,0,getStringValue(),beginFesaSpiPriDiagInd,FESA_SPI_PRI_DIAG_IND_LEN);
       localFesaSpiPriDiagIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFesaSpiPriDiagIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFesaSpiPriDiagInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFesaSpiPriDiagInd() {	 
   		return (substring(getStringValue(),beginFesaSpiPriDiagInd,beginFesaSpiPriDiagInd + FESA_SPI_PRI_DIAG_IND_LEN));
   	}
     int localFesaSpiDiagElgIndCounter = -1;
     public boolean isFesaSpiDiagElgIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFesaSpiDiagElgIndCounter != sharedCounter;
         localFesaSpiDiagElgIndCounter = sharedCounter; return hasModified;
     }
	protected static final int FESA_SPI_DIAG_ELG_IND_LEN = 1;
	/**
	 * 	serialize this FesaSpiDiagElgInd
	 */
   protected void serializeFesaSpiDiagElgInd(char[] fesaSpiDiagElgInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fesaSpiDiagElgInd,0,getStringValue(),beginFesaSpiDiagElgInd,FESA_SPI_DIAG_ELG_IND_LEN);
       localFesaSpiDiagElgIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFesaSpiDiagElgIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFesaSpiDiagElgInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFesaSpiDiagElgInd() {	 
   		return (substring(getStringValue(),beginFesaSpiDiagElgInd,beginFesaSpiDiagElgInd + FESA_SPI_DIAG_ELG_IND_LEN));
   	}




}
  
