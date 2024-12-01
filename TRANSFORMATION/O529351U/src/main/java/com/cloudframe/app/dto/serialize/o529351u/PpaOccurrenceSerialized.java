package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class PpaOccurrenceSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class PpaOccurrenceSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(PpaOccurrenceSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PPA_OCCURRENCE_LENGTH = 28;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPpaProduct;
            protected  int beginPpaMarketType;
            protected  int beginPpaMarket;
            protected  int beginPpaIpa;
            protected  int beginPpaGrpTabNo;
            protected  int beginPpaContractArrange;
            protected  int beginPpaFirstEffDate;
            protected  int beginPpaLastCanDate;
            protected  int beginPpaFacContr;
	
	/**
	* Constructor for PpaOccurrenceSerialized
	**/
    public PpaOccurrenceSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for PpaOccurrenceSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PpaOccurrenceSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this PpaOccurrenceSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,11981); // serialize this field at offset 11981 by default 
    }
    
	/**
	* sets parent for this PpaOccurrenceSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 11981 by default
    }    
	/**
	* initializes the field in PpaOccurrenceSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PPA_OCCURRENCE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPpaProduct = getStartOffset() + 0;	// set offset for serialization
  
             beginPpaMarketType = getStartOffset() + 3;	// set offset for serialization
  
             beginPpaMarket = getStartOffset() + 5;	// set offset for serialization
  
             beginPpaIpa = getStartOffset() + 9;	// set offset for serialization
  
             beginPpaGrpTabNo = getStartOffset() + 12;	// set offset for serialization
  
             beginPpaContractArrange = getStartOffset() + 16;	// set offset for serialization
  
             beginPpaFirstEffDate = getStartOffset() + 17;	// set offset for serialization
  
             beginPpaLastCanDate = getStartOffset() + 22;	// set offset for serialization
  
             beginPpaFacContr = getStartOffset() + 27;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localPpaProductCounter = -1;
     public boolean isPpaProductModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPpaProductCounter != sharedCounter;
         localPpaProductCounter = sharedCounter; return hasModified;
     }
	protected static final int PPA_PRODUCT_LEN = 3;
	/**
	 * 	serialize this PpaProduct
	 */
   protected void serializePpaProduct(char[] ppaProduct) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ppaProduct,0,getStringValue(),beginPpaProduct,PPA_PRODUCT_LEN);
       localPpaProductCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPpaProductConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshPpaProduct is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPpaProduct() {	 
   		return (substring(getStringValue(),beginPpaProduct,beginPpaProduct + PPA_PRODUCT_LEN));
   	}
        int localPpaMarketTypeCounter = -1;
        public boolean isPpaMarketTypeModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localPpaMarketTypeCounter != sharedCounter;
           localPpaMarketTypeCounter = sharedCounter; return hasModified; 
        }
	    public boolean ppaMarketTypeIsNumeric() {
	      return decimalIsNumeric(beginPpaMarketType,PPA_MARKET_TYPE_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int PPA_MARKET_TYPE_LEN = 2;
  	/**
	 * 	serializePpaMarketType
	 */
	protected void serializePpaMarketType(short ppaMarketType) {
		   putDecimal(beginPpaMarketType,ppaMarketType,PPA_MARKET_TYPE_LEN,true);
   }
   

   protected short checkPpaMarketTypeMaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_100 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshPpaMarketType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshPpaMarketType() throws CFException {	
   	try { 
		 return (getShortDecimal(beginPpaMarketType,PPA_MARKET_TYPE_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("ppaMarketType", beginPpaMarketType,PPA_MARKET_TYPE_LEN);
     }
   	}
        int localPpaMarketCounter = -1;
        public boolean isPpaMarketModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localPpaMarketCounter != sharedCounter;
           localPpaMarketCounter = sharedCounter; return hasModified; 
        }
	    public boolean ppaMarketIsNumeric() {
	      return decimalIsNumeric(beginPpaMarket,PPA_MARKET_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int PPA_MARKET_LEN = 4;
  	/**
	 * 	serializePpaMarket
	 */
	protected void serializePpaMarket(int ppaMarket) {
		   putDecimal(beginPpaMarket,ppaMarket,PPA_MARKET_LEN,true);
   }
   

   protected int checkPpaMarketMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_10M /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshPpaMarket is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPpaMarket() throws CFException {	
   	try { 
		 return (getIntDecimal(beginPpaMarket,PPA_MARKET_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("ppaMarket", beginPpaMarket,PPA_MARKET_LEN);
     }
   	}
        int localPpaIpaCounter = -1;
        public boolean isPpaIpaModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localPpaIpaCounter != sharedCounter;
           localPpaIpaCounter = sharedCounter; return hasModified; 
        }
	    public boolean ppaIpaIsNumeric() {
	      return decimalIsNumeric(beginPpaIpa,PPA_IPA_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int PPA_IPA_LEN = 3;
  	/**
	 * 	serializePpaIpa
	 */
	protected void serializePpaIpa(int ppaIpa) {
		   putDecimal(beginPpaIpa,ppaIpa,PPA_IPA_LEN,true);
   }
   

   protected int checkPpaIpaMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_100K /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshPpaIpa is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPpaIpa() throws CFException {	
   	try { 
		 return (getIntDecimal(beginPpaIpa,PPA_IPA_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("ppaIpa", beginPpaIpa,PPA_IPA_LEN);
     }
   	}
     int localPpaGrpTabNoCounter = -1;
     public boolean isPpaGrpTabNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPpaGrpTabNoCounter != sharedCounter;
         localPpaGrpTabNoCounter = sharedCounter; return hasModified;
     }
	protected static final int PPA_GRP_TAB_NO_LEN = 4;
	/**
	 * 	serialize this PpaGrpTabNo
	 */
   protected void serializePpaGrpTabNo(char[] ppaGrpTabNo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ppaGrpTabNo,0,getStringValue(),beginPpaGrpTabNo,PPA_GRP_TAB_NO_LEN);
       localPpaGrpTabNoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPpaGrpTabNoConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshPpaGrpTabNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPpaGrpTabNo() {	 
   		return (substring(getStringValue(),beginPpaGrpTabNo,beginPpaGrpTabNo + PPA_GRP_TAB_NO_LEN));
   	}
     int localPpaContractArrangeCounter = -1;
     public boolean isPpaContractArrangeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPpaContractArrangeCounter != sharedCounter;
         localPpaContractArrangeCounter = sharedCounter; return hasModified;
     }
	protected static final int PPA_CONTRACT_ARRANGE_LEN = 1;
	/**
	 * 	serialize this PpaContractArrange
	 */
   protected void serializePpaContractArrange(char[] ppaContractArrange) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ppaContractArrange,0,getStringValue(),beginPpaContractArrange,PPA_CONTRACT_ARRANGE_LEN);
       localPpaContractArrangeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPpaContractArrangeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshPpaContractArrange is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPpaContractArrange() {	 
   		return (substring(getStringValue(),beginPpaContractArrange,beginPpaContractArrange + PPA_CONTRACT_ARRANGE_LEN));
   	}
        int localPpaFirstEffDateCounter = -1;
        public boolean isPpaFirstEffDateModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localPpaFirstEffDateCounter != sharedCounter;
           localPpaFirstEffDateCounter = sharedCounter; return hasModified; 
        }
	    public boolean ppaFirstEffDateIsNumeric() {
	      return decimalIsNumeric(beginPpaFirstEffDate,PPA_FIRST_EFF_DATE_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int PPA_FIRST_EFF_DATE_LEN = 5;
  	/**
	 * 	serializePpaFirstEffDate
	 */
	protected void serializePpaFirstEffDate(int ppaFirstEffDate) {
		   putDecimal(beginPpaFirstEffDate,ppaFirstEffDate,PPA_FIRST_EFF_DATE_LEN,true);
   }
   

   protected int checkPpaFirstEffDateMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshPpaFirstEffDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPpaFirstEffDate() throws CFException {	
   	try { 
		 return (getIntDecimal(beginPpaFirstEffDate,PPA_FIRST_EFF_DATE_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("ppaFirstEffDate", beginPpaFirstEffDate,PPA_FIRST_EFF_DATE_LEN);
     }
   	}
        int localPpaLastCanDateCounter = -1;
        public boolean isPpaLastCanDateModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localPpaLastCanDateCounter != sharedCounter;
           localPpaLastCanDateCounter = sharedCounter; return hasModified; 
        }
	    public boolean ppaLastCanDateIsNumeric() {
	      return decimalIsNumeric(beginPpaLastCanDate,PPA_LAST_CAN_DATE_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int PPA_LAST_CAN_DATE_LEN = 5;
  	/**
	 * 	serializePpaLastCanDate
	 */
	protected void serializePpaLastCanDate(int ppaLastCanDate) {
		   putDecimal(beginPpaLastCanDate,ppaLastCanDate,PPA_LAST_CAN_DATE_LEN,true);
   }
   

   protected int checkPpaLastCanDateMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshPpaLastCanDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPpaLastCanDate() throws CFException {	
   	try { 
		 return (getIntDecimal(beginPpaLastCanDate,PPA_LAST_CAN_DATE_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("ppaLastCanDate", beginPpaLastCanDate,PPA_LAST_CAN_DATE_LEN);
     }
   	}
     int localPpaFacContrCounter = -1;
     public boolean isPpaFacContrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPpaFacContrCounter != sharedCounter;
         localPpaFacContrCounter = sharedCounter; return hasModified;
     }
	protected static final int PPA_FAC_CONTR_LEN = 1;
	/**
	 * 	serialize this PpaFacContr
	 */
   protected void serializePpaFacContr(char[] ppaFacContr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ppaFacContr,0,getStringValue(),beginPpaFacContr,PPA_FAC_CONTR_LEN);
       localPpaFacContrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPpaFacContrConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshPpaFacContr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPpaFacContr() {	 
   		return (substring(getStringValue(),beginPpaFacContr,beginPpaFacContr + PPA_FAC_CONTR_LEN));
   	}




}
  
