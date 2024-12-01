package com.cloudframe.app.dto.serialize.o529351u;

/**
*  The class XrefRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-12-01 at 05:44. using version 5.0.0.161
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class XrefRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(XrefRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int XREF_RECORD_LENGTH = 2340;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginXrfAdjstrNum;
           protected int beginXrfCmData;
           protected static final int XRF_CM_DATA_SIZE = 9;
            protected  int beginXrfBankAcctEe;
            protected  int beginXrfRegionIndEe;
           protected int beginXrfPrsInd;
           protected static final int XRF_PRS_IND_SIZE = 9;
            protected  int beginXrfPortDate;
            protected  int beginXrfLcaInd;
            protected  int beginXrfSourceSysInd;
	
	/**
	* Constructor for XrefRecordSerialized
	**/
    public XrefRecordSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for XrefRecordSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public XrefRecordSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this XrefRecordSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this XrefRecordSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in XrefRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(XREF_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginXrfAdjstrNum = getStartOffset() + 12;	// set offset for serialization
  
	        beginXrfCmData = getStartOffset() + 16; // set offset for serialization
  
             beginXrfBankAcctEe = getStartOffset() + 2284;	// set offset for serialization
  
             beginXrfRegionIndEe = getStartOffset() + 2286;	// set offset for serialization
  
	        beginXrfPrsInd = getStartOffset() + 2287; // set offset for serialization
  
  
             beginXrfPortDate = getStartOffset() + 2304;	// set offset for serialization
  
             beginXrfLcaInd = getStartOffset() + 2307;	// set offset for serialization
  
             beginXrfSourceSysInd = getStartOffset() + 2308;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localXrfAdjstrNumCounter = -1;
         public boolean isXrfAdjstrNumModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localXrfAdjstrNumCounter != sharedCounter;
            localXrfAdjstrNumCounter = sharedCounter; return hasModified; 
         }
   protected static final int XRF_ADJSTR_NUM_LEN = 4;
  	/**
	 * serializeXrfAdjstrNum
	 */
	protected void serializeXrfAdjstrNum(int xrfAdjstrNum) {
           replaceValue( //  save the value as string
                   getBinaryString( xrfAdjstrNum,XRF_ADJSTR_NUM_LEN)
                  ,beginXrfAdjstrNum
                  ,XRF_ADJSTR_NUM_LEN
                 );
            localXrfAdjstrNumCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkXrfAdjstrNumMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshXrfAdjstrNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshXrfAdjstrNum() {	 
			return (getInt(beginXrfAdjstrNum));
   	}
 
   
  protected  static final int XRF_CM_DATA_LEN = 252;
   /**
	 *	serializeXrfCmData as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeXrfCmData(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginXrfCmData + index*XRF_CM_DATA_LEN)
   	          , XRF_CM_DATA_LEN 
   	          );
   }
        int localXrfBankAcctEeCounter = -1;
        public boolean isXrfBankAcctEeModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localXrfBankAcctEeCounter != sharedCounter;
           localXrfBankAcctEeCounter = sharedCounter; return hasModified; 
        }
	    public boolean xrfBankAcctEeIsNumeric() {
	      return decimalIsNumeric(beginXrfBankAcctEe,XRF_BANK_ACCT_EE_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int XRF_BANK_ACCT_EE_LEN = 2;
  	/**
	 * 	serializeXrfBankAcctEe
	 */
	protected void serializeXrfBankAcctEe(short xrfBankAcctEe) {
		   putDecimal(beginXrfBankAcctEe,xrfBankAcctEe,XRF_BANK_ACCT_EE_LEN,true);
   }
   

   protected short checkXrfBankAcctEeMaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshXrfBankAcctEe is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshXrfBankAcctEe() throws CFException {	
   	try { 
		 return (getShortDecimal(beginXrfBankAcctEe,XRF_BANK_ACCT_EE_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("xrfBankAcctEe", beginXrfBankAcctEe,XRF_BANK_ACCT_EE_LEN);
     }
   	}
     int localXrfRegionIndEeCounter = -1;
     public boolean isXrfRegionIndEeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfRegionIndEeCounter != sharedCounter;
         localXrfRegionIndEeCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_REGION_IND_EE_LEN = 1;
	/**
	 * 	serialize this XrfRegionIndEe
	 */
   protected void serializeXrfRegionIndEe(char[] xrfRegionIndEe) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfRegionIndEe,0,getStringValue(),beginXrfRegionIndEe,XRF_REGION_IND_EE_LEN);
       localXrfRegionIndEeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfRegionIndEeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshXrfRegionIndEe is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfRegionIndEe() {	 
   		return (substring(getStringValue(),beginXrfRegionIndEe,beginXrfRegionIndEe + XRF_REGION_IND_EE_LEN));
   	}
 
   
  protected  static final int XRF_PRS_IND_LEN = 1;
   /**
	 *	serializeXrfPrsInd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeXrfPrsInd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginXrfPrsInd + index*XRF_PRS_IND_LEN)
   	          , XRF_PRS_IND_LEN 
   	          );
   }
        int localXrfPortDateCounter = -1;
        public boolean isXrfPortDateModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localXrfPortDateCounter != sharedCounter;
           localXrfPortDateCounter = sharedCounter; return hasModified; 
        }
	    public boolean xrfPortDateIsNumeric() {
	      return decimalIsNumeric(beginXrfPortDate,XRF_PORT_DATE_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int XRF_PORT_DATE_LEN = 3;
  	/**
	 * 	serializeXrfPortDate
	 */
	protected void serializeXrfPortDate(short xrfPortDate) {
		   putDecimal(beginXrfPortDate,xrfPortDate,XRF_PORT_DATE_LEN,true);
   }
   

   protected short checkXrfPortDateMaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_10K /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshXrfPortDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshXrfPortDate() throws CFException {	
   	try { 
		 return (getShortDecimal(beginXrfPortDate,XRF_PORT_DATE_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("xrfPortDate", beginXrfPortDate,XRF_PORT_DATE_LEN);
     }
   	}
     int localXrfLcaIndCounter = -1;
     public boolean isXrfLcaIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfLcaIndCounter != sharedCounter;
         localXrfLcaIndCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_LCA_IND_LEN = 1;
	/**
	 * 	serialize this XrfLcaInd
	 */
   protected void serializeXrfLcaInd(char[] xrfLcaInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfLcaInd,0,getStringValue(),beginXrfLcaInd,XRF_LCA_IND_LEN);
       localXrfLcaIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfLcaIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshXrfLcaInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfLcaInd() {	 
   		return (substring(getStringValue(),beginXrfLcaInd,beginXrfLcaInd + XRF_LCA_IND_LEN));
   	}
     int localXrfSourceSysIndCounter = -1;
     public boolean isXrfSourceSysIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXrfSourceSysIndCounter != sharedCounter;
         localXrfSourceSysIndCounter = sharedCounter; return hasModified;
     }
	protected static final int XRF_SOURCE_SYS_IND_LEN = 1;
	/**
	 * 	serialize this XrfSourceSysInd
	 */
   protected void serializeXrfSourceSysInd(char[] xrfSourceSysInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xrfSourceSysInd,0,getStringValue(),beginXrfSourceSysInd,XRF_SOURCE_SYS_IND_LEN);
       localXrfSourceSysIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXrfSourceSysIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshXrfSourceSysInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXrfSourceSysInd() {	 
   		return (substring(getStringValue(),beginXrfSourceSysInd,beginXrfSourceSysInd + XRF_SOURCE_SYS_IND_LEN));
   	}

		public int xrfCmDataSize() {
			return XRF_CM_DATA_SIZE;
		}
		public int xrfPrsIndSize() {
			return XRF_PRS_IND_SIZE;
		}



}
  
